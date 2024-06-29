import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class199 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lcf;")
    public static class93 field3608 = class147.method1066("Schrifts-=tze geladen)3", -48);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3609 = 0;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lcf;")
    public static class93 field3613 = class147.method1066("::qa_op_test", -48);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lhg;")
    public static class177 field3616;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] field3611;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)Lkh;")
    public static final class45 method1425(int arg0, int arg1) {
        field3614++;
        class45 var2 = (class45) class193.field3524.method302((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class6.field88.method1271(arg1, -2154, arg0);
        class45 var4 = new class45();
        if (var3 != null) {
            var4.method251(new class280(var3), (byte) 27);
        }
        class193.field3524.method297((long) arg0, var4, arg1 ^ 0x28AD);
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1426(int arg0) {
        if (arg0 != 25996) {
            field3608 = null;
        }
        field3608 = null;
        field3611 = null;
        field3616 = null;
        field3613 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
    public static final void method1427(byte arg0, int arg1) {
        field3610++;
        class253.field4549--;
        if (class253.field4549 == arg1) {
            return;
        }
        class107.method769(class228.field4089, arg1 + 1, class228.field4089, arg1, class253.field4549 - arg1);
        class107.method769(class86.field1553, arg1 + 1, class86.field1553, arg1, class253.field4549 - arg1);
        class107.method768(class214.field3911, arg1 + 1, class214.field3911, arg1, class253.field4549 - arg1);
        int var2 = 83 % ((15 - arg0) / 48);
        class107.method772(class216.field3942, arg1 + 1, class216.field3942, arg1, class253.field4549 - arg1);
        class107.method774(class73.field1319, arg1 + 1, class73.field1319, arg1, class253.field4549 - arg1);
        class107.method768(class38.field586, arg1 + 1, class38.field586, arg1, class253.field4549 - arg1);
        class107.method768(class168.field2963, arg1 + 1, class168.field2963, arg1, class253.field4549 - arg1);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
    public static final int method1428(int arg0, int arg1) {
        field3615++;
        if (arg1 != -1407770776) {
            method1426(-108);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILee;)Lte;")
    public static final class77 method1429(int arg0, class280 arg1) {
        int var2 = 58 % ((arg0 + 39) / 33);
        field3612++;
        return new class77(arg1.method1914((byte) 101), arg1.method1914((byte) 86), arg1.method1914((byte) 116), arg1.method1914((byte) 71), arg1.method1893((byte) -92), arg1.method1907(16832));
    }
}
