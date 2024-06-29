import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class272 implements class190 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public int field4018;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public int field4019;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public int field4023;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Z")
    public boolean field4021;

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "[I")
    public static int[] field4027;

    static {
        new class331("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)J", line = 3)
    public final long method1338(byte arg0) {
        field4022++;
        long[] var2 = class503.field7463;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field4019) & 0xFFL)];
        if (arg0 < 112) {
            this.field4021 = true;
        }
        long var7 = var2[(int) (((long) (this.field4016 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field4016 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field4015 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field4015 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4015 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field4015 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field4018) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field4023 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field4023 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field4023 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field4023 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field4028) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field4021 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIB)V", line = 34)
    public static final void method1754(int arg0, int arg1, byte arg2) {
        field4017++;
        if (arg2 != -109) {
            field4027 = null;
        }
        class215 var3 = class171.method1208(arg1, (byte) 116, 7);
        var3.method1465(arg2 ^ 0x6497);
        var3.field3082 = arg0;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method1755(boolean arg0) {
        if (arg0) {
            method1759(false, 37, (byte) -95);
        }
        field4020++;
        if (class478.field7044.method2072(class65.field802, 110) || class525.field7714 == class51.field575) {
            class45.method481(true, class225.field3300);
            if (class525.field7714 != class47.field513) {
                class524.method3110(0);
            }
        } else {
            class268.method1722(false, (byte) 104, class251.field3702, class60.field695, false);
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V", line = 72)
    public static void method1756(byte arg0) {
        field4027 = null;
        int var1 = -45 / ((arg0 - 7) / 46);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V", line = 85)
    public static final void method1757(boolean arg0, byte arg1) {
        field4024++;
        if (arg1 >= -127) {
            method1757(false, (byte) 29);
        }
        while (class85.field1163.method946(8, class26.field314) >= 15) {
            int var2 = class85.field1163.method952(-82, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class250.field3690[var2] == null) {
                class250.field3690[var2] = new class461();
                class250.field3690[var2].field1716 = var2;
                var3 = true;
            }
            class461 var4 = class250.field3690[var2];
            class173.field2454[class232.field3410++] = var2;
            var4.field1688 = class263.field3867;
            if (var4.field6790 != null && var4.field6790.method852(-29)) {
                class248.method1626(var4, 16777216);
            }
            int var5 = class85.field1163.method952(-64, 1);
            int var6 = class85.field1163.method952(-100, 2);
            int var7 = class85.field1163.method952(-56, 1);
            if (var7 == 1) {
                class89.field1217[class200.field2934++] = var2;
            }
            int var8;
            if (arg0) {
                var8 = class85.field1163.method952(-98, 8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = class85.field1163.method952(-57, 5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9;
            if (arg0) {
                var9 = class85.field1163.method952(-61, 8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class85.field1163.method952(-67, 5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10 = class85.field1163.method952(-90, 3) + 4 << 11 & 0x391E;
            var4.method2771((byte) -128, class515.field7587.method1215(class85.field1163.method952(-56, 14), 1));
            var4.method966(var4.field6790.field1344, (byte) -120);
            var4.field1767 = var4.field6790.field1378 << 3;
            if (var4.field1767 == 0) {
                var4.method957(104, 0);
            } else if (var3) {
                var4.method957(76, var10);
            }
            var4.method2765(var6, -20437, class435.field6375.field1777[0] + var9, var4.method963((byte) 127), var5 == 1, class435.field6375.field1778[0] + var8);
            if (var4.field6790.method852(-60)) {
                class477.method2886(var4.field1777[0], -1, var4, null, var4.field1778[0], 0, var4.field6328, null);
            }
        }
        class85.field1163.method944((byte) 94);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lbq;I)Z", line = 186)
    public final boolean method1337(class190 arg0, int arg1) {
        field4025++;
        if (!(arg0 instanceof class272)) {
            return false;
        }
        class272 var3 = (class272) arg0;
        if (this.field4019 != var3.field4019) {
            return false;
        } else if (this.field4016 != var3.field4016) {
            return false;
        } else if (this.field4015 != var3.field4015) {
            return false;
        } else if (this.field4018 != var3.field4018) {
            return false;
        } else if (this.field4023 != var3.field4023) {
            return false;
        } else if (this.field4028 != var3.field4028) {
            return false;
        } else if (this.field4021 == var3.field4021) {
            if (arg1 != 27398) {
                this.method1338((byte) -106);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BLjava/lang/String;C)I", line = 234)
    public static final int method1758(byte arg0, String arg1, char arg2) {
        field4026++;
        int var3 = 0;
        int var4 = arg1.length();
        int var5 = 0;
        if (arg0 != -92) {
            return -114;
        }
        while (var4 > var5) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZIB)Ljava/lang/String;", line = 267)
    public static final String method1759(boolean arg0, int arg1, byte arg2) {
        field4013++;
        if (arg0 && arg1 >= 0) {
            if (arg2 <= 102) {
                field4027 = null;
            }
            return class318.method1981(arg0, (byte) -70, arg1, 10);
        } else {
            return Integer.toString(arg1);
        }
    }
}
