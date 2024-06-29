import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class79 extends class425 {

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field1019 = -1;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "Z")
    public static boolean field1027 = true;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lbr;")
    public class223 field1018;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "Lbr;")
    public class223 field1022;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pj", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field1029;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "Ljava/lang/String;")
    public String field1021;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Z")
    public boolean field1020;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[Ljava/lang/Object;")
    public Object[] field1028;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method470(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[[[Lls;)V", line = 11)
    public static final void method464(int arg0, class74[][][] arg1) {
        field1014++;
        for (int var2 = arg0; var2 < arg1.length; var2++) {
            class74[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class74 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field969 instanceof class143) {
                            ((class143) var6.field969).method600(-89);
                        }
                        if (var6.field967 instanceof class143) {
                            ((class143) var6.field967).method600(arg0 ^ 0xFFFFFF89);
                        }
                        if (var6.field976 instanceof class143) {
                            ((class143) var6.field976).method600(-77);
                        }
                        if (var6.field975 instanceof class143) {
                            ((class143) var6.field975).method600(arg0 - 71);
                        }
                        if (var6.field977 instanceof class143) {
                            ((class143) var6.field977).method600(-123);
                        }
                        for (class353 var7 = var6.field970; var7 != null; var7 = var7.field5127) {
                            class306 var8 = var7.field5125;
                            if (var8 instanceof class143) {
                                ((class143) var8).method600(-110);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)I", line = 83)
    public static final int method465(byte arg0) {
        field1023++;
        int var1 = 70 % ((29 - arg0) / 48);
        return 15;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 95)
    public static final byte[] method466(int arg0, String arg1) {
        field1012++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (!(var5 <= '\u0000' || var5 >= '\u0080') || !(var5 < ' ' || var5 > 'ÿ')) {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(B)V", line = 230)
    public static final void method467(byte arg0) {
        field1015++;
        try {
            Method var1 = (field1029 == null ? (field1029 = method470("java.lang.Runtime")) : field1029).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class409.field5869 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != -44) {
            method467((byte) 52);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V", line = 261)
    public static final void method468(int arg0) {
        field1017++;
        int var1 = -66 % ((14 - arg0) / 35);
        class15 var2 = class441.field6313;
        synchronized (class441.field6313) {
            class441.field6313.method98(0);
        }
        class15 var3 = class293.field4241;
        synchronized (class293.field4241) {
            class293.field4241.method98(0);
        }
        class125 var4 = class356.field5154;
        synchronized (class356.field5154) {
            class356.field5154.method755((byte) 127);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[BIIIZLvq;[Lqr;)[I", line = 293)
    public static final int[] method469(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, boolean arg7, class269 arg8, class41[] arg9) {
        field1013++;
        if (!arg7) {
            for (int var10 = 0; var10 < 4; var10++) {
                class41 var11 = arg9[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg2 + var12;
                        int var15 = arg0 + var13;
                        if (var14 >= 0 && var14 < class80.field1034 && var15 >= 0 && var15 < class381.field5414) {
                            var11.method279(var14, var15, false);
                        }
                    }
                }
            }
        }
        class130 var16 = new class130(arg3);
        int var17 = arg1 + arg2;
        int var18 = arg0 + arg4;
        for (int var19 = 0; var19 < arg5; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class371.method2386(9509, 0, var18 + var56, 0, arg0 + var56, var16, arg7, var19, false, arg2 + var55, 0, var17 + var55);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field1851.length > var16.field1880) {
            int var22 = var16.method837(true);
            if (var22 == 128) {
                class296.field4284[0] = var16.method798(false);
                class296.field4284[1] = var16.method844(698527688);
                class296.field4284[2] = var16.method844(698527688);
                class296.field4284[3] = var16.method844(698527688);
                var20 = true;
                class296.field4284[4] = var16.method798(false);
            } else {
                if (var22 != 129) {
                    var16.field1880--;
                    break;
                }
                if (class423.field6035 == null) {
                    class423.field6035 = new byte[4][][];
                }
                for (int var23 = 0; var23 < 4; var23++) {
                    byte var24 = var16.method823((byte) -64);
                    if (var24 == 0 && class423.field6035[var23] != null) {
                        int var25 = arg2;
                        int var26 = arg2 + 64;
                        int var27 = arg0;
                        int var28 = arg0 + 64;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (class80.field1034 <= var26) {
                            var26 = class80.field1034;
                        }
                        if (arg2 < 0) {
                            var25 = 0;
                        } else if (class80.field1034 <= arg2) {
                            var25 = class80.field1034;
                        }
                        if (arg0 < 0) {
                            var27 = 0;
                        } else if (class381.field5414 <= arg0) {
                            var27 = class381.field5414;
                        }
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 >= class381.field5414) {
                            var28 = class381.field5414;
                        }
                        while (var25 < var26) {
                            while (var28 > var27) {
                                class423.field6035[var23][var25][var27] = 0;
                                var27++;
                            }
                            var25++;
                        }
                    } else if (var24 == 1) {
                        if (class423.field6035[var23] == null) {
                            class423.field6035[var23] = new byte[class80.field1034 + 1][class381.field5414 + 1];
                        }
                        for (int var29 = 0; var29 < 64; var29 += 4) {
                            for (int var30 = 0; var30 < 64; var30 += 4) {
                                byte var31 = var16.method823((byte) -128);
                                for (int var32 = arg2 + var29; var32 < (arg2 + var29 + 4); var32++) {
                                    for (int var33 = arg0 + var30; var33 < (arg0 + var30 + 4); var33++) {
                                        if (var32 >= 0 && var32 < class80.field1034 && var33 >= 0 && class381.field5414 > var33) {
                                            class423.field6035[var23][var32][var33] = var31;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var24 == 2) {
                        if (class423.field6035[var23] == null) {
                            class423.field6035[var23] = new byte[class80.field1034 + 1][class381.field5414 + 1];
                        }
                        if (var23 > 0) {
                            int var34 = arg2;
                            int var35 = arg2 + 64;
                            int var36 = arg0;
                            int var37 = arg0 + 64;
                            if (arg0 < 0) {
                                var36 = 0;
                            } else if (class381.field5414 <= arg0) {
                                var36 = class381.field5414;
                            }
                            if (arg2 < 0) {
                                var34 = 0;
                            } else if (arg2 >= class80.field1034) {
                                var34 = class80.field1034;
                            }
                            if (var35 < 0) {
                                var35 = 0;
                            } else if (class80.field1034 <= var35) {
                                var35 = class80.field1034;
                            }
                            if (var37 < 0) {
                                var37 = 0;
                            } else if (class381.field5414 <= var37) {
                                var37 = class381.field5414;
                            }
                            while (var35 > var34) {
                                while (var37 > var36) {
                                    class423.field6035[var23][var34][var36] = class423.field6035[var23 - 1][var34][var36];
                                    var36++;
                                }
                                var34++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg7) {
            class129 var38 = null;
            label289: while (true) {
                while (true) {
                    while (var16.field1851.length > var16.field1880) {
                        int var43 = var16.method837(true);
                        if (var43 == 0) {
                            var38 = new class129(var16);
                        } else if (var43 == 1) {
                            int var44 = var16.method837(true);
                            if (var44 > 0) {
                                for (int var45 = 0; var45 < var44; var45++) {
                                    class78 var46 = new class78(var16);
                                    if (var46.field999 == 31) {
                                        class197 var47 = class166.method1201(var16.method798(false), true);
                                        var46.method461(-85, var47.field2823, var47.field2820, var47.field2826, var47.field2822);
                                    }
                                    var46.field5644 += arg2 << 7;
                                    var46.field5647 += arg0 << 7;
                                    int var48 = var46.field5644 >> 7;
                                    int var49 = var46.field5647 >> 7;
                                    if (var48 >= 0 && var49 >= 0 && class80.field1034 > var48 && var49 < class381.field5414) {
                                        var46.field5643 = class207.field2975[var46.field1010][var48][var49] - var46.field5643;
                                        if (arg8.method953() > 0) {
                                            class209.method1480(var46);
                                        }
                                    }
                                }
                            }
                        } else if (var43 == 2) {
                            if (var38 == null) {
                                var38 = new class129();
                            }
                            var38.method791(var16, (byte) -125);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 < 8; var39++) {
                            for (int var40 = 0; var40 < 8; var40++) {
                                int var41 = (arg2 >> 3) + var39;
                                int var42 = (arg0 >> 3) + var40;
                                if (var41 >= 0 && var41 < (class80.field1034 >> 3) && var42 >= 0 && class381.field5414 >> 3 > var42) {
                                    class378.method2414(var38, var42, var41, false);
                                }
                            }
                        }
                    }
                    break label289;
                }
            }
        }
        if (arg6 <= 24) {
            field1019 = 108;
        }
        if (!var21 && class423.field6035 != null) {
            for (int var50 = 0; var50 < 4; var50++) {
                if (class423.field6035[var50] != null) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        for (int var52 = 0; var52 < 16; var52++) {
                            int var53 = (arg2 >> 2) + var51;
                            int var54 = (arg0 >> 2) + var52;
                            if (var53 >= 0 && var53 < 26 && var54 >= 0 && var54 < 26) {
                                class423.field6035[var50][var53][var54] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class296.field4284;
        } else {
            return null;
        }
    }
}
