import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class12 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lsb;")
    public static class98 field234 = class47.method368("gelb:", 0);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "S")
    public static short field235 = 32767;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Z")
    public static boolean field238 = true;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lsb;")
    public static class98 field237 = class47.method368("<col=ffb000>", 0);

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lsb;")
    public static class98 field241 = class47.method368("weiss:", 0);

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public static final void method105(int arg0, int arg1, int arg2) {
        if (arg2 >= -99) {
            field234 = null;
        }
        class118.field2117[arg0] = arg1;
        class211 var3 = (class211) class85.field1505.method1511((byte) -125, (long) arg0);
        field242++;
        if (var3 == null) {
            class211 var4 = new class211(class164.method1183((byte) 80) + 500L);
            class85.field1505.method1513((long) arg0, var4, -1);
        } else {
            var3.field3608 = class164.method1183((byte) 80) + 500L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([IIIIII)V")
    public static final void method106(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class71 var6 = class31.field553[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class59 var7 = var6.field1131;
        if (var7 != null) {
            int var8 = var7.field974;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class42 var10 = var6.field1155;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field701;
        int var12 = var10.field694;
        int var13 = var10.field696;
        int var14 = var10.field700;
        int[] var15 = class56.field897[var11];
        int[] var16 = class137.field2425[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method107(int arg0) {
        field237 = null;
        if (arg0 >= -26) {
            method110((class216) null, 15);
        }
        field234 = null;
        field241 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[B)Lui;")
    public static final class73 method108(byte arg0, byte[] arg1) {
        field233++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 75) {
            method105(-20, 38, -101);
        }
        class77 var2 = new class77(arg1, class253.field4422, class9.field207, class245.field4326, class164.field2958, class204.field3491);
        class125.method932(true);
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method109(boolean arg0) {
        if (class46.field774 != null) {
            class46.field774.method790(false);
            class46.field774 = null;
        }
        class192.method1326(2);
        field240++;
        class45.method360();
        for (int var1 = 0; var1 < 4; var1++) {
            class110.field1961[var1].method518((byte) 92);
        }
        class95.method688(83);
        System.gc();
        class79.method593(2, 111);
        class143.field2527 = -1;
        class187.field3229 = false;
        class150.method1109(arg0, (byte) 64);
        class189.field3277 = 0;
        class182.field3143 = 0;
        class28.field531 = false;
        for (int var2 = 0; var2 < class262.field4597.length; var2++) {
            class262.field4597[var2] = null;
        }
        class97.field1671 = 0;
        class222.field3837 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class141.field2499[var3] = null;
            class129.field2304[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class180.field3109[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class115.field2050[var5][var6][var7] = null;
                }
            }
        }
        class220.method1518(1);
        class264.method1798(false);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Llj;I)Loi;")
    public static final class26 method110(class216 arg0, int arg1) {
        if (arg1 != 1) {
            field236 = 22;
        }
        field239++;
        return new class26(arg0.method1483(-89), arg0.method1483(arg1 ^ 0xFFFFFF82), arg0.method1483(arg1 ^ 0xFFFFFFBC), arg0.method1483(-115), arg0.method1448(arg1 + 26419), arg0.method1446(5350));
    }
}
