import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class249 extends class578 {

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!up", name = "x", descriptor = "Loga;")
    public class438 field3393;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "Lem;")
    public static class206 field3397 = new class206(42, -2);

    @OriginalMember(owner = "client!up", name = "E", descriptor = "Llh;")
    public static class487 field3400 = new class487(49, 15);

    @OriginalMember(owner = "client!up", name = "z", descriptor = "F")
    public static float field3395;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!up", name = "C", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!up", name = "D", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!up", name = "F", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method1533(int arg0, int arg1, int arg2, int arg3) {
        field3398++;
        if (class409.field5812 == null) {
            return 0;
        }
        int var4 = arg2 >> 9;
        int var5 = arg1 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class401.field5620 - 1) || (class257.field3508 - 1) < var5) {
            return 0;
        }
        int var6 = 2 % ((-arg3 - 58) / 34);
        int var7 = arg0;
        if (arg0 < 3 && (class492.field6720[1][var4][var5] & 0x2) != 0) {
            var7 = arg0 + 1;
        }
        return class409.field5812[var7].method331(arg1, (byte) 50, arg2);
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V", line = 32)
    public static void method1534(int arg0) {
        field3400 = null;
        field3397 = null;
        if (arg0 != 1) {
            method1536(true, -36);
        }
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "(I)[Lfc;", line = 43)
    public static final class235[] method1535(int arg0) {
        int var1 = 123 / ((arg0 - 52) / 55);
        field3399++;
        return new class235[] { class164.field2358, class542.field7336, class564.field7618, class131.field1878, class547.field7412, class188.field2720 };
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZI)I", line = 55)
    public static final int method1536(boolean arg0, int arg1) {
        if (arg0) {
            field3401++;
            return arg1 >>> 8;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(B)[Lch;", line = 67)
    public static final class428[] method1537(byte arg0) {
        int var1 = 77 % ((11 - arg0) / 40);
        field3396++;
        return new class428[] { class283.field3860, class193.field2745, class557.field7499 };
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Loga;I)V", line = 90)
    public class249(class438 arg0, int arg1) {
        this.field3394 = arg1;
        this.field3393 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method472(byte arg0);

    @OriginalMember(owner = "client!up", name = "h", descriptor = "(I)Z")
    public abstract boolean method470(int arg0);
}
