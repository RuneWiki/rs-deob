import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class107 extends class205 {

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    private int field1972 = 4096;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "Z")
    private boolean field1975 = true;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "Lvd;")
    private static class222 field1970 = class212.method1357("You can(Wt add yourself to your own friend list)3", 10731);

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "Lvd;")
    public static class222 field1968 = field1970;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "Lph;")
    public static class166 field1974 = new class166(50);

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "Lig;")
    public static class93 field1977 = new class93(16);

    @OriginalMember(owner = "client!jj", name = "hb", descriptor = "Lvd;")
    public static class222 field1980 = class212.method1357("Bitte entfernen Sie ", 10731);

    @OriginalMember(owner = "client!jj", name = "ib", descriptor = "I")
    public static volatile int field1981 = 0;

    @OriginalMember(owner = "client!jj", name = "fb", descriptor = "Lvd;")
    public static class222 field1978 = class212.method1357("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 10731);

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        ++field1969;
        if (arg1 < 98) {
            this.method2((class109) null, (byte) 104, -126);
        }
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[] var4 = this.method1322(arg0 + -1 & class17.field433, (byte) 93, 0);
            int[] var5 = this.method1322(arg0, (byte) 61, 0);
            int[] var6 = this.method1322(class17.field433 & arg0 + 1, (byte) 76, 0);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; ~class118.field2245 < ~var10; ++var10) {
                int var11 = (var5[class159.field3039 & var10 + 1] + -var5[class159.field3039 & var10 + -1]) * this.field1972;
                int var12 = (var6[var10] + -var4[var10]) * this.field1972;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field1975) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var9[var10] = var18;
                var7[var10] = var20;
                var8[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lab;ZLab;Lab;Lab;)V")
    public static final void method654(class3 arg0, boolean arg1, class3 arg2, class3 arg3, class3 arg4) {
        class64.field1174 = arg3;
        if (arg1) {
            field1979 = -126;
        }
        class35.field772 = arg4;
        ++field1976;
        class202.field3700 = arg0;
        class97.field1817 = arg2;
        class220.field4066 = new class13[class202.field3700.method34((byte) 16)][];
        class211.field3921 = new boolean[class202.field3700.method34((byte) 16)];
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
    public static void method655(byte arg0) {
        if (arg0 == 65) {
            field1968 = null;
            field1970 = null;
            field1974 = null;
            field1978 = null;
            field1977 = null;
            field1980 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class107() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = 15 / ((arg1 - -47) / 34);
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1975 = ~arg0.method662((byte) -94) == -2;
            }
        } else {
            this.field1972 = arg0.method675(2);
        }
        ++field1973;
    }
}
