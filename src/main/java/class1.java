import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "g", descriptor = "Loaa;")
    private class305 field7 = new class305();

    @OriginalMember(owner = "client!us", name = "m", descriptor = "Loaa;")
    private class305 field13 = new class305();

    @OriginalMember(owner = "client!us", name = "u", descriptor = "Loaa;")
    private class305 field21 = new class305();

    @OriginalMember(owner = "client!us", name = "v", descriptor = "Loaa;")
    private class305 field22 = new class305();

    @OriginalMember(owner = "client!us", name = "z", descriptor = "Lfca;")
    private class93 field26 = new class93(4);

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public volatile int field28 = 0;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "B")
    private byte field29 = 0;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "I")
    public volatile int field30 = 0;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "Lfca;")
    private class93 field27 = new class93(8);

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field12 = -2;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "J")
    private long field25;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "Lbj;")
    private class257 field31;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "Lgo;")
    private class655 field24;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "[[B")
    public static byte[][] field15;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "[[[Lni;")
    public static class549[][][] field1;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZBIIB)Lbj;", line = 5)
    public final class257 method1(boolean arg0, byte arg1, int arg2, int arg3, byte arg4) {
        field17++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class257 var8 = new class257();
        var8.field2490 = arg0;
        var8.field7008 = var6;
        var8.field3601 = arg4;
        if (arg0) {
            if (this.method6((byte) -51) >= 20) {
                throw new RuntimeException();
            }
            this.field7.method1953((byte) 83, var8);
        } else if (this.method4(-101) < 20) {
            this.field21.method1953((byte) 83, var8);
        } else {
            throw new RuntimeException();
        }
        return arg1 == -50 ? var8 : null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 48)
    public static void method2(int arg0) {
        field1 = null;
        field15 = null;
        if (arg0 != 0) {
            method2(-128);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLgo;Z)V", line = 59)
    public final void method3(byte arg0, class655 arg1, boolean arg2) {
        if (this.field24 != null) {
            try {
                this.field24.method3687((byte) 94);
            } catch (Exception var8) {
            }
            this.field24 = null;
        }
        field3++;
        this.field24 = arg1;
        this.method14(112);
        if (arg0 < 110) {
            return;
        }
        this.method15(-80, arg2);
        this.field27.field1442 = 0;
        this.field31 = null;
        while (true) {
            class257 var4 = (class257) this.field13.method1948(true);
            if (var4 == null) {
                while (true) {
                    class257 var5 = (class257) this.field22.method1948(true);
                    if (var5 == null) {
                        if (this.field29 != 0) {
                            try {
                                this.field26.field1442 = 0;
                                this.field26.method754(4, 44);
                                this.field26.method754(this.field29, 100);
                                this.field26.method781(104, 0);
                                this.field24.method3683(0, this.field26.field1413, 4, (byte) -95);
                            } catch (IOException var7) {
                                try {
                                    this.field24.method3687((byte) 90);
                                } catch (Exception var6) {
                                }
                                this.field28++;
                                this.field30 = -2;
                                this.field24 = null;
                            }
                        }
                        this.field23 = 0;
                        this.field25 = class197.method1423(1);
                        return;
                    }
                    this.field21.method1953((byte) 83, var5);
                }
            }
            this.field7.method1953((byte) 83, var4);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I", line = 131)
    private final int method4(int arg0) {
        field18++;
        if (arg0 > -62) {
            this.method9(-118);
        }
        return this.field21.method1949((byte) -29) + this.field22.method1949((byte) -29);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 150)
    public final void method5(byte arg0) {
        field8++;
        if (this.field24 == null) {
            return;
        }
        try {
            this.field26.field1442 = 0;
            this.field26.method754(7, arg0 ^ 0x70);
            this.field26.method753(0, (byte) 116);
            this.field24.method3683(0, this.field26.field1413, 4, (byte) -34);
        } catch (IOException var3) {
            try {
                this.field24.method3687((byte) -126);
            } catch (Exception var2) {
            }
            this.field24 = null;
            this.field28++;
            this.field30 = -2;
        }
        if (arg0 != 40) {
            this.field23 = 92;
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)I", line = 177)
    public final int method6(byte arg0) {
        field5++;
        if (arg0 >= -3) {
            this.method13(true);
        }
        return this.field7.method1949((byte) -29) + this.field13.method1949((byte) -29);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V", line = 188)
    public final void method7(int arg0) {
        if (this.field24 != null) {
            this.field24.method3687((byte) 47);
        }
        field16++;
        int var2 = 90 / ((arg0 - 24) / 39);
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)Z", line = 202)
    public final boolean method8(int arg0) {
        field19++;
        if (arg0 == -23158) {
            return this.method6((byte) -8) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V", line = 215)
    public final void method9(int arg0) {
        if (this.field24 != null) {
            this.field24.method3681(false);
        }
        field10++;
        if (arg0 <= 49) {
            this.method12(false);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)I", line = 228)
    public static final int method10(int arg0, boolean arg1, int arg2) {
        field14++;
        if (arg1) {
            method2(-33);
        }
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        double var5 = Math.log((double) arg2) / Math.log(2.0D);
        double var7 = var5 + Math.random() * (var3 - var5);
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!us", name = "f", descriptor = "(I)V", line = 245)
    public final void method11(int arg0) {
        try {
            this.field24.method3687((byte) 17);
        } catch (Exception var2) {
        }
        field20++;
        this.field29 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field30 = -1;
        if (arg0 >= 8) {
            this.field24 = null;
            this.field28++;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z", line = 271)
    public final boolean method12(boolean arg0) {
        if (!arg0) {
            this.method9(9);
        }
        field11++;
        return this.method4(-116) >= 20;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)Z", line = 286)
    public final boolean method13(boolean arg0) {
        if (this.field24 != null) {
            long var2 = class197.method1423(1);
            int var4 = (int) (var2 - this.field25);
            this.field25 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field23 += var4;
            if (this.field23 > 30000) {
                try {
                    this.field24.method3687((byte) -128);
                } catch (Exception var27) {
                }
                this.field24 = null;
            }
        }
        if (arg0) {
            return false;
        }
        field9++;
        if (this.field24 == null) {
            return this.method6((byte) -46) == 0 && this.method4(-78) == 0;
        }
        try {
            this.field24.method3682((byte) 110);
            for (class257 var5 = (class257) this.field7.method1951(-723780560); var5 != null; var5 = (class257) this.field7.method1946(-6974)) {
                this.field26.field1442 = 0;
                this.field26.method754(1, 50);
                this.field26.method753((int) var5.field7008, (byte) 122);
                this.field24.method3683(0, this.field26.field1413, 4, (byte) -38);
                this.field13.method1953((byte) 83, var5);
            }
            for (class257 var6 = (class257) this.field21.method1951(-723780560); var6 != null; var6 = (class257) this.field21.method1946(-6974)) {
                this.field26.field1442 = 0;
                this.field26.method754(0, 89);
                this.field26.method753((int) var6.field7008, (byte) 125);
                this.field24.method3683(0, this.field26.field1413, 4, (byte) -6);
                this.field22.method1953((byte) 83, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field24.method3684((byte) -102);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field23 = 0;
                byte var9 = 0;
                if (this.field31 == null) {
                    var9 = 8;
                } else if (this.field31.field3603 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field31.field3602.field1413.length - this.field31.field3601;
                    int var11 = 512 - this.field31.field3603;
                    if ((var10 - this.field31.field3602.field1442) < var11) {
                        var11 = var10 - this.field31.field3602.field1442;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field24.method3686(var11, this.field31.field3602.field1413, this.field31.field3602.field1442, -1);
                    if (this.field29 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field31.field3602.field1413[this.field31.field3602.field1442 + var12] = (byte) class18.method125(this.field31.field3602.field1413[this.field31.field3602.field1442 + var12], this.field29);
                        }
                    }
                    this.field31.field3602.field1442 += var11;
                    this.field31.field3603 += var11;
                    if (this.field31.field3602.field1442 == var10) {
                        this.field31.method2942(false);
                        this.field31.field2489 = false;
                        this.field31 = null;
                    } else if (this.field31.field3603 == 512) {
                        this.field31.field3603 = 0;
                    }
                } else {
                    int var13 = var9 - this.field27.field1442;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field24.method3686(var13, this.field27.field1413, this.field27.field1442, -1);
                    if (this.field29 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field27.field1413[this.field27.field1442 + var14] = (byte) class18.method125(this.field27.field1413[this.field27.field1442 + var14], this.field29);
                        }
                    }
                    this.field27.field1442 += var13;
                    if (this.field27.field1442 >= var9) {
                        if (this.field31 == null) {
                            this.field27.field1442 = 0;
                            int var15 = this.field27.method793((byte) 86);
                            int var16 = this.field27.method763(-104);
                            int var17 = this.field27.method793((byte) 94);
                            int var18 = this.field27.method773(3);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class257 var24;
                            if (var20) {
                                for (var24 = (class257) this.field22.method1951(-723780560); var24 != null && var24.field7008 != var21; var24 = (class257) this.field22.method1946(-6974)) {
                                }
                            } else {
                                for (var24 = (class257) this.field13.method1951(-723780560); var24 != null && var24.field7008 != var21; var24 = (class257) this.field13.method1946(-6974)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field31 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field31.field3602 = new class93(var18 + var25 + this.field31.field3601);
                            this.field31.field3602.method754(var19, 92);
                            this.field31.field3602.method759(var18, 127);
                            this.field27.field1442 = 0;
                            this.field31.field3603 = 8;
                        } else if (this.field31.field3603 != 0) {
                            throw new IOException();
                        } else if (this.field27.field1413[0] == -1) {
                            this.field31.field3603 = 1;
                            this.field27.field1442 = 0;
                        } else {
                            this.field31 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field24.method3687((byte) 40);
            } catch (Exception var26) {
            }
            this.field30 = -2;
            this.field28++;
            this.field24 = null;
            return this.method6((byte) -54) == 0 && this.method4(-70) == 0;
        }
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(I)V", line = 561)
    private final void method14(int arg0) {
        field2++;
        if (this.field24 == null) {
            return;
        }
        try {
            this.field26.field1442 = 0;
            this.field26.method754(6, 101);
            this.field26.method753(3, (byte) 124);
            this.field24.method3683(0, this.field26.field1413, 4, (byte) -49);
            int var2 = 5 / ((arg0 - 12) / 61);
        } catch (IOException var4) {
            try {
                this.field24.method3687((byte) 103);
            } catch (Exception var3) {
            }
            this.field24 = null;
            this.field28++;
            this.field30 = -2;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V", line = 588)
    public final void method15(int arg0, boolean arg1) {
        field4++;
        if (this.field24 == null) {
            return;
        }
        try {
            if (arg0 > -44) {
                this.field25 = -15L;
            }
            this.field26.field1442 = 0;
            this.field26.method754(arg1 ? 2 : 3, 108);
            this.field26.method753(0, (byte) 123);
            this.field24.method3683(0, this.field26.field1413, 4, (byte) -43);
        } catch (IOException var4) {
            try {
                this.field24.method3687((byte) 7);
            } catch (Exception var3) {
            }
            this.field24 = null;
            this.field28++;
            this.field30 = -2;
        }
    }
}
