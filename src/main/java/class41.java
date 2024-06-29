import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class41 extends class43 {

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    private int field661 = 4096;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "Z")
    public static boolean field662 = false;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field660 = 7759444;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "Lmb;")
    public static class132 field663 = class166.method1092("Welt", 120);

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lmb;")
    public static class132 field665 = class166.method1092("T", 126);

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "Lq;")
    public static class174 field666;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field667;
        int[] var3 = super.field768.method1123(arg1 ^ arg1, arg0);
        if (super.field768.field3219) {
            int[] var4 = this.method300(arg1 ^ 106, 0, class185.field3423 & arg0 + -1);
            int[] var5 = this.method300(arg1 + -56, 0, arg0);
            int[] var6 = this.method300(54, 0, class185.field3423 & arg0 + 1);
            for (int var7 = 0; class131.field2427 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field661;
                int var9 = (var5[class90.field1593 & var7 + 1] - var5[var7 + -1 & class90.field1593]) * this.field661;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class41() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 == -1) {
            this.field661 = arg2.method739(-128);
        }
        if (arg1 == -73) {
            ++field664;
        }
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
    public static void method283(int arg0) {
        field665 = null;
        if (arg0 <= 32) {
            method283(94);
        }
        field666 = null;
        field663 = null;
    }
}
