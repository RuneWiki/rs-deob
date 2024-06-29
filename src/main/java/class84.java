import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class84 extends class202 {

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field1317 = 0;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[[B")
    public static byte[][] field1308 = new byte[50][];

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "[I")
    public static int[] field1327 = new int[64];

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field1325 = 0;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "[I")
    public static int[] field1319;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[I")
    public static int[] field1324;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Z")
    public final boolean method599(int arg0) {
        field1322++;
        if (arg0 == 29046) {
            return (this.field1313 & 0x25DBBD) >> 21 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
    public final boolean method600(byte arg0) {
        field1320++;
        if (arg0 != -18) {
            this.method603(81);
        }
        return (this.field1313 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)I")
    public final int method601(int arg0) {
        if (arg0 != 3) {
            this.method609((byte) 1);
        }
        field1314++;
        return (this.field1313 & 0x1CF20F) >> 18;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)I")
    public static final int method602(byte arg0, int arg1) {
        field1323++;
        int var2 = (arg1 & 0xFB) >> 6;
        int var3 = arg1 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        int var4 = -78 % ((arg0 + 23) / 37);
        return 0;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)Z")
    public final boolean method603(int arg0) {
        if (arg0 == 0) {
            field1318++;
            return (this.field1313 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        field1311++;
        int var2 = 32 / ((arg0 + 31) / 63);
        return ((this.field1313 & 0x14BF6759) >> 28) != 0;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Z")
    public final boolean method605(boolean arg0, int arg1) {
        field1329++;
        if (!arg0) {
            method602((byte) -79, -110);
        }
        return (this.field1313 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "(I)I")
    public final int method606(int arg0) {
        if (arg0 == 1596737886) {
            field1315++;
            return class24.method223(64, this.field1313);
        } else {
            return 111;
        }
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(Z)Z")
    public final boolean method607(boolean arg0) {
        field1321++;
        if (arg0) {
            field1317 = 30;
        }
        return (this.field1313 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
    public static final void method608(int arg0, int arg1) {
        class90.field1484.method476(false, arg1);
        field1316++;
        if (arg0 >= -34) {
            method610((byte) 95);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z")
    public final boolean method609(byte arg0) {
        if (arg0 < 97) {
            field1309 = 119;
        }
        field1312++;
        return (this.field1313 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public static void method610(byte arg0) {
        field1324 = null;
        field1327 = null;
        field1308 = null;
        if (arg0 > -79) {
            field1327 = null;
        }
        field1319 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(II)V")
    public class84(int arg0, int arg1) {
        this.field1313 = arg0;
        this.field1328 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Z")
    public final boolean method611(byte arg0) {
        field1310++;
        int var2 = 77 / ((arg0 - 64) / 62);
        return ((this.field1313 & 0x4C882FB1) >> 30) != 0;
    }
}
