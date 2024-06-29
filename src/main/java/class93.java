import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class93 extends class84 {

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Z")
    public boolean field1298 = true;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field1294 = 0;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "[I")
    private int[] field1308;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
    public int[] field1309;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field1292;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "[Z")
    public static boolean[] field1296;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "[[I")
    private int[][] field1291;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lak;IIB)V")
    public static final void method605(class140 arg0, int arg1, int arg2, byte arg3) {
        if (arg0.field4040 == arg1 && arg1 != -1) {
            class240 var4 = class132.method905(true, arg1);
            int var5 = var4.field3674;
            if (var5 == 1) {
                arg0.field4080 = 0;
                arg0.field3994 = 1;
                arg0.field3985 = arg2;
                arg0.field4024 = 0;
                arg0.field4002 = 0;
                class116.method781(arg0.field4085, 236, arg0.field4019, false, arg0.field4024, var4);
            }
            if (var5 == 2) {
                arg0.field4002 = 0;
            }
        } else if (arg1 == -1 || arg0.field4040 == -1 || class132.method905(true, arg1).field3671 >= class132.method905(true, arg0.field4040).field3671) {
            arg0.field4080 = 0;
            arg0.field4002 = 0;
            arg0.field4027 = arg0.field4052;
            arg0.field4024 = 0;
            arg0.field3994 = 1;
            arg0.field3985 = arg2;
            arg0.field4040 = arg1;
            if (arg0.field4040 != -1) {
                class116.method781(arg0.field4085, 236, arg0.field4019, false, arg0.field4024, class132.method905(true, arg0.field4040));
            }
        }
        field1305++;
        if (arg3 >= -83) {
            method612(113, true, -114, 3, -40, -75);
        }
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Ljava/lang/String;")
    public final String method606(int arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field1288++;
        if (this.field1292 == null) {
            return "";
        }
        var2.append(this.field1292[0]);
        for (int var3 = arg0; var3 < this.field1292.length; var3++) {
            var2.append("...");
            var2.append(this.field1292[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
    public static final void method607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1301++;
        class211 var7 = class168.method1099(0, arg6, arg2);
        if (var7 != null && var7.field3073 != null) {
            class27 var8 = new class27();
            var8.field341 = var7.field3073;
            var8.field338 = var7;
            class213.method1392(var8, 107);
        }
        class144.field1998 = arg6;
        class11.field113 = true;
        if (arg4 != -31990) {
            return;
        }
        field1306 = arg2;
        class285.field4469 = arg3;
        field1303 = arg5;
        class172.field2399 = arg1;
        class96.field1357 = arg0;
        class236.method1583(var7, 0);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)I")
    public final int method608(int arg0, int arg1, int arg2) {
        field1290++;
        if (this.field1308 == null || arg0 < 0 || this.field1308.length < arg0) {
            return -1;
        } else {
            if (arg1 != -1) {
                field1300 = 110;
            }
            return this.field1291[arg0] == null || arg2 < 0 || arg2 > this.field1291[arg0].length ? -1 : this.field1291[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lql;II)V")
    private final void method609(class224 arg0, int arg1, int arg2) {
        field1302++;
        if (arg1 != 14329) {
            this.field1298 = false;
        }
        if (arg2 == 1) {
            this.field1292 = class16.method96('<', true, arg0.method1455(-50));
        } else if (arg2 == 2) {
            int var4 = arg0.method1453((byte) -127);
            this.field1309 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1309[var5] = arg0.method1445(false);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method1453((byte) -128);
            this.field1308 = new int[var6];
            this.field1291 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1445(false);
                this.field1308[var7] = var8;
                this.field1291[var7] = new int[class59.field834[var8]];
                for (int var9 = 0; var9 < class59.field834[var8]; var9++) {
                    this.field1291[var7][var9] = arg0.method1445(false);
                }
            }
        } else if (arg2 == 4) {
            this.field1298 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lql;I)Ljava/lang/String;")
    public final String method610(class224 arg0, int arg1) {
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1308 != null) {
            for (int var4 = 0; var4 < this.field1308.length; var4++) {
                var3.append(this.field1292[var4]);
                var3.append(class50.method324((byte) -51, this.field1308[var4], arg0.method1462(class283.field4380[this.field1308[var4]], (byte) -74), this.field1291[var4]));
            }
        }
        var3.append(this.field1292[this.field1292.length - 1]);
        field1287++;
        if (arg1 != 0) {
            this.method608(117, -92, -8);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I[ILql;)V")
    public final void method611(int arg0, int[] arg1, class224 arg2) {
        field1293++;
        if (arg0 < 111) {
            method612(-103, true, 99, -16, -34, 10);
        }
        if (this.field1308 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1308.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class194.field2683[this.method615(-121, var4)];
            if (var5 > 0) {
                arg2.method1490(-1, var5, (long) arg1[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZIIII)V")
    public static final void method612(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class127.field1782 >= arg5 && class273.field4228 <= arg2) {
            boolean var6;
            if (field1294 > arg4) {
                arg4 = field1294;
                var6 = false;
            } else if (class296.field4668 >= arg4) {
                var6 = true;
            } else {
                var6 = false;
                arg4 = class296.field4668;
            }
            boolean var7;
            if (arg0 < field1294) {
                var7 = false;
                arg0 = field1294;
            } else if (class296.field4668 < arg0) {
                var7 = false;
                arg0 = class296.field4668;
            } else {
                var7 = true;
            }
            if (arg5 >= class273.field4228) {
                class154.method1028(-353, class216.field3264[arg5++], arg3, arg4, arg0);
            } else {
                arg5 = class273.field4228;
            }
            if (class127.field1782 >= arg2) {
                class154.method1028(-353, class216.field3264[arg2--], arg3, arg4, arg0);
            } else {
                arg2 = class127.field1782;
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg2; var8++) {
                    int[] var9 = class216.field3264[var8];
                    var9[arg4] = var9[arg0] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg2; var11++) {
                    class216.field3264[var11][arg4] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg2; var10++) {
                    class216.field3264[var10][arg0] = arg3;
                }
            }
        }
        if (arg1) {
            field1303 = -95;
        }
        field1289++;
    }

    @OriginalMember(owner = "client!od", name = "i", descriptor = "(I)I")
    public final int method613(int arg0) {
        field1307++;
        if (this.field1308 == null) {
            return 0;
        } else {
            int var2 = 102 % ((arg0 + 2) / 35);
            return this.field1308.length;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
    public static void method614(byte arg0) {
        if (arg0 < -64) {
            field1296 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public final int method615(int arg0, int arg1) {
        field1304++;
        if (this.field1308 == null || arg1 < 0 || arg1 > this.field1308.length) {
            return -1;
        } else {
            if (arg0 > -78) {
                this.method613(-66);
            }
            return this.field1308[arg1];
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lql;B)V")
    public final void method616(class224 arg0, byte arg1) {
        if (arg1 > -28) {
            this.method617((byte) -75);
        }
        while (true) {
            int var3 = arg0.method1453((byte) -127);
            if (var3 == 0) {
                field1295++;
                return;
            }
            this.method609(arg0, 14329, var3);
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
    public final void method617(byte arg0) {
        int var2 = -92 / ((-arg0 - 66) / 57);
        if (this.field1309 != null) {
            for (int var3 = 0; var3 < this.field1309.length; var3++) {
                this.field1309[var3] = class54.method339(this.field1309[var3], 32768);
            }
        }
        field1299++;
    }
}
