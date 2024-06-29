import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class129 extends class232 {

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "I")
    private int field2244 = 4096;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "Lhi;")
    public static class82 field2247 = class95.method664((byte) -53, "");

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "Lhi;")
    public static class82 field2248 = field2247;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "Lhi;")
    public static class82 field2239 = field2247;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "Lhi;")
    public static class82 field2246 = class95.method664((byte) -60, "violet:");

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "Lva;")
    public static class209 field2243 = new class209(5000);

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "Lhi;")
    private static class82 field2254 = class95.method664((byte) -103, "Loaded config");

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "Lhi;")
    public static class82 field2253 = field2254;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "[I")
    public static int[] field2242;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIB)V", line = 12)
    public static final void method897(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = 0;
        int var9 = arg4;
        field2245++;
        int var10 = 0;
        int var11 = arg0 - arg5;
        int var12 = arg4 - arg5;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var14 << 1;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var16 << 1;
        int var19 = var12 * var12;
        int var20 = arg4 << 1;
        int var21 = var12 << 1;
        int var22 = (1 - var20) * var13 + var15;
        int var23 = var19 << 1;
        int var24 = var14 - (var20 - 1) * var17;
        int var25 = (1 - var21) * var16 + var23;
        int var26 = var19 - ((var21 - 1) * var18);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var19 << 2;
        int var31 = var15 * 3;
        int var32 = (var20 - 3) * var17;
        int var33 = (var21 - 3) * var18;
        int var34 = var23 * 3;
        int var35 = var28;
        if (arg7 != -85) {
            field2251 = 26;
        }
        int var36 = (var12 - 1) * var29;
        int var37 = (arg4 - 1) * var27;
        int var38 = var30;
        if (arg6 >= class60.field931 && arg6 <= class29.field399) {
            int[] var39 = class73.field1117[arg6];
            int var40 = class163.method1179(arg2 - arg0, class207.field3623, class200.field3443, (byte) -113);
            int var41 = class163.method1179(arg0 + arg2, class207.field3623, class200.field3443, (byte) -82);
            int var42 = class163.method1179(arg2 - var11, class207.field3623, class200.field3443, (byte) -59);
            int var43 = class163.method1179(arg2 + var11, class207.field3623, class200.field3443, (byte) -125);
            class114.method780(arg7 ^ 0x6, var40, var42, arg1, var39);
            class114.method780(102, var42, var43, arg3, var39);
            class114.method780(arg7 ^ 0x6E, var43, var41, arg1, var39);
        }
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var31;
                    var31 += var28;
                    var24 += var35;
                    var35 += var28;
                }
            }
            if (var24 < 0) {
                var8++;
                var22 += var31;
                var31 += var28;
                var24 += var35;
                var35 += var28;
            }
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var26 += var38;
                        var38 += var30;
                        var25 += var34;
                        var34 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var38;
                    var10++;
                    var25 += var34;
                    var38 += var30;
                    var34 += var30;
                }
                var25 += -var36;
                var36 -= var29;
                var26 += -var33;
                var33 -= var29;
            }
            var22 += -var37;
            var37 -= var27;
            var9--;
            var24 += -var32;
            var32 -= var27;
            int var45 = arg6 - var9;
            int var46 = arg6 + var9;
            if (class60.field931 <= var46 && class29.field399 >= var45) {
                int var47 = class163.method1179(arg2 + var8, class207.field3623, class200.field3443, (byte) -78);
                int var48 = class163.method1179(arg2 - var8, class207.field3623, class200.field3443, (byte) -87);
                if (var44) {
                    int var49 = class163.method1179(arg2 + var10, class207.field3623, class200.field3443, (byte) -96);
                    int var50 = class163.method1179(arg2 - var10, class207.field3623, class200.field3443, (byte) -117);
                    if (var45 >= class60.field931) {
                        int[] var51 = class73.field1117[var45];
                        class114.method780(-35, var48, var50, arg1, var51);
                        class114.method780(101, var50, var49, arg3, var51);
                        class114.method780(-126, var49, var47, arg1, var51);
                    }
                    if (class29.field399 >= var46) {
                        int[] var52 = class73.field1117[var46];
                        class114.method780(arg7 + 11, var48, var50, arg1, var52);
                        class114.method780(97, var50, var49, arg3, var52);
                        class114.method780(99, var49, var47, arg1, var52);
                    }
                } else {
                    if (class60.field931 <= var45) {
                        class114.method780(77, var48, var47, arg1, class73.field1117[var45]);
                    }
                    if (class29.field399 >= var46) {
                        class114.method780(103, var48, var47, arg1, class73.field1117[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 216)
    public class129() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(IB)[I", line = 234)
    public final int[] method80(int arg0, byte arg1) {
        field2241++;
        int[] var3 = this.field4008.method131((byte) -119, arg0);
        if (this.field4008.field256) {
            int[] var4 = this.method1649(0, (byte) 103, class209.field3684 & arg0 - 1);
            int[] var5 = this.method1649(0, (byte) 87, arg0);
            int[] var6 = this.method1649(0, (byte) 78, arg0 + 1 & class209.field3684);
            for (int var7 = 0; var7 < class54.field858; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field2244;
                int var9 = (var5[class65.field1024 & var7 + 1] - var5[class65.field1024 & var7 - 1]) * this.field2244;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        int var16 = -18 % ((arg1 + 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZBIII)V", line = 286)
    public static final void method898(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2238++;
        class166.field2909 = 0L;
        int var5 = class284.method1972((byte) 127);
        boolean var6 = false;
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (arg1 < 58) {
            method898(false, (byte) -3, 69, -18, 22);
        }
        if (var5 <= 0 == arg4 > 0) {
            var6 = true;
        }
        if (class120.field2119.startsWith("mac") && arg4 > 0) {
            arg0 = true;
        }
        if (arg0 && arg4 > 0) {
            var6 = true;
        }
        class291.method2011(arg2, 0, arg0, arg4, var6, arg3, var5);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBZ)Lhi;", line = 319)
    public static final class82 method899(int arg0, byte arg1, boolean arg2) {
        field2240++;
        int var3 = 64 % ((17 - arg1) / 49);
        return class192.method1335(10, arg2, false, arg0);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V", line = 330)
    public static void method900(byte arg0) {
        if (arg0 <= 23) {
            field2254 = (class82) null;
        }
        field2247 = null;
        field2242 = null;
        field2239 = null;
        field2254 = null;
        field2253 = null;
        field2243 = null;
        field2248 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBLbc;)V", line = 351)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field2244 = arg2.method1090(false);
        }
        field2237++;
        if (arg1 != -19) {
            this.method80(82, (byte) -119);
        }
    }
}
