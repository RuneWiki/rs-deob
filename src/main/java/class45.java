import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class45 extends class53 {

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    private int field733 = -1;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "I")
    public static int field732 = 0;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "Lwa;")
    private static class75 field727 = class66.method560("Your ignore list is full)3 Max of 100 users)3", false);

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "Lwa;")
    public static class75 field734 = field727;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field730 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!lm", name = "Z", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "[I")
    public int[] field731;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)Z", line = 10)
    public final boolean method302(byte arg0) {
        field724++;
        if (this.field731 != null) {
            return true;
        }
        if (arg0 > -41) {
            this.field731 = (int[]) null;
        }
        if (this.field733 < 0) {
            return false;
        }
        class181 var2 = class278.method1977(class206.field3487, this.field733, -41);
        var2.method1338();
        this.field729 = var2.field4318;
        this.field731 = var2.field3029;
        this.field735 = var2.field4320;
        return true;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILja;Z)V", line = 53)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg2) {
            field726++;
            if (arg0 == 0) {
                this.field733 = arg1.method485((byte) -2);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJ)V", line = 67)
    public static final void method303(int arg0, long arg1) {
        field725++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class40.field628; var3++) {
            if (class120.field2026[var3] == arg1) {
                class40.field628--;
                class133.field2292++;
                for (int var4 = var3; var4 < class40.field628; var4++) {
                    class106.field1779[var4] = class106.field1779[var4 + 1];
                    class173.field2930[var4] = class173.field2930[var4 + 1];
                    class120.field2020[var4] = class120.field2020[var4 + 1];
                    class120.field2026[var4] = class120.field2026[var4 + 1];
                    class112.field1910[var4] = class112.field1910[var4 + 1];
                    class111.field1898[var4] = class111.field1898[var4 + 1];
                }
                class166.field2793 = class187.field3128;
                class89.field1470.method87(65280, 116);
                class89.field1470.method514(30009, arg1);
                break;
            }
        }
        if (arg0 <= 117) {
            field730 = -23;
        }
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)I", line = 116)
    public final int method304(int arg0) {
        if (arg0 != -19606) {
            this.field729 = 55;
        }
        field728++;
        return this.field733;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 130)
    public final void method305(int arg0) {
        super.method305(arg0);
        if (arg0 != 3) {
            method307(55);
        }
        this.field731 = null;
        field722++;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 145)
    public class45() {
        super(0, false);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZB)V", line = 149)
    public static final void method306(boolean arg0, byte arg1) {
        field736++;
        class76.method665(class188.field3141, class244.field4111, arg0, 37, class81.field1361);
        int var2 = 34 % ((arg1 + 38) / 34);
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V", line = 164)
    public static void method307(int arg0) {
        if (arg0 >= -41) {
            method303(71, -32L);
        }
        field734 = null;
        field727 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[[I", line = 176)
    public int[][] method66(int arg0, int arg1) {
        field723++;
        int var3 = 81 / ((arg1 - 76) / 42);
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935 && this.method302((byte) -82)) {
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int var7 = this.field729 * (class303.field5189 == this.field735 ? arg0 : this.field735 * arg0 / class303.field5189);
            int[] var8 = var4[1];
            if (class269.field4644 == this.field729) {
                for (int var9 = 0; var9 < class269.field4644; var9++) {
                    int var10 = this.field731[var7++];
                    var5[var9] = class235.method1710(var10 << 4, 4080);
                    var8[var9] = class235.method1710(var10 >> 4, 4080);
                    var6[var9] = class235.method1710(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class269.field4644; var11++) {
                    int var12 = this.field729 * var11 / class269.field4644;
                    int var13 = this.field731[var7 + var12];
                    var5[var11] = class235.method1710(var13 << 4, 4080);
                    var8[var11] = class235.method1710(4080, var13 >> 4);
                    var6[var11] = class235.method1710(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }
}
