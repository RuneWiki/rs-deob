import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class43 {

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lwf;")
    private class88 field659 = new class88();

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lwf;")
    private class88 field663 = new class88();

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lwf;")
    private class88 field664 = new class88();

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Lwf;")
    private class88 field665 = new class88();

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Ldh;")
    private class209 field667 = new class209(4);

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "B")
    private byte field672 = 0;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public volatile int field675 = 0;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public volatile int field674 = 0;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Ldh;")
    private class209 field673 = new class209(8);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
    public static int[] field653 = new int[32];

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "Llt;")
    public static class475 field666;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Lng;")
    public static class226 field670;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "F")
    public static float field677;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "J")
    private long field669;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "Ltf;")
    private class192 field679;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lac;")
    private class376 field668;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "[I")
    public static int[] field678;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBIZ)V")
    public static final void method262(int arg0, byte arg1, int arg2, boolean arg3) {
        field645++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class378.field5761 = arg2;
        class323.field4619 = arg3;
        int var4 = 82 % ((-arg1 - 9) / 47);
        class366.field5600 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[Lvg;Z)V")
    public static final void method263(int arg0, int arg1, int arg2, int arg3, class38[] arg4, boolean arg5) {
        if (arg3 != -1) {
            method263(-40, -87, 29, 76, null, false);
        }
        field658++;
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class38 var7 = arg4[var6];
            if (var7 != null && var7.field480 == arg1) {
                class87.method508(arg0, arg5, var7, arg2, 0);
                class461.method2781(var7, arg2, arg0, arg3 - 8211);
                if (var7.field546 - var7.field553 < var7.field505) {
                    var7.field505 = var7.field546 - var7.field553;
                }
                if ((var7.field475 - var7.field472) < var7.field415) {
                    var7.field415 = var7.field475 - var7.field472;
                }
                if (var7.field505 < 0) {
                    var7.field505 = 0;
                }
                if (var7.field415 < 0) {
                    var7.field415 = 0;
                }
                if (var7.field492 == 0) {
                    class478.method2850(var7, arg5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method264(int arg0) {
        if (arg0 == 4) {
            field670 = null;
            field678 = null;
            field666 = null;
            field653 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)I")
    private final int method265(int arg0) {
        if (arg0 != -23649) {
            field666 = null;
        }
        field660++;
        return this.field664.method515(0) + this.field665.method515(0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public final void method266(byte arg0) {
        try {
            this.field668.method2312(false);
        } catch (Exception var2) {
        }
        if (arg0 >= -105) {
            return;
        }
        field646++;
        this.field675++;
        this.field674 = -1;
        this.field672 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field668 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field647++;
        if (arg9 < 128 || arg7 < 128 || class30.field323 * 128 - 256 < arg9 || (class182.field2661 * 128 - 256) < arg7) {
            class158.field2321[0] = class158.field2321[1] = -1;
            return;
        }
        int var10 = class377.method2316(arg7, false, arg9, arg8) - arg5;
        class301.field4266.method901(arg4, arg3, 0);
        class348.field5015.method1082(class301.field4266);
        class348.field5015.method1074(arg9, var10, arg7, class158.field2321);
        class301.field4266.method901(-arg4, 0, 0);
        class348.field5015.method1082(class301.field4266);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z")
    public final boolean method268(int arg0) {
        if (arg0 == 4) {
            field655++;
            return this.method270((byte) -118) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)V")
    public final void method269(byte arg0, boolean arg1) {
        field652++;
        if (this.field668 == null) {
            return;
        }
        if (arg0 < 47) {
            method264(-37);
        }
        try {
            this.field667.field3037 = 0;
            this.field667.method1410(arg1 ? 2 : 3, -27645);
            this.field667.method1461(65280, 0);
            this.field668.method2311(4, this.field667.field3036, 4900, 0);
        } catch (IOException var4) {
            try {
                this.field668.method2312(false);
            } catch (Exception var3) {
            }
            this.field674 = -2;
            this.field668 = null;
            this.field675++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
    public final int method270(byte arg0) {
        field649++;
        if (arg0 >= -12) {
            this.method275((byte) 73);
        }
        return this.field659.method515(0) + this.field663.method515(0);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public final void method271(int arg0) {
        field661++;
        if (arg0 != 23336) {
            this.field672 = 90;
        }
        if (this.field668 != null) {
            this.field668.method2307((byte) -120);
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Z")
    public final boolean method272(int arg0) {
        field654++;
        if (this.field668 != null) {
            long var2 = class256.method1708((byte) 118);
            int var4 = (int) (var2 - this.field669);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field669 = var2;
            this.field671 += var4;
            if (this.field671 > 30000) {
                try {
                    this.field668.method2312(false);
                } catch (Exception var27) {
                }
                this.field668 = null;
            }
        }
        if (this.field668 == null) {
            return this.method270((byte) -124) == 0 && this.method265(-23649) == 0;
        }
        try {
            this.field668.method2309(24);
            for (class192 var5 = (class192) this.field659.method514((byte) 104); var5 != null; var5 = (class192) this.field659.method517((byte) -119)) {
                this.field667.field3037 = 0;
                this.field667.method1410(1, -27645);
                this.field667.method1461(65280, (int) var5.field3936);
                this.field668.method2311(4, this.field667.field3036, 4900, 0);
                this.field663.method518(0, var5);
            }
            if (arg0 != -1) {
                return false;
            }
            for (class192 var6 = (class192) this.field664.method514((byte) 116); var6 != null; var6 = (class192) this.field664.method517((byte) -119)) {
                this.field667.field3037 = 0;
                this.field667.method1410(0, -27645);
                this.field667.method1461(65280, (int) var6.field3936);
                this.field668.method2311(4, this.field667.field3036, 4900, 0);
                this.field665.method518(arg0 + 1, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field668.method2310(126);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field671 = 0;
                byte var9 = 0;
                if (this.field679 == null) {
                    var9 = 8;
                } else if (this.field679.field2817 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field679.field2812.field3036.length - this.field679.field2816;
                    int var11 = 512 - this.field679.field2817;
                    if (var11 > var10 - this.field679.field2812.field3037) {
                        var11 = var10 - this.field679.field2812.field3037;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field668.method2308(this.field679.field2812.field3036, this.field679.field2812.field3037, var11, 126);
                    if (this.field672 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field679.field2812.field3036[this.field679.field2812.field3037 + var12] = (byte) class315.method1970(this.field679.field2812.field3036[this.field679.field2812.field3037 + var12], this.field672);
                        }
                    }
                    this.field679.field2817 += var11;
                    this.field679.field2812.field3037 += var11;
                    if (this.field679.field2812.field3037 == var10) {
                        this.field679.method1783((byte) -89);
                        this.field679.field7045 = false;
                        this.field679 = null;
                    } else if (this.field679.field2817 == 512) {
                        this.field679.field2817 = 0;
                    }
                } else {
                    int var13 = var9 - this.field673.field3037;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field668.method2308(this.field673.field3036, this.field673.field3037, var13, 126);
                    if (this.field672 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field673.field3036[this.field673.field3037 + var14] = (byte) class315.method1970(this.field673.field3036[this.field673.field3037 + var14], this.field672);
                        }
                    }
                    this.field673.field3037 += var13;
                    if (this.field673.field3037 >= var9) {
                        if (this.field679 == null) {
                            this.field673.field3037 = 0;
                            int var15 = this.field673.method1428(32122);
                            int var16 = this.field673.method1450((byte) 63);
                            int var17 = this.field673.method1428(arg0 + 32123);
                            int var18 = this.field673.method1452(65280);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class192 var24;
                            if (var20) {
                                for (var24 = (class192) this.field665.method514((byte) 113); var24 != null && var24.field3936 != var21; var24 = (class192) this.field665.method517((byte) -119)) {
                                }
                            } else {
                                for (var24 = (class192) this.field663.method514((byte) 116); var24 != null && var24.field3936 != var21; var24 = (class192) this.field663.method517((byte) -119)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field679 = var24;
                            this.field679.field2812 = new class209(var18 + var25 + this.field679.field2816);
                            this.field679.field2812.method1410(var19, -27645);
                            this.field679.field2812.method1415(var18, (byte) -77);
                            this.field679.field2817 = 8;
                            this.field673.field3037 = 0;
                        } else if (this.field679.field2817 != 0) {
                            throw new IOException();
                        } else if (this.field673.field3036[0] == -1) {
                            this.field679.field2817 = 1;
                            this.field673.field3037 = 0;
                        } else {
                            this.field679 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field668.method2312(false);
            } catch (Exception var26) {
            }
            this.field675++;
            this.field674 = -2;
            this.field668 = null;
            return this.method270((byte) -48) == 0 && this.method265(-23649) == 0;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method273(String arg0, int arg1) {
        field643++;
        int var2 = arg0.length();
        int var3 = -114 / ((-arg1 - 36) / 46);
        long var4 = 0L;
        for (int var6 = 0; var6 < var2; var6++) {
            var4 = (var4 << 5) + (long) arg0.charAt(var6) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
    private final void method274(byte arg0) {
        field657++;
        if (arg0 != 12) {
            this.field667 = null;
        }
        if (this.field668 == null) {
            return;
        }
        try {
            this.field667.field3037 = 0;
            this.field667.method1410(6, -27645);
            this.field667.method1461(arg0 ^ 0xFF0C, 3);
            this.field668.method2311(4, this.field667.field3036, arg0 ^ 0x1328, 0);
        } catch (IOException var3) {
            try {
                this.field668.method2312(false);
            } catch (Exception var2) {
            }
            this.field668 = null;
            this.field675++;
            this.field674 = -2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
    public final void method275(byte arg0) {
        if (this.field668 != null) {
            this.field668.method2312(false);
        }
        field662++;
        if (arg0 < 61) {
            method264(-96);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZIII)Ltf;")
    public final class192 method276(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field656++;
        long var6 = (long) ((arg3 << 16) + arg4);
        class192 var8 = new class192();
        var8.field2816 = arg0;
        var8.field3936 = var6;
        if (arg2 > -6) {
            return null;
        }
        var8.field7047 = arg1;
        if (arg1) {
            if (this.method270((byte) -45) >= 20) {
                throw new RuntimeException();
            }
            this.field659.method518(0, var8);
        } else if (this.method265(-23649) < 20) {
            this.field664.method518(0, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLac;Z)V")
    public final void method277(byte arg0, class376 arg1, boolean arg2) {
        if (this.field668 != null) {
            try {
                this.field668.method2312(false);
            } catch (Exception var8) {
            }
            this.field668 = null;
        }
        field648++;
        this.field668 = arg1;
        this.method274((byte) 12);
        this.method269((byte) 49, arg2);
        if (arg0 != 3) {
            this.field669 = -128L;
        }
        this.field673.field3037 = 0;
        this.field679 = null;
        while (true) {
            class192 var4 = (class192) this.field663.method511(91);
            if (var4 == null) {
                while (true) {
                    class192 var5 = (class192) this.field665.method511(77);
                    if (var5 == null) {
                        if (this.field672 != 0) {
                            try {
                                this.field667.field3037 = 0;
                                this.field667.method1410(4, -27645);
                                this.field667.method1410(this.field672, -27645);
                                this.field667.method1413(arg0 - 131, 0);
                                this.field668.method2311(4, this.field667.field3036, 4900, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field668.method2312(false);
                                } catch (Exception var6) {
                                }
                                this.field674 = -2;
                                this.field675++;
                                this.field668 = null;
                            }
                        }
                        this.field671 = 0;
                        this.field669 = class256.method1708((byte) 118);
                        return;
                    }
                    this.field664.method518(0, var5);
                }
            }
            this.field659.method518(0, var4);
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public final void method278(int arg0) {
        field651++;
        if (this.field668 == null) {
            return;
        }
        try {
            this.field667.field3037 = 0;
            this.field667.method1410(7, -27645);
            this.field667.method1461(65280, 0);
            this.field668.method2311(4, this.field667.field3036, 4900, arg0);
        } catch (IOException var3) {
            try {
                this.field668.method2312(false);
            } catch (Exception var2) {
            }
            this.field668 = null;
            this.field675++;
            this.field674 = -2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)Z")
    public final boolean method279(byte arg0) {
        field642++;
        if (arg0 <= 121) {
            field670 = null;
        }
        return this.method265(-23649) >= 20;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(B)V")
    public static final void method280(byte arg0) {
        if (arg0 > -25) {
            method267(-58, -83, -58, 91, -64, 85, 2, 25, 9, -36);
        }
        class333.field4700 = new class297[50];
        class299.field4256 = 0;
        field644++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field653[var1] = var0 - 1;
            var0 += var0;
        }
        field666 = new class475("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");
        field670 = new class226(8);
    }
}
