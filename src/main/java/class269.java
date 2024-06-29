import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class269 extends class83 {

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public int field4337;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4338 = 0;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[I")
    public static int[] field4343 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static final void method1766(boolean arg0) {
        field4340++;
        if (arg0) {
            field4343 = null;
        }
        if (class96.field1653) {
            return;
        }
        if (class173.field2852) {
            class106.field1900 = (float) ((int) class106.field1900 + 191 & 0xFFFFFF80);
        } else {
            class68.field1125 += (24.0F - class68.field1125) / 2.0F;
        }
        class114.field2059 = true;
        class96.field1653 = true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public static final void method1767(int arg0, int arg1) {
        class196.field3161 = 3;
        field4341++;
        if (arg1 != 302) {
            method1766(true);
        }
        class203.field3324 = arg0;
        class168.field2787 = 20;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLsa;Z)V")
    public static final void method1768(boolean arg0, class244 arg1, boolean arg2) {
        if (arg2) {
            int var3 = class4.field38;
            int var4 = var3 * 956 / 503;
            class67.field1116.method455((class267.field4324 - var4) / 2, 0, var4, var3);
            class178.field2933.method631(class267.field4324 / 2 - (class178.field2933.field1711 / 2), 18);
        }
        arg1.method1623(class105.field1862, class267.field4324 / 2, class4.field38 / 2 - 26, 16777215, -1);
        field4339++;
        int var5 = class4.field38 / 2 - 18;
        class283.method1846(class267.field4324 / 2 - 152, var5, 304, 34, 9179409);
        class283.method1846(class267.field4324 / 2 - 151, var5 - -1, 302, 32, 0);
        if (arg0) {
            field4343 = null;
        }
        class283.method1855(class267.field4324 / 2 - 150, var5 + 2, class83.field1507 * 3, 30, 9179409);
        class283.method1855(class267.field4324 / 2 + class83.field1507 * 3 - 150, var5 + 2, 300 - (class83.field1507 * 3), 30, 0);
        arg1.method1623(class272.field4372, class267.field4324 / 2, class4.field38 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        field4343 = null;
        if (arg0 != 45) {
            method1768(false, (class244) null, true);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(II)V")
    public class269(int arg0, int arg1) {
        this.field4337 = arg1;
        this.field4342 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static final void method1770(byte arg0) {
        class198.field3198.method53(true);
        if (arg0 > -37) {
            method1766(false);
        }
        class30.field442.method53(true);
        field4336++;
    }
}
