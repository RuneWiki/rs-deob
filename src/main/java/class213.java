import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class213 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lcba;")
    private class513 field3243 = new class513();

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lcba;")
    private class513 field3262 = new class513();

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lcba;")
    private class513 field3265 = new class513();

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lcba;")
    private class513 field3266 = new class513();

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lqh;")
    private class61 field3270 = new class61(4);

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "B")
    private byte field3272 = 0;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public volatile int field3273 = 0;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public volatile int field3271 = 0;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lqh;")
    private class61 field3274 = new class61(8);

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3251 = -1;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    private int field3268;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "J")
    private long field3267;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lom;")
    public static class344 field3263;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "Lft;")
    private class4 field3275;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "Lqt;")
    private class591 field3269;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
    public static int[] field3252;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
    public final boolean method1478(byte arg0) {
        field3248++;
        if (this.field3269 != null) {
            long var2 = class525.method3074((byte) -101);
            int var4 = (int) (var2 - this.field3267);
            this.field3267 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3268 += var4;
            if (this.field3268 > 30000) {
                try {
                    this.field3269.method3375(arg0 ^ 0x59);
                } catch (Exception var27) {
                }
                this.field3269 = null;
            }
        }
        if (this.field3269 == null) {
            return this.method1483(arg0 ^ 0xFFFFBB0A) == 0 && this.method1486(arg0 - 6) == 0;
        }
        try {
            this.field3269.method3372(arg0 + 209);
            for (class4 var5 = (class4) this.field3243.method3024(arg0 + 5662); var5 != null; var5 = (class4) this.field3243.method3026(arg0 + 90)) {
                this.field3270.field1393 = 0;
                this.field3270.method693((byte) 106, 1);
                this.field3270.method691((byte) -111, (int) var5.field9628);
                this.field3269.method3373(4, this.field3270.field1397, 0, (byte) -71);
                this.field3262.method3023((byte) 119, var5);
            }
            for (class4 var6 = (class4) this.field3265.method3024(5572); var6 != null; var6 = (class4) this.field3265.method3026(arg0 + 90)) {
                this.field3270.field1393 = 0;
                this.field3270.method693((byte) 106, 0);
                this.field3270.method691((byte) 85, (int) var6.field9628);
                this.field3269.method3373(4, this.field3270.field1397, 0, (byte) -71);
                this.field3266.method3023((byte) 86, var6);
            }
            int var7 = 0;
            if (arg0 != -90) {
                this.method1483(-9);
            }
            while (var7 < 100) {
                int var8 = this.field3269.method3371(-2);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3268 = 0;
                byte var9 = 0;
                if (this.field3275 == null) {
                    var9 = 8;
                } else if (this.field3275.field457 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3275.field462.field1397.length - this.field3275.field461;
                    int var11 = 512 - this.field3275.field457;
                    if (var11 > var10 - this.field3275.field462.field1393) {
                        var11 = var10 - this.field3275.field462.field1393;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field3269.method3370(this.field3275.field462.field1397, arg0 ^ 0xFFFFFFD9, var11, this.field3275.field462.field1393);
                    if (this.field3272 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3275.field462.field1397[this.field3275.field462.field1393 + var12] = (byte) class691.method3871(this.field3275.field462.field1397[this.field3275.field462.field1393 + var12], this.field3272);
                        }
                    }
                    this.field3275.field457 += var11;
                    this.field3275.field462.field1393 += var11;
                    if (this.field3275.field462.field1393 == var10) {
                        this.field3275.method3813(-101);
                        this.field3275.field9179 = false;
                        this.field3275 = null;
                    } else if (this.field3275.field457 == 512) {
                        this.field3275.field457 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3274.field1393;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3269.method3370(this.field3274.field1397, 127, var13, this.field3274.field1393);
                    if (this.field3272 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3274.field1397[this.field3274.field1393 + var14] = (byte) class691.method3871(this.field3274.field1397[this.field3274.field1393 + var14], this.field3272);
                        }
                    }
                    this.field3274.field1393 += var13;
                    if (this.field3274.field1393 >= var9) {
                        if (this.field3275 == null) {
                            this.field3274.field1393 = 0;
                            int var15 = this.field3274.method732(-559537960);
                            int var16 = this.field3274.method723((byte) -25);
                            int var17 = this.field3274.method732(-559537960);
                            int var18 = this.field3274.method730(105);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class4 var24;
                            if (var20) {
                                for (var24 = (class4) this.field3266.method3024(5572); var24 != null && var24.field9628 != var21; var24 = (class4) this.field3266.method3026(0)) {
                                }
                            } else {
                                for (var24 = (class4) this.field3262.method3024(5572); var24 != null && var24.field9628 != var21; var24 = (class4) this.field3262.method3026(arg0 + 90)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3275 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3275.field462 = new class61(var18 + this.field3275.field461 + var25);
                            this.field3275.field462.method693((byte) 106, var19);
                            this.field3275.field462.method715(var18, 1949991176);
                            this.field3274.field1393 = 0;
                            this.field3275.field457 = 8;
                        } else if (this.field3275.field457 != 0) {
                            throw new IOException();
                        } else if (this.field3274.field1397[0] == -1) {
                            this.field3274.field1393 = 0;
                            this.field3275.field457 = 1;
                        } else {
                            this.field3275 = null;
                        }
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3269.method3375(-1);
            } catch (Exception var26) {
            }
            this.field3273++;
            this.field3269 = null;
            this.field3271 = -2;
            return this.method1483(arg0 + 17670) == 0 && this.method1486(91) == 0;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BBIZI)Lft;")
    public final class4 method1479(byte arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field3259++;
        long var6 = (long) ((arg4 << 16) + arg2);
        class4 var8 = new class4();
        var8.field461 = arg0;
        var8.field9180 = arg3;
        if (arg1 != -16) {
            return null;
        }
        var8.field9628 = var6;
        if (arg3) {
            if (this.method1483(17580) >= 20) {
                throw new RuntimeException();
            }
            this.field3243.method3023((byte) 41, var8);
        } else if (this.method1486(-105) < 20) {
            this.field3265.method3023((byte) 93, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public final void method1480(boolean arg0) {
        field3260++;
        if (this.field3269 != null) {
            this.field3269.method3374(false);
        }
        if (arg0) {
            this.field3262 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method1481(int arg0) {
        if (this.field3269 != null) {
            this.field3269.method3375(-1);
        }
        if (arg0 != -1) {
            this.method1491((byte) 122);
        }
        field3244++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILqt;)V")
    public final void method1482(boolean arg0, int arg1, class591 arg2) {
        field3256++;
        if (this.field3269 != null) {
            try {
                this.field3269.method3375(-1);
            } catch (Exception var8) {
            }
            this.field3269 = null;
        }
        this.field3269 = arg2;
        if (arg1 < 67) {
            return;
        }
        this.method1491((byte) 96);
        this.method1492((byte) 63, arg0);
        this.field3275 = null;
        this.field3274.field1393 = 0;
        while (true) {
            class4 var4 = (class4) this.field3262.method3027(0);
            if (var4 == null) {
                while (true) {
                    class4 var5 = (class4) this.field3266.method3027(0);
                    if (var5 == null) {
                        if (this.field3272 != 0) {
                            try {
                                this.field3270.field1393 = 0;
                                this.field3270.method693((byte) 106, 4);
                                this.field3270.method693((byte) 106, this.field3272);
                                this.field3270.method745(0, 128);
                                this.field3269.method3373(4, this.field3270.field1397, 0, (byte) -71);
                            } catch (IOException var7) {
                                try {
                                    this.field3269.method3375(-1);
                                } catch (Exception var6) {
                                }
                                this.field3271 = -2;
                                this.field3269 = null;
                                this.field3273++;
                            }
                        }
                        this.field3268 = 0;
                        this.field3267 = class525.method3074((byte) -101);
                        return;
                    }
                    this.field3265.method3023((byte) 55, var5);
                }
            }
            this.field3243.method3023((byte) 41, var4);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
    public final int method1483(int arg0) {
        if (arg0 != 17580) {
            method1490(-95, -53, 70, true, 107, 21, null);
        }
        field3250++;
        return this.field3243.method3025(arg0 ^ 0x44AC) + this.field3262.method3025(0);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
    public final boolean method1484(int arg0) {
        field3255++;
        int var2 = 87 / ((-arg0 - 16) / 54);
        return this.method1483(17580) >= 20;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)Z")
    public final boolean method1485(int arg0) {
        if (arg0 != 20) {
            this.method1492((byte) -76, true);
        }
        field3249++;
        return this.method1486(-118) >= 20;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I")
    private final int method1486(int arg0) {
        field3264++;
        int var2 = 26 / ((-arg0 - 36) / 35);
        return this.field3265.method3025(0) + this.field3266.method3025(0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIIB)Lom;")
    public static final class344 method1487(boolean arg0, int arg1, int arg2, byte arg3) {
        field3245++;
        class610 var4 = null;
        if (class13.field721 != null) {
            var4 = new class610(arg1, class13.field721, class19.field834[arg1], 1000000);
        }
        class486.field6948[arg1] = class304.field4511.method3928(arg1, var4, true, class694.field9782);
        if (arg3 != -75) {
            field3263 = null;
        }
        class486.field6948[arg1].method949((byte) -42);
        return new class344(class486.field6948[arg1], arg0, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public final void method1488(byte arg0) {
        field3247++;
        if (arg0 > -86) {
            this.method1483(-71);
        }
        if (this.field3269 == null) {
            return;
        }
        try {
            this.field3270.field1393 = 0;
            this.field3270.method693((byte) 106, 7);
            this.field3270.method691((byte) 71, 0);
            this.field3269.method3373(4, this.field3270.field1397, 0, (byte) -71);
        } catch (IOException var3) {
            try {
                this.field3269.method3375(-1);
            } catch (Exception var2) {
            }
            this.field3273++;
            this.field3269 = null;
            this.field3271 = -2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1489(int arg0, boolean arg1) {
        field3258++;
        boolean var2 = class623.field9017.method162();
        int var3 = -8 % ((74 - arg0) / 35);
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class623.field9017.method174();
        } else if (!class623.field9017.method181()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class527.field7429.field2652 = arg1;
            class527.field7429.method2809(class604.field8775, (byte) -24);
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZIILom;)V")
    public static final void method1490(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class344 arg6) {
        class540.field7540 = arg5;
        class71.field1489 = arg1;
        field3261++;
        class486.field6961 = arg4;
        if (arg0 == -12709) {
            class577.field8380 = 1;
            class47.field1136 = arg6;
            class585.field8450 = arg2;
            class339.field5051 = arg3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
    private final void method1491(byte arg0) {
        if (arg0 <= 30) {
            return;
        }
        field3246++;
        if (this.field3269 == null) {
            return;
        }
        try {
            this.field3270.field1393 = 0;
            this.field3270.method693((byte) 106, 6);
            this.field3270.method691((byte) 122, 3);
            this.field3269.method3373(4, this.field3270.field1397, 0, (byte) -71);
        } catch (IOException var3) {
            try {
                this.field3269.method3375(-1);
            } catch (Exception var2) {
            }
            this.field3273++;
            this.field3269 = null;
            this.field3271 = -2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
    public final void method1492(byte arg0, boolean arg1) {
        field3257++;
        if (this.field3269 == null || arg0 != 63) {
            return;
        }
        try {
            this.field3270.field1393 = 0;
            this.field3270.method693((byte) 106, arg1 ? 2 : 3);
            this.field3270.method691((byte) -76, 0);
            this.field3269.method3373(4, this.field3270.field1397, 0, (byte) -71);
        } catch (IOException var4) {
            try {
                this.field3269.method3375(-1);
            } catch (Exception var3) {
            }
            this.field3271 = -2;
            this.field3269 = null;
            this.field3273++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public final void method1493(byte arg0) {
        try {
            this.field3269.method3375(-1);
        } catch (Exception var2) {
        }
        field3253++;
        this.field3271 = -1;
        this.field3272 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3273++;
        this.field3269 = null;
        if (arg0 != 107) {
            this.field3267 = -28L;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(B)V")
    public static void method1494(byte arg0) {
        field3263 = null;
        field3252 = null;
        int var1 = 102 / ((-arg0 - 27) / 49);
    }
}
