import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class490 extends class264 {

    @OriginalMember(owner = "client!nt", name = "Q", descriptor = "I")
    private int field6911 = 10;

    @OriginalMember(owner = "client!nt", name = "ab", descriptor = "I")
    private int field6921 = 2048;

    @OriginalMember(owner = "client!nt", name = "cb", descriptor = "I")
    private int field6923 = 0;

    @OriginalMember(owner = "client!nt", name = "O", descriptor = "Lrc;")
    public static class108 field6909 = new class108(41, 12);

    @OriginalMember(owner = "client!nt", name = "N", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!nt", name = "P", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!nt", name = "R", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!nt", name = "T", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!nt", name = "W", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!nt", name = "X", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!nt", name = "Y", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!nt", name = "Z", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!nt", name = "bb", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!nt", name = "V", descriptor = "Lrc;")
    public static class108 field6916;

    @OriginalMember(owner = "client!nt", name = "S", descriptor = "[I")
    private int[] field6913;

    @OriginalMember(owner = "client!nt", name = "U", descriptor = "[I")
    private int[] field6915;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)V", line = 4)
    private final void method2872(byte arg0) {
        ++field6920;
        this.field6915 = new int[this.field6911 + 1];
        int var2 = 0;
        this.field6913 = new int[this.field6911 - -1];
        int var3 = 4096 / this.field6911;
        int var4 = this.field6921 * var3 >> 12;
        if (arg0 <= 99) {
            this.method95(-23);
        }
        for (int var5 = 0; this.field6911 > var5; ++var5) {
            this.field6913[var5] = var2;
            this.field6915[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field6913[this.field6911] = 4096;
        this.field6915[this.field6911] = this.field6915[0] + 4096;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLld;)I", line = 40)
    public static final int method2873(byte arg0, class73 arg1) {
        ++field6908;
        if (arg0 < 21) {
            return -26;
        } else {
            String var2 = class25.method173(31230, arg1);
            int[] var3 = null;
            if (class367.method2243((byte) -70, arg1.field1048)) {
                var3 = class373.field5128.method1644((int) arg1.field1055, 86).field2158;
            } else if (~arg1.field1047 == 0) {
                if (!class480.method2835(arg1.field1048, 116)) {
                    if (class264.method1784((byte) 121, arg1.field1048)) {
                        Object var4 = null;
                        class267 var5;
                        if (arg1.field1048 != 1001) {
                            var5 = class468.field6599.method506(-124, (int) (2147483647L & arg1.field1055 >>> 32));
                        } else {
                            var5 = class468.field6599.method506(-120, (int) arg1.field1055);
                        }
                        if (var5.field3846 != null) {
                            var5 = var5.method1799(class416.field5691, (byte) -111);
                        }
                        if (var5 != null) {
                            var3 = var5.field3864;
                        }
                    }
                } else {
                    class361 var6 = class163.field2377[(int) arg1.field1055];
                    if (var6 != null) {
                        class37 var7 = var6.field4952;
                        if (var7.field434 != null) {
                            var7 = var7.method232(class416.field5691, -1);
                        }
                        if (var7 != null) {
                            var3 = var7.field416;
                        }
                    }
                }
            } else {
                var3 = class373.field5128.method1644(arg1.field1047, 115).field2158;
            }
            if (var3 != null) {
                var2 = var2 + class401.method2415(var3, 947);
            }
            int var8 = class402.field5516.method1352(var2, class387.field5303, (byte) 87);
            if (arg1.field1052) {
                var8 += class294.field4151.method1293() - -4;
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLkk;I)V", line = 116)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field6914;
        if (arg0 > 31) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field6923 = arg1.method1172((byte) 90);
                    }
                } else {
                    this.field6921 = arg1.method1134(-16848);
                }
            } else {
                this.field6911 = arg1.method1172((byte) -125);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "(I)Z", line = 163)
    public static final boolean method2874(int arg0) {
        ++field6917;
        if (arg0 <= 89) {
            method2875(-17);
        }
        return class92.field1302;
    }

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "(I)V", line = 174)
    public static void method2875(int arg0) {
        if (arg0 >= 63) {
            field6909 = null;
            field6916 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V", line = 337)
    public class490() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "(I)V", line = 193)
    public final void method95(int arg0) {
        if (arg0 == -8) {
            ++field6912;
            this.method2872((byte) 102);
        }
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(BI)V", line = 210)
    public static final void method2876(byte arg0, int arg1) {
        if (arg0 > -2) {
            field6916 = null;
        }
        ++field6910;
        class225.field3249.method2120((byte) -71, arg1);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)[I", line = 221)
    public final int[] method90(int arg0, int arg1) {
        ++field6918;
        if (arg1 != 21034) {
            this.method95(27);
        }
        int[] var3 = super.field3808.method958((byte) 22, arg0);
        if (super.field3808.field1732) {
            int var4 = class379.field5216[arg0];
            if (~this.field6923 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~this.field6911 < ~var6; ++var6) {
                    if (~var4 <= ~this.field6913[var6] && this.field6913[var6 + 1] > var4) {
                        if (~var4 > ~this.field6915[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class214.method1452(var3, 0, class478.field6792, var5);
            } else {
                for (int var7 = 0; class478.field6792 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class151.field2084[var7];
                    int var11 = this.field6923;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = 2048 - -(var4 - (4096 - var10) >> 1);
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field6911 < ~var12; ++var12) {
                        if (~this.field6913[var12] >= ~var8 && var8 < this.field6913[var12 + 1]) {
                            if (~var8 > ~this.field6915[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }
}
