import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class202 extends class235 {

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "Lsb;")
    public static class98 field3441 = class47.method368("http:)4)4", 0);

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field3440 = -2;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "Lsb;")
    public static class98 field3442 = class47.method368("(U3", 0);

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field3438 = -1;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "Lsb;")
    public static class98 field3448 = class47.method368("cookiehost", 0);

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "[I")
    public static int[] field3451 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "J")
    public long field3439;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Lhj;")
    public class202 field3449;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Lhj;")
    public class202 field3455;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "Z")
    public static boolean field3452;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
    public static void method1365(byte arg0) {
        field3448 = null;
        if (arg0 > 110) {
            field3451 = null;
            field3442 = null;
            field3441 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(JI)V")
    public static final void method1366(long arg0, int arg1) {
        field3454++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class99.field1751 < 100 || class55.field875 == 1) || class99.field1751 >= 200) {
            class176.method1228(class233.field4011, class233.field4020, (byte) -49, 0);
            return;
        }
        class98 var3 = class106.method814(arg0, (byte) -128).method726((byte) -100);
        for (int var4 = 0; var4 < class99.field1751; var4++) {
            if (class74.field1270[var4] == arg0) {
                class176.method1228(class233.field4011, class186.method1288(new class98[] { var3, class86.field1520 }, arg1 ^ 0x7B82), (byte) -49, 0);
                return;
            }
        }
        for (int var5 = arg1; var5 < class191.field3318; var5++) {
            if (class228.field3926[var5] == arg0) {
                class176.method1228(class233.field4011, class186.method1288(new class98[] { class26.field495, var3, class113.field2001 }, 31618), (byte) -49, 0);
                return;
            }
        }
        if (var3.method748(true, class163.field2943.field3323)) {
            class176.method1228(class233.field4011, class158.field2878, (byte) -49, 0);
            return;
        }
        class49.field817[class99.field1751] = var3;
        class178.field3089++;
        class74.field1270[class99.field1751] = arg0;
        class158.field2875[class99.field1751] = 0;
        class150.field2769[class99.field1751] = class233.field4011;
        class107.field1923[class99.field1751] = 0;
        class265.field4635[class99.field1751] = false;
        class237.field4093 = class186.field3214;
        class99.field1751++;
        class237.field4084.method490(225, -108);
        class237.field4084.method1484(arg0, (byte) 38);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZIIB)Lnj;")
    public static final class82 method1367(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field3457++;
        int var7 = (arg1 << 19) + (arg2 ? 65536 : 0) + arg0 + (arg3 << 17);
        long var8 = (long) arg4 * 3147483667L + (long) var7 * 3849834839L;
        if (arg5 != -121) {
            method1370(false, false);
        }
        class82 var10 = (class82) class121.field2230.method1564(var8, arg5 ^ 0xFFFFFF87);
        if (var10 != null) {
            return var10;
        }
        class160.field2901 = false;
        class82 var11 = class163.method1181(arg3, (byte) 67, arg2, arg1, arg0, false, arg4, false);
        if (var11 != null && !class160.field2901) {
            class121.field2230.method1563(var8, arg5 + 21892, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V")
    public final void method1368(byte arg0) {
        field3450++;
        if (this.field3449 == null) {
            return;
        }
        if (arg0 != 3) {
            method1369((byte) 103);
        }
        this.field3449.field3455 = this.field3455;
        this.field3455.field3449 = this.field3449;
        this.field3449 = null;
        this.field3455 = null;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)[Lve;")
    public static final class174[] method1369(byte arg0) {
        field3446++;
        class174[] var1 = new class174[class110.field1956];
        for (int var2 = 0; var2 < class110.field1956; var2++) {
            var1[var2] = new class24(class144.field2538, class101.field1790, class253.field4422[var2], class9.field207[var2], class245.field4326[var2], class164.field2958[var2], class204.field3491[var2], class33.field572);
        }
        if (arg0 < 25) {
            method1366(32L, -44);
        }
        class125.method932(true);
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZZ)V")
    public static final void method1370(boolean arg0, boolean arg1) {
        field3453++;
        byte[][] var2 = class75.field1329;
        if (arg0) {
            method1370(true, false);
        }
        int var3 = class238.field4106.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class49.field812[var4] >> 8) * 64 - class189.field3277;
                int var7 = (class49.field812[var4] & 0xFF) * 64 - class182.field3143;
                class115.method867(48);
                class97.method698(arg1, 80, var6, var5, class110.field1961, var7);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1371(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        field3456++;
        int var4 = 124 / ((arg1 - 64) / 53);
        class66.method463(arg0, 0, var3, 0, var2);
        return var3;
    }
}
