import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class239 extends class121 {

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field3492 = 13156520;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[B")
    public static byte[] field3488 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field3499 = -1;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lqu;")
    public static class364 field3497 = new class364(4, 7);

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lhca;")
    public static class179 field3493;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lse;")
    public class198 field3498;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lqb;")
    public static class626 field3501;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[Lgr;")
    public class525[] field3503;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[BI)[B", line = 6)
    public static final byte[] method1533(int arg0, int arg1, byte[] arg2, int arg3) {
        field3502++;
        byte[] var4;
        if (arg0 <= 0) {
            var4 = arg2;
        } else {
            var4 = new byte[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                var4[var5] = arg2[arg0 + var5];
            }
        }
        class264 var6 = new class264();
        var6.method1690((byte) 0);
        var6.method1688((long) (arg1 * 8), var4, (byte) -12);
        int var7 = 62 % ((arg3 + 15) / 47);
        byte[] var8 = new byte[64];
        var6.method1691((byte) -57, var8, 0);
        return var8;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 38)
    public static void method1534(boolean arg0) {
        field3488 = null;
        if (arg0) {
            field3493 = null;
            field3497 = null;
            field3501 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V", line = 58)
    public static final void method1535(int arg0) {
        field3500++;
        class251.field3650 = new class311[class145.field1879.method3477(false)][];
        if (arg0 <= -101) {
            class14.field123 = new class311[class145.field1879.method3477(false)][];
            class43.field521 = new boolean[class145.field1879.method3477(false)];
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILqa;I)Z", line = 75)
    public final boolean method1536(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg1 != 0) {
            field3488 = null;
        }
        field3490++;
        if (this.field3503 != null) {
            for (int var5 = 0; var5 < this.field3503.length; var5++) {
                if (this.field3503[var5].method3096(arg3, arg0) && this.field3498.method164(arg3, arg2, arg0, (byte) 77)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)I", line = 107)
    public static final int method1537(int arg0, int arg1) {
        if (arg0 != -24644) {
            field3492 = -93;
        }
        field3496++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 125)
    public static final void method1538(byte arg0) {
        class105.method615(false);
        field3489++;
        class445.field6487 = null;
        class468.field6812 = null;
        class604.field8896 = null;
        if (arg0 != 48) {
            field3488 = null;
        }
        class156.field1997 = null;
        class264.field3901 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)Z", line = 147)
    public static final boolean method1539(int arg0, int arg1, int arg2) {
        int var3 = class273.field4040[arg0][arg1][arg2];
        if (-class490.field7410 == var3) {
            return false;
        } else if (class490.field7410 == var3) {
            return true;
        } else {
            int var4 = arg1 << class179.field2726;
            int var5 = arg2 << class179.field2726;
            if (class313.method1924(var4 + 1, class235.field3455[arg0].method1319(arg1, arg2), var5 + 1) && class313.method1924(class177.field2692 + var4 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg2), var5 + 1) && class313.method1924(class177.field2692 + var4 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg2 + 1), class177.field2692 + var5 - 1) && class313.method1924(var4 + 1, class235.field3455[arg0].method1319(arg1, arg2 + 1), class177.field2692 + var5 - 1) && class313.method1924(class605.field8913 + var4, class235.field3455[arg0].method1319(arg1, arg2), var5 + 1) && class313.method1924(class177.field2692 + var4 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg2), class605.field8913 + var5) && class313.method1924(class605.field8913 + var4, class235.field3455[arg0].method1319(arg1, arg2 + 1), class177.field2692 + var5 - 1) && class313.method1924(class177.field2692 + var4 - 1, class235.field3455[arg0].method1319(arg1, arg2), class605.field8913 + var5) && class313.method1924(class605.field8913 + var4, class235.field3455[arg0].method1319(arg1, arg2), class605.field8913 + var5)) {
                class273.field4040[arg0][arg1][arg2] = class490.field7410;
                return true;
            } else {
                class273.field4040[arg0][arg1][arg2] = -class490.field7410;
                return false;
            }
        }
    }
}
