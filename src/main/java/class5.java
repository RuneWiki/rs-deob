import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!c")
public class class5 extends class29 {

    @OriginalMember(owner = "mapview!c", name = "s", descriptor = "I")
    public int field64;

    @OriginalMember(owner = "mapview!c", name = "u", descriptor = "[B")
    public byte[] field66;

    @OriginalMember(owner = "mapview!c", name = "m", descriptor = "Lv;")
    public static class40 field58 = class24.method170(" ", (byte) -76);

    @OriginalMember(owner = "mapview!c", name = "l", descriptor = "I")
    public static int field57 = -1;

    @OriginalMember(owner = "mapview!c", name = "n", descriptor = "Lv;")
    public static class40 field59 = class24.method170("Scimitar Shop", (byte) 92);

    @OriginalMember(owner = "mapview!c", name = "o", descriptor = "Lv;")
    public static class40 field60 = class24.method170("Silk Trader", (byte) -76);

    @OriginalMember(owner = "mapview!c", name = "j", descriptor = "Lv;")
    public static class40 field55 = class24.method170("Slayer Master", (byte) -96);

    @OriginalMember(owner = "mapview!c", name = "r", descriptor = "I")
    public static int field63 = 1;

    @OriginalMember(owner = "mapview!c", name = "q", descriptor = "[I")
    public static int[] field62 = new int[128];

    @OriginalMember(owner = "mapview!c", name = "t", descriptor = "Lv;")
    public static class40 field65 = class24.method170("Platelegs Shop", (byte) 118);

    @OriginalMember(owner = "mapview!c", name = "p", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "mapview!c", name = "v", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "mapview!c", name = "k", descriptor = "[Lu;")
    public static class38[] field56;

    @OriginalMember(owner = "mapview!c", name = "b", descriptor = "(I)I", line = 26)
    public final int method28(int arg0) {
        int var2 = -17 / ((arg0 - 1) / 51);
        return this.field66[this.field64++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(I)Lv;", line = 46)
    public final class40 method29(int arg0) {
        if (arg0 != 408664184) {
            field62 = null;
        }
        int var2 = this.field64;
        while (this.field66[this.field64++] != 0) {
        }
        return class37.method222(-111, var2, this.field66, this.field64 - var2 - 1);
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BI[II)V", line = 104)
    public final void method30(byte arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field64;
        if (arg0 != 58) {
            field62 = null;
        }
        this.field64 = arg3;
        int var6 = (arg1 - arg3) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method33(-16411);
            int var9 = this.method33(-16411);
            int var10 = -1640531527;
            int var11 = -957401312;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= arg2[var11 >>> 11 & 0x3] + var11 ^ (var8 >>> 5 ^ var8 << 4) - -var8;
                var11 -= var10;
                var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg2[var11 & 0x3] + var11;
            }
            this.field64 -= 8;
            this.method37(0, var8);
            this.method37(0, var9);
        }
        this.field64 = var5;
    }

    @OriginalMember(owner = "mapview!c", name = "d", descriptor = "(I)I", line = 173)
    public final int method31(int arg0) {
        this.field64 += 2;
        return arg0 == -14467 ? ((this.field66[this.field64 - 2] & 0xFF) << 8) + (this.field66[this.field64 - 1] & 0xFF) : -36;
    }

    @OriginalMember(owner = "mapview!c", name = "c", descriptor = "(B)V", line = 188)
    public static void method32(byte arg0) {
        field55 = null;
        field59 = null;
        field62 = null;
        field65 = null;
        if (arg0 != 95) {
            method32((byte) -111);
        }
        field60 = null;
        field58 = null;
        field56 = null;
    }

    @OriginalMember(owner = "mapview!c", name = "e", descriptor = "(I)I", line = 204)
    public final int method33(int arg0) {
        if (arg0 != -16411) {
            this.method33(-116);
        }
        this.field64 += 4;
        return ((this.field66[this.field64 - 4] & 0xFF) << 24) + (this.field66[this.field64 - 1] & 0xFF) + ((this.field66[this.field64 + -2] & 0xFF) << 8) + ((this.field66[this.field64 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!c", name = "f", descriptor = "(I)B", line = 232)
    public final byte method34(int arg0) {
        if (arg0 != 826431280) {
            this.method38(true);
        }
        return this.field66[this.field64++];
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(III[B)V", line = 259)
    public final void method35(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != 11202) {
            this.method34(108);
        }
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            arg3[var5] = this.field66[this.field64++];
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(BI)V", line = 291)
    public final void method36(byte arg0, int arg1) {
        this.field66[this.field64++] = (byte) arg1;
        if (arg0 > 0) {
            field59 = null;
        }
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(II)V", line = 302)
    public final void method37(int arg0, int arg1) {
        this.field66[this.field64++] = (byte) (arg1 >> 24);
        this.field66[this.field64++] = (byte) (arg1 >> 16);
        if (arg0 != 0) {
            this.method29(14);
        }
        this.field66[this.field64++] = (byte) (arg1 >> 8);
        this.field66[this.field64++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "(I)V", line = 314)
    public class5(int arg0) {
        this.field64 = 0;
        this.field66 = class19.method116((byte) 127, arg0);
    }

    @OriginalMember(owner = "mapview!c", name = "<init>", descriptor = "([B)V", line = 323)
    public class5(byte[] arg0) {
        this.field66 = arg0;
        this.field64 = 0;
    }

    @OriginalMember(owner = "mapview!c", name = "a", descriptor = "(Z)I", line = 335)
    public final int method38(boolean arg0) {
        this.field64 += 3;
        if (arg0) {
            this.method35(-62, -48, 49, null);
        }
        return ((this.field66[this.field64 - 2] & 0xFF) << 8) + ((this.field66[this.field64 - 3] & 0xFF) << 16) + (this.field66[this.field64 + -1] & 0xFF);
    }
}
