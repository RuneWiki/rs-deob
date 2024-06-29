import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class95 {

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "Ljava/lang/String;")
    public String field1350 = null;

    @OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
    public int field1362 = 0;

    @OriginalMember(owner = "client!tn", name = "P", descriptor = "I")
    public int field1363 = -1;

    @OriginalMember(owner = "client!tn", name = "R", descriptor = "I")
    public int field1365 = -1;

    @OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
    public static int field1358 = 1409;

    @OriginalMember(owner = "client!tn", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field1368 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "B")
    public byte field1322;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "B")
    public byte field1334;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "B")
    public byte field1340;

    @OriginalMember(owner = "client!tn", name = "w", descriptor = "B")
    public byte field1344;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!tn", name = "x", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!tn", name = "S", descriptor = "J")
    public long field1366;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "Ltca;")
    private class184 field1349;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "Lnaa;")
    public static class79 field1331;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "Z")
    private boolean field1341;

    @OriginalMember(owner = "client!tn", name = "z", descriptor = "Z")
    public static boolean field1347;

    @OriginalMember(owner = "client!tn", name = "A", descriptor = "Z")
    public boolean field1348;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "Z")
    private boolean field1355;

    @OriginalMember(owner = "client!tn", name = "Q", descriptor = "[B")
    public byte[] field1364;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "[I")
    private int[] field1325;

    @OriginalMember(owner = "client!tn", name = "N", descriptor = "[I")
    private int[] field1361;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "[J")
    private long[] field1330;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "[J")
    private long[] field1357;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field1332;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field1351;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLdt;)V", line = 3)
    private final void method730(byte arg0, class254 arg1) {
        field1324++;
        int var3 = arg1.method1731((byte) 64);
        if (var3 < 1 || var3 > 3) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg1.method1731((byte) 64);
        if ((var4 & 0x2) != 0) {
            this.field1341 = true;
        }
        if ((var4 & 0x1) != 0) {
            this.field1355 = true;
        }
        if (!this.field1341) {
            this.field1351 = null;
            this.field1332 = null;
        }
        if (!this.field1355) {
            this.field1330 = null;
            this.field1357 = null;
        }
        this.field1362 = arg1.method1672(-16516);
        arg1.method1672(-16516);
        this.field1338 = arg1.method1728((byte) 117);
        this.field1359 = arg1.method1731((byte) 64);
        this.field1350 = arg1.method1699(-102);
        this.field1348 = arg1.method1731((byte) 64) == 1;
        this.field1344 = arg1.method1737(true);
        this.field1322 = arg1.method1737(true);
        this.field1334 = arg1.method1737(true);
        this.field1340 = arg1.method1737(true);
        if (this.field1338 > 0) {
            if (this.field1355 && (this.field1357 == null || this.field1357.length < this.field1338)) {
                this.field1357 = new long[this.field1338];
            }
            if (this.field1341 && (this.field1351 == null || this.field1338 > this.field1351.length)) {
                this.field1351 = new String[this.field1338];
            }
            if (this.field1364 == null || this.field1338 > this.field1364.length) {
                this.field1364 = new byte[this.field1338];
            }
            if (this.field1325 == null || this.field1325.length < this.field1338) {
                this.field1325 = new int[this.field1338];
            }
            for (int var5 = 0; var5 < this.field1338; var5++) {
                if (this.field1355) {
                    this.field1357[var5] = arg1.method1723(21795);
                }
                if (this.field1341) {
                    this.field1351[var5] = arg1.method1694(0);
                }
                this.field1364[var5] = arg1.method1737(true);
                if (var3 >= 2) {
                    this.field1325[var5] = arg1.method1672(-16516);
                }
            }
            this.method739(true);
        }
        if (this.field1359 > 0) {
            if (this.field1355 && (this.field1330 == null || this.field1330.length < this.field1359)) {
                this.field1330 = new long[this.field1359];
            }
            if (this.field1341 && (this.field1332 == null || this.field1359 > this.field1332.length)) {
                this.field1332 = new String[this.field1359];
            }
            for (int var6 = 0; var6 < this.field1359; var6++) {
                if (this.field1355) {
                    this.field1330[var6] = arg1.method1723(21795);
                }
                if (this.field1341) {
                    this.field1332[var6] = arg1.method1694(0);
                }
            }
        }
        if (var3 >= 3) {
            int var7 = arg1.method1728((byte) 48);
            if (var7 > 0) {
                this.field1349 = new class184(var7 < 16 ? class8.method45(23714, var7) : 16);
                while (var7-- > 0) {
                    int var8 = arg1.method1672(-16516);
                    int var9 = var8 & 0x3FFFFFFF;
                    int var10 = var8 >>> 30;
                    if (var10 == 0) {
                        int var11 = arg1.method1672(-16516);
                        this.field1349.method1247(4070, (long) var9, new class445(var11));
                    } else if (var10 == 1) {
                        long var12 = arg1.method1723(21795);
                        this.field1349.method1247(4070, (long) var9, new class137(var12));
                    } else if (var10 == 2) {
                        String var14 = arg1.method1699(-122);
                        this.field1349.method1247(4070, (long) var9, new class553(var14));
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.method750(91, 24);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBII)Ljava/lang/Integer;", line = 174)
    public final Integer method731(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 > -87) {
            this.method738(-41, true);
        }
        field1343++;
        if (this.field1349 == null) {
            return null;
        }
        class159 var5 = this.field1349.method1248(87, (long) arg3);
        if (var5 != null && var5 instanceof class445) {
            int var6 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
            return Integer.valueOf((((class445) var5).field6408 & var6) >>> arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I", line = 202)
    public static final int[] method732(int arg0, int arg1) {
        field1336++;
        int[] var2 = new int[3];
        class215.method1391(false, class335.method2152(arg0, arg1));
        var2[0] = class79.field1085.get(5);
        var2[1] = class79.field1085.get(2);
        var2[2] = class79.field1085.get(1);
        return var2;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IJI)Z", line = 220)
    public final boolean method733(int arg0, long arg1, int arg2) {
        if (arg0 != 0) {
            return false;
        }
        field1335++;
        if (this.field1349 == null) {
            this.field1349 = new class184(4);
        } else {
            class159 var5 = this.field1349.method1248(99, (long) arg2);
            if (var5 != null) {
                if (var5 instanceof class137) {
                    class137 var6 = (class137) var5;
                    if (var6.field1846 == arg1) {
                        return false;
                    }
                    var6.field1846 = arg1;
                    return true;
                }
                var5.method1102((byte) 114);
            }
        }
        this.field1349.method1247(arg0 ^ 0xFE6, (long) arg2, new class137(arg1));
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)Z", line = 265)
    public final boolean method734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1327++;
        if (arg0 <= 97) {
            return true;
        }
        int var6 = (0x1 << arg2) - 1;
        int var7 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        int var8 = var6 ^ var7;
        int var9 = arg4 << arg2;
        int var10 = var9 & var8;
        if (this.field1349 == null) {
            this.field1349 = new class184(4);
        } else {
            class159 var11 = this.field1349.method1248(120, (long) arg1);
            if (var11 != null) {
                if (var11 instanceof class445) {
                    class445 var12 = (class445) var11;
                    if ((var12.field6408 & var8) == var10) {
                        return false;
                    }
                    var12.field6408 &= ~var8;
                    var12.field6408 |= var10;
                    return true;
                }
                var11.method1102((byte) 70);
            }
        }
        this.field1349.method1247(4070, (long) arg1, new class445(var10));
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)Ljava/lang/Integer;", line = 312)
    public final Integer method735(int arg0, int arg1) {
        field1352++;
        if (this.field1349 == null) {
            return null;
        }
        class159 var3 = this.field1349.method1248(98, (long) arg0);
        if (var3 != null && var3 instanceof class445) {
            if (arg1 != 0) {
                this.field1355 = true;
            }
            return Integer.valueOf(((class445) var3).field6408);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BI)V", line = 338)
    public final void method736(byte arg0, int arg1) {
        field1326++;
        if (arg1 < 0 || arg1 >= this.field1338) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg1 + " memberCount:" + this.field1338);
        }
        if (arg0 >= -127) {
            method732(106, 1);
        }
        this.field1361 = null;
        this.field1338--;
        if (this.field1338 == 0) {
            this.field1365 = -1;
            this.field1363 = -1;
            this.field1351 = null;
            this.field1325 = null;
            this.field1357 = null;
            this.field1364 = null;
            return;
        }
        class421.method2534(this.field1364, arg1 + 1, this.field1364, arg1, this.field1338 - arg1);
        class421.method2531(this.field1325, arg1 + 1, this.field1325, arg1, this.field1338 - arg1);
        if (this.field1357 != null) {
            class421.method2536(this.field1357, arg1 + 1, this.field1357, arg1, this.field1338 - arg1);
        }
        if (this.field1351 != null) {
            class421.method2533(this.field1351, arg1 + 1, this.field1351, arg1, this.field1338 - arg1);
        }
        if (this.field1365 == arg1 || this.field1363 == arg1) {
            this.method739(true);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BII)I", line = 382)
    public final int method737(byte arg0, int arg1, int arg2) {
        field1337++;
        if (arg0 == 126 || arg0 == 127) {
            return -1;
        } else if (this.field1365 == arg1 && (this.field1363 == -1 || this.field1364[this.field1363] < 125)) {
            return -1;
        } else if (this.field1364[arg1] == arg0) {
            return -1;
        } else {
            this.field1364[arg1] = arg0;
            this.method739(true);
            if (arg2 != 0) {
                this.method735(-54, 44);
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 407)
    public final String method738(int arg0, boolean arg1) {
        field1356++;
        if (this.field1349 == null) {
            return null;
        } else if (arg1) {
            class159 var3 = this.field1349.method1248(90, (long) arg0);
            return var3 != null && var3 instanceof class553 ? ((class553) var3).field7630 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V", line = 430)
    private final void method739(boolean arg0) {
        field1360++;
        if (this.field1338 == 0) {
            this.field1365 = -1;
            this.field1363 = -1;
            return;
        }
        this.field1363 = -1;
        this.field1365 = -1;
        int var2 = 0;
        byte var3 = this.field1364[0];
        for (int var4 = 1; var4 < this.field1338; var4++) {
            if (var3 < this.field1364[var4]) {
                if (var3 == 125) {
                    this.field1363 = var2;
                }
                var2 = var4;
                var3 = this.field1364[var4];
            } else if (this.field1363 == -1 && this.field1364[var4] == 125) {
                this.field1363 = var4;
            }
        }
        if (!arg0) {
            field1358 = -23;
        }
        this.field1365 = var2;
        if (this.field1365 != -1) {
            this.field1364[this.field1365] = 126;
        }
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(II)V", line = 482)
    private final void method740(int arg0, int arg1) {
        if (this.field1355) {
            if (this.field1357 == null) {
                this.field1357 = new long[arg0];
            } else {
                class421.method2536(this.field1357, 0, this.field1357 = new long[arg0], 0, this.field1338);
            }
        }
        field1328++;
        if (arg1 <= 61) {
            return;
        }
        if (this.field1341) {
            if (this.field1351 == null) {
                this.field1351 = new String[arg0];
            } else {
                class421.method2533(this.field1351, 0, this.field1351 = new String[arg0], 0, this.field1338);
            }
        }
        if (this.field1364 == null) {
            this.field1364 = new byte[arg0];
        } else {
            class421.method2534(this.field1364, 0, this.field1364 = new byte[arg0], 0, this.field1338);
        }
        if (this.field1325 == null) {
            this.field1325 = new int[arg0];
        } else {
            class421.method2531(this.field1325, 0, this.field1325 = new int[arg0], 0, this.field1338);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIZI)I", line = 529)
    public final int method741(int arg0, int arg1, boolean arg2, int arg3) {
        field1346++;
        if (arg2) {
            this.method750(1, -13);
        }
        int var5 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
        return (this.field1325[arg3] & var5) >>> arg1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)Ljava/lang/Long;", line = 542)
    public final Long method742(int arg0, byte arg1) {
        field1339++;
        if (this.field1349 == null) {
            return null;
        } else if (arg1 == -68) {
            class159 var3 = this.field1349.method1248(115, (long) arg0);
            return var3 != null && var3 instanceof class137 ? Long.valueOf(((class137) var3).field1846) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)[I", line = 562)
    public final int[] method743(boolean arg0) {
        field1323++;
        if (this.field1361 == null) {
            String[] var2 = new String[this.field1338];
            this.field1361 = new int[this.field1338];
            int var3 = 0;
            while (var3 < this.field1338) {
                var2[var3] = this.field1351[var3];
                this.field1361[var3] = var3++;
            }
            class267.method1785(var2, this.field1361, 3);
        }
        if (arg0) {
            this.field1348 = true;
        }
        return this.field1361;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;IJ)V", line = 593)
    public final void method744(String arg0, int arg1, long arg2) {
        field1342++;
        if (arg0 != null && arg0.length() == 0) {
            arg0 = null;
        }
        if (arg1 != -20179) {
            this.field1357 = null;
        }
        if (this.field1355 == arg2 <= 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field1355 + " but userhash:" + arg2);
        } else if (arg0 == null == this.field1341) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field1341 + " but displayname:" + arg0);
        } else {
            if (arg2 > 0L && (this.field1330 == null || this.field1330.length <= this.field1359) || arg0 != null && (this.field1332 == null || this.field1359 >= this.field1332.length)) {
                this.method748(this.field1359 + 5, arg1 ^ 0x4ED2);
            }
            if (this.field1330 != null) {
                this.field1330[this.field1359] = arg2;
            }
            if (this.field1332 != null) {
                this.field1332[this.field1359] = arg0;
            }
            this.field1359++;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IBIII)I", line = 627)
    public final int method745(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1333++;
        int var6 = (0x1 << arg4) - 1;
        if (arg1 != -96) {
            this.field1351 = null;
        }
        int var7 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
        int var8 = arg3 << arg4;
        int var9 = var6 ^ var7;
        int var10 = var8 & var9;
        int var11 = this.field1325[arg2];
        if ((var9 & var11) == var10) {
            return -1;
        } else {
            int var12 = var11 & ~var9;
            this.field1325[arg2] = class670.method3699(var10, var12);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 653)
    public static void method746(int arg0) {
        if (arg0 > -94) {
            field1358 = 73;
        }
        field1368 = null;
        field1331 = null;
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Ldt;)V", line = 919)
    public class95(class254 arg0) {
        this.method730((byte) 0, arg0);
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 934)
    private class95() {
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;)I", line = 679)
    public final int method747(int arg0, String arg1) {
        field1369++;
        if (arg1 == null || arg1.length() == 0) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != -2807) {
            return 81;
        }
        while (var3 < this.field1338) {
            if (this.field1351[var3].equals(arg1)) {
                return var3;
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "(II)V", line = 711)
    private final void method748(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field1345++;
        if (this.field1355) {
            if (this.field1330 == null) {
                this.field1330 = new long[arg0];
            } else {
                class421.method2536(this.field1330, 0, this.field1330 = new long[arg0], 0, this.field1359);
            }
        }
        if (!this.field1341) {
            return;
        }
        if (this.field1332 == null) {
            this.field1332 = new String[arg0];
        } else {
            class421.method2533(this.field1332, 0, this.field1332 = new String[arg0], 0, this.field1359);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 739)
    public final boolean method749(int arg0, String arg1, int arg2) {
        field1329++;
        if (arg1 == null) {
            arg1 = "";
        } else if (arg1.length() > 80) {
            arg1 = arg1.substring(0, 80);
        }
        if (this.field1349 == null) {
            this.field1349 = new class184(4);
        } else {
            class159 var4 = this.field1349.method1248(126, (long) arg0);
            if (var4 != null) {
                if (var4 instanceof class553) {
                    class553 var5 = (class553) var4;
                    if (var5.field7630.equals(arg1)) {
                        return false;
                    }
                    var5.field7630 = arg1;
                    return true;
                }
                var4.method1102((byte) 54);
            }
        }
        if (arg2 > -32) {
            return true;
        } else {
            this.field1349.method1247(4070, (long) arg0, new class553(arg1));
            return true;
        }
    }

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "(II)V", line = 807)
    public final void method750(int arg0, int arg1) {
        if (arg0 != -2) {
            this.method749(13, null, 83);
        }
        field1353++;
        this.field1359--;
        if (this.field1359 == 0) {
            this.field1332 = null;
            this.field1330 = null;
            return;
        }
        if (this.field1330 != null) {
            class421.method2536(this.field1330, arg1 + 1, this.field1330, arg1, this.field1359 - arg1);
        }
        if (this.field1332 != null) {
            class421.method2533(this.field1332, arg1 + 1, this.field1332, arg1, this.field1359 - arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZI)Z", line = 835)
    public final boolean method751(int arg0, boolean arg1, int arg2) {
        field1354++;
        if (this.field1349 == null) {
            this.field1349 = new class184(4);
        } else {
            class159 var4 = this.field1349.method1248(113, (long) arg2);
            if (var4 != null) {
                if (var4 instanceof class445) {
                    class445 var5 = (class445) var4;
                    if (var5.field6408 == arg0) {
                        return false;
                    }
                    var5.field6408 = arg0;
                    return true;
                }
                var4.method1102((byte) 77);
            }
        }
        this.field1349.method1247(4070, (long) arg2, new class445(arg0));
        if (!arg1) {
            this.field1363 = -93;
        }
        return true;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(JLjava/lang/String;I)V", line = 873)
    public final void method752(long arg0, String arg1, int arg2) {
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        field1367++;
        if (arg0 <= 0L == this.field1355) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field1355 + " but userhash:" + arg0);
        } else if (arg1 == null == this.field1341) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field1341 + " but displayname:" + arg1);
        } else {
            if (arg0 > 0L && (this.field1357 == null || this.field1357.length <= this.field1338) || arg1 != null && (this.field1351 == null || this.field1338 >= this.field1351.length)) {
                this.method740(this.field1338 + 5, 80);
            }
            if (this.field1357 != null) {
                this.field1357[this.field1338] = arg0;
            }
            if (this.field1351 != null) {
                this.field1351[this.field1338] = arg1;
            }
            if (this.field1365 == -1) {
                this.field1365 = this.field1338;
                this.field1364[this.field1338] = 126;
            } else {
                this.field1364[this.field1338] = 0;
            }
            this.field1325[this.field1338] = 0;
            this.field1361 = null;
            if (arg2 != -28935) {
                this.method733(47, -35L, 97);
            }
            this.field1338++;
        }
    }
}
