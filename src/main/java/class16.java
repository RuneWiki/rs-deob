import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class16 extends class34 {

    @OriginalMember(owner = "mapview!ia", name = "n", descriptor = "I")
    public int field145 = 0;

    @OriginalMember(owner = "mapview!ia", name = "m", descriptor = "[B")
    public byte[] field144;

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "Ll;")
    public static class21 field146 = class28.method185(-20839, "Transportation");

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "Ll;")
    public static class21 field147 = class28.method185(-20839, "b12_full");

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "[I")
    public static int[] field149 = new int[128];

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "Ll;")
    public static class21 field148 = class28.method185(-20839, "Bank");

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(I)Ll;", line = 16)
    public final class21 method59(int arg0) {
        if (arg0 == -1) {
            int var2 = this.field145;
            while (this.field144[this.field145++] != 0) {
            }
            return class13.method41(this.field145 - var2 - 1, (byte) -95, this.field144, var2);
        } else {
            return (class21) null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IBI[B)V", line = 42)
    public final void method60(int arg0, byte arg1, int arg2, byte[] arg3) {
        for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
            arg3[var5] = this.field144[this.field145++];
        }
        if (arg1 != -108) {
            field146 = null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(I)V", line = 76)
    public static void method61(int arg0) {
        field148 = null;
        if (arg0 != -1841510392) {
            method62((byte) 27);
        }
        field147 = null;
        field149 = null;
        field146 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(B)V", line = 95)
    public static final void method62(byte arg0) {
        if (arg0 != -113) {
            field146 = null;
        }
        if (class5.field38 != null) {
            class6 var1 = class5.field38;
            synchronized (class5.field38) {
                class5.field38 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([IIBI)V", line = 129)
    public final void method63(int[] arg0, int arg1, byte arg2, int arg3) {
        int var5 = (arg3 - arg1) / 8;
        int var6 = this.field145;
        this.field145 = arg1;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = -957401312;
            int var9 = this.method67(true);
            int var10 = this.method67(true);
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var10 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var8 - -arg0[var8 >>> 11 & 0x3];
                var8 -= var11;
                var9 -= arg0[var8 & 0x3] + var8 ^ (var10 << 4 ^ var10 >>> 5) + var10;
            }
            this.field145 -= 8;
            this.method70(-1407639432, var9);
            this.method70(arg2 ^ 0xAC19203E, var10);
        }
        this.field145 = var6;
        if (arg2 != 70) {
            this.field145 = 7;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "(I)I", line = 209)
    public final int method64(int arg0) {
        if (arg0 != 0) {
            field148 = null;
        }
        return this.field144[this.field145++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(B)I", line = 226)
    public final int method65(byte arg0) {
        this.field145 += 2;
        return arg0 == -39 ? ((this.field144[this.field145 - 2] & 0xFF) << 8) + (this.field144[this.field145 - 1] & 0xFF) : 74;
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(B)B", line = 239)
    public final byte method66(byte arg0) {
        if (arg0 > -15) {
            field148 = null;
        }
        return this.field144[this.field145++];
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Z)I", line = 257)
    public final int method67(boolean arg0) {
        if (!arg0) {
            this.field145 = -123;
        }
        this.field145 += 4;
        return ((this.field144[this.field145 - 3] & 0xFF) << 16) + (((this.field144[this.field145 - 4] & 0xFF) << 24) - (-((this.field144[this.field145 - 2] & 0xFF) << 8) - (this.field144[this.field145 - 1] & 0xFF)));
    }

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "(I)I", line = 268)
    public final int method68(int arg0) {
        if (arg0 != -21060) {
            field149 = null;
        }
        this.field145 += 3;
        return ((this.field144[this.field145 - 3] & 0xFF) << 16) - (-((this.field144[this.field145 - 2] & 0xFF) << 8) - (this.field144[this.field145 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(IB)V", line = 279)
    public final void method69(int arg0, byte arg1) {
        if (arg1 != 59) {
            field148 = null;
        }
        this.field144[this.field145++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II)V", line = 293)
    public final void method70(int arg0, int arg1) {
        this.field144[this.field145++] = (byte) (arg1 >> arg0);
        this.field144[this.field145++] = (byte) (arg1 >> 16);
        this.field144[this.field145++] = (byte) (arg1 >> 8);
        this.field144[this.field145++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(I)V", line = 302)
    public class16(int arg0) {
        this.field144 = class10.method29(-5001, arg0);
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([B)V", line = 323)
    public class16(byte[] arg0) {
        this.field144 = arg0;
    }
}
