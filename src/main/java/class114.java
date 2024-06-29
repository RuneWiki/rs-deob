import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lan;")
    private class20 field1896 = new class20(256);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lan;")
    private class20 field1904 = new class20(256);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lbu;")
    private class17 field1901;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lbu;")
    private class17 field1897;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[I)Lbq;", line = 11)
    public final class189 method845(int arg0, int arg1, int[] arg2) {
        if (arg0 != 0) {
            method849(-81, null);
        }
        field1898++;
        if (this.field1897.method138(false) == 1) {
            return this.method846(arg2, arg1, 0, (byte) 81);
        } else if (this.field1897.method119(29630, arg1) == 1) {
            return this.method846(arg2, 0, arg1, (byte) 81);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([IIIB)Lbq;", line = 36)
    private final class189 method846(int[] arg0, int arg1, int arg2, byte arg3) {
        field1895++;
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class189 var9 = (class189) this.field1904.method171((byte) -105, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class375 var10 = (class375) this.field1896.method171((byte) 76, var7);
            if (var10 == null) {
                var10 = class375.method2335(this.field1897, arg2, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1896.method166(var10, var7, -108);
            }
            if (arg3 != 81) {
                return null;
            }
            class189 var11 = var10.method2333(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method2090(-1);
                this.field1904.method166(var11, var7, -83);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[I)Lbq;", line = 83)
    private final class189 method847(int arg0, int arg1, int arg2, int[] arg3) {
        field1899++;
        int var5 = ((arg1 & 0x30000FFF) << 4 | arg1 >>> 12) ^ arg2;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class189 var9 = (class189) this.field1904.method171((byte) 25, var7);
        if (arg0 != 0) {
            this.field1897 = null;
        }
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class133 var10 = class133.method990(this.field1901, arg1, arg2);
            if (var10 == null) {
                return null;
            }
            class189 var11 = var10.method989();
            this.field1904.method166(var11, var7, -117);
            if (arg3 != null) {
                arg3[0] -= var11.field2825.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([III)Lbq;", line = 121)
    public final class189 method848(int[] arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            return null;
        }
        field1903++;
        if (this.field1901.method138(false) == 1) {
            return this.method847(0, 0, arg1, arg0);
        } else if (this.field1901.method119(arg2 ^ 0x73BC, arg1) == 1) {
            return this.method847(0, arg1, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILcu;)Lut;", line = 143)
    public static final class80 method849(int arg0, class145 arg1) {
        field1900++;
        return arg0 == 0 ? new class80(arg1.method1122(arg0 + 65280), arg1.method1122(arg0 ^ 0xFF00), arg1.method1122(65280), arg1.method1122(65280), arg1.method1085(122), arg1.method1063((byte) -85)) : null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)Z", line = 156)
    public static final boolean method850(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1902++;
        if ((class260.field3784[0][arg1][arg0] & 0x2) != 0) {
            return true;
        } else if ((class260.field3784[arg2][arg1][arg0] & 0x10) != 0) {
            return false;
        } else if (arg3 == class425.method2556(arg0, arg2, -125, arg1)) {
            return true;
        } else if (arg4 < 98) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lbu;Lbu;)V", line = 186)
    public class114(class17 arg0, class17 arg1) {
        this.field1901 = arg0;
        this.field1897 = arg1;
    }
}
