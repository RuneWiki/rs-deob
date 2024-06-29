import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class172 extends class170 {

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    private int field3039 = 0;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
    private int field3047 = 4096;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "S")
    public static short field3037 = 32767;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lqk;")
    private static class207 field3041 = class24.method212(255, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lqk;")
    public static class207 field3043 = class24.method212(255, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "[I")
    public static int[] field3046 = new int[32];

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "Lqk;")
    public static class207 field3040 = field3041;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!uf", name = "hb", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        ++field3044;
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (arg1) {
            field3043 = null;
        }
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, -65, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class88.field1595; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 >= this.field3039) {
                    if (~this.field3047 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field3047;
                    }
                } else {
                    var8[var11] = this.field3039;
                }
                if (this.field3039 <= var14) {
                    if (~var14 < ~this.field3047) {
                        var9[var11] = this.field3047;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field3039;
                }
                if (this.field3039 > var13) {
                    var10[var11] = this.field3039;
                } else if (var13 > this.field3047) {
                    var10[var11] = this.field3047;
                } else {
                    var10[var11] = var13;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field3038;
        if (arg1 == 5877) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field2998 = ~arg0.method1045((byte) 83) == -2;
                    }
                } else {
                    this.field3047 = arg0.method1050(arg1 + 1272000691);
                }
            } else {
                this.field3039 = arg0.method1050(1272006568);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class172() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
    public static final void method1229(byte arg0) {
        if (arg0 < 0) {
            method1230((byte) -24, -105);
        }
        ++field3048;
        class141.field2445.method1382(31346);
        class249.field4511.method1382(31346);
        class22.field352.method1382(31346);
        class282.field4956.method1382(31346);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(BI)I")
    public static final int method1230(byte arg0, int arg1) {
        ++field3042;
        int var2 = (arg1 >>> 1 & -715827883) + (arg1 & 1431655765);
        int var3 = ((var2 & -858993460) >>> 2) + (var2 & 858993459);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        if (arg0 < 102) {
            field3046 = null;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field3040 = null;
        field3041 = null;
        field3043 = null;
        field3046 = null;
        if (arg0 < 49) {
            method1229((byte) 0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field3045;
        int[] var3 = super.field3001.method1538(110, arg1);
        if (arg0 != -30) {
            field3037 = -88;
        }
        if (super.field3001.field3835) {
            int[] var4 = this.method1226(0, arg1, arg0 ^ 52);
            for (int var5 = 0; ~class88.field1595 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field3039) {
                    var3[var5] = this.field3039;
                } else if (var6 > this.field3047) {
                    var3[var5] = this.field3047;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field3046[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
