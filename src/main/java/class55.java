import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class55 {

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field937 = -1;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lda;")
    public static class275 field927 = class255.method1672(105, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lda;")
    public static class275 field936 = class255.method1672(124, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lda;")
    public static class275 field938 = class255.method1672(104, "p12_full");

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lda;")
    public static class275 field939 = class255.method1672(104, "Lade)3)3)3");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lr;")
    public class19 field929;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "[I")
    public int[] field935;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[Lda;")
    public class275[] field933;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method350(byte arg0) {
        field936 = null;
        field939 = null;
        field938 = null;
        int var1 = 62 / (arg0 / 36);
        field927 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ltj;IZLtj;I)I")
    public static final int method351(class270 arg0, int arg1, boolean arg2, class270 arg3, int arg4) {
        if (arg1 != -1466660121) {
            field938 = null;
        }
        field934++;
        if (arg4 == 1) {
            int var5 = arg0.field1452;
            int var6 = arg3.field1452;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg0.method1781(5595).field3479.method1819((byte) -87, arg3.method1781(5595).field3479);
        } else if (arg4 == 3) {
            if (arg0.field4705.method1828(true, class91.field1540)) {
                if (arg3.field4705.method1828(true, class91.field1540)) {
                    return 0;
                } else if (arg2) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field4705.method1828(true, class91.field1540)) {
                return arg2 ? 1 : -1;
            } else {
                return arg0.field4705.method1819((byte) -87, arg3.field4705);
            }
        } else if (arg4 == 4) {
            if (arg0.method620((byte) 119)) {
                return arg3.method620((byte) -35) ? 0 : 1;
            } else if (arg3.method620((byte) 101)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg0.method616(84)) {
                return arg3.method616(88) ? 0 : 1;
            } else if (arg3.method616(arg1 + 1466660175)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg0.method617((byte) -23)) {
                return arg3.method617((byte) -23) ? 0 : 1;
            } else if (arg3.method617((byte) -23)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != 7) {
            return arg0.field4698 - arg3.field4698;
        } else if (arg0.method621(arg1 + 1466660004)) {
            return arg3.method621(-125) ? 0 : 1;
        } else if (arg3.method621(arg1 + 1466660040)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILfd;II)V")
    public static final void method352(int arg0, class229 arg1, int arg2, int arg3) {
        field930++;
        if (class120.field2165 != 0 && class120.field2165 != 3 || !arg1.method1491(0)) {
            return;
        }
        int var4 = arg1.field3938[arg3];
        if (var4 > arg2 || var4 + arg1.field3961[arg3] < arg2) {
            return;
        }
        int var5 = arg3 - arg1.field3980 / 2;
        if (arg0 != 57) {
            field938 = null;
        }
        int var6 = arg2 - arg1.field3885 / 2;
        int var7 = class218.field3699 + class169.field2938 & 0x7FF;
        int var8 = class223.field3769[var7];
        int var9 = class223.field3760[var7];
        int var10 = (class188.field3254 + 256) * var8 >> 8;
        int var11 = (class188.field3254 + 256) * var9 >> 8;
        int var12 = var5 * var11 - (var6 * var10) >> 11;
        int var13 = var5 * var10 + var6 * var11 >> 11;
        int var14 = class66.field1094.field1770 + var13 >> 7;
        int var15 = class66.field1094.field1758 - var12 >> 7;
        if (class277.field4838 > 0 && class149.field2605[82] && class149.field2605[81]) {
            class46.method279(class16.field237 + var14, 1519635526, class159.field2790, class234.field4083 + var15);
            return;
        }
        boolean var16 = class67.method453(0, 0, 0, class66.field1094.field1752[0], var15, 0, -12782, 0, 1, class66.field1094.field1722[0], true, var14);
        if (!var16) {
            return;
        }
        class149.field2597.method575((byte) 126, var6);
        class149.field2597.method575((byte) 124, var5);
        class149.field2597.method600(class169.field2938, (byte) 78);
        class149.field2597.method575((byte) 124, 57);
        class149.field2597.method575((byte) 124, class218.field3699);
        class149.field2597.method575((byte) 127, class188.field3254);
        class149.field2597.method575((byte) 127, 89);
        class149.field2597.method600(class66.field1094.field1770, (byte) 33);
        class149.field2597.method600(class66.field1094.field1758, (byte) 53);
        class149.field2597.method575((byte) 124, class129.field2273);
        class149.field2597.method575((byte) 126, 63);
    }
}
