import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class346 extends class4 {

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "[B")
    public static byte[] field4924 = new byte[2048];

    @OriginalMember(owner = "client!daa", name = "r", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!daa", name = "s", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "Ljava/lang/String;")
    public String field4923;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I", line = 4)
    public final int method2207(byte arg0) {
        if (arg0 != -62) {
            this.method2207((byte) -98);
        }
        ++field4917;
        return (int) super.field1079;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 15)
    public final void method2208(int arg0) {
        if (arg0 != -1719) {
            this.field4916 = 55;
        }
        ++field4918;
        super.field40 = 500L + class97.method664((byte) -50) | super.field40 & Long.MIN_VALUE;
        class284.field4101.method3827(-111, this);
    }

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "(I)V", line = 29)
    public final void method2209(int arg0) {
        ++field4925;
        super.field40 |= Long.MIN_VALUE;
        if (arg0 != 255) {
            this.field4923 = null;
        }
        if (~this.method2213((byte) 124) == -1L) {
            class747.field10285.method3827(arg0 + -128, this);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)Z", line = 44)
    public static final boolean method2210(int arg0, int arg1, int arg2) {
        ++field4915;
        if (arg1 != -28914) {
            field4924 = null;
        }
        return class523.method3112(arg2, arg1 + 28913, arg0) || class489.method2970(true, arg0, arg2);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZII)I", line = 62)
    public static final int method2211(int arg0, boolean arg1, int arg2, int arg3) {
        ++field4920;
        class169 var4 = class170.method1090(arg1, (byte) -94, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg3; var6 < var4.field2355.length; ++var6) {
                if (~var4.field2352[var6] == ~arg0) {
                    var5 += var4.field2355[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)I", line = 98)
    public final int method2212(byte arg0) {
        if (arg0 != -78) {
            return -30;
        } else {
            ++field4914;
            return (int) (255L & super.field1079 >>> 32);
        }
    }

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)J", line = 109)
    public final long method2213(byte arg0) {
        ++field4921;
        if (arg0 < 114) {
            this.field4923 = null;
        }
        return Long.MAX_VALUE & super.field40;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)Z", line = 120)
    public static final boolean method2214(int arg0, int arg1) {
        ++field4922;
        if (arg1 != 11703) {
            field4924 = null;
        }
        return arg0 == 3 || arg0 == 4 || ~arg0 == -6 || ~arg0 == -7;
    }

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "(I)V", line = 132)
    public static void method2215(int arg0) {
        if (arg0 == 255) {
            field4924 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(II)V", line = 148)
    public class346(int arg0, int arg1) {
        super.field1079 = (long) arg1 | (long) arg0 << 32;
    }
}
