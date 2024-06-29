import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class104 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lpe;")
    public static class100 field1893 = new class100(30);

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
    public static int[] field1896 = new int[1000];

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lkj;")
    public static class56 field1898 = new class56(32);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lij;")
    public static class50 field1900 = null;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lce;")
    public static class10 field1897;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "Lce;")
    public static class10 field1899;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)J")
    public static final synchronized long method785(int arg0) {
        if (arg0 != -1) {
            method788((byte) -34);
        }
        field1891++;
        long var1 = System.currentTimeMillis();
        if (class31.field633 > var1) {
            class99.field1824 += class31.field633 - var1;
        }
        class31.field633 = var1;
        return class99.field1824 + var1;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
    public static final int method786(byte arg0) {
        if (arg0 == -122) {
            field1895++;
            return 6;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
    public static final int method787(int arg0, int arg1, int arg2) {
        if (arg1 > -66) {
            method785(16);
        }
        field1892++;
        class99 var3 = (class99) class90.field1716.method443((long) arg2, (byte) -89);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field1829.length) {
            return var3.field1829[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method788(byte arg0) {
        field1899 = null;
        field1898 = null;
        field1896 = null;
        if (arg0 != -55) {
            method789(-127, 44, 97);
        }
        field1900 = null;
        field1897 = null;
        field1893 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)I")
    public static final int method789(int arg0, int arg1, int arg2) {
        if (arg0 >= -1) {
            field1900 = null;
        }
        field1894++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(III)Loi;")
    public static final class55 method790(int arg0, int arg1, int arg2) {
        class65 var3 = class59.field1089[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1233;
    }
}
