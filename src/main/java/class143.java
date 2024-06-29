import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class143 extends class24 {

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "[I")
    public int[] field2201 = new int[] { 0 };

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "[I")
    public int[] field2207 = new int[] { -1 };

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "Luf;")
    public static class168 field2202 = class148.method1019(-1720, "compass");

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lkb;")
    public static class80 field2199 = new class80(4096);

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Lej;")
    public static class204 field2204 = new class204(500);

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[[I")
    public static int[][] field2211 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "Lg;")
    public static class242 field2206 = null;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "Luf;")
    public static class168 field2205 = class148.method1019(-1720, "ul");

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "Lfj;")
    public static class283 field2209;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLj;)Luf;", line = 18)
    public static final class168 method980(byte arg0, class153 arg1) {
        field2200++;
        return arg0 <= 59 ? (class168) null : class189.method1331(0, arg1, 32767);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILuf;)V", line = 43)
    public static final void method981(int arg0, class168 arg1) {
        field2203++;
        int var2 = class236.method1592(true, arg1);
        if (var2 == -1) {
            return;
        }
        class238.field3846 = class201.field3315.field4144[var2] - class40.field506;
        class148.field2293 = class261.field4420 + class172.field2801 + arg0 - class201.field3315.field4148[var2];
        int var3 = class238.field3846 + ((int) ((float) class77.field1045.field3989 / class15.field149));
        int var4 = class238.field3846 - (int) ((float) class77.field1045.field3989 / class15.field149);
        int var5 = class148.field2293 + ((int) ((float) class77.field1045.field4057 / class15.field149));
        if (var4 < 0) {
            class238.field3846 = (int) ((float) class77.field1045.field3989 / class15.field149);
        }
        if (var3 > class140.field2161) {
            class238.field3846 = class140.field2161 - (int) ((float) class77.field1045.field3989 / class15.field149);
        }
        int var6 = class148.field2293 - ((int) ((float) class77.field1045.field4057 / class15.field149));
        if (var6 < 0) {
            class148.field2293 = (int) ((float) class77.field1045.field4057 / class15.field149);
        }
        if (class172.field2801 < var5) {
            class148.field2293 = class172.field2801 - ((int) ((float) class77.field1045.field4057 / class15.field149));
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V", line = 85)
    public static void method982(byte arg0) {
        field2209 = null;
        field2206 = null;
        field2211 = (int[][]) null;
        field2205 = null;
        if (arg0 != -82) {
            field2205 = (class168) null;
        }
        field2202 = null;
        field2199 = null;
        field2204 = null;
    }
}
