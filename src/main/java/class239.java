import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class239 {

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public int field2813 = class331.method1968(-1);

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Ljava/lang/String;")
    public String field2807;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/lang/String;")
    public String field2804;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Ljava/lang/String;")
    public String field2802;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Ljava/lang/String;")
    public String field2810;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Ljava/lang/String;")
    public String field2815;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "F")
    public static float field2803;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "J")
    public static long field2805;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Ljava/applet/Applet;")
    public static Applet field2816;

    // $FF: synthetic field
    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field2817;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method1447(int arg0) {
        if (arg0 != 13201) {
            field2816 = null;
        }
        field2816 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BI)V")
    public final void method1448(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, String arg6, byte arg7, int arg8) {
        this.field2813 = class331.method1968(-1);
        field2812++;
        this.field2806 = arg4;
        this.field2804 = arg5;
        this.field2811 = arg8;
        this.field2802 = arg2;
        this.field2807 = arg1;
        if (arg7 == -57) {
            this.field2808 = arg0;
            this.field2814 = class228.field2707;
            this.field2815 = arg6;
            this.field2810 = arg3;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILha;IBIIIII)V")
    public static final void method1449(int arg0, class66 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2809++;
        if (arg3 > -43) {
            field2816 = null;
        }
        class238 var9 = (class238) class253.method1504(arg0, arg7, arg5);
        if (var9 != null) {
            class174 var10 = class379.field4811.method4192(27324, var9.method927(-24482));
            int var11 = var9.method928(13272) & 0x3;
            int var12 = var9.method929((byte) -45);
            if (var10.field2120 == -1) {
                int var13 = arg2;
                if (var10.field2171 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method594(var13, arg4, arg6, 4, 0);
                    } else if (var11 == 1) {
                        arg1.method580(arg4, arg6, -87, var13, 4);
                    } else if (var11 == 2) {
                        arg1.method594(var13, arg4 + 3, arg6, 4, 0);
                    } else if (var11 == 3) {
                        arg1.method580(arg4, arg6 + 3, -126, var13, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method600(arg4, arg6, 785580130, var13, 1, 1);
                    } else if (var11 == 1) {
                        arg1.method600(arg4 + 3, arg6, 785580130, var13, 1, 1);
                    } else if (var11 == 2) {
                        arg1.method600(arg4 + 3, arg6 + 3, 785580130, var13, 1, 1);
                    } else if (var11 == 3) {
                        arg1.method600(arg4, arg6 + 3, 785580130, var13, 1, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method580(arg4, arg6, -97, var13, 4);
                    } else if (var11 == 1) {
                        arg1.method594(var13, arg4 + 3, arg6, 4, 0);
                    } else if (var11 == 2) {
                        arg1.method580(arg4, arg6 + 3, -118, var13, 4);
                    } else if (var11 == 3) {
                        arg1.method594(var13, arg4, arg6, 4, 0);
                    }
                }
            } else {
                class134.method997(arg1, arg4, var11, -29786, var10, arg6);
            }
        }
        class238 var14 = (class238) class764.method4234(arg0, arg7, arg5, field2817 == null ? (field2817 = method1450("qb")) : field2817);
        if (var14 != null) {
            class174 var15 = class379.field4811.method4192(27324, var14.method927(-24482));
            int var16 = var14.method928(13272) & 0x3;
            int var17 = var14.method929((byte) -45);
            if (var15.field2120 != -1) {
                class134.method997(arg1, arg4, var16, -29786, var15, arg6);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field2171 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method631(arg6 + 3, arg4 + 3, -9665, arg6, arg4, var18);
                } else {
                    arg1.method631(arg6, arg4 + 3, -9665, arg6 + 3, arg4, var18);
                }
            }
        }
        class238 var19 = (class238) class662.method3720(arg0, arg7, arg5);
        if (var19 == null) {
            return;
        }
        class174 var20 = class379.field4811.method4192(27324, var19.method927(-24482));
        int var21 = var19.method928(13272) & 0x3;
        if (var20.field2120 != -1) {
            class134.method997(arg1, arg4, var21, -29786, var20, arg6);
            return;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class239(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field2811 = arg1;
        this.field2807 = arg3;
        this.field2806 = arg0;
        this.field2804 = arg2;
        this.field2814 = class228.field2707;
        this.field2802 = arg5;
        this.field2808 = arg6;
        this.field2810 = arg7;
        this.field2815 = arg4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1450(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
