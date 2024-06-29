import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class20 extends class36 {

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "I")
    public int field206 = 0;

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "[B")
    public byte[] field205;

    @OriginalMember(owner = "mapview!ja", name = "r", descriptor = "I")
    public static int field207 = 0;

    @OriginalMember(owner = "mapview!ja", name = "t", descriptor = "Lr;")
    public static class33 field209 = class29.method192("Find", (byte) 126);

    @OriginalMember(owner = "mapview!ja", name = "u", descriptor = "Lr;")
    public static class33 field210 = class29.method192("map", (byte) 126);

    @OriginalMember(owner = "mapview!ja", name = "n", descriptor = "Lr;")
    public static class33 field203 = class29.method192("Silver Shop", (byte) 126);

    @OriginalMember(owner = "mapview!ja", name = "w", descriptor = "Lr;")
    public static class33 field212 = class29.method192("Herbalist", (byte) 126);

    @OriginalMember(owner = "mapview!ja", name = "y", descriptor = "Lr;")
    public static class33 field214 = class29.method192("Legende", (byte) 126);

    @OriginalMember(owner = "mapview!ja", name = "x", descriptor = "Lr;")
    public static class33 field213 = class29.method192("Overview", (byte) 126);

    @OriginalMember(owner = "mapview!ja", name = "s", descriptor = "Z")
    public static boolean field208 = false;

    @OriginalMember(owner = "mapview!ja", name = "z", descriptor = "I")
    public static int field215 = -1;

    @OriginalMember(owner = "mapview!ja", name = "o", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "mapview!ja", name = "v", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(I)B", line = 8)
    public final byte method124(int arg0) {
        int var2 = -71 / ((59 - arg0) / 46);
        return this.field205[this.field206++];
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(ILr;Lc;Lr;)[Le;", line = 26)
    public static final class9[] method125(int arg0, class33 arg1, class5 arg2, class33 arg3) {
        if (arg0 != 11202) {
            field208 = false;
        }
        int var4 = arg2.method35(false, arg3);
        int var5 = arg2.method31(arg1, var4, -2);
        return class14.method98(var4, var5, arg2, (byte) 61);
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)Lr;", line = 54)
    public final class33 method126(byte arg0) {
        int var2 = this.field206;
        while (this.field205[this.field206++] != 0) {
        }
        int var3 = 72 % ((arg0 + 47) / 36);
        return class17.method107(-24344, this.field205, var2, this.field206 - var2 - 1);
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(B)I", line = 86)
    public final int method127(byte arg0) {
        if (arg0 != -89) {
            field210 = null;
        }
        this.field206 += 3;
        return (this.field205[this.field206 - 1] & 0xFF) + ((this.field205[this.field206 - 2] & 0xFF) << 8) + ((this.field205[this.field206 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(I)I", line = 116)
    public final int method128(int arg0) {
        if (arg0 != 3) {
            this.method126((byte) -22);
        }
        this.field206 += 4;
        return ((this.field205[this.field206 - 3] & 0xFF) << 16) + ((this.field205[this.field206 - 4] << 24 & 0xFF000000) + (this.field205[this.field206 - 2] << 8 & 0xFF00)) + (this.field205[this.field206 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "(I)I", line = 141)
    public final int method129(int arg0) {
        this.field206 += arg0;
        return ((this.field205[this.field206 - 2] & 0xFF) << 8) + (this.field205[this.field206 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(ZI)V", line = 188)
    public final void method130(boolean arg0, int arg1) {
        if (!arg0) {
            this.field205[this.field206++] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IB)V", line = 201)
    public final void method131(int arg0, byte arg1) {
        this.field205[this.field206++] = (byte) (arg0 >> 24);
        if (arg1 >= 30) {
            this.field205[this.field206++] = (byte) (arg0 >> 16);
            this.field205[this.field206++] = (byte) (arg0 >> 8);
            this.field205[this.field206++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II[II)V", line = 215)
    public final void method132(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field206;
        int var6 = (arg0 - arg1) / 8;
        this.field206 = arg1;
        int var7 = 0;
        if (arg3 != -1) {
            return;
        }
        while (var7 < var6) {
            int var8 = this.method128(3);
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = this.method128(3);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= var9 + arg2[var9 >>> 11 & 0x32400003] ^ (var8 << 4 ^ var8 >>> 5) + var8;
                var9 -= var10;
                var8 -= arg2[var9 & 0x3] + var9 ^ (var11 << 4 ^ var11 >>> 5) - -var11;
            }
            this.field206 -= 8;
            this.method131(var8, (byte) 37);
            this.method131(var11, (byte) 71);
            var7++;
        }
        this.field206 = var5;
    }

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "(I)I", line = 266)
    public final int method133(int arg0) {
        if (arg0 != 23789) {
            this.method131(-107, (byte) 63);
        }
        return this.field205[this.field206++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I[BII)V", line = 280)
    public final void method134(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg2; var5 < arg2 + arg0; var5++) {
            arg1[var5] = this.field205[this.field206++];
        }
        if (arg3 != 3) {
            this.method131(-42, (byte) -64);
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "(I)V", line = 299)
    public class20(int arg0) {
        this.field205 = class24.method160(arg0, (byte) 51);
    }

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(B)V", line = 313)
    public static void method135(byte arg0) {
        if (arg0 != -74) {
            field214 = null;
        }
        field210 = null;
        field214 = null;
        field213 = null;
        field209 = null;
        field212 = null;
        field203 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([B)V", line = 331)
    public class20(byte[] arg0) {
        this.field205 = arg0;
    }
}
