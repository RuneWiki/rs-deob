import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class664 {

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "[Z")
    public static boolean[] field9364 = new boolean[8];

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "F")
    public static float field9363;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field9366;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field9367;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "[Lfaa;")
    public static class140[] field9361;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZ)V")
    public static final void method3684(boolean arg0, boolean arg1) {
        class658.field9265 = 0;
        class499.field6860 = 0;
        field9362++;
        class91.method674((byte) 2);
        class576.method3161(15, arg0);
        class564.method3122((byte) 72);
        boolean var2 = arg1;
        for (int var3 = 0; var3 < class658.field9265; var3++) {
            int var5 = class198.field2928[var3];
            class178 var6 = (class178) class323.field4762.method2061(-17305, (long) var5);
            class225 var7 = var6.field2634;
            if (class229.field3278 && class38.method176((byte) 82, var5)) {
                class592.method3296((byte) 82);
            }
            if (class239.field3440 != var7.field6440) {
                if (var7.field3245.method1116(-89)) {
                    class99.method767(var7, (byte) -105);
                }
                var7.method1443(0, null);
                var2 = true;
                var6.method2971(1);
            }
        }
        if (var2) {
            class679.field9578 = class323.field4762.method2057(0);
            class323.field4762.method2059((byte) -88, class252.field3537);
        }
        if (class532.field7250 != class602.field8356.field1301) {
            throw new RuntimeException("gnp1 pos:" + class602.field8356.field1301 + " psize:" + class532.field7250);
        }
        for (int var4 = 0; var4 < class602.field8365; var4++) {
            if (class323.field4762.method2061(-17305, (long) class594.field8262[var4]) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class602.field8365);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIILoa;)V")
    public static final void method3685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class638 arg8) {
        if (arg7 != -1179648) {
            method3687((byte) -65);
        }
        field9366++;
        class147 var9 = (class147) class171.method1170(arg4, arg5, arg0);
        if (var9 != null) {
            class620 var10 = class164.field2499.method2013(var9.method554(-18971), false);
            int var11 = var9.method560(arg7 ^ 0xFFEE3D26) & 0x3;
            int var12 = var9.method549(12352);
            if (var10.field8573 == -1) {
                int var13 = arg3;
                if (var10.field8592 > 0) {
                    var13 = arg1;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method3560(arg2, var13, arg7 + 1179710, 4, arg6);
                    } else if (var11 == 1) {
                        arg8.method3555(arg2, 4, true, arg6, var13);
                    } else if (var11 == 2) {
                        arg8.method3560(arg2, var13, 99, 4, arg6 + 3);
                    } else if (var11 == 3) {
                        arg8.method3555(arg2 + 3, 4, true, arg6, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method3558((byte) 61, arg2, var13, 1, 1, arg6);
                    } else if (var11 == 1) {
                        arg8.method3558((byte) 43, arg2, var13, 1, 1, arg6 + 3);
                    } else if (var11 == 2) {
                        arg8.method3558((byte) 95, arg2 + 3, var13, 1, 1, arg6 + 3);
                    } else if (var11 == 3) {
                        arg8.method3558((byte) 102, arg2 + 3, var13, 1, 1, arg6);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method3555(arg2, 4, true, arg6, var13);
                    } else if (var11 == 1) {
                        arg8.method3560(arg2, var13, 96, 4, arg6 + 3);
                    } else if (var11 == 2) {
                        arg8.method3555(arg2 + 3, 4, true, arg6, var13);
                    } else if (var11 == 3) {
                        arg8.method3560(arg2, var13, 18, 4, arg6);
                    }
                }
            } else {
                class561.method3110(arg7 ^ 0xFFEE0003, arg8, arg6, arg2, var11, var10);
            }
        }
        class147 var14 = (class147) class410.method2344(arg4, arg5, arg0, field9367 == null ? (field9367 = method3688("uq")) : field9367);
        if (var14 != null) {
            class620 var15 = class164.field2499.method2013(var14.method554(-18971), false);
            int var16 = var14.method560(15654) & 0x3;
            int var17 = var14.method549(12352);
            if (var15.field8573 != -1) {
                class561.method3110(3, arg8, arg6, arg2, var16, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field8592 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method3557(false, arg6 + 3, var18, arg6, arg2 + 3, arg2);
                } else {
                    arg8.method3557(false, arg6 + 3, var18, arg6, arg2, arg2 + 3);
                }
            }
        }
        class147 var19 = (class147) class237.method1497(arg4, arg5, arg0);
        if (var19 == null) {
            return;
        }
        class620 var20 = class164.field2499.method2013(var19.method554(arg7 ^ 0x11B5E5), false);
        int var21 = var19.method560(15654) & 0x3;
        if (var20.field8573 != -1) {
            class561.method3110(3, arg8, arg6, arg2, var21, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZII)V")
    public static final void method3686(boolean arg0, int arg1, int arg2) {
        field9365++;
        class421 var3 = class172.method1175(true, arg0, arg1);
        if (arg2 != 26621) {
            method3686(false, -31, 16);
        }
        if (var3 != null) {
            var3.method2971(1);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V")
    public static void method3687(byte arg0) {
        if (arg0 == 13) {
            field9361 = null;
            field9364 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
