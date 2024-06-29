import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class119 extends class77 {

    @OriginalMember(owner = "client!ra", name = "dc", descriptor = "Lqf;")
    public static class117 field2841 = class72.method514(111, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ra", name = "hc", descriptor = "Lqf;")
    public static class117 field2845 = class72.method514(109, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!ra", name = "oc", descriptor = "[Lqf;")
    public static class117[] field2852 = new class117[100];

    @OriginalMember(owner = "client!ra", name = "cc", descriptor = "[I")
    public static int[] field2840 = new int[128];

    @OriginalMember(owner = "client!ra", name = "nc", descriptor = "Lqf;")
    public static class117 field2851 = class72.method514(127, "(Y<)4col>");

    @OriginalMember(owner = "client!ra", name = "ac", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ra", name = "bc", descriptor = "I")
    private int field2839;

    @OriginalMember(owner = "client!ra", name = "ec", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ra", name = "fc", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ra", name = "gc", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ra", name = "ic", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ra", name = "jc", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ra", name = "kc", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ra", name = "mc", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ra", name = "qc", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ra", name = "rc", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ra", name = "tc", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ra", name = "sc", descriptor = "Lpf;")
    public static class110 field2856;

    @OriginalMember(owner = "client!ra", name = "lc", descriptor = "Lsc;")
    private class128 field2849;

    @OriginalMember(owner = "client!ra", name = "pc", descriptor = "Lw;")
    public static class149 field2853;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "(I)V")
    public static final void method954(int arg0) {
        class102.field2455.method250((byte) -54);
        int var1 = 23 / ((arg0 - 30) / 40);
        ++field2844;
        class45.field899.method250((byte) -54);
        class13.field184.method250((byte) -54);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lqf;ZLqf;I)V")
    public static final void method955(class117 arg0, boolean arg1, class117 arg2, int arg3) {
        ++field2843;
        if (class42.field823) {
            class120.method964(1);
            class42.field823 = false;
            class60.method422(14);
            class104.method800(true);
            class66.method472(false);
            class129.method1011((byte) 124);
            class79.method624(class75.field1646, class32.field695, (byte) -73, class25.field501, class70.field1475);
            class5.method18((byte) -81, -1, ~class140.field3343 == 0, class64.field1281, class27.field529);
            class4.field70 = true;
            class134.field3204 = true;
            class125.field2963 = true;
        }
        short var4 = 151;
        class66.method469(64);
        int var5 = var4 - arg3;
        class25.field501.method325(arg0, 256, var5 + -1, 16777215, 0);
        if (arg2 != null) {
            var5 += 15;
            if (arg1) {
                int var6 = class25.field501.method331(arg2) + 4;
                class49.method360(-(var6 / 2) + 257, var5 + -11, var6, 11, 0);
            }
            class25.field501.method325(arg2, 256, var5 + -1, 16777215, 0);
        }
        class152.method1214((byte) -128);
    }

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "(I)V")
    public final void method956(int arg0) {
        ++field2850;
        super.field1691 = (this.field2839 + 7) / 8;
        if (arg0 != 13656) {
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "(II)I")
    public final int method957(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method963(-124, -121);
        }
        ++field2842;
        return arg1 * 8 + -this.field2839;
    }

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "(B)V")
    public static void method958(byte arg0) {
        if (arg0 == 99) {
            field2856 = null;
            field2840 = null;
            field2851 = null;
            field2853 = null;
            field2852 = null;
            field2845 = null;
            field2841 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([II)V")
    public final void method959(int[] arg0, int arg1) {
        ++field2846;
        this.field2849 = new class128(arg0);
        if (arg1 != -20186) {
            this.method962(60);
        }
    }

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "(I)V")
    public final void method960(int arg0) {
        this.field2839 = super.field1691 * 8;
        if (arg0 != -1) {
            this.method959((int[]) null, -107);
        }
        ++field2847;
    }

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "(II)V")
    public final void method961(int arg0, int arg1) {
        super.field1748[super.field1691++] = (byte) (this.field2849.method1000(true) + arg0);
        ++field2848;
        if (arg1 != -1198) {
            this.method962(17);
        }
    }

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "(I)I")
    public final int method962(int arg0) {
        if (arg0 != 8) {
            field2856 = null;
        }
        ++field2857;
        return 255 & super.field1748[super.field1691++] + -this.field2849.method1000(true);
    }

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "(II)I")
    public final int method963(int arg0, int arg1) {
        int var3 = this.field2839 >> 3;
        if (arg0 > -37) {
            field2853 = null;
        }
        ++field2855;
        int var4 = 0;
        int var5 = -(this.field2839 & 7) + 8;
        this.field2839 += arg1;
        while (~var5 > ~arg1) {
            var4 += (class104.field2515[var5] & super.field1748[var3++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg1 != var5) {
            var6 = (super.field1748[var3] >> -arg1 + var5 & class104.field2515[arg1]) + var4;
        } else {
            var6 = (class104.field2515[var5] & super.field1748[var3]) + var4;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    public class119(int arg0) {
        super(arg0);
    }
}
