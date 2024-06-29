import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class155 extends class287 {

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "[B")
    public byte[] field2529;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field2532 = 0;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static volatile int field2530 = 0;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "Ltl;")
    public static class59 field2541 = class85.method639("mem=", 9588);

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field2537 = -1;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Ltl;")
    public static class59 field2538 = class85.method639("Konfig geladen)3", 9588);

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Z")
    public static boolean field2542 = false;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Lhi;")
    public static class189 field2536;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Lme;")
    public static class295 field2535;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "[I")
    public static int[] field2539;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "([B)V", line = 7)
    public class155(byte[] arg0) {
        this.field2529 = arg0;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V", line = 24)
    public static void method1106(int arg0) {
        field2536 = null;
        field2538 = null;
        if (arg0 == -1) {
            field2539 = null;
            field2541 = null;
            field2535 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V", line = 44)
    public static final void method1107(boolean arg0) {
        if (!arg0) {
            method1106(-124);
        }
        field2543++;
        if (!class125.method922((byte) -126) && class291.field4986 != class247.field4119) {
            class303.method2107(false, class286.field4920.field1773[0], class286.field4920.field1729[0], (byte) 40, class294.field5017, class247.field4119, class187.field3127);
        } else if (class84.field1317 != class247.field4119) {
            class84.field1317 = class247.field4119;
            class88.method659(0, class247.field4119);
            class303.method2111(106);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)V", line = 78)
    public static final void method1108(byte arg0, int arg1, int arg2) {
        field2531++;
        if (class253.method1764(arg1, 0)) {
            int var3 = 119 / ((45 - arg0) / 44);
            class293.method2022(class239.field3986[arg1], 939, arg2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)J", line = 97)
    public static final long method1109(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        return var3 == null || var3.field4104 == null ? 0L : var3.field4104.field3606;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Z", line = 113)
    public static final boolean method1110(int arg0, int arg1) {
        if (arg1 == 0) {
            field2533++;
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }
}
