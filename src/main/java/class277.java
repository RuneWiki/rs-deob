import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class277 implements class126 {

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Lhl;")
    private class366 field3995 = new class366(256);

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "Lbu;")
    private class17 field3987;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "Lbu;")
    private class17 field3999;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "[Lfg;")
    private class83[] field3985;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "[I")
    public static int[] field3992 = new int[1];

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "[I")
    public static int[] field3998 = new int[100];

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lpi;")
    public static class342 field3984 = new class342("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Lrn;")
    public static class174 field4000 = new class174(49, 4);

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "Liv;")
    public static class64 field4001;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field3997;

    static {
        new class342("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field4001 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIZZF)[I", line = 7)
    public final int[] method958(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, float arg5) {
        field3997++;
        if (!arg3) {
            this.field3999 = null;
        }
        return this.method1765(arg0, -1948).method2056(true, (double) arg5, this.field3985[arg0].field1453, this, arg4, this.field3987, arg1, arg2);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILob;II)V", line = 21)
    public static final void method1764(int arg0, int arg1, class517 arg2, int arg3, int arg4) {
        if (arg0 != -1) {
            method1764(117, -14, null, 91, 34);
        }
        field3996++;
        class435 var5 = arg2.method3094(-37);
        int var6 = arg2.field7674 - arg2.field7676.field4965 & 0x3FFF;
        if (arg1 == -1) {
            if (var6 != 0 || arg2.field7628 > 25) {
                arg2.field7682 = false;
                if (arg3 < 0 && var5.field6456 != -1) {
                    arg2.field7666 = var5.field6456;
                } else if (arg3 <= 0 || var5.field6480 == -1) {
                    arg2.field7666 = var5.field6484;
                } else {
                    arg2.field7666 = var5.field6480;
                }
            } else if (!arg2.field7682 || !var5.method2597(arg2.field7666, 118)) {
                arg2.field7666 = var5.method2591(-1);
                arg2.field7682 = arg2.field7666 != -1;
            }
        } else if (arg2.field7602 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class337.field5082[arg4] - arg2.field7676.field4965 & 0x3FFF;
            arg2.field7682 = false;
            if (arg1 == 2 && var5.field6454 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6490 != -1) {
                    arg2.field7666 = var5.field6490;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6488 != -1) {
                    arg2.field7666 = var5.field6488;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6493 == -1) {
                    arg2.field7666 = var5.field6454;
                } else {
                    arg2.field7666 = var5.field6493;
                }
            } else if (arg1 == 0 && var5.field6450 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6476 != -1) {
                    arg2.field7666 = var5.field6476;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6462 != -1) {
                    arg2.field7666 = var5.field6462;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6448 == -1) {
                    arg2.field7666 = var5.field6450;
                } else {
                    arg2.field7666 = var5.field6448;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6444 != -1) {
                arg2.field7666 = var5.field6444;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6445 != -1) {
                arg2.field7666 = var5.field6445;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6489 == -1) {
                arg2.field7666 = var5.field6484;
            } else {
                arg2.field7666 = var5.field6489;
            }
        } else if (var6 == 0 && arg2.field7628 <= 25) {
            arg2.field7682 = false;
            if (arg1 == 2 && var5.field6454 != -1) {
                arg2.field7666 = var5.field6454;
            } else if (arg1 == 0 && var5.field6450 != -1) {
                arg2.field7666 = var5.field6450;
            } else {
                arg2.field7666 = var5.field6484;
            }
        } else {
            arg2.field7682 = false;
            if (arg1 == 2 && var5.field6454 != -1) {
                if (arg3 < 0 && var5.field6470 != -1) {
                    arg2.field7666 = var5.field6470;
                } else if (arg3 <= 0 || var5.field6440 == -1) {
                    arg2.field7666 = var5.field6454;
                } else {
                    arg2.field7666 = var5.field6440;
                }
            } else if (arg1 == 0 && var5.field6450 != -1) {
                if (arg3 < 0 && var5.field6459 != -1) {
                    arg2.field7666 = var5.field6459;
                } else if (arg3 <= 0 || var5.field6473 == -1) {
                    arg2.field7666 = var5.field6450;
                } else {
                    arg2.field7666 = var5.field6473;
                }
            } else if (arg3 < 0 && var5.field6452 != -1) {
                arg2.field7666 = var5.field6452;
            } else if (arg3 <= 0 || var5.field6443 == -1) {
                arg2.field7666 = var5.field6484;
            } else {
                arg2.field7666 = var5.field6443;
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)Z", line = 182)
    public final boolean method959(int arg0, byte arg1) {
        if (arg1 != 94) {
            field3984 = null;
        }
        field3990++;
        class315 var3 = this.method1765(arg0, -1948);
        return var3 != null && var3.method2053(this.field3987, (byte) -58, this);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(II)Lwr;", line = 195)
    private final class315 method1765(int arg0, int arg1) {
        field3989++;
        if (arg1 != -1948) {
            return null;
        }
        class200 var3 = this.field3995.method2289(-54, (long) arg0);
        if (var3 != null) {
            return (class315) var3;
        }
        byte[] var4 = this.field3999.method140(arg0, arg1 ^ 0xFFFFF865);
        if (var4 == null) {
            return null;
        } else {
            class315 var5 = new class315(new class145(var4));
            this.field3995.method2287((long) arg0, (byte) 90, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 223)
    public static final void method1766(int arg0) {
        if (arg0 < 87) {
            method1767(false, null);
        }
        field3994++;
        class243.method1587(0);
        class271.method1747(class443.field6623.field621, 22050, 2, -83);
        class427.field6349 = class158.method1180(22050, 2, class368.field5553, 0, class370.field5611);
        class427.field6349.method669(class436.field6494, 0);
        class199.field2921 = class158.method1180(2048, 2, class368.field5553, 1, class370.field5611);
        class199.field2921.method669(class45.field837, 0);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIIFII)[I", line = 241)
    public final int[] method957(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg5 != 26878) {
            this.field3985 = null;
        }
        field3988++;
        return this.method1765(arg1, -1948).method2059(this.field3987, arg2, (byte) -118, arg4, (double) arg3, this.field3985[arg1].field1453, this);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)Lfg;", line = 252)
    public final class83 method956(int arg0, int arg1) {
        field3986++;
        if (arg0 != -945) {
            method1768(95);
        }
        return this.field3985[arg1];
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZLmq;)V", line = 264)
    public static final void method1767(boolean arg0, class350 arg1) {
        field3993++;
        if (!class99.field1638) {
            return;
        }
        if (arg1.field5249 != null) {
            class350 var2 = class83.method649((byte) 66, class383.field5790, class347.field5187);
            if (var2 != null) {
                class207 var3 = new class207();
                var3.field2995 = arg1;
                var3.field2998 = var2;
                var3.field2996 = arg1.field5249;
                class437.method2614(var3);
            }
        }
        class57.field1000++;
        class28.method321(class159.field2471, -5001);
        if (!arg0) {
            field3992 = null;
        }
        class410.field6141.method1117(arg1.field5322, (byte) 12);
        class410.field6141.method1068((byte) -40, class347.field5187);
        class410.field6141.method1094(1618659784, arg1.field5354);
        class410.field6141.method1095(-16, arg1.field5273);
        class410.field6141.method1068((byte) -124, class63.field1086);
        class410.field6141.method1117(class383.field5790, (byte) 12);
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V", line = 303)
    public static void method1768(int arg0) {
        int var1 = -74 % ((arg0 - 8) / 53);
        field3992 = null;
        field4000 = null;
        field3984 = null;
        field3998 = null;
        field4001 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IFIZII)[F", line = 321)
    public final float[] method960(int arg0, float arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 == -21557) {
            field3991++;
            return this.method1765(arg4, -1948).method2058(this.field3987, this.field3985[arg4].field1453, arg5, this, 39, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lbu;Lbu;Lbu;)V", line = 334)
    public class277(class17 arg0, class17 arg1, class17 arg2) {
        this.field3987 = arg2;
        this.field3999 = arg1;
        class145 var4 = new class145(arg0.method114(0, 0, -89));
        int var5 = var4.method1069((byte) -97);
        this.field3985 = new class83[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1063((byte) 119) == 1) {
                this.field3985[var6] = new class83();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3985[var7] != null) {
                this.field3985[var7].field1427 = var4.method1063((byte) -57) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3985[var8] != null) {
                this.field3985[var8].field1441 = var4.method1063((byte) 107) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3985[var9] != null) {
                this.field3985[var9].field1429 = var4.method1063((byte) 122) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3985[var10] != null) {
                this.field3985[var10].field1431 = var4.method1063((byte) -109) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3985[var11] != null) {
                this.field3985[var11].field1446 = var4.method1093(15);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3985[var12] != null) {
                this.field3985[var12].field1449 = var4.method1093(15);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3985[var13] != null) {
                this.field3985[var13].field1451 = var4.method1093(15);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3985[var14] != null) {
                this.field3985[var14].field1428 = var4.method1093(15);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3985[var15] != null) {
                this.field3985[var15].field1432 = (short) var4.method1069((byte) -26);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3985[var16] != null) {
                this.field3985[var16].field1430 = var4.method1093(15);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3985[var17] != null) {
                this.field3985[var17].field1433 = var4.method1093(15);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3985[var18] != null) {
                this.field3985[var18].field1445 = var4.method1063((byte) -97) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3985[var19] != null) {
                this.field3985[var19].field1453 = var4.method1063((byte) -32) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3985[var20] != null) {
                this.field3985[var20].field1438 = var4.method1093(15);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3985[var21] != null) {
                this.field3985[var21].field1437 = var4.method1063((byte) -122) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3985[var22] != null) {
                this.field3985[var22].field1434 = var4.method1063((byte) -85) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3985[var23] != null) {
                this.field3985[var23].field1443 = var4.method1063((byte) 120) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field3985[var24] != null) {
                this.field3985[var24].field1442 = var4.method1063((byte) -93);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field3985[var25] != null) {
                this.field3985[var25].field1440 = var4.method1070(-32387);
            }
        }
    }
}
