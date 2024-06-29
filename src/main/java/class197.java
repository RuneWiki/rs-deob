import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class197 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lkf;")
    public static class85 field3394 = new class85();

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Lsb;")
    public static class98 field3398 = class47.method368("(Y", 0);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lsb;")
    private static class98 field3400 = class47.method368("Loaded textures", 0);

    @OriginalMember(owner = "client!si", name = "h", descriptor = "Lsb;")
    public static class98 field3399 = field3400;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3402 = 0;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "S")
    public static short field3403 = 320;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lac;")
    public static class188 field3401;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZIIII)V")
    public static final void method1346(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field3396++;
        if (arg0) {
            field3394 = null;
        }
        if (class229.field3933 <= arg2 && arg2 <= class106.field1899) {
            int var5 = class47.method369(2, arg1, class116.field2077, class215.field3666);
            int var6 = class47.method369(2, arg4, class116.field2077, class215.field3666);
            class87.method646(arg2, var5, arg3, var6, -28);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1347(int arg0) {
        if (arg0 != 1000) {
            method1346(true, 110, 35, -26, 36);
        }
        field3399 = null;
        field3400 = null;
        field3394 = null;
        field3401 = null;
        field3398 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lgk;")
    public static final class166 method1348(int arg0, int arg1) {
        field3395++;
        class166 var2 = (class166) class6.field89.method1564((long) arg0, arg1 ^ 0x3E8);
        if (var2 != null) {
            return var2;
        }
        class166 var3 = class224.method1548(class95.field1643, arg0, arg1 ^ arg1, false, class41.field678);
        if (var3 != null) {
            class6.field89.method1563((long) arg0, arg1 ^ 0x56E3, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[B")
    public static final synchronized byte[] method1349(int arg0, byte arg1) {
        if (arg1 != -85) {
            return null;
        }
        field3392++;
        if (arg0 == 100 && class138.field2440 > 0) {
            byte[] var2 = class173.field3034[--class138.field2440];
            class173.field3034[class138.field2440] = null;
            return var2;
        } else if (arg0 == 5000 && class245.field4274 > 0) {
            byte[] var3 = class36.field609[--class245.field4274];
            class36.field609[class245.field4274] = null;
            return var3;
        } else if (arg0 == 30000 && class118.field2113 > 0) {
            byte[] var4 = class189.field3261[--class118.field2113];
            class189.field3261[class118.field2113] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)Z")
    public static final boolean method1350(byte arg0, int arg1) {
        if (arg0 != -33) {
            field3400 = null;
        }
        field3397++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static final void method1351(int arg0) {
        field3393++;
        class95.method688(61);
        if (arg0 > -35) {
            method1350((byte) 21, 41);
        }
        System.gc();
        class220.method1521(25, 0);
    }
}
