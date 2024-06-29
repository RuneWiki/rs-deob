import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class97 {

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field1314 = -1;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Z")
    public boolean field1316 = true;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
    private int field1317 = 0;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Z")
    public boolean field1321 = true;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public int field1307 = 512;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1322 = new String[] { method963(method962("e\n$&e")), method963(method962("xJ$K0")), method963(method962("m\u0011f\t")), method963(method962("e\n$!e")), method963(method962("e\n$'e")), method963(method962("e\n$ e")), method963(method962("e\n$$e")) };

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Llf;")
    public static class260 field1306 = new class260(9, -1);

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Lofa;")
    public static class139 field1310 = new class139(0);

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Llga;")
    public static class47 field1320;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljc;B)V")
    public final void method957(class711 arg0, byte arg1) {
        try {
            if (arg1 != -98) {
                this.field1316 = false;
            }
            while (true) {
                int var3 = arg0.method5128(arg1 ^ 0xFFFFFF9E);
                if (var3 == 0) {
                    field1315++;
                    return;
                }
                this.method960(false, var3, arg0);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1322[6] + (arg0 == null ? field1322[2] : field1322[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        try {
            field1320 = null;
            field1310 = null;
            if (arg0 != 255) {
                method958(-44);
            }
            field1306 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1322[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lvo;I)V")
    public static final void method959(class782 arg0, int arg1) {
        try {
            if (class355.field5158 == arg0.field11170) {
                class752.field10742[arg0.field11130] = true;
            }
            if (arg1 != -1) {
                field1306 = null;
            }
            field1308++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1322[5] + (arg0 == null ? field1322[2] : field1322[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZILjc;)V")
    private final void method960(boolean arg0, int arg1, class711 arg2) {
        try {
            field1319++;
            if (arg0) {
                this.method960(true, -42, null);
            }
            if (arg1 == 1) {
                this.field1317 = arg2.method5085(true);
                this.method961(100, this.field1317);
            } else if (arg1 == 2) {
                this.field1314 = arg2.method5116((byte) -106);
                if (this.field1314 == 65535) {
                    this.field1314 = -1;
                    return;
                }
            } else if (arg1 == 3) {
                this.field1307 = arg2.method5116((byte) -108) << 2;
                return;
            } else if (arg1 == 4) {
                this.field1316 = false;
                return;
            } else if (arg1 == 5) {
                this.field1321 = false;
            } else {
                return;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1322[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1322[2] : field1322[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
    private final void method961(int arg0, int arg1) {
        try {
            field1309++;
            double var3 = (double) ((arg1 & 0xFF4984) >> 16) / 256.0D;
            double var5 = (double) ((arg1 & 0xFF55) >> 8) / 256.0D;
            double var7 = (double) (arg1 & 0xFF) / 256.0D;
            double var9 = var3;
            if (var5 < var3) {
                var9 = var5;
            }
            if (var7 < var9) {
                var9 = var7;
            }
            if (arg0 >= 18) {
                double var11 = var3;
                if (var5 > var3) {
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
                this.field1313 = (int) (var17 * 256.0D);
                double var19 = var13 / 6.0D;
                this.field1312 = (int) (var15 * 256.0D);
                if (this.field1312 < 0) {
                    this.field1312 = 0;
                } else if (this.field1312 > 255) {
                    this.field1312 = 255;
                }
                if ((var17 > 0.5D)) {
                    this.field1311 = (int) ((1.0D - var17) * var15 * 512.0D);
                } else {
                    this.field1311 = (int) (var15 * var17 * 512.0D);
                }
                if (this.field1313 < 0) {
                    this.field1313 = 0;
                } else if (this.field1313 > 255) {
                    this.field1313 = 255;
                }
                if (this.field1311 < 1) {
                    this.field1311 = 1;
                }
                this.field1318 = (int) ((double) this.field1311 * var19);
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field1322[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method962(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method963(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
