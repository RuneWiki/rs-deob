import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class119 extends class69 {

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public int field2011;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[[S")
    public static short[][] field2007 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field2009 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Z")
    public static boolean field2006 = false;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2010 = -1;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "[I")
    public static int[] field2012 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "[[S")
    public static short[][] field2015;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljj;Z)V")
    public static final void method839(class134 arg0, boolean arg1) {
        if (!arg1) {
            class16.field188 = arg0;
            field2016++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
    public static void method840(int arg0) {
        field2012 = null;
        if (arg0 != 24466) {
            field2012 = null;
        }
        field2007 = null;
        field2015 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z")
    public static final boolean method841(int arg0, int arg1) {
        field2008++;
        return arg0 >= ~arg1 && arg1 < class99.field1499.length ? class99.field1499[arg1] : false;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class119() {
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)Lvj;")
    public static final class94 method842(int arg0, int arg1) {
        field2013++;
        int var2 = -62 / ((76 - arg0) / 42);
        class94 var3 = (class94) class128.field2136.method1839((byte) 123, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class115.field1966.method940((byte) 81, class223.method1481(arg1, 255), class244.method1606((byte) -17, arg1));
        class94 var5 = new class94();
        var5.field1388 = arg1;
        if (var4 != null) {
            var5.method671(true, new class264(var4));
        }
        var5.method669(-128);
        if (!class117.field1992 && var5.field1389) {
            var5.field1411 = null;
        }
        if (var5.field1375) {
            var5.field1355 = 0;
            var5.field1390 = false;
        }
        class128.field2136.method1830((long) arg1, -78, var5);
        return var5;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
    public class119(int arg0) {
        this.field2011 = arg0;
    }
}
