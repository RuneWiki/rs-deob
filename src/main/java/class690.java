import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class690 {

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public int field9613;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Z")
    public boolean field9605;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
    public boolean field9597;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "[S")
    public short[] field9606;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public int field9601;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    private int field9599;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[Lvm;")
    public static class687[] field9596 = new class687[5];

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
    public static volatile boolean field9598 = true;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "I")
    public static int field9615 = 0;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    private int field9600;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    private int field9603;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    private int field9608;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "I")
    private int field9614;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "Lrf;")
    public static class84 field9610;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Ltn;")
    public class87 field9602;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "[[I")
    public static int[][] field9616;

    static {
        for (int var0 = 0; var0 < field9596.length; var0++) {
            field9596[var0] = new class687();
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V", line = 3)
    public static void method3879(int arg0) {
        field9616 = null;
        field9610 = null;
        if (arg0 != 22767) {
            field9616 = null;
        }
        field9596 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIZ)V", line = 15)
    public final void method3880(int arg0, int arg1, boolean arg2) {
        if (arg0 != -12091) {
            return;
        }
        field9611++;
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field9614 * arg1 / 50 + this.field9599 & 0x7FF;
            int var5 = this.field9608;
            if (var5 == 1) {
                var6 = (class451.field6174[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class281.field3978[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field9602.method672((float) ((this.field9603 * var6 >> 11) + this.field9600) / 2048.0F, arg0 ^ 0xFFFFDABE);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IBIII)V", line = 99)
    public final void method3881(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field9609++;
        this.field9614 = arg3;
        this.field9600 = arg2;
        if (arg1 == -127) {
            this.field9603 = arg4;
            this.field9608 = arg0;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIB)V", line = 121)
    public static final void method3882(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -23) {
            method3879(48);
        }
        field9604++;
        if (arg1 < arg2) {
            class717.method4012(arg3, -113, arg1, field9616[arg0], arg2);
        } else {
            class717.method4012(arg3, -87, arg2, field9616[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 150)
    private final void method3883(boolean arg0) {
        if (!arg0) {
            method3882(-108, -107, 112, 86, (byte) -18);
        }
        field9607++;
        int var2 = this.field9601;
        if (var2 == 2) {
            this.field9603 = 2048;
            this.field9600 = 0;
            this.field9608 = 1;
            this.field9614 = 2048;
        } else if (var2 == 3) {
            this.field9614 = 4096;
            this.field9608 = 1;
            this.field9600 = 0;
            this.field9603 = 2048;
        } else if (var2 == 4) {
            this.field9608 = 4;
            this.field9603 = 2048;
            this.field9614 = 2048;
            this.field9600 = 0;
        } else if (var2 == 5) {
            this.field9600 = 0;
            this.field9614 = 8192;
            this.field9608 = 4;
            this.field9603 = 2048;
        } else if (var2 == 12) {
            this.field9600 = 0;
            this.field9608 = 2;
            this.field9614 = 2048;
            this.field9603 = 2048;
        } else if (var2 == 13) {
            this.field9600 = 0;
            this.field9614 = 8192;
            this.field9608 = 2;
            this.field9603 = 2048;
        } else if (var2 == 10) {
            this.field9608 = 3;
            this.field9614 = 2048;
            this.field9603 = 512;
            this.field9600 = 1536;
        } else if (var2 == 11) {
            this.field9600 = 1536;
            this.field9603 = 512;
            this.field9608 = 3;
            this.field9614 = 4096;
        } else if (var2 == 6) {
            this.field9600 = 1280;
            this.field9614 = 2048;
            this.field9603 = 768;
            this.field9608 = 3;
        } else if (var2 == 7) {
            this.field9603 = 768;
            this.field9608 = 3;
            this.field9600 = 1280;
            this.field9614 = 4096;
        } else if (var2 == 8) {
            this.field9603 = 1024;
            this.field9608 = 3;
            this.field9600 = 1024;
            this.field9614 = 2048;
        } else if (var2 == 9) {
            this.field9600 = 1024;
            this.field9608 = 3;
            this.field9603 = 1024;
            this.field9614 = 4096;
        } else if (var2 == 14) {
            this.field9614 = 2048;
            this.field9600 = 1280;
            this.field9608 = 1;
            this.field9603 = 768;
        } else if (var2 == 15) {
            this.field9603 = 512;
            this.field9614 = 4096;
            this.field9600 = 1536;
            this.field9608 = 1;
        } else if (var2 == 16) {
            this.field9614 = 8192;
            this.field9600 = 1792;
            this.field9603 = 256;
            this.field9608 = 1;
        } else {
            this.field9600 = 0;
            this.field9603 = 2048;
            this.field9608 = 0;
            this.field9614 = 2048;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIILha;III)V", line = 349)
    private final void method3884(int arg0, int arg1, int arg2, class59 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -29322) {
            this.field9608 = -107;
        }
        this.field9602 = arg3.method413(arg5, arg2, arg1, arg0, arg6, 1.0F);
        field9612++;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V", line = 360)
    protected class690() {
        if (class281.field3978 == null) {
            class561.method3111(true);
        }
        this.method3883(true);
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lha;Lee;I)V", line = 370)
    public class690(class59 arg0, class677 arg1, int arg2) {
        if (class281.field3978 == null) {
            class561.method3111(true);
        }
        this.field9613 = arg1.method3821((byte) 104);
        this.field9605 = (this.field9613 & 0x10) != 0;
        this.field9597 = (this.field9613 & 0x8) != 0;
        this.field9613 &= 0x7;
        int var4 = arg1.method3807(-1) << arg2;
        int var5 = arg1.method3807(-1) << arg2;
        int var6 = arg1.method3807(-1) << arg2;
        int var7 = arg1.method3821((byte) -82);
        int var8 = var7 * 2 + 1;
        this.field9606 = new short[var8];
        for (int var9 = 0; var9 < this.field9606.length; var9++) {
            short var13 = (short) arg1.method3807(-1);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field9606[var9] = (short) class446.method2556(var15, var14 << 8);
        }
        int var10 = (var7 << class140.field2224) + class307.field4416;
        int var11 = class169.field2606 == null ? class656.field8679[class550.method3075((byte) -109, arg1.method3807(-1)) & 0xFFFF] : class169.field2606[arg1.method3807(-1)];
        int var12 = arg1.method3821((byte) 80);
        this.field9601 = var12 & 0x1F;
        this.field9599 = (var12 & 0xE0) << 3;
        if (this.field9601 != 31) {
            this.method3883(true);
        }
        this.method3884(var10, var5, var6, arg0, -29322, var4, var11);
    }
}
