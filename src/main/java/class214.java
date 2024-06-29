import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class214 {

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[I")
    public static int[] field3673 = new int[256];

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Ljf;")
    public static class229 field3680 = class212.method1457((byte) 90, "details");

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Ljf;")
    public static class229 field3682;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "Ljf;")
    public static class229 field3685;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "Lni;")
    public static class24 field3683;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "J")
    private long field3675;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "J")
    private long field3681;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Lek;")
    public static class185 field3687;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Z")
    public boolean field3668;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[I")
    private int[] field3664;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[I")
    private int[] field3672;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILcm;)Lrl;", line = 5)
    public final class196 method1465(int arg0, int arg1, class194 arg2) {
        field3666++;
        if (this.field3667 != arg0) {
            return class224.method1541((byte) 20, this.field3667).method1160(arg2, arg1, 0);
        }
        class196 var4 = (class196) class249.field4383.method229(this.field3681, -14);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field3672[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class30.method257(var7 & 0x3FFFFFFF, -4923).method1968(-23437)) {
                        var5 = true;
                    }
                } else if (!class113.method799(var7 & 0x3FFFFFFF, (byte) 50).method2124(-109, this.field3668)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class197[] var8 = new class197[12];
            int var9 = 0;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field3672[var10];
                if ((var11 & 0x40000000) != 0) {
                    class197 var12 = class113.method799(var11 & 0x3FFFFFFF, (byte) 50).method2118((byte) 123, this.field3668);
                    if (var12 != null) {
                        var8[var9++] = var12;
                    }
                } else if ((Integer.MIN_VALUE & var11) != 0) {
                    class197 var13 = class30.method257(var11 & 0x3FFFFFFF, -4923).method1973(80);
                    if (var13 != null) {
                        var8[var9++] = var13;
                    }
                }
            }
            class197 var14 = new class197(var8, var9);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field3664[var15] < class237.field4113[var15].length) {
                    var14.method1359(class131.field2311[var15], class237.field4113[var15][this.field3664[var15]]);
                }
                if (this.field3664[var15] < class252.field4404[var15].length) {
                    var14.method1359(class97.field1726[var15], class252.field4404[var15][this.field3664[var15]]);
                }
            }
            var4 = var14.method1355(64, 768, -50, -10, -50);
            class249.field4383.method227(-25077, var4, this.field3681);
        }
        if (arg2 != null) {
            var4 = arg2.method1329(true, var4, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)I", line = 116)
    public final int method1466(boolean arg0) {
        if (!arg0) {
            this.method1476(106, (class194) null, (class194) null, -52, (byte) -52);
        }
        field3669++;
        return this.field3667 == -1 ? (this.field3672[11] << 5) + (this.field3664[0] << 25) + (this.field3664[4] << 20) + (this.field3672[0] << 15) + ((this.field3672[8] << 10) - -this.field3672[1]) : class224.method1541((byte) 20, this.field3667).field2890 + 305419896;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I", line = 132)
    public static final int method1467(int arg0, int arg1) {
        field3676++;
        class10 var2 = class205.method1427(5000, arg1);
        int var3 = var2.field123;
        if (arg0 == 15) {
            int var4 = var2.field114;
            int var5 = var2.field127;
            int var6 = client.field4464[var5 - var4];
            return var6 & class286.field4908[var3] >> var4;
        } else {
            return -29;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "([I[IZZI)V", line = 161)
    public final void method1468(int[] arg0, int[] arg1, boolean arg2, boolean arg3, int arg4) {
        field3678++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class179.field3094; var7++) {
                    class281 var8 = class30.method257(var7, -4923);
                    if (var8 != null && !var8.field4812 && var8.field4802 == ((arg2 ? 7 : 0) + var6)) {
                        arg1[class238.field4157[var6]] = class97.method665(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3672 = arg1;
        this.field3668 = arg2;
        this.field3664 = arg0;
        this.field3667 = arg4;
        if (arg3) {
            this.method1474((byte) -46);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V", line = 206)
    public static final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class97.field1716[0].method543(arg2, arg3);
        field3674++;
        class97.field1716[1].method543(arg2, arg3 + arg1 - 16);
        int var6 = (arg1 - 32) * arg1 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg5 / (arg4 - arg1);
        if (arg0 != 7708) {
            return;
        }
        if (!class108.field1900) {
            class114.method803(arg2, arg3 + 16, 16, arg1 - 32, class253.field4423);
            class114.method803(arg2, arg3 + var7 + 16, 16, var6, class15.field224);
            class114.method810(arg2, arg3 - (-var7 - 16), var6, class78.field1430);
            class114.method810(arg2 + 1, arg3 + 16 - -var7, var6, class78.field1430);
            class114.method815(arg2, var7 + arg3 + 16, 16, class78.field1430);
            class114.method815(arg2, var7 + arg3 + 17, 16, class78.field1430);
            class114.method810(arg2 + 15, arg3 + 16 + var7, var6, class281.field4819);
            class114.method810(arg2 + 14, var7 + 17 + arg3, var6 - 1, class281.field4819);
            class114.method815(arg2, arg3 + var6 + var7 + 15, 16, class281.field4819);
            class114.method815(arg2 + 1, var7 + 14 + arg3 + var6, 15, class281.field4819);
            return;
        }
        class163.method1102(arg2, arg3 + 16, 16, arg1 - 32, class253.field4423);
        class163.method1102(arg2, arg3 - (-var7 - 16), 16, var6, class15.field224);
        class163.method1101(arg2, var7 + arg3 + 16, var6, class78.field1430);
        class163.method1101(arg2 + 1, arg3 + 16 + var7, var6, class78.field1430);
        class163.method1094(arg2, arg3 + var7 + 16, 16, class78.field1430);
        class163.method1094(arg2, arg3 - (-var7 - 17), 16, class78.field1430);
        class163.method1101(arg2 + 15, arg3 + 16 - -var7, var6, class281.field4819);
        class163.method1101(arg2 + 14, arg3 + var7 + 17, var6 - 1, class281.field4819);
        class163.method1094(arg2, arg3 + var7 + var6 + 15, 16, class281.field4819);
        class163.method1094(arg2 + 1, arg3 + 14 + var6 + var7, 15, class281.field4819);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V", line = 253)
    public final void method1470(boolean arg0, int arg1) {
        field3670++;
        this.field3668 = arg0;
        this.method1474((byte) -46);
        if (arg1 != -343) {
            this.method1473((byte) 37, 59, 41, (class194) null, -96);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V", line = 270)
    public final void method1471(int arg0, int arg1, int arg2) {
        field3671++;
        this.field3664[arg1] = arg2;
        this.method1474((byte) -46);
        if (arg0 != 32274) {
            field3680 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)V", line = 282)
    public final void method1472(byte arg0, int arg1, int arg2) {
        field3665++;
        int var4 = class238.field4157[arg1];
        if (this.field3672[var4] == 0) {
            return;
        }
        if (arg0 < 118) {
            this.method1471(-48, -38, 33);
        }
        if (class30.method257(arg2, -4923) != null) {
            this.field3672[var4] = class97.method665(Integer.MIN_VALUE, arg2);
            this.method1474((byte) -46);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BIILcm;I)Lrl;", line = 304)
    public final class196 method1473(byte arg0, int arg1, int arg2, class194 arg3, int arg4) {
        if (arg0 != -84) {
            this.method1473((byte) 74, 53, -16, (class194) null, -9);
        }
        field3679++;
        long var6 = (long) (arg1 << 16) | (long) arg2 << 32 | (long) arg2;
        class196 var8 = (class196) class249.field4383.method229(var6, arg0 ^ 0x5E);
        if (var8 == null) {
            class197[] var9 = new class197[2];
            int var10 = 0;
            if (!class30.method257(arg2, -4923).method1968(-23437) || !class30.method257(arg1, -4923).method1968(-23437)) {
                return null;
            }
            class197 var11 = class30.method257(arg2, -4923).method1973(arg0 ^ 0xFFFFFFC2);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class197 var12 = class30.method257(arg1, -4923).method1973(arg0 ^ 0x22);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class197 var13 = new class197(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3664[var14] < class237.field4113[var14].length) {
                    var13.method1359(class131.field2311[var14], class237.field4113[var14][this.field3664[var14]]);
                }
                if (class252.field4404[var14].length > this.field3664[var14]) {
                    var13.method1359(class97.field1726[var14], class252.field4404[var14][this.field3664[var14]]);
                }
            }
            var8 = var13.method1355(64, 768, -50, -10, -50);
            class249.field4383.method227(-25077, var8, var6);
        }
        if (arg3 != null) {
            var8 = arg3.method1329(true, var8, arg4);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 371)
    private final void method1474(byte arg0) {
        long[] var2 = class82.field1513;
        long var3 = this.field3681;
        this.field3681 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3681 = this.field3681 >>> 8 ^ var2[(int) ((this.field3681 ^ (long) (this.field3672[var5] >> 24)) & 0xFFL)];
            this.field3681 = this.field3681 >>> 8 ^ var2[(int) (((long) (this.field3672[var5] >> 16) ^ this.field3681) & 0xFFL)];
            this.field3681 = this.field3681 >>> 8 ^ var2[(int) ((this.field3681 ^ (long) (this.field3672[var5] >> 8)) & 0xFFL)];
            this.field3681 = this.field3681 >>> 8 ^ var2[(int) (((long) this.field3672[var5] ^ this.field3681) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3681 = this.field3681 >>> 8 ^ var2[(int) ((this.field3681 ^ (long) this.field3664[var6]) & 0xFFL)];
        }
        field3677++;
        this.field3681 = this.field3681 >>> 8 ^ var2[(int) ((this.field3681 ^ (long) (this.field3668 ? 1 : 0)) & 0xFFL)];
        if (arg0 != -46) {
            field3687 = (class185) null;
        }
        if (var3 != 0L && this.field3681 != var3) {
            class93.field1685.method232(true, var3);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 416)
    public static void method1475(byte arg0) {
        if (arg0 < 26) {
            method1475((byte) -5);
        }
        field3683 = null;
        field3685 = null;
        field3682 = null;
        field3680 = null;
        field3687 = null;
        field3673 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILcm;Lcm;IB)Lrl;", line = 433)
    public final class196 method1476(int arg0, class194 arg1, class194 arg2, int arg3, byte arg4) {
        field3663++;
        if (this.field3667 != -1) {
            return class224.method1541((byte) 20, this.field3667).method1155(arg3, arg2, 78, arg1, arg0);
        }
        int[] var6 = this.field3672;
        long var7 = this.field3681;
        if (arg1 != null && (arg1.field3390 >= 0 || arg1.field3363 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field3672[var9];
            }
            if (arg1.field3390 >= 0) {
                if (arg1.field3390 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class97.method665(1073741824, arg1.field3390);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg1.field3363 >= 0) {
                if (arg1.field3363 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class97.method665(1073741824, arg1.field3363);
                    var7 ^= (long) var6[3];
                }
            }
        }
        if (arg4 != -70) {
            this.method1466(false);
        }
        class196 var10 = (class196) class93.field1685.method229(var7, -14);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var6[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class30.method257(var13 & 0x3FFFFFFF, -4923).method1969(-20033)) {
                        var11 = true;
                    }
                } else if (!class113.method799(var13 & 0x3FFFFFFF, (byte) 50).method2116(this.field3668, -98)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3675 != -1L) {
                    var10 = (class196) class93.field1685.method229(this.field3675, -14);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class197[] var14 = new class197[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var6[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class197 var19 = class113.method799(var17 & 0x3FFFFFFF, (byte) 50).method2122(this.field3668, true);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((var17 & Integer.MIN_VALUE) != 0) {
                        class197 var18 = class30.method257(var17 & 0x3FFFFFFF, -4923).method1974(0);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var6[0];
                if ((var20 & 0x40000000) != 0) {
                    class313 var21 = class113.method799(var20 & 0x3FFFFFFF, (byte) 50);
                    if (var21.field5287 != null) {
                        for (int var22 = 0; var22 < var21.field5287.length; var22++) {
                            if (var21.field5287[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field5287[var22][1];
                                int var24 = var21.field5287[var22][0];
                                int var25 = var21.field5287[var22][2];
                                int var26 = var21.field5287[var22][3];
                                int var27 = var21.field5287[var22][5];
                                int var28 = var21.field5287[var22][4];
                                var14[var22 + 1].method1342(var24, var23, var25);
                                var14[var22 + 1].method1354(var26, var28, var27);
                            }
                        }
                    }
                }
                class197 var29 = new class197(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (class237.field4113[var30].length > this.field3664[var30]) {
                        var29.method1359(class131.field2311[var30], class237.field4113[var30][this.field3664[var30]]);
                    }
                    if (this.field3664[var30] < class252.field4404[var30].length) {
                        var29.method1359(class97.field1726[var30], class252.field4404[var30][this.field3664[var30]]);
                    }
                }
                var10 = var29.method1355(64, 850, -30, -50, -30);
                if (class108.field1900) {
                    ((class239) var10).method1711(false, false, true, true, false, false, true);
                }
                class93.field1685.method227(arg4 - 25007, var10, var7);
                this.field3675 = var7;
            }
        }
        if (arg1 == null && arg2 == null) {
            return var10;
        }
        class196 var31;
        if (arg1 != null && arg2 != null) {
            var31 = arg1.method1333(arg3, arg2, arg0, var10, 1007160272);
        } else if (arg1 == null) {
            var31 = arg2.method1330(arg0, var10, 769030352);
        } else {
            var31 = arg1.method1330(arg3, var10, 769030352);
        }
        return var31;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3673[var0] = var1;
        }
        field3682 = class212.method1457((byte) 97, "blinken3:");
        field3684 = 0;
        field3685 = class212.method1457((byte) 70, ":assist:");
        field3683 = new class24(50);
        field3686 = 0;
    }
}
