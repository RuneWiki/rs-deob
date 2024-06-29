import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class198 extends class35 {

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Z")
    public boolean field2886 = false;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
    public int field2883 = -1;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "Z")
    public static boolean field2892 = false;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "[I")
    public static int[] field2881 = new int[13];

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field2894 = 0;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public int field2887;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
    public int field2896;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public int field2899;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "Ldp;")
    public static class174 field2885;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Lpo;")
    public static class202 field2893;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Z")
    public static boolean field2895;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZII)V", line = 6)
    public static final void method1508(boolean arg0, int arg1, int arg2) {
        field2897++;
        try {
            if (arg2 != 0 && arg0) {
                class73.field1235 = class150.method1161(class188.field2783, class33.field475, class196.field2873, 0, 0, -29623);
                class73.field1235.method706(0);
                class186 var3 = class110.method961(47, class228.field3346, class275.field4139, 0);
                class220 var4 = class73.field1235.method765(var3, class344.method2211(class100.field1561, class228.field3346, 0), true);
                class30.method228(true, class117.field1851, var4, true);
                class73.field1235.method749();
                class58.method450(0);
            }
            class73.field1235 = class150.method1161(class188.field2783, class33.field475, class196.field2873, arg2, class319.field4614 * 2, -29623);
            if (class73.field1235.method763()) {
                class229 var5 = class73.field1235.method703(536870912);
                class73.field1235.method767(var5);
            }
        } catch (Throwable var7) {
            if (arg2 != 0) {
                arg2 = 0;
                class73.field1235 = class150.method1161(class188.field2783, class33.field475, class196.field2873, 0, 0, -29623);
            }
        }
        class288.field4303 = arg2;
        class109.method956((byte) 67);
        if (!class73.field1235.method683()) {
            class150.field2300 = 1;
        }
        class73.field1235.method732(class150.field2300);
        class73.field1235.method758(0);
        class293.field4355 = class73.field1235.method748();
        field2893 = class73.field1235.method748();
        if (arg1 != -26411) {
            field2892 = false;
        }
        int var6 = (int) ((double) class183.field2703 * 34.46D);
        if (class73.field1235.method668()) {
            var6 += 128;
        }
        class73.field1235.method738(50, var6);
        class73.field1235.method714(!class110.field1793);
        if (class73.field1235.method716()) {
            class378.method2399((byte) 120, class13.field220);
        }
        class237.field3415 = !class122.method1034(24037);
        class122.method1028(arg1 + 26409, class66.field1056 >> 3, class183.field2703 >> 3, class73.field1235);
        class287.method2024(79);
        class196.field2870 = false;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I", line = 80)
    public static final int method1509(int arg0, int arg1) {
        field2890++;
        return arg1 <= 88 ? 87 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 98)
    public static void method1510(int arg0) {
        field2893 = null;
        field2881 = null;
        if (arg0 != 128) {
            field2892 = true;
        }
        field2885 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V", line = 209)
    public class198(int arg0) {
        this.field2883 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILmb;I)I", line = 121)
    public static final int method1511(int arg0, class258 arg1, int arg2) {
        if (arg0 != -1) {
            return 83;
        }
        field2880++;
        if (!client.method1815(arg1).method2617(arg2, 6) && arg1.field3831 == null) {
            return -1;
        } else if (arg1.field3824 == null || arg1.field3824.length <= arg2) {
            return -1;
        } else {
            return arg1.field3824[arg2];
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V", line = 145)
    public static final void method1512(int arg0) {
        field2884++;
        class371.field5247 = 0;
        class176.field2619 = 0;
        class254.method1842(0);
        class364.method2328((byte) -83);
        class122.method1032((byte) -120);
        int var1 = -87 % ((66 - arg0) / 54);
        class20.method138(0);
        for (int var2 = 0; var2 < class371.field5247; var2++) {
            int var4 = class336.field4806[var2];
            if (class267.field4002 != class367.field5225[var4].field5627) {
                if (class367.field5225[var4].field2062 > 0) {
                    class331.method2170(class367.field5225[var4], (byte) -105);
                }
                class367.field5225[var4] = null;
            }
        }
        if (class51.field824 != class268.field4020.field565) {
            throw new RuntimeException("gpp1 pos:" + class268.field4020.field565 + " psize:" + class51.field824);
        }
        for (int var3 = 0; var3 < class21.field317; var3++) {
            if (class367.field5225[class75.field1290[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class21.field317);
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BI)V", line = 195)
    public static final void method1513(byte arg0, int arg1) {
        int var2 = 64 / ((12 - arg0) / 50);
        field2882++;
        class373.field5295 = arg1;
        class243.field3541 = -1;
        class243.field3541 = -1;
        class441.method2748(-42);
    }
}
