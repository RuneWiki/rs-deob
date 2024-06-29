import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class144 extends class107 {

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public int field2411;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[Z")
    public static boolean[] field2405 = new boolean[112];

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Ldf;")
    public static class51 field2415 = class46.method233("Update)2Liste geladen)3", 100);

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "Ldf;")
    private static class51 field2414 = class46.method233("flash2:", 100);

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "Ldf;")
    public static class51 field2417 = field2414;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "Ldf;")
    public static class51 field2413 = field2414;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "[Ldf;")
    public static class51[] field2406;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)Z")
    public final boolean method1035(byte arg0, int arg1, int arg2) {
        field2410++;
        if (arg0 >= -114) {
            return true;
        } else {
            return this.field2416 <= arg1 && this.field2411 >= arg1 && this.field2404 <= arg2 && this.field2412 >= arg2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lu;Lu;Lki;B)V")
    public static final void method1036(class111 arg0, class111 arg1, class58 arg2, byte arg3) {
        field2401++;
        class195.field3267 = arg1;
        if (arg3 == 83) {
            class2.field9 = arg0;
            class109.field1861 = arg2;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static void method1037(int arg0) {
        field2415 = null;
        field2414 = null;
        field2406 = null;
        field2405 = null;
        if (arg0 > -127) {
            method1038(105, -88, 13L, 67);
        }
        field2413 = null;
        field2417 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIJI)Z")
    public static final boolean method1038(int arg0, int arg1, long arg2, int arg3) {
        field2409++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        int var7 = ((int) arg2 & 0x355F64) >> 20;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class108 var8 = class41.method210(var6, (byte) 75);
            int var9 = var8.field1803;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var11 = var8.field1824;
                var10 = var8.field1807;
            } else {
                var10 = var8.field1824;
                var11 = var8.field1807;
            }
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            class202.method1403(arg3, true, arg0 ^ 0xFFFFE4EC, var9, class44.field706.field4343[0], 0, var11, arg1, class44.field706.field4336[0], var10, 0, 2);
        } else {
            class202.method1403(arg3, true, arg0 + 6932, 0, class44.field706.field4343[0], var5 + 1, 0, arg1, class44.field706.field4336[0], 0, var7, 2);
        }
        if (arg0 != -6930) {
            field2403 = -79;
        }
        class22.field342 = class265.field4642;
        class51.field817 = 2;
        class192.field3228 = 0;
        class1.field7 = class221.field3834;
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(IIII)V")
    public class144(int arg0, int arg1, int arg2, int arg3) {
        this.field2404 = arg1;
        this.field2412 = arg3;
        this.field2411 = arg2;
        this.field2416 = arg0;
    }
}
