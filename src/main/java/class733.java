import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class733 {

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Lbj;")
    private class430 field10252 = new class430();

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "Lbj;")
    private class430 field10256 = new class430();

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "Lbj;")
    private class430 field10257 = new class430();

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "Lbj;")
    private class430 field10258 = new class430();

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "Ltn;")
    private class179 field10261 = new class179(4);

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public volatile int field10263 = 0;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public volatile int field10265 = 0;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "B")
    private byte field10266 = 0;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "Ltn;")
    private class179 field10264 = new class179(8);

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "[I")
    public static int[] field10241 = new int[3];

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "[I")
    public static int[] field10243 = new int[2];

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "D")
    public static double field10246;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field10242;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field10244;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field10245;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field10248;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field10253;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    private int field10260;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "J")
    private long field10259;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lvba;")
    public static class400 field10249;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Lse;")
    private class5 field10262;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "Lme;")
    private class717 field10267;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 3)
    public final void method4091(int arg0) {
        field10251++;
        try {
            this.field10262.method27(false);
        } catch (Exception var2) {
        }
        this.field10263++;
        this.field10262 = null;
        this.field10266 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field10265 = arg0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z", line = 18)
    public final boolean method4092(boolean arg0) {
        if (this.field10262 != null) {
            long var2 = class97.method654((byte) 112);
            int var4 = (int) (var2 - this.field10259);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field10259 = var2;
            this.field10260 += var4;
            if (this.field10260 > 30000) {
                try {
                    this.field10262.method27(!arg0);
                } catch (Exception var27) {
                }
                this.field10262 = null;
            }
        }
        field10237++;
        if (this.field10262 == null) {
            return this.method4094(-9692) == 0 && this.method4095((byte) -53) == 0;
        }
        try {
            this.field10262.method17((byte) -73);
            for (class717 var5 = (class717) this.field10252.method2565((byte) 95); var5 != null; var5 = (class717) this.field10252.method2568(-31355)) {
                this.field10261.field2354 = 0;
                this.field10261.method1141(1, 33);
                this.field10261.method1129(-15339, (int) var5.field8700);
                this.field10262.method25(this.field10261.field2325, 4, 0, 0);
                this.field10256.method2564(var5, (byte) -123);
            }
            class717 var6 = (class717) this.field10257.method2565((byte) -108);
            if (!arg0) {
                field10246 = -1.0219340766914087D;
            }
            while (var6 != null) {
                this.field10261.field2354 = 0;
                this.field10261.method1141(0, -86);
                this.field10261.method1129(-15339, (int) var6.field8700);
                this.field10262.method25(this.field10261.field2325, 4, 0, 0);
                this.field10258.method2564(var6, (byte) -123);
                var6 = (class717) this.field10257.method2568(-31355);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field10262.method21(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field10260 = 0;
                byte var9 = 0;
                if (this.field10267 == null) {
                    var9 = 8;
                } else if (this.field10267.field10109 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field10264.field2354;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field10262.method20(var10, this.field10264.field2354, this.field10264.field2325, (byte) -121);
                    if (this.field10266 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field10264.field2325[this.field10264.field2354 + var11] = (byte) class14.method189(this.field10264.field2325[this.field10264.field2354 + var11], this.field10266);
                        }
                    }
                    this.field10264.field2354 += var10;
                    if (this.field10264.field2354 >= var9) {
                        if (this.field10267 == null) {
                            this.field10264.field2354 = 0;
                            int var12 = this.field10264.method1094(255);
                            int var13 = this.field10264.method1107(false);
                            int var14 = this.field10264.method1094(255);
                            int var15 = this.field10264.method1095((byte) 115);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class717 var21;
                            if (var17) {
                                for (var21 = (class717) this.field10258.method2565((byte) -113); var21 != null && var21.field8700 != var18; var21 = (class717) this.field10258.method2568(-31355)) {
                                }
                            } else {
                                for (var21 = (class717) this.field10256.method2565((byte) -88); var21 != null && var21.field8700 != var18; var21 = (class717) this.field10256.method2568(-31355)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field10267 = var21;
                            this.field10267.field10114 = new class179(this.field10267.field10111 + var22 + var15);
                            this.field10267.field10114.method1141(var16, -84);
                            this.field10267.field10114.method1112(var15, -122);
                            this.field10267.field10109 = 8;
                            this.field10264.field2354 = 0;
                        } else if (this.field10267.field10109 != 0) {
                            throw new IOException();
                        } else if (this.field10264.field2325[0] == -1) {
                            this.field10267.field10109 = 1;
                            this.field10264.field2354 = 0;
                        } else {
                            this.field10267 = null;
                        }
                    }
                } else {
                    int var23 = this.field10267.field10114.field2325.length - this.field10267.field10111;
                    int var24 = 512 - this.field10267.field10109;
                    if ((var23 - this.field10267.field10114.field2354) < var24) {
                        var24 = var23 - this.field10267.field10114.field2354;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field10262.method20(var24, this.field10267.field10114.field2354, this.field10267.field10114.field2325, (byte) -115);
                    if (this.field10266 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field10267.field10114.field2325[this.field10267.field10114.field2354 + var25] = (byte) class14.method189(this.field10267.field10114.field2325[this.field10267.field10114.field2354 + var25], this.field10266);
                        }
                    }
                    this.field10267.field10109 += var24;
                    this.field10267.field10114.field2354 += var24;
                    if (this.field10267.field10114.field2354 == var23) {
                        this.field10267.method3409(18);
                        this.field10267.field7751 = false;
                        this.field10267 = null;
                    } else if (this.field10267.field10109 == 512) {
                        this.field10267.field10109 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field10262.method27(false);
            } catch (Exception var26) {
            }
            this.field10265 = -2;
            this.field10262 = null;
            this.field10263++;
            return this.method4094(-9692) == 0 && this.method4095((byte) -53) == 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Z", line = 288)
    public final boolean method4093(int arg0) {
        if (arg0 == -21) {
            field10242++;
            return this.method4095((byte) -53) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)I", line = 301)
    public final int method4094(int arg0) {
        if (arg0 != -9692) {
            this.field10265 = 107;
        }
        field10245++;
        return this.field10252.method2569(arg0 + 22759) + this.field10256.method2569(13067);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I", line = 312)
    private final int method4095(byte arg0) {
        field10253++;
        return arg0 == -53 ? this.field10257.method2569(13067) + this.field10258.method2569(arg0 + 13120) : 22;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 323)
    public final void method4096(int arg0) {
        if (this.field10262 != null) {
            this.field10262.method22((byte) -93);
        }
        if (arg0 == 0) {
            field10255++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V", line = 338)
    public final void method4097(boolean arg0, byte arg1) {
        field10244++;
        if (this.field10262 == null) {
            return;
        }
        try {
            int var3 = -5 % ((arg1 + 64) / 42);
            this.field10261.field2354 = 0;
            this.field10261.method1141(arg0 ? 2 : 3, -120);
            this.field10261.method1129(-15339, 0);
            this.field10262.method25(this.field10261.field2325, 4, 0, 0);
        } catch (IOException var5) {
            try {
                this.field10262.method27(false);
            } catch (Exception var4) {
            }
            this.field10262 = null;
            this.field10265 = -2;
            this.field10263++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)Z", line = 364)
    public final boolean method4098(int arg0) {
        if (arg0 >= -121) {
            this.field10261 = null;
        }
        field10250++;
        return this.method4094(-9692) >= 20;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V", line = 375)
    public final void method4099(int arg0) {
        int var2 = 81 % ((arg0 + 72) / 33);
        if (this.field10262 != null) {
            this.field10262.method27(false);
        }
        field10248++;
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V", line = 396)
    private final void method4100(int arg0) {
        field10254++;
        if (this.field10262 == null) {
            return;
        }
        try {
            this.field10261.field2354 = 0;
            this.field10261.method1141(6, 107);
            this.field10261.method1129(-15339, 3);
            this.field10262.method25(this.field10261.field2325, 4, 0, 0);
        } catch (IOException var4) {
            try {
                this.field10262.method27(false);
            } catch (Exception var3) {
            }
            this.field10263++;
            this.field10265 = -2;
            this.field10262 = null;
        }
        int var2 = -109 / ((arg0 + 1) / 61);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V", line = 423)
    public static void method4101(boolean arg0) {
        if (!arg0) {
            method4101(true);
        }
        field10241 = null;
        field10249 = null;
        field10243 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLse;I)V", line = 435)
    public final void method4102(boolean arg0, class5 arg1, int arg2) {
        if (arg2 != 1022) {
            this.field10256 = null;
        }
        field10240++;
        if (this.field10262 != null) {
            try {
                this.field10262.method27(false);
            } catch (Exception var8) {
            }
            this.field10262 = null;
        }
        this.field10262 = arg1;
        this.method4100(82);
        this.method4097(arg0, (byte) -12);
        this.field10264.field2354 = 0;
        this.field10267 = null;
        while (true) {
            class717 var4 = (class717) this.field10256.method2566(arg2 ^ 0x3FE);
            if (var4 == null) {
                while (true) {
                    class717 var5 = (class717) this.field10258.method2566(0);
                    if (var5 == null) {
                        if (this.field10266 != 0) {
                            try {
                                this.field10261.field2354 = 0;
                                this.field10261.method1141(4, 25);
                                this.field10261.method1141(this.field10266, arg2 - 996);
                                this.field10261.method1157(0, (byte) 122);
                                this.field10262.method25(this.field10261.field2325, 4, 0, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field10262.method27(false);
                                } catch (Exception var6) {
                                }
                                this.field10262 = null;
                                this.field10265 = -2;
                                this.field10263++;
                            }
                        }
                        this.field10260 = 0;
                        this.field10259 = class97.method654((byte) 76);
                        return;
                    }
                    this.field10257.method2564(var5, (byte) -123);
                }
            }
            this.field10252.method2564(var4, (byte) -123);
        }
    }

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V", line = 509)
    public final void method4103(int arg0) {
        field10238++;
        if (this.field10262 == null) {
            return;
        }
        try {
            int var2 = 33 % ((arg0 - 40) / 43);
            this.field10261.field2354 = 0;
            this.field10261.method1141(7, 59);
            this.field10261.method1129(-15339, 0);
            this.field10262.method25(this.field10261.field2325, 4, 0, 0);
        } catch (IOException var4) {
            try {
                this.field10262.method27(false);
            } catch (Exception var3) {
            }
            this.field10265 = -2;
            this.field10262 = null;
            this.field10263++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBZII)Lme;", line = 537)
    public final class717 method4104(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field10247++;
        long var6 = (long) ((arg3 << 16) + arg0);
        int var8 = 46 % ((-arg4 - 41) / 57);
        class717 var9 = new class717();
        var9.field7750 = arg2;
        var9.field8700 = var6;
        var9.field10111 = arg1;
        if (arg2) {
            if (this.method4094(-9692) >= 20) {
                throw new RuntimeException();
            }
            this.field10252.method2564(var9, (byte) -123);
        } else if (this.method4095((byte) -53) < 20) {
            this.field10257.method2564(var9, (byte) -123);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }
}
