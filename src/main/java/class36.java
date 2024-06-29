import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class class36 extends class12 implements Runnable {

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    private int field903 = 0;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    private int field910 = 0;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    private int field909 = 0;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    private int field905 = 0;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "[I")
    private int[] field912 = new int[512];

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "J")
    private long field911 = 0L;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    private int field914 = 256;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
    private boolean field915 = false;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "[I")
    public static int[] field908 = new int[256];

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    private int field902;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "J")
    private long field904;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "J")
    private long field906;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 9)
    private final void method222(int arg0) {
        int var2 = arg0 - this.field914;
        int var3 = this.field912[this.field910];
        this.field912[this.field910] = var2;
        this.field909 += var2 - var3;
        int var4 = this.field910 + 1 & 0x1FF;
        if (var2 > this.field903) {
            this.field903 = var2;
        }
        if (var2 < this.field905) {
            this.field905 = var2;
        }
        if (this.field903 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field910 != var6 && var5 < this.field903; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field912[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field903 = var5;
        }
        if (this.field905 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field910 != var9 && var8 > this.field905; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field912[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field905 = var8;
        }
        this.field910 = var4;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V", line = 237)
    public class36(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!fe", name = "run", descriptor = "()V", line = 71)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field915) {
                        if (this.field911 == 0L) {
                            this.method227();
                        }
                        this.field915 = false;
                        return;
                    }
                    this.method72(class98.method683(0));
                }
                class51.method400((byte) 125, 5L);
            }
        } catch (Exception var6) {
            class50.method392(60, null, var6);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(J)V", line = 99)
    private final void method223(long arg0) {
        if (this.field911 != 0L) {
            while (true) {
                if (this.field906 >= arg0) {
                    if (arg0 < this.field911) {
                        return;
                    }
                    try {
                        this.method229(arg0);
                    } catch (Exception var8) {
                        this.method227();
                        this.field911 += 5000L;
                        return;
                    }
                    this.field911 = 0L;
                    break;
                }
                class12.method64(256, -64);
                this.field906 += 256000 / class131.field3171;
            }
        }
        while (this.field906 < arg0) {
            this.field906 += 250880 / class131.field3171;
            int var3;
            try {
                var3 = this.method230();
            } catch (Exception var6) {
                this.method227();
                this.field911 = arg0;
                return;
            }
            this.method222(var3);
            int var4 = this.field909 * 3 / 512 - this.field905 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field903) {
                var4 = this.field903;
            }
            this.field914 = this.field902 - var4 - 256;
            if (this.field914 < 256) {
                this.field914 = 256;
            }
            if (this.field902 < 16384) {
                if (var3 >= this.field902) {
                    this.field907 += 5;
                    if (this.field907 >= 100) {
                        this.method227();
                        this.field902 += 2048;
                        this.field911 = arg0;
                        return;
                    }
                } else if (this.field913 != var3 && this.field907 > 0) {
                    this.field907--;
                }
            }
            this.field913 = var3;
            if (var3 < this.field914) {
                break;
            }
            class12.method68(field908, 256);
            try {
                this.method226();
            } catch (Exception var7) {
                this.method227();
                this.field911 = arg0;
                return;
            }
            this.field904 = arg0;
            this.field913 -= 256;
        }
        if (arg0 < this.field904 + 5000L) {
            return;
        }
        this.method227();
        this.field911 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field912[var5] = 0;
        }
        this.field905 = this.field903 = this.field909 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 217)
    public final void method71() {
        synchronized (this) {
            this.field915 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field915) {
                    return;
                }
            }
            class51.method400((byte) 27, 50L);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(J)V", line = 243)
    public final synchronized void method72(long arg0) {
        this.method223(arg0);
        if (this.field906 < arg0) {
            this.field906 = arg0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "()V", line = 249)
    public static void method225() {
        field908 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lra;I)V", line = 268)
    public final void method228(class102 arg0, int arg1) throws Exception {
        this.field902 = arg1;
        this.method229(class98.method683(0));
        arg0.method725((byte) 118, 10, this);
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(J)V", line = 274)
    private final void method229(long arg0) throws Exception {
        this.method224(this.field902);
        while (true) {
            int var3 = this.method230();
            if (var3 < this.field914) {
                this.field907 = 0;
                this.field913 = 0;
                this.field906 = arg0;
                this.field904 = arg0;
                return;
            }
            this.method226();
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public abstract void method224(int arg0) throws Exception;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
    public abstract void method226() throws Exception;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
    public abstract void method227();

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "()I")
    public abstract int method230() throws Exception;
}
