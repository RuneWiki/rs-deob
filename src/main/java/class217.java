import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class217 extends class194 {

    @OriginalMember(owner = "client!uq", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field2664 = new String[100];

    @OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!uq", name = "Q", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!uq", name = "R", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!uq", name = "M", descriptor = "La;")
    public static class229 field2666;

    @OriginalMember(owner = "client!uq", name = "O", descriptor = "Lsj;")
    public static class432 field2668;

    @OriginalMember(owner = "client!uq", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2662;

    @OriginalMember(owner = "client!uq", name = "L", descriptor = "Z")
    public static boolean field2665;

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "()V", line = 3)
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(III)I", line = 15)
    private final int method1317(int arg0, int arg1, int arg2) {
        ++field2667;
        int var4 = arg2 * 57 + arg0;
        if (arg1 != -32205) {
            field2668 = null;
        }
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)V", line = 31)
    public static void method1318(int arg0) {
        field2666 = null;
        field2662 = null;
        field2664 = null;
        field2668 = null;
        if (arg0 != 9556) {
            method1320(83, 59);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)[I", line = 48)
    public final int[] method55(int arg0, int arg1) {
        ++field2670;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = -1 / ((arg1 - 57) / 46);
        if (super.field2292.field3708) {
            int var5 = class249.field3283[arg0];
            for (int var6 = 0; var6 < class138.field1579; ++var6) {
                var3[var6] = this.method1317(class277.field3585[var6], -32205, var5) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLjava/lang/Object;B)[B", line = 79)
    public static final byte[] method1319(boolean arg0, Object arg1, byte arg2) {
        ++field2663;
        if (arg2 < 88) {
            field2665 = true;
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return !arg0 ? var3 : class304.method1928((byte) -9, var3);
        } else if (arg1 instanceof class412) {
            class412 var4 = (class412) arg1;
            return var4.method499((byte) 122);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)Lpe;", line = 114)
    public static final class107 method1320(int arg0, int arg1) {
        ++field2669;
        class107 var2 = (class107) class420.field5741.method648(1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class108.field1294.method1794(arg1 ^ 5860, arg0, arg1);
            if (var3 != null && ~var3.length < -2) {
                class107 var4 = class190.method1177(var3, -40);
                class420.field5741.method643((long) arg0, var4, (byte) 122);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)Lwn;", line = 137)
    public static final class152 method1321(int arg0, byte arg1) {
        ++field2671;
        class152 var2 = (class152) class447.field6258.method648(1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (~arg0 > -32769) {
                var3 = class6.field58.method1794(5860, 0, arg0);
            } else {
                var3 = class449.field6281.method1794(5860, 0, 32767 & arg0);
            }
            class152 var4 = new class152();
            if (var3 != null) {
                var4.method980(-17494, new class242(var3));
            }
            if (arg0 >= 32768) {
                var4.method973((byte) -67);
            }
            class447.field6258.method643((long) arg0, var4, (byte) 122);
            return arg1 > -19 ? null : var4;
        }
    }
}
