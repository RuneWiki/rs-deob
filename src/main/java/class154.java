import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class154 extends class179 {

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    private int field2748 = 4096;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    private int field2754 = 4096;

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "I")
    private int field2757 = 4096;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "[I")
    public static int[] field2751 = new int[32];

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "Lke;")
    private static class256 field2756 = class316.method2202("Started 3d Library", 27626);

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "Z")
    public static boolean field2759 = false;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "Lke;")
    public static class256 field2762 = field2756;

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "Lke;")
    public static class256 field2760 = class316.method2202("ondulation2:", 27626);

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!bk", name = "ib", descriptor = "[I")
    public static int[] field2763 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "S")
    public static short field2758 = 1;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "Lng;")
    public static class138 field2749;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "Z")
    public static boolean field2746;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(III)Lka;", line = 9)
    public static final class197 method1150(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class197 var4 = var3.field4639;
            var3.field4639 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lng;ILng;)I", line = 23)
    public static final int method1151(class138 arg0, int arg1, class138 arg2) {
        int var3 = 0;
        field2750++;
        if (arg0.method1011(class318.field5469, -23605)) {
            var3++;
        }
        if (arg0.method1011(class257.field4445, -23605)) {
            var3++;
        }
        if (arg0.method1011(class230.field3941, -23605)) {
            var3++;
        }
        if (arg1 > -99) {
            method1152(100);
        }
        if (arg2.method1011(class318.field5469, -23605)) {
            var3++;
        }
        if (arg2.method1011(class257.field4445, -23605)) {
            var3++;
        }
        if (arg2.method1011(class230.field3941, -23605)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 55)
    public class154() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)[[I", line = 61)
    public final int[][] method55(int arg0, int arg1) {
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        field2761++;
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, 158, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class161.field2858; var11++) {
                int var12 = var5[var11];
                int var13 = var10[var11];
                int var14 = var6[var11];
                if (var13 == var14 && var12 == var13) {
                    var7[var11] = this.field2757 * var14 >> 12;
                    var8[var11] = this.field2754 * var13 >> 12;
                    var9[var11] = this.field2748 * var12 >> 12;
                } else {
                    var7[var11] = this.field2757;
                    var8[var11] = this.field2754;
                    var9[var11] = this.field2748;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "(I)V", line = 126)
    public static final void method1152(int arg0) {
        field2755++;
        int var1 = 0;
        for (int var2 = arg0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class144.method1052(var2, class41.field790, arg0 + 301989888, var1, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 166)
    public static void method1153(boolean arg0) {
        field2756 = null;
        field2762 = null;
        field2760 = null;
        field2763 = null;
        field2749 = null;
        field2751 = null;
        if (!arg0) {
            field2763 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILra;I)V", line = 218)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg0 <= 108) {
            field2758 = 57;
        }
        if (arg2 == 0) {
            this.field2757 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field2754 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field2748 = arg1.method346(-16);
        }
        field2745++;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)Z", line = 284)
    public static final boolean method1154(int arg0, int arg1) {
        field2752++;
        class182 var2 = class84.method622(false, arg1);
        if (var2 == null) {
            return false;
        } else if (class4.field66 == 1 || class4.field66 == 2 || class40.field724 == 2) {
            byte[] var3 = var2.field3223.method1778((byte) 124);
            class29.field409 = new String(var3, 0, var3.length);
            class240.field4089 = var2.field3226;
            if (class40.field724 != 0) {
                class53.field968 = class240.field4089 + 40000;
                class5.field78 = class240.field4089 + 50000;
                class286.field4968 = class53.field968;
            }
            return true;
        } else {
            class256 var4 = class195.field3563;
            if (class40.field724 != 0) {
                var4 = class30.method214(new class256[] { class97.field1737, class305.method2125((byte) 29, var2.field3226 + 7000) }, 29784);
            }
            int var5 = 127 % ((arg0 + 23) / 57);
            class256 var6 = class195.field3563;
            if (class281.field4882 != null) {
                var6 = class30.method214(new class256[] { class239.field4074, class281.field4882 }, 29784);
            }
            class256 var7 = class30.method214(new class256[] { class88.field1583, var2.field3223, var4, class73.field1333, class305.method2125((byte) 55, class204.field3699), class203.field3687, class305.method2125((byte) 42, class7.field107), var6, class288.field4979, class92.field1674 ? class78.field1465 : class191.field3493, class68.field1260, class141.field2477 ? class78.field1465 : class191.field3493, class38.field698, class72.field1318 ? class78.field1465 : class191.field3493 }, 29784);
            try {
                class307.field5289.getAppletContext().showDocument(var7.method1808(125), "_self");
                return true;
            } catch (Exception var9) {
                return false;
            }
        }
    }
}
