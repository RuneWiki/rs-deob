import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class528 extends class63 implements class303 {

    @OriginalMember(owner = "client!eu", name = "M", descriptor = "Lbp;")
    public class63 field7712;

    @OriginalMember(owner = "client!eu", name = "P", descriptor = "I")
    public static int field7714 = 0;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!eu", name = "N", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!eu", name = "R", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(Lza;I)V", line = 4)
    public final void method166(class295 arg0, int arg1) {
        if (arg1 < 7) {
            this.method158(-127, (byte) -83, 96, null);
        }
        field7713++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BLza;)Lql;", line = 14)
    public final class121 method171(byte arg0, class295 arg1) {
        if (arg0 != -96) {
            method3125(55, -74, -19, 51, -41, -21, -72);
        }
        field7709++;
        return null;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(Lza;I)V", line = 25)
    public final void method164(class295 arg0, int arg1) {
        if (arg1 != 1907) {
            this.method165(-99);
        }
        field7699++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)V", line = 35)
    public static final void method3125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7711++;
        int var7 = class486.method2879((byte) 38, arg0, class233.field3241, class23.field320);
        if (arg4 >= -31) {
            method3125(-30, -58, 90, 51, -13, 49, -102);
        }
        int var8 = class486.method2879((byte) -122, arg3, class233.field3241, class23.field320);
        int var9 = class486.method2879((byte) -121, arg1, class375.field5387, class519.field7633);
        int var10 = class486.method2879((byte) 50, arg2, class375.field5387, class519.field7633);
        int var11 = class486.method2879((byte) -88, arg0 + arg5, class233.field3241, class23.field320);
        int var12 = class486.method2879((byte) 36, arg3 - arg5, class233.field3241, class23.field320);
        for (int var13 = var7; var13 < var11; var13++) {
            class188.method1259(var9, (byte) 27, var10, arg6, class42.field626[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class188.method1259(var9, (byte) 27, var10, arg6, class42.field626[var14]);
        }
        int var15 = class486.method2879((byte) -100, arg1 + arg5, class375.field5387, class519.field7633);
        int var16 = class486.method2879((byte) 55, arg2 - arg5, class375.field5387, class519.field7633);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class42.field626[var17];
            class188.method1259(var9, (byte) 27, var15, arg6, var18);
            class188.method1259(var16, (byte) 27, var10, arg6, var18);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)I", line = 87)
    public final int method159(int arg0) {
        field7708++;
        int var2 = -19 / ((arg0 - 78) / 46);
        return 0;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lza;I)V", line = 97)
    public final void method156(class295 arg0, int arg1) {
        field7715++;
        if (arg1 > -109) {
            this.field7712 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(B)I", line = 107)
    public final int method157(byte arg0) {
        field7707++;
        if (arg0 != -22) {
            field7706 = 19;
        }
        return 0;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(IIIIILbp;)V", line = 120)
    public class528(int arg0, int arg1, int arg2, int arg3, int arg4, class63 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class392.method2332(arg0, -123, arg1));
        this.field7712 = arg5;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IBILza;)Z", line = 132)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        if (arg1 <= 58) {
            field7714 = 115;
        }
        field7702++;
        return false;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V", line = 143)
    public final void method165(int arg0) {
        if (arg0 == -8698) {
            field7705++;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)I", line = 154)
    public static final int method3126(int arg0, int arg1) {
        field7701++;
        int var2 = 35 / ((arg1 - 12) / 57);
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILza;B)Le;", line = 164)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            this.field7712 = null;
        }
        field7703++;
        return null;
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)I", line = 180)
    public final int method419(int arg0) {
        field7710++;
        if (arg0 >= -89) {
            field7714 = 17;
        }
        return 0;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)Z", line = 193)
    public final boolean method160(byte arg0) {
        if (arg0 != 112) {
            method3125(-17, -25, 98, -104, 16, -27, 3);
        }
        field7704++;
        return false;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)I", line = 207)
    public final int method170(byte arg0) {
        field7700++;
        int var2 = 87 % ((arg0 + 11) / 47);
        return 0;
    }
}
