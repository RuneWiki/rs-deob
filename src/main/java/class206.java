import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class206 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public int field3058 = 128;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public int field3059 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public int field3056 = 16;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field3064 = -1;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public int field3065 = 8;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Z")
    public boolean field3061 = true;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field3069 = -1;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field3071 = 1190717;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "Z")
    public boolean field3066 = false;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public int field3076 = -1;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field3057 = 127;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "Z")
    public boolean field3074 = true;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[I")
    public static int[] field3068 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "[S")
    public static short[] field3067 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "Lul;")
    public class388 field3073;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[[I")
    public static int[][] field3077;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
    public static final boolean method1342(int arg0, int arg1, int arg2) {
        if (arg0 != 14042) {
            method1345(false);
        }
        field3072++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLps;)V")
    public final void method1343(byte arg0, class428 arg1) {
        while (true) {
            int var3 = arg1.method2561((byte) 116);
            if (var3 == 0) {
                if (arg0 > -105) {
                    this.field3056 = -2;
                }
                field3063++;
                return;
            }
            this.method1344(var3, arg1, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILps;B)V")
    private final void method1344(int arg0, class428 arg1, byte arg2) {
        field3062++;
        if (arg0 == 1) {
            this.field3059 = class180.method1203(arg1.method2601(84), -113);
        } else if (arg0 == 2) {
            this.field3076 = arg1.method2561((byte) -53);
        } else if (arg0 == 3) {
            this.field3076 = arg1.method2620(45);
            if (this.field3076 == 65535) {
                this.field3076 = -1;
            }
        } else if (arg0 == 5) {
            this.field3074 = false;
        } else if (arg0 == 7) {
            this.field3069 = class180.method1203(arg1.method2601(87), -73);
        } else if (arg0 == 8) {
            this.field3073.field5673 = this.field3075;
        } else if (arg0 == 9) {
            this.field3058 = arg1.method2620(41) << 0;
        } else if (arg0 == 10) {
            this.field3061 = false;
        } else if (arg0 == 11) {
            this.field3065 = arg1.method2561((byte) -82);
        } else if (arg0 == 12) {
            this.field3066 = true;
        } else if (arg0 == 13) {
            this.field3071 = arg1.method2601(127);
        } else if (arg0 == 14) {
            this.field3056 = arg1.method2561((byte) -19) << 0;
        } else if (arg0 == 15) {
            this.field3064 = arg1.method2620(36);
            if (this.field3064 == 65535) {
                this.field3064 = -1;
            }
        } else if (arg0 == 16) {
            this.field3057 = arg1.method2561((byte) -119);
        }
        int var4 = 118 / ((arg2 + 35) / 53);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
    public static void method1345(boolean arg0) {
        field3067 = null;
        field3068 = null;
        field3077 = null;
        if (arg0) {
            method1342(101, 116, 124);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static final void method1346(int arg0) {
        field3060++;
        int var1 = 0;
        if (arg0 != 100) {
            field3068 = null;
        }
        while (var1 < 100) {
            class493.field7445[var1] = null;
            var1++;
        }
        class461.field6673 = 0;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method1347(int arg0) {
        this.field3065 = this.field3065 << 8 | this.field3075;
        if (this.field3064 == -1) {
            this.field3064 = this.field3076;
        }
        field3070++;
        if (arg0 != -2131048952) {
            method1345(false);
        }
    }
}
