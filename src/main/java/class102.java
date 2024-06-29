import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class102 extends class276 {

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    private int field1793 = 4096;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public static int field1792 = -1;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1791 = "Discard";

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
    public static int[] field1798 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class102() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
    public static void method700(byte arg0) {
        if (arg0 > 119) {
            field1791 = null;
            field1798 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field1794;
        if (arg0 <= 39) {
            method700((byte) 78);
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, class125.field2189 & arg1 + -1);
            int[] var5 = this.method1805(false, 0, arg1);
            int[] var6 = this.method1805(false, 0, arg1 - -1 & class125.field2189);
            for (int var7 = 0; class53.field929 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1793;
                int var9 = (var5[class35.field504 & var7 + 1] + -var5[class35.field504 & var7 - 1]) * this.field1793;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            this.method23(-74, 64);
        }
        if (arg0 == 0) {
            this.field1793 = arg1.method677(false);
        }
        ++field1799;
    }
}
