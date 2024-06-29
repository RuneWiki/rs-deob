import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class127 extends class100 implements Runnable {

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Z")
    private boolean field3035 = false;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "[I")
    private int[] field3037 = new int[512];

    @OriginalMember(owner = "client!va", name = "N", descriptor = "I")
    private int field3036 = 256;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    private int field3033 = 0;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    private int field3032 = 0;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "I")
    private int field3043 = 0;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "J")
    private long field3034 = 0L;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    private int field3042 = 0;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "[I")
    public static int[] field3038 = new int[256];

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    private int field3041;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "I")
    private int field3045;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "J")
    private long field3040;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "J")
    private long field3044;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 8)
    public final void method433() {
        synchronized (this) {
            this.field3035 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field3035) {
                    return;
                }
            }
            class121.method958(50L, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(J)V", line = 27)
    public final synchronized void method803(long arg0) {
        this.method983(arg0);
        if (this.field3044 < arg0) {
            this.field3044 = arg0;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(J)V", line = 34)
    private final void method981(long arg0) throws Exception {
        this.method235(this.field3041);
        while (true) {
            int var3 = this.method237();
            if (var3 < this.field3036) {
                this.field3039 = 0;
                this.field3045 = 0;
                this.field3044 = arg0;
                this.field3040 = arg0;
                return;
            }
            this.method236();
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 54)
    private final void method982(int arg0) {
        int var2 = arg0 - this.field3036;
        int var3 = this.field3037[this.field3042];
        this.field3037[this.field3042] = var2;
        this.field3043 += var2 - var3;
        int var4 = this.field3042 + 1 & 0x1FF;
        if (var2 > this.field3033) {
            this.field3033 = var2;
        }
        if (var2 < this.field3032) {
            this.field3032 = var2;
        }
        if (this.field3033 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field3042 != var6 && var5 < this.field3033; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field3037[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field3033 = var5;
        }
        if (this.field3032 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field3042 != var9 && var8 > this.field3032; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field3037[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field3032 = var8;
        }
        this.field3042 = var4;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 252)
    public class127(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(J)V", line = 121)
    private final void method983(long arg0) {
        if (this.field3034 != 0L) {
            while (true) {
                if (this.field3044 >= arg0) {
                    if (arg0 < this.field3034) {
                        return;
                    }
                    try {
                        this.method981(arg0);
                    } catch (Exception var8) {
                        this.method234();
                        this.field3034 += 5000L;
                        return;
                    }
                    this.field3034 = 0L;
                    break;
                }
                class100.method798(256, -119);
                this.field3044 += 256000 / class102.field2503;
            }
        }
        while (this.field3044 < arg0) {
            this.field3044 += 250880 / class102.field2503;
            int var3;
            try {
                var3 = this.method237();
            } catch (Exception var6) {
                this.method234();
                this.field3034 = arg0;
                return;
            }
            this.method982(var3);
            int var4 = this.field3043 * 3 / 512 - this.field3032 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field3033) {
                var4 = this.field3033;
            }
            this.field3036 = this.field3041 - var4 - 256;
            if (this.field3036 < 256) {
                this.field3036 = 256;
            }
            if (this.field3041 < 16384) {
                if (var3 >= this.field3041) {
                    this.field3039 += 5;
                    if (this.field3039 >= 100) {
                        this.method234();
                        this.field3041 += 2048;
                        this.field3034 = arg0;
                        return;
                    }
                } else if (this.field3045 != var3 && this.field3039 > 0) {
                    this.field3039--;
                }
            }
            this.field3045 = var3;
            if (var3 < this.field3036) {
                break;
            }
            class100.method802(field3038, 256);
            try {
                this.method236();
            } catch (Exception var7) {
                this.method234();
                this.field3034 = arg0;
                return;
            }
            this.field3040 = arg0;
            this.field3045 -= 256;
        }
        if (arg0 < this.field3040 + 5000L) {
            return;
        }
        this.method234();
        this.field3034 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field3037[var5] = 0;
        }
        this.field3032 = this.field3033 = this.field3043 = 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Laa;I)V", line = 247)
    public final void method984(class2 arg0, int arg1) throws Exception {
        this.field3041 = arg1;
        this.method981(class95.method728(128));
        arg0.method13(10, this, 0);
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "()V", line = 260)
    public static void method985() {
        field3038 = null;
    }

    @OriginalMember(owner = "client!va", name = "run", descriptor = "()V", line = 268)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field3035) {
                        if (this.field3034 == 0L) {
                            this.method234();
                        }
                        this.field3035 = false;
                        return;
                    }
                    this.method803(class95.method728(128));
                }
                class121.method958(5L, (byte) 81);
            }
        } catch (Exception var6) {
            class118.method932(var6, null, 1);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V")
    public abstract void method234();

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public abstract void method235(int arg0) throws Exception;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V")
    public abstract void method236() throws Exception;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "()I")
    public abstract int method237() throws Exception;
}
