import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class296 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field4916 = -1;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field4926 = 128;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Z")
    public boolean field4930 = true;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Z")
    public boolean field4932 = false;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public int field4923 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field4919 = 1190717;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public int field4928 = -1;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Z")
    public boolean field4935 = true;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public int field4937 = 8;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public int field4936 = 16;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lck;")
    public static class119 field4927 = class298.method1987((byte) 107, "Fps:");

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4920 = 0;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "[I")
    public static int[] field4931 = new int[4096];

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field4934 = 0;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field4938 = 0;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "Lck;")
    private static class119 field4939 = class298.method1987((byte) 42, " is already on your ignore list)3");

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lck;")
    public static class119 field4917 = field4939;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "F")
    public static float field4929;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILva;)Lra;", line = 10)
    public static final class43 method1972(int arg0, int arg1, int arg2, class36 arg3) {
        field4925++;
        if (arg0 != -65536) {
            field4920 = -83;
        }
        return class56.method414(arg1, arg3, false, arg2) ? class233.method1502(true) : null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lvj;", line = 25)
    public static final class247 method1973(int arg0, int arg1) {
        field4922++;
        if (arg0 != 503157193) {
            field4927 = (class119) null;
        }
        class247 var2 = (class247) class154.field2469.method487(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class104.field1615.method261(-1, 1, arg1);
        class247 var4 = new class247();
        if (var3 != null) {
            var4.method1606(new class3(var3), arg1, (byte) 57);
        }
        class154.field2469.method488(var4, (byte) 96, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z", line = 53)
    public static final boolean method1974(byte arg0, int arg1) {
        field4924++;
        if (arg0 != 93) {
            field4918 = 105;
        }
        return ((arg1 & 0x1DFD91C9) >> 28) != 0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 82)
    public static void method1975(int arg0) {
        field4917 = null;
        field4939 = null;
        field4931 = null;
        if (arg0 != 14) {
            field4934 = -58;
        }
        field4927 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILfj;I)V", line = 142)
    private final void method1976(boolean arg0, int arg1, class3 arg2, int arg3) {
        if (!arg0) {
            this.method1977(-106, (class3) null, -15);
        }
        field4933++;
        if (arg1 == 1) {
            this.field4923 = class216.method1357(arg2.method48(64), 79);
        } else if (arg1 == 2) {
            this.field4928 = arg2.method64((byte) -85);
        } else if (arg1 == 3) {
            this.field4928 = arg2.method63((byte) 1);
            if (this.field4928 == 65535) {
                this.field4928 = -1;
            }
        } else if (arg1 == 5) {
            this.field4935 = false;
        } else if (arg1 == 7) {
            this.field4916 = class216.method1357(arg2.method48(64), 55);
        } else if (arg1 == 8) {
            class283.field4684 = arg3;
        } else if (arg1 == 9) {
            this.field4926 = arg2.method63((byte) 1);
        } else if (arg1 == 10) {
            this.field4930 = false;
        } else if (arg1 == 11) {
            this.field4937 = arg2.method64((byte) -105);
        } else if (arg1 == 12) {
            this.field4932 = true;
        } else if (arg1 == 13) {
            this.field4919 = arg2.method48(64);
        } else if (arg1 == 14) {
            this.field4936 = arg2.method64((byte) -98);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILfj;I)V", line = 221)
    public final void method1977(int arg0, class3 arg1, int arg2) {
        if (arg2 != 16) {
            method1973(54, -19);
        }
        field4921++;
        while (true) {
            int var4 = arg1.method64((byte) -102);
            if (var4 == 0) {
                return;
            }
            this.method1976(true, var4, arg1, arg0);
        }
    }
}
