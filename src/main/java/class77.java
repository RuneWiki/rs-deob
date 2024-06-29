import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class77 extends class446 {

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[S")
    public static short[] field1549 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[I")
    public static int[] field1559 = new int[2];

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Los;")
    public static class309 field1552 = new class309("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
    public static int[] field1551;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1555;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 3)
    public static final void method687(byte arg0) {
        class459.method2765(class145.field2438, (byte) 87);
        if (arg0 != 41) {
            field1555 = null;
        }
        ++class144.field2431;
        ++field1548;
        class335.field5062.method1814(0, true);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lda;)V", line = 17)
    public class77(class44 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 25)
    public final void method688(int arg0) {
        super.field6642.method281(-91, false);
        ++field1554;
        if (arg0 < 5) {
            method687((byte) 121);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V", line = 37)
    public final void method689(int arg0, int arg1, int arg2) {
        ++field1550;
        if (arg0 != -1) {
            this.method691((byte) 32);
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V", line = 51)
    public static final void method690(byte arg0) {
        ++field1558;
        if (!class285.field4285) {
            if (arg0 > -104) {
                field1551 = null;
            }
            if (class186.field2990.field2527) {
                class113.field2041 = (float) ((int) class113.field2041 - -47 & -16);
            } else {
                class301.field4539 += (12.0F - class301.field4539) / 2.0F;
            }
            class285.field4285 = true;
            class23.field339 = true;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)Z", line = 76)
    public final boolean method691(byte arg0) {
        ++field1553;
        if (arg0 != -93) {
            method693((class427) null, 76, -17, 99, -122);
        }
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V", line = 91)
    public static void method692(byte arg0) {
        if (arg0 < 70) {
            field1552 = null;
        }
        field1555 = null;
        field1551 = null;
        field1549 = null;
        field1552 = null;
        field1559 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lke;IIII)V", line = 105)
    public static final void method693(class427 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class368.method2258(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class493.field7231) {
            class368.method2258(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class368.method2258(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class220.field3464) {
            class368.method2258(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class220.field3464) {
            class368.method2258(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class493.field7231 && arg4 <= class220.field3464) {
            class368.method2258(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class368.method2258(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class493.field7231 && arg4 > 0) {
            class368.method2258(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILac;)V", line = 159)
    public final void method694(int arg0, int arg1, class381 arg2) {
        super.field6642.method381((byte) 28, arg2);
        if (arg1 != 0) {
            method692((byte) 15);
        }
        ++field1556;
        super.field6642.method288((byte) 105, arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BZ)V", line = 172)
    public final void method695(byte arg0, boolean arg1) {
        ++field1557;
        if (arg0 != -33) {
            this.method694(125, 114, (class381) null);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZB)V", line = 182)
    public final void method696(boolean arg0, byte arg1) {
        if (arg1 != 42) {
            field1552 = null;
        }
        super.field6642.method281(-105, true);
        ++field1547;
    }
}
