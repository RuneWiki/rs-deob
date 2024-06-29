import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class153 extends class288 {

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    private int field2468 = 204;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    private int field2479 = 1;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    private int field2477 = 1;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2475 = "Loading interfaces - ";

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field2469 = 127;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "Ljg;")
    public static class271 field2470;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)I")
    public static final int method1033(int arg0, int arg1, int arg2, int arg3) {
        ++field2467;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg2;
        } else {
            if (arg1 != -1) {
                method1037((byte) 61);
            }
            if (var4 == 1) {
                return arg3;
            } else {
                return ~var4 == -3 ? -arg2 + 7 : -arg3 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljj;I)V")
    public static final void method1034(class134 arg0, int arg1) {
        class111.field1911 = arg0.method947(-24925, "titlebg");
        int var2 = -30 % ((arg1 - -6) / 40);
        client.field3619 = arg0.method947(-24925, "logo");
        ++field2472;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V")
    public static final void method1035(byte arg0) {
        class92.field1306.method1831(arg0 ^ 104);
        if (arg0 == -8) {
            ++field2473;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field2476;
            int[] var3 = super.field4609.method579((byte) -62, arg1);
            if (super.field4609.field1059) {
                for (int var4 = 0; var4 < class186.field2986; ++var4) {
                    int var5 = class246.field3958[var4];
                    int var6 = this.field2479 * var5 >> 12;
                    int var7 = class1.field15[arg1];
                    int var8 = this.field2477 * var7 >> 12;
                    int var9 = var7 % (4096 / this.field2477) * this.field2477;
                    int var10 = var5 % (4096 / this.field2479) * this.field2479;
                    if (this.field2468 > var9) {
                        for (var6 -= var8; var6 < 0; var6 += 4) {
                        }
                        while (~var6 < -4) {
                            var6 -= 4;
                        }
                        if (var6 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (this.field2468 > var10) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~var10 > ~this.field2468) {
                        int var11;
                        for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field2478;
        if (arg1 != -19) {
            this.field2479 = -46;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2468 = arg0.method1777(-89);
                }
            } else {
                this.field2477 = arg0.method1779(-125);
            }
        } else {
            this.field2479 = arg0.method1779(arg1 ^ 111);
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(B)V")
    public static void method1036(byte arg0) {
        field2470 = null;
        int var1 = -2 % ((arg0 - 12) / 38);
        field2475 = null;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(B)V")
    public static final void method1037(byte arg0) {
        ++field2471;
        if (class169.field2743) {
            class169.field2743 = false;
            class172.field2782 = null;
            int var1 = -105 % ((-35 - arg0) / 50);
            class273.field4409 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IBI)I")
    public static final int method1038(int arg0, byte arg1, int arg2) {
        ++field2474;
        int var3 = arg0 * 57 + arg2;
        if (arg1 != -104) {
            return -13;
        } else {
            int var4 = var3 << 13 ^ var3;
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 - -789221) * var4 - -1376312589;
            return (134165101 & var5) >> 19;
        }
    }
}
