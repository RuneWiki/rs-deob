import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class242 extends class115 {

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    private int field3368;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
    private int field3378;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    private int field3359;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    private int field3363;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Z")
    public static volatile boolean field3362 = false;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "[I")
    public static int[] field3374 = new int[14];

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Lkq;")
    public static class78 field3371 = new class78("WTRC", 1);

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1472(boolean arg0) {
        field3374 = null;
        field3371 = null;
        if (arg0) {
            field3371 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIB)Z", line = 16)
    public final boolean method1473(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 102) {
            field3374 = null;
        }
        field3369++;
        return this.field3378 == arg0 && this.field3363 <= arg1 && arg1 <= this.field3375 && arg2 >= this.field3359 && this.field3368 >= arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method1474(int arg0, int arg1, int arg2) {
        field3370++;
        if (!class326.method2027(arg0, arg2, 0)) {
            return false;
        } else if (class487.method2910(arg0, arg2, 35) | (arg0 & 0xB000) != 0 | class173.method1188(-65, arg2, arg0)) {
            return true;
        } else {
            int var3 = 93 / ((arg1 - 49) / 46);
            return (class191.method1275(arg0, -545, arg2) | class152.method1095(arg0, arg2, (byte) 56)) & (arg2 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[III)V", line = 54)
    public final void method1475(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[2] = this.field3366 + arg2 - this.field3359;
        field3367++;
        arg1[arg0] = arg3 + this.field3364 - this.field3363;
        arg1[0] = 0;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I[III)V", line = 70)
    public final void method1476(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 == 22656) {
            arg1[1] = this.field3363 + arg0 - this.field3364;
            field3372++;
            arg1[2] = this.field3359 - (this.field3366 - arg3);
            arg1[0] = this.field3378;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)Z", line = 85)
    public final boolean method1477(int arg0, int arg1, byte arg2) {
        field3361++;
        if (arg2 >= -113) {
            this.field3368 = 11;
        }
        return this.field3363 <= arg0 && arg0 <= this.field3375 && arg1 >= this.field3359 && arg1 <= this.field3368;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(III)Z", line = 100)
    public final boolean method1478(int arg0, int arg1, int arg2) {
        if (arg2 < 106) {
            return true;
        } else {
            field3360++;
            return this.field3364 <= arg1 && arg1 <= this.field3373 && arg0 >= this.field3366 && this.field3377 >= arg0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)[Lgn;", line = 119)
    public static final class526[] method1479(byte arg0) {
        if (arg0 > -80) {
            return null;
        } else {
            field3376++;
            return new class526[] { class33.field459, class36.field498, class56.field772, class311.field4824, class497.field7379, class117.field1759, class231.field3249, class375.field5663, class187.field2753, class10.field93, class526.field7775, class133.field1987, class111.field1693, class260.field3886, class464.field6748 };
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIIIII)V", line = 139)
    public class242(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3366 = arg6;
        this.field3377 = arg8;
        this.field3368 = arg4;
        this.field3378 = arg0;
        this.field3364 = arg5;
        this.field3359 = arg2;
        this.field3375 = arg3;
        this.field3363 = arg1;
        this.field3373 = arg7;
    }
}
