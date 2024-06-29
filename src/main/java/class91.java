import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class91 {

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public int field1330 = 127;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Z")
    public boolean field1332 = true;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public int field1334 = 16;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    public boolean field1320 = true;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public int field1324 = -1;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field1329 = 128;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public int field1339 = 1190717;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Z")
    public boolean field1326 = false;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field1337 = 0;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public int field1340 = 8;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field1322 = -1;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field1328 = -1;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1327 = 500;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lhu;")
    public static class76 field1341 = new class76(8);

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "Lh;")
    public static class434 field1342 = new class434(46, -1);

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "Lh;")
    public static class434 field1345 = new class434(7, 2);

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "[B")
    public static byte[] field1346;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "[I")
    public static int[] field1348;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field1321;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lfl;")
    public class480 field1333;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "[[B")
    public static byte[][] field1343;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILbt;Z)V")
    private final void method580(int arg0, class32 arg1, boolean arg2) {
        field1331++;
        if (!arg2) {
            this.field1326 = false;
        }
        if (arg0 == 1) {
            this.field1337 = class429.method2539(arg1.method219(-122), (byte) -79);
        } else if (arg0 == 2) {
            this.field1328 = arg1.method201((byte) -107);
        } else if (arg0 == 3) {
            this.field1328 = arg1.method215((byte) 127);
            if (this.field1328 == 65535) {
                this.field1328 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field1320 = false;
            return;
        } else if (arg0 == 7) {
            this.field1322 = class429.method2539(arg1.method219(-118), (byte) -79);
        } else if (arg0 == 8) {
            this.field1333.field6641 = this.field1321;
            return;
        } else if (arg0 == 9) {
            this.field1329 = arg1.method215((byte) 119);
            return;
        } else if (arg0 == 10) {
            this.field1332 = false;
            return;
        } else if (arg0 == 11) {
            this.field1340 = arg1.method201((byte) -126);
            return;
        } else if (arg0 == 12) {
            this.field1326 = true;
            return;
        } else if (arg0 == 13) {
            this.field1339 = arg1.method219(-122);
            return;
        } else {
            if (arg0 == 14) {
                this.field1334 = arg1.method201((byte) -117);
            } else if (arg0 == 15) {
                this.field1324 = arg1.method215((byte) 107);
                if (this.field1324 == 65535) {
                    this.field1324 = -1;
                    return;
                }
            } else if (arg0 == 16) {
                this.field1330 = arg1.method201((byte) -106);
                return;
            } else {
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method581(int arg0) {
        if (this.field1324 == -1) {
            this.field1324 = this.field1328;
        }
        this.field1340 = this.field1321 | this.field1340 << 8;
        if (arg0 == -1) {
            field1338++;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method582(byte arg0) {
        field1345 = null;
        if (arg0 != 12) {
            method582((byte) 76);
        }
        field1341 = null;
        field1343 = null;
        field1342 = null;
        field1346 = null;
        field1348 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILbt;)V")
    public final void method583(int arg0, class32 arg1) {
        while (true) {
            int var3 = arg1.method201((byte) -106);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field1332 = true;
                }
                field1323++;
                return;
            }
            this.method580(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIB)I")
    public static final int method584(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 > -119) {
            return -86;
        }
        field1325++;
        if (class221.field2945 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var6 = arg3 >> 7;
            int var7 = arg4 >> 7;
            if (arg2 < 0 || arg0 < 0 || class295.field3947 - 1 < arg2 || arg0 > class39.field567 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class295.field3947 - 1) < var6 || var7 > class39.field567 - 1) {
                return 0;
            }
            boolean var8 = (class1.field26[1][arg3 >> 7][arg4 >> 7] & 0x2) != 0;
            if ((arg3 & 0x7F) == 0) {
                boolean var9 = (class1.field26[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                boolean var10 = (class1.field26[1][var6][arg4 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class1.field26[1][arg2][arg0] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x7F) == 0) {
                boolean var11 = (class1.field26[1][arg3 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class1.field26[1][arg3 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class1.field26[1][arg2][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class221.field2945[arg1].method368(arg3, arg4);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public static final void method585(int arg0) {
        field1336++;
        class146.field2099 = new class464[class47.field639.method705((byte) -123)][];
        if (arg0 < 3) {
            field1341 = null;
        }
        class392.field5437 = new class464[class47.field639.method705((byte) -125)][];
        class248.field3308 = new boolean[class47.field639.method705((byte) -97)];
    }

    static {
        int var0 = 0;
        field1346 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1346[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1348 = new int[4];
        field1347 = 0;
    }
}
