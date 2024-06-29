import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class554 extends class748 {

    @OriginalMember(owner = "client!pha", name = "M", descriptor = "Z")
    private boolean field7822 = true;

    @OriginalMember(owner = "client!pha", name = "O", descriptor = "Z")
    private boolean field7824 = true;

    @OriginalMember(owner = "client!pha", name = "N", descriptor = "S")
    public static short field7823 = 1;

    @OriginalMember(owner = "client!pha", name = "J", descriptor = "Lju;")
    public static class102 field7819 = new class102(79, 3);

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!pha", name = "L", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!pha", name = "P", descriptor = "I")
    public static int field7825;

    @OriginalMember(owner = "client!pha", name = "Q", descriptor = "Lle;")
    public static class736 field7826;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7818;
        int[] var3 = super.field10407.method3873(arg1 + -255, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field10407.field9527) {
                int[] var4 = this.method4157(0, (byte) 90, this.field7822 ? -arg0 + class150.field2077 : arg0);
                if (this.field7824) {
                    for (int var5 = 0; ~var5 > ~class424.field5889; ++var5) {
                        var3[var5] = var4[class354.field4552 - var5];
                    }
                } else {
                    class34.method244(var4, 0, var3, 0, class424.field5889);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "(B)V")
    public static void method3299(byte arg0) {
        if (arg0 > -107) {
            method3299((byte) -13);
        }
        field7819 = null;
        field7826 = null;
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field7821;
        int[][] var3 = super.field10420.method930(29784, arg0);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field10420.field1979) {
                int[][] var4 = this.method4159(0, arg1, !this.field7822 ? arg0 : -arg0 + class150.field2077);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field7824) {
                    for (int var11 = 0; class424.field5889 > var11; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; class424.field5889 > var12; ++var12) {
                        var8[var12] = var5[-var12 + class354.field4552];
                        var9[var12] = var6[-var12 + class354.field4552];
                        var10[var12] = var7[-var12 + class354.field4552];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "()V")
    public class554() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg1) {
            field7823 = -119;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field10414 = arg2.method194((byte) 119) == 1;
                }
            } else {
                this.field7822 = ~arg2.method194((byte) 119) == -2;
            }
        } else {
            this.field7824 = arg2.method194((byte) 119) == 1;
        }
        ++field7825;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
    public static final int method3300(int arg0, byte[] arg1, String arg2, int arg3) {
        if (arg0 != 5279) {
            field7826 = null;
        }
        ++field7820;
        int var4 = arg3;
        int var5 = arg2.length();
        for (int var6 = 0; ~var5 < ~var6; var6 += 4) {
            int var7 = class103.method700(arg2.charAt(var6), (byte) -52);
            int var8 = ~var5 < ~(var6 + 1) ? class103.method700(arg2.charAt(var6 + 1), (byte) -52) : -1;
            int var9 = ~(var6 + 2) > ~var5 ? class103.method700(arg2.charAt(var6 + 2), (byte) -52) : -1;
            int var10 = ~(var6 + 3) <= ~var5 ? -1 : class103.method700(arg2.charAt(var6 - -3), (byte) -52);
            arg1[arg3++] = (byte) class747.method4153(var7 << 2, var8 >>> 4);
            if (~var9 == 0) {
                break;
            }
            arg1[arg3++] = (byte) class747.method4153(var9 >>> 2, class136.method878(240, var8 << 4));
            if (var10 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class747.method4153(class136.method878(3, var9) << 6, var10);
        }
        return -var4 + arg3;
    }
}
