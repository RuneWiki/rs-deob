import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class241 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "Lhq;")
    public static class365 field3162 = new class365(8);

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "[I")
    public static int[] field3165 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
    public static int field3166;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field3167;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1538(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V", line = 6)
    public static void method1535(byte arg0) {
        field3165 = null;
        field3162 = null;
        int var1 = -70 % ((arg0 + 30) / 35);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIZIILuo;I)V", line = 16)
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class118 arg7, int arg8) {
        field3161++;
        class171 var9 = (class171) class440.method2708(arg0, arg8, arg2);
        if (var9 != null) {
            class446 var10 = class380.method2361(var9.method409(-50), -29012);
            int var11 = var9.method417((byte) -116) & 0x3;
            int var12 = var9.method420((byte) 112);
            if (var10.field6224 == -1) {
                int var13 = arg3;
                if (var10.field6235 > 0) {
                    var13 = arg1;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg7.method754(4, var13, -126, arg6, arg5);
                    } else if (var11 == 1) {
                        arg7.method705((byte) 113, 4, arg6, arg5, var13);
                    } else if (var11 == 2) {
                        arg7.method754(4, var13, -122, arg6, arg5 + 3);
                    } else if (var11 == 3) {
                        arg7.method705((byte) 77, 4, arg6 + 3, arg5, var13);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg7.method739((byte) 17, var13, arg5, 1, arg6, 1);
                    } else if (var11 == 1) {
                        arg7.method739((byte) 84, var13, arg5 + 3, 1, arg6, 1);
                    } else if (var11 == 2) {
                        arg7.method739((byte) 59, var13, arg5 + 3, 1, arg6 + 3, 1);
                    } else if (var11 == 3) {
                        arg7.method739((byte) 6, var13, arg5, 1, arg6 + 3, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg7.method705((byte) 75, 4, arg6, arg5, var13);
                    } else if (var11 == 1) {
                        arg7.method754(4, var13, -128, arg6, arg5 + 3);
                    } else if (var11 == 2) {
                        arg7.method705((byte) 69, 4, arg6 + 3, arg5, var13);
                    } else if (var11 == 3) {
                        arg7.method754(4, var13, -123, arg6, arg5);
                    }
                }
            } else {
                class146.method947(arg5, arg6, var10, false, var11, arg7);
            }
        }
        class171 var14 = (class171) class246.method1610(arg0, arg8, arg2, field3167 == null ? (field3167 = method1538("ol")) : field3167);
        if (arg4) {
            return;
        }
        if (var14 != null) {
            class446 var15 = class380.method2361(var14.method409(-50), -29012);
            int var16 = var14.method417((byte) -116) & 0x3;
            int var17 = var14.method420((byte) 23);
            if (var15.field6224 != -1) {
                class146.method947(arg5, arg6, var15, false, var16, arg7);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field6235 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg7.method733(arg6, arg5, 2, var18, arg6 + 3, arg5 + 3);
                } else {
                    arg7.method733(arg6 + 3, arg5, 2, var18, arg6, arg5 + 3);
                }
            }
        }
        class171 var19 = (class171) class451.method2792(arg0, arg8, arg2);
        if (var19 == null) {
            return;
        }
        class446 var20 = class380.method2361(var19.method409(-50), -29012);
        int var21 = var19.method417((byte) -116) & 0x3;
        if (var20.field6224 != -1) {
            class146.method947(arg5, arg6, var20, false, var21, arg7);
            return;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IZII)Ljava/lang/String;", line = 156)
    public static final String method1537(int arg0, boolean arg1, int arg2, int arg3) {
        field3163++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg0;
            if (arg2 != -37) {
                method1535((byte) -20);
            }
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }
}
