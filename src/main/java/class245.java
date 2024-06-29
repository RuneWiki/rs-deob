import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class245 {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
    private boolean field3344 = false;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    private int field3362 = 32;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "J")
    private long field3352 = class301.method1787((byte) 100);

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "Z")
    private boolean field3364 = true;

    @OriginalMember(owner = "client!kv", name = "B", descriptor = "J")
    private long field3371 = 0L;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
    private int field3372 = 0;

    @OriginalMember(owner = "client!kv", name = "x", descriptor = "[Lmi;")
    private class461[] field3367 = new class461[8];

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "I")
    private int field3369 = 0;

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    private int field3370 = 0;

    @OriginalMember(owner = "client!kv", name = "w", descriptor = "[Lmi;")
    private class461[] field3366 = new class461[8];

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
    private int field3368 = 0;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "J")
    private long field3376 = 0L;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!kv", name = "m", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "Lmi;")
    private class461 field3359;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "[I")
    public int[] field3363;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public final synchronized void method1484(byte arg0) {
        int var2 = 24 / ((-arg0 - 11) / 39);
        field3365++;
        this.field3364 = true;
        try {
            this.method682();
        } catch (Exception var3) {
            this.method679();
            this.field3371 = class301.method1787((byte) 82) + 2000L;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public void method680(int arg0) throws Exception {
        field3357++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
    public void method682() throws Exception {
        field3351++;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
    public final synchronized void method1485(int arg0) {
        field3347++;
        if (this.field3344) {
            return;
        }
        if (arg0 != 0) {
            this.field3375 = 35;
        }
        long var2 = class301.method1787((byte) -27);
        try {
            if (var2 > this.field3352 + 500000L) {
                this.field3352 = var2 - 500000L;
            }
            while (this.field3352 + 5000L < var2) {
                this.method1489((byte) 35, 256);
                this.field3352 += (256000 / class73.field1105);
            }
        } catch (Exception var7) {
            this.field3352 = var2;
        }
        if (this.field3363 == null) {
            return;
        }
        try {
            if (this.field3371 != 0L) {
                if (this.field3371 > var2) {
                    return;
                }
                this.method680(this.field3374);
                this.field3364 = true;
                this.field3371 = 0L;
            }
            int var4 = this.method677();
            if (this.field3369 < (this.field3372 - var4)) {
                this.field3369 = this.field3372 - var4;
            }
            int var5 = this.field3375 + this.field3373;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field3374) {
                this.field3374 += 1024;
                if (this.field3374 > 16384) {
                    this.field3374 = 16384;
                }
                this.method679();
                this.method680(this.field3374);
                var4 = 0;
                this.field3364 = true;
                if (var5 + 256 > this.field3374) {
                    var5 = this.field3374 - 256;
                    this.field3375 = var5 - this.field3373;
                }
            }
            while (var5 > var4) {
                this.method1491(this.field3363, 256);
                var4 += 256;
                this.method681();
            }
            if (var2 > this.field3376) {
                if (this.field3364) {
                    this.field3364 = false;
                } else if (this.field3369 == 0 && this.field3370 == 0) {
                    this.method679();
                    this.field3371 = var2 + 2000L;
                    return;
                } else {
                    this.field3375 = Math.min(this.field3370, this.field3369);
                    this.field3370 = this.field3369;
                }
                this.field3369 = 0;
                this.field3376 = var2 + 2000L;
            }
            this.field3372 = var4;
        } catch (Exception var6) {
            this.method679();
            this.field3371 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
    public void method681() throws Exception {
        field3361++;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V")
    public final synchronized void method1486(int arg0) {
        if (class97.field1317 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class97.field1317.field68[var3] == this) {
                    class97.field1317.field68[var3] = null;
                }
                if (class97.field1317.field68[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class97.field1317.field71 = true;
                while (class97.field1317.field64) {
                    class151.method974((byte) -102, 50L);
                }
                class97.field1317 = null;
            }
        }
        field3354++;
        this.method679();
        this.field3363 = null;
        if (arg0 == 2) {
            this.field3344 = true;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
    public static final void method1487(int arg0, int arg1) {
        field3353++;
        if (class114.field1485 == arg0) {
            return;
        }
        if (arg1 != -21316) {
            method1493((byte) 81, true, 85, 36, -46);
        }
        if (arg0 == 13) {
            if (class424.field6102 == null) {
                class45.method530((byte) -123, class468.field6540, class168.field2054, class422.field6010);
            } else {
                class528.method3107((byte) -59, class168.field2054);
            }
        }
        if (arg0 != 13 && class312.field4120 != null) {
            class312.field4120.method1853((byte) 11);
            class312.field4120 = null;
        }
        if (arg0 == 3) {
            class164.method1033(class358.field4771 != class127.field1619, -1);
        }
        if (arg0 == 7) {
            class175.method1102(class264.field3636 != class127.field1619, -1);
        }
        if (arg0 == 5) {
            if (class424.field6102 == null) {
                class86.method687(class422.field6010, class468.field6540, 0);
            } else {
                class287.method1710(0);
            }
        } else if (arg0 == 6) {
            if (class424.field6102 == null) {
                class45.method530((byte) -122, class468.field6540, class168.field2054, class422.field6010);
            } else {
                class528.method3107((byte) -115, class168.field2054);
            }
        } else if (arg0 == 9) {
            if (class424.field6102 == null) {
                class45.method530((byte) -100, class468.field6540, class168.field2054, class422.field6010);
            } else {
                class528.method3107((byte) -16, class168.field2054);
            }
        } else if (arg0 == 12) {
            if (class424.field6102 == null) {
                class86.method687(class422.field6010, class468.field6540, arg1 ^ 0xFFFFACBC);
            } else {
                class287.method1710(0);
            }
        }
        if (class235.method1428(class114.field1485, (byte) -119)) {
            class474.field6631.field9597 = 2;
            class163.field1998.field9597 = 2;
            class361.field4803.field9597 = 2;
            class618.field8872.field9597 = 2;
            class187.field2287.field9597 = 2;
            class469.field6553.field9597 = 2;
            class672.field9662.field9597 = 2;
        }
        if (class235.method1428(arg0, (byte) -122)) {
            class15.field291 = 1;
            class54.field870 = 0;
            class283.field3847 = 1;
            class4.field23 = 0;
            class118.field1523 = 0;
            class112.method801((byte) 81, true);
            class474.field6631.field9597 = 1;
            class163.field1998.field9597 = 1;
            class361.field4803.field9597 = 1;
            class618.field8872.field9597 = 1;
            class187.field2287.field9597 = 1;
            class469.field6553.field9597 = 1;
            class672.field9662.field9597 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class485.method2836(-28247);
        }
        boolean var2 = arg0 == 2 || class501.method2912(-4, arg0) || class657.method3723(arg0, -10);
        boolean var3 = class114.field1485 == 2 || class501.method2912(-4, class114.field1485) || class657.method3723(class114.field1485, -10);
        if (var3 != var2) {
            if (var2) {
                class584.field8487 = class631.field9082;
                if (class221.field2851.field4162 == 0) {
                    class242.method1475(-1, 2);
                } else {
                    class466.method2735(false, class275.field3764, 2, (byte) 104, 0, class631.field9082, class221.field2851.field4162);
                    class331.method1920(arg1 ^ 0x5343);
                }
                class33.field673.method957(false, 23431);
            } else {
                class242.method1475(arg1 ^ 0x5343, 2);
                class33.field673.method957(true, 23431);
            }
        }
        if (class235.method1428(arg0, (byte) -119) || arg0 == 13) {
            class68.field1045.method283();
        }
        class114.field1485 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIIB)V")
    public static final void method1488(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3346++;
        class543 var5 = class215.method1314((byte) -111);
        var5.field7872.method2281((byte) 58, class238.field3281.field7714);
        var5.field7872.method2281((byte) 58, arg1);
        var5.field7872.method2281((byte) 58, arg0);
        var5.field7872.method2261((byte) 35, arg2);
        var5.field7872.method2261((byte) 65, arg3);
        class511.method3028(7482, var5);
        if (arg4 == 122) {
            class382.field5103 = 1;
            class88.field1237 = 0;
            class696.field9865 = -3;
            class184.field2257 = 0;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)V")
    private final void method1489(byte arg0, int arg1) {
        field3360++;
        this.field3368 -= arg1;
        if (this.field3368 < 0) {
            this.field3368 = 0;
        }
        if (arg0 != 35) {
            method1488(-63, -86, 96, -89, (byte) 81);
        }
        if (this.field3359 != null) {
            this.field3359.method1225(arg1);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lmi;I)V")
    public final synchronized void method1490(class461 arg0, int arg1) {
        field3358++;
        if (arg1 != 0) {
            this.field3352 = -35L;
        }
        this.field3359 = arg0;
    }

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "()I")
    public int method677() throws Exception {
        field3348++;
        return this.field3374;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "([II)V")
    private final void method1491(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class658.field9343) {
            var3 = arg1 << 1;
        }
        class252.method1542(arg0, 0, var3);
        this.field3368 -= arg1;
        if (this.field3359 != null && this.field3368 <= 0) {
            this.field3368 += class73.field1105 >> 4;
            class363.method2066(0, this.field3359);
            this.method1494(this.field3359.method2026(), false, this.field3359);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class461 var10 = null;
                        class461 var11 = this.field3367[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class241 var12 = var11.field6464;
                                if (var12 == null || var12.field3321 <= var8) {
                                    var11.field6463 = true;
                                    int var13 = var11.method1223();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3321 += var13;
                                    }
                                    if (var4 >= this.field3362) {
                                        break label107;
                                    }
                                    class461 var14 = var11.method1229();
                                    if (var14 != null) {
                                        int var15 = var11.field6462;
                                        while (var14 != null) {
                                            this.method1494(var15 * var14.method2026() >> 8, false, var14);
                                            var14 = var11.method1221();
                                        }
                                    }
                                    class461 var16 = var11.field6461;
                                    var11.field6461 = null;
                                    if (var10 == null) {
                                        this.field3367[var7] = var16;
                                    } else {
                                        var10.field6461 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3366[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6461;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class461 var18 = this.field3367[var17];
                this.field3367[var17] = this.field3366[var17] = null;
                while (var18 != null) {
                    class461 var19 = var18.field6461;
                    var18.field6461 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3368 < 0) {
            this.field3368 = 0;
        }
        if (this.field3359 != null) {
            this.field3359.method1228(arg0, 0, arg1);
        }
        this.field3352 = class301.method1787((byte) 82);
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "()V")
    public void method679() {
        field3356++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BC)Z")
    public static final boolean method1492(byte arg0, char arg1) {
        field3345++;
        int var2 = 55 / (-arg0 / 39);
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BZIII)V")
    public static final void method1493(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3355++;
        if (!arg1 && class532.field7778 == arg4 && class389.field5225 == arg3 && class656.field9319 == class617.field8853 || class221.field2851.method1747(0, class375.field5039)) {
            return;
        }
        class656.field9319 = class617.field8853;
        class389.field5225 = arg3;
        class532.field7778 = arg4;
        if (class221.field2851.method1747(0, class375.field5039)) {
            class656.field9319 = 0;
        }
        method1487(arg2, -21316);
        class653.method3694(class68.field1045, class657.field9330, true, 0, class417.field5909, class424.field6050.method2561(class370.field4980, 0));
        int var5 = class36.field689;
        class36.field689 = (class532.field7778 - (class473.field6604 >> 4)) * 8;
        int var6 = class88.field1239;
        class88.field1239 = (class389.field5225 - (class205.field2465 >> 4)) * 8;
        int var7 = -72 % ((arg0 - 36) / 54);
        class578.field8439 = class550.method3227(class532.field7778 * 8, class389.field5225 * 8);
        class479.field6715 = null;
        int var8 = class36.field689 - var5;
        int var9 = class88.field1239 - var6;
        if (arg2 == 11) {
            for (int var18 = 0; var18 < class59.field928; var18++) {
                class633 var31 = class671.field9657[var18];
                if (var31 != null) {
                    class557 var32 = var31.field9097;
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2689[var33] -= var8;
                        var32.field2686[var33] -= var9;
                    }
                    var32.field530 -= var8 * 512;
                    var32.field531 -= var9 * 512;
                }
            }
        } else {
            class99.field1332 = 0;
            boolean var10 = false;
            int var11 = (class473.field6604 - 1) * 512;
            int var12 = (class205.field2465 - 1) * 512;
            for (int var13 = 0; var13 < class59.field928; var13++) {
                class633 var14 = class671.field9657[var13];
                if (var14 != null) {
                    class557 var15 = var14.field9097;
                    var15.field530 -= var8 * 512;
                    var15.field531 -= var9 * 512;
                    if (var15.field530 >= 0 && var11 >= var15.field530 && var15.field531 >= 0 && var12 >= var15.field531) {
                        boolean var16 = true;
                        for (int var17 = 0; var17 < 10; var17++) {
                            var15.field2689[var17] -= var8;
                            var15.field2686[var17] -= var9;
                            if (var15.field2689[var17] < 0 || var15.field2689[var17] >= class473.field6604 || var15.field2686[var17] < 0 || var15.field2686[var17] >= class205.field2465) {
                                var16 = false;
                            }
                        }
                        if (var16) {
                            class600.field8658[class99.field1332++] = var15.field2664;
                        } else {
                            var15.method3251(null, 0);
                            var14.method3045(true);
                            var10 = true;
                        }
                    } else {
                        var15.method3251(null, 0);
                        var10 = true;
                        var14.method3045(true);
                    }
                }
            }
            if (var10) {
                class59.field928 = class522.field7662.method3673(17467);
                class522.field7662.method3675(class671.field9657, -128);
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class613 var29 = class184.field2252[var19];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field2689[var30] -= var8;
                    var29.field2686[var30] -= var9;
                }
                var29.field531 -= var9 * 512;
                var29.field530 -= var8 * 512;
            }
        }
        class341[] var20 = class631.field9068;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class341 var28 = var20[var21];
            if (var28 != null) {
                var28.field4506 -= var9 * 512;
                var28.field4504 -= var8 * 512;
            }
        }
        for (class32 var22 = (class32) class440.field6267.method1132((byte) -118); var22 != null; var22 = (class32) class440.field6267.method1134(8446)) {
            var22.field661 -= var9;
            var22.field647 -= var8;
            if (class53.field865 != 4 && (var22.field647 < 0 || var22.field661 < 0 || class473.field6604 <= var22.field647 || class205.field2465 <= var22.field661)) {
                var22.method3045(true);
            }
        }
        if (class53.field865 != 4) {
            for (class507 var23 = (class507) class475.field6655.method3669((byte) 28); var23 != null; var23 = (class507) class475.field6655.method3676((byte) -12)) {
                int var24 = (int) (var23.field7519 & 0x3FFFL);
                int var25 = var24 - class36.field689;
                int var26 = (int) (var23.field7519 >> 14 & 0x3FFFL);
                int var27 = var26 - class88.field1239;
                if (var25 < 0 || var27 < 0 || var25 >= class473.field6604 || class205.field2465 <= var27) {
                    var23.method3045(true);
                }
            }
        }
        if (class432.field6201 != 0) {
            class432.field6201 -= var8;
            class147.field1798 -= var9;
        }
        class557.method3252(false);
        if (arg2 != 11) {
            class346.field4550 -= var8 * 512;
            class224.field2914 -= var9;
            class473.field6626 -= var8;
            class175.field2160 -= var8;
            class451.field6341 -= var9;
            class627.field8995 -= var9 * 512;
            if (Math.abs(var8) > class473.field6604 || Math.abs(var9) > class205.field2465) {
                class221.method1337(4);
            }
        } else if (class586.field8507 == 4) {
            class281.field3814 -= var8 * 512;
            class622.field8905 -= var9 * 512;
            class394.field5560 -= var8 * 512;
            class271.field3695 -= var9 * 512;
        } else {
            class586.field8507 = 1;
            class221.field2860 = -1;
            class51.field842 = -1;
        }
        class473.method2784(-26286);
        class338.method1955(43);
        class376.field5049.method1131((byte) -69);
        class6.field49.method1131((byte) -115);
        class74.field1107.method2072((byte) 126);
        class16.method183(0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method678(Component arg0) throws Exception {
        field3350++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZLmi;)V")
    private final void method1494(int arg0, boolean arg1, class461 arg2) {
        field3349++;
        int var4 = arg0 >> 5;
        class461 var5 = this.field3366[var4];
        if (arg1) {
            this.field3344 = true;
        }
        if (var5 == null) {
            this.field3367[var4] = arg2;
        } else {
            var5.field6461 = arg2;
        }
        this.field3366[var4] = arg2;
        arg2.field6462 = arg0;
    }
}
