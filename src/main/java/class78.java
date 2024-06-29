import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class78 extends class439 {

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
    public int[] field1302 = new int[1];

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "[I")
    public int[] field1306 = new int[] { -1 };

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lgf;")
    public static class180 field1303;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
    public static int[] field1305;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "[I")
    public static int[] field1308;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "Lgf;")
    public static class180 field1307;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field1304;

    static {
        new class180("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field1303 = new class180("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
        field1305 = new int[] { 1, 2, 4, 8 };
        field1308 = new int[4];
        field1307 = new class180("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([I[IIIZ)J", line = 3)
    private final long method635(int[] arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        field1301++;
        long[] var6 = class81.field1339;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg3 ^ var9) & 0xFFL)];
        for (int var13 = arg2; var13 < arg1.length; var13++) {
            long var17 = var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)];
            }
        }
        return var6[(int) ((var11 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V", line = 43)
    public static void method636(int arg0) {
        field1307 = null;
        if (arg0 == -1) {
            field1305 = null;
            field1308 = null;
            field1303 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZILqn;ILqa;Ldn;IZI)Lc;", line = 56)
    public final class121 method637(int arg0, boolean arg1, int arg2, class45 arg3, int arg4, class162 arg5, class357 arg6, int arg7, boolean arg8, int arg9) {
        field1300++;
        class121 var11 = null;
        int var12 = arg4;
        class441 var13 = null;
        if (arg7 != -1) {
            var13 = class4.field64.method1199(arg7, (byte) -40);
        }
        int[] var14 = this.field1306;
        if (var13 != null && var13.field6456 != null) {
            var14 = new int[var13.field6456.length];
            for (int var15 = 0; var15 < var13.field6456.length; var15++) {
                int var16 = var13.field6456[var15];
                if (var16 >= 0 && this.field1306.length > var16) {
                    var14[var15] = this.field1306[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class402 var24 = null;
        class402 var25 = null;
        if (arg6 != null) {
            int var26 = arg6.field5395[arg0];
            var12 = arg4 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class311.field4455.method1232((byte) -46, var27);
            if (var24 != null) {
                var18 |= var24.method2501(var21, -13123);
                var17 |= var24.method2499(var21, (byte) 107);
                var20 |= var24.method2500(var21, true);
                var19 |= arg6.field5391;
            }
            if ((arg6.field5411 || class66.field1151) && arg9 != -1 && arg6.field5395.length > arg9) {
                int var28 = arg6.field5395[arg9];
                var23 = arg6.field5408[arg0];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class311.field4455.method1232((byte) -46, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2501(var22, -13123);
                    var17 |= var25.method2499(var22, (byte) 83);
                    var20 |= var25.method2500(var22, arg1);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method635(arg3 == null ? null : arg3.field679, var14, 0, arg7, arg8);
        if (class455.field6737 != null) {
            var11 = (class121) class455.field6737.method2339(-64, var30);
        }
        if (var11 == null || arg5.method518(var11.method915(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method472(var12, var11.method915());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class8.field111.method3077(2, var14[var34]).method1219(arg8, (byte) -89)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class527[] var35 = new class527[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class8.field111.method3077(6, var14[var36]).method1221(arg8, arg1);
                }
            }
            if (var13 != null && var13.field6460 != null) {
                for (int var37 = 0; var37 < var13.field6460.length; var37++) {
                    if (var13.field6460[var37] != null && var35[var37] != null) {
                        int var38 = var13.field6460[var37][0];
                        int var39 = var13.field6460[var37][1];
                        int var40 = var13.field6460[var37][2];
                        int var41 = var13.field6460[var37][3];
                        int var42 = var13.field6460[var37][4];
                        int var43 = var13.field6460[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3119(var43, var42, var41, 105);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3114(var40, var38, false, var39);
                        }
                    }
                }
            }
            class527 var44 = new class527(var35, var35.length);
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg5.method499(var44, var32, class219.field3159, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg3.field679[var45] < class497.field7230[var45].length) {
                        var11.method917(class477.field7000[var45], class497.field7230[var45][arg3.field679[var45]]);
                    }
                    if (arg3.field679[var45] < class274.field3964[var45].length) {
                        var11.method917(class469.field6909[var45], class274.field3964[var45][arg3.field679[var45]]);
                    }
                }
            }
            if (class455.field6737 != null) {
                var11.method894(var12);
                class455.field6737.method2342(var30, var11, -65);
            }
        }
        if (arg6 == null || var24 == null) {
            return var11;
        } else {
            class121 var46 = var11.method881((byte) 1, var12, arg1);
            var46.method893(arg2 - 1, arg6.field5391, var24, var21, var23, var25, var22, 0, false);
            return var46;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V", line = 293)
    public static final void method638(int arg0, int arg1, int arg2) {
        field1304++;
        class434 var3 = class483.method2888(arg1, -112, 5);
        var3.method2632((byte) 81);
        int var4 = -101 / ((arg2 - 16) / 41);
        var3.field6310 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;)V", line = 311)
    public static final void method639(int arg0, String arg1) {
        field1299++;
        if (class172.field2628 == null) {
            return;
        }
        class114.method841(false, class397.field5831);
        class220.field3167++;
        class86.field1436.method1923((byte) 62, class8.method57(-121, arg1));
        if (arg0 != 0) {
            method636(21);
        }
        class86.field1436.method1882((byte) -102, arg1);
    }
}
