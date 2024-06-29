import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class233 extends class642 {

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Z")
    public static boolean field3079 = false;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    private int field3077;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class233() {
        this(0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    private final void method1440(byte arg0, int arg1) {
        this.field3083 = 4080 & arg1 >> 4;
        this.field3080 = (16711680 & arg1) >> 12;
        ++field3084;
        if (arg0 < -68) {
            this.field3077 = (255 & arg1) << 4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    private class233(int arg0) {
        super(0, false);
        this.method1440((byte) -100, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[[I")
    public final int[][] method138(int arg0, int arg1) {
        ++field3076;
        int[][] var3 = super.field9211.method1068(0, arg1);
        if (arg0 != 21402) {
            this.method1440((byte) 35, -14);
        }
        if (super.field9211.field2131) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class338.field4909; ++var7) {
                var4[var7] = this.field3080;
                var5[var7] = this.field3083;
                var6[var7] = this.field3077;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILgk;B)V")
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field3081;
        if (arg2 <= 29) {
            this.method1(-23, (class540) null, (byte) 27);
        }
        if (~arg0 == -1) {
            this.method1440((byte) -69, arg1.method3154((byte) -23));
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method1441(int arg0, byte arg1) {
        ++field3085;
        if (arg1 != -120) {
            method1442(true, 29);
        }
        if (~arg0 != 0) {
            if (class422.field6201[arg0]) {
                class509.field7194.method1832(arg0, (byte) 22);
                class220.field2917[arg0] = null;
                class379.field5710[arg0] = null;
                class422.field6201[arg0] = false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1442(boolean arg0, int arg1) {
        ++field3082;
        if (class422.field6201[arg1]) {
            return true;
        } else if (!class509.field7194.method1848(0, arg1)) {
            return false;
        } else {
            int var2 = class509.field7194.method1845(arg1, true);
            if (arg0) {
                return false;
            } else if (~var2 == -1) {
                class422.field6201[arg1] = true;
                return true;
            } else {
                if (class220.field2917[arg1] == null) {
                    class220.field2917[arg1] = new class5[var2];
                }
                for (int var3 = 0; var3 < var2; ++var3) {
                    if (class220.field2917[arg1][var3] == null) {
                        byte[] var4 = class509.field7194.method1844(arg1, 31330, var3);
                        if (var4 != null) {
                            class5 var5 = class220.field2917[arg1][var3] = new class5();
                            var5.field65 = (arg1 << 16) + var3;
                            if (~var4[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method25(new class540(var4), false);
                        }
                    }
                }
                class422.field6201[arg1] = true;
                return true;
            }
        }
    }
}
