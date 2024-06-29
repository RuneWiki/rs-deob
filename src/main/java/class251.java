import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class251 {

    @OriginalMember(owner = "client!om", name = "d", descriptor = "J")
    public static long field3590 = -1L;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Lvr;")
    public static final class89 method1617(byte arg0) {
        class232.field3390 = 0;
        field3588++;
        if (arg0 != 54) {
            field3590 = 110L;
        }
        return class170.method1248(arg0 ^ 0x3F0C);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public static final void method1618(int arg0, int arg1) {
        int var2 = 112 % ((arg0 + 84) / 36);
        if (class288.field4106 == null || arg1 > class288.field4106.length) {
            class288.field4106 = new int[arg1];
        }
        field3587++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[B")
    public static final synchronized byte[] method1619(int arg0, int arg1) {
        field3589++;
        if (arg0 == arg1 && class479.field7138 > 0) {
            byte[] var2 = class352.field5393[--class479.field7138];
            class352.field5393[class479.field7138] = null;
            return var2;
        } else if (arg0 == 5000 && class252.field3604 > 0) {
            byte[] var3 = class374.field5668[--class252.field3604];
            class374.field5668[class252.field3604] = null;
            return var3;
        } else if (arg0 == 30000 && class106.field1768 > 0) {
            byte[] var4 = class195.field2868[--class106.field1768];
            class195.field2868[class106.field1768] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
    public static final boolean method1620(int arg0, int arg1, int arg2) {
        if (arg2 != 1794) {
            method1620(66, -60, 102);
        }
        field3591++;
        return (arg1 & 0x20) != 0;
    }
}
