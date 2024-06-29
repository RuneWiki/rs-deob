import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class254 extends class320 {

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    private int field4080;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    private int field4096;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    private int field4086;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    private int field4087;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    private int field4094;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lnb;")
    public static class341 field4089 = new class341(128);

    @OriginalMember(owner = "client!ol", name = "J", descriptor = "I")
    public static int field4101 = -1;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Lcg;")
    public static class49 field4099;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lmi;", line = 6)
    public static final class295 method1766(int arg0, int arg1) {
        field4095++;
        int var2 = -12 % ((-arg1 - 29) / 61);
        class295 var3 = (class295) class160.field2823.method467(true, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class228.field3825.method441(false, 16, arg0);
        class295 var5 = new class295();
        if (var4 != null) {
            var5.method2014(new class336(var4), (byte) 103);
        }
        class160.field2823.method465(var5, (long) arg0, (byte) 47);
        return var5;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Loa;", line = 33)
    public static final class313 method1767(byte arg0, int arg1) {
        field4100++;
        if (arg0 != -93) {
            field4089 = (class341) null;
        }
        if (arg1 == 0) {
            return new class328();
        } else if (arg1 == 1) {
            return new class265();
        } else if (arg1 == 2) {
            return new class170();
        } else if (arg1 == 3) {
            return new class214();
        } else if (arg1 == 4) {
            return new class189();
        } else if (arg1 == 5) {
            return new class259();
        } else if (arg1 == 6) {
            return new class52();
        } else if (arg1 == 7) {
            return new class248();
        } else if (arg1 == 8) {
            return new class233();
        } else if (arg1 == 9) {
            return new class124();
        } else if (arg1 == 10) {
            return new class298();
        } else if (arg1 == 11) {
            return new class143();
        } else if (arg1 == 12) {
            return new class130();
        } else if (arg1 == 13) {
            return new class188();
        } else if (arg1 == 14) {
            return new class253();
        } else if (arg1 == 15) {
            return new class60();
        } else if (arg1 == 16) {
            return new class280();
        } else if (arg1 == 17) {
            return new class140();
        } else if (arg1 == 18) {
            return new class161();
        } else if (arg1 == 19) {
            return new class172();
        } else if (arg1 == 20) {
            return new class105();
        } else if (arg1 == 21) {
            return new class129();
        } else if (arg1 == 22) {
            return new class135();
        } else if (arg1 == 23) {
            return new class122();
        } else if (arg1 == 24) {
            return new class11();
        } else if (arg1 == 25) {
            return new class33();
        } else if (arg1 == 26) {
            return new class131();
        } else if (arg1 == 27) {
            return new class242();
        } else if (arg1 == 28) {
            return new class126();
        } else if (arg1 == 29) {
            return new class276();
        } else if (arg1 == 30) {
            return new class224();
        } else if (arg1 == 31) {
            return new class193();
        } else if (arg1 == 32) {
            return new class141();
        } else if (arg1 == 33) {
            return new class40();
        } else if (arg1 == 34) {
            return new class284();
        } else if (arg1 == 35) {
            return new class264();
        } else if (arg1 == 36) {
            return new class246();
        } else if (arg1 == 37) {
            return new class120();
        } else if (arg1 == 38) {
            return new class18();
        } else if (arg1 == 39) {
            return new class93();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 351)
    public static final String method1768(int arg0, String arg1) {
        field4078++;
        String var2 = class8.method48(class142.method1151(arg1, -59), true);
        if (var2 == null) {
            var2 = "";
        }
        if (arg0 != -2191) {
            field4089 = (class341) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 368)
    public static final void method1769(int arg0, String arg1, byte arg2) {
        field4088++;
        class30 var3 = class99.method857((byte) -75, arg0, 3);
        var3.method277(true);
        var3.field436 = arg1;
        if (arg2 > -37) {
            field4089 = (class341) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)[I", line = 384)
    public final int[] method1770(int arg0, int arg1, int arg2) {
        field4079++;
        return arg1 == 27 ? new int[] { this.field4096, this.field4085 + arg0 - this.field4091, -this.field4087 + arg2 + this.field4083 } : (int[]) null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)[I", line = 400)
    public final int[] method1771(int arg0, int arg1, int arg2) {
        if (arg1 < 19) {
            method1775(-37);
        }
        field4090++;
        return new int[] { this.field4080, arg2 - (this.field4085 - this.field4091), this.field4087 + arg0 - this.field4083 };
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IBI)Z", line = 411)
    public final boolean method1772(int arg0, byte arg1, int arg2) {
        field4081++;
        if (arg1 != 97) {
            method1767((byte) -1, -92);
        }
        return arg0 >= this.field4091 && arg0 <= this.field4086 && this.field4087 <= arg2 && arg2 <= this.field4094;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IBI)Z", line = 432)
    public final boolean method1773(int arg0, byte arg1, int arg2) {
        field4092++;
        int var4 = -95 / ((-arg1 - 67) / 55);
        return this.field4085 <= arg0 && this.field4082 >= arg0 && this.field4083 <= arg2 && arg2 <= this.field4084;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 449)
    public class254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4083 = arg7;
        this.field4091 = arg2;
        this.field4080 = arg0;
        this.field4096 = arg1;
        this.field4084 = arg9;
        this.field4086 = arg4;
        this.field4087 = arg3;
        this.field4085 = arg6;
        this.field4094 = arg5;
        this.field4082 = arg8;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(IIII)Z", line = 468)
    public final boolean method1774(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 9) {
            field4098++;
            return this.field4080 == arg3 && this.field4091 <= arg2 && arg2 <= this.field4086 && this.field4087 <= arg1 && arg1 <= this.field4094;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 486)
    public static void method1775(int arg0) {
        if (arg0 == -6011) {
            field4099 = null;
            field4089 = null;
        }
    }
}
