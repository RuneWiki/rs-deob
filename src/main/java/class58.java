import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class58 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lve;")
    public static class255 field892 = class87.method607(31, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lve;")
    private static class255 field889 = class87.method607(108, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "Lve;")
    public static class255 field893 = class87.method607(89, "http:)4)4");

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lve;")
    public static class255 field882 = field889;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 15)
    public static void method352(byte arg0) {
        if (arg0 == -35) {
            field893 = null;
            field889 = null;
            field892 = null;
            field882 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Ltl;", line = 32)
    public static final class197 method353(int arg0, byte arg1) {
        int var2 = -84 / ((arg1 + 68) / 36);
        field883++;
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class297.field5087[var3] == null || class297.field5087[var3][var4] == null) {
            boolean var5 = class225.method1570((byte) -96, var3);
            if (!var5) {
                return null;
            }
        }
        return class297.field5087[var3][var4];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 58)
    public static final void method354(int arg0) {
        if (arg0 != 284750128) {
            return;
        }
        field881++;
        class10.field148.method553(117);
        class95.field1638.method553(112);
        class25.field383.method553(-14);
        class217.field3682.method553(-101);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)I", line = 76)
    public static final int method355(boolean arg0, int arg1) {
        field891++;
        if (arg0) {
            field885 = 34;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)Lwg;", line = 87)
    public static final class277 method356(byte arg0, int arg1) {
        field890++;
        if (arg0 <= 32) {
            field892 = (class255) null;
        }
        class277 var2 = (class277) class72.field1186.method558((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field102.method636(1, (byte) 87, arg1);
        class277 var4 = new class277();
        if (var3 != null) {
            var4.method1939(arg1, new class70(var3), true);
        }
        class72.field1186.method555(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 116)
    public static final void method357(boolean arg0) {
        field884++;
        class148.field2502.method554(0);
        if (!arg0) {
            method358((byte) -54, (class197) null);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLtl;)V", line = 127)
    public static final void method358(byte arg0, class197 arg1) {
        field887++;
        class197 var2 = class264.method1840(arg1, (byte) 72);
        int var3 = 103 % ((42 - arg0) / 55);
        int var4;
        int var5;
        if (var2 == null) {
            var5 = class210.field3589;
            var4 = class201.field3479;
        } else {
            var4 = var2.field3253;
            var5 = var2.field3294;
        }
        class97.method767(arg1, false, (byte) 10, var5, var4);
        class82.method566(arg1, var5, var4, 112);
    }
}
