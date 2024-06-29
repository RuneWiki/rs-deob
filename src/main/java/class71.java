import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class71 {

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Ljg;")
    public static class272 field972 = new class272();

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public static int[] field975 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lsf;")
    public static class143 field974 = new class143(8);

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lfo;")
    public static class227 field973;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Lqj;")
    public static class238 field969;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZ)V", line = 7)
    public static final void method444(int arg0, int arg1, boolean arg2) {
        class451.field6578 = new byte[arg0][class324.field4652 + 1][class336.field4964 + arg1];
        class168.field2203 = 99;
        class436.field6402 = new int[class336.field4964];
        class300.field4296 = new byte[arg0][class324.field4652][class336.field4964];
        class31.field527 = new int[class336.field4964];
        class269.field3934 = new int[class336.field4964];
        class40.field639 = new byte[arg0][class324.field4652][class336.field4964];
        class405.field6089 = new int[class336.field4964];
        if (!arg2) {
            class193.field2750 = null;
        }
        class327.field4702 = new byte[arg0][class324.field4652][class336.field4964];
        class128.field1703 = new int[arg0][class324.field4652 + 1][class336.field4964 + 1];
        class176.field2310 = new int[5];
        field970++;
        class370.field5512 = new int[class336.field4964];
        class79.field1084 = new byte[arg0][class324.field4652][class336.field4964];
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 37)
    public static void method445(int arg0) {
        if (arg0 != 32) {
            field975 = null;
        }
        field974 = null;
        field972 = null;
        field975 = null;
        field969 = null;
        field973 = null;
    }
}
