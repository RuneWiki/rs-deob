import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class214 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "[[[I")
    public static int[][][] field3999 = new int[4][13][13];

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Ldc;")
    public static class37 field4003 = class185.method1233((byte) 86, "overlay2)3dat");

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Ldc;")
    private static class37 field4002 = class185.method1233((byte) 86, "Walk here");

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field4001 = 127;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Ldc;")
    public static class37 field3997 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Ldc;")
    public static class37 field3998 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
    public static int[] field4000 = new int[2048];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Ldc;")
    public static class37 field3996 = field4002;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Ldc;")
    public static class37 field4007 = class185.method1233((byte) 86, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lrb;")
    public static class187 field4004;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "[[Z")
    public static boolean[][] field4005;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field4004 = null;
        field4007 = null;
        field3996 = null;
        field3999 = null;
        field3997 = null;
        field4003 = null;
        field3998 = null;
        field4005 = null;
        int var1 = -8 % ((-arg0 - 10) / 58);
        field4002 = null;
        field4000 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)J")
    public static final synchronized long method1416(int arg0) {
        field4006++;
        long var1 = System.currentTimeMillis();
        if (class165.field3151 > var1) {
            class54.field1057 += class165.field3151 - var1;
        }
        if (arg0 != 22624) {
            method1416(-33);
        }
        class165.field3151 = var1;
        return var1 + class54.field1057;
    }
}
