import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class304 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lwh;")
    private class9 field5086 = new class9();

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lwh;")
    private class9 field5101 = new class9();

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lwh;")
    private class9 field5104 = new class9();

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lwh;")
    private class9 field5105 = new class9();

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lsd;")
    private class26 field5109 = new class26(4);

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "B")
    private byte field5111 = 0;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public volatile int field5113 = 0;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public volatile int field5112 = 0;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lsd;")
    private class26 field5110 = new class26(8);

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lqd;")
    private static class40 field5095 = class147.method1106("Loaded world list data", (byte) -91);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5083 = 0;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lqd;")
    public static class40 field5102 = field5095;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    private int field5108;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "J")
    private long field5106;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lsa;")
    private class104 field5107;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lkc;")
    private class33 field5114;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lwd;")
    public static class75 field5087;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
    public static int[] field5094;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 4)
    private final void method2072(byte arg0) {
        field5088++;
        if (this.field5107 == null) {
            return;
        }
        try {
            this.field5109.field478 = 0;
            this.field5109.method218(6, -19914);
            this.field5109.method217(3, (byte) 76);
            this.field5107.method779(4, 16333, 0, this.field5109.field472);
        } catch (IOException var6) {
            try {
                this.field5107.method784(115);
            } catch (Exception var5) {
            }
            this.field5112 = -2;
            this.field5113++;
            this.field5107 = null;
        }
        int var4 = 89 % ((arg0 + 16) / 32);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)I", line = 31)
    public static final int method2073(byte arg0) {
        field5100++;
        if (arg0 < 19) {
            return -125;
        } else if (class271.field4503 != null) {
            return 3;
        } else if (class21.field350 && class225.field3712) {
            return 2;
        } else if (class21.field350 && !class225.field3712) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V", line = 58)
    public static void method2074(byte arg0) {
        field5102 = null;
        if (arg0 < -60) {
            field5095 = null;
            field5087 = null;
            field5094 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I", line = 74)
    private final int method2075(int arg0) {
        field5090++;
        if (arg0 != 0) {
            this.method2076(-17);
        }
        return this.field5104.method51(-4) + this.field5105.method51(-4);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I", line = 88)
    public final int method2076(int arg0) {
        field5089++;
        if (arg0 != 30411) {
            this.field5113 = 27;
        }
        return this.field5086.method51(-4) + this.field5101.method51(-4);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)Z", line = 100)
    public final boolean method2077(int arg0) {
        field5097++;
        if (arg0 == 0) {
            return this.method2076(arg0 ^ 0x76CB) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 113)
    public final void method2078(int arg0) {
        if (this.field5107 != null) {
            this.field5107.method787(-123);
        }
        if (arg0 == 8) {
            field5091++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZILsa;)V", line = 129)
    public final void method2079(boolean arg0, int arg1, class104 arg2) {
        if (this.field5107 != null) {
            try {
                this.field5107.method784(58);
            } catch (Exception var11) {
            }
            this.field5107 = null;
        }
        field5099++;
        this.field5107 = arg2;
        this.method2072((byte) 47);
        this.method2085((byte) -89, arg0);
        this.field5110.field478 = 0;
        if (arg1 != 4) {
            this.field5106 = -65L;
        }
        this.field5114 = null;
        while (true) {
            class33 var5 = (class33) this.field5101.method48(1);
            if (var5 == null) {
                while (true) {
                    class33 var6 = (class33) this.field5105.method48(1);
                    if (var6 == null) {
                        if (this.field5111 != 0) {
                            try {
                                this.field5109.field478 = 0;
                                this.field5109.method218(4, -19914);
                                this.field5109.method218(this.field5111, -19914);
                                this.field5109.method209(arg1 ^ 0xFF0004, 0);
                                this.field5107.method779(4, 16333, 0, this.field5109.field472);
                            } catch (IOException var10) {
                                try {
                                    this.field5107.method784(81);
                                } catch (Exception var9) {
                                }
                                this.field5113++;
                                this.field5107 = null;
                                this.field5112 = -2;
                            }
                        }
                        this.field5108 = 0;
                        this.field5106 = class69.method535(true);
                        return;
                    }
                    this.field5104.method55(var6, arg1 ^ 0x66);
                }
            }
            this.field5086.method55(var5, arg1 ^ 0x6E);
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 199)
    public final void method2080(int arg0) {
        try {
            this.field5107.method784(119);
        } catch (Exception var3) {
        }
        this.field5107 = null;
        this.field5111 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5113++;
        field5093++;
        this.field5112 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)Z", line = 214)
    public final boolean method2081(int arg0) {
        field5084++;
        if (this.field5107 != null) {
            long var2 = class69.method535(true);
            int var4 = (int) (var2 - this.field5106);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5108 += var4;
            this.field5106 = var2;
            if (this.field5108 > 30000) {
                try {
                    this.field5107.method784(89);
                } catch (Exception var30) {
                }
                this.field5107 = null;
            }
        }
        if (this.field5107 == null) {
            return this.method2076(30411) == 0 && this.method2075(0) == 0;
        }
        try {
            this.field5107.method780(true);
            if (arg0 != 512) {
                this.field5086 = (class9) null;
            }
            for (class33 var6 = (class33) this.field5086.method49((byte) 123); var6 != null; var6 = (class33) this.field5086.method54(arg0 ^ 0x200)) {
                this.field5109.field478 = 0;
                this.field5109.method218(1, arg0 - 20426);
                this.field5109.method217((int) var6.field2112, (byte) 76);
                this.field5107.method779(4, 16333, 0, this.field5109.field472);
                this.field5101.method55(var6, arg0 ^ 0x26C);
            }
            for (class33 var7 = (class33) this.field5104.method49((byte) 123); var7 != null; var7 = (class33) this.field5104.method54(0)) {
                this.field5109.field478 = 0;
                this.field5109.method218(0, -19914);
                this.field5109.method217((int) var7.field2112, (byte) 76);
                this.field5107.method779(4, 16333, 0, this.field5109.field472);
                this.field5105.method55(var7, 117);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field5107.method790((byte) 66);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field5108 = 0;
                byte var10 = 0;
                if (this.field5114 == null) {
                    var10 = 8;
                } else if (this.field5114.field661 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field5114.field664.field472.length - this.field5114.field660;
                    int var12 = 512 - this.field5114.field661;
                    if (var12 > (var11 - this.field5114.field664.field478)) {
                        var12 = var11 - this.field5114.field664.field478;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field5107.method785(var12, this.field5114.field664.field472, this.field5114.field664.field478, 28016);
                    if (this.field5111 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field5114.field664.field472[this.field5114.field664.field478 + var13] = (byte) class88.method686(this.field5114.field664.field472[this.field5114.field664.field478 + var13], this.field5111);
                        }
                    }
                    this.field5114.field661 += var12;
                    this.field5114.field664.field478 += var12;
                    if (this.field5114.field664.field478 == var11) {
                        this.field5114.method921(2);
                        this.field5114.field4515 = false;
                        this.field5114 = null;
                    } else if (this.field5114.field661 == 512) {
                        this.field5114.field661 = 0;
                    }
                } else {
                    int var14 = var10 - this.field5110.field478;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field5107.method785(var14, this.field5110.field472, this.field5110.field478, arg0 ^ 0x6F70);
                    if (this.field5111 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field5110.field472[this.field5110.field478 + var15] = (byte) class88.method686(this.field5110.field472[this.field5110.field478 + var15], this.field5111);
                        }
                    }
                    this.field5110.field478 += var14;
                    if (var10 <= this.field5110.field478) {
                        if (this.field5114 == null) {
                            this.field5110.field478 = 0;
                            int var16 = this.field5110.method226(255);
                            int var17 = this.field5110.method197(-1);
                            int var18 = this.field5110.method226(255);
                            Object var19 = null;
                            long var20 = (long) ((var16 << 16) + var17);
                            int var22 = this.field5110.method203(-22066);
                            boolean var23 = (var18 & 0x80) != 0;
                            int var24 = var18 & 0x7F;
                            class33 var25;
                            if (var23) {
                                for (var25 = (class33) this.field5105.method49((byte) 126); var25 != null && var25.field2112 != var20; var25 = (class33) this.field5105.method54(0)) {
                                }
                            } else {
                                for (var25 = (class33) this.field5101.method49((byte) 123); var25 != null && var25.field2112 != var20; var25 = (class33) this.field5101.method54(0)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var24 == 0 ? 5 : 9;
                            this.field5114 = var25;
                            this.field5114.field664 = new class26(var22 + var26 + this.field5114.field660);
                            this.field5114.field664.method218(var24, -19914);
                            this.field5114.field664.method239((byte) 111, var22);
                            this.field5114.field661 = 8;
                            this.field5110.field478 = 0;
                        } else if (this.field5114.field661 != 0) {
                            throw new IOException();
                        } else if (this.field5110.field472[0] == -1) {
                            this.field5114.field661 = 1;
                            this.field5110.field478 = 0;
                        } else {
                            this.field5114 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field5107.method784(118);
            } catch (Exception var29) {
            }
            this.field5107 = null;
            this.field5113++;
            this.field5112 = -2;
            return this.method2076(30411) == 0 && this.method2075(0) == 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V", line = 507)
    public final void method2082(byte arg0) {
        if (arg0 != -125) {
            method2074((byte) -69);
        }
        if (this.field5107 != null) {
            this.field5107.method784(62);
        }
        field5098++;
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V", line = 522)
    public final void method2083(int arg0) {
        field5092++;
        if (this.field5107 == null) {
            return;
        }
        try {
            this.field5109.field478 = 0;
            this.field5109.method218(7, -19914);
            if (arg0 < 54) {
                return;
            }
            this.field5109.method217(0, (byte) 76);
            this.field5107.method779(4, 16333, 0, this.field5109.field472);
        } catch (IOException var5) {
            try {
                this.field5107.method784(74);
            } catch (Exception var4) {
            }
            this.field5107 = null;
            this.field5113++;
            this.field5112 = -2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBZIB)Lkc;", line = 549)
    public final class33 method2084(int arg0, byte arg1, boolean arg2, int arg3, byte arg4) {
        field5085++;
        if (arg1 <= 70) {
            return (class33) null;
        }
        long var6 = (long) ((arg3 << 16) + arg0);
        class33 var8 = new class33();
        var8.field4523 = arg2;
        var8.field660 = arg4;
        var8.field2112 = var6;
        if (arg2) {
            if (this.method2076(30411) >= 20) {
                throw new RuntimeException();
            }
            this.field5086.method55(var8, 115);
        } else if (this.method2075(0) < 20) {
            this.field5104.method55(var8, 123);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZ)V", line = 596)
    public final void method2085(byte arg0, boolean arg1) {
        field5096++;
        if (arg0 >= -39) {
            this.field5112 = 43;
        }
        if (this.field5107 == null) {
            return;
        }
        try {
            this.field5109.field478 = 0;
            this.field5109.method218(arg1 ? 2 : 3, -19914);
            this.field5109.method217(0, (byte) 76);
            this.field5107.method779(4, 16333, 0, this.field5109.field472);
        } catch (IOException var6) {
            try {
                this.field5107.method784(123);
            } catch (Exception var5) {
            }
            this.field5107 = null;
            this.field5113++;
            this.field5112 = -2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)Z", line = 633)
    public final boolean method2086(byte arg0) {
        int var2 = -62 / ((36 - arg0) / 43);
        field5103++;
        return this.method2075(0) >= 20;
    }
}
