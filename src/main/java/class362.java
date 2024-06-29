import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class362 {

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "[Lfg;")
    public class66[] field5280 = new class66[8];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "[I")
    public int[] field5271 = new int[3];

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[I")
    public int[] field5278 = new int[100];

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[Lsa;")
    public class113[] field5272 = new class113[100];

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field5277 = 0;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Z")
    public static boolean field5275 = true;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field5274 = 0;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "[Lja;")
    public static class152[] field5284 = new class152[14];

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Lra;")
    public static class57 field5273;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lra;")
    public static class57 field5276;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field5286;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field5281;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIILen;)V")
    public static final void method2304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class174 arg8) {
        field5285++;
        class265 var9 = (class265) class204.method1300(arg6, arg3, arg4);
        if (var9 != null) {
            class327 var10 = class157.method1036(0, var9.method225(116));
            int var11 = var9.method214(-108) & 0x3;
            int var12 = var9.method210(-23890);
            if (var10.field4620 == -1) {
                int var13 = arg5;
                if (var10.field4677 > 0) {
                    var13 = arg2;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1148(arg7, 1, var13, 4, arg0);
                    } else if (var11 == 1) {
                        arg8.method1146(var13, (byte) 60, arg0, 4, arg7);
                    } else if (var11 == 2) {
                        arg8.method1148(arg7 + 3, 1, var13, 4, arg0);
                    } else if (var11 == 3) {
                        arg8.method1146(var13, (byte) 60, arg0 + 3, 4, arg7);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method1150((byte) 107, arg0, arg7, 1, 1, var13);
                    } else if (var11 == 1) {
                        arg8.method1150((byte) 108, arg0, arg7 + 3, 1, 1, var13);
                    } else if (var11 == 2) {
                        arg8.method1150((byte) 119, arg0 + 3, arg7 - -3, 1, 1, var13);
                    } else if (var11 == 3) {
                        arg8.method1150((byte) 104, arg0 + 3, arg7, 1, 1, var13);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1146(var13, (byte) 60, arg0, 4, arg7);
                    } else if (var11 == 1) {
                        arg8.method1148(arg7 + 3, arg1 + -19486, var13, 4, arg0);
                    } else if (var11 == 2) {
                        arg8.method1146(var13, (byte) 60, arg0 + 3, 4, arg7);
                    } else if (var11 == 3) {
                        arg8.method1148(arg7, 1, var13, 4, arg0);
                    }
                }
            } else {
                class218.method1427(arg7, var11, arg8, (byte) 104, var10, arg0);
            }
        }
        class265 var14 = (class265) class310.method1944(arg6, arg3, arg4, field5286 == null ? (field5286 = method2307("sl")) : field5286);
        if (arg1 != 19487) {
            method2304(-98, -78, 66, -25, -74, 50, -56, -89, (class174) null);
        }
        if (var14 != null) {
            class327 var15 = class157.method1036(0, var14.method225(106));
            int var16 = var14.method214(-98) & 0x3;
            int var17 = var14.method210(arg1 ^ 0xFFFFEEB1);
            if (var15.field4620 != -1) {
                class218.method1427(arg7, var16, arg8, (byte) 115, var15, arg0);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4677 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method1154(var18, arg0 + 3, arg0, arg7, arg7 + 3, true);
                } else {
                    arg8.method1154(var18, arg0, arg0 + 3, arg7, arg7 + 3, true);
                }
            }
        }
        class265 var19 = (class265) class122.method689(arg6, arg3, arg4);
        if (var19 == null) {
            return;
        }
        class327 var20 = class157.method1036(arg1 - 19487, var19.method225(122));
        int var21 = var19.method214(-110) & 0x3;
        if (var20.field4620 != -1) {
            class218.method1427(arg7, var21, arg8, (byte) 114, var20, arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method2305(int arg0, long arg1) {
        field5283++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = arg0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class138.field1966[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method2306(byte arg0) {
        if (arg0 < 21) {
            field5273 = null;
        }
        field5284 = null;
        field5276 = null;
        field5273 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2307(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
