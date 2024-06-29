import java.io.IOException;
import java.net.Socket;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class285 {

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lce;")
    public static class126 field4723 = class206.method1445(-7923, "leuchten3:");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lce;")
    private static class126 field4720 = class206.method1445(-7923, "Checking for updates )2 ");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lce;")
    public static class126 field4722 = field4720;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4726;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
    public static int[] field4724;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[BLbb;)V", line = 5)
    public final void method1895(byte arg0, byte[] arg1, class134 arg2) {
        field4719++;
        if (arg2.field2282[arg2.field2299] != 31 || arg2.field2282[arg2.field2299 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4726 == null) {
            this.field4726 = new Inflater(true);
        }
        if (arg0 < 30) {
            return;
        }
        try {
            this.field4726.setInput(arg2.field2282, arg2.field2299 + 10, -arg2.field2299 + -10 + -8 + arg2.field2282.length);
            this.field4726.inflate(arg1);
        } catch (Exception var5) {
            this.field4726.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4726.reset();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 33)
    public static void method1896(byte arg0) {
        field4720 = null;
        field4724 = null;
        if (arg0 != 80) {
            method1896((byte) -83);
        }
        field4723 = null;
        field4722 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 48)
    public static final void method1897(boolean arg0) {
        field4721++;
        if (class232.field3900 == 0) {
            return;
        }
        if (!arg0) {
            method1898(97, (class112) null, -45, false, (byte) -33);
        }
        try {
            if ((++class45.field703) > 1500) {
                if (class59.field953 != null) {
                    class59.field953.method1941((byte) 103);
                    class59.field953 = null;
                }
                if (class200.field3415 >= 1) {
                    class289.field4792 = -5;
                    class232.field3900 = 0;
                    return;
                }
                class45.field703 = 0;
                class200.field3415++;
                class232.field3900 = 1;
                if (class243.field4113 == class172.field3039) {
                    class172.field3039 = class206.field3529;
                } else {
                    class172.field3039 = class243.field4113;
                }
            }
            if (class232.field3900 == 1) {
                class82.field1327 = class161.field2907.method1092(class172.field3039, class251.field4201, true);
                class232.field3900 = 2;
            }
            if (class232.field3900 == 2) {
                if (class82.field1327.field965 == 2) {
                    throw new IOException();
                }
                if (class82.field1327.field965 != 1) {
                    return;
                }
                class59.field953 = new class293((Socket) class82.field1327.field967, class161.field2907);
                class82.field1327 = null;
                class59.field953.method1945(class103.field1645.field2299, true, 0, class103.field1645.field2282);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 125);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 86);
                }
                int var1 = class59.field953.method1938((byte) 41);
                if (class118.field1993 != null) {
                    class118.field1993.method1048((byte) 81);
                }
                if (class125.field2109 != null) {
                    class125.field2109.method1048((byte) 123);
                }
                if (var1 != 101) {
                    class289.field4792 = var1;
                    class232.field3900 = 0;
                    class59.field953.method1941((byte) 58);
                    class59.field953 = null;
                    return;
                }
                class232.field3900 = 3;
            }
            if (class232.field3900 == 3) {
                if (class59.field953.method1939((byte) 86) < 2) {
                    return;
                }
                int var2 = class59.field953.method1938((byte) 41) << 8 | class59.field953.method1938((byte) 41);
                class231.method1572((byte) -73, var2);
                if (class91.field1422 != -1) {
                    class232.field3900 = 0;
                    class59.field953.method1941((byte) -95);
                    class59.field953 = null;
                    class8.method46(true);
                    return;
                }
                class289.field4792 = 6;
                class232.field3900 = 0;
                class59.field953.method1941((byte) -107);
                class59.field953 = null;
                return;
            }
        } catch (IOException var4) {
            if (class59.field953 != null) {
                class59.field953.method1941((byte) -117);
                class59.field953 = null;
            }
            if (class200.field3415 < 1) {
                class45.field703 = 0;
                class200.field3415++;
                class232.field3900 = 1;
                if (class243.field4113 == class172.field3039) {
                    class172.field3039 = class206.field3529;
                } else {
                    class172.field3039 = class243.field4113;
                }
            } else {
                class232.field3900 = 0;
                class289.field4792 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 199)
    public class285() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILwd;IZB)V", line = 211)
    public static final void method1898(int arg0, class112 arg1, int arg2, boolean arg3, byte arg4) {
        field4730++;
        int var5 = arg1.field1753;
        if (arg1.field1819 == 0) {
            arg1.field1753 = arg1.field1850;
        } else if (arg1.field1819 == 1) {
            arg1.field1753 = arg0 - arg1.field1850;
        } else if (arg1.field1819 == 2) {
            arg1.field1753 = arg1.field1850 * arg0 >> 14;
        } else if (arg1.field1819 == 3) {
            if (arg1.field1780 == 2) {
                arg1.field1753 = (arg1.field1850 - 1) * arg1.field1754 + arg1.field1850 * 32;
            } else if (arg1.field1780 == 7) {
                arg1.field1753 = (arg1.field1850 - 1) * arg1.field1754 + arg1.field1850 * 12;
            }
        }
        int var6 = arg1.field1766;
        if (arg1.field1781 == 0) {
            arg1.field1766 = arg1.field1831;
        } else if (arg1.field1781 == 1) {
            arg1.field1766 = arg2 - arg1.field1831;
        } else if (arg1.field1781 == 2) {
            arg1.field1766 = arg1.field1831 * arg2 >> 14;
        } else if (arg1.field1781 == 3) {
            if (arg1.field1780 == 2) {
                arg1.field1766 = arg1.field1831 * 32 + ((arg1.field1831 - 1) * arg1.field1888);
            } else if (arg1.field1780 == 7) {
                arg1.field1766 = (arg1.field1831 - 1) * arg1.field1888 + arg1.field1831 * 115;
            }
        }
        if (arg1.field1781 == 4) {
            arg1.field1766 = arg1.field1868 * arg1.field1753 / arg1.field1809;
        }
        if (arg1.field1819 == 4) {
            arg1.field1753 = arg1.field1809 * arg1.field1766 / arg1.field1868;
        }
        if (arg4 > -14) {
            return;
        }
        if (class241.field4091 && (client.method804(arg1) != 0 || arg1.field1780 == 0)) {
            if (arg1.field1753 < 5 && arg1.field1766 < 5) {
                arg1.field1753 = 5;
                arg1.field1766 = 5;
            } else {
                if (arg1.field1766 <= 0) {
                    arg1.field1766 = 5;
                }
                if (arg1.field1753 <= 0) {
                    arg1.field1753 = 5;
                }
            }
        }
        if (arg1.field1885 == 1337) {
            class46.field717 = arg1;
        }
        if (arg3 && arg1.field1863 != null && (arg1.field1766 != var6 || arg1.field1753 != var5)) {
            class282 var7 = new class282();
            var7.field4697 = arg1;
            var7.field4699 = arg1.field1863;
            class305.field5124.method899(var7, -28);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBI)I", line = 324)
    public static final int method1899(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = 3 / ((arg2 - 49) / 33);
        field4729++;
        int var5 = class236.field3979[class38.method232(arg1, arg0)];
        if (arg3 > 0) {
            int var6 = class236.field3987.method596((byte) -68, arg3 & 0xFFFF);
            if (var6 != 0) {
                int var7;
                if (arg0 < 0) {
                    var7 = 0;
                } else if (arg0 <= 127) {
                    var7 = arg0 * 131586;
                } else {
                    var7 = 16777215;
                }
                if (var6 == 256) {
                    var5 = var7;
                } else {
                    int var9 = 256 - var6;
                    var5 = ((var7 & 0xFF00FF) * var6 + ((var5 & 0xFF00FF) * var9) & 0xFF00FF00) + ((var5 & 0xFF00) * var9 + (var7 & 0xFF00) * var6 & 0xFF0000) >> 8;
                }
            }
            int var10 = class236.field3987.method602(arg3 & 0xFFFF, (byte) -87);
            if (var10 != 0) {
                var10 += 256;
                int var11 = (var5 >> 16 & 0xFF) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = ((var5 & 0xFF00) >> 8) * var10;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (var5 & 0xFF) * var10;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                var5 = (var12 & 0xFF00) + (((var11 & 0xA400FF00) << 8) + (var13 >> 8));
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(III)V", line = 414)
    private class285(int arg0, int arg1, int arg2) {
    }
}
