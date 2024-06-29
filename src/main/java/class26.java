import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class26 extends class273 {

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    private int field451 = 2000;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    private int field453 = 0;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    private int field449 = 4096;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    private int field454 = 16;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    private int field462 = 0;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Lic;")
    public static class160 field448 = new class160(64);

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "[I")
    public static int[] field460;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "[[[Lnb;")
    public static class129[][][] field455;

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
    public static final void method235(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class102.field1557; ++var3) {
            for (int var4 = 0; var4 < class129.field2127; ++var4) {
                for (int var5 = 0; var5 < class130.field2161; ++var5) {
                    class129 var6 = field455[var3][var4][var5];
                    if (var6 != null) {
                        class128 var7 = var6.field2144;
                        if (var7 != null && var7.field2117.method468()) {
                            class251.method1672(var7.field2117, var3, var4, var5, 1, 1);
                            if (var7.field2105 != null && var7.field2105.method468()) {
                                class251.method1672(var7.field2105, var3, var4, var5, 1, 1);
                                var7.field2117.method465(var7.field2105, 0, 0, 0, false);
                                var7.field2105 = var7.field2105.method462(arg0, arg1, arg2);
                            }
                            var7.field2117 = var7.field2117.method462(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2142; ++var8) {
                            class190 var10 = var6.field2131[var8];
                            if (var10 != null && var10.field3119.method468()) {
                                class251.method1672(var10.field3119, var3, var4, var5, var10.field3114 - var10.field3115 + 1, var10.field3108 - var10.field3110 + 1);
                                var10.field3119 = var10.field3119.method462(arg0, arg1, arg2);
                            }
                        }
                        class249 var9 = var6.field2133;
                        if (var9 != null && var9.field3973.method468()) {
                            class126.method923(var9.field3973, var3, var4, var5);
                            var9.field3973 = var9.field3973.method462(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
    public static void method236(byte arg0) {
        field448 = null;
        field460 = null;
        field455 = null;
        if (arg0 <= 106) {
            field448 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field452;
        if (arg0) {
            method235(-115, 84, -64);
        }
        int[] var3 = super.field4359.method387((byte) -32, arg1);
        if (super.field4359.field833) {
            int var4 = this.field449 >> 1;
            int[][] var5 = super.field4359.method385((byte) 80);
            Random var6 = new Random((long) this.field462);
            for (int var7 = 0; ~var7 > ~this.field451; ++var7) {
                int var8 = ~this.field449 >= -1 ? this.field453 : this.field453 - (-class111.method824(0, var6, this.field449) + var4);
                int var9 = class111.method824(0, var6, field458);
                int var10 = 255 & var8 >> 4;
                int var11 = class111.method824(0, var6, class67.field1129);
                int var12 = (class116.field1957[var10] * this.field454 >> 12) + var11;
                int var13 = (class223.field3561[var10] * this.field454 >> 12) + var9;
                int var14 = -var11 + var12;
                int var15 = -var9 + var13;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var13;
                        int var18 = var9;
                        var9 = var11;
                        var11 = var18;
                        var13 = var12;
                        var12 = var17;
                    }
                    if (var9 > var13) {
                        int var19 = var9;
                        var9 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var9;
                    int var23 = -var11 + var12;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = ~var12 < ~var11 ? 1 : -1;
                    int var27 = -(class111.method824(0, var6, 4096) >> 2) + 1024;
                    for (int var28 = var9; ~var13 < ~var28; ++var28) {
                        var24 += var23;
                        int var29 = var27 + 1024 - -((-var9 + var28) * var25);
                        int var30 = client.field4573 & var28;
                        int var31 = class145.field2392 & var21;
                        if (var24 > 0) {
                            var21 += var26;
                            var24 -= var22;
                        }
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        class155.method1117(91);
        if (arg0 > -94) {
            field455 = null;
        }
        ++field457;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 == 52) {
            ++field459;
            if (class279.method1878(0, arg0)) {
                client.method1920(class128.field2119[arg0], -1, arg5, arg3, arg7, arg2, arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
    public static final void method238(byte arg0) {
        if (arg0 >= -115) {
            method238((byte) -114);
        }
        if (~class78.field1297.toLowerCase().indexOf("microsoft") == 0) {
            class91.field1442[47] = 73;
            class91.field1442[45] = 26;
            if (class78.field1308 != null) {
                class91.field1442[520] = 59;
                class91.field1442[222] = 58;
                class91.field1442[192] = 28;
            } else {
                class91.field1442[192] = 58;
                class91.field1442[222] = 59;
            }
            class91.field1442[44] = 71;
            class91.field1442[61] = 27;
            class91.field1442[46] = 72;
            class91.field1442[92] = 74;
            class91.field1442[93] = 43;
            class91.field1442[59] = 57;
            class91.field1442[91] = 42;
        } else {
            class91.field1442[192] = 58;
            class91.field1442[222] = 59;
            class91.field1442[186] = 57;
            class91.field1442[187] = 27;
            class91.field1442[221] = 43;
            class91.field1442[189] = 26;
            class91.field1442[223] = 28;
            class91.field1442[188] = 71;
            class91.field1442[220] = 74;
            class91.field1442[191] = 73;
            class91.field1442[190] = 72;
            class91.field1442[219] = 42;
        }
        ++field456;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field449 = arg0.method996(65280);
                        }
                    } else {
                        this.field453 = arg0.method996(arg2 ^ 65285);
                    }
                } else {
                    this.field454 = arg0.method1012(4);
                }
            } else {
                this.field451 = arg0.method996(65280);
            }
        } else {
            this.field462 = arg0.method1012(4);
        }
        ++field450;
        if (arg2 != 5) {
            method238((byte) -114);
        }
    }
}
