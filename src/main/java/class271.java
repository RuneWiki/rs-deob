import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class271 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lc;")
    private class103 field4794 = new class103(256);

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lc;")
    private class103 field4807 = new class103(256);

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "Lnc;")
    private class83 field4797;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lnc;")
    private class83 field4800;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Z")
    public static boolean field4791 = false;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "[J")
    public static long[] field4799 = new long[100];

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lhj;")
    private static class69 field4803 = class181.method1318("M", (byte) -118);

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lhj;")
    public static class69 field4804 = class181.method1318(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) -108);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lhj;")
    public static class69 field4802 = field4803;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lhj;")
    public static class69 field4805 = field4803;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[[[I")
    public static int[][][] field4793;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method1856(boolean arg0) {
        field4802 = null;
        field4804 = null;
        if (!arg0) {
            field4799 = null;
            field4803 = null;
            field4805 = null;
            field4793 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[II)Lk;")
    public final class174 method1857(int arg0, int[] arg1, int arg2) {
        if (arg0 != -891465236) {
            return null;
        }
        field4796++;
        if (this.field4797.method587(-17326) == 1) {
            return this.method1858((byte) 121, arg2, arg1, 0);
        } else if (this.field4797.method594(arg2, (byte) 85) == 1) {
            return this.method1858((byte) 122, 0, arg1, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI[II)Lk;")
    private final class174 method1858(byte arg0, int arg1, int[] arg2, int arg3) {
        field4801++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF9) ^ arg1;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class174 var9 = (class174) this.field4807.method769(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class67 var10 = class67.method430(this.field4797, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            if (arg0 <= 108) {
                method1856(true);
            }
            class174 var11 = var10.method431();
            this.field4807.method761(var7, 0, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field3180.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V")
    public static final void method1859(byte arg0, int arg1) {
        class208.field3796 = arg1;
        class118.field2243 = 50;
        field4798++;
        int var2 = 46 % ((30 - arg0) / 46);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[II)Lk;")
    public final class174 method1860(boolean arg0, int[] arg1, int arg2) {
        if (arg0) {
            field4802 = null;
        }
        field4806++;
        if (this.field4800.method587(-17326) == 1) {
            return this.method1861(arg2, 0, (byte) -32, arg1);
        } else if (this.field4800.method594(arg2, (byte) -53) == 1) {
            return this.method1861(0, arg2, (byte) -32, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB[I)Lk;")
    private final class174 method1861(int arg0, int arg1, byte arg2, int[] arg3) {
        field4795++;
        int var5 = (arg1 >>> 12 | (arg1 & 0xB0000FFF) << 4) ^ arg0;
        if (arg2 != -32) {
            return null;
        }
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class174 var9 = (class174) this.field4807.method769(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class154 var10 = (class154) this.field4794.method769(true, var7);
            if (var10 == null) {
                var10 = class154.method1165(this.field4800, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field4794.method761(var7, 0, var10);
            }
            class174 var11 = var10.method1174(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method632(-8296);
                this.field4807.method761(var7, arg2 + 32, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lnc;Lnc;)V")
    public class271(class83 arg0, class83 arg1) {
        this.field4797 = arg0;
        this.field4800 = arg1;
    }
}
