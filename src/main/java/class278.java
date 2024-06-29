import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class278 extends class34 {

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    private int field4282 = 1;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    private int field4286 = 204;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    private int field4287 = 1;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lhl;")
    public static class139 field4281 = new class139(64);

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "Lqg;")
    public static class122 field4289 = new class122();

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "[S")
    public static short[] field4290 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[I")
    public static int[] field4292 = new int[14];

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class278() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lca;B)Lvl;")
    public static final class138 method1851(class54 arg0, byte arg1) {
        ++field4285;
        if (arg1 <= 52) {
            field4290 = null;
        }
        class138 var2 = new class138();
        var2.field2000 = arg0.method423(117);
        var2.field2004 = class69.method544(1, var2.field2000);
        return var2;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
    public static void method1852(byte arg0) {
        field4292 = null;
        field4281 = null;
        if (arg0 < 28) {
            method1852((byte) -21);
        }
        field4289 = null;
        field4290 = null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field4284;
        if (arg0 < 75) {
            field4289 = null;
        }
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            for (int var4 = 0; ~var4 > ~class226.field3527; ++var4) {
                int var5 = class112.field1716[var4];
                int var6 = class199.field2985[arg1];
                int var7 = this.field4282 * var5 >> 12;
                int var8 = this.field4287 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4282) * this.field4282;
                int var10 = var6 % (4096 / this.field4287) * this.field4287;
                if (~var10 > ~this.field4286) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field4286) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4286) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
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

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg0 != 6) {
            field4292 = null;
        }
        ++field4280;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4286 = arg2.method423(arg0 ^ -74);
                }
            } else {
                this.field4287 = arg2.method407(255);
            }
        } else {
            this.field4282 = arg2.method407(arg0 ^ 249);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIZILpk;)V")
    public static final void method1853(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, class237 arg6) {
        class181.field2643 = arg0;
        class141.field2034 = arg1;
        class133.field1952 = arg3;
        ++field4288;
        if (!arg4) {
            field4290 = null;
        }
        class280.field4299 = arg2;
        class37.field649 = arg5;
        class287.field4391 = 1;
        class11.field162 = arg6;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static final void method1854(boolean arg0) {
        class76.field1207.method940(13);
        ++field4283;
        class177.field2591.method940(69);
        if (arg0) {
            method1855(-26, 96, -76, 118L);
        }
        class109.field1599.method940(53);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2, long arg3) {
        class201 var5 = class3.field40[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3024 != null && var5.field3024.field2583 == arg3) {
            return true;
        } else if (var5.field3025 != null && var5.field3025.field1110 == arg3) {
            return true;
        } else if (var5.field3033 != null && var5.field3033.field534 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3026; ++var6) {
                if (var5.field3037[var6].field1880 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
