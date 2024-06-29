import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class92 extends class207 {

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "J")
    public long field1868;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Luk;")
    public static class96 field1871 = new class96(20);

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Ljd;")
    public static class86 field1873 = class122.method868(":trade:", true);

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lrk;")
    public static class257 field1872 = new class257();

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public static int field1874 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILbj;II)[Lmk;")
    public static final class101[] method681(int arg0, class151 arg1, int arg2, int arg3) {
        field1870++;
        if (class163.method1181(arg1, arg3, 10475, arg0)) {
            return arg2 == 28803 ? class247.method1674(arg2 ^ 0x7081) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method682(byte arg0) {
        class14.field411.method702((byte) -88);
        if (arg0 < 102) {
            method681(74, (class151) null, 88, -99);
        }
        field1869++;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
    public static void method683(int arg0) {
        if (arg0 >= -38) {
            field1873 = null;
        }
        field1871 = null;
        field1873 = null;
        field1872 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class92() {
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(J)V")
    public class92(long arg0) {
        this.field1868 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lhi;")
    public static final class209 method684(int arg0, int arg1) {
        field1867++;
        class209 var2 = (class209) class215.field3880.method701((byte) -126, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class177.field3204.method1084((byte) -116, 16, arg0);
        class209 var4 = new class209();
        if (var3 != null) {
            var4.method1485(124, new class200(var3));
        }
        class215.field3880.method696((long) arg0, var4, (byte) -96);
        if (arg1 != 8609) {
            method683(-37);
        }
        return var4;
    }
}
