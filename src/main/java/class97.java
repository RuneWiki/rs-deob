import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class97 extends class89 {

    @OriginalMember(owner = "client!bg", name = "Q", descriptor = "I")
    private int field1641 = 0;

    @OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
    private int field1642 = 1;

    @OriginalMember(owner = "client!bg", name = "bb", descriptor = "I")
    private int field1652 = 0;

    @OriginalMember(owner = "client!bg", name = "U", descriptor = "Lda;")
    public static class275 field1645 = class255.method1672(92, "sch-Utteln:");

    @OriginalMember(owner = "client!bg", name = "ab", descriptor = "Lda;")
    public static class275 field1651 = class255.method1672(101, "<col=80ff00>");

    @OriginalMember(owner = "client!bg", name = "T", descriptor = "Lda;")
    private static class275 field1644 = class255.method1672(114, "Opened title screen");

    @OriginalMember(owner = "client!bg", name = "V", descriptor = "I")
    public static int field1646 = -1;

    @OriginalMember(owner = "client!bg", name = "Y", descriptor = "Lda;")
    public static class275 field1649 = field1644;

    @OriginalMember(owner = "client!bg", name = "S", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!bg", name = "W", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!bg", name = "X", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!bg", name = "Z", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!bg", name = "cb", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)V")
    public static final void method688(int arg0) {
        class169.field2938 &= 2047;
        int var1 = class192.field3308 >> 7;
        int var2 = class182.field3124 >> 7;
        if (class275.field4794 < 128) {
            class275.field4794 = 128;
        }
        if (~class275.field4794 < -384) {
            class275.field4794 = 383;
        }
        ++field1653;
        int var3 = class89.method647(class182.field3124, class159.field2790, class192.field3308, -57);
        int var4 = 0;
        if (~var1 < -4 && var2 > 3 && ~var1 > -101 && var2 < 100) {
            for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 + -4; var6 <= var2 + 4; ++var6) {
                    int var7 = class159.field2790;
                    if (~var7 > -4 && (class72.field1168[1][var5][var6] & 2) == 2) {
                        ++var7;
                    }
                    int var8 = var3 - class92.field1575[var7][var5][var6];
                    if (~var4 > ~var8) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (arg0 > var9) {
            var9 = 32768;
        }
        if (~class172.field2993 > ~var9) {
            class172.field2993 += (var9 - class172.field2993) / 24;
        } else if (class172.field2993 > var9) {
            class172.field2993 += (var9 - class172.field2993) / 80;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field1643;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field1642 = arg1.method564((byte) 90);
                }
            } else {
                this.field1641 = arg1.method564((byte) 108);
            }
        } else {
            this.field1652 = arg1.method564((byte) 110);
        }
        if (arg0 != -20503) {
            this.field1642 = 59;
        }
    }

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field1648;
        if (arg0 != 1) {
            this.field1652 = 31;
        }
        class250.method1642((byte) 111);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field1503.method229(arg0, (byte) -127);
            if (super.field1503.field664) {
                int var4 = class91.field1552[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class65.field1070; ++var6) {
                    int var7 = class185.field3172[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (this.field1652 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field1642 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field1642;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field1641 != 0) {
                        if (this.field1641 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class143.field2519[(4080 & var12) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            ++field1650;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "(I)V")
    public static void method689(int arg0) {
        field1644 = null;
        field1645 = null;
        field1649 = null;
        field1651 = null;
        int var1 = -76 / ((-13 - arg0) / 51);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class97() {
        super(0, true);
    }
}
