import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class346 {

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public int field5380 = 16777215;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public int field5385 = 8;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field5387 = -1;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field5372;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field5373;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public int field5374;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public int field5384;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lfh;")
    public static class140 field5381;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Z")
    public boolean field5376;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILfh;I)Lma;", line = 6)
    public static final class145 method2397(int arg0, class140 arg1, int arg2) {
        field5375++;
        if (arg0 != 26494) {
            method2401(0, 127);
        }
        return class362.method2524(arg1, -5, arg2) ? class62.method457(arg0 ^ 0x677E) : null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 20)
    public static final void method2398(byte arg0) {
        class255.method1781(0, 0, -96);
        field5378++;
        int var1 = -9 % ((66 - arg0) / 58);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V", line = 30)
    public static void method2399(byte arg0) {
        field5381 = null;
        if (arg0 != 56) {
            field5387 = 102;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lvl;", line = 42)
    public static final class66 method2400(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class66 var4 = var3.field1566;
            var3.field1566 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I", line = 54)
    public static final int method2401(int arg0, int arg1) {
        if (arg1 == 1841970955) {
            field5383++;
            return arg0 >> 11 & 0x7F;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILfd;I)V", line = 65)
    private final void method2402(int arg0, int arg1, class299 arg2, int arg3) {
        if (arg0 != -3) {
            method2397(16, (class140) null, 112);
        }
        if (arg3 == 1) {
            this.field5385 = arg2.method2083((byte) -73);
        } else if (arg3 == 2) {
            this.field5376 = true;
        } else if (arg3 == 3) {
            this.field5372 = arg2.method2043(true);
            this.field5373 = arg2.method2043(true);
            this.field5377 = arg2.method2043(true);
        } else if (arg3 == 4) {
            this.field5384 = arg2.method2096((byte) -122);
        } else if (arg3 == 5) {
            this.field5374 = arg2.method2083((byte) -61);
        } else if (arg3 == 6) {
            this.field5380 = arg2.method2085((byte) 121);
        }
        field5382++;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLfh;)V", line = 116)
    public static final void method2403(byte arg0, class140 arg1) {
        field5386++;
        class83.field1065 = arg1;
        if (arg0 != -46) {
            method2400(75, -8, -127);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)V", line = 130)
    public static final void method2404(int arg0, byte arg1) {
        field5379++;
        if (class317.field4680 == null || class317.field4680.length < arg0) {
            class317.field4680 = new int[arg0];
        }
        if (arg1 != -14) {
            method2398((byte) 57);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BILfd;)V", line = 149)
    public final void method2405(byte arg0, int arg1, class299 arg2) {
        field5371++;
        while (true) {
            int var4 = arg2.method2096((byte) -122);
            if (var4 == 0) {
                if (arg0 != 85) {
                    method2398((byte) 103);
                }
                return;
            }
            this.method2402(arg0 - 88, arg1, arg2, var4);
        }
    }
}
