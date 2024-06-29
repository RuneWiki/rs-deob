import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class111 extends class184 {

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "I")
    private int field1500 = -1;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field1501 = new String[100];

    @OriginalMember(owner = "client!aq", name = "G", descriptor = "Lkg;")
    public static class179 field1491 = new class179(76, 3);

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!aq", name = "H", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!aq", name = "I", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!aq", name = "J", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!aq", name = "K", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!aq", name = "O", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!aq", name = "L", descriptor = "[I")
    private int[] field1496;

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V", line = 4)
    public class111() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BILfh;)V", line = 12)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (~arg1 == -1) {
            this.field1500 = arg2.method2758((byte) 92);
        }
        ++field1494;
        int var4 = -123 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V", line = 28)
    public static final void method812(byte arg0, int arg1) {
        ++field1502;
        if (arg0 > 41) {
            class153 var2 = class75.method656(3, 255, arg1);
            var2.method997((byte) 93);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 41)
    public final void method549(int arg0) {
        super.method549(arg0);
        ++field1499;
        this.field1496 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lgp;Lya;Ldt;I)V", line = 50)
    public static final void method813(class36 arg0, class38 arg1, class160 arg2, int arg3) {
        ++field1490;
        class16 var4 = arg0.method266(arg1, false);
        if (arg3 < 30) {
            method813((class36) null, (class38) null, (class160) null, 18);
        }
        if (var4 != null) {
            int var5 = var4.method134();
            if (~var4.method137() < ~var5) {
                var5 = var4.method137();
            }
            byte var6 = 10;
            int var7 = arg2.field2031;
            int var8 = arg2.field2039;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg0.field451 != null) {
                var9 = class209.field2708.method1748(arg0.field451, (class16[]) null, 127, (int[]) null, class315.field4015);
                for (int var12 = 0; var9 > var12; ++var12) {
                    String var13 = class315.field4015[var12];
                    if (var12 < var9 + -1) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class498.field7224.method1780(var13);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                }
                var11 = class498.field7224.method1785() * var9 - -(class498.field7224.method1782() / 2);
            }
            int var15 = var5 / 2 + arg2.field2031;
            if (class241.field3125 + var5 > var7) {
                var7 = class241.field3125;
                var15 = var5 / 2 + class241.field3125 + var6 - -(var10 / 2) + 5;
            } else if (-var5 + class241.field3118 < var7) {
                var7 = -var5 + class241.field3118;
                var15 = -(var5 / 2) + class241.field3118 + -(var10 / 2) + -5 - var6;
            }
            int var16 = arg2.field2039;
            if (class241.field3121 + var5 <= var8) {
                if (var8 > class241.field3110 - var5) {
                    var16 = -var6 + class241.field3110 - var5 / 2 - var11;
                    var8 = class241.field3110 - var5;
                }
            } else {
                var16 = var5 / 2 + class241.field3121 + var6;
                var8 = class241.field3121;
            }
            int var17 = 65535 & (int) (Math.atan2((double) (-arg2.field2031 + var7), (double) (-arg2.field2039 + var8)) / 3.141592653589793D * 32767.0D);
            var4.method140((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg0.field451 != null) {
                var19 = var16;
                var18 = var15 + -5 - var10 / 2;
                var20 = var10 + var18 + 10;
                var21 = class498.field7224.method1785() * var9 + var16 - -3;
                if (~arg0.field462 != -1) {
                    arg1.method364(-var18 + var20, var18, var21 - var16, var16, (byte) -48, arg0.field462);
                }
                if (~arg0.field450 != -1) {
                    arg1.method326(1, var18, -var18 + var20, arg0.field450, -var16 + var21, var16);
                }
                for (int var22 = 0; var9 > var22; ++var22) {
                    String var23 = class315.field4015[var22];
                    if (var22 < var9 + -1) {
                        var23 = var23.substring(0, var23.length() + -4);
                    }
                    class498.field7224.method1779(arg1, var23, var15, var16, arg0.field447, true);
                    var16 += class498.field7224.method1785();
                }
            }
            if (arg0.field477 != -1 || arg0.field451 != null) {
                int var24 = var5 >> 1;
                class52 var25 = new class52(arg2);
                var25.field686 = var19;
                var25.field693 = var20;
                var25.field683 = var18;
                var25.field684 = var8 - -var24;
                var25.field685 = -var24 + var7;
                var25.field690 = var7 - -var24;
                var25.field691 = -var24 + var8;
                var25.field695 = var21;
                class490.field7145.method163(var25, 0);
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)I", line = 196)
    public final int method814(boolean arg0) {
        if (!arg0) {
            this.method549(22);
        }
        ++field1492;
        return this.field1500;
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)V", line = 208)
    public static void method815(int arg0) {
        if (arg0 != -24622) {
            method813((class36) null, (class38) null, (class160) null, -97);
        }
        field1491 = null;
        field1501 = null;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(II)[[I", line = 219)
    public final int[][] method13(int arg0, int arg1) {
        ++field1497;
        int[][] var3 = super.field2416.method3031(arg1 + -28527, arg0);
        if (arg1 != 1) {
            this.field1498 = -38;
        }
        if (super.field2416.field7271) {
            int var4 = this.field1498 * (~class79.field1026 != ~this.field1495 ? this.field1495 * arg0 / class79.field1026 : arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class245.field3167 == this.field1498) {
                for (int var8 = 0; ~var8 > ~class245.field3167; ++var8) {
                    int var9 = this.field1496[var4++];
                    var7[var8] = class378.method2145(var9, 255) << 4;
                    var6[var8] = class378.method2145(4080, var9 >> 4);
                    var5[var8] = class378.method2145(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class245.field3167 > var10; ++var10) {
                    int var11 = this.field1498 * var10 / class245.field3167;
                    int var12 = this.field1496[var4 + var11];
                    var7[var10] = class378.method2145(4080, var12 << 4);
                    var6[var10] = class378.method2145(4080, var12 >> 4);
                    var5[var10] = class378.method2145(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(III)V", line = 283)
    public final void method816(int arg0, int arg1, int arg2) {
        super.method816(arg0, arg1, 86);
        ++field1493;
        if (~this.field1500 <= -1 && class317.field4044 != null) {
            int var4 = class317.field4044.method1642(this.field1500, 0).field1773 ? 64 : 128;
            this.field1496 = class317.field4044.method1641(false, 13724, var4, 1.0F, var4, this.field1500);
            this.field1495 = var4;
            this.field1498 = var4;
        }
        int var5 = 75 % ((arg2 - -48) / 62);
    }
}
