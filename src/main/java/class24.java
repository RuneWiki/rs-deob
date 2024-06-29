import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 {

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Ldb;")
    private class32 field367 = new class32(256);

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Ldb;")
    private class32 field372 = new class32(256);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lc;")
    private class21 field366;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Lc;")
    private class21 field368;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lai;")
    public static class10 field364 = class44.method278("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -38);

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lai;")
    public static class10 field370 = class44.method278("sch-Utteln:", -62);

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field363 = 5063219;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "[[B")
    public static byte[][] field371;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[[S")
    public static short[][] field365;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([SB[Lai;)V")
    public static final void method160(short[] arg0, byte arg1, class10[] arg2) {
        class78.method483(arg2.length - 1, arg0, 20962, 0, arg2);
        if (arg1 != -12) {
            field364 = null;
        }
        field360++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([IIII)Lqe;")
    private final class150 method161(int[] arg0, int arg1, int arg2, int arg3) {
        field362++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFF9 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class150 var9 = (class150) this.field372.method213(126, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 != null && arg0[0] <= 0) {
            return null;
        } else if (arg2 == -922759380) {
            class199 var10 = class199.method1288(this.field368, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class150 var11 = var10.method1285();
            this.field372.method214(var11, (byte) 103, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2877.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)Lqe;")
    public final class150 method162(int[] arg0, int arg1, int arg2) {
        field369++;
        if (this.field368.method153(-1) == 1) {
            return this.method161(arg0, 0, arg1 ^ 0xC8FFCF2C, arg2);
        } else if (this.field368.method142(arg2, -103) == 1) {
            return this.method161(arg0, arg2, arg1 - 922759380, 0);
        } else {
            if (arg1 != 0) {
                method164(true);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[II)Lqe;")
    private final class150 method163(int arg0, int arg1, int[] arg2, int arg3) {
        field359++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFFF) ^ arg1;
        int var6 = var5 | arg0 << 16;
        if (arg3 != -9276) {
            return null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class150 var9 = (class150) this.field372.method213(-123, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class138 var10 = (class138) this.field367.method213(120, var7);
            if (var10 == null) {
                var10 = class138.method937(this.field366, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field367.method214(var10, (byte) 106, var7);
            }
            class150 var11 = var10.method942(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method848(false);
                this.field372.method214(var11, (byte) 115, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method164(boolean arg0) {
        field364 = null;
        field365 = null;
        field370 = null;
        if (!arg0) {
            field371 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "([III)Lqe;")
    public final class150 method165(int[] arg0, int arg1, int arg2) {
        field361++;
        if (this.field366.method153(-1) == 1) {
            return this.method163(0, arg2, arg0, arg1 ^ 0xFFFFDBC4);
        } else if (this.field366.method142(arg2, -103) == 1) {
            return this.method163(arg2, 0, arg0, -9276);
        } else if (arg1 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lc;Lc;)V")
    public class24(class21 arg0, class21 arg1) {
        this.field366 = arg1;
        this.field368 = arg0;
    }
}
