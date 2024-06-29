import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class254 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[[[I")
    public static int[][][] field3155 = new int[2][][];

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Ljq;")
    public static class447 field3157 = null;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Luv;")
    public static class3 field3156 = new class3(44, 3);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lvb;")
    public static class291 field3160;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lvv;")
    public static class640 field3161;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    public abstract int method1465(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1532(String arg0, int arg1) {
        if (arg1 != 2) {
            field3157 = null;
        }
        field3158++;
        return class24.method152(true, arg0, 10, (byte) 93);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
    public abstract void method1461(byte arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field3157 = null;
        field3160 = null;
        field3156 = null;
        int var1 = -49 % ((-arg0 - 61) / 62);
        field3155 = null;
        field3161 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(BI)[B")
    public abstract byte[] method1457(byte arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public static final void method1534(int arg0, int arg1, int arg2) {
        if (class396.field5469 == 1) {
            class637.method3670(1, arg0, arg1, class228.field2928);
        } else if (class396.field5469 == 2) {
            class165.method894(arg1, (byte) -119, arg0);
        }
        field3159++;
        class396.field5469 = 0;
        class228.field2928 = null;
        if (arg2 != 13772) {
            field3161 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Ltb;")
    public abstract class409 method1455(byte arg0);
}
