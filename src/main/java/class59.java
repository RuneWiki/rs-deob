import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class59 extends class457 {

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field915;

    static {
        new class306("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I", line = 4)
    public static final int method395(int arg0) {
        ++field907;
        if (arg0 != -1049) {
            field915 = -99;
        }
        return 16;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIII)V", line = 15)
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field909 = arg2;
        this.field905 = arg1;
        this.field908 = arg3;
        this.field916 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V", line = 27)
    public static final void method396(int arg0, int arg1) {
        ++field910;
        if (arg1 >= 19) {
            if (arg0 != -1) {
                if (class406.field6157[arg0]) {
                    class162.field2580.method2921(arg0, 18);
                    class508.field7389[arg0] = null;
                    class251.field4291[arg0] = null;
                    class406.field6157[arg0] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZII)V", line = 54)
    public final void method328(boolean arg0, int arg1, int arg2) {
        ++field903;
        int var4 = this.field916 * arg1 >> 12;
        int var5 = this.field909 * arg1 >> 12;
        if (arg0) {
            this.field909 = -30;
        }
        int var6 = this.field905 * arg2 >> 12;
        int var7 = this.field908 * arg2 >> 12;
        class71.method505(93, var4, super.field6806, var6, var7, var5);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([I[ILbl;[II)V", line = 74)
    public static final void method397(int[] arg0, int[] arg1, class265 arg2, int[] arg3, int arg4) {
        ++field904;
        int var5 = 0;
        if (arg4 == 1) {
            while (~arg0.length < ~var5) {
                int var6 = arg0[var5];
                int var7 = arg3[var5];
                int var8 = arg1[var5];
                for (int var9 = 0; var7 != 0 && ~arg2.field3123.length < ~var9; ++var9) {
                    if (~(1 & var7) != -1) {
                        if (~var6 == 0) {
                            arg2.field3123[var9] = null;
                        } else {
                            class145 var10 = class130.field2232.method634(-1271654143, var6);
                            int var11 = var10.field2367;
                            class63 var12 = arg2.field3123[var9];
                            if (var12 != null) {
                                if (~var12.field939 != ~var6) {
                                    if (~var10.field2371 <= ~class130.field2232.method634(-1271654143, var12.field939).field2371) {
                                        var12 = arg2.field3123[var9] = null;
                                    }
                                } else if (var11 != 0) {
                                    if (~var11 == -2) {
                                        var12.field947 = 0;
                                        var12.field943 = var8;
                                        var12.field940 = 0;
                                        var12.field942 = 0;
                                        var12.field945 = 1;
                                        class172.method1167(arg2.field4714, 0, arg2.field4720, arg2.field4716, false, var10, (byte) 50);
                                    } else if (~var11 == -3) {
                                        var12.field947 = 0;
                                    }
                                } else {
                                    var12 = arg2.field3123[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class63 var13 = arg2.field3123[var9] = new class63();
                                var13.field943 = var8;
                                var13.field939 = var6;
                                var13.field945 = 1;
                                var13.field940 = 0;
                                var13.field942 = 0;
                                var13.field947 = 0;
                                class172.method1167(arg2.field4714, 0, arg2.field4720, arg2.field4716, false, var10, (byte) 45);
                            }
                        }
                    }
                    var7 >>>= 1;
                }
                ++var5;
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)V", line = 172)
    public final void method331(int arg0, int arg1, boolean arg2) {
        ++field914;
        int var4 = this.field916 * arg1 >> 12;
        int var5 = this.field909 * arg1 >> 12;
        int var6 = this.field905 * arg0 >> 12;
        int var7 = this.field908 * arg0 >> 12;
        class217.method1500(var7, super.field6804, super.field6801, var5, 1, var6, var4);
        if (!arg2) {
            method396(-78, -65);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 199)
    public static final int method398(String arg0, int arg1) {
        ++field912;
        if (arg1 != -1) {
            return -94;
        } else {
            for (int var2 = 0; ~class407.field6187.length < ~var2; ++var2) {
                if (class407.field6187[var2].equalsIgnoreCase(arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V", line = 220)
    public final void method334(int arg0, int arg1, int arg2) {
        ++field906;
        int var4 = this.field916 * arg1 >> 12;
        int var5 = this.field909 * arg1 >> 12;
        int var6 = this.field905 * arg0 >> 12;
        int var7 = this.field908 * arg0 >> 12;
        class441.method2658(var7, super.field6804, -1, var4, super.field6806, super.field6801, var6, var5);
        if (arg2 <= 1) {
            this.field908 = 86;
        }
    }
}
