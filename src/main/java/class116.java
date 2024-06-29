import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class116 extends class276 {

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    private int field2071;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public int field2060;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "I")
    private int field2055;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    private int field2061;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Lpu;")
    public static class411 field2068 = new class411();

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILec;II)V")
    public static final void method927(int arg0, class68 arg1, int arg2, int arg3) {
        field2070++;
        int var4 = 127 % ((arg0 - 15) / 56);
        class448 var5 = arg1.method449(true, class305.field4873);
        if (var5 == null) {
            return;
        }
        class305.field4873.method829(arg3, arg2, arg1.field1009 + arg3, arg1.field1081 + arg2);
        if (class333.field5246 < 3) {
            class31.field489.method1032((float) arg1.field1009 / 2.0F + (float) arg3, (float) arg1.field1081 / 2.0F + (float) arg2, 4096, ((int) (-class88.field1483) & 0x3FFF) << 2, var5, arg3, arg2);
        } else {
            class305.field4873.method825(-16777216, var5, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([IZII)V")
    public final void method928(int[] arg0, boolean arg1, int arg2, int arg3) {
        arg0[1] = arg3 - (this.field2064 - this.field2069);
        arg0[2] = this.field2060 + arg2 - this.field2057;
        field2066++;
        if (!arg1) {
            this.method928(null, true, -62, 37);
        }
        arg0[0] = 0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)I")
    public static final int method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        field2063++;
        if (arg0 > -66) {
            method930(-93);
        }
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg5;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg3;
        } else {
            return -arg6 - (-(7 - arg5) - 1);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method930(int arg0) {
        field2068 = null;
        if (arg0 != -381) {
            method929(27, -125, 16, 20, 101, -57, 51);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([IIBI)V")
    public final void method931(int[] arg0, int arg1, byte arg2, int arg3) {
        arg0[2] = this.field2057 + arg1 - this.field2060;
        arg0[0] = this.field2061;
        int var5 = 0 / ((-arg2 - 83) / 38);
        arg0[1] = arg3 + this.field2064 - this.field2069;
        field2065++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BII)Z")
    public final boolean method932(byte arg0, int arg1, int arg2) {
        field2067++;
        if (arg0 != 95) {
            this.field2057 = 58;
        }
        return this.field2064 <= arg2 && arg2 <= this.field2071 && this.field2057 <= arg1 && arg1 <= this.field2055;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
    public final boolean method933(int arg0, int arg1, int arg2) {
        if (arg1 >= -95) {
            this.method928(null, false, -45, 85);
        }
        field2062++;
        return arg0 >= this.field2069 && this.field2056 >= arg0 && this.field2060 <= arg2 && arg2 <= this.field2058;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIII)Z")
    public final boolean method934(int arg0, int arg1, int arg2, int arg3) {
        field2059++;
        if (arg0 > -54) {
            return false;
        } else {
            return this.field2061 == arg3 && arg1 >= this.field2064 && arg1 <= this.field2071 && arg2 >= this.field2057 && arg2 <= this.field2055;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2064 = arg1;
        this.field2071 = arg3;
        this.field2058 = arg8;
        this.field2060 = arg6;
        this.field2057 = arg2;
        this.field2055 = arg4;
        this.field2069 = arg5;
        this.field2056 = arg7;
        this.field2061 = arg0;
    }
}
