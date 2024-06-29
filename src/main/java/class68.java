import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class68 extends class35 {

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Lct;")
    public static class285 field919 = new class285(65, -1);

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field923 = -1;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "[I")
    private static int[] field924 = new int[64];

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "Lo;")
    public static class332 field926 = new class332("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "Z")
    public static boolean field929 = false;

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field930;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "Ldp;")
    public class319 field921;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ok", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field931;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "Z")
    public boolean field927;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static final void method600(int arg0) {
        field925++;
        int var1 = client.field6674.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (client.field6674[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class92.field1276; var4++) {
                    if (field924[var4] == class145.field2052[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    field924[class92.field1276] = class145.field2052[var2];
                    var3 = class92.field1276++;
                }
                class446 var5 = new class446(client.field6674[var2]);
                int var6 = 0;
                while (var5.field6315 < client.field6674[var2].length && var6 < 511 && class256.field3797 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2631(2530);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class145.field2052[var2] >> 8) * 64 - (field922 - var10);
                    int var13 = (class145.field2052[var2] & 0xFF) * 64 + var11 - class468.field6588;
                    class273 var14 = class448.field6339.method334(var5.method2631(2530), (byte) 104);
                    if (class18.field241[var7] == null && (var14.field4140 & 0x1) > 0 && class314.field4722 == var9 && var12 >= 0 && class379.field5642 > (var14.field4147 + var12) && var13 >= 0 && class456.field6477 > (var13 + var14.field4147)) {
                        class18.field241[var7] = new class349();
                        class18.field241[var7].field4609 = var7;
                        class349 var15 = class18.field241[var7];
                        class236.field3441[class256.field3797++] = var7;
                        var15.field4595 = class452.field6418;
                        var15.method2154(var14, (byte) 48);
                        var15.method1919(var15.field5309.field4147, (byte) -16);
                        var15.field4621 = var15.field5309.field4131 << 3;
                        if (var15.field4621 == 0) {
                            var15.method1926(0, 104);
                        } else {
                            var15.method1926(var15.field5309.field4145 + 4 << 11 & 0x3A1F, 107);
                        }
                        var15.method2155(var9, var13, 8877, var15.method1705((byte) 65), true, var12);
                    }
                }
            }
        }
        if (arg0 >= -42) {
            method600(85);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZ)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field918++;
        if (!arg4) {
            method603();
        }
        if (class337.field5038.field3949 == 0 || arg3 == 0 || class198.field2984 >= 50 || arg0 == -1) {
            return;
        }
        class78.field1107[class198.field2984] = arg0;
        class419.field6024[class198.field2984] = arg3;
        class385.field5696[class198.field2984] = arg2;
        class283.field4297[class198.field2984] = null;
        class325.field4876[class198.field2984] = 0;
        class37.field476[class198.field2984] = arg1;
        class198.field2984++;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
    public static void method602(int arg0) {
        if (arg0 != 0) {
            field929 = true;
        }
        field919 = null;
        field926 = null;
        field930 = null;
        field924 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V")
    public static final void method603() {
        for (int var0 = 0; var0 < class363.field5511; var0++) {
            if (!class263.field3920[var0]) {
                class212 var1 = class78.field1108[var0];
                int var2 = var1.field3188;
                int var3 = var1.field3407 - class47.field683;
                int var4 = (var3 * 2 >> class426.field6091) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field3414 - var3 >> class426.field6091;
                int var8 = var1.field3413 - var3 >> class426.field6091;
                int var9 = var1.field3413 + var3 >> class426.field6091;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class315.field4743) {
                    var9 = class315.field4743 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field3191[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class412.field5957) {
                        var15 = class412.field5957 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class305 var18 = class390.method2350(var2, var16, var10, field931 == null ? (field931 = method604("ug")) : field931);
                        if (var18 != null && var18.field4537 != 0) {
                            if (var18.field4537 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field3191[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field3191[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field3191[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field3191[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class263.field3920[var0] = true;
                class479.field6745[var2].method196(var1, var6);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method604(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class332("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field930 = new String[100];
    }
}
