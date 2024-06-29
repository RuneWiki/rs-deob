import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public abstract class class401 {

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Ljn;")
    public static class409 field5794 = new class409("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "Lbt;")
    public static class363 field5795 = new class363(64);

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "Lbn;")
    public static class160 field5799;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "Ljn;")
    public static class409 field5800;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
    public static int field5791;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Lclient;")
    public static client field5797;

    static {
        new class409("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5798 = 12;
        field5799 = new class160(29, 0);
        field5800 = new class409("green:", "grün:", "vert:", "verde:");
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lfp;ZILui;Z[Lth;)V", line = 4)
    public static final void method2505(class9 arg0, boolean arg1, int arg2, class378 arg3, boolean arg4, class175[] arg5) {
        if (!arg4) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class195.field2745; var7++) {
                    for (int var8 = 0; var8 < class78.field984; var8++) {
                        if ((class131.field1790[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class131.field1790[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg5[var9].method1219(var8, -1862, var7);
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            return;
        }
        field5792++;
        int[][] var10 = new int[class195.field2745][class78.field984];
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var13 = 0; var13 < class78.field984; var13++) {
                class349.field5116[var13] = 0;
                class86.field1063[var13] = 0;
                class245.field3626[var13] = 0;
                class455.field6725[var13] = 0;
                class263.field3897[var13] = 0;
            }
            for (int var14 = -5; var14 < class195.field2745; var14++) {
                for (int var15 = 0; var15 < class78.field984; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (class195.field2745 > var24) {
                        int var25 = class82.field1007[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class148 var26 = class104.method700(-21855, var25 - 1);
                            class349.field5116[var15] += var26.field2005;
                            class86.field1063[var15] += var26.field2009;
                            class245.field3626[var15] += var26.field1998;
                            class455.field6725[var15] += var26.field2002;
                            var10002 = class263.field3897[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class82.field1007[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class148 var29 = class104.method700(-21855, var28 - 1);
                            class349.field5116[var15] -= var29.field2005;
                            class86.field1063[var15] -= var29.field2009;
                            class245.field3626[var15] -= var29.field1998;
                            class455.field6725[var15] -= var29.field2002;
                            var10002 = class263.field3897[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class78.field984; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < class78.field984) {
                            var20 += class263.field3897[var22];
                            var19 += class455.field6725[var22];
                            var17 += class86.field1063[var22];
                            var18 += class245.field3626[var22];
                            var16 += class349.field5116[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var20 -= class263.field3897[var23];
                            var17 -= class86.field1063[var23];
                            var16 -= class349.field5116[var23];
                            var18 -= class245.field3626[var23];
                            var19 -= class455.field6725[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class330.method2158(var16 * 256 / var19, var17 / var20, -30330, var18 / var20);
                        }
                    }
                }
            }
            class119.method814(var11, class316.field4632[var11], var10, class82.field1007[var11], arg3, class78.field984, arg4, class444.field6480[var11], -6, arg0, class427.field6211[var11], class195.field2745, class215.field3069[var11]);
            class82.field1007[var11] = null;
            class444.field6480[var11] = null;
            class427.field6211[var11] = null;
            class316.field4632[var11] = null;
        }
        if (!arg4) {
            if (class307.field4535) {
                class100.method674();
            }
            if (class213.field3010 != 0) {
                class359.method2283();
            }
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class215.field3069[var12].method1421();
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[[[BIBII)V", line = 217)
    public static final void method2506(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class159.field2128++;
        class328.field4888 = 0;
        for (int var6 = class440.field6411; var6 < class204.field2870; var6++) {
            class369[][] var17 = class178.field2530[var6];
            for (int var18 = class93.field1161; var18 < class454.field6704; var18++) {
                for (int var19 = class316.field4631; var19 < class47.field619; var19++) {
                    class369 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class57.field694[var18 + class31.field431 - class145.field1969][var19 + class31.field431 - class189.field2651] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field5338 = true;
                            var20.field5330 = true;
                            if (var20.field5345 == null) {
                                var20.field5350 = false;
                            } else {
                                var20.field5350 = true;
                            }
                            class328.field4888++;
                        } else {
                            var20.field5338 = false;
                            var20.field5330 = false;
                            var20.field5336 = 0;
                            if (var18 >= class145.field1969 - 16 && var18 <= class145.field1969 + 16 && var19 >= class189.field2651 - 16 && var19 <= class189.field2651 + 16 && (var20.field5335 != null || var20.field5332 != null || var20.field5327 != null || var20.field5334 != null || var20.field5346 != null || var20.field5345 != null)) {
                                class71.field930.method46(var20, -25826);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class215.field3069 == class161.field2151;
        for (int var8 = class440.field6411; var8 < class204.field2870; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class151.field2050.method109() && var8 >= arg2 && arg1 != null) {
                int var10 = class57.field694.length;
                if (class57.field694.length + class93.field1161 > class329.field4899) {
                    var10 -= class57.field694.length + class93.field1161 - class329.field4899;
                }
                int var11 = class57.field694[0].length;
                if (class57.field694[0].length + class316.field4631 > class380.field5590) {
                    var11 -= class57.field694[0].length + class316.field4631 - class380.field5590;
                }
                int var12 = class200.field2821;
                while (true) {
                    if (var12 >= var10) {
                        class71.field930.method45(24216, var9, true, var8, class215.field3069[var8]);
                        break;
                    }
                    int var13 = class93.field1161 + var12 - class200.field2821;
                    for (int var14 = class82.field1012; var14 < var11; var14++) {
                        class276.field4081[var12][var14] = false;
                        if (class57.field694[var12][var14]) {
                            int var15 = class316.field4631 + var14 - class82.field1012;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class178.field2530[var16][var13][var15] != null && class178.field2530[var16][var13][var15].field5352 == var8) {
                                    class276.field4081[var12][var14] = class178.field2530[var16][var13][var15].field5338;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class71.field930.method45(24216, var9, false, var8, class215.field3069[var8]);
            }
            class71.field930.method42((byte) -122);
        }
        if (!class319.method2103(true)) {
            class319.method2103(false);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V", line = 354)
    public static void method2507(int arg0) {
        field5795 = null;
        if (arg0 <= -118) {
            field5800 = null;
            field5794 = null;
            field5797 = null;
            field5799 = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V", line = 370)
    public static final void method2508(int arg0, int arg1) {
        if (arg0 != 255) {
            field5797 = null;
        }
        class44.field588.method2300(arg1, true);
        field5791++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)V", line = 385)
    public static final void method2509(boolean arg0) {
        if (class345.field5079 <= 0) {
            class451.field6664 = "";
        } else {
            int var1 = 0;
            for (int var2 = 0; var2 < class206.field2886.length; var2++) {
                if (class206.field2886[var2].startsWith("--> ")) {
                    int var10000 = ~class345.field5079;
                    var1++;
                    if (var10000 == ~var1) {
                        class451.field6664 = class206.field2886[var2].substring(4);
                        break;
                    }
                }
            }
        }
        if (!arg0) {
            field5799 = null;
        }
        field5793++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method2293(int arg0, Component arg1);

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method2291(Component arg0, byte arg1);

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
    public abstract int method2292(int arg0);
}
