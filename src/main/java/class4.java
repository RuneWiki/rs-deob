import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class4 extends class15 {

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "[B")
    public byte[] field138;

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "I")
    public static int field134 = 50;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "Lna;")
    public static class26 field135 = class30.method205((byte) 86, "sprites");

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "Lna;")
    public static class26 field137 = class30.method205((byte) 72, "POH Portal");

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "Lna;")
    public static class26 field140 = class30.method205((byte) 42, "Woodcutting stump");

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "J")
    public static long field136;

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "Lg;")
    public static class12 field133;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "[B")
    public static byte[] field139;

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BI)V", line = 15)
    public final void method40(byte arg0, int arg1) {
        if (arg0 > -3) {
            this.method51((byte) -127);
        }
        this.field138[this.field132++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IB)V", line = 42)
    public final void method41(int arg0, byte arg1) {
        this.field138[this.field132++] = (byte) (arg0 >> 24);
        if (arg1 != -74) {
            field131 = 74;
        }
        this.field138[this.field132++] = (byte) (arg0 >> 16);
        this.field138[this.field132++] = (byte) (arg0 >> 8);
        this.field138[this.field132++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)I", line = 58)
    public final int method42(int arg0) {
        if (arg0 != 11737) {
            field131 = -50;
        }
        this.field132 += 3;
        return ((this.field138[this.field132 - 3] & 0xFF) << 16) + ((this.field138[this.field132 - 2] & 0xFF) << 8) + (this.field138[this.field132 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(B)I", line = 80)
    public final int method43(byte arg0) {
        this.field132 += 4;
        int var2 = -80 % ((arg0 + 42) / 44);
        return ((this.field138[this.field132 - 3] & 0xFF) << 16) + ((this.field138[this.field132 - 2] & 0xFF) << 8) + ((this.field138[this.field132 - 4] & 0xFF) << 24) + (this.field138[this.field132 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IIBZ)Lna;", line = 94)
    public static final class26 method44(int arg0, int arg1, byte arg2, boolean arg3) {
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        int var4 = 1;
        int var5 = arg0 / arg1;
        while (var5 != 0) {
            var5 /= arg1;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg0 % arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            arg0 /= arg1;
        }
        class26 var10 = new class26();
        var10.field367 = var6;
        var10.field358 = var7;
        if (arg2 != 43) {
            method46(-7);
        }
        return var10;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(IZI[B)V", line = 168)
    public final void method45(int arg0, boolean arg1, int arg2, byte[] arg3) {
        int var5 = arg2;
        if (arg1) {
            this.field138 = null;
        }
        while (var5 < arg2 + arg0) {
            arg3[var5] = this.field138[this.field132++];
            var5++;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(I)V", line = 185)
    public static void method46(int arg0) {
        field135 = null;
        field140 = null;
        field139 = null;
        field137 = null;
        if (arg0 <= 112) {
            field133 = null;
        }
        field133 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "(B)I", line = 203)
    public final int method47(byte arg0) {
        this.field132 += 2;
        return arg0 <= 54 ? -8 : ((this.field138[this.field132 - 2] & 0xFF) << 8) + (this.field138[this.field132 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z[III)V", line = 236)
    public final void method48(boolean arg0, int[] arg1, int arg2, int arg3) {
        int var5 = this.field132;
        this.field132 = arg2;
        int var6 = (arg3 - arg2) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method43((byte) 116);
            int var9 = this.method43((byte) -127);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= var10 + arg1[var10 >>> 11 & 0xC8400003] ^ (var8 << 4 ^ var8 >>> 5) - -var8;
                var10 -= var11;
                var8 -= arg1[var10 & 0x3] + var10 ^ (var9 << 4 ^ var9 >>> 5) + var9;
            }
            this.field132 -= 8;
            this.method41(var8, (byte) -74);
            this.method41(var9, (byte) -74);
        }
        this.field132 = var5;
        if (!arg0) {
            this.method42(62);
        }
    }

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "(B)I", line = 281)
    public final int method49(byte arg0) {
        return arg0 < 49 ? -32 : this.field138[this.field132++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "(I)Lna;", line = 306)
    public final class26 method50(int arg0) {
        if (arg0 != 435895534) {
            field139 = null;
        }
        int var2 = this.field132;
        while (this.field138[this.field132++] != 0) {
        }
        return class41.method263(this.field132 - var2 - 1, -51, this.field138, var2);
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(I)V", line = 329)
    public class4(int arg0) {
        this.field138 = class32.method213(-1631, arg0);
        this.field132 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "([B)V", line = 355)
    public class4(byte[] arg0) {
        this.field138 = arg0;
        this.field132 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "(B)B", line = 383)
    public final byte method51(byte arg0) {
        if (arg0 != -83) {
            this.method50(-49);
        }
        return this.field138[this.field132++];
    }
}
