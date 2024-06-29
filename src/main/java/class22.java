import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class49 {

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    private int field329 = -32768;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Ljg;")
    private class158 field319 = null;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "I")
    private int field327 = -1;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    private int field334 = -1;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    private int field341;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "Lmb;")
    private class151 field315;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field332 = 0;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field316 = 0;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Ldf;")
    public static class51 field336 = null;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLdf;)Z")
    public static final boolean method110(byte arg0, class51 arg1) {
        field338++;
        try {
            int var2 = arg1.method273(44, (byte) 36);
            if (var2 == -1) {
                return false;
            }
            class51 var3 = arg1.method269((byte) -74, 0, var2);
            class51 var4 = arg1.method279((byte) -55, var2 + 1);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method291((byte) 93));
            if (arg0 > -85) {
                field332 = 90;
            }
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method283((byte) 88);
            class121 var8 = new class121(5000);
            var8.method920(0, var7, var7.length, 7521);
            var8.field2026 = 0;
            var8.method864(-125, class119.field1988, class204.field3413);
            if (var8.field2014[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field2014[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method111(int arg0) {
        field336 = null;
        if (arg0 != -50) {
            field316 = 28;
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)V")
    public static final void method112(int arg0, int arg1) {
        field340++;
        if (arg0 != -21847) {
            field332 = -46;
        }
        class86.field1441.method1709(66, new class255(arg1));
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lu;I)V")
    public static final void method113(class111 arg0, int arg1) {
        class37.field572 = arg0.method810(class261.field4563, -1);
        field318++;
        if (arg1 == -27637) {
            class182.field3013 = arg0.method810(class222.field3860, -1);
            class7.field78 = arg0.method810(class55.field938, -1);
            class234.field4082 = arg0.method810(class98.field1646, -1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILkb;Lkb;IIJ)V")
    public static final void method114(int arg0, int arg1, int arg2, int arg3, class49 arg4, class49 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class241 var10 = new class241();
        var10.field4176 = arg8;
        var10.field4189 = arg1 * 128 + 64;
        var10.field4185 = arg2 * 128 + 64;
        var10.field4186 = arg3;
        var10.field4183 = arg4;
        var10.field4187 = arg5;
        var10.field4184 = arg6;
        var10.field4177 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class27.field395[var11][arg1][arg2] == null) {
                class27.field395[var11][arg1][arg2] = new class97(var11, arg1, arg2);
            }
        }
        class27.field395[arg0][arg1][arg2].field1627 = var10;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Lkb;")
    private final class49 method115(boolean arg0) {
        field331++;
        return arg0 ? this.method117(-26804, false) : null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
    private final void method116(int arg0, int arg1, int arg2) {
        if (arg1 != -19981) {
            return;
        }
        if (this.field315 != null) {
            int var4 = class179.field2960 - this.field322;
            if (var4 > 100 && this.field315.field2526 > 0) {
                int var5 = this.field315.field2539.length - this.field315.field2526;
                while (var5 > this.field311 && var4 > this.field315.field2532[this.field311]) {
                    var4 -= this.field315.field2532[this.field311];
                    this.field311++;
                }
                if (var5 <= this.field311) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field315.field2539.length; var7++) {
                        var6 += this.field315.field2532[var7];
                    }
                    var4 %= var6;
                }
            }
            label61: {
                do {
                    do {
                        if (var4 <= this.field315.field2532[this.field311]) {
                            break label61;
                        }
                        class208.method1433(arg0, arg2, 124, this.field311, false, this.field315);
                        var4 -= this.field315.field2532[this.field311];
                        this.field311++;
                    } while (this.field315.field2539.length > this.field311);
                    this.field311 -= this.field315.field2526;
                } while (this.field311 >= 0 && this.field311 < this.field315.field2539.length);
                this.field315 = null;
            }
            this.field322 = class179.field2960 - var4;
        }
        field330++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)Lkb;")
    private final class49 method117(int arg0, boolean arg1) {
        field320++;
        boolean var3 = class172.field2820 != class101.field1682;
        class108 var4 = class41.method210(this.field339, (byte) 75);
        if (var4.field1796 != null) {
            var4 = var4.method784((byte) 100);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field323 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field1807;
            var6 = var4.field1824;
        } else {
            var6 = var4.field1807;
            var7 = var4.field1824;
        }
        int var8 = (var7 >> 1) + this.field325;
        int var9 = this.field328 + (var6 >> 1);
        int var10 = (var6 + 1 >> 1) + this.field328;
        int var11 = (var7 + 1 >> 1) + this.field325;
        this.method116(var9 * 128, arg0 ^ 0x26BF, var8 * 128);
        if (arg0 != -26804) {
            return null;
        }
        boolean var12 = !var3 && var4.field1805 && (this.field334 != var4.field1799 || this.field327 != this.field311 && class103.field1699 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        int[][] var13 = class172.field2820[this.field341];
        int var14 = var13[var8][var10] + var13[var11][var9] + var13[var8][var9] + var13[var11][var10] >> 2;
        int var15 = (this.field325 << 7) + (var7 << 6);
        int var16 = (this.field328 << 7) + (var6 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class101.field1682[0];
        } else if (this.field341 < 3) {
            var17 = class172.field2820[this.field341 + 1];
        }
        boolean var18 = this.field319 == null;
        class183 var19;
        if (this.field315 == null) {
            var19 = var4.method777(var12, var13, var14, false, var18 ? class138.field2324 : this.field319, var16, arg0 + 26910, this.field333, this.field323, var15, var17);
        } else {
            var19 = var4.method783(var15, var18 ? class138.field2324 : this.field319, this.field333, var12, this.field315, var16, this.field311, var13, var14, var17, (byte) -40, this.field323);
        }
        return var19 == null ? null : var19.field3017;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIII)V")
    public final void method118(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -101 % ((arg0 - 76) / 33);
        this.method116(((arg3 - arg2 >> 1) + arg2) * 128 + 64, -19981, (arg4 - -(-arg4 + arg1 >> 1)) * 128 + 64);
        field324++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
    public final int method94() {
        field326++;
        return this.field329;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class49 var11 = this.method115(true);
        field317++;
        if (var11 != null) {
            var11.method96(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field329 = var11.method94();
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)Z")
    public static final boolean method119(int arg0, int arg1, int arg2) {
        field335++;
        if (arg2 != -31512) {
            method110((byte) 99, (class51) null);
        }
        class108 var3 = class41.method210(arg1, (byte) 75);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method780((byte) 106, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZILtb;IIII)Ltb;")
    public static final class65 method120(boolean arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6) {
        field337++;
        long var7 = (long) arg5;
        class65 var9 = (class65) class128.field2142.method1357((byte) 86, var7);
        if (var9 == null) {
            class178 var10 = class178.method1267(class51.field807, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1246(64, 768, -50, -10, -50);
            class128.field2142.method1351(var9, 2, var7);
        }
        int var11 = arg2.method443();
        int var12 = arg2.method435();
        int var13 = arg2.method452();
        int var14 = arg2.method440();
        class65 var15 = var9.method449(true, true);
        if (arg6 != 0) {
            var15.method437(arg6);
        }
        if (arg0) {
            method119(-30, -41, -12);
        }
        class137 var16 = (class137) var15;
        if (arg1 != class207.method1424(class257.field4496, arg4 + var11, (byte) 10, arg3 + var13) || arg1 != class207.method1424(class257.field4496, arg4 + var12, (byte) 91, arg3 + var14)) {
            for (int var17 = 0; var17 < var16.field2272; var17++) {
                var16.field2280[var17] += class207.method1424(class257.field4496, var16.field2263[var17] + arg4, (byte) 103, var16.field2292[var17] + arg3) - arg1;
            }
            var16.field2269 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIZLkb;)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class49 arg8) {
        this.field323 = arg2;
        this.field341 = arg3;
        this.field339 = arg0;
        this.field328 = arg5;
        this.field325 = arg4;
        this.field333 = arg1;
        if (arg6 != -1) {
            this.field315 = class72.method501(arg6, (byte) 81);
            this.field311 = 0;
            this.field322 = class179.field2960 - 1;
            if (this.field315.field2534 == 0 && arg8 != null && arg8 instanceof class22) {
                class22 var10 = (class22) arg8;
                if (this.field315 == var10.field315) {
                    this.field322 = var10.field322;
                    this.field311 = var10.field311;
                    return;
                }
            }
            if (arg7 && this.field315.field2526 != -1) {
                this.field311 = (int) (Math.random() * (double) this.field315.field2539.length);
                this.field322 -= (int) ((double) this.field315.field2532[this.field311] * Math.random());
                return;
            }
        }
    }
}
