import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class273 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "J")
    public long field4781 = 0L;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Leg;")
    public static class37 field4787 = class174.method1167("Titelbild geladen)3", 78);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lgj;")
    public static class247 field4778 = new class247(5000);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Leg;")
    public static class37 field4789 = class174.method1167("(U0a )2 non)2existant gosub script)2num: ", 70);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lbf;")
    public static class202 field4790 = new class202(50);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Leg;")
    public static class37 field4798 = class174.method1167("k", 62);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lbf;")
    public static class202 field4796 = new class202(5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field4783;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field4786;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lme;")
    public class67 field4780;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lme;")
    public class67 field4791;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZLpe;I)V")
    public static final void method1825(int arg0, boolean arg1, class237 arg2, int arg3) {
        if (arg2.field4086 == 0) {
            arg2.field4074 = arg2.field4072;
        } else if (arg2.field4086 == 1) {
            arg2.field4074 = (arg3 - arg2.field4206) / 2 + arg2.field4072;
        } else if (arg2.field4086 == 2) {
            arg2.field4074 = arg3 - arg2.field4072 - arg2.field4206;
        } else if (arg2.field4086 == 3) {
            arg2.field4074 = arg2.field4072 * arg3 >> 14;
        } else if (arg2.field4086 == 4) {
            arg2.field4074 = (arg2.field4072 * arg3 >> 14) + (arg3 - arg2.field4206) / 2;
        } else {
            arg2.field4074 = arg3 - arg2.field4206 - (arg2.field4072 * arg3 >> 14);
        }
        field4776++;
        if (arg1) {
            field4789 = null;
        }
        if (arg2.field4222 == 0) {
            arg2.field4183 = arg2.field4185;
        } else if (arg2.field4222 == 1) {
            arg2.field4183 = (arg0 - arg2.field4067) / 2 + arg2.field4185;
        } else if (arg2.field4222 == 2) {
            arg2.field4183 = arg0 - arg2.field4185 - arg2.field4067;
        } else if (arg2.field4222 == 3) {
            arg2.field4183 = arg2.field4185 * arg0 >> 14;
        } else if (arg2.field4222 == 4) {
            arg2.field4183 = (arg2.field4185 * arg0 >> 14) + (arg0 - arg2.field4067) / 2;
        } else {
            arg2.field4183 = arg0 - arg2.field4067 - (arg2.field4185 * arg0 >> 14);
        }
        if (!class126.field2117 || client.method787(arg2) == 0 && arg2.field4228 != 0) {
            return;
        }
        if (arg2.field4074 < 0) {
            arg2.field4074 = 0;
        } else if (arg2.field4206 + arg2.field4074 > arg3) {
            arg2.field4074 = arg3 - arg2.field4206;
        }
        if (arg2.field4183 < 0) {
            arg2.field4183 = 0;
        } else if ((arg2.field4183 + arg2.field4067) > arg0) {
            arg2.field4183 = arg0 - arg2.field4067;
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method1826(byte arg0) {
        field4793++;
        if (class36.field529 != null) {
            class36.field529.method931(-6387);
        }
        if (arg0 >= -13) {
            field4794 = -39;
        }
        if (class61.field1000 != null) {
            class61.field1000.method931(-6387);
        }
        class204.method1420(class144.field2467, 22050, 23288, 2);
        class36.field529 = class254.method1736(class93.field1466, 0, class177.field2957, 22050, (byte) 60);
        class36.field529.method937(16883, class281.field4952);
        class61.field1000 = class254.method1736(class93.field1466, 1, class177.field2957, 2048, (byte) 60);
        class61.field1000.method937(16883, class127.field2127);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
    public static final void method1827(int arg0, int arg1) {
        field4779++;
        class274 var2 = class166.method1116(1, arg1, true);
        var2.method1840(10000);
        if (arg0 <= 52) {
            method1831((byte) 17);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjl;)V")
    public static final void method1828(int arg0, class101 arg1) {
        field4788++;
        class159.field2659 = arg1.method652(class159.field2657, 125);
        if (arg0 != 4234) {
            field4794 = -41;
        }
        class172.field2894 = arg1.method652(class156.field2609, 107);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljl;BLjl;)V")
    public static final void method1829(class101 arg0, byte arg1, class101 arg2) {
        class169.field2820 = arg2;
        class231.field3970 = arg0;
        if (arg1 == 87) {
            field4782++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lkf;")
    public static final class92 method1830(int arg0, byte arg1) {
        field4797++;
        class92 var2 = (class92) class208.field3521.method1411(-45, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class169.field2825.method666(arg0, 3, (byte) -51);
        if (arg1 < 69) {
            field4798 = null;
        }
        class92 var4 = new class92();
        if (var3 != null) {
            var4.method604(2657, new class187(var3));
        }
        class208.field3521.method1404((long) arg0, false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static void method1831(byte arg0) {
        field4778 = null;
        field4789 = null;
        field4796 = null;
        field4790 = null;
        field4798 = null;
        if (arg0 == 2) {
            field4787 = null;
        }
    }
}
