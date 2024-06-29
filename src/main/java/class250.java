import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class250 extends class124 {

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    private int field4446 = 4096;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "[I")
    private int[] field4443 = new int[3];

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    private int field4449 = 409;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    private int field4439 = 4096;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    private int field4457 = 4096;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "Le;")
    public static class191 field4440 = class54.method368("(U1", 2047);

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Le;")
    public static class191 field4444 = class54.method368("www", 2047);

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Le;")
    private static class191 field4442 = class54.method368("flash2:", 2047);

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "Le;")
    public static class191 field4451 = field4442;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "Le;")
    public static class191 field4445 = class54.method368("<col=80ff00>", 2047);

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "Le;")
    public static class191 field4452 = field4442;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field4450 = 0;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field4454 = -1;

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "Le;")
    public static class191 field4455 = class54.method368("T", 2047);

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field4441;
        if (arg1 != -7) {
            field4455 = null;
        }
        int[][] var3 = super.field2053.method1775((byte) -107, arg0);
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -107, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class64.field1132 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = -this.field4443[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field4449 > ~var13) {
                    var5[var11] = var12;
                    var9[var11] = var8[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var8[var11];
                    int var15 = -this.field4443[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field4449) {
                        var5[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field4443[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field4449 < var17) {
                            var5[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var5[var11] = this.field4439 * var12 >> 12;
                            var9[var11] = this.field4446 * var14 >> 12;
                            var10[var11] = this.field4457 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILqb;)V")
    public static final void method1743(int arg0, class76 arg1) {
        int var2 = -106 / ((9 - arg0) / 58);
        class57 var3 = (class57) class228.field4110.method612(arg1.field1315.method1352(65), true);
        if (var3 != null) {
            if (var3.field1058 != null) {
                class270.field4764.method504(var3.field1058);
                var3.field1058 = null;
            }
            var3.method655(63);
        }
        ++field4456;
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class147.field2478[var1] = false;
        }
        class243.field4345 = arg0;
        ++field4448;
        class271.field4776 = -1;
        class22.field320 = -1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field4453;
        if (!arg2) {
            method1745(true);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method1591(2);
                            this.field4443[0] = class167.method1128(267386880, var5 << 4);
                            this.field4443[2] = class167.method1128(var5 >> 12, 0);
                            this.field4443[1] = class167.method1128(4080, var5 >> 4);
                        }
                    } else {
                        this.field4439 = arg1.method1593(true);
                    }
                } else {
                    this.field4446 = arg1.method1593(true);
                }
            } else {
                this.field4457 = arg1.method1593(true);
            }
        } else {
            this.field4449 = arg1.method1593(true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class250() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method1745(boolean arg0) {
        field4444 = null;
        field4451 = null;
        if (arg0) {
            method1743(-117, (class76) null);
        }
        field4445 = null;
        field4455 = null;
        field4452 = null;
        field4440 = null;
        field4442 = null;
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
    public static final void method1746(int arg0) {
        class20.field273.method985(arg0);
        ++field4447;
        class262.field4647.method985(0);
    }
}
