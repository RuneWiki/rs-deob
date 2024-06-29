import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class296 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lqd;")
    public static class40 field4945 = class147.method1106("Opened titlescreen)3", (byte) -66);

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lqd;")
    public static class40 field4953 = class147.method1106(")4p=", (byte) -106);

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field4950 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field4952 = 0;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lqd;")
    public static class40 field4954 = class147.method1106("showingVideoAd", (byte) -105);

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lab;")
    public static class141 field4949;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JB)V", line = 52)
    public static final void method2023(long arg0, byte arg1) {
        if (arg1 != 35) {
            field4950 = 74;
        }
        field4955++;
        class19.field295.field478 = 0;
        class19.field295.method218(238, arg1 ^ 0xFFFFB215);
        class19.field295.method241(arg0, arg1 ^ 0x5F);
        class272.field4520 = 1;
        class193.field3116 = 0;
        class194.field3125 = 0;
        class189.field3069 = -3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 81)
    public static void method2024(byte arg0) {
        field4945 = null;
        field4954 = null;
        field4953 = null;
        if (arg0 > -52) {
            field4949 = (class141) null;
        }
        field4949 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLrb;)Z", line = 239)
    public static final boolean method2025(boolean arg0, class213 arg1) {
        field4947++;
        if (arg1.field3472 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            for (int var2 = 0; var2 < arg1.field3472.length; var2++) {
                int var3 = class208.method1472(var2, arg1, true);
                int var4 = arg1.field3508[var2];
                if (arg1.field3472[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field3472[var2] == 3) {
                    if (var4 >= var3) {
                        return false;
                    }
                } else if (arg1.field3472[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I", line = 378)
    public static final int method2026(int arg0, int arg1) {
        field4951++;
        if (class140.field2369 != null) {
            class140.field2369.method784(91);
            class140.field2369 = null;
        }
        class92.field1665++;
        if (class92.field1665 > 4) {
            class92.field1665 = 0;
            class217.field3624 = 0;
            return arg1;
        }
        if (class92.field1670 == class315.field5341) {
            class92.field1670 = class103.field1806;
        } else {
            class92.field1670 = class315.field5341;
        }
        class217.field3624 = arg0;
        return -1;
    }
}
