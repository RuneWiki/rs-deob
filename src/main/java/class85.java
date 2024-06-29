import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class85 {

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "[I")
    public static int[] field984 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field993;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field994;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Z")
    public static boolean field989;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method495(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZJIBI)Ljava/lang/String;", line = 3)
    public static final String method491(boolean arg0, long arg1, int arg2, byte arg3, int arg4) {
        field990++;
        char var6 = ',';
        int var7 = 16 / ((-arg3 - 17) / 49);
        char var8 = '.';
        if (arg2 == 0) {
            var8 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var8 = ' ';
        }
        boolean var9 = false;
        if (arg1 < 0L) {
            var9 = true;
            arg1 = -arg1;
        }
        StringBuffer var10 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = (int) arg1;
                arg1 /= 10L;
                var10.append((char) (var12 + 48 - ((int) arg1 * 10)));
            }
            var10.append(var6);
        }
        int var13 = 0;
        while (true) {
            int var14 = (int) arg1;
            arg1 /= 10L;
            var10.append((char) (var14 + 48 - ((int) arg1 * 10)));
            if (arg1 == 0L) {
                if (var9) {
                    var10.append('-');
                }
                return var10.reverse().toString();
            }
            if (arg0) {
                var13++;
                if (var13 % 3 == 0) {
                    var10.append(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lhn;", line = 81)
    public final class85 method492(int arg0, int arg1) {
        if (arg0 != 0) {
            method494(-31);
        }
        field988++;
        return new class85(this.field986, arg1, this.field985, this.field992);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 97)
    public static final void method493(int arg0) {
        int var1 = 58 % ((-arg0 - 13) / 42);
        for (class452 var2 = (class452) class541.field8102.method2496((byte) 5); var2 != null; var2 = (class452) class541.field8102.method2494(85)) {
            if (class526.field7777 == null) {
                var2.method2997(1);
            } else if (var2.field6608 <= class576.field8505) {
                int var15 = class604.field8894[var2.field6596];
                if (var15 == 0) {
                    class578 var16 = class491.method2972(var2.field6605, var2.field6602, var2.field6597);
                    if (var16 instanceof class431) {
                        class174.method1130(var2.field6605, var2.field6602, var2.field6597);
                        class431 var17 = (class431) var16;
                        if (var17.field6312 != null) {
                            class403.method2414(var2.field6605, var2.field6602, var2.field6597, var17.field6312, null);
                        }
                    }
                } else if (var15 == 1) {
                    class73 var18 = class427.method2549(var2.field6605, var2.field6602, var2.field6597);
                    if (var18 instanceof class50) {
                        class608.method3537(var2.field6605, var2.field6602, var2.field6597);
                        class50 var19 = (class50) var18;
                        if (var19.field585 != null) {
                            class241.method1555(var2.field6605, var2.field6602, var2.field6597, var19.field585, null);
                        }
                    }
                } else if (var15 == 2) {
                    class237 var22 = class488.method2956(var2.field6605, var2.field6602, var2.field6597, field994 == null ? (field994 = method495("ej")) : field994);
                    if (var22 instanceof class34) {
                        class452.method2723(var2.field6605, var2.field6602, var2.field6597, field994 == null ? (field994 = method495("ej")) : field994);
                        class34 var23 = (class34) var22;
                        if (var23.field367 != null) {
                            class390.method2355(var23.field367, false);
                        }
                    }
                } else if (var15 == 3) {
                    class33 var20 = class287.method1784(var2.field6605, var2.field6602, var2.field6597);
                    if (var20 instanceof class46) {
                        class228.method1489(var2.field6605, var2.field6602, var2.field6597);
                        class46 var21 = (class46) var20;
                        if (var21.field538 != null) {
                            class273.method1729(var2.field6605, var2.field6602, var2.field6597, var21.field538);
                        }
                    }
                }
                var2.method2997(1);
            } else if (class576.field8505 == var2.field6598) {
                int var3 = class604.field8894[var2.field6596];
                if (var3 == 0) {
                    class578 var13 = class491.method2972(var2.field6605, var2.field6602, var2.field6597);
                    if (var13 instanceof class431) {
                        var2.method2997(1);
                    } else if (class64.method399(var2.field6605, var2.field6602, var2.field6597) == null) {
                        class431 var14 = new class431(var2.field6596, var2.field6601, var2.field6599, var2.field6606, var2.field6603, var13);
                        class403.method2414(var2.field6605, var2.field6602, var2.field6597, var14, null);
                    } else {
                        var2.method2997(1);
                    }
                } else if (var3 == 1) {
                    class73 var11 = class427.method2549(var2.field6605, var2.field6602, var2.field6597);
                    if (var11 instanceof class50) {
                        var2.method2997(1);
                    } else if (class602.method3504(var2.field6605, var2.field6602, var2.field6597) == null) {
                        class50 var12 = new class50(var2.field6596, var2.field6601, var2.field6599, var2.field6606, var2.field6603, var11);
                        class241.method1555(var2.field6605, var2.field6602, var2.field6597, var12, null);
                    } else {
                        var2.method2997(1);
                    }
                } else if (var3 == 2) {
                    class237 var6 = class488.method2956(var2.field6605, var2.field6602, var2.field6597, field994 == null ? (field994 = method495("ej")) : field994);
                    if (var6 instanceof class34) {
                        var2.method2997(1);
                    } else {
                        class452.method2723(var2.field6605, var2.field6602, var2.field6597, field994 == null ? (field994 = method495("ej")) : field994);
                        class158 var7 = class312.field4690.method2004(false, var2.field6592);
                        int var8;
                        int var9;
                        if (var2.field6601 == 1 || var2.field6601 == 3) {
                            var8 = var7.field2017;
                            var9 = var7.field2014;
                        } else {
                            var8 = var7.field2014;
                            var9 = var7.field2017;
                        }
                        class34 var10 = new class34(var2.field6596, var2.field6601, var2.field6605, var2.field6599, var2.field6606, var2.field6603, var2.field6602, var2.field6602 + var9 - 1, var2.field6597, var2.field6597 + var8 - 1, var6);
                        class390.method2355(var10, false);
                    }
                } else if (var3 == 3) {
                    class33 var4 = class287.method1784(var2.field6605, var2.field6602, var2.field6597);
                    if (var4 instanceof class46) {
                        var2.method2997(1);
                    } else {
                        class46 var5 = new class46(var2.field6599, var2.field6606, var2.field6603, var4);
                        class273.method1729(var2.field6605, var2.field6602, var2.field6597, var5);
                    }
                }
            }
        }
        field993++;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 309)
    public static void method494(int arg0) {
        if (arg0 != 26) {
            field991 = -24;
        }
        field984 = null;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(IIII)V", line = 324)
    public class85(int arg0, int arg1, int arg2, int arg3) {
        this.field992 = arg3;
        this.field985 = arg2;
        this.field987 = arg1;
        this.field986 = arg0;
    }
}
