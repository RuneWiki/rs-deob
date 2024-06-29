import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class61 {

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "[I")
    private int[] field1250 = new int[256];

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
    private int[] field1265 = new int[256];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Llc;")
    public static class69 field1257 = class69.method470((byte) -104, "Feb");

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Llc;")
    public static class69 field1252 = class69.method470((byte) -95, "No reply from loginserver)3");

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Llc;")
    public static class69 field1249 = class69.method470((byte) -112, "Add ignore @whi@");

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "[I")
    public static int[] field1255 = new int[25];

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    private int field1251;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIZ)I")
    public static final int method366(byte[] arg0, int arg1, boolean arg2) {
        field1253++;
        if (arg2) {
            field1257 = null;
        }
        return class18.method106(0, (byte) 9, arg0, arg1);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    private final void method367(byte arg0) {
        field1267++;
        if (arg0 <= 17) {
            this.field1260 = -42;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1250[var11 + 5] + var4;
            int var38 = this.field1250[var11 + 2] + var7;
            int var39 = this.field1250[var11 + 4] + var5;
            int var40 = this.field1250[var11 + 1] + var8;
            int var41 = this.field1250[var11] + var9;
            int var42 = var41 ^ var40 << 11;
            int var43 = var38 + var40;
            int var44 = var43 ^ var38 >>> 2;
            int var45 = this.field1250[var11 + 7] + var2;
            int var46 = var39 + var44;
            int var47 = this.field1250[var11 + 3] + var6;
            int var48 = this.field1250[var11 + 6] + var3;
            int var49 = var42 + var47;
            int var50 = var38 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var46 + var49;
            int var53 = var37 + var51;
            var6 = var52 ^ var46 >>> 16;
            int var54 = var6 + var48;
            int var55 = var46 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var45;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var44;
            int var59 = var4 + var42;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field1265[var11] = var9;
            var7 = var2 + var51;
            this.field1265[var11 + 1] = var8;
            this.field1265[var11 + 2] = var7;
            this.field1265[var11 + 3] = var6;
            this.field1265[var11 + 4] = var5;
            this.field1265[var11 + 5] = var4;
            this.field1265[var11 + 6] = var3;
            this.field1265[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1265[var12] + var9;
            int var14 = this.field1265[var12 + 4] + var5;
            int var15 = this.field1265[var12 + 5] + var4;
            int var16 = this.field1265[var12 + 2] + var7;
            int var17 = this.field1265[var12 + 6] + var3;
            int var18 = this.field1265[var12 + 7] + var2;
            int var19 = this.field1265[var12 + 3] + var6;
            int var20 = this.field1265[var12 + 1] + var8;
            int var21 = var13 ^ var20 << 11;
            int var22 = var16 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var16 >>> 2;
            int var25 = var14 + var24;
            int var26 = var16 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var15 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var25 + var29;
            var5 = var30 ^ var29 << 10;
            int var31 = var6 + var17;
            int var32 = var5 + var18;
            int var33 = var29 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field1265[var12] = var9;
            this.field1265[var12 + 1] = var8;
            this.field1265[var12 + 2] = var7;
            this.field1265[var12 + 3] = var6;
            this.field1265[var12 + 4] = var5;
            this.field1265[var12 + 5] = var4;
            this.field1265[var12 + 6] = var3;
            this.field1265[var12 + 7] = var2;
        }
        this.method370(false);
        this.field1251 = 256;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)I")
    public final int method368(byte arg0) {
        if (arg0 > -75) {
            method369(20);
        }
        if (this.field1251-- == 0) {
            this.method370(false);
            this.field1251 = 255;
        }
        field1264++;
        return this.field1250[this.field1251];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static final void method369(int arg0) {
        field1258++;
        if (class57.field1198 != 0) {
            return;
        }
        class101.field2197[0] = class68.field1483;
        class76.field1700[0] = 1001;
        class72.field1604 = 1;
        if (class22.field469 != -1) {
            class33.field660 = -1;
            class71.field1579 = -1;
            class10.method62(0, 0, class22.field469, 503, 765, 0, class101.field2193, class74.field1666, (byte) 99, 0, -1);
            class23.field480 = class71.field1579;
            class16.field319 = class33.field660;
            return;
        }
        class62.method377(14970);
        boolean var1 = false;
        class71.field1579 = -1;
        class33.field660 = -1;
        if (class101.field2193 > 4 && class74.field1666 > 4 && class101.field2193 < 516 && class74.field1666 < 338) {
            if (class53.field1144 == -1) {
                class35.method217((byte) 25);
            } else {
                class10.method62(0, 0, class53.field1144, 338, 516, 4, class101.field2193, class74.field1666, (byte) 38, 4, -1);
            }
        }
        class23.field480 = class71.field1579;
        class16.field319 = class33.field660;
        class33.field660 = -1;
        class71.field1579 = -1;
        if (class101.field2193 > 553 && class74.field1666 > 205 && class101.field2193 < 743 && class74.field1666 < 466) {
            if (class67.field1396 != -1) {
                class10.method62(0, 1, class67.field1396, 466, 743, 553, class101.field2193, class74.field1666, (byte) 22, 205, -1);
            } else if (class51.field1110[class40.field792] != -1) {
                class10.method62(0, 1, class51.field1110[class40.field792], 466, 743, 553, class101.field2193, class74.field1666, (byte) -127, 205, -1);
            }
        }
        if (class33.field660 != class120.field2559) {
            class110.field2418 = true;
            class120.field2559 = class33.field660;
        }
        if (class71.field1579 != class125.field2690) {
            class125.field2690 = class71.field1579;
            class110.field2418 = true;
        }
        class71.field1579 = -1;
        class33.field660 = -1;
        if (class101.field2193 > 17 && class74.field1666 > 357 && class101.field2193 < 496 && class74.field1666 < 453) {
            if (class60.field1244 != -1) {
                class10.method62(0, 2, class60.field1244, 453, 496, 17, class101.field2193, class74.field1666, (byte) 42, 357, -1);
            } else if (class46.field968 != -1) {
                class10.method62(0, 3, class46.field968, 453, 496, 17, class101.field2193, class74.field1666, (byte) -106, 357, -1);
            } else if (class74.field1666 < 434 && class101.field2193 < 426) {
                class127.method932((byte) 108, class101.field2193 - 17, class74.field1666 + -357);
            }
        }
        if ((class60.field1244 != -1 || class46.field968 != -1) && class33.field660 != class125.field2714) {
            class35.field709 = true;
            class125.field2714 = class33.field660;
        }
        if ((class60.field1244 != -1 || class46.field968 != -1) && class89.field1935 != class71.field1579) {
            class35.field709 = true;
            class89.field1935 = class71.field1579;
        }
        if (arg0 != -20836) {
            return;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class72.field1604 - 1; var2++) {
                if (class76.field1700[var2] < 1000 && class76.field1700[var2 + 1] > 1000) {
                    var1 = false;
                    class69 var3 = class101.field2197[var2];
                    class101.field2197[var2] = class101.field2197[var2 + 1];
                    class101.field2197[var2 + 1] = var3;
                    int var4 = class76.field1700[var2];
                    class76.field1700[var2] = class76.field1700[var2 + 1];
                    class76.field1700[var2 + 1] = var4;
                    int var5 = class68.field1474[var2];
                    class68.field1474[var2] = class68.field1474[var2 + 1];
                    class68.field1474[var2 + 1] = var5;
                    int var6 = class77.field1740[var2];
                    class77.field1740[var2] = class77.field1740[var2 + 1];
                    class77.field1740[var2 + 1] = var6;
                    int var7 = class77.field1748[var2];
                    class77.field1748[var2] = class77.field1748[var2 + 1];
                    class77.field1748[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    private final void method370(boolean arg0) {
        field1266++;
        this.field1261 += ++this.field1259;
        int var2 = 0;
        if (arg0) {
            field1257 = null;
        }
        while (var2 < 256) {
            int var3 = this.field1265[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1260 ^= this.field1260 << 13;
                } else {
                    this.field1260 ^= this.field1260 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1260 ^= this.field1260 << 2;
            } else {
                this.field1260 ^= this.field1260 >>> 16;
            }
            this.field1260 += this.field1265[var2 + 128 & 0xFF];
            int var4;
            this.field1265[var2] = var4 = this.field1261 + this.field1260 + this.field1265[class23.method151(var3, 1020) >> 2];
            this.field1250[var2] = this.field1261 = this.field1265[class23.method151(var4, 261170) >> 8 >> 2] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static final void method371(byte arg0) {
        field1263++;
        int var1 = -78 / ((-arg0 - 2) / 63);
        class55.field1159.method220((byte) -122);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([I)V")
    public class61(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1250[var2] = arg0[var2];
        }
        this.method367((byte) 106);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Laa;")
    public static final class2 method372(int arg0, int arg1) {
        field1254++;
        int var2 = 116 % ((9 - arg0) / 40);
        class2 var3 = (class2) client.field393.method224((long) arg1, (byte) 121);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class103.field2238.method394(14, arg1, (byte) -29);
        class2 var5 = new class2();
        if (var4 != null) {
            var5.method10(new class94(var4), -13772);
        }
        client.field393.method221(var5, true, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static void method373(int arg0) {
        field1255 = null;
        field1257 = null;
        if (arg0 >= -27) {
            field1249 = null;
        }
        field1249 = null;
        field1252 = null;
    }
}
