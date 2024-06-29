import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class687 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lsb;")
    public static class266 field9730 = new class266(6, 5);

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Ljava/lang/String;")
    public static String field9733 = null;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Lsb;")
    public static class266 field9732 = new class266(56, -1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field9726;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public int field9727;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public int field9728;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field9729;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field9731;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)I")
    public static final int method3860(byte arg0, int arg1) {
        int var2 = ((arg1 & 0xAAAAAAAA) >>> 1) + (arg1 & 0x55555555);
        field9731++;
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0xB3333333);
        if (arg0 > -110) {
            return 113;
        } else {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method3861(int arg0) {
        field9730 = null;
        if (arg0 == -16801) {
            field9733 = null;
            field9732 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Llk;II)I")
    public static final int method3862(class545 arg0, int arg1, int arg2) {
        field9725++;
        if (!client.method1825(arg0).method3527(arg2, 1776287617) && arg0.field7736 == null) {
            return -1;
        } else {
            if (arg1 != 10579) {
                field9732 = null;
            }
            return arg0.field7611 == null || arg0.field7611.length <= arg2 ? -1 : arg0.field7611[arg2];
        }
    }
}
