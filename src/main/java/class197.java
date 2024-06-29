import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class197 {

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "[B")
    private byte[] field3495 = new byte[4];

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lqe;")
    private class176 field3499;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field3480;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "J")
    private long field3501;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "[I")
    public static int[] field3489 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field3496 = 0;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
    public static boolean field3490 = false;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Ldj;")
    public static class44 field3497 = class89.method650(255, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Ldj;")
    public static class44 field3498 = class89.method650(255, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Ldj;")
    private static class44 field3494 = class89.method650(255, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Ldj;")
    public static class44 field3493 = field3494;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Ldj;")
    public static class44 field3500 = field3494;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    private int field3481;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    private int field3484;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field3478;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[B")
    private byte[] field3482;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III[Lmc;[I[I)V")
    public static final void method1276(int arg0, int arg1, int arg2, class134[] arg3, int[] arg4, int[] arg5) {
        field3491++;
        if (arg2 != 30146) {
            method1278(1, 62, 17, 9);
        }
        if (arg1 <= arg0) {
            return;
        }
        int var6 = arg0 - 1;
        int var7 = arg1 + 1;
        int var8 = (arg0 + arg1) / 2;
        class134 var9 = arg3[var8];
        arg3[var8] = arg3[arg0];
        arg3[arg0] = var9;
        while (var7 > var6) {
            boolean var10 = true;
            do {
                var7--;
                for (int var11 = 0; var11 < 4; var11++) {
                    int var12;
                    int var13;
                    if (arg4[var11] == 2) {
                        var12 = var9.field2391;
                        var13 = arg3[var7].field2391;
                    } else if (arg4[var11] == 1) {
                        var13 = arg3[var7].field2394;
                        var12 = var9.field2394;
                        if (var12 == -1 && arg5[var11] == 1) {
                            var12 = 2001;
                        }
                        if (var13 == -1 && arg5[var11] == 1) {
                            var13 = 2001;
                        }
                    } else if (arg4[var11] == 3) {
                        var13 = arg3[var7].field2405 ? 1 : 0;
                        var12 = var9.field2405 ? 1 : 0;
                    } else {
                        var12 = var9.field2402;
                        var13 = arg3[var7].field2402;
                    }
                    if (var12 != var13) {
                        if ((arg5[var11] != 1 || var12 >= var13) && (arg5[var11] != 0 || var13 >= var12)) {
                            var10 = false;
                        }
                        break;
                    }
                    if (var11 == 3) {
                        var10 = false;
                    }
                }
            } while (var10);
            boolean var14 = true;
            do {
                var6++;
                for (int var15 = 0; var15 < 4; var15++) {
                    int var16;
                    int var17;
                    if (arg4[var15] == 2) {
                        var16 = arg3[var6].field2391;
                        var17 = var9.field2391;
                    } else if (arg4[var15] == 1) {
                        var16 = arg3[var6].field2394;
                        var17 = var9.field2394;
                        if (var16 == -1 && arg5[var15] == 1) {
                            var16 = 2001;
                        }
                        if (var17 == -1 && arg5[var15] == 1) {
                            var17 = 2001;
                        }
                    } else if (arg4[var15] == 3) {
                        var16 = arg3[var6].field2405 ? 1 : 0;
                        var17 = var9.field2405 ? 1 : 0;
                    } else {
                        var17 = var9.field2402;
                        var16 = arg3[var6].field2402;
                    }
                    if (var16 != var17) {
                        if ((arg5[var15] != 1 || var17 <= var16) && (arg5[var15] != 0 || var16 <= var17)) {
                            var14 = false;
                        }
                        break;
                    }
                    if (var15 == 3) {
                        var14 = false;
                    }
                }
            } while (var14);
            if (var6 < var7) {
                class134 var18 = arg3[var6];
                arg3[var6] = arg3[var7];
                arg3[var7] = var18;
            }
        }
        method1276(arg0, var7, 30146, arg3, arg4, arg5);
        method1276(var7 + 1, arg1, 30146, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1277(int arg0) {
        field3500 = null;
        if (arg0 != 6) {
            return;
        }
        field3494 = null;
        field3489 = null;
        field3498 = null;
        field3493 = null;
        field3497 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
    public static final void method1278(int arg0, int arg1, int arg2, int arg3) {
        field3492++;
        if (arg1 != Integer.MAX_VALUE) {
            return;
        }
        class223 var4 = class96.method678(true, arg0, arg2);
        if (var4 != null && var4.field4123 != null) {
            class140 var5 = new class140();
            var5.field2507 = var4;
            var5.field2506 = var4.field4123;
            class150.method972(var5, (byte) -127);
        }
        class202.field3614 = true;
        class33.field585 = arg0;
        class4.field51 = arg3;
        class41.field773 = arg2;
        class225.method1457(-118, var4);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
    public static final boolean method1279(int arg0, int arg1) {
        if (arg0 >= -28) {
            return false;
        } else {
            field3479++;
            return (-arg1 & arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field3483++;
        if (!arg4) {
            field3489 = null;
        }
        int var9 = arg7;
        int var10 = arg6 - arg0;
        int var11 = 0;
        int var12 = arg7 - arg0;
        int var13 = arg6 * arg6;
        int var14 = var10 * var10;
        int var15 = arg7 * arg7;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var16 << 1;
        int var19 = arg7 << 1;
        int var20 = var14 << 1;
        int var21 = var13 << 1;
        int var22 = var15 - (var19 - 1) * var21;
        int var23 = (1 - var19) * var13 + var17;
        int var24 = var12 << 1;
        int var25 = (1 - var24) * var14 + var18;
        int var26 = var16 - (var24 - 1) * var20;
        int var27 = var15 << 2;
        int var28 = var16 << 2;
        int var29 = var17 * 3;
        int var30 = var13 << 2;
        int var31 = var14 << 2;
        int var32 = var18 * 3;
        int var33 = (var19 - 3) * var21;
        int var34 = (var24 - 3) * var20;
        int var35 = var27;
        int var36 = (arg7 - 1) * var30;
        int var37 = var28;
        int var38 = (var12 - 1) * var31;
        if (arg1 >= class14.field267 && arg1 <= class57.field1068) {
            int[] var39 = class108.field1979[arg1];
            int var40 = class201.method1296(class70.field1337, -128, arg2 - arg6, class70.field1321);
            int var41 = class201.method1296(class70.field1337, -126, arg2 + arg6, class70.field1321);
            int var42 = class201.method1296(class70.field1337, -127, arg2 - var10, class70.field1321);
            int var43 = class201.method1296(class70.field1337, -126, arg2 + var10, class70.field1321);
            class42.method290(var39, -7, var40, var42, arg5);
            class42.method290(var39, -7, var42, var43, arg3);
            class42.method290(var39, -7, var43, var41, arg5);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var11++;
                        var26 += var37;
                        var25 += var32;
                        var37 += var28;
                        var32 += var28;
                    }
                }
                if (var26 < 0) {
                    var11++;
                    var25 += var32;
                    var32 += var28;
                    var26 += var37;
                    var37 += var28;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var31;
                var38 -= var31;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var22 += var35;
                    var35 += var27;
                    var23 += var29;
                    var29 += var27;
                }
            }
            if (var22 < 0) {
                var23 += var29;
                var22 += var35;
                var8++;
                var29 += var27;
                var35 += var27;
            }
            var23 += -var36;
            var22 += -var33;
            var36 -= var30;
            var9--;
            var33 -= var30;
            int var45 = arg1 - var9;
            int var46 = arg1 + var9;
            if (class14.field267 <= var46 && var45 <= class57.field1068) {
                int var47 = class201.method1296(class70.field1337, -125, arg2 + var8, class70.field1321);
                int var48 = class201.method1296(class70.field1337, -126, arg2 - var8, class70.field1321);
                if (var44) {
                    int var49 = class201.method1296(class70.field1337, -126, arg2 + var11, class70.field1321);
                    int var50 = class201.method1296(class70.field1337, -126, arg2 - var11, class70.field1321);
                    if (class14.field267 <= var45) {
                        int[] var51 = class108.field1979[var45];
                        class42.method290(var51, -7, var48, var50, arg5);
                        class42.method290(var51, -7, var50, var49, arg3);
                        class42.method290(var51, -7, var49, var47, arg5);
                    }
                    if (class57.field1068 >= var46) {
                        int[] var52 = class108.field1979[var46];
                        class42.method290(var52, -7, var48, var50, arg5);
                        class42.method290(var52, -7, var50, var49, arg3);
                        class42.method290(var52, -7, var49, var47, arg5);
                    }
                } else {
                    if (var45 >= class14.field267) {
                        class42.method290(class108.field1979[var45], -7, var48, var47, arg5);
                    }
                    if (class57.field1068 >= var46) {
                        class42.method290(class108.field1979[var46], -7, var48, var47, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)[B")
    public final byte[] method1281(int arg0) throws IOException {
        field3488++;
        if (class27.method193((byte) 117) > this.field3501) {
            throw new IOException("fdt");
        } else if (arg0 == 4) {
            if (this.field3480 == 0) {
                if (this.field3499.field3043 == 2) {
                    throw new IOException("fds");
                }
                if (this.field3499.field3043 == 1) {
                    this.field3478 = (DataInputStream) this.field3499.field3040;
                    this.field3480 = 1;
                }
            }
            if (this.field3480 == 1) {
                int var2 = this.field3478.available();
                if (var2 > 0) {
                    if (var2 + this.field3484 > 4) {
                        var2 = 4 - this.field3484;
                    }
                    this.field3484 += this.field3478.read(this.field3495, this.field3484, var2);
                    if (this.field3484 == 4) {
                        int var3 = (new class66(this.field3495)).method528(true);
                        this.field3480 = 2;
                        this.field3482 = new byte[var3];
                    }
                }
            }
            if (this.field3480 == 2) {
                int var4 = this.field3478.available();
                if (var4 > 0) {
                    if (this.field3482.length < var4 + this.field3481) {
                        var4 = this.field3482.length - this.field3481;
                    }
                    this.field3481 += this.field3478.read(this.field3482, this.field3481, var4);
                    if (this.field3482.length == this.field3481) {
                        return this.field3482;
                    }
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static final void method1282(int arg0) {
        field3487++;
        if (class42.field779 == 72) {
            int var1 = class218.field3957.method534(-5738);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class82.field1607[var2];
            int var5 = class218.field3957.method534(arg0 ^ 0x1669);
            int var6 = (var5 >> 4 & 0x7) + class166.field2870;
            int var7 = (var5 & 0x7) + class74.field1412;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class173.method1101(-1, class194.field3403, var3, var4, var2, -27776, -1, var7, var6, 0);
            }
        } else if (class42.field779 == 243) {
            int var8 = class218.field3957.method506(255);
            int var9 = (var8 & 0x7) + class74.field1412;
            int var10 = class166.field2870 + (var8 >> 4 & 0x7);
            int var11 = var10 + class218.field3957.method505(false);
            int var12 = var9 + class218.field3957.method505(false);
            int var13 = class218.field3957.method514((byte) -74);
            int var14 = class218.field3957.method500(arg0 + 86);
            int var15 = class218.field3957.method506(255) * 4;
            int var16 = class218.field3957.method506(255) * 4;
            int var17 = class218.field3957.method500(arg0 ^ 0xFFFFFFA3);
            int var18 = class218.field3957.method500(arg0 ^ 0xFFFFFFB8);
            int var19 = class218.field3957.method506(255);
            int var20 = class218.field3957.method506(arg0 + 256);
            if (var10 >= 0 && var9 >= 0 && var10 < 104 && var9 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var14 != 65535) {
                int var21 = var10 * 128 + 64;
                int var22 = var11 * 128 + 64;
                int var23 = var12 * 128 + 64;
                int var24 = var9 * 128 + 64;
                class179 var25 = new class179(var14, class194.field3403, var21, var24, class40.method278(var24, class194.field3403, var21, (byte) 101) - var15, class46.field868 + var17, var18 + class46.field868, var19, var20, var13, var16);
                var25.method1132(var23, class40.method278(var23, class194.field3403, var22, (byte) 101) - var16, true, var22, var17 + class46.field868);
                class227.field4266.method1185(new class119(var25), (byte) -110);
            }
        } else if (class42.field779 == 176) {
            int var26 = class218.field3957.method506(255);
            int var27 = (var26 >> 4 & 0x7) + class166.field2870;
            int var28 = (var26 & 0x7) + class74.field1412;
            int var29 = class218.field3957.method500(arg0 ^ 0xFFFFFF8C);
            int var30 = class218.field3957.method500(arg0 ^ 0xFFFFFFC7);
            int var31 = class218.field3957.method500(115);
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                class190 var32 = client.field599[class194.field3403][var27][var28];
                if (var32 != null) {
                    for (class136 var33 = (class136) var32.method1189(0); var33 != null; var33 = (class136) var32.method1192((byte) -83)) {
                        class207 var34 = var33.field2440;
                        if ((var29 & 0x7FFF) == var34.field3712 && var34.field3704 == var30) {
                            var34.field3704 = var31;
                            break;
                        }
                    }
                    class40.method279((byte) -98, var27, var28);
                }
            }
        } else {
            if (class42.field779 == 101) {
                int var35 = class218.field3957.method506(255);
                int var36 = (var35 & 0x7) + class74.field1412;
                int var37 = (var35 >> 4 & 0x7) + class166.field2870;
                int var38 = class218.field3957.method500(arg0 ^ 0xFFFFFFA8);
                int var39 = class218.field3957.method506(255);
                int var40 = class218.field3957.method506(arg0 + 256);
                int var41 = var39 & 0x7;
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var42 = var39 >> 4 & 0xF;
                if (var37 >= 0 && var36 >= 0 && var37 < 104 && var36 < 104) {
                    int var43 = var42 + 1;
                    if (class96.field1774.field2240[0] >= var37 - var43 && class96.field1774.field2240[0] <= var37 + var43 && var36 - var43 <= class96.field1774.field2235[0] && class96.field1774.field2235[0] <= var36 + var43 && class226.field4254 != 0 && var41 > 0 && class73.field1401 < 50 && var38 != -1) {
                        class163.field2821[class73.field1401] = var38;
                        class53.field966[class73.field1401] = var41;
                        class73.field1403[class73.field1401] = var40;
                        class23.field378[class73.field1401] = null;
                        class87.field1669[class73.field1401] = (var37 << 16) + (var36 << 8) + var42;
                        class73.field1401++;
                    }
                }
            }
            if (class42.field779 == 19) {
                int var44 = class218.field3957.method512((byte) 45);
                int var45 = (var44 >> 4 & 0x7) + class166.field2870;
                int var46 = (var44 & 0x7) + class74.field1412;
                int var47 = class218.field3957.method487(arg0 ^ 0x7FA1);
                int var48 = class218.field3957.method529((byte) 123);
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    class207 var49 = new class207();
                    var49.field3712 = var47;
                    var49.field3704 = var48;
                    if (client.field599[class194.field3403][var45][var46] == null) {
                        client.field599[class194.field3403][var45][var46] = new class190();
                    }
                    client.field599[class194.field3403][var45][var46].method1185(new class136(var49), (byte) -110);
                    class40.method279((byte) -98, var45, var46);
                }
            } else if (class42.field779 == 114) {
                int var50 = class218.field3957.method534(arg0 - 5737);
                int var51 = (var50 & 0x7) + class74.field1412;
                int var52 = class166.field2870 + (var50 >> 4 & 0x7);
                int var53 = class218.field3957.method504((byte) -124);
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = class82.field1607[var54];
                int var57 = class218.field3957.method531((byte) -19);
                if (var57 == 65535) {
                    var57 = -1;
                }
                if (var52 >= 0 && var51 >= 0 && var52 < 103 && var51 < 103) {
                    if (var56 == 0) {
                        class33 var58 = class203.method1310(class194.field3403, var52, var51);
                        if (var58 != null) {
                            int var59 = Integer.MAX_VALUE & (int) (var58.field581 >>> 32);
                            if (var54 == 2) {
                                var58.field576 = new class180(var59, 2, var55 + 4, class194.field3403, var52, var51, var57, false, var58.field576);
                                var58.field578 = new class180(var59, 2, var55 + 1 & 0x3, class194.field3403, var52, var51, var57, false, var58.field578);
                            } else {
                                var58.field576 = new class180(var59, var54, var55, class194.field3403, var52, var51, var57, false, var58.field576);
                            }
                        }
                    }
                    if (var56 == 1) {
                        class98 var60 = class64.method478(class194.field3403, var52, var51);
                        if (var60 != null) {
                            int var61 = (int) (var60.field1811 >>> 32) & Integer.MAX_VALUE;
                            if (var54 == 4 || var54 == 5) {
                                var60.field1813 = new class180(var61, 4, var55, class194.field3403, var52, var51, var57, false, var60.field1813);
                            } else if (var54 == 6) {
                                var60.field1813 = new class180(var61, 4, var55 + 4, class194.field3403, var52, var51, var57, false, var60.field1813);
                            } else if (var54 == 7) {
                                var60.field1813 = new class180(var61, 4, (var55 + 2 & 0x3) + 4, class194.field3403, var52, var51, var57, false, var60.field1813);
                            } else if (var54 == 8) {
                                var60.field1813 = new class180(var61, 4, var55 + 4, class194.field3403, var52, var51, var57, false, var60.field1813);
                                var60.field1804 = new class180(var61, 4, (var55 + 2 & 0x3) + 4, class194.field3403, var52, var51, var57, false, var60.field1804);
                            }
                        }
                    }
                    if (var56 == 2) {
                        if (var54 == 11) {
                            var54 = 10;
                        }
                        class106 var62 = class78.method595(class194.field3403, var52, var51);
                        if (var62 != null) {
                            var62.field1947 = new class180((int) (var62.field1953 >>> 32) & Integer.MAX_VALUE, var54, var55, class194.field3403, var52, var51, var57, false, var62.field1947);
                        }
                    }
                    if (var56 == 3) {
                        class220 var63 = class153.method990(class194.field3403, var52, var51);
                        if (var63 != null) {
                            var63.field3977 = new class180(Integer.MAX_VALUE & (int) (var63.field3997 >>> 32), 22, var55, class194.field3403, var52, var51, var57, false, var63.field3977);
                        }
                    }
                }
            } else if (class42.field779 == 16) {
                int var64 = class218.field3957.method500(66);
                int var65 = class218.field3957.method506(255);
                int var66 = (var65 >> 4 & 0x7) + class166.field2870;
                int var67 = (var65 & 0x7) + class74.field1412;
                int var68 = class218.field3957.method506(255);
                int var69 = var68 & 0x3;
                int var70 = var68 >> 2;
                int var71 = class82.field1607[var70];
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    class173.method1101(var64, class194.field3403, var69, var71, var70, -27776, -1, var67, var66, 0);
                }
            } else if (class42.field779 == 85) {
                int var72 = class218.field3957.method529((byte) 123);
                int var73 = class218.field3957.method529((byte) 123);
                int var74 = class218.field3957.method504((byte) -124);
                int var75 = (var74 >> 4 & 0x7) + class166.field2870;
                int var76 = (var74 & 0x7) + class74.field1412;
                int var77 = class218.field3957.method487(-32674);
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && class123.field2188 != var72) {
                    class207 var78 = new class207();
                    var78.field3704 = var77;
                    var78.field3712 = var73;
                    if (client.field599[class194.field3403][var75][var76] == null) {
                        client.field599[class194.field3403][var75][var76] = new class190();
                    }
                    client.field599[class194.field3403][var75][var76].method1185(new class136(var78), (byte) -110);
                    class40.method279((byte) -98, var75, var76);
                }
            } else {
                if (class42.field779 == 148) {
                    int var79 = class218.field3957.method529((byte) 123);
                    int var80 = class218.field3957.method529((byte) 123);
                    int var81 = class218.field3957.method529((byte) 123);
                    byte var82 = class218.field3957.method535(-1);
                    int var83 = class218.field3957.method529((byte) 123);
                    byte var84 = class218.field3957.method495((byte) 52);
                    byte var85 = class218.field3957.method535(arg0);
                    byte var86 = class218.field3957.method495((byte) 105);
                    int var87 = class218.field3957.method512((byte) 122);
                    int var88 = (var87 & 0x7) + class74.field1412;
                    int var89 = (var87 >> 4 & 0x7) + class166.field2870;
                    int var90 = class218.field3957.method534(arg0 - 5737);
                    int var91 = var90 & 0x3;
                    int var92 = var90 >> 2;
                    int var93 = class82.field1607[var92];
                    class24 var94;
                    if (class123.field2188 == var79) {
                        var94 = class96.field1774;
                    } else {
                        var94 = class122.field2168[var79];
                    }
                    if (var94 != null) {
                        class39 var95 = class40.method281(true, var81);
                        int var96;
                        int var97;
                        if (var91 == 1 || var91 == 3) {
                            var97 = var95.field698;
                            var96 = var95.field725;
                        } else {
                            var96 = var95.field698;
                            var97 = var95.field725;
                        }
                        int var98 = (var97 + 1 >> 1) + var89;
                        int var99 = (var97 >> 1) + var89;
                        int var100 = (var96 + 1 >> 1) + var88;
                        int var101 = (var96 >> 1) + var88;
                        int[][] var102 = class211.field3771[class194.field3403];
                        int var103 = (var88 << 7) + (var96 << 6);
                        int var104 = (var89 << 7) + (var97 << 6);
                        int var105 = var102[var99][var101] + var102[var98][var101] + var102[var99][var100] + var102[var98][var100] >> 2;
                        class88 var106 = var95.method270(var102, var103, false, arg0 ^ 0x7F, var105, var91, var104, var92);
                        if (var106 != null) {
                            if (var86 > var85) {
                                byte var107 = var86;
                                var86 = var85;
                                var85 = var107;
                            }
                            class173.method1101(-1, class194.field3403, 0, var93, 0, -27776, var83 + 1, var88, var89, var80 + 1);
                            var94.field393 = var105;
                            var94.field415 = (class127) var106.field1674;
                            var94.field408 = var80 + class46.field868;
                            var94.field399 = var89 * 128 + var97 * 64;
                            var94.field414 = var85 + var89;
                            var94.field418 = class46.field868 + var83;
                            if (var84 > var82) {
                                byte var108 = var84;
                                var84 = var82;
                                var82 = var108;
                            }
                            var94.field402 = var88 + var82;
                            var94.field398 = var86 + var89;
                            var94.field396 = var88 * 128 + var96 * 64;
                            var94.field404 = var84 + var88;
                        }
                    }
                }
                if (class42.field779 == 90) {
                    int var109 = class218.field3957.method506(255);
                    int var110 = class166.field2870 + (var109 >> 4 & 0x7);
                    int var111 = class74.field1412 + (var109 & 0x7);
                    int var112 = class218.field3957.method500(119);
                    int var113 = class218.field3957.method506(255);
                    int var114 = class218.field3957.method500(94);
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        int var115 = var111 * 128 + 64;
                        int var116 = var110 * 128 + 64;
                        class139 var117 = new class139(var112, class194.field3403, var116, var115, class40.method278(var115, class194.field3403, var116, (byte) 101) - var113, var114, class46.field868);
                        class234.field4352.method1185(new class184(var117), (byte) -110);
                    }
                } else if (class42.field779 == 171) {
                    int var118 = class218.field3957.method504((byte) -124);
                    int var119 = (var118 >> 4 & 0x7) + class166.field2870;
                    int var120 = (var118 & 0x7) + class74.field1412;
                    int var121 = class218.field3957.method487(-32674);
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104) {
                        class190 var122 = client.field599[class194.field3403][var119][var120];
                        if (var122 != null) {
                            for (class136 var123 = (class136) var122.method1189(0); var123 != null; var123 = (class136) var122.method1192((byte) -110)) {
                                if ((var121 & 0x7FFF) == var123.field2440.field3712) {
                                    var123.method1148(arg0 - 13214);
                                    break;
                                }
                            }
                            if (var122.method1189(0) == null) {
                                client.field599[class194.field3403][var119][var120] = null;
                            }
                            class40.method279((byte) -98, var119, var120);
                        }
                    }
                } else if (arg0 != -1) {
                    method1278(-106, -7, 63, -96);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lvi;Ljava/net/URL;)V")
    public class197(class229 arg0, URL arg1) {
        this.field3499 = arg0.method1498(-67, arg1);
        this.field3480 = 0;
        this.field3501 = class27.method193((byte) 102) + 30000L;
    }
}
