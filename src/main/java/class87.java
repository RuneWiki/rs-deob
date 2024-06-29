import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class87 extends class216 {

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "Lbd;")
    public static class162 field1553 = null;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field1552 = 0;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "Lbd;")
    private static class162 field1542 = class17.method142(0, "Select");

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "Lbd;")
    public static class162 field1551 = field1542;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field1556 = 0;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Z")
    public static boolean field1558 = true;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Lbd;")
    private static class162 field1559 = class17.method142(0, "Examine");

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "Lbd;")
    public static class162 field1539 = field1559;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "[I")
    public int[] field1547;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "[I")
    private int[] field1557;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "[Lbd;")
    private class162[] field1541;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "[[I")
    private int[][] field1549;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V", line = 4)
    public static void method656(byte arg0) {
        field1559 = null;
        field1553 = null;
        field1539 = null;
        field1551 = null;
        field1542 = null;
        if (arg0 >= -70) {
            field1559 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([ILb;B)V", line = 19)
    public final void method657(int[] arg0, class94 arg1, byte arg2) {
        field1555++;
        if (this.field1557 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1557.length && arg0.length > var4; var4++) {
            int var5 = class136.field2430[this.method666(-11037, var4)];
            if (var5 > 0) {
                arg1.method749((long) arg0[var4], 10990, var5);
            }
        }
        if (arg2 != 50) {
            field1551 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZIILob;)V", line = 49)
    public static final void method658(int arg0, boolean arg1, int arg2, int arg3, class78 arg4) {
        field1544++;
        int var5 = arg4.field1340;
        int var6 = arg4.field1367;
        if (arg4.field1310 == 0) {
            arg4.field1340 = arg4.field1219;
        } else if (arg4.field1310 == 1) {
            arg4.field1340 = arg0 - arg4.field1219;
        } else if (arg4.field1310 == 2) {
            arg4.field1340 = arg4.field1219 * arg0 >> 14;
        } else if (arg4.field1310 == 3) {
            if (arg4.field1231 == 2) {
                arg4.field1340 = (arg4.field1219 - 1) * arg4.field1257 + arg4.field1219 * 32;
            } else if (arg4.field1231 == 7) {
                arg4.field1340 = (arg4.field1219 - 1) * arg4.field1257 + arg4.field1219 * 115;
            }
        }
        if (arg4.field1242 == 0) {
            arg4.field1367 = arg4.field1278;
        } else if (arg4.field1242 == 1) {
            arg4.field1367 = arg3 - arg4.field1278;
        } else if (arg4.field1242 == 2) {
            arg4.field1367 = arg4.field1278 * arg3 >> 14;
        } else if (arg4.field1242 == 3) {
            if (arg4.field1231 == 2) {
                arg4.field1367 = arg4.field1278 * 32 + ((arg4.field1278 - 1) * arg4.field1346);
            } else if (arg4.field1231 == 7) {
                arg4.field1367 = (arg4.field1278 - 1) * arg4.field1346 + arg4.field1278 * 12;
            }
        }
        if (arg4.field1310 == 4) {
            arg4.field1340 = arg4.field1367 * arg4.field1294 / arg4.field1304;
        }
        if (arg4.field1242 == 4) {
            arg4.field1367 = arg4.field1340 * arg4.field1304 / arg4.field1294;
        }
        if (arg2 != 1) {
            return;
        }
        if (class255.field4223 && (client.method861(arg4) != 0 || arg4.field1231 == 0)) {
            if (arg4.field1367 < 5 && arg4.field1340 < 5) {
                arg4.field1340 = 5;
                arg4.field1367 = 5;
            } else {
                if (arg4.field1340 <= 0) {
                    arg4.field1340 = 5;
                }
                if (arg4.field1367 <= 0) {
                    arg4.field1367 = 5;
                }
            }
        }
        if (arg4.field1313 == 1337) {
            class171.field2970 = arg4;
        }
        if (arg1 && arg4.field1268 != null && (arg4.field1340 != var5 || arg4.field1367 != var6)) {
            class180 var7 = new class180();
            var7.field3102 = arg4.field1268;
            var7.field3099 = arg4;
            class292.field4920.method167(false, var7);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLb;)Lbd;", line = 150)
    public final class162 method659(boolean arg0, class94 arg1) {
        field1543++;
        class162 var3 = class203.method1511((byte) 95, 80);
        if (arg0) {
            this.method657((int[]) null, (class94) null, (byte) 48);
        }
        if (this.field1557 != null) {
            for (int var4 = 0; var4 < this.field1557.length; var4++) {
                var3.method1264(115, this.field1541[var4]);
                var3.method1264(-86, class53.method381(this.field1557[var4], this.field1549[var4], true, arg1.method705(7606, class238.field3956[this.field1557[var4]])));
            }
        }
        var3.method1264(115, this.field1541[this.field1541.length - 1]);
        return var3.method1266(18333);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 184)
    public final void method660(int arg0) {
        if (arg0 != -16952) {
            return;
        }
        field1554++;
        if (this.field1547 != null) {
            for (int var2 = 0; var2 < this.field1547.length; var2++) {
                this.field1547[var2] = class289.method2005(this.field1547[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILb;)V", line = 209)
    private final void method661(int arg0, int arg1, class94 arg2) {
        if (arg0 == 1) {
            this.field1541 = arg2.method744((byte) 116).method1277(arg1 ^ 0x410A, 60);
        } else if (arg0 == 2) {
            int var8 = arg2.method756(915905888);
            this.field1547 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1547[var9] = arg2.method761((byte) 108);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method756(915905888);
            this.field1557 = new int[var4];
            this.field1549 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method761((byte) 108);
                this.field1557[var5] = var6;
                this.field1549[var5] = new int[class72.field1144[var6]];
                for (int var7 = 0; var7 < class72.field1144[var6]; var7++) {
                    this.field1549[var5][var7] = arg2.method761((byte) 108);
                }
            }
        }
        field1546++;
        if (arg1 != 16651) {
            field1542 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ZLb;)V", line = 276)
    public final void method662(boolean arg0, class94 arg1) {
        field1545++;
        while (true) {
            int var3 = arg1.method756(915905888);
            if (var3 == 0) {
                if (arg0) {
                    this.method666(108, -39);
                }
                return;
            }
            this.method661(var3, 16651, arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)I", line = 317)
    public final int method663(boolean arg0) {
        field1560++;
        if (this.field1557 == null) {
            return 0;
        } else {
            if (arg0) {
                field1548 = -10;
            }
            return this.field1557.length;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Lbd;", line = 332)
    public final class162 method664(int arg0) {
        if (arg0 > -12) {
            field1553 = (class162) null;
        }
        class162 var2 = class203.method1511((byte) 71, 80);
        field1538++;
        if (this.field1541 == null) {
            return class262.field4368;
        }
        var2.method1264(111, this.field1541[0]);
        for (int var3 = 1; var3 < this.field1541.length; var3++) {
            var2.method1264(24, class220.field3680);
            var2.method1264(-117, this.field1541[var3]);
        }
        return var2.method1266(18333);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I", line = 370)
    public final int method665(int arg0, int arg1, int arg2) {
        field1537++;
        if (arg1 <= 119) {
            field1548 = -44;
        }
        if (this.field1557 == null || arg2 < 0 || arg2 > this.field1557.length) {
            return -1;
        } else if (this.field1549[arg2] == null || arg0 < 0 || arg0 > this.field1549[arg2].length) {
            return -1;
        } else {
            return this.field1549[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I", line = 398)
    public final int method666(int arg0, int arg1) {
        if (arg0 == -11037) {
            field1540++;
            return this.field1557 == null || arg1 < 0 || this.field1557.length < arg1 ? -1 : this.field1557[arg1];
        } else {
            return -103;
        }
    }
}
