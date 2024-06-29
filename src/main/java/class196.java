import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class196 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lbe;")
    private class116 field3343 = new class116();

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lda;")
    public static class275 field3342 = class255.method1672(116, "Abbrechen");

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[I")
    public static int[] field3350 = new int[50];

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lbj;")
    public static class80 field3351 = new class80(5000);

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lda;")
    public static class275 field3356 = class255.method1672(105, " ");

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lda;")
    public static class275 field3355 = class255.method1672(119, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lda;")
    public static class275 field3359 = class255.method1672(92, "Loaded world list data");

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Z")
    public static boolean field3358 = false;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lbe;")
    private class116 field3357;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Lbe;")
    public final class116 method1273(byte arg0) {
        if (arg0 > -16) {
            return null;
        }
        field3353++;
        class116 var2 = this.field3343.field2062;
        if (this.field3343 == var2) {
            return null;
        } else {
            var2.method843(22610);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
    public static final boolean method1274(int arg0, int arg1) {
        field3349++;
        class270 var2 = class201.method1322(arg1, true);
        if (var2 == null) {
            return false;
        } else if (class58.field979 == 1 || class58.field979 == 2 || class42.field704 == 2) {
            byte[] var3 = var2.field4692.method1812((byte) -14);
            class226.field3827 = new String(var3, 0, var3.length);
            class108.field1880 = var2.field4698;
            if (class42.field704 != 0) {
                class224.field3779 = class108.field1880 + 50000;
                class37.field605 = class108.field1880 + 40000;
                class80.field1312 = class37.field605;
            }
            return true;
        } else {
            class275 var4 = class3.field21;
            if (class42.field704 != 0) {
                var4 = class197.method1291(new class275[] { class12.field175, class250.method1644(var2.field4698 + 7000, (byte) -115) }, -30025);
            }
            class275 var5 = class3.field21;
            if (class199.field3394 != null) {
                var5 = class197.method1291(new class275[] { class105.field1828, class199.field3394 }, arg0 ^ 0xFFFF8D3A);
            }
            if (arg0 != 1933) {
                return false;
            }
            class275 var6 = class197.method1291(new class275[] { class233.field4078, var2.field4692, var4, class199.field3414, class250.method1644(class205.field3480, (byte) -115), class166.field2885, class250.method1644(class160.field2813, (byte) -115), var5, class19.field281, class175.field3025 ? class37.field614 : class118.field2126, class74.field1218, class117.field2082 ? class37.field614 : class118.field2126, class79.field1305, class214.field3652 ? class37.field614 : class118.field2126 }, -30025);
            try {
                class158.field2771.getAppletContext().showDocument(var6.method1811(27688), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    public static final void method1275(int arg0, int arg1) {
        class51.field842 = -1;
        class261.field4531 = arg0;
        class163.field2840 = -1;
        class138.method994((byte) 125);
        field3354++;
        if (arg1 != -32492) {
            method1274(-82, 75);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1276(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3352++;
        if (arg2 > -44) {
            return;
        }
        int var8 = 0;
        int var9 = arg0 - arg5;
        int var10 = 0;
        int var11 = arg3 - arg5;
        int var12 = arg0 * arg0;
        int var13 = arg3;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = var9 * var9;
        int var18 = var15 << 1;
        int var19 = var12 << 1;
        int var20 = arg3 << 1;
        int var21 = var11 << 1;
        int var22 = var17 << 1;
        int var23 = (1 - var20) * var12 + var16;
        int var24 = var14 - (var20 - 1) * var19;
        int var25 = (1 - var21) * var17 + var18;
        int var26 = var15 - ((var21 - 1) * var22);
        int var27 = var14 << 2;
        int var28 = var17 << 2;
        int var29 = var12 << 2;
        int var30 = var15 << 2;
        int var31 = var16 * 3;
        int var32 = (var20 - 3) * var19;
        int var33 = var18 * 3;
        int var34 = (var21 - 3) * var22;
        int var35 = var27;
        int var36 = var30;
        int var37 = (arg3 - 1) * var29;
        int var38 = (var11 - 1) * var28;
        int[] var39 = class19.field280[arg4];
        class36.method216(var39, arg1 - arg0, arg6, -121, arg1 - var9);
        class36.method216(var39, arg1 - var9, arg7, -125, arg1 + var9);
        class36.method216(var39, arg1 + var9, arg6, -128, arg1 + arg0);
        while (var13 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var10++;
                    var24 += var35;
                    var23 += var31;
                    var35 += var27;
                    var31 += var27;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var10++;
                var35 += var27;
                var23 += var31;
                var31 += var27;
            }
            var24 += -var32;
            var23 += -var37;
            var37 -= var29;
            var32 -= var29;
            boolean var40 = var13 <= var11;
            var13--;
            int var41 = arg4 - var13;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var8++;
                        var26 += var36;
                        var36 += var30;
                        var25 += var33;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var36;
                    var8++;
                    var25 += var33;
                    var33 += var30;
                    var36 += var30;
                }
                var26 += -var34;
                var34 -= var28;
                var25 += -var38;
                var38 -= var28;
            }
            int var42 = arg4 + var13;
            int var43 = arg1 + var10;
            int var44 = arg1 - var10;
            if (var40) {
                int var45 = arg1 - var8;
                class36.method216(class19.field280[var41], var44, arg6, -119, var45);
                int var46 = arg1 + var8;
                class36.method216(class19.field280[var41], var45, arg7, -115, var46);
                class36.method216(class19.field280[var41], var46, arg6, -124, var43);
                class36.method216(class19.field280[var42], var44, arg6, -119, var45);
                class36.method216(class19.field280[var42], var45, arg7, -118, var46);
                class36.method216(class19.field280[var42], var46, arg6, -125, var43);
            } else {
                class36.method216(class19.field280[var41], var44, arg6, -117, var43);
                class36.method216(class19.field280[var42], var44, arg6, -128, var43);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
    public final int method1277(int arg0) {
        int var2 = 0;
        field3346++;
        if (arg0 == 50000) {
            for (class116 var3 = this.field3343.field2062; var3 != this.field3343; var3 = var3.field2062) {
                var2++;
            }
            return var2;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field3355 = null;
        if (arg0 != 40000) {
            return;
        }
        field3342 = null;
        field3351 = null;
        field3356 = null;
        field3350 = null;
        field3359 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public final void method1279(byte arg0) {
        if (arg0 != -29) {
            return;
        }
        field3345++;
        while (true) {
            class116 var2 = this.field3343.field2062;
            if (this.field3343 == var2) {
                this.field3357 = null;
                return;
            }
            var2.method843(22610);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)Lbe;")
    public final class116 method1280(int arg0) {
        field3348++;
        class116 var2 = this.field3357;
        if (arg0 > -109) {
            this.method1282((class116) null, (byte) 50);
        }
        if (this.field3343 == var2) {
            this.field3357 = null;
            return null;
        } else {
            this.field3357 = var2.field2062;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Lbe;")
    public final class116 method1281(boolean arg0) {
        field3344++;
        if (arg0) {
            return null;
        }
        class116 var2 = this.field3343.field2062;
        if (this.field3343 == var2) {
            this.field3357 = null;
            return null;
        } else {
            this.field3357 = var2.field2062;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lbe;B)V")
    public final void method1282(class116 arg0, byte arg1) {
        if (arg1 != 15) {
            this.method1277(-20);
        }
        if (arg0.field2060 != null) {
            arg0.method843(22610);
        }
        field3347++;
        arg0.field2062 = this.field3343;
        arg0.field2060 = this.field3343.field2060;
        arg0.field2060.field2062 = arg0;
        arg0.field2062.field2060 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class196() {
        this.field3343.field2062 = this.field3343;
        this.field3343.field2060 = this.field3343;
    }
}
