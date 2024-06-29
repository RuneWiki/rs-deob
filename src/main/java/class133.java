import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class133 extends class106 {

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "Z")
    public boolean field2644 = false;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "Lae;")
    private class6 field2609;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "Z")
    public boolean field2622;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "Z")
    public boolean field2631;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
    private int field2639;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    private int field2621;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    private int field2619;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
    private int field2638;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Leh;")
    private static class47 field2618 = class195.method1282((byte) -4, "Sep");

    @OriginalMember(owner = "client!og", name = "K", descriptor = "Leh;")
    private static class47 field2612 = class195.method1282((byte) -4, "May");

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "[Lhh;")
    public static class72[] field2626 = new class72[32768];

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "[I")
    public static int[] field2628 = new int[5];

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "Leh;")
    private static class47 field2630 = class195.method1282((byte) -4, "Oct");

    @OriginalMember(owner = "client!og", name = "L", descriptor = "Leh;")
    private static class47 field2613 = class195.method1282((byte) -4, "Feb");

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Leh;")
    private static class47 field2617 = class195.method1282((byte) -4, "Nov");

    @OriginalMember(owner = "client!og", name = "V", descriptor = "Leh;")
    public static class47 field2623 = class195.method1282((byte) -4, ")1");

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Leh;")
    private static class47 field2614 = class195.method1282((byte) -4, "Aug");

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "Leh;")
    private static class47 field2637 = class195.method1282((byte) -4, "Dec");

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "Leh;")
    private static class47 field2635 = class195.method1282((byte) -4, "Jul");

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Leh;")
    public static class47 field2615 = class195.method1282((byte) -4, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "Leh;")
    private static class47 field2642 = class195.method1282((byte) -4, "Jan");

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "Leh;")
    private static class47 field2640 = class195.method1282((byte) -4, "Jun");

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Leh;")
    private static class47 field2616 = class195.method1282((byte) -4, "Mar");

    @OriginalMember(owner = "client!og", name = "sb", descriptor = "Leh;")
    private static class47 field2646 = class195.method1282((byte) -4, "Apr");

    @OriginalMember(owner = "client!og", name = "rb", descriptor = "[Leh;")
    public static class47[] field2645 = new class47[] { field2642, field2613, field2616, field2646, field2612, field2640, field2635, field2614, field2618, field2630, field2617, field2637 };

    @OriginalMember(owner = "client!og", name = "X", descriptor = "F")
    private float field2625;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "[I")
    public static int[] field2629;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "[I")
    private int[] field2632;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lsf;ILah;B)[I")
    public final int[] method974(class168 arg0, int arg1, class9 arg2, byte arg3) {
        field2633++;
        if (arg3 != -91) {
            this.method974(null, 114, null, (byte) 126);
        }
        if (this.field2609.method32(81, arg2, arg0)) {
            int var5 = this.field2611 > arg1 ? arg1 : this.field2611;
            return this.field2609.method30(0, arg2, arg0, 1.0D, false, var5, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method975(byte arg0) {
        field2628 = null;
        field2613 = null;
        field2646 = null;
        field2614 = null;
        if (arg0 < 41) {
            field2617 = null;
        }
        field2630 = null;
        field2612 = null;
        field2635 = null;
        field2640 = null;
        field2616 = null;
        field2626 = null;
        field2615 = null;
        field2637 = null;
        field2642 = null;
        field2623 = null;
        field2629 = null;
        field2617 = null;
        field2618 = null;
        field2645 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lah;ILsf;)Z")
    public final boolean method976(class9 arg0, int arg1, class168 arg2) {
        if (arg1 <= 45) {
            return false;
        } else {
            field2643++;
            return this.field2609.method32(110, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILeh;Leh;ZLeh;)V")
    public static final void method977(int arg0, class47 arg1, class47 arg2, boolean arg3, class47 arg4) {
        if (!arg3) {
            field2618 = null;
        }
        field2624++;
        for (int var5 = 99; var5 > 0; var5--) {
            class69.field1514[var5] = class69.field1514[var5 - 1];
            class67.field1441[var5] = class67.field1441[var5 - 1];
            class200.field3901[var5] = class200.field3901[var5 - 1];
            class122.field2467[var5] = class122.field2467[var5 - 1];
        }
        class67.field1441[0] = arg1;
        class144.field2826 = class103.field2162;
        class69.field1514[0] = arg0;
        class200.field3901[0] = arg2;
        class122.field2467[0] = arg4;
        class90.field1885++;
    }

    @OriginalMember(owner = "client!og", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2636++;
        super.finalize();
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(FLsf;IILah;)[I")
    public final int[] method978(float arg0, class168 arg1, int arg2, int arg3, class9 arg4) {
        if (arg2 != 1) {
            method977(-14, null, null, false, null);
        }
        field2610++;
        if (this.field2632 == null || this.field2625 != arg0) {
            if (!this.field2609.method32(-104, arg4, arg1)) {
                return null;
            }
            int var6 = this.field2611 <= arg3 ? this.field2611 : arg3;
            this.field2632 = this.field2609.method30(0, arg4, arg1, (double) arg0, true, var6, var6);
            this.field2625 = arg0;
        }
        return this.field2632;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lhd;)V")
    public class133(class68 arg0) {
        this.field2609 = new class6(arg0);
        int var2 = arg0.method604((byte) -127);
        this.field2622 = (var2 & 0x2) != 0;
        this.field2631 = (var2 & 0x1) != 0;
        this.field2611 = arg0.method604((byte) -123);
        this.field2634 = arg0.method569(26496);
        this.field2639 = arg0.method604((byte) -28);
        if (this.field2639 == 255) {
            this.field2639 = 256;
        }
        int var3 = arg0.method604((byte) -125);
        int var4 = arg0.method604((byte) -126);
        this.field2621 = var3 >> 6 & 0x3;
        this.field2619 = (var4 & 0x3F) - 6;
        this.field2638 = var4 >> 6 & 0x3;
        arg0.method604((byte) -125);
        arg0.method604((byte) -126);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class133() {
        this.field2609 = new class6();
        this.field2611 = 1;
        this.field2631 = true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public final void method979(int arg0, int arg1) {
        field2627++;
        if (this.field2632 == null) {
            return;
        }
        if (this.field2638 != 0) {
            if (class40.field794 == null || class40.field794.length < this.field2632.length) {
                class40.field794 = new int[this.field2632.length];
            }
            short var3;
            if (this.field2632.length == 4096) {
                var3 = 64;
            } else {
                var3 = 128;
            }
            int var4 = this.field2632.length;
            int var5 = arg1 * var3 * this.field2619;
            if (this.field2638 == 2) {
                var5 = -var5;
            }
            int var6 = var4 - 1;
            for (int var7 = 0; var7 < var4; var7++) {
                int var9 = var6 & var5 + var7;
                class40.field794[var7] = this.field2632[var9];
            }
            int[] var8 = this.field2632;
            this.field2632 = class40.field794;
            class40.field794 = var8;
        }
        if (arg0 < 65) {
            this.method978(-1.1869047F, null, 14, 51, null);
        }
        if (this.field2621 == 0) {
            return;
        }
        if (class40.field794 == null || this.field2632.length > class40.field794.length) {
            class40.field794 = new int[this.field2632.length];
        }
        int var10 = this.field2632.length;
        int var11 = this.field2619 * arg1;
        short var12;
        if (this.field2632.length == 4096) {
            var12 = 64;
        } else {
            var12 = 128;
        }
        if (this.field2621 == 1) {
            var11 = -var11;
        }
        int var13 = var12 - 1;
        for (int var14 = 0; var14 < var10; var14 += var12) {
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var14 + var16;
                int var18 = (var13 & var11 + var16) + var14;
                class40.field794[var17] = this.field2632[var18];
            }
        }
        int[] var15 = this.field2632;
        this.field2632 = class40.field794;
        class40.field794 = var15;
    }
}
