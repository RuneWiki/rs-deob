import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class302 extends class199 {

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    private int field4431 = -1;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field4422 = 50;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "[J")
    public static long[] field4429 = new long[1000];

    @OriginalMember(owner = "client!og", name = "db", descriptor = "F")
    public static float field4426 = 128.0F;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "Lib;")
    public static class98 field4433;

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "[I")
    public int[] field4432;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)Z", line = 7)
    public final boolean method2113(int arg0) {
        int var2 = -22 % ((-arg0 - 65) / 61);
        field4428++;
        if (this.field4432 != null) {
            return true;
        } else if (this.field4431 >= 0) {
            class11 var3 = class194.field2682 < 0 ? class52.method404(class134.field1826, this.field4431, (byte) 118) : class255.method1783(class134.field1826, (byte) -53, class194.field2682, this.field4431);
            var3.method82();
            this.field4432 = var3.field124;
            this.field4425 = var3.field2252;
            this.field4416 = var3.field2250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLfd;I)V", line = 32)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field4418++;
        if (arg0 != -43) {
            method2115((byte) -20);
        }
        if (arg2 == 0) {
            this.field4431 = arg1.method2083((byte) -84);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)Lro;", line = 58)
    public static final class304 method2114(int arg0, int arg1) {
        class304 var2 = (class304) class180.field2465.method1116(17301, (long) arg1);
        field4424++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class314.field4614.method1089(26, (byte) 109, arg1);
        class304 var4 = new class304();
        if (var3 != null) {
            var4.method2129(new class299(var3), 0);
        }
        if (arg0 != 4080) {
            method2114(27, -114);
        }
        class180.field2465.method1115((long) arg1, 38, var4);
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V", line = 84)
    public static final void method2115(byte arg0) {
        for (int var1 = 0; var1 < class274.field3921; var1++) {
            int var10002 = class319.field4697[var1]--;
            if (class319.field4697[var1] >= -10) {
                class269 var3 = class316.field4664[var1];
                if (var3 == null) {
                    var3 = class269.method1838(class17.field213, class237.field3434[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class319.field4697[var1] += var3.method1837();
                    class316.field4664[var1] = var3;
                }
                if (class319.field4697[var1] < 0) {
                    int var10;
                    if (class92.field1195[var1] == 0) {
                        var10 = class254.field3701[var1] * class75.field991 >> 8;
                    } else {
                        int var4 = (class92.field1195[var1] & 0xFF) * 128;
                        int var5 = (class92.field1195[var1] & 0xFFA0EA) >> 16;
                        int var6 = var5 * 128 + 64 - class359.field5616.field4855;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class92.field1195[var1] >> 8 & 0xFF;
                        int var8 = var7 * 128 + 64 - class359.field5616.field4893;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class319.field4697[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = class254.field3701[var1] * class204.field2843 * (var4 - var9) / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class168 var11 = var3.method1839().method1249(class183.field2497);
                        class113 var12 = class113.method833(var11, 100, var10);
                        var12.method807(class219.field3105[var1] - 1);
                        class186.field2548.method2250(var12);
                    }
                    class319.field4697[var1] = -100;
                }
            } else {
                class274.field3921--;
                for (int var2 = var1; var2 < class274.field3921; var2++) {
                    class237.field3434[var2] = class237.field3434[var2 + 1];
                    class316.field4664[var2] = class316.field4664[var2 + 1];
                    class219.field3105[var2] = class219.field3105[var2 + 1];
                    class319.field4697[var2] = class319.field4697[var2 + 1];
                    class92.field1195[var2] = class92.field1195[var2 + 1];
                    class254.field3701[var2] = class254.field3701[var2 + 1];
                }
                var1--;
            }
        }
        if (class297.field4314 && !class196.method1414(81)) {
            if (class101.field1319 != 0 && class84.field1082 != -1) {
                class144.method1124(class101.field1319, -20329, 0, class84.field1082, false, class305.field4459);
            }
            class297.field4314 = false;
        } else if (class101.field1319 != 0 && class84.field1082 != -1 && !class196.method1414(18)) {
            class199.field2804++;
            class251.field3681.method1309(23, 250);
            class251.field3681.method2084(true, class84.field1082);
            class84.field1082 = -1;
        }
        field4423++;
        int var13 = 81 / ((arg0 - 83) / 40);
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(B)V", line = 210)
    private static final void method2116(byte arg0) {
        class287.field4120.method2262(false);
        if (arg0 == -71) {
            class62.field777.method2262(false);
            class348.field5428.method2262(false);
            field4420++;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(IIIIII)V", line = 224)
    public static final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4421++;
        int var8 = arg4 + 1;
        class96.method697((byte) 115, class331.field4902[arg4], arg1, arg2, arg3);
        int var9 = arg5 - 1;
        class96.method697((byte) 115, class331.field4902[arg5], arg1, arg2, arg3);
        if (arg0 != -1) {
            field4433 = (class98) null;
        }
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class331.field4902[var6];
            var7[arg2] = var7[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V", line = 248)
    private static final void method2118(int arg0) {
        if (arg0 != 0) {
            field4429 = (long[]) null;
        }
        field4419++;
        class135.field1842.method2262(false);
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V", line = 259)
    public final void method1454(int arg0) {
        field4436++;
        super.method1454(arg0);
        this.field4432 = null;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)I", line = 268)
    public final int method1460(int arg0) {
        if (arg0 != -1) {
            method2114(-125, -27);
        }
        field4435++;
        return this.field4431;
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V", line = 280)
    public static void method2119(int arg0) {
        field4429 = null;
        if (arg0 != 1) {
            field4426 = -2.1219447F;
        }
        field4433 = null;
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(B)V", line = 299)
    public static final void method2120(byte arg0) {
        method2118(0);
        field4430++;
        class144.method1131((byte) 48);
        class94.method684((byte) 105);
        class7.method38(arg0 + 18722);
        method2116((byte) -71);
        class33.method212((byte) 99);
        class112.method794(arg0 - 22970);
        class95.method690((byte) 59);
        class328.method2267(-25);
        class173.method1273(51);
        class214.method1560((byte) -121);
        class272.method1850(14834);
        class28.method185(-14307);
        class331.method2291(-115);
        class319.method2204(-11);
        class305.method2133((byte) -123);
        class273.method1857(arg0 ^ 0x60000040);
        class239.method1697(arg0 - 31416);
        if (arg0 != 64) {
            field4434 = 90;
        }
        class109.method773(arg0 - 22837);
        class341.method2369(-119);
        class133.method1014((byte) 29);
        class224.field3232.method2262(false);
        class159.field2258.method2262(false);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 334)
    public class302() {
        super(0, false);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I", line = 345)
    public int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            method2118(63);
        }
        field4415++;
        int[][] var3 = this.field2796.method2187(arg0, -109);
        if (this.field2796.field4667 && this.method2113(arg1 + 29743)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class224.field3233 == this.field4416 ? arg0 : this.field4416 * arg0 / class224.field3233) * this.field4425;
            if (class95.field1235 == this.field4425) {
                for (int var8 = 0; var8 < class95.field1235; var8++) {
                    int var9 = this.field4432[var7++];
                    var6[var8] = class335.method2339(var9 << 4, 4080);
                    var5[var8] = class335.method2339(65280, var9) >> 4;
                    var4[var8] = class335.method2339(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class95.field1235; var10++) {
                    int var11 = this.field4425 * var10 / class95.field1235;
                    int var12 = this.field4432[var7 + var11];
                    var6[var10] = class335.method2339(255, var12) << 4;
                    var5[var10] = class335.method2339(var12, 65280) >> 4;
                    var4[var10] = class335.method2339(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
