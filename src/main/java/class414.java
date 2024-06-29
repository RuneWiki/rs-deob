import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class414 {

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lst;")
    private class366 field5858 = new class366();

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lst;")
    private class366 field5861 = new class366();

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lst;")
    private class366 field5862 = new class366();

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Lst;")
    private class366 field5863 = new class366();

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Ldaa;")
    private class11 field5864 = new class11(4);

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public volatile int field5869 = 0;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public volatile int field5870 = 0;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "B")
    private byte field5871 = 0;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "Ldaa;")
    private class11 field5868 = new class11(8);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Lcba;")
    public static class471 field5845 = new class471(103, -1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    private int field5865;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "J")
    private long field5866;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Leo;")
    private class246 field5867;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Luca;")
    private class437 field5872;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
    public final boolean method2478(int arg0) {
        if (arg0 == -21) {
            field5844++;
            return this.method2490(-109) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BZ)V")
    public final void method2479(byte arg0, boolean arg1) {
        field5853++;
        if (this.field5867 == null) {
            return;
        }
        try {
            this.field5864.field165 = 0;
            if (arg0 != -58) {
                this.method2485(-121);
            }
            this.field5864.method108((byte) -128, arg1 ? 2 : 3);
            this.field5864.method88(true, 0);
            this.field5867.method1521(false, 4, 0, this.field5864.field138);
        } catch (IOException var4) {
            try {
                this.field5867.method1528(-2);
            } catch (Exception var3) {
            }
            this.field5869++;
            this.field5867 = null;
            this.field5870 = -2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method2480(byte arg0) {
        if (arg0 <= 110) {
            this.field5862 = null;
        }
        if (this.field5867 != null) {
            this.field5867.method1528(-2);
        }
        field5847++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIBI)Luca;")
    public final class437 method2481(boolean arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5846++;
        long var6 = (long) ((arg1 << 16) + arg4);
        class437 var8 = new class437();
        var8.field791 = arg0;
        var8.field2110 = var6;
        var8.field6206 = arg3;
        if (arg0) {
            if (this.method2486((byte) -98) >= 20) {
                throw new RuntimeException();
            }
            this.field5858.method2199(-23751, var8);
        } else if (this.method2490(arg2 - 7231) < 20) {
            this.field5862.method2199(-23751, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg2 != 7126) {
            this.method2485(71);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method2482(int arg0) {
        field5845 = null;
        if (arg0 != -26512) {
            method2482(-101);
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    private final void method2483(int arg0) {
        field5854++;
        if (this.field5867 == null) {
            return;
        }
        try {
            this.field5864.field165 = 0;
            this.field5864.method108((byte) -128, 6);
            this.field5864.method88(true, 3);
            this.field5867.method1521(false, 4, arg0, this.field5864.field138);
        } catch (IOException var3) {
            try {
                this.field5867.method1528(-2);
            } catch (Exception var2) {
            }
            this.field5867 = null;
            this.field5870 = -2;
            this.field5869++;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public final void method2484(boolean arg0) {
        try {
            this.field5867.method1528(-2);
        } catch (Exception var2) {
        }
        field5860++;
        this.field5869++;
        this.field5870 = -1;
        this.field5867 = null;
        this.field5871 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0) {
            this.field5865 = -127;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final void method2485(int arg0) {
        field5850++;
        if (this.field5867 == null) {
            return;
        }
        int var2 = 111 % ((arg0 - 21) / 45);
        try {
            this.field5864.field165 = 0;
            this.field5864.method108((byte) -128, 7);
            this.field5864.method88(true, 0);
            this.field5867.method1521(false, 4, 0, this.field5864.field138);
        } catch (IOException var4) {
            try {
                this.field5867.method1528(-2);
            } catch (Exception var3) {
            }
            this.field5867 = null;
            this.field5869++;
            this.field5870 = -2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
    public final int method2486(byte arg0) {
        field5851++;
        int var2 = 76 / (arg0 / 34);
        return this.field5858.method2195((byte) -43) + this.field5861.method2195((byte) -43);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLeo;)V")
    public final void method2487(int arg0, boolean arg1, class246 arg2) {
        field5856++;
        if (this.field5867 != null) {
            try {
                this.field5867.method1528(-2);
            } catch (Exception var8) {
            }
            this.field5867 = null;
        }
        this.field5867 = arg2;
        this.method2483(0);
        this.method2479((byte) -58, arg1);
        this.field5868.field165 = 0;
        this.field5872 = null;
        while (true) {
            class437 var4 = (class437) this.field5861.method2193(-11636);
            if (var4 == null) {
                while (true) {
                    class437 var5 = (class437) this.field5863.method2193(-11636);
                    if (var5 == null) {
                        if (this.field5871 != 0) {
                            try {
                                this.field5864.field165 = 0;
                                this.field5864.method108((byte) -128, 4);
                                this.field5864.method108((byte) -128, this.field5871);
                                this.field5864.method84(0, (byte) -128);
                                this.field5867.method1521(false, 4, 0, this.field5864.field138);
                            } catch (IOException var7) {
                                try {
                                    this.field5867.method1528(-2);
                                } catch (Exception var6) {
                                }
                                this.field5867 = null;
                                this.field5869++;
                                this.field5870 = -2;
                            }
                        }
                        this.field5865 = 0;
                        this.field5866 = class488.method2835(30160);
                        if (arg0 == 200) {
                            return;
                        } else {
                            this.method2487(58, true, null);
                            return;
                        }
                    }
                    this.field5862.method2199(-23751, var5);
                }
            }
            this.field5858.method2199(-23751, var4);
        }
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)Z")
    public final boolean method2488(int arg0) {
        if (arg0 != -5973) {
            this.method2484(false);
        }
        field5843++;
        if (this.field5867 != null) {
            long var2 = class488.method2835(arg0 ^ 0xFFFF9D7B);
            int var4 = (int) (var2 - this.field5866);
            this.field5866 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5865 += var4;
            if (this.field5865 > 30000) {
                try {
                    this.field5867.method1528(-2);
                } catch (Exception var27) {
                }
                this.field5867 = null;
            }
        }
        if (this.field5867 == null) {
            return this.method2486((byte) -52) == 0 && this.method2490(-113) == 0;
        }
        try {
            this.field5867.method1522(0);
            for (class437 var5 = (class437) this.field5858.method2197(0); var5 != null; var5 = (class437) this.field5858.method2200(-1)) {
                this.field5864.field165 = 0;
                this.field5864.method108((byte) -128, 1);
                this.field5864.method88(true, (int) var5.field2110);
                this.field5867.method1521(false, 4, 0, this.field5864.field138);
                this.field5861.method2199(-23751, var5);
            }
            for (class437 var6 = (class437) this.field5862.method2197(0); var6 != null; var6 = (class437) this.field5862.method2200(-1)) {
                this.field5864.field165 = 0;
                this.field5864.method108((byte) -128, 0);
                this.field5864.method88(true, (int) var6.field2110);
                this.field5867.method1521(false, 4, 0, this.field5864.field138);
                this.field5863.method2199(-23751, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5867.method1527(2);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5865 = 0;
                byte var9 = 0;
                if (this.field5872 == null) {
                    var9 = 8;
                } else if (this.field5872.field6203 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field5872.field6204.field138.length - this.field5872.field6206;
                    int var11 = 512 - this.field5872.field6203;
                    if (var11 > (var10 - this.field5872.field6204.field165)) {
                        var11 = var10 - this.field5872.field6204.field165;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field5867.method1523(this.field5872.field6204.field138, var11, this.field5872.field6204.field165, arg0 ^ 0x1754);
                    if (this.field5871 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field5872.field6204.field138[this.field5872.field6204.field165 + var12] = (byte) class133.method898(this.field5872.field6204.field138[this.field5872.field6204.field165 + var12], this.field5871);
                        }
                    }
                    this.field5872.field6204.field165 += var11;
                    this.field5872.field6203 += var11;
                    if (this.field5872.field6204.field165 == var10) {
                        this.field5872.method896(arg0 + 5973);
                        this.field5872.field792 = false;
                        this.field5872 = null;
                    } else if (this.field5872.field6203 == 512) {
                        this.field5872.field6203 = 0;
                    }
                } else {
                    int var13 = var9 - this.field5868.field165;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field5867.method1523(this.field5868.field138, var13, this.field5868.field165, -1);
                    if (this.field5871 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field5868.field138[this.field5868.field165 + var14] = (byte) class133.method898(this.field5868.field138[this.field5868.field165 + var14], this.field5871);
                        }
                    }
                    this.field5868.field165 += var13;
                    if (var9 <= this.field5868.field165) {
                        if (this.field5872 == null) {
                            this.field5868.field165 = 0;
                            int var15 = this.field5868.method110((byte) 98);
                            int var16 = this.field5868.method93((byte) 83);
                            int var17 = this.field5868.method110((byte) 93);
                            int var18 = this.field5868.method119(-121);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class437 var24;
                            if (var20) {
                                for (var24 = (class437) this.field5863.method2197(0); var24 != null && var24.field2110 != var21; var24 = (class437) this.field5863.method2200(-1)) {
                                }
                            } else {
                                for (var24 = (class437) this.field5861.method2197(0); var24 != null && var24.field2110 != var21; var24 = (class437) this.field5861.method2200(-1)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field5872 = var24;
                            this.field5872.field6204 = new class11(var18 + var25 + this.field5872.field6206);
                            this.field5872.field6204.method108((byte) -128, var19);
                            this.field5872.field6204.method117(-26, var18);
                            this.field5868.field165 = 0;
                            this.field5872.field6203 = 8;
                        } else if (this.field5872.field6203 != 0) {
                            throw new IOException();
                        } else if (this.field5868.field138[0] == -1) {
                            this.field5868.field165 = 0;
                            this.field5872.field6203 = 1;
                        } else {
                            this.field5872 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5867.method1528(-2);
            } catch (Exception var26) {
            }
            this.field5867 = null;
            this.field5869++;
            this.field5870 = -2;
            return this.method2486((byte) 46) == 0 && this.method2490(-118) == 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public final void method2489(int arg0) {
        if (this.field5867 != null) {
            this.field5867.method1524(68);
        }
        if (arg0 != 31995) {
            this.method2485(99);
        }
        field5852++;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)I")
    private final int method2490(int arg0) {
        field5855++;
        if (arg0 > -74) {
            this.field5867 = null;
        }
        return this.field5862.method2195((byte) -43) + this.field5863.method2195((byte) -43);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
    public static final boolean method2491(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field5859++;
            return (arg1 & 0x580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Z")
    public final boolean method2492(boolean arg0) {
        if (!arg0) {
            this.method2485(-70);
        }
        field5857++;
        return this.method2486((byte) 34) >= 20;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2493(int arg0, boolean arg1, int arg2) {
        field5849++;
        if ((class80.field1299[1][arg2][arg0] & 0x2) == 0) {
            return arg1 ? false : false;
        } else {
            return true;
        }
    }
}
