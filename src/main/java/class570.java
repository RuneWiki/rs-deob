import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class570 {

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lvi;")
    private class560 field7892 = new class560(256);

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lpq;")
    private class159 field7891;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "Lfca;")
    public static class188 field7894 = null;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3214(int arg0) {
        field7888++;
        if (class72.field935.method1855(28869, class161.field2038) != 2) {
            return;
        }
        byte var1 = (byte) (class426.field5928 - 4 & 0xFF);
        int var2 = class426.field5928 % class588.field8082;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class12.field113; var16++) {
                class361.field5210[var3][var2][var16] = var1;
            }
        }
        if (class432.field5993 == 3) {
            return;
        }
        if (arg0 != 3) {
            method3214(-48);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class197.field2603[var4] = -1000000;
            class175.field2204[var4] = 1000000;
            class292.field3909[var4] = 0;
            class293.field3916[var4] = 1000000;
            class225.field2933[var4] = 0;
        }
        if (class42.field546 != 1) {
            int var15 = class394.method2340(class132.field1679, arg0 ^ 0xFFFFFFFC, class432.field5993, class471.field6379);
            if (var15 - class628.field8545 >= 3200 || (class645.field9140[class432.field5993][class132.field1679 >> 9][class471.field6379 >> 9] & 0x4) == 0) {
                return;
            }
            class587.method3281(class145.field1841, 1, class132.field1679 >> 9, (byte) -128, false, class471.field6379 >> 9);
            return;
        }
        if ((class645.field9140[class432.field5993][class596.field8164.field3929 >> 9][class596.field8164.field3917 >> 9] & 0x4) != 0) {
            class587.method3281(class145.field1841, 0, class596.field8164.field3929 >> 9, (byte) -127, false, class596.field8164.field3917 >> 9);
        }
        if (class336.field4947 >= 2560) {
            return;
        }
        int var5 = class132.field1679 >> 9;
        int var6 = class471.field6379 >> 9;
        int var7 = class596.field8164.field3929 >> 9;
        int var8 = class596.field8164.field3917 >> 9;
        int var9;
        if (var7 <= var5) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && -class588.field8082 < var9 && class588.field8082 > var9 && -class12.field113 < var10 && class12.field113 > var10) {
            if (var9 > var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class645.field9140[class432.field5993][var5][var6] & 0x4) != 0) {
                        class587.method3281(class145.field1841, 1, var5, (byte) -125, false, var6);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var6 < var8) {
                            var6++;
                        } else if (var6 > var8) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class645.field9140[class432.field5993][var5][var6] & 0x4) != 0) {
                            class587.method3281(class145.field1841, 1, var5, (byte) -125, false, var6);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class645.field9140[class432.field5993][var5][var6] & 0x4) != 0) {
                    class587.method3281(class145.field1841, 1, var5, (byte) -125, false, var6);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class645.field9140[class432.field5993][var5][var6] & 0x4) != 0) {
                        class587.method3281(class145.field1841, 1, var5, (byte) -126, false, var6);
                        return;
                    }
                }
            }
            return;
        }
        class282.method1694("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class253.field3490 + "," + class186.field2280, (byte) 47, null);
        return;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V", line = 196)
    public final void method3215(int arg0) {
        class560 var2 = this.field7892;
        synchronized (this.field7892) {
            this.field7892.method3142(false);
        }
        field7890++;
        if (arg0 != 65536) {
            this.method3215(85);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 209)
    public final void method3216(byte arg0) {
        if (arg0 != -123) {
            this.field7891 = null;
        }
        class560 var2 = this.field7892;
        synchronized (this.field7892) {
            this.field7892.method3144(true);
        }
        field7886++;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II)Lwv;", line = 222)
    public final class24 method3217(int arg0, int arg1) {
        field7893++;
        class560 var3 = this.field7892;
        class24 var4;
        synchronized (this.field7892) {
            var4 = (class24) this.field7892.method3134((long) arg1, -40);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field7891;
        byte[] var6;
        synchronized (this.field7891) {
            var6 = this.field7891.method1087(26, arg1, 1);
        }
        class24 var7 = new class24();
        if (var6 != null) {
            var7.method142(-77, new class138(var6));
        }
        class560 var8 = this.field7892;
        synchronized (this.field7892) {
            this.field7892.method3130((long) arg1, true, var7);
            int var9 = -98 / ((arg0 - 16) / 56);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)V", line = 256)
    public static final void method3218(int arg0, String arg1) {
        field7885++;
        if (!class613.field8378) {
            return;
        }
        boolean var2 = false;
        int var3 = class654.field9256;
        int[] var4 = class123.field1595;
        for (int var5 = arg0; var5 < var3; var5++) {
            class519 var6 = class292.field3912[var4[var5]];
            if (var6 != null && class596.field8164 != var6 && var6.field7191 != null && var6.field7191.equalsIgnoreCase(arg1)) {
                class480.field6462++;
                class389.method2326((byte) 118, class66.field872);
                class253.field3491.method911(arg0 - 32051, class68.field898);
                class253.field3491.method896(1464076016, var4[var5]);
                class253.field3491.method896(1464076016, class59.field828);
                class253.field3491.method896(1464076016, class443.field6115);
                class253.field3491.method920(0, false);
                class449.method2566(-102, 0, var6.method241(-25747), -2, var6.field516[0], 0, var6.method241(arg0 ^ 0xFFFF9B6D), var6.field526[0], true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class365.method2239(4, arg0 + 19074, class243.field3232.method1491(class350.field5121, (byte) 125) + arg1);
        }
        if (class613.field8378) {
            class497.method2800((byte) -72);
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)Lefa;", line = 305)
    public static final class40 method3219(int arg0) {
        class217.field2805 = 0;
        if (arg0 == 65536) {
            field7887++;
            return class224.method1369(10);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)V", line = 319)
    public static void method3220(byte arg0) {
        if (arg0 == -115) {
            field7894 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V", line = 332)
    public final void method3221(boolean arg0, int arg1) {
        field7884++;
        if (!arg0) {
            class560 var3 = this.field7892;
            synchronized (this.field7892) {
                this.field7892.method3129(arg1, 14583);
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLoa;IZ)Llu;", line = 345)
    public static final class427 method3222(byte arg0, class689 arg1, int arg2, boolean arg3) {
        field7889++;
        if (arg2 == -1) {
            return null;
        }
        if (arg0 != -116) {
            field7894 = null;
        }
        if (class376.field5407 != null) {
            for (int var4 = 0; var4 < class376.field5407.length; var4++) {
                if (class376.field5407[var4] == arg2) {
                    return class422.field5874[var4];
                }
            }
        }
        class427 var5 = (class427) class523.field7242.method3134((long) arg2, arg0 + 76);
        if (var5 != null) {
            if (arg3 && var5.field5931 == null) {
                class598 var6 = class261.method1631(arg2, class482.field6486, (byte) 125);
                if (var6 == null) {
                    return null;
                }
                var5.field5931 = var6;
            }
            return var5;
        }
        class366[] var7 = class366.method2242(class284.field3836, arg2);
        if (var7 == null) {
            return null;
        }
        class598 var8 = class261.method1631(arg2, class482.field6486, (byte) 98);
        if (var8 == null) {
            return null;
        }
        class427 var9;
        if (arg3) {
            var9 = new class427(arg1.method2020(var8, var7, true), var8);
        } else {
            var9 = new class427(arg1.method2020(var8, var7, true));
        }
        class523.field7242.method3130((long) arg2, true, var9);
        return var9;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 420)
    public class570(class484 arg0, int arg1, class159 arg2) {
        this.field7891 = arg2;
        this.field7891.method1076(26, 0);
    }
}
