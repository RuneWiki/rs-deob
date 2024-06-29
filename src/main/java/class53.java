import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class53 extends class105 {

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    private int field1103 = 4096;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    private int field1099 = 409;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "[I")
    private int[] field1098 = new int[3];

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    private int field1097 = 4096;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    private int field1107 = 4096;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "Lvf;")
    public static class265 field1095 = class87.method582(-46, "0");

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1101 = 0;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "Lch;")
    public static class117 field1105 = new class117();

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "Lvf;")
    private static class265 field1110 = class87.method582(-46, " more options");

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "Lvf;")
    public static class265 field1109 = field1110;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field1111 = 0;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method413(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg1 == 3) {
            ++field1104;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I")
    public static final int method414(int arg0, int arg1) {
        ++field1102;
        if ((arg1 < 65 || ~arg1 < -91) && (~arg1 > -193 || ~arg1 < -223 || ~arg1 == -216)) {
            if (~arg1 == -160) {
                return 255;
            } else {
                if (arg0 != 24962) {
                    method415((class192) null, 114, 34);
                }
                return ~arg1 == -141 ? 156 : arg1;
            }
        } else {
            return arg1 + 32;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        if (arg1 > -110) {
            this.method18(-23, (byte) -26);
        }
        ++field1094;
        int[][] var3 = super.field1870.method569((byte) 46, arg0);
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class94.field1668; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field1098[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field1099 < var13) {
                    var9[var11] = var12;
                    var8[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field1098[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field1099 < var15) {
                        var9[var11] = var12;
                        var8[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field1098[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field1099) {
                            var9[var11] = var12;
                            var8[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field1103 * var12 >> 12;
                            var8[var11] = this.field1107 * var14 >> 12;
                            var10[var11] = this.field1097 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lfl;II)Z")
    public static final boolean method415(class192 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1327(-18782, arg2);
        ++field1100;
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != 11465) {
                field1095 = null;
            }
            class262.method1755((byte) -67, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            method415((class192) null, -35, 35);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            int var5 = arg2.method909(arg1 + -917770607);
                            this.field1098[0] = class203.method1395(var5, 16711680) << 4;
                            this.field1098[2] = class203.method1395(0, var5 >> 12);
                            this.field1098[1] = class203.method1395(var5, 65280) >> 4;
                        }
                    } else {
                        this.field1103 = arg2.method927(arg1 + -130);
                    }
                } else {
                    this.field1107 = arg2.method927(arg1 + -130);
                }
            } else {
                this.field1097 = arg2.method927(126);
            }
        } else {
            this.field1099 = arg2.method927(125);
        }
        ++field1093;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method416(byte arg0) {
        field1110 = null;
        field1095 = null;
        field1105 = null;
        field1109 = null;
        if (arg0 != 109) {
            field1095 = null;
        }
    }
}
