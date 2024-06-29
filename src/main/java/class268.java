import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class268 {

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field3381;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lrba;")
    public class435 field3368;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "B")
    public byte field3372;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Lct;")
    public class148 field3380;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lrm;")
    public class413 field3375;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lgs;")
    public class45 field3379;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "Lgp;")
    public class49 field3383;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lnd;")
    public static class547 field3369;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Z")
    public static boolean field3376;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 6)
    public static void method1594(byte arg0) {
        field3369 = null;
        int var1 = -32 % ((62 - arg0) / 59);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 20)
    public static final String method1595(byte arg0, int arg1) {
        field3377++;
        int var2 = 96 / ((-arg0 - 63) / 47);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF073A) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)I", line = 34)
    public static final int method1596(int arg0) {
        field3370++;
        return arg0 == 6560 ? class146.field2043 : 26;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method1597(int arg0) {
        if (arg0 > -74) {
            this.method1597(-66);
        }
        field3371++;
        return this.field3372 == 2 || this.field3372 == 3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z", line = 67)
    public static final boolean method1598(int arg0, int arg1, int arg2) {
        field3382++;
        if (arg0 == -1107182968) {
            return class184.method1245(arg1, 0, arg2) || class151.method1066((byte) -113, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(BIIIIIILrba;)V", line = 77)
    public class268(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class435 arg7) {
        this.field3374 = arg1;
        this.field3367 = arg2;
        this.field3384 = arg4;
        this.field3381 = arg3;
        this.field3373 = arg5;
        this.field3368 = arg7;
        this.field3378 = arg6;
        this.field3372 = arg0;
    }
}
