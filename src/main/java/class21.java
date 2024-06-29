import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends class33 {

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "[B")
    public byte[] field234;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "[J")
    public static long[] field236 = new long[32];

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Lta;")
    public static class37 field237 = class20.method87(-93, "Anvil");

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "Lta;")
    public static class37 field239 = class20.method87(-121, "Key");

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lg;")
    public static class12 field238 = new class12();

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "[Z")
    public static boolean[] field242 = new boolean[112];

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "I")
    public static volatile int field244 = 0;

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "I")
    public static volatile int field241 = 0;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)Lta;", line = 14)
    public final class37 method91(int arg0) {
        int var2 = this.field235;
        while (this.field234[this.field235++] != 0) {
        }
        if (arg0 >= -124) {
            field238 = null;
        }
        return class41.method263(-26007, this.field234, var2, this.field235 - var2 - 1);
    }

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "(I)V", line = 42)
    public static void method92(int arg0) {
        field236 = null;
        field242 = null;
        field237 = null;
        if (arg0 <= 102) {
            method95(84);
        }
        field238 = null;
        field239 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BI)V", line = 61)
    public final void method93(byte arg0, int arg1) {
        this.field234[this.field235++] = (byte) (arg1 >> 24);
        if (arg0 > 94) {
            this.field234[this.field235++] = (byte) (arg1 >> 16);
            this.field234[this.field235++] = (byte) (arg1 >> 8);
            this.field234[this.field235++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "(I)B", line = 99)
    public final byte method94(int arg0) {
        int var2 = -21 / ((62 - arg0) / 41);
        return this.field234[this.field235++];
    }

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "(I)V", line = 120)
    public static final void method95(int arg0) {
        class36 var1 = class12.field140;
        synchronized (class12.field140) {
            class9.field100 = field244;
            class2.field17 = class31.field457;
            if (arg0 != -27731) {
                field240 = -69;
            }
            class12.field141 = class5.field54;
            class20.field229 = class26.field425;
            field243 = class31.field459;
            class33.field465 = field241;
            class26.field425 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "(I)I", line = 147)
    public final int method96(int arg0) {
        if (arg0 != 255) {
            field238 = null;
        }
        return this.field234[this.field235++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([BIBI)V", line = 188)
    public final void method97(byte[] arg0, int arg1, byte arg2, int arg3) {
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            arg0[var5] = this.field234[this.field235++];
        }
        if (arg2 <= 114) {
            this.method100(-77);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "(I)I", line = 204)
    public final int method98(int arg0) {
        if (arg0 == -2) {
            this.field235 += 2;
            return ((this.field234[this.field235 - 2] & 0xFF) << 8) + (this.field234[this.field235 - 1] & 0xFF);
        } else {
            return -64;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "(I)I", line = 217)
    public final int method99(int arg0) {
        if (arg0 == -16880) {
            this.field235 += 3;
            return ((this.field234[this.field235 - 2] & 0xFF) << 8) + ((this.field234[this.field235 - 3] & 0xFF) << 16) + (this.field234[this.field235 - 1] & 0xFF);
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "(I)I", line = 239)
    public final int method100(int arg0) {
        int var2 = 73 / ((arg0 - 16) / 63);
        this.field235 += 4;
        return (this.field234[this.field235 - 1] & 0xFF) + ((this.field234[this.field235 - 2] & 0xFF) << 8) + ((this.field234[this.field235 + -3] & 0xFF) << 16) + ((this.field234[this.field235 - 4] & 0xFF) << 24);
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(I)V", line = 264)
    public class21(int arg0) {
        this.field234 = class40.method260(5000, arg0);
        this.field235 = 0;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(II[II)V", line = 281)
    public final void method101(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field235;
        int var6 = (arg1 - arg3) / 8;
        this.field235 = arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -957401312;
            int var9 = this.method100(-90);
            int var10 = -1640531527;
            int var11 = this.method100(-63);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg2[var8 >>> 11 & 0x3] + var8;
                var8 -= var10;
                var9 -= (var11 >>> 5 ^ var11 << 4) + var11 ^ arg2[var8 & 0x3] + var8;
            }
            this.field235 -= 8;
            this.method93((byte) 109, var9);
            this.method93((byte) 95, var11);
        }
        if (arg0 >= -54) {
            this.field234 = null;
        }
        this.field235 = var5;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IB)V", line = 330)
    public final void method102(int arg0, byte arg1) {
        if (arg1 >= -35) {
            this.method99(-24);
        }
        this.field234[this.field235++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "([B)V", line = 345)
    public class21(byte[] arg0) {
        this.field235 = 0;
        this.field234 = arg0;
    }
}
