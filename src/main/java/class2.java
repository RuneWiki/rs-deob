import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Lre;")
    private class603 field10 = new class603();

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "Lre;")
    private class603 field26 = new class603();

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "Lre;")
    private class603 field27 = new class603();

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "Lre;")
    private class603 field28 = new class603();

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "Lrg;")
    private class645 field31 = new class645(4);

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "I")
    public volatile int field33 = 0;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "B")
    private byte field34 = 0;

    @OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
    public volatile int field36 = 0;

    @OriginalMember(owner = "client!ro", name = "C", descriptor = "Lrg;")
    private class645 field35 = new class645(8);

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field21 = -2;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "J")
    private long field32;

    @OriginalMember(owner = "client!ro", name = "E", descriptor = "Ldia;")
    private class234 field37;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "Lle;")
    private class308 field29;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Ljo;")
    public static class336 field18;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "[[[B")
    public static byte[][][] field24;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method6(boolean arg0) {
        if (this.field29 != null) {
            long var2 = class524.method3075(18);
            int var4 = (int) (var2 - this.field32);
            this.field32 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field30 += var4;
            if (this.field30 > 30000) {
                try {
                    this.field29.method1953((byte) 13);
                } catch (Exception var27) {
                }
                this.field29 = null;
            }
        }
        field14++;
        if (this.field29 == null) {
            return this.method13((byte) -52) == 0 && this.method11(-2) == 0;
        }
        try {
            this.field29.method1946(1);
            if (!arg0) {
                this.field36 = 9;
            }
            for (class234 var5 = (class234) this.field10.method3508(-2); var5 != null; var5 = (class234) this.field10.method3507(-48)) {
                this.field31.field9084 = 0;
                this.field31.method3730(110, 1);
                this.field31.method3754((byte) 80, (int) var5.field6154);
                this.field29.method1950(0, this.field31.field9068, 4, 5000);
                this.field26.method3505(var5, 4);
            }
            for (class234 var6 = (class234) this.field27.method3508(-2); var6 != null; var6 = (class234) this.field27.method3507(-48)) {
                this.field31.field9084 = 0;
                this.field31.method3730(108, 0);
                this.field31.method3754((byte) 80, (int) var6.field6154);
                this.field29.method1950(0, this.field31.field9068, 4, 5000);
                this.field28.method3505(var6, 4);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field29.method1951((byte) 120);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field30 = 0;
                byte var9 = 0;
                if (this.field37 == null) {
                    var9 = 8;
                } else if (this.field37.field3405 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field35.field9084;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field29.method1948(var10, this.field35.field9084, (byte) 12, this.field35.field9068);
                    if (this.field34 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field35.field9068[this.field35.field9084 + var11] = (byte) class513.method3033(this.field35.field9068[this.field35.field9084 + var11], this.field34);
                        }
                    }
                    this.field35.field9084 += var10;
                    if (this.field35.field9084 >= var9) {
                        if (this.field37 == null) {
                            this.field35.field9084 = 0;
                            int var12 = this.field35.method3745(-6314);
                            int var13 = this.field35.method3712((byte) 13);
                            int var14 = this.field35.method3745(-6314);
                            int var15 = this.field35.method3720(-19541);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class234 var21;
                            if (var17) {
                                for (var21 = (class234) this.field28.method3508(-2); var21 != null && var21.field6154 != var18; var21 = (class234) this.field28.method3507(-106)) {
                                }
                            } else {
                                for (var21 = (class234) this.field26.method3508(-2); var21 != null && var21.field6154 != var18; var21 = (class234) this.field26.method3507(-111)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field37 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field37.field3403 = new class645(var15 + var22 + this.field37.field3406);
                            this.field37.field3403.method3730(116, var16);
                            this.field37.field3403.method3695(var15, 255);
                            this.field37.field3405 = 8;
                            this.field35.field9084 = 0;
                        } else if (this.field37.field3405 != 0) {
                            throw new IOException();
                        } else if (this.field35.field9068[0] == -1) {
                            this.field35.field9084 = 0;
                            this.field37.field3405 = 1;
                        } else {
                            this.field37 = null;
                        }
                    }
                } else {
                    int var23 = this.field37.field3403.field9068.length - this.field37.field3406;
                    int var24 = 512 - this.field37.field3405;
                    if ((var23 - this.field37.field3403.field9084) < var24) {
                        var24 = var23 - this.field37.field3403.field9084;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field29.method1948(var24, this.field37.field3403.field9084, (byte) 12, this.field37.field3403.field9068);
                    if (this.field34 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field37.field3403.field9068[this.field37.field3403.field9084 + var25] = (byte) class513.method3033(this.field37.field3403.field9068[this.field37.field3403.field9084 + var25], this.field34);
                        }
                    }
                    this.field37.field3405 += var24;
                    this.field37.field3403.field9084 += var24;
                    if (this.field37.field3403.field9084 == var23) {
                        this.field37.method2597(105);
                        this.field37.field3226 = false;
                        this.field37 = null;
                    } else if (this.field37.field3405 == 512) {
                        this.field37.field3405 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field29.method1953((byte) 13);
            } catch (Exception var26) {
            }
            this.field36 = -2;
            this.field33++;
            this.field29 = null;
            return this.method13((byte) 75) == 0 && this.method11(-2) == 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 280)
    public final void method7(byte arg0) {
        field8++;
        if (this.field29 == null) {
            return;
        }
        if (arg0 < 49) {
            this.method13((byte) -10);
        }
        try {
            this.field31.field9084 = 0;
            this.field31.method3730(101, 7);
            this.field31.method3754((byte) 80, 0);
            this.field29.method1950(0, this.field31.field9068, 4, 5000);
        } catch (IOException var3) {
            try {
                this.field29.method1953((byte) 13);
            } catch (Exception var2) {
            }
            this.field33++;
            this.field29 = null;
            this.field36 = -2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lle;BZ)V", line = 308)
    public final void method8(class308 arg0, byte arg1, boolean arg2) {
        if (this.field29 != null) {
            try {
                this.field29.method1953((byte) 13);
            } catch (Exception var9) {
            }
            this.field29 = null;
        }
        field9++;
        this.field29 = arg0;
        this.method21(-106);
        this.method20(arg2, 96);
        int var4 = 16 % ((arg1 - 34) / 39);
        this.field35.field9084 = 0;
        this.field37 = null;
        while (true) {
            class234 var5 = (class234) this.field26.method3510(-90);
            if (var5 == null) {
                while (true) {
                    class234 var6 = (class234) this.field28.method3510(-94);
                    if (var6 == null) {
                        if (this.field34 != 0) {
                            try {
                                this.field31.field9084 = 0;
                                this.field31.method3730(127, 4);
                                this.field31.method3730(120, this.field34);
                                this.field31.method3702(0, (byte) -127);
                                this.field29.method1950(0, this.field31.field9068, 4, 5000);
                            } catch (IOException var8) {
                                try {
                                    this.field29.method1953((byte) 13);
                                } catch (Exception var7) {
                                }
                                this.field29 = null;
                                this.field33++;
                                this.field36 = -2;
                            }
                        }
                        this.field30 = 0;
                        this.field32 = class524.method3075(18);
                        return;
                    }
                    this.field27.method3505(var6, 4);
                }
            }
            this.field10.method3505(var5, 4);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Z", line = 378)
    public final boolean method9(int arg0) {
        if (arg0 != 14879) {
            this.method9(-97);
        }
        field12++;
        return this.method13((byte) 105) >= 20;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lha;I)V", line = 389)
    public static final void method10(class60 arg0, int arg1) {
        if (class483.field6967) {
            class538.method3158(arg1 ^ 0x71CA, arg0);
        } else {
            class313.method1983(arg0, -18009);
        }
        field13++;
        if (arg1 != 29085) {
            field21 = 110;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)I", line = 404)
    private final int method11(int arg0) {
        field19++;
        if (arg0 != -2) {
            this.field37 = null;
        }
        return this.field27.method3506((byte) -107) + this.field28.method3506((byte) -94);
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V", line = 416)
    public final void method12(byte arg0) {
        if (arg0 > -10) {
            this.field37 = null;
        }
        field22++;
        if (this.field29 != null) {
            this.field29.method1947(0);
        }
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)I", line = 430)
    public final int method13(byte arg0) {
        field17++;
        int var2 = -56 % ((16 - arg0) / 56);
        return this.field10.method3506((byte) -120) + this.field26.method3506((byte) -118);
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(B)Z", line = 444)
    public final boolean method14(byte arg0) {
        if (arg0 == 25) {
            field20++;
            return this.method11(-2) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(B)V", line = 457)
    public final void method15(byte arg0) {
        try {
            if (arg0 >= -90) {
                return;
            }
            this.field29.method1953((byte) 13);
        } catch (Exception var2) {
        }
        field25++;
        this.field36 = -1;
        this.field34 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field33++;
        this.field29 = null;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V", line = 478)
    public final void method16(int arg0) {
        field11++;
        if (arg0 != 0) {
            this.field37 = null;
        }
        if (this.field29 != null) {
            this.field29.method1953((byte) 13);
        }
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(B)V", line = 493)
    public static void method17(byte arg0) {
        field18 = null;
        field24 = null;
        int var1 = -37 % ((74 - arg0) / 34);
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V", line = 507)
    public static final void method18(int arg0) {
        field15++;
        if (arg0 > -92) {
            field21 = -68;
        }
        for (class650 var1 = (class650) class209.field3054.method1195(0); var1 != null; var1 = (class650) class209.field3054.method1201(2)) {
            class402 var2 = var1.field9154;
            if (var2.field5999) {
                var1.method1304((byte) 7);
                var2.method2547(-128);
            } else if (var2.field5993 <= class357.field5189) {
                var2.method2548(-26266, class12.field171);
                if (var2.field5999) {
                    var1.method1304((byte) 7);
                } else {
                    class9.method57(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBIZI)Ldia;", line = 547)
    public final class234 method19(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field16++;
        long var6 = (long) ((arg4 << 16) + arg0);
        class234 var8 = new class234();
        var8.field6154 = var6;
        var8.field3228 = arg3;
        var8.field3406 = arg1;
        if (arg2 < 95) {
            this.method7((byte) -69);
        }
        if (arg3) {
            if (this.method13((byte) 79) >= 20) {
                throw new RuntimeException();
            }
            this.field10.method3505(var8, 4);
        } else if (this.method11(-2) < 20) {
            this.field27.method3505(var8, 4);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V", line = 596)
    public final void method20(boolean arg0, int arg1) {
        field23++;
        if (this.field29 == null) {
            return;
        }
        if (arg1 < 50) {
            this.method9(-1);
        }
        try {
            this.field31.field9084 = 0;
            this.field31.method3730(108, arg0 ? 2 : 3);
            this.field31.method3754((byte) 80, 0);
            this.field29.method1950(0, this.field31.field9068, 4, 5000);
        } catch (IOException var4) {
            try {
                this.field29.method1953((byte) 13);
            } catch (Exception var3) {
            }
            this.field29 = null;
            this.field36 = -2;
            this.field33++;
        }
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)V", line = 623)
    private final void method21(int arg0) {
        field7++;
        if (this.field29 == null) {
            return;
        }
        if (arg0 >= -96) {
            method18(-36);
        }
        try {
            this.field31.field9084 = 0;
            this.field31.method3730(123, 6);
            this.field31.method3754((byte) 80, 3);
            this.field29.method1950(0, this.field31.field9068, 4, 5000);
        } catch (IOException var3) {
            try {
                this.field29.method1953((byte) 13);
            } catch (Exception var2) {
            }
            this.field29 = null;
            this.field33++;
            this.field36 = -2;
        }
    }
}
