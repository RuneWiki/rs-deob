import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class287 extends class264 {

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    private int field4834 = 4096;

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
    private int field4842 = 0;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "I")
    public static int field4838 = 0;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "Lma;")
    public static class5 field4832 = class12.method119(" <col=00ff80>", (byte) 108);

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "[I")
    public static int[] field4839 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "[I")
    public static int[] field4836;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I", line = 10)
    public final int[] method5(int arg0, int arg1) {
        int[] var3 = this.field4501.method1176(arg1, 126);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, -82);
            for (int var5 = 0; var5 < class226.field3716; var5++) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field4842 && this.field4834 >= var6 ? 4096 : 0;
            }
        }
        if (arg0 >= -58) {
            method1933((byte) -37);
        }
        field4833++;
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lma;BIII)V", line = 41)
    public static final void method1932(class5 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4841++;
        if (arg1 > -61) {
            return;
        }
        class253 var5 = class282.method1911(arg4, arg2, -16037);
        if (var5 == null) {
            return;
        }
        if (var5.field4329 != null) {
            class256 var6 = new class256();
            var6.field4383 = arg3;
            var6.field4372 = var5.field4329;
            var6.field4373 = arg0;
            var6.field4382 = var5;
            class12.method122(var6, (byte) -117);
        }
        boolean var7 = true;
        if (var5.field4238 > 0) {
            var7 = class252.method1762((byte) -97, var5);
        }
        if (!var7 || !class151.method951(1, client.method767(var5), arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class24.field417++;
            class147.field2127.method1389((byte) -104, 175);
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 2) {
            class49.field763++;
            class147.field2127.method1389((byte) 117, 146);
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 3) {
            class147.field2127.method1389((byte) -85, 207);
            class176.field2689++;
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 4) {
            class137.field2034++;
            class147.field2127.method1389((byte) -8, 173);
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 5) {
            class123.field1862++;
            class147.field2127.method1389((byte) 103, 45);
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 6) {
            class155.field2291++;
            class147.field2127.method1389((byte) -102, 182);
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 7) {
            class251.field4155++;
            class147.field2127.method1389((byte) 111, 97);
            class147.field2127.method1513(arg4, false);
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 8) {
            class147.field2127.method1389((byte) 105, 0);
            class147.field2127.method1513(arg4, false);
            class104.field1546++;
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 9) {
            class147.field2127.method1389((byte) 124, 94);
            class147.field2127.method1513(arg4, false);
            class122.field1851++;
            class147.field2127.method1539(arg2, false);
        }
        if (arg3 == 10) {
            class147.field2127.method1389((byte) 19, 238);
            class147.field2127.method1513(arg4, false);
            class265.field4533++;
            class147.field2127.method1539(arg2, false);
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V", line = 170)
    public static final void method1933(byte arg0) {
        field4843++;
        class106.field1568.method522(73);
        if (arg0 < 98) {
            field4839 = (int[]) null;
        }
        class193.field2995.method522(79);
        class210.field3352.method522(91);
        class252.field4177.method522(76);
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 271)
    public class287() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V", line = 201)
    public static void method1934(byte arg0) {
        field4832 = null;
        field4839 = null;
        field4836 = null;
        if (arg0 >= -24) {
            method1937(-123);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILii;)V", line = 222)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg0 == 0) {
            this.field4842 = arg2.method1524((byte) 61);
        } else if (arg0 == 1) {
            this.field4834 = arg2.method1524((byte) 62);
        }
        if (arg1 > -27) {
            field4832 = (class5) null;
        }
        field4831++;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)Z", line = 249)
    public static final boolean method1935(int arg0, int arg1) {
        field4840++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class104.field1554[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return (short) arg1 == var2;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V", line = 282)
    public static final void method1936(boolean arg0) {
        class18.field309.method523(124);
        if (!arg0) {
            field4839 = (int[]) null;
        }
        class59.field926.method523(123);
        class37.field584.method523(127);
        field4835++;
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)V", line = 306)
    public static final void method1937(int arg0) {
        if (arg0 <= -111) {
            class249.field4123.method523(124);
            field4837++;
        }
    }
}
