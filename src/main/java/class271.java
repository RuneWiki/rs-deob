import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class271 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public int field4646 = -1;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public int field4648 = -1;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public int field4665 = -1;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Z")
    public boolean field4673 = false;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public int field4669 = -1;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
    private boolean field4656 = false;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public int field4651 = 5;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public int field4674 = 2;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field4663 = -1;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public int field4677 = 99;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field4652 = 128;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lve;")
    public static class255 field4662 = class87.method607(105, "(U4");

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lve;")
    private static class255 field4668 = class87.method607(33, "Null");

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lve;")
    public static class255 field4661 = class87.method607(38, "Untersuchen");

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lwl;")
    public static class81 field4658 = new class81(64);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
    public static int[] field4678 = new int[25];

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[I")
    public static int[] field4679 = new int[100];

    @OriginalMember(owner = "client!n", name = "N", descriptor = "D")
    public static double field4682 = -1.0D;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[I")
    private int[] field4659;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public int[] field4667;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
    private int[] field4671;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "[I")
    public int[] field4680;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "[Lpc;")
    public static class83[] field4681;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "[[I")
    public int[][] field4672;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 13)
    public static final void method1880(byte arg0) {
        int var1 = 69 % ((71 - arg0) / 34);
        for (int var2 = 0; var2 < 5; var2++) {
            class247.field4138[var2] = false;
        }
        class68.field1017 = -1;
        field4675++;
        class3.field50 = 1;
        class17.field258 = -1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lof;BI)Lof;", line = 32)
    public final class227 method1881(class227 arg0, byte arg1, int arg2) {
        field4645++;
        int var4 = this.field4667[arg2];
        class42 var5 = class107.method828((byte) -40, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1373(true, true);
        }
        if (arg1 >= -78) {
            method1891((class255) null, -60);
        }
        class227 var7 = arg0.method1373(!var5.method260(var6, 123), !this.field4656);
        var7.method1381(var5, var6, this.field4656);
        return var7;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILof;I)Lof;", line = 55)
    public final class227 method1882(int arg0, class227 arg1, int arg2) {
        field4647++;
        int var4 = this.field4667[arg2];
        class42 var5 = class107.method828((byte) -40, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1373(true, true);
        }
        class42 var7 = null;
        int var8 = 0;
        if (this.field4671 != null && arg2 < this.field4671.length) {
            int var9 = this.field4671[arg2];
            var7 = class107.method828((byte) -40, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class227 var12 = arg1.method1373(!var5.method260(var6, 123), !this.field4656);
            var12.method1381(var5, var6, this.field4656);
            return var12;
        }
        class227 var10 = arg1.method1373(!var5.method260(var6, 113) & !var7.method260(var8, 113), !this.field4656);
        int var11 = 83 % ((45 - arg0) / 36);
        var10.method1381(var5, var6, this.field4656);
        var10.method1381(var7, var8, this.field4656);
        return var10;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)V", line = 98)
    public static final void method1883(boolean arg0, int arg1) {
        field4664++;
        class53 var2 = class303.method2112(-1155040160, arg1, 10);
        if (!arg0) {
            var2.method326(-101);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lof;IB)Lof;", line = 111)
    public final class227 method1884(class227 arg0, int arg1, byte arg2) {
        int var4 = this.field4667[arg1];
        field4654++;
        class42 var5 = class107.method828((byte) -40, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1360(true, true);
        }
        class227 var7 = arg0.method1360(!var5.method260(var6, 113), !this.field4656);
        var7.method1381(var5, var6, this.field4656);
        if (arg2 <= 1) {
            field4652 = 125;
        }
        return var7;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 144)
    public static final void method1885(int arg0) {
        field4650++;
        class143.method1061();
        if (arg0 != -5) {
            field4681 = (class83[]) null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class310.field5292[var1].method1177((byte) -60);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 176)
    public final void method1886(byte arg0) {
        if (this.field4646 == -1) {
            if (this.field4659 == null) {
                this.field4646 = 0;
            } else {
                this.field4646 = 2;
            }
        }
        field4666++;
        if (this.field4663 == -1) {
            if (this.field4659 == null) {
                this.field4663 = 0;
            } else {
                this.field4663 = 2;
            }
        }
        if (arg0 < 51) {
            this.field4667 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILpb;)V", line = 208)
    private final void method1887(int arg0, int arg1, class70 arg2) {
        int var4 = -109 % ((-arg1 - 49) / 37);
        if (arg0 == 1) {
            int var14 = arg2.method423(255);
            this.field4680 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4680[var15] = arg2.method423(255);
            }
            this.field4667 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4667[var16] = arg2.method423(255);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field4667[var17] = (arg2.method423(255) << 16) + this.field4667[var17];
            }
        } else if (arg0 == 2) {
            this.field4648 = arg2.method423(255);
        } else if (arg0 == 3) {
            int var5 = arg2.method481(0);
            this.field4659 = new int[var5 + 1];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4659[var6] = arg2.method481(0);
            }
            this.field4659[var5] = 9999999;
        } else if (arg0 == 4) {
            this.field4673 = true;
        } else if (arg0 == 5) {
            this.field4651 = arg2.method481(0);
        } else if (arg0 == 6) {
            this.field4665 = arg2.method423(255);
        } else if (arg0 == 7) {
            this.field4669 = arg2.method423(255);
        } else if (arg0 == 8) {
            this.field4677 = arg2.method481(0);
        } else if (arg0 == 9) {
            this.field4663 = arg2.method481(0);
        } else if (arg0 == 10) {
            this.field4646 = arg2.method481(0);
        } else if (arg0 == 11) {
            this.field4674 = arg2.method481(0);
        } else if (arg0 == 12) {
            int var11 = arg2.method481(0);
            this.field4671 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field4671[var12] = arg2.method423(255);
            }
            for (int var13 = 0; var13 < var11; var13++) {
                this.field4671[var13] += arg2.method423(255) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method423(255);
            this.field4672 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method481(0);
                if (var9 > 0) {
                    this.field4672[var8] = new int[var9];
                    this.field4672[var8][0] = arg2.method465(true);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field4672[var8][var10] = arg2.method423(255);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4656 = true;
        }
        field4644++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lpb;I)V", line = 364)
    public final void method1888(class70 arg0, int arg1) {
        if (arg1 != 19115) {
            this.field4669 = -14;
        }
        field4649++;
        while (true) {
            int var3 = arg0.method481(0);
            if (var3 == 0) {
                return;
            }
            this.method1887(var3, 118, arg0);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 385)
    public static void method1889(int arg0) {
        field4678 = null;
        field4662 = null;
        if (arg0 >= -66) {
            field4661 = (class255) null;
        }
        field4679 = null;
        field4668 = null;
        field4681 = null;
        field4661 = null;
        field4658 = null;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)Lpc;", line = 410)
    public static final class83 method1890(int arg0) {
        int var1 = class187.field3027[0] * class132.field2173[0];
        field4657++;
        byte[] var2 = class282.field4849[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class18.field296[class154.method1134(255, var2[var4])];
        }
        class83 var5 = new class83(class153.field2608, class154.field2632, class131.field2167[0], class298.field5098[0], class132.field2173[0], class187.field3027[arg0], var3);
        class111.method850(-3);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lve;I)I", line = 433)
    public static final int method1891(class255 arg0, int arg1) {
        field4653++;
        int var2 = 106 / ((arg1 + 7) / 58);
        return arg0.method1774(-41) + 1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ln;ILof;II)Lof;", line = 454)
    public final class227 method1892(class271 arg0, int arg1, class227 arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            return (class227) null;
        }
        int var6 = this.field4667[arg3];
        field4655++;
        class42 var7 = class107.method828((byte) -40, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg0.method1881(arg2, (byte) -108, arg1);
        }
        int var9 = arg0.field4667[arg1];
        class42 var10 = class107.method828((byte) -40, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class227 var12 = arg2.method1373(!var7.method260(var8, 120), !this.field4656);
            var12.method1381(var7, var8, this.field4656);
            return var12;
        } else {
            class227 var13 = arg2.method1373(!var7.method260(var8, 122) & !var10.method260(var11, 117), !this.field4656 & !arg0.field4656);
            var13.method1344(var7, var8, var10, var11, this.field4659, this.field4656 | arg0.field4656);
            return var13;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V", line = 493)
    public static final void method1893(byte arg0, int arg1) {
        field4676++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class287.field4910[arg1];
        int var3 = class264.field4466[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        int var4 = class295.field5063[arg1];
        int var5 = (int) class131.field2161[arg1];
        long var6 = class131.field2161[arg1];
        if (var3 == 37) {
            class197 var8 = class58.method353(var2, (byte) -117);
            boolean var9 = true;
            if (var8.field3392 > 0) {
                var9 = class5.method27(var8, 125);
            }
            if (var9) {
                class303.field5191++;
                class255.field4318.method1523(22260, 108);
                class255.field4318.method436(var2, -18820);
            }
        }
        if (var3 == 38) {
            class186 var10 = class82.field1334[var5];
            if (var10 != null) {
                class113.field1904++;
                class115.method876(var10.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -31, var10.field5125[0], class276.field4742.field5125[0]);
                class113.field1916 = class184.field2973;
                class16.field237 = 0;
                class242.field4051 = 2;
                class144.field2408 = class115.field1953;
                class255.field4318.method1523(22260, 154);
                class255.field4318.method446(-23847, class131.field2170);
                class255.field4318.method441(class77.field1262, 94);
                class255.field4318.method462(var5, (byte) -61);
                class255.field4318.method446(-23847, class72.field1196);
            }
        }
        if (var3 == 49) {
            class303.field5191++;
            class255.field4318.method1523(22260, 108);
            class255.field4318.method436(var2, -18820);
            class197 var11 = class58.method353(var2, (byte) -104);
            if (var11.field3311 != null && var11.field3311[0][0] == 5) {
                int var12 = var11.field3311[0][1];
                class76.field1246[var12] = 1 - class76.field1246[var12];
                class156.method1151((byte) 7, var12);
            }
        }
        if (var3 == 18) {
            class303.field5191++;
            class255.field4318.method1523(22260, 108);
            class255.field4318.method436(var2, -18820);
            class197 var13 = class58.method353(var2, (byte) 94);
            if (var13.field3311 != null && var13.field3311[0][0] == 5) {
                int var14 = var13.field3311[0][1];
                if (class76.field1246[var14] != var13.field3398[0]) {
                    class76.field1246[var14] = var13.field3398[0];
                    class156.method1151((byte) 7, var14);
                }
            }
        }
        if (var3 == 31) {
            class147.field2489++;
            boolean var15 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -31, var4, class276.field4742.field5125[0]);
            if (!var15) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -79, var4, class276.field4742.field5125[0]);
            }
            class113.field1916 = class184.field2973;
            class144.field2408 = class115.field1953;
            class242.field4051 = 2;
            class16.field237 = 0;
            class255.field4318.method1523(22260, 56);
            class255.field4318.method438(var2 + class268.field4615, 255);
            class255.field4318.method446(-23847, var4 + class197.field3355);
            class255.field4318.method435((byte) 67, var5);
        }
        if (var3 == 24) {
            class242 var17 = class151.field2555[var5];
            if (var17 != null) {
                class115.method876(var17.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -58, var17.field5125[0], class276.field4742.field5125[0]);
                class144.field2408 = class115.field1953;
                class242.field4051 = 2;
                class113.field1916 = class184.field2973;
                class16.field237 = 0;
                class91.field1573++;
                class255.field4318.method1523(22260, 2);
                class255.field4318.method436(class168.field2823, -18820);
                class255.field4318.method462(class46.field694, (byte) -61);
                class255.field4318.method438(var5, 255);
            }
        }
        if (var3 == 1001) {
            class113.field1916 = class184.field2973;
            class153.field2595++;
            class144.field2408 = class115.field1953;
            class16.field237 = 0;
            class242.field4051 = 2;
            class255.field4318.method1523(22260, 233);
            class255.field4318.method435((byte) 109, var5);
        }
        if (var3 == 36) {
            class291.field4995++;
            class255.field4318.method1523(22260, 189);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method438(var4, 255);
            class255.field4318.method437(var2, -1639306584);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 21);
            class144.field2406 = var4;
        }
        if (var3 == 58) {
            class255.field4318.method1523(22260, 63);
            class24.field363++;
            class255.field4318.method462(var4, (byte) -61);
            class255.field4318.method436(class77.field1262, -18820);
            class255.field4318.method438(var5, 255);
            class255.field4318.method443((byte) 83, var2);
            class255.field4318.method446(-23847, class131.field2170);
            class255.field4318.method462(class72.field1196, (byte) -61);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 111);
            class144.field2406 = var4;
        }
        if (var3 == 35) {
            class201.field3487++;
            boolean var18 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -9, var4, class276.field4742.field5125[0]);
            if (!var18) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -34, var4, class276.field4742.field5125[0]);
            }
            class144.field2408 = class115.field1953;
            class242.field4051 = 2;
            class16.field237 = 0;
            class113.field1916 = class184.field2973;
            class255.field4318.method1523(22260, 183);
            class255.field4318.method435((byte) 126, class268.field4615 + var2);
            class255.field4318.method435((byte) 100, var5);
            class255.field4318.method462(class197.field3355 + var4, (byte) -61);
        }
        if (var3 == 15) {
            class242 var20 = class151.field2555[var5];
            if (var20 != null) {
                class115.method876(var20.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -120, var20.field5125[0], class276.field4742.field5125[0]);
                class242.field4051 = 2;
                class144.field2408 = class115.field1953;
                class113.field1916 = class184.field2973;
                class16.field237 = 0;
                class255.field4318.method1523(22260, 197);
                class255.field4318.method438(var5, 255);
                class76.field1247++;
            }
        }
        if (var3 == 13) {
            class95.field1630++;
            class255.field4318.method1523(22260, 152);
            class255.field4318.method446(-23847, var4);
            class255.field4318.method437(var2, -1639306584);
            class255.field4318.method462(var5, (byte) -61);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 84);
            class144.field2406 = var4;
        }
        if (var3 == 41) {
            class186 var21 = class82.field1334[var5];
            if (var21 != null) {
                class115.method876(var21.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -105, var21.field5125[0], class276.field4742.field5125[0]);
                class144.field2408 = class115.field1953;
                class113.field1916 = class184.field2973;
                class242.field4051 = 2;
                class307.field5220++;
                class16.field237 = 0;
                class255.field4318.method1523(22260, 129);
                class255.field4318.method438(var5, 255);
            }
        }
        if (var3 == 4) {
            class242 var22 = class151.field2555[var5];
            if (var22 != null) {
                class115.method876(var22.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -62, var22.field5125[0], class276.field4742.field5125[0]);
                class225.field3767++;
                class242.field4051 = 2;
                class16.field237 = 0;
                class113.field1916 = class184.field2973;
                class144.field2408 = class115.field1953;
                class255.field4318.method1523(22260, 90);
                class255.field4318.method446(-23847, var5);
            }
        }
        if (var3 == 39) {
            class197.field3329++;
            class255.field4318.method1523(22260, 28);
            class255.field4318.method436(var2, -18820);
            class255.field4318.method435((byte) 79, var4);
            class255.field4318.method438(var5, 255);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 121);
            class144.field2406 = var4;
        }
        if (var3 == 34) {
            class100.method779(var6, var4, (byte) -125, var2);
            class222.field3733++;
            class255.field4318.method1523(22260, 40);
            class255.field4318.method462(class268.field4615 + var2, (byte) -61);
            class255.field4318.method446(-23847, class197.field3355 + var4);
            class255.field4318.method438(Integer.MAX_VALUE & (int) (var6 >>> 32), 255);
        }
        if (var3 == 44) {
            class255.field4330++;
            class255.field4318.method1523(22260, 145);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method446(-23847, var4);
            class255.field4318.method436(var2, -18820);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 91);
            class144.field2406 = var4;
        }
        if (var3 == 30) {
            class242 var23 = class151.field2555[var5];
            if (var23 != null) {
                class115.method876(var23.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -84, var23.field5125[0], class276.field4742.field5125[0]);
                class16.field237 = 0;
                class242.field4051 = 2;
                class113.field1916 = class184.field2973;
                class241.field4019++;
                class144.field2408 = class115.field1953;
                class255.field4318.method1523(22260, 102);
                class255.field4318.method438(var5, 255);
            }
        }
        if (var3 == 6) {
            class82.method564(client.field4039, var4, var2);
        }
        if (var3 == 14) {
            class236.field3940 = true;
            class82.method564(client.field4039, var4, var2);
        }
        if (var3 == 21) {
            class275.field4724++;
            boolean var24 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -100, var4, class276.field4742.field5125[0]);
            if (!var24) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -21, var4, class276.field4742.field5125[0]);
            }
            class242.field4051 = 2;
            class16.field237 = 0;
            class144.field2408 = class115.field1953;
            class113.field1916 = class184.field2973;
            class255.field4318.method1523(22260, 67);
            class255.field4318.method438(var4 + class197.field3355, 255);
            class255.field4318.method438(var5, 255);
            class255.field4318.method435((byte) 55, var2 + class268.field4615);
        }
        if (var3 == 50 && class100.method779(var6, var4, (byte) -127, var2)) {
            class255.field4318.method1523(22260, 113);
            class73.field1204++;
            class255.field4318.method438(class72.field1196, 255);
            class255.field4318.method446(-23847, class131.field2170);
            class255.field4318.method462(class197.field3355 + var4, (byte) -61);
            class255.field4318.method435((byte) 114, class268.field4615 + var2);
            class255.field4318.method443((byte) 120, class77.field1262);
            class255.field4318.method435((byte) 52, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var3 == 7) {
            class242 var26 = class151.field2555[var5];
            if (var26 != null) {
                class115.method876(var26.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -47, var26.field5125[0], class276.field4742.field5125[0]);
                class10.field141++;
                class242.field4051 = 2;
                class144.field2408 = class115.field1953;
                class16.field237 = 0;
                class113.field1916 = class184.field2973;
                class255.field4318.method1523(22260, 115);
                class255.field4318.method435((byte) 42, var5);
            }
        }
        if (var3 == 1006) {
            class16.field237 = 0;
            class113.field1916 = class184.field2973;
            class144.field2408 = class115.field1953;
            class242.field4051 = 2;
            class186 var27 = class82.field1334[var5];
            if (var27 != null) {
                class236 var28 = var27.field2996;
                if (var28.field3893 != null) {
                    var28 = var28.method1628(115);
                }
                if (var28 != null) {
                    class92.field1577++;
                    class255.field4318.method1523(22260, 206);
                    class255.field4318.method435((byte) 45, var28.field3891);
                }
            }
        }
        if (var3 == 1005) {
            class144.field2408 = class115.field1953;
            class113.field1916 = class184.field2973;
            class310.field5289++;
            class16.field237 = 0;
            class242.field4051 = 2;
            class255.field4318.method1523(22260, 166);
            class255.field4318.method435((byte) 78, var5);
        }
        if (var3 == 12 && class68.field1009 == null) {
            class135.method1010(var2, 4, var4);
            class68.field1009 = class91.method685(var2, (byte) -51, var4);
            class108.method834((byte) 49, class68.field1009);
        }
        if (var3 == 5) {
            class91.field1572++;
            class255.field4318.method1523(22260, 52);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method446(-23847, var4);
            class255.field4318.method443((byte) 102, var2);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 23);
            class144.field2406 = var4;
        }
        if (var3 == 33) {
            class242 var29 = class151.field2555[var5];
            if (var29 != null) {
                class115.method876(var29.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -120, var29.field5125[0], class276.field4742.field5125[0]);
                class16.field237 = 0;
                class242.field4051 = 2;
                class123.field2045++;
                class113.field1916 = class184.field2973;
                class144.field2408 = class115.field1953;
                class255.field4318.method1523(22260, 10);
                class255.field4318.method435((byte) 101, var5);
            }
        }
        if (var3 == 1003) {
            class197 var30 = class58.method353(var2, (byte) -108);
            if (var30 == null || var30.field3360[var4] < 100000) {
                class255.field4318.method1523(22260, 233);
                class153.field2595++;
                class255.field4318.method435((byte) 40, var5);
            } else {
                class260.method1807(1, class49.field728, class3.method14(new class255[] { class215.method1532(var30.field3360[var4], true), class246.field4125, class132.method990((byte) -119, var5).field3112 }, (byte) -76), 0);
            }
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 26);
            class144.field2406 = var4;
        }
        if (var3 == 2) {
            class205.field3515++;
            class100.method779(var6, var4, (byte) -125, var2);
            class255.field4318.method1523(22260, 11);
            class255.field4318.method435((byte) 56, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class255.field4318.method435((byte) 97, var4 + class197.field3355);
            class255.field4318.method462(class268.field4615 + var2, (byte) -61);
        }
        if (var3 == 10 && class100.method779(var6, var4, (byte) -127, var2)) {
            class255.field4318.method1523(22260, 100);
            class92.field1587++;
            class255.field4318.method462(var4 + class197.field3355, (byte) -61);
            class255.field4318.method437(class168.field2823, -1639306584);
            class255.field4318.method446(-23847, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class255.field4318.method462(class46.field694, (byte) -61);
            class255.field4318.method446(-23847, class268.field4615 + var2);
        }
        if (var3 == 20) {
            class123.field2051++;
            class255.field4318.method1523(22260, 93);
            class255.field4318.method446(-23847, var4);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method443((byte) 107, var2);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 100);
            class144.field2406 = var4;
        }
        if (var3 == 46) {
            class242 var31 = class151.field2555[var5];
            if (var31 != null) {
                class115.method876(var31.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -78, var31.field5125[0], class276.field4742.field5125[0]);
                class242.field4051 = 2;
                class144.field2408 = class115.field1953;
                class113.field1916 = class184.field2973;
                class16.field237 = 0;
                class151.field2561++;
                class255.field4318.method1523(22260, 222);
                class255.field4318.method462(var5, (byte) -61);
            }
        }
        if (var3 == 29) {
            class112.method857(-7);
            class197 var32 = class58.method353(var2, (byte) -110);
            class77.field1262 = var2;
            class131.field2170 = var4;
            class72.field1196 = var5;
            class72.field1182 = 1;
            class108.method834((byte) 49, var32);
            class123.field2044 = class3.method14(new class255[] { class293.field5038, class132.method990((byte) -119, var5).field3112, class129.field2127 }, (byte) -66);
            if (class123.field2044 == null) {
                class123.field2044 = class242.field4061;
            }
            return;
        }
        if (var3 == 26) {
            class231.field3821++;
            boolean var33 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -62, var4, class276.field4742.field5125[0]);
            if (!var33) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -61, var4, class276.field4742.field5125[0]);
            }
            class113.field1916 = class184.field2973;
            class16.field237 = 0;
            class144.field2408 = class115.field1953;
            class242.field4051 = 2;
            class255.field4318.method1523(22260, 199);
            class255.field4318.method462(class197.field3355 + var4, (byte) -61);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method435((byte) 117, class268.field4615 + var2);
        }
        if (var3 == 43) {
            class55.field869++;
            class255.field4318.method1523(22260, 99);
            class255.field4318.method438(class46.field694, 255);
            class255.field4318.method462(var4, (byte) -61);
            class255.field4318.method437(class168.field2823, -1639306584);
            class255.field4318.method462(var5, (byte) -61);
            class255.field4318.method443((byte) 124, var2);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) -109);
            class144.field2406 = var4;
        }
        if (var3 == 45) {
            class197 var49 = class91.method685(var2, (byte) -54, var4);
            if (var49 != null) {
                class112.method857(-7);
                class248.method1709(false, class64.method389(client.method1673(var49), 265157387), var4, var2);
                class72.field1182 = 0;
                class82.field1342 = class314.method2168(-1, var49);
                if (class82.field1342 == null) {
                    class82.field1342 = field4668;
                }
                if (var49.field3365) {
                    class254.field4285 = class3.method14(new class255[] { var49.field3335, class129.field2127 }, (byte) -86);
                } else {
                    class254.field4285 = class3.method14(new class255[] { class216.field3675, var49.field3301, class129.field2127 }, (byte) -115);
                }
            }
            return;
        }
        if (var3 == 42) {
            class242 var35 = class151.field2555[var5];
            if (var35 != null) {
                class115.method876(var35.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -47, var35.field5125[0], class276.field4742.field5125[0]);
                class113.field1916 = class184.field2973;
                class144.field2408 = class115.field1953;
                class183.field2950++;
                class242.field4051 = 2;
                class16.field237 = 0;
                class255.field4318.method1523(22260, 132);
                class255.field4318.method438(var5, 255);
            }
        }
        if (var3 == 1004) {
            class19.field314++;
            class100.method779(var6, var4, (byte) -128, var2);
            class255.field4318.method1523(22260, 55);
            class255.field4318.method435((byte) 68, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class255.field4318.method435((byte) 52, class197.field3355 + var4);
            class255.field4318.method435((byte) 46, class268.field4615 + var2);
        }
        if (var3 == 3) {
            class245.field4119++;
            boolean var36 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -77, var4, class276.field4742.field5125[0]);
            if (!var36) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -106, var4, class276.field4742.field5125[0]);
            }
            class16.field237 = 0;
            class144.field2408 = class115.field1953;
            class113.field1916 = class184.field2973;
            class242.field4051 = 2;
            class255.field4318.method1523(22260, 202);
            class255.field4318.method462(class197.field3355 + var4, (byte) -61);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method435((byte) 108, class268.field4615 + var2);
        }
        if (var3 == 23) {
            class242 var38 = class151.field2555[var5];
            if (var38 != null) {
                class115.method876(var38.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -37, var38.field5125[0], class276.field4742.field5125[0]);
                class144.field2408 = class115.field1953;
                class174.field2882++;
                class113.field1916 = class184.field2973;
                class16.field237 = 0;
                class242.field4051 = 2;
                class255.field4318.method1523(22260, 149);
                class255.field4318.method438(class131.field2170, 255);
                class255.field4318.method436(class77.field1262, -18820);
                class255.field4318.method438(class72.field1196, 255);
                class255.field4318.method435((byte) 74, var5);
            }
        }
        if (var3 == 48) {
            class100.method779(var6, var4, (byte) -126, var2);
            class109.field1846++;
            class255.field4318.method1523(22260, 155);
            class255.field4318.method462(var2 + class268.field4615, (byte) -61);
            class255.field4318.method462(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -61);
            class255.field4318.method462(class197.field3355 + var4, (byte) -61);
        }
        if (var3 == 40) {
            class201.field3484++;
            class100.method779(var6, var4, (byte) -127, var2);
            class255.field4318.method1523(22260, 156);
            class255.field4318.method462(class268.field4615 + var2, (byte) -61);
            class255.field4318.method446(-23847, var4 + class197.field3355);
            class255.field4318.method435((byte) 43, Integer.MAX_VALUE & (int) (var6 >>> 32));
        }
        if (var3 == 11) {
            class150.field2530++;
            boolean var39 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -79, var4, class276.field4742.field5125[0]);
            if (!var39) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -115, var4, class276.field4742.field5125[0]);
            }
            class113.field1916 = class184.field2973;
            class144.field2408 = class115.field1953;
            class16.field237 = 0;
            class242.field4051 = 2;
            class255.field4318.method1523(22260, 48);
            class255.field4318.method438(class46.field694, 255);
            class255.field4318.method435((byte) 60, var4 + class197.field3355);
            class255.field4318.method438(class268.field4615 + var2, 255);
            class255.field4318.method443((byte) 103, class168.field2823);
            class255.field4318.method462(var5, (byte) -61);
        }
        if (var3 == 57) {
            class255.field4318.method1523(22260, 47);
            class255.field4318.method438(class46.field694, 255);
            class255.field4318.method437(class168.field2823, -1639306584);
            class147.field2488++;
            class255.field4318.method462(var4, (byte) -61);
            class255.field4318.method437(var2, -1639306584);
        }
        if (var3 == 1) {
            class186 var41 = class82.field1334[var5];
            if (var41 != null) {
                class115.method876(var41.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -44, var41.field5125[0], class276.field4742.field5125[0]);
                class113.field1916 = class184.field2973;
                class242.field4051 = 2;
                class144.field2408 = class115.field1953;
                class119.field1996++;
                class16.field237 = 0;
                class255.field4318.method1523(22260, 171);
                class255.field4318.method435((byte) 62, var5);
            }
        }
        if (var3 == 59) {
            class186 var42 = class82.field1334[var5];
            if (var42 != null) {
                class248.field4158++;
                class115.method876(var42.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -17, var42.field5125[0], class276.field4742.field5125[0]);
                class242.field4051 = 2;
                class113.field1916 = class184.field2973;
                class16.field237 = 0;
                class144.field2408 = class115.field1953;
                class255.field4318.method1523(22260, 78);
                class255.field4318.method436(class168.field2823, -18820);
                class255.field4318.method435((byte) 47, class46.field694);
                class255.field4318.method435((byte) 76, var5);
            }
        }
        if (var3 == 51) {
            class121.method899(-125);
        }
        if (var3 == 8) {
            class186 var43 = class82.field1334[var5];
            if (var43 != null) {
                class115.method876(var43.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -64, var43.field5125[0], class276.field4742.field5125[0]);
                class144.field2408 = class115.field1953;
                class16.field237 = 0;
                class113.field1916 = class184.field2973;
                class14.field199++;
                class242.field4051 = 2;
                class255.field4318.method1523(22260, 44);
                class255.field4318.method446(-23847, var5);
            }
        }
        if (var3 == 16) {
            class186 var44 = class82.field1334[var5];
            if (var44 != null) {
                class158.field2677++;
                class115.method876(var44.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -80, var44.field5125[0], class276.field4742.field5125[0]);
                class113.field1916 = class184.field2973;
                class242.field4051 = 2;
                class16.field237 = 0;
                class144.field2408 = class115.field1953;
                class255.field4318.method1523(22260, 232);
                class255.field4318.method462(var5, (byte) -61);
            }
        }
        if (var3 == 22) {
            class255.field4318.method1523(22260, 219);
            class6.field93++;
            class255.field4318.method443((byte) 87, var2);
            class255.field4318.method462(var5, (byte) -61);
            class255.field4318.method462(var4, (byte) -61);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) 99);
            class144.field2406 = var4;
        }
        if (var3 == 17) {
            class10.field143++;
            boolean var45 = class115.method876(var2, 0, 0, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -111, var4, class276.field4742.field5125[0]);
            if (!var45) {
                class115.method876(var2, 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -99, var4, class276.field4742.field5125[0]);
            }
            class16.field237 = 0;
            class144.field2408 = class115.field1953;
            class242.field4051 = 2;
            class113.field1916 = class184.field2973;
            class255.field4318.method1523(22260, 162);
            class255.field4318.method435((byte) 51, class197.field3355 + var4);
            class255.field4318.method462(class131.field2170, (byte) -61);
            class255.field4318.method438(var5, 255);
            class255.field4318.method435((byte) 100, class72.field1196);
            class255.field4318.method446(-23847, class268.field4615 + var2);
            class255.field4318.method437(class77.field1262, -1639306584);
        }
        if (arg0 > -127) {
            return;
        }
        if (var3 == 28) {
            class255.field4318.method1523(22260, 94);
            class206.field3535++;
            class255.field4318.method437(var2, -1639306584);
            class255.field4318.method438(var4, 255);
            class255.field4318.method446(-23847, var5);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) -2);
            class144.field2406 = var4;
        }
        if (var3 == 47) {
            class186 var47 = class82.field1334[var5];
            if (var47 != null) {
                class24.field358++;
                class115.method876(var47.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -32, var47.field5125[0], class276.field4742.field5125[0]);
                class113.field1916 = class184.field2973;
                class242.field4051 = 2;
                class144.field2408 = class115.field1953;
                class16.field237 = 0;
                class255.field4318.method1523(22260, 72);
                class255.field4318.method462(var5, (byte) -61);
            }
        }
        if (var3 == 19 || var3 == 1002) {
            class309.method2146(var5, -6, class44.field684[arg1], var4, var2);
        }
        if (var3 == 25) {
            class242 var48 = class151.field2555[var5];
            if (var48 != null) {
                class159.field2689++;
                class115.method876(var48.field5154[0], 1, 1, 0, 0, 2, class276.field4742.field5154[0], false, 0, (byte) -79, var48.field5125[0], class276.field4742.field5125[0]);
                class144.field2408 = class115.field1953;
                class242.field4051 = 2;
                class16.field237 = 0;
                class113.field1916 = class184.field2973;
                class255.field4318.method1523(22260, 82);
                class255.field4318.method435((byte) 66, var5);
            }
        }
        if (var3 == 9) {
            class149.field2513++;
            class255.field4318.method1523(22260, 158);
            class255.field4318.method446(-23847, var5);
            class255.field4318.method443((byte) 82, var2);
            class255.field4318.method462(var4, (byte) -61);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) -115);
            class144.field2406 = var4;
        }
        if (var3 == 32) {
            class18.field288++;
            class255.field4318.method1523(22260, 73);
            class255.field4318.method435((byte) 91, var4);
            class255.field4318.method441(var2, 94);
            class255.field4318.method435((byte) 104, var5);
            class201.field3485 = 0;
            class268.field4584 = class58.method353(var2, (byte) -124);
            class144.field2406 = var4;
        }
        if (class72.field1182 != 0) {
            class72.field1182 = 0;
            class108.method834((byte) 49, class58.method353(class77.field1262, (byte) -126));
        }
        if (class42.field653) {
            class112.method857(-7);
        }
        if (class268.field4584 != null && class201.field3485 == 0) {
            class108.method834((byte) 49, class268.field4584);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lof;III)Lof;", line = 1463)
    public final class227 method1894(class227 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4667[arg1];
        field4670++;
        class42 var6 = class107.method828((byte) -40, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method1373(true, true);
        }
        int var8 = arg2 & 0x3;
        class227 var9 = arg0.method1373(!var6.method260(var7, arg3 + 30839), !this.field4656);
        if (var8 == 1) {
            var9.method1356();
        } else if (var8 == 2) {
            var9.method1336();
        } else if (var8 == 3) {
            var9.method1332();
        }
        var9.method1381(var6, var7, this.field4656);
        if (arg3 != -30715) {
            this.field4646 = 65;
        }
        if (var8 == 1) {
            var9.method1332();
        } else if (var8 == 2) {
            var9.method1336();
        } else if (var8 == 3) {
            var9.method1356();
        }
        return var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lph;BZ)V", line = 1509)
    public static final void method1895(class71 arg0, byte arg1, boolean arg2) {
        field4660++;
        if (class281.field4827 || arg2) {
            int var3 = class201.field3479;
            int var4 = var3 * 956 / 503;
            class157.field2665.method572((class210.field3589 - var4) / 2, 0, var4, var3);
            class54.field859.method28(class210.field3589 / 2 - (class54.field859.field70 / 2), 18);
        }
        arg0.method497(class58.field882, class210.field3589 / 2, class201.field3479 / 2 - 26, 16777215, -1);
        int var5 = class201.field3479 / 2 - 18;
        int var6 = -35 / ((arg1 - 12) / 47);
        if (class281.field4827) {
            class126.method926(class210.field3589 / 2 - 152, var5, 304, 34, 9179409);
            class126.method926(class210.field3589 / 2 - 151, var5 + 1, 302, 32, 0);
            class126.method936(class210.field3589 / 2 - 150, var5 + 2, class145.field2456 * 3, 30, 9179409);
            class126.method936(class210.field3589 / 2 + class145.field2456 * 3 - 150, var5 + 2, 300 - (class145.field2456 * 3), 30, 0);
        } else {
            class175.method1253(class210.field3589 / 2 - 152, var5, 304, 34, 9179409);
            class175.method1253(class210.field3589 / 2 - 151, var5 + 1, 302, 32, 0);
            class175.method1249(class210.field3589 / 2 - 150, var5 + 2, class145.field2456 * 3, 30, 9179409);
            class175.method1249(class210.field3589 / 2 + (class145.field2456 * 3) - 150, var5 + 2, 300 - class145.field2456 * 3, 30, 0);
        }
        arg0.method497(class148.field2508, class210.field3589 / 2, class201.field3479 / 2 + 4, 16777215, -1);
    }
}
