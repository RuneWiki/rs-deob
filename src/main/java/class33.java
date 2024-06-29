import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class33 extends class646 {

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    private int field472 = 4096;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field475 = 4096;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    private int field476 = 4096;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lau;")
    public static class692 field471 = new class692();

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Lau;")
    public static class692 field477 = new class692();

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field470;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field476 = arg0.method2755((byte) -103);
                }
            } else {
                this.field475 = arg0.method2755((byte) -107);
            }
        } else {
            this.field472 = arg0.method2755((byte) -91);
        }
        if (arg2 < 7) {
            this.field475 = 66;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILufa;)V")
    public static final void method296(int arg0, class141 arg1) {
        ++field473;
        if (arg1.field2369 != null || arg1.field2372 != null) {
            boolean var2 = true;
            int var3 = 0;
            if (arg0 == 32768) {
                while (arg1.field2369.length > var3) {
                    int var4 = -1;
                    if (arg1.field2369 != null) {
                        var4 = arg1.field2369[var3];
                    }
                    if (~var4 == 0) {
                        if (!arg1.method1107(var3, -1, -61)) {
                            var2 = false;
                        }
                    } else {
                        label61: {
                            var2 = false;
                            boolean var5 = false;
                            boolean var6 = false;
                            int var9;
                            int var11;
                            if (~(-1073741824 & var4) == 1073741823) {
                                int var7 = var4 & 268435455;
                                int var8 = var7 >> 14;
                                var9 = arg1.field3155 - 256 - (-class143.field2474 + var8) * 512;
                                int var10 = var7 & 16383;
                                var11 = -((-class63.field917 + var10) * 512) - 256 + arg1.field3154;
                            } else if (~(var4 & 32768) != -1) {
                                int var12 = 32767 & var4;
                                class270 var13 = class76.field1186[var12];
                                if (var13 == null) {
                                    arg1.method1107(var3, -1, -119);
                                    break label61;
                                }
                                var11 = -var13.field3154 + arg1.field3154;
                                var9 = -var13.field3155 + arg1.field3155;
                            } else {
                                class6 var14 = (class6) class314.field4359.method2818(-22803, (long) var4);
                                if (var14 == null) {
                                    arg1.method1107(var3, -1, -77);
                                    break label61;
                                }
                                class88 var15 = var14.field49;
                                var9 = -var15.field3155 + arg1.field3155;
                                var11 = -var15.field3154 + arg1.field3154;
                            }
                            if (~var9 != -1 || ~var11 != -1) {
                                arg1.method1107(var3, (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 16383, -112);
                            }
                        }
                    }
                    ++var3;
                }
                if (var2) {
                    arg1.field2372 = null;
                    arg1.field2369 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V")
    public static void method297(boolean arg0) {
        if (!arg0) {
            field477 = null;
            field471 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[[I")
    public final int[][] method298(int arg0, int arg1) {
        ++field469;
        int[][] var3 = super.field9164.method1002(84, arg1);
        if (arg0 != -12424) {
            this.method295((class465) null, 101, (byte) 45);
        }
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(126, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class89.field1330; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field472 * var12 >> 12;
                    var9[var11] = this.field475 * var13 >> 12;
                    var10[var11] = this.field476 * var14 >> 12;
                } else {
                    var8[var11] = this.field472;
                    var9[var11] = this.field475;
                    var10[var11] = this.field476;
                }
            }
        }
        return var3;
    }
}
