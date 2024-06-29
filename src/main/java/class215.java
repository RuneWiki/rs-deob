import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class215 extends class59 {

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field3354 = 0;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "F")
    public static float field3356 = 128.0F;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "[I")
    public static int[] field3367 = new int[32];

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "[Lfk;")
    public static class41[] field3360;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Z)V")
    public static final void method1503(boolean arg0) {
        class113.field1648.method1511((byte) 108);
        if (arg0) {
            field3354 = 115;
        }
        field3361++;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(B)V")
    public static void method1504(byte arg0) {
        field3360 = null;
        if (arg0 < 46) {
            field3354 = 13;
        }
        field3367 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZLjava/lang/String;)I")
    public static final int method1505(int arg0, int arg1, boolean arg2, String arg3) {
        field3357++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg3.length();
        int var7 = 0;
        int var8 = 28 / ((arg1 + 55) / 37);
        for (int var9 = 0; var9 < var6; var9++) {
            char var10 = arg3.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg2) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var12 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg0 * var7 + var12;
            if ((var11 / arg0) != var7) {
                throw new NumberFormatException();
            }
            var5 = true;
            var7 = var11;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
    public abstract void method285(int arg0, int arg1);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Lim;")
    public static final class170 method1506(int arg0) {
        field3365++;
        class170 var1 = new class170(34);
        var1.method1183(11, 984049208);
        var1.method1183(class229.field3547, 984049208);
        var1.method1183(class3.field46 ? 1 : 0, 984049208);
        var1.method1183(class44.field528 ? 1 : 0, 984049208);
        var1.method1183(class73.field1106 ? 1 : 0, 984049208);
        var1.method1183(class17.field234 ? 1 : 0, 984049208);
        var1.method1183(class162.field2440 ? 1 : 0, 984049208);
        var1.method1183(class118.field1707 ? 1 : 0, 984049208);
        var1.method1183(class234.field3773 ? 1 : 0, 984049208);
        var1.method1183(class89.field1333 ? 1 : 0, 984049208);
        var1.method1183(class22.field286, 984049208);
        var1.method1183(class250.field4053 ? 1 : 0, 984049208);
        var1.method1183(class274.field4452 ? 1 : 0, 984049208);
        var1.method1183(class64.field925 ? 1 : 0, 984049208);
        var1.method1183(class250.field4091, 984049208);
        var1.method1183(class23.field295 ? 1 : 0, 984049208);
        var1.method1183(class96.field1437, 984049208);
        var1.method1183(class136.field1960, 984049208);
        var1.method1183(class235.field3792, 984049208);
        var1.method1180(-17437, class312.field5005);
        var1.method1180(-17437, class299.field4762);
        var1.method1183(class65.method429(), 984049208);
        var1.method1210(class170.field2663, (byte) -16);
        var1.method1183(class173.field2723, 984049208);
        var1.method1183(class138.field1983 ? 1 : 0, 984049208);
        if (arg0 > -76) {
            return null;
        }
        var1.method1183(class180.field2832 ? 1 : 0, 984049208);
        var1.method1183(class306.field4876, 984049208);
        var1.method1183(class295.field4725 ? 1 : 0, 984049208);
        var1.method1183(class210.field3279 ? 1 : 0, 984049208);
        return var1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)V")
    public abstract void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)V")
    public abstract void method292(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lfe;B)Z")
    public static final boolean method1507(class231 arg0, byte arg1) {
        field3358++;
        if (arg0.field3602 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3602.length; var2++) {
            int var4 = class6.method33(-38, arg0, var2);
            int var5 = arg0.field3654[var2];
            if (arg0.field3602[var2] == 2) {
                if (var5 <= var4) {
                    return false;
                }
            } else if (arg0.field3602[var2] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg0.field3602[var2] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        int var3 = 106 % ((arg1 + 43) / 53);
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public abstract void method293(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
    public final void method1508(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3368++;
        int var6 = this.field3352 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field3355 << 3;
        int var9 = (arg4 << 4) + (var8 & 0xF);
        this.method279(var6, var8, var7, var9, arg2, arg0);
        if (arg1 != -18316) {
            this.field3351 = -27;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)V")
    public abstract void method274(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
    public abstract void method283(int arg0, int arg1);

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Lva;")
    public static final class138 method1509(int arg0) {
        field3366++;
        if (class207.field3238 == null) {
            return null;
        } else {
            class258.field4198.method2089((byte) 126, class207.field3238);
            class138 var1 = (class138) class258.field4198.method2088(-1115);
            class152 var2 = class136.method863(var1.field1987, arg0 + arg0);
            return var2 != null && var2.field2237 && var2.method1051(arg0 ^ 0xFFFFDCFD) ? var1 : class93.method634(30370);
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)V")
    public abstract void method288(int arg0, int arg1);
}
