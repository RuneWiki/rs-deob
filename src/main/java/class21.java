import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class21 extends class232 {

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "I")
    private int field291 = 32768;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Lhi;")
    public static class82 field284 = class95.method664((byte) -31, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field289 = 0;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Lhi;")
    public static class82 field285 = class95.method664((byte) -84, "::fpson");

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!i", name = "fb", descriptor = "Lhi;")
    public static class82 field295 = class95.method664((byte) -75, ")4p=");

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!i", name = "db", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!i", name = "eb", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Lbh;")
    public static class18 field283;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "Lme;")
    public static class75 field286;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BZ)I", line = 5)
    public static final int method143(byte arg0, boolean arg1) {
        field287++;
        long var2 = class57.method391(19211);
        for (class327 var4 = arg1 ? (class327) class111.field1995.method502((byte) -104) : (class327) class111.field1995.method494(true); var4 != null; var4 = (class327) class111.field1995.method494(true)) {
            if (var2 > (var4.field5592 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field5592 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2418;
                    class312.field5398[var5] = class330.field5623[var5];
                    var4.method961((byte) 78);
                    return var5;
                }
                var4.method961((byte) 119);
            }
        }
        if (arg0 != -25) {
            method148((byte) 86, -116);
        }
        return -1;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 43)
    public final void method144(int arg0) {
        field281++;
        class20.method137(4096);
        if (arg0 <= 48) {
            field289 = -5;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIB)I", line = 55)
    public static final int method145(int arg0, int arg1, int arg2, byte arg3) {
        field292++;
        if (class245.field4255 == null) {
            return 0;
        }
        int var4 = -101 % ((-arg3 - 35) / 59);
        int var5 = arg1 >> 7;
        int var6 = arg0 >> 7;
        if (var6 < 0 || var5 < 0 || var6 > 103 || var5 > 103) {
            return 0;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg2;
        int var9 = arg1 & 0x7F;
        if (arg2 < 3 && (class204.field3567[1][var6][var5] & 0x2) == 2) {
            var8 = arg2 + 1;
        }
        int var10 = (128 - var7) * class245.field4255[var8][var6][var5 + 1] + class245.field4255[var8][var6 + 1][var5 + 1] * var7 >> 7;
        int var11 = (128 - var7) * class245.field4255[var8][var6][var5] + class245.field4255[var8][var6 + 1][var5] * var7 >> 7;
        return (128 - var9) * var11 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[[I", line = 99)
    public final int[][] method146(int arg0, byte arg1) {
        field293++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (arg1 != -82) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field3996.field278) {
            int[] var4 = this.method1649(1, (byte) 90, arg0);
            int[] var5 = this.method1649(2, (byte) 109, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class54.field858; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF589) >> 12;
                int var11 = var5[var9] * this.field291 >> 12;
                int var12 = class138.field2368[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class65.field1024;
                int var14 = class51.field826[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg0 & class209.field3684;
                int[][] var16 = this.method1641(0, var15, (byte) -98);
                var6[var9] = var16[0][var13];
                var8[var9] = var16[1][var13];
                var7[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLbc;)V", line = 162)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field288++;
        if (arg1 != -19) {
            method143((byte) 45, false);
        }
        if (arg0 == 0) {
            this.field291 = arg2.method1090(false) << 4;
        } else if (arg0 == 1) {
            this.field3990 = arg2.method1082(-70) == 1;
        }
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "(I)V", line = 198)
    public static void method147(int arg0) {
        field285 = null;
        field284 = null;
        field283 = null;
        if (arg0 >= 82) {
            field286 = null;
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)Lhi;", line = 217)
    public static final class82 method148(byte arg0, int arg1) {
        int var2 = 87 / ((-arg0 - 4) / 37);
        field294++;
        return arg1 < 999999999 ? class327.method2240((byte) -74, arg1) : class43.field759;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)[I", line = 250)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = -126 / ((-arg1 - 31) / 55);
        field279++;
        int[] var4 = this.field4008.method131((byte) -91, arg0);
        if (this.field4008.field256) {
            int[] var5 = this.method1649(1, (byte) 115, arg0);
            int[] var6 = this.method1649(2, (byte) 119, arg0);
            for (int var7 = 0; var7 < class54.field858; var7++) {
                int var8 = var5[var7] >> 4 & 0xFF;
                int var9 = var6[var7] * this.field291 >> 12;
                int var10 = class138.field2368[var8] * var9 >> 12;
                int var11 = class51.field826[var8] * var9 >> 12;
                int var12 = (var10 >> 12) + var7 & class65.field1024;
                int var13 = class209.field3684 & (var11 >> 12) + arg0;
                int[] var14 = this.method1649(0, (byte) 65, var13);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 301)
    public class21() {
        super(3, false);
    }
}
