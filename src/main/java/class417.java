import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class417 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lka;")
    private class473 field6049 = new class473(64);

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Ldk;")
    private class421 field6048;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public static int[] field6039 = new int[120];

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[[Z")
    public static boolean[][] field6045 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lmg;")
    public static class530 field6050;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "F")
    public static float field6051;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    public static int[] field6047;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field6039[var1] = var0 / 4;
        }
        field6050 = new class530();
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 3)
    public static void method2464(int arg0) {
        field6047 = null;
        field6039 = null;
        field6045 = null;
        if (arg0 != 15218) {
            method2466(122);
        }
        field6050 = null;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 19)
    public final void method2465(int arg0) {
        if (arg0 != -4597) {
            field6047 = null;
        }
        class473 var2 = this.field6049;
        synchronized (this.field6049) {
            this.field6049.method2774((byte) -61);
        }
        field6043++;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Lln;", line = 36)
    public static final class71 method2466(int arg0) {
        field6040++;
        try {
            if (arg0 != 19648) {
                field6045 = null;
            }
            return new class25();
        } catch (Throwable var2) {
            try {
                return (class71) Class.forName("vo").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class261();
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V", line = 61)
    public final void method2467(int arg0, int arg1) {
        field6044++;
        class473 var3 = this.field6049;
        synchronized (this.field6049) {
            if (arg0 <= -40) {
                this.field6049.method2779(14896, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Lio;", line = 74)
    public final class118 method2468(boolean arg0, int arg1) {
        field6041++;
        class473 var3 = this.field6049;
        class118 var4;
        synchronized (this.field6049) {
            var4 = (class118) this.field6049.method2767((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class421 var5 = this.field6048;
        byte[] var6;
        synchronized (this.field6048) {
            var6 = this.field6048.method2512(31, (byte) -93, arg1);
            if (arg0) {
                field6051 = -1.7293694F;
            }
        }
        class118 var7 = new class118();
        if (var6 != null) {
            var7.method872((byte) -104, new class319(var6));
        }
        class473 var8 = this.field6049;
        synchronized (this.field6049) {
            this.field6049.method2777(-1025, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V", line = 108)
    public final void method2469(int arg0) {
        field6042++;
        class473 var2 = this.field6049;
        synchronized (this.field6049) {
            this.field6049.method2764(-769);
        }
        if (arg0 != 1) {
            field6039 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lad;ILdk;)V", line = 152)
    public class417(class12 arg0, int arg1, class421 arg2) {
        this.field6048 = arg2;
        this.field6048.method2509(0, 31);
    }
}
