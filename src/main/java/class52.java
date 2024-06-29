import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[[I")
    private int[][] field1041;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lje;")
    public static class67 field1030 = class85.method592(255, "");

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lwb;")
    public static class155[] field1035 = new class155[16];

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lje;")
    public static class67 field1032 = class85.method592(255, "(Y<)4col>");

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Lje;")
    public static class67 field1034 = class85.method592(255, ")1");

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lje;")
    public static class67 field1037 = class85.method592(255, "m");

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Lje;")
    public static class67 field1040 = field1030;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lje;")
    private static class67 field1039 = class85.method592(255, "You can(Wt add yourself to your own friend list");

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Lje;")
    private static class67 field1033 = class85.method592(255, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[J")
    public static long[] field1027 = new long[100];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lje;")
    public static class67 field1028 = field1039;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lje;")
    public static class67 field1031 = field1033;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "J")
    public static long field1043;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)I")
    public final int method378(int arg0, boolean arg1) {
        field1029++;
        if (this.field1041 != null) {
            arg0 = (int) ((long) this.field1036 * (long) arg0 / (long) this.field1042);
        }
        return arg1 ? 2 : arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method379(byte arg0) {
        field1035 = null;
        int var1 = 20 / ((arg0 + 26) / 34);
        field1030 = null;
        field1028 = null;
        field1037 = null;
        field1039 = null;
        field1033 = null;
        field1031 = null;
        field1027 = null;
        field1040 = null;
        field1032 = null;
        field1034 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)I")
    public final int method380(int arg0, byte arg1) {
        field1038++;
        if (arg1 != -39) {
            this.method378(-111, true);
        }
        if (this.field1041 != null) {
            arg0 = (int) ((long) this.field1036 * (long) arg0 / (long) this.field1042) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B[B)[B")
    public final byte[] method381(byte arg0, byte[] arg1) {
        field1044++;
        if (this.field1041 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field1036 / (long) this.field1042) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field1041[var5];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var6 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1036 + var5;
                int var14 = var13 / this.field1042;
                var6 += var14;
                var5 = var13 - this.field1042 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg0 >= -86 ? null : arg1;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class76.method543(arg0, arg1, true);
            int var4 = arg0 / var3;
            this.field1041 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field1042 = var4;
            this.field1036 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1041[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                double var10 = (double) var5 / (double) var4;
                int var12 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var12 < 0) {
                    var12 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var12) {
                    double var14 = ((double) var12 - var8) * 3.141592653589793D;
                    double var16 = var10;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var10 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var12 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }
}
