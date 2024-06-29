import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class17 extends class80 {

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lr;")
    public static class66 field237 = null;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field232 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "Lr;")
    public static class66 field247 = class93.method641(43, "zap");

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "[I")
    public static int[] field246 = new int[200];

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "[Lr;")
    public static class66[] field245 = new class66[100];

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
    public final boolean method66(int arg0, int arg1, int arg2) {
        if (arg1 != -9710) {
            method69(11, 92, 40, 111, -64, -112, -113);
        }
        field236++;
        return arg0 >= this.field235 && this.field241 >= arg0 && this.field240 <= arg2 && this.field239 >= arg2;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static final void method67(int arg0) {
        class231.field4044 = 0;
        field243++;
        int var1 = (class207.field3595.field2077 >> 7) + class3.field39;
        if (arg0 > -123) {
            method70(-46, (byte) 115);
        }
        int var2 = (class207.field3595.field2053 >> 7) + class34.field512;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class231.field4044 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class231.field4044 = 1;
        }
        if (class231.field4044 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class231.field4044 = 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
    public static void method68(int arg0) {
        field245 = null;
        field232 = null;
        if (arg0 != 27392) {
            method70(41, (byte) -106);
        }
        field246 = null;
        field247 = null;
        field237 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 22) {
            return;
        }
        int var7 = 0;
        class76[] var8 = class194.field3354;
        while (var8.length > var7) {
            class76 var9 = var8[var7];
            if (var9 != null && var9.field1502 == 2) {
                class248.method1633(arg4, arg6, arg1 >> 1, (var9.field1505 - class34.field512 << 7) + var9.field1516, var9.field1510 * 2, arg5 >> 1, (var9.field1509 - class3.field39 << 7) + var9.field1515, (byte) -124);
                if (class131.field2443 > -1 && (class75.field1501 % 20) < 10) {
                    class2.field32[var9.field1512].method980(arg3 + class131.field2443 - 12, arg2 - (-class243.field4243 + 28));
                }
            }
            var7++;
        }
        field238++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
    public static final void method70(int arg0, byte arg1) {
        field244++;
        class90.field1737 += arg0 * 128;
        if (class90.field1737 > class77.field1517.length) {
            int var2 = (int) (Math.random() * 12.0D);
            class90.field1737 -= class77.field1517.length;
            class238.method1569(79, class99.field1928[var2]);
        }
        short var3 = 256;
        int var4 = arg0 * 128;
        int var5 = (var3 - arg0) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var26 = class102.field1995[var4 + var6] - (class77.field1517[class90.field1737 + var6 & class77.field1517.length + -1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class102.field1995[var6++] = var26;
        }
        for (int var8 = var3 - arg0; var8 < var3; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class102.field1995[var23 + var24] = 255;
                } else {
                    class102.field1995[var24 + var23] = 0;
                }
            }
        }
        if (arg1 != 60) {
            field247 = null;
        }
        for (int var9 = 0; var9 < var3 - arg0; var9++) {
            class240.field4168[var9] = class240.field4168[arg0 + var9];
        }
        for (int var10 = var3 - arg0; var10 < var3; var10++) {
            class240.field4168[var10] = (int) (Math.sin((double) class99.field1930 / 14.0D) * 16.0D + Math.sin((double) class99.field1930 / 15.0D) * 14.0D + Math.sin((double) class99.field1930 / 16.0D) * 12.0D);
            class99.field1930++;
        }
        class243.field4245 += arg0;
        int var11 = (arg0 + (class75.field1501 & 0x1)) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class243.field4245; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class102.field1995[(var22 << 7) + var21] = 192;
        }
        class243.field4245 = 0;
        for (int var13 = 0; var13 < var3; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var20 + var11 < 128) {
                    var18 += class102.field1995[var11 + var19 + var20];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class102.field1995[var20 + var19 - var11 - 1];
                }
                if (var20 >= 0) {
                    class62.field1058[var20 + var19] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var3; var16++) {
                int var17 = var16 * 128;
                if (var11 + var16 < var3) {
                    var15 += class62.field1058[var14 + var17 + (var11 * 128)];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class62.field1058[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class102.field1995[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lfa;IIII)V")
    public static final void method71(class45 arg0, int arg1, int arg2, int arg3, int arg4) {
        field242++;
        if (class207.field3595 == arg0) {
            return;
        }
        if (arg1 > -56) {
            field246 = null;
        }
        if (class176.field3105 >= 400) {
            return;
        }
        class66 var5;
        if (arg0.field807 == 0) {
            var5 = class212.method1372(2, new class66[] { arg0.method324(3000), class41.method267(arg0.field816, true, class207.field3595.field816), class56.field953, class183.field3207, class144.method989(arg0.field816, 0), class254.field4461 });
        } else {
            var5 = class212.method1372(2, new class66[] { arg0.method324(3000), class56.field953, class143.field2615, class144.method989(arg0.field807, 0), class254.field4461 });
        }
        if (class188.field3259 == 1) {
            class75.method536(arg2, arg3, (byte) -124, class212.method1372(2, new class66[] { class103.field2004, class212.field3641, var5 }), (short) 2, class127.field2373, (long) arg4);
            class171.field3032++;
        } else if (!class247.field4308) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class100.field1957[var6] != null) {
                    short var8 = 0;
                    if (class163.field2921 == 0 && class100.field1957[var6].method470(false, class264.field4625)) {
                        if (class207.field3595.field816 < arg0.field816) {
                            var8 = 2000;
                        }
                        if (class207.field3595.field832 != 0 && arg0.field832 != 0) {
                            if (class207.field3595.field832 == arg0.field832) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class143.field2613[var6]) {
                        var8 = 2000;
                    }
                    boolean var9 = false;
                    class33.field496++;
                    short var10 = class193.field3339[var6];
                    short var11 = (short) (var8 + var10);
                    class75.method536(arg2, arg3, (byte) -56, class212.method1372(2, new class66[] { class80.field1565, var5 }), var11, class100.field1957[var6], (long) arg4);
                }
            }
        } else if ((class9.field103 & 0x8) == 8) {
            class9.field89++;
            class75.method536(arg2, arg3, (byte) -85, class212.method1372(2, new class66[] { class195.field3366, class212.field3641, var5 }), (short) 50, class162.field2895, (long) arg4);
        }
        for (int var7 = 0; var7 < class176.field3105; var7++) {
            if (class43.field710[var7] == 5) {
                class9.field96[var7] = class212.method1372(2, new class66[] { class80.field1565, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIII)V")
    public class17(int arg0, int arg1, int arg2, int arg3) {
        this.field240 = arg1;
        this.field235 = arg0;
        this.field241 = arg2;
        this.field239 = arg3;
    }
}
