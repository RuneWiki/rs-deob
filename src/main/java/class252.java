import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class252 extends class112 {

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public int field4323 = 0;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public int field4334 = 4;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public int field4327 = 4;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public int field4324 = 1638;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public int field4333 = 4;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "[B")
    private byte[] field4326 = new byte[512];

    @OriginalMember(owner = "client!qj", name = "mb", descriptor = "Z")
    public boolean field4349 = true;

    @OriginalMember(owner = "client!qj", name = "bb", descriptor = "I")
    public static int field4338 = 0;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "Lwm;")
    public static class152 field4329 = class157.method1048(" steht bereits auf Ihrer Freunde)2Liste(Q", 115);

    @OriginalMember(owner = "client!qj", name = "lb", descriptor = "Z")
    public static boolean field4348 = false;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Lwm;")
    public static class152 field4331 = class157.method1048("www)2wtqa", 95);

    @OriginalMember(owner = "client!qj", name = "gb", descriptor = "Lwm;")
    public static class152 field4343 = class157.method1048("Moteur son pr-Bpar-B", 106);

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!qj", name = "Z", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!qj", name = "ab", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!qj", name = "cb", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!qj", name = "db", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!qj", name = "fb", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!qj", name = "hb", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!qj", name = "jb", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!qj", name = "eb", descriptor = "Loe;")
    public static class127 field4341;

    @OriginalMember(owner = "client!qj", name = "kb", descriptor = "Lah;")
    public static class205 field4347;

    @OriginalMember(owner = "client!qj", name = "ib", descriptor = "[S")
    private short[] field4345;

    @OriginalMember(owner = "client!qj", name = "nb", descriptor = "[S")
    private short[] field4350;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V", line = 9)
    public static void method1738(byte arg0) {
        field4343 = null;
        field4341 = null;
        if (arg0 > -82) {
            field4335 = 2;
        }
        field4331 = null;
        field4347 = null;
        field4329 = null;
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)I", line = 23)
    public static final int method1739(int arg0) {
        field4325++;
        if (class323.field5640 == 0) {
            return 0;
        } else {
            if (arg0 != 22566) {
                method1738((byte) -49);
            }
            return class239.field3928[class323.field5640].method36();
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIBIIII)I", line = 44)
    private final int method1740(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4346++;
        int var8 = arg3 - 4096;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = arg4 & 0xFFF;
        int var12 = var9 & 0xFF;
        int var13 = var11 - 4096;
        int var14 = class278.field4755[var11];
        if (arg1 <= var10) {
            var10 = 0;
        }
        int var15 = this.field4326[arg5 + var12] & 0x3;
        int var16;
        if (var15 > 1) {
            var16 = var15 == 2 ? var11 - arg3 : -arg3 + -var11;
        } else {
            var16 = var15 == 0 ? arg3 + var11 : -var11 + arg3;
        }
        int var17 = 4 / ((arg2 - 37) / 53);
        int var18 = var10 & 0xFF;
        int var19 = this.field4326[arg5 + var18] & 0x3;
        int var20;
        if (var19 <= 1) {
            var20 = var19 == 0 ? arg3 + var13 : -var13 + arg3;
        } else {
            var20 = var19 == 2 ? var13 - arg3 : -var13 - arg3;
        }
        int var21 = this.field4326[arg6 + var12] & 0x3;
        int var22 = ((var20 - var16) * var14 >> 12) + var16;
        int var23;
        if (var21 <= 1) {
            var23 = var21 == 0 ? var8 + var11 : var8 - var11;
        } else {
            var23 = var21 == 2 ? var11 - var8 : -var11 - var8;
        }
        int var24 = this.field4326[arg6 + var18] & 0x3;
        int var25;
        if (var24 > 1) {
            var25 = var24 == 2 ? var13 - var8 : -var13 - var8;
        } else {
            var25 = var24 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var26 = ((var25 - var23) * var14 >> 12) + var23;
        return ((var26 - var22) * arg0 >> 12) + var22;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 270)
    public class252() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lah;BLah;)I", line = 122)
    public static final int method1741(class205 arg0, byte arg1, class205 arg2) {
        int var3 = 0;
        if (arg0.method1361(arg1 - 97, class176.field2840)) {
            var3++;
        }
        field4321++;
        if (arg0.method1361(-1, class80.field1118)) {
            var3++;
        }
        if (arg0.method1361(-1, class169.field2654)) {
            var3++;
        }
        if (arg2.method1361(arg1 ^ 0xFFFFFF9F, class176.field2840)) {
            var3++;
        }
        if (arg2.method1361(-1, class80.field1118)) {
            var3++;
        }
        if (arg1 != 96) {
            method1738((byte) -25);
        }
        if (arg2.method1361(-1, class169.field2654)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lah;Z[Ldc;)V", line = 154)
    public static final void method1742(class205 arg0, boolean arg1, class109[] arg2) {
        class316.field5492 = arg2;
        field4330++;
        if (arg1) {
            field4338 = 38;
        }
        class48.field754 = arg0;
        class3.field48 = new boolean[class316.field5492.length];
        class31.field520.method1224((byte) 56);
        int var3 = class48.field754.method1374(class241.field3950, (byte) -52);
        int[] var4 = class48.field754.method1366(0, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class31.field520.method1214(false, class143.method900(new class291(class48.field754.method1381(var3, var4[var5], 0)), 0));
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 182)
    public final void method673(int arg0) {
        if (arg0 != 8) {
            this.field4326 = (byte[]) null;
        }
        this.field4326 = class28.method226(this.field4323, 255);
        this.method1743(true);
        for (int var2 = this.field4333 - 1; var2 >= 1; var2--) {
            short var3 = this.field4350[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4333--;
        }
        field4342++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 220)
    private final void method1743(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field4324 > 0) {
            this.field4350 = new short[this.field4333];
            this.field4345 = new short[this.field4333];
            for (int var3 = 0; var3 < this.field4333; var3++) {
                this.field4350[var3] = (short) ((int) (Math.pow((double) ((float) this.field4324 / 4096.0F), (double) var3) * 4096.0D));
                this.field4345[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field4350 != null && this.field4350.length == this.field4333) {
            this.field4345 = new short[this.field4333];
            for (int var2 = 0; var2 < this.field4333; var2++) {
                this.field4345[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field4322++;
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)I", line = 259)
    public static final int method1744(byte arg0) {
        field4332++;
        if (arg0 != 18) {
            method1738((byte) 9);
        }
        return class183.field2915;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILhi;)V", line = 297)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field4349 = arg2.method2011(-114) == 1;
        } else if (arg1 == 1) {
            this.field4333 = arg2.method2011(-27);
        } else if (arg1 == 2) {
            this.field4324 = arg2.method1986(true);
            if (this.field4324 < 0) {
                this.field4350 = new short[this.field4333];
                for (int var5 = 0; var5 < this.field4333; var5++) {
                    this.field4350[var5] = (short) arg2.method1986(true);
                }
            }
        } else if (arg1 == 3) {
            this.field4334 = this.field4327 = arg2.method2011(arg0 ^ 0xFFFF8657);
        } else if (arg1 == 4) {
            this.field4323 = arg2.method2011(-113);
        } else if (arg1 == 5) {
            this.field4334 = arg2.method2011(-100);
        } else if (arg1 == 6) {
            this.field4327 = arg2.method2011(-72);
        }
        if (arg0 != 31164) {
            method1746((byte) -71, false);
        }
        field4328++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)[I", line = 377)
    public final int[] method53(byte arg0, int arg1) {
        int[] var3 = this.field1585.method1952(arg1, (byte) 122);
        if (this.field1585.field4935) {
            this.method1747(arg1, true, var3);
        }
        if (arg0 != -3) {
            field4335 = 80;
        }
        field4336++;
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Loe;II)Lwm;", line = 399)
    public static final class152 method1745(class127 arg0, int arg1, int arg2) {
        field4339++;
        if (arg1 != 14242) {
            method1744((byte) 97);
        }
        if (!client.method1759(arg0).method553(arg2, (byte) -112) && arg0.field1928 == null) {
            return null;
        } else if (arg0.field1918 == null || arg0.field1918.length <= arg2 || arg0.field1918[arg2] == null || arg0.field1918[arg2].method1025(arg1 ^ 0xFFFFC833).method1000(0) == 0) {
            return class317.field5495 ? class195.method1307(new class152[] { class201.field3250, class38.method280(86, arg2) }, (byte) 29) : null;
        } else {
            return arg0.field1918[arg2];
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V", line = 427)
    public static final void method1746(byte arg0, boolean arg1) {
        field4344++;
        class323.field5638 = arg1;
        if (class323.field5638) {
            int var2 = class73.field1058.method2021((byte) 74);
            int var3 = class73.field1058.method1990((byte) 112);
            int var4 = class73.field1058.method1976((byte) 86);
            int var5 = class73.field1058.method1957(810960104);
            class73.field1058.method1068(8);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    for (int var8 = 0; var8 < 13; var8++) {
                        int var9 = class73.field1058.method1075(false, 1);
                        if (var9 == 1) {
                            class148.field2271[var6][var7][var8] = class73.field1058.method1075(false, 26);
                        } else {
                            class148.field2271[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            class73.field1058.method1064(4);
            int var10 = (class288.field4882 - class73.field1058.field4946) / 16;
            class249.field4217 = new int[var10][4];
            for (int var11 = 0; var11 < var10; var11++) {
                for (int var12 = 0; var12 < 4; var12++) {
                    class249.field4217[var11][var12] = class73.field1058.method2012(-32);
                }
            }
            int var13 = class73.field1058.method1979(0);
            class284.field4835 = new int[var10];
            class202.field3267 = new byte[var10][];
            class107.field1534 = new byte[var10][];
            class41.field662 = new int[var10];
            class170.field2677 = new int[var10];
            class148.field2274 = (byte[][]) null;
            class63.field952 = new int[var10];
            class323.field5637 = new byte[var10][];
            class133.field2041 = new byte[var10][];
            class104.field1495 = new int[var10];
            int var14 = 0;
            class186.field2956 = null;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class148.field2271[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 14 & 0x3FF;
                            int var20 = (var18 & 0x3FFE) >> 3;
                            int var21 = (var19 / 8 << 8) + var20 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class284.field4835[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                int var23 = var21 & 0xFF;
                                int var24 = var21 >> 8 & 0xFF;
                                class284.field4835[var14] = var21;
                                class41.field662[var14] = class73.field1063.method1374(class195.method1307(new class152[] { class81.field1139, class38.method280(107, var24), class120.field1692, class38.method280(126, var23) }, (byte) 29), (byte) -52);
                                class63.field952[var14] = class73.field1063.method1374(class195.method1307(new class152[] { class69.field1009, class38.method280(92, var24), class120.field1692, class38.method280(118, var23) }, (byte) 29), (byte) -52);
                                class170.field2677[var14] = class73.field1063.method1374(class195.method1307(new class152[] { class17.field234, class38.method280(127, var24), class120.field1692, class38.method280(117, var23) }, (byte) 29), (byte) -52);
                                class104.field1495[var14] = class73.field1063.method1374(class195.method1307(new class152[] { class194.field3097, class38.method280(76, var24), class120.field1692, class38.method280(73, var23) }, (byte) 29), (byte) -52);
                                var14++;
                            }
                        }
                    }
                }
            }
            class229.method1575(var3, var13, var2, 24015, var5, false, var4);
        } else {
            int var25 = (class288.field4882 - class73.field1058.field4946) / 16;
            class249.field4217 = new int[var25][4];
            for (int var26 = 0; var26 < var25; var26++) {
                for (int var27 = 0; var27 < 4; var27++) {
                    class249.field4217[var26][var27] = class73.field1058.method1995(109);
                }
            }
            int var28 = class73.field1058.method1979(0);
            int var29 = class73.field1058.method1997(22720);
            boolean var30 = false;
            int var31 = class73.field1058.method1979(0);
            int var32 = class73.field1058.method1957(810960104);
            int var33 = class73.field1058.method1976((byte) 86);
            if ((var33 / 8 == 48 || (var33 / 8) == 49) && var28 / 8 == 48) {
                var30 = true;
            }
            class148.field2274 = (byte[][]) null;
            class104.field1495 = new int[var25];
            class202.field3267 = new byte[var25][];
            if (var33 / 8 == 48 && (var28 / 8) == 148) {
                var30 = true;
            }
            class284.field4835 = new int[var25];
            class170.field2677 = new int[var25];
            class63.field952 = new int[var25];
            class186.field2956 = null;
            class41.field662 = new int[var25];
            class107.field1534 = new byte[var25][];
            class133.field2041 = new byte[var25][];
            class323.field5637 = new byte[var25][];
            int var34 = 0;
            for (int var35 = (var33 - 6) / 8; var35 <= ((var33 + 6) / 8); var35++) {
                for (int var36 = (var28 - 6) / 8; var36 <= ((var28 + 6) / 8); var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var30 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class284.field4835[var34] = var37;
                        class41.field662[var34] = -1;
                        class63.field952[var34] = -1;
                        class170.field2677[var34] = -1;
                        class104.field1495[var34] = -1;
                    } else {
                        class284.field4835[var34] = var37;
                        class41.field662[var34] = class73.field1063.method1374(class195.method1307(new class152[] { class81.field1139, class38.method280(87, var35), class120.field1692, class38.method280(87, var36) }, (byte) 29), (byte) -52);
                        class63.field952[var34] = class73.field1063.method1374(class195.method1307(new class152[] { class69.field1009, class38.method280(118, var35), class120.field1692, class38.method280(81, var36) }, (byte) 29), (byte) -52);
                        class170.field2677[var34] = class73.field1063.method1374(class195.method1307(new class152[] { class17.field234, class38.method280(93, var35), class120.field1692, class38.method280(87, var36) }, (byte) 29), (byte) -52);
                        class104.field1495[var34] = class73.field1063.method1374(class195.method1307(new class152[] { class194.field3097, class38.method280(125, var35), class120.field1692, class38.method280(79, var36) }, (byte) 29), (byte) -52);
                    }
                    var34++;
                }
            }
            class229.method1575(var29, var31, var32, 24015, var28, false, var33);
        }
        if (arg0 < 75) {
            method1744((byte) 75);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ[I)V", line = 689)
    public final void method1747(int arg0, boolean arg1, int[] arg2) {
        if (!arg1) {
            method1738((byte) 89);
        }
        field4340++;
        int var4 = class114.field1620[arg0] * this.field4327;
        if (this.field4333 == 1) {
            int var38 = this.field4345[0] << 12;
            short var39 = this.field4350[0];
            int var40 = this.field4327 * var38 >> 12;
            int var41 = this.field4334 * var38 >> 12;
            int var42 = var4 * var38 >> 12;
            int var43 = var42 >> 12;
            int var44 = var42 & 0xFFF;
            int var45 = var43 + 1;
            if (var40 <= var45) {
                var45 = 0;
            }
            int var46 = this.field4326[var43 & 0xFF] & 0xFF;
            int var47 = this.field4326[var45 & 0xFF] & 0xFF;
            int var48 = class278.field4755[var44];
            if (this.field4349) {
                for (int var49 = 0; var49 < class58.field889; var49++) {
                    int var50 = class131.field1992[var49] * this.field4334;
                    int var51 = this.method1740(var48, var41, (byte) -65, var44, var38 * var50 >> 12, var46, var47);
                    int var52 = var39 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class58.field889; var53++) {
                    int var54 = class131.field1992[var53] * this.field4334;
                    int var55 = this.method1740(var48, var41, (byte) 119, var44, var38 * var54 >> 12, var46, var47);
                    arg2[var53] = var39 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field4350[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field4345[0] << 12;
            int var7 = this.field4334 * var6 >> 12;
            int var8 = this.field4327 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = var9 & 0xFFF;
            int var12 = var10 + 1;
            int var13 = this.field4326[var10 & 0xFF] & 0xFF;
            if (var12 >= var8) {
                var12 = 0;
            }
            int var14 = this.field4326[var12 & 0xFF] & 0xFF;
            int var15 = class278.field4755[var11];
            for (int var16 = 0; var16 < class58.field889; var16++) {
                int var17 = class131.field1992[var16] * this.field4334;
                int var18 = this.method1740(var15, var7, (byte) 100, var11, var6 * var17 >> 12, var13, var14);
                arg2[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field4333; var19++) {
            short var20 = this.field4350[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field4345[var19] << 12;
                int var22 = var4 * var21 >> 12;
                int var23 = this.field4327 * var21 >> 12;
                int var24 = this.field4334 * var21 >> 12;
                int var25 = var22 >> 12;
                int var26 = var22 & 0xFFF;
                int var27 = this.field4326[var25 & 0xFF] & 0xFF;
                int var28 = class278.field4755[var26];
                int var29 = var25 + 1;
                if (var23 <= var29) {
                    var29 = 0;
                }
                int var30 = this.field4326[var29 & 0xFF] & 0xFF;
                if (this.field4349 && (this.field4333 - 1) == var19) {
                    for (int var31 = 0; var31 < class58.field889; var31++) {
                        int var32 = class131.field1992[var31] * this.field4334;
                        int var33 = this.method1740(var28, var24, (byte) -27, var26, var21 * var32 >> 12, var27, var30);
                        int var34 = (var20 * var33 >> 12) + arg2[var31];
                        arg2[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class58.field889; var35++) {
                        int var36 = class131.field1992[var35] * this.field4334;
                        int var37 = this.method1740(var28, var24, (byte) 108, var26, var21 * var36 >> 12, var27, var30);
                        arg2[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }
}
