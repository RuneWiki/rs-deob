import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 extends class120 {

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    private int field312 = 128;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    private int field310 = -1;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "Z")
    public boolean field322 = true;

    @OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
    public int field325 = -1;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "[Lva;")
    public class121[] field320 = new class121[5];

    @OriginalMember(owner = "client!cc", name = "jb", descriptor = "Z")
    public boolean field327 = false;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public int field306 = -1;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field308 = -1;

    @OriginalMember(owner = "client!cc", name = "pb", descriptor = "I")
    private int field333 = 0;

    @OriginalMember(owner = "client!cc", name = "xb", descriptor = "I")
    private int field341 = 0;

    @OriginalMember(owner = "client!cc", name = "sb", descriptor = "I")
    public int field336 = -1;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public int field317 = -1;

    @OriginalMember(owner = "client!cc", name = "Ab", descriptor = "I")
    private int field344 = 128;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public int field316 = 32;

    @OriginalMember(owner = "client!cc", name = "Eb", descriptor = "I")
    public int field348 = -1;

    @OriginalMember(owner = "client!cc", name = "mb", descriptor = "Z")
    public boolean field330 = true;

    @OriginalMember(owner = "client!cc", name = "Bb", descriptor = "I")
    public int field345 = 1;

    @OriginalMember(owner = "client!cc", name = "kb", descriptor = "I")
    public int field328 = -1;

    @OriginalMember(owner = "client!cc", name = "vb", descriptor = "Lva;")
    public class121 field339 = class64.field1546;

    @OriginalMember(owner = "client!cc", name = "wb", descriptor = "I")
    public int field340 = -1;

    @OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
    public static int field326 = 1;

    @OriginalMember(owner = "client!cc", name = "tb", descriptor = "Lva;")
    private static class121 field337 = class107.method797("Login", -10983);

    @OriginalMember(owner = "client!cc", name = "lb", descriptor = "Lva;")
    private static class121 field329 = class107.method797("Please subscribe)1 or use a different world)3", -10983);

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "Lva;")
    public static class121 field315 = field329;

    @OriginalMember(owner = "client!cc", name = "yb", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!cc", name = "rb", descriptor = "Lva;")
    public static class121 field335 = field337;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!cc", name = "ob", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!cc", name = "qb", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!cc", name = "ub", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!cc", name = "zb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!cc", name = "Cb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cc", name = "Db", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!cc", name = "Gb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!cc", name = "Ib", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cc", name = "Jb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "[I")
    public int[] field311;

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "[I")
    private int[] field324;

    @OriginalMember(owner = "client!cc", name = "nb", descriptor = "[I")
    private int[] field331;

    @OriginalMember(owner = "client!cc", name = "Fb", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client!cc", name = "Hb", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lge;ILge;II)Lrb;", line = 3)
    public final class102 method127(class41 arg0, int arg1, class41 arg2, int arg3, int arg4) {
        field343++;
        if (this.field311 != null) {
            class16 var6 = this.method131((byte) 2);
            return var6 == null ? null : var6.method127(arg0, arg1, arg2, -9500, arg4);
        }
        class102 var7 = (class102) class113.field2510.method345(126, (long) this.field334);
        if (arg3 != -9500) {
            this.field348 = -3;
        }
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field324.length; var9++) {
                if (!class13.field238.method329(this.field324[var9], -1, 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class102[] var10 = new class102[this.field324.length];
            for (int var11 = 0; var11 < this.field324.length; var11++) {
                var10[var11] = class102.method711(class13.field238, this.field324[var11], 0);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class102(var10, var10.length);
            }
            if (this.field331 != null) {
                for (int var12 = 0; var12 < this.field331.length; var12++) {
                    var7.method704(this.field331[var12], this.field351[var12]);
                }
            }
            var7.method686();
            var7.method700(this.field341 + 64, this.field333 + 850, -30, -50, -30, true);
            class113.field2510.method350((byte) 123, var7, (long) this.field334);
        }
        class102 var13;
        if (arg2 != null && arg0 != null) {
            var13 = arg2.method274(arg4, var7, arg1, 1506013200, arg0);
        } else if (arg2 != null) {
            var13 = arg2.method270(arg4, var7, 16578);
        } else if (arg0 == null) {
            var13 = var7.method713(true);
        } else {
            var13 = arg0.method270(arg1, var7, arg3 ^ 0xFFFF9A26);
        }
        if (this.field312 != 128 || this.field344 != 128) {
            var13.method692(this.field312, this.field344, this.field312);
        }
        return var13;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLtc;)V", line = 101)
    public final void method128(byte arg0, class113 arg1) {
        field319++;
        if (arg0 >= -7) {
            method138(82);
        }
        while (true) {
            int var3 = arg1.method821(true);
            if (var3 == 0) {
                return;
            }
            this.method137(var3, arg1, -9438);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z", line = 128)
    public final boolean method129(int arg0) {
        field352++;
        if (this.field311 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field308 != -1) {
            var2 = class84.method593(9, this.field308);
        } else if (this.field310 != -1) {
            var2 = class90.field2045[this.field310];
        }
        return arg0 >= ~var2 && this.field311.length > var2 && this.field311[var2] != -1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)I", line = 153)
    public static final int method130(int arg0, int arg1, int arg2) {
        field346++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (arg0 != 31920) {
            return 7;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)Lcc;", line = 192)
    public final class16 method131(byte arg0) {
        if (arg0 != 2) {
            method138(-88);
        }
        int var2 = -1;
        field323++;
        if (this.field308 != -1) {
            var2 = class84.method593(9, this.field308);
        } else if (this.field310 != -1) {
            var2 = class90.field2045[this.field310];
        }
        return var2 < 0 || var2 >= this.field311.length || this.field311[var2] == -1 ? null : class63.method456((byte) 63, this.field311[var2]);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBLub;)V", line = 223)
    public static final void method132(int arg0, int arg1, int arg2, byte arg3, class117 arg4) {
        class28.field702.method984(-1);
        class57.field1331.method502(0, 0);
        arg4.method892(class101.field2265, 55, 28, 16777215, true);
        if (arg2 == 0) {
            arg4.method892(class12.field215, 55, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg4.method892(class75.field1733, 55, 41, 16776960, true);
        }
        field307++;
        if (arg2 == 2) {
            arg4.method892(class125.field2854, 55, 41, 16711680, true);
        }
        if (arg2 == 3) {
            arg4.method892(class27.field690, 55, 41, 65535, true);
        }
        arg4.method892(class22.field578, 184, 28, 16777215, true);
        if (arg1 == 0) {
            arg4.method892(class12.field215, 184, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg4.method892(class75.field1733, 184, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg4.method892(class125.field2854, 184, 41, 16711680, true);
        }
        arg4.method892(class45.field1053, 324, 28, 16777215, true);
        if (arg0 == 0) {
            arg4.method892(class12.field215, 324, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg4.method892(class75.field1733, 324, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg4.method892(class125.field2854, 324, 41, 16711680, true);
        }
        arg4.method892(class57.field1334, 458, 33, 16777215, true);
        try {
            Graphics var5 = class46.field1079.getGraphics();
            class28.field702.method196(-5917, 453, 0, var5);
            if (arg3 < 69) {
                field342 = 64;
            }
        } catch (Exception var6) {
            class46.field1079.repaint();
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V", line = 287)
    public static final void method133(boolean arg0) {
        field318++;
        int var1 = class62.field1494.field750 + class42.field976;
        int var2 = class62.field1494.field742 + class61.field1461;
        if (class38.field882 - var1 < -500 || class38.field882 - var1 > 500 || class28.field717 - var2 < -500 || class28.field717 - var2 > 500) {
            class28.field717 = var2;
            class38.field882 = var1;
        }
        if (arg0) {
            return;
        }
        if (class38.field882 != var1) {
            class38.field882 += (var1 - class38.field882) / 16;
        }
        if (class28.field717 != var2) {
            class28.field717 += (var2 - class28.field717) / 16;
        }
        if (class21.field570[96]) {
            class57.field1328 += (-class57.field1328 - 24) / 2;
        } else if (class21.field570[97]) {
            class57.field1328 += (24 - class57.field1328) / 2;
        } else {
            class57.field1328 /= 2;
        }
        int var3 = class38.field882 >> 7;
        int var4 = 0;
        int var5 = class28.field717 >> 7;
        if (class21.field570[98]) {
            class40.field906 += (12 - class40.field906) / 2;
        } else if (class21.field570[99]) {
            class40.field906 += (-class40.field906 - 12) / 2;
        } else {
            class40.field906 /= 2;
        }
        class95.field2130 += class40.field906 / 2;
        class96.field2149 = class57.field1328 / 2 + class96.field2149 & 0x7FF;
        if (class95.field2130 < 128) {
            class95.field2130 = 128;
        }
        if (class95.field2130 > 383) {
            class95.field2130 = 383;
        }
        int var6 = class47.method340(class38.field882, -6, class121.field2807, class28.field717);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class121.field2807;
                    if (var9 < 3 && (class23.field613[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class45.field1058[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class15.field302) {
            class15.field302 += (var11 - class15.field302) / 24;
        } else if (class15.field302 > var11) {
            class15.field302 += (var11 - class15.field302) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 396)
    public final void method134(int arg0) {
        int var2 = -62 / ((arg0 - 40) / 35);
        field313++;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)Lrb;", line = 440)
    public final class102 method135(int arg0) {
        field309++;
        if (this.field311 != null) {
            class16 var2 = this.method131((byte) 2);
            return var2 == null ? null : var2.method135(0);
        } else if (this.field349 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = arg0; var4 < this.field349.length; var4++) {
                if (!class13.field238.method329(this.field349[var4], arg0 - 1, 0)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class102[] var5 = new class102[this.field349.length];
            for (int var6 = 0; var6 < this.field349.length; var6++) {
                var5[var6] = class102.method711(class13.field238, this.field349[var6], 0);
            }
            class102 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class102(var5, var5.length);
            }
            if (this.field331 != null) {
                for (int var8 = 0; var8 < this.field331.length; var8++) {
                    var7.method704(this.field331[var8], this.field351[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILhe;)I", line = 511)
    public static final int method136(int arg0, class47 arg1) {
        field338++;
        if (arg0 != 100) {
            field335 = null;
        }
        int var2 = 0;
        if (arg1.method334(class121.field2827, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class59.field1411, class21.field563, arg0 - 101)) {
            var2++;
        }
        if (arg1.method334(class92.field2106, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class76.field1753, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class92.field2101, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class48.field1165, class21.field563, arg0 ^ 0xFFFFFF9B)) {
            var2++;
        }
        if (arg1.method334(class48.field1167, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class71.field1667, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class33.field801, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class100.field2234, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class20.field535, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class45.field1038, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class27.field691, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class4.field63, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class56.field1273, class21.field563, arg0 - 101)) {
            var2++;
        }
        if (arg1.method334(class11.field176, class21.field563, arg0 - 101)) {
            var2++;
        }
        if (arg1.method334(class126.field2865, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class119.field2755, class21.field563, -1)) {
            var2++;
        }
        if (arg1.method334(class50.field1186, class21.field563, arg0 ^ 0xFFFFFF9B)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILtc;I)V", line = 636)
    private final void method137(int arg0, class113 arg1, int arg2) {
        field305++;
        if (arg2 != -9438) {
            this.field306 = 111;
        }
        if (arg0 == 1) {
            int var10 = arg1.method821(true);
            this.field324 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field324[var11] = arg1.method870(arg2 + 9437);
            }
        } else if (arg0 == 2) {
            this.field339 = arg1.method861(20356);
        } else if (arg0 == 12) {
            this.field345 = arg1.method821(true);
        } else if (arg0 == 13) {
            this.field325 = arg1.method870(arg2 ^ 0x24DD);
        } else if (arg0 == 14) {
            this.field348 = arg1.method870(-1);
        } else if (arg0 == 17) {
            this.field348 = arg1.method870(arg2 + 9437);
            this.field328 = arg1.method870(-1);
            this.field306 = arg1.method870(arg2 + 9437);
            this.field340 = arg1.method870(-1);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field320[arg0 - 30] = arg1.method861(arg2 + 29794);
            if (this.field320[arg0 - 30].method940(class127.field2921, (byte) -102)) {
                this.field320[arg0 - 30] = null;
                return;
            }
        } else if (arg0 == 40) {
            int var8 = arg1.method821(true);
            this.field351 = new int[var8];
            this.field331 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field331[var9] = arg1.method870(class38.method261(arg2, 9437));
                this.field351[var9] = arg1.method870(-1);
            }
        } else if (arg0 == 60) {
            int var6 = arg1.method821(true);
            this.field349 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field349[var7] = arg1.method870(-1);
            }
            return;
        } else if (arg0 == 93) {
            this.field330 = false;
            return;
        } else if (arg0 == 95) {
            this.field336 = arg1.method870(-1);
            return;
        } else if (arg0 == 97) {
            this.field312 = arg1.method870(-1);
            return;
        } else if (arg0 == 98) {
            this.field344 = arg1.method870(-1);
            return;
        } else {
            if (arg0 == 99) {
                this.field327 = true;
            } else if (arg0 == 100) {
                this.field341 = arg1.method841(true);
                return;
            } else if (arg0 == 101) {
                this.field333 = arg1.method841(true) * 5;
                return;
            } else if (arg0 == 102) {
                this.field317 = arg1.method870(-1);
                return;
            } else if (arg0 == 103) {
                this.field316 = arg1.method870(arg2 ^ 0x24DD);
                return;
            } else if (arg0 == 106) {
                this.field308 = arg1.method870(-1);
                if (this.field308 == 65535) {
                    this.field308 = -1;
                }
                this.field310 = arg1.method870(-1);
                if (this.field310 == 65535) {
                    this.field310 = -1;
                }
                int var4 = arg1.method821(true);
                this.field311 = new int[var4 + 1];
                for (int var5 = 0; var5 <= var4; var5++) {
                    this.field311[var5] = arg1.method870(-1);
                    if (this.field311[var5] == 65535) {
                        this.field311[var5] = -1;
                    }
                }
                return;
            } else if (arg0 == 107) {
                this.field322 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 823)
    public static void method138(int arg0) {
        if (arg0 != 21218) {
            method130(-47, -13, 106);
        }
        field315 = null;
        field329 = null;
        field337 = null;
        field335 = null;
    }
}
