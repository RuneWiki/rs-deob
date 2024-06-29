import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class211 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3796 = 0;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3797 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3798 = -1;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Z")
    public static boolean field3799 = false;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[Leb;")
    public static class200[] field3792 = new class200[100];

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3801 = 255;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1459(boolean arg0) {
        if (!arg0) {
            field3792 = null;
        }
        field3792 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBI)V")
    public static final void method1460(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class27.field342 == 1) {
            class103.field1487[class96.field1409 / 100].method221(class223.field4002 - 8, class27.field343 - 8);
        }
        field3795++;
        if (arg3 != 98) {
            method1462(8, (byte) -102);
        }
        if (class27.field342 == 2) {
            class103.field1487[class96.field1409 / 100 + 4].method221(class223.field4002 - 8, class27.field343 - 8);
        }
        class243.method1664((byte) 119);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZIII)V")
    public static final void method1461(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class23.field291 >= arg0 && class93.field1361 <= arg4) {
            boolean var6;
            if (class188.field3296 > arg1) {
                var6 = false;
                arg1 = class188.field3296;
            } else if (class95.field1388 >= arg1) {
                var6 = true;
            } else {
                var6 = false;
                arg1 = class95.field1388;
            }
            boolean var7;
            if (class188.field3296 > arg5) {
                arg5 = class188.field3296;
                var7 = false;
            } else if (arg5 <= class95.field1388) {
                var7 = true;
            } else {
                arg5 = class95.field1388;
                var7 = false;
            }
            if (arg0 < class93.field1361) {
                arg0 = class93.field1361;
            } else {
                class25.method147(arg3, 7, arg1, class95.field1380[arg0++], arg5);
            }
            if (arg4 <= class23.field291) {
                class25.method147(arg3, 7, arg1, class95.field1380[arg4--], arg5);
            } else {
                arg4 = class23.field291;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; var8++) {
                    int[] var9 = class95.field1380[var8];
                    var9[arg1] = var9[arg5] = arg3;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg4; var10++) {
                    class95.field1380[var10][arg1] = arg3;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg4; var11++) {
                    class95.field1380[var11][arg5] = arg3;
                }
            }
        }
        if (arg2) {
            method1459(false);
        }
        field3793++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
    public static final void method1462(int arg0, byte arg1) {
        class70.field980.method1535(arg0, 30704);
        field3794++;
        class102.field1473.method130(-86, arg0);
        if (arg1 < 40) {
            field3798 = 101;
        }
        class148.field2338.method130(111, arg0);
        class149.field2384.method130(83, arg0);
    }
}
