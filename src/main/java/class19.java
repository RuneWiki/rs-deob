import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class19 extends class35 {

    @OriginalMember(owner = "mapview!ja", name = "k", descriptor = "[B")
    public byte[] field157;

    @OriginalMember(owner = "mapview!ja", name = "l", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "Le;")
    public static class9 field156 = new class9();

    @OriginalMember(owner = "mapview!ja", name = "m", descriptor = "Lua;")
    public static class41 field159 = class16.method86("Spinning Wheel", true);

    @OriginalMember(owner = "mapview!ja", name = "o", descriptor = "Lua;")
    public static class41 field161 = class16.method86("Dungeon", true);

    @OriginalMember(owner = "mapview!ja", name = "u", descriptor = "J")
    public static long field167 = 0L;

    @OriginalMember(owner = "mapview!ja", name = "p", descriptor = "Lua;")
    public static class41 field162 = class16.method86("Chainmail Shop", true);

    @OriginalMember(owner = "mapview!ja", name = "w", descriptor = "Lua;")
    public static class41 field169 = class16.method86("uitext has incorrect number of strings", true);

    @OriginalMember(owner = "mapview!ja", name = "s", descriptor = "I")
    public static int field165 = 0;

    @OriginalMember(owner = "mapview!ja", name = "n", descriptor = "Lua;")
    public static class41 field160 = class16.method86("Crafting Shop", true);

    @OriginalMember(owner = "mapview!ja", name = "v", descriptor = "I")
    public static int field168 = 0;

    @OriginalMember(owner = "mapview!ja", name = "x", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "mapview!ja", name = "q", descriptor = "I")
    public static volatile int field163 = 0;

    @OriginalMember(owner = "mapview!ja", name = "y", descriptor = "I")
    public static int sizeZ;

    @OriginalMember(owner = "mapview!ja", name = "r", descriptor = "J")
    public static long field164;

    @OriginalMember(owner = "mapview!ja", name = "t", descriptor = "[I")
    public static int[] field166;

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "(I)I", line = 22)
    public static final int method96(int arg0) {
        if (arg0 != -25680) {
            method96(-38);
        }
        if (class39.field490 == null) {
            return 0;
        } else if (class39.field490.field419 == null) {
            return class1.field1[class39.field490.field423 & 0xFF];
        } else {
            return class1.field1[class39.field490.field419[class42.field514] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IBI[B)V", line = 43)
    public final void method97(int arg0, byte arg1, int arg2, byte[] arg3) {
        int var5 = arg0;
        if (arg1 != 87) {
            field167 = 74L;
        }
        while (arg0 + arg2 > var5) {
            arg3[var5] = this.field157[this.field158++];
            var5++;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(BI)V", line = 64)
    public final void method98(byte arg0, int arg1) {
        this.field157[this.field158++] = (byte) (arg1 >> 24);
        this.field157[this.field158++] = (byte) (arg1 >> 16);
        if (arg0 > -74) {
            this.method98((byte) 114, -68);
        }
        this.field157[this.field158++] = (byte) (arg1 >> 8);
        this.field157[this.field158++] = (byte) arg1;
    }

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "(I)I", line = 84)
    public final int method99(int arg0) {
        this.field158 += 2;
        return arg0 == 255 ? ((this.field157[this.field158 - 2] & 0xFF) << 8) + (this.field157[this.field158 - 1] & 0xFF) : 56;
    }

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "(I)I", line = 95)
    public final int method100(int arg0) {
        if (arg0 > -6) {
            field166 = null;
        }
        return this.field157[this.field158++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)I", line = 118)
    public final int method101(byte arg0) {
        if (arg0 != -61) {
            this.method98((byte) -88, -15);
        }
        this.field158 += 3;
        return (this.field157[this.field158 - 1] & 0xFF) + ((this.field157[this.field158 - 2] & 0xFF) << 8) + ((this.field157[this.field158 + -3] & 0xFF) << 16);
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II[II)V", line = 140)
    public final void method102(int arg0, int arg1, int[] arg2, int arg3) {
        int var5 = this.field158;
        int var6 = (arg3 - arg1) / 8;
        this.field158 = arg1;
        if (arg0 != 32) {
            this.method101((byte) 110);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = this.method105(arg0 - 131);
            int var9 = this.method105(123);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;
            while (var12-- > 0) {
                var9 -= arg2[var10 >>> 11 & 0x45C00003] + var10 ^ (var8 >>> 5 ^ var8 << 4) + var8;
                var10 -= var11;
                var8 -= (var9 >>> 5 ^ var9 << 4) + var9 ^ arg2[var10 & 0x3] + var10;
            }
            this.field158 -= 8;
            this.method98((byte) -118, var8);
            this.method98((byte) -117, var9);
        }
        this.field158 = var5;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIILw;)[Lba;", line = 194)
    public static final class5[] method103(int arg0, int arg1, int arg2, class43 arg3) {
        if (class25.method144(-124, arg1, arg0, arg3)) {
            return arg2 == 0 ? mapview.method167((byte) -127) : (class5[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)Lua;", line = 234)
    public final class41 method104(byte arg0) {
        if (arg0 == -43) {
            int var2 = this.field158;
            while (this.field157[this.field158++] != 0) {
            }
            return class37.method207(this.field158 - var2 - 1, this.field157, -118, var2);
        } else {
            return (class41) null;
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "(I)I", line = 260)
    public final int method105(int arg0) {
        int var2 = -84 % ((9 - arg0) / 58);
        this.field158 += 4;
        return ((this.field157[this.field158 - 4] & 0xFF) << 24) + ((this.field157[this.field158 - 3] << 16 & 0xFF0000) - (-(this.field157[this.field158 - 2] << 8 & 0xFF00) - (this.field157[this.field158 - 1] & 0xFF)));
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "(I)V", line = 297)
    public class19(int arg0) {
        this.field157 = class34.method197(-120, arg0);
        this.field158 = 0;
    }

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "(I)B", line = 307)
    public final byte method106(int arg0) {
        return arg0 == -5902 ? this.field157[this.field158++] : -22;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IB)V", line = 318)
    public final void method107(int arg0, byte arg1) {
        if (arg1 != 113) {
            this.method106(-78);
        }
        this.field157[this.field158++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(B)V", line = 328)
    public static void method108(byte arg0) {
        field156 = null;
        field159 = null;
        field162 = null;
        field161 = null;
        field160 = null;
        field169 = null;
        if (arg0 != 62) {
            method108((byte) 44);
        }
        field166 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "<init>", descriptor = "([B)V", line = 343)
    public class19(byte[] arg0) {
        this.field157 = arg0;
        this.field158 = 0;
    }
}
