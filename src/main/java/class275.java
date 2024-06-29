import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class275 extends class60 implements class288 {

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    private int field4252 = 50;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Z")
    private boolean field4246 = false;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lpk;")
    private class237 field4241;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lpk;")
    private class237 field4251;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lnc;")
    private class89 field4260;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lnc;")
    private class89 field4247;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
    public static boolean field4238 = false;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field4237 = 0;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Z")
    public static boolean field4244 = false;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4262 = null;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lhl;")
    public static class139 field4239 = new class139(30);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lcg;")
    public static class8 field4249;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[[Ljk;")
    public static class297[][] field4236;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZI)I")
    public final int method1829(boolean arg0, int arg1) {
        field4248++;
        if (arg0) {
            this.field4251 = null;
        }
        return this.method491(arg1, -128).field3627 & 0xFFFF;
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(II)Lof;")
    public final class183 method493(int arg0, int arg1) {
        field4235++;
        class65 var3 = this.method1835((byte) -86, arg0);
        if (arg1 > -22) {
            method1837(-49, -46, false, -34, (byte[]) null, (class78[]) null);
        }
        return var3 == null ? null : var3.field1081;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FIB)[I")
    public final int[] method1830(float arg0, int arg1, byte arg2) {
        int var4 = 61 / ((arg2 - 15) / 41);
        field4242++;
        class65 var5 = this.method1835((byte) -86, arg1);
        if (var5 == null) {
            return null;
        } else {
            var5.field1076 = true;
            return var5.method526(this, this.field4251, arg0, this.field4246 || this.method491(arg1, -37).field3620);
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)Z")
    public final boolean method1831(int arg0, int arg1) {
        field4261++;
        if (this.field4246 || this.method491(arg1, -113).field3620) {
            return true;
        } else {
            return arg0 != 1273860550;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public final void method1832(int arg0) {
        this.field4260.method670((byte) -52);
        field4256++;
        if (this.field4247 != null) {
            this.field4247.method670((byte) -61);
        }
        int var2 = -58 % ((-arg0 - 44) / 34);
        class65.field1077 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZBFII)Lwh;")
    public final class289 method1833(boolean arg0, byte arg1, float arg2, int arg3, int arg4) {
        class65 var6 = this.method1835((byte) -86, arg4);
        field4240++;
        if (arg1 > -78) {
            method1837(-62, -102, true, -70, (byte[]) null, (class78[]) null);
        }
        if (var6 != null && var6.method525(this, this.field4251)) {
            return arg0 ? var6.field1081.method1199(this, (byte) 68, (double) arg2, arg3, arg3, false, this.field4251) : var6.field1081.method1198(this.field4251, (byte) -118, arg3, false, this, arg3, (double) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(BI)Z")
    public final boolean method1834(byte arg0, int arg1) {
        if (arg0 >= -117) {
            field4238 = false;
        }
        field4259++;
        return this.method491(arg1, -56).field3631;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lpk;Lpk;Lpk;IZ)V")
    public class275(class237 arg0, class237 arg1, class237 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field4246 = arg4;
        this.field4252 = arg3;
        this.field4241 = arg0;
        this.field4251 = arg2;
        this.field4260 = new class89(this.field4252);
        this.field4247 = null;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(BI)Lbi;")
    private final class65 method1835(byte arg0, int arg1) {
        field4255++;
        if (arg0 != -86) {
            method1837(-92, -7, true, 97, (byte[]) null, (class78[]) null);
        }
        class65 var3 = (class65) this.field4260.method675(arg0 + 31644, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4241.method1605(-125, 0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class65 var5 = new class65(new class54(var4));
            this.field4260.method677((byte) 119, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(II)V")
    public final void method1836(int arg0, int arg1) {
        field4243++;
        for (class65 var3 = (class65) this.field4260.method672(0); var3 != null; var3 = (class65) this.field4260.method673(23971)) {
            if (var3.field1076) {
                var3.method524(arg1);
                var3.field1076 = false;
            }
        }
        int var4 = 34 % (-arg0 / 43);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZI[B[Lql;)V")
    public static final void method1837(int arg0, int arg1, boolean arg2, int arg3, byte[] arg4, class78[] arg5) {
        if (arg3 != 22837) {
            field4237 = 92;
        }
        field4258++;
        int var6 = -1;
        class54 var7 = new class54(arg4);
        while (true) {
            int var8 = var7.method434(65280);
            if (var8 == 0) {
                return;
            }
            int var9 = 0;
            var6 += var8;
            while (true) {
                int var10 = var7.method436(126);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method407(255);
                int var15 = arg1 + var12;
                int var16 = var14 >> 2;
                int var17 = var14 & 0x3;
                int var18 = arg0 + var11;
                if (var18 > 0 && var15 > 0 && var18 < 103 && var15 < 103) {
                    class78 var19 = null;
                    if (!arg2) {
                        int var20 = var13;
                        if ((class247.field3844[1][var18][var15] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class177.method1169(true, var6, !arg2, var15, var17, var18, arg2, var16, var13, var13, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Z")
    public final boolean method1838(byte arg0, int arg1) {
        field4257++;
        if (arg0 != -74) {
            this.method1831(79, -99);
        }
        return !this.method491(arg1, -104).field3626;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
    public final void method1839(int arg0, boolean arg1) {
        this.field4246 = arg1;
        field4245++;
        if (arg0 > -68) {
            this.field4251 = null;
        }
        this.method1832(-112);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public static final void method1840(int arg0) {
        class216.field3319.method944(arg0 + 65536);
        class128.field1889.method944(arg0 + 65536);
        if (arg0 != -1) {
            field4250 = 41;
        }
        field4254++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
    public static final int method1841(int arg0, int arg1, int arg2) {
        field4253++;
        if (arg1 < 15) {
            field4244 = true;
        }
        int var3 = class36.method283(arg0 - 1, arg2 - 1, false) + class36.method283(arg0 - 1, arg2 + 1, false) - (-class36.method283(arg0 + 1, arg2 + -1, false) + -class36.method283(arg0 + 1, arg2 + 1, false));
        int var4 = class36.method283(arg0, arg2 - 1, false) - (-class36.method283(arg0, arg2 + 1, false) - class36.method283(arg0 - 1, arg2, false)) + class36.method283(arg0 + 1, arg2, false);
        int var5 = class36.method283(arg0, arg2, false);
        return var3 / 16 - (-(var4 / 8) - var5 / 4);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static void method1842(byte arg0) {
        field4249 = null;
        field4236 = null;
        if (arg0 != -109) {
            method1841(-86, -92, -9);
        }
        field4239 = null;
        field4262 = null;
    }
}
