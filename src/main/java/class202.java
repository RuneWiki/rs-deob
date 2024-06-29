import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class202 extends class120 {

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "I")
    private int field3235 = 1024;

    @OriginalMember(owner = "client!vk", name = "ib", descriptor = "I")
    private int field3246 = 2048;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    private int field3233 = 3072;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "Lok;")
    public static class41 field3237 = class137.method956("RuneScape wird geladen )2 bitte warten)3)3)3", 45);

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "Lok;")
    private static class41 field3239 = class137.method956("Connection lost)3", 45);

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "Lok;")
    private static class41 field3236 = class137.method956("Unable to find ", 45);

    @OriginalMember(owner = "client!vk", name = "fb", descriptor = "Lok;")
    public static class41 field3243 = field3236;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "Lok;")
    public static class41 field3232 = class137.method956("Lade Texturen )2 ", 45);

    @OriginalMember(owner = "client!vk", name = "kb", descriptor = "[Lok;")
    public static class41[] field3248 = new class41[100];

    @OriginalMember(owner = "client!vk", name = "jb", descriptor = "Lok;")
    public static class41 field3247 = field3239;

    @OriginalMember(owner = "client!vk", name = "mb", descriptor = "Lok;")
    public static class41 field3250 = class137.method956("p12_full", 45);

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!vk", name = "gb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vk", name = "hb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!vk", name = "lb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!vk", name = "nb", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "[I")
    public static int[] field3242;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 4)
    public static void method1432(int arg0) {
        field3236 = null;
        field3239 = null;
        field3250 = null;
        field3232 = null;
        field3243 = null;
        field3242 = null;
        if (arg0 > -122) {
            field3232 = (class41) null;
        }
        field3248 = null;
        field3237 = null;
        field3247 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIII)V", line = 29)
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3234++;
        int var8 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg5);
        int var9 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg4);
        int var10 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg1);
        int var11 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg7);
        int var12 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg5 + arg0);
        int var13 = class109.method733(class15.field192, class237.field3801, (byte) 16, arg4 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class269.method1908(19, class239.field3829[var14], arg6, var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class269.method1908(19, class239.field3829[var15], arg6, var11, var10);
        }
        int var16 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg0 + arg1);
        int var17 = class109.method733(class273.field4449, class153.field2439, (byte) 16, arg7 - arg0);
        if (arg2 != 18480) {
            return;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class239.field3829[var18];
            class269.method1908(arg2 ^ 0x4823, var19, arg6, var16, var10);
            class269.method1908(arg2 ^ 0x4823, var19, arg3, var17, var16);
            class269.method1908(arg2 - 18461, var19, arg6, var11, var17);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[I", line = 84)
    public final int[] method14(int arg0, int arg1) {
        field3238++;
        if (arg1 != -14959) {
            return (int[]) null;
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                var3[var5] = this.field3235 + (var4[var5] * this.field3246 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 260)
    public class202() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(II)I", line = 120)
    public static final int method1434(int arg0, int arg1) {
        field3231++;
        return arg1 > -66 ? 73 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V", line = 145)
    public final void method31(int arg0) {
        this.field3246 = this.field3233 - this.field3235;
        if (arg0 != -31851) {
            method1435(17, (class268) null, (byte) 49);
        }
        field3249++;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IZ)[[I", line = 166)
    public final int[][] method168(int arg0, boolean arg1) {
        field3251++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 123);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class307.field5160; var11++) {
                var8[var11] = (var6[var11] * this.field3246 >> 12) + this.field3235;
                var9[var11] = (var5[var11] * this.field3246 >> 12) + this.field3235;
                var10[var11] = this.field3235 + (var7[var11] * this.field3246 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Llb;II)V", line = 227)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3235 = arg0.method759((byte) -99);
        } else if (arg2 == 1) {
            this.field3233 = arg0.method759((byte) -93);
        } else if (arg2 == 2) {
            this.field1770 = arg0.method792(2) == 1;
        }
        if (arg1 != -1) {
            method1436(51, 26);
        }
        field3241++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILtc;B)V", line = 264)
    public static final void method1435(int arg0, class268 arg1, byte arg2) {
        field3244++;
        if (arg1.field4303 > class18.field234) {
            class260.method1833(-58, arg1);
        } else if (class18.field234 > arg1.field4315) {
            class188.method1352(arg1, 30728);
        } else {
            class244.method1743(arg1, -49);
        }
        if (arg1.field4280 < 128 || arg1.field4311 < 128 || arg1.field4280 >= 13184 || arg1.field4311 >= 13184) {
            arg1.field4303 = 0;
            arg1.field4315 = 0;
            arg1.field4300 = -1;
            arg1.field4289 = -1;
            arg1.field4280 = arg1.field4341[0] * 128 + arg1.method1753((byte) -15) * 64;
            arg1.field4311 = arg1.field4306[0] * 128 + arg1.method1753((byte) -15) * 64;
            arg1.method1900((byte) 101);
        }
        if (arg2 != -44) {
            method1434(86, -57);
        }
        if (class62.field913 == arg1 && (arg1.field4280 < 1536 || arg1.field4311 < 1536 || arg1.field4280 >= 11776 || arg1.field4311 >= 11776)) {
            arg1.field4300 = -1;
            arg1.field4303 = 0;
            arg1.field4289 = -1;
            arg1.field4315 = 0;
            arg1.field4280 = arg1.field4341[0] * 128 + (arg1.method1753((byte) -15) * 64);
            arg1.field4311 = arg1.field4306[0] * 128 + (arg1.method1753((byte) -15) * 64);
            arg1.method1900((byte) 120);
        }
        class111.method751(arg1, -116);
        class299.method2065(arg1, 14875);
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(II)V", line = 325)
    public static final void method1436(int arg0, int arg1) {
        field3245++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class123.field1818[arg0];
        int var3 = class296.field4780[arg0];
        int var4 = (int) class300.field4872[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var5 = class118.field1727[arg0];
        long var6 = class300.field4872[arg0];
        if (var3 == 1002) {
            class148.field2299 = class245.field3941;
            class301.field4878 = 0;
            class167.field2661 = 2;
            class282.field4583 = class151.field2358;
            class50 var8 = class216.field3471[var4];
            if (var8 != null) {
                class147 var9 = var8.field758;
                if (var9.field2284 != null) {
                    var9 = var9.method1015(-1);
                }
                if (var9 != null) {
                    class3.field36++;
                    class285.field4642.method844(-4, 230);
                    class285.field4642.method818(14136, var9.field2247);
                }
            }
        }
        if (var3 == 1) {
            class262.field4165++;
            class285.field4642.method844(-4, 132);
            class285.field4642.method778(var4, (byte) -4);
            class285.field4642.method795((byte) -30, var5);
            class285.field4642.method760(false, var2);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 44) {
            class93.field1371++;
            class109.method742(var2, var5, var6, 1);
            class285.field4642.method844(-4, 61);
            class285.field4642.method778((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -4);
            class285.field4642.method818(14136, class55.field809 + var5);
            class285.field4642.method760(false, var2 + class88.field1300);
        }
        if (var3 == 38) {
            class50 var10 = class216.field3471[var4];
            if (var10 != null) {
                class145.method1004(0, false, 1, 0, var10.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -128, var10.field4306[0]);
                class167.field2661 = 2;
                class301.field4878 = 0;
                class123.field1833++;
                class148.field2299 = class245.field3941;
                class282.field4583 = class151.field2358;
                class285.field4642.method844(-4, 182);
                class285.field4642.method778(class269.field4348, (byte) -4);
                class285.field4642.method818(14136, class226.field3627);
                class285.field4642.method794(var4, 128);
                class285.field4642.method803((byte) 92, class10.field134);
            }
        }
        if (var3 == 1003) {
            class302 var11 = class165.method1157(false, var5);
            if (var11 == null || var11.field5023[var2] < 100000) {
                class171.field2746++;
                class285.field4642.method844(-4, 24);
                class285.field4642.method794(var4, 128);
            } else {
                class262.method1843(class187.method1346(new class41[] { class1.method4(var11.field5023[var2], (byte) 43), class76.field1132, class130.method918(var4, -30).field2120 }, 0), 0, class266.field4233, 127);
            }
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 59) {
            boolean var12 = true;
            class302 var13 = class165.method1157(false, var5);
            if (var13.field4924 > 0) {
                var12 = class189.method1355(var13, -31196);
            }
            if (var12) {
                class285.field4642.method844(-4, 250);
                class266.field4214++;
                class285.field4642.method787(853918096, var5);
            }
        }
        if (var3 == 14) {
            class245 var14 = class246.field3955[var4];
            if (var14 != null) {
                class145.method1004(0, false, 1, 0, var14.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var14.field4306[0]);
                class282.field4583 = class151.field2358;
                class122.field1803++;
                class167.field2661 = 2;
                class301.field4878 = 0;
                class148.field2299 = class245.field3941;
                class285.field4642.method844(-4, 83);
                class285.field4642.method760(false, var4);
            }
        }
        if (var3 == 7 || var3 == 1004) {
            class275.method1953(116, var4, var5, var2, class203.field3286[arg0]);
        }
        if (var3 == 8) {
            class50 var15 = class216.field3471[var4];
            if (var15 != null) {
                class145.method1004(0, false, 1, 0, var15.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var15.field4306[0]);
                class148.field2299 = class245.field3941;
                class282.field4583 = class151.field2358;
                class301.field4878 = 0;
                class104.field1471++;
                class167.field2661 = 2;
                class285.field4642.method844(-4, 42);
                class285.field4642.method778(class75.field1119, (byte) -4);
                class285.field4642.method760(false, var4);
                class285.field4642.method803((byte) 113, class3.field44);
            }
        }
        if (var3 == 16) {
            boolean var16 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -127, var5);
            class311.field5259++;
            if (!var16) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -125, var5);
            }
            class167.field2661 = 2;
            class148.field2299 = class245.field3941;
            class282.field4583 = class151.field2358;
            class301.field4878 = 0;
            class285.field4642.method844(-4, 161);
            class285.field4642.method818(14136, class88.field1300 + var2);
            class285.field4642.method778(class55.field809 + var5, (byte) -4);
            class285.field4642.method818(14136, var4);
        }
        if (var3 == 6) {
            class245 var18 = class246.field3955[var4];
            if (var18 != null) {
                class145.method1004(0, false, 1, 0, var18.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -122, var18.field4306[0]);
                class282.field4583 = class151.field2358;
                class167.field2661 = 2;
                class146.field2229++;
                class301.field4878 = 0;
                class148.field2299 = class245.field3941;
                class285.field4642.method844(-4, 171);
                class285.field4642.method818(14136, var4);
            }
        }
        if (var3 == 45) {
            class50 var19 = class216.field3471[var4];
            if (var19 != null) {
                class145.method1004(0, false, 1, 0, var19.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var19.field4306[0]);
                class266.field4227++;
                class167.field2661 = 2;
                class148.field2299 = class245.field3941;
                class301.field4878 = 0;
                class282.field4583 = class151.field2358;
                class285.field4642.method844(-4, 123);
                class285.field4642.method778(var4, (byte) -4);
            }
        }
        if (var3 == 9) {
            class245 var20 = class246.field3955[var4];
            if (var20 != null) {
                class145.method1004(0, false, 1, 0, var20.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -124, var20.field4306[0]);
                class167.field2661 = 2;
                class282.field4583 = class151.field2358;
                class301.field4878 = 0;
                class78.field1150++;
                class148.field2299 = class245.field3941;
                class285.field4642.method844(-4, 247);
                class285.field4642.method760(false, var4);
            }
        }
        if (var3 == 34 && class109.method742(var2, var5, var6, 1)) {
            class285.field4642.method844(-4, 152);
            class178.field2887++;
            class285.field4642.method778(var5 + class55.field809, (byte) -4);
            class285.field4642.method787(853918096, class3.field44);
            class285.field4642.method818(14136, var2 + class88.field1300);
            class285.field4642.method760(false, class75.field1119);
            class285.field4642.method818(14136, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var3 == 25) {
            class50 var21 = class216.field3471[var4];
            if (var21 != null) {
                class89.field1310++;
                class145.method1004(0, false, 1, 0, var21.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -127, var21.field4306[0]);
                class167.field2661 = 2;
                class282.field4583 = class151.field2358;
                class148.field2299 = class245.field3941;
                class301.field4878 = 0;
                class285.field4642.method844(-4, 142);
                class285.field4642.method760(false, var4);
            }
        }
        if (var3 == 50) {
            class302 var50 = class79.method567(-127, var5, var2);
            if (var50 != null) {
                class118.method845((byte) 104);
                class60.method430(var2, class278.method1963(client.method2119(var50), -1691001909), 255, var5);
                class101.field1445 = 0;
                class94.field1389 = class282.method1984(0, var50);
                if (class94.field1389 == null) {
                    class94.field1389 = class126.field1869;
                }
                if (var50.field4964) {
                    class126.field1871 = class187.method1346(new class41[] { var50.field4945, class146.field2230 }, 0);
                } else {
                    class126.field1871 = class187.method1346(new class41[] { class105.field1488, var50.field4992, class146.field2230 }, 0);
                }
            }
            return;
        }
        if (var3 == 20) {
            class245 var22 = class246.field3955[var4];
            if (var22 != null) {
                class74.field1098++;
                class145.method1004(0, false, 1, 0, var22.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -122, var22.field4306[0]);
                class282.field4583 = class151.field2358;
                class167.field2661 = 2;
                class301.field4878 = 0;
                class148.field2299 = class245.field3941;
                class285.field4642.method844(-4, 49);
                class285.field4642.method778(var4, (byte) -4);
            }
        }
        if (var3 == 51) {
            class285.field4642.method844(-4, 148);
            class33.field507++;
            class285.field4642.method794(var2, 128);
            class285.field4642.method760(false, var4);
            class285.field4642.method787(853918096, var5);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 13) {
            class76.field1131++;
            class285.field4642.method844(-4, 114);
            class285.field4642.method803((byte) 105, var5);
            class285.field4642.method778(var4, (byte) -4);
            class285.field4642.method794(var2, 128);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 46) {
            class50 var23 = class216.field3471[var4];
            if (var23 != null) {
                class145.method1004(0, false, 1, 0, var23.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -123, var23.field4306[0]);
                class282.field4583 = class151.field2358;
                class24.field370++;
                class148.field2299 = class245.field3941;
                class301.field4878 = 0;
                class167.field2661 = 2;
                class285.field4642.method844(-4, 170);
                class285.field4642.method794(var4, 128);
            }
        }
        if (var3 == 30) {
            class50 var24 = class216.field3471[var4];
            if (var24 != null) {
                class35.field526++;
                class145.method1004(0, false, 1, 0, var24.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -121, var24.field4306[0]);
                class282.field4583 = class151.field2358;
                class167.field2661 = 2;
                class148.field2299 = class245.field3941;
                class301.field4878 = 0;
                class285.field4642.method844(-4, 147);
                class285.field4642.method794(var4, 128);
            }
        }
        if (var3 == 42) {
            class50 var25 = class216.field3471[var4];
            if (var25 != null) {
                class265.field4204++;
                class145.method1004(0, false, 1, 0, var25.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -124, var25.field4306[0]);
                class148.field2299 = class245.field3941;
                class167.field2661 = 2;
                class282.field4583 = class151.field2358;
                class301.field4878 = 0;
                class285.field4642.method844(-4, 21);
                class285.field4642.method778(var4, (byte) -4);
            }
        }
        if (var3 == 29) {
            class119.field1745++;
            boolean var26 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -128, var5);
            if (!var26) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var5);
            }
            class167.field2661 = 2;
            class301.field4878 = 0;
            class148.field2299 = class245.field3941;
            class282.field4583 = class151.field2358;
            class285.field4642.method844(-4, 81);
            class285.field4642.method778(var4, (byte) -4);
            class285.field4642.method760(false, var5 + class55.field809);
            class285.field4642.method778(class88.field1300 + var2, (byte) -4);
        }
        if (var3 == 39) {
            class266.field4214++;
            class285.field4642.method844(-4, 250);
            class285.field4642.method787(853918096, var5);
            class302 var28 = class165.method1157(false, var5);
            if (var28.field4958 != null && var28.field4958[0][0] == 5) {
                int var29 = var28.field4958[0][1];
                if (class60.field885[var29] != var28.field4929[0]) {
                    class60.field885[var29] = var28.field4929[0];
                    class161.method1140(var29, 9);
                }
            }
        }
        if (var3 == 3) {
            class109.method742(var2, var5, var6, 1);
            class177.field2877++;
            class285.field4642.method844(-4, 208);
            class285.field4642.method760(false, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class285.field4642.method794(class88.field1300 + var2, 128);
            class285.field4642.method760(false, class55.field809 + var5);
        }
        if (var3 == 12) {
            class180.field2911++;
            boolean var30 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -128, var5);
            if (!var30) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var5);
            }
            class148.field2299 = class245.field3941;
            class301.field4878 = 0;
            class282.field4583 = class151.field2358;
            class167.field2661 = 2;
            class285.field4642.method844(-4, 219);
            class285.field4642.method760(false, var4);
            class285.field4642.method818(14136, class88.field1300 + var2);
            class285.field4642.method818(14136, var5 + class55.field809);
        }
        if (var3 == 1007) {
            class301.field4878 = 0;
            class282.field4583 = class151.field2358;
            class148.field2299 = class245.field3941;
            class160.field2515++;
            class167.field2661 = 2;
            class285.field4642.method844(-4, 168);
            class285.field4642.method760(false, var4);
        }
        if (var3 == 10) {
            class285.field4642.method844(-4, 213);
            class127.field1893++;
            class285.field4642.method803((byte) 119, var5);
            class285.field4642.method778(class75.field1119, (byte) -4);
            class285.field4642.method778(var2, (byte) -4);
            class285.field4642.method787(853918096, class3.field44);
        }
        if (var3 == 11) {
            class41.field664++;
            boolean var32 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -127, var5);
            if (!var32) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -124, var5);
            }
            class167.field2661 = 2;
            class148.field2299 = class245.field3941;
            class301.field4878 = 0;
            class282.field4583 = class151.field2358;
            class285.field4642.method844(-4, 181);
            class285.field4642.method818(14136, var4);
            class285.field4642.method818(14136, var2 + class88.field1300);
            class285.field4642.method778(class75.field1119, (byte) -4);
            class285.field4642.method805(class3.field44, 25919);
            class285.field4642.method760(false, class55.field809 + var5);
        }
        if (var3 == 5) {
            class235.field3767++;
            class285.field4642.method844(-4, 246);
            class285.field4642.method795((byte) -30, var5);
            class285.field4642.method818(14136, var2);
            class285.field4642.method794(var4, 128);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 37) {
            class289.field4686++;
            class285.field4642.method844(-4, 252);
            class285.field4642.method794(var2, 128);
            class285.field4642.method803((byte) 124, var5);
            class285.field4642.method794(var4, 128);
            class285.field4642.method787(853918096, class3.field44);
            class285.field4642.method760(false, class75.field1119);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 23) {
            class299.field4849++;
            boolean var34 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -125, var5);
            if (!var34) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -125, var5);
            }
            class301.field4878 = 0;
            class167.field2661 = 2;
            class282.field4583 = class151.field2358;
            class148.field2299 = class245.field3941;
            class285.field4642.method844(-4, 56);
            class285.field4642.method760(false, var5 + class55.field809);
            class285.field4642.method778(class88.field1300 + var2, (byte) -4);
            class285.field4642.method778(var4, (byte) -4);
        }
        if (var3 == 21) {
            class97.field1424++;
            class285.field4642.method844(-4, 112);
            class285.field4642.method818(14136, var2);
            class285.field4642.method794(var4, 128);
            class285.field4642.method805(var5, 25919);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 18) {
            class285.field4642.method844(-4, 165);
            class285.field4642.method818(14136, var4);
            class191.field3080++;
            class285.field4642.method787(853918096, var5);
            class285.field4642.method794(var2, 128);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 28) {
            class245 var36 = class246.field3955[var4];
            if (var36 != null) {
                class145.method1004(0, false, 1, 0, var36.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -121, var36.field4306[0]);
                class167.field2661 = 2;
                class199.field3193++;
                class148.field2299 = class245.field3941;
                class301.field4878 = 0;
                class282.field4583 = class151.field2358;
                class285.field4642.method844(-4, 205);
                class285.field4642.method778(var4, (byte) -4);
                class285.field4642.method803((byte) 106, class3.field44);
                class285.field4642.method778(class75.field1119, (byte) -4);
            }
        }
        if (var3 == 22) {
            class164.field2590++;
            boolean var37 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -127, var5);
            if (!var37) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -128, var5);
            }
            class282.field4583 = class151.field2358;
            class167.field2661 = 2;
            class301.field4878 = 0;
            class148.field2299 = class245.field3941;
            class285.field4642.method844(-4, 177);
            class285.field4642.method760(false, var2 + class88.field1300);
            class285.field4642.method778(var4, (byte) -4);
            class285.field4642.method760(false, var5 + class55.field809);
        }
        if (var3 == 48) {
            class245 var39 = class246.field3955[var4];
            if (var39 != null) {
                class136.field2024++;
                class145.method1004(0, false, 1, 0, var39.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -122, var39.field4306[0]);
                class301.field4878 = 0;
                class167.field2661 = 2;
                class148.field2299 = class245.field3941;
                class282.field4583 = class151.field2358;
                class285.field4642.method844(-4, 65);
                class285.field4642.method818(14136, var4);
            }
        }
        if (var3 == 41 && class109.method742(var2, var5, var6, 1)) {
            class285.field4642.method844(-4, 44);
            class285.field4642.method760(false, var5 + class55.field809);
            class214.field3442++;
            class285.field4642.method818(14136, class269.field4348);
            class285.field4642.method805(class10.field134, 25919);
            class285.field4642.method794(class226.field3627, 128);
            class285.field4642.method794(Integer.MAX_VALUE & (int) (var6 >>> 32), 128);
            class285.field4642.method818(14136, class88.field1300 + var2);
        }
        if (var3 == 15) {
            class285.field4642.method844(-4, 97);
            class285.field4642.method818(14136, var2);
            class296.field4779++;
            class285.field4642.method794(var4, 128);
            class285.field4642.method795((byte) -30, var5);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 49) {
            class273.field4444++;
            boolean var40 = class145.method1004(0, false, 0, 0, var2, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], 0, -123, var5);
            if (!var40) {
                class145.method1004(0, false, 1, 0, var2, 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var5);
            }
            class301.field4878 = 0;
            class167.field2661 = 2;
            class148.field2299 = class245.field3941;
            class282.field4583 = class151.field2358;
            class285.field4642.method844(-4, 179);
            class285.field4642.method818(14136, class55.field809 + var5);
            class285.field4642.method794(var4, 128);
            class285.field4642.method760(false, var2 + class88.field1300);
            class285.field4642.method795((byte) -30, class10.field134);
            class285.field4642.method794(class226.field3627, 128);
            class285.field4642.method778(class269.field4348, (byte) -4);
        }
        if (var3 == 35) {
            class81.field1189++;
            class285.field4642.method844(-4, 218);
            class285.field4642.method794(var4, 128);
            class285.field4642.method818(14136, var2);
            class285.field4642.method795((byte) -30, var5);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 33) {
            class285.field4642.method844(-4, 250);
            class285.field4642.method787(853918096, var5);
            class302 var42 = class165.method1157(false, var5);
            if (var42.field4958 != null && var42.field4958[0][0] == 5) {
                int var43 = var42.field4958[0][1];
                class60.field885[var43] = 1 - class60.field885[var43];
                class161.method1140(var43, 9);
            }
            class266.field4214++;
        }
        if (var3 == 19) {
            class245 var44 = class246.field3955[var4];
            if (var44 != null) {
                class181.field2935++;
                class145.method1004(0, false, 1, 0, var44.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -125, var44.field4306[0]);
                class167.field2661 = 2;
                class148.field2299 = class245.field3941;
                class282.field4583 = class151.field2358;
                class301.field4878 = 0;
                class285.field4642.method844(-4, 90);
                class285.field4642.method760(false, var4);
            }
        }
        if (var3 == 1001) {
            class171.field2746++;
            class282.field4583 = class151.field2358;
            class167.field2661 = 2;
            class301.field4878 = 0;
            class148.field2299 = class245.field3941;
            class285.field4642.method844(-4, 24);
            class285.field4642.method794(var4, 128);
        }
        if (var3 == 43 && class109.field1526 == null) {
            class216.method1561(var5, 2, var2);
            class109.field1526 = class79.method567(-123, var5, var2);
            class18.method91(28515, class109.field1526);
        }
        int var45 = -111 / ((-arg1 - 25) / 57);
        if (var3 == 17) {
            class118.method845((byte) 104);
            class302 var46 = class165.method1157(false, var5);
            class101.field1445 = 1;
            class226.field3627 = var2;
            class10.field134 = var5;
            class269.field4348 = var4;
            class18.method91(28515, var46);
            class74.field1096 = class187.method1346(new class41[] { class78.field1155, class130.method918(var4, -66).field2120, class146.field2230 }, 0);
            if (class74.field1096 == null) {
                class74.field1096 = class129.field1918;
            }
            return;
        }
        if (var3 == 31) {
            class216.method1562(206);
        }
        if (var3 == 26) {
            class285.field4642.method844(-4, 143);
            class83.field1212++;
            class285.field4642.method818(14136, var2);
            class285.field4642.method803((byte) 91, var5);
            class285.field4642.method778(var4, (byte) -4);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 58) {
            class245 var47 = class246.field3955[var4];
            if (var47 != null) {
                class145.method1004(0, false, 1, 0, var47.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -125, var47.field4306[0]);
                class167.field2661 = 2;
                class301.field4878 = 0;
                class282.field4583 = class151.field2358;
                class148.field2299 = class245.field3941;
                class273.field4461++;
                class285.field4642.method844(-4, 197);
                class285.field4642.method760(false, var4);
            }
        }
        if (var3 == 24) {
            class313.field5282++;
            class285.field4642.method844(-4, 157);
            class285.field4642.method778(var2, (byte) -4);
            class285.field4642.method803((byte) 119, var5);
            class285.field4642.method760(false, var4);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 4) {
            class245 var48 = class246.field3955[var4];
            if (var48 != null) {
                class22.field341++;
                class145.method1004(0, false, 1, 0, var48.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -124, var48.field4306[0]);
                class301.field4878 = 0;
                class148.field2299 = class245.field3941;
                class282.field4583 = class151.field2358;
                class167.field2661 = 2;
                class285.field4642.method844(-4, 188);
                class285.field4642.method760(false, class226.field3627);
                class285.field4642.method794(var4, 128);
                class285.field4642.method778(class269.field4348, (byte) -4);
                class285.field4642.method795((byte) -30, class10.field134);
            }
        }
        if (var3 == 32) {
            class245 var49 = class246.field3955[var4];
            if (var49 != null) {
                class145.method1004(0, false, 1, 0, var49.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -127, var49.field4306[0]);
                class301.field4878 = 0;
                class282.field4583 = class151.field2358;
                class22.field334++;
                class148.field2299 = class245.field3941;
                class167.field2661 = 2;
                class285.field4642.method844(-4, 128);
                class285.field4642.method794(var4, 128);
            }
        }
        if (var3 == 36) {
            class15.method67(class55.field807, var2, var5);
        }
        if (var3 == 47) {
            class1.field4 = true;
            class15.method67(class55.field807, var2, var5);
        }
        if (var3 == 2) {
            class65.field990++;
            class285.field4642.method844(-4, 0);
            class285.field4642.method805(var5, 25919);
            class285.field4642.method778(class269.field4348, (byte) -4);
            class285.field4642.method803((byte) 109, class10.field134);
            class285.field4642.method818(14136, var2);
            class285.field4642.method778(var4, (byte) -4);
            class285.field4642.method778(class226.field3627, (byte) -4);
            class317.field5353 = 0;
            class316.field5341 = class165.method1157(false, var5);
            class313.field5286 = var2;
        }
        if (var3 == 1006) {
            class48.field744++;
            class109.method742(var2, var5, var6, 1);
            class285.field4642.method844(-4, 150);
            class285.field4642.method778(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -4);
            class285.field4642.method778(class88.field1300 + var2, (byte) -4);
            class285.field4642.method760(false, class55.field809 + var5);
        }
        if (var3 == 40) {
            class109.method742(var2, var5, var6, 1);
            class290.field4715++;
            class285.field4642.method844(-4, 202);
            class285.field4642.method778(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -4);
            class285.field4642.method778(var5 + class55.field809, (byte) -4);
            class285.field4642.method818(14136, class88.field1300 + var2);
        }
        if (var3 == 57) {
            class127.field1891++;
            class109.method742(var2, var5, var6, 1);
            class285.field4642.method844(-4, 31);
            class285.field4642.method778(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -4);
            class285.field4642.method778(var5 + class55.field809, (byte) -4);
            class285.field4642.method760(false, class88.field1300 + var2);
        }
        if (class101.field1445 != 0) {
            class101.field1445 = 0;
            class18.method91(28515, class165.method1157(false, class10.field134));
        }
        if (class128.field1901) {
            class118.method845((byte) 104);
        }
        if (class316.field5341 != null && class317.field5353 == 0) {
            class18.method91(28515, class316.field5341);
        }
    }
}
