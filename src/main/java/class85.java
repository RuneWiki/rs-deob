import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class85 extends class186 {

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Lpi;")
    public class158 field1704 = new class158();

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lu;")
    public class199 field1706 = new class199();

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lh;")
    private class70 field1692;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lob;")
    public static class141 field1700 = class175.method1195(40, "Welt");

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lh;")
    public static class70 field1690;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "[I")
    public static int[] field1701;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)Z")
    public static final boolean method579(int arg0, int arg1, int arg2) {
        field1695++;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        if (arg0 != 23616) {
            method583(91, false, -108, 120, 12, 8);
        }
        class54 var3 = class175.method1198(arg0 - 37714, arg2);
        return var3.method370(-36, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[IIILlf;I)V")
    private final void method580(int arg0, int[] arg1, int arg2, int arg3, class115 arg4, int arg5) {
        field1705++;
        if ((this.field1692.field1411[arg4.field2198] & 0x4) != 0 && arg4.field2195 < 0) {
            int var7 = this.field1692.field1425[arg4.field2198] / class108.field2080;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2219) / var7;
                if (var8 > arg3) {
                    arg4.field2219 += arg3 * var7;
                    break;
                }
                arg4.field2216.method474(arg1, arg0, var8);
                int var9 = class108.field2080 / 100;
                arg4.field2219 += var7 * var8 - 1048576;
                arg3 -= var8;
                int var10 = 262144 / var7;
                arg0 += var8;
                if (var10 < var9) {
                    var9 = var10;
                }
                class193 var11 = arg4.field2216;
                if (this.field1692.field1386[arg4.field2198] == 0) {
                    arg4.field2216 = class193.method1297(arg4.field2209, var11.method1301(), var11.method1273(), var11.method1282());
                } else {
                    arg4.field2216 = class193.method1297(arg4.field2209, var11.method1301(), 0, var11.method1282());
                    this.field1692.method488(-27, arg4, arg4.field2196.field1683[arg4.field2197] < 0);
                    arg4.field2216.method1289(var9, var11.method1273());
                }
                if (arg4.field2196.field1683[arg4.field2197] < 0) {
                    arg4.field2216.method1296(-1);
                }
                var11.method1307(var9);
                var11.method474(arg1, arg0, arg2 - arg0);
                if (var11.method1304()) {
                    this.field1706.method1333(var11);
                }
            }
        }
        arg4.field2216.method474(arg1, arg0, arg3);
        if (arg5 != 0) {
            this.field1704 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILpe;)[Lkc;")
    public static final class102[] method581(int arg0, int arg1, int arg2, class154 arg3) {
        if (arg1 != 36) {
            field1701 = null;
        }
        field1697++;
        return class53.method353(arg1 ^ 0xFFFFFFBF, arg0, arg3, arg2) ? class43.method279(false) : null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([III)V")
    public final void method474(int[] arg0, int arg1, int arg2) {
        field1688++;
        this.field1706.method474(arg0, arg1, arg2);
        for (class115 var4 = (class115) this.field1704.method1103((byte) -9); var4 != null; var4 = (class115) this.field1704.method1106((byte) -87)) {
            if (!this.field1692.method464(var4, (byte) 74)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2205 >= var6) {
                        this.method580(var5, arg0, var5 + var6, var6, var4, 0);
                        var4.field2205 -= var6;
                        break;
                    }
                    this.method580(var5, arg0, var5 + var6, var4.field2205, var4, 0);
                    var6 -= var4.field2205;
                    var5 += var4.field2205;
                } while (!this.field1692.method479(var5, var4, 2, arg0, var6));
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Log;B)V")
    public static final void method582(class146 arg0, byte arg1) {
        field1689++;
        if (arg1 != -101) {
            field1701 = null;
        }
        if (class165.field3200 != null) {
            try {
                class165.field3200.method619((byte) 14, 0L);
                class165.field3200.method609(arg0.field2859, arg1 ^ 0xE8D, arg0.field2865, 24);
            } catch (Exception var2) {
            }
        }
        arg0.field2865 += 24;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIII)Lkc;")
    public static final class102 method583(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1698++;
        long var6 = ((long) arg4 << 16) + ((long) arg0 << 38) + ((long) arg5 << 40) + (long) arg2;
        if (!arg1) {
            class102 var8 = (class102) class95.field1885.method1383(var6, (byte) 120);
            if (var8 != null) {
                return var8;
            }
        }
        class50 var9 = class96.method645((byte) -61, arg2);
        if (arg4 > 1 && var9.field938 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field930[var11] && var9.field930[var11] != 0) {
                    var10 = var9.field938[var11];
                }
            }
            if (var10 != -1) {
                var9 = class96.method645((byte) -61, var10);
            }
        }
        class75 var12 = var9.method334(128);
        if (var12 == null) {
            return null;
        }
        class102 var13 = null;
        if (var9.field948 != -1) {
            var13 = method583(1, true, var9.field942, -93, 10, 0);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class148.field2882;
        int var15 = class148.field2883;
        int var16 = class148.field2886;
        int[] var17 = new int[4];
        class148.method1024(var17);
        class102 var18 = new class102(36, 32);
        if (arg3 >= -48) {
            method582(null, (byte) 60);
        }
        class148.method1031(var18.field1983, 36, 32);
        class148.method1026();
        class44.method288();
        class44.method298(16, 16);
        int var19 = var9.field934;
        class44.field862 = false;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class44.field854[var9.field970] * var19 >> 16;
        int var21 = class44.field843[var9.field970] * var19 >> 16;
        var12.method376(0, var9.field959, var9.field972, var9.field970, var9.field967, var20 + var9.field936 - var12.method16() / 2, var21 - -var9.field936);
        if (arg0 >= 1) {
            var18.method662(1);
        }
        if (arg0 >= 2) {
            var18.method662(16777215);
        }
        if (arg5 != 0) {
            var18.method673(arg5);
        }
        class148.method1031(var18.field1983, 36, 32);
        if (var13 != null) {
            var13.method683(0, 0);
        }
        if (!arg1 && (var9.field945 == 1 || arg4 != 1) && arg4 != -1) {
            class152.field2917.method866(class212.method1379(arg4, true), 0, 9, 16776960, 1);
        }
        if (!arg1) {
            class95.field1885.method1378(var18, (byte) -81, var6);
        }
        class148.method1031(var14, var15, var16);
        class148.method1023(var17);
        class44.method288();
        class44.field862 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "()I")
    public final int method485() {
        field1696++;
        return 0;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "()Lsg;")
    public final class186 method476() {
        field1693++;
        class115 var1 = (class115) this.field1704.method1103((byte) -9);
        if (var1 == null) {
            return null;
        } else if (var1.field2216 == null) {
            return this.method492();
        } else {
            return var1.field2216;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "()Lsg;")
    public final class186 method492() {
        field1699++;
        class115 var1;
        do {
            var1 = (class115) this.field1704.method1106((byte) 105);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2216 == null);
        return var1.field2216;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BILlf;)V")
    private final void method584(byte arg0, int arg1, class115 arg2) {
        field1702++;
        if ((this.field1692.field1411[arg2.field2198] & 0x4) != 0 && arg2.field2195 < 0) {
            int var4 = this.field1692.field1425[arg2.field2198] / class108.field2080;
            int var5 = (var4 + 1048575 - arg2.field2219) / var4;
            arg2.field2219 = arg1 * var4 + arg2.field2219 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1692.field1386[arg2.field2198] == 0) {
                    arg2.field2216 = class193.method1297(arg2.field2209, arg2.field2216.method1301(), arg2.field2216.method1273(), arg2.field2216.method1282());
                } else {
                    arg2.field2216 = class193.method1297(arg2.field2209, arg2.field2216.method1301(), 0, arg2.field2216.method1282());
                    this.field1692.method488(-50, arg2, arg2.field2196.field1683[arg2.field2197] < 0);
                }
                if (arg2.field2196.field1683[arg2.field2197] < 0) {
                    arg2.field2216.method1296(-1);
                }
                arg1 = arg2.field2219 / var4;
            }
        }
        arg2.field2216.method468(arg1);
        if (arg0 <= 24) {
            this.field1706 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static void method585(boolean arg0) {
        field1700 = null;
        if (!arg0) {
            field1701 = null;
            field1690 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public final void method468(int arg0) {
        this.field1706.method468(arg0);
        field1703++;
        for (class115 var2 = (class115) this.field1704.method1103((byte) -9); var2 != null; var2 = (class115) this.field1704.method1106((byte) -127)) {
            if (!this.field1692.method464(var2, (byte) 74)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2205) {
                        this.method584((byte) 102, var3, var2);
                        var2.field2205 -= var3;
                        break;
                    }
                    this.method584((byte) 104, var2.field2205, var2);
                    var3 -= var2.field2205;
                } while (!this.field1692.method479(0, var2, 2, null, var3));
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lh;)V")
    public class85(class70 arg0) {
        this.field1692 = arg0;
    }
}
