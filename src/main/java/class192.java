import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class192 {

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Lm;")
    private class48 field3039 = new class48();

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "Lm;")
    private class48 field3043 = new class48();

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "Lm;")
    private class48 field3044 = new class48();

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Lm;")
    private class48 field3045 = new class48();

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "Lhi;")
    private class291 field3046 = new class291(4);

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "B")
    private byte field3052 = 0;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public volatile int field3051 = 0;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public volatile int field3050 = 0;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "Lhi;")
    private class291 field3053 = new class291(8);

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "Lwm;")
    public static class152 field3022 = class157.method1048("D-Bmarrage de la librairie 3D", 125);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field3021 = -1;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "[I")
    public static int[] field3040 = new int[50];

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "[B")
    public static byte[] field3023 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "J")
    private long field3048;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "Lqe;")
    private class186 field3047;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Lpg;")
    private class201 field3054;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method1269(byte arg0) {
        field3030++;
        if (arg0 > -66) {
            this.field3039 = (class48) null;
        }
        return this.method1270(0) >= 20;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I", line = 17)
    public final int method1270(int arg0) {
        field3035++;
        if (arg0 != 0) {
            this.method1283((byte) -123);
        }
        return this.field3039.method337((byte) -83) + this.field3043.method337((byte) -128);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z", line = 35)
    public final boolean method1271(byte arg0) {
        field3029++;
        if (this.field3047 != null) {
            long var2 = class76.method507(-30994);
            int var4 = (int) (var2 - this.field3048);
            this.field3048 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3049 += var4;
            if (this.field3049 > 30000) {
                try {
                    this.field3047.method1239((byte) -78);
                } catch (Exception var30) {
                }
                this.field3047 = null;
            }
        }
        if (this.field3047 == null) {
            return this.method1270(0) == 0 && this.method1277((byte) -66) == 0;
        }
        try {
            this.field3047.method1242(1);
            for (class201 var6 = (class201) this.field3039.method333((byte) 95); var6 != null; var6 = (class201) this.field3039.method329(-13985)) {
                this.field3046.field4946 = 0;
                this.field3046.method1980(false, 1);
                this.field3046.method1964(arg0 ^ 0xFFFFFFCF, (int) var6.field916);
                this.field3047.method1237(true, 0, 4, this.field3046.field4950);
                this.field3043.method334((byte) 111, var6);
            }
            if (arg0 != -49) {
                method1280(21, -73, 124, -44, false);
            }
            for (class201 var7 = (class201) this.field3044.method333((byte) 125); var7 != null; var7 = (class201) this.field3044.method329(-13985)) {
                this.field3046.field4946 = 0;
                this.field3046.method1980(false, 0);
                this.field3046.method1964(0, (int) var7.field916);
                this.field3047.method1237(true, 0, 4, this.field3046.field4950);
                this.field3045.method334((byte) 100, var7);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3047.method1238(1);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3049 = 0;
                byte var10 = 0;
                if (this.field3054 == null) {
                    var10 = 8;
                } else if (this.field3054.field3254 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field3053.field4946;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field3047.method1240(this.field3053.field4950, this.field3053.field4946, var11, 119);
                    if (this.field3052 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3053.field4950[this.field3053.field4946 + var12] = (byte) class223.method1543(this.field3053.field4950[this.field3053.field4946 + var12], this.field3052);
                        }
                    }
                    this.field3053.field4946 += var11;
                    if (this.field3053.field4946 >= var10) {
                        if (this.field3054 == null) {
                            this.field3053.field4946 = 0;
                            int var13 = this.field3053.method2011(arg0 - 79);
                            int var14 = this.field3053.method2021((byte) 74);
                            int var15 = this.field3053.method2011(-26);
                            int var16 = this.field3053.method1969((byte) -16);
                            boolean var17 = (var15 & 0x80) != 0;
                            int var18 = var15 & 0x7F;
                            Object var19 = null;
                            long var20 = (long) ((var13 << 16) + var14);
                            class201 var22;
                            if (var17) {
                                for (var22 = (class201) this.field3045.method333((byte) 116); var22 != null && var22.field916 != var20; var22 = (class201) this.field3045.method329(-13985)) {
                                }
                            } else {
                                for (var22 = (class201) this.field3043.method333((byte) 126); var22 != null && var22.field916 != var20; var22 = (class201) this.field3043.method329(-13985)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            int var23 = var18 == 0 ? 5 : 9;
                            this.field3054 = var22;
                            this.field3054.field3251 = new class291(var16 + var23 + this.field3054.field3248);
                            this.field3054.field3251.method1980(false, var18);
                            this.field3054.field3251.method1967(var16, -1303690792);
                            this.field3054.field3254 = 8;
                            this.field3053.field4946 = 0;
                        } else if (this.field3054.field3254 != 0) {
                            throw new IOException();
                        } else if (this.field3053.field4950[0] == -1) {
                            this.field3053.field4946 = 0;
                            this.field3054.field3254 = 1;
                        } else {
                            this.field3054 = null;
                        }
                    }
                } else {
                    int var24 = this.field3054.field3251.field4950.length - this.field3054.field3248;
                    int var25 = 512 - this.field3054.field3254;
                    if (var25 > (var24 - this.field3054.field3251.field4946)) {
                        var25 = var24 - this.field3054.field3251.field4946;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field3047.method1240(this.field3054.field3251.field4950, this.field3054.field3251.field4946, var25, arg0 - 61);
                    if (this.field3052 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field3054.field3251.field4950[this.field3054.field3251.field4946 + var26] = (byte) class223.method1543(this.field3054.field3251.field4950[this.field3054.field3251.field4946 + var26], this.field3052);
                        }
                    }
                    this.field3054.field3251.field4946 += var25;
                    this.field3054.field3254 += var25;
                    if (this.field3054.field3251.field4946 == var24) {
                        this.field3054.method402(arg0 ^ 0xFFFFFFCF);
                        this.field3054.field4823 = false;
                        this.field3054 = null;
                    } else if (this.field3054.field3254 == 512) {
                        this.field3054.field3254 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3047.method1239((byte) -68);
            } catch (Exception var29) {
            }
            this.field3051++;
            this.field3050 = -2;
            this.field3047 = null;
            return this.method1270(0) == 0 && this.method1277((byte) -64) == 0;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BZ)V", line = 312)
    public final void method1272(byte arg0, boolean arg1) {
        field3026++;
        if (this.field3047 == null || arg0 != -33) {
            return;
        }
        try {
            this.field3046.field4946 = 0;
            this.field3046.method1980(false, arg1 ? 2 : 3);
            this.field3046.method1964(0, 0);
            this.field3047.method1237(true, 0, 4, this.field3046.field4950);
        } catch (IOException var6) {
            try {
                this.field3047.method1239((byte) -99);
            } catch (Exception var5) {
            }
            this.field3051++;
            this.field3050 = -2;
            this.field3047 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIII)I", line = 340)
    public static final int method1273(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg3;
            arg3 = var7;
        }
        int var8 = arg2 & 0x3;
        field3041++;
        if (arg5 != -16795) {
            method1275((byte) -46, 59);
        }
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg0;
        } else {
            return 1 - (arg3 + arg4 - 7);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 373)
    public static void method1274(int arg0) {
        if (arg0 == 19859) {
            field3040 = null;
            field3022 = null;
            field3023 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)V", line = 387)
    public static final void method1275(byte arg0, int arg1) {
        field3024++;
        class284.field4831.method1617(arg1, 50);
        if (arg0 < 10) {
            field3021 = -120;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)Ll;", line = 400)
    public static final class295 method1276(int arg0, byte arg1) {
        if (arg1 != 8) {
            method1273(12, 118, 120, -125, -39, -55, 69);
        }
        field3032++;
        return class205.field3340 && arg0 >= class313.field5415 && arg0 <= class113.field1601 ? class116.field1629[arg0 - class313.field5415] : null;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)I", line = 429)
    private final int method1277(byte arg0) {
        if (arg0 >= -2) {
            this.method1286(7);
        }
        field3042++;
        return this.field3044.method337((byte) -85) + this.field3045.method337((byte) -128);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZBIIB)Lpg;", line = 442)
    public final class201 method1278(boolean arg0, byte arg1, int arg2, int arg3, byte arg4) {
        field3037++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class201 var8 = new class201();
        var8.field4825 = arg0;
        var8.field916 = var6;
        var8.field3248 = arg1;
        if (arg4 != 99) {
            this.field3054 = (class201) null;
        }
        if (arg0) {
            if (this.method1270(0) >= 20) {
                throw new RuntimeException();
            }
            this.field3039.method334((byte) 125, var8);
        } else if (this.method1277((byte) -11) < 20) {
            this.field3044.method334((byte) 81, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 485)
    public final void method1279(int arg0) {
        if (this.field3047 != null) {
            this.field3047.method1239((byte) -121);
        }
        if (arg0 != 1) {
            this.method1271((byte) 14);
        }
        field3028++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZ)V", line = 499)
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3031++;
        class303 var5 = class90.method589(arg4, arg3, 8);
        var5.method2117((byte) 69);
        var5.field5223 = arg1;
        var5.field5219 = arg2;
        var5.field5208 = arg0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLqe;Z)V", line = 518)
    public final void method1281(byte arg0, class186 arg1, boolean arg2) {
        if (this.field3047 != null) {
            try {
                this.field3047.method1239((byte) -77);
            } catch (Exception var11) {
            }
            this.field3047 = null;
        }
        this.field3047 = arg1;
        field3036++;
        this.method1285(8252);
        this.method1272((byte) -33, arg2);
        this.field3054 = null;
        this.field3053.field4946 = 0;
        while (true) {
            class201 var5 = (class201) this.field3043.method335(66);
            if (var5 == null) {
                if (arg0 <= 68) {
                    method1273(-115, -3, 111, -111, -116, -101, -67);
                }
                while (true) {
                    class201 var6 = (class201) this.field3045.method335(-66);
                    if (var6 == null) {
                        if (this.field3052 != 0) {
                            try {
                                this.field3046.field4946 = 0;
                                this.field3046.method1980(false, 4);
                                this.field3046.method1980(false, this.field3052);
                                this.field3046.method1994(0, 2921);
                                this.field3047.method1237(true, 0, 4, this.field3046.field4950);
                            } catch (IOException var10) {
                                try {
                                    this.field3047.method1239((byte) -102);
                                } catch (Exception var9) {
                                }
                                this.field3051++;
                                this.field3050 = -2;
                                this.field3047 = null;
                            }
                        }
                        this.field3049 = 0;
                        this.field3048 = class76.method507(-30994);
                        return;
                    }
                    this.field3044.method334((byte) 116, var6);
                }
            }
            this.field3039.method334((byte) 106, var5);
        }
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)V", line = 594)
    public final void method1282(byte arg0) {
        field3025++;
        if (this.field3047 == null) {
            return;
        }
        try {
            this.field3046.field4946 = 0;
            int var2 = -47 / ((-arg0 - 34) / 61);
            this.field3046.method1980(false, 7);
            this.field3046.method1964(0, 0);
            this.field3047.method1237(true, 0, 4, this.field3046.field4950);
        } catch (IOException var6) {
            try {
                this.field3047.method1239((byte) -96);
            } catch (Exception var5) {
            }
            this.field3051++;
            this.field3047 = null;
            this.field3050 = -2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(B)V", line = 620)
    public final void method1283(byte arg0) {
        if (this.field3047 != null) {
            this.field3047.method1241(111);
        }
        if (arg0 < 10) {
            this.field3043 = (class48) null;
        }
        field3038++;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)V", line = 633)
    public final void method1284(int arg0) {
        field3027++;
        try {
            this.field3047.method1239((byte) -69);
        } catch (Exception var3) {
        }
        this.field3050 = -1;
        this.field3047 = null;
        this.field3051++;
        this.field3052 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V", line = 658)
    private final void method1285(int arg0) {
        if (arg0 != 8252) {
            method1275((byte) -42, 92);
        }
        field3033++;
        if (this.field3047 == null) {
            return;
        }
        try {
            this.field3046.field4946 = 0;
            this.field3046.method1980(false, 6);
            this.field3046.method1964(0, 3);
            this.field3047.method1237(true, 0, 4, this.field3046.field4950);
        } catch (IOException var5) {
            try {
                this.field3047.method1239((byte) -61);
            } catch (Exception var4) {
            }
            this.field3047 = null;
            this.field3050 = -2;
            this.field3051++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)Z", line = 686)
    public final boolean method1286(int arg0) {
        if (arg0 < 28) {
            this.field3039 = (class48) null;
        }
        field3034++;
        return this.method1277((byte) -98) >= 20;
    }
}
