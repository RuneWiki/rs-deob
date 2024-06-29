import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class163 extends class201 {

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Ljd;")
    public static class85 field2805 = class221.method1499("(U (X", (byte) -120);

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Ljd;")
    public static class85 field2808 = class221.method1499("(Udns", (byte) 87);

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "I")
    public static int field2814 = 0;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "Ljd;")
    private static class85 field2815 = class221.method1499("Players", (byte) -85);

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field2818 = 2;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "Ljd;")
    public static class85 field2799 = field2815;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "[I")
    private int[] field2802;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "[I")
    public int[] field2810;

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "[Ljd;")
    private class85[] field2819;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "[[I")
    private int[][] field2806;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
    public static final void method1069(byte arg0, int arg1) {
        field2811++;
        if (arg0 != 41) {
            method1079(81, -39, 73);
        }
        class15.field208.method1267(arg1, (byte) -123);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1070(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field2813++;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg1 - arg6;
        int var12 = arg1 * arg1;
        if (arg3 >= -67) {
            return;
        }
        int var13 = arg5 - arg6;
        int var14 = arg5 * arg5;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var12 << 1;
        int var19 = var15 << 1;
        int var20 = var16 << 1;
        int var21 = arg5 << 1;
        int var22 = var13 << 1;
        int var23 = (1 - var21) * var12 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var16 + var19;
        int var26 = var15 - (var22 - 1) * var20;
        int var27 = var14 << 2;
        int var28 = var12 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var22 - 3) * var20;
        int var33 = var27;
        int var34 = (var21 - 3) * var18;
        int var35 = var19 * 3;
        int var36 = (arg5 - 1) * var28;
        int var37 = var30;
        if (class34.field522 <= arg4 && class1.field6 >= arg4) {
            int[] var38 = class146.field2488[arg4];
            int var39 = class144.method945(arg7 - arg1, class217.field3802, (byte) -116, class83.field1513);
            int var40 = class144.method945(arg1 + arg7, class217.field3802, (byte) -116, class83.field1513);
            int var41 = class144.method945(arg7 - var11, class217.field3802, (byte) -116, class83.field1513);
            int var42 = class144.method945(arg7 + var11, class217.field3802, (byte) -116, class83.field1513);
            class183.method1260(arg0, var39, -29, var38, var41);
            class183.method1260(arg2, var41, -104, var38, var42);
            class183.method1260(arg0, var42, 75, var38, var40);
        }
        int var43 = (var13 - 1) * var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var33;
                    var23 += var31;
                    var31 += var27;
                    var33 += var27;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var33;
                var33 += var27;
                var23 += var31;
                var8++;
                var31 += var27;
            }
            boolean var44 = var13 >= var9;
            var9--;
            var24 += -var34;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var35;
                        var26 += var37;
                        var37 += var30;
                        var10++;
                        var35 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var35;
                    var10++;
                    var35 += var30;
                    var26 += var37;
                    var37 += var30;
                }
                var26 += -var32;
                var32 -= var29;
                var25 += -var43;
                var43 -= var29;
            }
            int var45 = arg4 - var9;
            int var46 = arg4 + var9;
            if (var46 >= class34.field522 && var45 <= class1.field6) {
                int var47 = class144.method945(arg7 + var8, class217.field3802, (byte) -116, class83.field1513);
                int var48 = class144.method945(arg7 - var8, class217.field3802, (byte) -116, class83.field1513);
                if (var44) {
                    int var49 = class144.method945(arg7 + var10, class217.field3802, (byte) -116, class83.field1513);
                    int var50 = class144.method945(arg7 - var10, class217.field3802, (byte) -116, class83.field1513);
                    if (var45 >= class34.field522) {
                        int[] var51 = class146.field2488[var45];
                        class183.method1260(arg0, var48, -118, var51, var50);
                        class183.method1260(arg2, var50, -107, var51, var49);
                        class183.method1260(arg0, var49, 13, var51, var47);
                    }
                    if (class1.field6 >= var46) {
                        int[] var52 = class146.field2488[var46];
                        class183.method1260(arg0, var48, -109, var52, var50);
                        class183.method1260(arg2, var50, -126, var52, var49);
                        class183.method1260(arg0, var49, -104, var52, var47);
                    }
                } else {
                    if (var45 >= class34.field522) {
                        class183.method1260(arg0, var48, 65, class146.field2488[var45], var47);
                    }
                    if (class1.field6 >= var46) {
                        class183.method1260(arg0, var48, -32, class146.field2488[var46], var47);
                    }
                }
            }
            var34 -= var28;
            var23 += -var36;
            var36 -= var28;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
    public final int method1071(int arg0, int arg1, int arg2) {
        if (arg1 != 7655) {
            method1083(true, true, (class85) null);
        }
        field2804++;
        if (this.field2802 == null || arg0 < 0 || this.field2802.length < arg0) {
            return -1;
        } else if (this.field2806[arg0] == null || arg2 < 0 || this.field2806[arg0].length < arg2) {
            return -1;
        } else {
            return this.field2806[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)V")
    public final void method1072(boolean arg0) {
        if (arg0) {
            return;
        }
        if (this.field2810 != null) {
            for (int var2 = 0; var2 < this.field2810.length; var2++) {
                this.field2810[var2] = class75.method528(this.field2810[var2], 32768);
            }
        }
        field2812++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILik;)Ljd;")
    public final class85 method1073(int arg0, class247 arg1) {
        field2816++;
        class85 var3 = class58.method392(80, (byte) -63);
        int var4 = 5 / ((arg0 - 42) / 55);
        if (this.field2802 != null) {
            for (int var5 = 0; var5 < this.field2802.length; var5++) {
                var3.method638(this.field2819[var5], 0);
                var3.method638(class95.method678(this.field2802[var5], false, arg1.method1682(114, class197.field3383[this.field2802[var5]]), this.field2806[var5]), 0);
            }
        }
        var3.method638(this.field2819[this.field2819.length - 1], 0);
        return var3.method609(-121);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
    public final int method1074(byte arg0) {
        field2809++;
        if (this.field2802 == null) {
            return 0;
        } else if (arg0 == 52) {
            return this.field2802.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lik;I[I)V")
    public final void method1075(class247 arg0, int arg1, int[] arg2) {
        field2803++;
        if (this.field2802 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field2802.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class184.field3139[this.method1078(-75, var4)];
            if (var5 > 0) {
                arg0.method1701((long) arg2[var4], var5, 122);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILik;)V")
    private final void method1076(int arg0, int arg1, class247 arg2) {
        if (arg0 == 1) {
            this.field2819 = arg2.method1692(119).method604((byte) 56, 60);
        } else if (arg0 == 2) {
            int var8 = arg2.method1711((byte) -67);
            this.field2810 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2810[var9] = arg2.method1694((byte) -100);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1711((byte) -67);
            this.field2806 = new int[var4][];
            this.field2802 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1694((byte) -100);
                this.field2802[var5] = var6;
                this.field2806[var5] = new int[class153.field2619[var6]];
                for (int var7 = 0; var7 < class153.field2619[var6]; var7++) {
                    this.field2806[var5][var7] = arg2.method1694((byte) -100);
                }
            }
        }
        field2807++;
        if (arg1 > -58) {
            method1080((class106) null, 59, -26, -13, -105, false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(ILik;)V")
    public final void method1077(int arg0, class247 arg1) {
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                field2800++;
                if (arg0 != -1) {
                    this.field2802 = null;
                    return;
                }
                return;
            }
            this.method1076(var3, -100, arg1);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public final int method1078(int arg0, int arg1) {
        field2817++;
        if (this.field2802 == null || arg1 < 0 || this.field2802.length < arg1) {
            return -1;
        } else if (arg0 >= -2) {
            return -70;
        } else {
            return this.field2802[arg1];
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)Lla;")
    public static final class93 method1079(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class93 var4 = var3.field3653;
            var3.field3653 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lde;IIIIZ)V")
    public static final void method1080(class106 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2797++;
        if (class127.field2229 >= 50 || arg0.field1872 == null || arg3 >= arg0.field1872.length || arg0.field1872[arg3] == null) {
            return;
        }
        int var6 = arg0.field1872[arg3][0];
        int var7 = var6 & 0xF;
        int var8 = (var6 & 0x7A) >> 4;
        int var9 = var6 >> 8;
        if (arg0.field1872[arg3].length > 1) {
            int var10 = (int) (Math.random() * (double) arg0.field1872[arg3].length);
            if (var10 > 0) {
                var9 = arg0.field1872[arg3][var10];
            }
        }
        if (var7 == 0) {
            if (arg5) {
                class102.method705(0, var9, 0, var8);
            }
        } else if (class182.field3109 != 0) {
            int var11 = (arg1 - 64) / 128;
            class108.field1917[class127.field2229] = var9;
            class59.field1071[class127.field2229] = var8;
            if (arg4 != 21983) {
                field2814 = -102;
            }
            class193.field3304[class127.field2229] = 0;
            class40.field638[class127.field2229] = null;
            int var12 = (arg2 - 64) / 128;
            class167.field2871[class127.field2229] = (var12 << 8) + ((var11 << 16) + var7);
            class127.field2229++;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(Z)Ljd;")
    public final class85 method1081(boolean arg0) {
        field2798++;
        class85 var2 = class58.method392(80, (byte) -47);
        if (!arg0) {
            field2815 = null;
        }
        if (this.field2819 == null) {
            return class47.field825;
        }
        var2.method638(this.field2819[0], 0);
        for (int var3 = 1; var3 < this.field2819.length; var3++) {
            var2.method638(class254.field4390, 0);
            var2.method638(this.field2819[var3], 0);
        }
        return var2.method609(-122);
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
    public static void method1082(int arg0) {
        field2805 = null;
        field2815 = null;
        field2808 = null;
        int var1 = 51 % ((81 - arg0) / 45);
        field2799 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZZLjd;)V")
    public static final void method1083(boolean arg0, boolean arg1, class85 arg2) {
        field2801++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class30.field457.method73(arg2, 250);
        int var7 = class30.field457.method76(arg2, 250) * 13;
        class179.method1222(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var3 + var7, 0);
        if (!arg1) {
            method1070(29, 32, 120, (byte) -110, 112, 61, 8, -92);
        }
        class179.method1217(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        class30.field457.method63(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class252.method1745(var5 - var3, -var3 + var4, (byte) 116, var3 + var6 + var3, var7 - -var3 + var3);
        if (!arg0) {
            class239.method1628(58, var4, var5, var7, var6);
            return;
        }
        try {
            Graphics var8 = class254.field4389.getGraphics();
            class230.field3972.method361(0, var8, true, 0);
        } catch (Exception var9) {
            class254.field4389.repaint();
        }
    }
}
