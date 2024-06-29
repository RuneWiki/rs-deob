import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class class144 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lqj;")
    private static class196 field2207 = class80.method502("Loaded update list", -48);

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "Lqj;")
    public static class196 field2218 = class80.method502("Fallen lassen", -48);

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lqj;")
    public static class196 field2215 = field2207;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lea;")
    public static class243 field2222 = new class243();

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[S")
    public static short[] field2225 = new short[256];

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lac;")
    public static class165 field2226;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lnb;")
    public static class95 field2219;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field2216;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    public int[] field2212;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIB)I")
    public static final int method889(int arg0, int arg1, byte arg2) {
        field2209++;
        int var3 = 93 % ((arg2 - 34) / 58);
        int var4 = class95.method589(arg0 - 1, arg1 + -1, -9799) + class95.method589(arg0 - 1, arg1 + 1, -9799) + class95.method589(arg0 + 1, arg1 + -1, -9799) + class95.method589(arg0 + 1, arg1 + 1, -9799);
        int var5 = class95.method589(arg0, arg1 - 1, -9799) + class95.method589(arg0, arg1 + 1, -9799) + class95.method589(arg0 - 1, arg1, -9799) + class95.method589(arg0 + 1, arg1, -9799);
        int var6 = class95.method589(arg0, arg1, -9799);
        return var6 / 4 + var4 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public abstract void method202(boolean arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method890(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2224++;
        int var9 = arg7 - arg5;
        int var10 = arg8 - arg4;
        int var11 = (arg6 - arg3 << 16) / var9;
        int var12 = (arg0 - arg2 << 16) / var10;
        if (!arg1) {
            method894((byte) -29);
        }
        boolean var13;
        if (class235.field4182 > 0 && class235.field4182 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        for (int var14 = 0; var14 < var9; var14++) {
            int var31 = var11 * var14 >> 16;
            int var32 = (var14 + 1) * var11 >> 16;
            int var33 = var32 - var31;
            if (var33 > 0) {
                int var10000 = arg3 + var32;
                int[][] var35 = class143.field2186[arg5 + var14 >> 6];
                int var36 = arg3 + var31;
                for (int var37 = 0; var37 < var10; var37++) {
                    int var38 = (var37 + 1) * var12 >> 16;
                    int var39 = var12 * var37 >> 16;
                    int var40 = var38 - var39;
                    if (var40 > 0) {
                        var10000 = arg2 + var38;
                        int var42 = arg2 + var39;
                        int var43 = arg4 + var37 >> 6;
                        if (var35[var43] != null) {
                            int var44 = ((arg4 + var37 & 0x3F) << 6) + (arg5 + var14 & 0x3F);
                            int var45 = var35[var43][var44];
                            if (var45 != 0) {
                                class145 var46 = class83.method521(var45 - 1, (byte) 34);
                                if (var13 && class48.field573 == var46.field2241) {
                                    class50 var47 = new class50();
                                    var47.field596 = var46.field2241;
                                    var47.field597 = var36;
                                    var47.field598 = var42;
                                    class251.field4435.method1652(26532, var47);
                                }
                                class217.field3898[var46.field2241].method221(var36 - 7, var42 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class25.field315 == class199.field3530) {
            for (class10 var15 = (class10) class258.field4508.method1651((byte) -110); var15 != null; var15 = (class10) class258.field4508.method1656(-75)) {
                int var16 = var15.field124;
                int var17 = var16 - class212.field3809;
                int var18 = var15.field117;
                int var19 = arg3 + (var17 - arg5) * (-arg3 + arg6) / (arg7 - arg5);
                int var20 = class83.field1213 + class83.field1203 - var18;
                int var21 = arg2 + (arg0 - arg2) * (-arg4 + var20) / (arg8 - arg4);
                int var22 = var15.field112;
                class38 var23 = null;
                if (var22 == 0) {
                    if (class199.field3530 == 3.0D) {
                        var23 = class41.field465;
                    }
                    if (class199.field3530 == 4.0D) {
                        var23 = class249.field4404;
                    }
                    if (class199.field3530 == 6.0D) {
                        var23 = class108.field1551;
                    }
                    if (class199.field3530 == 8.0D) {
                        var23 = class74.field1076;
                    }
                }
                if (var22 == 1) {
                    if (class199.field3530 == 3.0D) {
                        var23 = class108.field1551;
                    }
                    if (class199.field3530 == 4.0D) {
                        var23 = class74.field1076;
                    }
                    if (class199.field3530 == 6.0D) {
                        var23 = class72.field1040;
                    }
                    if (class199.field3530 == 8.0D) {
                        var23 = class178.field3108;
                    }
                }
                int var24 = 16777215;
                if (var22 == 2) {
                    if (class199.field3530 == 3.0D) {
                        var23 = class72.field1040;
                    }
                    var24 = 16755200;
                    if (class199.field3530 == 4.0D) {
                        var23 = class178.field3108;
                    }
                    if (class199.field3530 == 6.0D) {
                        var23 = class123.field1750;
                    }
                    if (class199.field3530 == 8.0D) {
                        var23 = class238.field4230;
                    }
                }
                if (var23 != null) {
                    class196[] var25 = var15.field120;
                    int var26 = var25.length;
                    int var27 = var21 - var23.method194() * (var26 - 1) / 2;
                    int var28 = var27 + var23.method196() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var23.method198(var25[var29], var19, var28, var24, true);
                        var28 += var23.method194();
                    }
                }
            }
        }
        for (class50 var30 = (class50) class251.field4435.method1651((byte) -84); var30 != null; var30 = (class50) class251.field4435.method1656(-109)) {
            class217.field3898[var30.field596].method221(var30.field597 - 7, var30.field598 - 7);
            class55.method297(var30.field597, var30.field598, 15, 16776960, 128);
            class55.method297(var30.field597, var30.field598, 7, 16777215, 256);
        }
        class251.field4435.method1653(-120);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
    public static final int method891(int arg0, int arg1, int arg2) {
        field2214++;
        if (arg1 != 126) {
            method897(-41, null, 107, null, -71);
        }
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lqj;Z)Lqj;")
    public static final class196 method892(class196 arg0, boolean arg1) {
        field2220++;
        class10 var2 = class66.method426(arg0, 12);
        if (arg1) {
            return null;
        } else if (var2 == null) {
            return class165.field2717;
        } else {
            return var2.field113;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method893(int arg0) {
        if (!class160.field2574) {
            class142.field2169[0] = 1002;
            class65.field916[0] = class35.field428;
            class52.field650[0] = class152.field2450;
            class125.field1767 = 1;
        }
        field2223++;
        if (class9.field103 != -1) {
            class149.method936(class9.field103, -1);
        }
        for (int var1 = 0; var1 < class46.field555; var1++) {
            if (class161.field2588[var1]) {
                class86.field1271[var1] = true;
            }
            class149.field2388[var1] = class161.field2588[var1];
            class161.field2588[var1] = false;
        }
        class60.field799 = -1;
        class80.field1159 = null;
        class65.field917 = -1;
        class99.field1424 = class171.field2879;
        if (class9.field103 != -1) {
            class46.field555 = 0;
            class171.method1116(0, 0, 0, class9.field103, -1, class61.field815, class249.field4407, (byte) -65, 0);
        }
        class55.method287();
        class78.method492(-25139);
        if (class160.field2574) {
            class40.method200(3);
        } else if (class65.field917 != -1) {
            class253.method1710(class65.field917, (byte) -13, class60.field799);
        }
        if (class138.field2132 == 3) {
            for (int var2 = 0; var2 < class46.field555; var2++) {
                if (class149.field2388[var2]) {
                    class55.method299(class138.field2122[var2], class168.field2828[var2], class29.field368[var2], class64.field886[var2], 16711935, 128);
                } else if (class86.field1271[var2]) {
                    class55.method299(class138.field2122[var2], class168.field2828[var2], class29.field368[var2], class64.field886[var2], 16711680, 128);
                }
            }
        }
        class256.method1723(class113.field1658, false, class102.field1477.field2081, class102.field1477.field2085, class27.field335);
        class113.field1658 = 0;
        if (arg0 != 1002) {
            method894((byte) -30);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method894(byte arg0) {
        field2226 = null;
        field2219 = null;
        field2218 = null;
        field2215 = null;
        field2222 = null;
        field2225 = null;
        if (arg0 != 65) {
            method891(-17, -48, 67);
        }
        field2207 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static final void method895(int arg0) {
        field2208++;
        if (class194.field3408 != null) {
            class194.field3408.method481(true);
            class194.field3408 = null;
        }
        class195.method1281(arg0 - 43088380);
        class20.method109();
        for (int var1 = arg0; var1 < 4; var1++) {
            class188.field3298[var1].method965((byte) -128);
        }
        class206.method1405((byte) -123);
        System.gc();
        class150.method943(2, (byte) -59);
        class102.field1476 = false;
        class238.field4235 = -1;
        class165.method1064(16, true);
        class221.field3990 = false;
        class178.field3011 = 0;
        class106.field1523 = 0;
        for (int var2 = 0; var2 < class214.field3834.length; var2++) {
            class214.field3834[var2] = null;
        }
        class63.field863 = 0;
        class252.field4451 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class247.field4397[var3] = null;
            class198.field3522[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class153.field2482[var4] = null;
        }
        class180.method1182((byte) -101, 8);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public final void method896(byte arg0) {
        class55.method292(this.field2212, this.field2217, this.field2213);
        field2211++;
        if (arg0 != -63) {
            field2222 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILbk;ILbk;I)Ll;")
    public static final class190 method897(int arg0, class136 arg1, int arg2, class136 arg3, int arg4) {
        field2210++;
        if (arg2 == -8686) {
            return class84.method528(arg1, arg4, arg0, 0) ? class224.method1515(-19, arg3.method842(arg4, (byte) 120, arg0)) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method206(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    protected class144() {
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method208(int arg0, int arg1, Component arg2, int arg3);
}
