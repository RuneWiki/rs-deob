import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class367 {

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "B")
    public byte field5617;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "[I")
    public int[] field5621;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "[I")
    public int[] field5614;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "B")
    public byte field5612;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "[I")
    public int[] field5610;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "S")
    public short field5620;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "S")
    public short field5611;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "S")
    public short field5625;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "[S")
    public short[] field5622;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "S")
    public short field5624;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "[S")
    public short[] field5613;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "[S")
    public short[] field5616;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5626 = new String[] { method2977(method2976("\u000eZ^\u000b&")), method2977(method2976("\u0001\u0001^fs")), method2977(method2976("\u001b\u0001\u001cI")), method2977(method2976("\u0001\u0001^as")), method2977(method2976("\u0001\u0001^ds")), method2977(method2976("\u0001\u0001^gs")), method2977(method2976("\u0001\u0001^\u00192\u001b\u001d\u0004\u001bs")) };

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLqja;B)V", line = 7)
    public static final void method2972(boolean arg0, class326 arg1, byte arg2) {
        try {
            int var3 = -98 / ((arg2 - 6) / 49);
            field5619++;
            if (arg1.field5149) {
                if (arg1.field5144 < 0 || class582.method4357(7696, arg1.field5144, arg1.field5146)) {
                    if (arg0) {
                        class737.method5383((byte) 60, arg1.field5139, arg1.field5136, arg1.field5140, null, arg1.field5148);
                    } else {
                        class184.method1605(arg1.field5139, -1, arg1.field5136, arg1.field5140, arg1.field5146, arg1.field5148, arg1.field5135, arg1.field5144, (byte) -81);
                    }
                    arg1.method1824(1);
                }
            } else if (arg1.field5134 && arg1.field5136 >= 1 && arg1.field5148 >= 1 && (class648.field9378 - 2) >= arg1.field5136 && arg1.field5148 <= class659.field9506 - 2) {
                if (arg1.field5142 >= 0 && !class582.method4357(7696, arg1.field5142, arg1.field5137)) {
                    return;
                }
                if (arg0) {
                    class737.method5383((byte) 68, arg1.field5139, arg1.field5136, arg1.field5140, arg1.field5138, arg1.field5148);
                } else {
                    class184.method1605(arg1.field5139, -1, arg1.field5136, arg1.field5140, arg1.field5137, arg1.field5148, arg1.field5133, arg1.field5142, (byte) 50);
                }
                arg1.field5134 = false;
                if (!arg0 && arg1.field5144 == arg1.field5142 && arg1.field5144 == -1) {
                    arg1.method1824(1);
                    return;
                }
                if (!arg0 && arg1.field5144 == arg1.field5142 && arg1.field5135 == arg1.field5133 && arg1.field5146 == arg1.field5137) {
                    arg1.method1824(1);
                    return;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5626[1] + arg0 + ',' + (arg1 == null ? field5626[2] : field5626[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "([BB)Ljava/lang/String;", line = 55)
    public static final String method2973(byte[] arg0, byte arg1) {
        try {
            field5618++;
            int var2 = 102 % ((arg1 - 72) / 53);
            return class209.method1842((byte) -112, arg0, 0, arg0.length);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5626[5] + (arg0 == null ? field5626[2] : field5626[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 67)
    public static final void method2974(int arg0) {
        try {
            if (arg0 <= -1) {
                field5623++;
                class143.field1719.method970(-107);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5626[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 89)
    public class367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        try {
            this.field5617 = (byte) arg0;
            this.field5621 = new int[4];
            this.field5614 = new int[4];
            this.field5612 = (byte) arg1;
            this.field5610 = new int[4];
            this.field5614[1] = arg3;
            this.field5614[3] = arg5;
            this.field5614[2] = arg4;
            this.field5614[0] = arg2;
            this.field5621[3] = arg9;
            this.field5621[0] = arg6;
            this.field5621[1] = arg7;
            this.field5621[2] = arg8;
            this.field5610[3] = arg13;
            this.field5620 = (short) (arg2 >> class602.field8828);
            this.field5610[0] = arg10;
            this.field5610[2] = arg12;
            this.field5610[1] = arg11;
            this.field5611 = (short) (arg4 >> class602.field8828);
            this.field5625 = (short) (arg10 >> class602.field8828);
            this.field5622 = new short[4];
            this.field5624 = (short) (arg12 >> class602.field8828);
            this.field5613 = new short[4];
            this.field5616 = new short[4];
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field5626[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z", line = 120)
    public static final boolean method2975(int arg0) {
        try {
            field5615++;
            try {
                if (class84.field940 == 2) {
                    if (class226.field3467 == null) {
                        class226.field3467 = class346.method2863(class166.field2289, class252.field3914, class573.field8466);
                        if (class226.field3467 == null) {
                            return false;
                        }
                    }
                    if (class38.field447 == null) {
                        class38.field447 = new class601(class218.field3344, class322.field5080);
                    }
                    class616 var1 = class396.field5927;
                    if (class494.field7093 != null) {
                        var1 = class494.field7093;
                    }
                    if (var1.method4570(22050, class38.field447, (byte) 56, class226.field3467, class132.field1546)) {
                        class396.field5927 = var1;
                        class396.field5927.method4557(-55);
                        if (class726.field10492 > 0) {
                            class84.field940 = 3;
                            class396.field5927.method4563((byte) 94, class726.field10492 <= class550.field8199 ? class726.field10492 : class550.field8199);
                            for (int var2 = 0; var2 < class335.field5230.length; var2++) {
                                class396.field5927.method4579(var2, (byte) 51, class335.field5230[var2]);
                                class335.field5230[var2] = 255;
                            }
                        } else {
                            class84.field940 = 0;
                            class396.field5927.method4563((byte) 71, class550.field8199);
                            for (int var3 = 0; var3 < class335.field5230.length; var3++) {
                                class396.field5927.method4579(var3, (byte) 51, class335.field5230[var3]);
                                class335.field5230[var3] = 255;
                            }
                        }
                        if (class494.field7093 == null) {
                            if (class514.field7421 > 0L) {
                                class396.field5927.method4580(true, class226.field3467, class514.field7421, class336.field5242, true);
                            } else {
                                class396.field5927.method4592(class336.field5242, true, class226.field3467);
                            }
                        }
                        if (class452.field6628 != null) {
                            class452.field6628.method4052((byte) 31, class396.field5927);
                        }
                        class494.field7093 = null;
                        class514.field7421 = 0L;
                        class38.field447 = null;
                        class226.field3467 = null;
                        class166.field2289 = null;
                        return true;
                    }
                }
                if (arg0 != 0) {
                    method2974(-27);
                }
            } catch (Exception var6) {
                var6.printStackTrace();
                class396.field5927.method4568(-486);
                class226.field3467 = null;
                class494.field7093 = null;
                class166.field2289 = null;
                class84.field940 = 0;
                class38.field447 = null;
            }
            return false;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5626[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2976(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2977(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
