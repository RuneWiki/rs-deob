import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class152 extends class154 {

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Loh;")
    private static class258 field2607 = class153.method1046(" is already on your ignore list)3", 108);

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Loh;")
    public static class258 field2604 = class153.method1046("Eingabeprozedur geladen)3", 91);

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "[I")
    public static int[] field2610 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Loh;")
    public static class258 field2605 = field2607;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "[I")
    public static int[] field2615 = new int[1000];

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lcl;")
    public static class145 field2602;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lqj;")
    public static class231 field2606;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "[[[B")
    public static byte[][][] field2613;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 6)
    public static void method1039(int arg0) {
        field2607 = null;
        if (arg0 > -112) {
            method1040(105, 17);
        }
        field2615 = null;
        field2613 = (byte[][][]) null;
        field2605 = null;
        field2606 = null;
        field2610 = null;
        field2602 = null;
        field2604 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lgk;", line = 26)
    public static final class239 method1040(int arg0, int arg1) {
        field2612++;
        class239 var2 = (class239) class153.field2621.method701((long) arg1, arg0 ^ 0x3E9);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 1000) {
            method1039(-86);
        }
        byte[] var3 = class110.field1935.method1453(26, (byte) -49, arg1);
        class239 var4 = new class239();
        if (var3 != null) {
            var4.method1642(new class235(var3), true);
        }
        class153.field2621.method698((long) arg1, (byte) 86, var4);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BJ)Loh;", line = 64)
    public static final class258 method1041(byte arg0, long arg1) {
        field2614++;
        if (arg0 < 11) {
            method1040(-73, 87);
        }
        return class162.method1082(false, -103, arg1, 10);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B[I[J)V", line = 85)
    public static final void method1042(byte arg0, int[] arg1, long[] arg2) {
        field2609++;
        class11.method70(arg2.length - 1, (byte) -102, arg2, 0, arg1);
        if (arg0 != 43) {
            method1041((byte) 99, -114L);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(II)V", line = 95)
    public class152(int arg0, int arg1) {
        this.field2611 = arg1;
        this.field2603 = arg0;
    }
}
