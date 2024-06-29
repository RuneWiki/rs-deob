import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class271 extends class73 {

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lli;")
    public static class185 field4808 = class245.method1649("M-Bmoire attribu-Be", 123);

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lli;")
    public static class185 field4809 = class245.method1649("0", 125);

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public int field4811;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lhi;")
    public static class250 field4812;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lhi;")
    public static class250 field4814;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static void method1855(int arg0) {
        field4809 = null;
        if (arg0 != 0) {
            method1857((class250) null, (byte) -20);
        }
        field4808 = null;
        field4814 = null;
        field4812 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILp;)Z")
    public static final boolean method1856(int arg0, class82 arg1) {
        if (arg0 != 250) {
            return true;
        }
        field4806++;
        if (arg1.field1599 == 205) {
            class33.field547 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lhi;B)V")
    public static final void method1857(class250 arg0, byte arg1) {
        field4807++;
        if (class31.field513) {
            return;
        }
        if (arg1 <= 58) {
            method1858(-75, -16, 8, 59, true);
        }
        class159.method1144();
        class97.field1812 = class28.method180(0, arg0, class201.field3679);
        int var2 = class148.field2796;
        int var3 = var2 * 956 / 503;
        class97.field1812.method705((class204.field3738 - var3) / 2, 0, var3, var2);
        class18.field290 = class42.method258(class1.field16, arg0, 32363);
        class18.field290.method96(class204.field3738 / 2 - (class18.field290.field200 / 2), 18);
        class31.field513 = true;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class264.field4685 = arg1;
        class122.field2214 = arg2;
        class223.field4096 = arg3;
        class264.field4687 = new class198[arg0][class264.field4685][class122.field2214];
        class60.field1075 = new int[arg0][class264.field4685 + 1][class122.field2214 + 1];
        if (arg4) {
            class171.field3151 = new class198[1][class264.field4685][class122.field2214];
            class125.field2242 = new int[class264.field4685][class122.field2214];
            class268.field4747 = new int[1][class264.field4685 + 1][class122.field2214 + 1];
        } else {
            class171.field3151 = null;
            class125.field2242 = null;
            class268.field4747 = null;
        }
        class20.method149(false);
        class113.field2038 = new class156[500];
        class156.field2968 = 0;
        class68.field1178 = new class156[500];
        class40.field623 = 0;
        class13.field230 = new int[arg0][class264.field4685 + 1][class122.field2214 + 1];
        class281.field4969 = new class49[5000];
        class276.field4884 = 0;
        class182.field3345 = new class49[100];
        class93.field1776 = new boolean[class223.field4096 + class223.field4096 + 1][class223.field4096 + class223.field4096 + 1];
        class199.field3660 = new boolean[class223.field4096 + class223.field4096 + 2][class223.field4096 + class223.field4096 + 2];
        class150.field2836 = new byte[arg0][class264.field4685][class122.field2214];
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BJ)Lli;")
    public static final class185 method1859(byte arg0, long arg1) {
        field4815++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            if (arg0 != -108) {
                method1858(109, -113, -18, -14, true);
            }
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class274.field4852[(int) (var8 - (arg1 * 37L))];
            }
            class185 var7 = new class185();
            var7.field3411 = var6;
            var7.field3437 = var6.length;
            return var7;
        }
    }
}
