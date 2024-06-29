import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class127 extends class354 {

    @OriginalMember(owner = "client!op", name = "L", descriptor = "I")
    private int field1719 = 4096;

    @OriginalMember(owner = "client!op", name = "N", descriptor = "I")
    private int field1721 = 4096;

    @OriginalMember(owner = "client!op", name = "T", descriptor = "I")
    private int field1727 = 4096;

    @OriginalMember(owner = "client!op", name = "S", descriptor = "[I")
    public static int[] field1726;

    @OriginalMember(owner = "client!op", name = "R", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!op", name = "Q", descriptor = "Lla;")
    public static class319 field1724;

    @OriginalMember(owner = "client!op", name = "U", descriptor = "Z")
    public static boolean field1728;

    @OriginalMember(owner = "client!op", name = "K", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!op", name = "M", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!op", name = "O", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!op", name = "P", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field1718;
        int[][] var3 = super.field5474.method2414((byte) -89, arg0);
        int var4 = 88 / ((48 - arg1) / 60);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class531.field7814; ++var12) {
                int var13 = var6[var12];
                int var14 = var8[var12];
                int var15 = var7[var12];
                if (var13 == var14 && var14 == var15) {
                    var9[var12] = this.field1721 * var13 >> 12;
                    var10[var12] = this.field1719 * var14 >> 12;
                    var11[var12] = this.field1727 * var15 >> 12;
                } else {
                    var9[var12] = this.field1721;
                    var10[var12] = this.field1719;
                    var11[var12] = this.field1727;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(III)Z")
    public static final boolean method869(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class300.field4404; ++var3) {
            class370 var4 = class194.field2601[var3];
            if (var4.field5650 == 1) {
                int var5 = var4.field5652 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field5647 * var5 >> 8) + var4.field5651;
                    int var7 = (var4.field5646 * var5 >> 8) + var4.field5649;
                    int var8 = (var4.field5645 * var5 >> 8) + var4.field5643;
                    int var9 = (var4.field5660 * var5 >> 8) + var4.field5658;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field5650 == 2) {
                int var10 = arg0 - var4.field5652;
                if (var10 > 0) {
                    int var11 = (var4.field5647 * var10 >> 8) + var4.field5651;
                    int var12 = (var4.field5646 * var10 >> 8) + var4.field5649;
                    int var13 = (var4.field5645 * var10 >> 8) + var4.field5643;
                    int var14 = (var4.field5660 * var10 >> 8) + var4.field5658;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field5650 == 3) {
                int var15 = var4.field5651 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field5656 * var15 >> 8) + var4.field5652;
                    int var17 = (var4.field5648 * var15 >> 8) + var4.field5654;
                    int var18 = (var4.field5645 * var15 >> 8) + var4.field5643;
                    int var19 = (var4.field5660 * var15 >> 8) + var4.field5658;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field5650 == 4) {
                int var20 = arg2 - var4.field5651;
                if (var20 > 0) {
                    int var21 = (var4.field5656 * var20 >> 8) + var4.field5652;
                    int var22 = (var4.field5648 * var20 >> 8) + var4.field5654;
                    int var23 = (var4.field5645 * var20 >> 8) + var4.field5643;
                    int var24 = (var4.field5660 * var20 >> 8) + var4.field5658;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field5650 == 5) {
                int var25 = arg1 - var4.field5643;
                if (var25 > 0) {
                    int var26 = (var4.field5656 * var25 >> 8) + var4.field5652;
                    int var27 = (var4.field5648 * var25 >> 8) + var4.field5654;
                    int var28 = (var4.field5647 * var25 >> 8) + var4.field5651;
                    int var29 = (var4.field5646 * var25 >> 8) + var4.field5649;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field1720;
        if (arg2 == 1638) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field1727 = arg0.method1074(-635989152);
                    }
                } else {
                    this.field1719 = arg0.method1074(-635989152);
                }
            } else {
                this.field1721 = arg0.method1074(-635989152);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "h", descriptor = "(I)V")
    public static void method870(int arg0) {
        field1724 = null;
        int var1 = 62 / ((11 - arg0) / 47);
        field1726 = null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)V")
    public static final void method871(byte arg0) {
        if (arg0 > -104) {
            method870(-12);
        }
        ++field1723;
        if (!class400.field6090.method763()) {
            class170.method1152(-124, class378.field5771);
        } else {
            class400.field6090.method822(class85.field1245);
            class405.method2503((byte) -116);
            class400.field6090.method744(class85.field1245);
            class400.field6090.method826(class85.field1245);
        }
        class141.method950(0);
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(IIIIIII)V")
    public static final void method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1722;
        int var7 = class33.method289(261104, class463.field6924, class369.field5628, arg0);
        int var8 = class33.method289(arg3 ^ 261104, class463.field6924, class369.field5628, arg4);
        int var9 = class33.method289(261104, class377.field5760, class49.field701, arg5);
        if (arg3 == 0) {
            int var10 = class33.method289(261104, class377.field5760, class49.field701, arg1);
            int var11 = class33.method289(261104, class463.field6924, class369.field5628, arg0 + arg6);
            int var12 = class33.method289(arg3 + 261104, class463.field6924, class369.field5628, -arg6 + arg4);
            for (int var13 = var7; var11 > var13; ++var13) {
                class221.method1489(class466.field6955[var13], var9, var10, (byte) -30, arg2);
            }
            for (int var14 = var8; var14 > var12; --var14) {
                class221.method1489(class466.field6955[var14], var9, var10, (byte) -30, arg2);
            }
            int var15 = class33.method289(261104, class377.field5760, class49.field701, arg5 + arg6);
            int var16 = class33.method289(261104, class377.field5760, class49.field701, arg1 - arg6);
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class466.field6955[var17];
                class221.method1489(var18, var9, var15, (byte) -30, arg2);
                class221.method1489(var18, var16, var10, (byte) -30, arg2);
            }
        }
    }

    static {
        new class446("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field1726 = new int[] { 1, 2, 4, 8 };
        field1725 = 0;
        field1724 = new class319(24, -1);
        field1728 = false;
    }
}
