import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class605 {

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Llga;")
    private class711 field8504 = new class711();

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "Llga;")
    private class711 field8507 = new class711();

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "Llga;")
    private class711 field8508 = new class711();

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "Llga;")
    private class711 field8509 = new class711();

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "Lee;")
    private class675 field8511 = new class675(4);

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public volatile int field8514 = 0;

    @OriginalMember(owner = "client!iq", name = "B", descriptor = "B")
    private byte field8517 = 0;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "I")
    public volatile int field8516 = 0;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "Lee;")
    private class675 field8515 = new class675(8);

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field8493;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field8496;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field8498;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field8500;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field8501;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    private int field8510;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "J")
    private long field8512;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "Lfba;")
    public static class25 field8497;

    @OriginalMember(owner = "client!iq", name = "C", descriptor = "Liba;")
    private class529 field8518;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "Lea;")
    private class546 field8513;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public final void method3396(boolean arg0) {
        field8495++;
        if (this.field8513 == null) {
            return;
        }
        try {
            this.field8511.field9146 = 0;
            this.field8511.method3694(7, -1528071456);
            this.field8511.method3753(1333491824, 0);
            if (!arg0) {
                this.field8513.method3165(4, 0, this.field8511.field9154, (byte) 95);
            }
        } catch (IOException var3) {
            try {
                this.field8513.method3167((byte) 78);
            } catch (Exception var2) {
            }
            this.field8513 = null;
            this.field8516 = -2;
            this.field8514++;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
    public final boolean method3397(int arg0) {
        if (this.field8513 != null) {
            long var2 = class479.method2864((byte) -91);
            int var4 = (int) (var2 - this.field8512);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field8512 = var2;
            this.field8510 += var4;
            if (this.field8510 > 30000) {
                try {
                    this.field8513.method3167((byte) 78);
                } catch (Exception var27) {
                }
                this.field8513 = null;
            }
        }
        field8500++;
        if (this.field8513 == null) {
            return this.method3411(true) == 0 && this.method3399(0) == 0;
        }
        try {
            this.field8513.method3168(125);
            for (class529 var5 = (class529) this.field8504.method4000((byte) -7); var5 != null; var5 = (class529) this.field8504.method4002(-40)) {
                this.field8511.field9146 = 0;
                this.field8511.method3694(1, -1528071456);
                this.field8511.method3753(1333491824, (int) var5.field8207);
                this.field8513.method3165(4, 0, this.field8511.field9154, (byte) 109);
                this.field8507.method3999(var5, 21934);
            }
            if (arg0 > -124) {
                this.field8513 = null;
            }
            for (class529 var6 = (class529) this.field8508.method4000((byte) -7); var6 != null; var6 = (class529) this.field8508.method4002(-77)) {
                this.field8511.field9146 = 0;
                this.field8511.method3694(0, -1528071456);
                this.field8511.method3753(1333491824, (int) var6.field8207);
                this.field8513.method3165(4, 0, this.field8511.field9154, (byte) 113);
                this.field8509.method3999(var6, 21934);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field8513.method3162(-128);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field8510 = 0;
                byte var9 = 0;
                if (this.field8518 == null) {
                    var9 = 8;
                } else if (this.field8518.field7450 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field8518.field7453.field9154.length - this.field8518.field7447;
                    int var11 = 512 - this.field8518.field7450;
                    if (var11 > var10 - this.field8518.field7453.field9146) {
                        var11 = var10 - this.field8518.field7453.field9146;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field8513.method3166(var11, this.field8518.field7453.field9154, -108, this.field8518.field7453.field9146);
                    if (this.field8517 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field8518.field7453.field9154[this.field8518.field7453.field9146 + var12] = (byte) class286.method1875(this.field8518.field7453.field9154[this.field8518.field7453.field9146 + var12], this.field8517);
                        }
                    }
                    this.field8518.field7450 += var11;
                    this.field8518.field7453.field9146 += var11;
                    if (this.field8518.field7453.field9146 == var10) {
                        this.field8518.method3311(100);
                        this.field8518.field4256 = false;
                        this.field8518 = null;
                    } else if (this.field8518.field7450 == 512) {
                        this.field8518.field7450 = 0;
                    }
                } else {
                    int var13 = var9 - this.field8515.field9146;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field8513.method3166(var13, this.field8515.field9154, -115, this.field8515.field9146);
                    if (this.field8517 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field8515.field9154[this.field8515.field9146 + var14] = (byte) class286.method1875(this.field8515.field9154[this.field8515.field9146 + var14], this.field8517);
                        }
                    }
                    this.field8515.field9146 += var13;
                    if (var9 <= this.field8515.field9146) {
                        if (this.field8518 == null) {
                            this.field8515.field9146 = 0;
                            int var15 = this.field8515.method3750((byte) 35);
                            int var16 = this.field8515.method3757((byte) -65);
                            int var17 = this.field8515.method3750((byte) 35);
                            int var18 = this.field8515.method3703(98);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class529 var24;
                            if (var20) {
                                for (var24 = (class529) this.field8509.method4000((byte) -7); var24 != null && var24.field8207 != var21; var24 = (class529) this.field8509.method4002(-110)) {
                                }
                            } else {
                                for (var24 = (class529) this.field8507.method4000((byte) -7); var24 != null && var24.field8207 != var21; var24 = (class529) this.field8507.method4002(-50)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field8518 = var24;
                            this.field8518.field7453 = new class675(var18 + var25 + this.field8518.field7447);
                            this.field8518.field7453.method3694(var19, -1528071456);
                            this.field8518.field7453.method3733(-49, var18);
                            this.field8515.field9146 = 0;
                            this.field8518.field7450 = 8;
                        } else if (this.field8518.field7450 != 0) {
                            throw new IOException();
                        } else if (this.field8515.field9154[0] == -1) {
                            this.field8515.field9146 = 0;
                            this.field8518.field7450 = 1;
                        } else {
                            this.field8518 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field8513.method3167((byte) 78);
            } catch (Exception var26) {
            }
            this.field8514++;
            this.field8513 = null;
            this.field8516 = -2;
            return this.method3411(true) == 0 && this.method3399(0) == 0;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZBII)Liba;")
    public final class529 method3398(byte arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field8503++;
        long var6 = (long) ((arg4 << 16) + arg3);
        class529 var8 = new class529();
        var8.field4255 = arg1;
        var8.field8207 = var6;
        if (arg0 != 75) {
            this.field8508 = null;
        }
        var8.field7447 = arg2;
        if (arg1) {
            if (this.method3411(true) >= 20) {
                throw new RuntimeException();
            }
            this.field8504.method3999(var8, arg0 + 21859);
        } else if (this.method3399(0) < 20) {
            this.field8508.method3999(var8, 21934);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
    private final int method3399(int arg0) {
        field8496++;
        if (arg0 != 0) {
            this.method3399(-79);
        }
        return this.field8508.method4001((byte) -98) + this.field8509.method4001((byte) -112);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lvc;B)[Llea;")
    public static final class611[] method3400(class316 arg0, byte arg1) {
        field8506++;
        if (arg1 != 1) {
            return null;
        } else if (arg0.method2043(18)) {
            class249 var2 = arg0.method2039(arg1 ^ 0x1);
            while (var2.field3310 == 0) {
                class756.method4205(10L, 0);
            }
            if (var2.field3310 == 2) {
                return new class611[0];
            }
            int[] var3 = (int[]) var2.field3311;
            class611[] var4 = new class611[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class611 var6 = new class611();
                var4[var5] = var6;
                var6.field8576 = var3[var5 << 2];
                var6.field8579 = var3[(var5 << 2) + 1];
                var6.field8578 = var3[(var5 << 2) + 2];
                var6.field8580 = var3[(var5 << 2) + 3];
            }
            return var4;
        } else {
            return new class611[0];
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public final void method3401(byte arg0) {
        if (arg0 <= -90) {
            field8490++;
            if (this.field8513 != null) {
                this.field8513.method3169(false);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lea;ZI)V")
    public final void method3402(class546 arg0, boolean arg1, int arg2) {
        field8501++;
        if (this.field8513 != null) {
            try {
                this.field8513.method3167((byte) 78);
            } catch (Exception var8) {
            }
            this.field8513 = null;
        }
        this.field8513 = arg0;
        this.method3405((byte) -67);
        this.method3407((byte) 0, arg1);
        this.field8518 = null;
        this.field8515.field9146 = 0;
        while (true) {
            class529 var4 = (class529) this.field8507.method3997(0);
            if (var4 == null) {
                while (true) {
                    class529 var5 = (class529) this.field8509.method3997(0);
                    if (var5 == null) {
                        if (arg2 != -25904) {
                            return;
                        }
                        if (this.field8517 != 0) {
                            try {
                                this.field8511.field9146 = 0;
                                this.field8511.method3694(4, -1528071456);
                                this.field8511.method3694(this.field8517, arg2 ^ 0x5B14E030);
                                this.field8511.method3745(-124, 0);
                                this.field8513.method3165(4, 0, this.field8511.field9154, (byte) 104);
                            } catch (IOException var7) {
                                try {
                                    this.field8513.method3167((byte) 78);
                                } catch (Exception var6) {
                                }
                                this.field8514++;
                                this.field8516 = -2;
                                this.field8513 = null;
                            }
                        }
                        this.field8510 = 0;
                        this.field8512 = class479.method2864((byte) -88);
                        return;
                    }
                    this.field8508.method3999(var5, 21934);
                }
            }
            this.field8504.method3999(var4, 21934);
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)Z")
    public final boolean method3403(byte arg0) {
        field8505++;
        if (arg0 < 105) {
            method3400(null, (byte) -43);
        }
        return this.method3399(0) >= 20;
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V")
    public final void method3404(byte arg0) {
        field8502++;
        if (arg0 == -65 && this.field8513 != null) {
            this.field8513.method3167((byte) 78);
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)V")
    private final void method3405(byte arg0) {
        field8493++;
        if (this.field8513 == null) {
            return;
        }
        try {
            this.field8511.field9146 = 0;
            this.field8511.method3694(6, -1528071456);
            this.field8511.method3753(arg0 ^ 0xB08487CD, 3);
            if (arg0 != -67) {
                this.field8516 = 110;
            }
            this.field8513.method3165(4, 0, this.field8511.field9154, (byte) 118);
        } catch (IOException var3) {
            try {
                this.field8513.method3167((byte) 78);
            } catch (Exception var2) {
            }
            this.field8516 = -2;
            this.field8513 = null;
            this.field8514++;
        }
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)V")
    public final void method3406(byte arg0) {
        field8494++;
        try {
            this.field8513.method3167((byte) 78);
        } catch (Exception var3) {
        }
        this.field8514++;
        this.field8516 = -1;
        this.field8517 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field8513 = null;
        int var2 = -55 / ((42 - arg0) / 55);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZ)V")
    public final void method3407(byte arg0, boolean arg1) {
        field8492++;
        if (this.field8513 == null) {
            return;
        }
        try {
            this.field8511.field9146 = 0;
            this.field8511.method3694(arg1 ? 2 : 3, -1528071456);
            this.field8511.method3753(1333491824, 0);
            this.field8513.method3165(4, 0, this.field8511.field9154, (byte) 99);
        } catch (IOException var4) {
            try {
                this.field8513.method3167((byte) 78);
            } catch (Exception var3) {
            }
            this.field8513 = null;
            this.field8516 = -2;
            this.field8514++;
        }
        if (arg0 != 0) {
            this.field8516 = -109;
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(B)I")
    public static final int method3408(byte arg0) {
        if (arg0 != 54) {
            return 13;
        }
        field8499++;
        if (class272.field3891 == null) {
            return class245.field3279 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
    public static void method3409(int arg0) {
        field8497 = null;
        if (arg0 >= -36) {
            field8497 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(B)Z")
    public final boolean method3410(byte arg0) {
        if (arg0 < 104) {
            this.method3410((byte) -92);
        }
        field8491++;
        return this.method3411(true) >= 20;
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)I")
    public final int method3411(boolean arg0) {
        if (!arg0) {
            method3400(null, (byte) 11);
        }
        field8498++;
        return this.field8504.method4001((byte) -89) + this.field8507.method4001((byte) -113);
    }
}
