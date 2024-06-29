import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class140 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lwm;")
    public static class152 field2126 = class157.method1048(")1", 93);

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lwm;")
    public static class152 field2129 = class157.method1048("Cach-B", 123);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field2122 = 1;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "Lwm;")
    public static class152 field2138 = class157.method1048("::", 94);

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2135 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lwm;")
    private static class152 field2127 = class157.method1048("Loading fonts )2 ", 96);

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Lwm;")
    public static class152 field2136 = field2127;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Ld;")
    public static class142 field2131;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Lah;")
    public static class205 field2132;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "Lah;")
    public static class205 field2141;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "Ljava/awt/Image;")
    public Image field2139;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    public int[] field2124;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
    public static int[] field2134;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 7)
    public static final void method879(int arg0) {
        if (arg0 != -12561) {
            return;
        }
        class73.field1058.method1068(8);
        int var1 = class73.field1058.method1075(false, 8);
        field2133++;
        if (class233.field3826 > var1) {
            for (int var2 = var1; var2 < class233.field3826; var2++) {
                class305.field5243[class26.field452++] = class97.field1403[var2];
            }
        }
        if (class233.field3826 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class233.field3826 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class97.field1403[var3];
            class4 var5 = class40.field649[var4];
            int var6 = class73.field1058.method1075(false, 1);
            if (var6 == 0) {
                class97.field1403[class233.field3826++] = var4;
                var5.field4251 = class142.field2187;
            } else {
                int var7 = class73.field1058.method1075(false, 2);
                if (var7 == 0) {
                    class97.field1403[class233.field3826++] = var4;
                    var5.field4251 = class142.field2187;
                    class235.field3851[class238.field3912++] = var4;
                } else if (var7 == 1) {
                    class97.field1403[class233.field3826++] = var4;
                    var5.field4251 = class142.field2187;
                    int var8 = class73.field1058.method1075(false, 3);
                    var5.method1702(1, (byte) 126, var8);
                    int var9 = class73.field1058.method1075(false, 1);
                    if (var9 == 1) {
                        class235.field3851[class238.field3912++] = var4;
                    }
                } else if (var7 == 2) {
                    class97.field1403[class233.field3826++] = var4;
                    var5.field4251 = class142.field2187;
                    if (class73.field1058.method1075(false, 1) == 1) {
                        int var10 = class73.field1058.method1075(false, 3);
                        var5.method1702(2, (byte) 125, var10);
                        int var11 = class73.field1058.method1075(false, 3);
                        var5.method1702(2, (byte) 127, var11);
                    } else {
                        int var12 = class73.field1058.method1075(false, 3);
                        var5.method1702(0, (byte) 126, var12);
                    }
                    int var13 = class73.field1058.method1075(false, 1);
                    if (var13 == 1) {
                        class235.field3851[class238.field3912++] = var4;
                    }
                } else if (var7 == 3) {
                    class305.field5243[class26.field452++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZII)V", line = 126)
    public static final void method880(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            method881(69);
        }
        field2128++;
        if (arg1 >= class157.field2505 && arg1 <= class110.field1553) {
            int var5 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg3);
            int var6 = class150.method944(class238.field3902, class308.field5283, (byte) 42, arg4);
            class172.method1153(var6, 0, arg1, arg0, var5);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 155)
    public static final void method881(int arg0) {
        class8.field111 = 0;
        class70.field1016 = false;
        class84.field1166 = 0;
        field2125++;
        class160.field2556 = 0;
        class270.field4622 = 0;
        class59.field902 = -1;
        class245.field4102.field4946 = 0;
        class291.field4968 = -1;
        class147.field2248 = 0;
        class73.field1058.field4946 = arg0;
        class294.field5034 = -1;
        class101.field1465 = -1;
        class288.field4882 = 0;
        for (int var1 = 0; var1 < class22.field380.length; var1++) {
            if (class22.field380[var1] != null) {
                class22.field380[var1].field4179 = -1;
            }
        }
        for (int var2 = 0; var2 < class40.field649.length; var2++) {
            if (class40.field649[var2] != null) {
                class40.field649[var2].field4179 = -1;
            }
        }
        class107.method710(1782206279);
        class28.field485 = 1;
        class232.method1597((byte) 127, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class249.field4170[var3] = true;
        }
        class321.method2261(-4847);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V", line = 212)
    public static void method882(int arg0) {
        field2126 = null;
        field2134 = null;
        field2132 = null;
        field2131 = null;
        field2129 = null;
        field2138 = null;
        field2141 = null;
        field2136 = null;
        if (arg0 > -108) {
            field2126 = (class152) null;
        }
        field2127 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 244)
    public final void method883(boolean arg0) {
        class96.method638(this.field2124, this.field2137, this.field2123);
        field2140++;
        if (!arg0) {
            field2127 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lul;[[II[I[[F[[FLvb;II[[FI)V", line = 260)
    public static final void method884(class43 arg0, int[][] arg1, int arg2, int[] arg3, float[][] arg4, float[][] arg5, class54 arg6, int arg7, int arg8, float[][] arg9, int arg10) {
        int[] var11 = new int[arg3.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg3[var12 + var12];
            int var14 = arg3[var12 + var12 + 1];
            if (arg7 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg7 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg7 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg9[arg10][arg2];
                var18 = arg4[arg10][arg2];
                var19 = arg5[arg10][arg2];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg9[arg10 + 1][arg2];
                var19 = arg5[arg10 + 1][arg2];
                var18 = arg4[arg10 + 1][arg2];
            } else if (var13 == 128 && var14 == 128) {
                var19 = arg5[arg10 + 1][arg2 + 1];
                var18 = arg4[arg10 + 1][arg2 + 1];
                var17 = arg9[arg10 + 1][arg2 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var17 = arg9[arg10][arg2 + 1];
                var19 = arg5[arg10][arg2 + 1];
                var18 = arg4[arg10][arg2 + 1];
            } else {
                float var20 = arg4[arg10][arg2];
                float var21 = arg9[arg10][arg2];
                float var22 = arg5[arg10][arg2];
                float var23 = (float) var14 / 128.0F;
                float var24 = (float) var13 / 128.0F;
                float var25 = (arg9[arg10 + 1][arg2] - var21) * var24 + var21;
                float var26 = (arg4[arg10 + 1][arg2] - var20) * var24 + var20;
                float var27 = (arg5[arg10 + 1][arg2] - var22) * var24 + var22;
                float var28 = arg5[arg10][arg2 + 1];
                float var29 = (arg5[arg10 + 1][arg2 + 1] - var28) * var24 + var28;
                float var30 = arg4[arg10][arg2 + 1];
                float var31 = (arg4[arg10 + 1][arg2 + 1] - var30) * var24 + var30;
                var19 = (var29 - var27) * var23 + var27;
                var18 = (var31 - var26) * var23 + var26;
                float var32 = arg9[arg10][arg2 + 1];
                float var33 = (arg9[arg10 + 1][arg2 + 1] - var32) * var24 + var32;
                var17 = (var33 - var25) * var23 + var25;
            }
            int var34 = (arg10 << 7) + var13;
            int var35 = (arg2 << 7) + var14;
            int var36 = class296.method2045(var13, arg2, -1, arg1, var14, arg10);
            var11[var12] = arg0.method301(arg6, var34, var36, var35, var18, var17, var19);
        }
        int var37 = -12 / ((arg8 + 60) / 56);
        arg0.method299(var11);
        field2130++;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 381)
    protected class140() {
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public abstract void method120(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method122(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method121(int arg0, Graphics arg1, int arg2, int arg3);
}
