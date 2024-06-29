import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends class31 {

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "I")
    public int field86 = 0;

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "[B")
    public byte[] field89;

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "Lea;")
    public static class10 field85 = class3.method8("details)3dat", 99);

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "I")
    public static int field88 = -1;

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "Lea;")
    public static class10 field87 = class3.method8("37(U", 112);

    @OriginalMember(owner = "mapview!f", name = "t", descriptor = "Lea;")
    public static class10 field91 = class3.method8("Jewellery", 108);

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "I")
    public static volatile int field92 = -1;

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(B)I", line = 12)
    public final int method74(byte arg0) {
        this.field86 += 2;
        if (arg0 > -58) {
            this.method81(-2, -73);
        }
        return ((this.field89[this.field86 - 2] & 0xFF) << 8) + (this.field89[this.field86 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(I)V", line = 29)
    public static void method75(int arg0) {
        field87 = null;
        field91 = null;
        if (arg0 != -14895) {
            field87 = null;
        }
        field85 = null;
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(I)Lea;", line = 57)
    public final class10 method76(int arg0) {
        if (arg0 != -13232) {
            field88 = -105;
        }
        int var2 = this.field86;
        while (this.field89[this.field86++] != 0) {
        }
        return class32.method224(this.field89, this.field86 - var2 - 1, var2, 0);
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(IZ)V", line = 96)
    public final void method77(int arg0, boolean arg1) {
        this.field89[this.field86++] = (byte) (arg0 >> 24);
        if (!arg1) {
            this.method81(68, 52);
        }
        this.field89[this.field86++] = (byte) (arg0 >> 16);
        this.field89[this.field86++] = (byte) (arg0 >> 8);
        this.field89[this.field86++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "(I)I", line = 114)
    public final int method78(int arg0) {
        int var2 = -6 / ((arg0 + 12) / 40);
        return this.field89[this.field86++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(B)I", line = 132)
    public final int method79(byte arg0) {
        this.field86 += 3;
        return arg0 == -121 ? ((this.field89[this.field86 - 2] & 0xFF) << 8) + (((this.field89[this.field86 - 3] & 0xFF) << 16) + (this.field89[this.field86 - 1] & 0xFF)) : 83;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([IIII)V", line = 161)
    public final void method80(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field86;
        this.field86 = arg2;
        int var6 = (arg3 - arg2) / 8;
        if (arg1 != 10270) {
            this.method76(56);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method83(1);
            int var9 = this.method83(1);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 - -arg0[var10 >>> 11 & 0x3];
                var10 -= var11;
                var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg0[var10 & 0x3] + var10;
            }
            this.field86 -= 8;
            this.method77(var8, true);
            this.method77(var9, true);
        }
        this.field86 = var5;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)V", line = 205)
    public final void method81(int arg0, int arg1) {
        if (arg0 != -938252856) {
            field85 = null;
        }
        this.field89[this.field86++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I[BII)V", line = 218)
    public final void method82(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = -93 % ((40 - arg2) / 59);
        for (int var6 = arg0; var6 < arg0 + arg3; var6++) {
            arg1[var6] = this.field89[this.field86++];
        }
    }

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "(I)I", line = 253)
    public final int method83(int arg0) {
        if (arg0 != 1) {
            this.method79((byte) -95);
        }
        this.field86 += 4;
        return ((this.field89[this.field86 - 3] & 0xFF) << 16) + ((this.field89[this.field86 - 4] & 0xFF) << 24) + (this.field89[this.field86 - 1] & 0xFF) + ((this.field89[this.field86 + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(II)Lea;", line = 271)
    public static final class10 method84(int arg0, int arg1) {
        if (arg0 != -3) {
            field88 = 45;
        }
        return class21.method142(false, 0, arg1, 10);
    }

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "(B)B", line = 298)
    public final byte method85(byte arg0) {
        int var2 = 36 % ((arg0 + 47) / 39);
        return this.field89[this.field86++];
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "(I)V", line = 311)
    public class11(int arg0) {
        this.field89 = class7.method34(30000, arg0);
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "([B)V", line = 319)
    public class11(byte[] arg0) {
        this.field89 = arg0;
    }
}
