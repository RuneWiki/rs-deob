import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class104 {

    @OriginalMember(owner = "client!st", name = "i", descriptor = "Ltg;")
    public class514 field1564 = new class514();

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field1562 = 0;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "Ldp;")
    public static class347 field1566;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Ltg;")
    private class514 field1565;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method781(byte arg0) {
        field1566 = null;
        if (arg0 != -21) {
            field1566 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static final void method782(int arg0) {
        field1556++;
        if (class96.field1501 == -1 || class39.field520 == -1) {
            return;
        }
        int var1 = ((class147.field2224 - class438.field6447) * class173.field2528 >> 16) + class438.field6447;
        class173.field2528 += var1;
        if (class173.field2528 >= 65535) {
            class173.field2528 = 65535;
            if (class187.field2754) {
                class519.field7607 = false;
            } else {
                class519.field7607 = true;
            }
            class187.field2754 = true;
        } else {
            class187.field2754 = false;
            class519.field7607 = false;
        }
        float var2 = (float) class173.field2528 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class443.field6517 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class277.field4142[class96.field1501][var4][var5] * 3;
            int var22 = class277.field4142[class96.field1501][var4 + 1][var5] * 3;
            int var23 = (class277.field4142[class96.field1501][var4 + 2][var5] + class277.field4142[class96.field1501][var4 + 2][var5] - class277.field4142[class96.field1501][var4 + 3][var5]) * 3;
            int var24 = class277.field4142[class96.field1501][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = var22 + class277.field4142[class96.field1501][var4 + 2][var5] - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class393.field5897 = (int) var3[2] - (class241.field3358 * 128);
        class201.field2925 = (int) var3[1] * -1;
        class282.field4263 = (int) var3[0] - (class267.field3979 * 128);
        float[] var6 = new float[3];
        int var7 = class276.field4121 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class277.field4142[class39.field520][var7][var8] * 3;
            int var15 = class277.field4142[class39.field520][var7 + 1][var8] * 3;
            int var16 = (class277.field4142[class39.field520][var7 + 2][var8] + class277.field4142[class39.field520][var7 - -2][var8] - class277.field4142[class39.field520][var7 + 3][var8]) * 3;
            int var17 = class277.field4142[class39.field520][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class277.field4142[class39.field520][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0 != 18326) {
            return;
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class350.field5383 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class431.field6396 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class487.field7247 = ((class277.field4142[class96.field1501][var4 + 2][3] - class277.field4142[class96.field1501][var4][3]) * class173.field2528 >> 16) + class277.field4142[class96.field1501][var4][3];
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
    public final int method783(int arg0) {
        if (arg0 != -27084) {
            return 22;
        }
        field1560++;
        int var2 = 0;
        for (class514 var3 = this.field1564.field7523; var3 != this.field1564; var3 = var3.field7523) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILtg;)V")
    public final void method784(int arg0, class514 arg1) {
        field1561++;
        if (arg1.field7518 != null) {
            arg1.method3021(arg0 ^ 0xFFFFDD7F);
        }
        arg1.field7518 = this.field1564.field7518;
        arg1.field7523 = this.field1564;
        arg1.field7518.field7523 = arg1;
        arg1.field7523.field7518 = arg1;
        if (arg0 != 10693) {
            field1562 = -68;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Ltg;")
    public final class514 method785(byte arg0) {
        int var2 = -65 % (arg0 / 53);
        field1558++;
        class514 var3 = this.field1564.field7523;
        if (this.field1564 == var3) {
            this.field1565 = null;
            return null;
        } else {
            this.field1565 = var3.field7523;
            return var3;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZIILgo;)V")
    public static final void method786(int arg0, boolean arg1, int arg2, int arg3, class310 arg4) {
        field1557++;
        int var5 = arg4.field4661;
        if (arg4.field4690 == 0) {
            arg4.field4661 = arg4.field4664;
        } else if (arg4.field4690 == 1) {
            arg4.field4661 = arg0 - arg4.field4664;
        } else if (arg4.field4690 == 2) {
            arg4.field4661 = arg4.field4664 * arg0 >> 14;
        }
        int var6 = arg4.field4736;
        if (arg3 != -4400) {
            field1562 = -80;
        }
        if (arg4.field4654 == 0) {
            arg4.field4736 = arg4.field4730;
        } else if (arg4.field4654 == 1) {
            arg4.field4736 = arg2 - arg4.field4730;
        } else if (arg4.field4654 == 2) {
            arg4.field4736 = arg4.field4730 * arg2 >> 14;
        }
        if (arg4.field4690 == 4) {
            arg4.field4661 = arg4.field4736 * arg4.field4666 / arg4.field4768;
        }
        if (arg4.field4654 == 4) {
            arg4.field4736 = arg4.field4768 * arg4.field4661 / arg4.field4666;
        }
        if (class418.field6270 && (client.method3039(arg4).field5948 != 0 || arg4.field4703 == 0)) {
            if (arg4.field4736 < 5 && arg4.field4661 < 5) {
                arg4.field4661 = 5;
                arg4.field4736 = 5;
            } else {
                if (arg4.field4661 <= 0) {
                    arg4.field4661 = 5;
                }
                if (arg4.field4736 <= 0) {
                    arg4.field4736 = 5;
                }
            }
        }
        if (class297.field4428 == arg4.field4680) {
            class15.field198 = arg4;
        }
        if (arg1 && arg4.field4789 != null && arg4.field4661 != var5 || arg4.field4736 != var6) {
            class120 var7 = new class120();
            var7.field1832 = arg4.field4789;
            var7.field1833 = arg4;
            class478.field7041.method2958(var7, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
    public final void method787(int arg0) {
        if (arg0 > -49) {
            field1566 = null;
        }
        field1559++;
        while (true) {
            class514 var2 = this.field1564.field7523;
            if (this.field1564 == var2) {
                this.field1565 = null;
                return;
            }
            var2.method3021(-2886);
        }
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)Ltg;")
    public final class514 method788(int arg0) {
        field1563++;
        class514 var2 = this.field1565;
        if (arg0 != -27735) {
            this.field1564 = null;
        }
        if (this.field1564 == var2) {
            this.field1565 = null;
            return null;
        } else {
            this.field1565 = var2.field7523;
            return var2;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class104() {
        this.field1564.field7518 = this.field1564;
        this.field1564.field7523 = this.field1564;
    }

    static {
        new class347("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field1566 = new class347("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");
    }
}
