import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class88 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lts;")
    public class371 field1190 = new class371();

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
    public boolean field1200 = false;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "Lbg;")
    public static class324 field1199;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lsb;")
    public static class191 field1194;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIILfs;)Lgt;")
    public static final class316 method775(int arg0, int arg1, int arg2, class387 arg3) {
        if (arg0 != 6) {
            field1199 = null;
        }
        field1195++;
        byte[] var4 = arg3.method2363(arg1, arg2, 94);
        return var4 == null ? null : new class316(var4);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lti;I)V")
    public static final void method776(class304 arg0, int arg1) {
        field1188++;
        if (arg0.field4329 != null) {
            arg0.field4329.field583 = 0;
        }
        arg0.field4328 = false;
        if (arg1 != 7582) {
            method780(102, (byte) -84);
        }
        for (class304 var2 = arg0.method151(); var2 != null; var2 = arg0.method173()) {
            method776(var2, 7582);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method777(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1191++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg2 - arg6;
        int var12 = arg4 - arg6;
        int var13 = arg2 * arg2;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        if (arg7 > -70) {
            method778(null, true);
        }
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg5 >= class471.field6963 && class401.field5947 >= arg5) {
            int[] var39 = class141.field1996[arg5];
            int var40 = class332.method2034(class126.field1842, -24309, arg0 - arg2, class72.field992);
            int var41 = class332.method2034(class126.field1842, -24309, arg0 + arg2, class72.field992);
            int var42 = class332.method2034(class126.field1842, -24309, arg0 - var11, class72.field992);
            int var43 = class332.method2034(class126.field1842, -24309, arg0 + var11, class72.field992);
            class531.method3136(var40, -117, arg1, var42, var39);
            class531.method3136(var42, -59, arg3, var43, var39);
            class531.method3136(var43, -88, arg1, var41, var39);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var31 += var28;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var10++;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (var46 >= class471.field6963 && class401.field5947 >= var45) {
                int var47 = class332.method2034(class126.field1842, -24309, arg0 + var8, class72.field992);
                int var48 = class332.method2034(class126.field1842, -24309, arg0 - var8, class72.field992);
                if (var44) {
                    int var49 = class332.method2034(class126.field1842, -24309, arg0 + var10, class72.field992);
                    int var50 = class332.method2034(class126.field1842, -24309, arg0 - var10, class72.field992);
                    if (var45 >= class471.field6963) {
                        int[] var51 = class141.field1996[var45];
                        class531.method3136(var48, 122, arg1, var50, var51);
                        class531.method3136(var50, 118, arg3, var49, var51);
                        class531.method3136(var49, -48, arg1, var47, var51);
                    }
                    if (class401.field5947 >= var46) {
                        int[] var52 = class141.field1996[var46];
                        class531.method3136(var48, -17, arg1, var50, var52);
                        class531.method3136(var50, -14, arg3, var49, var52);
                        class531.method3136(var49, -29, arg1, var47, var52);
                    }
                } else {
                    if (var45 >= class471.field6963) {
                        class531.method3136(var48, -42, arg1, var47, class141.field1996[var45]);
                    }
                    if (class401.field5947 >= var46) {
                        class531.method3136(var48, 120, arg1, var47, class141.field1996[var46]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public static final boolean method778(String arg0, boolean arg1) {
        if (arg1) {
            field1199 = null;
        }
        field1193++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class188.field2696; var2++) {
            if (arg0.equalsIgnoreCase(class474.field6987[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class94.field1279[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method779(int arg0) {
        field1199 = null;
        field1194 = null;
        if (arg0 != 1) {
            method778(null, true);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V")
    public static final void method780(int arg0, byte arg1) {
        field1189++;
        if (arg1 <= 43) {
            field1197 = 103;
        }
        class323.method1996(0);
        class520.method3090((byte) 56);
        class89.method787(-27345, true, arg0);
        class17.method132(class225.field3300, class240.field3533, -101, class55.field584);
        class69.method663(class240.field3533, false, class225.field3300);
        class322.method1991(class32.field374, 10);
        class40.method400((byte) 107);
        class448.method2716(-11712);
        if (class113.field1589 == 10) {
            class140.method1046(false, 123);
        } else if (class113.field1589 == 30) {
            class432.method2619((byte) -119, 25);
        } else if (class113.field1589 == 5) {
            class325.method2009(class225.field3300, (byte) 126, class240.field3533);
            return;
        }
    }

    static {
        new class331("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field1196 = 0;
        field1199 = new class324(21, 6);
    }
}
