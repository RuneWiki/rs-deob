import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class229 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    private int field2657 = 0;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    private int field2664 = 0;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[B")
    private byte[] field2663 = new byte[32];

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "[B")
    private byte[] field2665 = new byte[64];

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[J")
    private long[] field2668 = new long[8];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[J")
    private long[] field2656 = new long[8];

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[J")
    private long[] field2670 = new long[8];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[J")
    private long[] field2667 = new long[8];

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[J")
    private long[] field2666 = new long[8];

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lpia;")
    public static class94 field2661 = new class94(75, 8);

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field2673;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 10)
    private final void method1324(int arg0) {
        field2660++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field2666[var2] = class660.method3762(class236.method1395((long) this.field2665[var3 + 7], 255L), class660.method3762(class660.method3762(class236.method1395((long) this.field2665[var3 + 5], 255L) << 16, class660.method3762(class236.method1395((long) this.field2665[var3 + 4], 255L) << 24, class660.method3762(class660.method3762(class660.method3762((long) this.field2665[var3] << 56, class236.method1395((long) this.field2665[var3 + 1], 255L) << 48), class236.method1395((long) this.field2665[var3 + 2] << 40, 0xFFL << 40)), class236.method1395((long) this.field2665[var3 + 3], 255L) << 32))), class236.method1395((long) this.field2665[var3 + 6], 255L) << 8));
            var3 += 8;
            var2++;
        }
        for (int var4 = arg0; var4 < 8; var4++) {
            this.field2668[var4] = class660.method3762(this.field2666[var4], this.field2667[var4] = this.field2670[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field2656[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field2656[var7] = class660.method3762(this.field2656[var7], class413.field5623[var13][class327.method1956((int) (this.field2667[class327.method1956(var7 - var13, 7)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field2667[var8] = this.field2656[var8];
            }
            this.field2667[0] = class660.method3762(this.field2667[0], class413.field5624[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field2656[var9] = this.field2667[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field2656[var9] = class660.method3762(this.field2656[var9], class413.field5623[var11][class327.method1956((int) (this.field2668[class327.method1956(7, var9 - var11)] >>> var12), 255)]);
                    var11++;
                    var12 -= 8;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field2668[var10] = this.field2656[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field2670[var6] = class660.method3762(this.field2670[var6], class660.method3762(this.field2668[var6], this.field2666[var6]));
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 127)
    public static void method1325(int arg0) {
        field2673 = null;
        int var1 = 38 / ((arg0 - 36) / 55);
        field2661 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBLfh;I)V", line = 142)
    public static final void method1326(int arg0, byte arg1, class649 arg2, int arg3) {
        field2658++;
        if (arg2 == null || class265.field3289.field3563 == arg2) {
            return;
        }
        int var4 = arg2.field9271;
        int var5 = arg2.field9274;
        int var6 = arg2.field9270;
        int var7 = (int) arg2.field9272;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        long var8 = arg2.field9272;
        if (var6 == 9 && class468.field6697 == null) {
            class418.method2634(var5, (byte) -51, var4);
            class468.field6697 = class689.method3895((byte) 122, var5, var4);
            class11.method50(class468.field6697, (byte) -115);
        }
        if (var6 == 5 || var6 == 1002) {
            class79.method557(var5, arg1 - 192, var7, arg2.field9269, var4);
        }
        if (var6 == 1010) {
            class508.field7233 = 0;
            class59.field614 = 2;
            class494.field7003 = arg0;
            class14.field126 = arg3;
            class364.field4654++;
            class249 var10 = class289.method1715(class733.field10263, arg1 + 33, class41.field470);
            var10.field3016.method1446(var7, true);
            class510.method3017(var10, 48);
        }
        if (var6 == 10) {
            class494.field7003 = arg0;
            class228.field2611++;
            class14.field126 = arg3;
            class508.field7233 = 0;
            class59.field614 = 2;
            class249 var11 = class289.method1715(class19.field174, 59, class41.field470);
            var11.field3016.method1456((byte) -97, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var11.field3016.method1444(1507430696, class181.field2144 + var5);
            var11.field3016.method1449(-1, class464.field6624 + var4);
            var11.field3016.method1444(1507430696, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class510.method3017(var11, 69);
            class144.method899(var8, arg1 ^ 0x43416910, var4, var5);
        }
        if (var6 == 48) {
            class14.field126 = arg3;
            class312.field3874++;
            class508.field7233 = 0;
            class494.field7003 = arg0;
            class59.field614 = 2;
            class249 var12 = class289.method1715(class357.field4582, arg1 + 31, class41.field470);
            var12.field3016.method1470((byte) -122, class464.field6624 + var4);
            var12.field3016.method1446(var7, true);
            var12.field3016.method1446(class181.field2144 + var5, true);
            var12.field3016.method1433(92, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            class510.method3017(var12, arg1 ^ 0xC);
            class269.method1607(var5, (byte) -24, var4);
        }
        if (var6 == 22) {
            if (class58.field594 > 0 && class375.field4818.method1657(82, (byte) -40) && class375.field4818.method1657(81, (byte) -40)) {
                class402.method2451(class181.field2144 + var5, class464.field6624 + var4, class90.field937.field4628, (byte) -112);
            } else {
                class59.field614 = 1;
                class508.field7233 = 0;
                class323.field4133++;
                class494.field7003 = arg0;
                class14.field126 = arg3;
                class249 var13 = class289.method1715(class584.field8251, 57, class41.field470);
                var13.field3016.method1470((byte) -122, class181.field2144 + var5);
                var13.field3016.method1449(-1, class464.field6624 + var4);
                class510.method3017(var13, 79);
            }
        }
        if (var6 == 49) {
            class151 var14 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var14 != null) {
                class197 var15 = var14.field1661;
                class508.field7233 = 0;
                class14.field126 = arg3;
                class59.field614 = 2;
                class471.field6742++;
                class494.field7003 = arg0;
                class249 var16 = class289.method1715(class585.field8254, 79, class41.field470);
                var16.field3016.method1456((byte) -95, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var16.field3016.method1449(-1, var7);
                class510.method3017(var16, 87);
                class647.method3689(true, 0, -2, var15.field7193[0], var15.method1128(-1), var15.method1128(arg1 - 69), 0, var15.field7187[0], (byte) -80);
            }
        }
        if (var6 == 58) {
            class183 var17 = class75.field792[var7];
            if (var17 != null) {
                class745.field10395++;
                class494.field7003 = arg0;
                class59.field614 = 2;
                class508.field7233 = 0;
                class14.field126 = arg3;
                class249 var18 = class289.method1715(class555.field7965, 118, class41.field470);
                var18.field3016.method1471(-94, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var18.field3016.method1446(var7, true);
                class510.method3017(var18, arg1 ^ 0x35);
                class647.method3689(true, 0, -2, var17.field7193[0], var17.method1128(-1), var17.method1128(-1), 0, var17.field7187[0], (byte) -80);
            }
        }
        if (arg1 != 68) {
            field2673 = null;
        }
        if (var6 == 16) {
            class151 var19 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var19 != null) {
                class14.field126 = arg3;
                class59.field614 = 2;
                class595.field8394++;
                class197 var20 = var19.field1661;
                class508.field7233 = 0;
                class494.field7003 = arg0;
                class249 var21 = class289.method1715(class3.field25, arg1 + 58, class41.field470);
                var21.field3016.method1470((byte) -122, var7);
                var21.field3016.method1471(-110, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                class510.method3017(var21, 101);
                class647.method3689(true, 0, -2, var20.field7193[0], var20.method1128(arg1 - 69), var20.method1128(arg1 - 69), 0, var20.field7187[0], (byte) -80);
            }
        }
        if (var6 == 6) {
            class13.field109++;
            class59.field614 = 1;
            class508.field7233 = 0;
            class14.field126 = arg3;
            class494.field7003 = arg0;
            class249 var22 = class289.method1715(class701.field9882, 110, class41.field470);
            var22.field3016.method1446(class181.field2144 + var5, true);
            var22.field3016.method1449(-1, class464.field6624 + var4);
            var22.field3016.method1441(class283.field3449, -125);
            var22.field3016.method1444(1507430696, class620.field8886);
            var22.field3016.method1449(-1, class421.field6093);
            class510.method3017(var22, 51);
            class647.method3689(true, 0, -4, var5, 1, 1, 0, var4, (byte) -80);
        }
        if (var6 == 13) {
            class532 var23 = class689.method3895((byte) 121, var5, var4);
            if (var23 != null) {
                class747.method4152((byte) -80, var23);
            }
        }
        if (var6 == 47) {
            class183 var24 = class75.field792[var7];
            if (var24 != null) {
                class59.field614 = 2;
                class494.field7003 = arg0;
                class14.field126 = arg3;
                class252.field3043++;
                class508.field7233 = 0;
                class249 var25 = class289.method1715(class451.field6499, 126, class41.field470);
                var25.field3016.method1470((byte) -122, var7);
                var25.field3016.method1471(-112, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                class510.method3017(var25, 95);
                class647.method3689(true, 0, -2, var24.field7193[0], var24.method1128(-1), var24.method1128(-1), 0, var24.field7187[0], (byte) -80);
            }
        }
        if (var6 == 44) {
            class494.field7003 = arg0;
            class59.field614 = 2;
            class508.field7233 = 0;
            class14.field126 = arg3;
            class551.field7909++;
            class249 var26 = class289.method1715(class11.field86, 110, class41.field470);
            var26.field3016.method1449(-1, var4 + class464.field6624);
            var26.field3016.method1470((byte) -122, var5 + class181.field2144);
            var26.field3016.method1433(-102, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var26.field3016.method1446(var7, true);
            class510.method3017(var26, arg1 - 15);
            class269.method1607(var5, (byte) -24, var4);
        }
        if (var6 == 4) {
            class151 var27 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var27 != null) {
                class508.field7233 = 0;
                class197 var28 = var27.field1661;
                class59.field614 = 2;
                class14.field126 = arg3;
                class494.field7003 = arg0;
                class30.field345++;
                class249 var29 = class289.method1715(class445.field6451, 99, class41.field470);
                var29.field3016.method1433(-118, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var29.field3016.method1444(1507430696, var7);
                class510.method3017(var29, arg1 + 54);
                class647.method3689(true, 0, -2, var28.field7193[0], var28.method1128(-1), var28.method1128(arg1 - 69), 0, var28.field7187[0], (byte) -80);
            }
        }
        if (var6 == 45) {
            class14.field126 = arg3;
            class508.field7233 = 0;
            class59.field614 = 2;
            class378.field5183++;
            class494.field7003 = arg0;
            class249 var30 = class289.method1715(class184.field2209, arg1 + 52, class41.field470);
            var30.field3016.method1446(class181.field2144 + var5, true);
            var30.field3016.method1470((byte) -122, var7);
            var30.field3016.method1456((byte) -127, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var30.field3016.method1470((byte) -122, class620.field8886);
            var30.field3016.method1449(-1, class421.field6093);
            var30.field3016.method1465(24606, class283.field3449);
            var30.field3016.method1446(class464.field6624 + var4, true);
            class510.method3017(var30, 60);
            class269.method1607(var5, (byte) -24, var4);
        }
        if (var6 == 1009) {
            class59.field614 = 2;
            class14.field126 = arg3;
            class494.field7003 = arg0;
            class508.field7233 = 0;
            class642.field9189++;
            class249 var31 = class289.method1715(class12.field99, arg1 ^ 0x15, class41.field470);
            var31.field3016.method1471(arg1 - 110, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var31.field3016.method1470((byte) -122, var4 + class464.field6624);
            var31.field3016.method1444(arg1 + 1507430628, class181.field2144 + var5);
            var31.field3016.method1449(arg1 ^ 0xFFFFFFBB, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class510.method3017(var31, 121);
            class144.method899(var8, 1128360276, var4, var5);
        }
        if (var6 == 51) {
            class494.field7003 = arg0;
            class508.field7233 = 0;
            class28.field302++;
            class14.field126 = arg3;
            class59.field614 = 2;
            class249 var32 = class289.method1715(class351.field4523, 106, class41.field470);
            var32.field3016.method1446(var5 + class181.field2144, true);
            var32.field3016.method1460(class375.field4818.method1657(82, (byte) -40) ? 1 : 0, arg1 + 24642);
            var32.field3016.method1444(1507430696, var7);
            var32.field3016.method1470((byte) -122, class464.field6624 + var4);
            class510.method3017(var32, arg1 ^ 0x3B);
            class269.method1607(var5, (byte) -24, var4);
        }
        if (var6 == 46) {
            class59.field614 = 2;
            class508.field7233 = 0;
            class294.field3619++;
            class494.field7003 = arg0;
            class14.field126 = arg3;
            class249 var33 = class289.method1715(class484.field6889, 101, class41.field470);
            var33.field3016.method1449(-1, class464.field6624 + var4);
            var33.field3016.method1444(arg1 + 1507430628, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var33.field3016.method1433(-92, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var33.field3016.method1470((byte) -122, class181.field2144 + var5);
            class510.method3017(var33, 125);
            class144.method899(var8, arg1 + 1128360208, var4, var5);
        }
        if (var6 == 19) {
            class14.field126 = arg3;
            class59.field614 = 2;
            class494.field7003 = arg0;
            class508.field7233 = 0;
            class602.field8571++;
            class249 var34 = class289.method1715(class224.field2575, 95, class41.field470);
            var34.field3016.method1446(class181.field2144 + var5, true);
            var34.field3016.method1444(1507430696, var4 + class464.field6624);
            var34.field3016.method1460(class375.field4818.method1657(82, (byte) -40) ? 1 : 0, 24710);
            var34.field3016.method1470((byte) -122, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class510.method3017(var34, arg1 ^ 0x10);
            class144.method899(var8, 1128360276, var4, var5);
        }
        if (var6 == 20) {
            class508.field7233 = 0;
            class59.field614 = 2;
            class494.field7003 = arg0;
            class514.field7331++;
            class14.field126 = arg3;
            class249 var35 = class289.method1715(class603.field8579, 103, class41.field470);
            var35.field3016.method1470((byte) -122, class181.field2144 + var5);
            var35.field3016.method1470((byte) -122, class464.field6624 + var4);
            var35.field3016.method1444(arg1 + 1507430628, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var35.field3016.method1471(arg1 ^ 0xFFFFFFFA, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            class510.method3017(var35, 93);
            class144.method899(var8, 1128360276, var4, var5);
        }
        if (var6 == 25) {
            class507.field7231++;
            class14.field126 = arg3;
            class494.field7003 = arg0;
            class508.field7233 = 0;
            class59.field614 = 2;
            class249 var36 = class289.method1715(class418.field6072, 57, class41.field470);
            var36.field3016.method1471(-79, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var36.field3016.method1444(arg1 ^ 0x59D9916C, class464.field6624 + var4);
            var36.field3016.method1446(class181.field2144 + var5, true);
            var36.field3016.method1449(-1, var7);
            class510.method3017(var36, arg1 ^ 0x3);
            class269.method1607(var5, (byte) -24, var4);
        }
        if (var6 == 1003) {
            class494.field7003 = arg0;
            class508.field7233 = 0;
            class14.field126 = arg3;
            class332.field4305++;
            class59.field614 = 2;
            class249 var37 = class289.method1715(class741.field10357, 109, class41.field470);
            var37.field3016.method1446(var7, true);
            class510.method3017(var37, 92);
        }
        if (var6 == 12) {
            class532 var38 = class689.method3895((byte) 126, var5, var4);
            if (var38 != null) {
                class251.method1503((byte) 107);
                class751 var39 = client.method1779(var38);
                class76.method545(var38, var39.field10507, var39.method4186(false), 30011);
                class52.field548 = class603.method3422(1, var38);
                class175.field2063 = var38.field7666 + "<col=ffffff>";
                if (class52.field548 == null) {
                    class52.field548 = "Null";
                }
            }
            return;
        }
        if (var6 == 2) {
            class126.field1330++;
            class59.field614 = 2;
            class14.field126 = arg3;
            class494.field7003 = arg0;
            class508.field7233 = 0;
            class249 var40 = class289.method1715(class239.field2844, 104, class41.field470);
            var40.field3016.method1470((byte) -122, class181.field2144 + var5);
            var40.field3016.method1470((byte) -122, var4 + class464.field6624);
            var40.field3016.method1460(class375.field4818.method1657(82, (byte) -40) ? 1 : 0, 24710);
            var40.field3016.method1444(arg1 + 1507430628, var7);
            class510.method3017(var40, arg1 + 39);
            class269.method1607(var5, (byte) -24, var4);
        }
        if (var6 == 15) {
            if (class58.field594 > 0 && class375.field4818.method1657(82, (byte) -40) && class375.field4818.method1657(81, (byte) -40)) {
                class402.method2451(class181.field2144 + var5, class464.field6624 + var4, class90.field937.field4628, (byte) -112);
            } else {
                class249 var41 = class294.method1747(true, var7, var4, var5);
                if (var7 == 1) {
                    var41.field3016.method1460(-1, 24710);
                    var41.field3016.method1460(-1, 24710);
                    var41.field3016.method1446((int) class227.field2590, true);
                    var41.field3016.method1460(57, 24710);
                    var41.field3016.method1460(class34.field367, 24710);
                    var41.field3016.method1460(class730.field10216, 24710);
                    var41.field3016.method1460(89, 24710);
                    var41.field3016.method1446(class90.field937.field4635, true);
                    var41.field3016.method1446(class90.field937.field4629, true);
                    var41.field3016.method1460(63, 24710);
                } else {
                    class508.field7233 = 0;
                    class14.field126 = arg3;
                    class59.field614 = 1;
                    class494.field7003 = arg0;
                }
                class510.method3017(var41, arg1);
                class647.method3689(true, 0, -4, var5, 1, 1, 0, var4, (byte) -80);
            }
        }
        if (var6 == 60) {
            class183 var42 = class75.field792[var7];
            if (var42 != null) {
                class375.field4820++;
                class508.field7233 = 0;
                class59.field614 = 2;
                class14.field126 = arg3;
                class494.field7003 = arg0;
                class249 var43 = class289.method1715(class44.field496, 48, class41.field470);
                var43.field3016.method1456((byte) -122, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var43.field3016.method1444(1507430696, var7);
                class510.method3017(var43, 60);
                class647.method3689(true, 0, -2, var42.field7193[0], var42.method1128(-1), var42.method1128(-1), 0, var42.field7187[0], (byte) -80);
            }
        }
        if (var6 == 23) {
            class151 var44 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var44 != null) {
                class197 var45 = var44.field1661;
                class14.field126 = arg3;
                class508.field7233 = 0;
                class373.field4770++;
                class494.field7003 = arg0;
                class59.field614 = 2;
                class249 var46 = class289.method1715(class410.field5599, 119, class41.field470);
                var46.field3016.method1449(-1, var7);
                var46.field3016.method1433(78, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                class510.method3017(var46, 116);
                class647.method3689(true, 0, -2, var45.field7193[0], var45.method1128(-1), var45.method1128(-1), 0, var45.field7187[0], (byte) -80);
            }
        }
        if (var6 == 21) {
            class183 var47 = class75.field792[var7];
            if (var47 != null) {
                class508.field7233 = 0;
                class14.field126 = arg3;
                class59.field614 = 2;
                class260.field3207++;
                class494.field7003 = arg0;
                class249 var48 = class289.method1715(class570.field8087, 66, class41.field470);
                var48.field3016.method1460(class375.field4818.method1657(82, (byte) -40) ? 1 : 0, 24710);
                var48.field3016.method1444(1507430696, var7);
                class510.method3017(var48, arg1 + 41);
                class647.method3689(true, 0, -2, var47.field7193[0], var47.method1128(-1), var47.method1128(-1), 0, var47.field7187[0], (byte) -80);
            }
        }
        if (var6 == 50) {
            class14.field126 = arg3;
            class59.field614 = 2;
            class494.field7003 = arg0;
            class663.field9442++;
            class508.field7233 = 0;
            class249 var49 = class289.method1715(class237.field2813, 94, class41.field470);
            var49.field3016.method1456((byte) -111, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var49.field3016.method1446(class464.field6624 + var4, true);
            var49.field3016.method1465(24606, class283.field3449);
            var49.field3016.method1449(-1, Integer.MAX_VALUE & (int) (var8 >>> 32));
            var49.field3016.method1446(var5 + class181.field2144, true);
            var49.field3016.method1470((byte) -122, class620.field8886);
            var49.field3016.method1449(-1, class421.field6093);
            class510.method3017(var49, arg1 ^ 0x16);
            class144.method899(var8, arg1 + 1128360208, var4, var5);
        }
        if (var6 == 57) {
            class183 var50 = class75.field792[var7];
            if (var50 != null) {
                class494.field7003 = arg0;
                class59.field614 = 2;
                class251.field3029++;
                class508.field7233 = 0;
                class14.field126 = arg3;
                class249 var51 = class289.method1715(class253.field3051, 95, class41.field470);
                var51.field3016.method1444(1507430696, var7);
                var51.field3016.method1471(arg1 ^ 0xFFFFFF8F, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                class510.method3017(var51, 95);
                class647.method3689(true, 0, -2, var50.field7193[0], var50.method1128(-1), var50.method1128(arg1 - 69), 0, var50.field7187[0], (byte) -80);
            }
        }
        if (var6 == 8) {
            class183 var52 = class75.field792[var7];
            if (var52 != null) {
                class14.field126 = arg3;
                class508.field7233 = 0;
                class59.field614 = 2;
                class494.field7003 = arg0;
                class288.field3541++;
                class249 var53 = class289.method1715(class591.field8335, 96, class41.field470);
                var53.field3016.method1433(-102, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var53.field3016.method1446(var7, true);
                class510.method3017(var53, 62);
                class647.method3689(true, 0, -2, var52.field7193[0], var52.method1128(arg1 ^ 0xFFFFFFBB), var52.method1128(arg1 - 69), 0, var52.field7187[0], (byte) -80);
            }
        }
        if (var6 == 11) {
            class168.field1865++;
            class494.field7003 = arg0;
            class14.field126 = arg3;
            class508.field7233 = 0;
            class59.field614 = 2;
            class249 var54 = class289.method1715(class463.field6619, 116, class41.field470);
            var54.field3016.method1441(class283.field3449, arg1 - 195);
            var54.field3016.method1470((byte) -122, class620.field8886);
            var54.field3016.method1470((byte) -122, class90.field937.field7107);
            var54.field3016.method1433(-105, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
            var54.field3016.method1470((byte) -122, class421.field6093);
            class510.method3017(var54, 94);
        }
        if (var6 == 30) {
            class151 var55 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var55 != null) {
                class494.field7003 = arg0;
                class59.field614 = 2;
                class197 var56 = var55.field1661;
                class508.field7233 = 0;
                class14.field126 = arg3;
                class23.field210++;
                class249 var57 = class289.method1715(class555.field7945, 79, class41.field470);
                var57.field3016.method1470((byte) -122, var7);
                var57.field3016.method1460(class375.field4818.method1657(82, (byte) -40) ? 1 : 0, arg1 + 24642);
                class510.method3017(var57, 117);
                class647.method3689(true, 0, -2, var56.field7193[0], var56.method1128(-1), var56.method1128(-1), 0, var56.field7187[0], (byte) -80);
            }
        }
        if (var6 == 17) {
            class183 var58 = class75.field792[var7];
            if (var58 != null) {
                class508.field7233 = 0;
                class14.field126 = arg3;
                class494.field7003 = arg0;
                class59.field614 = 2;
                class480.field6873++;
                class249 var59 = class289.method1715(class472.field6756, 83, class41.field470);
                var59.field3016.method1460(class375.field4818.method1657(82, (byte) -40) ? 1 : 0, 24710);
                var59.field3016.method1446(var7, true);
                class510.method3017(var59, 114);
                class647.method3689(true, 0, -2, var58.field7193[0], var58.method1128(arg1 ^ 0xFFFFFFBB), var58.method1128(-1), 0, var58.field7187[0], (byte) -80);
            }
        }
        if (var6 == 3) {
            class183 var60 = class75.field792[var7];
            if (var60 != null) {
                class494.field7003 = arg0;
                class718.field10072++;
                class14.field126 = arg3;
                class59.field614 = 2;
                class508.field7233 = 0;
                class249 var61 = class289.method1715(class222.field2554, 62, class41.field470);
                var61.field3016.method1449(-1, var7);
                var61.field3016.method1471(-44, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                class510.method3017(var61, 113);
                class647.method3689(true, 0, -2, var60.field7193[0], var60.method1128(arg1 - 69), var60.method1128(-1), 0, var60.field7187[0], (byte) -80);
            }
        }
        if (var6 == 1011) {
            class59.field614 = 2;
            class508.field7233 = 0;
            class14.field126 = arg3;
            class494.field7003 = arg0;
            class151 var62 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var62 != null) {
                class197 var63 = var62.field1661;
                class326 var64 = var63.field2293;
                if (var64.field4199 != null) {
                    var64 = var64.method1939(true, class722.field10125);
                }
                if (var64 != null) {
                    class174.field2054++;
                    class249 var65 = class289.method1715(class14.field125, 63, class41.field470);
                    var65.field3016.method1446(var64.field4196, true);
                    class510.method3017(var65, arg1 + 18);
                }
            }
        }
        if (var6 == 59) {
            class151 var66 = (class151) class253.field3052.method1754(false, (long) var7);
            if (var66 != null) {
                class494.field7003 = arg0;
                class152.field1673++;
                class197 var67 = var66.field1661;
                class508.field7233 = 0;
                class59.field614 = 2;
                class14.field126 = arg3;
                class249 var68 = class289.method1715(class514.field7340, arg1 ^ 0x7E, class41.field470);
                var68.field3016.method1444(1507430696, var7);
                var68.field3016.method1445(class283.field3449, true);
                var68.field3016.method1449(-1, class421.field6093);
                var68.field3016.method1433(-109, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var68.field3016.method1470((byte) -122, class620.field8886);
                class510.method3017(var68, arg1 ^ 0x74);
                class647.method3689(true, 0, -2, var67.field7193[0], var67.method1128(-1), var67.method1128(-1), 0, var67.field7187[0], (byte) -80);
            }
        }
        if (var6 == 18) {
            class183 var69 = class75.field792[var7];
            if (var69 != null) {
                class14.field126 = arg3;
                class168.field1865++;
                class59.field614 = 2;
                class494.field7003 = arg0;
                class508.field7233 = 0;
                class249 var70 = class289.method1715(class463.field6619, 74, class41.field470);
                var70.field3016.method1441(class283.field3449, -128);
                var70.field3016.method1470((byte) -122, class620.field8886);
                var70.field3016.method1470((byte) -122, var7);
                var70.field3016.method1433(-92, class375.field4818.method1657(82, (byte) -40) ? 1 : 0);
                var70.field3016.method1470((byte) -122, class421.field6093);
                class510.method3017(var70, 52);
                class647.method3689(true, 0, -2, var69.field7193[0], var69.method1128(-1), var69.method1128(-1), 0, var69.field7187[0], (byte) -80);
            }
        }
        if (var6 == 1012 || var6 == 1001 || var6 == 1008 || var6 == 1007 || var6 == 1006) {
            class237.method1399(var7, var4, 548447816, var6);
        }
        if (class568.field8075) {
            class251.method1503((byte) 105);
        }
        if (class217.field2516 != null && class88.field929 == 0) {
            class11.method50(class217.field2516, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ[B)V", line = 953)
    public final void method1327(int arg0, long arg1, byte[] arg2) {
        field2671++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        int var7 = this.field2664 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field2663[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field2663[var10] = (byte) var16;
            var11 = var16 >>> 8;
            var8 >>>= 0x8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field2665[this.field2657] = (byte) class695.method3919(this.field2665[this.field2657], var15 >>> var7);
            this.field2657++;
            this.field2664 += 8 - var7;
            if (this.field2664 == 512) {
                this.method1324(0);
                this.field2664 = this.field2657 = 0;
            }
            this.field2665[this.field2657] = (byte) class327.method1956(var15 << 8 - var7, 255);
            this.field2664 += var7;
            arg1 -= 8L;
            var5++;
        }
        int var12;
        if (arg1 > (long) arg0) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field2665[this.field2657] = (byte) class695.method3919(this.field2665[this.field2657], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg1 < 8L) {
            this.field2664 = (int) ((long) this.field2664 + arg1);
            return;
        }
        this.field2657++;
        long var13 = arg1 - (long) (8 - var7);
        this.field2664 += 8 - var7;
        if (this.field2664 == 512) {
            this.method1324(0);
            this.field2664 = this.field2657 = 0;
        }
        this.field2665[this.field2657] = (byte) class327.method1956(var12 << 8 - var7, 255);
        this.field2664 += (int) var13;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB[B)V", line = 1037)
    public final void method1328(int arg0, byte arg1, byte[] arg2) {
        this.field2665[this.field2657] = (byte) class695.method3919(this.field2665[this.field2657], 0x80 >>> class327.method1956(this.field2664, 7));
        field2662++;
        this.field2657++;
        if (this.field2657 > 32) {
            while (true) {
                if (this.field2657 >= 64) {
                    this.method1324(0);
                    this.field2657 = 0;
                    break;
                }
                this.field2665[this.field2657++] = 0;
            }
        }
        while (this.field2657 < 32) {
            this.field2665[this.field2657++] = 0;
        }
        class143.method894(this.field2663, 0, this.field2665, 32, 32);
        this.method1324(0);
        if (arg1 > -93) {
            this.method1328(88, (byte) 117, null);
        }
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field2670[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 1087)
    public final void method1329(int arg0) {
        field2659++;
        for (int var2 = 0; var2 < 32; var2++) {
            this.field2663[var2] = 0;
        }
        this.field2664 = this.field2657 = arg0;
        this.field2665[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field2670[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILjava/lang/Class;)Lcs;", line = 1115)
    public static final class340 method1330(int arg0, int arg1, int arg2, Class arg3) {
        class691 var4 = class638.field9170[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class398 var5 = var4.field9739; var5 != null; var5 = var5.field5451) {
            class340 var6 = var5.field5449;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4395 == arg1 && var6.field4387 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
