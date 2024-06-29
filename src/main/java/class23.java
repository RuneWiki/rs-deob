import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class23 extends class33 {

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    private int field496 = 4096;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    private int field505 = 4096;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    private int field510 = 4096;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field497 = 0;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Lrd;")
    private static class173 field501 = class133.method843("Ok", 126);

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "Lrd;")
    public static class173 field504 = class133.method843("Registrierter Benutzer", -86);

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "Lrd;")
    public static class173 field506 = class133.method843("null", 20);

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field493 = 0;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "Lrd;")
    public static class173 field498 = class133.method843("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 51);

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "[[B")
    public static byte[][] field508 = new byte[50][];

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Lrd;")
    public static class173 field507 = field501;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    public static volatile int field511 = -1;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "[I")
    public static int[] field509 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static volatile int field499 = 0;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "[[[B")
    public static byte[][][] field502;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field495;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field496 = arg2.method755((byte) -68);
                }
            } else {
                this.field510 = arg2.method755((byte) -89);
            }
        } else {
            this.field505 = arg2.method755((byte) -71);
        }
        if (arg1 > -99) {
            field493 = 82;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public static void method187(boolean arg0) {
        field502 = null;
        field509 = null;
        field508 = null;
        if (!arg0) {
            field501 = null;
        }
        field507 = null;
        field501 = null;
        field506 = null;
        field504 = null;
        field498 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)Lnb;")
    public static final class131 method188(int arg0, byte arg1) {
        class131 var2 = (class131) class164.field3044.method46((long) arg0, 26580);
        ++field494;
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != 89) {
                method188(-121, (byte) -117);
            }
            byte[] var3 = class153.field2897.method142(class64.method406(arg0, (byte) -28), class3.method22(arg1 ^ 934, arg0), (byte) 2);
            class131 var4 = new class131();
            if (var3 != null) {
                var4.method838(new class121(var3), -1867);
            }
            class164.field3044.method52(-3583, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field500;
        int[][] var3 = super.field731.method1340(119, arg1);
        if (arg0 < 112) {
            field507 = null;
        }
        if (super.field731.field3925) {
            int[][] var4 = this.method259(0, -9, arg1);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class117.field2173; ++var11) {
                int var12 = var8[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (~var12 == ~var14 && var13 == var14) {
                    var7[var11] = this.field505 * var12 >> 12;
                    var9[var11] = this.field510 * var14 >> 12;
                    var10[var11] = this.field496 * var13 >> 12;
                } else {
                    var7[var11] = this.field505;
                    var9[var11] = this.field510;
                    var10[var11] = this.field496;
                }
            }
        }
        return var3;
    }
}
