import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class245 {

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    private int field3443 = 4;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    private int field3449 = 4;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    private int field3441 = 0;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    private int field3444 = 4;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "[S")
    private short[] field3453 = new short[512];

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public int field3454 = 4;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "[I")
    public static int[] field3445 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[S")
    private short[] field3439;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(CZ)B", line = 6)
    public static final byte method1594(char arg0, boolean arg1) {
        field3442++;
        if (!arg1) {
            method1594('U', true);
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)[B", line = 131)
    public static final byte[] method1595(int arg0, byte[] arg1) {
        field3450++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -1) {
            byte[] var2 = new byte[arg1.length];
            class206.method1359(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)I", line = 153)
    public static final int method1596(boolean arg0, int arg1, int arg2) {
        field3438++;
        if (arg0) {
            method1599(-101, -67, 35, -123, false, -94);
        }
        int var3 = arg2 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 170)
    public static final void method1597(boolean arg0) {
        field3446++;
        if (!arg0) {
            method1599(15, -51, -106, 66, false, 76);
        }
        class269.field3978.method366(74);
        class295.field4449.method366(65);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBI)V", line = 182)
    public final void method1598(int arg0, int arg1, byte arg2, int arg3) {
        field3451++;
        if (arg2 < 64) {
            this.method1602((byte) -90);
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method891((byte) 116);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3454; var14++) {
                        int var15 = this.field3439[var14] << 12;
                        int var16 = this.field3443 * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = this.field3449 * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field3444 * var15 >> 12;
                        int var22 = this.field3444 * var17;
                        int var23 = this.field3443 * var18;
                        int var24 = this.field3449 * var20;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34 = var24 & 0xFFF;
                        int var35;
                        if (var29 < var21) {
                            var35 = var29 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var32 >= var16) {
                            var36 = 0;
                        } else {
                            var36 = var32 & 0xFF;
                        }
                        int var37;
                        if (var26 < var19) {
                            var37 = var26 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var31 & 0xFF;
                        int var39 = var22 & 0xFFF;
                        int var40 = var33 - 4096;
                        int var41 = var34 - 4096;
                        int var42 = var39 - 4096;
                        int var43 = class72.field1016[var33];
                        short var44 = this.field3453[var38];
                        int var45 = class72.field1016[var39];
                        short var46 = this.field3453[var36];
                        int var47 = class72.field1016[var34];
                        short var48 = this.field3453[var30 + var46];
                        short var49 = this.field3453[var35 + var46];
                        short var50 = this.field3453[var30 + var44];
                        short var51 = this.field3453[var35 + var44];
                        int var52 = class252.method1641(var34, (byte) 127, var39, this.field3453[var28 + var50], var33);
                        int var53 = class252.method1641(var41, (byte) 120, var39, this.field3453[var37 + var50], var33);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class252.method1641(var34, (byte) 118, var42, this.field3453[var28 + var51], var33);
                        int var56 = class252.method1641(var41, (byte) 118, var42, this.field3453[var37 + var51], var33);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = ((var57 - var54) * var45 >> 12) + var54;
                        int var59 = class252.method1641(var34, (byte) 118, var39, this.field3453[var28 + var48], var40);
                        int var60 = class252.method1641(var41, (byte) 114, var39, this.field3453[var37 + var48], var40);
                        int var61 = var59 + ((var60 - var59) * var47 >> 12);
                        int var62 = class252.method1641(var34, (byte) 114, var42, this.field3453[var28 + var49], var40);
                        int var63 = class252.method1641(var41, (byte) 127, var42, this.field3453[var37 + var49], var40);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method896((byte) -100, ((var65 - var58) * var43 >> 12) + var58, var14);
                    }
                    this.method892((byte) -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIZI)V", line = 356)
    public static final void method1599(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3440++;
        if (class106.field1405 == null) {
            class126.field1647.method2023(arg1, arg0, arg3, -11682, arg2, -16777216);
            return;
        }
        class394.field5731++;
        if (class383.field5609 != null && (class383.field5609.field5921 + 64 - class383.field5609.method1091((byte) 17) * 64 >> 7) == class47.field712 && (class383.field5609.field5930 + 64 - (class383.field5609.method1091((byte) -114) * 64) >> 7) == class142.field1805) {
            class47.field712 = -1;
            class142.field1805 = -1;
            class147.method1015((byte) -75);
        }
        class94.method755(255);
        if (!arg4) {
            class126.method888(arg5 ^ 0x6859);
        }
        if (arg5 != 26841) {
            method1601(49);
        }
        class170.method1142(false);
        class47.method335(arg5 - 26842, arg1, arg0, arg3, arg2, true);
        int var6 = class162.field2118;
        int var7 = class383.field5611;
        int var8 = class366.field5406;
        int var9 = class132.field1724;
        if (class212.field2884 == 1) {
            int var10 = (int) class39.field588;
            if (var10 < class391.field5710 >> 8) {
                var10 = class391.field5710 >> 8;
            }
            if (class403.field5875[4] && var10 < class384.field5621[4] + 128) {
                var10 = class384.field5621[4] + 128;
            }
            int var11 = (int) class247.field3479 + class235.field3283 & 0x3FFF;
            class167.method1120(var7, var10, (byte) -112, class248.method1621(class383.field5609.field5921, class383.field5609.field5930, -13853, class268.field3973) - 50, class159.field2065, var11, ((var10 >> 3) * 3) + 600, class357.field5297);
        } else if (class212.field2884 == 4) {
            int var12 = (int) class39.field588;
            if (class391.field5710 >> 8 > var12) {
                var12 = class391.field5710 >> 8;
            }
            if (class403.field5875[4] && var12 < (class384.field5621[4] + 128)) {
                var12 = class384.field5621[4] + 128;
            }
            int var13 = (int) class247.field3479 & 0x3FFF;
            class167.method1120(var7, var12, (byte) -112, class248.method1621(class334.field4904, class7.field96, arg5 ^ 0xFFFFA13A, class268.field3973) - 50, class159.field2065, var13, ((var12 >> 3) * 3) + 600, class357.field5297);
        } else if (class212.field2884 == 5) {
            class203.method1346(var7, -127);
        }
        int var14 = class326.field4829;
        int var15 = class289.field4331;
        int var16 = class279.field4099;
        int var17 = class47.field716;
        int var18 = class7.field88;
        for (int var19 = 0; var19 < 5; var19++) {
            if (class403.field5875[var19]) {
                int var22 = (int) ((double) (-class439.field6368[var19]) + Math.random() * (double) (class439.field6368[var19] * 2 + 1) + Math.sin((double) class369.field5443[var19] / 100.0D * (double) class110.field1434[var19]) * (double) class384.field5621[var19]);
                if (var19 == 2) {
                    class279.field4099 += var22;
                }
                if (var19 == 0) {
                    class326.field4829 += var22;
                }
                if (var19 == 3) {
                    class7.field88 = class7.field88 + var22 & 0x3FFF;
                }
                if (var19 == 1) {
                    class289.field4331 += var22;
                }
                if (var19 == 4) {
                    class47.field716 += var22;
                    if (class47.field716 < 1024) {
                        class47.field716 = 1024;
                    } else if (class47.field716 > 3072) {
                        class47.field716 = 3072;
                    }
                }
            }
        }
        if (class326.field4829 < 0) {
            class326.field4829 = 0;
        }
        if (class279.field4099 < 0) {
            class279.field4099 = 0;
        }
        if (((class108.field1421 << 7) - 1) < class326.field4829) {
            class326.field4829 = (class108.field1421 << 7) - 1;
        }
        if ((class186.field2554 << 7) - 1 < class279.field4099) {
            class279.field4099 = (class186.field2554 << 7) - 1;
        }
        class264.method1770(arg5 - 26772);
        class159.method1060(false);
        class126.field1647.method462(var6, var9, var6 + var8, var7 + var9);
        class126.field1647.method447();
        int var20 = class409.field5952;
        if (class193.field2683 == null) {
            class126.field1647.method486(var20);
        } else {
            class193.field2683.method837((byte) -109, var20, var7, class47.field716, var6, class126.field1647, var9, class7.field88, var8, class122.field1573 << 3);
        }
        class264.method1766(8);
        class369.field5449.method276(class326.field4829, class289.field4331, class279.field4099, -class47.field716 & 0x3FFF, -class7.field88 & 0x3FFF, -class271.field3998 & 0x3FFF);
        class126.field1647.method478(class369.field5449);
        class126.field1647.method477(var6 + (var8 / 2), var7 / 2 + var9, class27.field472 << 1, class27.field472 << 1);
        class46.method330(class27.field472 << 1, true, class27.field472 << 1, var8 / 2 + var6, var7 / 2 + var9);
        class407.method2576(class326.field4829, -class271.field3998 & 0x3FFF, 0, -class47.field716 & 0x3FFF, class289.field4331, class279.field4099, -class7.field88 & 0x3FFF);
        byte var21 = class422.method2654((byte) 82) == 2 ? (byte) class394.field5731 : 1;
        class295.method2003(class126.field1647, class231.field3179, class334.field4918, class369.field5449, class326.field4829, class289.field4331, class279.field4099, class158.field1996, class231.field3184, class110.field1437, class399.field5850, class406.field5915, class143.field1818, class268.field3973 + 1, var21, class383.field5609.field5921 >> 7, class383.field5609.field5930 >> 7, !class407.field5937);
        class264.method1766(8);
        if (class381.field5579 == 30) {
            class237.method1545(var9, 256, 256, var6, -26557, var7, var8);
            class240.method1555(arg5 - 26840, var7, 256, var6, var8, 256, var9);
            class436.method2736(var8, var7, 256, 107, 256, var9, var6);
            class217.method1431(var6, var8, var9, arg5 - 26741, var7);
        }
        class63.method555();
        class7.field88 = var18;
        class326.field4829 = var14;
        class47.field716 = var17;
        class279.field4099 = var16;
        class289.field4331 = var15;
        if (class331.field4878 && class305.field4565.method351(arg5 ^ 0x68D9) == 0) {
            class331.field4878 = false;
        }
        if (class331.field4878) {
            class126.field1647.method2023(var7, var6, var9, -11682, var8, -16777216);
            class447.method2773(class165.field2240, false, (byte) -41, class41.field630);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIII)V", line = 641)
    public class245(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3444 = arg3;
        this.field3449 = arg2;
        this.field3441 = arg0;
        this.field3443 = arg4;
        this.field3454 = arg1;
        this.method1602((byte) 127);
        this.method1600(255);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 547)
    private final void method1600(int arg0) {
        field3448++;
        Random var2 = new Random((long) this.field3441);
        if (arg0 != 255) {
            this.field3439 = null;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3453[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class9.method67(var5, -1, var2);
            short var7 = this.field3453[var6];
            this.field3453[var6] = this.field3453[var5];
            this.field3453[var5] = this.field3453[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 584)
    public static void method1601(int arg0) {
        field3445 = null;
        if (arg0 != -1) {
            field3452 = -123;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 619)
    private final void method1602(byte arg0) {
        int var2 = -77 / ((arg0 - 18) / 62);
        this.field3439 = new short[this.field3454];
        field3447++;
        for (int var3 = 0; var3 < this.field3454; var3++) {
            this.field3439[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public abstract void method891(byte arg0);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public abstract void method892(byte arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)V")
    public abstract void method896(byte arg0, int arg1, int arg2);
}
