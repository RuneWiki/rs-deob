import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class27 {

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[Z")
    public static boolean[] field335 = new boolean[100];

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[S")
    public static short[] field339 = new short[256];

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field341 = 5063219;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public int field337;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIZIIIIB)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        int var12 = arg2 - arg1;
        field332++;
        int var13 = arg0 - arg5;
        if (arg11 != 54) {
            method169(26, 89, false);
        }
        int var14 = -1;
        int var15 = 983040 / arg9;
        int var16 = 983040 / arg4;
        if (class143.field2096 > 0) {
            if (class123.field1859 <= 10) {
                var14 = class123.field1859 * 5;
            } else {
                var14 = 50 - ((class123.field1859 - 10) * 5);
            }
        }
        for (int var17 = -var16; var17 < (var12 + var16); var17++) {
            int var19 = arg7 + (arg4 * var17) >> 16;
            int var20 = (var17 + 1) * arg4 + arg7 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg10 + var19;
                int var10000 = arg10 + var20;
                int var24 = arg1 + var17 >> 6;
                if (var24 >= 0 && class127.field1913.length - 1 >= var24) {
                    int[][] var25 = class127.field1913[var24];
                    for (int var26 = -var15; var26 < var13 + var15; var26++) {
                        int var27 = arg9 * var26 + arg8 >> 16;
                        int var28 = (var26 + 1) * arg9 + arg8 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            var10000 = arg3 + var28;
                            int var31 = arg3 + var27;
                            int var32 = arg5 + var26 >> 6;
                            if (var32 >= 0 && var32 <= var25.length - 1 && var25[var32] != null) {
                                int var33 = ((arg5 + var26 & 0x3F) << 6) + (arg1 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class288 var35 = class274.method1816(93, var34 - 1);
                                    if (!class217.field3259[var35.field4358]) {
                                        if (var14 != -1 && class129.field1927 == var35.field4358) {
                                            class18 var36 = new class18();
                                            var36.field225 = var22;
                                            var36.field214 = var31;
                                            var36.field218 = var35.field4358;
                                            class45.field719.method987(var36, (byte) -121);
                                        } else {
                                            class120.field1809[var35.field4358].method1274(var22 - 7, var31 - 7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class18 var18 = (class18) class45.field719.method983(7); var18 != null; var18 = (class18) class45.field719.method985((byte) 116)) {
            class111.method719(var18.field225, var18.field214, 15, 16776960, var14);
            class111.method719(var18.field225, var18.field214, 13, 16776960, var14);
            class111.method719(var18.field225, var18.field214, 11, 16776960, var14);
            class111.method719(var18.field225, var18.field214, 9, 16776960, var14);
            class120.field1809[var18.field218].method1274(var18.field225 - 7, var18.field214 + -7);
        }
        class45.field719.method986(-29720);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
    public final boolean method167(int arg0) {
        field334++;
        if (arg0 < 115) {
            field335 = null;
        }
        return (this.field338 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
    public final boolean method168(byte arg0) {
        if (arg0 != 93) {
            field333 = -109;
        }
        field343++;
        return (this.field338 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZ)I")
    public static final int method169(int arg0, int arg1, boolean arg2) {
        field342++;
        class75 var3 = (class75) class166.field2549.method1666((long) arg1, (byte) -97);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else if (arg2) {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1218.length; var5++) {
                if (var3.field1214[var5] == arg0) {
                    var4 += var3.field1218[var5];
                }
            }
            return var4;
        } else {
            return 34;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLrf;)V")
    public static final void method170(byte arg0, class289 arg1) {
        int var2 = arg1.field4496;
        field331++;
        int var3 = -71 / ((-arg0 - 33) / 39);
        if (var2 == 324) {
            if (class256.field3908 == -1) {
                class122.field1852 = arg1.field4497;
                class256.field3908 = arg1.field4414;
            }
            if (class120.field1812.field1254) {
                arg1.field4414 = class256.field3908;
            } else {
                arg1.field4414 = class122.field1852;
            }
        } else if (var2 == 325) {
            if (class256.field3908 == -1) {
                class256.field3908 = arg1.field4414;
                class122.field1852 = arg1.field4497;
            }
            if (class120.field1812.field1254) {
                arg1.field4414 = class122.field1852;
            } else {
                arg1.field4414 = class256.field3908;
            }
        } else if (var2 == 327) {
            arg1.field4531 = 150;
            arg1.field4434 = (int) (Math.sin((double) class270.field4058 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4453 = 5;
            arg1.field4459 = -1;
        } else if (var2 == 328) {
            if (class165.field2537.field1663 == null) {
                arg1.field4459 = 0;
            } else {
                arg1.field4531 = 150;
                arg1.field4434 = (int) (Math.sin((double) class270.field4058 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4453 = 5;
                arg1.field4459 = ((int) class94.method604((byte) 114, class165.field2537.field1663) << 11) + 2047;
                arg1.field4397 = 0;
                arg1.field4542 = class165.field2537.field2303;
                arg1.field4521 = class165.field2537.field2235;
                arg1.field4395 = class165.field2537.field2264;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method171(int arg0) {
        field335 = null;
        if (arg0 <= 126) {
            field341 = 69;
        }
        field339 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Z")
    public final boolean method172(boolean arg0) {
        field330++;
        if (arg0) {
            method171(-31);
        }
        return (this.field338 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Z")
    public final boolean method173(int arg0) {
        if (arg0 == 4) {
            field329++;
            return (this.field338 & 0x4) != 0;
        } else {
            return true;
        }
    }
}
