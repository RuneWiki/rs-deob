import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class78 implements class150 {

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Lnb;")
    private class341 field1269 = new class341(256);

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Lcg;")
    private class49 field1267;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Lcg;")
    private class49 field1263;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "[Lsc;")
    private class283[] field1270;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1266 = "flash3:";

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "[I")
    public static int[] field1265;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[[[Lk;")
    public static class257[][][] field1258;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIC)C", line = 9)
    public static final char method710(boolean arg0, int arg1, char arg2) {
        if (!arg0) {
            field1258 = (class257[][][]) ((class257[][][]) null);
        }
        field1254++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(IB)Lkj;", line = 100)
    public class194 method711(int arg0, byte arg1) {
        field1272++;
        class128 var3 = this.field1269.method2400((long) arg0, arg1 ^ 0x68);
        if (arg1 != 11) {
            field1265 = (int[]) null;
        }
        if (var3 != null) {
            return (class194) var3;
        }
        byte[] var4 = this.field1263.method459(arg0, -1);
        if (var4 == null) {
            return null;
        } else {
            class194 var5 = new class194(new class336(var4));
            this.field1269.method2396(0, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(IZ)V", line = 129)
    public static final void method712(int arg0, boolean arg1) {
        class255.field4115 = -1;
        field1262++;
        class255.field4115 = -1;
        if (!arg1) {
            method712(92, true);
        }
        if (arg0 == 37) {
            class305.field4839 = 3.0F;
        } else if (arg0 == 50) {
            class305.field4839 = 4.0F;
        } else if (arg0 == 75) {
            class305.field4839 = 6.0F;
        } else if (arg0 == 100) {
            class305.field4839 = 8.0F;
        } else if (arg0 == 200) {
            class305.field4839 = 16.0F;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)Z", line = 160)
    public final boolean method713(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field1260++;
            class194 var3 = this.method711(arg1, (byte) 11);
            return var3 != null && var3.method1454(118, this.field1267, this);
        }
    }

    @OriginalMember(owner = "client!om", name = "j", descriptor = "(II)I", line = 172)
    public static final int method714(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V", line = 186)
    public static final void method715(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 230) {
            return;
        }
        field1255++;
        class209.method1553(false, (byte) 96);
        class146.field2642 = arg2;
        class25.field347 = arg3;
        class317.method2185(arg1, (byte) 74);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 201)
    public static void method716(int arg0) {
        field1265 = null;
        field1258 = (class257[][][]) null;
        if (arg0 < 100) {
            method710(true, -59, 'N');
        }
        field1266 = null;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(IB)Ll;", line = 222)
    public static final class322 method717(int arg0, byte arg1) {
        field1271++;
        if (arg1 >= -40) {
            method710(true, -97, (char) 65456);
        }
        class322 var2 = (class322) class256.field4122.method2400((long) arg0, 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class122.field2129.method441(false, 5, arg0);
        class322 var4 = new class322();
        if (var3 != null) {
            var4.method2217(-128, new class336(var3));
        }
        class256.field4122.method2396(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BIZIFI)[I", line = 259)
    public final int[] method718(byte arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        if (arg0 > -25) {
            this.method718((byte) -13, 115, true, -52, 1.000953F, -32);
        }
        field1256++;
        return this.method711(arg3, (byte) 11).method1457((double) arg4, arg5, arg2, this, this.field1270[arg3].field4485, (byte) 31, arg1, this.field1267);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 271)
    public static final void method719(int arg0) {
        class304.field4811.method466(-1);
        field1264++;
        if (arg0 != 210) {
            field1265 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIZI)V", line = 282)
    public static final void method720(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (!arg5) {
            method720(-31, 59, -74, -1, 71, false, 28);
        }
        field1268++;
        if (arg3 - arg0 >= class170.field2944 && class310.field4916 >= (arg0 + arg3) && arg6 - arg0 >= class90.field1428 && (arg0 + arg6) <= class135.field2358) {
            class153.method1213(-27367, arg2, arg4, arg6, arg3, arg1, arg0);
        } else {
            class242.method1694(arg6, arg2, arg1, arg3, (byte) -76, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!om", name = "i", descriptor = "(II)Lsc;", line = 309)
    public final class283 method721(int arg0, int arg1) {
        if (arg0 == 0) {
            field1257++;
            return this.field1270[arg1];
        } else {
            return (class283) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lcg;Lcg;Lcg;)V", line = 327)
    public class78(class49 arg0, class49 arg1, class49 arg2) {
        this.field1267 = arg2;
        this.field1263 = arg1;
        class336 var4 = new class336(arg0.method441(false, 0, 0));
        int var5 = var4.method2339((byte) -46);
        this.field1270 = new class283[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2364(-9069) == 1) {
                this.field1270[var6] = new class283();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1270[var7] != null) {
                this.field1270[var7].field4474 = var4.method2364(-9069) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1270[var8] != null) {
                this.field1270[var8].field4481 = var4.method2364(-9069) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1270[var9] != null) {
                this.field1270[var9].field4473 = var4.method2364(-9069) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1270[var10] != null) {
                this.field1270[var10].field4475 = var4.method2364(-9069) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1270[var11] != null) {
                this.field1270[var11].field4484 = var4.method2323(108);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1270[var12] != null) {
                this.field1270[var12].field4477 = var4.method2323(7);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1270[var13] != null) {
                this.field1270[var13].field4493 = var4.method2323(112);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1270[var14] != null) {
                this.field1270[var14].field4480 = var4.method2323(103);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1270[var15] != null) {
                this.field1270[var15].field4491 = (short) var4.method2339((byte) -46);
            }
        }
        if (var4.field5353 < var4.field5342.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1270[var16] != null) {
                    var4.method2323(-20);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1270[var17] != null) {
                    var4.method2323(-80);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1270[var18] != null) {
                    var4.method2364(-9069);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1270[var19] != null) {
                    this.field1270[var19].field4485 = var4.method2364(-9069) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1270[var20] != null) {
                    var4.method2323(123);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1270[var21] != null) {
                    var4.method2364(-9069);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1270[var22] != null) {
                    var4.method2364(-9069);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1270[var23] != null) {
                    var4.method2364(-9069);
                }
            }
        }
    }
}
