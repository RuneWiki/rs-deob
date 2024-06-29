import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class117 {

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[[I")
    public static int[][] field1621 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lap;")
    public static class310 field1624 = new class310(57, 2);

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "Leo;")
    public static class443 field1628 = new class443(12, 17);

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "[I")
    public static int[] field1630 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "J")
    public static long field1625;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "[[[I")
    public static int[][][] field1629;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)I")
    public static final int method910(int arg0, byte arg1) {
        if (arg1 == 119) {
            field1623++;
            return arg0 & 0xFF;
        } else {
            return 48;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public static void method911(int arg0) {
        field1624 = null;
        field1630 = null;
        field1628 = null;
        if (arg0 <= 23) {
            method911(-1);
        }
        field1629 = null;
        field1621 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([I[JI)V")
    public static final void method912(int[] arg0, long[] arg1, int arg2) {
        class257.method1740(arg1, arg2, 1, arg0, arg1.length - 1);
        field1619++;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lnl;ILvg;Lnl;Lnl;)Z")
    public static final boolean method913(class435 arg0, int arg1, class431 arg2, class435 arg3, class435 arg4) {
        class181.field2732 = arg3;
        class264.field3811 = arg2;
        if (arg1 == 0) {
            class238.field3487 = arg4;
            class95.field1342 = arg0;
            field1622++;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method914(String arg0, int arg1) {
        field1627++;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class187.method1324((byte) 110, arg0.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public static final void method915(int arg0) {
        field1620++;
        class128.method961(16711680, class374.field5152, (long) class364.field5010);
        if (class238.field3475 != -1) {
            class189.method1327(class238.field3475, true);
        }
        for (int var1 = 0; var1 < class173.field2636; var1++) {
            if (class424.field5879[var1]) {
                class184.field2783[var1] = true;
            }
            class432.field6115[var1] = class424.field5879[var1];
            class424.field5879[var1] = false;
        }
        class165.field2403 = class364.field5010;
        if (class374.field5152.method452()) {
            class266.field3834 = true;
        }
        if (class238.field3475 != -1) {
            class173.field2636 = 0;
            class266.method1793(arg0 + 107);
        }
        class374.field5152.method360();
        class486.method2863(arg0 - 3, class193.field2875);
        class385.field5283 = 0;
        if (arg0 != 2) {
            field1621 = null;
        }
    }
}
