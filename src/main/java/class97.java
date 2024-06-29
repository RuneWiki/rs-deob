import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class97 extends class45 {

    @OriginalMember(owner = "client!ct", name = "N", descriptor = "I")
    public static int field1621 = -1;

    @OriginalMember(owner = "client!ct", name = "I", descriptor = "Lrn;")
    public static class174 field1616 = new class174(41, 8);

    @OriginalMember(owner = "client!ct", name = "P", descriptor = "Lrn;")
    public static class174 field1623 = new class174(80, 6);

    @OriginalMember(owner = "client!ct", name = "M", descriptor = "F")
    public static float field1620;

    @OriginalMember(owner = "client!ct", name = "H", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ct", name = "L", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ct", name = "O", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field1618;
        if (arg0 != 8) {
            field1616 = null;
        }
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, -53);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class259.field3768; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method49(120, -109);
        }
        ++field1615;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, arg1, -100);
            for (int var5 = 0; class259.field3768 > var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(B)V")
    public static void method735(byte arg0) {
        if (arg0 != 17) {
            field1621 = 37;
        }
        field1623 = null;
        field1616 = null;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lbu;I)V")
    public static final void method736(class17 arg0, int arg1) {
        class127.field2029 = arg0.method136("titlebg", arg1 + -32479);
        ++field1622;
        class318.field4783 = arg0.method136("logo", 97);
        if (arg1 != 32591) {
            field1621 = 79;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IFFF)I")
    public static final int method737(int arg0, float arg1, float arg2, float arg3) {
        ++field1619;
        float var4 = !(arg2 < 0.0F) ? arg2 : -arg2;
        float var5 = !(arg1 < 0.0F) ? arg1 : -arg1;
        float var6 = !(arg3 < 0.0F) ? arg3 : -arg3;
        if (arg0 < 101) {
            field1621 = 0;
        }
        if (var4 < var5 && var5 > var6) {
            return !(arg1 > 0.0F) ? 1 : 0;
        } else if (var6 > var4 && var6 > var5) {
            return !(arg3 > 0.0F) ? 3 : 2;
        } else {
            return arg2 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field1617;
        if (arg1 != -26471) {
            field1621 = 5;
        }
        if (~arg2 == -1) {
            super.field844 = ~arg0.method1063((byte) -70) == -2;
        }
    }
}
