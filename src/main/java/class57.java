import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class57 extends class192 {

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "[B")
    public byte[] field905;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field897 = -1;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "[[Lig;")
    public static class60[][] field899 = new class60[13][13];

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "Z")
    public static boolean field896 = true;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Lta;", line = 5)
    public static final class263 method438(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class263 var4 = var3.field3939;
            var3.field3939 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 20)
    public static final void method439(int arg0) {
        class91 var1 = class299.field5112;
        synchronized (class299.field5112) {
            class246.field4267++;
            class64.field1119 = class312.field5295;
            class194.field3423 = class197.field3467;
            class226.field3882 = class240.field4175;
            class123.field2184 = class300.field5125;
            class219.field3791 = class285.field4914;
            class173.field3103 = class260.field4519;
            class8.field106 = class224.field3835;
            class300.field5125 = arg0;
        }
        field900++;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)V", line = 46)
    public static final void method440(byte arg0) {
        field894++;
        for (int var1 = 0; var1 < class311.field5289; var1++) {
            int var2 = class225.field3857[var1];
            class107 var3 = class16.field214[var2];
            int var4 = class293.field5036.method1589(arg0 - 13);
            if ((var4 & 0x20) != 0) {
                int var5 = class293.field5036.method1568((byte) 39);
                int var6 = class293.field5036.method1621((byte) -106);
                var3.method455(var6, var5, -10, class202.field3498);
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field1906.method1030(64)) {
                    class42.method337(-1, var3);
                }
                var3.field1906 = class88.method632(104, class293.field5036.method1615(3));
                var3.method449(var3.field1906.field2548, (byte) -127);
                var3.field973 = var3.field1906.field2565;
                var3.field979 = var3.field1906.field2541;
                var3.field926 = var3.field1906.field2560;
                var3.field957 = var3.field1906.field2575;
                var3.field967 = var3.field1906.field2552;
                var3.field927 = var3.field1906.field2589;
                var3.field929 = var3.field1906.field2561;
                var3.field915 = var3.field1906.field2592;
                if (var3.field1906.method1030(64)) {
                    class207.method1366(var3.field959[0], class272.field4704, var3.field975[0], 0, var3, (class231) null, (class101) null, arg0 + 35);
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field945 = class293.field5036.method1614(arg0 ^ 0xA2);
                var3.field970 = class293.field5036.method1614(255);
            }
            if ((var4 & 0x4) != 0) {
                var3.field922 = class293.field5036.method1585(65280);
                int var7 = class293.field5036.method1576(-49);
                var3.field981 = var7 >> 16;
                var3.field980 = class202.field3498 + (var7 & 0xFFFF);
                var3.field974 = 0;
                if (var3.field922 == 65535) {
                    var3.field922 = -1;
                }
                var3.field964 = 0;
                if (class202.field3498 < var3.field980) {
                    var3.field964 = -1;
                }
                if (var3.field922 != -1 && class202.field3498 == var3.field980) {
                    int var8 = class149.method1022(var3.field922, false).field3657;
                    if (var8 != -1) {
                        class2 var9 = class263.method1842(var8, (byte) -114);
                        if (var9 != null && var9.field41 != null) {
                            class122.method891(false, var3.field934, 0, var9, (byte) -76, var3.field912);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field944 = class293.field5036.method1620(58);
                var3.field972 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field963 = class293.field5036.method1614(255);
                if (var3.field963 == 65535) {
                    var3.field963 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var10 = class293.field5036.method1585(65280);
                int var11 = class293.field5036.method1621((byte) -106);
                if (var10 == 65535) {
                    var10 = -1;
                }
                class283.method1986(var11, var3, false, var10);
            }
            if ((var4 & 0x2) != 0) {
                int var12 = class293.field5036.method1575(255);
                int var13 = class293.field5036.method1568((byte) -37);
                var3.method455(var13, var12, -10, class202.field3498);
                var3.field936 = class202.field3498 + 300;
                var3.field913 = class293.field5036.method1568((byte) 114);
            }
        }
        if (arg0 != 93) {
            method440((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIB)I", line = 189)
    public static final int method441(int arg0, int arg1, byte arg2) {
        field898++;
        if (arg2 == -34) {
            int var3 = class167.method1108(arg2 ^ 0x80000021, arg0 - 1, arg1 + -1) + class167.method1108(Integer.MAX_VALUE, arg0 + 1, arg1 + -1) + class167.method1108(arg2 ^ 0x80000021, arg0 + -1, arg1 + 1) + class167.method1108(Integer.MAX_VALUE, arg0 - -1, arg1 - -1);
            int var4 = class167.method1108(arg2 - 2147483615, arg0 + -1, arg1) - (-class167.method1108(Integer.MAX_VALUE, arg0 + 1, arg1) - class167.method1108(Integer.MAX_VALUE, arg0, arg1 - 1) - class167.method1108(arg2 ^ 0x80000021, arg0, arg1 - -1));
            int var5 = class167.method1108(Integer.MAX_VALUE, arg0, arg1);
            return var4 / 8 + var3 / 16 + var5 / 4;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V", line = 208)
    public static final void method442(int arg0, byte arg1) {
        field904++;
        if (arg1 >= -120) {
            method438(-81, 9, -10);
        }
        class179.field3200.method1156(arg0, 0);
        class51.field803.method1156(arg0, 0);
        class265.field4609.method1156(arg0, 0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)Lmh;", line = 225)
    public static final class69 method443(byte arg0, int arg1) {
        field895++;
        class69 var2 = (class69) class113.field1957.method701((long) arg1, 1);
        int var3 = 25 % ((-arg0 - 31) / 48);
        if (var2 != null) {
            return var2;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = class93.field1643.method1453(1, (byte) -67, arg1 & 0x7FFF);
        } else {
            var4 = class151.field2578.method1453(1, (byte) -59, arg1);
        }
        class69 var5 = new class69();
        if (var4 != null) {
            var5.method515(new class235(var4), (byte) 125);
        }
        if (arg1 >= 32768) {
            var5.method514(32768);
        }
        class113.field1957.method698((long) arg1, (byte) 86, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "(B)V", line = 285)
    public static void method444(byte arg0) {
        if (arg0 == 1) {
            field899 = (class60[][]) null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V", line = 297)
    public class57(byte[] arg0) {
        this.field905 = arg0;
    }
}
