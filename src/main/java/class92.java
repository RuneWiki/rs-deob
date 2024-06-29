import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class92 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lqh;")
    private class50 field1096 = new class50(256);

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lqh;")
    private class50 field1104 = new class50(256);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lfo;")
    private class361 field1095;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lfo;")
    private class361 field1103;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lho;")
    public static class103 field1094 = new class103(56, 11);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Z")
    public static boolean field1097 = false;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lho;")
    public static class103 field1099 = new class103(2, -1);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 5)
    public static void method508(byte arg0) {
        if (arg0 != 1) {
            method513(false);
        }
        field1094 = null;
        field1099 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[II)Ljj;", line = 21)
    public final class77 method509(int arg0, int[] arg1, int arg2) {
        field1105++;
        if (arg2 == ~this.field1103.method2138(arg2 + 1)) {
            return this.method510(0, arg2 ^ 0xFFFFFF94, arg0, arg1);
        } else if (this.field1103.method2136(-109, arg0) == 1) {
            return this.method510(arg0, 120, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III[I)Ljj;", line = 42)
    private final class77 method510(int arg0, int arg1, int arg2, int[] arg3) {
        field1101++;
        int var5 = arg2 ^ ((arg0 & 0xC0000FFF) << 4 | arg0 >>> 12);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class77 var9 = (class77) this.field1104.method295(var7, -90);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            if (arg1 <= 66) {
                this.field1096 = null;
            }
            class56 var10 = (class56) this.field1096.method295(var7, -95);
            if (var10 == null) {
                var10 = class56.method335(this.field1103, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1096.method291(var7, var10, -52);
            }
            class77 var11 = var10.method336(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2674(true);
                this.field1104.method291(var7, var11, -25);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z", line = 88)
    public static final boolean method511(int arg0, int arg1, int arg2) {
        field1106++;
        if (arg2 < 91) {
            method511(114, -11, -121);
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IBI)Ljj;", line = 101)
    public final class77 method512(int[] arg0, byte arg1, int arg2) {
        field1100++;
        if (this.field1095.method2138(-1) == 1) {
            return this.method515(arg0, arg2, (byte) -20, 0);
        }
        if (arg1 != 23) {
            method508((byte) 119);
        }
        if (this.field1095.method2136(-58, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method515(arg0, 0, (byte) -20, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 127)
    public static final void method513(boolean arg0) {
        class291.field3845 = null;
        field1102++;
        class415.field5979 = false;
        class212.field2872 = null;
        class132.field1746 = null;
        class132.field1749 = null;
        if (!arg0) {
            method511(36, 71, -59);
        }
        class149.field1962 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([I[Ljava/lang/Object;III)V", line = 153)
    public static final void method514(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        field1093++;
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg0[var10] < (var9 & var10) + var7) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method514(arg0, arg1, var6 - 1, 1, arg4);
            method514(arg0, arg1, arg2, 1, var6 + 1);
        }
        if (arg3 != 1) {
            field1099 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([IIBI)Ljj;", line = 212)
    private final class77 method515(int[] arg0, int arg1, byte arg2, int arg3) {
        field1098++;
        int var5 = ((arg3 & 0xE0000FFF) << 4 | arg3 >>> 12) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class77 var9 = (class77) this.field1104.method295(var7, -122);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg2 != -20) {
                method513(false);
            }
            class25 var10 = class25.method159(this.field1095, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class77 var11 = var10.method156();
            this.field1104.method291(var7, var11, -27);
            if (arg0 != null) {
                arg0[0] -= var11.field962.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lfo;Lfo;)V", line = 262)
    public class92(class361 arg0, class361 arg1) {
        this.field1095 = arg0;
        this.field1103 = arg1;
    }
}
