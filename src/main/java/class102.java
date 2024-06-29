import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lec;")
    public static class32 field2396 = class73.method594("<col=00ff80>", true);

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
    public static int[] field2402 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "B")
    public static byte field2391;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field2392;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Luf;")
    public static class145 field2403;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lec;")
    public class32 field2385;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field2397;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
    public boolean field2395;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    private static final void method823(int arg0) {
        class94.field2172.method491(68);
        field2386++;
        class47.field1116.method491(arg0 - 122);
        if (arg0 != 11) {
            method828((byte) 69);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
    public static final void method824(int arg0, int arg1) {
        field2390++;
        class107 var2 = (class107) class34.field710.method1198((long) arg0, (byte) -106);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field2539.length; var3++) {
            var2.field2539[var3] = -1;
            var2.field2537[var3] = 0;
        }
        int var4 = 80 / ((arg1 - 14) / 60);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lec;Lea;ZILec;B)V")
    public static final void method825(class32 arg0, class30 arg1, boolean arg2, int arg3, class32 arg4, byte arg5) {
        field2387++;
        int var6 = arg1.method201(3, arg4);
        int var7 = arg1.method215(arg0, var6, true);
        if (arg5 != -122) {
            field2391 = 106;
        }
        class154.method1197(arg1, -1, var6, arg3, arg2, var7);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method826(int arg0) {
        field2401++;
        class61.method466((byte) -68);
        class157.method1221(99);
        class48.method364(false);
        class47.method358(98);
        class80.method631(-1);
        class63.method488((byte) -68);
        class115.method901(-1708);
        method823(11);
        class17.method128(122);
        class52.method411(0);
        class115.method906(0);
        class8.method48((byte) -68);
        ((class140) class7.field126).method1052(0);
        class50.field1147.method491(-121);
        class92.field2126.method214(-4134);
        class38.field924.method214(-4134);
        class66.field1533.method214(-4134);
        class1.field6.method214(-4134);
        class134.field3117.method214(-4134);
        class124.field2889.method214(-4134);
        class147.field3348.method214(-4134);
        class30.field572.method214(-4134);
        class82.field1921.method214(-4134);
        class72.field1702.method214(-4134);
        class98.field2270.method214(-4134);
        class98.field2248.method214(-4134);
        int var1 = 27 / ((arg0 + 44) / 40);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
    public static final void method827(int arg0, int arg1) {
        if (arg0 == -1 && !class112.field2623) {
            class68.method566(true);
        } else if (arg0 != -1 && class12.field206 != arg0 && class158.field3640 != 0 && !class112.field2623) {
            class86.method668(true, class124.field2889, class158.field3640, false, 0, 2, arg0);
        }
        field2394++;
        class12.field206 = arg0;
        if (arg1 != -10897) {
            field2396 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method828(byte arg0) {
        field2396 = null;
        if (arg0 >= 53) {
            field2402 = null;
            field2397 = null;
            field2403 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public static final void method829(int arg0) {
        field2388++;
        if (arg0 != 0) {
            return;
        }
        for (class136 var1 = (class136) class157.field3596.method1213(96); var1 != null; var1 = (class136) class157.field3596.method1211(-3)) {
            if (class43.field990 != var1.field3151 || var1.field3160) {
                var1.method1093(0);
            } else if (var1.field3153 <= class140.field3219) {
                var1.method1037((byte) -115, class54.field1283);
                if (var1.field3160) {
                    var1.method1093(0);
                } else {
                    class159.field3659.method1148(var1.field3151, var1.field3166, var1.field3173, var1.field3169, 60, var1, 0, -1, false);
                }
            }
        }
    }
}
