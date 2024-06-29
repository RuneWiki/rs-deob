import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class379 {

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "B")
    public byte field5291;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "Ltda;")
    public class635 field5288;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "B")
    public byte field5286;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "S")
    public short field5289;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "[Lwd;")
    public static class272[] field5284 = new class272[1024];

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IB)Liga;")
    public static final class454 method2372(int arg0, byte arg1) {
        field5290++;
        class454[] var2 = class539.method3167(-81);
        if (arg1 != 124) {
            field5284 = null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class454 var4 = var2[var3];
            if (var4.field6578 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)Z")
    public static final boolean method2373(boolean arg0, int arg1) {
        field5283++;
        if (arg0) {
            return true;
        } else {
            return arg1 == 10 || arg1 == 11 || arg1 == 12;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
    public static final int method2374(int arg0, int arg1) {
        field5285++;
        if (arg1 <= 117) {
            method2376(13, null, null);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lha;ZLjava/lang/String;BLda;Lfp;)V")
    public static final void method2375(class58 arg0, boolean arg1, String arg2, byte arg3, class59 arg4, class323 arg5) {
        field5292++;
        if (arg3 <= 118) {
            field5284 = null;
        }
        boolean var6 = !class237.field3353 || class168.method1247(95);
        if (!var6) {
            return;
        }
        if (class237.field3353 && var6) {
            class323 var7 = class224.field3207;
            class59 var8 = arg0.method632(var7, class128.field1938, true);
            int var9 = var7.method2072(250, null, arg2, (byte) 40);
            int var10 = var7.method2077(-1, null, var7.field4601, 250, arg2);
            int var11 = class684.field9642.field1044;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var10;
            int var14 = var12 * 2 + var9;
            if (var14 < class443.field6168) {
                var14 = class443.field6168;
            }
            if (var13 < class354.field4985) {
                var13 = class354.field4985;
            }
            int var15 = class219.field3127.method2152(class57.field1064, var14, -123) + class430.field6018;
            int var16 = class531.field7521.method3892(var13, class477.field6814, 4) + class291.field4087;
            if (class200.field2876) {
                var15 += class228.method1570((byte) 73);
                var16 += class252.method1712((byte) 37);
            }
            arg0.method637(class389.field5437, false).method91(class701.field9850.field1044 + var15, var16 - -class701.field9850.field1038, var14 - (class701.field9850.field1044 * 2), -(class701.field9850.field1038 * 2) + var13, 1, 0, 0);
            arg0.method637(class701.field9850, true).method4135(var15, var16);
            class701.field9850.method504();
            arg0.method637(class701.field9850, true).method4135(var15 + var14 - var11, var16);
            class701.field9850.method508();
            arg0.method637(class701.field9850, true).method4135(var14 + var15 - var11, var16 - (-var13 - -var11));
            class701.field9850.method504();
            arg0.method637(class701.field9850, true).method4135(var15, var13 + var16 - var11);
            class701.field9850.method508();
            arg0.method637(class684.field9642, true).method4137(var15, class701.field9850.field1038 + var16, var11, var13 - (class701.field9850.field1038 * 2));
            class684.field9642.method497();
            arg0.method637(class684.field9642, true).method4137(class701.field9850.field1044 + var15, var16, var14 - (class701.field9850.field1044 * 2), var11);
            class684.field9642.method497();
            arg0.method637(class684.field9642, true).method4137(var15 + var14 - var11, class701.field9850.field1038 + var16, var11, var13 - (class701.field9850.field1038 * 2));
            class684.field9642.method497();
            arg0.method637(class684.field9642, true).method4137(class701.field9850.field1044 + var15, var13 + var16 - var11, var14 - (class701.field9850.field1044 * 2), var11);
            class684.field9642.method497();
            var8.method648(0, 0, var12 + var15, null, var12 + var16, -(var12 * 2) + var13, null, 12673, -1, var14 - (var12 * 2), class31.field413 | 0xFF000000, arg2, 1, 1, 0, null);
            class89.method833(var14, var15, var13, var16, 125);
        } else {
            int var17 = arg5.method2072(250, null, arg2, (byte) 40);
            int var18 = arg5.method2076(250, arg2, null, 60) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg0.method630(var20 - var19, -var19 + var21, var17 + var19 + var19, var19 + var19 + var18, -16777216, 0);
            arg0.method616(var20 - var19, -var19 + var21, var17 + var19 + var19, var18 - -var19 + var19, -1, 0);
            arg4.method648(0, 0, var20, null, var21, var18, null, 12673, -1, var17, -1, arg2, 1, 1, 0, null);
            class89.method833(var19 + var19 + var17, -var19 + var20, var18 + var19 + var19, var21 - var19, 115);
        }
        if (!arg1) {
            return;
        }
        try {
            if (class200.field2876) {
                class681.method3846(-104);
            } else {
                arg0.method582(3593);
            }
        } catch (class701 var22) {
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
    public static final void method2376(int arg0, String arg1, File arg2) {
        class13.field158.put(arg1, arg2);
        if (arg0 == 13358) {
            field5287++;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ltda;III)V")
    public class379(class635 arg0, int arg1, int arg2, int arg3) {
        this.field5291 = (byte) arg2;
        this.field5288 = arg0;
        this.field5286 = (byte) arg3;
        this.field5289 = (short) arg1;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public static void method2377(byte arg0) {
        if (arg0 != -115) {
            field5284 = null;
        }
        field5284 = null;
    }
}
