import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class267 {

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lek;")
    private class205 field4273 = new class205();

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Lek;")
    private class205 field4281 = new class205();

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Lek;")
    private class205 field4284 = new class205();

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "Lek;")
    private class205 field4286 = new class205();

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "Lhc;")
    private class53 field4290 = new class53(4);

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "B")
    private byte field4291 = 0;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public volatile int field4293 = 0;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public volatile int field4294 = 0;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "Lhc;")
    private class53 field4292 = new class53(8);

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field4277 = 0;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field4279 = 0;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field4272 = 0;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "[Z")
    public static boolean[] field4263 = new boolean[100];

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "[I")
    public static int[] field4276 = new int[100];

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4267 = new String[100];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    private int field4289;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "J")
    private long field4288;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "Lve;")
    private class203 field4287;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Llc;")
    public static class270 field4278;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "Lhb;")
    private class302 field4295;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    private final void method1827(byte arg0) {
        field4259++;
        int var2 = 122 % ((arg0 - 6) / 38);
        if (this.field4287 == null) {
            return;
        }
        try {
            this.field4290.field735 = 0;
            this.field4290.method360(6, 25759);
            this.field4290.method332(3, -49152);
            this.field4287.method1435(9, 0, this.field4290.field758, 4);
        } catch (IOException var4) {
            try {
                this.field4287.method1440(-1);
            } catch (Exception var3) {
            }
            this.field4287 = null;
            this.field4293++;
            this.field4294 = -2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method1828(int arg0) {
        if (this.field4287 != null) {
            this.field4287.method1438(0);
        }
        field4274++;
        int var2 = 103 % ((27 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)Z")
    public final boolean method1829(boolean arg0) {
        if (this.field4287 != null) {
            long var2 = class3.method14(29853);
            int var4 = (int) (var2 - this.field4288);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4288 = var2;
            this.field4289 += var4;
            if (this.field4289 > 30000) {
                try {
                    this.field4287.method1440(-1);
                } catch (Exception var27) {
                }
                this.field4287 = null;
            }
        }
        field4282++;
        if (this.field4287 == null) {
            return this.method1841(0) == 0 && this.method1839(18) == 0;
        }
        try {
            this.field4287.method1442((byte) 106);
            for (class302 var5 = (class302) this.field4273.method1450(false); var5 != null; var5 = (class302) this.field4273.method1448(!arg0)) {
                this.field4290.field735 = 0;
                this.field4290.method360(1, 25759);
                this.field4290.method332((int) var5.field2422, -49152);
                this.field4287.method1435(9, 0, this.field4290.field758, 4);
                this.field4281.method1453(-117, var5);
            }
            if (!arg0) {
                method1840(-33);
            }
            for (class302 var6 = (class302) this.field4284.method1450(false); var6 != null; var6 = (class302) this.field4284.method1448(false)) {
                this.field4290.field735 = 0;
                this.field4290.method360(0, 25759);
                this.field4290.method332((int) var6.field2422, -49152);
                this.field4287.method1435(9, 0, this.field4290.field758, 4);
                this.field4286.method1453(109, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4287.method1434(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4289 = 0;
                byte var9 = 0;
                if (this.field4295 == null) {
                    var9 = 8;
                } else if (this.field4295.field4892 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4295.field4885.field758.length - this.field4295.field4888;
                    int var11 = 512 - this.field4295.field4892;
                    if (var11 > (var10 - this.field4295.field4885.field735)) {
                        var11 = var10 - this.field4295.field4885.field735;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field4287.method1443(-117, this.field4295.field4885.field735, this.field4295.field4885.field758, var11);
                    if (this.field4291 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4295.field4885.field758[this.field4295.field4885.field735 + var12] = (byte) class224.method1553(this.field4295.field4885.field758[this.field4295.field4885.field735 + var12], this.field4291);
                        }
                    }
                    this.field4295.field4885.field735 += var11;
                    this.field4295.field4892 += var11;
                    if (this.field4295.field4885.field735 == var10) {
                        this.field4295.method1135(false);
                        this.field4295.field2341 = false;
                        this.field4295 = null;
                    } else if (this.field4295.field4892 == 512) {
                        this.field4295.field4892 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4292.field735;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field4287.method1443(-117, this.field4292.field735, this.field4292.field758, var13);
                    if (this.field4291 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4292.field758[this.field4292.field735 + var14] = (byte) class224.method1553(this.field4292.field758[this.field4292.field735 + var14], this.field4291);
                        }
                    }
                    this.field4292.field735 += var13;
                    if (var9 <= this.field4292.field735) {
                        if (this.field4295 == null) {
                            this.field4292.field735 = 0;
                            int var15 = this.field4292.method366(-16505);
                            int var16 = this.field4292.method331(-69);
                            int var17 = this.field4292.method366(-16505);
                            boolean var18 = (var17 & 0x80) != 0;
                            long var19 = (long) ((var15 << 16) + var16);
                            Object var21 = null;
                            int var22 = this.field4292.method340(-127);
                            class302 var23;
                            if (var18) {
                                for (var23 = (class302) this.field4286.method1450(!arg0); var23 != null && var23.field2422 != var19; var23 = (class302) this.field4286.method1448(false)) {
                                }
                            } else {
                                for (var23 = (class302) this.field4281.method1450(false); var23 != null && var23.field2422 != var19; var23 = (class302) this.field4281.method1448(false)) {
                                }
                            }
                            int var24 = var17 & 0x7F;
                            if (var23 == null) {
                                throw new IOException();
                            }
                            this.field4295 = var23;
                            int var25 = var24 == 0 ? 5 : 9;
                            this.field4295.field4885 = new class53(var22 + var25 + this.field4295.field4888);
                            this.field4295.field4885.method360(var24, 25759);
                            this.field4295.field4885.method385(var22, 455748840);
                            this.field4295.field4892 = 8;
                            this.field4292.field735 = 0;
                        } else if (this.field4295.field4892 != 0) {
                            throw new IOException();
                        } else if (this.field4292.field758[0] == -1) {
                            this.field4292.field735 = 0;
                            this.field4295.field4892 = 1;
                        } else {
                            this.field4295 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4287.method1440(-1);
            } catch (Exception var26) {
            }
            this.field4287 = null;
            this.field4293++;
            this.field4294 = -2;
            return this.method1841(0) == 0 && this.method1839(46) == 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIZ)Lhb;")
    public final class302 method1830(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 < 103) {
            field4267 = null;
        }
        class302 var6 = new class302();
        field4266++;
        var6.field4888 = arg1;
        long var7 = (long) ((arg0 << 16) + arg2);
        var6.field2342 = arg4;
        var6.field2422 = var7;
        if (arg4) {
            if (this.method1841(0) >= 20) {
                throw new RuntimeException();
            }
            this.field4273.method1453(-76, var6);
        } else if (this.method1839(4) < 20) {
            this.field4284.method1453(-125, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method1831(int arg0) {
        if (arg0 != 13862) {
            method1840(-113);
        }
        field4278 = null;
        field4276 = null;
        field4267 = null;
        field4263 = null;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Z")
    public final boolean method1832(byte arg0) {
        field4283++;
        if (arg0 != -15) {
            this.field4295 = null;
        }
        return this.method1841(arg0 + 15) >= 20;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
    public static final void method1833(int arg0, byte arg1) {
        class272.field4399.method1416(arg0, 0);
        class14.field161.method1416(arg0, 0);
        class287.field4595.method1416(arg0, 0);
        if (arg1 > 35) {
            field4260++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
    public static final void method1834(int arg0, boolean arg1) {
        field4257++;
        class79.field1277 = arg1;
        if (arg0 != -31477) {
            method1835((byte) 27, (String) null, (char) 65449);
        }
        class69.field1115 = !class273.method1903(100);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method1835(byte arg0, String arg1, char arg2) {
        field4256++;
        int var3 = 0;
        int var4 = 0;
        int var5 = -28 / ((arg0 - 33) / 58);
        int var6 = class120.method890(arg2, arg1, 0);
        String[] var7 = new String[var6 + 1];
        for (int var8 = 0; var8 < var6; var8++) {
            int var9;
            for (var9 = var3; arg2 != arg1.charAt(var9); var9++) {
            }
            var7[var4++] = arg1.substring(var3, var9);
            var3 = var9 + 1;
        }
        var7[var6] = arg1.substring(var3);
        return var7;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)V")
    public final void method1836(byte arg0) {
        field4280++;
        if (this.field4287 != null) {
            this.field4287.method1440(-1);
        }
        if (arg0 != 82) {
            method1833(-61, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V")
    public final void method1837(boolean arg0, int arg1) {
        field4262++;
        if (this.field4287 == null) {
            return;
        }
        try {
            this.field4290.field735 = 0;
            if (arg1 == 8) {
                this.field4290.method360(arg0 ? 2 : 3, 25759);
                this.field4290.method332(0, -49152);
                this.field4287.method1435(9, 0, this.field4290.field758, 4);
            }
        } catch (IOException var4) {
            try {
                this.field4287.method1440(-1);
            } catch (Exception var3) {
            }
            this.field4293++;
            this.field4287 = null;
            this.field4294 = -2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public final void method1838(boolean arg0) {
        try {
            this.field4287.method1440(-1);
        } catch (Exception var2) {
        }
        if (arg0) {
            return;
        }
        this.field4291 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4287 = null;
        this.field4294 = -1;
        field4271++;
        this.field4293++;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)I")
    private final int method1839(int arg0) {
        if (arg0 < 3) {
            this.method1828(93);
        }
        field4270++;
        return this.field4284.method1451(true) + this.field4286.method1451(true);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V")
    public static final void method1840(int arg0) {
        field4261++;
        class162 var1 = (class162) class126.field2123.method8(-79);
        if (arg0 != 0) {
            return;
        }
        while (var1 != null) {
            class179 var2 = var1.field2513;
            if (class37.field474 != var2.field2690 || var2.field2674) {
                var1.method1781(arg0 + 5250);
            } else if (var2.field2687 <= class199.field2930) {
                var2.method1268(true, class126.field2126);
                if (var2.field2674) {
                    var1.method1781(arg0 + 5250);
                } else {
                    class71.method540(var2.field2690, var2.field2670, var2.field2675, var2.field2685, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class162) class126.field2123.method12((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)I")
    public final int method1841(int arg0) {
        if (arg0 == 0) {
            field4264++;
            return this.field4273.method1451(true) + this.field4281.method1451(true);
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Llc;I)V")
    public static final void method1842(class270 arg0, int arg1) {
        field4255++;
        class294.field4716 = arg0;
        if (arg1 <= 34) {
            field4277 = 17;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lve;ZZ)V")
    public final void method1843(class203 arg0, boolean arg1, boolean arg2) {
        field4275++;
        if (this.field4287 != null) {
            try {
                this.field4287.method1440(-1);
            } catch (Exception var8) {
            }
            this.field4287 = null;
        }
        this.field4287 = arg0;
        this.method1827((byte) 107);
        this.method1837(arg1, 8);
        this.field4292.field735 = 0;
        this.field4295 = null;
        while (true) {
            class302 var4 = (class302) this.field4281.method1452((byte) 23);
            if (var4 == null) {
                while (true) {
                    class302 var5 = (class302) this.field4286.method1452((byte) 23);
                    if (var5 == null) {
                        if (this.field4291 != 0) {
                            try {
                                this.field4290.field735 = 0;
                                this.field4290.method360(4, 25759);
                                this.field4290.method360(this.field4291, 25759);
                                this.field4290.method376(0, false);
                                this.field4287.method1435(9, 0, this.field4290.field758, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4287.method1440(-1);
                                } catch (Exception var6) {
                                }
                                this.field4294 = -2;
                                this.field4287 = null;
                                this.field4293++;
                            }
                        }
                        this.field4289 = 0;
                        if (!arg2) {
                            method1840(29);
                        }
                        this.field4288 = class3.method14(29853);
                        return;
                    }
                    this.field4284.method1453(-122, var5);
                }
            }
            this.field4273.method1453(-66, var4);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Z)Z")
    public final boolean method1844(boolean arg0) {
        if (!arg0) {
            field4265 = 103;
        }
        field4268++;
        return this.method1839(109) >= 20;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
    public final void method1845(int arg0) {
        field4285++;
        if (this.field4287 == null) {
            return;
        }
        try {
            this.field4290.field735 = 0;
            this.field4290.method360(7, arg0 + 39689);
            this.field4290.method332(0, arg0 - 35222);
            if (arg0 != -13930) {
                field4276 = null;
            }
            this.field4287.method1435(9, 0, this.field4290.field758, 4);
        } catch (IOException var3) {
            try {
                this.field4287.method1440(-1);
            } catch (Exception var2) {
            }
            this.field4294 = -2;
            this.field4293++;
            this.field4287 = null;
        }
    }
}
