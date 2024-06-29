import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class634 {

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field8940 = 0;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Llc;")
    public static class435 field8945 = new class435(92, 0);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field8947 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field8939;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field8941;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field8946;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lla;")
    public static class423 field8938;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lsu;")
    public static class588 field8944;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 3)
    public static final void method3629(int arg0, int arg1) {
        field8943++;
        int var2 = -94 / ((arg1 + 13) / 56);
        class503 var3 = class512.method3112(10, arg0, 0);
        var3.method3074(-118);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 16)
    public static final void method3630(int arg0, String arg1, byte arg2) {
        field8939++;
        class503 var3 = class512.method3112(2, arg0, 0);
        var3.method3075((byte) -109);
        var3.field7314 = arg1;
        if (arg2 > -97) {
            method3633((byte) -84);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method3631(int arg0, int arg1, int arg2) {
        field8946++;
        if (arg0 == 10) {
            return (arg2 & 0x100100) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)Z", line = 61)
    public static final boolean method3632(byte arg0, int arg1, int arg2) {
        if (arg0 != 80) {
            field8938 = null;
        }
        field8942++;
        return class679.method3859(arg1, arg2, arg0 ^ 0xFFFFFFAF) || class26.method116(-110, arg1, arg2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 72)
    public static void method3633(byte arg0) {
        field8938 = null;
        field8945 = null;
        field8944 = null;
        if (arg0 != -32) {
            method3633((byte) -46);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([II[J)V", line = 84)
    public static final void method3634(int[] arg0, int arg1, long[] arg2) {
        field8941++;
        class627.method3612(arg2, arg0, (byte) 85, arg2.length - 1, 0);
        if (arg1 >= -84) {
            field8947 = 114;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILci;)Lci;")
    public abstract class533 method80(int arg0, class533 arg1);
}
