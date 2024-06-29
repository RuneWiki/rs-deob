import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class28 extends class456 {

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
    private int field361 = 1;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    private int field367 = 1;

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "Lo;")
    public static class332 field371 = new class332("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "I")
    public static int field372 = -1;

    @OriginalMember(owner = "client!oo", name = "T", descriptor = "Lea;")
    public static class106 field373 = class315.method1943(-117);

    @OriginalMember(owner = "client!oo", name = "U", descriptor = "[Lvn;")
    public static class246[] field374 = new class246[4];

    @OriginalMember(owner = "client!oo", name = "V", descriptor = "Ltl;")
    public static class400 field375 = new class400(200);

    @OriginalMember(owner = "client!oo", name = "W", descriptor = "Lic;")
    public static class255 field376 = new class255(0, 0);

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field369;
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (super.field6468.field2227) {
            int var4 = this.field367 + this.field367 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field361 + 1 + this.field361;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field367; ~(arg1 - -this.field367) <= ~var9; ++var9) {
                int[][] var19 = this.method2709(false, var9 & class493.field6947, 0);
                int[][] var20 = new int[3][class156.field2169];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field361; ~var27 >= ~this.field361; ++var27) {
                    int var37 = class428.field6112 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class156.field2169 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field361 + var31 & class428.field6112;
                    ++var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var21 - var24[var32];
                    int var36 = this.field361 + var31 & class428.field6112;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[this.field367 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class156.field2169; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        if (arg0 != 0) {
            field371 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILvg;I)V")
    public static final void method237(int arg0, class51 arg1, int arg2) {
        class389.field5717 = false;
        ++field368;
        class270.field3998 = 0;
        class281.method1805(arg0 ^ 25360, arg1);
        class14.method134(arg1, -20733);
        if (class389.field5717) {
            System.out.println("---endgpp---");
        }
        if (arg0 != -25463) {
            method242((class446) null, -66);
        }
        if (~arg1.field6315 != ~arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field6315 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
    public static void method238(byte arg0) {
        field375 = null;
        field371 = null;
        field376 = null;
        field374 = null;
        field373 = null;
        int var1 = 93 / ((arg0 - 36) / 34);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field6486 = arg2.method2628(49152) == 1;
                }
            } else {
                this.field367 = arg2.method2628(49152);
            }
        } else {
            this.field361 = arg2.method2628(arg1 ^ 49207);
        }
        if (arg1 != 55) {
            method242((class446) null, -20);
        }
        ++field365;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        if (arg0 != -1) {
            method240((String) null, true, (byte) -113);
        }
        ++field364;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int var4 = this.field367 + 1 + this.field367;
            int var5 = 65536 / var4;
            int var6 = this.field361 - -this.field361 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field367 + arg1; var9 <= arg1 - -this.field367; ++var9) {
                int[] var13 = this.method2707(var9 & class493.field6947, -31797, 0);
                int[] var14 = new int[class156.field2169];
                int var15 = 0;
                for (int var16 = -this.field361; ~var16 >= ~this.field361; ++var16) {
                    var15 += var13[class428.field6112 & var16];
                }
                int var17 = 0;
                while (class156.field2169 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class428.field6112 & -this.field361 + var17];
                    ++var17;
                    var15 = var13[class428.field6112 & this.field361 + var17] + var18;
                }
                var8[this.field367 + var9 + -arg1] = var14;
            }
            for (int var10 = 0; ~class156.field2169 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(II)V")
    public static final void method239(int arg0, int arg1) {
        ++field370;
        if (arg0 < 113) {
            method240((String) null, false, (byte) 2);
        }
        class329.field4930 = arg1;
        class400 var2 = class452.field6417;
        synchronized (class452.field6417) {
            class452.field6417.method2401((byte) -113);
        }
        class400 var3 = class269.field3975;
        synchronized (class269.field3975) {
            class269.field3975.method2401((byte) -117);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method240(String arg0, boolean arg1, byte arg2) {
        ++field362;
        int var3 = -56 / ((arg2 - -61) / 51);
        if (arg0 != null) {
            if (class330.field4951 >= 100) {
                class453.method2696(125, class35.field439.method2036(class4.field85, (byte) -21));
            } else {
                String var4 = class226.method1463(-1, arg0);
                if (var4 != null) {
                    for (int var5 = 0; ~var5 > ~class330.field4951; ++var5) {
                        String var9 = class226.method1463(-1, class436.field6168[var5]);
                        if (var9 != null && var9.equals(var4)) {
                            class453.method2696(127, arg0 + class164.field2276.method2036(class4.field85, (byte) -21));
                            return;
                        }
                        if (class68.field930[var5] != null) {
                            String var10 = class226.method1463(-1, class68.field930[var5]);
                            if (var10 != null && var10.equals(var4)) {
                                class453.method2696(10, arg0 + class164.field2276.method2036(class4.field85, (byte) -21));
                                return;
                            }
                        }
                    }
                    for (int var6 = 0; class157.field2190 > var6; ++var6) {
                        String var7 = class226.method1463(-1, class42.field570[var6]);
                        if (var7 != null && var7.equals(var4)) {
                            class453.method2696(33, class262.field3881.method2036(class4.field85, (byte) -21) + arg0 + class111.field1571.method2036(class4.field85, (byte) -21));
                            return;
                        }
                        if (class310.field4681[var6] != null) {
                            String var8 = class226.method1463(-1, class310.field4681[var6]);
                            if (var8 != null && var8.equals(var4)) {
                                class453.method2696(-3, class262.field3881.method2036(class4.field85, (byte) -21) + arg0 + class111.field1571.method2036(class4.field85, (byte) -21));
                                return;
                            }
                        }
                    }
                    if (class226.method1463(-1, class472.field6622.field3839).equals(var4)) {
                        class453.method2696(127, class318.field4779.method2036(class4.field85, (byte) -21));
                    } else {
                        class378.method2320(class99.field1409, (byte) 119);
                        ++class425.field6077;
                        class230.field3390.method2619((byte) 7, 1 + class330.method2021((byte) 114, arg0));
                        class230.field3390.method2597(arg0, (byte) -86);
                        class230.field3390.method2619((byte) -121, !arg1 ? 0 : 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILje;)Lje;")
    public static final class178 method241(int arg0, class178 arg1) {
        ++field363;
        if (arg1.field2580 != arg0) {
            return class493.method2885(arg1.field2580, 65535);
        } else {
            int var2 = arg1.field2631 >>> 16;
            class258 var3 = new class258(class466.field6564);
            for (class468 var4 = (class468) var3.method1710((byte) -70); var4 != null; var4 = (class468) var3.method1709(false)) {
                if (var4.field6584 == var2) {
                    return class493.method2885((int) var4.field436, arg0 + 65536);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lre;I)Llb;")
    public static final class174 method242(class446 arg0, int arg1) {
        if (arg1 <= 70) {
            method238((byte) 62);
        }
        ++field366;
        return new class174(arg0.method2634(124), arg0.method2634(123), arg0.method2634(123), arg0.method2634(124), arg0.method2634(-33), arg0.method2634(114), arg0.method2634(-95), arg0.method2634(-36), arg0.method2613(-25778), arg0.method2628(49152));
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class28() {
        super(1, false);
    }

    static {
        new class332("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }
}
