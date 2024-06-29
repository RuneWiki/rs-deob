import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class69 {

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    private int field988 = 0;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "[Lac;")
    public class568[] field984;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field989 = new String[] { method741(method740("eQ\u001a7z")), method741(method740("eQ\u001a6z")), method741(method740("eQ\u001a<z")), method741(method740("o\r\u001aP/")), method741(method740("zVX\u0012")), method741(method740("eQ\u001a;z")), method741(method740("eQ\u001a=z")), method741(method740("eQ\u001a5z")), method741(method740("eQ\u001aB;zJ@@z")), method741(method740("eQ\u001a?z")), method741(method740("eQ\u001a:z")), method741(method740("eQ\u001a4z")), method741(method740("eQ\u001a8z")), method741(method740("eQ\u001a9z")) };

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Lat;")
    public static class398 field979 = new class398();

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
    public static int[] field987 = new int[2];

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "J")
    private long field974;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Lac;")
    private class568 field978;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lac;")
    private class568 field986;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
    public static void method729(int arg0) {
        try {
            int var1 = -49 % ((arg0 - 62) / 35);
            field979 = null;
            field987 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field989[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
    public final void method730(boolean arg0) {
        try {
            field973++;
            if (!arg0) {
                this.field971 = 14;
            }
            for (int var2 = 0; var2 < this.field971; var2++) {
                class568 var3 = this.field984[var2];
                while (true) {
                    class568 var4 = var3.field8249;
                    if (var3 == var4) {
                        break;
                    }
                    var4.method4173(-1);
                }
            }
            this.field986 = null;
            this.field978 = null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field989[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I")
    public final int method731(int arg0) {
        try {
            int var2 = 70 / ((arg0 + 45) / 40);
            field982++;
            return this.field971;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field989[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I[Lac;)I")
    public final int method732(int arg0, class568[] arg1) {
        try {
            field985++;
            int var3 = 0;
            int var4 = 0;
            if (arg0 != -14248) {
                this.method731(-16);
            }
            while (this.field971 > var4) {
                class568 var5 = this.field984[var4];
                for (class568 var6 = var5.field8249; var6 != var5; var6 = var6.field8249) {
                    arg1[var3++] = var6;
                }
                var4++;
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field989[6] + arg0 + ',' + (arg1 == null ? field989[4] : field989[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)I")
    public final int method733(byte arg0) {
        try {
            field975++;
            int var2 = 0;
            if (arg0 != 38) {
                return 123;
            }
            for (int var3 = 0; var3 < this.field971; var3++) {
                class568 var4 = this.field984[var3];
                for (class568 var5 = var4.field8249; var5 != var4; var5 = var5.field8249) {
                    var2++;
                }
            }
            return var2;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field989[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)Lac;")
    public final class568 method734(byte arg0) {
        try {
            field977++;
            if (this.field988 > 0 && this.field984[this.field988 - 1] != this.field986) {
                class568 var2 = this.field986;
                this.field986 = var2.field8249;
                return var2;
            } else if (arg0 == -50) {
                while (this.field988 < this.field971) {
                    class568 var3 = this.field984[this.field988++].field8249;
                    if (this.field984[this.field988 - 1] != var3) {
                        this.field986 = var3.field8249;
                        return var3;
                    }
                }
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field989[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)Lac;")
    public final class568 method735(int arg0) {
        try {
            field981++;
            this.field988 = arg0;
            return this.method734((byte) -50);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field989[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)Z")
    public static final boolean method736(int arg0, int arg1, int arg2) {
        try {
            if (arg2 > -56) {
                field979 = null;
            }
            field980++;
            return class309.method2653(-80, arg0, arg1) & class153.method1387(0, arg1, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field989[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BJ)Lac;")
    public final class568 method737(byte arg0, long arg1) {
        try {
            field983++;
            this.field974 = arg1;
            if (arg0 != -39) {
                this.field974 = 97L;
            }
            class568 var4 = this.field984[(int) ((long) (this.field971 - 1) & arg1)];
            for (this.field978 = var4.field8249; this.field978 != var4; this.field978 = this.field978.field8249) {
                if (this.field978.field8252 == arg1) {
                    class568 var5 = this.field978;
                    this.field978 = this.field978.field8249;
                    return var5;
                }
            }
            this.field978 = null;
            return null;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field989[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lac;JI)V")
    public final void method738(class568 arg0, long arg1, int arg2) {
        try {
            if (arg0.field8246 != null) {
                arg0.method4173(-1);
            }
            if (arg2 == -12002) {
                field976++;
                class568 var5 = this.field984[(int) (arg1 & (long) (this.field971 - 1))];
                arg0.field8246 = var5.field8246;
                arg0.field8249 = var5;
                arg0.field8246.field8249 = arg0;
                arg0.field8249.field8246 = arg0;
                arg0.field8252 = arg1;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field989[5] + (arg0 == null ? field989[4] : field989[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(Z)Lac;")
    public final class568 method739(boolean arg0) {
        try {
            field972++;
            if (this.field978 == null) {
                return null;
            }
            class568 var2 = this.field984[(int) ((long) (this.field971 - 1) & this.field974)];
            while (this.field978 != var2) {
                if (this.field974 == this.field978.field8252) {
                    class568 var3 = this.field978;
                    this.field978 = this.field978.field8249;
                    return var3;
                }
                this.field978 = this.field978.field8249;
            }
            this.field978 = null;
            if (!arg0) {
                this.method738(null, 77L, 11);
            }
            return null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field989[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V")
    public class69(int arg0) {
        try {
            this.field984 = new class568[arg0];
            this.field971 = arg0;
            for (int var2 = 0; var2 < arg0; var2++) {
                class568 var3 = this.field984[var2] = new class568();
                var3.field8246 = var3;
                var3.field8249 = var3;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field989[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method740(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method741(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
