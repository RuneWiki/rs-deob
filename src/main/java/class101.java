import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class101 extends class82 {

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    private final int field1813;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    private final int field1823;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
    private final int field1825;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    private final int field1815;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
    public static int field1824 = -1;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Lcd;")
    private static class64 field1820 = class44.method335((byte) 71, "skill:");

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Lcd;")
    public static class64 field1819 = field1820;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "Z")
    public static boolean field1828 = false;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Lcd;")
    public static class64 field1811 = class44.method335((byte) 71, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field1830 = 0;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V", line = 6)
    public final void method435(int arg0, int arg1, byte arg2) {
        field1814++;
        if (arg2 != 111) {
            field1830 = -60;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V", line = 26)
    public final void method434(byte arg0, int arg1, int arg2) {
        field1812++;
        int var4 = this.field1825 * arg2 >> 12;
        int var5 = this.field1815 * arg2 >> 12;
        int var6 = this.field1823 * arg1 >> 12;
        if (arg0 > -96) {
            field1820 = (class64) null;
        }
        int var7 = this.field1813 * arg1 >> 12;
        class161.method1161(var5, 3, this.field1510, var4, this.field1516, var7, this.field1521, var6);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIII)V", line = 48)
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1813 = arg3;
        this.field1823 = arg1;
        this.field1825 = arg0;
        this.field1815 = arg2;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 62)
    public static final void method745(byte arg0) {
        if (arg0 <= 1) {
            field1828 = false;
        }
        if (class282.field4853.toLowerCase().indexOf("microsoft") == -1) {
            class135.field2406[44] = 71;
            class135.field2406[45] = 26;
            if (class282.field4862 == null) {
                class135.field2406[192] = 58;
                class135.field2406[222] = 59;
            } else {
                class135.field2406[192] = 28;
                class135.field2406[520] = 59;
                class135.field2406[222] = 58;
            }
            class135.field2406[91] = 42;
            class135.field2406[46] = 72;
            class135.field2406[59] = 57;
            class135.field2406[92] = 74;
            class135.field2406[61] = 27;
            class135.field2406[93] = 43;
            class135.field2406[47] = 73;
        } else {
            class135.field2406[220] = 74;
            class135.field2406[190] = 72;
            class135.field2406[219] = 42;
            class135.field2406[221] = 43;
            class135.field2406[223] = 28;
            class135.field2406[188] = 71;
            class135.field2406[187] = 27;
            class135.field2406[189] = 26;
            class135.field2406[192] = 58;
            class135.field2406[191] = 73;
            class135.field2406[222] = 59;
            class135.field2406[186] = 57;
        }
        field1829++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZII)V", line = 115)
    public final void method433(boolean arg0, int arg1, int arg2) {
        field1827++;
        int var4 = this.field1815 * arg1 >> 12;
        if (!arg0) {
            field1819 = (class64) null;
        }
        int var5 = this.field1825 * arg1 >> 12;
        int var6 = this.field1813 * arg2 >> 12;
        int var7 = this.field1823 * arg2 >> 12;
        class196.method1379(120, var6, var7, var4, this.field1521, var5);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILqm;)V", line = 134)
    public static final void method746(int arg0, class222 arg1) {
        if (arg0 != 2) {
            field1830 = -113;
        }
        field1817++;
        class268.field4625 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V", line = 145)
    public static final void method747(byte arg0) {
        field1822++;
        if (class281.field4837 == 0) {
            return;
        }
        try {
            if ((++class106.field1955) > 1500) {
                if (class216.field3626 != null) {
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                }
                if (class7.field171 >= 1) {
                    class281.field4837 = 0;
                    class125.field2260 = -5;
                    return;
                }
                if (class62.field1206 == class309.field5258) {
                    class309.field5258 = class197.field3359;
                } else {
                    class309.field5258 = class62.field1206;
                }
                class7.field171++;
                class281.field4837 = 1;
                class106.field1955 = 0;
            }
            if (class281.field4837 == 1) {
                class283.field4873 = class228.field3876.method1948(class309.field5258, class157.field2768, (byte) -16);
                class281.field4837 = 2;
            }
            if (class281.field4837 == 2) {
                if (class283.field4873.field375 == 2) {
                    throw new IOException();
                }
                if (class283.field4873.field375 != 1) {
                    return;
                }
                class216.field3626 = new class24((Socket) class283.field4873.field377, class228.field3876);
                class283.field4873 = null;
                class216.field3626.method227(class17.field353.field254, 0, 3, class17.field353.field281);
                if (class94.field1747 != null) {
                    class94.field1747.method1055(2000);
                }
                if (class315.field5334 != null) {
                    class315.field5334.method1055(2000);
                }
                int var1 = class216.field3626.method223((byte) 120);
                if (class94.field1747 != null) {
                    class94.field1747.method1055(2000);
                }
                if (class315.field5334 != null) {
                    class315.field5334.method1055(arg0 + 2053);
                }
                if (var1 != 101) {
                    class125.field2260 = var1;
                    class281.field4837 = 0;
                    class216.field3626.method225(arg0 ^ 0xFFFFFFCA);
                    class216.field3626 = null;
                    return;
                }
                class281.field4837 = 3;
            }
            if (class281.field4837 == 3) {
                if (class216.field3626.method219(arg0 ^ 0xFFFFFFCB) >= 2) {
                    int var2 = class216.field3626.method223((byte) 112) << 8 | class216.field3626.method223((byte) 119);
                    class97.method727(var2, true);
                    if (class76.field1433 == -1) {
                        class76.field1433 = class244.field4253;
                    }
                    class281.field4837 = 0;
                    class216.field3626.method225(1);
                    class216.field3626 = null;
                    class255.method1819(16234);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class216.field3626 != null) {
                class216.field3626.method225(1);
                class216.field3626 = null;
            }
            if (class7.field171 < 1) {
                class281.field4837 = 1;
                class106.field1955 = 0;
                if (class62.field1206 == class309.field5258) {
                    class309.field5258 = class197.field3359;
                } else {
                    class309.field5258 = class62.field1206;
                }
                class7.field171++;
            } else {
                class281.field4837 = 0;
                class125.field2260 = -4;
            }
        }
        if (arg0 != -53) {
            field1828 = false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 293)
    public static final void method748(int arg0, int arg1) {
        field1826++;
        if (arg0 != 7736) {
            method745((byte) 99);
        }
        class280.field4825.method1197((byte) 60, arg1);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V", line = 314)
    public static final void method749(byte arg0) {
        field1816++;
        int var1 = 0;
        int[] var2 = new int[class72.field1396];
        int var3 = 0;
        if (arg0 != -122) {
            return;
        }
        while (var3 < class72.field1396) {
            class92 var4 = class132.method949(var3, false);
            if (var4.field1694 >= 0 || var4.field1697 >= 0) {
                var2[var1++] = var3;
            }
            var3++;
        }
        class62.field1211 = new int[var1];
        for (int var5 = 0; var5 < var1; var5++) {
            class62.field1211[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 353)
    public static void method750(int arg0) {
        if (arg0 != 190) {
            field1824 = -10;
        }
        field1820 = null;
        field1819 = null;
        field1811 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lja;IIZ)V", line = 372)
    public static final void method751(class60 arg0, int arg1, int arg2, boolean arg3) {
        field1821++;
        if (class11.field227 != 0 && class11.field227 != 3 || !arg0.method472(arg3)) {
            return;
        }
        int var4 = arg0.field1079[arg2];
        if (var4 > arg1 || arg1 > (var4 + arg0.field1019[arg2])) {
            return;
        }
        int var5 = class241.field4157 + class154.field2734 & 0x7FF;
        int var6 = arg1 - arg0.field1163 / 2;
        int var7 = class50.field826[var5];
        int var8 = arg2 - arg0.field1016 / 2;
        int var9 = class50.field820[var5];
        int var10 = (class277.field4766 + 256) * var9 >> 8;
        int var11 = (class277.field4766 + 256) * var7 >> 8;
        int var12 = var8 * var11 + (var6 * var10) >> 11;
        int var13 = class139.field2472.field1859 + var12 >> 7;
        int var14 = var8 * var10 - var6 * var11 >> 11;
        int var15 = class139.field2472.field1865 - var14 >> 7;
        if (class301.field5174 > 0 && class120.field2174[82] && class120.field2174[81]) {
            class180.method1283(54, class190.field3269 + var13, class20.field364, class121.field2184 + var15);
            return;
        }
        boolean var16 = class85.method650(0, 1, 0, -12920, var13, var15, 0, true, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 0);
        if (!var16) {
            return;
        }
        class17.field353.method130(-1, var6);
        class17.field353.method130(-1, var8);
        class17.field353.method145(101, class241.field4157);
        class17.field353.method130(-1, 57);
        class17.field353.method130(-1, class154.field2734);
        class17.field353.method130(-1, class277.field4766);
        class17.field353.method130(-1, 89);
        class17.field353.method145(112, class139.field2472.field1859);
        class17.field353.method145(111, class139.field2472.field1865);
        class17.field353.method130(-1, class223.field3804);
        class17.field353.method130(-1, 63);
    }
}
