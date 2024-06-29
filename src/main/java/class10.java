import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class10 extends class12 {

    @OriginalMember(owner = "mapview!fa", name = "A", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "mapview!fa", name = "D", descriptor = "[B")
    public byte[] field122;

    @OriginalMember(owner = "mapview!fa", name = "u", descriptor = "Lna;")
    public static class26 field113 = class6.method40("100(U", 48);

    @OriginalMember(owner = "mapview!fa", name = "z", descriptor = "Lna;")
    public static class26 field118 = class6.method40("Pub)4Bar", 48);

    @OriginalMember(owner = "mapview!fa", name = "r", descriptor = "Lna;")
    public static class26 field110 = class6.method40("Hunter Store", 48);

    @OriginalMember(owner = "mapview!fa", name = "B", descriptor = "Lna;")
    public static class26 field120 = class6.method40("mapfunction", 48);

    @OriginalMember(owner = "mapview!fa", name = "C", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "mapview!fa", name = "F", descriptor = "Lna;")
    public static class26 field124 = class6.method40("world", 48);

    @OriginalMember(owner = "mapview!fa", name = "w", descriptor = "Z")
    public static boolean field115 = false;

    @OriginalMember(owner = "mapview!fa", name = "E", descriptor = "Lna;")
    public static class26 field123 = class6.method40(" map", 48);

    @OriginalMember(owner = "mapview!fa", name = "x", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "mapview!fa", name = "y", descriptor = "Lra;")
    public static class33 field117;

    @OriginalMember(owner = "mapview!fa", name = "t", descriptor = "Lda;")
    public static class8 field112;

    @OriginalMember(owner = "mapview!fa", name = "v", descriptor = "Lda;")
    public static class8 field114;

    @OriginalMember(owner = "mapview!fa", name = "s", descriptor = "[I")
    public static int[] field111;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I[BII)V", line = 5)
    public final void method61(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 == -3) {
            for (int var5 = arg2; var5 < arg0 + arg2; var5++) {
                arg1[var5] = this.field122[this.field119++];
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(II)V", line = 21)
    public final void method62(int arg0, int arg1) {
        this.field122[this.field119++] = (byte) (arg1 >> 24);
        this.field122[this.field119++] = (byte) (arg1 >> 16);
        this.field122[this.field119++] = (byte) (arg1 >> 8);
        this.field122[this.field119++] = (byte) arg1;
        if (arg0 != -2) {
            method64(-80);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(I)Lna;", line = 41)
    public final class26 method63(int arg0) {
        if (arg0 != 15596) {
            field112 = null;
        }
        int var2 = this.field119;
        while (this.field122[this.field119++] != 0) {
        }
        return class9.method56(arg0 - 15587, var2, this.field122, this.field119 - var2 - 1);
    }

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "(I)[Lq;", line = 64)
    public static final class30[] method64(int arg0) {
        class30[] var1 = new class30[class34.field444];
        for (int var2 = 0; var2 < class34.field444; var2++) {
            class30 var3 = var1[var2] = new class30();
            var3.field396 = class9.field102[var2];
            var3.field397 = class4.field46[var2];
            var3.field398 = class33.field431[var2];
            var3.field399 = class19.field209[var2];
            int var4 = var3.field399 * var3.field398;
            byte[] var5 = class11.field136[var2];
            var3.field395 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field395[var6] = class8.field99[class8.method51(255, var5[var6])];
            }
        }
        if (arg0 == 25136) {
            class18.method114((byte) 75);
            return var1;
        } else {
            return (class30[]) null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([IIII)V", line = 133)
    public final void method65(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field119;
        this.field119 = arg3;
        int var6 = (arg2 - arg3) / 8;
        if (arg1 < 59) {
            this.method66(-105);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method69((byte) 116);
            int var9 = this.method69((byte) 100);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ var10 - -arg0[var10 >>> 11 & 0x3];
                var10 -= var11;
                var8 -= arg0[var10 & 0x3] + var10 ^ (var9 >>> 5 ^ var9 << 4) + var9;
            }
            this.field119 -= 8;
            this.method62(-2, var8);
            this.method62(-2, var9);
        }
        this.field119 = var5;
    }

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "(I)I", line = 182)
    public final int method66(int arg0) {
        int var2 = -69 % ((arg0 + 16) / 48);
        return this.field122[this.field119++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z)V", line = 209)
    public static void method67(boolean arg0) {
        field120 = null;
        field112 = null;
        if (!arg0) {
            method67(true);
        }
        field124 = null;
        field113 = null;
        field114 = null;
        field111 = null;
        field123 = null;
        field117 = null;
        field110 = null;
        field118 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)I", line = 230)
    public final int method68(byte arg0) {
        this.field119 += 2;
        int var2 = -23 / ((arg0 - 26) / 55);
        return ((this.field122[this.field119 - 2] & 0xFF) << 8) + (this.field122[this.field119 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(B)I", line = 245)
    public final int method69(byte arg0) {
        if (arg0 <= 77) {
            this.method69((byte) 125);
        }
        this.field119 += 4;
        return ((this.field122[this.field119 - 4] & 0xFF) << 24) + ((this.field122[this.field119 - 3] & 0xFF) << 16) + ((this.field122[this.field119 + -2] & 0xFF) << 8) + (this.field122[this.field119 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "(I)B", line = 325)
    public final byte method70(int arg0) {
        return arg0 == -1 ? this.field122[this.field119++] : -120;
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "(I)V", line = 337)
    public class10(int arg0) {
        this.field119 = 0;
        this.field122 = class18.method113(100, arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "<init>", descriptor = "([B)V", line = 347)
    public class10(byte[] arg0) {
        this.field122 = arg0;
        this.field119 = 0;
    }

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "(I)I", line = 363)
    public final int method71(int arg0) {
        if (arg0 != -7782) {
            field114 = null;
        }
        this.field119 += 3;
        return ((this.field122[this.field119 - 3] & 0xFF) << 16) - (-((this.field122[this.field119 - 2] & 0xFF) << 8) - (this.field122[this.field119 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(II)V", line = 377)
    public final void method72(int arg0, int arg1) {
        if (arg1 <= -8) {
            this.field122[this.field119++] = (byte) arg0;
        }
    }
}
