import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class483 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lwm;")
    private class399 field7114 = new class399(256);

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lda;")
    private class44 field7123;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Ll;")
    private class16 field7125;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field7115 = 0;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field7124 = 0;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "Lmo;")
    public static class531 field7120 = new class531(1, 16);

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lph;")
    public static class459 field7117;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Lsq;", line = 4)
    public final class120 method2896(int arg0, byte arg1) {
        field7118++;
        Object var3 = this.field7114.method2478(1, (long) arg0);
        if (var3 != null) {
            return (class120) var3;
        } else if (this.field7125.method108(false, arg0)) {
            int var4 = 6 / ((arg1 + 15) / 48);
            class486 var5 = this.field7125.method105(-126, arg0);
            int var6 = var5.field7145 ? 64 : this.field7123.field791;
            class120 var8;
            if (var5.field7142 && this.field7123.method334()) {
                float[] var7 = this.field7125.method107(0.7F, (byte) 61, arg0, var6, false, var6);
                var8 = new class120(this.field7123, 3553, 34842, var6, var6, var5.field7147 != 0, var7, 6408);
            } else {
                int[] var9;
                short var10;
                if (var5.field7148 && class12.method70((byte) 110, var5.field7141)) {
                    var9 = this.field7125.method106((byte) 82, false, var6, 0.7F, arg0, var6);
                    var10 = 6407;
                } else {
                    var10 = 6408;
                    var9 = this.field7125.method109(var6, arg0, false, false, 0.7F, var6);
                }
                var8 = new class120(this.field7123, 3553, var10, var6, var6, var5.field7147 != 0, var9, false);
            }
            var8.method967(8276, var5.field7157, var5.field7164);
            this.field7114.method2472(-75, var8, (long) arg0);
            return var8;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 54)
    public final void method2897(byte arg0) {
        this.field7114.method2471((byte) 98, 5);
        field7122++;
        if (arg0 != -103) {
            method2899(-97, 75, 20, true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 66)
    public static void method2898(boolean arg0) {
        if (!arg0) {
            field7124 = 101;
        }
        field7117 = null;
        field7120 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIZ)I", line = 83)
    public static final int method2899(int arg0, int arg1, int arg2, boolean arg3) {
        field7116++;
        if (class520.field7560 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class339.field5099 - 1) || var5 > (class484.field7129 - 1)) {
            return 0;
        }
        int var6 = arg0;
        if (arg3) {
            return 22;
        } else {
            if (arg0 < 3 && (class22.field333[1][var4][var5] & 0x2) != 0) {
                var6 = arg0 + 1;
            }
            return class520.field7560[var6].method186(arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[[[BIIIIIIIILza;II)V", line = 119)
    public static final void method2900(int arg0, byte[][][] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class288 arg10, int arg11, int arg12) {
        field7119++;
        if (arg12 == 0 || arg9 == 0) {
            return;
        }
        if (arg12 == 9) {
            arg12 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        if (arg12 == 10) {
            arg12 = 1;
            arg7 = arg7 + 3 & 0x3;
        }
        int var13 = 115 / ((arg3 - 58) / 42);
        if (arg12 == 11) {
            arg12 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        arg10.method301(arg11, arg5, arg2, arg4, arg6, arg0, arg1[arg12 - 1][arg7], arg9, arg8);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 152)
    public final void method2901(int arg0) {
        if (arg0 != 34842) {
            method2898(true);
        }
        field7121++;
        this.field7114.method2475((byte) 67);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lda;Ll;)V", line = 173)
    public class483(class44 arg0, class16 arg1) {
        this.field7123 = arg0;
        this.field7125 = arg1;
    }
}
