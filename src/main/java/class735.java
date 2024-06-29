import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class735 extends class649 {

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field10354 = -1;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[[I")
    public static int[][] field10360 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ltm;")
    public static class334 field10357 = new class334(117, 6);

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Lla;")
    public static class422 field10364;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
    public final int method135(int arg0) {
        ++field10361;
        int var2 = 101 % ((arg0 - -18) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(ILhs;)V")
    public class735(int arg0, class358 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lhs;)V")
    public class735(class358 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method4101(int arg0, String arg1) throws ClassNotFoundException {
        ++field10362;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg0 != 10) {
                field10357 = null;
            }
            return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public static final void method4102(int arg0) {
        if (arg0 != -4007) {
            field10360 = null;
        }
        class158.field2453 = new class353[class334.field4889.method2628(-122)][];
        ++field10356;
        class114.field1763 = new class353[class334.field4889.method2628(101)][];
        class229.field3705 = new boolean[class334.field4889.method2628(-102)];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)V")
    public final void method129(int arg0, byte arg1) {
        super.field9223 = arg0;
        if (arg1 >= -120) {
            method4103((byte) 14);
        }
        ++field10355;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        ++field10358;
        if (super.field9223 != arg0 && ~super.field9223 != -1) {
            super.field9223 = this.method135(-92);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method4103(byte arg0) {
        field10360 = null;
        int var1 = -3 % ((-22 - arg0) / 46);
        field10364 = null;
        field10357 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
    public final int method133(int arg0, int arg1) {
        ++field10359;
        if (arg0 != 18648) {
            this.method135(16);
        }
        return 1;
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
    public final int method4104(int arg0) {
        ++field10353;
        if (arg0 != 3) {
            field10364 = null;
        }
        return super.field9223;
    }
}
