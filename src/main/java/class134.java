import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class134 {

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Llt;")
    public static class475 field2047 = new class475("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "Lrk;")
    public static class25 field2052 = new class25(8192);

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Llt;")
    public static class475 field2053 = new class475("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public int field2054;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lua;")
    public static class470 field2050;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static final void method891(int arg0) {
        for (int var1 = arg0; var1 < class214.field3120; var1++) {
            int var2 = class303.field4274[var1];
            class167 var3 = class193.field2821[var2];
            int var4 = class66.field1009.method1428(32122);
            if ((var4 & 0x40) != 0) {
                var4 += class66.field1009.method1428(32122) << 8;
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field2472.method2097(arg0 + 104)) {
                    class497.method2980(0, var3);
                }
                var3.method1160(class431.field6451.method1733(true, class66.field1009.method1450((byte) 110)), 64);
                var3.method860((byte) 113, var3.field2472.field4881);
                var3.field1986 = var3.field2472.field4918 << 3;
                if (var3.field2472.method2097(93)) {
                    class102.method624(null, null, 0, var3.field1996[0], var3, (byte) 19, var3.field1997[0], var3.field1768);
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field1984 = class66.field1009.method1442(79);
                var3.field1928 = class66.field1009.method1417(false);
                var3.field1941 = class66.field1009.method1417(false);
                var3.field1900 = class66.field1009.method1438(3);
                var3.field1965 = class66.field1009.method1462((byte) -62) + class317.field4559;
                var3.field1982 = class66.field1009.method1462((byte) -25) + class317.field4559;
                var3.field1988 = class66.field1009.method1430(false);
                var3.field1999 = 0;
                var3.field1928 += var3.field1996[0];
                var3.field1941 += var3.field1997[0];
                var3.field1984 += var3.field1997[0];
                var3.field2000 = 1;
                var3.field1900 += var3.field1996[0];
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class66.field1009.method1450((byte) 91);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class66.field1009.method1432(23094);
                int var7 = class66.field1009.method1424((byte) 126);
                var3.method857(false, var6, var5, -1, var7);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1904 = class66.field1009.method1450((byte) 68);
                if (var3.field1904 == 65535) {
                    var3.field1904 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1944 = class66.field1009.method1449(114);
                var3.field1914 = 100;
            }
            if ((var4 & 0x800) != 0) {
                int var8 = class66.field1009.method1465((byte) -118);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class66.field1009.method1432(23094);
                int var10 = class66.field1009.method1469(128);
                var3.method857(true, var9, var8, -1, var10);
            }
            if ((var4 & 0x2000) != 0) {
                int var11 = class66.field1009.method1428(arg0 + 32122);
                int[] var12 = new int[var11];
                int[] var13 = new int[var11];
                int[] var14 = new int[var11];
                for (int var15 = 0; var15 < var11; var15++) {
                    int var16 = class66.field1009.method1462((byte) -60);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    var12[var15] = var16;
                    var13[var15] = class66.field1009.method1430(false);
                    var14[var15] = class66.field1009.method1450((byte) 125);
                }
                class29.method172(var3, var13, var12, 63, var14);
            }
            if ((var4 & 0x400) != 0) {
                var3.field2466 = class66.field1009.method1450((byte) 104);
                var3.field2465 = class66.field1009.method1451((byte) -47);
            }
            if ((var4 & 0x2) != 0) {
                int var17 = class66.field1009.method1434(16887);
                int var18 = class66.field1009.method1424((byte) 127);
                var3.method848(var18, class317.field4559, -5, var17);
            }
            if ((var4 & 0x20) != 0) {
                int var19 = class66.field1009.method1450((byte) 126);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class66.field1009.method1430(false);
                class509.method3013(var20, arg0, var3, var19);
            }
            if ((var4 & 0x80) != 0) {
                int var21 = class66.field1009.method1434(16887);
                int var22 = class66.field1009.method1424((byte) -112);
                var3.method848(var22, class317.field4559, -5, var21);
                var3.field1958 = class317.field4559 + 300;
                var3.field1930 = class66.field1009.method1469(128);
            }
            if ((var4 & 0x200) != 0) {
                int var23 = class66.field1009.method1450((byte) 56);
                var3.field1951 = class66.field1009.method1469(128);
                var3.field1921 = class66.field1009.method1428(32122);
                var3.field1907 = (var23 & 0x8000) != 0;
                var3.field1920 = var23 & 0x7FFF;
                var3.field1953 = class317.field4559 + var3.field1951 + var3.field1920;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1989 = class66.field1009.method1440((byte) -103);
                var3.field1901 = class66.field1009.method1417(false);
                var3.field1960 = class66.field1009.method1440((byte) -118);
                var3.field1957 = (byte) class66.field1009.method1428(32122);
                var3.field1917 = class317.field4559 + class66.field1009.method1451((byte) -47);
                var3.field1954 = class317.field4559 + class66.field1009.method1465((byte) -85);
            }
        }
        field2048++;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method892(byte arg0) {
        field2053 = null;
        field2047 = null;
        int var1 = 33 % ((arg0 + 24) / 57);
        field2050 = null;
        field2052 = null;
    }
}
