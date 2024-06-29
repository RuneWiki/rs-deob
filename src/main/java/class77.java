import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class77 extends class159 {

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1147 = 0;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "[[S")
    public static short[][] field1148 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1164 = "scroll:";

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z", line = 4)
    public final boolean method517(int arg0) {
        if (arg0 != -512512417) {
            method528((byte) 123, -21, 101);
        }
        field1161++;
        return ((this.field1155 & 0x766F359C) >> 30) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)I", line = 15)
    public static final int method518(int arg0) {
        field1154++;
        if ((double) class88.field1264 == 3.0D) {
            return 37;
        }
        if (arg0 != 908) {
            method518(-128);
        }
        if ((double) class88.field1264 == 4.0D) {
            return 50;
        } else if ((double) class88.field1264 == 6.0D) {
            return 75;
        } else if ((double) class88.field1264 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)Z", line = 49)
    public final boolean method519(int arg0) {
        if (arg0 == -624) {
            field1160++;
            return (this.field1155 >> 28 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)Z", line = 61)
    public final boolean method520(int arg0) {
        if (arg0 != -21845) {
            method528((byte) 106, 120, 52);
        }
        field1163++;
        return (this.field1155 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Z", line = 74)
    public final boolean method521(byte arg0) {
        field1152++;
        if (arg0 > -63) {
            return false;
        } else {
            return (this.field1155 & 0x606B91) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z", line = 91)
    public final boolean method522(byte arg0) {
        if (arg0 > -1) {
            this.field1157 = 62;
        }
        field1151++;
        return (this.field1155 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)Z", line = 103)
    public final boolean method523(byte arg0) {
        field1153++;
        if (arg0 > -89) {
            this.field1155 = 88;
        }
        return (this.field1155 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V", line = 118)
    public static void method524(byte arg0) {
        if (arg0 != -14) {
            field1164 = (String) null;
        }
        field1148 = (short[][]) null;
        field1164 = null;
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)I", line = 130)
    public final int method525(int arg0) {
        if (arg0 == -21845) {
            field1156++;
            return class49.method367(-126, this.field1155);
        } else {
            return -87;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)Z", line = 141)
    public final boolean method526(int arg0, boolean arg1) {
        if (arg1) {
            this.method517(50);
        }
        field1150++;
        return (this.field1155 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)[Llj;", line = 154)
    public static final class289[] method527(boolean arg0) {
        class289[] var1 = new class289[class2.field9];
        if (!arg0) {
            field1147 = -14;
        }
        for (int var2 = 0; var2 < class2.field9; var2++) {
            int var3 = class94.field1379[var2] * class322.field5289[var2];
            byte[] var4 = class105.field1522[var2];
            if (class104.field1505[var2]) {
                byte[] var7 = class233.field3709[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class167.method1160(class235.method1623(var7[var9], 255) << 24, class201.field3085[class235.method1623(var4[var9], 255)]);
                }
                if (class245.field3886) {
                    var1[var2] = new class260(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var8);
                } else {
                    var1[var2] = new class362(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var8);
                }
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class201.field3085[class235.method1623(var4[var6], 255)];
                }
                if (class245.field3886) {
                    var1[var2] = new class232(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var5);
                } else {
                    var1[var2] = new class137(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var5);
                }
            }
        }
        class167.method1164(false);
        field1159++;
        return var1;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BII)I", line = 217)
    public static final int method528(byte arg0, int arg1, int arg2) {
        field1149++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        int var4 = -45 % ((3 - arg0) / 43);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "(I)I", line = 242)
    public final int method529(int arg0) {
        if (arg0 != 17055) {
            this.method529(41);
        }
        field1158++;
        return this.field1155 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "(I)Z", line = 256)
    public final boolean method530(int arg0) {
        field1162++;
        if (arg0 != -27106) {
            this.method521((byte) 38);
        }
        return (this.field1155 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(II)V", line = 266)
    public class77(int arg0, int arg1) {
        this.field1155 = arg0;
        this.field1157 = arg1;
    }
}
