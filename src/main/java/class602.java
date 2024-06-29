import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class602 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "F")
    public static float field8360 = 1024.0F;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "S")
    public static short field8359 = 205;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field8361;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field8362;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lha;IIIBIIII)V")
    public static final void method3313(class454 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field8361++;
        class559 var9 = (class559) class548.method3123(arg3, arg5, arg6);
        if (var9 != null) {
            class290 var10 = class358.field5112.method890(var9.method735(24123), false);
            int var11 = var9.method731(111) & 0x3;
            int var12 = var9.method741(76);
            if (var10.field3736 == -1) {
                int var13 = arg7;
                if (var10.field3738 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method2667(arg8, (byte) 113, arg1, var13, 4);
                    } else if (var11 == 1) {
                        arg0.method2660(4, 64, arg1, var13, arg8);
                    } else if (var11 == 2) {
                        arg0.method2667(arg8 + 3, (byte) 113, arg1, var13, 4);
                    } else if (var11 == 3) {
                        arg0.method2660(4, 73, arg1 + 3, var13, arg8);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method2668(arg1, false, 1, 1, arg8, var13);
                    } else if (var11 == 1) {
                        arg0.method2668(arg1, false, 1, 1, arg8 + 3, var13);
                    } else if (var11 == 2) {
                        arg0.method2668(arg1 + 3, false, 1, 1, arg8 + 3, var13);
                    } else if (var11 == 3) {
                        arg0.method2668(arg1 + 3, false, 1, 1, arg8, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method2660(4, 74, arg1, var13, arg8);
                    } else if (var11 == 1) {
                        arg0.method2667(arg8 + 3, (byte) 113, arg1, var13, 4);
                    } else if (var11 == 2) {
                        arg0.method2660(4, 70, arg1 + 3, var13, arg8);
                    } else if (var11 == 3) {
                        arg0.method2667(arg8, (byte) 113, arg1, var13, 4);
                    }
                }
            } else {
                class185.method1181(arg8, arg1, -19857, arg0, var11, var10);
            }
        }
        class559 var14 = (class559) class730.method4079(arg3, arg5, arg6, field8362 == null ? (field8362 = method3314("op")) : field8362);
        int var15 = 12 % ((11 - arg4) / 61);
        if (var14 != null) {
            class290 var16 = class358.field5112.method890(var14.method735(24123), false);
            int var17 = var14.method731(91) & 0x3;
            int var18 = var14.method741(73);
            if (var16.field3736 != -1) {
                class185.method1181(arg8, arg1, -19857, arg0, var17, var16);
            } else if (var18 == 9) {
                int var19 = -1118482;
                if (var16.field3738 > 0) {
                    var19 = -1179648;
                }
                if (var17 == 0 || var17 == 2) {
                    arg0.method2671(arg1, arg8 + 3, arg1 + 3, var19, arg8, (byte) -126);
                } else {
                    arg0.method2671(arg1 + 3, arg8 + 3, arg1, var19, arg8, (byte) -128);
                }
            }
        }
        class559 var20 = (class559) class315.method1848(arg3, arg5, arg6);
        if (var20 == null) {
            return;
        }
        class290 var21 = class358.field5112.method890(var20.method735(24123), false);
        int var22 = var20.method731(-81) & 0x3;
        if (var21.field3736 != -1) {
            class185.method1181(arg8, arg1, -19857, arg0, var22, var21);
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3314(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
