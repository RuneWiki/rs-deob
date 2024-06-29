import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class52 extends class259 {

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "I")
    private int field1171 = 4;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    private int field1170 = 4;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1161 = 0;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "I")
    public static int field1165 = 0;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lsg;")
    public static class30 field1168 = class167.method1221((byte) 33, "Ausw-=hlen");

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "Lb;")
    public static class48 field1163 = new class48();

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "Lsg;")
    public static class30 field1173 = class167.method1221((byte) 33, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1169;
        int var3 = 14 / ((-48 - arg0) / 42);
        int[][] var4 = super.field4568.method241(-88, arg1);
        if (super.field4568.field564) {
            int var5 = class94.field1911 / this.field1171;
            int var6 = class223.field3999 / this.field1170;
            int[][] var7;
            if (~var5 >= -1) {
                var7 = this.method1795(0, 2, 0);
            } else {
                int var8 = arg1 % var5;
                var7 = this.method1795(class94.field1911 * var8 / var5, 2, 0);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            int[] var14 = var4[0];
            for (int var15 = 0; var15 < class223.field3999; ++var15) {
                int var17;
                if (~var6 < -1) {
                    int var16 = var15 % var6;
                    var17 = class223.field3999 * var16 / var6;
                } else {
                    var17 = 0;
                }
                var14[var15] = var9[var17];
                var12[var15] = var10[var17];
                var13[var15] = var11[var17];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLmc;Lmc;Lie;Lmc;)Z")
    public static final boolean method514(byte arg0, class151 arg1, class151 arg2, class69 arg3, class151 arg4) {
        ++field1164;
        class24.field464 = arg2;
        class268.field4719 = arg4;
        if (arg0 <= 31) {
            field1172 = -1;
        }
        class151.field2874 = arg1;
        class168.field3108 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            field1168 = null;
        }
        ++field1166;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field1171 = arg2.method63((byte) 70);
            }
        } else {
            this.field1170 = arg2.method63((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class52() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lsg;IZLsg;Lsg;I)V")
    public static final void method515(class30 arg0, int arg1, boolean arg2, class30 arg3, class30 arg4, int arg5) {
        ++field1167;
        int var6 = 99;
        if (arg2) {
            field1163 = null;
        }
        while (~var6 < -1) {
            class20.field374[var6] = class20.field374[var6 + -1];
            class149.field2840[var6] = class149.field2840[var6 + -1];
            class86.field1772[var6] = class86.field1772[var6 + -1];
            class109.field2189[var6] = class109.field2189[var6 + -1];
            class205.field3674[var6] = class205.field3674[var6 + -1];
            --var6;
        }
        class20.field374[0] = arg5;
        class79.field1708 = class14.field308;
        class205.field3674[0] = arg1;
        ++class80.field1732;
        class149.field2840[0] = arg0;
        class86.field1772[0] = arg4;
        class109.field2189[0] = arg3;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method516(byte arg0) {
        field1173 = null;
        field1163 = null;
        int var1 = 11 % ((arg0 - -42) / 39);
        field1168 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field4581.method1841(18, arg0);
            if (super.field4581.field4729) {
                int var4 = class94.field1911 / this.field1171;
                int var5 = class223.field3999 / this.field1170;
                int[] var6;
                if (var4 <= 0) {
                    var6 = this.method1799(0, 0, 112);
                } else {
                    int var7 = arg0 % var4;
                    var6 = this.method1799(0, class94.field1911 * var7 / var4, 112);
                }
                for (int var8 = 0; ~class223.field3999 < ~var8; ++var8) {
                    if (~var5 < -1) {
                        int var9 = var8 % var5;
                        var3[var8] = var6[class223.field3999 * var9 / var5];
                    } else {
                        var3[var8] = var6[0];
                    }
                }
            }
            ++field1175;
            return var3;
        }
    }
}
