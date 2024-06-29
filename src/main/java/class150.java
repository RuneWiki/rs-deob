import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class150 {

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lke;")
    private class101 field2692 = new class101();

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ltg;")
    public static class184 field2694 = class135.method812(" <col=ffff00>", 3);

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Ltg;")
    public static class184 field2689 = null;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Ltg;")
    private static class184 field2685 = class135.method812("This computers address has been blocked", 3);

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[[I")
    public static int[][] field2696 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Ltg;")
    public static class184 field2690 = field2685;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Ltg;")
    private static class184 field2688 = class135.method812("Members object", 3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ltg;")
    private static class184 field2680 = class135.method812("Choose Option", 3);

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Ltg;")
    public static class184 field2683 = field2688;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2697 = 20;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "Ltg;")
    public static class184 field2699 = field2680;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lvb;")
    public static class197 field2686;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static final int method916(int arg0, int arg1) {
        field2702++;
        if (arg1 != -21050) {
            method917(121);
        }
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method917(int arg0) {
        class63.field1182 = 0;
        int var1 = -74 % ((arg0 + 45) / 47);
        int var2 = (class46.field872.field635 >> 7) + class57.field1020;
        field2691++;
        int var3 = (class46.field872.field614 >> 7) + class129.field2331;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class63.field1182 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class63.field1182 = 1;
        }
        if (class63.field1182 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class63.field1182 = 0;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLu;)V")
    public static final void method918(boolean arg0, class186 arg1) {
        long var2 = 0L;
        if (arg1.field3587 == 0) {
            var2 = class21.method131(arg1.field3592, arg1.field3605, arg1.field3600);
        }
        if (arg1.field3587 == 1) {
            var2 = class193.method1229(arg1.field3592, arg1.field3605, arg1.field3600);
        }
        if (arg1.field3587 == 2) {
            var2 = class117.method713(arg1.field3592, arg1.field3605, arg1.field3600);
        }
        if (!arg0) {
            return;
        }
        int var4 = -1;
        field2684++;
        int var5 = 0;
        if (arg1.field3587 == 3) {
            var2 = class52.method286(arg1.field3592, arg1.field3605, arg1.field3600);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 14 & 0x1F;
        }
        arg1.field3588 = var4;
        arg1.field3585 = var5;
        arg1.field3604 = var6;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)Lke;")
    public final class101 method919(int arg0) {
        field2681++;
        class101 var2 = this.field2692.field1867;
        if (this.field2692 == var2) {
            return null;
        } else {
            int var3 = 54 / ((-arg0 - 60) / 37);
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Lke;")
    public final class101 method920(byte arg0) {
        field2701++;
        if (arg0 != -126) {
            return null;
        }
        class101 var2 = this.field2692.field1867;
        if (this.field2692 == var2) {
            return null;
        } else {
            var2.method628((byte) -46);
            return var2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILke;)V")
    public final void method921(int arg0, class101 arg1) {
        if (arg1.field1871 != null) {
            arg1.method628((byte) 77);
        }
        if (arg0 != 0) {
            return;
        }
        field2700++;
        arg1.field1871 = this.field2692.field1871;
        arg1.field1867 = this.field2692;
        arg1.field1871.field1867 = arg1;
        arg1.field1867.field1871 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLke;)V")
    public final void method922(byte arg0, class101 arg1) {
        if (arg1.field1871 != null) {
            arg1.method628((byte) -11);
        }
        arg1.field1871 = this.field2692;
        field2682++;
        arg1.field1867 = this.field2692.field1867;
        if (arg0 != -76) {
            this.method921(70, null);
        }
        arg1.field1871.field1867 = arg1;
        arg1.field1867.field1871 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2699 = null;
        field2685 = null;
        field2680 = null;
        if (arg0 != 1) {
            field2686 = null;
        }
        field2696 = null;
        field2690 = null;
        field2683 = null;
        field2689 = null;
        field2694 = null;
        field2686 = null;
        field2688 = null;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class150() {
        this.field2692.field1871 = this.field2692;
        this.field2692.field1867 = this.field2692;
    }
}
