import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class19 extends class6 {

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "[B")
    public byte[] field263;

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "Lh;")
    public static class15 field264 = class18.method153("Requesting ", 1);

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Lja;")
    public static class20 field262 = new class20();

    @OriginalMember(owner = "mapview!j", name = "w", descriptor = "Lh;")
    public static class15 field272 = class18.method153("Guide", 1);

    @OriginalMember(owner = "mapview!j", name = "x", descriptor = "Lh;")
    public static class15 field273 = class18.method153("Herbalist", 1);

    @OriginalMember(owner = "mapview!j", name = "r", descriptor = "Lh;")
    public static class15 field267 = class18.method153("Find", 1);

    @OriginalMember(owner = "mapview!j", name = "y", descriptor = "I")
    public static volatile int field274 = 0;

    @OriginalMember(owner = "mapview!j", name = "A", descriptor = "Lh;")
    public static class15 field276 = class18.method153("Windmill", 1);

    @OriginalMember(owner = "mapview!j", name = "B", descriptor = "Lh;")
    public static class15 field277 = class18.method153("u_pass", 1);

    @OriginalMember(owner = "mapview!j", name = "z", descriptor = "Lh;")
    public static class15 field275 = class18.method153("Key", 1);

    @OriginalMember(owner = "mapview!j", name = "u", descriptor = "I")
    public static volatile int field270 = -1;

    @OriginalMember(owner = "mapview!j", name = "s", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "mapview!j", name = "t", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "mapview!j", name = "v", descriptor = "Lka;")
    public static class22 field271;

    @OriginalMember(owner = "mapview!j", name = "q", descriptor = "Lba;")
    public static class4 field266;

    @OriginalMember(owner = "mapview!j", name = "C", descriptor = "[Lka;")
    public static class22[] field278;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(II)V", line = 14)
    public final void method159(int arg0, int arg1) {
        this.field263[this.field261++] = (byte) (arg0 >> 24);
        this.field263[this.field261++] = (byte) (arg0 >> 16);
        this.field263[this.field261++] = (byte) (arg0 >> 8);
        this.field263[this.field261++] = (byte) arg0;
        int var3 = 112 % ((20 - arg1) / 51);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)Lh;", line = 53)
    public final class15 method160(byte arg0) {
        if (arg0 != -119) {
            field270 = 21;
        }
        int var2 = this.field261;
        while (this.field263[this.field261++] != 0) {
        }
        return class36.method239(var2, this.field261 - var2 - 1, this.field263, -32765);
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(B)B", line = 67)
    public static final byte method161(byte arg0) {
        if (arg0 == 49) {
            return class31.field398 == null ? 0 : class31.field398[class15.field220];
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(B)I", line = 96)
    public final int method162(byte arg0) {
        this.field261 += 4;
        if (arg0 < 113) {
            method171(null, 57);
        }
        return ((this.field263[this.field261 - 4] & 0xFF) << 24) + (this.field263[this.field261 - 1] & 0xFF) + ((this.field263[this.field261 - 2] & 0xFF) << 8) + ((this.field263[this.field261 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I[BII)V", line = 110)
    private final void method163(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 >= -54) {
            this.method159(123, 75);
        }
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field263[this.field261++];
        }
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(B)I", line = 140)
    public final int method164(byte arg0) {
        if (arg0 != 62) {
            method161((byte) 63);
        }
        return this.field263[this.field261++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "(B)B", line = 151)
    public final byte method165(byte arg0) {
        int var2 = 80 % ((arg0 - 50) / 35);
        return this.field263[this.field261++];
    }

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "(I)I", line = 164)
    public final int method166(int arg0) {
        this.field261 += arg0;
        return ((this.field263[this.field261 - 2] & 0xFF) << 8) + (this.field263[this.field261 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(II[II)V", line = 178)
    public final void method167(int arg0, int arg1, int[] arg2, int arg3) {
        if (arg3 != 65280) {
            method169(80);
        }
        int var5 = (arg0 - arg1) / 8;
        int var6 = this.field261;
        this.field261 = arg1;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method162((byte) 114);
            int var9 = -957401312;
            int var10 = this.method162((byte) 124);
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var10 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg2[var9 >>> 11 & 0x3] + var9;
                var9 -= var11;
                var8 -= arg2[var9 & 0x3] + var9 ^ (var10 >>> 5 ^ var10 << 4) - -var10;
            }
            this.field261 -= 8;
            this.method159(var8, 72);
            this.method159(var10, 111);
        }
        this.field261 = var6;
    }

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "(B)I", line = 224)
    public final int method168(byte arg0) {
        this.field261 += 3;
        if (arg0 != 44) {
            this.method166(-55);
        }
        return ((this.field263[this.field261 - 2] & 0xFF) << 8) + (((this.field263[this.field261 - 3] & 0xFF) << 16) + (this.field263[this.field261 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "(I)V", line = 249)
    public static void method169(int arg0) {
        field271 = null;
        field276 = null;
        if (arg0 != 16711680) {
            method161((byte) -73);
        }
        field264 = null;
        field272 = null;
        field277 = null;
        field275 = null;
        field262 = null;
        field273 = null;
        field278 = null;
        field267 = null;
        field266 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "(I)V", line = 280)
    public class19(int arg0) {
        this.field261 = 0;
        this.field263 = class31.method208(arg0, (byte) -86);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ZI)V", line = 291)
    public final void method170(boolean arg0, int arg1) {
        this.field263[this.field261++] = (byte) arg1;
        if (!arg0) {
            field265 = -91;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([BI)[B", line = 309)
    public static final byte[] method171(byte[] arg0, int arg1) {
        if (arg1 != 1) {
            method161((byte) 122);
        }
        class19 var2 = new class19(arg0);
        int var3 = var2.method164((byte) 62);
        int var4 = var2.method162((byte) 127);
        if (var4 < 0 || class25.field337 != 0 && var4 > class25.field337) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var9 = new byte[var4];
            var2.method163(0, var9, arg1 ^ 0xFFFFFFC7, var4);
            return var9;
        } else {
            int var5 = var2.method162((byte) 122);
            if (var5 < 0 || class25.field337 != 0 && class25.field337 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class3.method32(var6, var5, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var7.readFully(var6);
                    var7.close();
                } catch (IOException var10) {
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "([B)V", line = 372)
    public class19(byte[] arg0) {
        this.field263 = arg0;
        this.field261 = 0;
    }
}
