import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class28 extends class5 {

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "F")
    public float field414;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method249(int arg0, int arg1, int arg2) {
        field413++;
        if (arg2 >= -61) {
            method249(-73, 67, 84);
        }
        return (class178.field2382[1][arg0][arg1] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)I", line = 20)
    public final int method250(byte arg0) {
        if (arg0 < 28) {
            this.field414 = -0.3306527F;
        }
        field415++;
        return this.field402;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I", line = 31)
    public static int method251(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I", line = 38)
    public final int method252(int arg0) {
        field410++;
        if (arg0 < 53) {
            this.method255(111);
        }
        return this.field403;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)F", line = 51)
    public final float method253(boolean arg0) {
        if (arg0) {
            field407++;
            return this.field414;
        } else {
            return 1.0657163F;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)I", line = 62)
    public final int method254(boolean arg0) {
        field416++;
        return arg0 ? this.field411 : 54;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)I", line = 79)
    public final int method255(int arg0) {
        if (arg0 != -7164) {
            this.field406 = -4;
        }
        field412++;
        return this.field406;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I", line = 92)
    public final int method257(int arg0) {
        if (arg0 > -15) {
            this.field411 = -122;
        }
        field405++;
        return this.field401;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lji;", line = 109)
    public static final class441 method258(byte arg0) {
        if (arg0 <= 109) {
            field404 = -82;
        }
        field409++;
        return class12.field209;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIIIF)V", line = 123)
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field401 = arg0;
        this.field403 = arg3;
        this.field402 = arg1;
        this.field406 = arg2;
        this.field411 = arg4;
        this.field414 = arg5;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BF)V")
    public abstract void method256(byte arg0, float arg1);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
    public abstract void method259(int arg0, int arg1, int arg2, int arg3);
}
