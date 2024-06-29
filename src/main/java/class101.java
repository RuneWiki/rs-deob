import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class101 extends class23 {

    @OriginalMember(owner = "client!vj", name = "ib", descriptor = "I")
    private int field1779 = 32768;

    @OriginalMember(owner = "client!vj", name = "eb", descriptor = "Z")
    public static boolean field1775 = false;

    @OriginalMember(owner = "client!vj", name = "ab", descriptor = "I")
    public static volatile int field1771 = 0;

    @OriginalMember(owner = "client!vj", name = "jb", descriptor = "Lqd;")
    public static class40 field1780 = class147.method1106(":duelfriend:", (byte) -46);

    @OriginalMember(owner = "client!vj", name = "ob", descriptor = "Z")
    public static boolean field1785 = true;

    @OriginalMember(owner = "client!vj", name = "db", descriptor = "Lhi;")
    public static class282 field1774 = new class282();

    @OriginalMember(owner = "client!vj", name = "qb", descriptor = "Lqd;")
    public static class40 field1787 = class147.method1106("<col=c0ff00>", (byte) -97);

    @OriginalMember(owner = "client!vj", name = "pb", descriptor = "F")
    public static float field1786;

    @OriginalMember(owner = "client!vj", name = "Y", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!vj", name = "Z", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!vj", name = "bb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!vj", name = "cb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!vj", name = "fb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!vj", name = "gb", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!vj", name = "hb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!vj", name = "kb", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!vj", name = "lb", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!vj", name = "mb", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!vj", name = "nb", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 3)
    public class101() {
        super(3, false);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)[I", line = 12)
    public final int[] method32(byte arg0, int arg1) {
        int[] var3 = this.field403.method724((byte) -58, arg1);
        field1773++;
        if (arg0 != -94) {
            return (int[]) null;
        }
        if (this.field403.field1760) {
            int[] var4 = this.method174(1, 0, arg1);
            int[] var5 = this.method174(2, 0, arg1);
            for (int var6 = 0; var6 < class52.field1007; var6++) {
                int var7 = var5[var6] * this.field1779 >> 12;
                int var8 = var4[var6] >> 4 & 0xFF;
                int var9 = class163.field2705[var8] * var7 >> 12;
                int var10 = class29.field618[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class6.field92;
                int var12 = class212.field3384 & (var10 >> 12) + arg1;
                int[] var13 = this.method174(0, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[[I", line = 63)
    public final int[][] method17(int arg0, int arg1) {
        field1776++;
        if (arg0 <= 30) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field417.method1251(arg1, 123);
        if (this.field417.field2751) {
            int[] var4 = this.method174(1, 0, arg1);
            int[] var5 = this.method174(2, 0, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class52.field1007; var9++) {
                int var10 = var5[var9] * this.field1779 >> 12;
                int var11 = (var4[var9] * 255 & 0xFF67E) >> 12;
                int var12 = class163.field2705[var11] * var10 >> 12;
                int var13 = class29.field618[var11] * var10 >> 12;
                int var14 = (var12 >> 12) + var9 & class6.field92;
                int var15 = (var13 >> 12) + arg1 & class212.field3384;
                int[][] var16 = this.method173(0, var15, (byte) -111);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILsd;)V", line = 135)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field1779 = arg2.method197(-1) << 4;
        } else if (arg0 == 1) {
            this.field415 = arg2.method226(255) == 1;
        }
        if (arg1 != 0) {
            method763(-89, -72);
        }
        field1770++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V", line = 161)
    public static final void method762(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1783++;
        for (class255 var5 = (class255) field1774.method1971(100); var5 != null; var5 = (class255) field1774.method1967(100)) {
            class257.method1807(arg4, arg1, arg0, arg2, 122, var5);
        }
        for (class255 var6 = (class255) class253.field4194.method1971(100); var6 != null; var6 = (class255) class253.field4194.method1967(100)) {
            byte var7 = 1;
            if (var6.field4244.field1533 == var6.field4244.field1514) {
                var7 = 0;
            } else if (var6.field4244.field1514 == var6.field4244.field1511) {
                var7 = 2;
            }
            if (var6.field4240 != var7) {
                int var8 = class76.method560(var6.field4244, -1);
                if (var6.field4255 != var8) {
                    if (var6.field4234 != null) {
                        class89.field1610.method1336(var6.field4234);
                        var6.field4234 = null;
                    }
                    var6.field4255 = var8;
                }
                var6.field4240 = var7;
            }
            var6.field4239 = var6.field4244.field1531;
            var6.field4261 = var6.field4244.field1531 + var6.field4244.method666(arg3 + 24143) * 64;
            var6.field4254 = var6.field4244.field1497;
            var6.field4259 = var6.field4244.field1497 + (var6.field4244.method666(arg3 + 24143) * 64);
            class257.method1807(arg4, arg1, arg0, arg2, 126, var6);
        }
        for (class255 var9 = (class255) class60.field1143.method1400(arg3 ^ 0xFFFFFFBF); var9 != null; var9 = (class255) class60.field1143.method1403(-74)) {
            byte var10 = 1;
            if (var9.field4262.field1533 == var9.field4262.field1514) {
                var10 = 0;
            } else if (var9.field4262.field1514 == var9.field4262.field1511) {
                var10 = 2;
            }
            if (var9.field4240 != var10) {
                int var11 = class228.method1600(var9.field4262, 1);
                if (var9.field4255 != var11) {
                    if (var9.field4234 != null) {
                        class89.field1610.method1336(var9.field4234);
                        var9.field4234 = null;
                    }
                    var9.field4255 = var11;
                }
                var9.field4240 = var10;
            }
            var9.field4239 = var9.field4262.field1531;
            var9.field4261 = var9.field4262.field1531 + (var9.field4262.method666(24207) * 64);
            var9.field4254 = var9.field4262.field1497;
            var9.field4259 = var9.field4262.field1497 + var9.field4262.method666(arg3 + 24143) * 64;
            class257.method1807(arg4, arg1, arg0, arg2, 115, var9);
        }
        if (arg3 != 64) {
            field1771 = 36;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 269)
    public final void method61(byte arg0) {
        if (arg0 != 4) {
            field1785 = false;
        }
        field1772++;
        class50.method440((byte) 81);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)Z", line = 284)
    public static final boolean method763(int arg0, int arg1) {
        if (arg0 >= -56) {
            method766(29);
        }
        field1777++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)V", line = 300)
    public static final void method764(int arg0) {
        field1782++;
        if (class194.field3134 == arg0) {
            return;
        }
        try {
            if (++class92.field1669 > 1500) {
                if (class140.field2369 != null) {
                    class140.field2369.method784(124);
                    class140.field2369 = null;
                }
                if (class204.field3241 >= 1) {
                    class194.field3134 = 0;
                    class271.field4501 = -5;
                    return;
                }
                class194.field3134 = 1;
                class92.field1669 = 0;
                class204.field3241++;
                if (class92.field1670 == class315.field5341) {
                    class92.field1670 = class103.field1806;
                } else {
                    class92.field1670 = class315.field5341;
                }
            }
            if (class194.field3134 == 1) {
                class315.field5321 = class275.field4573.method812(class120.field2040, class92.field1670, 14038);
                class194.field3134 = 2;
            }
            if (class194.field3134 == 2) {
                if (class315.field5321.field1258 == 2) {
                    throw new IOException();
                }
                if (class315.field5321.field1258 != 1) {
                    return;
                }
                class140.field2369 = new class104((Socket) class315.field5321.field1260, class275.field4573);
                class315.field5321 = null;
                class140.field2369.method779(class19.field295.field478, arg0 + 16333, 0, class19.field295.field472);
                if (class119.field2011 != null) {
                    class119.field2011.method111(arg0 + 5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                int var1 = class140.field2369.method789((byte) 22);
                if (class119.field2011 != null) {
                    class119.field2011.method111(5000);
                }
                if (class248.field4107 != null) {
                    class248.field4107.method111(5000);
                }
                if (var1 != 101) {
                    class271.field4501 = var1;
                    class194.field3134 = 0;
                    class140.field2369.method784(arg0 ^ 0x74);
                    class140.field2369 = null;
                    return;
                }
                class194.field3134 = 3;
            }
            if (class194.field3134 == 3) {
                if (class140.field2369.method790((byte) 66) >= 2) {
                    int var2 = class140.field2369.method789((byte) 22) << 8 | class140.field2369.method789((byte) 22);
                    class54.method464((byte) 125, var2);
                    if (class81.field1426 != -1) {
                        class194.field3134 = 0;
                        class140.field2369.method784(115);
                        class140.field2369 = null;
                        class172.method1271(98);
                        return;
                    }
                    class194.field3134 = 0;
                    class271.field4501 = 6;
                    class140.field2369.method784(62);
                    class140.field2369 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class140.field2369 != null) {
                class140.field2369.method784(80);
                class140.field2369 = null;
            }
            if (class204.field3241 < 1) {
                if (class92.field1670 == class315.field5341) {
                    class92.field1670 = class103.field1806;
                } else {
                    class92.field1670 = class315.field5341;
                }
                class194.field3134 = 1;
                class92.field1669 = 0;
                class204.field3241++;
            } else {
                class194.field3134 = 0;
                class271.field4501 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 451)
    public static final void method765(Component arg0, byte arg1) {
        arg0.addMouseListener(class288.field4828);
        field1778++;
        if (arg1 != 52) {
            field1787 = (class40) null;
        }
        arg0.addMouseMotionListener(class288.field4828);
        arg0.addFocusListener(class288.field4828);
    }

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "(I)V", line = 468)
    public static void method766(int arg0) {
        if (arg0 != 0) {
            field1780 = (class40) null;
        }
        field1774 = null;
        field1787 = null;
        field1780 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V", line = 480)
    public static final void method767(byte arg0) {
        field1784++;
        class309.field5183.method1349(true);
        class2.field19.method1349(true);
        if (arg0 != -54) {
            method766(-62);
        }
        class150.field2507.method1349(true);
    }
}
