import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class31 extends class228 {

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "Ljava/lang/String;")
    public static String field407 = null;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "Lh;")
    public static class434 field410 = new class434(89, 6);

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "Lh;")
    public static class434 field420 = new class434(33, 15);

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field424 = new String[100];

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "Z")
    public static volatile boolean field423 = true;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "J")
    public static long field426;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "Ljd;")
    public static class139 field419;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIZLnk;)V", line = 3)
    public static final void method177(int arg0, int arg1, int arg2, boolean arg3, class464 arg4) {
        ++field412;
        int var5 = arg4.field6308;
        int var6 = arg4.field6340;
        if (~arg4.field6434 == -1) {
            arg4.field6308 = arg4.field6392;
        } else if (~arg4.field6434 == -2) {
            arg4.field6308 = arg1 - arg4.field6392;
        } else if (arg4.field6434 == 2) {
            arg4.field6308 = arg4.field6392 * arg1 >> 14;
        }
        if (~arg4.field6341 != -1) {
            if (~arg4.field6341 == -2) {
                arg4.field6340 = -arg4.field6381 + arg0;
            } else if (arg4.field6341 == 2) {
                arg4.field6340 = arg4.field6381 * arg0 >> 14;
            }
        } else {
            arg4.field6340 = arg4.field6381;
        }
        if (arg4.field6434 == 4) {
            arg4.field6308 = arg4.field6340 * arg4.field6300 / arg4.field6386;
        }
        if (~arg4.field6341 == -5) {
            arg4.field6340 = arg4.field6386 * arg4.field6308 / arg4.field6300;
        }
        if (arg2 == 12908) {
            if (class200.field2704 && (~client.method1046(arg4).field2954 != -1 || arg4.field6358 == 0)) {
                if (arg4.field6340 < 5 && ~arg4.field6308 > -6) {
                    arg4.field6340 = 5;
                    arg4.field6308 = 5;
                } else {
                    if (arg4.field6308 <= 0) {
                        arg4.field6308 = 5;
                    }
                    if (arg4.field6340 <= 0) {
                        arg4.field6340 = 5;
                    }
                }
            }
            if (~class317.field4182 == ~arg4.field6359) {
                class42.field601 = arg4;
            }
            if (arg3 && arg4.field6295 != null) {
                if (arg4.field6308 != var5 || arg4.field6340 != var6) {
                    class82 var7 = new class82();
                    var7.field1086 = arg4;
                    var7.field1085 = arg4.field6295;
                    class245.field3272.method641(var7, (byte) -93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(III)V", line = 80)
    public final void method178(int arg0, int arg1, int arg2) {
        ++field414;
        if (arg0 <= 119) {
            this.method178(42, -75, -32);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(JILwm;)V", line = 90)
    public static final void method179(long arg0, int arg1, class364 arg2) {
        class409.field5605 = 0;
        ++field418;
        class119.field1744 = class169.field2335;
        class169.field2335 = arg1;
        long var4 = class440.method2583(arg1 + 25267);
        for (class256 var6 = (class256) class125.field1822.method2764((byte) -110); var6 != null; var6 = (class256) class125.field1822.method2769(true)) {
            if (var6.method1435(arg2, arg0)) {
                ++class409.field5605;
            }
        }
        if (class19.field266 && ~(arg0 % 100L) == -1L) {
            System.out.println("Particle system count: " + class125.field1822.method2768((byte) -98) + ", running: " + class409.field5605 + ". Particles: " + class169.field2335 + ". Time taken: " + (class440.method2583(25267) + -var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V", line = 124)
    public final void method180(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method180(75, 63, -40);
        }
        ++field421;
        int var4 = this.field408 * arg2 >> 12;
        int var5 = this.field416 * arg1 >> 12;
        int var6 = this.field406 * arg2 >> 12;
        int var7 = this.field413 * arg1 >> 12;
        int var8 = this.field409 * arg2 >> 12;
        int var9 = this.field427 * arg1 >> 12;
        int var10 = this.field425 * arg2 >> 12;
        int var11 = this.field415 * arg1 >> 12;
        class473.method2775(var7, var5, 6693, super.field2999, var6, var9, var4, var8, var10, var11);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V", line = 151)
    public final void method181(int arg0, byte arg1, int arg2) {
        ++field411;
        if (arg1 != -103) {
            this.field427 = -48;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([BI)[B", line = 165)
    public static final byte[] method182(byte[] arg0, int arg1) {
        ++field417;
        int var2 = arg0.length;
        int var3 = 94 / ((-71 - arg1) / 36);
        byte[] var4 = new byte[var2];
        class380.method2334(arg0, 0, var4, 0, var2);
        return var4;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 186)
    public class31(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field427 = arg5;
        this.field408 = arg0;
        this.field425 = arg6;
        this.field409 = arg4;
        this.field416 = arg1;
        this.field415 = arg7;
        this.field413 = arg3;
        this.field406 = arg2;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V", line = 213)
    public static void method183(boolean arg0) {
        field410 = null;
        field407 = null;
        field424 = null;
        if (!arg0) {
            field419 = null;
            field420 = null;
        }
    }
}
