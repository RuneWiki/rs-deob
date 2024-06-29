import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class244 extends class89 {

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    private int field4257 = 585;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Lda;")
    public static class275 field4256 = class255.method1672(96, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Lda;")
    public static class275 field4252 = class255.method1672(116, "(U5");

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "Lda;")
    public static class275 field4263 = class255.method1672(101, "blinken2:");

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[I")
    public static int[] field4253;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "[I")
    public static int[] field4264;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lij;I)V")
    public static final void method1590(class85 arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 20041) {
            field4256 = null;
        }
        while (~class145.field2541 < ~var2) {
            int var3 = arg0.method593((byte) -106);
            int var4 = arg0.method608(53);
            if (~var4 == -65536) {
                var4 = -1;
            }
            if (class139.field2425[var3] != null) {
                class139.field2425[var3].field1452 = var4;
            }
            ++var2;
        }
        ++field4255;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public static final void method1591(byte arg0) {
        if (class52.field866 != null) {
            class52.field866.method1402(1);
            class52.field866 = null;
        }
        if (arg0 >= -105) {
            field4253 = null;
        }
        ++field4254;
        class109.method806((byte) 28);
        class173.method1176();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class173.field3003[var1].method868(21744);
        }
        class168.method1153((byte) 108);
        System.gc();
        class226.method1468(2, 59);
        class5.field69 = -1;
        class243.field4243 = false;
        class214.method1375(true, -8291);
        class139.field2428 = false;
        class16.field237 = 0;
        class234.field4083 = 0;
        for (int var2 = 0; ~var2 > ~class114.field2014.length; ++var2) {
            class114.field2014[var2] = null;
        }
        class181.field3118 = 0;
        class32.field486 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class16.field238[var3] = null;
            class13.field208[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class31.field478[var4] = null;
        }
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var6 = 0; ~var6 > -105; ++var6) {
                for (int var7 = 0; var7 < 104; ++var7) {
                    class118.field2122[var5][var6][var7] = null;
                }
            }
        }
        class31.method184(-25218);
        class256.field4512 = 0;
        class23.method150((byte) 125, true);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILfd;)Lda;")
    public static final class275 method1592(int arg0, class229 arg1) {
        ++field4262;
        if (class73.method483((byte) -102, client.method635(arg1)) == 0) {
            return null;
        } else {
            if (arg0 <= 92) {
                method1591((byte) -1);
            }
            if (arg1.field3957 != null && ~arg1.field3957.method1845(false).method1838(3) != -1) {
                return arg1.field3957;
            } else {
                return class143.field2518 ? class70.field1138 : null;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4257 = arg1.method608(22);
        }
        if (arg0 != -20503) {
            this.method49(-20, (class85) null, -91);
        }
        ++field4259;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method1593(boolean arg0) {
        field4253 = null;
        field4264 = null;
        if (!arg0) {
            field4256 = null;
            field4252 = null;
            field4263 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        int[] var3 = super.field1503.method229(arg0, (byte) -119);
        ++field4260;
        if (arg1) {
            return null;
        } else {
            if (super.field1503.field664) {
                int var4 = class91.field1552[arg0];
                for (int var5 = 0; ~class65.field1070 < ~var5; ++var5) {
                    int var6 = class185.field3172[var5];
                    if (~var6 < ~this.field4257 && ~var6 > ~(-this.field4257 + 4096) && var4 > 2048 - this.field4257 && this.field4257 + 2048 > var4) {
                        int var7 = -var6 + 2048;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (2048 - this.field4257);
                        var3[var5] = -var10 + 4096;
                    } else if (var6 > -this.field4257 + 2048 && var6 < this.field4257 + 2048) {
                        int var11 = var4 - 2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field4257;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field4257 + 2048);
                    } else if (var4 >= this.field4257 && var4 <= -this.field4257 + 4096) {
                        if (var6 >= this.field4257 && -this.field4257 + 4096 >= var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field4257 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 - 2048;
                        int var20 = var19 < 0 ? -var19 : var19;
                        int var21 = var20 - this.field4257;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field4257);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, true);
    }
}
