import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class35 {

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Laf;")
    private class168 field414 = new class168();

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Laf;")
    private class168 field421 = new class168();

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "Laf;")
    private class168 field423 = new class168();

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Laf;")
    private class168 field426 = new class168();

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Lim;")
    private class170 field429 = new class170(4);

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public volatile int field433 = 0;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public volatile int field432 = 0;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "B")
    private byte field434 = 0;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Lim;")
    private class170 field431 = new class170(8);

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[Laj;")
    public static class1[] field409 = new class1[2048];

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field420 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "J")
    private long field428;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "Lak;")
    private class298 field435;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Lua;")
    private class83 field430;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method179(int arg0) {
        if (this.field430 != null) {
            this.field430.method559(5000);
        }
        field410++;
        if (arg0 != 21764) {
            this.field434 = 83;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIILfe;III)V")
    public static final void method180(int arg0, int arg1, int arg2, int arg3, class231 arg4, int arg5, int arg6, int arg7) {
        int var8 = arg6 * arg6 + (arg5 * arg5);
        field412++;
        if (var8 > arg3 || arg1 != -24193) {
            return;
        }
        int var9 = Math.min(arg4.field3730 / 2, arg4.field3686 / 2);
        if ((var9 * var9) >= var8) {
            class137.method867(arg7, 99, class255.field4161[arg0], arg5, arg4, arg2, arg6);
            return;
        }
        int var10 = (int) class144.field2145 + class146.field2173 & 0x7FF;
        int var11 = class221.field3465[var10];
        int var12 = var11 * 256 / (class60.field876 + 256);
        int var13 = class221.field3468[var10];
        var9 -= 10;
        int var14 = var13 * 256 / (class60.field876 + 256);
        int var15 = arg5 * var14 + arg6 * var12 >> 16;
        int var16 = arg5 * var12 - arg6 * var14 >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        ((class48) class226.field3516[arg0]).method271(arg4.field3730 / 2 + arg2 + var19 - 10, arg4.field3686 / 2 + -var20 + arg7 + -10, 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Z")
    public final boolean method181(int arg0) {
        field406++;
        if (arg0 == -16333) {
            return this.method183((byte) -14) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public final void method182(int arg0) {
        if (this.field430 != null) {
            this.field430.method567(0);
        }
        field408++;
        if (arg0 >= -103) {
            this.field414 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)I")
    public final int method183(byte arg0) {
        field404++;
        return arg0 >= -4 ? -106 : this.field414.method1152(true) + this.field421.method1152(true);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public static void method184(byte arg0) {
        field409 = null;
        if (arg0 <= 32) {
            field409 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Z")
    public final boolean method185(byte arg0) {
        if (this.field430 != null) {
            long var2 = class98.method665(true);
            int var4 = (int) (var2 - this.field428);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field427 += var4;
            this.field428 = var2;
            if (this.field427 > 30000) {
                try {
                    this.field430.method567(0);
                } catch (Exception var27) {
                }
                this.field430 = null;
            }
        }
        field405++;
        if (this.field430 == null) {
            return this.method183((byte) -33) == 0 && this.method195(-32332) == 0;
        }
        try {
            this.field430.method560(-9634);
            for (class298 var5 = (class298) this.field414.method1146(-106); var5 != null; var5 = (class298) this.field414.method1148((byte) 113)) {
                this.field429.field2676 = 0;
                this.field429.method1183(1, 984049208);
                this.field429.method1199((int) var5.field874, 95);
                this.field430.method562(4, this.field429.field2650, 0, 91);
                this.field421.method1149(4336, var5);
            }
            for (class298 var6 = (class298) this.field423.method1146(96); var6 != null; var6 = (class298) this.field423.method1148((byte) 113)) {
                this.field429.field2676 = 0;
                this.field429.method1183(0, 984049208);
                this.field429.method1199((int) var6.field874, 81);
                this.field430.method562(4, this.field429.field2650, 0, 121);
                this.field426.method1149(4336, var6);
            }
            int var7 = 0;
            if (arg0 <= 126) {
                field420 = 30;
            }
            while (var7 < 100) {
                int var8 = this.field430.method558(-23644);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                byte var9 = 0;
                if (this.field435 == null) {
                    var9 = 8;
                } else if (this.field435.field4749 == 0) {
                    var9 = 1;
                }
                this.field427 = 0;
                if (var9 <= 0) {
                    int var10 = this.field435.field4754.field2650.length - this.field435.field4757;
                    int var11 = 512 - this.field435.field4749;
                    if (var11 > (var10 - this.field435.field4754.field2676)) {
                        var11 = var10 - this.field435.field4754.field2676;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field430.method566(var11, this.field435.field4754.field2650, false, this.field435.field4754.field2676);
                    if (this.field434 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field435.field4754.field2650[this.field435.field4754.field2676 + var12] = (byte) class299.method2011(this.field435.field4754.field2650[this.field435.field4754.field2676 + var12], this.field434);
                        }
                    }
                    this.field435.field4754.field2676 += var11;
                    this.field435.field4749 += var11;
                    if (this.field435.field4754.field2676 == var10) {
                        this.field435.method378((byte) -118);
                        this.field435.field4700 = false;
                        this.field435 = null;
                    } else if (this.field435.field4749 == 512) {
                        this.field435.field4749 = 0;
                    }
                } else {
                    int var13 = var9 - this.field431.field2676;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field430.method566(var13, this.field431.field2650, false, this.field431.field2676);
                    if (this.field434 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field431.field2650[this.field431.field2676 + var14] = (byte) class299.method2011(this.field431.field2650[this.field431.field2676 + var14], this.field434);
                        }
                    }
                    this.field431.field2676 += var13;
                    if (var9 <= this.field431.field2676) {
                        if (this.field435 == null) {
                            this.field431.field2676 = 0;
                            int var15 = this.field431.method1218(-111);
                            int var16 = this.field431.method1186((byte) -48);
                            int var17 = this.field431.method1218(-53);
                            int var18 = this.field431.method1190(6345);
                            boolean var19 = (var17 & 0x80) != 0;
                            int var20 = var17 & 0x7F;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class298 var24;
                            if (var19) {
                                for (var24 = (class298) this.field426.method1146(89); var24 != null && var24.field874 != var21; var24 = (class298) this.field426.method1148((byte) 113)) {
                                }
                            } else {
                                for (var24 = (class298) this.field421.method1146(87); var24 != null && var24.field874 != var21; var24 = (class298) this.field421.method1148((byte) 113)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field435 = var24;
                            int var25 = var20 == 0 ? 5 : 9;
                            this.field435.field4754 = new class170(this.field435.field4757 + var18 + var25);
                            this.field435.field4754.method1183(var20, 984049208);
                            this.field435.field4754.method1210(var18, (byte) -16);
                            this.field431.field2676 = 0;
                            this.field435.field4749 = 8;
                        } else if (this.field435.field4749 != 0) {
                            throw new IOException();
                        } else if (this.field431.field2650[0] == -1) {
                            this.field431.field2676 = 0;
                            this.field435.field4749 = 1;
                        } else {
                            this.field435 = null;
                        }
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field430.method567(0);
            } catch (Exception var26) {
            }
            this.field433++;
            this.field430 = null;
            this.field432 = -2;
            return this.method183((byte) -85) == 0 && this.method195(-32332) == 0;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)I")
    public static final int method186(byte arg0) {
        if (arg0 <= 25) {
            method191(84, -86);
        }
        field413++;
        return class182.field2860 && class309.field4977[81] && class173.field2721 > 2 ? class163.field2495[class173.field2721 - 2] : class163.field2495[class173.field2721 - 1];
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
    public final void method187(boolean arg0) {
        field422++;
        if (this.field430 == null) {
            return;
        }
        try {
            this.field429.field2676 = 0;
            this.field429.method1183(7, 984049208);
            if (!arg0) {
                this.field429.method1199(0, 88);
                this.field430.method562(4, this.field429.field2650, 0, 119);
            }
        } catch (IOException var3) {
            try {
                this.field430.method567(0);
            } catch (Exception var2) {
            }
            this.field433++;
            this.field430 = null;
            this.field432 = -2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lua;ZB)V")
    public final void method188(class83 arg0, boolean arg1, byte arg2) {
        field424++;
        int var4 = -68 % ((arg2 + 50) / 52);
        if (this.field430 != null) {
            try {
                this.field430.method567(0);
            } catch (Exception var9) {
            }
            this.field430 = null;
        }
        this.field430 = arg0;
        this.method194(1);
        this.method193(arg1, 97);
        this.field431.field2676 = 0;
        this.field435 = null;
        while (true) {
            class298 var5 = (class298) this.field421.method1145(false);
            if (var5 == null) {
                while (true) {
                    class298 var6 = (class298) this.field426.method1145(false);
                    if (var6 == null) {
                        if (this.field434 != 0) {
                            try {
                                this.field429.field2676 = 0;
                                this.field429.method1183(4, 984049208);
                                this.field429.method1183(this.field434, 984049208);
                                this.field429.method1180(-17437, 0);
                                this.field430.method562(4, this.field429.field2650, 0, -104);
                            } catch (IOException var8) {
                                try {
                                    this.field430.method567(0);
                                } catch (Exception var7) {
                                }
                                this.field432 = -2;
                                this.field430 = null;
                                this.field433++;
                            }
                        }
                        this.field427 = 0;
                        this.field428 = class98.method665(true);
                        return;
                    }
                    this.field423.method1149(4336, var6);
                }
            }
            this.field414.method1149(4336, var5);
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)Z")
    public final boolean method189(byte arg0) {
        field416++;
        int var2 = -5 % ((-arg0 - 6) / 45);
        return this.method195(-32332) >= 20;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(B)V")
    public final void method190(byte arg0) {
        field425++;
        try {
            this.field430.method567(0);
        } catch (Exception var2) {
        }
        if (arg0 > -34) {
            this.field435 = null;
        }
        this.field433++;
        this.field430 = null;
        this.field432 = -1;
        this.field434 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method191(int arg0, int arg1) {
        class181 var2 = class95.method652(11, (byte) 34, arg1);
        field415++;
        if (arg0 != -256) {
            method184((byte) -110);
        }
        var2.method1283(192);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZBIII)Lak;")
    public final class298 method192(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field407++;
        long var6 = (long) ((arg3 << 16) + arg2);
        int var8 = -79 % ((arg4 + 59) / 38);
        class298 var9 = new class298();
        var9.field4757 = arg1;
        var9.field874 = var6;
        var9.field4698 = arg0;
        if (arg0) {
            if (this.method183((byte) -57) >= 20) {
                throw new RuntimeException();
            }
            this.field414.method1149(4336, var9);
        } else if (this.method195(-32332) < 20) {
            this.field423.method1149(4336, var9);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
    public final void method193(boolean arg0, int arg1) {
        field418++;
        if (this.field430 == null) {
            return;
        }
        try {
            this.field429.field2676 = 0;
            this.field429.method1183(arg0 ? 2 : 3, 984049208);
            this.field429.method1199(0, 95);
            this.field430.method562(4, this.field429.field2650, 0, 93);
        } catch (IOException var4) {
            try {
                this.field430.method567(0);
            } catch (Exception var3) {
            }
            this.field433++;
            this.field432 = -2;
            this.field430 = null;
        }
        if (arg1 <= 60) {
            this.method188((class83) null, true, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    private final void method194(int arg0) {
        field417++;
        if (this.field430 == null) {
            return;
        }
        try {
            this.field429.field2676 = 0;
            this.field429.method1183(6, arg0 ^ 0x3AA76639);
            if (arg0 == 1) {
                this.field429.method1199(3, arg0 ^ 0x60);
                this.field430.method562(4, this.field429.field2650, 0, arg0 ^ 0xFFFFFFEF);
            }
        } catch (IOException var3) {
            try {
                this.field430.method567(arg0 ^ 0x1);
            } catch (Exception var2) {
            }
            this.field433++;
            this.field432 = -2;
            this.field430 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)I")
    private final int method195(int arg0) {
        if (arg0 == -32332) {
            field411++;
            return this.field423.method1152(true) + this.field426.method1152(true);
        } else {
            return 119;
        }
    }
}
