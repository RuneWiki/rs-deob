import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class204 extends class7 {

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    private int field3905 = 4096;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "I")
    private int field3906 = 4096;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    private int field3901 = 4096;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "Lob;")
    private static class141 field3908 = class175.method1195(40, "Sorry invited players only)3");

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Lob;")
    private static class141 field3902 = class175.method1195(40, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "Lob;")
    public static class141 field3899 = field3908;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "Lob;")
    public static class141 field3904 = field3902;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "Lob;")
    private static class141 field3900 = class175.method1195(40, "This computers address has been blocked");

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "Lob;")
    public static class141 field3912 = field3900;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[I")
    public static int[] field3913 = new int[1000];

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "Lob;")
    public static class141 field3910 = class175.method1195(40, " (X");

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "Lra;")
    public static class170 field3915 = null;

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3914 = new CRC32();

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lvc;")
    public static class212 field3916 = new class212(5);

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "[Lfa;")
    public static class52[] field3898;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 > -116) {
            field3912 = null;
        }
        ++field3909;
        if (~arg0 == ~arg7) {
            class22.method141(arg6, arg0, arg2, -17360, arg5, arg4, arg3);
        } else if (class68.field1323 <= -arg0 + arg2 && class136.field2590 >= arg0 + arg2 && class35.field698 <= -arg7 + arg3 && arg3 + arg7 <= class130.field2470) {
            class130.method820(arg0, arg6, arg3, arg4, false, arg2, arg7, arg5);
        } else {
            class77.method535(arg5, arg7, (byte) -97, arg0, arg2, arg6, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3901 = arg2.method1007(52);
                }
            } else {
                this.field3905 = arg2.method1007(107);
            }
        } else {
            this.field3906 = arg2.method1007(66);
        }
        ++field3907;
        int var5 = 22 / ((arg1 - 66) / 57);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V")
    public static void method1351(int arg0) {
        field3913 = null;
        field3912 = null;
        if (arg0 != 4096) {
            field3904 = null;
        }
        field3914 = null;
        field3899 = null;
        field3910 = null;
        field3916 = null;
        field3900 = null;
        field3902 = null;
        field3915 = null;
        field3904 = null;
        field3908 = null;
        field3898 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field3903;
        int var3 = -88 % ((arg1 - -42) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[][] var5 = this.method42(arg0, 100, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; class117.field2272 > var12; ++var12) {
                int var13 = var8[var12];
                int var14 = var7[var12];
                int var15 = var6[var12];
                if (~var13 == ~var15 && var13 == var14) {
                    var9[var12] = this.field3906 * var15 >> 12;
                    var11[var12] = this.field3905 * var13 >> 12;
                    var10[var12] = this.field3901 * var14 >> 12;
                } else {
                    var9[var12] = this.field3906;
                    var11[var12] = this.field3905;
                    var10[var12] = this.field3901;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBI)Lra;")
    public static final class170 method1352(int arg0, byte arg1, int arg2) {
        ++field3911;
        class170 var3 = class192.method1268(arg2, -92);
        if (arg1 != 56) {
            field3904 = null;
        }
        if (~arg0 == 0) {
            return var3;
        } else {
            return var3 != null && var3.field3337 != null && arg0 < var3.field3337.length ? var3.field3337[arg0] : null;
        }
    }
}
