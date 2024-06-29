import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class351 extends class263 {

    @OriginalMember(owner = "client!nn", name = "pb", descriptor = "Lee;")
    public class579 field4535;

    @OriginalMember(owner = "client!nn", name = "hb", descriptor = "[I")
    public static int[] field4527 = new int[3];

    @OriginalMember(owner = "client!nn", name = "mb", descriptor = "Lvj;")
    public static class373 field4532 = new class373(108, 10);

    @OriginalMember(owner = "client!nn", name = "qb", descriptor = "Z")
    public static boolean field4536 = false;

    @OriginalMember(owner = "client!nn", name = "gb", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!nn", name = "ib", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!nn", name = "jb", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!nn", name = "kb", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!nn", name = "lb", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!nn", name = "nb", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!nn", name = "ob", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
    public static void method1951(int arg0) {
        field4532 = null;
        if (arg0 <= 85) {
            method1956(99);
        }
        field4527 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZII)V")
    public static final void method1952(boolean arg0, int arg1, int arg2) {
        ++field4528;
        if (class197.field2385 == 1) {
            class476.method2776(arg2, class34.field269, arg1, 28409);
        } else if (class197.field2385 == 2) {
            class608.method3503(31911, arg1, arg2);
        }
        if (!arg0) {
            class34.field269 = null;
            class197.field2385 = 0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBLjava/net/Socket;)Lia;")
    public static final class504 method1953(int arg0, byte arg1, Socket arg2) throws IOException {
        if (arg1 != 58) {
            return null;
        } else {
            ++field4534;
            return new class394(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public final void method1471(int arg0) {
        ++field4529;
        this.field4535 = new class579(super.field3388);
        if (arg0 != 1) {
            field4532 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lhr;)V")
    public class351(class446 arg0) {
        super(arg0);
        this.field4535 = new class579(arg0);
        super.field3430 = new class227(super.field3388);
        super.field3420 = new class227(super.field3388);
        super.field3432 = new class227(super.field3388);
        super.field3418 = new class227(super.field3388);
        super.field3419 = new class227(super.field3388);
        super.field3433 = new class227(super.field3388);
        super.field3407 = new class227(super.field3388);
        super.field3399 = new class227(super.field3388);
        super.field3408 = new class227(super.field3388);
        super.field3411 = new class227(super.field3388);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
    public static final int method1954(int arg0, int arg1, int arg2) {
        ++field4533;
        int var3 = arg1 >> 31 & arg0 + -1;
        if (arg2 != 423047135) {
            method1956(-65);
        }
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)Z")
    public static final boolean method1955(byte arg0, int arg1, int arg2) {
        ++field4530;
        int var3 = 9 / ((arg0 - 7) / 48);
        return class583.method3394(arg2, arg1, (byte) -94) | ~(arg2 & 393216) != -1 || class548.method3214(arg1, arg2, 45056) || class617.method3546(115, arg2, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
    public static final void method1956(int arg0) {
        if (arg0 != -9046) {
            method1954(-15, -8, 26);
        }
        ++field4531;
        class557 var1 = class93.method564(15, -14073, 0);
        var1.method3264(arg0 ^ 1037615178);
    }
}
