import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class63 extends class310 {

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[I")
    public static int[] field1126 = new int[1000];

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field1130 = 1;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "Z")
    public static boolean field1132 = false;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "[Lkd;")
    private class362[] field1123;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lqm;II)V", line = 6)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            field1132 = true;
        }
        field1122++;
        if (arg2 == 0) {
            this.field1123 = new class362[arg0.method1720((byte) -124)];
            for (int var4 = 0; var4 < this.field1123.length; var4++) {
                int var5 = arg0.method1720((byte) -19);
                if (var5 == 0) {
                    this.field1123[var4] = class127.method983(arg0, (byte) 122);
                } else if (var5 == 1) {
                    this.field1123[var4] = class355.method2510(8, arg0);
                } else if (var5 == 2) {
                    this.field1123[var4] = class71.method604(arg0, 6181);
                } else if (var5 == 3) {
                    this.field1123[var4] = class51.method396(class141.method1087(arg1, 2527), arg0);
                }
            }
        } else if (arg2 == 1) {
            this.field4940 = arg0.method1720((byte) -14) == 1;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method77(int arg0, int arg1) {
        field1125++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            this.method549(-21516, this.field4950.method932((byte) 32));
        }
        if (arg1 != -13093) {
            field1131 = -90;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLwf;IILem;I)V", line = 115)
    public static final void method548(int arg0, byte arg1, class250 arg2, int arg3, int arg4, class285 arg5, int arg6) {
        field1124++;
        if (arg5 == null) {
            return;
        }
        int var7;
        if (class112.field1827 == 4) {
            var7 = (int) class261.field4396 & 0x7FF;
        } else {
            var7 = (int) class261.field4396 + class79.field1372 & 0x7FF;
        }
        int var8 = Math.max(arg2.field4081 / 2, arg2.field4157 / 2) + 10;
        int var9 = arg3 * arg3 + arg4 * arg4;
        if (arg1 >= -125) {
            field1130 = -45;
        }
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class153.field2438[var7];
        int var11 = class153.field2445[var7];
        if (class112.field1827 != 4) {
            var10 = var10 * 256 / (class4.field41 + 256);
            var11 = var11 * 256 / (class4.field41 + 256);
        }
        int var12 = arg3 * var10 + arg4 * var11 >> 16;
        int var13 = arg3 * var11 - (arg4 * var10) >> 16;
        if (class42.field607) {
            ((class265) arg5).method2016(arg2.field4081 / 2 + var12 + arg0 - (arg5.field4642 / 2), arg2.field4157 / 2 + arg6 - var13 + -(arg5.field4644 / 2), (class58) arg2.method1940((byte) -120, false));
        } else {
            ((class341) arg5).method2408(arg0 + var12 - (arg5.field4642 / 2 + -(arg2.field4081 / 2)), arg2.field4157 / 2 + -(arg5.field4644 / 2) + arg6 + -var13, arg2.field4208, arg2.field4188);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[[I)V", line = 161)
    private final void method549(int arg0, int[][] arg1) {
        field1133++;
        int var3 = class261.field4405;
        if (arg0 != -21516) {
            field1127 = 4;
        }
        int var4 = class254.field4279;
        class211.method1591(arg1, arg0 ^ 0xFFFFA81C);
        class324.method2287(0, class98.field1628, -40, class113.field1861, 0);
        if (this.field1123 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1123.length; var5++) {
            class362 var6 = this.field1123[var5];
            int var7 = var6.field5738;
            int var8 = var6.field5744;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method644(true, var4, var3);
                }
            } else if (var8 < 0) {
                var6.method643(var3, true, var4);
            } else {
                var6.method642((byte) 100, var4, var3);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)Lvg;", line = 219)
    public static final class318 method550(int arg0, int arg1) {
        class318 var2 = (class318) class39.field574.method2329((byte) 107, (long) arg1);
        field1128++;
        if (arg0 != 10864) {
            return (class318) null;
        } else if (var2 == null) {
            byte[] var3 = class252.field4262.method472(arg1, 110, 31);
            class318 var4 = new class318();
            if (var3 != null) {
                var4.method2251(arg1, (byte) 99, new class227(var3));
            }
            class39.field574.method2333((long) arg1, 0, var4);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V", line = 243)
    public static void method551(int arg0) {
        if (arg0 == 6) {
            field1126 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 252)
    public class63() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I", line = 269)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            field1127 = -61;
        }
        int[][] var3 = this.field4942.method10((byte) -119, arg0);
        field1129++;
        if (this.field4942.field30) {
            int var4 = class261.field4405;
            int var5 = class254.field4279;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4942.method8(8914);
            this.method549(-21516, var6);
            for (int var8 = 0; var8 < class254.field4279; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; var14 < class261.field4405; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class343.method2418(var15 << 4, 4080);
                    var11[var14] = class343.method2418(65280, var15) >> 4;
                    var13[var14] = class343.method2418(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 327)
    public static final void method552(String arg0, boolean arg1, int arg2) {
        field1134++;
        int var3 = class343.field5466.method1330(arg0, 250);
        int var4 = class343.field5466.method1344(arg0, 250) * 13;
        int var5 = -70 / ((-arg2 - 7) / 34);
        byte var6 = 4;
        int var7 = var6 + 6;
        int var8 = var6 + 6;
        if (class42.field607) {
            class244.method1862(var8 - var6, var7 - var6, var3 + var6 + var6, var4 - -var6 - -var6, 0);
            class244.method1865(var8 - var6, var7 - var6, var3 + var6 + var6, var6 + var6 + var4, 16777215);
        } else {
            class246.method1885(var8 - var6, var7 - var6, var3 + var6 + var6, var4 + var6 - -var6, 0);
            class246.method1881(var8 - var6, var7 - var6, var6 + var6 + var3, var6 + var6 + var4, 16777215);
        }
        class343.field5466.method1340(arg0, var8, var7, var3, var4, 16777215, -1, 1, 1, 0);
        class56.method441(var8 - var6, -80, -var6 + var7, var3 + var6 + var6, var6 + var6 + var4);
        if (!arg1) {
            class117.method923(var8, var3, 0, var4, var7);
        } else if (class42.field607) {
            class42.method296();
        } else {
            try {
                Graphics var9 = class151.field2402.getGraphics();
                class292.field4728.method572(0, 0, (byte) -126, var9);
            } catch (Exception var11) {
                class151.field2402.repaint();
            }
        }
    }
}
