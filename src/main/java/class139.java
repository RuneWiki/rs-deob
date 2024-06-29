import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class139 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2045 = "flash2:";

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[Z")
    public static boolean[] field2048 = new boolean[5];

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2054 = "";

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field2050 = -1;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[Z")
    public static boolean[] field2046 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2053 = new String[100];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILef;)V")
    public static final void method933(int arg0, class214 arg1) {
        if (arg0 != -28661) {
            method936('P', -19);
        }
        int var2 = arg1.field3390;
        field2051++;
        if (var2 == 324) {
            if (class60.field848 == -1) {
                class60.field848 = arg1.field3362;
                class276.field4400 = arg1.field3445;
            }
            if (class29.field393.field3972) {
                arg1.field3362 = class60.field848;
            } else {
                arg1.field3362 = class276.field4400;
            }
        } else if (var2 == 325) {
            if (class60.field848 == -1) {
                class60.field848 = arg1.field3362;
                class276.field4400 = arg1.field3445;
            }
            if (class29.field393.field3972) {
                arg1.field3362 = class276.field4400;
            } else {
                arg1.field3362 = class60.field848;
            }
        } else if (var2 == 327) {
            arg1.field3400 = 150;
            arg1.field3442 = (int) (Math.sin((double) class111.field1684 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3404 = 5;
            arg1.field3366 = -1;
        } else if (var2 == 328) {
            if (class149.field2227.field2912 == null) {
                arg1.field3366 = 0;
            } else {
                arg1.field3400 = 150;
                arg1.field3442 = (int) (Math.sin((double) class111.field1684 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3404 = 5;
                arg1.field3366 = ((int) class162.method1116(class149.field2227.field2912, (byte) 31) << 11) + 2047;
                arg1.field3376 = 0;
                arg1.field3501 = class149.field2227.field1196;
                arg1.field3498 = class149.field2227.field1244;
                arg1.field3408 = class149.field2227.field1291;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static final int method934(int arg0, int arg1) {
        int var2 = 50 / ((-arg0 - 26) / 39);
        field2047++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method935(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field2045 = null;
        field2054 = null;
        field2053 = null;
        field2048 = null;
        field2046 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(CI)Z")
    public static final boolean method936(char arg0, int arg1) {
        field2055++;
        if (arg1 != 48) {
            method934(124, 124);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldl;B)I")
    public static final int method937(class123 arg0, byte arg1) {
        field2049++;
        int var2 = 0;
        if (arg0.method806(arg1 ^ 0xFFFFFFCD, class170.field2662)) {
            var2++;
        }
        if (arg1 == -16) {
            if (arg0.method806(16, class131.field1921)) {
                var2++;
            }
            return var2;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Lp;")
    public static final class285 method938(boolean arg0, int arg1) {
        class285 var2 = (class285) class68.field953.method765((long) arg1, 0);
        if (!arg0) {
            method934(-71, -121);
        }
        field2052++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class63.field892.method807((byte) 84, 0, arg1);
        if (var3 == null) {
            return null;
        }
        class285 var4 = new class285();
        class25 var5 = new class25(var3);
        var5.field349 = var5.field339.length - 2;
        int var6 = var5.method190(-3);
        int var7 = var5.field339.length - var6 - 2 - 12;
        var5.field349 = var7;
        int var8 = var5.method214((byte) 44);
        var4.field4516 = var5.method190(-3);
        var4.field4525 = var5.method190(-3);
        var4.field4523 = var5.method190(-3);
        var4.field4528 = var5.method190(-3);
        int var9 = var5.method201(255);
        if (var9 > 0) {
            var4.field4524 = new class100[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method190(-3);
                class100 var12 = new class100(class279.method1869((byte) -71, var11));
                var4.field4524[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method214((byte) 44);
                    int var14 = var5.method214((byte) 44);
                    var12.method662(0, new class179(var14), (long) var13);
                }
            }
        }
        var5.field349 = 0;
        int var15 = 0;
        var4.field4520 = var5.method179((byte) 12);
        var4.field4521 = new int[var8];
        var4.field4527 = new int[var8];
        var4.field4513 = new String[var8];
        while (var5.field349 < var7) {
            int var16 = var5.method190(-3);
            if (var16 == 3) {
                var4.field4513[var15] = var5.method189(!arg0).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4527[var15] = var5.method201(255);
            } else {
                var4.field4527[var15] = var5.method214((byte) 44);
            }
            var4.field4521[var15++] = var16;
        }
        class68.field953.method763(96, var4, (long) arg1);
        return var4;
    }
}
