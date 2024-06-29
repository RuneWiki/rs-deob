import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class376 extends class266 {

    @OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
    public int field4823 = -1;

    @OriginalMember(owner = "client!vba", name = "D", descriptor = "I")
    public int field4825 = -1;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field4814 = 0;

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public int field4816;

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
    public int field4821;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!vba", name = "B", descriptor = "I")
    public int field4824;

    @OriginalMember(owner = "client!vba", name = "E", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B[B)[B", line = 8)
    public static final byte[] method2152(byte arg0, byte[] arg1) {
        ++field4826;
        class418 var2 = new class418(arg1);
        if (arg0 != 58) {
            method2154(51, -15, -78);
        }
        int var3 = var2.method2396(76);
        int var4 = var2.method2355(29);
        if (~var4 <= -1 && (~class427.field5532 == -1 || var4 <= class427.field5532)) {
            if (var3 == 0) {
                byte[] var5 = new byte[var4];
                var2.method2398(var5, 0, arg0 ^ 29, var4);
                return var5;
            } else {
                int var6 = var2.method2355(104);
                if (~var6 > -1 || class427.field5532 != 0 && var6 > class427.field5532) {
                    throw new RuntimeException();
                } else {
                    byte[] var7 = new byte[var6];
                    if (var3 != 1) {
                        class331 var8 = class273.field3600;
                        synchronized (class273.field3600) {
                            class273.field3600.method1912(var2, var7, (byte) 51);
                        }
                    } else {
                        class132.method963(var7, var6, arg1, var4, 9);
                    }
                    return var7;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "(Loa;I)Lcd;", line = 67)
    public final class564 method72(class43 arg0, int arg1) {
        if (arg1 != 21098) {
            method2152((byte) -73, (byte[]) null);
        }
        ++field4819;
        return null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z", line = 82)
    public static final boolean method2153(int arg0, int arg1, int arg2) {
        if (arg0 > -45) {
            field4814 = -36;
        }
        ++field4820;
        return (33 & arg2) != 0;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(III)Z", line = 100)
    public static final boolean method2154(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field4814 = 106;
        }
        ++field4818;
        return class57.method502((byte) 108, arg1, arg0) || class355.method2045(1, arg1, arg0);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Loa;B)Lpl;", line = 111)
    public final class215 method71(class43 arg0, byte arg1) {
        ++field4815;
        int var3 = 29 % ((arg1 - 12) / 41);
        class151 var4 = arg0.method402();
        var4.method146(super.field3557, super.field3560 + -10, super.field3561);
        class215 var5 = class207.method1331(true, 3);
        if (~this.field4823 != 0) {
            class107 var6 = class232.field3109.method1292(0, this.field4823).method3794(0, -21807, this.field4817, (class348) null, 2048, 0, -1, arg0, (class210) null);
            if (var6 != null) {
                var6.method827(var4, var5.field2770[2], 0);
            }
        }
        if (~this.field4825 != 0) {
            class107 var7 = class232.field3109.method1292(0, this.field4825).method3794(0, -21807, this.field4824, (class348) null, 2048, 0, -1, arg0, (class210) null);
            if (var7 != null) {
                var7.method827(var4, var5.field2770[1], 0);
            }
        }
        class107 var8 = class232.field3109.method1292(0, this.field4821).method3794(0, -21807, this.field4816, (class348) null, 2048, 0, -1, arg0, (class210) null);
        if (var8 != null) {
            var8.method827(var4, var5.field2770[0], 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(Loa;I)V", line = 157)
    public final void method67(class43 arg0, int arg1) {
        ++field4813;
        if (arg1 != 2) {
            method2152((byte) -50, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILoa;I)Z", line = 170)
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field4822;
        class151 var5 = arg2.method402();
        var5.method146(super.field3557, super.field3560, super.field3561);
        if (arg3 >= -98) {
            method2152((byte) -75, (byte[]) null);
        }
        class107 var6 = class232.field3109.method1292(0, this.field4821).method3794(0, -21807, this.field4816, (class348) null, 131072, 0, -1, arg2, (class210) null);
        if (var6 != null && var6.method832(arg1, arg0, var5, true)) {
            return true;
        } else {
            if (~this.field4825 != 0) {
                class107 var7 = class232.field3109.method1292(0, this.field4825).method3794(0, -21807, this.field4824, (class348) null, 131072, 0, -1, arg2, (class210) null);
                if (var7 != null && var7.method832(arg1, arg0, var5, true)) {
                    return true;
                }
            }
            if (~this.field4823 != 0) {
                class107 var8 = class232.field3109.method1292(0, this.field4823).method3794(0, -21807, this.field4817, (class348) null, 131072, 0, -1, arg2, (class210) null);
                if (var8 != null && var8.method832(arg1, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }
}
