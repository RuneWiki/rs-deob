import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class90 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lqj;")
    public static class147 field1540 = null;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Z")
    public static boolean field1542 = false;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Loa;")
    public static class99 field1541 = class221.method1463(2844, ":");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Z")
    public static boolean field1545;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[Lde;")
    public static class109[] field1538;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZI)I")
    public static final int method609(int arg0, int arg1, boolean arg2, int arg3) {
        field1536++;
        class9 var4 = (class9) class277.field4868.method1550(true, (long) arg3);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg1; var6 < var4.field66.length; var6++) {
            if (var4.field66[var6] >= 0 && var4.field66[var6] < class244.field4207) {
                class166 var7 = class222.method1468(arg1 ^ 0x1, var4.field66[var6]);
                if (var7.field2972 != null) {
                    class208 var8 = (class208) var7.field2972.method1550(true, (long) arg0);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field69[var6] * var8.field3605;
                        } else {
                            var5 += var8.field3605;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)Lk;")
    public static final class180 method610(int arg0, boolean arg1) {
        field1543++;
        class180 var2 = (class180) class193.field3390.method1811((long) arg0, 120);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field4177.method1242(class38.method296(arg0, -84), class202.method1361(0, arg0), 6801);
        class180 var4 = new class180();
        var4.field3135 = arg0;
        if (var3 != null) {
            var4.method1207(0, new class261(var3));
        }
        if (arg1) {
            class193.field3390.method1817((long) arg0, 16, var4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILob;IIIZ)V")
    public static final void method611(int arg0, int arg1, class131 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            method609(-11, 72, false, -39);
        }
        boolean var7 = true;
        boolean var8 = false;
        field1544++;
        long var9 = 0L;
        boolean var11 = false;
        if (arg5 == 0) {
            var9 = class130.method857(arg1, arg4, arg3);
        } else if (arg5 == 1) {
            var9 = class117.method789(arg1, arg4, arg3);
        } else if (arg5 == 2) {
            var9 = class240.method1565(arg1, arg4, arg3);
        } else if (arg5 == 3) {
            var9 = class226.method1488(arg1, arg4, arg3);
        }
        int var12 = ((int) var9 & 0x7C3CC) >> 14;
        int var13 = (int) var9 >> 20 & 0x3;
        int var14 = (int) (var9 >>> 32) & Integer.MAX_VALUE;
        class153 var15 = class247.method1601(26012, var14);
        if (var15.method1019((byte) -93)) {
            class50.method351(arg3, var15, 128, arg1, arg4);
        }
        if (var9 == 0L) {
            return;
        }
        if (arg5 != 0) {
            if (arg5 == 1) {
                class107.method738(arg1, arg4, arg3);
            } else if (arg5 == 2) {
                class146.method995(arg1, arg4, arg3);
                if (var15.field2685 != 0 && var15.field2717 + arg4 < 104 && var15.field2717 + arg3 < 104 && (arg4 + var15.field2704) < 104 && var15.field2704 + arg3 < 104) {
                    arg2.method876(var15.field2717, var15.field2704, var13, var15.field2751, arg3, 17271, arg4);
                    return;
                }
                return;
            } else if (arg5 == 3) {
                class291.method1949(arg1, arg4, arg3);
                if (var15.field2685 == 1) {
                    arg2.method873(arg3, arg4, (byte) 15);
                    return;
                }
            }
            return;
        }
        class251.method1627(arg1, arg4, arg3);
        if (var15.field2685 != 0) {
            arg2.method880(var12, var15.field2751, var13, (byte) 110, arg4, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method612(boolean arg0) {
        if (arg0) {
            field1538 = null;
            field1541 = null;
            field1540 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static final void method613(byte arg0) {
        int var1 = 35 % ((arg0 - 43) / 60);
        class38.field657.method1813(-1);
        field1535++;
    }
}
