import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class615 {

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Z")
    public boolean field8913 = false;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "J")
    public static long field8919 = 0L;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field8914 = new String[100];

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Lrg;")
    public static class548 field8915 = new class548(3, 8);

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "[J")
    public static long[] field8921 = new long[100];

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public int field8916;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public int field8917;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Lkb;")
    public class590 field8922;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILdi;Lqa;IIILdj;Lwt;)V", line = 4)
    public static final void method3534(int arg0, class107 arg1, class206 arg2, int arg3, int arg4, int arg5, class287 arg6, class258 arg7) {
        field8911++;
        int var8 = arg7.field3314 - (arg3 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg1.field1330 != 0) {
            arg2.method1118(arg1.field1330, (byte) 47, arg3 + 10, var8, var9, arg6.method1610() * arg4 + (arg5 + 1) - var9);
        }
        if (arg1.field1308 != 0) {
            arg2.method1151(var9, arg3 + 10, arg1.field1308, arg6.method1610() * arg4 + (arg5 - var9) + 1, (byte) 103, var8);
        }
        int var10 = arg1.field1327;
        if (arg7.field3316 && arg1.field1337 != -1) {
            var10 = arg1.field1337;
        }
        if (arg0 != -4) {
            field8915 = null;
        }
        for (int var11 = 0; var11 < arg4; var11++) {
            String var12 = class308.field3919[var11];
            if (var11 < arg4 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method1614(arg2, var12, arg7.field3314, arg5, var10, true);
            arg5 += arg6.method1610();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZLos;)V", line = 46)
    public final void method3535(boolean arg0, class374 arg1) {
        field8908++;
        if (arg0) {
            this.method3540(null, 90, true);
        }
        while (true) {
            int var3 = arg1.method2129(-122);
            if (var3 == 0) {
                return;
            }
            this.method3540(arg1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)I", line = 67)
    public static final int method3536(boolean arg0, int arg1) {
        field8920++;
        if (!arg0) {
            field8914 = null;
        }
        return arg1 == 16711935 ? -1 : class101.method609(-407448383, arg1);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZLqa;I)Lha;", line = 84)
    public final class52 method3537(int arg0, boolean arg1, class206 arg2, int arg3) {
        field8912++;
        long var5 = (long) (arg2.field2475 << 19 | (arg1 ? 262144 : 0) | arg3 << 16 | this.field8916);
        class52 var7 = (class52) this.field8922.field8560.method3682(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field8922.field8553.method2566(99, this.field8916)) {
            class3 var8 = class3.method18(this.field8922.field8553, this.field8916, 0);
            if (var8 != null) {
                var8.field16 = var8.field12 = var8.field17 = var8.field10 = 0;
                if (arg1) {
                    var8.method12();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method16();
                }
            }
            if (arg0 != -1) {
                field8915 = null;
            }
            class52 var10 = arg2.method1101(var8, true);
            if (var10 != null) {
                this.field8922.field8560.method3684(var10, 0, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 132)
    public static void method3538(int arg0) {
        if (arg0 != -1) {
            method3538(11);
        }
        field8921 = null;
        field8915 = null;
        field8914 = null;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Z", line = 147)
    public final boolean method3539(int arg0) {
        if (arg0 != -14730) {
            field8914 = null;
        }
        field8918++;
        return this.field8922.field8553.method2566(arg0 ^ 0xFFFFC63A, this.field8916);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Los;IZ)V", line = 164)
    private final void method3540(class374 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field8916 = arg0.method2136(false);
        } else if (arg1 == 2) {
            this.field8917 = arg0.method2128(true);
        } else if (arg1 == 3) {
            this.field8913 = true;
        } else if (arg1 == 4) {
            this.field8916 = -1;
        }
        if (arg2) {
            method3538(41);
        }
        field8910++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Llw;BZZ)V", line = 193)
    public static final void method3541(class565 arg0, byte arg1, boolean arg2, boolean arg3) {
        field8909++;
        int var4 = arg0.field8297;
        int var5 = 57 / ((60 - arg1) / 34);
        int var6 = (int) arg0.field7967;
        arg0.method3187(true);
        if (arg3) {
            class547.method3211(-1, var4);
        }
        class99.method607((byte) 118, var4);
        class509 var7 = class61.method348(var6, true);
        if (var7 != null) {
            class87.method508(125, var7);
        }
        class167.method931((byte) -121);
        if (!arg2 && class599.field8668 != -1) {
            class642.method3696(class599.field8668, 0, 1);
        }
        class582 var8 = new class582(class309.field3937);
        for (class565 var9 = (class565) var8.method3387(0); var9 != null; var9 = (class565) var8.method3389(1)) {
            if (!var9.method3189(-9613)) {
                var9 = (class565) var8.method3387(0);
                if (var9 == null) {
                    return;
                }
            }
            if (var9.field8293 == 3) {
                int var10 = (int) var9.field7967;
                if ((var10 >>> 16) == var4) {
                    method3541(var9, (byte) -125, arg2, true);
                }
            }
        }
    }
}
