import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class107 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Z")
    public static boolean field1779 = false;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[[Z")
    public static boolean[][] field1785 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1786 = 0;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1783 = "level: ";

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1782 = "cyan:";

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[I")
    public static int[] field1787 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1792 = "Connection lost.";

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Lob;")
    public static class292 field1789;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "[[S")
    public static short[][] field1781;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 4)
    public static void method817(int arg0) {
        field1782 = null;
        field1792 = null;
        if (arg0 != -3513) {
            field1779 = false;
        }
        field1789 = null;
        field1787 = null;
        field1785 = (boolean[][]) null;
        field1783 = null;
        field1781 = (short[][]) null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", line = 22)
    public static final void method818(byte arg0, String arg1, String arg2, String arg3, int arg4, int arg5) {
        field1790++;
        for (int var6 = 99; var6 > 0; var6--) {
            class243.field3756[var6] = class243.field3756[var6 - 1];
            class63.field977[var6] = class63.field977[var6 - 1];
            class91.field1499[var6] = class91.field1499[var6 - 1];
            class178.field2786[var6] = class178.field2786[var6 - 1];
            class134.field2121[var6] = class134.field2121[var6 - 1];
        }
        if (arg0 != -26) {
            field1779 = true;
        }
        class277.field4287++;
        class180.field2889 = class200.field3157;
        class63.field977[0] = arg2;
        class243.field3756[0] = arg4;
        class91.field1499[0] = arg3;
        class134.field2121[0] = arg5;
        class178.field2786[0] = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Lal;", line = 53)
    public static final class323 method819(int arg0, int arg1) {
        field1784++;
        class323 var2 = (class323) class221.field3539.method1830((long) arg0, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class210.field3354.method467(arg0, 70, 4);
        if (arg1 != 16173) {
            return (class323) null;
        }
        class323 var4 = new class323();
        if (var3 != null) {
            var4.method2204(arg0, new class101(var3), true);
        }
        class221.field3539.method1831((long) arg0, var4, -13897);
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 87)
    public static final void method820(int arg0) {
        field1780++;
        if (!class219.field3514) {
            return;
        }
        if (arg0 < 63) {
            method817(-25);
        }
        class292 var1 = class41.method330(class233.field3692, class30.field493, -1);
        if (var1 != null && var1.field4474 != null) {
            class88 var2 = new class88();
            var2.field1357 = var1;
            var2.field1340 = var1.field4474;
            class228.method1656(var2, (byte) -58);
        }
        class219.field3514 = false;
        class273.field4240 = -1;
        class143.method1091(var1, (byte) 112);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V", line = 117)
    public static final void method821(byte arg0, int arg1) {
        field1788++;
        class29.field477.method1828(arg1, (byte) 105);
        class78.field1186.method1828(arg1, (byte) 124);
        if (arg0 != -94) {
            method822((byte) 45);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 146)
    public static final void method822(byte arg0) {
        field1791++;
        if (arg0 > -41) {
            method818((byte) 86, (String) null, (String) null, (String) null, 71, 103);
        }
        for (int var1 = 0; var1 < class75.field1160; var1++) {
            int var2 = class231.field3673[var1];
            class305 var3 = class138.field2196[var2];
            int var4 = class267.field4132.method741(34);
            if ((var4 & 0x1) != 0) {
                var4 += class267.field4132.method741(61) << 8;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class267.field4132.method724(-1);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class267.field4132.method741(22);
                class212.method1538(false, var3, var5, var6);
            }
            if ((var4 & 0x80) != 0) {
                var3.field1451 = class267.field4132.method749((byte) -80);
                var3.field1423 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field1435 = class267.field4132.method724(-1);
                var3.field1460 = class267.field4132.method724(-1);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field4778.method1513(true)) {
                    class13.method117(var3, 32);
                }
                var3.method2112(class17.method145((byte) -114, class267.field4132.method766(true)), (byte) 119);
                var3.method643(var3.field4778.field3292, (byte) 117);
                var3.field1405 = var3.field4778.field3276;
                if (var3.field4778.method1513(true)) {
                    class272.method1962((byte) -108, var3.field1388[0], 0, var3, (class6) null, (class30) null, class41.field734, var3.field1386[0]);
                }
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class267.field4132.method759(4087);
                int var8 = class267.field4132.method746(-13551);
                var3.method646(class205.field3252, var7, var8, 27023);
                var3.field1457 = class205.field3252 + 300;
                var3.field1424 = class267.field4132.method759(4087);
            }
            if ((var4 & 0x4) != 0) {
                int var9 = class267.field4132.method741(50);
                int var10 = class267.field4132.method746(-13551);
                var3.method646(class205.field3252, var9, var10, 27023);
            }
            if ((var4 & 0x8) != 0) {
                int var11 = class267.field4132.method766(true);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class267.field4132.method775(82);
                boolean var13 = true;
                if (var11 != -1 && var3.field1417 != -1 && class6.method28(class136.method1042((byte) 116, var11).field1477, 2).field4187 < class6.method28(class136.method1042((byte) -10, var3.field1417).field1477, 2).field4187) {
                    var13 = false;
                }
                if (var13) {
                    var3.field1417 = var11;
                    var3.field1440 = 0;
                    var3.field1446 = var12 >> 16;
                    var3.field1449 = 0;
                    var3.field1461 = (var12 & 0xFFFF) + class205.field3252;
                    if (var3.field1461 > class205.field3252) {
                        var3.field1449 = -1;
                    }
                    var3.field1370 = 1;
                    if (var3.field1417 != -1 && class205.field3252 == var3.field1461) {
                        int var14 = class136.method1042((byte) -121, var3.field1417).field1477;
                        if (var14 != -1) {
                            class269 var15 = class6.method28(var14, 2);
                            if (var15 != null && var15.field4183 != null) {
                                class89.method632(var15, var3.field1442, (byte) 108, var3.field1369, false, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1366 = class267.field4132.method724(-1);
                if (var3.field1366 == 65535) {
                    var3.field1366 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var16 = class267.field4132.method759(4087);
                int[] var17 = new int[var16];
                int[] var18 = new int[var16];
                int[] var19 = new int[var16];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = class267.field4132.method724(-1);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    var17[var20] = var21;
                    var18[var20] = class267.field4132.method769(-128);
                    var19[var20] = class267.field4132.method766(true);
                }
                class264.method1879(var18, var17, -1, var19, var3);
            }
        }
    }
}
