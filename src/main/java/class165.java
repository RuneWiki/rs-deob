import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class165 implements class69 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lef;")
    private class241 field2364 = new class241(256);

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lbc;")
    private class282 field2371;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lbc;")
    private class282 field2369;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "[Loa;")
    private class95[] field2375;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
    public static boolean field2370 = true;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lwe;")
    public static class82 field2365 = null;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field2366 = new int[2000];

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Llf;")
    public static class285 field2363 = new class285();

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lwj;")
    public static class130 field2376;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lbc;")
    public static class282 field2378;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
    public static int[] field2367;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field2377;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(II)V")
    public static final void method1082(int arg0, int arg1) {
        if (arg0 != 0) {
            field2376 = null;
        }
        field2368++;
        for (class288 var2 = class68.field798.method1890((byte) 106); var2 != null; var2 = class68.field798.method1889(false)) {
            if (((long) arg1) == (var2.field4489 >> 48 & 0xFFFFL)) {
                var2.method1935(110);
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "(II)Lvf;")
    public class30 method767(int arg0, int arg1) {
        field2361++;
        class55 var3 = this.field2364.method1567((long) arg1, 8);
        if (var3 != null) {
            return (class30) var3;
        }
        if (arg0 != 142) {
            field2363 = null;
        }
        byte[] var4 = this.field2369.method1863((byte) 86, arg1);
        if (var4 == null) {
            return null;
        } else {
            class30 var5 = new class30(new class216(var4));
            this.field2364.method1568((byte) -108, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Z")
    public final boolean method418(int arg0, int arg1) {
        field2373++;
        if (arg0 < 116) {
            this.method419(-8, -49);
        }
        class30 var3 = this.method767(142, arg1);
        return var3 != null && var3.method186((byte) -67, this, this.field2371);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method1083(boolean arg0) {
        field2366 = null;
        field2378 = null;
        if (!arg0) {
            field2365 = null;
        }
        field2363 = null;
        field2376 = null;
        field2367 = null;
        field2365 = null;
        field2377 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FIIZII)[I")
    public final int[] method420(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = -111 % ((arg1 + 64) / 61);
        field2374++;
        return this.method767(142, arg2).method179(-95, (double) arg0, arg4, this.field2371, arg5, arg3, this, this.field2375[arg2].field1275);
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(II)Lri;")
    public static final class267 method1084(int arg0, int arg1) {
        field2372++;
        class267 var2 = (class267) class286.field4428.method65((byte) -112, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= 0) {
            return null;
        } else {
            byte[] var3 = class251.field3624.method1861(class203.method1304(116, arg1), class236.method1544(arg1, (byte) 116), 1);
            class267 var4 = new class267();
            var4.field3890 = arg1;
            if (var3 != null) {
                var4.method1708((byte) -83, new class216(var3));
            }
            var4.method1706(0);
            class286.field4428.method64((long) arg1, -1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)Loa;")
    public final class95 method419(int arg0, int arg1) {
        field2360++;
        if (arg1 != -208) {
            field2376 = null;
        }
        return this.field2375[arg0];
    }

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "(II)I")
    public static int method1085(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lbc;Lbc;Lbc;)V")
    public class165(class282 arg0, class282 arg1, class282 arg2) {
        this.field2371 = arg2;
        this.field2369 = arg1;
        class216 var4 = new class216(arg0.method1861(0, 0, 1));
        int var5 = var4.method1380(true);
        this.field2375 = new class95[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1407(107) == 1) {
                this.field2375[var6] = new class95();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2375[var7] != null) {
                this.field2375[var7].field1273 = var4.method1407(113) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2375[var8] != null) {
                this.field2375[var8].field1276 = var4.method1407(125) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2375[var9] != null) {
                this.field2375[var9].field1279 = var4.method1407(109) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2375[var10] != null) {
                var4.method1407(121);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2375[var11] != null) {
                var4.method1355(true);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2375[var12] != null) {
                var4.method1355(true);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2375[var13] != null) {
                var4.method1355(true);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2375[var14] != null) {
                var4.method1355(true);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2375[var15] != null) {
                this.field2375[var15].field1272 = (short) var4.method1380(true);
            }
        }
        if (var4.field3021 < var4.field3030.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2375[var16] != null) {
                    var4.method1355(true);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2375[var17] != null) {
                    var4.method1355(true);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2375[var18] != null) {
                    var4.method1407(104);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2375[var19] != null) {
                    this.field2375[var19].field1275 = var4.method1407(120) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2375[var20] != null) {
                    var4.method1355(true);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2375[var21] != null) {
                    var4.method1407(107);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2375[var22] != null) {
                    var4.method1407(116);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2375[var23] != null) {
                    var4.method1407(107);
                }
            }
        }
    }
}
