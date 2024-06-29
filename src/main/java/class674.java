import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class674 {

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
    public int field9451;

    @OriginalMember(owner = "client!wca", name = "e", descriptor = "I")
    private int field9455;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "Lti;")
    private class438 field9453;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "I")
    public int field9458;

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "Lwca;")
    public static class674 field9457 = new class674(0, 3, class438.field6121);

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "Lwca;")
    public static class674 field9459 = new class674(1, 3, class438.field6121);

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Lwca;")
    public static class674 field9460 = new class674(2, 4, class438.field6117);

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "Lwca;")
    public static class674 field9461 = new class674(3, 1, class438.field6121);

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "Lwca;")
    public static class674 field9462 = new class674(4, 2, class438.field6121);

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "Lwca;")
    public static class674 field9463 = new class674(5, 3, class438.field6121);

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "Lwca;")
    public static class674 field9464 = new class674(6, 4, class438.field6121);

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field9465 = class621.method3590(16, 4);

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "J")
    public static long field9466 = 0L;

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
    public static int field9467 = 0;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "[J")
    public static long[] field9468 = new long[256];

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "Lqe;")
    public static class465 field9470;

    @OriginalMember(owner = "client!wca", name = "u", descriptor = "Z")
    public static boolean field9471;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "Lft;")
    public static class4 field9469;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field9468[var0] = var1;
        }
        field9470 = new class465(2, 2);
        field9471 = true;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)Lwca;", line = 5)
    public static final class674 method3811(byte arg0, int arg1) {
        field9454++;
        if (arg0 < 89) {
            method3813(null, (byte) -69);
        }
        if (arg1 == 0) {
            return field9457;
        } else if (arg1 == 1) {
            return field9459;
        } else if (arg1 == 2) {
            return field9460;
        } else if (arg1 == 3) {
            return field9461;
        } else if (arg1 == 4) {
            return field9462;
        } else if (arg1 == 5) {
            return field9463;
        } else if (arg1 == 6) {
            return field9464;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 79)
    public static void method3812(int arg0) {
        if (arg0 != -9) {
            method3813(null, (byte) -76);
        }
        field9470 = null;
        field9462 = null;
        field9457 = null;
        field9460 = null;
        field9464 = null;
        field9459 = null;
        field9461 = null;
        field9469 = null;
        field9463 = null;
        field9468 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lbba;B)Lcu;", line = 106)
    public static final class217 method3813(class113 arg0, byte arg1) {
        if (arg1 != 14) {
            return null;
        }
        field9456++;
        class217 var2;
        if (class532.field7536 == null) {
            var2 = new class217();
        } else {
            var2 = class532.field7536;
            class532.field7536 = class532.field7536.field3091;
            class125.field1915--;
            var2.field3091 = null;
        }
        var2.field3090 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!wca", name = "toString", descriptor = "()Ljava/lang/String;", line = 129)
    public final String toString() {
        field9452++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IILti;)V", line = 138)
    private class674(int arg0, int arg1, class438 arg2) {
        this.field9451 = arg0;
        this.field9455 = arg1;
        this.field9453 = arg2;
        this.field9458 = this.field9453.field6113 * this.field9455;
        if (this.field9451 >= 16) {
            throw new RuntimeException();
        }
    }
}
