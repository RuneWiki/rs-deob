import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class305 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lnh;")
    public static class312 field4930 = new class312(64);

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field4931 = 0;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "[J")
    public static long[] field4932 = new long[100];

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field4933 = 0;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Llf;")
    public static class94 field4935;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method2071(byte arg0) {
        field4935 = null;
        field4930 = null;
        field4932 = null;
        if (arg0 > -36) {
            field4930 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILsj;)Lsj;")
    public abstract class186 method1927(int arg0, class186 arg1);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
    public static final void method2072(int arg0, byte arg1) {
        field4934++;
        int var2 = class93.field1533;
        int var3 = class226.field3324;
        int var4 = class260.field4024;
        int var5 = class115.field1906;
        int var6 = class268.field4303;
        int var7 = (int) class180.field2705;
        if (class298.field4777 / 256 > var7) {
            var7 = class298.field4777 / 256;
        }
        int var8 = (int) class102.field1736 + class9.field98 & 0x7FF;
        if (class223.field3274[4] && (class275.field4453[4] + 128) > var7) {
            var7 = class275.field4453[4] + 128;
        }
        class16.method113(class160.field2487, class113.method851(class37.field474, arg1 - 145, class213.field3139.field3753, class213.field3139.field3660) - 50, arg0, (var7 * 3) + 600, class276.field4466, var8, var7, 0);
        if (class93.field1533 == var2 && class226.field3324 == var3 && class260.field4024 == var4 && class115.field1906 == var5 && class268.field4303 == var6) {
            class119.field1931 = 1;
            return;
        }
        class212.field3129 = 10;
        class224.field3296 = 10;
        if (class226.field3324 > var3) {
            var3 += class212.field3129 + ((class226.field3324 - var3) * class224.field3296 / 1000);
            if (class226.field3324 > var3) {
                class226.field3324 = var3;
            }
        }
        if (var3 > class226.field3324) {
            int var9 = var3 - ((var3 - class226.field3324) * class224.field3296 / 1000 + class212.field3129);
            if (var9 > class226.field3324) {
                class226.field3324 = var9;
            }
        }
        int var10 = class268.field4303 - var6;
        class139.field2263 = 10;
        if (var4 < class260.field4024) {
            var4 += class212.field3129 + ((class260.field4024 - var4) * class224.field3296 / 1000);
            if (var4 < class260.field4024) {
                class260.field4024 = var4;
            }
        }
        class234.field3421 = 10;
        if (class93.field1533 > var2) {
            var2 += (class93.field1533 - var2) * class224.field3296 / 1000 + class212.field3129;
            if (var2 < class93.field1533) {
                class93.field1533 = var2;
            }
        }
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 < -1024) {
            var10 += 2048;
        }
        if (var2 > class93.field1533) {
            int var11 = var2 - (class212.field3129 + ((var2 - class93.field1533) * class224.field3296 / 1000));
            if (var11 > class93.field1533) {
                class93.field1533 = var11;
            }
        }
        if (class260.field4024 < var4) {
            int var12 = var4 - (class212.field3129 + ((var4 - class260.field4024) * class224.field3296 / 1000));
            if (class260.field4024 < var12) {
                class260.field4024 = var12;
            }
        }
        if (var10 > 0) {
            int var13 = class139.field2263 * var10 / 1000 + class234.field3421 + var6;
            var6 = var13 & 0x7FF;
        }
        if (var10 < 0) {
            int var14 = var6 - (-var10 * class139.field2263 / 1000 + class234.field3421);
            var6 = var14 & 0x7FF;
        }
        if (arg1 != 52) {
            method2072(40, (byte) 39);
        }
        if (var5 < class115.field1906) {
            var5 += (class115.field1906 - var5) * class139.field2263 / 1000 + class234.field3421;
            if (class115.field1906 > var5) {
                class115.field1906 = var5;
            }
        }
        if (class115.field1906 < var5) {
            int var15 = var5 - (class234.field3421 + ((var5 - class115.field1906) * class139.field2263 / 1000));
            if (class115.field1906 < var15) {
                class115.field1906 = var15;
            }
        }
        int var16 = class268.field4303 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var10 <= 0 || var16 > 0 && var10 < 0) {
            class268.field4303 = var6;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public static final void method2073(int arg0, int arg1) {
        class313 var2 = class223.field3286[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class313 var4 = class223.field3286[var3][arg0][arg1] = class223.field3286[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5019--;
                for (int var5 = 0; var5 < var4.field5022; var5++) {
                    class156 var6 = var4.field5037[var5];
                    if ((var6.field2431 >> 29 & 0x3L) == 2L && var6.field2443 == arg0 && var6.field2432 == arg1) {
                        var6.field2430--;
                    }
                }
            }
        }
        if (class223.field3286[0][arg0][arg1] == null) {
            class223.field3286[0][arg0][arg1] = new class313(0, arg0, arg1);
        }
        class223.field3286[0][arg0][arg1].field5009 = var2;
        class223.field3286[3][arg0][arg1] = null;
    }
}
