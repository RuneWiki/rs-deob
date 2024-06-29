import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class188 {

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "[J")
    private long[] field2146 = new long[8];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[J")
    private long[] field2144 = new long[8];

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "[J")
    private long[] field2154 = new long[8];

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "[B")
    private byte[] field2157 = new byte[64];

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    private int field2151 = 0;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    private int field2155 = 0;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "[J")
    private long[] field2159 = new long[8];

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[J")
    private long[] field2153 = new long[8];

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "[B")
    private byte[] field2160 = new byte[32];

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field2145 = 0;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Z")
    public static boolean field2148 = false;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lcq;")
    public static class110 field2147 = new class110(20, 2);

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Lbda;")
    public static class441 field2161 = null;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Z")
    public static boolean field2163 = false;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 3)
    public static void method1140(int arg0) {
        field2147 = null;
        if (arg0 >= -26) {
            method1140(-105);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 13)
    private final void method1141(boolean arg0) {
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field2153[var2] = class59.method317(class480.method2767((long) this.field2157[var3 + 7], 255L), class59.method317(class480.method2767(0xFFL << 8, (long) this.field2157[var3 + 6] << 8), class59.method317(class480.method2767(0xFFL << 16, (long) this.field2157[var3 + 5] << 16), class59.method317(class59.method317(class480.method2767(255L, (long) this.field2157[var3 + 3]) << 32, class59.method317(class59.method317((long) this.field2157[var3] << 56, class480.method2767((long) this.field2157[var3 + 1] << 48, 0xFFL << 48)), class480.method2767((long) this.field2157[var3 + 2], 255L) << 40)), class480.method2767(0xFFL << 24, (long) this.field2157[var3 + 4] << 24)))));
            var3 += 8;
            var2++;
        }
        field2152++;
        if (arg0) {
            return;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field2154[var4] = class59.method317(this.field2153[var4], this.field2146[var4] = this.field2144[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field2159[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field2159[var7] = class59.method317(this.field2159[var7], class208.field2463[var13][class105.method572((int) (this.field2146[class105.method572(var7 - var13, 7)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field2146[var8] = this.field2159[var8];
            }
            this.field2146[0] = class59.method317(this.field2146[0], class208.field2459[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field2159[var9] = this.field2146[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field2159[var9] = class59.method317(this.field2159[var9], class208.field2463[var11][class105.method572((int) (this.field2154[class105.method572(var9 - var11, 7)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field2154[var10] = this.field2159[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field2144[var6] = class59.method317(this.field2144[var6], class59.method317(this.field2154[var6], this.field2153[var6]));
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([BZJ)V", line = 129)
    public final void method1142(byte[] arg0, boolean arg1, long arg2) {
        field2162++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field2155 & 0x7;
        long var8 = arg2;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field2160[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field2160[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg2 > 8L) {
            int var15 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field2157[this.field2151] = (byte) class422.method2436(this.field2157[this.field2151], var15 >>> var7);
            this.field2151++;
            this.field2155 += 8 - var7;
            if (this.field2155 == 512) {
                this.method1141(arg1);
                this.field2155 = this.field2151 = 0;
            }
            this.field2157[this.field2151] = (byte) class105.method572(255, var15 << 8 - var7);
            this.field2155 += var7;
            arg2 -= 8L;
            var5++;
        }
        int var12;
        if (arg2 > 0L) {
            var12 = arg0[var5] << var6 & 0xFF;
            this.field2157[this.field2151] = (byte) class422.method2436(this.field2157[this.field2151], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (arg1) {
            this.method1143((byte) 19);
        }
        if (((long) var7 + arg2) < 8L) {
            this.field2155 = (int) ((long) this.field2155 + arg2);
            return;
        }
        this.field2155 += 8 - var7;
        this.field2151++;
        long var13 = arg2 - (long) (8 - var7);
        if (this.field2155 == 512) {
            this.method1141(false);
            this.field2155 = this.field2151 = 0;
        }
        this.field2157[this.field2151] = (byte) class105.method572(var12 << 8 - var7, 255);
        this.field2155 += (int) var13;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 223)
    public final void method1143(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field2160[var2] = 0;
        }
        field2150++;
        this.field2155 = this.field2151 = 0;
        this.field2157[0] = 0;
        if (arg0 != -45) {
            field2147 = null;
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field2144[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 249)
    public static final void method1144(String arg0, int arg1) {
        field2158++;
        if (arg0.equals("")) {
            return;
        }
        class171.field1906++;
        class653 var2 = class699.method3845((byte) 45, class39.field395, class241.field2988);
        var2.field9158.method658(class72.method382(2018672392, arg0), (byte) 53);
        var2.field9158.method672((byte) -110, arg0);
        class568.method3220(var2, (byte) 60);
        if (arg1 != 0) {
            method1140(58);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II[B)V", line = 268)
    public final void method1145(int arg0, int arg1, byte[] arg2) {
        field2156++;
        this.field2157[this.field2151] = (byte) class422.method2436(this.field2157[this.field2151], 0x80 >>> class105.method572(this.field2155, 7));
        this.field2151++;
        if (this.field2151 > 32) {
            while (true) {
                if (this.field2151 >= 64) {
                    this.method1141(false);
                    this.field2151 = 0;
                    break;
                }
                this.field2157[this.field2151++] = 0;
            }
        }
        while (this.field2151 < 32) {
            this.field2157[this.field2151++] = 0;
        }
        class567.method3213(this.field2160, 0, this.field2157, 32, 32);
        this.method1141(false);
        int var4 = 0;
        if (arg1 != -4900) {
            return;
        }
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field2144[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 367)
    public static final void method1146(byte arg0) {
        field2149++;
        if (class311.field3842 > 1) {
            class153.field1695 = class158.field1780;
            class311.field3842--;
        }
        if (class163.field1818) {
            class163.field1818 = false;
            class254.method1505(-22614);
            return;
        }
        if (!field2148) {
            class620.method3458(-117);
        }
        for (int var1 = 0; var1 < 100 && class99.method535((byte) 119); var1++) {
        }
        if (class421.field5601 != 10) {
            return;
        }
        while (class420.method2353(true)) {
            class653 var2 = class699.method3845((byte) 45, class39.field395, class372.field5071);
            var2.field9158.method658(0, (byte) 74);
            int var3 = var2.field9158.field1218;
            class539.method3037(-71, var2.field9158);
            var2.field9158.method642(var2.field9158.field1218 - var3, true);
            class568.method3220(var2, (byte) 27);
        }
        if (class330.field4150 == null) {
            if (class153.field1685 <= class557.method3157(-52)) {
                class330.field4150 = class351.field4737.method224(false, class117.field1294.field1987);
            }
        } else if (class330.field4150.field3380 != -1) {
            class653 var4 = class699.method3845((byte) 45, class39.field395, class92.field917);
            var4.field9158.method645(-672168216, class330.field4150.field3380);
            class568.method3220(var4, (byte) 58);
            class330.field4150 = null;
            class153.field1685 = class557.method3157(-109) + 30000L;
        }
        class103 var5 = (class103) class156.field1744.method3434((byte) 2);
        if (var5 != null || class557.method3157(-103) - 2000L > class656.field9241) {
            class653 var6 = null;
            int var7 = 0;
            for (class103 var8 = (class103) class595.field8388.method3434((byte) 2); var8 != null && (var6 == null || (var6.field9158.field1218 - var7) < 240); var8 = (class103) class595.field8388.method3430(true)) {
                var8.method1922(93);
                int var9 = var8.method193((byte) -70);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method194((byte) -106);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class448.field6297 != var10 || class310.field3837 != var9) {
                    if (var6 == null) {
                        var6 = class699.method3845((byte) 45, class39.field395, class215.field2606);
                        class344.field4403++;
                        var6.field9158.method658(0, (byte) 77);
                        var7 = var6.field9158.field1218;
                    }
                    int var11 = var10 - class448.field6297;
                    class448.field6297 = var10;
                    int var12 = var9 - class310.field3837;
                    class310.field3837 = var9;
                    int var13 = (int) ((var8.method195(false) - class656.field9241) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field9158.method645(-672168216, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var11 += 128;
                        var6.field9158.method658(var13 + 128, (byte) 108);
                        var6.field9158.method645(-672168216, (var11 << 8) + var12);
                    } else if (var13 >= 32) {
                        var6.field9158.method645(-672168216, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9158.method660((byte) 78, Integer.MIN_VALUE);
                        } else {
                            var6.field9158.method660((byte) 114, var10 | var9 << 16);
                        }
                    } else {
                        var6.field9158.method658(var13 + 192, (byte) 87);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9158.method660((byte) 46, Integer.MIN_VALUE);
                        } else {
                            var6.field9158.method660((byte) 49, var9 << 16 | var10);
                        }
                    }
                    class656.field9241 = var8.method195(false);
                }
            }
            if (var6 != null) {
                var6.field9158.method642(var6.field9158.field1218 - var7, true);
                class568.method3220(var6, (byte) 124);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method195(false) - class503.field7245) / 50L;
            class503.field7245 = var5.method195(false);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method193((byte) -102);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method194((byte) -106);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method192(-58) == 2) {
                var18 = 1;
            }
            class584.field8292++;
            int var19 = (int) var14;
            class653 var20 = class699.method3845((byte) 45, class39.field395, class56.field565);
            var20.field9158.method660((byte) 127, var17 | var16 << 16);
            var20.field9158.method612(false, var18 << 15 | var19);
            class568.method3220(var20, (byte) 99);
        }
        if (class131.field1472 > 0) {
            class171.field1901++;
            class653 var21 = class699.method3845((byte) 45, class39.field395, class263.field3278);
            var21.field9158.method658(class131.field1472 * 3, (byte) 59);
            for (int var22 = 0; var22 < class131.field1472; var22++) {
                class159 var23 = class646.field9121[var22];
                long var24 = (var23.method867((byte) -100) - class614.field8647) / 50L;
                class614.field8647 = var23.method867((byte) 98);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field9158.method658(var23.method866(112), (byte) 101);
                var21.field9158.method645(-672168216, (int) var24);
            }
            class568.method3220(var21, (byte) 13);
        }
        if (class694.field9732 > 0) {
            class694.field9732--;
        }
        if (class119.field1336 && class694.field9732 <= 0) {
            class119.field1336 = false;
            class694.field9732 = 20;
            class569.field8091++;
            class653 var26 = class699.method3845((byte) 45, class39.field395, class142.field1576);
            var26.field9158.method646(true, (int) class654.field9173 >> 3);
            var26.field9158.method646(true, (int) class508.field7300 >> 3);
            class568.method3220(var26, (byte) 71);
        }
        if (class32.field310 != class197.field2277) {
            class197.field2277 = class32.field310;
            class462.field6569++;
            class653 var27 = class699.method3845((byte) 45, class39.field395, class612.field8620);
            var27.field9158.method658(class32.field310 ? 1 : 0, (byte) 93);
            class568.method3220(var27, (byte) 10);
        }
        if (!class389.field5269) {
            class92.field925++;
            class653 var28 = class699.method3845((byte) 45, class39.field395, class471.field6756);
            var28.field9158.method658(0, (byte) 50);
            int var29 = var28.field9158.field1218;
            class115 var30 = new class115(class595.method3344((byte) 82));
            class639.field9075.method2723(0, var30);
            var28.field9158.method629(48, var30.field1269, var30.field1218, 0);
            var28.field9158.method642(var28.field9158.field1218 - var29, true);
            class568.method3220(var28, (byte) 30);
            class389.field5269 = true;
        }
        if (class487.field7044 != null) {
            if (class538.field7572 == 2) {
                class285.method1658(256);
            } else if (class538.field7572 == 3) {
                class349.method2072(-9319);
            }
        }
        if (class231.field2854) {
            class231.field2854 = false;
        } else {
            class381.field5158 /= 2.0F;
        }
        if (field2163) {
            field2163 = false;
        } else {
            class9.field94 /= 2.0F;
        }
        class178.method1091(-121);
        if (class421.field5601 != 10) {
            return;
        }
        class632.method3556((byte) -73);
        class321.method1823(-44);
        class408.method2279(-2059590648);
        class617.field8702++;
        if (class617.field8702 > 750) {
            class254.method1505(-22614);
            return;
        }
        class249.method1470((byte) -34);
        class185.method1121((byte) 115);
        class629.method3533(82);
        for (int var31 = class628.field8859.method1731(true, (byte) 13); var31 != -1; var31 = class628.field8859.method1731(false, (byte) 13)) {
            class566.method3208(var31, 5);
            class206.field2449[class105.method572(class424.field5981++, 31)] = var31;
        }
        for (class76 var32 = class396.method2241(-9435); var32 != null; var32 = class396.method2241(-9435)) {
            int var33 = var32.method407(-124);
            int var34 = var32.method405(256);
            if (var33 == 1) {
                class371.field5066[var34] = var32.field785;
                class537.field7555 |= class588.field8319[var34];
                class221.field2714[class105.method572(class617.field8695++, 31)] = var34;
            } else if (var33 == 2) {
                class53.field535[var34] = var32.field790;
                class39.field398[class105.method572(31, class580.field8205++)] = var34;
            } else if (var33 == 3) {
                class452 var35 = class92.method464(var34, -167823504);
                if (!var32.field790.equals(var35.field6438)) {
                    var35.field6438 = var32.field790;
                    class130.method741(var35, 26034);
                }
            } else if (var33 == 4) {
                class452 var36 = class92.method464(var34, -167823504);
                int var37 = var32.field785;
                int var38 = var32.field789;
                int var39 = var32.field780;
                if (var36.field6322 != var37 || var36.field6402 != var38 || var36.field6406 != var39) {
                    var36.field6402 = var38;
                    var36.field6322 = var37;
                    var36.field6406 = var39;
                    class130.method741(var36, 26034);
                }
            } else if (var33 == 5) {
                class452 var56 = class92.method464(var34, -167823504);
                if (var32.field785 != var56.field6378 || var32.field785 == -1) {
                    var56.field6433 = 0;
                    var56.field6470 = 1;
                    var56.field6378 = var32.field785;
                    var56.field6341 = 0;
                    class257 var57 = var56.field6378 == -1 ? null : class265.field3301.method3043(var56.field6378, -8191);
                    if (var57 != null) {
                        class579.method3274(var57, var56.field6433, (byte) -106);
                    }
                    class130.method741(var56, 26034);
                }
            } else if (var33 == 6) {
                int var40 = var32.field785;
                int var41 = (var40 & 0x7C01) >> 10;
                int var42 = (var40 & 0x3E4) >> 5;
                int var43 = var40 & 0x1F;
                int var44 = (var41 << 19) - (-(var42 << 11) - (var43 << 3));
                class452 var45 = class92.method464(var34, -167823504);
                if (var45.field6338 != var44) {
                    var45.field6338 = var44;
                    class130.method741(var45, 26034);
                }
            } else if (var33 == 7) {
                class452 var46 = class92.method464(var34, -167823504);
                boolean var47 = var32.field785 == 1;
                if (var47 != var46.field6455) {
                    var46.field6455 = var47;
                    class130.method741(var46, 26034);
                }
            } else if (var33 == 8) {
                class452 var48 = class92.method464(var34, -167823504);
                if (var32.field785 != var48.field6473 || var32.field789 != var48.field6422 || var32.field780 != var48.field6374) {
                    var48.field6374 = var32.field780;
                    var48.field6422 = var32.field789;
                    var48.field6473 = var32.field785;
                    if (var48.field6434 != -1) {
                        if (var48.field6355 > 0) {
                            var48.field6374 = var48.field6374 * 32 / var48.field6355;
                        } else if (var48.field6463 > 0) {
                            var48.field6374 = var48.field6374 * 32 / var48.field6463;
                        }
                    }
                    class130.method741(var48, 26034);
                }
            } else if (var33 == 9) {
                class452 var49 = class92.method464(var34, -167823504);
                if (var32.field785 != var49.field6434 || var32.field789 != var49.field6358) {
                    var49.field6434 = var32.field785;
                    var49.field6358 = var32.field789;
                    class130.method741(var49, 26034);
                }
            } else if (var33 == 10) {
                class452 var50 = class92.method464(var34, -167823504);
                if (var32.field785 != var50.field6419 || var32.field789 != var50.field6393 || var32.field780 != var50.field6331) {
                    var50.field6419 = var32.field785;
                    var50.field6393 = var32.field789;
                    var50.field6331 = var32.field780;
                    class130.method741(var50, 26034);
                }
            } else if (var33 == 11) {
                class452 var51 = class92.method464(var34, -167823504);
                var51.field6459 = var51.field6348 = var32.field789;
                var51.field6357 = var51.field6329 = var32.field785;
                var51.field6469 = 0;
                var51.field6440 = 0;
                class130.method741(var51, 26034);
            } else if (var33 == 12) {
                class452 var52 = class92.method464(var34, -167823504);
                int var53 = var32.field785;
                if (var52 != null && var52.field6471 == 0) {
                    if (var53 > var52.field6444 - var52.field6443) {
                        var53 = var52.field6444 - var52.field6443;
                    }
                    if (var53 < 0) {
                        var53 = 0;
                    }
                    if (var52.field6451 != var53) {
                        var52.field6451 = var53;
                        class130.method741(var52, 26034);
                    }
                }
            } else if (var33 == 14) {
                class452 var54 = class92.method464(var34, -167823504);
                var54.field6418 = var32.field785;
            } else if (var33 == 15) {
                class184.field2065 = var32.field789;
                class556.field7946 = true;
                class248.field3078 = var32.field785;
            } else if (var33 == 16) {
                class452 var55 = class92.method464(var34, -167823504);
                var55.field6441 = var32.field785;
            }
        }
        if (class331.field4170 != 0) {
            class388.field5242 += 20;
            if (class388.field5242 >= 400) {
                class331.field4170 = 0;
            }
        }
        class569.field8088++;
        if (class112.field1183 != null) {
            class632.field8888++;
            if (class632.field8888 >= 15) {
                class130.method741(class112.field1183, 26034);
                class112.field1183 = null;
            }
        }
        class473.field6815 = false;
        class600.field8465 = false;
        class677.field9478 = null;
        class593.field8377 = null;
        class222.method1344(-1, null, -1, (byte) -13);
        class23.method105(-1, null, (byte) -7, -1);
        if (!class348.field4665) {
            class178.field1992 = -1;
        }
        class194.method1183(false);
        class158.field1780++;
        if (class669.field9324) {
            class92.field927++;
            class653 var58 = class699.method3845((byte) 45, class39.field395, class325.field4004);
            var58.field9158.method660((byte) 90, class365.field4907 | class377.field5116 << 14 | class73.field770 << 28);
            class568.method3220(var58, (byte) 48);
            class669.field9324 = false;
        }
        while (true) {
            class213 var59;
            class452 var60;
            class452 var61;
            do {
                var59 = (class213) class113.field1194.method3440((byte) 6);
                if (var59 == null) {
                    while (true) {
                        class213 var62;
                        class452 var63;
                        class452 var64;
                        do {
                            var62 = (class213) class282.field3531.method3440((byte) 25);
                            if (var62 == null) {
                                while (true) {
                                    class213 var65;
                                    class452 var66;
                                    class452 var67;
                                    do {
                                        var65 = (class213) class472.field6793.method3440((byte) 113);
                                        if (var65 == null) {
                                            if (class677.field9478 == null) {
                                                class667.field9317 = 0;
                                            }
                                            if (class497.field7199 != null) {
                                                class568.method3222(true);
                                            }
                                            if (class296.field3704 > 0 && class140.field1549.method1945(82, false) && class140.field1549.method1945(81, false) && class289.field3612 != 0) {
                                                int var68 = class362.field4859.field5166 - class289.field3612;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class26.method143(class26.field245 + class362.field4859.field9517[0], class231.field2860 - -class362.field4859.field9513[0], -122, var68);
                                            }
                                            class247.method1458(-3);
                                            int var69 = 93 % ((-arg0 - 37) / 49);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class480.field6907[var70]++;
                                            }
                                            if (class537.field7555 && (class557.method3157(-94) - 60000L) > class415.field5562) {
                                                class355.method2097((byte) -125);
                                            }
                                            for (class596 var71 = (class596) class355.field4776.method1672((byte) 90); var71 != null; var71 = (class596) class355.field4776.method1669(-2747)) {
                                                if (((long) var71.field8393) < (class557.method3157(-118) / 1000L - 5L)) {
                                                    if (var71.field8391 > 0) {
                                                        class416.method2341(0, var71.field8395 + class198.field2304.method1195((byte) 62, class504.field7267), "", "", 0, 5, "");
                                                    }
                                                    if (var71.field8391 == 0) {
                                                        class416.method2341(0, var71.field8395 + class198.field2305.method1195((byte) 62, class504.field7267), "", "", 0, 5, "");
                                                    }
                                                    var71.method1821(94);
                                                }
                                            }
                                            class161.field1800++;
                                            if (class161.field1800 > 500) {
                                                class161.field1800 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x4) == 4) {
                                                    class191.field2193 += class368.field5036;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class196.field2268 += class7.field79;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class492.field7141 += class667.field9309;
                                                }
                                            }
                                            if (class196.field2268 < -50) {
                                                class7.field79 = 2;
                                            }
                                            if (class492.field7141 < -55) {
                                                class667.field9309 = 2;
                                            }
                                            if (class196.field2268 > 50) {
                                                class7.field79 = -2;
                                            }
                                            if (class492.field7141 > 55) {
                                                class667.field9309 = -2;
                                            }
                                            if (class191.field2193 < -40) {
                                                class368.field5036 = 1;
                                            }
                                            if (class191.field2193 > 40) {
                                                class368.field5036 = -1;
                                            }
                                            class266.field3324++;
                                            if (class266.field3324 > 500) {
                                                class266.field3324 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x1) == 1) {
                                                    class302.field3748 += class552.field7891;
                                                }
                                                if ((var73 & 0x2) == 2) {
                                                    class373.field5085 += class187.field2132;
                                                }
                                            }
                                            if (class302.field3748 < -60) {
                                                class552.field7891 = 2;
                                            }
                                            if (class373.field5085 < -20) {
                                                class187.field2132 = 1;
                                            }
                                            if (class302.field3748 > 60) {
                                                class552.field7891 = -2;
                                            }
                                            if (class373.field5085 > 10) {
                                                class187.field2132 = -1;
                                            }
                                            class79.field808++;
                                            if (class79.field808 > 50) {
                                                class445.field6269++;
                                                class653 var74 = class699.method3845((byte) 45, class39.field395, class494.field7149);
                                                class568.method3220(var74, (byte) 126);
                                            }
                                            if (class105.field1131) {
                                                class460.method2638(2000);
                                                class105.field1131 = false;
                                            }
                                            try {
                                                class160.method869((byte) -122);
                                                return;
                                            } catch (IOException var75) {
                                                class254.method1505(-22614);
                                                return;
                                            }
                                        }
                                        var66 = var65.field2592;
                                        if (var66.field6360 < 0) {
                                            break;
                                        }
                                        var67 = class92.method464(var66.field6467, -167823504);
                                    } while (var67 == null || var67.field6399 == null || var66.field6360 >= var67.field6399.length || var67.field6399[var66.field6360] != var66);
                                    class281.method1642(var65);
                                }
                            }
                            var63 = var62.field2592;
                            if (var63.field6360 < 0) {
                                break;
                            }
                            var64 = class92.method464(var63.field6467, -167823504);
                        } while (var64 == null || var64.field6399 == null || var64.field6399.length <= var63.field6360 || var64.field6399[var63.field6360] != var63);
                        class281.method1642(var62);
                    }
                }
                var60 = var59.field2592;
                if (var60.field6360 < 0) {
                    break;
                }
                var61 = class92.method464(var60.field6467, -167823504);
            } while (var61 == null || var61.field6399 == null || var61.field6399.length <= var60.field6360 || var61.field6399[var60.field6360] != var60);
            class281.method1642(var59);
        }
    }
}
