import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field987 = -1;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    private int field988 = -1;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public int field994 = -1;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public int field997 = -1;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field993 = -1;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    private int field1003 = -1;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field996 = -1;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[Ljava/lang/String;")
    public String[] field1004 = new String[5];

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "Z")
    public boolean field1013 = true;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public int field1014 = 0;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    private int field1015 = -1;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    private int field1020 = -1;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Z")
    public boolean field992 = false;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Z")
    public boolean field1024 = true;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Z")
    public boolean field1008 = true;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field989 = "Loading config - ";

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1012 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "S")
    public static short field1025 = 256;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    private int field999;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Ljava/lang/String;")
    public String field1000;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Ljava/lang/String;")
    public String field991;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[I")
    public int[] field990;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z")
    public final boolean method491(int arg0) {
        field1023++;
        if (arg0 != 0) {
            this.method491(108);
        }
        if (this.field988 == -1 && this.field996 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field988 == -1) {
            var3 = class137.method1034((byte) -17, this.field996);
        } else {
            var3 = class303.field4900[this.field988];
        }
        if (var3 < this.field999 || var3 > this.field1016) {
            return false;
        } else if (this.field1015 == -1 && this.field1020 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field1015 == -1) {
                var5 = class137.method1034((byte) -17, this.field1020);
            } else {
                var5 = class303.field4900[this.field1015];
            }
            return var5 >= this.field1022 && var5 <= this.field1018;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method492(int arg0) {
        if (arg0 != 2) {
            method494();
        }
        field1012 = null;
        field989 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lfi;Lfi;ZIIBZ)I")
    public static final int method493(class229 arg0, class229 arg1, boolean arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field1001++;
        int var7 = class169.method1203((byte) -63, arg2, arg1, arg0, arg4);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg3 == -1) {
            return 0;
        } else {
            int var8 = class169.method1203((byte) -63, arg6, arg1, arg0, arg3);
            if (arg5 != -61) {
                field989 = null;
            }
            return arg6 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
    public static final void method494() {
        if (class53.field790 != null) {
            for (int var0 = 0; var0 < class53.field790.length; var0++) {
                for (int var1 = 0; var1 < class159.field2481; var1++) {
                    for (int var2 = 0; var2 < class7.field67; var2++) {
                        class53.field790[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class276.field4472 != null) {
            for (int var3 = 0; var3 < class276.field4472.length; var3++) {
                for (int var4 = 0; var4 < class159.field2481; var4++) {
                    for (int var5 = 0; var5 < class7.field67; var5++) {
                        class276.field4472[var3][var4][var5] = null;
                    }
                }
            }
        }
        class139.field2268 = 0;
        if (class254.field3829 != null) {
            for (int var6 = 0; var6 < class139.field2268; var6++) {
                class254.field3829[var6] = null;
            }
        }
        if (class2.field28 != null) {
            for (int var7 = 0; var7 < class115.field1914; var7++) {
                class2.field28[var7] = null;
            }
            class115.field1914 = 0;
        }
        if (class5.field51 != null) {
            for (int var8 = 0; var8 < class5.field51.length; var8++) {
                class5.field51[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static final void method495(boolean arg0) {
        class63.method476(class306.field4945, 14105);
        field1019++;
        class162.field2515++;
        if (class197.field2894 && class210.field3102) {
            int var1 = class204.field3017;
            int var2 = class44.field584;
            int var3 = var1 - class211.field3111;
            int var4 = var2 - class115.field1907;
            if (!arg0) {
                method494();
            }
            if (class11.field129 > var4) {
                var4 = class11.field129;
            }
            if (var3 < class212.field3127) {
                var3 = class212.field3127;
            }
            if (class11.field129 + class132.field2178.field4046 < var4 - -class306.field4945.field4046) {
                var4 = class11.field129 + class132.field2178.field4046 - class306.field4945.field4046;
            }
            int var5 = class306.field4945.field4095;
            int var6 = var4 - class48.field673;
            if ((class212.field3127 + class132.field2178.field4215) < (class306.field4945.field4215 + var3)) {
                var3 = class212.field3127 + class132.field2178.field4215 - class306.field4945.field4215;
            }
            int var7 = var3 - (class212.field3127 - class132.field2178.field4097);
            int var8 = var3 - class210.field3106;
            int var9 = class132.field2178.field4160 + var4 - class11.field129;
            if (class306.field4945.field4216 < class162.field2515 && (var8 > var5 || -var5 > var8 || var6 > var5 || (-var5) > var6)) {
                class208.field3075 = true;
            }
            if (class306.field4945.field4224 != null && class208.field3075) {
                class234 var10 = new class234();
                var10.field3419 = class306.field4945.field4224;
                var10.field3415 = var7;
                var10.field3423 = class306.field4945;
                var10.field3422 = var9;
                class224.method1557((byte) 121, var10);
            }
            if (class79.field1274 == 0) {
                if (class208.field3075) {
                    if (class306.field4945.field4181 != null) {
                        class234 var11 = new class234();
                        var11.field3422 = var9;
                        var11.field3415 = var7;
                        var11.field3426 = class286.field4590;
                        var11.field3423 = class306.field4945;
                        var11.field3419 = class306.field4945.field4181;
                        class224.method1557((byte) 119, var11);
                    }
                    if (class286.field4590 != null && client.method908(class306.field4945) != null) {
                        class7.field65++;
                        class144.field2338.method683(true, 0);
                        class144.field2338.method379(class306.field4945.field4083, true);
                        class144.field2338.method341(-119, class286.field4590.field4083);
                        class144.field2338.method365(class286.field4590.field4145, (byte) 59);
                        class144.field2338.method358(8117, class306.field4945.field4145);
                    }
                } else if ((class38.field488 == 1 || class219.method1526(class147.field2360 - 1, -1)) && class147.field2360 > 2) {
                    class227.method1573(15);
                } else if (class147.field2360 > 0) {
                    class107.method824((byte) -124);
                }
                class306.field4945 = null;
            }
        } else if (class162.field2515 > 1) {
            class306.field4945 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lhc;II)V")
    private final void method496(class53 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field993 = arg0.method331(-115);
        } else if (arg1 == 2) {
            this.field994 = arg0.method331(arg2 ^ 0xFFFFFF98);
        } else if (arg1 == 3) {
            this.field991 = arg0.method326(arg2 ^ 0x43);
        } else if (arg1 == 4) {
            this.field1005 = arg0.method362(-4);
        } else if (arg1 == 5) {
            this.field997 = arg0.method362(-4);
        } else if (arg1 == 6) {
            this.field1014 = arg0.method366(-16505);
        } else if (arg1 == 7) {
            int var4 = arg0.method366(-16505);
            if ((var4 & 0x1) == 0) {
                this.field1024 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field992 = true;
            }
        } else if (arg1 == 8) {
            this.field1008 = arg0.method366(-16505) == 1;
        } else if (arg1 == 9) {
            this.field996 = arg0.method331(-74);
            if (this.field996 == 65535) {
                this.field996 = -1;
            }
            this.field988 = arg0.method331(-10);
            if (this.field988 == 65535) {
                this.field988 = -1;
            }
            this.field999 = arg0.method340(-126);
            this.field1016 = arg0.method340(arg2 - 88);
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field1004[arg1 - 10] = arg0.method326(120);
        } else if (arg1 == 15) {
            int var5 = arg0.method366(-16505);
            this.field990 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field990[var6] = arg0.method337(78);
            }
            this.field1021 = arg0.method340(arg2 ^ 0xFFFFFF89);
            this.field995 = arg0.method340(-127);
        } else if (arg1 == 16) {
            this.field1013 = false;
        } else if (arg1 == 17) {
            this.field1000 = arg0.method326(53);
        } else if (arg1 == 18) {
            this.field1003 = arg0.method331(-108);
        } else if (arg1 == 19) {
            this.field987 = arg0.method331(-17);
        } else if (arg1 == 20) {
            this.field1020 = arg0.method331(-17);
            if (this.field1020 == 65535) {
                this.field1020 = -1;
            }
            this.field1015 = arg0.method331(arg2 ^ 0xFFFFFFDB);
            if (this.field1015 == 65535) {
                this.field1015 = -1;
            }
            this.field1022 = arg0.method340(-79);
            this.field1018 = arg0.method340(arg2 ^ 0xFFFFFF85);
        } else if (arg1 == 21) {
            this.field1006 = arg0.method340(-128);
        } else if (arg1 == 22) {
            this.field1007 = arg0.method340(-81);
        }
        field1002++;
        if (arg2 != 2) {
            this.field1003 = -11;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Laf;")
    public final class176 method497(int arg0) {
        class176 var2 = (class176) class289.field4618.method1418((long) (this.field1003 | 0x20000), 0);
        field1011++;
        if (var2 != null) {
            return var2;
        }
        class5.field46.method1885(2, this.field1003);
        class176 var3 = class6.method30((byte) 80, this.field1003, class5.field46, arg0);
        if (var3 != null) {
            var3.field2247 = var3.field2255;
            var3.field2253 = var3.field2258;
            var3.field2250 = 0;
            var3.field2249 = 0;
            class289.field4618.method1421((long) (this.field1003 | 0x20000), var3, (byte) 19);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lhc;I)V")
    public final void method498(class53 arg0, int arg1) {
        field1017++;
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                int var4 = 71 / ((48 - arg1) / 38);
                return;
            }
            this.method496(arg0, var3, 2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZZ)Ldj;")
    public final class138 method499(boolean arg0, boolean arg1, boolean arg2) {
        int var4 = arg2 ? this.field994 : this.field993;
        field998++;
        class138 var5 = (class138) class289.field4618.method1418((long) (var4 | (arg2 ? 65536 : 0)), 0);
        if (var5 != null) {
            return var5;
        }
        if (arg0) {
            this.method498((class53) null, 36);
        }
        if (!class5.field46.method1885(2, var4)) {
            return null;
        }
        class176 var6 = class6.method30((byte) 80, var4, class5.field46, 0);
        if (var6 != null) {
            var6.field2253 = var6.field2258;
            var6.field2249 = 0;
            var6.field2250 = 0;
            var6.field2247 = var6.field2255;
            class289.field4618.method1421((long) (var4 | (arg2 ? 65536 : 0)), var6, (byte) 99);
        }
        return var6;
    }
}
