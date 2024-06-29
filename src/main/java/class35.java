import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class35 extends class26 {

    @OriginalMember(owner = "mapview!t", name = "i", descriptor = "[B")
    public byte[] field463;

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "mapview!t", name = "h", descriptor = "Ld;")
    public static class7 field462 = class38.method251((byte) 57, "Next page");

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Ld;")
    public static class7 field467 = class38.method251((byte) -112, "POH Portal");

    @OriginalMember(owner = "mapview!t", name = "j", descriptor = "I")
    public static int field464 = -1;

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "J")
    public static long field468 = 0L;

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "Ld;")
    public static class7 field466 = class38.method251((byte) -81, "Overview");

    @OriginalMember(owner = "mapview!t", name = "q", descriptor = "Ld;")
    public static class7 field471 = class38.method251((byte) -65, "Switch to ");

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "mapview!t", name = "t", descriptor = "[J")
    public static long[] field474 = new long[32];

    @OriginalMember(owner = "mapview!t", name = "s", descriptor = "[I")
    public static int[] field473 = new int[128];

    @OriginalMember(owner = "mapview!t", name = "r", descriptor = "I")
    public static volatile int field472 = -1;

    @OriginalMember(owner = "mapview!t", name = "u", descriptor = "I")
    public static volatile int field475 = 0;

    @OriginalMember(owner = "mapview!t", name = "k", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)V", line = 21)
    public final void method226(int arg0, int arg1) {
        if (arg0 == 27488) {
            this.field463[this.field470++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Z)Ld;", line = 37)
    public final class7 method227(boolean arg0) {
        int var2 = this.field470;
        if (!arg0) {
            field475 = 98;
        }
        while (this.field463[this.field470++] != 0) {
        }
        return class14.method109(var2, this.field463, this.field470 - var2 - 1, (byte) -84);
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(B)I", line = 61)
    public final int method228(byte arg0) {
        if (arg0 != -20) {
            field472 = 52;
        }
        this.field470 += 4;
        return (this.field463[this.field470 - 1] & 0xFF) + ((this.field463[this.field470 - 2] & 0xFF) << 8) + ((this.field463[this.field470 + -4] & 0xFF) << 24) + ((this.field463[this.field470 - 3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "(B)B", line = 82)
    public final byte method229(byte arg0) {
        if (arg0 != -17) {
            this.method226(34, 93);
        }
        return this.field463[this.field470++];
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(Z)I", line = 96)
    public final int method230(boolean arg0) {
        if (arg0) {
            this.field470 = -90;
        }
        this.field470 += 3;
        return ((this.field463[this.field470 - 2] & 0xFF) << 8) + (((this.field463[this.field470 - 3] & 0xFF) << 16) + (this.field463[this.field470 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(I)I", line = 179)
    public final int method231(int arg0) {
        this.field470 += 2;
        if (arg0 != -887) {
            field462 = null;
        }
        return ((this.field463[this.field470 - 2] & 0xFF) << 8) + (this.field463[this.field470 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "(Z)I", line = 202)
    public final int method232(boolean arg0) {
        if (arg0) {
            this.method226(-29, -107);
        }
        return this.field463[this.field470++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(ZI)V", line = 213)
    public final void method233(boolean arg0, int arg1) {
        this.field463[this.field470++] = (byte) (arg1 >> 24);
        if (arg0) {
            this.field463[this.field470++] = (byte) (arg1 >> 16);
            this.field463[this.field470++] = (byte) (arg1 >> 8);
            this.field463[this.field470++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BI[II)V", line = 244)
    public final void method234(byte arg0, int arg1, int[] arg2, int arg3) {
        int var5 = -20 % ((-arg0 - 61) / 43);
        int var6 = this.field470;
        this.field470 = arg3;
        int var7 = (arg1 - arg3) / 8;
        for (int var8 = 0; var8 < var7; var8++) {
            int var9 = -957401312;
            int var10 = this.method228((byte) -20);
            int var11 = -1640531527;
            int var12 = this.method228((byte) -20);
            int var13 = 32;
            while (var13-- > 0) {
                var12 -= (var10 << 4 ^ var10 >>> 5) + var10 ^ arg2[var9 >>> 11 & 0x3000003] + var9;
                var9 -= var11;
                var10 -= var9 + arg2[var9 & 0x3] ^ (var12 << 4 ^ var12 >>> 5) + var12;
            }
            this.field470 -= 8;
            this.method233(true, var10);
            this.method233(true, var12);
        }
        this.field470 = var6;
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "(I)V", line = 296)
    public class35(int arg0) {
        this.field463 = class2.method11(arg0, 122);
        this.field470 = 0;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II[BB)V", line = 306)
    public final void method235(int arg0, int arg1, byte[] arg2, byte arg3) {
        if (arg3 != -114) {
            field465 = 102;
        }
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            arg2[var5] = this.field463[this.field470++];
        }
    }

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "(Z)V", line = 322)
    public static void method236(boolean arg0) {
        field467 = null;
        field462 = null;
        field474 = null;
        field473 = null;
        field471 = null;
        if (arg0) {
            field462 = null;
        }
        field466 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "([B)V", line = 340)
    public class35(byte[] arg0) {
        this.field463 = arg0;
        this.field470 = 0;
    }
}
