import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 extends class26 {

    @OriginalMember(owner = "mapview!ua", name = "o", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "mapview!ua", name = "s", descriptor = "[B")
    public byte[] field497;

    @OriginalMember(owner = "mapview!ua", name = "r", descriptor = "La;")
    public static class1 field496 = class3.method36("Please wait)3)3)3 Rendering Map", -96);

    @OriginalMember(owner = "mapview!ua", name = "m", descriptor = "La;")
    public static class1 field491 = class3.method36("100(U", -92);

    @OriginalMember(owner = "mapview!ua", name = "v", descriptor = "La;")
    public static class1 field500 = class3.method36("Hunter Store", -112);

    @OriginalMember(owner = "mapview!ua", name = "n", descriptor = "La;")
    public static class1 field492 = class3.method36("Spice Shop", -95);

    @OriginalMember(owner = "mapview!ua", name = "w", descriptor = "La;")
    public static class1 field501 = class3.method36("", -100);

    @OriginalMember(owner = "mapview!ua", name = "t", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "mapview!ua", name = "q", descriptor = "J")
    public static long field495;

    @OriginalMember(owner = "mapview!ua", name = "p", descriptor = "[B")
    public static byte[] field494;

    @OriginalMember(owner = "mapview!ua", name = "u", descriptor = "[I")
    public static int[] field499;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "(I)I", line = 9)
    public final int method245(int arg0) {
        return arg0 > -101 ? 84 : this.field497[this.field493++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(III)B", line = 51)
    public static final byte method246(int arg0, int arg1, int arg2) {
        int var3 = arg1 >> 6;
        int var4 = arg2 >> 6;
        if (arg0 != 16711680) {
            method246(-93, 94, 13);
        }
        if (class35.field473[var4][var3] == null) {
            return 0;
        } else if (class35.field473[var4][var3].field509 == null) {
            return class35.field473[var4][var3].field517;
        } else {
            return class35.field473[var4][var3].field509[(arg2 & 0xFC0) + arg1 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "(I)[Ls;", line = 93)
    public static final class34[] method247(int arg0) {
        int var1 = -128 / ((20 - arg0) / 45);
        class34[] var2 = new class34[class30.field409];
        for (int var3 = 0; var3 < class30.field409; var3++) {
            class34 var4 = new class34();
            var4.field472 = class31.field421;
            var4.field471 = class4.field40;
            var4.field467 = class2.field22[var3];
            var4.field466 = class30.field411[var3];
            var4.field465 = class29.field403[var3];
            var4.field470 = class30.field410[var3];
            var4.field468 = class27.field378;
            var4.field469 = class13.field123[var3];
            var2[var3] = var4;
        }
        class25.method171((byte) 112);
        return var2;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I[BIB)V", line = 127)
    public final void method248(int arg0, byte[] arg1, int arg2, byte arg3) {
        if (arg3 < 47) {
            this.method255(59);
        }
        for (int var5 = arg2; var5 < arg2 + arg0; var5++) {
            arg1[var5] = this.field497[this.field493++];
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)La;", line = 146)
    public final class1 method249(byte arg0) {
        int var2 = this.field493;
        while (this.field497[this.field493++] != 0) {
        }
        if (arg0 != 8) {
            this.method251(true, -122);
        }
        return class11.method66(this.field493 - var2 - 1, var2, -84, this.field497);
    }

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "(I)I", line = 163)
    public final int method250(int arg0) {
        this.field493 += 4;
        if (arg0 != 26078) {
            field495 = 127L;
        }
        return (this.field497[this.field493 - 1] & 0xFF) + (((this.field497[this.field493 - 4] & 0xFF) << 24) + ((this.field497[this.field493 - 3] & 0xFF) << 16)) + ((this.field497[this.field493 + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(ZI)V", line = 177)
    public final void method251(boolean arg0, int arg1) {
        this.field497[this.field493++] = (byte) arg1;
        if (arg0) {
            field496 = null;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(II)V", line = 188)
    public final void method252(int arg0, int arg1) {
        this.field497[this.field493++] = (byte) (arg0 >> 24);
        if (arg1 != -10914) {
            method256(6);
        }
        this.field497[this.field493++] = (byte) (arg0 >> 16);
        this.field497[this.field493++] = (byte) (arg0 >> 8);
        this.field497[this.field493++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Z)I", line = 210)
    public final int method253(boolean arg0) {
        if (arg0) {
            this.method253(true);
        }
        this.field493 += 2;
        return ((this.field497[this.field493 - 2] & 0xFF) << 8) + (this.field497[this.field493 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "(I)B", line = 233)
    public final byte method254(int arg0) {
        if (arg0 != 1024) {
            this.method253(false);
        }
        return this.field497[this.field493++];
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "(I)V", line = 245)
    public class39(int arg0) {
        this.field493 = 0;
        this.field497 = class41.method265(arg0, -251);
    }

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "(I)I", line = 275)
    public final int method255(int arg0) {
        if (arg0 != -6883) {
            this.method248(27, null, 19, (byte) 114);
        }
        this.field493 += 3;
        return ((this.field497[this.field493 - 3] & 0xFF) << 16) - (-((this.field497[this.field493 - 2] & 0xFF) << 8) - (this.field497[this.field493 - 1] & 0xFF));
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "([B)V", line = 298)
    public class39(byte[] arg0) {
        this.field497 = arg0;
        this.field493 = 0;
    }

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "(I)V", line = 322)
    public static void method256(int arg0) {
        field501 = null;
        field500 = null;
        field492 = null;
        if (arg0 != -29066) {
            field495 = 16L;
        }
        field499 = null;
        field496 = null;
        field491 = null;
        field494 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(III[I)V", line = 340)
    public final void method257(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (arg2 - arg0) / 8;
        int var6 = this.field493;
        this.field493 = arg0;
        int var7 = 0;
        if (arg1 < 57) {
            this.method253(true);
        }
        while (var7 < var5) {
            int var8 = this.method250(26078);
            int var9 = -957401312;
            int var10 = this.method250(26078);
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var10 -= (var8 >>> 5 ^ var8 << 4) + var8 ^ arg3[var9 >>> 11 & 0x3] + var9;
                var9 -= var11;
                var8 -= var9 + arg3[var9 & 0x3] ^ (var10 << 4 ^ var10 >>> 5) + var10;
            }
            this.field493 -= 8;
            this.method252(var8, -10914);
            this.method252(var10, -10914);
            var7++;
        }
        this.field493 = var6;
    }
}
