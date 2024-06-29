import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class476 {

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Lpo;")
    private class375 field7257 = new class375();

    @OriginalMember(owner = "client!no", name = "s", descriptor = "Lpo;")
    private class375 field7273 = new class375();

    @OriginalMember(owner = "client!no", name = "u", descriptor = "Lpo;")
    private class375 field7275 = new class375();

    @OriginalMember(owner = "client!no", name = "v", descriptor = "Lpo;")
    private class375 field7276 = new class375();

    @OriginalMember(owner = "client!no", name = "y", descriptor = "Lha;")
    private class40 field7279 = new class40(4);

    @OriginalMember(owner = "client!no", name = "A", descriptor = "I")
    public volatile int field7281 = 0;

    @OriginalMember(owner = "client!no", name = "B", descriptor = "B")
    private byte field7282 = 0;

    @OriginalMember(owner = "client!no", name = "D", descriptor = "I")
    public volatile int field7284 = 0;

    @OriginalMember(owner = "client!no", name = "C", descriptor = "Lha;")
    private class40 field7283 = new class40(8);

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field7258 = -2;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "Loe;")
    public static class127 field7267 = new class127(97, -1);

    @OriginalMember(owner = "client!no", name = "t", descriptor = "F")
    public static float field7274;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "I")
    private int field7277;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "J")
    private long field7278;

    @OriginalMember(owner = "client!no", name = "E", descriptor = "Lae;")
    private class157 field7285;

    @OriginalMember(owner = "client!no", name = "z", descriptor = "Lbn;")
    private class295 field7280;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)Z")
    public final boolean method2859(byte arg0) {
        field7264++;
        if (this.field7280 != null) {
            long var2 = class344.method2111((byte) -116);
            int var4 = (int) (var2 - this.field7278);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field7278 = var2;
            this.field7277 += var4;
            if (this.field7277 > 30000) {
                try {
                    this.field7280.method1795((byte) 127);
                } catch (Exception var27) {
                }
                this.field7280 = null;
            }
        }
        if (this.field7280 == null) {
            return this.method2860((byte) -36) == 0 && this.method2862((byte) -115) == 0;
        }
        try {
            this.field7280.method1794((byte) -28);
            if (arg0 != -33) {
                return false;
            }
            for (class157 var5 = (class157) this.field7257.method2260((byte) 122); var5 != null; var5 = (class157) this.field7257.method2258(0)) {
                this.field7279.field585 = 0;
                this.field7279.method221(arg0 + 32, 1);
                this.field7279.method227((int) var5.field3839, -165148208);
                this.field7280.method1787(this.field7279.field536, 0, 4900, 4);
                this.field7273.method2256(var5, 30978);
            }
            for (class157 var6 = (class157) this.field7275.method2260((byte) 44); var6 != null; var6 = (class157) this.field7275.method2258(arg0 + 33)) {
                this.field7279.field585 = 0;
                this.field7279.method221(-1, 0);
                this.field7279.method227((int) var6.field3839, -165148208);
                this.field7280.method1787(this.field7279.field536, 0, 4900, 4);
                this.field7276.method2256(var6, arg0 ^ 0xFFFF86DD);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field7280.method1789(27683);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field7277 = 0;
                byte var9 = 0;
                if (this.field7285 == null) {
                    var9 = 8;
                } else if (this.field7285.field2477 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field7285.field2467.field536.length - this.field7285.field2478;
                    int var11 = 512 - this.field7285.field2477;
                    if ((var10 - this.field7285.field2467.field585) < var11) {
                        var11 = var10 - this.field7285.field2467.field585;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field7280.method1788(-13205, this.field7285.field2467.field585, this.field7285.field2467.field536, var11);
                    if (this.field7282 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field7285.field2467.field536[this.field7285.field2467.field585 + var12] = (byte) class103.method764(this.field7285.field2467.field536[this.field7285.field2467.field585 + var12], this.field7282);
                        }
                    }
                    this.field7285.field2477 += var11;
                    this.field7285.field2467.field585 += var11;
                    if (this.field7285.field2467.field585 == var10) {
                        this.field7285.method1512((byte) 125);
                        this.field7285.field3923 = false;
                        this.field7285 = null;
                    } else if (this.field7285.field2477 == 512) {
                        this.field7285.field2477 = 0;
                    }
                } else {
                    int var13 = var9 - this.field7283.field585;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field7280.method1788(arg0 ^ 0x33B4, this.field7283.field585, this.field7283.field536, var13);
                    if (this.field7282 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field7283.field536[this.field7283.field585 + var14] = (byte) class103.method764(this.field7283.field536[this.field7283.field585 + var14], this.field7282);
                        }
                    }
                    this.field7283.field585 += var13;
                    if (this.field7283.field585 >= var9) {
                        if (this.field7285 == null) {
                            this.field7283.field585 = 0;
                            int var15 = this.field7283.method257((byte) 65);
                            int var16 = this.field7283.method254((byte) -37);
                            int var17 = this.field7283.method257((byte) 81);
                            int var18 = this.field7283.method255((byte) 96);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class157 var24;
                            if (var20) {
                                for (var24 = (class157) this.field7276.method2260((byte) 116); var24 != null && var24.field3839 != var21; var24 = (class157) this.field7276.method2258(arg0 + 33)) {
                                }
                            } else {
                                for (var24 = (class157) this.field7273.method2260((byte) 79); var24 != null && var24.field3839 != var21; var24 = (class157) this.field7273.method2258(arg0 ^ 0xFFFFFFDF)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field7285 = var24;
                            this.field7285.field2467 = new class40(var18 + var25 + this.field7285.field2478);
                            this.field7285.field2467.method221(-1, var19);
                            this.field7285.field2467.method253(-99, var18);
                            this.field7283.field585 = 0;
                            this.field7285.field2477 = 8;
                        } else if (this.field7285.field2477 != 0) {
                            throw new IOException();
                        } else if (this.field7283.field536[0] == -1) {
                            this.field7283.field585 = 0;
                            this.field7285.field2477 = 1;
                        } else {
                            this.field7285 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field7280.method1795((byte) 126);
            } catch (Exception var26) {
            }
            this.field7280 = null;
            this.field7281++;
            this.field7284 = -2;
            return this.method2860((byte) -77) == 0 && this.method2862((byte) -73) == 0;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)I")
    public final int method2860(byte arg0) {
        if (arg0 > -31) {
            return 6;
        } else {
            field7263++;
            return this.field7257.method2255((byte) -42) + this.field7273.method2255((byte) -42);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(BZBII)Lae;")
    public final class157 method2861(byte arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field7268++;
        long var6 = (long) ((arg3 << 16) + arg4);
        class157 var8 = new class157();
        var8.field3924 = arg1;
        var8.field3839 = var6;
        var8.field2478 = arg2;
        if (arg1) {
            if (this.method2860((byte) -89) >= 20) {
                throw new RuntimeException();
            }
            this.field7257.method2256(var8, 30978);
        } else if (this.method2862((byte) -44) < 20) {
            this.field7275.method2256(var8, 30978);
        } else {
            throw new RuntimeException();
        }
        if (arg0 > -17) {
            this.field7283 = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)I")
    private final int method2862(byte arg0) {
        if (arg0 >= -13) {
            this.field7282 = -94;
        }
        field7259++;
        return this.field7275.method2255((byte) -42) + this.field7276.method2255((byte) -42);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
    public static final void method2863(int arg0, int arg1, int arg2) {
        field7255++;
        class64 var3 = class230.method1387(arg0, (byte) 40, 14);
        var3.method441((byte) 58);
        if (arg2 == -3040) {
            var3.field1051 = arg1;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method2864(int arg0) {
        if (this.field7280 != null) {
            this.field7280.method1795((byte) 122);
        }
        if (arg0 > 116) {
            field7266++;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    private final void method2865(int arg0) {
        field7270++;
        if (this.field7280 == null) {
            return;
        }
        try {
            this.field7279.field585 = 0;
            this.field7279.method221(-1, 6);
            this.field7279.method227(3, -165148208);
            this.field7280.method1787(this.field7279.field536, 0, 4900, 4);
        } catch (IOException var3) {
            try {
                this.field7280.method1795((byte) 124);
            } catch (Exception var2) {
            }
            this.field7284 = -2;
            this.field7281++;
            this.field7280 = null;
        }
        if (arg0 != -22279) {
            this.method2861((byte) 77, true, (byte) -14, -49, 70);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2866(int arg0, byte arg1, int arg2) {
        field7260++;
        if (arg1 > -83) {
            field7258 = 73;
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
    public final void method2867(boolean arg0) {
        if (arg0) {
            this.method2859((byte) 59);
        }
        if (this.field7280 != null) {
            this.field7280.method1790((byte) 50);
        }
        field7271++;
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
    public final void method2868(int arg0) {
        field7269++;
        if (this.field7280 == null) {
            return;
        }
        try {
            this.field7279.field585 = 0;
            this.field7279.method221(-1, 7);
            int var2 = 36 / ((-arg0 - 52) / 39);
            this.field7279.method227(0, -165148208);
            this.field7280.method1787(this.field7279.field536, 0, 4900, 4);
        } catch (IOException var4) {
            try {
                this.field7280.method1795((byte) 122);
            } catch (Exception var3) {
            }
            this.field7281++;
            this.field7284 = -2;
            this.field7280 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lbn;ZZ)V")
    public final void method2869(class295 arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            this.field7285 = null;
        }
        field7261++;
        if (this.field7280 != null) {
            try {
                this.field7280.method1795((byte) 126);
            } catch (Exception var8) {
            }
            this.field7280 = null;
        }
        this.field7280 = arg0;
        this.method2865(-22279);
        this.method2871(21751, arg2);
        this.field7285 = null;
        this.field7283.field585 = 0;
        while (true) {
            class157 var4 = (class157) this.field7273.method2254((byte) 55);
            if (var4 == null) {
                while (true) {
                    class157 var5 = (class157) this.field7276.method2254((byte) 80);
                    if (var5 == null) {
                        if (this.field7282 != 0) {
                            try {
                                this.field7279.field585 = 0;
                                this.field7279.method221(-1, 4);
                                this.field7279.method221(-1, this.field7282);
                                this.field7279.method246((byte) -78, 0);
                                this.field7280.method1787(this.field7279.field536, 0, 4900, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field7280.method1795((byte) 124);
                                } catch (Exception var6) {
                                }
                                this.field7284 = -2;
                                this.field7280 = null;
                                this.field7281++;
                            }
                        }
                        this.field7277 = 0;
                        this.field7278 = class344.method2111((byte) -121);
                        return;
                    }
                    this.field7275.method2256(var5, 30978);
                }
            }
            this.field7257.method2256(var4, 30978);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ILfo;)V")
    public static final void method2870(int arg0, class343 arg1) {
        class99.field1801[arg0] = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
    public final void method2871(int arg0, boolean arg1) {
        if (arg0 != 21751) {
            return;
        }
        field7262++;
        if (this.field7280 == null) {
            return;
        }
        try {
            this.field7279.field585 = 0;
            this.field7279.method221(-1, arg1 ? 2 : 3);
            this.field7279.method227(0, arg0 ^ 0xF6285D27);
            this.field7280.method1787(this.field7279.field536, 0, arg0 - 16851, 4);
        } catch (IOException var4) {
            try {
                this.field7280.method1795((byte) 124);
            } catch (Exception var3) {
            }
            this.field7284 = -2;
            this.field7281++;
            this.field7280 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(B)Z")
    public final boolean method2872(byte arg0) {
        field7272++;
        if (arg0 != 63) {
            this.method2861((byte) 38, false, (byte) 39, -69, -100);
        }
        return this.method2860((byte) -40) >= 20;
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
    public static void method2873(int arg0) {
        field7267 = null;
        if (arg0 != 0) {
            field7267 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)Z")
    public final boolean method2874(int arg0) {
        field7256++;
        if (arg0 != -21) {
            this.method2859((byte) 69);
        }
        return this.method2862((byte) -122) >= 20;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
    public final void method2875(boolean arg0) {
        try {
            this.field7280.method1795((byte) 126);
        } catch (Exception var2) {
        }
        field7265++;
        this.field7281++;
        if (arg0) {
            field7258 = 72;
        }
        this.field7282 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field7284 = -1;
        this.field7280 = null;
    }
}
