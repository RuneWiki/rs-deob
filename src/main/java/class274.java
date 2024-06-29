import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class274 extends class238 {

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    public static int field4382 = 255;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lwb;")
    public static class76 field4376 = new class76(5000);

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "[J")
    public static long[] field4386 = new long[1000];

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "B")
    public byte field4384;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "Lig;")
    public class136 field4378;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(Z)[B")
    public final byte[] method733(boolean arg0) {
        ++field4381;
        if (!arg0) {
            return null;
        } else if (!super.field3756 && this.field4378.field2263.length - this.field4384 <= this.field4378.field2231) {
            return this.field4378.field2263;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
    public static final void method1854(int arg0) {
        class2.field12.method1156(-69);
        if (arg0 == -334) {
            ++field4379;
            class270.field4337.method1156(-48);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
    public static final int method1855(int arg0, int arg1) {
        ++field4385;
        int var2 = 8 % ((arg0 - 21) / 63);
        if (arg1 > 0) {
            return 1;
        } else {
            return ~arg1 > -1 ? -1 : 0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
    public static final void method1856(int arg0, int arg1) {
        ++field4388;
        if (~class146.field2401 != ~arg0) {
            if (class146.field2401 == 0) {
                class212.method1406(-2);
            }
            if (arg0 == 40) {
                class199.method1350((byte) -66);
            }
            if (arg0 != 40 && class178.field2965 != null) {
                class178.field2965.method294((byte) -8);
                class178.field2965 = null;
            }
            if (~arg0 == -26 || ~arg0 == -29) {
                class45.field824 = 1;
                class36.field619 = 0;
                class87.field1404 = 1;
                class12.field164 = 0;
                class161.field2631 = 0;
                class229.method1525(true, 301);
            }
            if (arg0 == 25 || arg0 == 10) {
                class28.method251((byte) 113);
            }
            if (~arg0 == -6) {
                class208.method1392(class35.field594, (byte) 66);
            } else {
                class118.method864((byte) 120);
            }
            boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
            boolean var3 = class146.field2401 == arg1 || class146.field2401 == 10 || class146.field2401 == 28;
            if (!var2 != !var3) {
                if (!var2) {
                    class32.method276(12543, 2);
                    class57.field1002.method1141(arg1 + -45, true);
                } else {
                    class235.field3726 = class97.field1509;
                    if (field4382 != 0) {
                        class167.method1202(1, 0, 255, false, class97.field1509, class10.field134, 2);
                    } else {
                        class32.method276(12543, 2);
                    }
                    class57.field1002.method1141(-121, false);
                }
            }
            class146.field2401 = arg0;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4386 = null;
        field4376 = null;
        if (arg0 < 114) {
            field4376 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I")
    public final int method734(int arg0) {
        ++field4375;
        if (arg0 > -32) {
            field4382 = 90;
        }
        return this.field4378 == null ? 0 : this.field4378.field2231 * 100 / (this.field4378.field2263.length + -this.field4384);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg7 + -334;
        if (~var8 > arg1) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        ++field4374;
        int var9 = (-class111.field1721 + class282.field4472) * var8 / 100 + class111.field1721;
        int var10 = 2047 & -arg2 + 2048;
        int var11 = arg5 * var9 >> 8;
        int var12 = -arg3 + 2048 & 2047;
        int var13 = 0;
        int var14 = var11;
        int var15 = 0;
        if (var10 != 0) {
            int var16 = class95.field1475[var10];
            int var17 = class95.field1482[var10];
            var15 = -var11 * var17 >> 16;
            var14 = var11 * var16 >> 16;
        }
        if (var12 != 0) {
            int var18 = class95.field1482[var12];
            int var19 = class95.field1475[var12];
            var13 = var14 * var18 >> 16;
            var14 = var14 * var19 >> 16;
        }
        class212.field3400 = arg3;
        class148.field2434 = -var14 + arg4;
        class146.field2408 = arg2;
        class31.field527 = -var13 + arg0;
        class150.field2457 = -var15 + arg6;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I")
    public static final int method1859(int arg0, int arg1) {
        int var2 = arg1 >>> 1;
        if (arg0 != 184601800) {
            field4386 = null;
        }
        int var3 = var2 | var2 >>> 1;
        ++field4377;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1860(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field4383;
        int var9 = arg1 + 1;
        class224.method1504(arg4, arg3, arg0, class114.field1841[arg1], 7);
        int var6 = 93 / ((52 - arg5) / 56);
        int var10 = arg2 - 1;
        class224.method1504(arg4, arg3, arg0, class114.field1841[arg2], 7);
        for (int var7 = var9; ~var7 >= ~var10; ++var7) {
            int[] var8 = class114.field1841[var7];
            var8[arg0] = var8[arg3] = arg4;
        }
    }
}
