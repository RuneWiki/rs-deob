import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class109 extends class272 {

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field1966 = 4096;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Lgf;")
    public static class7 field1964 = new class7(64);

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "Lli;")
    public static class185 field1969 = class245.method1649("Poser", 125);

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lli;")
    public static class185 field1970 = class245.method1649("(U0a )2 non)2existant gosub script)2num: ", 122);

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field1971 = -1;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "Lli;")
    public static class185 field1972 = class245.method1649("welle2:", -51);

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Lli;")
    public static class185 field1973 = class245.method1649("Chargement du module texte )2 ", -98);

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        int var4 = 54 / ((-21 - arg1) / 55);
        ++field1962;
        if (arg2 == 0) {
            this.field1966 = arg0.method827(255);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class109() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1965;
        int[] var3 = super.field4819.method1632(arg1 ^ arg1, arg0);
        if (super.field4819.field4294) {
            int[] var4 = this.method1866(class99.field1826 & arg0 + -1, 0, arg1 + -4304);
            int[] var5 = this.method1866(arg0, 0, arg1 + -4341);
            int[] var6 = this.method1866(class99.field1826 & arg0 - -1, 0, 109);
            for (int var7 = 0; ~var7 > ~class246.field4385; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1966;
                int var9 = (var5[var7 + 1 & class59.field1037] - var5[var7 - 1 & class59.field1037]) * this.field1966;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(Z)V")
    public static void method767(boolean arg0) {
        if (arg0) {
            method767(true);
        }
        field1973 = null;
        field1969 = null;
        field1972 = null;
        field1964 = null;
        field1970 = null;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)Ldh;")
    public static final class141 method768(int arg0, int arg1) {
        ++field1963;
        int var2 = 104 / ((arg1 - -31) / 58);
        class141 var3 = (class141) class105.field1891.method1615(-28166, (long) arg0);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class44.field703.method1688(0, arg0, 26);
            class141 var5 = new class141();
            if (var4 != null) {
                var5.method1012(new class118(var4), (byte) 47);
            }
            class105.field1891.method1620(var5, (byte) 49, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILhi;)V")
    public static final void method769(int arg0, class250 arg1) {
        class13.field232 = arg1.method1694(class263.field4674, arg0 ^ -3222);
        class119.field2172 = arg1.method1694(class134.field2427, -2);
        class180.field3309 = arg1.method1694(class137.field2562, -2);
        ++field1968;
        class280.field4956 = arg1.method1694(class88.field1722, -2);
        if (arg0 == 3220) {
            class144.field2740 = arg1.method1694(class201.field3690, -2);
            class174.field3184 = arg1.method1694(class75.field1299, -2);
            class262.field4659 = arg1.method1694(class193.field3566, -2);
            class268.field4742 = arg1.method1694(class153.field2892, -2);
            class123.field2220 = arg1.method1694(class176.field3216, arg0 ^ -3222);
            class250.field4460 = arg1.method1694(class252.field4476, -2);
            class237.field4243 = arg1.method1694(class212.field3897, -2);
            class147.field2782 = arg1.method1694(class243.field4338, -2);
            class162.field3050 = arg1.method1694(class13.field236, -2);
            class193.field3559 = arg1.method1694(class1.field23, -2);
            class265.field4705 = arg1.method1694(class128.field2288, -2);
            class3.field70 = arg1.method1694(class118.field2167, -2);
            class45.field715 = arg1.method1694(class262.field4654, -2);
            class182.field3344 = arg1.method1694(class104.field1882, -2);
            class158.field2993 = arg1.method1694(class39.field622, arg0 + -3222);
        }
    }
}
