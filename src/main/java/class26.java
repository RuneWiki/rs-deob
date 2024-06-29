import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class26 extends class86 {

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "F")
    public static float field400 = 0.0F;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lta;")
    public static class262 field399 = new class262(32);

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "Ljava/lang/String;")
    public static String field403 = "Prepared sound engine";

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BII)V")
    public static final void method207(byte arg0, int arg1, int arg2) {
        field401++;
        class295 var3 = class250.method1673(arg0 ^ 0x4A, 5, arg2);
        var3.method1980(1022716908);
        var3.field4632 = arg1;
        if (arg0 != -51) {
            method207((byte) 72, 107, -1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILuf;Luf;Z)Lud;")
    public static final class2 method208(int arg0, int arg1, class176 arg2, class176 arg3, boolean arg4) {
        field398++;
        if (class261.method1750(arg2, arg1, arg0, (byte) 95)) {
            if (arg4) {
                field400 = -1.4743423F;
            }
            return class71.method555(arg3.method1163(arg1, arg0, 48), (byte) -35);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static final void method209(int arg0) {
        field393++;
        int var1 = class139.field2139;
        int var2 = class154.field2353;
        int var3 = class273.field4313;
        int var4 = class92.field1478 - 3;
        byte var5 = 20;
        if (class245.field3803 == null || class86.field1416 == null) {
            if (class90.field1459.method1147(class58.field903, -45) && class90.field1459.method1147(class100.field1614, -90)) {
                class245.field3803 = class288.method1943(0, class90.field1459, (byte) -88, class58.field903);
                class86.field1416 = class288.method1943(0, class90.field1459, (byte) -88, class100.field1614);
            } else {
                class201.method1352(var1, var2, var3, var5, class238.field3678, 256 - class212.field3283);
            }
        }
        if (class245.field3803 != null && class86.field1416 != null) {
            int var6 = (var3 - (class86.field1416.field54 * 2)) / class245.field3803.field54;
            for (int var7 = 0; var7 < var6; var7++) {
                class245.field3803.method45(class245.field3803.field54 * var7 + class86.field1416.field54 + var1, var2);
            }
            class86.field1416.method45(var1, var2);
            class86.field1416.method49(var1 + var3 - class86.field1416.field54, var2);
        }
        class123.field1925.method13(class215.field3315, var1 + 3, var2 - -14, class229.field3585, -1);
        if (arg0 <= 4) {
            method207((byte) 91, -120, 45);
        }
        class201.method1352(var1, var2 + var5, var3, var4 - var5, class238.field3678, 256 - class212.field3283);
        int var8 = class188.field3012;
        int var9 = class108.field1719;
        for (int var10 = 0; var10 < class220.field3450; var10++) {
            int var18 = (class220.field3450 - (var10 + 1)) * 15 + var2 + var5 + 13;
            if (var1 < var8 && var8 < (var1 + var3) && var18 - 13 < var9 && var18 + 3 > var9) {
                class201.method1352(var1, var18 - 12, var3, 15, class221.field3458, 256 - class124.field1957);
            }
        }
        if ((class262.field4088 == null || class18.field289 == null || class158.field2433 == null) && class90.field1459.method1147(class34.field545, -103) && class90.field1459.method1147(class217.field3371, -67) && class90.field1459.method1147(class267.field4260, -101)) {
            class262.field4088 = class288.method1943(0, class90.field1459, (byte) -88, class34.field545);
            class18.field289 = class288.method1943(0, class90.field1459, (byte) -88, class217.field3371);
            class158.field2433 = class288.method1943(0, class90.field1459, (byte) -88, class267.field4260);
        }
        if (class262.field4088 != null && class18.field289 != null && class158.field2433 != null) {
            int var11 = (var3 - (class158.field2433.field54 * 2)) / class262.field4088.field54;
            for (int var12 = 0; var12 < var11; var12++) {
                class262.field4088.method45(var1 - (-class158.field2433.field54 - class262.field4088.field54 * var12), -class262.field4088.field52 + var2 + var4);
            }
            int var13 = (var4 - var5 - class158.field2433.field52) / class18.field289.field52;
            for (int var14 = 0; var14 < var13; var14++) {
                class18.field289.method45(var1, class18.field289.field52 * var14 + var2 + var5);
                class18.field289.method49(var1 + var3 - class18.field289.field54, var2 + var5 - -(class18.field289.field52 * var14));
            }
            class158.field2433.method45(var1, var2 - (class158.field2433.field52 - var4));
            class158.field2433.method49(var1 + var3 - class158.field2433.field54, var2 - -var4 + -class158.field2433.field52);
        }
        for (int var15 = 0; var15 < class220.field3450; var15++) {
            int var16 = class229.field3585;
            int var17 = var2 - (-(class220.field3450 - (var15 + 1)) * 15 - var5 - 13);
            if (var8 > var1 && (var1 + var3) > var8 && var9 > (var17 - 13) && (var17 + 3) > var9) {
                var16 = class98.field1570;
            }
            class123.field1925.method13(class57.method454(15827, var15), var1 + 3, var17, var16, 0);
        }
        class204.method1365(class273.field4313, (byte) -69, class139.field2139, class92.field1478, class154.field2353);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
    public static final boolean method210(int arg0, int arg1) {
        class238.field3691 = true;
        class109.field1741 = arg1 + 1 & 0xFFFF;
        field397++;
        int var2 = 81 / ((62 - arg0) / 62);
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
    public static void method211(boolean arg0) {
        if (!arg0) {
            method209(-114);
        }
        field399 = null;
        field403 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)Ljf;")
    public static final class64 method212(boolean arg0, int arg1) {
        field392++;
        class64 var2 = (class64) class287.field4523.method1780((long) arg1, (byte) -111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field3078.method1163(16, arg1, 48);
        class64 var4 = new class64();
        if (var3 != null) {
            var4.method506(22048, new class37(var3));
        }
        class287.field4523.method1784(var4, arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static final void method213(byte arg0) {
        class56.field868.method1412(29692);
        class220.field3451.method684(126);
        field396++;
        if (arg0 < 0) {
            method209(-36);
        }
        class85.field1404.method684(126);
    }
}
