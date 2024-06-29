import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class185 {

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Ljv;")
    public static class55 field2767 = new class55(64);

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Lrn;")
    public static class174 field2770 = new class174(34, 7);

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lnr;")
    public static class40 field2772 = new class40(0, 0);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIILqa;I)V")
    public static final void method1291(int arg0, int arg1, int arg2, int arg3, class162 arg4, int arg5) {
        arg4.method298(arg3, arg0, arg2 + arg3, arg0 - -arg5);
        field2766++;
        arg4.method1200(-16777216, arg5, arg3, arg0, arg2, 10);
        if (class368.field5569 < 100) {
            return;
        }
        float var6 = (float) class509.field7504 / (float) class509.field7522;
        int var7 = arg2;
        int var8 = arg5;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var9 = (arg2 - var7) / 2 + arg3;
        if (arg1 >= -95) {
            field2771 = -48;
        }
        int var10 = (arg5 - var8) / 2 + arg0;
        if (class37.field705 == null || arg2 != class37.field705.method96() || class37.field705.method109() != arg5) {
            class509.method3039(class509.field7503, class509.field7519 + class509.field7504, class509.field7503 - -class509.field7522, class509.field7519, var9, var10, var7 + var9, var10 - -var8);
            class509.method3044(arg4);
            class37.field705 = arg4.method218(var9, var10, var7, var8, false);
        }
        class37.field705.method3137(var9, var10);
        int var11 = class299.field4255 * var7 / class509.field7522;
        int var12 = class306.field4682 * var8 / class509.field7504;
        int var13 = class416.field6222 * var7 / class509.field7522 + var9;
        int var14 = var8 + var10 - class274.field3937 * var8 / class509.field7504 - var12;
        int var15 = -1996554240;
        if (class428.field6357 == class403.field6054) {
            var15 = -1996488705;
        }
        arg4.method253(var13, var14, var11, var12, var15, 1);
        arg4.method239(var13, var14, var11, var12, var15, 0);
        if (class443.field6619 <= 0) {
            return;
        }
        int var16;
        if (class475.field7104 <= 50) {
            var16 = class475.field7104 * 5;
        } else {
            var16 = (100 - class475.field7104) * 5;
        }
        for (class353 var17 = (class353) class509.field7494.method2427(124); var17 != null; var17 = (class353) class509.field7494.method2422(-115)) {
            class447 var18 = class509.field7486.method1812((byte) 28, var17.field5397);
            if (class5.method39(var18, true)) {
                if (class115.field1909 == var17.field5397) {
                    int var21 = var17.field5402 * var7 / class509.field7522 + var9;
                    int var22 = (class509.field7504 - var17.field5396) * var8 / class509.field7504 + var10;
                    arg4.method1200(var16 << 24 | 0xFFFF00, 4, var21 - 2, var22 - 2, 4, 10);
                } else if (class528.field7794 != -1 && class528.field7794 == var18.field6670) {
                    int var19 = var17.field5402 * var7 / class509.field7522 + var9;
                    int var20 = (class509.field7504 - var17.field5396) * var8 / class509.field7504 + var10;
                    arg4.method1200(var16 << 24 | 0xFFFF00, 4, var19 - 2, var20 + -2, 4, 10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method1292(byte arg0) {
        field2772 = null;
        field2767 = null;
        field2770 = null;
        if (arg0 != 65) {
            method1291(41, 5, -119, -72, null, -35);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)I")
    public static final int method1293(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            field2772 = null;
        }
        field2764++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static final void method1294(int arg0) {
        field2763++;
        class412.field6158.method281(((float) class443.field6623.field602 * 0.1F + 0.7F) * 1.1523438F);
        if (arg0 == 0) {
            class412.field6158.method233(class170.field2635, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
            class412.field6158.method243(class175.field2682, -1, 256);
            class412.field6158.method284(class14.field226);
        }
    }
}
