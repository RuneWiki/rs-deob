import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class87 {

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field1217 = -1;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    private int field1221 = 0;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
    public boolean field1223 = true;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public int field1229 = 128;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Z")
    public static boolean field1227 = false;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "[I")
    public static int[] field1235;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "Ljg;")
    public static class241 field1234;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "[I")
    public static int[] field1237;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Lnn;")
    public static class151 field1236;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
    public static final void method566(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -1002) {
            field1234 = null;
        }
        if (arg3 == 1007) {
            class384.method2312(class161.field2236, arg1, arg2);
        } else if (arg3 == 1011) {
            class384.method2312(class180.field2708, arg1, arg2);
        } else if (arg3 == 1012) {
            class384.method2312(class97.field1332, arg1, arg2);
        } else if (arg3 == 1008) {
            class384.method2312(class402.field6003, arg1, arg2);
        } else if (arg3 == 1001) {
            class384.method2312(class210.field3157, arg1, arg2);
        }
        field1222++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)V")
    private final void method567(boolean arg0, int arg1) {
        field1220++;
        double var3 = (double) ((arg1 & 0xFF2108) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0) {
            this.field1221 = -88;
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1224 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field1219 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field1218 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1218 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1224 < 0) {
            this.field1224 = 0;
        } else if (this.field1224 > 255) {
            this.field1224 = 255;
        }
        if (this.field1219 < 0) {
            this.field1219 = 0;
        } else if (this.field1219 > 255) {
            this.field1219 = 255;
        }
        if (this.field1218 < 1) {
            this.field1218 = 1;
        }
        this.field1216 = (int) ((double) this.field1218 * var19);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method568(byte arg0, String arg1) {
        field1226++;
        if (arg1 == null) {
            return;
        }
        if (!(class145.field1985 < 100 || class426.field6266) || class145.field1985 >= 200) {
            class149.method932(class131.field1671.method937((byte) 109, class27.field356), 2688);
            return;
        }
        String var2 = class171.method1054(0, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class145.field1985; var3++) {
            String var7 = class171.method1054(0, class137.field1853[var3]);
            if (var7 != null && var7.equals(var2)) {
                class149.method932(arg1 + class358.field5277.method937((byte) 110, class27.field356), 2688);
                return;
            }
            if (class112.field1486[var3] != null) {
                String var8 = class171.method1054(0, class112.field1486[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class149.method932(arg1 + class358.field5277.method937((byte) -128, class27.field356), 2688);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class433.field6366; var4++) {
            String var5 = class171.method1054(0, class289.field4400[var4]);
            if (var5 != null && var5.equals(var2)) {
                class149.method932(class50.field643.method937((byte) 121, class27.field356) + arg1 + class44.field550.method937((byte) -68, class27.field356), 2688);
                return;
            }
            if (class458.field6793[var4] != null) {
                String var6 = class171.method1054(0, class458.field6793[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class149.method932(class50.field643.method937((byte) 97, class27.field356) + arg1 + class44.field550.method937((byte) 119, class27.field356), 2688);
                    return;
                }
            }
        }
        if (class171.method1054(0, class113.field1500.field2459).equals(var2)) {
            class149.method932(class372.field5434.method937((byte) 114, class27.field356), 2688);
            return;
        }
        class180.field2709++;
        class177.method1082(class108.field1433, 0);
        if (arg0 <= 120) {
            field1233 = 39;
        }
        class189.field2840.method2366(class386.method2384(-4580, arg1), true);
        class189.field2840.method2375(-13, arg1);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static final void method569(int arg0) {
        field1225++;
        if (class113.method684(arg0) != 2) {
            return;
        }
        byte var1 = (byte) (class267.field4078 - 4 & 0xFF);
        int var2 = class267.field4078 % class115.field1522;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class198.field3004; var16++) {
                class75.field1016[var3][var2][var16] = var1;
            }
        }
        if (class143.field1911 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class170.field2630[var4] = -1000000;
            class301.field4545[var4] = 1000000;
            class383.field5589[var4] = 0;
            class150.field2078[var4] = 1000000;
            class282.field4314[var4] = 0;
        }
        if (class80.field1054 != 1) {
            int var15 = class437.method2686(class143.field1911, 0, class196.field2967, class185.field2790);
            if (var15 - class127.field1626 >= 800 || (class341.field5085[class143.field1911][class185.field2790 >> 7][class196.field2967 >> 7] & 0x4) == 0) {
                return;
            }
            class310.method1891(class277.field4216, 1, false, class185.field2790 >> 7, class196.field2967 >> 7, arg0 + 49);
            return;
        }
        if ((class341.field5085[class143.field1911][class113.field1500.field1900 >> 7][class113.field1500.field1892 >> 7] & 0x4) != 0) {
            class310.method1891(class277.field4216, 0, false, class113.field1500.field1900 >> 7, class113.field1500.field1892 >> 7, 50);
        }
        if (class350.field5204 >= 2560) {
            return;
        }
        int var5 = class185.field2790 >> 7;
        int var6 = class196.field2967 >> 7;
        int var7 = class113.field1500.field1900 >> 7;
        int var8 = class113.field1500.field1892 >> 7;
        int var9;
        if (var5 < var7) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var6 >= var8) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && var9 > (-class115.field1522) && var9 < class115.field1522 && (-class198.field3004) < var10 && var10 < class198.field3004) {
            if (var10 >= var9) {
                int var11 = var9 * 65536 / var10;
                int var12 = 32768;
                while (var6 != var8) {
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class341.field5085[class143.field1911][var5][var6] & 0x4) != 0) {
                        class310.method1891(class277.field4216, 1, false, var5, var6, 50);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var5 < var7) {
                            var5++;
                        } else if (var5 > var7) {
                            var5--;
                        }
                        var12 -= 65536;
                        if ((class341.field5085[class143.field1911][var5][var6] & 0x4) != 0) {
                            class310.method1891(class277.field4216, 1, false, var5, var6, arg0 ^ 0x33);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var10 * 65536 / var9;
            int var14 = 32768;
            while (var5 != var7) {
                if (var7 > var5) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class341.field5085[class143.field1911][var5][var6] & 0x4) != 0) {
                    class310.method1891(class277.field4216, 1, false, var5, var6, 50);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var6 > var8) {
                        var6--;
                    }
                    if ((class341.field5085[class143.field1911][var5][var6] & 0x4) != 0) {
                        class310.method1891(class277.field4216, 1, false, var5, var6, 50);
                        return;
                    }
                }
            }
            return;
        }
        class288.method1783("RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class17.field250 + "," + class112.field1487, (Throwable) null, -80);
        return;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lef;II)V")
    public final void method570(class385 arg0, int arg1, int arg2) {
        field1228++;
        while (true) {
            int var4 = arg0.method2343(arg2 ^ 0xFF);
            if (var4 == 0) {
                if (arg2 == 0) {
                    return;
                } else {
                    field1227 = false;
                    return;
                }
            }
            this.method572(arg0, (byte) -128, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public static void method571(int arg0) {
        field1234 = null;
        field1237 = null;
        field1235 = null;
        if (arg0 != 65536) {
            field1233 = 2;
        }
        field1236 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lef;BII)V")
    private final void method572(class385 arg0, byte arg1, int arg2, int arg3) {
        field1231++;
        int var5 = -93 / ((arg1 + 81) / 42);
        if (arg2 == 1) {
            this.field1221 = arg0.method2382((byte) -108);
            this.method567(false, this.field1221);
        } else if (arg2 == 2) {
            this.field1217 = arg0.method2323(-1);
            if (this.field1217 == 65535) {
                this.field1217 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field1229 = arg0.method2323(-72);
        } else if (arg2 == 4) {
            this.field1223 = false;
            return;
        }
    }

    static {
        new class151("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field1233 = 1401;
        field1235 = new int[1024];
        field1234 = new class241(2);
        field1237 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };
        field1236 = new class151("level: ", "Stufe: ", "niveau ", "nível: ");
    }
}
