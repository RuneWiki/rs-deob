import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 extends class18 {

    @OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!hd", name = "Gb", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!hd", name = "wb", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!hd", name = "Ab", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!hd", name = "Cb", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lf;")
    private class36 field1399;

    @OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!hd", name = "Nb", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!hd", name = "rb", descriptor = "Lkd;")
    private static class73 field1397 = class126.method1070((byte) -66, "Login limit exceeded)3");

    @OriginalMember(owner = "client!hd", name = "zb", descriptor = "Lkd;")
    public static class73 field1405 = field1397;

    @OriginalMember(owner = "client!hd", name = "Ob", descriptor = "I")
    public static int field1420 = 0;

    @OriginalMember(owner = "client!hd", name = "Jb", descriptor = "Lkd;")
    private static class73 field1415 = class126.method1070((byte) -66, "FULL");

    @OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lkd;")
    public static class73 field1394 = field1415;

    @OriginalMember(owner = "client!hd", name = "vb", descriptor = "Ljava/lang/Object;")
    public static Object field1401 = new Object();

    @OriginalMember(owner = "client!hd", name = "Qb", descriptor = "I")
    public static int field1422 = -1;

    @OriginalMember(owner = "client!hd", name = "Sb", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!hd", name = "Rb", descriptor = "I")
    public static int field1423 = 0;

    @OriginalMember(owner = "client!hd", name = "Tb", descriptor = "Lkd;")
    public static class73 field1425 = class126.method1070((byte) -66, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!hd", name = "pb", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!hd", name = "xb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!hd", name = "Eb", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!hd", name = "Ib", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!hd", name = "Kb", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!hd", name = "Lb", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!hd", name = "Pb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!hd", name = "yb", descriptor = "[I")
    public static int[] field1404;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public static void method422(int arg0) {
        field1405 = null;
        field1415 = null;
        field1425 = null;
        field1404 = null;
        field1394 = null;
        if (arg0 == 0) {
            field1397 = null;
            field1401 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
    public static final void method423(int arg0, byte arg1) {
        if (arg1 >= -23) {
            field1404 = null;
        }
        if (class26.field754 == 0) {
            class86.field2181.method1013((byte) -36, arg0);
        } else {
            class142.field3548 = arg0;
        }
        field1396++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    public static final void method424(int arg0, boolean arg1) {
        field1398++;
        class39.field1054 += arg0 * 128;
        if (class119.field3031.length < class39.field1054) {
            class39.field1054 -= class119.field3031.length;
            int var2 = (int) (Math.random() * 12.0D);
            class36.method288(true, class57.field1531[var2]);
        }
        int var3 = 0;
        short var4 = 256;
        int var5 = arg0 * 128;
        int var6 = (var4 - arg0) * 128;
        if (arg1) {
            method422(30);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class55.field1487[var3 + var5] - class119.field3031[class119.field3031.length - 1 & class39.field1054 + var3] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class55.field1487[var3++] = var27;
        }
        for (int var8 = var4 - arg0; var8 < var4; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class55.field1487[var24 + var25] = 255;
                } else {
                    class55.field1487[var24 + var25] = 0;
                }
            }
        }
        if (class115.field2888 > 0) {
            class115.field2888 -= arg0 * 4;
        }
        if (class15.field468 > 0) {
            class15.field468 -= arg0 * 4;
        }
        if (class115.field2888 == 0 && class15.field468 == 0) {
            int var9 = (int) (Math.random() * (double) (2000 / arg0));
            if (var9 == 1) {
                class15.field468 = 1024;
            }
            if (var9 == 0) {
                class115.field2888 = 1024;
            }
        }
        for (int var10 = 0; var10 < var4 - arg0; var10++) {
            class118.field3020[var10] = class118.field3020[arg0 + var10];
        }
        for (int var11 = var4 - arg0; var11 < var4; var11++) {
            class118.field3020[var11] = (int) (Math.sin((double) class142.field3532 / 14.0D) * 16.0D + Math.sin((double) class142.field3532 / 15.0D) * 14.0D + Math.sin((double) class142.field3532 / 16.0D) * 12.0D);
            class142.field3532++;
        }
        int var12 = ((class49.field1308 & 0x1) + arg0) / 2;
        class66.field1720 += arg0;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class66.field1720 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class55.field1487[var23 + (var22 << 7)] = 192;
        }
        class66.field1720 = 0;
        for (int var14 = 0; var14 < var4; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var21 + var12 < 128) {
                    var19 += class55.field1487[var20 + var21 + var12];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class55.field1487[var20 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class119.field3057[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var4; var17++) {
                int var18 = var17 * 128;
                if (var4 > var12 + var17) {
                    var16 += class119.field3057[var12 * 128 + var15 + var18];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class119.field3057[var15 + var18 - var12 * 128 - 128];
                }
                if (var17 >= 0) {
                    class55.field1487[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(IB)V")
    public static final void method425(int arg0, byte arg1) {
        field1421++;
        class37.method295(arg0, -118);
        int var2 = 28 % ((arg1 + 13) / 47);
        class125.method1055(arg0, 8494);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lmf;I)V")
    public static final void method426(class89 arg0, int arg1) {
        field1410++;
        if (class49.field1308 == arg0.field2257 || arg0.field2284 == -1 || arg0.field2241 != 0 || arg0.field2296 + 1 > class94.method782(-24669, arg0.field2284).field968[arg0.field2232]) {
            int var2 = class49.field1308 - arg0.field2238;
            int var3 = arg0.field2257 - arg0.field2238;
            int var4 = arg0.field2279 * 128 + arg0.field2233 * 64;
            int var5 = arg0.field2292 * 128 + arg0.field2233 * 64;
            int var6 = arg0.field2287 * 128 + arg0.field2233 * 64;
            arg0.field2264 = ((var3 - var2) * var5 + var2 * var6) / var3;
            int var7 = arg0.field2233 * 64 + arg0.field2226 * 128;
            arg0.field2277 = ((var3 - var2) * var4 + var2 * var7) / var3;
        }
        arg0.field2237 = 0;
        if (arg0.field2281 == 0) {
            arg0.field2293 = 1024;
        }
        if (arg0.field2281 == 1) {
            arg0.field2293 = 1536;
        }
        if (arg0.field2281 == 2) {
            arg0.field2293 = 0;
        }
        if (arg0.field2281 == 3) {
            arg0.field2293 = 512;
        }
        if (arg1 <= 65) {
            field1394 = null;
        }
        arg0.field2265 = arg0.field2293;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
    public static final void method427(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method428((byte) 3);
        }
        if (class104.field2600 != 0 && arg2 != -1) {
            class41.method310(0, false, arg1 ^ 0xFFFFFF82, arg2, class104.field2600, class31.field879);
            class12.field402 = true;
        }
        field1395++;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
    public static final void method428(byte arg0) {
        int var1 = -1;
        if (arg0 != -94) {
            return;
        }
        while (class63.field1661 > var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class14.field435[var1];
            }
            class118 var3 = class42.field1141[var2];
            if (var3 != null) {
                class2.method18(var3, (byte) 113, 1);
            }
            var1++;
        }
        field1414++;
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public static final void method429(int arg0) {
        class125.field3169 = new int[104];
        class86.field2163 = new byte[4][104][104];
        field1409++;
        class99.field2490 = new int[104];
        class116.field2958 = new byte[4][104][104];
        class11.field352 = new int[4][105][105];
        class141.field3513 = new int[104];
        class1.field100 = new byte[4][104][104];
        class61.field1615 = new byte[4][105][105];
        class47.field1236 = new int[104];
        class47.field1245 = new int[105][105];
        class5.field183 = 99;
        if (arg0 != 27348) {
            field1415 = null;
        }
        class129.field3247 = new int[104];
        class12.field400 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Lna;")
    public final class91 method90(int arg0) {
        if (this.field1399 != null) {
            int var2 = class49.field1308 - this.field1418;
            if (var2 > 100 && this.field1399.field992 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field1399.field968[this.field1419]) {
                            break label42;
                        }
                        var2 -= this.field1399.field968[this.field1419];
                        this.field1419++;
                    } while (this.field1399.field976.length > this.field1419);
                    this.field1419 -= this.field1399.field992;
                } while (this.field1419 >= 0 && this.field1399.field976.length > this.field1419);
                this.field1399 = null;
            }
            this.field1418 = class49.field1308 - var2;
        }
        field1403++;
        if (arg0 != 11800) {
            this.method90(23);
        }
        class149 var3 = class122.method1045(31, this.field1407);
        if (var3.field3691 != null) {
            var3 = var3.method1201((byte) 120);
        }
        return var3 == null ? null : var3.method1200(this.field1412, this.field1413, this.field1408, this.field1402, this.field1406, this.field1399, this.field1400, 2, this.field1419);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIZLcc;)V")
    public class53(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class18 arg9) {
        this.field1400 = arg6;
        this.field1412 = arg5;
        this.field1402 = arg2;
        this.field1406 = arg1;
        this.field1413 = arg3;
        this.field1408 = arg4;
        this.field1407 = arg0;
        if (arg7 != -1) {
            this.field1399 = class94.method782(-24669, arg7);
            this.field1418 = class49.field1308 - 1;
            this.field1419 = 0;
            if (this.field1399.field995 == 0 && arg9 != null && arg9 instanceof class53) {
                class53 var11 = (class53) arg9;
                if (this.field1399 == var11.field1399) {
                    this.field1419 = var11.field1419;
                    this.field1418 = var11.field1418;
                    return;
                }
            }
            if (arg8 && this.field1399.field992 != -1) {
                this.field1419 = (int) (Math.random() * (double) this.field1399.field976.length);
                this.field1418 -= (int) ((double) this.field1399.field968[this.field1419] * Math.random());
                return;
            }
        }
    }
}
