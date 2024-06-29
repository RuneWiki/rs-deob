import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class300 extends class183 {

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "[S")
    public static short[] field4436 = new short[256];

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4431 = "Prepared sound engine";

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)Z", line = 8)
    public final boolean method2031(boolean arg0, int arg1) {
        field4433++;
        if (arg0) {
            field4431 = (String) null;
        }
        return (this.field4426 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z", line = 22)
    public final boolean method2032(int arg0) {
        if (arg0 != 1) {
            this.field4426 = 36;
        }
        field4425++;
        return (this.field4426 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(B)Z", line = 33)
    public final boolean method2033(byte arg0) {
        field4430++;
        if (arg0 >= -36) {
            return false;
        } else {
            return ((this.field4426 & 0x5BEBA6) >> 22) != 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Z", line = 44)
    public final boolean method2034(boolean arg0) {
        field4437++;
        if (arg0) {
            return (this.field4426 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Z)I", line = 57)
    public final int method2035(boolean arg0) {
        if (arg0) {
            return 116;
        } else {
            field4435++;
            return this.field4426 >> 18 & 0x7;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILkm;I)Lbc;", line = 69)
    public static final class4 method2036(int arg0, class133 arg1, int arg2) {
        if (arg0 != 31451) {
            method2043((short[]) null, 78, (String[]) null, -122, -58);
        }
        field4429++;
        return class189.method1326(true, arg1, arg2) ? class190.method1330((byte) -68) : null;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(B)Z", line = 83)
    public final boolean method2037(byte arg0) {
        field4424++;
        if (arg0 < 79) {
            method2042(86);
        }
        return (this.field4426 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Z", line = 99)
    public final boolean method2038(int arg0) {
        if (arg0 != 23211) {
            field4431 = (String) null;
        }
        field4422++;
        return ((this.field4426 & 0x115D9382) >> 28) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(B)Z", line = 111)
    public final boolean method2039(byte arg0) {
        field4432++;
        if (arg0 > -62) {
            return false;
        } else {
            return ((this.field4426 & 0x76474807) >> 30) != 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(II)V", line = 122)
    public class300(int arg0, int arg1) {
        this.field4426 = arg0;
        this.field4427 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)I", line = 137)
    public final int method2040(int arg0) {
        if (arg0 != -1) {
            method2042(112);
        }
        field4428++;
        return class145.method1042(this.field4426, 17);
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)Z", line = 150)
    public final boolean method2041(int arg0) {
        int var2 = -88 % ((arg0 - 51) / 61);
        field4434++;
        return (this.field4426 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V", line = 163)
    public static void method2042(int arg0) {
        if (arg0 != 6024102) {
            method2036(-58, (class133) null, 53);
        }
        field4431 = null;
        field4436 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([SI[Ljava/lang/String;II)V", line = 177)
    public static final void method2043(short[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
        field4423++;
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            String var6 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var6;
            int var7 = arg3;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var6 == null || arg2[var9] != null && arg2[var9].compareTo(var6) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7++] = var11;
                }
            }
            arg2[arg4] = arg2[var7];
            arg2[var7] = var6;
            arg0[arg4] = arg0[var7];
            arg0[var7] = var8;
            method2043(arg0, -24030, arg2, arg3, var7 - 1);
            method2043(arg0, arg1, arg2, var7 + 1, arg4);
        }
        if (arg1 != -24030) {
            method2042(-109);
        }
    }
}
