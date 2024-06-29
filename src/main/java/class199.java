import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class199 extends class26 {

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "Z")
    public boolean field2795;

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "[Ljo;")
    public class199[] field2800;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "[J")
    public static long[] field2801 = new long[500];

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "Z")
    public static boolean field2803 = true;

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
    public static int[] field2805 = new int[4096];

    @OriginalMember(owner = "client!jo", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2810 = "yellow:";

    @OriginalMember(owner = "client!jo", name = "O", descriptor = "[I")
    public static int[] field2811 = new int[14];

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "F")
    public static float field2792;

    @OriginalMember(owner = "client!jo", name = "Q", descriptor = "F")
    public static float field2813;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!jo", name = "K", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!jo", name = "L", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!jo", name = "M", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!jo", name = "R", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "Lmd;")
    public class316 field2796;

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "Lda;")
    public class360 field2802;

    @OriginalMember(owner = "client!jo", name = "P", descriptor = "[[B")
    public static byte[][] field2812;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 5)
    public static void method1458(int arg0) {
        field2810 = null;
        if (arg0 >= -112) {
            method1466(67, 20, -102, -32, 127, 30, -118, -120, 53, -66, -33, 2, 12, 6, -93, 99, -4, 101, -15, 83);
        }
        field2801 = null;
        field2811 = null;
        field2812 = (byte[][]) null;
        field2805 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB)[[I", line = 19)
    public final int[][] method1459(int arg0, int arg1, byte arg2) {
        if (arg2 != -51) {
            this.method1455((byte) -115);
        }
        field2806++;
        if (!this.field2800[arg0].field2795) {
            return this.field2800[arg0].method215(arg1, -29869);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field2800[arg0].method190(-1735, arg1);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLfd;I)V", line = 54)
    public void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            field2811 = (int[]) null;
        }
        field2793++;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)I", line = 67)
    public int method1460(int arg0) {
        if (arg0 != -1) {
            field2812 = (byte[][]) ((byte[][]) null);
        }
        field2785++;
        return -1;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lpm;IBLfd;)V", line = 81)
    public static final void method1461(class69 arg0, int arg1, byte arg2, class299 arg3) {
        field2808++;
        class242 var4 = new class242();
        var4.field3503 = arg3.method2096((byte) -122);
        var4.field3507 = arg3.method2062(-25795);
        var4.field3506 = new int[var4.field3503];
        if (arg2 > -100) {
            field2805 = (int[]) null;
        }
        var4.field3500 = new byte[var4.field3503][][];
        var4.field3505 = new class188[var4.field3503];
        var4.field3511 = new class188[var4.field3503];
        var4.field3514 = new int[var4.field3503];
        var4.field3502 = new int[var4.field3503];
        for (int var5 = 0; var5 < var4.field3503; var5++) {
            try {
                int var6 = arg3.method2096((byte) -122);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg3.method2060(-12482);
                    int var8 = 0;
                    String var9 = arg3.method2060(-12482);
                    if (var6 == 1) {
                        var8 = arg3.method2062(-25795);
                    }
                    var4.field3506[var5] = var6;
                    var4.field3502[var5] = var8;
                    var4.field3505[var5] = arg0.method491(true, var9, class261.method1802(0, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg3.method2060(-12482);
                    String var11 = arg3.method2060(-12482);
                    int var12 = arg3.method2096((byte) -122);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg3.method2060(-12482);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg3.method2062(-25795);
                            var15[var16] = new byte[var17];
                            arg3.method2079(123, 0, var17, var15[var16]);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field3506[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class261.method1802(0, var13[var19]);
                    }
                    var4.field3511[var5] = arg0.method502(var11, (byte) 70, class261.method1802(0, var10), var18);
                    var4.field3500[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field3514[var5] = -1;
            } catch (SecurityException var26) {
                var4.field3514[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field3514[var5] = -3;
            } catch (Exception var28) {
                var4.field3514[var5] = -4;
            } catch (Throwable var29) {
                var4.field3514[var5] = -5;
            }
        }
        class74.field983.method415((byte) -124, var4);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILvh;III)V", line = 203)
    public static final void method1462(int arg0, class219 arg1, int arg2, int arg3, int arg4) {
        field2798++;
        if (arg3 != 16157) {
            field2813 = 1.1516114F;
        }
        for (class96 var5 = (class96) class264.field3831.method413(1253231568); var5 != null; var5 = (class96) class264.field3831.method419(30)) {
            if (var5.field1272 == arg2 && arg4 * 128 == var5.field1268 && arg0 * 128 == var5.field1253 && var5.field1271.field3157 == arg1.field3157) {
                if (var5.field1260 != null) {
                    class186.field2548.method2246(var5.field1260);
                    var5.field1260 = null;
                }
                if (var5.field1247 != null) {
                    class186.field2548.method2246(var5.field1247);
                    var5.field1247 = null;
                }
                var5.method179((byte) 51);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)I", line = 245)
    public int method1455(byte arg0) {
        field2809++;
        if (arg0 >= -26) {
            this.field2795 = true;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)V", line = 263)
    public static final void method1463(int arg0) {
        for (class146 var1 = (class146) class263.field3822.method413(arg0 ^ 0x4AB2CBD3); var1 != null; var1 = (class146) class263.field3822.method419(46)) {
            if (var1.field2034 > 0) {
                var1.field2034--;
            }
            if (var1.field2034 != 0) {
                if (var1.field2046 > 0) {
                    var1.field2046--;
                }
                if (var1.field2046 == 0 && var1.field2045 >= 1 && var1.field2039 >= 1 && var1.field2045 <= 102 && var1.field2039 <= 102 && (var1.field2033 < 0 || class103.method734(var1.field2033, var1.field2041, -102))) {
                    class16.method117(-1, var1.field2036, var1.field2031, var1.field2039, var1.field2035, var1.field2033, var1.field2045, var1.field2041);
                    var1.field2046 = -1;
                    if (var1.field2037 == var1.field2033 && var1.field2037 == -1) {
                        var1.method179((byte) 51);
                    } else if (var1.field2037 == var1.field2033 && var1.field2043 == var1.field2031 && var1.field2042 == var1.field2041) {
                        var1.method179((byte) 51);
                    }
                }
            } else if (var1.field2037 < 0 || class103.method734(var1.field2037, var1.field2042, -110)) {
                class16.method117(-1, var1.field2036, var1.field2043, var1.field2039, var1.field2035, var1.field2037, var1.field2045, var1.field2042);
                var1.method179((byte) 51);
            }
        }
        if (arg0 != 3) {
            method1461((class69) null, -107, (byte) 0, (class299) null);
        }
        field2794++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIII)V", line = 327)
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class245.field3574 <= arg8 && arg8 <= class321.field4722 && class245.field3574 <= arg0 && class321.field4722 >= arg0 && class245.field3574 <= arg3 && class321.field4722 >= arg3 && class245.field3574 <= arg4 && arg4 <= class321.field4722 && arg5 >= class207.field2937 && arg5 <= class25.field292 && arg1 >= class207.field2937 && class25.field292 >= arg1 && arg7 >= class207.field2937 && class25.field292 >= arg7 && class207.field2937 <= arg6 && class25.field292 >= arg6) {
            class132.method1012(arg6, arg7, arg5, arg2, arg0, arg3, arg4, arg1, arg8, true);
        } else {
            class126.method935(arg8, arg7, arg4, arg0, arg1, arg5, arg6, -17731, arg2, arg3);
        }
        int var10 = -35 % ((65 - arg9) / 54);
        field2788++;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)[I", line = 343)
    public int[] method190(int arg0, int arg1) {
        field2786++;
        if (arg0 != -1735) {
            method1466(-82, -31, -95, 97, -1, -4, 79, 54, -110, -103, 114, -128, -27, 46, 22, -61, 90, -33, 103, -29);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)[[I", line = 366)
    public int[][] method215(int arg0, int arg1) {
        if (arg1 == -29869) {
            field2807++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V", line = 379)
    public void method1454(int arg0) {
        if (this.field2795) {
            this.field2802.method2505((byte) -49);
            this.field2802 = null;
        } else {
            this.field2796.method2184((byte) -74);
            this.field2796 = null;
        }
        field2791++;
        if (arg0 != -2) {
            this.field2796 = (class316) null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 410)
    public final void method1465(int arg0, int arg1, int arg2) {
        field2789++;
        int var4 = this.field2814 == 255 ? arg0 : this.field2814;
        if (arg1 <= 14) {
            this.method189((byte) -78);
        }
        if (this.field2795) {
            this.field2802 = new class360(var4, arg0, arg2);
        } else {
            this.field2796 = new class316(var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 429)
    public static final void method1466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class104 var20 = new class104(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class345.field5367[var21][arg1][arg2] == null) {
                    class345.field5367[var21][arg1][arg2] = new class119(var21, arg1, arg2);
                }
            }
            class345.field5367[arg0][arg1][arg2].field1550 = var20;
        } else if (arg3 == 1) {
            class104 var22 = new class104(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class345.field5367[var23][arg1][arg2] == null) {
                    class345.field5367[var23][arg1][arg2] = new class119(var23, arg1, arg2);
                }
            }
            class345.field5367[arg0][arg1][arg2].field1550 = var22;
        } else {
            class244 var24 = new class244(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class345.field5367[var25][arg1][arg2] == null) {
                    class345.field5367[var25][arg1][arg2] = new class119(var25, arg1, arg2);
                }
            }
            class345.field5367[arg0][arg1][arg2].field1567 = var24;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)[I", line = 486)
    public final int[] method1467(int arg0, int arg1, int arg2) {
        field2790++;
        if (arg0 != -7764) {
            method1462(-61, (class219) null, 112, 39, 59);
        }
        return this.field2800[arg2].field2795 ? this.field2800[arg2].method190(-1735, arg1) : this.field2800[arg2].method215(arg1, -29869)[0];
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(B)V", line = 510)
    public void method189(byte arg0) {
        field2797++;
        int var2 = 3 / ((36 - arg0) / 44);
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(IZ)V", line = 517)
    public class199(int arg0, boolean arg1) {
        this.field2795 = arg1;
        this.field2800 = new class199[arg0];
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(IIIIII)V", line = 536)
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2787++;
        int var6 = class289.method1984(class207.field2937, arg2, 1, class25.field292);
        int var7 = class289.method1984(class207.field2937, arg5, 1, class25.field292);
        int var8 = class289.method1984(class245.field3574, arg0, 1, class321.field4722);
        int var9 = class289.method1984(class245.field3574, arg1, 1, class321.field4722);
        for (int var10 = var6; var10 <= var7; var10++) {
            class96.method697((byte) 115, class331.field4902[var10], arg4, var8, var9);
        }
        if (arg3 != 4) {
            method1463(109);
        }
    }
}
