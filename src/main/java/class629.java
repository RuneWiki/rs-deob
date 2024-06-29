import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class629 extends class508 {

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "Z")
    public boolean field8770 = true;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "I")
    public static int field8765 = -1;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "[[Z")
    public static boolean[][] field8769 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field8753 = 0;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "Lmc;")
    public static class424 field8758;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "Lsh;")
    public class673 field8764;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "[I")
    public int[] field8763;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "[I")
    private int[] field8768;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "[Ljava/lang/String;")
    private String[] field8773;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "[[I")
    private int[][] field8767;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLes;)V", line = 3)
    public final void method3450(byte arg0, class630 arg1) {
        if (arg0 != 48) {
            return;
        }
        field8772++;
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method3457(var3, arg1, (byte) -31);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lbaa;", line = 26)
    public final class593 method3451(int arg0, int arg1) {
        int var3 = 94 % ((arg0 + 62) / 58);
        field8766++;
        return this.field8768 == null || arg1 < 0 || this.field8768.length < arg1 ? null : class265.method1539((byte) 127, this.field8768[arg1]);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([IILes;)V", line = 39)
    public final void method3452(int[] arg0, int arg1, class630 arg2) {
        field8760++;
        if (this.field8768 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field8768.length; var4++) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = this.method3451(56, var4).field8332;
            if (var5 > 0) {
                arg2.method3478(var5, -6, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILes;)Ljava/lang/String;", line = 64)
    public final String method3453(int arg0, class630 arg1) {
        field8757++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field8768 != null) {
            for (int var4 = 0; var4 < this.field8768.length; var4++) {
                var3.append(this.field8773[var4]);
                var3.append(this.field8764.method3780(this.method3451(-125, var4), arg1.method3511((byte) -107, class265.method1539((byte) 103, this.field8768[var4]).field8329), arg0 - 1673, this.field8767[var4]));
            }
        }
        var3.append(this.field8773[this.field8773.length - 1]);
        if (arg0 != 1772) {
            this.field8768 = null;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I", line = 96)
    public final int method3454(int arg0, int arg1, int arg2) {
        field8759++;
        if (this.field8768 == null || arg2 < 0 || arg2 > this.field8768.length) {
            return -1;
        } else {
            int var4 = 0 % ((-arg0 - 49) / 63);
            return this.field8767[arg2] == null || arg1 < 0 || arg1 > this.field8767[arg2].length ? -1 : this.field8767[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Ljava/lang/String;", line = 116)
    public final String method3455(byte arg0) {
        field8756++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field8773 == null) {
            return "";
        }
        var2.append(this.field8773[0]);
        int var3 = -121 % ((-arg0 - 46) / 34);
        for (int var4 = 1; var4 < this.field8773.length; var4++) {
            var2.append("...");
            var2.append(this.field8773[var4]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 146)
    public static void method3456(int arg0) {
        field8769 = null;
        int var1 = -62 / ((43 - arg0) / 34);
        field8758 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILes;B)V", line = 160)
    private final void method3457(int arg0, class630 arg1, byte arg2) {
        field8762++;
        if (arg0 == 1) {
            this.field8773 = class475.method2512(arg2 ^ 0x66, arg1.method3500((byte) 124), '<');
        } else if (arg0 == 2) {
            int var4 = arg1.method3501(-9268);
            this.field8763 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8763[var5] = arg1.method3470(13111);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method3501(-9268);
            this.field8768 = new int[var6];
            this.field8767 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method3470(13111);
                class593 var9 = class265.method1539((byte) 124, var8);
                if (var9 != null) {
                    this.field8768[var7] = var8;
                    this.field8767[var7] = new int[var9.field8330];
                    for (int var10 = 0; var10 < var9.field8330; var10++) {
                        this.field8767[var7][var10] = arg1.method3470(13111);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field8770 = false;
        }
        if (arg2 != -31) {
            this.method3454(58, 1, 62);
        }
    }

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "(I)V", line = 234)
    public final void method3458(int arg0) {
        if (this.field8763 != null) {
            for (int var2 = 0; var2 < this.field8763.length; var2++) {
                this.field8763[var2] = class444.method2376(this.field8763[var2], 32768);
            }
        }
        field8774++;
        if (arg0 != -19394) {
            this.method3454(16, 89, -121);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILr;)V", line = 270)
    public static final void method3459(int arg0, class566 arg1) {
        field8755++;
        if (!(class463.field5904 >= 2 || class664.field9377) || class358.field4562 != null) {
            return;
        }
        String var2;
        if (class664.field9377 && class463.field5904 < 2) {
            var2 = class537.field7208 + class83.field1140.method476((byte) 106, class250.field3068) + class473.field6007 + " ->";
        } else if (class267.field3381 && class277.field3470.method448((byte) -68, 81) && class463.field5904 > 2) {
            var2 = class425.method2255((class145) class1.field7.field541.field4196.field4196, 125);
        } else {
            class145 var3 = (class145) class1.field7.field541.field4196;
            var2 = class425.method2255(var3, 118);
            int[] var4 = null;
            if (class497.method2674(var3.field1873, (byte) 106)) {
                var4 = class633.field8881.method434(12388, (int) var3.field1865).field80;
            } else if (var3.field1866 != -1) {
                var4 = class633.field8881.method434(12388, var3.field1866).field80;
            } else if (class605.method3316(-1, var3.field1873)) {
                class206 var5 = (class206) class180.field2318.method399(-32748, (long) ((int) var3.field1865));
                if (var5 != null) {
                    class307 var6 = var5.field2618;
                    class586 var7 = var6.field3902;
                    if (var7.field8205 != null) {
                        var7 = var7.method3220(-4261, class684.field9606);
                    }
                    if (var7 != null) {
                        var4 = var7.field8200;
                    }
                }
            } else if (class556.method3060(var3.field1873, 21922)) {
                Object var8 = null;
                class441 var9;
                if (var3.field1873 == 1008) {
                    var9 = class428.field5352.method3138((byte) 45, (int) var3.field1865);
                } else {
                    var9 = class428.field5352.method3138((byte) 121, (int) (var3.field1865 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field5574 != null) {
                    var9 = var9.method2355(class684.field9606, arg0 ^ 0xFF00066A);
                }
                if (var9 != null) {
                    var4 = var9.field5510;
                }
            }
            if (var4 != null) {
                var2 = var2 + class531.method2880(var4, (byte) 126);
            }
        }
        if (arg0 != 16777215) {
            method3459(-120, null);
        }
        if (class463.field5904 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class463.field5904 - 2) + class83.field1133.method476((byte) -67, class250.field3068);
        }
        if (class214.field2655 != null) {
            class413 var10 = class214.field2655.method2741(arg1, arg0 ^ 0xFF001C3D);
            if (var10 == null) {
                var10 = class65.field889;
            }
            var10.method2190(class478.field6077, class214.field2655.field6700, class575.field8021, class214.field2655.field6843, class214.field2655.field6793, class181.field2323, var2, -125, class411.field5136, class454.field5822, class214.field2655.field6750, class304.field3747, class214.field2655.field6710, class553.field7702, class214.field2655.field6782);
            class51.method328(class411.field5136[2], class411.field5136[1], class411.field5136[3], (byte) 31, class411.field5136[0]);
        } else if (class44.field591 != null && class98.field1337 == class662.field9360) {
            int var11 = class65.field889.method2194(class304.field3747, class181.field2323, class478.field6077, class496.field6549 + 4, 16777215, class468.field5954 + 16, 0, var2, false, class553.field7702);
            class51.method328(class546.field7269.method3269((byte) 99, var2) + var11, class468.field5954, 16, (byte) 31, class496.field6549 + 4);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)I", line = 379)
    public final int method3460(byte arg0) {
        field8754++;
        if (arg0 != 3) {
            this.field8770 = false;
        }
        return this.field8768 == null ? 0 : this.field8768.length;
    }
}
