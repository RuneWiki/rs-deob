import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class327 {

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "Leq;")
    private class213 field4537 = new class213(256);

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "Leq;")
    private class213 field4544 = new class213(256);

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "Lin;")
    private class91 field4540;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "Lin;")
    private class91 field4542;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lfh;")
    public static class652 field4545 = new class652("WTQA", 2);

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "Z")
    public static boolean field4547 = false;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field4546 = 0;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public static void method2078(boolean arg0) {
        field4545 = null;
        if (!arg0) {
            method2083((byte) -5, '\u0002');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[III)Lob;")
    private final class735 method2079(int arg0, int[] arg1, int arg2, int arg3) {
        field4541++;
        int var5 = arg0 ^ (arg3 >>> 12 | arg3 << 4 & 0xFFF1);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class735 var9 = (class735) this.field4544.method1465(var7, -6008);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class642 var10 = class642.method3643(this.field4542, arg3, arg0);
            if (arg2 < 50) {
                method2083((byte) -60, 'n');
            }
            if (var10 == null) {
                return null;
            }
            class735 var11 = var10.method3640();
            this.field4544.method1468((byte) 32, var7, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field9908.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[II)Lob;")
    public final class735 method2080(int arg0, int[] arg1, int arg2) {
        field4536++;
        if (~this.field4542.method867(-1) == arg2) {
            return this.method2079(arg0, arg1, 122, 0);
        } else if (this.field4542.method860(0, arg0) == 1) {
            return this.method2079(0, arg1, 69, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "([III)Lob;")
    public final class735 method2081(int[] arg0, int arg1, int arg2) {
        field4539++;
        if (this.field4540.method867(arg2) == 1) {
            return this.method2082(arg1, 0, (byte) 92, arg0);
        } else if (this.field4540.method860(0, arg1) == 1) {
            return this.method2082(0, arg1, (byte) 78, arg0);
        } else {
            if (arg2 != -1) {
                this.method2079(44, null, -124, -47);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB[I)Lob;")
    private final class735 method2082(int arg0, int arg1, byte arg2, int[] arg3) {
        field4538++;
        int var5 = arg0 ^ (arg1 & 0xFFF << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        int var7 = -113 / ((arg2 - 16) / 34);
        long var8 = (long) var6 ^ 0x100000000L;
        class735 var10 = (class735) this.field4544.method1465(var8, -6008);
        if (var10 != null) {
            return var10;
        } else if (arg3 == null || arg3[0] > 0) {
            class329 var11 = (class329) this.field4537.method1465(var8, -6008);
            if (var11 == null) {
                var11 = class329.method2098(this.field4540, arg1, arg0);
                if (var11 == null) {
                    return null;
                }
                this.field4537.method1468((byte) 108, var8, var11);
            }
            class735 var12 = var11.method2094(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method2314((byte) 27);
                this.field4544.method1468((byte) 117, var8, var12);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BC)Z")
    public static final boolean method2083(byte arg0, char arg1) {
        field4543++;
        if (arg0 <= 85) {
            method2083((byte) -75, '\f');
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lin;Lin;)V")
    public class327(class91 arg0, class91 arg1) {
        this.field4540 = arg1;
        this.field4542 = arg0;
    }
}
