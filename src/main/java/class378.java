import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class378 {

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Z")
    public boolean field4771;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Z")
    public boolean field4768;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "[S")
    public short[] field4773;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    private int field4783;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lil;")
    public static class68 field4782 = new class68(16);

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[C")
    private static char[] field4785 = new char[64];

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Lwp;")
    public static class453 field4787;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    public static int[] field4789;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "F")
    public static float field4790;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    private int field4770;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    private int field4774;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    private int field4784;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lgga;")
    public class332 field4779;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4785[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4785[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4785[var2] = (char) (var2 - 4);
        }
        field4785[63] = '/';
        field4785[62] = '+';
        field4787 = new class453(4, 2);
        field4789 = new int[3];
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method2051(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4780 = arg0;
        this.field4770 = arg2;
        field4776++;
        this.field4784 = arg1;
        this.field4774 = arg4;
        if (arg3 != 10236) {
            this.method2051(-3, -71, 122, 67, 47);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 18)
    private final void method2052(int arg0) {
        int var2 = this.field4778;
        if (var2 == 2) {
            this.field4774 = 1;
            this.field4770 = 2048;
            this.field4780 = 0;
            this.field4784 = 2048;
        } else if (var2 == 3) {
            this.field4770 = 2048;
            this.field4774 = 1;
            this.field4784 = 4096;
            this.field4780 = 0;
        } else if (var2 == 4) {
            this.field4770 = 2048;
            this.field4780 = 0;
            this.field4774 = 4;
            this.field4784 = 2048;
        } else if (var2 == 5) {
            this.field4784 = 8192;
            this.field4780 = 0;
            this.field4774 = 4;
            this.field4770 = 2048;
        } else if (var2 == 12) {
            this.field4784 = 2048;
            this.field4780 = 0;
            this.field4770 = 2048;
            this.field4774 = 2;
        } else if (var2 == 13) {
            this.field4784 = 8192;
            this.field4774 = 2;
            this.field4770 = 2048;
            this.field4780 = 0;
        } else if (var2 == 10) {
            this.field4770 = 512;
            this.field4774 = 3;
            this.field4784 = 2048;
            this.field4780 = 1536;
        } else if (var2 == 11) {
            this.field4784 = 4096;
            this.field4780 = 1536;
            this.field4774 = 3;
            this.field4770 = 512;
        } else if (var2 == 6) {
            this.field4784 = 2048;
            this.field4774 = 3;
            this.field4770 = 768;
            this.field4780 = 1280;
        } else if (var2 == 7) {
            this.field4774 = 3;
            this.field4780 = 1280;
            this.field4784 = 4096;
            this.field4770 = 768;
        } else if (var2 == 8) {
            this.field4784 = 2048;
            this.field4770 = 1024;
            this.field4774 = 3;
            this.field4780 = 1024;
        } else if (var2 == 9) {
            this.field4780 = 1024;
            this.field4774 = 3;
            this.field4784 = 4096;
            this.field4770 = 1024;
        } else if (var2 == 14) {
            this.field4774 = 1;
            this.field4780 = 1280;
            this.field4784 = 2048;
            this.field4770 = 768;
        } else if (var2 == 15) {
            this.field4770 = 512;
            this.field4780 = 1536;
            this.field4774 = 1;
            this.field4784 = 4096;
        } else if (var2 == 16) {
            this.field4774 = 1;
            this.field4780 = 1792;
            this.field4770 = 256;
            this.field4784 = 8192;
        } else {
            this.field4770 = 2048;
            this.field4784 = 2048;
            this.field4774 = 0;
            this.field4780 = 0;
        }
        field4777++;
        if (arg0 != -18971) {
            this.field4783 = 67;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLr;IIIII)V", line = 217)
    private final void method2053(byte arg0, class566 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 52 / ((arg0 + 26) / 62);
        field4775++;
        this.field4779 = arg1.method1035(arg4, arg5, arg6, arg3, arg2, 1.0F);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIZ)V", line = 233)
    public final void method2054(boolean arg0, int arg1, boolean arg2) {
        field4772++;
        if (arg0) {
            this.field4773 = null;
        }
        int var4;
        if (arg2) {
            var4 = 2048;
        } else {
            int var5 = this.field4783 + (this.field4784 * arg1 / 50) & 0x7FF;
            int var6 = this.field4774;
            if (var6 == 1) {
                var4 = (class453.field5810[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class590.field8290[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field4779.method1(0, (float) ((this.field4770 * var4 >> 11) + this.field4780) / 2048.0F);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLkp;)V", line = 320)
    public static final void method2055(byte arg0, class507 arg1) {
        field4769++;
        if (arg0 > -90) {
            field4790 = 1.1969491F;
        }
        class507 var2 = class309.method1787((byte) 124, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class523.field7111;
            var4 = class244.field3022;
        } else {
            var3 = var2.field6793;
            var4 = var2.field6700;
        }
        class370.method2023(var4, arg1, 23054, false, var3);
        class691.method3887(var4, var3, (byte) -72, arg1);
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V", line = 357)
    protected class378() {
        if (class590.field8290 == null) {
            class632.method3539(-12296);
        }
        this.method2052(-18971);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 368)
    public static void method2056(int arg0) {
        field4789 = null;
        field4785 = null;
        field4782 = null;
        int var1 = -75 / ((56 - arg0) / 55);
        field4787 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lr;Les;I)V", line = 379)
    public class378(class566 arg0, class630 arg1, int arg2) {
        if (class590.field8290 == null) {
            class632.method3539(-12296);
        }
        this.field4781 = arg1.method3501(-9268);
        this.field4771 = (this.field4781 & 0x10) != 0;
        this.field4768 = (this.field4781 & 0x8) != 0;
        this.field4781 &= 0x7;
        int var4 = arg1.method3470(13111) << arg2;
        int var5 = arg1.method3470(13111) << arg2;
        int var6 = arg1.method3470(13111) << arg2;
        int var7 = arg1.method3501(-9268);
        int var8 = var7 * 2 + 1;
        this.field4773 = new short[var8];
        for (int var9 = 0; var9 < this.field4773.length; var9++) {
            short var13 = (short) arg1.method3470(13111);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field4773[var9] = (short) class444.method2376(var14 << 8, var15);
        }
        int var10 = (var7 << class52.field775) + class238.field2979;
        int var11 = class344.field4422 == null ? class475.field6031[class454.method2429(0, arg1.method3470(13111)) & 0xFFFF] : class344.field4422[arg1.method3470(13111)];
        int var12 = arg1.method3501(-9268);
        this.field4783 = var12 & 0xE0 << 3;
        this.field4778 = var12 & 0x1F;
        if (this.field4778 != 31) {
            this.method2052(-18971);
        }
        this.method2053((byte) -90, arg0, var11, var10, var4, var6, var5);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lkp;I)V", line = 440)
    public static final void method2057(class507 arg0, int arg1) {
        field4767++;
        if (!class664.field9377) {
            return;
        }
        if (arg0.field6776 != null) {
            class507 var2 = class138.method795(class529.field7156, class172.field2252, (byte) 123);
            if (var2 != null) {
                class71 var3 = new class71();
                var3.field963 = arg0.field6776;
                var3.field954 = var2;
                var3.field952 = arg0;
                class197.method1191(var3);
            }
        }
        class587.field8250++;
        if (arg1 != 23687) {
            field4788 = 91;
        }
        class704 var4 = class314.method1820(class301.field3697, class400.field5014, (byte) 101);
        var4.field9929.method3464(arg0.field6764, arg1 ^ 0xFFFFA31A);
        var4.field9929.method3506(arg1 ^ 0x5C07, arg0.field6834);
        var4.field9929.method3526(class172.field2252, 13469);
        var4.field9929.method3506(128, class286.field3557);
        var4.field9929.method3472(13412, class529.field7156);
        var4.field9929.method3505(-126, arg0.field6832);
        class122.method654(var4, (byte) -36);
    }
}
