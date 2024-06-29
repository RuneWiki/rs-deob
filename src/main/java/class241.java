import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class241 extends class167 {

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field4281 = 0;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "Le;")
    private static class191 field4285 = class54.method368("Jul", 2047);

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "Le;")
    private static class191 field4286 = class54.method368("Sep", 2047);

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "Le;")
    private static class191 field4284 = class54.method368("Nov", 2047);

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "Le;")
    private static class191 field4283 = class54.method368("Jan", 2047);

    @OriginalMember(owner = "client!fk", name = "cb", descriptor = "Le;")
    private static class191 field4292 = class54.method368("Oct", 2047);

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "Le;")
    private static class191 field4277 = class54.method368("Dec", 2047);

    @OriginalMember(owner = "client!fk", name = "bb", descriptor = "Le;")
    private static class191 field4291 = class54.method368("Jun", 2047);

    @OriginalMember(owner = "client!fk", name = "eb", descriptor = "Le;")
    private static class191 field4294 = class54.method368("Apr", 2047);

    @OriginalMember(owner = "client!fk", name = "gb", descriptor = "Le;")
    private static class191 field4296 = class54.method368("May", 2047);

    @OriginalMember(owner = "client!fk", name = "kb", descriptor = "Le;")
    private static class191 field4300 = class54.method368("Feb", 2047);

    @OriginalMember(owner = "client!fk", name = "jb", descriptor = "Le;")
    private static class191 field4299 = class54.method368("Mar", 2047);

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "Le;")
    public static class191 field4280 = class54.method368("Benutzeroberfl-=che geladen)3", 2047);

    @OriginalMember(owner = "client!fk", name = "mb", descriptor = "Le;")
    private static class191 field4302 = class54.method368("Aug", 2047);

    @OriginalMember(owner = "client!fk", name = "Z", descriptor = "[Le;")
    public static class191[] field4289 = new class191[] { field4283, field4300, field4299, field4294, field4296, field4291, field4285, field4302, field4286, field4292, field4284, field4277 };

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public int field4279;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!fk", name = "ab", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!fk", name = "ib", descriptor = "Le;")
    public class191 field4298;

    @OriginalMember(owner = "client!fk", name = "hb", descriptor = "[Lmh;")
    public static class232[] field4297;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)J")
    public static final long method1687(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        return var3 != null && var3.field3535 != null ? var3.field3535.field4498 : 0L;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lwh;IIIIIIZ)V")
    public static final void method1688(class48 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field857.length;
        for (int var9 = 0; var9 < var8; ++var9) {
            int var22 = arg0.field857[var9] - class267.field4716;
            int var23 = arg0.field848[var9] - class22.field319;
            int var24 = arg0.field863[var9] - class73.field1268;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field851 != null) {
                class48.field865[var9] = var25;
                class48.field860[var9] = var28;
                class48.field864[var9] = var29;
            }
            class48.field849[var9] = (var25 << 9) / var29 + class15.field209;
            class48.field856[var9] = (var28 << 9) / var29 + class15.field192;
        }
        class15.field203 = 0;
        int var10 = arg0.field866.length;
        for (int var11 = 0; var11 < var10; ++var11) {
            int var12 = arg0.field866[var11];
            int var13 = arg0.field861[var11];
            int var14 = arg0.field862[var11];
            int var15 = class48.field849[var12];
            int var16 = class48.field849[var13];
            int var17 = class48.field849[var14];
            int var18 = class48.field856[var12];
            int var19 = class48.field856[var13];
            int var20 = class48.field856[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class53.field968 && class266.method1829(class69.field1205 + class15.field209, class178.field3063 + class15.field192, var18, var19, var20, var15, var16, var17)) {
                    class75.field1280 = arg5;
                    class122.field2011 = arg6;
                }
                if (!arg7) {
                    class15.field200 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class15.field195 || var16 > class15.field195 || var17 > class15.field195) {
                        class15.field200 = true;
                    }
                    if (arg0.field851 != null && arg0.field851[var11] != -1) {
                        if (class226.field4074) {
                            if (arg0.field845) {
                                class15.method100(var18, var19, var20, var15, var16, var17, arg0.field847[var11], arg0.field852[var11], arg0.field853[var11], class48.field865[0], class48.field865[1], class48.field865[3], class48.field860[0], class48.field860[1], class48.field860[3], class48.field864[0], class48.field864[1], class48.field864[3], arg0.field851[var11]);
                            } else {
                                class15.method100(var18, var19, var20, var15, var16, var17, arg0.field847[var11], arg0.field852[var11], arg0.field853[var11], class48.field865[var12], class48.field865[var13], class48.field865[var14], class48.field860[var12], class48.field860[var13], class48.field860[var14], class48.field864[var12], class48.field864[var13], class48.field864[var14], arg0.field851[var11]);
                            }
                        } else {
                            int var21 = class15.field199.method1371(17045, arg0.field851[var11]);
                            class15.method101(var18, var19, var20, var15, var16, var17, class153.method1035(var21, arg0.field847[var11]), class153.method1035(var21, arg0.field852[var11]), class153.method1035(var21, arg0.field853[var11]));
                        }
                    } else if (arg0.field847[var11] != 12345678) {
                        class15.method101(var18, var19, var20, var15, var16, var17, arg0.field847[var11], arg0.field852[var11], arg0.field853[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
    public static final void method1689(int arg0) {
        class179.field3065 = null;
        class209.field3714 = arg0;
        class21.field301 = null;
        class147.field2480 = null;
        class205.field3633 = null;
        class68.field1190 = null;
        class213.field3760 = null;
        class183.field3151 = null;
        class3.field23 = null;
        class145.field2443 = null;
        class137.field2296 = null;
        ++field4293;
        class81.field1362 = null;
        class226.field4067.method1178(true);
        class51.field926 = null;
        class206.field3660 = null;
        class110.field1849 = null;
        class49.field869 = null;
        class29.field410 = null;
        class154.field2655 = null;
        class161.field2734 = null;
        class110.field1831 = null;
        class225.field4006 = null;
        class266.field4712 = null;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)J")
    public final long method1690(byte arg0) {
        if (arg0 >= -92) {
            field4289 = null;
        }
        ++field4275;
        return Long.MAX_VALUE & super.field2825;
    }

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)V")
    public final void method1691(int arg0) {
        if (arg0 != 0) {
            field4283 = null;
        }
        ++field4282;
        super.field2825 = class27.method198((byte) -116) + 500L | Long.MIN_VALUE & super.field2825;
        class252.field4471.method22(115, this);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)I")
    public final int method1692(byte arg0) {
        ++field4295;
        if (arg0 != -3) {
            this.field4301 = 17;
        }
        return (int) (super.field1713 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static void method1693(boolean arg0) {
        field4291 = null;
        field4283 = null;
        field4302 = null;
        field4284 = null;
        field4285 = null;
        field4299 = null;
        field4286 = null;
        field4300 = null;
        field4277 = null;
        field4297 = null;
        field4296 = null;
        field4292 = null;
        field4294 = null;
        field4280 = null;
        if (!arg0) {
            method1688((class48) null, 29, 0, -84, 69, 79, 95, false);
        }
        field4289 = null;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public final void method1694(byte arg0) {
        super.field2825 |= Long.MIN_VALUE;
        ++field4278;
        if (arg0 == -90) {
            if (~this.method1690((byte) -94) == -1L) {
                class200.field3577.method22(53, this);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)I")
    public final int method1695(byte arg0) {
        if (arg0 > -88) {
            this.field4279 = 79;
        }
        ++field4288;
        return (int) super.field1713;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V")
    public class241(int arg0, int arg1) {
        super.field1713 = (long) arg0 << 32 | (long) arg1;
    }
}
