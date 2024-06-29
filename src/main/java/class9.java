import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class11 {

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    private int field137 = 1024;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    private int field138 = 2048;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
    private int field142 = 3072;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "Ldi;")
    public static class83 field136 = new class83(43, -1);

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "Z")
    public static boolean field141 = false;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Ldi;")
    public static class83 field140 = new class83(9, 0);

    @OriginalMember(owner = "client!ff", name = "P", descriptor = "[I")
    public static int[] field144 = new int[32];

    @OriginalMember(owner = "client!ff", name = "R", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "client!ff", name = "S", descriptor = "Lwj;")
    public static class270 field147 = new class270(41, 1);

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)V")
    public static void method40(boolean arg0) {
        field144 = null;
        field140 = null;
        field147 = null;
        field136 = null;
        if (!arg0) {
            field141 = true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field143;
        int var3 = -117 / ((arg0 - -75) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(arg1, 0, 127);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; class90.field1316 > var12; ++var12) {
                var9[var12] = this.field137 - -(var6[var12] * this.field138 >> 12);
                var10[var12] = (var7[var12] * this.field138 >> 12) + this.field137;
                var11[var12] = (var8[var12] * this.field138 >> 12) + this.field137;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        ++field135;
        this.field138 = this.field142 - this.field137;
        if (!arg0) {
            this.method43((class391) null, 66, -104);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 >= -40) {
            this.method44(-95, -10);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field167 = arg0.method2348(-2) == 1;
                }
            } else {
                this.field142 = arg0.method2353((byte) 102);
            }
        } else {
            this.field137 = arg0.method2353((byte) 84);
        }
        ++field139;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field145;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            this.method41(98, -57);
        }
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 0, (byte) -79);
            for (int var5 = 0; var5 < class90.field1316; ++var5) {
                var3[var5] = (var4[var5] * this.field138 >> 12) + this.field137;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }
}
