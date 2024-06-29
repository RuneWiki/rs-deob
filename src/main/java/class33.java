import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 extends class5 {

    @OriginalMember(owner = "mapview!r", name = "s", descriptor = "[B")
    public byte[] field429;

    @OriginalMember(owner = "mapview!r", name = "q", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "mapview!r", name = "r", descriptor = "Lu;")
    public static class38 field428 = class9.method45(-41, "Saw Mill");

    @OriginalMember(owner = "mapview!r", name = "p", descriptor = "Lu;")
    public static class38 field426 = class9.method45(-41, "Brewery");

    @OriginalMember(owner = "mapview!r", name = "u", descriptor = "Lu;")
    public static class38 field431 = class9.method45(-41, "Clothes Shop");

    @OriginalMember(owner = "mapview!r", name = "w", descriptor = "[Z")
    public static boolean[] field433 = new boolean[112];

    @OriginalMember(owner = "mapview!r", name = "y", descriptor = "[I")
    public static int[] field435 = new int[128];

    @OriginalMember(owner = "mapview!r", name = "x", descriptor = "Lu;")
    public static class38 field434 = class9.method45(-41, "Prev page");

    @OriginalMember(owner = "mapview!r", name = "o", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "mapview!r", name = "t", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "mapview!r", name = "v", descriptor = "Lg;")
    public static class13 field432;

    @OriginalMember(owner = "mapview!r", name = "z", descriptor = "Lu;")
    public static class38 field436;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)V", line = 13)
    public final void method182(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method188((byte) 59);
        }
        this.field429[this.field427++] = (byte) (arg0 >> 24);
        this.field429[this.field427++] = (byte) (arg0 >> 16);
        this.field429[this.field427++] = (byte) (arg0 >> 8);
        this.field429[this.field427++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lu;ILw;Lu;)[Ld;", line = 28)
    public static final class7[] method183(class38 arg0, int arg1, class41 arg2, class38 arg3) {
        int var4 = arg2.method263(arg0, -107);
        int var5 = arg2.method258(var4, arg3, (byte) 48);
        if (arg1 <= 43) {
            field428 = null;
        }
        return class38.method221(arg2, var4, -102, var5);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I[BII)V", line = 47)
    public final void method184(int arg0, byte[] arg1, int arg2, int arg3) {
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            arg1[var5] = this.field429[this.field427++];
        }
        if (arg2 != -21414) {
            this.method194(null, -96, -65, true);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lw;III)[Loa;", line = 85)
    public static final class29[] method185(class41 arg0, int arg1, int arg2, int arg3) {
        if (class5.method12(arg2, arg1, (byte) -128, arg0)) {
            return arg3 == -268435456 ? class38.method244((byte) -127) : (class29[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(I)I", line = 118)
    public final int method186(int arg0) {
        this.field427 += 2;
        if (arg0 != -253) {
            this.method189((byte) -52);
        }
        return ((this.field429[this.field427 - 2] & 0xFF) << 8) + (this.field429[this.field427 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(I)B", line = 141)
    public final byte method187(int arg0) {
        if (arg0 != -1989399236) {
            this.method194(null, 18, -105, true);
        }
        return this.field429[this.field427++];
    }

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "(B)I", line = 168)
    public final int method188(byte arg0) {
        int var2 = 40 / ((arg0 - 36) / 58);
        return this.field429[this.field427++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "(B)I", line = 176)
    public final int method189(byte arg0) {
        if (arg0 < 88) {
            field425 = 93;
        }
        this.field427 += 3;
        return ((this.field429[this.field427 - 2] & 0xFF) << 8) + ((this.field429[this.field427 - 3] & 0xFF) << 16) + (this.field429[this.field427 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "(I)I", line = 228)
    public final int method190(int arg0) {
        this.field427 += 4;
        if (arg0 != 4096) {
            this.method184(9, null, -23, 10);
        }
        return ((this.field429[this.field427 - 2] & 0xFF) << 8) + (this.field429[this.field427 - 1] & 0xFF) + ((this.field429[this.field427 + -3] & 0xFF) << 16) + ((this.field429[this.field427 + -4] & 0xFF) << 24);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([Lu;BII)V", line = 239)
    public static final void method191(class38[] arg0, byte arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            arg0[0].method243((byte) 98);
        } else {
            class10.method53(arg0, arg3, true, arg2).method243((byte) 112);
        }
        if (arg1 <= 61) {
            method195(-59);
        }
    }

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "(I)Lu;", line = 264)
    public final class38 method192(int arg0) {
        int var2 = 41 / ((arg0 + 34) / 47);
        int var3 = this.field427;
        while (this.field429[this.field427++] != 0) {
        }
        return class8.method36(this.field429, var3, 2, this.field427 - var3 - 1);
    }

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(II)V", line = 277)
    public final void method193(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method190(44);
        }
        this.field429[this.field427++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "([IIIZ)V", line = 294)
    public final void method194(int[] arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field427;
        this.field427 = arg1;
        int var6 = (arg2 - arg1) / 8;
        int var7 = 0;
        if (!arg3) {
            this.method194(null, 48, -35, true);
        }
        while (var6 > var7) {
            int var8 = this.method190(4096);
            int var9 = -957401312;
            int var10 = this.method190(4096);
            int var11 = 32;
            int var12 = -1640531527;
            while (var11-- > 0) {
                var10 -= arg0[var9 >>> 11 & 0x3] + var9 ^ (var8 << 4 ^ var8 >>> 5) - -var8;
                var9 -= var12;
                var8 -= arg0[var9 & 0x3] + var9 ^ (var10 >>> 5 ^ var10 << 4) + var10;
            }
            this.field427 -= 8;
            this.method182(var8, 255);
            this.method182(var10, 255);
            var7++;
        }
        this.field427 = var5;
    }

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "(I)V", line = 336)
    public static void method195(int arg0) {
        field432 = null;
        if (arg0 > -118) {
            return;
        }
        field434 = null;
        field428 = null;
        field436 = null;
        field426 = null;
        field435 = null;
        field431 = null;
        field433 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "(I)V", line = 377)
    public class33(int arg0) {
        this.field429 = class1.method3(-6736, arg0);
        this.field427 = 0;
    }

    @OriginalMember(owner = "mapview!r", name = "<init>", descriptor = "([B)V", line = 385)
    public class33(byte[] arg0) {
        this.field427 = 0;
        this.field429 = arg0;
    }
}
