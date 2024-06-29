import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class2 {

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lpf;")
    public static class168 field29 = new class168(64);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lub;")
    public static class227 field32 = class257.method1749("T", 17263);

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[Lgb;")
    public static class46[] field31;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method2(byte arg0) {
        class213.field3591.method1723(-4173);
        field30++;
        if (arg0 != 96) {
            field34 = 15;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public static final void method3(int arg0, int arg1, int arg2) {
        field28++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        if (arg0 != -2450) {
            return;
        }
        int var5 = 1;
        var4[0] = arg2;
        var3[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class32.field525[var6] != arg2) {
                var4[var5] = class32.field525[var6];
                var3[var5] = class168.field2808[var6];
                var5++;
            }
        }
        class32.field525 = var4;
        class168.field2808 = var3;
        class28.method145(class182.field3104.length - 1, class182.field3104, 0, (byte) -128);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public static void method4(byte arg0) {
        field31 = null;
        int var1 = 87 / ((arg0 + 68) / 47);
        field32 = null;
        field29 = null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static final void method5(byte arg0) {
        class32.field512.method666((byte) 54);
        field25++;
        int var1 = class32.field512.method660(1, true);
        if (arg0 >= -69) {
            field34 = -23;
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class32.field512.method660(2, true);
        if (var2 == 0) {
            class131.field2293[class147.field2572++] = 2047;
        } else if (var2 == 1) {
            int var3 = class32.field512.method660(3, true);
            class216.field3639.method19(var3, true, false);
            int var4 = class32.field512.method660(1, true);
            if (var4 == 1) {
                class131.field2293[class147.field2572++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class32.field512.method660(3, true);
            class216.field3639.method19(var5, true, true);
            int var6 = class32.field512.method660(3, true);
            class216.field3639.method19(var6, true, true);
            int var7 = class32.field512.method660(1, true);
            if (var7 == 1) {
                class131.field2293[class147.field2572++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class32.field512.method660(7, true);
            int var9 = class32.field512.method660(1, true);
            if (var9 == 1) {
                class131.field2293[class147.field2572++] = 2047;
            }
            class64.field1171 = class32.field512.method660(2, true);
            int var10 = class32.field512.method660(7, true);
            int var11 = class32.field512.method660(1, true);
            class216.field3639.method18(var8, var10, var11 == 1, 42);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method6(int arg0) {
        int var1 = -14 / ((-arg0 - 37) / 48);
        class59.field1098.method588(-86);
        field23++;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method7(int arg0) {
        class145.field2503.method1292(arg0 ^ 0x61C4);
        class60.field1111.method216((byte) -28);
        field26++;
        if (arg0 != 0) {
            field31 = null;
        }
        class177.field2978.method216((byte) -28);
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V")
    public static final void method8(byte arg0) {
        field24++;
        if (arg0 <= -78) {
            class213.field3591.method1728(true);
        }
    }
}
