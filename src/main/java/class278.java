import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class278 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3521 = new String[100];

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lpr;")
    public static class407 field3518 = new class407(52, 12);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        field3518 = null;
        int var1 = 101 / ((-arg0 - 45) / 52);
        field3521 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)I")
    public static final int method1585(byte arg0, int arg1, int arg2) {
        if (arg0 > -18) {
            return 100;
        } else {
            field3519++;
            return arg1 == 1 || arg1 == 3 ? class95.field1066[arg2 & 0x3] : class88.field935[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)I")
    public final int method1586(int arg0, int arg1, byte arg2) {
        field3520++;
        int var4 = class416.field5524 > arg0 ? class416.field5524 : arg0;
        if (class152.field1727 == this) {
            return 0;
        } else if (class352.field4614 == this) {
            return var4 - arg1;
        } else if (class261.field3322 == this) {
            return (var4 - arg1) / 2;
        } else {
            int var5 = 68 / ((arg2 - 41) / 34);
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Liaa;ILpe;I)V")
    public static final void method1587(class452 arg0, int arg1, class556 arg2, int arg3) {
        field3515++;
        class170 var4 = new class170();
        var4.field2038 = arg0.method2541(arg1 + 37);
        var4.field2042 = arg0.method2575((byte) -48);
        var4.field2031 = new class199[var4.field2038];
        var4.field2032 = new class199[var4.field2038];
        var4.field2030 = new int[var4.field2038];
        if (arg1 != -2) {
            field3518 = null;
        }
        var4.field2037 = new int[var4.field2038];
        var4.field2034 = new byte[var4.field2038][][];
        var4.field2036 = new int[var4.field2038];
        for (int var5 = 0; var5 < var4.field2038; var5++) {
            try {
                int var6 = arg0.method2541(46);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg0.method2516(63);
                    String var8 = arg0.method2516(arg1 ^ 0xFFFFFF91);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method2575((byte) -48);
                    }
                    var4.field2037[var5] = var6;
                    var4.field2036[var5] = var9;
                    var4.field2032[var5] = arg2.method3133(0, class518.method2953(var7, 65536), var8);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg0.method2516(arg1 + 118);
                    String var11 = arg0.method2516(76);
                    int var12 = arg0.method2541(66);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg0.method2516(103);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method2575((byte) -48);
                            var15[var16] = new byte[var17];
                            arg0.method2552(0, arg1 ^ 0xFFFFFFFA, var17, var15[var16]);
                        }
                    }
                    var4.field2037[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class518.method2953(var13[var19], 65536);
                    }
                    var4.field2031[var5] = arg2.method3144(var18, (byte) 97, var11, class518.method2953(var10, 65536));
                    var4.field2034[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2030[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2030[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2030[var5] = -3;
            } catch (Exception var23) {
                var4.field2030[var5] = -4;
            } catch (Throwable var24) {
                var4.field2030[var5] = -5;
            }
        }
        class646.field9145.method3164(var4, 256);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lag;BII)V")
    public static final void method1588(class625 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field3778 == arg3 && arg3 != -1) {
            class576 var4 = class618.field8696.method124(24006, arg3);
            int var5 = var4.field8217;
            if (var5 == 1) {
                arg0.field3797 = arg2;
                arg0.field3810 = 0;
                arg0.field3754 = 0;
                arg0.field3744 = 0;
                arg0.field3758 = 1;
                class259.method1473(arg0.field4641, (byte) 1, var4, arg0.field4647, arg0.field4638, arg0.field3744, false);
            }
            if (var5 == 2) {
                arg0.field3754 = 0;
            }
        } else if (arg3 == -1 || arg0.field3778 == -1 || class618.field8696.method124(24006, arg3).field8222 >= class618.field8696.method124(24006, arg0.field3778).field8222) {
            arg0.field3744 = 0;
            arg0.field3810 = 0;
            arg0.field3778 = arg3;
            arg0.field3840 = arg0.field3835;
            arg0.field3758 = 1;
            arg0.field3797 = arg2;
            arg0.field3754 = 0;
            if (arg0.field3778 != -1) {
                class259.method1473(arg0.field4641, (byte) 1, class618.field8696.method124(24006, arg0.field3778), arg0.field4647, arg0.field4638, arg0.field3744, false);
            }
        }
        if (arg1 >= 40) {
            field3517++;
        }
    }

    @OriginalMember(owner = "client!ce", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3516++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BZ)C")
    public static final char method1589(byte arg0, boolean arg1) {
        field3514++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class689.field9726[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        if (arg1) {
            field3521 = null;
        }
        return (char) var2;
    }
}
