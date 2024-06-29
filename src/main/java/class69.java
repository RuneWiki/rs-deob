import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class69 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Z")
    public boolean field1393 = true;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1397 = -1;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lsd;")
    public static class166 field1402 = class135.method935("", 0);

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lsd;")
    public static class166 field1398 = class135.method935("Spiel)2Engine wird gestartet)3)3)3", 0);

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1409 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    public static int[] field1399 = new int[2000];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[Lvd;")
    public static class193[] field1405;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static void method557(boolean arg0) {
        field1405 = null;
        field1399 = null;
        if (arg0) {
            field1398 = null;
        }
        field1398 = null;
        field1402 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method558(boolean arg0, byte[] arg1, boolean arg2) {
        field1407++;
        if (arg1 == null) {
            return null;
        }
        if (arg0) {
            field1399 = null;
        }
        if (arg1.length > 136 && !class154.field2957) {
            try {
                class140 var3 = (class140) Class.forName("cf").getDeclaredConstructor().newInstance();
                var3.method199((byte) -89, arg1);
                return var3;
            } catch (Throwable var4) {
                class154.field2957 = true;
            }
        }
        return arg2 ? class160.method1088((byte) -71, arg1) : arg1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)I")
    public static final int method559(int arg0, byte arg1, int arg2) {
        int var3 = class43.method296(arg2 + 45365, 4, arg0 + 91923, true) + (class43.method296(arg2 + 10294, 2, arg0 + 37821, true) - 128 >> 1) + (class43.method296(arg2, 1, arg0, true) - 128 >> 2) - 128;
        if (arg1 >= -119) {
            return 109;
        }
        field1394++;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([Lsd;III)Lsd;")
    public static final class166 method560(class166[] arg0, int arg1, int arg2, int arg3) {
        field1406++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg2 + var5] == null) {
                arg0[arg2 + var5] = class57.field1170;
            }
            var4 += arg0[arg2 + var5].field3187;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg1 >= -115) {
            return null;
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            class166 var10 = arg0[arg2 + var8];
            class71.method569(var10.field3162, 0, var6, var7, var10.field3187);
            var7 += var10.field3187;
        }
        class166 var9 = new class166();
        var9.field3162 = var6;
        var9.field3187 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)Z")
    public static final boolean method561(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1398 = null;
        }
        field1412++;
        return (arg2 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLnf;II)V")
    public static final void method562(byte arg0, class123 arg1, int arg2, int arg3) {
        field1408++;
        if ((arg2 & 0x2) != 0) {
            int var4 = class179.field3377.method424((byte) -50);
            byte[] var5 = new byte[var4];
            class53 var6 = new class53(var5);
            class179.field3377.method415(var4, 0, var5, (byte) -128);
            class89.field1762[arg3] = var6;
            arg1.method883(var6, -2);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field3495 = class179.field3377.method436((byte) 76);
            if (arg1.field3495.method1152(-94, 0) == 126) {
                arg1.field3495 = arg1.field3495.method1155(1, (byte) -72);
                class150.method1023((byte) 126, 2, arg1.field3495, arg1.field2412);
            } else if (class41.field728 == arg1) {
                class150.method1023((byte) -73, 2, arg1.field3495, arg1.field2412);
            }
            arg1.field3499 = 0;
            arg1.field3527 = 150;
            arg1.field3536 = 0;
        }
        if ((arg2 & 0x100) != 0) {
            int var7 = class179.field3377.method433((byte) -39);
            int var8 = class179.field3377.method393((byte) 25);
            arg1.method1240(var7, (byte) 127, var8, class49.field910);
            arg1.field3487 = class49.field910 + 300;
            arg1.field3545 = class179.field3377.method424((byte) 68);
            arg1.field3503 = class179.field3377.method393((byte) 25);
        }
        if ((arg2 & 0x1) != 0) {
            int var9 = class179.field3377.method400(255);
            int var10 = class179.field3377.method433((byte) -97);
            arg1.method1240(var9, (byte) 127, var10, class49.field910);
            arg1.field3487 = class49.field910 + 300;
            arg1.field3545 = class179.field3377.method400(255);
            arg1.field3503 = class179.field3377.method424((byte) -121);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field3500 = class179.field3377.method398((byte) 17);
            arg1.field3484 = class179.field3377.method427((byte) -115);
        }
        if ((arg2 & 0x80) != 0) {
            arg1.field3497 = class179.field3377.method427((byte) -106);
            if (arg1.field3497 == 65535) {
                arg1.field3497 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var11 = class179.field3377.method423((byte) -90);
            int var12 = class179.field3377.method393((byte) 25);
            int var13 = class179.field3377.method393((byte) 25);
            int var14 = class179.field3377.field1000;
            if (arg1.field2412 != null && arg1.field2424 != null) {
                long var15 = arg1.field2412.method1133((byte) 30);
                boolean var17 = false;
                if (var12 <= 1) {
                    for (int var18 = 0; var18 < class119.field2344; var18++) {
                        if (class72.field1430[var18] == var15) {
                            var17 = true;
                            break;
                        }
                    }
                }
                if (!var17 && class57.field1155 == 0) {
                    class58.field1200.field1000 = 0;
                    class179.field3377.method432(32, 0, var13, class58.field1200.field988);
                    class58.field1200.field1000 = 0;
                    class166 var19 = class24.method164(class33.method242(class58.field1200, 32767).method1145(false));
                    arg1.field3495 = var19.method1150(false);
                    arg1.field3536 = var11 & 0xFF;
                    arg1.field3499 = var11 >> 8;
                    arg1.field3527 = 150;
                    if (var12 == 2 || var12 == 3) {
                        class150.method1023((byte) -30, 1, var19, class22.method148(new class166[] { class88.field1743, arg1.field2412 }, 0));
                    } else if (var12 == 1) {
                        class150.method1023((byte) -26, 1, var19, class22.method148(new class166[] { class90.field1783, arg1.field2412 }, 0));
                    } else {
                        class150.method1023((byte) 109, 2, var19, arg1.field2412);
                    }
                }
            }
            class179.field3377.field1000 = var13 + var14;
        }
        if ((arg2 & 0x10) != 0) {
            int var20 = class179.field3377.method423((byte) -90);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var21 = class179.field3377.method400(255);
            class122.method879((byte) 21, var21, arg1, var20);
        }
        if (arg0 >= -87) {
            return;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field3520 = class179.field3377.method433((byte) -63);
            arg1.field3512 = class179.field3377.method393((byte) 25);
            arg1.field3493 = class179.field3377.method393((byte) 25);
            arg1.field3522 = class179.field3377.method393((byte) 25);
            arg1.field3475 = class179.field3377.method423((byte) -90) + class49.field910;
            arg1.field3479 = class179.field3377.method405(2) + class49.field910;
            arg1.field3524 = class179.field3377.method424((byte) 125);
            arg1.field3483 = 0;
            arg1.field3514 = 1;
        }
        if ((arg2 & 0x200) == 0) {
            return;
        }
        arg1.field3501 = class179.field3377.method423((byte) -90);
        int var22 = class179.field3377.method430(false);
        arg1.field3533 = (var22 & 0xFFFF) + class49.field910;
        if (arg1.field3501 == 65535) {
            arg1.field3501 = -1;
        }
        arg1.field3550 = 0;
        arg1.field3511 = var22 >> 16;
        if (arg1.field3533 > class49.field910) {
            arg1.field3550 = -1;
        }
        arg1.field3517 = 0;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1396 = arg3;
        this.field1392 = arg2;
        this.field1395 = arg4;
        this.field1411 = arg0;
        this.field1393 = arg6;
        this.field1400 = arg5;
        this.field1410 = arg1;
    }
}
