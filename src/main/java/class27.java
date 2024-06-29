import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class27 {

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "Lik;")
    public static class410 field469 = new class410(100);

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Z")
    public static boolean field476 = false;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "[I")
    public static int[] field479 = new int[13];

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Lsq;")
    public class27 field471;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "Lsq;")
    public class27 field480;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "Lkb;")
    public static class80 field475;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZIZII)Lrk;")
    public static final class427 method324(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field474++;
        if (arg3 != 4) {
            field475 = null;
        }
        class377 var5 = null;
        if (class244.field3377 != null) {
            var5 = new class377(arg1, class244.field3377, class307.field4163[arg1], 1000000);
        }
        class418.field5863[arg1] = class218.field3032.method1292((byte) -66, class10.field77, var5, arg1);
        if (arg0) {
            class418.field5863[arg1].method2702((byte) 99);
        }
        return new class427(class418.field5863[arg1], arg2, arg4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lpe;IIIII)V")
    public static final void method325(class391 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field473++;
        arg0.method111(arg5, arg1, arg3 + arg5, arg1 + arg2);
        arg0.method2414(arg1, arg5, arg2, true, arg3, -16777216);
        if (class199.field2831 < 100) {
            return;
        }
        float var6 = (float) class99.field1435 / (float) class99.field1434;
        int var7 = arg3;
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg5;
        int var10 = (arg2 - var8) / 2 + arg1;
        if (class69.field1053 == null || class69.field1053.method723() != arg3 || class69.field1053.method733() != arg2) {
            class99.method841(class99.field1436, class99.field1438 + class99.field1435, class99.field1436 + class99.field1434, class99.field1438, var9, var10, var9 + var7, var8 + var10);
            class99.method836(arg0);
            class69.field1053 = arg0.method178(var9, var10, var7, var8, false);
        }
        class69.field1053.method722(var9, var10);
        int var11 = class332.field4513 * var7 / class99.field1434;
        int var12 = class185.field2693 * var8 / class99.field1435;
        int var13 = class126.field1768 * var7 / class99.field1434 + var9;
        if (arg4 != -29914) {
            field476 = true;
        }
        int var14 = var8 + var10 - (class12.field88 * var8 / class99.field1435) - var12;
        int var15 = -1996554240;
        if (class42.field640 == 1) {
            var15 = -1996488705;
        }
        arg0.method95(var13, var14, var11, var12, var15, 1);
        arg0.method167(var13, var14, var11, var12, var15, 0);
        if (class115.field1615 <= 0) {
            return;
        }
        int var16;
        if (class440.field6330 <= 50) {
            var16 = class440.field6330 * 5;
        } else {
            var16 = 500 - (class440.field6330 * 5);
        }
        for (class430 var17 = (class430) class99.field1416.method1240((byte) -87); var17 != null; var17 = (class430) class99.field1416.method1245(arg4 ^ 0xFFFF8B27)) {
            class384 var18 = class212.method1451(var17.field6119, 36);
            if (class387.method2395(58, var18)) {
                if (class100.field1446 == var17.field6119) {
                    int var19 = var9 + (var17.field6124 * var7 / class99.field1434);
                    int var20 = (class99.field1435 - var17.field6120) * var8 / class99.field1435 + var10;
                    arg0.method2414(var20 - 2, var19 + -2, 4, true, 4, var16 << 24 | 0xFFFF00);
                } else if (class312.field4219 != -1 && class312.field4219 == var18.field5408) {
                    int var21 = var9 + (var17.field6124 * var7 / class99.field1434);
                    int var22 = (class99.field1435 - var17.field6120) * var8 / class99.field1435 + var10;
                    arg0.method2414(var22 - 2, var21 + -2, 4, true, 4, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Loa;")
    public static final class151 method326(int arg0, int arg1, int arg2) {
        field472++;
        if (arg1 != 17389) {
            field469 = null;
        }
        class151 var3 = new class151();
        var3.field2320 = -1;
        var3.field2313 = arg0 + 1 + 5;
        var3.field2316 = -1;
        var3.field2312 = arg2 + 6;
        var3.field2303 = new int[var3.field2312][var3.field2313];
        var3.method1159(3340);
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)V")
    public static final void method327(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 5) {
            return;
        }
        field470++;
        class450 var4 = class59.method540(9, arg0, 1000);
        var4.method2800(256);
        var4.field6498 = arg2;
        var4.field6509 = arg3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public final void method328(int arg0) {
        field477++;
        if (this.field471 == null) {
            return;
        }
        this.field471.field480 = this.field480;
        this.field480.field471 = this.field471;
        this.field471 = null;
        this.field480 = null;
        if (arg0 >= -13) {
            field479 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)Z")
    public static final boolean method329(byte arg0) {
        field478++;
        class118 var1 = class446.field6419;
        synchronized (class446.field6419) {
            if (arg0 != -23) {
                return false;
            } else if (class68.field1017 == class280.field3752) {
                return false;
            } else {
                class345.field4682 = class288.field3854[class68.field1017];
                class285.field3817 = class352.field4813[class68.field1017];
                class68.field1017 = class68.field1017 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static void method330(boolean arg0) {
        if (arg0) {
            field479 = null;
        }
        field479 = null;
        field469 = null;
        field475 = null;
    }
}
