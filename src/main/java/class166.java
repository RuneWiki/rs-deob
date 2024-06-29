import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class166 extends class101 {

    @OriginalMember(owner = "client!g", name = "o", descriptor = "[I")
    public int[] field2237 = new int[1];

    @OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
    public int[] field2240 = new int[] { -1 };

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Lsw;")
    public static class787 field2239 = new class787(1);

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZIILvq;ZLbca;Lha;I)Lka;", line = 3)
    public final class500 method1195(int arg0, int arg1, boolean arg2, int arg3, int arg4, class489 arg5, boolean arg6, class691 arg7, class65 arg8, int arg9) {
        field2238++;
        class500 var11 = null;
        int var12 = arg0;
        class208 var13 = null;
        if (arg3 != -1) {
            var13 = class719.field10024.method2128((byte) -75, arg3);
        }
        int[] var14 = this.field2240;
        if (var13 != null && var13.field2743 != null) {
            var14 = new int[var13.field2743.length];
            for (int var15 = 0; var15 < var13.field2743.length; var15++) {
                int var16 = var13.field2743[var15];
                if (var16 >= 0 && this.field2240.length > var16) {
                    var14[var15] = this.field2240[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class717 var24 = null;
        class717 var25 = null;
        if (arg5 != null) {
            int var26 = arg5.field6775[arg9];
            var12 = arg0 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class6.field65.method1030(-4849, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method4006((byte) -114, var21);
                var17 |= var24.method4007(!arg2, var21);
                var20 |= var24.method4005(var21, -1);
                var19 |= arg5.field6795;
            }
            if ((arg5.field6792 || class423.field6046) && arg4 != -1 && arg4 < arg5.field6775.length) {
                int var28 = arg5.field6775[arg4];
                var23 = arg5.field6773[arg9];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class6.field65.method1030(-4849, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method4006((byte) -114, var22);
                    var17 |= var25.method4007(false, var22);
                    var20 |= var25.method4005(var22, -1);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method1196(arg7 == null ? null : arg7.field9708, arg6, 5, arg3, var14);
        if (class483.field6678 != null) {
            var11 = (class500) class483.field6678.method1541(-10, var30);
        }
        if (var11 == null || arg8.method517(var11.method325(), var12) != 0) {
            if (var11 != null) {
                var12 = arg8.method498(var12, var11.method325());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class770.field10602.method2467(126, var14[var34]).method2054(arg6, -1, null)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class782[] var35 = new class782[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class770.field10602.method2467(125, var14[var36]).method2040(null, arg6, -28);
                }
            }
            if (var13 != null && var13.field2718 != null) {
                for (int var37 = 0; var37 < var13.field2718.length; var37++) {
                    if (var13.field2718[var37] != null && var35[var37] != null) {
                        int var38 = var13.field2718[var37][0];
                        int var39 = var13.field2718[var37][1];
                        int var40 = var13.field2718[var37][2];
                        int var41 = var13.field2718[var37][3];
                        int var42 = var13.field2718[var37][4];
                        int var43 = var13.field2718[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method4322(var42, 1046089902, var41, var43);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method4336(var40, var38, var39, 103);
                        }
                    }
                }
            }
            class782 var44 = new class782(var35, var35.length);
            if (arg7 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg8.method510(var44, var32, class177.field2362, 64, 850);
            if (arg7 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class320.field4615.length; var46++) {
                        if (arg7.field9708[var45] < class320.field4615[var46][var45].length) {
                            var11.method306(class183.field2454[var46][var45], class320.field4615[var46][var45][arg7.field9708[var45]]);
                        }
                    }
                }
            }
            if (class483.field6678 != null) {
                var11.method295(var12);
                class483.field6678.method1544(true, var11, var30);
            }
        }
        if (arg5 == null || var24 == null) {
            return var11;
        } else {
            class500 var47 = var11.method298((byte) 1, var12, arg2);
            var47.method2889(0, var21, arg1 - 1, arg5.field6795, var24, var22, var23, (byte) -97, var25);
            return var47;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([IZII[I)J", line = 245)
    private final long method1196(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4) {
        field2236++;
        long[] var6 = class644.field8937;
        if (arg2 != 5) {
            return 81L;
        }
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var6[(int) ((var9 ^ (long) arg3) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg0[var14] ^ var11) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg1 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 297)
    public static final void method1197(boolean arg0) {
        class298.field4317.method1294((byte) -85);
        field2242++;
        class473.field6534.method2308(1);
        class381.field5566.method1161(-121);
        class350.field5132.method3736((byte) -46);
        class364.field5309.method3342((byte) -128);
        class770.field10602.method2465((byte) -63);
        class6.field65.method1026(0);
        class784.field10798.method3967((byte) 100);
        class642.field8904.method3237(-1);
        class488.field6763.method2181((byte) -86);
        class89.field1234.method3741(12558);
        class719.field10024.method2126(arg0);
        class159.field2194.method391((byte) 24);
        class495.field6846.method2237((byte) 65);
        class564.field7557.method3256((byte) 48);
        class206.field2703.method3908(-103);
        class457.field6339.method783(-18300);
        class563.field7548.method2281(4681);
        class723.field10061.method4101(true);
        class93.field1329.method4275(0);
        class273.field4057.method2561((byte) -82);
        class493.field6825.method4287(-120);
        class214.method1413((byte) -100);
        class418.method2581(-29152);
        class47.method365(1);
        class570.method3193((byte) 39);
        class589.method3293((byte) -11);
        class527.field7224.method1552(-119);
        class87.field1226.method1552(13);
        class167.field2247.method1552(-120);
        if (!arg0) {
            class549.field7422.method1552(45);
            class173.field2322.method1552(-127);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V", line = 340)
    public static void method1198(boolean arg0) {
        field2239 = null;
        if (arg0) {
            field2239 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 356)
    public static final void method1199(int arg0) {
        class514.field7044 = null;
        class493.field6829 = null;
        class183.field2441 = null;
        class327.field4757 = null;
        class370.field5368 = null;
        class399.field5839 = null;
        class251.field3716 = null;
        class105.field1452 = null;
        class177.field2364 = null;
        class687.field9655 = null;
        class337.field4884 = null;
        class416.field5975 = null;
        if (arg0 >= -84) {
            field2239 = null;
        }
        class179.field2386 = null;
        class397.field5832 = null;
        class418.field5993 = null;
        class558.field7521 = null;
        class497.field6868 = null;
        class541.field7353 = null;
        field2241++;
    }
}
