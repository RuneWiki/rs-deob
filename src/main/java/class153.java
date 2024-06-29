import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class153 {

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "[I")
    public static int[] field1893 = new int[6];

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public int field1891;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public int field1894;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "Ljn;")
    public static class668 field1890;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gw", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field1895;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method984(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 6)
    public static void method981(int arg0) {
        field1890 = null;
        if (arg0 < -108) {
            field1893 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lr;IIIIIIII)V", line = 25)
    public static final void method982(class165 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1888++;
        class691 var9 = (class691) class511.method3030(arg8, arg2, arg5);
        if (var9 != null) {
            class232 var10 = class37.field703.method807(0, var9.method1072(4378));
            int var11 = var9.method1067((byte) 57) & 0x3;
            int var12 = var9.method1070(-24359);
            if (var10.field3080 == -1) {
                int var13 = arg3;
                if (var10.field3029 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1045((byte) 33, arg6, 4, var13, arg1);
                    } else if (var11 == 1) {
                        arg0.method1039(4, var13, arg1, (byte) -123, arg6);
                    } else if (var11 == 2) {
                        arg0.method1045((byte) 100, arg6 + 3, 4, var13, arg1);
                    } else if (var11 == 3) {
                        arg0.method1039(4, var13, arg1 + 3, (byte) 78, arg6);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg0.method1042(arg6, 1, 1, arg1, var13, 1);
                    } else if (var11 == 1) {
                        arg0.method1042(arg6 + 3, 1, 1, arg1, var13, 1);
                    } else if (var11 == 2) {
                        arg0.method1042(arg6 + 3, 1, 1, arg1 + 3, var13, 1);
                    } else if (var11 == 3) {
                        arg0.method1042(arg6, 1, 1, arg1 + 3, var13, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg0.method1039(4, var13, arg1, (byte) -73, arg6);
                    } else if (var11 == 1) {
                        arg0.method1045((byte) 29, arg6 + 3, 4, var13, arg1);
                    } else if (var11 == 2) {
                        arg0.method1039(4, var13, arg1 + 3, (byte) -121, arg6);
                    } else if (var11 == 3) {
                        arg0.method1045((byte) 37, arg6, 4, var13, arg1);
                    }
                }
            } else {
                class139.method918(var10, arg6, 28648, arg1, arg0, var11);
            }
        }
        class691 var14 = (class691) class564.method3296(arg8, arg2, arg5, field1895 == null ? (field1895 = method984("pn")) : field1895);
        if (var14 != null) {
            class232 var15 = class37.field703.method807(0, var14.method1072(4378));
            int var16 = var14.method1067((byte) -62) & 0x3;
            int var17 = var14.method1070(-24359);
            if (var15.field3080 != -1) {
                class139.method918(var15, arg6, 28648, arg1, arg0, var16);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3029 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg0.method1048(var18, arg6 + 3, arg1 + 3, (byte) -32, arg6, arg1);
                } else {
                    arg0.method1048(var18, arg6 + 3, arg1, (byte) -66, arg6, arg1 + 3);
                }
            }
        }
        if (arg7 < 44) {
            method983((byte) -36, 78, null, -21, -96, 104);
        }
        class691 var19 = (class691) class403.method2429(arg8, arg2, arg5);
        if (var19 == null) {
            return;
        }
        class232 var20 = class37.field703.method807(0, var19.method1072(4378));
        int var21 = var19.method1067((byte) -64) & 0x3;
        if (var20.field3080 != -1) {
            class139.method918(var20, arg6, 28648, arg1, arg0, var21);
            return;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BILwd;III)Ljava/awt/Frame;", line = 162)
    public static final Frame method983(byte arg0, int arg1, class248 arg2, int arg3, int arg4, int arg5) {
        field1887++;
        if (!arg2.method1516((byte) -25)) {
            return null;
        }
        if (arg4 == 0) {
            class621[] var6 = class72.method635(arg2, false);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field8891 == arg5 && var6[var8].field8894 == arg3 && (arg1 == 0 || var6[var8].field8901 == arg1) && (!var7 || var6[var8].field8896 > arg4)) {
                    arg4 = var6[var8].field8896;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg0 > -62) {
            return null;
        }
        class477 var9 = arg2.method1504(arg4, arg3, arg1, arg5, (byte) -10);
        while (var9.field6693 == 0) {
            class151.method974((byte) -102, 10L);
        }
        Frame var10 = (Frame) var9.field6695;
        if (var10 == null) {
            return null;
        } else if (var9.field6693 == 2) {
            class537.method3157(var10, 0, arg2);
            return null;
        } else {
            return var10;
        }
    }
}
