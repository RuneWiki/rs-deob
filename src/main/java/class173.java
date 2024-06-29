import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class173 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lij;")
    private class242 field3080 = new class242();

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lij;")
    private class242 field3089 = new class242();

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Lij;")
    private class242 field3097 = new class242();

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lij;")
    private class242 field3098 = new class242();

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lwe;")
    private class75 field3103 = new class75(4);

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "B")
    private byte field3106 = 0;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public volatile int field3107 = 0;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public volatile int field3105 = 0;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Lwe;")
    private class75 field3108 = new class75(8);

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lha;")
    public static class46 field3079 = class271.method1828("Hidden)2", -46);

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lha;")
    public static class46 field3083 = class271.method1828("; version=1; path=)4; domain=", -46);

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3093 = 0;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lha;")
    public static class46 field3087 = class271.method1828("Hierhin gehen", -46);

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lha;")
    public static class46 field3082 = class271.method1828("Gegenstand f-Ur Mitglieder", -46);

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "Lha;")
    public static class46 field3095 = class271.method1828("Benutzeroberfl-=che geladen)3", -46);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "J")
    private long field3100;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Laj;")
    private class109 field3101;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "Lsk;")
    private class177 field3109;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    private final void method1229(int arg0) {
        field3088++;
        if (this.field3101 == null) {
            return;
        }
        try {
            this.field3103.field1380 = 0;
            if (arg0 == 14067) {
                this.field3103.method570(6, 15619);
                this.field3103.method586(false, 3);
                this.field3101.method860(0, this.field3103.field1368, 4, 87);
            }
        } catch (IOException var3) {
            try {
                this.field3101.method852(5790);
            } catch (Exception var2) {
            }
            this.field3107++;
            this.field3105 = -2;
            this.field3101 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V")
    public final void method1230(int arg0) {
        field3075++;
        try {
            this.field3101.method852(5790);
        } catch (Exception var2) {
        }
        if (arg0 != 102) {
            this.method1234(-11);
        }
        this.field3106 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3107++;
        this.field3105 = -1;
        this.field3101 = null;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public static final void method1231(int arg0) {
        field3084++;
        class65 var1 = (class65) class174.field3143.method264(-48);
        if (arg0 != 200) {
            method1235((byte) 20);
        }
        while (var1 != null) {
            if (var1.field1100 > 0) {
                var1.field1100--;
            }
            if (var1.field1100 != 0) {
                if (var1.field1105 > 0) {
                    var1.field1105--;
                }
                if (var1.field1105 == 0 && var1.field1094 >= 1 && var1.field1096 >= 1 && var1.field1094 <= 102 && var1.field1096 <= 102 && (var1.field1108 < 0 || class209.method1473(arg0 - 196, var1.field1098, var1.field1108))) {
                    class65.method452(var1.field1098, (byte) -26, var1.field1109, var1.field1103, var1.field1096, var1.field1090, var1.field1094, var1.field1108);
                    var1.field1105 = -1;
                    if (var1.field1108 == var1.field1091 && var1.field1091 == -1) {
                        var1.method501(0);
                    } else if (var1.field1108 == var1.field1091 && var1.field1092 == var1.field1090 && var1.field1112 == var1.field1098) {
                        var1.method501(arg0 ^ 0xC8);
                    }
                }
            } else if (var1.field1091 < 0 || class209.method1473(4, var1.field1112, var1.field1091)) {
                class65.method452(var1.field1112, (byte) -52, var1.field1109, var1.field1103, var1.field1096, var1.field1092, var1.field1094, var1.field1091);
                var1.method501(0);
            }
            var1 = (class65) class174.field3143.method269((byte) 7);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Z")
    public final boolean method1232(int arg0) {
        field3096++;
        int var2 = -35 / ((arg0 - 36) / 50);
        return this.method1237(12297) >= 20;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public final void method1233(byte arg0) {
        field3090++;
        if (this.field3101 == null) {
            return;
        }
        try {
            this.field3103.field1380 = 0;
            this.field3103.method570(7, 15619);
            int var2 = 56 % ((69 - arg0) / 42);
            this.field3103.method586(false, 0);
            this.field3101.method860(0, this.field3103.field1368, 4, 121);
        } catch (IOException var4) {
            try {
                this.field3101.method852(5790);
            } catch (Exception var3) {
            }
            this.field3105 = -2;
            this.field3101 = null;
            this.field3107++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Z")
    public final boolean method1234(int arg0) {
        field3077++;
        if (this.field3101 != null) {
            long var2 = class223.method1537(arg0 ^ 0xFFFF9807);
            int var4 = (int) (var2 - this.field3100);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3100 = var2;
            this.field3104 += var4;
            if (this.field3104 > 30000) {
                try {
                    this.field3101.method852(5790);
                } catch (Exception var27) {
                }
                this.field3101 = null;
            }
        }
        if (this.field3101 == null) {
            return this.method1246(-125) == 0 && this.method1237(12297) == 0;
        }
        try {
            if (arg0 != 2) {
                return false;
            }
            this.field3101.method848(-19005);
            for (class177 var5 = (class177) this.field3080.method1658((byte) -95); var5 != null; var5 = (class177) this.field3080.method1662((byte) 62)) {
                this.field3103.field1380 = 0;
                this.field3103.method570(1, arg0 + 15617);
                this.field3103.method586(false, (int) var5.field3053);
                this.field3101.method860(0, this.field3103.field1368, 4, 94);
                this.field3089.method1664(arg0 ^ 0xFFFFFF80, var5);
            }
            for (class177 var6 = (class177) this.field3097.method1658((byte) -77); var6 != null; var6 = (class177) this.field3097.method1662((byte) 49)) {
                this.field3103.field1380 = 0;
                this.field3103.method570(0, 15619);
                this.field3103.method586(false, (int) var6.field3053);
                this.field3101.method860(0, this.field3103.field1368, 4, 115);
                this.field3098.method1664(-115, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3101.method850((byte) 121);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                byte var9 = 0;
                this.field3104 = 0;
                if (this.field3109 == null) {
                    var9 = 8;
                } else if (this.field3109.field3181 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3108.field1380;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field3101.method854(this.field3108.field1368, var10, this.field3108.field1380, 0);
                    if (this.field3106 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3108.field1368[this.field3108.field1380 + var11] = (byte) class51.method376(this.field3108.field1368[this.field3108.field1380 + var11], this.field3106);
                        }
                    }
                    this.field3108.field1380 += var10;
                    if (this.field3108.field1380 >= var9) {
                        if (this.field3109 == null) {
                            this.field3108.field1380 = 0;
                            int var12 = this.field3108.method558(1);
                            int var13 = this.field3108.method545((byte) -105);
                            int var14 = this.field3108.method558(1);
                            int var15 = var14 & 0x7F;
                            int var16 = this.field3108.method562((byte) -71);
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class177 var21;
                            if (var17) {
                                for (var21 = (class177) this.field3098.method1658((byte) 60); var21 != null && var21.field3053 != var18; var21 = (class177) this.field3098.method1662((byte) 79)) {
                                }
                            } else {
                                for (var21 = (class177) this.field3089.method1658((byte) 81); var21 != null && var21.field3053 != var18; var21 = (class177) this.field3089.method1662((byte) 47)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field3109 = var21;
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field3109.field3173 = new class75(var16 + var22 + this.field3109.field3171);
                            this.field3109.field3173.method570(var15, 15619);
                            this.field3109.field3173.method581(true, var16);
                            this.field3108.field1380 = 0;
                            this.field3109.field3181 = 8;
                        } else if (this.field3109.field3181 != 0) {
                            throw new IOException();
                        } else if (this.field3108.field1368[0] == -1) {
                            this.field3109.field3181 = 1;
                            this.field3108.field1380 = 0;
                        } else {
                            this.field3109 = null;
                        }
                    }
                } else {
                    int var23 = this.field3109.field3173.field1368.length - this.field3109.field3171;
                    int var24 = 512 - this.field3109.field3181;
                    if (var23 - this.field3109.field3173.field1380 < var24) {
                        var24 = var23 - this.field3109.field3173.field1380;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field3101.method854(this.field3109.field3173.field1368, var24, this.field3109.field3173.field1380, 0);
                    if (this.field3106 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3109.field3173.field1368[this.field3109.field3173.field1380 + var25] = (byte) class51.method376(this.field3109.field3173.field1368[this.field3109.field3173.field1380 + var25], this.field3106);
                        }
                    }
                    this.field3109.field3181 += var24;
                    this.field3109.field3173.field1380 += var24;
                    if (this.field3109.field3173.field1380 == var23) {
                        this.field3109.method1219(64);
                        this.field3109.field1834 = false;
                        this.field3109 = null;
                    } else if (this.field3109.field3181 == 512) {
                        this.field3109.field3181 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3101.method852(5790);
            } catch (Exception var26) {
            }
            this.field3101 = null;
            this.field3105 = -2;
            this.field3107++;
            return this.method1246(-123) == 0 && this.method1237(arg0 + 12295) == 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
    public static void method1235(byte arg0) {
        if (arg0 != -23) {
            return;
        }
        field3083 = null;
        field3082 = null;
        field3087 = null;
        field3079 = null;
        field3095 = null;
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
    public final void method1236(int arg0) {
        if (this.field3101 != null) {
            this.field3101.method852(5790);
        }
        if (arg0 == 4) {
            field3099++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)I")
    private final int method1237(int arg0) {
        if (arg0 == 12297) {
            field3086++;
            return this.field3097.method1657(-13668) + this.field3098.method1657(-13668);
        } else {
            return -110;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)Z")
    public final boolean method1238(byte arg0) {
        if (arg0 != -66) {
            this.method1236(-19);
        }
        field3074++;
        return this.method1246(arg0 ^ 0x3F) >= 20;
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
    public static final void method1239(int arg0) {
        field3092++;
        if (class162.field2878[96]) {
            class120.field2254 += (-class120.field2254 - 24) / 2;
        } else if (class162.field2878[97]) {
            class120.field2254 += (24 - class120.field2254) / 2;
        } else {
            class120.field2254 /= 2;
        }
        if (class162.field2878[98]) {
            class212.field3785 += (12 - class212.field3785) / 2;
        } else if (class162.field2878[99]) {
            class212.field3785 += (-class212.field3785 - 12) / 2;
        } else {
            class212.field3785 /= 2;
        }
        int var1 = class31.field593 + class277.field4824.field2585;
        class249.field4414 += class120.field2254 / arg0;
        class207.field3710 += class212.field3785 / 2;
        int var2 = class6.field102 + class277.field4824.field2546;
        if ((class147.field2647 - var1) < -500 || (class147.field2647 - var1) > 500 || (class134.field2429 - var2) < -500 || class134.field2429 - var2 > 500) {
            class147.field2647 = var1;
            class134.field2429 = var2;
        }
        if (class134.field2429 != var2) {
            class134.field2429 += (var2 - class134.field2429) / 16;
        }
        if (class147.field2647 != var1) {
            class147.field2647 += (var1 - class147.field2647) / 16;
        }
        class160.method1171(false);
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V")
    public final void method1240(int arg0) {
        if (this.field3101 != null) {
            this.field3101.method851((byte) -17);
        }
        if (arg0 == 7) {
            field3085++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZLaj;)V")
    public final void method1241(int arg0, boolean arg1, class109 arg2) {
        if (arg0 > -28) {
            method1245((class181) null, (class46) null, -91);
        }
        field3091++;
        if (this.field3101 != null) {
            try {
                this.field3101.method852(5790);
            } catch (Exception var8) {
            }
            this.field3101 = null;
        }
        this.field3101 = arg2;
        this.method1229(14067);
        this.method1243(arg1, (byte) 126);
        this.field3109 = null;
        this.field3108.field1380 = 0;
        while (true) {
            class177 var4 = (class177) this.field3089.method1660(-112);
            if (var4 == null) {
                while (true) {
                    class177 var5 = (class177) this.field3098.method1660(-67);
                    if (var5 == null) {
                        if (this.field3106 != 0) {
                            try {
                                this.field3103.field1380 = 0;
                                this.field3103.method570(4, 15619);
                                this.field3103.method570(this.field3106, 15619);
                                this.field3103.method546((byte) 127, 0);
                                this.field3101.method860(0, this.field3103.field1368, 4, 94);
                            } catch (IOException var7) {
                                try {
                                    this.field3101.method852(5790);
                                } catch (Exception var6) {
                                }
                                this.field3105 = -2;
                                this.field3101 = null;
                                this.field3107++;
                            }
                        }
                        this.field3104 = 0;
                        this.field3100 = class223.method1537(-26619);
                        return;
                    }
                    this.field3097.method1664(-121, var5);
                }
            }
            this.field3080.method1664(-118, var4);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "()V")
    public static final void method1242() {
        class63.field1062 = 0;
        label191: for (int var0 = 0; var0 < class54.field924; var0++) {
            class249 var1 = class138.field2480[var0];
            if (class107.field1993 != null) {
                for (int var2 = 0; var2 < class107.field1993.length; var2++) {
                    if (class107.field1993[var2] != -1000000 && (var1.field4406 <= class107.field1993[var2] || var1.field4405 <= class107.field1993[var2]) && (var1.field4408 <= class10.field167[var2] || var1.field4409 <= class10.field167[var2]) && (var1.field4408 >= class169.field2999[var2] || var1.field4409 >= class169.field2999[var2]) && (var1.field4397 <= class84.field1604[var2] || var1.field4394 <= class84.field1604[var2]) && (var1.field4397 >= class257.field4483[var2] || var1.field4394 >= class257.field4483[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field4413 == 1) {
                int var3 = var1.field4395 + class81.field1538 - class258.field4503;
                if (var3 >= 0 && var3 <= class81.field1538 + class81.field1538) {
                    int var4 = var1.field4402 + class81.field1538 - class267.field4623;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field4407 + class81.field1538 - class267.field4623;
                    if (var5 > class81.field1538 + class81.field1538) {
                        var5 = class81.field1538 + class81.field1538;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class122.field2276[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class93.field1751 - var1.field4408;
                        if (var7 > 32) {
                            var1.field4399 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field4399 = 2;
                            var7 = -var7;
                        }
                        var1.field4396 = (var1.field4397 - class118.field2224 << 8) / var7;
                        var1.field4401 = (var1.field4394 - class118.field2224 << 8) / var7;
                        var1.field4400 = (var1.field4406 - class200.field3577 << 8) / var7;
                        var1.field4403 = (var1.field4405 - class200.field3577 << 8) / var7;
                        class131.field2413[class63.field1062++] = var1;
                    }
                }
            } else if (var1.field4413 == 2) {
                int var8 = var1.field4402 + class81.field1538 - class267.field4623;
                if (var8 >= 0 && var8 <= class81.field1538 + class81.field1538) {
                    int var9 = var1.field4395 + class81.field1538 - class258.field4503;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field4410 + class81.field1538 - class258.field4503;
                    if (var10 > class81.field1538 + class81.field1538) {
                        var10 = class81.field1538 + class81.field1538;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class122.field2276[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class118.field2224 - var1.field4397;
                        if (var12 > 32) {
                            var1.field4399 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field4399 = 4;
                            var12 = -var12;
                        }
                        var1.field4393 = (var1.field4408 - class93.field1751 << 8) / var12;
                        var1.field4392 = (var1.field4409 - class93.field1751 << 8) / var12;
                        var1.field4400 = (var1.field4406 - class200.field3577 << 8) / var12;
                        var1.field4403 = (var1.field4405 - class200.field3577 << 8) / var12;
                        class131.field2413[class63.field1062++] = var1;
                    }
                }
            } else if (var1.field4413 == 4) {
                int var13 = var1.field4406 - class200.field3577;
                if (var13 > 128) {
                    int var14 = var1.field4402 + class81.field1538 - class267.field4623;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field4407 + class81.field1538 - class267.field4623;
                    if (var15 > class81.field1538 + class81.field1538) {
                        var15 = class81.field1538 + class81.field1538;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field4395 + class81.field1538 - class258.field4503;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field4410 + class81.field1538 - class258.field4503;
                        if (var17 > class81.field1538 + class81.field1538) {
                            var17 = class81.field1538 + class81.field1538;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class122.field2276[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field4399 = 5;
                            var1.field4393 = (var1.field4408 - class93.field1751 << 8) / var13;
                            var1.field4392 = (var1.field4409 - class93.field1751 << 8) / var13;
                            var1.field4396 = (var1.field4397 - class118.field2224 << 8) / var13;
                            var1.field4401 = (var1.field4394 - class118.field2224 << 8) / var13;
                            class131.field2413[class63.field1062++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
    public final void method1243(boolean arg0, byte arg1) {
        if (arg1 <= 117) {
            this.field3097 = null;
        }
        field3094++;
        if (this.field3101 == null) {
            return;
        }
        try {
            this.field3103.field1380 = 0;
            this.field3103.method570(arg0 ? 2 : 3, 15619);
            this.field3103.method586(false, 0);
            this.field3101.method860(0, this.field3103.field1368, 4, 96);
        } catch (IOException var4) {
            try {
                this.field3101.method852(5790);
            } catch (Exception var3) {
            }
            this.field3101 = null;
            this.field3105 = -2;
            this.field3107++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIZB)Lsk;")
    public final class177 method1244(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field3102++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class177 var8 = new class177();
        var8.field3053 = var6;
        var8.field3171 = arg4;
        var8.field1838 = arg3;
        if (arg3) {
            if (this.method1246(-115) >= 20) {
                throw new RuntimeException();
            }
            this.field3080.method1664(-125, var8);
        } else if (this.method1237(12297) < 20) {
            this.field3097.method1664(-108, var8);
        } else {
            throw new RuntimeException();
        }
        if (!arg0) {
            this.method1236(-36);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lpi;Lha;I)Ljh;")
    public static final class238 method1245(class181 arg0, class46 arg1, int arg2) {
        int var3 = -104 / ((arg2 - 59) / 59);
        field3081++;
        int var4 = arg0.method1320((byte) 63, arg1);
        if (var4 == -1) {
            return new class238(0);
        }
        int[] var5 = arg0.method1318(5, var4);
        class238 var6 = new class238(var5.length);
        for (int var7 = 0; var7 < var6.field4224; var7++) {
            class75 var8 = new class75(arg0.method1293(var5[var7], var4, (byte) 105));
            var6.field4232[var7] = var8.method577(0);
            var6.field4228[var7] = var8.method569((byte) -110);
            var6.field4234[var7] = (short) var8.method545((byte) -75);
            var6.field4237[var7] = (short) var8.method545((byte) 109);
            var6.field4225[var7] = var8.method562((byte) -71);
        }
        return var6;
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)I")
    public final int method1246(int arg0) {
        field3078++;
        if (arg0 > -114) {
            this.method1233((byte) -75);
        }
        return this.field3080.method1657(-13668) + this.field3089.method1657(-13668);
    }
}
