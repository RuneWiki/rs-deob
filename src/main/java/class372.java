import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class372 {

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lka;")
    private class473 field5328 = new class473(64);

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lka;")
    public class473 field5344 = new class473(50);

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Lka;")
    public class473 field5345 = new class473(5);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Z")
    public boolean field5325;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Ldk;")
    public class421 field5327;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Ldk;")
    private class421 field5333;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lad;")
    public class12 field5343;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[[S")
    public static short[][] field5337 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5340 = null;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field5346;

    static {
        new class157("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2220(int arg0) {
        if (arg0 != -13036) {
            return;
        }
        for (int var1 = 0; var1 < class496.field7242; var1++) {
            int var2 = class311.field4227[var1];
            class209 var3 = ((class326) class281.field3826.method1592((byte) -25, (long) var2)).field4455;
            int var4 = class508.field7414.method1869(-110);
            if ((var4 & 0x8) != 0) {
                var4 += class508.field7414.method1869(-118) << 8;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field170 = class508.field7414.method1890(arg0 + 13164);
                var3.field184 = class508.field7414.method1890(arg0 + 13164);
                var3.field183 = class508.field7414.method1890(128);
                var3.field221 = class508.field7414.method1862(86);
                var3.field160 = class508.field7414.method1844(-125) + class28.field417;
                var3.field181 = class508.field7414.method1882(arg0 - 5815) + class28.field417;
                var3.field190 = class508.field7414.method1869(-66);
                var3.field183 += var3.field263[0];
                var3.field265 = 1;
                var3.field170 += var3.field263[0];
                var3.field184 += var3.field257[0];
                var3.field264 = 0;
                var3.field221 += var3.field257[0];
            }
            if ((var4 & 0x1000) != 0) {
                int var5 = class508.field7414.method1869(-110);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class508.field7414.method1865(-106);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class508.field7414.method1845(-128);
                    var8[var9] = class508.field7414.method1844(-123);
                }
                class146.method1023(var3, var7, var8, (byte) -123, var6);
            }
            if ((var4 & 0x1) != 0) {
                int var11 = class508.field7414.method1877(-71);
                int var12 = class508.field7414.method1869(-70);
                var3.method120(class28.field417, 4, var11, var12);
            }
            if ((var4 & 0x80) != 0) {
                int var13 = class508.field7414.method1844(-112);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class508.field7414.method1889(16);
                class169.method1168(var3, var14, true, var13);
            }
            if ((var4 & 0x100) != 0) {
                int var15 = class508.field7414.method1837((byte) -18);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = class508.field7414.method1863(-1);
                int var17 = class508.field7414.method1869(-118);
                var3.method103(true, 120, var17, var15, var16);
            }
            if ((var4 & 0x4) != 0) {
                int var18 = class508.field7414.method1877(arg0 ^ 0xFFFFCD6F);
                int var19 = class508.field7414.method1876((byte) -122);
                var3.method120(class28.field417, 4, var18, var19);
                var3.field238 = class28.field417 + 300;
                var3.field189 = class508.field7414.method1876((byte) -124);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field2976.method654(arg0 + 13035)) {
                    class134.method971(var3, true);
                }
                var3.method1330(class233.field3248.method2222((byte) -110, class508.field7414.method1837((byte) -18)), false);
                var3.method115(var3.field2976.field1228, (byte) 75);
                var3.field220 = var3.field2976.field1230 << 3;
                if (var3.field2976.method654(-1)) {
                    class461.method2683(var3.field257[0], var3.field263[0], null, 0, var3, null, var3.field6279, -4946);
                }
            }
            if ((var4 & 0x800) != 0) {
                int var20 = class508.field7414.method1837((byte) -18);
                var3.field207 = class508.field7414.method1869(-120);
                var3.field228 = class508.field7414.method1869(-88);
                var3.field245 = (var20 & 0x8000) != 0;
                var3.field197 = var20 & 0x7FFF;
                var3.field244 = class28.field417 + var3.field197 + var3.field207;
            }
            if ((var4 & 0x400) != 0) {
                var3.field177 = class508.field7414.method1862(82);
                var3.field158 = class508.field7414.method1834(-103);
                var3.field209 = class508.field7414.method1890(128);
                var3.field156 = (byte) class508.field7414.method1869(-91);
                var3.field241 = class28.field417 + class508.field7414.method1882(-18851);
                var3.field185 = class28.field417 + class508.field7414.method1844(-108);
            }
            if ((var4 & 0x2) != 0) {
                var3.field218 = class508.field7414.method1871(80);
                var3.field234 = 100;
            }
            if ((var4 & 0x20) != 0) {
                int var21 = class508.field7414.method1882(-18851);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = class508.field7414.method1846(false);
                int var23 = class508.field7414.method1869(-119);
                var3.method103(false, -70, var23, var21, var22);
            }
            if ((var4 & 0x200) != 0) {
                var3.field2979 = class508.field7414.method1882(-18851);
                var3.field2983 = class508.field7414.method1844(-111);
            }
            if ((var4 & 0x10) != 0) {
                var3.field202 = class508.field7414.method1865(-97);
                if (var3.field202 == 65535) {
                    var3.field202 = -1;
                }
            }
        }
        field5339++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B[[BLpu;)V", line = 215)
    public static final void method2221(byte arg0, byte[][] arg1, class177 arg2) {
        field5332++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        int var5 = 0;
        if (arg0 <= 95) {
            return;
        }
        while (var4 > var5) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class319 var11 = new class319(var10);
                int var12 = class463.field6689[var5] >> 8;
                int var13 = class463.field6689[var5] & 0xFF;
                int var14 = var12 * 64 - class110.field1775;
                int var15 = var13 * 64 - class399.field5727;
                class287.method1649(841283500);
                arg2.method11(class110.field1775, class399.field5727, (byte) -69, var15, var14, var11, class264.field3553);
                arg2.method1209(var3, class275.field3737, var11, var14, var15, true);
                if (!arg2.field29 && class412.field5874 / 8 == var12 && class334.field4874 / 8 == var13 && var3[0] != -1) {
                    class284.field3854 = class90.field1454.method1562(0, var3[2], var3[1], class215.field3058, var3[0], var3[3]);
                    class316.field4298 = var3[4];
                }
            }
            var5++;
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class463.field6689[var6] >> 8) * 64 - class110.field1775;
            int var8 = (class463.field6689[var6] & 0xFF) * 64 - class399.field5727;
            byte[] var9 = arg1[var6];
            if (var9 == null && class334.field4874 < 800) {
                class287.method1649(841283500);
                arg2.method6(true, var8, 64, var7, 64);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lum;", line = 292)
    public final class83 method2222(byte arg0, int arg1) {
        field5341++;
        class473 var3 = this.field5328;
        class83 var4;
        synchronized (this.field5328) {
            var4 = (class83) this.field5328.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = 47 % ((-arg0 - 8) / 59);
        class421 var6 = this.field5333;
        byte[] var7;
        synchronized (this.field5333) {
            var7 = this.field5333.method2512(class528.method3126(arg1, 127), (byte) -93, class348.method2089(10, arg1));
        }
        class83 var8 = new class83();
        var8.field1224 = this;
        var8.field1258 = arg1;
        if (var7 != null) {
            var8.method645(1225421455, new class319(var7));
        }
        var8.method656(true);
        class473 var9 = this.field5328;
        synchronized (this.field5328) {
            this.field5328.method2777(-1025, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 324)
    public final void method2223(int arg0) {
        field5334++;
        class473 var2 = this.field5328;
        synchronized (this.field5328) {
            this.field5328.method2774((byte) -42);
        }
        class473 var3 = this.field5344;
        synchronized (this.field5344) {
            this.field5344.method2774((byte) -50);
        }
        class473 var4 = this.field5345;
        synchronized (this.field5345) {
            this.field5345.method2774((byte) -49);
            if (arg0 != -25205) {
                field5337 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 346)
    public final void method2224(byte arg0) {
        class473 var2 = this.field5328;
        synchronized (this.field5328) {
            this.field5328.method2764(-769);
            if (arg0 >= -54) {
                this.field5343 = null;
            }
        }
        field5329++;
        class473 var3 = this.field5344;
        synchronized (this.field5344) {
            this.field5344.method2764(-769);
        }
        class473 var4 = this.field5345;
        synchronized (this.field5345) {
            this.field5345.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 376)
    public final void method2225(int arg0) {
        class473 var2 = this.field5344;
        synchronized (this.field5344) {
            this.field5344.method2764(-769);
            if (arg0 != 0) {
                this.method2226(-20, false);
            }
        }
        field5331++;
        class473 var3 = this.field5345;
        synchronized (this.field5345) {
            this.field5345.method2764(-769);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V", line = 397)
    public final void method2226(int arg0, boolean arg1) {
        field5326++;
        if (arg1 == this.field5325) {
            return;
        }
        this.field5325 = arg1;
        if (arg0 > -89) {
            method2231(-9);
        }
        this.method2224((byte) -77);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 413)
    public static void method2227(int arg0) {
        field5337 = null;
        field5340 = null;
        if (arg0 != 1) {
            field5340 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIFFFIIFIFLp;)[B", line = 424)
    public static final byte[] method2228(int arg0, int arg1, float arg2, float arg3, float arg4, int arg5, int arg6, float arg7, int arg8, float arg9, class185 arg10) {
        field5330++;
        byte[] var11 = new byte[arg5 * arg8 * arg6];
        int var12 = -50 % ((arg0 + 27) / 54);
        class511.method3031(var11, arg7, arg1, arg4, arg8, 0, 0, arg10, arg6, arg9, arg2, arg5, arg3);
        return var11;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V", line = 438)
    public final void method2229(int arg0, byte arg1) {
        this.field5346 = arg0;
        field5338++;
        class473 var3 = this.field5344;
        synchronized (this.field5344) {
            this.field5344.method2764(-769);
        }
        class473 var4 = this.field5345;
        synchronized (this.field5345) {
            this.field5345.method2764(-769);
        }
        int var5 = -26 % ((8 - arg1) / 34);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 454)
    public final void method2230(int arg0, int arg1) {
        field5335++;
        class473 var3 = this.field5328;
        synchronized (this.field5328) {
            this.field5328.method2779(14896, arg1);
            int var4 = 119 / ((arg0 + 89) / 36);
        }
        class473 var5 = this.field5344;
        synchronized (this.field5344) {
            this.field5344.method2779(14896, arg1);
        }
        class473 var6 = this.field5345;
        synchronized (this.field5345) {
            this.field5345.method2779(14896, arg1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 472)
    public static final void method2231(int arg0) {
        if (class275.field3737 != null) {
            class116.field1835.method2593(false);
            class249.method1486();
            class35.method258(117);
            class49.method324(true);
            class320.method1896(arg0 + 1);
            class136.method975(false);
            if (class284.field3854 != null) {
                class284.field3854.method846((byte) 42);
            }
            class257.method1529(-1538950112);
            class250.method1490((byte) 107);
            class449.method2641(arg0 ^ 0x7D);
            class235.method1432((byte) 0, false);
            class156.method1122((byte) -8);
            for (int var1 = 0; var1 < 2048; var1++) {
                class487 var5 = class45.field642[var1];
                if (var5 != null) {
                    var5.field259 = null;
                    for (int var6 = 0; var6 < var5.field261.length; var6++) {
                        var5.field261[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class534.field7854; var2++) {
                class209 var3 = class496.field7261[var2].field4455;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field261.length; var4++) {
                        var3.field261[var4] = null;
                    }
                }
            }
            class14.field146 = null;
            class374.field5384 = null;
            class275.field3737.method1713(arg0);
            class275.field3737 = null;
        }
        field5336++;
        if (arg0 != -1) {
            method2231(-94);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lad;IZLdk;Ldk;)V", line = 561)
    public class372(class12 arg0, int arg1, boolean arg2, class421 arg3, class421 arg4) {
        this.field5325 = arg2;
        this.field5327 = arg4;
        this.field5333 = arg3;
        this.field5343 = arg0;
        if (this.field5333 != null) {
            int var6 = this.field5333.method2493((byte) -41) - 1;
            this.field5333.method2509(0, var6);
        }
    }
}
