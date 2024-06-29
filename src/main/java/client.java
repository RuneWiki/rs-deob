import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class635 {

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4115 = 100;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    private static boolean field4121 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Lgm;")
    public static class109 field4124;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "Ljava/lang/Class;")
    public static Class field4133;

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1801(int arg0) {
        field4110++;
        if (class186.field2999.field3273 > class48.field1145) {
            class394.field5757.method1963((byte) 16);
            class205.field3149 = (class186.field2999.field3273 - 1) * 5 * 50;
            if (class205.field3149 > 3000) {
                class205.field3149 = 3000;
            }
            if (class186.field2999.field3273 >= 2 && class186.field2999.field3271 == 6) {
                this.method3629("js5connect_outofdate", (byte) -60);
                class199.field3098 = 14;
                return;
            }
            if (class186.field2999.field3273 >= 4 && class186.field2999.field3271 == -1) {
                this.method3629("js5crc", (byte) -60);
                class199.field3098 = 14;
                return;
            }
            if (class186.field2999.field3273 >= 4 && class15.method375(-3, class199.field3098)) {
                if (class186.field2999.field3271 == 7 || class186.field2999.field3271 == 9) {
                    this.method3629("js5connect_full", (byte) -60);
                } else if (class186.field2999.field3271 <= 0) {
                    this.method3629("js5io", (byte) -60);
                } else if (class121.field2199 == null) {
                    this.method3629("js5connect", (byte) -60);
                } else {
                    this.method3629("js5proxy_" + class121.field2199.trim(), (byte) -60);
                }
                class199.field3098 = 14;
                return;
            }
        }
        class48.field1145 = class186.field2999.field3273;
        if (arg0 >= -35) {
            this.method1805(6);
        }
        if (class205.field3149 > 0) {
            class205.field3149--;
            return;
        }
        try {
            if (class649.field9362 == 0) {
                class385.field5653 = class394.field5757.method1961(class604.field8775, 43594);
                class649.field9362++;
            }
            if (class649.field9362 == 1) {
                if (class385.field5653.field6502 == 2) {
                    if (class385.field5653.field6499 != null) {
                        class121.field2199 = (String) class385.field5653.field6499;
                    }
                    this.method1817(-122, 1000);
                    return;
                }
                if (class385.field5653.field6502 == 1) {
                    class649.field9362++;
                }
            }
            if (class649.field9362 == 2) {
                class467.field6619 = new class591((Socket) class385.field5653.field6499, class604.field8775);
                class61 var2 = new class61(5);
                var2.method693((byte) 106, class168.field2807.field1542);
                var2.method715(620, 1949991176);
                class467.field6619.method3373(5, var2.field1397, 0, (byte) -71);
                class649.field9362++;
                class135.field2392 = class525.method3074((byte) -101);
            }
            if (class649.field9362 == 3) {
                if (class15.method375(-3, class199.field3098) || class467.field6619.method3371(-2) > 0) {
                    int var3 = class467.field6619.method3369(5000);
                    if (var3 != 0) {
                        this.method1817(-85, var3);
                        return;
                    }
                    class649.field9362++;
                } else if ((class525.method3074((byte) -101) - class135.field2392) > 30000L) {
                    this.method1817(-114, 1001);
                    return;
                }
            }
            if (class649.field9362 == 4) {
                boolean var4 = class15.method375(-3, class199.field3098) || class233.method1571(class199.field3098, 111) || class396.method2443(-10, class199.field3098);
                class230[] var5 = class230.method1562(7);
                class61 var6 = new class61(var5.length * 4);
                class467.field6619.method3370(var6.field1397, 127, var6.field1397.length, 0);
                for (int var7 = 0; var7 < var5.length; var7++) {
                    var5[var7].method1558(var6.method730(99), 1);
                }
                class186.field2999.method1482(!var4, 126, class467.field6619);
                class467.field6619 = null;
                class385.field5653 = null;
                class649.field9362 = 0;
            }
        } catch (IOException var8) {
            this.method1817(-83, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lgaa;")
    public static final class272 method1802(int arg0, int arg1) {
        field4118++;
        class272 var2 = (class272) class163.field2738.method1900((long) arg1, 109);
        if (var2 != null) {
            return var2;
        }
        int var3 = -23 % ((-arg0 - 43) / 52);
        byte[] var4 = class138.field2456.method2216(1, arg1, true);
        class272 var5 = new class272();
        var5.field4085 = arg1;
        if (var4 != null) {
            var5.method1775(true, new class61(var4));
        }
        var5.method1774(78);
        if (var5.field4089 == 2 && class483.field6916.method2596((long) arg1, 109) == null) {
            class483.field6916.method2598(new class149(class489.field7003), (long) arg1, (byte) 8);
            class132.field2376[class489.field7003++] = var5;
        }
        class163.field2738.method1904(var5, (long) arg1, -1);
        return var5;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method1803(int arg0) {
        int var1 = class237.field3520;
        int[] var2 = class47.field1140;
        for (int var3 = 0; var3 < class363.field5389 + var1; var3++) {
            class604 var4;
            if (var3 < var1) {
                var4 = class59.field1341[var2[var3]];
            } else {
                var4 = ((class436) class208.field3179.method2596((long) class367.field5444[var3 - var1], 121)).field6298;
            }
            if (var4.field9814 == arg0 && var4.field8759 >= 0) {
                int var5 = var4.method3446(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field9806 & 0x1FF) != 0 || (var4.field9815 & 0x1FF) != 0) {
                        continue;
                    }
                } else if ((var4.field9806 & 0x1FF) != 256 || (var4.field9815 & 0x1FF) != 256) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field9806 >> 9;
                    int var7 = var4.field9815 >> 9;
                    if (var4.field8759 > class198.field3080[var6][var7]) {
                        class198.field3080[var6][var7] = var4.field8759;
                        class388.field5670[var6][var7] = 1;
                    } else if (class198.field3080[var6][var7] == var4.field8759) {
                        var10002 = class388.field5670[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 256 + 60;
                    int var9 = var4.field9806 - var8 >> 9;
                    int var10 = var4.field9815 - var8 >> 9;
                    int var11 = var4.field9806 + var8 >> 9;
                    int var12 = var4.field9815 + var8 >> 9;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field8759 > class198.field3080[var13][var14]) {
                                class198.field3080[var13][var14] = var4.field8759;
                                class388.field5670[var13][var14] = 1;
                            } else if (class198.field3080[var13][var14] == var4.field8759) {
                                var10002 = class388.field5670[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1804() {
        for (int var0 = 0; var0 < class675.field9604; var0++) {
            int[] var1 = class198.field3080[var0];
            for (int var2 = 0; var2 < class218.field3316; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method1805(int arg0) {
        if (class164.field2750) {
            class239.method1587((byte) 49);
        }
        field4120++;
        class236.method1579(96);
        if (class623.field9017 != null) {
            class623.field9017.method1265((byte) -67);
        }
        if (class413.field5977 != null) {
            class291.method1945(class604.field8775, (byte) -65, class413.field5977);
            class413.field5977 = null;
        }
        if (class165.field2755 != null) {
            class165.field2755.method481(true);
            class165.field2755 = null;
        }
        class584.method3343((byte) 124);
        class186.field2999.method1481(-1);
        class110.field1956.method2747(2);
        if (class163.field2727 != null) {
            class163.field2727.method1977(-921600);
            class163.field2727 = null;
        }
        try {
            if (arg0 != 25736) {
                method1816((byte) -25);
            }
            class13.field721.method2263(6459);
            for (int var2 = 0; var2 < 35; var2++) {
                class19.field834[var2].method2263(6459);
            }
            class362.field5378.method2263(6459);
            class109.field1916.method2263(6459);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method1806(byte arg0) {
        if (arg0 != -4) {
            field4113 = -44;
        }
        field4130++;
        if (class90.field1654 != 2) {
            this.method1827(30267);
            return;
        }
        try {
            this.method1827(30267);
        } catch (ThreadDeath var4) {
            throw var4;
        } catch (Throwable var5) {
            class374.method2357(var5.getMessage() + " (Recovered) " + this.method1809(100), 107, var5);
            class294.method1959((byte) 115, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1807(int arg0) {
        if (arg0 != -1) {
            method1811(0);
        }
        field4128++;
        for (class434 var1 = (class434) class140.field2467.method1224(-2); var1 != null; var1 = (class434) class140.field2467.method1232(-2)) {
            class515 var2 = var1.field6277;
            if (var2.field7287) {
                var1.method2588(arg0 ^ 0xFFFFFED3);
                var2.method3035(true);
            } else if (var2.field7291 <= class336.field5031) {
                var2.method3037((byte) 103, class620.field8990);
                if (var2.field7287) {
                    var1.method2588(300);
                } else {
                    class543.method3127(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method1808(int arg0) {
        field4114++;
        for (int var1 = 0; var1 < class254.field3771; var1++) {
            class611.field8891[var1] = null;
        }
        class254.field3771 = 0;
        if (arg0 > -55) {
            field4115 = -47;
        }
        for (int var2 = 0; var2 < class148.field2557; var2++) {
            for (int var46 = 0; var46 < class520.field7369; var46++) {
                for (int var47 = 0; var47 < class107.field1852; var47++) {
                    class370 var48 = class257.field3792[var2][var47][var46];
                    if (var48 != null) {
                        if (var48.field5502 > 0) {
                            var48.field5502 = (short) (var48.field5502 * -1);
                        }
                        if (var48.field5498 > 0) {
                            var48.field5498 = (short) (var48.field5498 * -1);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class148.field2557; var3++) {
            for (int var4 = 0; var4 < class520.field7369; var4++) {
                for (int var5 = 0; var5 < class107.field1852; var5++) {
                    class370 var6 = class257.field3792[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class257.field3792[0][var5][var4] != null && class257.field3792[0][var5][var4].field5492 != null;
                        if (var6.field5498 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var10 = var3;
                            int var11 = var3;
                            class370 var12 = class257.field3792[var3][var5][var4 - 1];
                            int var13 = class185.field2987[var3].method551(var5, var4, (byte) -123);
                            while (var8 > 0 && var12 != null && var12.field5498 < 0 && var6.field5498 == var12.field5498 && var6.field5504 == var12.field5504 && class185.field2987[var3].method551(var5, var8 - 1, (byte) -99) == var13 && (var8 - 1 <= 0 || class185.field2987[var3].method551(var5, var8 - 2, (byte) -95) == var13)) {
                                var8--;
                                var12 = class257.field3792[var3][var5][var8 - 1];
                            }
                            for (class370 var14 = class257.field3792[var3][var5][var4 + 1]; var9 < class107.field1852 && var14 != null && var14.field5498 < 0 && var6.field5498 == var14.field5498 && var6.field5504 == var14.field5504 && var13 == class185.field2987[var3].method551(var5, var9 + 1, (byte) -108) && ((var9 + 1) >= class107.field1852 || var13 == class185.field2987[var3].method551(var5, var9 + 2, (byte) -95)); var14 = class257.field3792[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            label304: while (var10 > 0) {
                                for (int var15 = var8; var15 <= var9; var15++) {
                                    if (class257.field3792[var10 - 1][var5][var15] == null || class257.field3792[var10 - 1][var5][var15].field5498 != var6.field5498 || class257.field3792[var10 - 1][var5][var15].field5504 != var6.field5504) {
                                        break label304;
                                    }
                                }
                                var10--;
                            }
                            label321: while (var11 < (class148.field2557 - 1)) {
                                for (int var16 = var8; var16 <= var9; var16++) {
                                    if (class257.field3792[var11 + 1][var5][var16] == null || class257.field3792[var11 + 1][var5][var16].field5498 != var6.field5498 || class257.field3792[var11 + 1][var5][var16].field5504 != var6.field5504) {
                                        break label321;
                                    }
                                }
                                var11++;
                            }
                            int var17 = var11 + 1 - var10;
                            int var18 = class185.field2987[var7 ? var10 + 1 : var10].method551(var5, var8, (byte) -93);
                            int var19 = var18 + (var6.field5498 * var17);
                            int var20 = class185.field2987[var7 ? var10 + 1 : var10].method551(var5, var9 + 1, (byte) -114);
                            int var21 = var20 + (var6.field5498 * var17);
                            int var22 = var5 << class30.field940;
                            int var23 = var8 << class30.field940;
                            int var24 = (var9 << class30.field940) + class576.field8369;
                            class611.field8891[class254.field3771++] = new class185(1, var11, var6.field5504 + var22, var6.field5504 + var22, var6.field5504 + var22, var6.field5504 + var22, var18, var20, var21, var19, var23, var24, var24, var23);
                            for (int var25 = var10; var25 <= var11; var25++) {
                                for (int var26 = var8; var26 <= var9; var26++) {
                                    class257.field3792[var25][var5][var26].field5498 = (short) (class257.field3792[var25][var5][var26].field5498 * -1);
                                }
                            }
                        }
                        if (var6.field5502 < 0) {
                            int var27 = var5;
                            int var28 = var5;
                            int var29 = var3;
                            int var30 = var3;
                            class370 var31 = class257.field3792[var3][var5 - 1][var4];
                            int var32 = class185.field2987[var3].method551(var5, var4, (byte) -122);
                            while (var27 > 0 && var31 != null && var31.field5502 < 0 && var6.field5502 == var31.field5502 && var6.field5499 == var31.field5499 && class185.field2987[var3].method551(var27 - 1, var4, (byte) -121) == var32 && ((var27 - 1) <= 0 || class185.field2987[var3].method551(var27 - 2, var4, (byte) -123) == var32)) {
                                var27--;
                                var31 = class257.field3792[var3][var27 - 1][var4];
                            }
                            for (class370 var33 = class257.field3792[var3][var5 + 1][var4]; var28 < class520.field7369 && var33 != null && var33.field5502 < 0 && var6.field5502 == var33.field5502 && var6.field5499 == var33.field5499 && class185.field2987[var3].method551(var28 + 1, var4, (byte) -111) == var32 && (class520.field7369 <= var28 + 1 || class185.field2987[var3].method551(var28 + 2, var4, (byte) -100) == var32); var33 = class257.field3792[var3][var28 + 1][var4]) {
                                var28++;
                            }
                            label220: while (var29 > 0) {
                                for (int var34 = var27; var34 <= var28; var34++) {
                                    if (class257.field3792[var29 - 1][var34][var4] == null || class257.field3792[var29 - 1][var34][var4].field5502 != var6.field5502 || class257.field3792[var29 - 1][var34][var4].field5499 != var6.field5499) {
                                        break label220;
                                    }
                                }
                                var29--;
                            }
                            label205: while ((class148.field2557 - 1) > var30) {
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    if (class257.field3792[var30 + 1][var35][var4] == null || class257.field3792[var30 + 1][var35][var4].field5502 != var6.field5502 || class257.field3792[var30 + 1][var35][var4].field5499 != var6.field5499) {
                                        break label205;
                                    }
                                }
                                var30++;
                            }
                            int var36 = var30 + 1 - var29;
                            int var37 = class185.field2987[var7 ? var29 + 1 : var29].method551(var27, var4, (byte) -106);
                            int var38 = var6.field5502 * var36 + var37;
                            int var39 = class185.field2987[var7 ? var29 + 1 : var29].method551(var28 + 1, var4, (byte) -103);
                            int var40 = var6.field5502 * var36 + var39;
                            int var41 = var27 << class30.field940;
                            int var42 = (var28 << class30.field940) + class576.field8369;
                            int var43 = var4 << class30.field940;
                            class611.field8891[class254.field3771++] = new class185(2, var30, var41, var42, var42, var41, var37, var39, var40, var38, var43 + var6.field5499, var6.field5499 + var43, var6.field5499 + var43, var6.field5499 + var43);
                            for (int var44 = var29; var44 <= var30; var44++) {
                                for (int var45 = var27; var45 <= var28; var45++) {
                                    class257.field3792[var44][var45][var4].field5502 = (short) (class257.field3792[var44][var45][var4].field5502 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class50.field1185 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method1809(int arg0) {
        field4129++;
        String var2 = null;
        try {
            var2 = "[1)" + class33.field967 + "," + class323.field4749 + "," + class675.field9604 + "," + class218.field3316 + "|";
            if (class532.field7456 != null) {
                var2 = var2 + "2)" + class37.field1046 + "," + (class532.field7456.field8787[0] + class33.field967) + "," + (class532.field7456.field8785[0] + class323.field4749) + "|";
            }
            var2 = var2 + "3)" + class90.field1654 + "|4)" + class527.field7429.field2671 + "|5)" + class601.method3434(true) + "|6)" + class506.field7173 + "," + class310.field4626 + "|";
            var2 = var2 + "7)" + class527.field7429.method1204((byte) 121, class90.field1654) + "|";
            var2 = var2 + "8)" + class527.field7429.method1211(class90.field1654, (byte) 36) + "|";
            var2 = var2 + "9)" + class527.field7429.field2643 + "|";
            var2 = var2 + "10)" + class527.field7429.field2656 + "|";
            var2 = var2 + "11)" + class527.field7429.field2652 + "|";
            var2 = var2 + "12)" + class527.field7429.method2824(-1, class90.field1654) + "|";
            var2 = var2 + "13)" + class681.field9649 + "|";
            var2 = var2 + "14)" + class199.field3098;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class90.field1654 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field4133 == null ? (field4133 = method1830("client")) : field4133).getClassLoader());
                    for (int var8 = 0; var8 < var7.size(); var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
                if (arg0 != 100) {
                    field4113 = 44;
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1810(int arg0) {
        method1811(1);
        field4123++;
        class252.method1686(true);
        class19.method433(35);
        class265.method1732(-113);
        class631.method3605(256);
        class666.method3773((byte) -116);
        class95.method908(2047);
        class230.method1561((byte) -94);
        class36.method535(1);
        class125.method1078((byte) -104);
        class678.method3812((byte) -119);
        class425.method2587(-32345);
        class513.method3029(true);
        class427.method2592((byte) 49);
        class635.method3622((byte) -106);
        class388.method2392((byte) -64);
        class111.method1005(126);
        class398.method2448(true);
        class396.method2442(true);
        class167.method1266(-1);
        class470.method2806(-74);
        class539.method3112(true);
        class136.method1124(111);
        class158.method1220((byte) 80);
        class213.method1494((byte) 70);
        class457.method2746((byte) 92);
        class703.method3929(5);
        class102.method946(0);
        class344.method2238(99);
        class610.method3504(-100);
        class287.method1910(0);
        class144.method1154(32);
        class537.method3105((byte) 106);
        class648.method3700(4);
        class217.method1514(23);
        class286.method1896(false);
        class81.method832((byte) 62);
        class454.method2733(26);
        class612.method3520(-32260);
        class588.method3358(-5);
        class6.method247(32);
        class109.method983(26945);
        class471.method2830(-85);
        class325.method2101(90);
        class218.method1520((byte) 99);
        class625.method3562((byte) 67);
        class174.method1308((byte) -123);
        class580.method3334(21914);
        class27.method491(0);
        class51.method626(-2);
        class247.method1670(false);
        class379.method2370(true);
        class436.method2644(-112);
        class59.method681((byte) -107);
        class244.method1616(-13411);
        class641.method3649((byte) 83);
        class85.method853((byte) -4);
        class297.method1975((byte) -116);
        class47.method598((byte) -113);
        class605.method3486(true);
        class669.method3780((byte) 57);
        class557.method3170((byte) 114);
        class577.method3310((byte) -118);
        class578.method3318(-12570);
        class202.method1429((byte) -100);
        class415.method2532(-46);
        class498.method2973(false);
        class497.method2970(false);
        class61.method708(-18173);
        class275.method1798(7818);
        class604.method3462(-11149);
        class370.method2342((byte) 7);
        class527.method3083(83);
        class616.method3534(0);
        class315.method2038(-124);
        class22.method462(true);
        class601.method3431(7836);
        class239.method1586(-5395);
        class655.method3729((byte) 59);
        class479.method2907(-16815);
        class565.method3272((byte) -114);
        class177.method1320(-128);
        class525.method3075(112);
        class33.method513((byte) 52);
        class676.method3806(118);
        class135.method1113((byte) -42);
        class365.method2315(676454600);
        class112.method1006(0);
        class384.method2380(-127);
        class4.method236(1);
        class282.method1862(-114);
        class156.method1212(false);
        class168.method1273((byte) 123);
        class501.method2988(false);
        class138.method1130(-4273);
        class674.method3798(-15281);
        class224.method1535((byte) -87);
        class304.method1995(0);
        class26.method488((byte) -123);
        class56.method666(-2204);
        class519.method3053((byte) 26);
        class371.method2348(91);
        class37.method549((byte) 114);
        class334.method2154(-14391);
        class110.method990(98);
        class263.method1727(2);
        class706.method3941(false);
        class105.method966(6);
        class619.method3538(24978);
        class495.method2963(19930);
        class11.method292((byte) 122);
        class518.method3042(false);
        class9.method275(-1);
        class544.method3132((byte) 5);
        class3.method225((byte) -107);
        class600.method3426((byte) -125);
        class373.method2353((byte) -126);
        class517.method3041(-108);
        class559.method3183(1);
        class310.method2027(false);
        class672.method3792(24407);
        class686.method3856((byte) -85);
        class486.method2934(20548);
        class646.method3688(-117);
        class532.method3089((byte) 27);
        class357.method2291((byte) 125);
        class634.method3613(-61);
        class589.method3363(72);
        class585.method3349(-10557);
        class90.method876(false);
        class506.method3005((byte) 70);
        class145.method1158((byte) 13);
        class407.method2483();
        class284.method1880(true);
        class107.method971(1);
        class335.method2161(false);
        class321.method2063(0);
        class461.method2761(120);
        class139.method1136(62);
        class320.method2057(90);
        class547.method3154((byte) 53);
        class122.method1056((byte) -93);
        class697.method3899(43);
        class98.method930(false);
        class395.method2436(-23025);
        class45.method581();
        class658.method3746(true);
        class512.method3020((byte) 80);
        class124.method1066(-12019);
        class237.method1581((byte) -24);
        class438.method2651(-33);
        class683.method3846();
        class182.method1335(1);
        class74.method801((byte) 71);
        class473.method2836(1);
        class360.method2302();
        class288.method1915(9);
        class569.method3282(-16844);
        class432.method2626(255);
        class691.method3870(124);
        class476.method2901(63);
        class356.method2288(19497);
        class536.method3099(false);
        class637.method3634(-1);
        class34.method516(520);
        class682.method3833(-2);
        class650.method3714(-104);
        class219.method1521(3);
        class82.method839(116);
        class624.method3556((byte) -75);
        class195.method1402(false);
        class636.method3633(-128);
        class54.method637((byte) -117);
        class582.method3338((byte) -128);
        class412.method2505();
        if (arg0 < 70) {
            this.method1820((byte) -36);
        }
        class317.method2046(-5);
        class146.method1170((byte) 124);
        class314.method2036(0);
        class93.method890();
        class266.method1736(0);
        class526.method3082(843);
        class86.method859(-1);
        class430.method2621((byte) -107);
        class257.method1702((byte) 66);
        class509.method3016(-9258);
        class429.method2613();
        class393.method2429(0);
        class455.method2741(3666);
        class311.method2029(-76);
        class92.method889(-6262);
        class232.method1566(-1);
        class173.method1299(97);
        class326.method2106((byte) 90);
        class87.method863((byte) 112);
        class661.method3761((byte) 21);
        class445.method2676((byte) 95);
        class117.method1027(true);
        class341.method2193((byte) -84);
        class447.method2687(-6);
        class153.method1194(0);
        class65.method763(20910);
        class121.method1050((byte) -74);
        class272.method1773(11388);
        class385.method2382((byte) -69);
        class70.method781(0);
        class696.method3893(38);
        class659.method3751((byte) 127);
        class248.method1673(-9050);
        class643.method3661((byte) -46);
        class367.method2322((byte) -97);
        class640.method3643(12197);
        class35.method526((byte) 108);
        class515.method3033(-121);
        class543.method3131(6327);
        class38.method554(102);
        class352.method2282((byte) 125);
        class49.method613((byte) 123);
        class42.method563(true);
        class468.method2794(94);
        class502.method2993(253646145);
        class458.method2749((byte) -103);
        class210.method1474(-115);
        class433.method2633((byte) -86);
        class704.method3935(true);
        class29.method495(true);
        class342.method2197(-92);
        class309.method2017(-90);
        class598.method3403((byte) 103);
        class514.method3030(0);
        class99.method933(-2);
        class403.method2463(false);
        class496.method2964(5);
        class129.method1096(-48);
        class24.method477(29161);
        class705.method3937(-58);
        class673.method3795((byte) 102);
        class66.method768(2);
        class409.method2499(16);
        class192.method1390(false);
        class358.method2293((byte) 101);
        class699.method3904(6000);
        class46.method592((byte) -52);
        class205.method1445((byte) -33);
        class448.method2694(-81);
        class185.method1356(-1);
        class420.method2547(110);
        class281.method1858((byte) 7);
        class583.method3339(true);
        class159.method1235((byte) -123);
        class240.method1589((byte) 114);
        class386.method2386(15561);
        class318.method2051((byte) -45);
        class560.method3184(0);
        class197.method1414();
        class228.method1556(6);
        class346.method2251(6888);
        class140.method1140(31331);
        class25.method484(-1);
        class553.method3165(115);
        class126.method1084(false);
        class306.method2005((byte) 4);
        class149.method1177(65536);
        class414.method2525((byte) 119);
        class96.method912(true);
        class302.method1993(512);
        class206.method1448((byte) 106);
        class188.method1368();
        class462.method2765(false);
        class277.method1835(-94);
        class442.method2662();
        class12.method301();
        class199.method1424((byte) 121);
        class212.method1477();
        class573.method3295((byte) 127);
        class575.method3302(-1);
        class698.method3903(17408);
        class628.method3598(-1);
        class324.method2097(true);
        class330.method2116((byte) 10);
        class203.method1433(10);
        class43.method567(-20039);
        class278.method1837(-87);
        class234.method1573(116);
        class592.method3376((byte) 63);
        class194.method1395(19202);
        class260.method1705(0);
        class572.method3289(true);
        class236.method1578((byte) -117);
        class186.method1360(-1463);
        class291.method1944(false);
        class617.method3536(106);
        class340.method2181();
        class271.method1762(-125);
        class189.method1381(false);
        class246.method1664(22943);
        class113.method1012(-119);
        class221.method1528((byte) -99);
        class332.method2117(false);
        class607.method3493((byte) -122);
        class679.method3817(126);
        class632.method3607((byte) -111);
        class675.method3801(33);
        class216.method1505(6940);
        class606.method3490(true);
        class406.method2472((byte) -92);
        class485.method2929(18431);
        class39.method556(true);
        class161.method1242(-82);
        class417.method2536((byte) 87);
        class57.method674(-71);
        class72.method794(128);
        class339.method2178(false);
        class416.method2535(-2);
        class141.method1146(89);
        class108.method976(13283);
        class1.method155(-113);
        class677.method3807(-21640);
        class459.method2750((byte) -30);
        class413.method2517(20);
        class422.method2570(-15952);
        class343.method2208(1);
        class323.method2093(119);
        class487.method2941((byte) -125);
        class296.method1967((byte) -81);
        class225.method1536((byte) 113);
        class241.method1594(false);
        class423.method2580(72);
        class424.method2581(-15131);
        class243.method1611(-1);
        class562.method3241(true);
        class14.method371((byte) -122);
        class2.method188(true);
        class504.method2995(25659);
        class103.method961(-20336);
        class483.method2923(-26096);
        class389.method2400(-20086);
        class292.method1947((byte) 116);
        class165.method1255(true);
        class597.method3401(109);
        class301.method1989(-92);
        class693.method3879(true);
        class13.method359((byte) 105);
        class319.method2054(-7300);
        class30.method496(124);
        class269.method1752(72);
        class475.method2880(-122);
        class336.method2168((byte) -93);
        class123.method1061();
        class238.method1582(0);
        class662.method3768((byte) -103);
        class649.method3703(-1);
        class405.method2470((byte) -36);
        class614.method3526(4096);
        class127.method1087(true);
        class660.method3754(true);
        class568.method3280(false);
        class164.method1253((byte) 101);
        class435.method2643(false);
        class492.method2952(-83);
        class119.method1040(25);
        class566.method3275(false);
        class654.method3727(16946);
        class253.method1690(91);
        class381.method2372((byte) -122);
        class586.method3353(126);
        class134.method1111(-128);
        class20.method440(117);
        class79.method829(false);
        class50.method620(105);
        class270.method1754(-17822);
        class656.method3734(false);
        class611.method3510(16384);
        class499.method2976((byte) 37);
        class44.method572(2048);
        class178.method1321(4096);
        class115.method1017((byte) 55);
        class67.method770();
        class333.method2132();
        class77.method815(14);
        class465.method2777((byte) 98);
        class261.method1708((byte) -120);
        class132.method1109(false);
        class603.method3451(0);
        class350.method2267(9658);
        class368.method2327((byte) -91);
        class540.method3117(0);
        class467.method2782(false);
        class312.method2033(1072);
        class180.method1328(128);
        class694.method3888(true);
        class211.method1476(32);
        class91.method884(0);
        class382.method2378(16);
        class84.method849(0);
        class394.method2432(0);
        class89.method870(-22672);
        class118.method1036(true);
        class175.method1314(56);
        class148.method1174(-55);
        class522.method3067(-22222);
        class293.method1955(102);
        class8.method261(1868827564);
        class397.method2446(0);
        class305.method2002(-1);
        class428.method2604(65535);
        class290.method1937(true);
        class362.method2307(-116);
        class363.method2311(0);
        class474.method2839(0);
        class181.method1332(-1);
        class392.method2425(-102);
        class364.method2313(10017);
        class5.method246((byte) -80);
        class264.method1731(1922904816);
        class507.method3009(0);
        class613.method3522(0);
        class155.method1201((byte) 103);
        class32.method509((byte) 99);
        class521.method3065(-128);
        class172.method1294((byte) 19);
        class443.method2666(1958569904);
        class523.method3072((byte) 108);
        class338.method2174(-24783);
        class520.method3062(34379);
        class268.method1748((byte) 121);
        class184.method1343(2643);
        class645.method3680((byte) 123);
        class114.method1015(true);
        class106.method967((byte) 126);
        class359.method2295((byte) 82);
        class609.method3500(113);
        class163.method1244((byte) 59);
        class633.method3612(-32487);
        class400.method2453(-53);
        class183.method1338(67);
        class594.method3385(82);
        class444.method2672(-1);
        class130.method1097((byte) -125);
        class137.method1127((byte) 42);
        class439.method2654(0);
        class220.method1525((byte) -83);
        class629.method3601(6454);
        class463.method2771(false);
        class249.method1676((byte) -88);
        class150.method1183(18653);
        class223.method1533(-1307617406);
        class550.method3160((byte) 114);
        class387.method2388(-94);
        class222.method1530(-127);
        class328.method2109(19973);
        class408.method2497((byte) -78);
        class101.method941(-7909);
        class576.method3307((byte) 80);
        class480.method2915((byte) 91);
        class542.method3124(-4670);
        class208.method1459(64);
        class251.method1679((byte) -74);
        class434.method2637(-4);
        class441.method2659((byte) 107);
        class233.method1572(3);
        class147.method1172(111);
        class488.method2945(2098433104);
        class300.method1979(false);
        class7.method259(93);
        class366.method2317((byte) -101);
        class689.method3866((byte) -115);
        class207.method1457(-1);
        class404.method2467(-1);
        class508.method3012(94);
        class78.method824((byte) 92);
        class410.method2500(1);
        class154.method1197(false);
        class623.method3554(-28660);
        class593.method3378(-23);
        class534.method3093((byte) -115);
        class104.method963(16711680);
        class157.method1213((byte) 120);
        class308.method2014(7960);
        class419.method2543(false);
        class481.method2921(122);
        class687.method3861(-16801);
        class361.method2304(-1);
        class570.method3287(true);
        class133.method1110((byte) -55);
        class608.method3499(-4);
        class198.method1420(112);
        class143.method1150((byte) 110);
        class680.method3822(125);
        if (class635.field9156) {
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static void method1811(int arg0) {
        if (arg0 != 1) {
            field4113 = -10;
        }
        field4124 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method1812(byte arg0) {
        field4111++;
        if (class90.field1654 == 2) {
            try {
                this.method1822(false);
            } catch (ThreadDeath var4) {
                throw var4;
            } catch (Throwable var5) {
                class374.method2357(var5.getMessage() + " (Recovered) " + this.method1809(100), 104, var5);
                class294.method1959((byte) 115, 0);
            }
        } else {
            this.method1822(false);
        }
        if (arg0 >= -108) {
            method1824();
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1813(int arg0) {
        field4125++;
        if (class199.field3098 == 7 && class183.field2942 == 0) {
            if (class482.field6915 > 1) {
                class264.field3867 = class104.field1844;
                class482.field6915--;
            }
            if (!class308.field4551) {
                class65.method764(false);
            }
            for (int var2 = 0; var2 < 100 && class638.method3640(-19507); var2++) {
            }
        }
        class620.field8990++;
        class46.method593(-1, (byte) 66, -1, null);
        class291.method1943(null, arg0 ^ 0x10A, -1, -1);
        class292.method1946((byte) -85);
        class104.field1844++;
        for (int var3 = 0; var3 < class39.field1062; var3++) {
            class22 var4 = class459.field6542[var3].field6298;
            if (var4 != null) {
                byte var5 = var4.field880.field4976;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method3446(arg0 - 256);
                    if ((var5 & 0x2) != 0 && var4.field8779 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field8787[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class675.field9604 - var6 - 1) {
                                var9 = class675.field9604 - var6 - 1;
                            }
                            int var10 = var4.field8785[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class218.field3316 - var6 - 1 < var10) {
                                var10 = class218.field3316 - var6 - 1;
                            }
                            int var11 = class96.method911(class394.field5761, var6, -1, true, 0, var6, var10, 0, class223.field3352[var4.field9814], var4.field8785[0], (byte) -55, var6, var4.field8787[0], var9, class47.field1139);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field8787[var12] = class47.field1139[var11 - var12 - 1];
                                    var4.field8785[var12] = class394.field5761[var11 - var12 - 1];
                                    var4.field8786[var12] = 1;
                                }
                                var4.field8779 = var11;
                            }
                        }
                    }
                    class388.method2393(true, var4, (byte) -1);
                    int var13 = class437.method2645((byte) -91, var4);
                    class337.method2172(var4, class301.field4487, var13, 106, class183.field2941);
                    class216.method1507(class183.field2941, (byte) 33, var4);
                    class182.method1334(21463, var4);
                }
            }
        }
        if (class183.field2942 == 0 && class605.field8811 == 0) {
            if (class423.field6123 == 2) {
                class290.method1939(arg0 + 744);
            } else {
                class110.method1000(25701);
            }
            if ((class206.field3158 >> 9) < 14 || class675.field9604 - 14 <= class206.field3158 >> 9 || class537.field7518 >> 9 < 14 || class537.field7518 >> 9 >= class218.field3316 - 14) {
                class317.method2044(110);
            }
        }
        while (true) {
            class476 var14;
            class545 var15;
            class545 var16;
            do {
                var14 = (class476) class271.field4065.method1226(0);
                if (var14 == null) {
                    while (true) {
                        class476 var17;
                        class545 var18;
                        class545 var19;
                        do {
                            var17 = (class476) class181.field2926.method1226(0);
                            if (var17 == null) {
                                while (true) {
                                    class476 var20;
                                    class545 var21;
                                    class545 var22;
                                    do {
                                        var20 = (class476) class610.field8886.method1226(0);
                                        if (var20 == null) {
                                            if (class44.field1094 != null) {
                                                class242.method1608(-2);
                                            }
                                            if (class336.field5031 % 1500 == 0) {
                                                class649.method3706(16495);
                                            }
                                            if (arg0 != 256) {
                                                return;
                                            }
                                            if (class199.field3098 == 7 && class183.field2942 == 0) {
                                                class231.method1564((byte) -126);
                                            }
                                            class376.method2362(-28782);
                                            if (class164.field2750 && (class525.method3074((byte) -101) - 60000L) > class542.field7565) {
                                                class239.method1587((byte) 109);
                                            }
                                            for (class208 var23 = (class208) class195.field3065.method3317(-121); var23 != null; var23 = (class208) class195.field3065.method3321(-121)) {
                                                if (((long) var23.field3182) < (class525.method3074((byte) -101) / 1000L - 5L)) {
                                                    if (var23.field3180 > 0) {
                                                        class428.method2605("", "", "", 5, 0, 4096, var23.field3181 + class265.field3894.method1733(255, class140.field2466));
                                                    }
                                                    if (var23.field3180 == 0) {
                                                        class428.method2605("", "", "", 5, 0, 4096, var23.field3181 + class265.field3895.method1733(255, class140.field2466));
                                                    }
                                                    var23.method1318(8);
                                                }
                                            }
                                            if (class199.field3098 == 7 && class183.field2942 == 0) {
                                                if (class165.field2755 == null) {
                                                    class85.method852(-124, false);
                                                    return;
                                                }
                                                class6.field500++;
                                                if (class6.field500 > 50) {
                                                    class208.field3183++;
                                                    class275 var24 = class185.method1355(0, class392.field5746, class395.field5772);
                                                    class140.method1141(var24, arg0 ^ 0x4A79);
                                                }
                                                try {
                                                    class469.method2804(true);
                                                    return;
                                                } catch (IOException var25) {
                                                    class85.method852(arg0 ^ 0xFFFFFE88, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field6850;
                                        if (var21.field7697 < 0) {
                                            break;
                                        }
                                        var22 = class415.method2533((byte) 97, var21.field7733);
                                    } while (var22 == null || var22.field7641 == null || var22.field7641.length <= var21.field7697 || var22.field7641[var21.field7697] != var21);
                                    class683.method3847(var20);
                                }
                            }
                            var18 = var17.field6850;
                            if (var18.field7697 < 0) {
                                break;
                            }
                            var19 = class415.method2533((byte) 69, var18.field7733);
                        } while (var19 == null || var19.field7641 == null || var18.field7697 >= var19.field7641.length || var19.field7641[var18.field7697] != var18);
                        class683.method3847(var17);
                    }
                }
                var15 = var14.field6850;
                if (var15.field7697 < 0) {
                    break;
                }
                var16 = class415.method2533((byte) 107, var15.field7733);
            } while (var16 == null || var16.field7641 == null || var15.field7697 >= var16.field7641.length || var16.field7641[var15.field7697] != var15);
            class683.method3847(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public static final void method1814(int arg0) {
        int var1 = class237.field3520;
        int[] var2 = class47.field1140;
        int var3 = class508.field7194 ? var1 : class363.field5389 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class604 var5;
            if (var4 < var1) {
                var5 = class59.field1341[var2[var4]];
            } else {
                var5 = ((class436) class208.field3179.method2596((long) class367.field5444[var4 - var1], 58)).field6298;
            }
            if (var5.field9814 == arg0) {
                var5.field8692 = 0;
                if (var5.field8759 < 0) {
                    var5.field8718 = false;
                } else {
                    int var6 = var5.method3446(0);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field9806 & 0x1FF) != 0 || (var5.field9815 & 0x1FF) != 0) {
                            var5.field8718 = false;
                            continue;
                        }
                    } else if ((var5.field9806 & 0x1FF) != 256 || (var5.field9815 & 0x1FF) != 256) {
                        var5.field8718 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field9806 >> 9;
                        int var8 = var5.field9815 >> 9;
                        if (class198.field3080[var7][var8] != var5.field8759) {
                            var5.field8718 = true;
                            continue;
                        }
                        if (class388.field5670[var7][var8] > 1) {
                            var10002 = class388.field5670[var7][var8]--;
                            var5.field8718 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 256 + 252;
                        int var10 = var5.field9806 - var9 >> 9;
                        int var11 = var5.field9815 - var9 >> 9;
                        int var12 = var5.field9806 + var9 >> 9;
                        int var13 = var5.field9815 + var9 >> 9;
                        if (!class656.method3736(-44, var12, var5.field8759, var11, var13, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class198.field3080[var14][var15] == var5.field8759) {
                                        var10002 = class388.field5670[var14][var15]--;
                                    }
                                }
                            }
                            var5.field8718 = true;
                            continue;
                        }
                    }
                    var5.field8718 = false;
                    var5.field9809 = class460.method2757(0, var5.field9815, var5.field9814, var5.field9806);
                    class543.method3127(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Llk;IIIIIIIII)V")
    public static final void method1815(class545[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class545 var11 = arg0[var10];
            if (var11 != null && var11.field7733 == arg1) {
                int var12 = var11.field7751 + arg6;
                int var13 = var11.field7592 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field7649 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field7718 + var12;
                    int var19 = var11.field7652 + var13;
                    if (var11.field7649 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field7649 == 0 || var11.field7607 || method1825(var11).field8941 != 0 || class617.field8960 == var11 || class152.field2593 == var11.field7709 || class57.field1316 == var11.field7709) {
                    if (!method1819(var11)) {
                        if (class44.field1094 == var11 && class251.method1682(class44.field1094, -85) != null) {
                            class478.field6865 = true;
                            class218.field3314 = var12;
                            class631.field9088 = var13;
                        }
                        if (var11.field7710 || var14 < var16 && var15 < var17) {
                            if (var11.field7601 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class476 var20 = (class476) class610.field8886.method1224(-2); var20 != null; var20 = (class476) class610.field8886.method1232(-2)) {
                                    if (var20.field6849) {
                                        var20.method2588(300);
                                        var20.field6850.field7647 = false;
                                    }
                                }
                                if (class155.field2617 == 0) {
                                    class44.field1094 = null;
                                    class617.field8960 = null;
                                }
                                class386.field5665 = 0;
                                class30.field951 = false;
                                class189.field3020 = false;
                                if (!class308.field4551) {
                                    class65.method764(false);
                                }
                            }
                            boolean var21;
                            if (class410.field5945.method1931(-23081) >= var14 && class410.field5945.method1936(127) >= var15 && class410.field5945.method1931(-23081) < var16 && class410.field5945.method1936(127) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class65.field1435 && var21) {
                                if (var11.field7693 >= 0) {
                                    class139.field2461 = var11.field7693;
                                } else if (var11.field7601) {
                                    class139.field2461 = -1;
                                }
                            }
                            if (!class308.field4551 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class71.method789(arg9 - var13, true, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class410.field5945.method1924(53) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class441 var24 = (class441) class488.field6985.method1224(-2);
                            if (var24 != null && var24.method1094(true) == 0 && var24.method1092(-128) >= var14 && var24.method1093(5) >= var15 && var24.method1092(-127) < var16 && var24.method1093(5) < var17) {
                                var23 = true;
                            }
                            if (var11.field7704 != null && !class679.method3818(92)) {
                                for (int var25 = 0; var25 < var11.field7704.length; var25++) {
                                    if (class486.field6965.method2194(var11.field7704[var25], (byte) -23)) {
                                        if (var11.field7684 == null || class336.field5031 >= var11.field7684[var25]) {
                                            byte var26 = var11.field7680[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class486.field6965.method2194(86, (byte) 91) && !class486.field6965.method2194(82, (byte) -79) && !class486.field6965.method2194(81, (byte) 102)) && ((var26 & 0x2) == 0 || class486.field6965.method2194(86, (byte) -15)) && ((var26 & 0x1) == 0 || class486.field6965.method2194(82, (byte) -48)) && ((var26 & 0x4) == 0 || class486.field6965.method2194(81, (byte) 118))) {
                                                if (var25 < 10) {
                                                    class117.method1022("", true, -1, var25 + 1, var11.field7755);
                                                } else if (var25 == 10) {
                                                    class612.method3511(true);
                                                    class615 var27 = method1825(var11);
                                                    class55.method640(var27.method3528((byte) 2), -58, var27.field8934, var11);
                                                    class578.field8409 = class701.method3910(var11, (byte) -17);
                                                    if (class578.field8409 == null) {
                                                        class578.field8409 = "Null";
                                                    }
                                                    class177.field2892 = var11.field7613 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field7740[var25];
                                                if (var11.field7684 == null) {
                                                    var11.field7684 = new int[var11.field7704.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field7684[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field7684[var25] = class336.field5031 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field7684 != null) {
                                        var11.field7684[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class679.method3820((byte) 123, var24.method1093(5) - var13, var11, var24.method1092(-128) - var12);
                            }
                            if (class44.field1094 != null && class44.field1094 != var11 && var21 && method1825(var11).method3532(4222)) {
                                class72.field1494 = var11;
                            }
                            if (class617.field8960 == var11) {
                                class282.field4183 = true;
                                class260.field3817 = var12;
                                class404.field5835 = var13;
                            }
                            if (var11.field7607 || var11.field7709 != 0) {
                                if (var21 && class675.field9599 != 0 && var11.field7730 != null) {
                                    class476 var29 = new class476();
                                    var29.field6849 = true;
                                    var29.field6850 = var11;
                                    var29.field6840 = class675.field9599;
                                    var29.field6842 = var11.field7730;
                                    class610.field8886.method1229(var29, (byte) 120);
                                }
                                if (class44.field1094 != null || class308.field4551 || class649.field9346 != var11.field7709 && class386.field5665 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field7709 != 0) {
                                    if (class79.field1579 == var11.field7709 || class420.field6051 == var11.field7709) {
                                        class425.field6136 = var11;
                                        if (class2.field378 != null) {
                                            class2.field378.method3309(class623.field9017, 38, var11.field7652);
                                        }
                                        if (class79.field1579 == var11.field7709) {
                                            if (!class308.field4551 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class497.method2969(arg8, class623.field9017, arg9, -108);
                                                for (class701 var30 = (class701) class534.field7491.method3317(-121); var30 != null; var30 = (class701) class534.field7491.method3321(-121)) {
                                                    if (arg8 >= var30.field9866 && arg8 < var30.field9859 && arg9 >= var30.field9865 && arg9 < var30.field9860) {
                                                        class65.method764(false);
                                                        class521.method3064(0, var30.field9861);
                                                    }
                                                }
                                            }
                                            class46.method593(var13, (byte) 66, var12, var11);
                                            continue;
                                        }
                                    }
                                    if (class152.field2593 == var11.field7709) {
                                        if (var11.method3144(126, class623.field9017) == null || class694.field9774 != 0 && class694.field9774 != 3 || class308.field4551 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field7665[var32];
                                        if (var31 < var33 || var31 > var11.field7644[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field7718 / 2;
                                        int var35 = var32 - var11.field7652 / 2;
                                        int var36;
                                        if (class423.field6123 == 4) {
                                            var36 = (int) class591.field8509 & 0x3FFF;
                                        } else {
                                            var36 = (int) class591.field8509 + class527.field7433 & 0x3FFF;
                                        }
                                        int var37 = class509.field7210[var36];
                                        int var38 = class509.field7220[var36];
                                        if (class423.field6123 != 4) {
                                            var37 = (class130.field2350 + 256) * var37 >> 8;
                                            var38 = (class130.field2350 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 14;
                                        int var40 = var35 * var38 - var34 * var37 >> 14;
                                        int var41;
                                        int var42;
                                        if (class423.field6123 == 4) {
                                            var41 = (class112.field2019 >> 9) + (var39 >> 2);
                                            var42 = (class260.field3823 >> 9) - (var40 >> 2);
                                        } else {
                                            int var43 = (class532.field7456.method3446(0) - 1) * 256;
                                            var41 = (class532.field7456.field9806 - var43 >> 9) + (var39 >> 2);
                                            var42 = (class532.field7456.field9815 - var43 >> 9) - (var40 >> 2);
                                        }
                                        if (class65.field1435 && (class489.field7001 & 0x40) != 0) {
                                            class545 var44 = class183.method1339(class437.field6303, (byte) 105, class273.field4094);
                                            if (var44 == null) {
                                                class612.method3511(true);
                                            } else {
                                                class631.method3604(51, var42, var11.field7702, 1L, class578.field8409, var41, (byte) -117, true, " ->", class97.field1726, false);
                                            }
                                            continue;
                                        }
                                        if (class78.field1573 == class49.field1167) {
                                            class631.method3604(58, var42, -1, 1L, class265.field3902.method1733(255, class140.field2466), var41, (byte) -67, true, "", -1, false);
                                        }
                                        class631.method3604(11, var42, -1, 1L, class676.field9609, var41, (byte) -50, true, "", class338.field5049, false);
                                        continue;
                                    }
                                    if (class649.field9346 == var11.field7709) {
                                        class36.field1037 = var11;
                                        if (var21) {
                                            class30.field951 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1092(-127) - var12 - var11.field7718 / 2) * 2.0D / (double) class407.field5874);
                                            int var46 = (int) (-((double) (var24.method1093(5) - var13 - var11.field7652 / 2) * 2.0D / (double) class407.field5874));
                                            int var47 = class243.field3674 + var45 + class407.field5899;
                                            int var48 = class254.field3763 + var46 + class407.field5902;
                                            class557 var49 = class338.method2175((byte) -74);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method3173(var50, var47, var48, 0);
                                            if (var50 != null) {
                                                if (class486.field6965.method2194(82, (byte) 110) && class249.field3737 > 0) {
                                                    class99.method935(var50[0], var50[1], var50[2], 63);
                                                    continue;
                                                }
                                                class189.field3020 = true;
                                                class273.field4098 = var50[0];
                                                class1.field194 = var50[1];
                                                class430.field6216 = var50[2];
                                            }
                                            class386.field5665 = 1;
                                            class481.field6909 = false;
                                            class396.field5779 = class410.field5945.method1931(-23081);
                                            class437.field6305 = class410.field5945.method1936(127);
                                            continue;
                                        }
                                        if (var22 && class386.field5665 > 0) {
                                            if (class386.field5665 == 1 && (class396.field5779 != class410.field5945.method1931(-23081) || class437.field6305 != class410.field5945.method1936(127))) {
                                                class202.field3108 = class243.field3674;
                                                class47.field1142 = class254.field3763;
                                                class386.field5665 = 2;
                                            }
                                            if (class386.field5665 == 2) {
                                                class481.field6909 = true;
                                                class99.method934(class202.field3108 + (int) ((double) (class396.field5779 - class410.field5945.method1931(-23081)) * 2.0D / (double) class407.field5876), (byte) 64);
                                                class257.method1701(class47.field1142 - (int) ((double) (class437.field6305 - class410.field5945.method1936(125)) * 2.0D / (double) class407.field5876), 37);
                                            }
                                            continue;
                                        }
                                        if (class386.field5665 > 0 && !class481.field6909) {
                                            if ((class75.field1532 == 1 || class662.method3769((byte) 74)) && class481.field6904 > 2) {
                                                class75.method802((byte) 61, class396.field5779, class437.field6305);
                                            } else if (class557.method3175((byte) 117)) {
                                                class75.method802((byte) 61, class396.field5779, class437.field6305);
                                            }
                                        }
                                        class386.field5665 = 0;
                                        continue;
                                    }
                                    if (class413.field5982 == var11.field7709) {
                                        if (var22) {
                                            class302.method1992(class410.field5945.method1936(127) - var13, var11.field7652, class410.field5945.method1931(-23081) - var12, (byte) 94, var11.field7718);
                                        }
                                        continue;
                                    }
                                    if (class57.field1316 == var11.field7709) {
                                        class291.method1943(var11, 10, var12, var13);
                                        continue;
                                    }
                                }
                                if (!var11.field7729 && var23) {
                                    var11.field7729 = true;
                                    if (var11.field7714 != null) {
                                        class476 var51 = new class476();
                                        var51.field6849 = true;
                                        var51.field6850 = var11;
                                        var51.field6847 = var24.method1092(-128) - var12;
                                        var51.field6840 = var24.method1093(5) - var13;
                                        var51.field6842 = var11.field7714;
                                        class610.field8886.method1229(var51, (byte) 120);
                                    }
                                }
                                if (var11.field7729 && var22 && var11.field7720 != null) {
                                    class476 var52 = new class476();
                                    var52.field6849 = true;
                                    var52.field6850 = var11;
                                    var52.field6847 = class410.field5945.method1931(-23081) - var12;
                                    var52.field6840 = class410.field5945.method1936(127) - var13;
                                    var52.field6842 = var11.field7720;
                                    class610.field8886.method1229(var52, (byte) 120);
                                }
                                if (var11.field7729 && !var22) {
                                    var11.field7729 = false;
                                    if (var11.field7640 != null) {
                                        class476 var53 = new class476();
                                        var53.field6849 = true;
                                        var53.field6850 = var11;
                                        var53.field6847 = class410.field5945.method1931(-23081) - var12;
                                        var53.field6840 = class410.field5945.method1936(126) - var13;
                                        var53.field6842 = var11.field7640;
                                        class181.field2926.method1229(var53, (byte) 120);
                                    }
                                }
                                if (var22 && var11.field7622 != null) {
                                    class476 var54 = new class476();
                                    var54.field6849 = true;
                                    var54.field6850 = var11;
                                    var54.field6847 = class410.field5945.method1931(-23081) - var12;
                                    var54.field6840 = class410.field5945.method1936(125) - var13;
                                    var54.field6842 = var11.field7622;
                                    class610.field8886.method1229(var54, (byte) 120);
                                }
                                if (!var11.field7647 && var21) {
                                    var11.field7647 = true;
                                    if (var11.field7621 != null) {
                                        class476 var55 = new class476();
                                        var55.field6849 = true;
                                        var55.field6850 = var11;
                                        var55.field6847 = class410.field5945.method1931(-23081) - var12;
                                        var55.field6840 = class410.field5945.method1936(126) - var13;
                                        var55.field6842 = var11.field7621;
                                        class610.field8886.method1229(var55, (byte) 120);
                                    }
                                }
                                if (var11.field7647 && var21 && var11.field7722 != null) {
                                    class476 var56 = new class476();
                                    var56.field6849 = true;
                                    var56.field6850 = var11;
                                    var56.field6847 = class410.field5945.method1931(-23081) - var12;
                                    var56.field6840 = class410.field5945.method1936(127) - var13;
                                    var56.field6842 = var11.field7722;
                                    class610.field8886.method1229(var56, (byte) 120);
                                }
                                if (var11.field7647 && !var21) {
                                    var11.field7647 = false;
                                    if (var11.field7701 != null) {
                                        class476 var57 = new class476();
                                        var57.field6849 = true;
                                        var57.field6850 = var11;
                                        var57.field6847 = class410.field5945.method1931(-23081) - var12;
                                        var57.field6840 = class410.field5945.method1936(127) - var13;
                                        var57.field6842 = var11.field7701;
                                        class181.field2926.method1229(var57, (byte) 120);
                                    }
                                }
                                if (var11.field7713 != null) {
                                    class476 var58 = new class476();
                                    var58.field6850 = var11;
                                    var58.field6842 = var11.field7713;
                                    class271.field4065.method1229(var58, (byte) 120);
                                }
                                if (var11.field7748 != null && class70.field1484 > var11.field7753) {
                                    if (var11.field7654 == null || class70.field1484 - var11.field7753 > 32) {
                                        class476 var63 = new class476();
                                        var63.field6850 = var11;
                                        var63.field6842 = var11.field7748;
                                        class610.field8886.method1229(var63, (byte) 120);
                                    } else {
                                        label696: for (int var59 = var11.field7753; var59 < class70.field1484; var59++) {
                                            int var60 = class577.field8393[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field7654.length; var61++) {
                                                if (var11.field7654[var61] == var60) {
                                                    class476 var62 = new class476();
                                                    var62.field6850 = var11;
                                                    var62.field6842 = var11.field7748;
                                                    class610.field8886.method1229(var62, (byte) 120);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7753 = class70.field1484;
                                }
                                if (var11.field7603 != null && class478.field6870 > var11.field7675) {
                                    if (var11.field7706 == null || class478.field6870 - var11.field7675 > 32) {
                                        class476 var68 = new class476();
                                        var68.field6850 = var11;
                                        var68.field6842 = var11.field7603;
                                        class610.field8886.method1229(var68, (byte) 120);
                                    } else {
                                        label672: for (int var64 = var11.field7675; var64 < class478.field6870; var64++) {
                                            int var65 = class198.field3082[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field7706.length; var66++) {
                                                if (var11.field7706[var66] == var65) {
                                                    class476 var67 = new class476();
                                                    var67.field6850 = var11;
                                                    var67.field6842 = var11.field7603;
                                                    class610.field8886.method1229(var67, (byte) 120);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7675 = class478.field6870;
                                }
                                if (var11.field7673 != null && class679.field9636 > var11.field7655) {
                                    if (var11.field7717 == null || class679.field9636 - var11.field7655 > 32) {
                                        class476 var73 = new class476();
                                        var73.field6850 = var11;
                                        var73.field6842 = var11.field7673;
                                        class610.field8886.method1229(var73, (byte) 120);
                                    } else {
                                        label648: for (int var69 = var11.field7655; var69 < class679.field9636; var69++) {
                                            int var70 = class454.field6485[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field7717.length; var71++) {
                                                if (var11.field7717[var71] == var70) {
                                                    class476 var72 = new class476();
                                                    var72.field6850 = var11;
                                                    var72.field6842 = var11.field7673;
                                                    class610.field8886.method1229(var72, (byte) 120);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7655 = class679.field9636;
                                }
                                if (var11.field7616 != null && class418.field6031 > var11.field7759) {
                                    if (var11.field7637 == null || class418.field6031 - var11.field7759 > 32) {
                                        class476 var78 = new class476();
                                        var78.field6850 = var11;
                                        var78.field6842 = var11.field7616;
                                        class610.field8886.method1229(var78, (byte) 120);
                                    } else {
                                        label624: for (int var74 = var11.field7759; var74 < class418.field6031; var74++) {
                                            int var75 = class306.field4542[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field7637.length; var76++) {
                                                if (var11.field7637[var76] == var75) {
                                                    class476 var77 = new class476();
                                                    var77.field6850 = var11;
                                                    var77.field6842 = var11.field7616;
                                                    class610.field8886.method1229(var77, (byte) 120);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7759 = class418.field6031;
                                }
                                if (var11.field7694 != null && class219.field3324 > var11.field7674) {
                                    if (var11.field7653 == null || class219.field3324 - var11.field7674 > 32) {
                                        class476 var83 = new class476();
                                        var83.field6850 = var11;
                                        var83.field6842 = var11.field7694;
                                        class610.field8886.method1229(var83, (byte) 120);
                                    } else {
                                        label600: for (int var79 = var11.field7674; var79 < class219.field3324; var79++) {
                                            int var80 = class29.field937[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field7653.length; var81++) {
                                                if (var11.field7653[var81] == var80) {
                                                    class476 var82 = new class476();
                                                    var82.field6850 = var11;
                                                    var82.field6842 = var11.field7694;
                                                    class610.field8886.method1229(var82, (byte) 120);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7674 = class219.field3324;
                                }
                                if (class113.field2037 > var11.field7681 && var11.field7700 != null) {
                                    class476 var84 = new class476();
                                    var84.field6850 = var11;
                                    var84.field6842 = var11.field7700;
                                    class610.field8886.method1229(var84, (byte) 120);
                                }
                                if (class63.field1431 > var11.field7681 && var11.field7746 != null) {
                                    class476 var85 = new class476();
                                    var85.field6850 = var11;
                                    var85.field6842 = var11.field7746;
                                    class610.field8886.method1229(var85, (byte) 120);
                                }
                                if (class165.field2751 > var11.field7681 && var11.field7732 != null) {
                                    class476 var86 = new class476();
                                    var86.field6850 = var11;
                                    var86.field6842 = var11.field7732;
                                    class610.field8886.method1229(var86, (byte) 120);
                                }
                                if (class48.field1146 > var11.field7681 && var11.field7712 != null) {
                                    class476 var87 = new class476();
                                    var87.field6850 = var11;
                                    var87.field6842 = var11.field7712;
                                    class610.field8886.method1229(var87, (byte) 120);
                                }
                                if (class264.field3867 > var11.field7681 && var11.field7597 != null) {
                                    class476 var88 = new class476();
                                    var88.field6850 = var11;
                                    var88.field6842 = var11.field7597;
                                    class610.field8886.method1229(var88, (byte) 120);
                                }
                                var11.field7681 = class104.field1844;
                                if (var11.field7591 != null) {
                                    for (int var89 = 0; var89 < class126.field2309; var89++) {
                                        class476 var90 = new class476();
                                        var90.field6850 = var11;
                                        var90.field6843 = class675.field9606[var89].method635((byte) -106);
                                        var90.field6845 = class675.field9606[var89].method634((byte) 127);
                                        var90.field6842 = var11.field7591;
                                        class610.field8886.method1229(var90, (byte) 120);
                                    }
                                }
                                if (class14.field739 && var11.field7678 != null) {
                                    class476 var91 = new class476();
                                    var91.field6850 = var11;
                                    var91.field6842 = var11.field7678;
                                    class610.field8886.method1229(var91, (byte) 120);
                                }
                            }
                            if (var11.field7649 == 5 && var11.field7758 != -1) {
                                var11.method3146(class92.field1672, class475.field6813, -127).method3309(class623.field9017, 38, var11.field7652);
                            }
                            class277.method1831(0, var11);
                            if (var11.field7649 == 0) {
                                method1815(arg0, var11.field7755, var14, var15, var16, var17, var12 - var11.field7636, var13 - var11.field7716, arg8, arg9);
                                if (var11.field7641 != null) {
                                    method1815(var11.field7641, var11.field7755, var14, var15, var16, var17, var12 - var11.field7636, var13 - var11.field7716, arg8, arg9);
                                }
                                class601 var92 = (class601) class78.field1572.method2596((long) var11.field7755, 104);
                                if (var92 != null) {
                                    if (class78.field1573 == class568.field8275 && var92.field8611 == 0 && !class308.field4551 && var21 && !class609.field8870) {
                                        class65.method764(false);
                                    }
                                    class359.method2296(var16, (byte) -115, var17, var14, var15, var13, var12, arg9, arg8, var92.field8614);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class277.method1831(0, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)I")
    public static final int method1816(byte arg0) {
        field4117++;
        if (class574.field8342 == 0) {
            class230.field3435.method1560((byte) -7, new class575("jaclib"));
            if (class230.field3435.method1563(26319).method376(11878) != 100) {
                return 1;
            }
            if (!((class575) class230.field3435.method1563(26319)).method3301((byte) -103)) {
                class486.field6963.method3621(-1);
            }
            class574.field8342 = 1;
        }
        if (class574.field8342 == 1) {
            class253.field3753 = class230.method1562(7);
            class230.field3434.method1560((byte) -126, new class698(class385.field5656));
            class230.field3436.method1560((byte) -17, new class575("jaggl"));
            class230.field3437.method1560((byte) -59, new class575("jagdx"));
            class230.field3438.method1560((byte) -105, new class575("jagmisc"));
            class230.field3439.method1560((byte) -25, new class575("sw3d"));
            class230.field3440.method1560((byte) -55, new class575("hw3d"));
            class230.field3441.method1560((byte) -28, new class698(class252.field3751));
            class230.field3442.method1560((byte) -122, new class698(class150.field2566));
            class230.field3443.method1560((byte) -11, new class698(class213.field3263));
            class230.field3444.method1560((byte) -7, new class698(class455.field6494));
            class230.field3445.method1560((byte) -118, new class698(class323.field4720));
            class230.field3446.method1560((byte) -14, new class698(class136.field2418));
            class230.field3447.method1560((byte) -66, new class698(class51.field1188));
            class230.field3448.method1560((byte) -117, new class698(class405.field5852));
            class230.field3449.method1560((byte) -68, new class698(class420.field6053));
            class230.field3450.method1560((byte) -127, new class698(class706.field9942));
            class230.field3451.method1560((byte) -66, new class698(class302.field4506));
            class230.field3452.method1560((byte) -119, new class698(class143.field2508));
            class230.field3453.method1560((byte) -108, new class698(class117.field2085));
            class230.field3454.method1560((byte) -44, new class698(class150.field2578));
            class230.field3455.method1560((byte) -84, new class628(class662.field9534, "huffman"));
            class230.field3456.method1560((byte) -49, new class698(class82.field1600));
            class230.field3457.method1560((byte) -115, new class698(class481.field6912));
            class230.field3458.method1560((byte) -29, new class698(class95.field1708));
            class230.field3459.method1560((byte) -45, new class15(class613.field8924, "details"));
            for (int var1 = 0; var1 < class253.field3753.length; var1++) {
                if (class253.field3753[var1].method1563(26319) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class230[] var3 = class253.field3753;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class230 var5 = var3[var4];
                int var6 = var5.method1559((byte) -12);
                int var7 = var5.method1563(26319).method376(11878);
                var2 += var6 * var7 / 100;
            }
            class95.field1709 = var2;
            class574.field8342 = 2;
        }
        if (class253.field3753 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class230[] var11 = class253.field3753;
        if (arg0 >= -122) {
            field4124 = null;
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class230 var16 = var11[var12];
            int var17 = var16.method1559((byte) 119);
            int var18 = var16.method1563(26319).method376(11878);
            var9 += var17 * var18 / 100;
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
        }
        if (var10) {
            if (!((class575) class230.field3438.method1563(26319)).method3301((byte) -101)) {
                class486.field6963.method3619(14288);
            }
            class253.field3753 = null;
        }
        int var13 = var9 - class95.field1709;
        int var14 = var8 - class95.field1709;
        int var15 = var14 > 0 ? var13 * 100 / var14 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field4122++;
        try {
            if (arg0.length != 6) {
                class81.method831("Argument count", (byte) 116);
            }
            class513.field7242 = new class295();
            class513.field7242.field4419 = Integer.parseInt(arg0[0]);
            class246.field3710 = new class295();
            class246.field3710.field4419 = Integer.parseInt(arg0[1]);
            class366.field5432 = new class295();
            class366.field5432.field4419 = Integer.parseInt(arg0[2]);
            class625.field9027 = class281.field4177;
            if (arg0[3].equals("live")) {
                class539.field7531 = class534.field7487;
            } else if (arg0[3].equals("rc")) {
                class539.field7531 = class537.field7523;
            } else if (arg0[3].equals("wip")) {
                class539.field7531 = class424.field6130;
            } else {
                class81.method831("modewhat", (byte) 116);
            }
            class140.field2466 = class275.method1796(arg0[4], false);
            if (class140.field2466 == -1) {
                if (arg0[4].equals("english")) {
                    class140.field2466 = 0;
                } else if (arg0[4].equals("german")) {
                    class140.field2466 = 1;
                } else {
                    class81.method831("language", (byte) 116);
                }
            }
            class444.field6400 = false;
            class334.field4971 = false;
            if (arg0[5].equals("game0")) {
                class78.field1573 = class568.field8275;
            } else if (arg0[5].equals("game1")) {
                class78.field1573 = class49.field1167;
            } else {
                class81.method831("game", (byte) 116);
            }
            class544.field7585 = false;
            class641.field9232 = false;
            class687.field9733 = null;
            class422.field6110 = "";
            field4121 = true;
            class35.field1012 = true;
            class292.field4385 = 0;
            class568.field8280 = class78.field1573.field5796;
            class635.field9133 = null;
            class535.field7497 = 0;
            class77.field1564 = 0L;
            class633.field9104 = 0;
            client var1 = new client();
            class486.field6963 = var1;
            var1.method3617(620, 35, class539.field7531.method3891(-6) + 32, false, (byte) -28, 768, class78.field1573.field5799, 1024);
            class112.field2017.setLocation(40, 40);
        } catch (Exception var3) {
            class374.method2357(null, 111, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1817(int arg0, int arg1) {
        class186.field2999.field3271 = arg1;
        class385.field5653 = null;
        class467.field6619 = null;
        class649.field9362 = 0;
        if (arg0 > -82) {
            this.method1806((byte) 65);
        }
        class186.field2999.field3273++;
        field4131++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1818() {
        int var0 = class237.field3520;
        int[] var1 = class47.field1140;
        boolean var2 = class527.field7429.field2624 == 1 && var0 > 200 || class527.field7429.field2624 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class602 var13 = class59.field1341[var1[var3]];
            if (var13.method3442((byte) -103)) {
                var13.method529(-1);
                if (var13.field2220 >= 0 && var13.field2230 >= 0 && var13.field2227 < class675.field9604 && var13.field2222 < class218.field3316) {
                    var13.field8637 = var13.field8748 ? var2 : false;
                    if (class532.field7456 == var13) {
                        var13.field8759 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field8718) {
                            var14++;
                        }
                        if (var13.field8730 > class336.field5031) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method3446(0) << 2);
                        if (var13.field8645) {
                            var15 += 512;
                        } else {
                            if (class611.field8893 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field8759 = var15 + 1;
                    }
                } else {
                    var13.field8759 = -1;
                }
            } else {
                var13.field8759 = -1;
            }
        }
        for (int var4 = 0; var4 < class363.field5389; var4++) {
            class22 var10 = ((class436) class208.field3179.method2596((long) class367.field5444[var4], 90)).field6298;
            if (var10.method446((byte) -103) && var10.field880.method2158(class113.field2038, 0)) {
                var10.method529(-1);
                if (var10.field2220 >= 0 && var10.field2230 >= 0 && var10.field2227 < class675.field9604 && var10.field2222 < class218.field3316) {
                    int var11 = 0;
                    if (!var10.field8718) {
                        var11++;
                    }
                    if (var10.field8730 > class336.field5031) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method3446(0) << 2);
                    if (class611.field8893 == 0) {
                        if (var10.field880.field4997) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class611.field8893 == 1) {
                        if (var10.field880.field4997) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field880.field5008) {
                        var12 += 1024;
                    } else if (!var10.field880.field4933) {
                        var12 += 256;
                    }
                    var10.field8759 = var12 + 1;
                } else {
                    var10.field8759 = -1;
                }
            } else {
                var10.field8759 = -1;
            }
        }
        for (int var5 = 0; var5 < class565.field8254.length; var5++) {
            class539 var6 = class565.field8254[var5];
            if (var6 != null) {
                if (var6.field7539 == 1) {
                    class436 var7 = (class436) class208.field3179.method2596((long) var6.field7536, 90);
                    if (var7 != null) {
                        class22 var8 = var7.field6298;
                        if (var8.field8759 >= 0) {
                            var8.field8759 += 2048;
                        }
                    }
                } else if (var6.field7539 == 10) {
                    class602 var9 = class59.field1341[var6.field7536];
                    if (var9 != null && class532.field7456 != var9 && var9.field8759 >= 0) {
                        var9.field8759 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4112++;
        if (!this.method3630((byte) -68)) {
            return;
        }
        class513.field7242 = new class295();
        class513.field7242.field4419 = Integer.parseInt(this.getParameter("worldid"));
        class246.field3710 = new class295();
        class246.field3710.field4419 = Integer.parseInt(this.getParameter("lobbyid"));
        class246.field3710.field4425 = this.getParameter("lobbyaddress");
        class366.field5432 = new class295();
        class366.field5432.field4419 = Integer.parseInt(this.getParameter("demoid"));
        class366.field5432.field4425 = this.getParameter("demoaddress");
        class625.field9027 = class273.method1781(Integer.parseInt(this.getParameter("modewhere")), false);
        if (class625.field9027 == class281.field4177) {
            class625.field9027 = class72.field1495;
        } else if (!class661.method3763(class625.field9027, 28850) && class625.field9027 != class36.field1029) {
            class625.field9027 = class36.field1029;
        }
        class539.field7531 = class404.method2468(-1, Integer.parseInt(this.getParameter("modewhat")));
        if (class539.field7531 != class424.field6130 && class539.field7531 != class537.field7523 && class539.field7531 != class534.field7487) {
            class539.field7531 = class534.field7487;
        }
        try {
            class140.field2466 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var14) {
            class140.field2466 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class334.field4971 = true;
        } else {
            class334.field4971 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class444.field6400 = true;
        } else {
            class444.field6400 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class337.field5040 = true;
        } else {
            class337.field5040 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class78.field1573 = class568.field8275;
            } else if (var4.equals("1")) {
                class78.field1573 = class49.field1167;
            }
        }
        try {
            class292.field4385 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var13) {
            class292.field4385 = 0;
        }
        class628.field9063 = this.getParameter("quiturl");
        class422.field6110 = this.getParameter("settings");
        if (class422.field6110 == null) {
            class422.field6110 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class633.field9104 = Integer.parseInt(var5);
            } catch (Exception var12) {
                class633.field9104 = 0;
            }
        }
        class568.field8280 = Integer.parseInt(this.getParameter("colourid"));
        if (class568.field8280 < 0 || class568.field8280 >= class384.field5652.length) {
            class568.field8280 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            field4121 = true;
            class35.field1012 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class641.field9232 = true;
        }
        class687.field9733 = this.getParameter("sskey");
        if (class687.field9733 != null && class687.field9733.length() < 2) {
            class687.field9733 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class544.field7585 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class535.field7497 = Integer.parseInt(var8);
            } catch (Exception var11) {
            }
        }
        String var9 = this.getParameter("userFlow");
        if (var9 != null) {
            try {
                class77.field1564 = Long.parseLong(var9);
            } catch (NumberFormatException var10) {
            }
        }
        class635.field9133 = this.getParameter("additionalInfo");
        if (class635.field9133 != null && class635.field9133.length() > 50) {
            class635.field9133 = null;
        }
        class486.field6963 = this;
        if (class78.field1573 == class568.field8275) {
            class575.field8355 = 765;
            class693.field9762 = 503;
        } else if (class78.field1573 == class49.field1167) {
            class693.field9762 = 480;
            class575.field8355 = 640;
        }
        this.method3628(class78.field1573.field5799, 620, class575.field8355, class693.field9762, 35, -128, class539.field7531.method3891(-6) + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Llk;)Z")
    public static final boolean method1819(class545 arg0) {
        if (class609.field8870) {
            if (method1825(arg0).field8941 != 0) {
                return false;
            }
            if (arg0.field7649 == 0) {
                return false;
            }
        }
        return arg0.field7690;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1820(byte arg0) {
        field4116++;
        if (class544.field7585) {
            class681.field9649 = 64;
        }
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class658.method3744((byte) -88);
        class110.field1956 = new class457(class604.field8775);
        class186.field2999 = new class213();
        class302.method1991(new int[] { 1000, 100 }, -118, new int[] { 20, 260 });
        if (class625.field9027 != class36.field1029) {
            class386.field5663 = new byte[50][];
        }
        class527.field7429 = new class470(class604.field8775);
        if (class625.field9027 == class36.field1029) {
            class513.field7242.field4425 = this.getCodeBase().getHost();
        } else if (class661.method3763(class625.field9027, 28850)) {
            class513.field7242.field4425 = this.getCodeBase().getHost();
            class513.field7242.field4414 = class513.field7242.field4419 + 40000;
            class246.field3710.field4414 = class246.field3710.field4419 + 40000;
            class513.field7242.field4418 = class513.field7242.field4419 + 50000;
            class366.field5432.field4414 = class366.field5432.field4419 + 40000;
            class246.field3710.field4418 = class246.field3710.field4419 + 50000;
            class366.field5432.field4418 = class366.field5432.field4419 + 50000;
        } else if (class625.field9027 == class281.field4177) {
            class513.field7242.field4425 = "127.0.0.1";
            class246.field3710.field4425 = "127.0.0.1";
            class366.field5432.field4425 = "127.0.0.1";
            class513.field7242.field4414 = class513.field7242.field4419 + 40000;
            class246.field3710.field4414 = class246.field3710.field4419 + 40000;
            class513.field7242.field4418 = class513.field7242.field4419 + 50000;
            class366.field5432.field4414 = class366.field5432.field4419 + 40000;
            class246.field3710.field4418 = class246.field3710.field4419 + 50000;
            class366.field5432.field4418 = class366.field5432.field4419 + 50000;
        }
        class59.field1337 = class461.field6568 = class72.field1502 = class467.field6609 = new short[256];
        class394.field5757 = class513.field7242;
        if (class78.field1573 == class568.field8275) {
            class397.field5791 = false;
        }
        if (class78.field1573 == class49.field1167) {
            class154.field2612 = class573.field8333;
            class540.field7551 = 16777215;
            class85.field1611 = class468.field6620;
            class66.field1450 = true;
            class205.field3144 = 0;
        } else {
            class85.field1611 = class202.field3109;
            class154.field2612 = class366.field5439;
        }
        try {
            class415.field6011 = class486.field6963.getToolkit().getSystemClipboard();
        } catch (Exception var4) {
        }
        class486.field6965 = class486.method2933(0, class699.field9853);
        class410.field5945 = class481.method2920(class699.field9853, 13233, true);
        try {
            if (arg0 != -36) {
                return;
            }
            if (class604.field8775.field790 != null) {
                class13.field721 = new class349(class604.field8775.field790, 5200, 0);
                for (int var3 = 0; var3 < 35; var3++) {
                    class19.field834[var3] = new class349(class604.field8775.field775[var3], 6000, 0);
                }
                class362.field5378 = new class349(class604.field8775.field772, 6000, 0);
                class694.field9782 = new class610(255, class13.field721, class362.field5378, 500000);
                class109.field1916 = new class349(class604.field8775.field777, 24, 0);
                class604.field8775.field775 = null;
                class604.field8775.field772 = null;
                class604.field8775.field790 = null;
                class604.field8775.field777 = null;
            }
        } catch (IOException var5) {
            class694.field9782 = null;
            class109.field1916 = null;
            class13.field721 = null;
            class362.field5378 = null;
        }
        if (class625.field9027 != class36.field1029) {
            class239.field3535 = true;
        }
        if (class78.field1573 == class568.field8275) {
            class568.field8277 = class265.field3873.method1733(255, class140.field2466);
        } else if (class78.field1573 == class49.field1167) {
            class568.field8277 = class265.field3874.method1733(255, class140.field2466);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1821() {
        int var0 = class237.field3520;
        int[] var1 = class47.field1140;
        int var2 = class508.field7194 ? var0 : class363.field5389 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class604 var4;
            if (var3 < var0) {
                var4 = class59.field1341[var1[var3]];
            } else {
                var4 = ((class436) class208.field3179.method2596((long) class367.field5444[var3 - var0], 108)).field6298;
            }
            if (var4.field8759 >= 0) {
                int var5 = var4.method3446(0);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field9806 & 0x1FF) == 0 && (var4.field9815 & 0x1FF) == 0) {
                        continue;
                    }
                } else if ((var4.field9806 & 0x1FF) == 256 && (var4.field9815 & 0x1FF) == 256) {
                    continue;
                }
                var4.field9809 = class460.method2757(0, var4.field9815, var4.field9814, var4.field9806);
                class543.method3127(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method1822(boolean arg0) {
        field4127++;
        if (class199.field3098 == 14) {
            return;
        }
        class336.field5031++;
        if ((class336.field5031 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class682.field9673 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class301.field4493.setSeed((long) class682.field9673);
        }
        if ((class336.field5031 % 50) == 0) {
            class699.field9837 = class374.field5569;
            class374.field5569 = 0;
            class475.field6799 = class528.field7440;
            class528.field7440 = 0;
        }
        this.method1828(28152);
        if (class304.field4511 != null) {
            class304.field4511.method3933(0);
        }
        class124.method1065(0);
        class486.field6965.method2204(98);
        class410.field5945.method1929(97);
        if (class623.field9017 != null) {
            class623.field9017.method122((int) class525.method3074((byte) -101));
        }
        class596.method3396((byte) 18);
        class504.field7156 = 0;
        class126.field2309 = 0;
        for (class53 var3 = class486.field6965.method2202((byte) -107); var3 != null; var3 = class486.field6965.method2202((byte) -105)) {
            int var6 = var3.method636((byte) -10);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method634((byte) 108);
                if (class547.method3153(true) && (var7 == '`' || var7 == '§' || var7 == '²')) {
                    if (class679.method3818(108)) {
                        class582.method3337(31909);
                    } else {
                        class161.method1241(81);
                    }
                } else if (class126.field2309 < 128) {
                    class675.field9606[class126.field2309] = var3;
                    class126.field2309++;
                }
            } else if (var6 == 0 && class504.field7156 < 75) {
                class271.field4070[class504.field7156] = var3;
                class504.field7156++;
            }
        }
        class675.field9599 = 0;
        for (class441 var4 = class410.field5945.method1933((byte) -51); var4 != null; var4 = class410.field5945.method1933((byte) -112)) {
            int var5 = var4.method1094(true);
            if (var5 == -1) {
                class320.field4698.method1229(var4, (byte) 120);
            } else if (var5 == 6) {
                class675.field9599 += var4.method1091((byte) 71);
            } else if (class703.method3930(var5, -1)) {
                class488.field6985.method1229(var4, (byte) 120);
                if (class488.field6985.method1225(-2) > 10) {
                    class488.field6985.method1226(0);
                }
            }
        }
        if (arg0) {
            field4124 = null;
        }
        if (class679.method3818(127)) {
            class368.method2323(2);
        }
        if (class15.method375(-3, class199.field3098)) {
            class656.method3733((byte) -63);
            class438.method2652(true);
        } else if (class685.method3853(27931, class199.field3098)) {
            class273.method1782(-1);
        }
        if (class233.method1571(class199.field3098, -117) && !class685.method3853(27931, class199.field3098)) {
            this.method1813(256);
            class293.method1952((byte) -20);
            class465.method2778(255);
        } else if (class396.method2443(-10, class199.field3098) && !class685.method3853(27931, class199.field3098)) {
            this.method1813(256);
            class465.method2778(255);
        } else if (class199.field3098 == 12) {
            class465.method2778(255);
        } else if (class156.method1205(-11, class199.field3098) && !class685.method3853(27931, class199.field3098)) {
            class205.method1441(-75);
        } else if (class199.field3098 == 13) {
            class465.method2778(255);
            if (class642.field9234 != -3 && class642.field9234 != 2 && class642.field9234 != 15) {
                class85.method852(-126, false);
            }
        }
        class293.method1956(0, class623.field9017);
        class488.field6985.method1226(0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Llk;)Llk;")
    public static final class545 method1823(class545 arg0) {
        int var1 = method1825(arg0).method3530(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class415.method2533((byte) 88, arg0.field7733);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1824() {
        class706.field9936 = 0;
        for (int var0 = 0; var0 < class363.field5389; var0++) {
            class22 var1 = ((class436) class208.field3179.method2596((long) class367.field5444[var0], 102)).field6298;
            if (var1.field8718 && var1.method456(-810) != -1) {
                int var2 = (var1.method3446(0) - 1) * 256 + 252;
                int var3 = var1.field9806 - var2 >> 9;
                int var4 = var1.field9815 - var2 >> 9;
                class604 var5 = class537.method3106(var3, var1.field9814, var4, 0);
                if (var5 != null) {
                    int var6 = var5.field8728;
                    if (var5 instanceof class22) {
                        var6 += 2048;
                    }
                    if (var5.field8692 == 0 && var5.method456(-810) != -1) {
                        class368.field5456[class706.field9936] = var6;
                        class445.field6411[class706.field9936] = var6;
                        class706.field9936++;
                        var5.field8692++;
                    }
                    class368.field5456[class706.field9936] = var6;
                    class445.field6411[class706.field9936] = var1.field8728 + 2048;
                    class706.field9936++;
                    var5.field8692++;
                }
            }
        }
        class147.method1171(0, class368.field5456, class706.field9936 - 1, class445.field6411, true);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Llk;)Lbca;")
    public static final class615 method1825(class545 arg0) {
        class615 var1 = (class615) class526.field7412.method2596(((long) arg0.field7755 << 32) + (long) arg0.field7697, 75);
        return var1 == null ? arg0.field7749 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    public static final void method1826(byte arg0, int arg1) {
        class236.field3517 = arg1;
        if (arg0 < 119) {
            method1824();
        }
        field4119++;
        class601.field8616.method1913(true);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    private final void method1827(int arg0) {
        field4109++;
        if (class199.field3098 == 14) {
            return;
        }
        long var2 = class344.method2213(50) / 1000000L - class632.field9091;
        class632.field9091 = class344.method2213(110) / 1000000L;
        boolean var4 = class259.method1703(false);
        if (var4 && class552.field7822 && class428.field6169 != null) {
            class428.field6169.method926(2);
        }
        if (class318.method2052(class199.field3098, true)) {
            if (class309.field4560 != 0L && class309.field4560 < class525.method3074((byte) -101)) {
                class485.method2931(class527.field7429.field2661, class601.method3434(true), class527.field7429.field2670, false, (byte) -46);
            } else if (!class623.field9017.method159() && class183.field2940) {
                class444.method2673(arg0 - 30267);
            }
        }
        if (class413.field5977 == null) {
            Container var5;
            if (class112.field2017 != null) {
                var5 = class112.field2017;
            } else if (class416.field6017 == null) {
                var5 = class369.field5463;
            } else {
                var5 = class416.field6017;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class112.field2017 == var5) {
                Insets var8 = class112.field2017.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class513.field7237 != var6 || class193.field3033 != var7 || class620.field9000) {
                if (class623.field9017 == null || class623.field9017.method147()) {
                    class658.method3744((byte) -82);
                } else {
                    class193.field3033 = var7;
                    class513.field7237 = var6;
                }
                class309.field4560 = class525.method3074((byte) -101) + 500L;
                class620.field9000 = false;
            }
        }
        if (arg0 != 30267) {
            method1816((byte) -24);
        }
        if (class413.field5977 != null && !class533.field7479 && class318.method2052(class199.field3098, true)) {
            class485.method2931(-1, class527.field7429.field2653, -1, false, (byte) -58);
        }
        boolean var9 = false;
        if (class153.field2605) {
            class153.field2605 = false;
            var9 = true;
        }
        if (var9) {
            class278.method1836(true);
        }
        if (class623.field9017 != null && class623.field9017.method159() || class601.method3434(true) != 1) {
            class293.method1954(0);
        }
        if (class15.method375(-3, class199.field3098)) {
            class332.method2118(var9, 14);
        } else if (class496.method2965(class199.field3098, false)) {
            class241.method1597(arg0 ^ 0xFFFF89C4);
        } else if (class681.method3829(class199.field3098, 29237)) {
            class241.method1597(-1);
        } else if (class685.method3853(27931, class199.field3098)) {
            if (class269.field4005 == 1) {
                if (class170.field2831 < class346.field5164) {
                    class170.field2831 = class346.field5164;
                }
                int var10 = (class170.field2831 - class346.field5164) * 50 / class170.field2831;
                class341.method2191(class623.field9017, class265.field3887.method1733(255, class140.field2466) + "<br>(" + var10 + "%)", true, class363.field5394, class612.field8916, (byte) -84);
            } else if (class269.field4005 == 2) {
                if (class363.field5387 > class107.field1856) {
                    class107.field1856 = class363.field5387;
                }
                int var11 = ((class107.field1856 - class363.field5387) * 50 / class107.field1856) + 50;
                class341.method2191(class623.field9017, class265.field3887.method1733(arg0 ^ 0x76C4, class140.field2466) + "<br>(" + var11 + "%)", true, class363.field5394, class612.field8916, (byte) -125);
            } else {
                class341.method2191(class623.field9017, class265.field3887.method1733(255, class140.field2466), true, class363.field5394, class612.field8916, (byte) -108);
            }
        } else if (class199.field3098 == 10) {
            class695.method3892((byte) -11, var2);
        } else if (class199.field3098 == 13) {
            class341.method2191(class623.field9017, class265.field3889.method1733(255, class140.field2466) + "<br>" + class265.field3890.method1733(255, class140.field2466), false, class363.field5394, class612.field8916, (byte) -97);
        }
        if (class125.field2263 == 3) {
            for (int var12 = 0; var12 < class152.field2587; var12++) {
                Rectangle var13 = class293.field4404[var12];
                if (class338.field5050[var12]) {
                    class623.field9017.method1267(var13.y, var13.height, 1, var13.width, var13.x, -1996553985);
                } else if (class480.field6901[var12]) {
                    class623.field9017.method1267(var13.y, var13.height, 1, var13.width, var13.x, -1996554240);
                }
            }
        }
        if (class679.method3818(106)) {
            class56.method665(82, class623.field9017);
        }
        if (class604.field8775.field771 && class318.method2052(class199.field3098, true) && class125.field2263 == 0 && class601.method3434(true) == 1 && !var9) {
            int var16 = 0;
            for (int var17 = 0; var17 < class152.field2587; var17++) {
                if (class480.field6901[var17]) {
                    class480.field6901[var17] = false;
                    class220.field3336[var16++] = class293.field4404[var17];
                }
            }
            try {
                class623.field9017.method29(class220.field3336, var16);
            } catch (class105 var18) {
            }
        } else if (!class15.method375(-3, class199.field3098)) {
            for (int var14 = 0; var14 < class152.field2587; var14++) {
                class480.field6901[var14] = false;
            }
            try {
                class623.field9017.method63();
            } catch (class105 var19) {
                class374.method2357(var19.getMessage() + " (Recovered) " + this.method1809(100), 103, var19);
                class294.method1959((byte) 118, 0);
            }
        }
        if (class527.field7429.field2674 == 0) {
            class185.method1354(15L, 10);
        } else if (class527.field7429.field2674 == 1) {
            class185.method1354(10L, 10);
        } else if (class527.field7429.field2674 == 2) {
            class185.method1354(5L, arg0 ^ 0x7631);
        } else if (class527.field7429.field2674 == 3) {
            class185.method1354(2L, 10);
        }
        if (class312.field4636) {
            class86.method860(false);
        }
        if (class527.field7429.field2650 && class199.field3098 == 3 && class361.field5368 != -1) {
            class527.field7429.field2650 = false;
            class527.field7429.method2809(class604.field8775, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method1828(int arg0) {
        field4126++;
        if (arg0 == 28152) {
            boolean var2 = class186.field2999.method1478((byte) -90);
            if (!var2) {
                this.method1801(-88);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final synchronized void method1829(byte arg0) {
        field4132++;
        int var2 = 111 % ((arg0 - 29) / 49);
        if (class416.field6017 != null && class699.field9853 == null && !class604.field8775.field771) {
            try {
                Class var3 = class416.field6017.getClass();
                Field var4 = var3.getDeclaredField("canvas");
                class699.field9853 = (Canvas) var4.get(class416.field6017);
                var4.set(class416.field6017, null);
                if (class699.field9853 != null) {
                    return;
                }
            } catch (Exception var5) {
            }
        }
        super.method1829((byte) -48);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1830(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
