import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class234 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lb;")
    private class84 field3611 = new class84();

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lb;")
    private class84 field3627 = new class84();

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Lb;")
    private class84 field3630 = new class84();

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lb;")
    private class84 field3631 = new class84();

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lf;")
    private class37 field3632 = new class37(4);

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "B")
    private byte field3639 = 0;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public volatile int field3637 = 0;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public volatile int field3636 = 0;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Lf;")
    private class37 field3638 = new class37(8);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "[J")
    public static long[] field3616 = new long[256];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "J")
    private long field3634;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Lkf;")
    private class184 field3635;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Le;")
    private class65 field3640;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method1557(byte arg0) {
        if (arg0 != -79) {
            method1561(57, 33, -43, false, -43, (byte) 3, 120, -48, -86, -56);
        }
        field3616 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1558(int arg0) {
        if (this.field3635 != null) {
            this.field3635.method1242((byte) 113);
        }
        field3629++;
        if (arg0 >= -64) {
            this.field3638 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Z")
    public final boolean method1559(byte arg0) {
        if (arg0 != -41) {
            this.field3627 = null;
        }
        field3615++;
        return this.method1568((byte) -111) >= 20;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)V")
    public final void method1560(boolean arg0, int arg1) {
        field3612++;
        if (this.field3635 == null) {
            return;
        }
        try {
            this.field3632.field588 = 0;
            if (arg1 < 74) {
                this.method1565(62);
            }
            this.field3632.method287(440742616, arg0 ? 2 : 3);
            this.field3632.method327(0, false);
            this.field3635.method1243(0, this.field3632.field583, 4, (byte) -90);
        } catch (IOException var4) {
            try {
                this.field3635.method1242((byte) 113);
            } catch (Exception var3) {
            }
            this.field3637++;
            this.field3635 = null;
            this.field3636 = -2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIZIBIIII)V")
    public static final void method1561(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field3617++;
        int var10 = arg1 - arg0;
        int var11 = arg4 - arg6;
        int var12 = (arg7 - arg2 << 16) / var11;
        int var13 = (arg8 - arg9 << 16) / var10;
        if (arg5 < 65) {
            field3622 = -52;
        }
        class171.method1133(arg0, arg1, var13, arg9, var12, arg3, arg2, arg6, 0, 0, arg4, 4032);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)I")
    private final int method1562(byte arg0) {
        field3614++;
        if (arg0 != -41) {
            this.method1571((byte) -39);
        }
        return this.field3630.method682((byte) 64) + this.field3631.method682((byte) 64);
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V")
    public static final void method1563(byte arg0) {
        class258.field3949.method1783(arg0 - 11);
        field3618++;
        if (arg0 != 11) {
            field3616 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    private final void method1564(int arg0) {
        field3626++;
        if (this.field3635 == null) {
            return;
        }
        try {
            this.field3632.field588 = 0;
            this.field3632.method287(440742616, 6);
            this.field3632.method327(3, false);
            this.field3635.method1243(arg0, this.field3632.field583, 4, (byte) -96);
        } catch (IOException var3) {
            try {
                this.field3635.method1242((byte) 113);
            } catch (Exception var2) {
            }
            this.field3636 = -2;
            this.field3635 = null;
            this.field3637++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method1565(int arg0) {
        try {
            this.field3635.method1242((byte) 113);
        } catch (Exception var2) {
        }
        this.field3636 = -1;
        this.field3639 = (byte) ((int) (Math.random() * 255.0D + (double) arg0));
        this.field3637++;
        field3610++;
        this.field3635 = null;
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Z")
    public final boolean method1566(int arg0) {
        if (this.field3635 != null) {
            long var2 = class269.method1823(arg0 - 23295);
            int var4 = (int) (var2 - this.field3634);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3633 += var4;
            this.field3634 = var2;
            if (this.field3633 > 30000) {
                try {
                    this.field3635.method1242((byte) 113);
                } catch (Exception var27) {
                }
                this.field3635 = null;
            }
        }
        field3623++;
        if (arg0 != 23180) {
            this.method1559((byte) 91);
        }
        if (this.field3635 == null) {
            return this.method1568((byte) 70) == 0 && this.method1562((byte) -41) == 0;
        }
        try {
            this.field3635.method1233(0);
            for (class65 var5 = (class65) this.field3611.method681(2); var5 != null; var5 = (class65) this.field3611.method680(arg0 - 23217)) {
                this.field3632.field588 = 0;
                this.field3632.method287(440742616, 1);
                this.field3632.method327((int) var5.field4603, false);
                this.field3635.method1243(0, this.field3632.field583, 4, (byte) -87);
                this.field3627.method683(var5, arg0 ^ 0x5AF6);
            }
            for (class65 var6 = (class65) this.field3630.method681(2); var6 != null; var6 = (class65) this.field3630.method680(120)) {
                this.field3632.field588 = 0;
                this.field3632.method287(arg0 + 440719436, 0);
                this.field3632.method327((int) var6.field4603, false);
                this.field3635.method1243(0, this.field3632.field583, 4, (byte) -102);
                this.field3631.method683(var6, 126);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3635.method1240((byte) 80);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3633 = 0;
                byte var9 = 0;
                if (this.field3640 == null) {
                    var9 = 8;
                } else if (this.field3640.field1039 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3640.field1035.field583.length - this.field3640.field1043;
                    int var11 = 512 - this.field3640.field1039;
                    if (var11 > var10 - this.field3640.field1035.field588) {
                        var11 = var10 - this.field3640.field1035.field588;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field3635.method1231(this.field3640.field1035.field588, this.field3640.field1035.field583, var11, 0);
                    if (this.field3639 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3640.field1035.field583[this.field3640.field1035.field588 + var12] = (byte) class76.method605(this.field3640.field1035.field583[this.field3640.field1035.field588 + var12], this.field3639);
                        }
                    }
                    this.field3640.field1039 += var11;
                    this.field3640.field1035.field588 += var11;
                    if (this.field3640.field1035.field588 == var10) {
                        this.field3640.method1964(arg0 ^ 0x7539);
                        this.field3640.field2386 = false;
                        this.field3640 = null;
                    } else if (this.field3640.field1039 == 512) {
                        this.field3640.field1039 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3638.field588;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3635.method1231(this.field3638.field588, this.field3638.field583, var13, 0);
                    if (this.field3639 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3638.field583[this.field3638.field588 + var14] = (byte) class76.method605(this.field3638.field583[this.field3638.field588 + var14], this.field3639);
                        }
                    }
                    this.field3638.field588 += var13;
                    if (var9 <= this.field3638.field588) {
                        if (this.field3640 == null) {
                            this.field3638.field588 = 0;
                            int var15 = this.field3638.method333((byte) -59);
                            int var16 = this.field3638.method293(arg0 ^ 0x5AE0);
                            int var17 = this.field3638.method333((byte) -59);
                            int var18 = this.field3638.method307(-109);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class65 var24;
                            if (var20) {
                                for (var24 = (class65) this.field3631.method681(arg0 ^ 0x5A8E); var24 != null && var24.field4603 != var21; var24 = (class65) this.field3631.method680(121)) {
                                }
                            } else {
                                for (var24 = (class65) this.field3627.method681(2); var24 != null && var24.field4603 != var21; var24 = (class65) this.field3627.method680(-12)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3640 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3640.field1035 = new class37(this.field3640.field1043 + var18 + var25);
                            this.field3640.field1035.method287(440742616, var19);
                            this.field3640.field1035.method289(var18, arg0 - 23308);
                            this.field3640.field1039 = 8;
                            this.field3638.field588 = 0;
                        } else if (this.field3640.field1039 != 0) {
                            throw new IOException();
                        } else if (this.field3638.field583[0] == -1) {
                            this.field3640.field1039 = 1;
                            this.field3638.field588 = 0;
                        } else {
                            this.field3640 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3635.method1242((byte) 113);
            } catch (Exception var26) {
            }
            this.field3635 = null;
            this.field3636 = -2;
            this.field3637++;
            return this.method1568((byte) -117) == 0 && this.method1562((byte) -41) == 0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIZ)V")
    public static final void method1567(int arg0, int arg1, int arg2, boolean arg3) {
        field3619++;
        class295 var4 = class250.method1673(-110, 11, arg2);
        var4.method1980(1022716908);
        if (!arg3) {
            var4.field4636 = arg1;
            var4.field4632 = arg0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)I")
    public final int method1568(byte arg0) {
        int var2 = 34 / ((-arg0 - 23) / 47);
        field3625++;
        return this.field3611.method682((byte) 64) + this.field3627.method682((byte) 64);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIBII)Le;")
    public final class65 method1569(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3613++;
        class65 var6 = new class65();
        var6.field2383 = arg0;
        var6.field1043 = arg2;
        long var7 = (long) ((arg1 << 16) + arg3);
        var6.field4603 = var7;
        if (arg0) {
            if (this.method1568((byte) -76) >= 20) {
                throw new RuntimeException();
            }
            this.field3611.method683(var6, 112);
        } else if (this.method1562((byte) -41) < 20) {
            this.field3630.method683(var6, 120);
        } else {
            throw new RuntimeException();
        }
        return arg4 == 20 ? var6 : null;
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(B)Z")
    public final boolean method1570(byte arg0) {
        field3620++;
        if (arg0 != -114) {
            this.field3640 = null;
        }
        return this.method1562((byte) -41) >= 20;
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(B)V")
    public final void method1571(byte arg0) {
        field3628++;
        if (this.field3635 == null) {
            return;
        }
        try {
            if (arg0 != -121) {
                this.method1566(-85);
            }
            this.field3632.field588 = 0;
            this.field3632.method287(arg0 ^ 0xE5BACD5F, 7);
            this.field3632.method327(0, false);
            this.field3635.method1243(0, this.field3632.field583, 4, (byte) -100);
        } catch (IOException var3) {
            try {
                this.field3635.method1242((byte) 113);
            } catch (Exception var2) {
            }
            this.field3637++;
            this.field3636 = -2;
            this.field3635 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZILkf;)V")
    public final void method1572(boolean arg0, int arg1, class184 arg2) {
        field3621++;
        if (this.field3635 != null) {
            try {
                this.field3635.method1242((byte) 113);
            } catch (Exception var9) {
            }
            this.field3635 = null;
        }
        this.field3635 = arg2;
        this.method1564(0);
        this.method1560(arg0, 108);
        this.field3640 = null;
        this.field3638.field588 = 0;
        while (true) {
            class65 var4 = (class65) this.field3627.method685(0);
            if (var4 == null) {
                int var5 = 38 / ((arg1 - 54) / 57);
                while (true) {
                    class65 var6 = (class65) this.field3631.method685(0);
                    if (var6 == null) {
                        if (this.field3639 != 0) {
                            try {
                                this.field3632.field588 = 0;
                                this.field3632.method287(440742616, 4);
                                this.field3632.method287(440742616, this.field3639);
                                this.field3632.method312(1489253544, 0);
                                this.field3635.method1243(0, this.field3632.field583, 4, (byte) -101);
                            } catch (IOException var8) {
                                try {
                                    this.field3635.method1242((byte) 113);
                                } catch (Exception var7) {
                                }
                                this.field3636 = -2;
                                this.field3637++;
                                this.field3635 = null;
                            }
                        }
                        this.field3633 = 0;
                        this.field3634 = class269.method1823(-57);
                        return;
                    }
                    this.field3630.method683(var6, 120);
                }
            }
            this.field3611.method683(var4, 123);
        }
    }

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "(B)V")
    public final void method1573(byte arg0) {
        if (this.field3635 != null) {
            this.field3635.method1239(128);
        }
        if (arg0 == -78) {
            field3624++;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3616[var0] = var1;
        }
    }
}
