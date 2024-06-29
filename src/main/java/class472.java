import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class472 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Z")
    public static boolean field6983 = true;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lrl;")
    public static class672 field6981 = new class672(44, 11);

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "[Ljw;")
    public static class515[] field6987 = new class515[8];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Ltd;")
    public static class419 field6988;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lkca;")
    public static class74 field6984;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2925(int arg0) {
        field6987 = null;
        field6988 = null;
        if (arg0 == 192) {
            field6981 = null;
            field6984 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILpca;)V")
    public static final void method2926(int arg0, class665 arg1) {
        field6985++;
        if (class299.field4680 == arg1.field9343) {
            if (class567.field8141.field4792 == null) {
                arg1.field9292 = 0;
                arg1.field9307 = 0;
            } else {
                arg1.field9350 = 150;
                arg1.field9381 = (int) (Math.sin((double) class562.field8084 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field9307 = class114.field1793;
                arg1.field9414 = 5;
                arg1.field9292 = class614.method3576(class567.field8141.field4792, arg0 + 9738);
                arg1.field9383 = class567.field8141.field4178;
                arg1.field9376 = class567.field8141.field4183;
                arg1.field9299 = 0;
                arg1.field9387 = class567.field8141.field4184;
                class428 var2 = arg1.field9376 == -1 ? null : class636.field8942.method2872((byte) 11, arg1.field9376);
                if (var2 != null) {
                    class204.method1577(arg1.field9387, var2, -84);
                }
            }
        } else if (arg0 != 3411) {
            method2926(29, null);
        }
    }
}
