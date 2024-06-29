import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class205 {

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Lef;")
    private class221 field3292 = new class221();

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lef;")
    private class221 field3297 = new class221();

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Lef;")
    private class221 field3299 = new class221();

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lef;")
    private class221 field3300 = new class221();

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "Lv;")
    private class152 field3304 = new class152(4);

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "B")
    private byte field3308 = 0;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public volatile int field3307 = 0;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public volatile int field3306 = 0;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Lv;")
    private class152 field3305 = new class152(8);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3281 = "flash2:";

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3280 = 0;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    private int field3301;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "J")
    private long field3303;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "Lki;")
    private class63 field3309;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lbb;")
    private class92 field3302;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "[[[Lkc;")
    public static class286[][][] field3288;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
    public final boolean method1494(byte arg0) {
        if (arg0 != -57) {
            this.method1498(false, true, (class92) null);
        }
        field3293++;
        return this.method1499(0) >= 20;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        class42.field590 = new class187();
        if (arg0 > 13) {
            field3289++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    private final void method1496(int arg0) {
        field3279++;
        if (arg0 <= 124 || this.field3302 == null) {
            return;
        }
        try {
            this.field3304.field2511 = 0;
            this.field3304.method1074(6, 106);
            this.field3304.method1124(-27150, 3);
            this.field3302.method726(0, 4, 29023, this.field3304.field2523);
        } catch (IOException var3) {
            try {
                this.field3302.method728((byte) -84);
            } catch (Exception var2) {
            }
            this.field3306 = -2;
            this.field3302 = null;
            this.field3307++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Z")
    public final boolean method1497(byte arg0) {
        if (this.field3302 != null) {
            long var2 = class197.method1454((byte) -104);
            int var4 = (int) (var2 - this.field3303);
            this.field3303 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3301 += var4;
            if (this.field3301 > 30000) {
                try {
                    this.field3302.method728((byte) -66);
                } catch (Exception var27) {
                }
                this.field3302 = null;
            }
        }
        field3283++;
        if (arg0 >= -43) {
            field3288 = null;
        }
        if (this.field3302 == null) {
            return this.method1501(83) == 0 && this.method1499(0) == 0;
        }
        try {
            this.field3302.method722(-21831);
            for (class63 var5 = (class63) this.field3292.method1580(32); var5 != null; var5 = (class63) this.field3292.method1583(false)) {
                this.field3304.field2511 = 0;
                this.field3304.method1074(1, 103);
                this.field3304.method1124(-27150, (int) var5.field2242);
                this.field3302.method726(0, 4, 29023, this.field3304.field2523);
                this.field3297.method1584(var5, (byte) 110);
            }
            for (class63 var6 = (class63) this.field3299.method1580(32); var6 != null; var6 = (class63) this.field3299.method1583(false)) {
                this.field3304.field2511 = 0;
                this.field3304.method1074(0, 107);
                this.field3304.method1124(-27150, (int) var6.field2242);
                this.field3302.method726(0, 4, 29023, this.field3304.field2523);
                this.field3300.method1584(var6, (byte) 127);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3302.method727(1);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3301 = 0;
                byte var9 = 0;
                if (this.field3309 == null) {
                    var9 = 8;
                } else if (this.field3309.field944 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3309.field946.field2523.length - this.field3309.field947;
                    int var11 = 512 - this.field3309.field944;
                    if (var11 > var10 - this.field3309.field946.field2511) {
                        var11 = var10 - this.field3309.field946.field2511;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field3302.method724(this.field3309.field946.field2523, 0, this.field3309.field946.field2511, var11);
                    if (this.field3308 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3309.field946.field2523[this.field3309.field946.field2511 + var12] = (byte) class148.method1051(this.field3309.field946.field2523[this.field3309.field946.field2511 + var12], this.field3308);
                        }
                    }
                    this.field3309.field946.field2511 += var11;
                    this.field3309.field944 += var11;
                    if (this.field3309.field946.field2511 == var10) {
                        this.field3309.method986(0);
                        this.field3309.field1090 = false;
                        this.field3309 = null;
                    } else if (this.field3309.field944 == 512) {
                        this.field3309.field944 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3305.field2511;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field3302.method724(this.field3305.field2523, 0, this.field3305.field2511, var13);
                    if (this.field3308 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3305.field2523[this.field3305.field2511 + var14] = (byte) class148.method1051(this.field3305.field2523[this.field3305.field2511 + var14], this.field3308);
                        }
                    }
                    this.field3305.field2511 += var13;
                    if (this.field3305.field2511 >= var9) {
                        if (this.field3309 == null) {
                            this.field3305.field2511 = 0;
                            int var15 = this.field3305.method1111(255);
                            int var16 = this.field3305.method1126(false);
                            int var17 = this.field3305.method1111(255);
                            Object var18 = null;
                            long var19 = (long) ((var15 << 16) + var16);
                            int var21 = this.field3305.method1097(127);
                            int var22 = var17 & 0x7F;
                            boolean var23 = (var17 & 0x80) != 0;
                            class63 var24;
                            if (var23) {
                                for (var24 = (class63) this.field3300.method1580(32); var24 != null && var24.field2242 != var19; var24 = (class63) this.field3300.method1583(false)) {
                                }
                            } else {
                                for (var24 = (class63) this.field3297.method1580(32); var24 != null && var24.field2242 != var19; var24 = (class63) this.field3297.method1583(false)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3309 = var24;
                            int var25 = var22 == 0 ? 5 : 9;
                            this.field3309.field946 = new class152(var21 + var25 + this.field3309.field947);
                            this.field3309.field946.method1074(var22, 86);
                            this.field3309.field946.method1119(var21, (byte) 97);
                            this.field3305.field2511 = 0;
                            this.field3309.field944 = 8;
                        } else if (this.field3309.field944 != 0) {
                            throw new IOException();
                        } else if (this.field3305.field2523[0] == -1) {
                            this.field3309.field944 = 1;
                            this.field3305.field2511 = 0;
                        } else {
                            this.field3309 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3302.method728((byte) 95);
            } catch (Exception var26) {
            }
            this.field3302 = null;
            this.field3307++;
            this.field3306 = -2;
            return this.method1501(89) == 0 && this.method1499(0) == 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZLbb;)V")
    public final void method1498(boolean arg0, boolean arg1, class92 arg2) {
        field3284++;
        if (this.field3302 != null) {
            try {
                this.field3302.method728((byte) 113);
            } catch (Exception var8) {
            }
            this.field3302 = null;
        }
        this.field3302 = arg2;
        this.method1496(127);
        this.method1508(arg1, 128);
        this.field3309 = null;
        this.field3305.field2511 = 0;
        while (true) {
            class63 var4 = (class63) this.field3297.method1581(120);
            if (var4 == null) {
                while (true) {
                    class63 var5 = (class63) this.field3300.method1581(95);
                    if (var5 == null) {
                        if (this.field3308 != 0) {
                            try {
                                this.field3304.field2511 = 0;
                                this.field3304.method1074(4, 72);
                                this.field3304.method1074(this.field3308, 103);
                                this.field3304.method1094(-700861976, 0);
                                this.field3302.method726(0, 4, 29023, this.field3304.field2523);
                            } catch (IOException var7) {
                                try {
                                    this.field3302.method728((byte) -123);
                                } catch (Exception var6) {
                                }
                                this.field3302 = null;
                                this.field3306 = -2;
                                this.field3307++;
                            }
                        }
                        if (arg0) {
                            this.field3301 = 0;
                            this.field3303 = class197.method1454((byte) -104);
                            return;
                        } else {
                            return;
                        }
                    }
                    this.field3299.method1584(var5, (byte) 113);
                }
            }
            this.field3292.method1584(var4, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I")
    private final int method1499(int arg0) {
        field3295++;
        return arg0 == 0 ? this.field3299.method1582(0) + this.field3300.method1582(0) : -60;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public static final void method1500(int arg0, int arg1, int arg2) {
        class202.field3231++;
        if (arg0 <= 125) {
            field3287 = -15;
        }
        class220.field3532.method557(99, 8);
        field3290++;
        class220.field3532.method1087(-1228597208, arg1);
        class220.field3532.method1112((byte) 3, arg2);
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I")
    public final int method1501(int arg0) {
        int var2 = 25 / ((arg0 - 15) / 56);
        field3294++;
        return this.field3292.method1582(0) + this.field3297.method1582(0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIBI)Lki;")
    public final class63 method1502(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg2 != 21863) {
            this.method1497((byte) -127);
        }
        long var6 = (long) ((arg4 << 16) + arg0);
        class63 var8 = new class63();
        var8.field2242 = var6;
        var8.field1094 = arg1;
        field3278++;
        var8.field947 = arg3;
        if (arg1) {
            if (this.method1501(-84) >= 20) {
                throw new RuntimeException();
            }
            this.field3292.method1584(var8, (byte) 114);
        } else if (this.method1499(0) < 20) {
            this.field3299.method1584(var8, (byte) 115);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public final void method1503(boolean arg0) {
        if (this.field3302 != null) {
            this.field3302.method718(true);
        }
        field3291++;
        if (!arg0) {
            this.method1494((byte) 6);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public final void method1504(boolean arg0) {
        field3282++;
        if (this.field3302 == null) {
            return;
        }
        try {
            if (!arg0) {
                this.field3302 = null;
            }
            this.field3304.field2511 = 0;
            this.field3304.method1074(7, 93);
            this.field3304.method1124(-27150, 0);
            this.field3302.method726(0, 4, 29023, this.field3304.field2523);
        } catch (IOException var3) {
            try {
                this.field3302.method728((byte) -44);
            } catch (Exception var2) {
            }
            this.field3307++;
            this.field3306 = -2;
            this.field3302 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public final void method1505(int arg0) {
        field3285++;
        if (this.field3302 != null) {
            this.field3302.method728((byte) 101);
        }
        int var2 = -90 % ((25 - arg0) / 59);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Z")
    public final boolean method1506(byte arg0) {
        if (arg0 <= 78) {
            return true;
        } else {
            field3286++;
            return this.method1501(-104) >= 20;
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public final void method1507(int arg0) {
        field3298++;
        try {
            this.field3302.method728((byte) 115);
        } catch (Exception var2) {
        }
        this.field3306 = -1;
        this.field3302 = null;
        this.field3307++;
        if (arg0 == 30000) {
            this.field3308 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
    public final void method1508(boolean arg0, int arg1) {
        field3296++;
        if (this.field3302 == null) {
            return;
        }
        try {
            if (arg1 != 128) {
                this.field3309 = null;
            }
            this.field3304.field2511 = 0;
            this.field3304.method1074(arg0 ? 2 : 3, arg1 ^ 0xF3);
            this.field3304.method1124(-27150, 0);
            this.field3302.method726(0, 4, 29023, this.field3304.field2523);
        } catch (IOException var4) {
            try {
                this.field3302.method728((byte) -102);
            } catch (Exception var3) {
            }
            this.field3306 = -2;
            this.field3302 = null;
            this.field3307++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public static void method1509(int arg0) {
        field3288 = null;
        field3281 = null;
        if (arg0 < 51) {
            method1500(-106, 126, 79);
        }
    }
}
