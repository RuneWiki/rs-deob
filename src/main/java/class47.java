import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class47 extends class128 implements Runnable {

    @OriginalMember(owner = "client!he", name = "y", descriptor = "[I")
    private int[] field984 = new int[512];

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    private int field986 = 0;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Z")
    private boolean field988 = false;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    private int field989 = 0;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    private int field992 = 256;

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    private int field990 = 0;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    private int field993 = 0;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "J")
    private long field995 = 0L;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
    public static int[] field996 = new int[256];

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    private int field985;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    private int field994;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "J")
    private long field987;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "J")
    private long field997;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 4)
    public class47(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(J)V", line = 9)
    private final void method403(long arg0) throws Exception {
        this.method369(this.field991);
        while (true) {
            int var3 = this.method372();
            if (var3 < this.field992) {
                this.field994 = 0;
                this.field985 = 0;
                this.field997 = arg0;
                this.field987 = arg0;
                return;
            }
            this.method370();
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(J)V", line = 32)
    private final void method404(long arg0) {
        if (this.field995 != 0L) {
            while (true) {
                if (this.field997 >= arg0) {
                    if (arg0 < this.field995) {
                        return;
                    }
                    try {
                        this.method403(arg0);
                    } catch (Exception var8) {
                        this.method371();
                        this.field995 += 5000L;
                        return;
                    }
                    this.field995 = 0L;
                    break;
                }
                class128.method991(256, (byte) -64);
                this.field997 += 256000 / class14.field251;
            }
        }
        while (this.field997 < arg0) {
            this.field997 += 250880 / class14.field251;
            int var3;
            try {
                var3 = this.method372();
            } catch (Exception var6) {
                this.method371();
                this.field995 = arg0;
                return;
            }
            this.method409(var3);
            int var4 = this.field993 * 3 / 512 - this.field990 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field986) {
                var4 = this.field986;
            }
            this.field992 = this.field991 - var4 - 256;
            if (this.field992 < 256) {
                this.field992 = 256;
            }
            if (this.field991 < 16384) {
                if (var3 >= this.field991) {
                    this.field994 += 5;
                    if (this.field994 >= 100) {
                        this.method371();
                        this.field991 += 2048;
                        this.field995 = arg0;
                        return;
                    }
                } else if (this.field985 != var3 && this.field994 > 0) {
                    this.field994--;
                }
            }
            this.field985 = var3;
            if (var3 < this.field992) {
                break;
            }
            class128.method996(field996, 256);
            try {
                this.method370();
            } catch (Exception var7) {
                this.method371();
                this.field995 = arg0;
                return;
            }
            this.field987 = arg0;
            this.field985 -= 256;
        }
        if (arg0 < this.field987 + 5000L) {
            return;
        }
        this.method371();
        this.field995 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field984[var5] = 0;
        }
        this.field990 = this.field986 = this.field993 = 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 146)
    public final void method405() {
        synchronized (this) {
            this.field988 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field988) {
                    return;
                }
            }
            class113.method873(true, 50L);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V", line = 164)
    public static void method406() {
        field996 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(J)V", line = 167)
    public final synchronized void method407(long arg0) {
        this.method404(arg0);
        if (this.field997 < arg0) {
            this.field997 = arg0;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lbb;I)V", line = 191)
    public final void method408(class9 arg0, int arg1) throws Exception {
        this.field991 = arg1;
        this.method403(System.currentTimeMillis());
        arg0.method83(10, this, (byte) 31);
    }

    @OriginalMember(owner = "client!he", name = "run", descriptor = "()V", line = 205)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field988) {
                        if (this.field995 == 0L) {
                            this.method371();
                        }
                        this.field988 = false;
                        return;
                    }
                    this.method407(System.currentTimeMillis());
                }
                class113.method873(true, 5L);
            }
        } catch (Exception var6) {
            class45.method392((byte) 107, null, var6);
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 233)
    private final void method409(int arg0) {
        int var2 = arg0 - this.field992;
        int var3 = this.field984[this.field989];
        this.field984[this.field989] = var2;
        this.field993 += var2 - var3;
        int var4 = this.field989 + 1 & 0x1FF;
        if (var2 > this.field986) {
            this.field986 = var2;
        }
        if (var2 < this.field990) {
            this.field990 = var2;
        }
        if (this.field986 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field989 != var6 && var5 < this.field986; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field984[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field986 = var5;
        }
        if (this.field990 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field989 != var9 && var8 > this.field990; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field984[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field990 = var8;
        }
        this.field989 = var4;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public abstract void method370() throws Exception;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V")
    public abstract void method371();

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public abstract void method369(int arg0) throws Exception;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()I")
    public abstract int method372() throws Exception;
}
