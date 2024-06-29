import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class91 extends class212 {

    @OriginalMember(owner = "client!we", name = "V", descriptor = "Z")
    public boolean field1419 = false;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public int field1408 = -1;

    @OriginalMember(owner = "client!we", name = "ib", descriptor = "[I")
    private int[] field1432 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!we", name = "bb", descriptor = "[I")
    public static int[] field1425 = new int[1000];

    @OriginalMember(owner = "client!we", name = "N", descriptor = "Lsb;")
    public static class12 field1411 = null;

    @OriginalMember(owner = "client!we", name = "gb", descriptor = "Lmj;")
    public static class129 field1430 = null;

    @OriginalMember(owner = "client!we", name = "db", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!we", name = "X", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!we", name = "hb", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!we", name = "jb", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "Lrd;")
    public static class207 field1418;

    @OriginalMember(owner = "client!we", name = "cb", descriptor = "Lrd;")
    public static class207 field1426;

    @OriginalMember(owner = "client!we", name = "W", descriptor = "Loe;")
    public static class256 field1420;

    @OriginalMember(owner = "client!we", name = "eb", descriptor = "Loe;")
    public static class256 field1428;

    @OriginalMember(owner = "client!we", name = "ab", descriptor = "[I")
    private int[] field1424;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "[S")
    private short[] field1410;

    @OriginalMember(owner = "client!we", name = "Y", descriptor = "[S")
    private short[] field1422;

    @OriginalMember(owner = "client!we", name = "kb", descriptor = "[S")
    private short[] field1434;

    @OriginalMember(owner = "client!we", name = "lb", descriptor = "[S")
    private short[] field1435;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lnh;I)V")
    public final void method596(class112 arg0, int arg1) {
        field1412++;
        while (true) {
            int var3 = arg0.method758(true);
            if (var3 == 0) {
                if (arg1 == -20306) {
                    return;
                } else {
                    this.method598(-93);
                    return;
                }
            }
            this.method600(var3, arg0, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method597(byte arg0) {
        field1428 = null;
        if (arg0 != 108) {
            return;
        }
        field1430 = null;
        field1426 = null;
        field1418 = null;
        field1420 = null;
        field1425 = null;
        field1411 = null;
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "(I)Z")
    public final boolean method598(int arg0) {
        field1415++;
        if (this.field1424 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 > -16) {
            field1430 = null;
        }
        for (int var3 = 0; var3 < this.field1424.length; var3++) {
            if (!class88.field1368.method1707(-1, 0, this.field1424[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)Lvj;")
    public final class218 method599(byte arg0) {
        field1414++;
        class218[] var2 = new class218[5];
        if (arg0 > -90) {
            field1420 = null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1432[var4] != -1) {
                var2[var3++] = class218.method1446(class88.field1368, this.field1432[var4], 0);
            }
        }
        class218 var5 = new class218(var2, var3);
        if (this.field1422 != null) {
            for (int var6 = 0; var6 < this.field1422.length; var6++) {
                var5.method1433(this.field1422[var6], this.field1435[var6]);
            }
        }
        if (this.field1410 != null) {
            for (int var7 = 0; var7 < this.field1410.length; var7++) {
                var5.method1430(this.field1410[var7], this.field1434[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILnh;B)V")
    private final void method600(int arg0, class112 arg1, byte arg2) {
        field1421++;
        if (arg0 == 1) {
            this.field1408 = arg1.method758(true);
        } else if (arg0 == 2) {
            int var4 = arg1.method758(true);
            this.field1424 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1424[var5] = arg1.method731(false);
            }
        } else if (arg0 == 3) {
            this.field1419 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method758(true);
            this.field1422 = new short[var6];
            this.field1435 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1422[var7] = (short) arg1.method731(false);
                this.field1435[var7] = (short) arg1.method731(false);
            }
        } else if (arg0 == 41) {
            int var8 = arg1.method758(true);
            this.field1410 = new short[var8];
            this.field1434 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1410[var9] = (short) arg1.method731(false);
                this.field1434[var9] = (short) arg1.method731(false);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1432[arg0 - 60] = arg1.method731(false);
        }
        if (arg2 >= -107) {
            this.field1422 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)I")
    public static final int method601(int arg0, byte arg1) {
        field1416++;
        if (arg1 >= -10) {
            return -93;
        } else if (class199.field3438 == 1) {
            return 7;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 191) {
            return 5;
        } else if (arg0 == 69) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "(I)Z")
    public static final boolean method602(int arg0) {
        field1429++;
        try {
            if (arg0 != -51) {
                field1430 = null;
            }
            return class192.method1249((byte) 34);
        } catch (IOException var4) {
            class230.method1489(128);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class108.field1740 + "," + class36.field452 + "," + class209.field3630 + " - " + class31.field377 + "," + (class246.field4261 + class7.field85.field206[0]) + "," + (class7.field85.field219[0] + class125.field2060) + " - ";
            for (int var3 = 0; class31.field377 > var3 && var3 < 50; var3++) {
                var2 = var2 + class112.field1815.field1780[var3] + ",";
            }
            class112.method763(var5, var2, 107);
            class52.method364(1);
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lmj;B)V")
    public static final void method603(class129 arg0, byte arg1) {
        field1417++;
        if (arg1 > -127) {
            method601(-50, (byte) 29);
        }
        int var2 = arg0.field2136;
        if (var2 == 324) {
            if (class143.field2522 == -1) {
                class143.field2522 = arg0.field2281;
                class121.field1980 = arg0.field2287;
            }
            if (class34.field422.field2458) {
                arg0.field2281 = class143.field2522;
            } else {
                arg0.field2281 = class121.field1980;
            }
        } else if (var2 == 325) {
            if (class143.field2522 == -1) {
                class143.field2522 = arg0.field2281;
                class121.field1980 = arg0.field2287;
            }
            if (class34.field422.field2458) {
                arg0.field2281 = class121.field1980;
            } else {
                arg0.field2281 = class143.field2522;
            }
        } else if (var2 == 327) {
            arg0.field2124 = 150;
            arg0.field2186 = (int) (Math.sin((double) class133.field2326 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2180 = 5;
            arg0.field2259 = -1;
        } else if (var2 == 328) {
            if (class7.field85.field2000 == null) {
                arg0.field2259 = 0;
            } else {
                arg0.field2124 = 150;
                arg0.field2186 = (int) (Math.sin((double) class133.field2326 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field2180 = 5;
                arg0.field2259 = ((int) class7.field85.field2000.method1084(32383) << 11) + 2047;
                arg0.field2229 = class7.field85.field169;
                arg0.field2239 = class7.field85.field223;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
    public static final int method604(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field1433++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else {
            int var5 = 7 % ((arg1 - 40) / 42);
            return var4 == 2 ? 7 - arg3 : -arg0 + 7;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Lvj;")
    public final class218 method605(byte arg0) {
        field1409++;
        if (arg0 >= -106) {
            method601(-84, (byte) -35);
        }
        if (this.field1424 == null) {
            return null;
        }
        class218[] var2 = new class218[this.field1424.length];
        for (int var3 = 0; var3 < this.field1424.length; var3++) {
            var2[var3] = class218.method1446(class88.field1368, this.field1424[var3], 0);
        }
        class218 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class218(var2, var2.length);
        }
        if (this.field1422 != null) {
            for (int var5 = 0; var5 < this.field1422.length; var5++) {
                var4.method1433(this.field1422[var5], this.field1435[var5]);
            }
        }
        if (this.field1410 != null) {
            for (int var6 = 0; var6 < this.field1410.length; var6++) {
                var4.method1430(this.field1410[var6], this.field1434[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "(I)Z")
    public final boolean method606(int arg0) {
        field1413++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1432[var3] != -1 && !class88.field1368.method1707(-1, 0, this.field1432[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;")
    public static final Object method607(boolean arg0, byte[] arg1, boolean arg2) {
        if (arg2) {
            method604(-114, -52, 62, 3);
        }
        field1431++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class57.field781) {
            try {
                class84 var3 = (class84) Class.forName("gk").getDeclaredConstructor().newInstance();
                var3.method557(true, arg1);
                return var3;
            } catch (Throwable var4) {
                class57.field781 = true;
            }
        }
        return arg0 ? class26.method175(false, arg1) : arg1;
    }
}
