import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class326 implements class409 {

    @OriginalMember(owner = "client!qfa", name = "s", descriptor = "Lcga;")
    public class141 field4436;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!qfa", name = "w", descriptor = "Ljava/lang/String;")
    public String field4440;

    @OriginalMember(owner = "client!qfa", name = "q", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!qfa", name = "v", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "Leda;")
    public class14 field4419;

    @OriginalMember(owner = "client!qfa", name = "r", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!qfa", name = "u", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "[S")
    private static short[] field4425 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "[S")
    private static short[] field4433 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "[S")
    private static short[] field4426 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "Z")
    public static boolean field4428 = false;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "[[S")
    public static short[][] field4429 = new short[][] { field4425, field4433, field4426 };

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field4421 = 0;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "Lqp;")
    public static class715 field4420 = new class715(16);

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!qfa", name = "t", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V", line = 20)
    public static void method2014(int arg0) {
        field4425 = null;
        field4420 = null;
        field4426 = null;
        int var1 = 42 % ((arg0 + 29) / 35);
        field4433 = null;
        field4429 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Lhr;", line = 34)
    public final class57 method478(int arg0) {
        if (arg0 < 30) {
            return null;
        } else {
            field4424++;
            return class438.field6249;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)B", line = 52)
    public static final byte method2015(int arg0, int arg1, int arg2) {
        field4430++;
        if (arg0 != 9) {
            return 0;
        } else if (arg1 == 4620) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)I", line = 74)
    public static final int method2016(boolean arg0, byte arg1) {
        field4437++;
        if (arg1 != -24) {
            method2016(true, (byte) 44);
        }
        int var2 = class270.field3833;
        if (var2 == 0) {
            return arg0 ? 0 : class677.field9619;
        } else if (var2 == 1) {
            return class677.field9619;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/lang/String;Leda;Lcga;IIIIIIIIII)V", line = 136)
    public class326(String arg0, class14 arg1, class141 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field4436 = arg2;
        this.field4422 = arg7;
        this.field4418 = arg8;
        this.field4440 = arg0;
        this.field4434 = arg3;
        this.field4432 = arg12;
        this.field4439 = arg5;
        this.field4431 = arg9;
        this.field4423 = arg10;
        this.field4419 = arg1;
        this.field4435 = arg4;
        this.field4438 = arg11;
        this.field4427 = arg6;
    }
}
