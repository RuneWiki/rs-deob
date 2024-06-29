import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class126 extends class13 {

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    private int field1765 = -1;

    @OriginalMember(owner = "client!tg", name = "O", descriptor = "Lfe;")
    public static class341 field1774 = new class341();

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "Lkn;")
    public static class442 field1777 = new class442("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field1781 = new String[100];

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "Lec;")
    public static class129 field1780 = new class129(8);

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "Lnq;")
    public static class268 field1779;

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "[I")
    public int[] field1769;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "[[I")
    public static int[][] field1782;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)Z")
    public final boolean method857(int arg0) {
        ++field1773;
        if (this.field1769 != null) {
            return true;
        } else if (arg0 >= ~this.field1765) {
            class238 var2 = ~class188.field2599 <= -1 ? class238.method1606(class275.field3833, class188.field2599, this.field1765) : class238.method1614(class275.field3833, this.field1765);
            var2.method1620();
            this.field1769 = var2.method1607();
            this.field1767 = var2.field3392;
            this.field1763 = var2.field3388;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1765 = arg0.method174(255);
        }
        if (arg1 <= 50) {
            this.field1763 = 37;
        }
        ++field1771;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[[I")
    public int[][] method222(int arg0, int arg1) {
        ++field1768;
        if (arg0 != -27832) {
            field1780 = null;
        }
        int[][] var3 = super.field256.method1930(arg1, (byte) 100);
        if (super.field256.field4154 && this.method857(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1763 * (class413.field5862 != this.field1767 ? this.field1767 * arg1 / class413.field5862 : arg1);
            if (class269.field3751 != this.field1763) {
                for (int var8 = 0; var8 < class269.field3751; ++var8) {
                    int var9 = this.field1763 * var8 / class269.field3751;
                    int var10 = this.field1769[var7 + var9];
                    var6[var8] = class387.method2454(var10 << 4, 4080);
                    var5[var8] = class387.method2454(var10, 65280) >> 4;
                    var4[var8] = class387.method2454(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; class269.field3751 > var11; ++var11) {
                    int var12 = this.field1769[var7++];
                    var6[var11] = class387.method2454(var12, 255) << 4;
                    var5[var11] = class387.method2454(var12, 65280) >> 4;
                    var4[var11] = class387.method2454(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILuo;Z)V")
    public static final void method858(int arg0, int arg1, class345 arg2, boolean arg3) {
        class341.field4664 = arg2;
        if (arg3) {
            field1777 = null;
        }
        ++field1766;
        class222.field3099 = new class76[arg1][arg0];
        if (class446.field6255 != null) {
            class66.field986 = class46.method406((byte) -115, class446.field6255[1], class446.field6255[5], class446.field6255[3], class446.field6255[4], class446.field6255[2], class446.field6255[0]);
        }
        class268.field3733 = new class76();
        class89.method626((byte) -95);
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
    public final void method221(byte arg0) {
        super.method221((byte) -68);
        ++field1775;
        if (arg0 < -7) {
            this.field1769 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class126() {
        super(0, false);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static final void method859(boolean arg0) {
        class90.field1260 = 0;
        ++field1764;
        class121.field1699.method644(arg0);
        class271.field3762 = false;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lms;B)V")
    public static final void method860(class453 arg0, byte arg1) {
        if (arg1 != -66) {
            field1779 = null;
        }
        ++field1772;
        if (arg0.field6356 == 5 && ~arg0.field6452 != 0) {
            class191.method1238(arg0, class64.field949, true);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)I")
    public final int method220(int arg0) {
        int var2 = -118 % ((arg0 - 35) / 55);
        ++field1776;
        return this.field1765;
    }

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "(B)V")
    public static void method861(byte arg0) {
        field1782 = null;
        int var1 = -106 / ((-7 - arg0) / 58);
        field1779 = null;
        field1781 = null;
        field1780 = null;
        field1774 = null;
        field1777 = null;
    }
}
