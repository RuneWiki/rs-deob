import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class18 extends class7 {

    @OriginalMember(owner = "mapview!ia", name = "s", descriptor = "[B")
    public byte[] field204;

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "mapview!ia", name = "t", descriptor = "I")
    public static int field205 = 50;

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "Lt;")
    public static class35 field202 = class3.method28(false, "loc)3dat");

    @OriginalMember(owner = "mapview!ia", name = "u", descriptor = "[[B")
    public static byte[][] field206 = new byte[250][];

    @OriginalMember(owner = "mapview!ia", name = "w", descriptor = "Lt;")
    public static class35 field208 = class3.method28(false, "details)3dat");

    @OriginalMember(owner = "mapview!ia", name = "v", descriptor = "Lt;")
    public static class35 field207 = class3.method28(false, "Short)2cut");

    @OriginalMember(owner = "mapview!ia", name = "y", descriptor = "Lt;")
    public static class35 field210 = class3.method28(false, "Skirt Shop");

    @OriginalMember(owner = "mapview!ia", name = "x", descriptor = "Lt;")
    public static class35 field209 = class3.method28(false, "world");

    @OriginalMember(owner = "mapview!ia", name = "A", descriptor = "Lt;")
    public static class35 field212 = class3.method28(false, "sprites");

    @OriginalMember(owner = "mapview!ia", name = "C", descriptor = "Lt;")
    public static class35 field214 = class3.method28(false, "u_pass");

    @OriginalMember(owner = "mapview!ia", name = "z", descriptor = "[I")
    public static int[] field211;

    @OriginalMember(owner = "mapview!ia", name = "B", descriptor = "[Lja;")
    public static class20[] field213;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([IIII)V", line = 9)
    public final void method104(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field203;
        this.field203 = arg3;
        int var6 = (arg1 - arg3) / 8;
        if (arg2 != -920074456) {
            field207 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -957401312;
            int var9 = this.method109((byte) 112);
            int var10 = -1640531527;
            int var11 = this.method109((byte) 83);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= arg0[var8 >>> 11 & 0x3] + var8 ^ (var9 >>> 5 ^ var9 << 4) - -var9;
                var8 -= var10;
                var9 -= (var11 >>> 5 ^ var11 << 4) + var11 ^ var8 - -arg0[var8 & 0x3];
            }
            this.field203 -= 8;
            this.method107(var9, 6729);
            this.method107(var11, 6729);
        }
        this.field203 = var5;
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "(I)V", line = 84)
    public class18(int arg0) {
        this.field204 = class23.method134(true, arg0);
        this.field203 = 0;
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(B)B", line = 98)
    public final byte method105(byte arg0) {
        if (arg0 < 96) {
            this.method107(34, 95);
        }
        return this.field204[this.field203++];
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(B)V", line = 120)
    public static void method106(byte arg0) {
        field202 = null;
        field214 = null;
        field213 = null;
        field207 = null;
        field212 = null;
        field209 = null;
        field208 = null;
        if (arg0 > -73) {
            field205 = -29;
        }
        field210 = null;
        field211 = null;
        field206 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II)V", line = 146)
    public final void method107(int arg0, int arg1) {
        this.field204[this.field203++] = (byte) (arg0 >> 24);
        this.field204[this.field203++] = (byte) (arg0 >> 16);
        this.field204[this.field203++] = (byte) (arg0 >> 8);
        this.field204[this.field203++] = (byte) arg0;
        if (arg1 != 6729) {
            field208 = null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(BI)V", line = 159)
    public final void method108(byte arg0, int arg1) {
        if (arg0 == -61) {
            this.field204[this.field203++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "e", descriptor = "(B)I", line = 175)
    public final int method109(byte arg0) {
        this.field203 += 4;
        int var2 = -123 % ((-arg0 - 50) / 41);
        return ((this.field204[this.field203 - 3] & 0xFF) << 16) + (this.field204[this.field203 - 1] & 0xFF) + ((this.field204[this.field203 + -4] & 0xFF) << 24) + ((this.field204[this.field203 + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I)I", line = 189)
    public final int method110(int arg0) {
        if (arg0 < 50) {
            field214 = null;
        }
        return this.field204[this.field203++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)I", line = 205)
    public final int method111(int arg0) {
        this.field203 += 3;
        if (arg0 != 16711680) {
            field213 = null;
        }
        return (this.field204[this.field203 - 1] & 0xFF) + (((this.field204[this.field203 - 3] & 0xFF) << 16) + ((this.field204[this.field203 - 2] & 0xFF) << 8));
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(I[BII)V", line = 241)
    public final void method112(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg3; var5 < arg2 + arg3; var5++) {
            arg1[var5] = this.field204[this.field203++];
        }
        if (arg0 != -2) {
            method115(34);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "f", descriptor = "(B)I", line = 268)
    public final int method113(byte arg0) {
        this.field203 += 2;
        int var2 = -22 % ((85 - arg0) / 32);
        return ((this.field204[this.field203 - 2] & 0xFF) << 8) + (this.field204[this.field203 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ia", name = "c", descriptor = "(I)Lt;", line = 290)
    public final class35 method114(int arg0) {
        if (arg0 == -1) {
            int var2 = this.field203;
            while (this.field204[this.field203++] != 0) {
            }
            return class35.method221(this.field204, (byte) -101, var2, this.field203 - var2 - 1);
        } else {
            return (class35) null;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "d", descriptor = "(I)V", line = 304)
    public static final void method115(int arg0) {
        class24.field275 = null;
        class34.field426 = null;
        class30.field341 = null;
        class36.field448 = null;
        if (arg0 != -1) {
            method115(-66);
        }
        class2.field67 = null;
        class13.field174 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "([B)V", line = 317)
    public class18(byte[] arg0) {
        this.field203 = 0;
        this.field204 = arg0;
    }
}
