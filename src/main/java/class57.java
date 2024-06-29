import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class57 extends class1 {

    @OriginalMember(owner = "client!fa", name = "ub", descriptor = "I")
    private int field1151 = 4;

    @OriginalMember(owner = "client!fa", name = "vb", descriptor = "I")
    private int field1152 = 4;

    @OriginalMember(owner = "client!fa", name = "qb", descriptor = "[Loc;")
    public static class151[] field1147 = new class151[200];

    @OriginalMember(owner = "client!fa", name = "pb", descriptor = "Loc;")
    public static class151 field1146 = class137.method873(2, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!fa", name = "ib", descriptor = "I")
    public static int field1139 = 127;

    @OriginalMember(owner = "client!fa", name = "sb", descriptor = "I")
    public static int field1149 = 0;

    @OriginalMember(owner = "client!fa", name = "rb", descriptor = "Loc;")
    public static class151 field1148 = class137.method873(2, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!fa", name = "xb", descriptor = "[I")
    public static int[] field1154 = new int[50];

    @OriginalMember(owner = "client!fa", name = "lb", descriptor = "Loc;")
    public static class151 field1142 = class137.method873(2, "sch-Utteln:");

    @OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!fa", name = "kb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!fa", name = "mb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!fa", name = "nb", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!fa", name = "ob", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!fa", name = "tb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!fa", name = "wb", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!fa", name = "jb", descriptor = "Lpf;")
    public static class164 field1140;

    @OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lsd;")
    public static class192 field1137;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Lcj;")
    public static final class33 method383(int arg0, int arg1) {
        ++field1143;
        class33 var2 = (class33) class53.field1074.method1318((byte) -120, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class152.field2758.method1208(arg0, (byte) 36, 1);
            class33 var4 = new class33();
            if (arg1 != 0) {
                field1141 = 31;
            }
            if (var3 != null) {
                var4.method240(new class229(var3), arg0, arg1 + -122);
            }
            class53.field1074.method1324(var4, arg1 ^ 18373, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1152 = arg2.method1475(arg0 ^ 255);
            }
        } else {
            this.field1151 = arg2.method1475(255);
        }
        if (arg0 != 0) {
            method385(22);
        }
        ++field1153;
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Lpf;")
    public static final class164 method384(int arg0) {
        ++field1145;
        if (arg0 != 4) {
            return null;
        } else {
            try {
                return (class164) Class.forName("ge").newInstance();
            } catch (Throwable var1) {
                return new class44();
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1150;
        int[][] var3 = super.field13.method578(arg0, arg1 ^ 80);
        if (super.field13.field1658) {
            int var4 = class202.field3603 / this.field1151;
            int var5 = class129.field2354 / this.field1152;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method8(0, (byte) -90, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method8(0, (byte) 57, class129.field2354 * var7 / var5);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[1];
            int[] var12 = var3[0];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class202.field3603 < ~var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class202.field3603 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var12[var14] = var8[var16];
                var11[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        if (arg1 != -81) {
            method385(-124);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
    public static void method385(int arg0) {
        field1137 = null;
        field1142 = null;
        field1146 = null;
        field1154 = null;
        if (arg0 < 11) {
            field1142 = null;
        }
        field1147 = null;
        field1148 = null;
        field1140 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        if (arg0 != 107) {
            return null;
        } else {
            ++field1144;
            int[] var3 = super.field21.method1182(arg1, arg0 ^ -31672);
            if (super.field21.field3388) {
                int var4 = class202.field3603 / this.field1151;
                int var5 = class129.field2354 / this.field1152;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method4(0, arg0 ^ -21, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method4(class129.field2354 * var7 / var5, -114, 0);
                }
                for (int var8 = 0; ~var8 > ~class202.field3603; ++var8) {
                    if (~var4 >= -1) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class202.field3603 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class57() {
        super(1, false);
    }
}
