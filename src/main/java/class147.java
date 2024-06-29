import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class147 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Li;")
    public static class88 field2756 = class208.method1425(105, "Ausw-=hlen");

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2759 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Li;")
    public static class88 field2754 = null;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2767 = 0;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lbj;")
    public static class22 field2762;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILi;Li;Lnb;)[Lrh;")
    public static final class193[] method983(int arg0, class88 arg1, class88 arg2, class144 arg3) {
        field2755++;
        int var4 = arg3.method966(arg1, (byte) -3);
        if (arg0 != 2) {
            field2768 = -54;
        }
        int var5 = arg3.method968(arg2, var4, 58);
        return class190.method1324(var4, var5, arg3, (byte) 24);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIZIIIII)V")
    public static final void method984(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2760++;
        if (arg0 == arg1 && arg6 == arg7 && arg2 == arg9 && arg5 == arg8) {
            class229.method1531(arg0, (byte) 93, arg5, arg2, arg7, arg3);
        } else {
            int var10 = arg0;
            int var11 = arg7;
            int var12 = arg0 * 3;
            int var13 = arg7 * 3;
            int var14 = arg1 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg8 * 3;
            int var18 = arg2 + var14 - var16 - arg0;
            int var19 = var12 + var16 - var14 - var14;
            int var20 = arg5 + var15 - arg7 - var17;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var22 * var24;
                int var27 = var24 * var25 >> 12;
                int var28 = var23 * var24;
                int var29 = var18 * var27;
                int var30 = var19 * var25;
                int var31 = var20 * var27;
                int var32 = (var26 + var29 + var30 >> 12) + arg0;
                int var33 = var21 * var25;
                int var34 = (var28 + var31 + var33 >> 12) + arg7;
                class229.method1531(var10, (byte) 126, var34, var32, var11, arg3);
                var11 = var34;
                var10 = var32;
            }
        }
        if (!arg4) {
            method990((byte) 98, false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static final void method985(boolean arg0) {
        field2761++;
        if (!arg0) {
            field2767 = -54;
        }
        class113.field2041.method671(2);
        class168.field3238.method134(50);
        class157.field3022.method671(20);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
    public static final int method986(int arg0) {
        field2766++;
        return arg0 == 2 ? class190.field3670 : 39;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Llf;")
    public static final class126 method987(int arg0, int arg1) {
        field2757++;
        class126 var2 = (class126) class231.field4333.method666((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3970.method941((byte) 56, class52.method387(arg0, (byte) -82), class101.method704(arg0, -321617529));
        class126 var4 = new class126();
        var4.field2316 = arg0;
        if (arg1 >= -72) {
            field2754 = null;
        }
        if (var3 != null) {
            var4.method855(new class46(var3), 1);
        }
        var4.method860(-42);
        class231.field4333.method664((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2758++;
        int var8 = class156.method1060(class49.field919, class18.field279, -122, arg2);
        int var9 = class156.method1060(class49.field919, class18.field279, -122, arg4);
        int var10 = class156.method1060(class67.field1207, class12.field183, -121, arg3);
        int var11 = class156.method1060(class67.field1207, class12.field183, -106, arg1);
        int var12 = class156.method1060(class49.field919, class18.field279, -113, arg2 + arg5);
        int var13 = class156.method1060(class49.field919, class18.field279, -125, arg4 - arg5);
        for (int var14 = var8; var14 < var12; var14++) {
            class230.method1536(var10, arg7, -7, var11, class3.field42[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class230.method1536(var10, arg7, -7, var11, class3.field42[var15]);
        }
        if (arg6 < 66) {
            return;
        }
        int var16 = class156.method1060(class67.field1207, class12.field183, -121, arg3 + arg5);
        int var17 = class156.method1060(class67.field1207, class12.field183, -126, arg1 - arg5);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class3.field42[var18];
            class230.method1536(var10, arg7, -7, var16, var19);
            class230.method1536(var16, arg0, -7, var17, var19);
            class230.method1536(var17, arg7, -7, var11, var19);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static void method989(int arg0) {
        field2756 = null;
        field2754 = null;
        field2762 = null;
        if (arg0 != 4) {
            field2762 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZ)V")
    public static final void method990(byte arg0, boolean arg1) {
        field2763++;
        if (class214.field4035 == null) {
            return;
        }
        try {
            if (arg0 > -88) {
                method989(25);
            }
            class46 var2 = new class46(4);
            var2.method346(255, arg1 ? 2 : 3);
            var2.method337(0, (byte) -61);
            class214.field4035.method913(4, 0, var2.field842, 17492);
        } catch (IOException var4) {
            try {
                class214.field4035.method919(true);
            } catch (Exception var3) {
            }
            class214.field4035 = null;
            class77.field1389++;
        }
    }
}
