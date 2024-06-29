import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class665 extends class372 implements class508 {

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
    public static int field9408 = -50;

    @OriginalMember(owner = "client!jga", name = "A", descriptor = "[I")
    public static int[] field9413 = new int[4096];

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "Lgfa;")
    public static class696 field9414 = new class696(0, 2, 2, 1);

    @OriginalMember(owner = "client!jga", name = "I", descriptor = "[I")
    public static int[] field9421 = new int[1];

    @OriginalMember(owner = "client!jga", name = "G", descriptor = "B")
    private byte field9419;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "I")
    public static int field9409;

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "I")
    public static int field9411;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!jga", name = "C", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!jga", name = "D", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!jga", name = "E", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!jga", name = "F", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!jga", name = "H", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!jga", name = "J", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V", line = 3)
    public final void method11(byte arg0) {
        int var2 = 29 / ((-86 - arg0) / 37);
        ++field9410;
        super.method11((byte) -127);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method740(int arg0) {
        if (arg0 <= 82) {
            field9414 = null;
        }
        ++field9415;
        return super.method2172(super.field5016.field4659, 66);
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Ldda;Z)V", line = 27)
    public class665(class349 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(II)I", line = 31)
    public static final int method3755(int arg0, int arg1) {
        ++field9416;
        if (arg0 != 1) {
            field9422 = 79;
        }
        if (arg1 == 6406) {
            return 1;
        } else if (~arg1 != -6410) {
            if (~arg1 == -32842) {
                return 1;
            } else if (arg1 != 6410) {
                if (~arg1 == -6408) {
                    return 3;
                } else if (~arg1 == -6409) {
                    return 4;
                } else {
                    throw new IllegalArgumentException("");
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)V", line = 71)
    public static void method3756(int arg0) {
        field9414 = null;
        field9413 = null;
        field9421 = null;
        if (arg0 != 2) {
            field9420 = -114;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 85)
    public final boolean method739(int arg0, int arg1, int arg2, Source arg3) {
        ++field9417;
        this.field9419 = (byte) arg2;
        super.method2167(arg0, -10020, arg3);
        if (arg1 != -16501) {
            field9408 = 2;
        }
        return true;
    }

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "(B)I", line = 101)
    public final int method3757(byte arg0) {
        if (arg0 != -86) {
            method3755(-90, 1);
        }
        ++field9418;
        return this.field9419;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 112)
    public final Buffer method741(boolean arg0, boolean arg1) {
        if (arg1) {
            field9414 = null;
        }
        ++field9411;
        return super.method2170(-28650, super.field5016.field4659, arg0);
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIZ)Z", line = 131)
    public final boolean method742(int arg0, int arg1, boolean arg2) {
        ++field9412;
        if (!arg2) {
            return false;
        } else {
            this.field9419 = (byte) arg0;
            super.method13(arg1, -6482);
            return true;
        }
    }

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)I", line = 150)
    public final int method16(int arg0) {
        if (arg0 != 34962) {
            field9408 = 94;
        }
        ++field9409;
        return super.method16(34962);
    }
}
