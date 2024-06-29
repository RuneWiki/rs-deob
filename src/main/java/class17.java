import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 extends class14 {

    @OriginalMember(owner = "mapview!i", name = "l", descriptor = "[B")
    public byte[] field252;

    @OriginalMember(owner = "mapview!i", name = "k", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "mapview!i", name = "m", descriptor = "Ln;")
    public static class26 field253 = class9.method82(255, "");

    @OriginalMember(owner = "mapview!i", name = "n", descriptor = "Ln;")
    public static class26 field254 = class9.method82(255, "Herbalist");

    @OriginalMember(owner = "mapview!i", name = "o", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "mapview!i", name = "q", descriptor = "Ln;")
    public static class26 field257 = class9.method82(255, "Vegetable Store");

    @OriginalMember(owner = "mapview!i", name = "r", descriptor = "Ln;")
    public static class26 field258 = class9.method82(255, "Cookery Shop");

    @OriginalMember(owner = "mapview!i", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field250;

    @OriginalMember(owner = "mapview!i", name = "p", descriptor = "[Lg;")
    public static class13[] field256;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BI[II)V", line = 5)
    public final void method120(byte arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field251;
        this.field251 = arg1;
        int var6 = (arg3 - arg1) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method127(255);
            int var9 = this.method127(255);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 - -arg2[var10 >>> 11 & 0x3];
                var10 -= var11;
                var8 -= var10 + arg2[var10 & 0x3] ^ (var9 >>> 5 ^ var9 << 4) + var9;
            }
            this.field251 -= 8;
            this.method132((byte) -108, var8);
            this.method132((byte) -122, var9);
        }
        this.field251 = var5;
        if (arg0 < 111) {
            field255 = -29;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(I)I", line = 54)
    public final int method121(int arg0) {
        this.field251 += 3;
        return arg0 > -96 ? -66 : ((this.field252[this.field251 - 2] & 0xFF) << 8) + ((this.field252[this.field251 - 3] & 0xFF) << 16) + (this.field252[this.field251 + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IJ)V", line = 70)
    public static final void method122(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 >= -98) {
                method122(-72, -54L);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BI)V", line = 86)
    public final void method123(byte arg0, int arg1) {
        if (arg0 != 17) {
            this.method120((byte) 108, 59, null, 123);
        }
        this.field252[this.field251++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(BLn;Ln;Lla;)[Lg;", line = 102)
    public static final class13[] method124(byte arg0, class26 arg1, class26 arg2, class23 arg3) {
        int var4 = arg3.method159((byte) 91, arg1);
        int var5 = arg3.method160(var4, arg2, -12935);
        return arg0 > -108 ? (class13[]) null : class10.method89(var4, var5, arg3, 0);
    }

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "(B)B", line = 116)
    public final byte method125(byte arg0) {
        if (arg0 >= -30) {
            this.method134((byte) -30);
        }
        return this.field252[this.field251++];
    }

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "(B)V", line = 135)
    public static final void method126(byte arg0) {
        if (++class4.field122 >= 64) {
            class11.field203++;
            class4.field122 = 0;
            if (class11.field203 < class34.field408 >> 6) {
                class35.method239((byte) 86);
            }
        }
        class18.field262 = (class4.field122 << 6) + class5.field135;
        int var1 = -97 % ((arg0 + 43) / 60);
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(I)I", line = 162)
    public final int method127(int arg0) {
        this.field251 += 4;
        return arg0 == 255 ? (this.field252[this.field251 - 1] & 0xFF) + ((this.field252[this.field251 - 4] & 0xFF) << 24) + ((this.field252[this.field251 + -3] & 0xFF) << 16) + ((this.field252[this.field251 + -2] & 0xFF) << 8) : -111;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([BIII)V", line = 177)
    public final void method128(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg2; var5 < arg1 + arg2; var5++) {
            arg0[var5] = this.field252[this.field251++];
        }
        if (arg3 != -2) {
            field256 = null;
        }
    }

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "(I)V", line = 243)
    public static void method129(int arg0) {
        field253 = null;
        field257 = null;
        field254 = null;
        field256 = null;
        field250 = null;
        field258 = null;
        int var1 = 125 % ((arg0 - 62) / 43);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(Z)I", line = 262)
    public final int method130(boolean arg0) {
        if (arg0) {
            this.method120((byte) 69, -36, null, -58);
        }
        return this.field252[this.field251++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(IZILla;)Lk;", line = 295)
    public static final class20 method131(int arg0, boolean arg1, int arg2, class23 arg3) {
        if (!arg1) {
            method124((byte) -16, null, null, null);
        }
        return class9.method84(arg0, (byte) -9, arg2, arg3) ? class8.method78(127) : null;
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "(I)V", line = 307)
    public class17(int arg0) {
        this.field252 = class18.method135(arg0, (byte) 91);
        this.field251 = 0;
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(BI)V", line = 331)
    public final void method132(byte arg0, int arg1) {
        this.field252[this.field251++] = (byte) (arg1 >> 24);
        this.field252[this.field251++] = (byte) (arg1 >> 16);
        this.field252[this.field251++] = (byte) (arg1 >> 8);
        this.field252[this.field251++] = (byte) arg1;
        int var3 = -92 % ((-arg0 - 57) / 49);
    }

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "(Z)Ln;", line = 346)
    public final class26 method133(boolean arg0) {
        if (arg0) {
            field253 = null;
        }
        int var2 = this.field251;
        while (this.field252[this.field251++] != 0) {
        }
        return class35.method236(0, this.field251 - var2 - 1, var2, this.field252);
    }

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "(B)I", line = 359)
    public final int method134(byte arg0) {
        this.field251 += 2;
        if (arg0 < 27) {
            field257 = null;
        }
        return ((this.field252[this.field251 - 2] & 0xFF) << 8) + (this.field252[this.field251 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!i", name = "<init>", descriptor = "([B)V", line = 373)
    public class17(byte[] arg0) {
        this.field252 = arg0;
        this.field251 = 0;
    }
}
