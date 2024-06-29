import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class73 {

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Lbl;")
    private class442 field1294;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Ltn;")
    private class55 field1293;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    private int field1297;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "[B")
    public byte[] field1290;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    private int field1289;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    private int field1301;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
    public static int[] field1291 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Lsk;")
    public static class423 field1296 = new class423("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "Ltq;")
    public static class427 field1312 = null;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "Z")
    public static boolean field1313;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Llt;")
    public static class458 field1310;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "[[Lgo;")
    private class426[][] field1298;

    static {
        new class423("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
        field1313 = false;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V", line = 7)
    private final void method540(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1309++;
        if (arg0 >= -125) {
            method546((byte) -48, null);
        }
        if (this.field1298 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 - (1 - (arg2 - 1)) >> 7;
        int var8 = arg4 - 1 >> 7;
        int var9 = arg4 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class426[] var11 = this.field1298[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6114 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 52)
    public final void method541(int arg0) {
        this.field1298 = new class426[this.field1301][this.field1299];
        field1300++;
        for (int var2 = arg0; var2 < this.field1299; var2++) {
            for (int var3 = 0; var3 < this.field1301; var3++) {
                this.field1298[var3][var2] = new class426(this.field1294, this, this.field1293, var3, var2, this.field1289, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIILh;)V", line = 78)
    public final void method542(int arg0, int arg1, int arg2, class452 arg3) {
        int var5 = 36 % ((arg1 - 60) / 34);
        field1295++;
        class279 var6 = (class279) arg3;
        int var7 = var6.field4233 + arg2 + 1;
        int var8 = var6.field4242 + arg0 + 1;
        int var9 = var8 + (this.field1303 * var7);
        int var10 = 0;
        int var11 = var6.field4241;
        int var12 = var6.field4237;
        int var13 = this.field1303 - var12;
        int var14 = 0;
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var11 -= var15;
            var7 = 1;
            var9 += this.field1303 * var15;
            var10 += var12 * var15;
        }
        if (this.field1297 <= var7 + var11) {
            int var16 = var7 + var11 - (this.field1297 + -1);
            var11 -= var16;
        }
        if (var8 <= 0) {
            int var17 = 1 - var8;
            var12 -= var17;
            var9 += var17;
            var8 = 1;
            var13 += var17;
            var14 += var17;
            var10 += var17;
        }
        if (this.field1303 <= var8 + var12) {
            int var18 = var12 + var8 + 1 - this.field1303;
            var12 -= var18;
            var13 += var18;
            var14 += var18;
        }
        if (var12 > 0 && var11 > 0) {
            class419.method2456(var9, var10, var11, -1, var6.field4238, var14, var12, var13, this.field1290);
            this.method540(-126, var11, var12, var8, var7);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 149)
    public static final void method543(byte arg0) {
        if (client.field2992 == 10) {
            class189.method1196(28, arg0 - 12249);
        }
        if (arg0 == -5) {
            field1308++;
            if (client.field2992 == 30) {
                class189.method1196(25, arg0 - 12249);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILh;II)Z", line = 167)
    public final boolean method544(int arg0, class452 arg1, int arg2, int arg3) {
        int var5 = 64 / ((51 - arg2) / 59);
        field1305++;
        class279 var6 = (class279) arg1;
        int var7 = var6.field4242 + arg0 + 1;
        int var8 = var6.field4233 + arg3 + 1;
        int var9 = this.field1303 * var8 + var7;
        int var10 = var6.field4241;
        int var11 = var6.field4237;
        int var12 = this.field1303 - var11;
        if (var8 <= 0) {
            int var13 = 1 - var8;
            var9 += this.field1303 * var13;
            var10 -= var13;
            var8 = 1;
        }
        if (this.field1297 <= (var8 + var10)) {
            int var14 = var8 + var10 + 1 - this.field1297;
            var10 -= var14;
        }
        if (var7 <= 0) {
            int var15 = 1 - var7;
            var12 += var15;
            var9 += var15;
            var11 -= var15;
            var7 = 1;
        }
        if (this.field1303 <= (var7 + var11)) {
            int var16 = var7 + var11 + 1 - this.field1303;
            var11 -= var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field1303 + var12;
            return class54.method382(var10, var11, var18, var9, var17, (byte) 56, this.field1290);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBLh;I)V", line = 240)
    public final void method545(int arg0, byte arg1, class452 arg2, int arg3) {
        field1304++;
        class279 var5 = (class279) arg2;
        if (arg1 > -39) {
            return;
        }
        int var6 = var5.field4242 + arg3 + 1;
        int var7 = var5.field4233 + arg0 + 1;
        int var8 = this.field1303 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4241;
        int var11 = var5.field4237;
        int var12 = this.field1303 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var8 += this.field1303 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field1297 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field1297;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var12 += var16;
            var6 = 1;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field1303 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field1303;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class372.method2248(var10, this.field1290, var12, var14, var9, 52, var11, var8, var5.field4238);
            this.method540(-128, var10, var11, var6, var7);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLha;)V", line = 312)
    public static final void method546(byte arg0, class40 arg1) {
        for (int var2 = 0; var2 < class177.field2767; var2++) {
            int var3 = arg1.method236(true);
            int var4 = arg1.method254((byte) -89);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class105.field1838[var3] != null) {
                class105.field1838[var3].field4914 = var4;
            }
        }
        if (arg0 > -55) {
            method548(74, 13, true, -37, -108, -106, false);
        }
        field1302++;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V", line = 348)
    public static final void method547(boolean arg0) {
        field1292++;
        if (!arg0 || class345.field5116 == null) {
            return;
        }
        class359.field5315.method1317(3);
        class111.method796();
        class286.method1742(-1);
        class511.method3058((byte) 38);
        class57.method406((byte) -125);
        class318.method1950(arg0);
        if (class96.field1741 != null) {
            class96.field1741.method294(-83);
        }
        class160.method1033((byte) -89);
        class145.method954(124);
        class139.method928(121);
        class434.method2536(-20860, false);
        class39.method215(-18462);
        for (int var1 = 0; var1 < 2048; var1++) {
            class47 var5 = class224.field3450[var1];
            if (var5 != null) {
                var5.field2236 = null;
                for (int var6 = 0; var6 < var5.field2235.length; var6++) {
                    var5.field2235[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class195.field3085.length; var2++) {
            class249 var3 = class195.field3085[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field2235.length; var4++) {
                    var3.field2235[var4] = null;
                }
            }
        }
        class345.field5116.method1974(-25261);
        class345.field5116 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIZIIIZ)V", line = 428)
    public static final void method548(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 < arg1) {
            int var7 = (arg4 + arg1) / 2;
            int var8 = arg4;
            class471 var9 = class486.field7402[var7];
            class486.field7402[var7] = class486.field7402[arg1];
            class486.field7402[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if (class386.method2301(var9, arg2, false, class486.field7402[var10], arg0, arg6, arg3) <= 0) {
                    class471 var11 = class486.field7402[var10];
                    class486.field7402[var10] = class486.field7402[var8];
                    class486.field7402[var8++] = var11;
                }
            }
            class486.field7402[arg1] = class486.field7402[var8];
            class486.field7402[var8] = var9;
            method548(arg0, var8 - 1, arg2, arg3, arg4, -25754, arg6);
            method548(arg0, arg1, arg2, arg3, var8 + 1, -25754, arg6);
        }
        field1307++;
        if (arg5 != -25754) {
            field1312 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lbl;Ltn;)V", line = 475)
    public class73(class442 arg0, class55 arg1) {
        this.field1294 = arg0;
        this.field1293 = arg1;
        this.field1303 = (this.field1293.field5108 * this.field1293.field5107 >> this.field1294.field6686) + 2;
        this.field1297 = (this.field1293.field5107 * this.field1293.field5105 >> this.field1294.field6686) + 2;
        this.field1290 = new byte[this.field1303 * this.field1297];
        this.field1289 = this.field1294.field6686 + 7 - this.field1293.field5112;
        this.field1301 = this.field1293.field5108 >> this.field1289;
        this.field1299 = this.field1293.field5105 >> this.field1289;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(Z)V", line = 491)
    public static void method549(boolean arg0) {
        field1312 = null;
        field1291 = null;
        field1310 = null;
        if (!arg0) {
            field1296 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[[ZIZI)V", line = 512)
    public final void method550(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5) {
        this.field1294.method2600((byte) -68, false);
        field1306++;
        this.field1294.method2598(arg3 + 44409, false);
        this.field1294.method2650((byte) -125, -2);
        this.field1294.method2610(0, 1);
        if (arg3 != -13735) {
            this.method545(-128, (byte) 75, null, -113);
        }
        this.field1294.method2640(27575, 1);
        float var7 = 1.0F / (float) (this.field1294.field6685 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field1299; var22++) {
                int var23 = var22 << this.field1289;
                int var24 = var22 + 1 << this.field1289;
                label88: for (int var25 = 0; var25 < this.field1301; var25++) {
                    int var26 = var25 << this.field1289;
                    int var27 = var25 + 1 << this.field1289;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg5 >= -arg1 && arg1 >= var28 - arg5) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (-arg1 <= var29 - arg0 && var29 - arg0 <= arg1 && arg2[var28 + arg1 - arg5][arg1 + var29 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field1298[var25][var22].method2500((byte) -124);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field1299; var8++) {
                int var9 = var8 << this.field1289;
                int var10 = var8 + 1 << this.field1289;
                for (int var11 = 0; var11 < this.field1301; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field1289;
                    int var14 = var11 + 1 << this.field1289;
                    class40 var15 = class456.field6997;
                    var15.field585 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (var16 - arg0 >= -arg1 && (var16 - arg0) <= arg1) {
                            int var17 = this.field1293.field5108 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg1 <= var18 - arg5 && arg1 >= var18 - arg5 && arg2[arg1 + var18 - arg5][var16 + arg1 - arg0]) {
                                    short[] var19 = this.field1293.field835[var17];
                                    if (var19 != null) {
                                        if (this.field1294.field6745) {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var12++;
                                                var15.method246((byte) -127, var19[var21] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method260(var19[var20] & 0xFFFF, -2916);
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field1298[var11][var8].method2499(var12, 5123, var15.field536, 0);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }
}
