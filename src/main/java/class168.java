import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class168 extends class189 {

    @OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
    private int field3474 = 4096;

    @OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
    private int field3470 = 0;

    @OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
    public static int field3466 = 0;

    @OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
    public static int field3471 = 0;

    @OriginalMember(owner = "client!sf", name = "sb", descriptor = "Lgg;")
    public static class63 field3477 = class116.method911(43, ": ");

    @OriginalMember(owner = "client!sf", name = "qb", descriptor = "Lid;")
    public static class78 field3475 = new class78(4096);

    @OriginalMember(owner = "client!sf", name = "vb", descriptor = "[S")
    public static short[] field3480 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!sf", name = "ib", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!sf", name = "nb", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!sf", name = "ob", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!sf", name = "tb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!sf", name = "ub", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!sf", name = "wb", descriptor = "[Lwb;")
    public static class200[] field3481;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljc;II)Lwb;")
    public static final class200 method1134(class85 arg0, int arg1, int arg2) {
        if (arg1 <= 56) {
            field3475 = null;
        }
        ++field3465;
        return !class47.method470(0, arg2, arg0) ? null : class69.method635(-9448);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field3467;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field3811 = ~arg2.method64(31790) == -2;
                }
            } else {
                this.field3474 = arg2.method46((byte) 65);
            }
        } else {
            this.field3470 = arg2.method46((byte) 65);
        }
        if (arg1 < 32) {
            this.method77(35, (byte) -18, (class3) null);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(BI)Lpc;")
    public static final class138 method1135(byte arg0, int arg1) {
        ++field3472;
        class138 var2 = (class138) class117.field2609.method289((long) arg1, -130079263);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class21.field495.method745(16, arg1, arg0 ^ 126);
            class138 var4 = new class138();
            if (var3 != null) {
                var4.method997(new class3(var3), 0);
            }
            class117.field2609.method293(false, (long) arg1, var4);
            if (arg0 != 126) {
                field3477 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
    public static void method1136(byte arg0) {
        field3480 = null;
        if (arg0 < -103) {
            field3481 = null;
            field3477 = null;
            field3475 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class168() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        if (arg1 < 34) {
            return null;
        } else {
            ++field3479;
            int[][] var3 = super.field3808.method237(-1, arg0);
            if (super.field3808.field561) {
                int[][] var4 = this.method1244((byte) 20, arg0, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                int[] var8 = var3[0];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; var11 < class54.field1430; ++var11) {
                    int var12 = var7[var11];
                    int var13 = var5[var11];
                    int var14 = var6[var11];
                    if (this.field3470 > var12) {
                        var8[var11] = this.field3470;
                    } else if (~this.field3474 <= ~var12) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field3474;
                    }
                    if (this.field3470 > var13) {
                        var10[var11] = this.field3470;
                    } else if (this.field3474 < var13) {
                        var10[var11] = this.field3474;
                    } else {
                        var10[var11] = var13;
                    }
                    if (this.field3470 > var14) {
                        var9[var11] = this.field3470;
                    } else if (this.field3474 >= var14) {
                        var9[var11] = var14;
                    } else {
                        var9[var11] = this.field3474;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
    public static final void method1137(int arg0, long arg1) {
        ++field3468;
        if (arg1 != 0L) {
            if (~class99.field2338 <= -101) {
                class100.method843((byte) -111, 0, class151.field3175, class33.field799);
            } else {
                class63 var3 = class89.method770(arg1, false).method576((byte) 32);
                for (int var4 = 0; class99.field2338 > var4; ++var4) {
                    if (~class11.field264[var4] == ~arg1) {
                        class100.method843((byte) -102, 0, class151.field3175, class89.method772((byte) 61, new class63[] { var3, class187.field3783 }));
                        return;
                    }
                }
                for (int var5 = arg0; ~class37.field868 < ~var5; ++var5) {
                    if (~class80.field1938[var5] == ~arg1) {
                        class100.method843((byte) -95, 0, class151.field3175, class89.method772((byte) 47, new class63[] { class132.field2870, var3, class167.field3454 }));
                        return;
                    }
                }
                if (var3.method568(class3.field72.field1552, (byte) -127)) {
                    class100.method843((byte) -104, 0, class151.field3175, class104.field2402);
                } else {
                    class11.field264[class99.field2338] = arg1;
                    class140.field3001[class99.field2338++] = class89.method770(arg1, false);
                    ++class11.field276;
                    client.field705 = class72.field1807;
                    class141.field3031.method854(68, true);
                    class141.field3031.method32((byte) 72, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static final void method1138(int arg0) {
        class188.field3791.method282((byte) -44);
        ++field3478;
        class184.field3741.method282((byte) -123);
        if (arg0 != -21340) {
            method1137(-123, 115L);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3473;
        int[] var3 = super.field3825.method681(arg1, (byte) -101);
        if (arg0 != 0) {
            field3475 = null;
        }
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, arg1, arg0 ^ 11433);
            for (int var5 = 0; ~class54.field1430 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field3470) {
                    if (this.field3474 < var6) {
                        var3[var5] = this.field3474;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field3470;
                }
            }
        }
        return var3;
    }
}
