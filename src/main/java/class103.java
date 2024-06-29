import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class103 extends RuntimeException {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1408;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/lang/String;")
    public String field1406;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lwo;")
    public static class522 field1409 = new class522();

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Luf;")
    public static class310 field1411 = new class310(103, 6);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lvh;")
    public static class240 field1412;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[[Z")
    public static boolean[][] field1410;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILa;)I", line = 4)
    public static final int method680(int arg0, class436 arg1) {
        field1404++;
        if (arg0 != -6124) {
            return -99;
        }
        int var2 = arg1.method2599((byte) 98, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2599((byte) 98, 5);
        } else if (var2 == 2) {
            var3 = arg1.method2599((byte) 98, 8);
        } else {
            var3 = arg1.method2599((byte) 98, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 31)
    public static void method681(byte arg0) {
        if (arg0 != -77) {
            field1410 = null;
        }
        field1409 = null;
        field1412 = null;
        field1410 = null;
        field1411 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLjava/lang/Object;)[B", line = 48)
    public static final byte[] method682(int arg0, boolean arg1, Object arg2) {
        field1405++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class393.method2250(0, var3) : var3;
        } else if (arg2 instanceof class277) {
            class277 var4 = (class277) arg2;
            return var4.method1566(98);
        } else {
            if (arg0 != -2) {
                field1411 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 86)
    public class103(Throwable arg0, String arg1) {
        this.field1408 = arg0;
        this.field1406 = arg1;
    }
}
