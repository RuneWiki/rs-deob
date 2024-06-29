import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class137 extends class287 {

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Ltl;")
    public static class59 field2262 = class85.method639("Nehmen", 9588);

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "J")
    public long field2264;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lre;")
    public class137 field2258;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lre;")
    public class137 field2263;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 12)
    public static void method996(byte arg0) {
        if (arg0 < -85) {
            field2262 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V", line = 23)
    public final void method997(int arg0) {
        field2266++;
        int var2 = 77 % ((arg0 - 65) / 50);
        if (this.field2258 != null) {
            this.field2258.field2263 = this.field2263;
            this.field2263.field2258 = this.field2258;
            this.field2258 = null;
            this.field2263 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILch;BI)V", line = 41)
    public static final void method998(int arg0, class102 arg1, byte arg2, int arg3) {
        field2257++;
        if (arg1.field1737 == arg3 && arg3 != -1) {
            class129 var4 = class265.method1834((byte) -39, arg3);
            int var5 = var4.field2140;
            if (var5 == 1) {
                arg1.field1781 = 0;
                arg1.field1789 = 0;
                arg1.field1786 = arg0;
                arg1.field1721 = 0;
                class29.method182(arg2 ^ 0xFFF94, class286.field4920 == arg1, arg1.field1774, var4, arg1.field1781, arg1.field1769);
            }
            if (var5 == 2) {
                arg1.field1721 = 0;
            }
        } else if (arg3 == -1 || arg1.field1737 == -1 || class265.method1834((byte) -39, arg3).field2111 >= class265.method1834((byte) -39, arg1.field1737).field2111) {
            arg1.field1786 = arg0;
            arg1.field1779 = arg1.field1790;
            arg1.field1789 = 0;
            arg1.field1721 = 0;
            arg1.field1781 = 0;
            arg1.field1737 = arg3;
            if (arg1.field1737 != -1) {
                class29.method182(1048575, class286.field4920 == arg1, arg1.field1774, class265.method1834((byte) -39, arg1.field1737), arg1.field1781, arg1.field1769);
            }
        }
        if (arg2 != 107) {
            method996((byte) 119);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V", line = 92)
    public static final void method999(int arg0, boolean arg1) {
        field2265++;
        if (!class253.method1764(arg0, 0)) {
            return;
        }
        class263[] var2 = class239.field3986[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class263 var4 = var2[var3];
            if (var4 != null) {
                var4.field4431 = 0;
                var4.field4394 = 0;
            }
        }
        if (arg1) {
            field2260 = 25;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLma;)Z", line = 141)
    public static final boolean method1000(boolean arg0, class263 arg1) {
        if (arg0) {
            field2260 = -93;
        }
        field2261++;
        if (arg1.field4472 == 205) {
            class56.field833 = 250;
            return true;
        } else {
            return false;
        }
    }
}
