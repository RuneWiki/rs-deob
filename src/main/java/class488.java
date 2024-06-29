import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class488 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lds;")
    private class12 field7119;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lqa;")
    private class162 field7120;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[[Z")
    public static boolean[][] field7125 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "[I")
    public static int[] field7135 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "J")
    public static long field7124;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lhh;")
    public static class84 field7115;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 3)
    private final void method2907(int arg0, int arg1, int arg2) {
        class147.field2168 = arg0;
        class310.field4432 = -1;
        field7121++;
        class175.field2671 = 0;
        class237.field3433 = arg1;
        class453.field6712 = arg1;
        if (arg2 == -1) {
            arg2 = 0;
        }
        class314.field4490 = -1;
        class505.field7409 = arg2;
        class219.field3160 = arg2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqf;IZ)V", line = 22)
    public static final void method2908(class477 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field7125 = null;
        }
        field7126++;
        while (true) {
            class167 var3 = (class167) class173.field2646.method2257((byte) 99);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2513; var5++) {
                if (var3.field2512[var5] != null) {
                    if (var3.field2512[var5].field1604 == 2) {
                        var3.field2507[var5] = -5;
                    }
                    if (var3.field2512[var5].field1604 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2508[var5] != null) {
                    if (var3.field2508[var5].field1604 == 2) {
                        var3.field2507[var5] = -6;
                    }
                    if (var3.field2508[var5].field1604 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method2852(52, arg1);
            arg0.method1923((byte) 62, 0);
            int var6 = arg0.field4333;
            arg0.method1892(397825512, var3.field2511);
            for (int var7 = 0; var7 < var3.field2513; var7++) {
                if (var3.field2507[var7] == 0) {
                    try {
                        int var8 = var3.field2509[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2512[var7].field1608;
                            int var10 = var9.getInt(null);
                            arg0.method1923((byte) 62, 0);
                            arg0.method1892(397825512, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2512[var7].field1608;
                            var13.setInt(null, var3.field2505[var7]);
                            arg0.method1923((byte) 62, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2512[var7].field1608;
                            int var12 = var11.getModifiers();
                            arg0.method1923((byte) 62, 0);
                            arg0.method1892(397825512, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2508[var7].field1608;
                            byte[][] var15 = var3.field2510[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method1923((byte) 62, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method1923((byte) 62, 1);
                                arg0.method1872(-1, ((Number) var19).longValue());
                            } else if (var19 instanceof String) {
                                arg0.method1923((byte) 62, 2);
                                arg0.method1882((byte) -107, (String) var19);
                            } else {
                                arg0.method1923((byte) 62, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2508[var7].field1608;
                            int var21 = var20.getModifiers();
                            arg0.method1923((byte) 62, 0);
                            arg0.method1892(397825512, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method1923((byte) 62, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method1923((byte) 62, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method1923((byte) 62, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method1923((byte) 62, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method1923((byte) 62, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method1923((byte) 62, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method1923((byte) 62, -16);
                    } catch (SecurityException var29) {
                        arg0.method1923((byte) 62, -17);
                    } catch (IOException var30) {
                        arg0.method1923((byte) 62, -18);
                    } catch (NullPointerException var31) {
                        arg0.method1923((byte) 62, -19);
                    } catch (Exception var32) {
                        arg0.method1923((byte) 62, -20);
                    } catch (Throwable var33) {
                        arg0.method1923((byte) 62, -21);
                    }
                } else {
                    arg0.method1923((byte) 62, var3.field2507[var7]);
                }
            }
            arg0.method1904(var6, 15113);
            arg0.method1897(arg0.field4333 - var6, 255);
            var3.method2663(-126);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I", line = 211)
    public static final int method2909(int arg0, int arg1) {
        if (arg0 != 24900) {
            field7125 = null;
        }
        field7123++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjava/lang/String;IIIII)V", line = 222)
    public final void method2910(byte arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7128++;
        if (arg1 == null) {
            return;
        }
        this.method2907(arg0 ^ 0xFFFFFF83, arg3, arg2);
        if (arg0 != -125) {
            this.field7119 = null;
        }
        int var8 = arg1.length();
        int[] var9 = new int[var8];
        for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = (int) (Math.sin((double) arg6 / 5.0D + (double) var10 / 2.0D) * 5.0D);
        }
        this.method2926(arg5, null, var9, null, arg1, null, arg0 ^ 0xFFFFFFF5, arg4 - (this.field7119.method105(arg1, arg0 ^ 0xFFFFFF82) / 2));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 251)
    private final void method2911(String arg0, byte arg1) {
        try {
            if (arg0.startsWith("col=")) {
                class453.field6712 = class453.field6712 & 0xFF000000 | class51.method366(27538, 16, arg0.substring(4)) & 0xFFFFFF;
            } else if (arg0.equals("/col")) {
                class453.field6712 = class237.field3433 & 0xFFFFFF | class453.field6712 & 0xFF000000;
            }
            if (arg1 <= 24) {
                field7125 = null;
            }
            if (arg0.startsWith("argb=")) {
                class453.field6712 = class51.method366(27538, 16, arg0.substring(5));
            } else if (arg0.equals("/argb")) {
                class453.field6712 = class237.field3433;
            } else if (arg0.startsWith("str=")) {
                class314.field4490 = class51.method366(27538, 16, arg0.substring(4)) | 0xFF000000;
            } else if (arg0.equals("str")) {
                class314.field4490 = -8388608;
            } else if (arg0.equals("/str")) {
                class314.field4490 = -1;
            } else if (arg0.startsWith("u=")) {
                class310.field4432 = class51.method366(27538, 16, arg0.substring(2)) | 0xFF000000;
            } else if (arg0.equals("u")) {
                class310.field4432 = -16777216;
            } else if (arg0.equals("/u")) {
                class310.field4432 = -1;
            } else if (arg0.equalsIgnoreCase("shad=-1")) {
                class219.field3160 = 0;
            } else if (arg0.startsWith("shad=")) {
                class219.field3160 = class51.method366(27538, 16, arg0.substring(5)) | 0xFF000000;
            } else if (arg0.equals("shad")) {
                class219.field3160 = -16777216;
            } else if (arg0.equals("/shad")) {
                class219.field3160 = class505.field7409;
            } else if (arg0.equals("br")) {
                this.method2907(0, class237.field3433, class505.field7409);
            }
        } catch (Exception var3) {
        }
        field7136++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIILjava/lang/String;B)V", line = 326)
    public final void method2912(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        field7129++;
        if (arg5 <= -12 && arg4 != null) {
            this.method2907(0, arg2, arg0);
            this.method2922(arg1, 0, true, arg3, null, arg4, 0, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIILjava/lang/String;B)V", line = 342)
    public final void method2913(int arg0, int arg1, int arg2, int arg3, String arg4, byte arg5) {
        field7137++;
        if (arg4 != null) {
            this.method2907(0, arg0, arg2);
            int var7 = 112 / ((59 - arg5) / 49);
            this.method2922(arg1, 0, true, arg3 - this.field7119.method105(arg4, 1) / 2, null, arg4, 0, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIILjava/lang/String;)V", line = 359)
    public final void method2914(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg1 > -113) {
            field7135 = null;
        }
        field7122++;
        if (arg5 != null) {
            this.method2907(0, arg4, arg2);
            this.method2922(arg0, 0, true, arg3 - this.field7119.method105(arg5, 1), null, arg5, 0, null, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lf;III[IIBILea;ILjava/lang/String;IIIII)I", line = 380)
    public final int method2915(class528[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7, class381 arg8, int arg9, String arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field7138++;
        int var17 = -59 / ((arg6 + 52) / 61);
        return this.method2927(arg2, arg10, arg4, arg0, arg13, arg11, arg5, arg12, arg14, -120, arg3, arg8, arg1, arg9, 0, arg15, arg7);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBIILjava/lang/String;II)V", line = 391)
    public final void method2916(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int arg6) {
        field7130++;
        if (arg4 == null) {
            return;
        }
        this.method2907(0, arg6, arg2);
        int var8 = 122 / ((arg1 - 40) / 54);
        int var9 = arg4.length();
        int[] var10 = new int[var9];
        int[] var11 = new int[var9];
        for (int var12 = 0; var12 < var9; var12++) {
            var10[var12] = (int) (Math.sin((double) arg3 / 5.0D + (double) var12 / 5.0D) * 5.0D);
            var11[var12] = (int) (Math.sin((double) arg3 / 5.0D + (double) var12 / 3.0D) * 5.0D);
        }
        this.method2926(arg0, var10, var11, null, arg4, null, 78, arg5 - (this.field7119.method105(arg4, 1) / 2));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;Ljava/util/Random;II[II[IIIIII[Lf;B)I", line = 422)
    public final int method2917(int arg0, String arg1, Random arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class528[] arg13, byte arg14) {
        field7132++;
        if (arg1 == null) {
            return 0;
        }
        arg2.setSeed((long) arg9);
        int var16 = (arg2.nextInt() & 0x1F) + 192;
        this.method2907(0, var16 << 24 | arg4 & 0xFFFFFF, arg12 & 0xFFFFFF | var16 << 24);
        int var17 = arg1.length();
        if (arg14 <= 101) {
            this.method598((char) 65529, -41, -78, -51, false);
        }
        int[] var18 = new int[var17];
        int var19 = 0;
        for (int var20 = 0; var20 < var17; var20++) {
            var18[var20] = var19;
            if ((arg2.nextInt() & 0x3) == 0) {
                var19++;
            }
        }
        int var21 = arg3;
        int var22 = this.field7119.field194 + arg8;
        if (arg0 == 1) {
            var22 += (arg10 - this.field7119.field194 - this.field7119.field201) / 2;
        } else if (arg0 == 2) {
            var22 = arg8 + arg10 - this.field7119.field201;
        }
        int var23 = -1;
        if (arg11 == 1) {
            var23 = var19 + this.field7119.method105(arg1, 1);
            var21 = (arg6 - var23) / 2 + arg3;
        } else if (arg11 == 2) {
            var23 = var19 + this.field7119.method105(arg1, 1);
            var21 = arg6 + arg3 - var23;
        }
        this.method2926(var22, var18, null, arg5, arg1, arg13, 74, var21);
        if (arg7 != null) {
            if (var23 == -1) {
                var23 = this.field7119.method105(arg1, 1) + var19;
            }
            arg7[3] = this.field7119.field194 + this.field7119.field201;
            arg7[0] = var21;
            arg7[1] = var22 - this.field7119.field194;
            arg7[2] = var23;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[Lf;Ljava/lang/String;[III)V", line = 499)
    public final void method2918(int arg0, int arg1, int arg2, class528[] arg3, String arg4, int[] arg5, int arg6, int arg7) {
        int var9 = -95 % ((arg2 + 12) / 62);
        field7127++;
        if (arg4 != null) {
            this.method2907(0, arg7, arg0);
            this.method2922(arg6, 0, true, arg1, arg3, arg4, 0, arg5, null);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[IILjava/util/Random;BI[Lf;ILjava/lang/String;)I", line = 513)
    public final int method2919(int arg0, int arg1, int[] arg2, int arg3, Random arg4, byte arg5, int arg6, class528[] arg7, int arg8, String arg9) {
        int var11 = -124 % ((arg5 - 79) / 43);
        field7139++;
        if (arg9 == null) {
            return 0;
        }
        arg4.setSeed((long) arg3);
        int var12 = (arg4.nextInt() & 0x1F) + 192;
        this.method2907(0, arg0 & 0xFFFFFF | var12 << 24, var12 << 24 | arg1 & 0xFFFFFF);
        int var13 = arg9.length();
        int[] var14 = new int[var13];
        int var15 = 0;
        for (int var16 = 0; var16 < var13; var16++) {
            var14[var16] = var15;
            if ((arg4.nextInt() & 0x3) == 0) {
                var15++;
            }
        }
        this.method2926(arg6, var14, null, arg2, arg9, arg7, 45, arg8);
        return var15;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 550)
    private final void method2920(int arg0, String arg1, int arg2) {
        field7134++;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; arg1.length() > var6; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5 = true;
            } else if (var7 == '>') {
                var5 = false;
            } else if (!var5 && var7 == ' ') {
                var4++;
            }
        }
        if (var4 > 0) {
            class175.field2671 = (arg2 - this.field7119.method105(arg1, 1) << 8) / var4;
        }
        if (arg0 != 955267816) {
            this.method2916(71, (byte) -61, 120, 47, null, 78, -74);
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lqa;Lds;)V", line = 590)
    public class488(class162 arg0, class12 arg1) {
        this.field7119 = arg1;
        this.field7120 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/lang/String;IIIII)V", line = 600)
    public final void method2921(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7118++;
        if (arg2 == null) {
            return;
        }
        this.method2907(0, arg0, arg6);
        double var9 = 7.0D - (double) arg1 / 8.0D;
        if (arg3 != 4874) {
            this.method2910((byte) -7, null, -7, 68, -117, -115, -104);
        }
        if (var9 < 0.0D) {
            var9 = 0.0D;
        }
        int var11 = arg2.length();
        int[] var12 = new int[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = (int) (var9 * Math.sin((double) var13 / 1.5D + (double) arg7));
        }
        this.method2926(arg5, null, var12, null, arg2, null, 50, arg4 - (this.field7119.method105(arg2, 1) / 2));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZI[Lf;Ljava/lang/String;I[ILea;)V", line = 645)
    private final void method2922(int arg0, int arg1, boolean arg2, int arg3, class528[] arg4, String arg5, int arg6, int[] arg7, class381 arg8) {
        int var10 = arg0 - this.field7119.field203;
        field7133++;
        int var11 = -1;
        int var12 = -1;
        int var13 = arg5.length();
        if (!arg2) {
            method2925((byte) -104, -66, -15, -126, 17);
        }
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class167.method1189(arg5.charAt(var14), 26421) & 0xFF);
            if (var15 == '<') {
                var11 = var14;
            } else {
                if (var15 == '>' && var11 != -1) {
                    String var16 = arg5.substring(var11 + 1, var14);
                    var11 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17 = class457.method2745(var16.substring(4), true);
                                    class528 var18 = arg4[var17];
                                    int var19 = arg7 == null ? var18.method131() : arg7[var17];
                                    if ((class453.field6712 & 0xFF000000) == -16777216) {
                                        var18.method133(arg3, var10 - (var19 - this.field7119.field203), 1, 0, 1);
                                    } else {
                                        var18.method133(arg3, var10 + this.field7119.field203 - var19, 0, class453.field6712 & 0xFF000000 | 0xFFFFFF, 1);
                                    }
                                    var12 = -1;
                                    arg3 += arg4[var17].method134();
                                } catch (Exception var21) {
                                }
                            } else {
                                this.method2911(var16, (byte) 102);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var11 == -1) {
                    if (var12 != -1) {
                        arg3 += this.field7119.method102(var15, (byte) 83, var12);
                    }
                    if (var15 == ' ') {
                        if (class175.field2671 > 0) {
                            class147.field2168 += class175.field2671;
                            arg3 += class147.field2168 >> 8;
                            class147.field2168 &= 0xFF;
                        }
                    } else if (arg8 == null) {
                        if ((class219.field3160 & 0xFF000000) != 0) {
                            this.method598(var15, arg3 + 1, var10 + 1, class219.field3160, true);
                        }
                        this.method598(var15, arg3, var10, class453.field6712, false);
                    } else {
                        if ((class219.field3160 & 0xFF000000) != 0) {
                            this.method599(var15, arg3 + 1, var10 + 1, class219.field3160, true, arg8, arg6, arg1);
                        }
                        this.method599(var15, arg3, var10, class453.field6712, false, arg8, arg6, arg1);
                    }
                    int var20 = this.field7119.method103(var15, (byte) -79);
                    if (class314.field4490 != -1) {
                        this.field7120.method1173(-123, arg3, class314.field4490, var20, (int) ((double) this.field7119.field203 * 0.7D) + var10);
                    }
                    if (class310.field4432 != -1) {
                        this.field7120.method1173(-123, arg3, class310.field4432, var20, var10 + this.field7119.field203 + 1);
                    }
                    var12 = var15;
                    arg3 += var20;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqf;B)V", line = 800)
    public static final void method2923(class477 arg0, byte arg1) {
        field7116++;
        int var2 = 0;
        arg0.method2857(-18300);
        for (int var3 = 0; var3 < class333.field5117; var3++) {
            int var16 = class459.field6766[var3];
            if ((class457.field6753[var16] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class457.field6753[var16] = (byte) class29.method239(class457.field6753[var16], 2);
                } else {
                    int var17 = arg0.method2847(-33, 1);
                    if (var17 == 0) {
                        var2 = class211.method1410(0, arg0);
                        class457.field6753[var16] = (byte) class29.method239(class457.field6753[var16], 2);
                    } else {
                        class397.method2472(32, var16, arg0);
                    }
                }
            }
        }
        arg0.method2849(35);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2857(-18300);
        for (int var4 = 0; var4 < class333.field5117; var4++) {
            int var14 = class459.field6766[var4];
            if ((class457.field6753[var14] & 0x1) != 0) {
                if (var2 > 0) {
                    class457.field6753[var14] = (byte) class29.method239(class457.field6753[var14], 2);
                    var2--;
                } else {
                    int var15 = arg0.method2847(-96, 1);
                    if (var15 == 0) {
                        var2 = class211.method1410(0, arg0);
                        class457.field6753[var14] = (byte) class29.method239(class457.field6753[var14], 2);
                    } else {
                        class397.method2472(32, var14, arg0);
                    }
                }
            }
        }
        arg0.method2849(93);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2857(-18300);
        for (int var5 = 0; var5 < class326.field5036; var5++) {
            int var12 = class442.field6486[var5];
            if ((class457.field6753[var12] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class457.field6753[var12] = (byte) class29.method239(class457.field6753[var12], 2);
                } else {
                    int var13 = arg0.method2847(117, 1);
                    if (var13 == 0) {
                        var2 = class211.method1410(0, arg0);
                        class457.field6753[var12] = (byte) class29.method239(class457.field6753[var12], 2);
                    } else if (class377.method2396((byte) -89, var12, arg0)) {
                        class457.field6753[var12] = (byte) class29.method239(class457.field6753[var12], 2);
                    }
                }
            }
        }
        arg0.method2849(58);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2857(-18300);
        int var6 = 29 % ((arg1 - 58) / 53);
        for (int var7 = 0; var7 < class326.field5036; var7++) {
            int var10 = class442.field6486[var7];
            if ((class457.field6753[var10] & 0x1) == 0) {
                if (var2 > 0) {
                    class457.field6753[var10] = (byte) class29.method239(class457.field6753[var10], 2);
                    var2--;
                } else {
                    int var11 = arg0.method2847(-83, 1);
                    if (var11 == 0) {
                        var2 = class211.method1410(0, arg0);
                        class457.field6753[var10] = (byte) class29.method239(class457.field6753[var10], 2);
                    } else if (class377.method2396((byte) -89, var10, arg0)) {
                        class457.field6753[var10] = (byte) class29.method239(class457.field6753[var10], 2);
                    }
                }
            }
        }
        arg0.method2849(33);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class333.field5117 = 0;
        class326.field5036 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            class457.field6753[var8] = (byte) (class457.field6753[var8] >> 1);
            class62 var9 = class390.field5783[var8];
            if (var9 == null) {
                class442.field6486[class326.field5036++] = var8;
            } else {
                class459.field6766[class333.field5117++] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 1003)
    public static void method2924(int arg0) {
        field7115 = null;
        field7135 = null;
        if (arg0 == 4) {
            field7125 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIII)V", line = 1015)
    public static final void method2925(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field7117++;
        if (arg0 < 113) {
            return;
        }
        class434 var5 = class483.method2888(arg2, 121, 4);
        var5.method2632((byte) 81);
        var5.field6310 = arg1;
        var5.field6306 = arg3;
        var5.field6314 = arg4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[I[I[ILjava/lang/String;[Lf;II)V", line = 1043)
    private final void method2926(int arg0, int[] arg1, int[] arg2, int[] arg3, String arg4, class528[] arg5, int arg6, int arg7) {
        int var9 = arg0 - this.field7119.field203;
        field7114++;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg6 <= 31) {
            this.method2914(-64, -11, 46, 42, -44, null);
        }
        int var13 = arg4.length();
        for (int var14 = 0; var14 < var13; var14++) {
            char var15 = (char) (class167.method1189(arg4.charAt(var14), 26421) & 0xFF);
            if (var15 == '<') {
                var10 = var14;
            } else {
                if (var15 == '>' && var10 != -1) {
                    String var16 = arg4.substring(var10 + 1, var14);
                    var10 = -1;
                    if (var16.equals("lt")) {
                        var15 = '<';
                    } else if (var16.equals("gt")) {
                        var15 = '>';
                    } else if (var16.equals("nbsp")) {
                        var15 = ' ';
                    } else if (var16.equals("shy")) {
                        var15 = '\u00AD';
                    } else if (var16.equals("times")) {
                        var15 = '×';
                    } else if (var16.equals("euro")) {
                        var15 = '€';
                    } else if (var16.equals("copy")) {
                        var15 = '©';
                    } else {
                        if (!var16.equals("reg")) {
                            if (var16.startsWith("img=")) {
                                try {
                                    int var17;
                                    if (arg1 == null) {
                                        var17 = 0;
                                    } else {
                                        var17 = arg1[var12];
                                    }
                                    int var18;
                                    if (arg2 == null) {
                                        var18 = 0;
                                    } else {
                                        var18 = arg2[var12];
                                    }
                                    var12++;
                                    int var19 = class457.method2745(var16.substring(4), true);
                                    class528 var20 = arg5[var19];
                                    int var21 = arg3 == null ? var20.method131() : arg3[var19];
                                    var20.method133(arg7 + var17, this.field7119.field203 + var9 + -var21 - -var18, 1, 0, 1);
                                    var11 = -1;
                                    arg7 += arg5[var19].method134();
                                } catch (Exception var25) {
                                }
                            } else {
                                this.method2911(var16, (byte) 57);
                            }
                            continue;
                        }
                        var15 = '®';
                    }
                }
                if (var10 == -1) {
                    if (var11 != -1) {
                        arg7 += this.field7119.method102(var15, (byte) 95, var11);
                    }
                    int var22;
                    if (arg1 == null) {
                        var22 = 0;
                    } else {
                        var22 = arg1[var12];
                    }
                    int var23;
                    if (arg2 == null) {
                        var23 = 0;
                    } else {
                        var23 = arg2[var12];
                    }
                    var12++;
                    if (var15 != ' ') {
                        if ((class219.field3160 & 0xFF000000) != 0) {
                            this.method598(var15, arg7 + var22 + 1, var9 + 1 - -var23, class219.field3160, true);
                        }
                        this.method598(var15, arg7 + var22, var9 + var23, class453.field6712, false);
                    } else if (class175.field2671 > 0) {
                        class147.field2168 += class175.field2671;
                        arg7 += class147.field2168 >> 8;
                        class147.field2168 &= 0xFF;
                    }
                    int var24 = this.field7119.method103(var15, (byte) -79);
                    if (class314.field4490 != -1) {
                        this.field7120.method1173(-116, arg7, class314.field4490, var24, (int) ((double) this.field7119.field203 * 0.7D) + var9);
                    }
                    if (class310.field4432 != -1) {
                        this.field7120.method1173(-117, arg7, class310.field4432, var24, this.field7119.field203 + var9);
                    }
                    arg7 += var24;
                    var11 = var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;[I[Lf;IIIIIIILea;IIIII)I", line = 1206)
    public final int method2927(int arg0, String arg1, int[] arg2, class528[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class381 arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        field7131++;
        if (arg1 == null) {
            return 0;
        }
        this.method2907(0, arg8, arg6);
        if (arg13 == 0) {
            arg13 = this.field7119.field203;
        }
        int[] var18;
        if ((this.field7119.field201 + this.field7119.field194 + arg13) > arg10 && arg10 < arg13 + arg13) {
            var18 = null;
        } else {
            var18 = new int[] { arg0 };
        }
        int var19 = this.field7119.method106(class163.field2460, arg3, arg1, var18, false);
        if (arg14 == -1) {
            arg14 = arg10 / arg13;
            if (arg14 <= 0) {
                arg14 = 1;
            }
        }
        if (arg14 > 0 && arg14 <= var19) {
            var19 = arg14;
            class163.field2460[arg14 - 1] = this.field7119.method99(-67, arg3, class163.field2460[arg14 - 1], arg0);
        }
        if (arg9 >= -42) {
            method2923(null, (byte) -127);
        }
        if (arg4 == 3 && var19 == 1) {
            arg4 = 1;
        }
        int var20;
        if (arg4 == 0) {
            var20 = this.field7119.field194 + arg15;
        } else if (arg4 == 1) {
            var20 = (arg10 - this.field7119.field194 - this.field7119.field201 - ((var19 + -1) * arg13)) / 2 + this.field7119.field194 + arg15;
        } else if (arg4 == 2) {
            var20 = arg10 + arg15 - this.field7119.field201 - (var19 + -1) * arg13;
        } else {
            int var21 = (arg10 - this.field7119.field194 - this.field7119.field201 - (var19 - 1) * arg13) / (var19 + 1);
            if (var21 < 0) {
                var21 = 0;
            }
            var20 = arg15 + var21 + this.field7119.field194;
            arg13 += var21;
        }
        for (int var22 = 0; var22 < var19; var22++) {
            if (arg12 == 0) {
                this.method2922(var20, arg5, true, arg7, arg3, class163.field2460[var22], arg16, arg2, arg11);
            } else if (arg12 == 1) {
                this.method2922(var20, arg5, true, (arg0 - this.field7119.method105(class163.field2460[var22], 1)) / 2 + arg7, arg3, class163.field2460[var22], arg16, arg2, arg11);
            } else if (arg12 == 2) {
                this.method2922(var20, arg5, true, arg0 + arg7 - this.field7119.method105(class163.field2460[var22], 1), arg3, class163.field2460[var22], arg16, arg2, arg11);
            } else if ((var19 - 1) == var22) {
                this.method2922(var20, arg5, true, arg7, arg3, class163.field2460[var22], arg16, arg2, arg11);
            } else {
                this.method2920(955267816, class163.field2460[var22], arg0);
                this.method2922(var20, arg5, true, arg7, arg3, class163.field2460[var22], arg16, arg2, arg11);
                class175.field2671 = 0;
            }
            var20 += arg13;
        }
        return var19;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(CIIIZLea;II)V")
    public abstract void method599(char arg0, int arg1, int arg2, int arg3, boolean arg4, class381 arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "(CIIIZ)V")
    public abstract void method598(char arg0, int arg1, int arg2, int arg3, boolean arg4);
}
