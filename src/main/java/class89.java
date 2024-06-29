import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class89 extends class205 {

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Lbi;")
    public static class104 field1284 = new class104(70, 3);

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Lbi;")
    public static class104 field1313 = new class104(66, -2);

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "F")
    public float field1287;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "F")
    public float field1288;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "F")
    public float field1289;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "F")
    public float field1292;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "F")
    public float field1296;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "F")
    public float field1297;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "F")
    public float field1299;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "F")
    public float field1301;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "F")
    public float field1305;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "F")
    public float field1307;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "F")
    public float field1310;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "F")
    public float field1312;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "Lmn;")
    public static class162 field1314;

    @OriginalMember(owner = "client!nf", name = "ca", descriptor = "(I)V")
    public final void method164(int arg0) {
        field1285++;
        this.field1305 = 1.0F;
        this.field1296 = this.field1299 = class96.field1398[arg0 & 0x3FFF];
        this.field1292 = class96.field1400[arg0 & 0x3FFF];
        this.field1297 = -this.field1292;
        this.field1289 = this.field1288 = this.field1301 = this.field1312 = this.field1307 = this.field1310 = this.field1287 = 0.0F;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)[F")
    public final float[] method609(byte arg0) {
        class337.field5263[2] = this.field1297;
        field1282++;
        class337.field5263[8] = this.field1292;
        class337.field5263[12] = 0.0F;
        class337.field5263[5] = this.field1305;
        class337.field5263[10] = this.field1299;
        if (arg0 != -98) {
            this.method612(false);
        }
        class337.field5263[14] = 0.0F;
        class337.field5263[13] = 0.0F;
        class337.field5263[6] = this.field1310;
        class337.field5263[0] = this.field1296;
        class337.field5263[9] = this.field1312;
        class337.field5263[4] = this.field1289;
        class337.field5263[1] = this.field1301;
        return class337.field5263;
    }

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "(III)V")
    public final void method163(int arg0, int arg1, int arg2) {
        this.field1307 += arg1;
        this.field1287 += arg2;
        field1294++;
        this.field1288 += arg0;
    }

    @OriginalMember(owner = "client!nf", name = "YA", descriptor = "(IIIIII)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1286++;
        float var7 = class96.field1398[arg3 & 0x3FFF];
        float var8 = class96.field1400[arg3 & 0x3FFF];
        float var9 = class96.field1398[arg4 & 0x3FFF];
        float var10 = class96.field1400[arg4 & 0x3FFF];
        float var11 = class96.field1398[arg5 & 0x3FFF];
        float var12 = class96.field1400[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1312 = var9 * var13 + var10 * var12;
        this.field1296 = var9 * var11 + var10 * var14;
        this.field1289 = var7 * var12;
        this.field1299 = var7 * var9;
        this.field1310 = -var8;
        this.field1292 = -var10 * var11 + var9 * var14;
        this.field1297 = var7 * var10;
        this.field1301 = -var9 * var12 + var10 * var13;
        this.field1305 = var7 * var11;
        this.field1288 = (float) (-arg0) * this.field1296 - ((float) arg1 * this.field1289) - (float) arg2 * this.field1292;
        this.field1287 = (float) (-arg0) * this.field1297 - ((float) arg1 * this.field1310) - ((float) arg2 * this.field1299);
        this.field1307 = (float) (-arg0) * this.field1301 - (float) arg1 * this.field1305 - (float) arg2 * this.field1312;
    }

    @OriginalMember(owner = "client!nf", name = "ha", descriptor = "(Lc;)V")
    public final void method157(class205 arg0) {
        field1300++;
        class89 var2 = (class89) arg0;
        this.field1296 = var2.field1296;
        this.field1312 = var2.field1312;
        this.field1292 = var2.field1292;
        this.field1305 = var2.field1305;
        this.field1287 = var2.field1287;
        this.field1310 = var2.field1310;
        this.field1289 = var2.field1289;
        this.field1301 = var2.field1301;
        this.field1288 = var2.field1288;
        this.field1299 = var2.field1299;
        this.field1307 = var2.field1307;
        this.field1297 = var2.field1297;
    }

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "(I)V")
    public final void method162(int arg0) {
        this.field1299 = 1.0F;
        field1290++;
        this.field1296 = this.field1305 = class96.field1398[arg0 & 0x3FFF];
        this.field1301 = class96.field1400[arg0 & 0x3FFF];
        this.field1289 = -this.field1301;
        this.field1292 = this.field1288 = this.field1312 = this.field1307 = this.field1297 = this.field1310 = this.field1287 = 0.0F;
    }

    @OriginalMember(owner = "client!nf", name = "EA", descriptor = "(I)V")
    public final void method160(int arg0) {
        field1298++;
        float var2 = class96.field1398[arg0 & 0x3FFF];
        float var3 = class96.field1400[arg0 & 0x3FFF];
        float var4 = this.field1296;
        float var5 = this.field1289;
        float var6 = this.field1292;
        float var7 = this.field1288;
        this.field1296 = this.field1297 * var3 + var2 * var4;
        this.field1297 = this.field1297 * var2 - var3 * var4;
        this.field1289 = this.field1310 * var3 + var2 * var5;
        this.field1292 = this.field1299 * var3 + var2 * var6;
        this.field1310 = this.field1310 * var2 - var3 * var5;
        this.field1288 = this.field1287 * var3 + var2 * var7;
        this.field1299 = this.field1299 * var2 - (var3 * var6);
        this.field1287 = this.field1287 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
    public static final void method610(int arg0, byte arg1) {
        field1309++;
        if (class148.field1994 == arg0) {
            return;
        }
        if (class148.field1994 == 0) {
            class393.method2508((byte) 108);
        }
        if (arg0 == 12) {
            class250.method1729(class300.field4718, class270.field4310, class372.field5719, -25381);
        }
        if (arg0 != 12 && class457.field7053 != null) {
            class457.field7053.method1892(90);
            class457.field7053 = null;
        }
        if (arg0 == 2) {
            class221.method1614(26925, class509.field7597 != class39.field385);
        }
        if (arg0 == 6) {
            class232.method1651(true, field1308 != class509.field7597);
        }
        if (arg0 == 4) {
            class301.method2029(class372.field5719, class270.field4310, 105);
        } else if (arg0 == 5) {
            class250.method1729(class300.field4718, class270.field4310, class372.field5719, -25381);
        } else if (arg0 == 8) {
            class250.method1729(class300.field4718, class270.field4310, class372.field5719, -25381);
        } else if (arg0 == 11) {
            class301.method2029(class372.field5719, class270.field4310, 107);
        }
        if (class87.method602(10, class148.field1994)) {
            class483.field7346.field2342 = 2;
            class415.field6290.field2342 = 2;
            class263.field4264.field2342 = 2;
            class79.field1178.field2342 = 2;
            class181.field2636.field2342 = 2;
            class290.field4581.field2342 = 2;
            class463.field7119.field2342 = 2;
        }
        if (arg1 > -45) {
            method610(85, (byte) 123);
        }
        if (class87.method602(10, arg0)) {
            class354.field5504 = 1;
            class64.field1008 = 0;
            class189.field2744 = 0;
            class19.field203 = 1;
            class361.field5590 = 0;
            class94.method642(17795, true);
            class483.field7346.field2342 = 1;
            class415.field6290.field2342 = 1;
            class263.field4264.field2342 = 1;
            class79.field1178.field2342 = 1;
            class181.field2636.field2342 = 1;
            class290.field4581.field2342 = 1;
            class463.field7119.field2342 = 1;
        }
        if (arg0 == 10 || arg0 == 2) {
            class481.method2968(false);
        }
        if (arg0 == 1) {
            class416.method2656(class120.field1646, 2900, class19.field198);
        } else {
            class105.method710(-125);
        }
        boolean var2 = arg0 == 1 || class486.method2983((byte) 34, arg0) || class225.method1624(true, arg0);
        boolean var3 = class148.field1994 == 1 || class486.method2983((byte) 111, class148.field1994) || class225.method1624(true, class148.field1994);
        if (var3 != var2) {
            if (var2) {
                class236.field3874 = class317.field4937;
                if (class141.field1911.field6112 == 0) {
                    class78.method564((byte) 14, 2);
                } else {
                    class326.method2176(class141.field1911.field6112, 0, (byte) 122, class317.field4937, class305.field4799, 2, false);
                }
                class104.field1525.method1389(false, 3);
            } else {
                class78.method564((byte) 14, 2);
                class104.field1525.method1389(true, 3);
            }
        }
        if (class87.method602(10, arg0) || arg0 == 12) {
            class19.field198.method1315();
        }
        class148.field1994 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lc;I)V")
    public final void method611(class205 arg0, int arg1) {
        field1293++;
        class89 var3 = (class89) arg0;
        this.field1289 = var3.field1301;
        this.field1296 = var3.field1296;
        this.field1292 = var3.field1297;
        this.field1312 = var3.field1310;
        this.field1301 = var3.field1289;
        this.field1305 = var3.field1305;
        this.field1297 = var3.field1292;
        this.field1299 = var3.field1299;
        this.field1288 = -(this.field1292 * var3.field1287 + this.field1296 * var3.field1288 + this.field1289 * var3.field1307);
        if (arg1 != 16156) {
            this.field1310 = 0.11226407F;
        }
        this.field1310 = var3.field1312;
        this.field1307 = -(this.field1312 * var3.field1287 + this.field1305 * var3.field1307 + this.field1301 * var3.field1288);
        this.field1287 = -(this.field1299 * var3.field1287 + this.field1310 * var3.field1307 + this.field1297 * var3.field1288);
    }

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "(III[I)V")
    public final void method153(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field1292 + (float) arg0 * this.field1296 + (float) arg1 * this.field1289);
        field1295++;
        arg3[1] = (int) ((float) arg2 * this.field1312 + (float) arg0 * this.field1301 + (float) arg1 * this.field1305);
        arg3[2] = (int) ((float) arg2 * this.field1299 + (float) arg0 * this.field1297 + (float) arg1 * this.field1310);
    }

    @OriginalMember(owner = "client!nf", name = "wa", descriptor = "([I)V")
    public final void method159(int[] arg0) {
        field1303++;
        float var2 = (float) arg0[0] - this.field1288;
        float var3 = (float) arg0[1] - this.field1307;
        float var4 = (float) arg0[2] - this.field1287;
        arg0[0] = (int) (this.field1297 * var4 + this.field1301 * var3 + this.field1296 * var2);
        arg0[1] = (int) (this.field1310 * var4 + this.field1305 * var3 + this.field1289 * var2);
        arg0[2] = (int) (this.field1299 * var4 + this.field1312 * var3 + this.field1292 * var2);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)[F")
    public final float[] method612(boolean arg0) {
        class337.field5263[4] = this.field1289;
        field1280++;
        class337.field5263[12] = this.field1288;
        class337.field5263[8] = this.field1292;
        class337.field5263[13] = this.field1307;
        class337.field5263[5] = this.field1305;
        class337.field5263[2] = this.field1297;
        class337.field5263[6] = this.field1310;
        class337.field5263[0] = this.field1296;
        class337.field5263[10] = this.field1299;
        class337.field5263[14] = this.field1287;
        class337.field5263[9] = this.field1312;
        class337.field5263[1] = this.field1301;
        return arg0 ? null : class337.field5263;
    }

    @OriginalMember(owner = "client!nf", name = "ea", descriptor = "(I)V")
    public final void method166(int arg0) {
        field1291++;
        float var2 = class96.field1398[arg0 & 0x3FFF];
        float var3 = class96.field1400[arg0 & 0x3FFF];
        float var4 = this.field1301;
        float var5 = this.field1305;
        float var6 = this.field1312;
        this.field1301 = var2 * var4 - this.field1297 * var3;
        float var7 = this.field1307;
        this.field1305 = var2 * var5 - this.field1310 * var3;
        this.field1297 = this.field1297 * var2 + var3 * var4;
        this.field1310 = this.field1310 * var2 + var3 * var5;
        this.field1312 = var2 * var6 - (this.field1299 * var3);
        this.field1299 = this.field1299 * var2 + var3 * var6;
        this.field1307 = var2 * var7 - this.field1287 * var3;
        this.field1287 = this.field1287 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "()V")
    public final void method161() {
        this.field1296 = this.field1305 = this.field1299 = 1.0F;
        this.field1301 = this.field1297 = this.field1289 = this.field1310 = this.field1292 = this.field1312 = this.field1288 = this.field1307 = this.field1287 = 0.0F;
        field1283++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[I)V")
    public final void method154(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field1292 + (float) arg0 * this.field1296 + (float) arg1 * this.field1289 + this.field1288);
        field1302++;
        arg3[1] = (int) ((float) arg2 * this.field1312 + (float) arg0 * this.field1301 + (float) arg1 * this.field1305 + this.field1307);
        arg3[2] = (int) ((float) arg2 * this.field1299 + (float) arg0 * this.field1297 + (float) arg1 * this.field1310 + this.field1287);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static void method613(byte arg0) {
        if (arg0 <= 7) {
            field1313 = null;
        }
        field1314 = null;
        field1284 = null;
        field1313 = null;
    }

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        this.field1296 = this.field1305 = this.field1299 = 1.0F;
        this.field1288 = arg0;
        this.field1301 = this.field1297 = this.field1289 = this.field1310 = this.field1292 = this.field1312 = 0.0F;
        this.field1287 = arg2;
        this.field1307 = arg1;
        field1306++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZC)Z")
    public static final boolean method614(boolean arg0, char arg1) {
        field1279++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        } else if (arg0) {
            return true;
        } else {
            if (arg1 != '\u0000') {
                char[] var2 = class270.field4308;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(FIIFIFB)V")
    public final void method615(float arg0, int arg1, int arg2, float arg3, int arg4, float arg5, byte arg6) {
        field1311++;
        if (arg1 == 0) {
            this.field1299 = 1.0F;
            this.field1301 = this.field1297 = this.field1289 = this.field1310 = this.field1292 = this.field1312 = 0.0F;
            this.field1305 = arg4;
            this.field1296 = arg2;
        } else {
            float var8 = class96.field1398[arg1 & 0x3FFF];
            float var9 = class96.field1400[arg1 & 0x3FFF];
            this.field1299 = 1.0F;
            this.field1305 = (float) arg4 * var8;
            this.field1297 = this.field1310 = this.field1292 = this.field1312 = 0.0F;
            this.field1296 = (float) arg2 * var8;
            this.field1289 = (float) arg4 * -var9;
            this.field1301 = (float) arg2 * var9;
        }
        this.field1288 = arg5;
        this.field1307 = arg3;
        this.field1287 = arg0;
        if (arg6 != 106) {
            field1284 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "()Lc;")
    public final class205 method156() {
        field1281++;
        class89 var1 = new class89();
        var1.field1297 = this.field1297;
        var1.field1310 = this.field1310;
        var1.field1296 = this.field1296;
        var1.field1289 = this.field1289;
        var1.field1312 = this.field1312;
        var1.field1301 = this.field1301;
        var1.field1288 = this.field1288;
        var1.field1305 = this.field1305;
        var1.field1287 = this.field1287;
        var1.field1292 = this.field1292;
        var1.field1299 = this.field1299;
        var1.field1307 = this.field1307;
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public final void method155(int arg0) {
        this.field1296 = 1.0F;
        field1304++;
        this.field1305 = this.field1299 = class96.field1398[arg0 & 0x3FFF];
        this.field1310 = class96.field1400[arg0 & 0x3FFF];
        this.field1312 = -this.field1310;
        this.field1289 = this.field1292 = this.field1288 = this.field1301 = this.field1307 = this.field1297 = this.field1287 = 0.0F;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class89() {
        this.method161();
    }
}
