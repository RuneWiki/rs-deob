import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class199 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Lgf;")
    public static class400 field2898 = new class400(128);

    @OriginalMember(owner = "client!so", name = "d", descriptor = "Z")
    public static boolean field2901 = false;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "[I")
    public static int[] field2902 = new int[8];

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field2900;

    // $FF: synthetic field
    @OriginalMember(owner = "client!so", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field2903;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "[I")
    public static int[] field2899;

    // $FF: synthetic method
    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1301(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V", line = 8)
    public static void method1299(int arg0) {
        field2898 = null;
        field2902 = null;
        if (arg0 == -1) {
            field2899 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIILza;IIII)V", line = 20)
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, class295 arg4, int arg5, int arg6, int arg7, int arg8) {
        field2900++;
        class303 var9 = (class303) class191.method1267(arg6, arg2, arg8);
        if (var9 != null) {
            class103 var10 = class452.field6629.method603((byte) 114, var9.method170((byte) -126));
            int var11 = var9.method157((byte) -22) & 0x3;
            int var12 = var9.method159(arg7 - 66);
            if (var10.field1649 == -1) {
                int var13 = arg1;
                if (var10.field1697 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method1714(arg0, arg5, var13, 4, (byte) -24);
                    } else if (var11 == 1) {
                        arg4.method1711((byte) 108, 4, var13, arg5, arg0);
                    } else if (var11 == 2) {
                        arg4.method1714(arg0 + 3, arg5, var13, 4, (byte) -24);
                    } else if (var11 == 3) {
                        arg4.method1711((byte) 99, 4, var13, arg5 + 3, arg0);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method1712(1, arg7, var13, 1, arg5, arg0);
                    } else if (var11 == 1) {
                        arg4.method1712(1, 0, var13, 1, arg5, arg0 + 3);
                    } else if (var11 == 2) {
                        arg4.method1712(1, 0, var13, 1, arg5 + 3, arg0 + 3);
                    } else if (var11 == 3) {
                        arg4.method1712(1, 0, var13, 1, arg5 + 3, arg0);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method1711((byte) 99, 4, var13, arg5, arg0);
                    } else if (var11 == 1) {
                        arg4.method1714(arg0 + 3, arg5, var13, 4, (byte) -24);
                    } else if (var11 == 2) {
                        arg4.method1711((byte) 125, 4, var13, arg5 + 3, arg0);
                    } else if (var11 == 3) {
                        arg4.method1714(arg0, arg5, var13, 4, (byte) -24);
                    }
                }
            } else {
                class385.method2279(-126, var10, arg0, var11, arg5, arg4);
            }
        }
        class303 var14 = (class303) class377.method2254(arg6, arg2, arg8, field2903 == null ? (field2903 = method1301("bn")) : field2903);
        if (arg7 != 0) {
            method1299(26);
        }
        if (var14 != null) {
            class103 var15 = class452.field6629.method603((byte) 116, var14.method170((byte) 104));
            int var16 = var14.method157((byte) -22) & 0x3;
            int var17 = var14.method159(-84);
            if (var15.field1649 != -1) {
                class385.method2279(arg7 ^ 0xFFFFFF80, var15, arg0, var16, arg5, arg4);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1697 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method1706(true, arg0 + 3, arg5 + 3, arg5, arg0, var18);
                } else {
                    arg4.method1706(true, arg0 + 3, arg5, arg5 + 3, arg0, var18);
                }
            }
        }
        class303 var19 = (class303) class126.method913(arg6, arg2, arg8);
        if (var19 == null) {
            return;
        }
        class103 var20 = class452.field6629.method603((byte) 112, var19.method170((byte) 49));
        int var21 = var19.method157((byte) -22) & 0x3;
        if (var20.field1649 != -1) {
            class385.method2279(-125, var20, arg0, var21, arg5, arg4);
            return;
        }
    }
}
