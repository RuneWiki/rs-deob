import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class5 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lic;")
    private class109 field43 = new class109();

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Lic;")
    private class109 field60 = new class109();

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    private int field62 = 0;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lic;")
    private class109 field61 = new class109();

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Lic;")
    private class109 field63 = new class109();

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "Lja;")
    private class60 field64 = new class60(4);

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public volatile int field70 = 0;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public volatile int field71 = 0;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "B")
    private byte field72 = 0;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "Lja;")
    private class60 field69 = new class60(8);

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lmc;")
    public static class170 field52 = new class170();

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "[I")
    public static int[] field59 = new int[2];

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lwa;")
    public static class75 field56 = class66.method560("mapdots", false);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    private int field66;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "J")
    private long field67;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "Lam;")
    private class240 field73;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "Lpi;")
    private class294 field68;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)Z", line = 12)
    public final boolean method22(byte arg0) {
        if (arg0 <= 49) {
            method30(83);
        }
        field42++;
        return this.field65 >= 20;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)V", line = 25)
    public final void method23(int arg0, boolean arg1) {
        field53++;
        if (this.field68 == null) {
            return;
        }
        try {
            this.field64.field1012 = 0;
            this.field64.method518(101, arg1 ? 2 : 3);
            this.field64.method526(0, (byte) 57);
            if (arg0 != 2) {
                this.field60 = (class109) null;
            }
            this.field68.method2043(this.field64.field997, 4, 0, arg0 ^ 0xFFFF84CA);
        } catch (IOException var6) {
            try {
                this.field68.method2048((byte) -109);
            } catch (Exception var5) {
            }
            this.field71++;
            this.field68 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Z", line = 51)
    public final boolean method24(int arg0) {
        if (arg0 > -12) {
            this.field63 = (class109) null;
        }
        field51++;
        return this.field62 >= 20;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V", line = 62)
    public final void method25(boolean arg0) {
        this.field70++;
        this.field72 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0) {
            this.method25(true);
        }
        field58++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V", line = 74)
    public final void method26(byte arg0) {
        if (arg0 >= -90) {
            field57 = -127;
        }
        if (this.field68 != null) {
            this.field68.method2048((byte) -104);
        }
        field49++;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lpi;ZZ)V", line = 97)
    public final void method27(class294 arg0, boolean arg1, boolean arg2) {
        field45++;
        if (this.field68 != null) {
            try {
                this.field68.method2048((byte) -61);
            } catch (Exception var11) {
            }
            this.field68 = null;
        }
        this.field68 = arg0;
        this.method31((byte) -75);
        this.method23(2, arg1);
        this.field69.field1012 = 0;
        this.field73 = null;
        while (true) {
            class240 var5 = (class240) this.field60.method853((byte) 44);
            if (var5 == null) {
                while (true) {
                    class240 var6 = (class240) this.field63.method853((byte) 59);
                    if (var6 == null) {
                        if (arg2) {
                            this.field65 = -80;
                        }
                        if (this.field72 != 0) {
                            try {
                                this.field64.field1012 = 0;
                                this.field64.method518(109, 4);
                                this.field64.method518(103, this.field72);
                                this.field64.method503(-597878072, 0);
                                this.field68.method2043(this.field64.field997, 4, 0, -31544);
                            } catch (IOException var10) {
                                try {
                                    this.field68.method2048((byte) -106);
                                } catch (Exception var9) {
                                }
                                this.field71++;
                                this.field68 = null;
                            }
                        }
                        this.field66 = 0;
                        this.field67 = class78.method669(2047);
                        return;
                    }
                    this.field61.method854(!arg2, var6);
                }
            }
            this.field43.method854(true, var5);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BIIZI)Lam;", line = 167)
    public final class240 method28(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field50++;
        long var6 = (long) ((arg1 << 16) + arg2);
        class240 var8 = new class240();
        var8.field4048 = arg0;
        var8.field4580 = arg3;
        var8.field4682 = var6;
        if (arg3) {
            if (this.field62 >= 20) {
                throw new RuntimeException();
            }
            this.field43.method854(true, var8);
            this.field62++;
        } else if (this.field65 < 20) {
            this.field61.method854(true, var8);
            this.field65++;
        } else {
            throw new RuntimeException();
        }
        if (arg4 != 28169) {
            this.method22((byte) 21);
        }
        return var8;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I", line = 211)
    public final int method29(int arg0) {
        field48++;
        if (arg0 != 0) {
            this.method32(false);
        }
        return this.field62;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 225)
    public static final void method30(int arg0) {
        field47++;
        if (arg0 < -21) {
            class213.field3623.method1201(-20111);
            class210.field3591.method1201(-20111);
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V", line = 237)
    private final void method31(byte arg0) {
        field44++;
        if (this.field68 == null) {
            return;
        }
        try {
            this.field64.field1012 = 0;
            this.field64.method518(116, 6);
            this.field64.method526(2, (byte) 120);
            this.field68.method2043(this.field64.field997, 4, 0, -31544);
        } catch (IOException var5) {
            try {
                this.field68.method2048((byte) -67);
            } catch (Exception var4) {
            }
            this.field71++;
            this.field68 = null;
        }
        if (arg0 > -18) {
            this.method25(true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z", line = 266)
    public final boolean method32(boolean arg0) {
        field46++;
        long var2 = class78.method669(2047);
        int var4 = (int) (var2 - this.field67);
        this.field67 = var2;
        if (var4 > 200) {
            var4 = 200;
        }
        this.field66 += var4;
        if (this.field62 == 0 && this.field65 == 0) {
            if (this.field68 == null) {
                return true;
            }
            if (this.field66 > 30000) {
                try {
                    this.field68.method2048((byte) -57);
                } catch (Exception var29) {
                }
                this.field68 = null;
                return true;
            }
        } else if (this.field68 == null) {
            return false;
        }
        boolean var6 = arg0;
        try {
            for (class240 var7 = (class240) this.field43.method857((byte) -35); var7 != null; var7 = (class240) this.field43.method859(27260)) {
                this.field64.field1012 = 0;
                this.field64.method518(118, 1);
                this.field64.method526((int) var7.field4682, (byte) 73);
                this.field68.method2043(this.field64.field997, 4, 0, -31544);
                this.field60.method854(true, var7);
            }
            for (class240 var8 = (class240) this.field61.method857((byte) -35); var8 != null; var8 = (class240) this.field61.method859(27260)) {
                this.field64.field1012 = 0;
                this.field64.method518(100, 0);
                this.field64.method526((int) var8.field4682, (byte) 62);
                this.field68.method2043(this.field64.field997, 4, 0, -31544);
                this.field63.method854(!arg0, var8);
            }
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field68.method2042(-112);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                this.field66 = 0;
                byte var11 = 0;
                if (this.field73 == null) {
                    var11 = 8;
                } else if (this.field73.field4053 == 0) {
                    var11 = 1;
                }
                if (var11 <= 0) {
                    int var12 = this.field73.field4047.field997.length - this.field73.field4048;
                    int var13 = 512 - this.field73.field4053;
                    if (var12 - this.field73.field4047.field1012 < var13) {
                        var13 = var12 - this.field73.field4047.field1012;
                    }
                    if (var10 < var13) {
                        var13 = var10;
                    }
                    this.field68.method2047(this.field73.field4047.field997, this.field73.field4047.field1012, var13, -3532);
                    if (this.field72 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field73.field4047.field997[this.field73.field4047.field1012 + var14] = (byte) class93.method728(this.field73.field4047.field997[this.field73.field4047.field1012 + var14], this.field72);
                        }
                    }
                    this.field73.field4047.field1012 += var13;
                    this.field73.field4053 += var13;
                    if (this.field73.field4047.field1012 == var12) {
                        this.field73.method1937(61);
                        if (this.field73.field4580) {
                            this.field62--;
                        } else {
                            this.field65--;
                        }
                        this.field73.field4575 = false;
                        this.field73 = null;
                    } else if (this.field73.field4053 == 512) {
                        this.field73.field4053 = 0;
                    }
                } else {
                    int var15 = var11 - this.field69.field1012;
                    if (var10 < var15) {
                        var15 = var10;
                    }
                    this.field68.method2047(this.field69.field997, this.field69.field1012, var15, -3532);
                    if (this.field72 != 0) {
                        for (int var16 = 0; var16 < var15; var16++) {
                            this.field69.field997[this.field69.field1012 + var16] = (byte) class93.method728(this.field69.field997[this.field69.field1012 + var16], this.field72);
                        }
                    }
                    this.field69.field1012 += var15;
                    if (var11 <= this.field69.field1012) {
                        if (this.field73 == null) {
                            this.field69.field1012 = 0;
                            if (this.field69.method499((byte) -54) == -72057594037927937L) {
                                var6 = true;
                                this.field69.field1012 = 0;
                            } else {
                                this.field69.field1012 = 0;
                                int var17 = this.field69.method501(0);
                                int var18 = this.field69.method485((byte) -2);
                                int var19 = this.field69.method501(0);
                                int var20 = this.field69.method505(255);
                                long var21 = (long) ((var17 << 16) + var18);
                                Object var23 = null;
                                class240 var24 = (class240) this.field60.method857((byte) -35);
                                label164: while (true) {
                                    if (var24 == null) {
                                        var24 = (class240) this.field63.method857((byte) -35);
                                        while (true) {
                                            if (var24 == null || var24.field4682 == var21) {
                                                break label164;
                                            }
                                            var24 = (class240) this.field63.method859(27260);
                                        }
                                    }
                                    if (var24.field4682 == var21) {
                                        break;
                                    }
                                    var24 = (class240) this.field60.method859(27260);
                                }
                                if (var24 == null) {
                                    throw new IOException();
                                }
                                this.field73 = var24;
                                int var25 = var19 == 0 ? 5 : 9;
                                this.field73.field4047 = new class60(var20 + var25 + this.field73.field4048);
                                this.field73.field4047.method518(105, var19);
                                this.field73.field4047.method510(var20, 119);
                                this.field73.field4053 = 8;
                                this.field69.field1012 = 0;
                            }
                        } else if (this.field73.field4053 != 0) {
                            throw new IOException();
                        } else if (this.field69.field997[0] == -1) {
                            this.field73.field4053 = 1;
                            this.field69.field1012 = 0;
                        } else {
                            this.field73 = null;
                        }
                    }
                }
            }
            if (var6) {
                this.field64.field1012 = 0;
                this.field64.method518(115, 5);
                this.field68.method2043(this.field64.field997, 4, 0, -31544);
            }
            return true;
        } catch (IOException var30) {
            try {
                this.field68.method2048((byte) -125);
            } catch (Exception var28) {
            }
            this.field68 = null;
            this.field71++;
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)V", line = 557)
    public static void method33(byte arg0) {
        if (arg0 != 69) {
            field57 = -60;
        }
        field59 = null;
        field56 = null;
        field52 = null;
    }
}
