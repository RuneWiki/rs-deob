import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class230 {

    @OriginalMember(owner = "client!cha", name = "m", descriptor = "I")
    public int field3136 = 0;

    @OriginalMember(owner = "client!cha", name = "k", descriptor = "Z")
    private boolean field3134 = false;

    @OriginalMember(owner = "client!cha", name = "t", descriptor = "I")
    public int field3143 = 0;

    @OriginalMember(owner = "client!cha", name = "w", descriptor = "Ljw;")
    public static class581 field3146 = new class581(52, 3);

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!cha", name = "f", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!cha", name = "g", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!cha", name = "h", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!cha", name = "i", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!cha", name = "j", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!cha", name = "p", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!cha", name = "q", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!cha", name = "r", descriptor = "I")
    private int field3141;

    @OriginalMember(owner = "client!cha", name = "s", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!cha", name = "u", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!cha", name = "v", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!cha", name = "x", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "J")
    public long field3127;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V", line = 4)
    public final void method1503(int arg0) {
        this.field3130 = class749.field10316[this.field3141 << 3];
        if (arg0 != 1) {
            return;
        }
        field3138++;
        long var2 = (long) this.field3137;
        long var4 = (long) this.field3126;
        long var6 = (long) this.field3125;
        this.field3132 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
        if (this.field3131 == 0) {
            this.field3131 = 1;
        }
        if (this.field3129 == 0) {
            this.field3127 = 2147483647L;
        } else if (this.field3129 == 1) {
            this.field3127 = (this.field3132 * 8 / this.field3131);
            this.field3127 *= this.field3127;
        } else if (this.field3129 == 2) {
            this.field3127 = (this.field3132 * 8 / this.field3131);
        }
        if (this.field3134) {
            this.field3132 *= -1;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BII)Z", line = 49)
    public static final boolean method1504(byte arg0, int arg1, int arg2) {
        field3124++;
        if (arg0 != -58) {
            field3142 = -8;
        }
        return (arg1 & 0x70000) != 0 | class530.method3044(arg2, (byte) 113, arg1) || class543.method3090(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILjp;I)V", line = 62)
    private final void method1505(int arg0, class376 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3141 = arg1.method2359(-1);
        } else if (arg0 == 2) {
            arg1.method2398(-1372747256);
        } else if (arg0 == 3) {
            this.field3137 = arg1.method2384(110);
            this.field3126 = arg1.method2384(arg2 + 45);
            this.field3125 = arg1.method2384(115);
        } else if (arg0 == 4) {
            this.field3129 = arg1.method2398(-1372747256);
            this.field3131 = arg1.method2384(46);
        } else if (arg0 == 6) {
            this.field3140 = arg1.method2398(-1372747256);
        } else if (arg0 == 8) {
            this.field3136 = 1;
        } else if (arg0 == 9) {
            this.field3143 = 1;
        } else if (arg0 == 10) {
            this.field3134 = true;
        }
        field3145++;
        if (arg2 != 8) {
            this.method1503(34);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Z)V", line = 119)
    public static void method1506(boolean arg0) {
        if (arg0) {
            method1508((byte) 82);
        }
        field3146 = null;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(Ljp;I)V", line = 132)
    public static final void method1507(class376 arg0, int arg1) {
        field3144++;
        if (arg1 != 65535) {
            method1506(false);
        }
        for (int var2 = 0; var2 < class450.field6278; var2++) {
            int var3 = arg0.method2370(-2);
            int var4 = arg0.method2359(-1);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class124.field1825[var3] != null) {
                class124.field1825[var3].field10842 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(B)V", line = 162)
    public static final void method1508(byte arg0) {
        field3139++;
        if (class558.field7520 != null) {
            class558.field7520.method1262((byte) -115);
        }
        if (arg0 <= -33 && class268.field3953 != null) {
            class268.field3953.method1262((byte) 66);
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BLjp;)V", line = 182)
    public final void method1509(byte arg0, class376 arg1) {
        if (arg0 != 21) {
            method1508((byte) 101);
        }
        field3133++;
        while (true) {
            int var3 = arg1.method2398(-1372747256);
            if (var3 == 0) {
                return;
            }
            this.method1505(var3, arg1, 8);
        }
    }
}
