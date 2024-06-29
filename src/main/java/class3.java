import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "Lwt;")
    public static class194 field49;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "Lhe;")
    public static class239 field47;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)[B")
    public static final byte[] method17(byte arg0, int arg1) {
        field48++;
        if (arg0 >= -35) {
            field47 = null;
        }
        class74 var2 = (class74) class95.field1272.method2322(false, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class154.method931(var4, var7, (byte) 8);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class74(var3);
            class95.field1272.method2320(var2, (long) arg1, 2592);
        }
        return var2.field1060;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
    public static final boolean method18(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class172.field2349; var3++) {
            class497 var4 = class325.field4750[var3];
            if (var4.field7570 == 1) {
                int var5 = var4.field7559 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field7563 * var5 >> 8) + var4.field7558;
                    int var7 = (var4.field7575 * var5 >> 8) + var4.field7576;
                    int var8 = (var4.field7573 * var5 >> 8) + var4.field7557;
                    int var9 = (var4.field7562 * var5 >> 8) + var4.field7564;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field7570 == 2) {
                int var10 = arg0 - var4.field7559;
                if (var10 > 0) {
                    int var11 = (var4.field7563 * var10 >> 8) + var4.field7558;
                    int var12 = (var4.field7575 * var10 >> 8) + var4.field7576;
                    int var13 = (var4.field7573 * var10 >> 8) + var4.field7557;
                    int var14 = (var4.field7562 * var10 >> 8) + var4.field7564;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field7570 == 3) {
                int var15 = var4.field7558 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field7571 * var15 >> 8) + var4.field7559;
                    int var17 = (var4.field7565 * var15 >> 8) + var4.field7574;
                    int var18 = (var4.field7573 * var15 >> 8) + var4.field7557;
                    int var19 = (var4.field7562 * var15 >> 8) + var4.field7564;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field7570 == 4) {
                int var20 = arg2 - var4.field7558;
                if (var20 > 0) {
                    int var21 = (var4.field7571 * var20 >> 8) + var4.field7559;
                    int var22 = (var4.field7565 * var20 >> 8) + var4.field7574;
                    int var23 = (var4.field7573 * var20 >> 8) + var4.field7557;
                    int var24 = (var4.field7562 * var20 >> 8) + var4.field7564;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field7570 == 5) {
                int var25 = arg1 - var4.field7557;
                if (var25 > 0) {
                    int var26 = (var4.field7571 * var25 >> 8) + var4.field7559;
                    int var27 = (var4.field7565 * var25 >> 8) + var4.field7574;
                    int var28 = (var4.field7563 * var25 >> 8) + var4.field7558;
                    int var29 = (var4.field7575 * var25 >> 8) + var4.field7576;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
    public static final void method19(int arg0, int arg1) {
        class157.field2058 = new int[arg1];
        class498.field7586 = new int[arg1];
        int var2 = -50 / ((arg0 - 7) / 54);
        class16.field233 = new int[arg1];
        class67.field1008 = new int[arg1];
        field46++;
        class389.field5778 = new int[arg1];
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public static void method20(byte arg0) {
        if (arg0 < 44) {
            field47 = null;
        }
        field47 = null;
        field49 = null;
    }

    static {
        new class194("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field49 = new class194("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");
    }
}
