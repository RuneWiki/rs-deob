import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class184 extends class243 {

    @OriginalMember(owner = "client!bh", name = "ib", descriptor = "[S")
    public static short[] field3285 = new short[256];

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Loh;")
    public static class258 field3274 = class153.method1046(":duelfriend:", 85);

    @OriginalMember(owner = "client!bh", name = "jb", descriptor = "B")
    public byte field3286;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    public int field3283;

    @OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lsc;")
    public static class18 field3279;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "Lva;")
    public class235 field3282;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "[Lvi;")
    public static class129[] field3281;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLva;)Lbf;", line = 5)
    public static final class300 method1245(boolean arg0, class235 arg1) {
        field3273++;
        return arg0 ? new class300(arg1.method1574(-115), arg1.method1574(-104), arg1.method1574(-99), arg1.method1574(-50), arg1.method1602(18160), arg1.method1602(18160), arg1.method1589(72)) : (class300) null;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V", line = 18)
    public static void method1246(int arg0) {
        field3285 = null;
        field3279 = null;
        if (arg0 != -4) {
            method1249(false, 68, true, false, -127, 50, 13);
        }
        field3281 = null;
        field3274 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgb;IBI)Ldb;", line = 31)
    public static final class41 method1247(class213 arg0, int arg1, byte arg2, int arg3) {
        field3277++;
        if (class162.method1086(0, arg0, arg1, arg3)) {
            int var4 = 70 % ((arg2 - 3) / 58);
            return class49.method392(8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([II[[F[[I[[FLoa;III[[FLbg;)V", line = 53)
    public static final void method1248(int[] arg0, int arg1, float[][] arg2, int[][] arg3, float[][] arg4, class21 arg5, int arg6, int arg7, int arg8, float[][] arg9, class284 arg10) {
        field3280++;
        int[] var11 = new int[arg0.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg0[var12 + var12];
            int var14 = arg0[var12 + var12 + 1];
            if (arg1 == 1) {
                int var16 = var13;
                var13 = var14;
                var14 = 128 - var16;
            } else if (arg1 == 2) {
                var13 = 128 - var13;
                var14 = 128 - var14;
            } else if (arg1 == 3) {
                int var15 = var13;
                var13 = 128 - var14;
                var14 = var15;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg2[arg7][arg6];
                var18 = arg4[arg7][arg6];
                var19 = arg9[arg7][arg6];
            } else if (var13 == 128 && var14 == 0) {
                var17 = arg2[arg7 + 1][arg6];
                var18 = arg4[arg7 + 1][arg6];
                var19 = arg9[arg7 + 1][arg6];
            } else if (var13 == 128 && var14 == 128) {
                var17 = arg2[arg7 + 1][arg6 + 1];
                var18 = arg4[arg7 + 1][arg6 + 1];
                var19 = arg9[arg7 + 1][arg6 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var19 = arg9[arg7][arg6 + 1];
                var17 = arg2[arg7][arg6 + 1];
                var18 = arg4[arg7][arg6 + 1];
            } else {
                float var20 = arg9[arg7][arg6];
                float var21 = arg4[arg7][arg6];
                float var22 = arg4[arg7][arg6 + 1];
                float var23 = arg2[arg7][arg6 + 1];
                float var24 = arg9[arg7][arg6 + 1];
                float var25 = arg2[arg7][arg6];
                float var26 = (float) var14 / 128.0F;
                float var27 = (float) var13 / 128.0F;
                float var28 = (arg4[arg7 + 1][arg6 + 1] - var22) * var27 + var22;
                float var29 = (arg4[arg7 + 1][arg6] - var21) * var27 + var21;
                float var30 = (arg9[arg7 + 1][arg6 + 1] - var24) * var27 + var24;
                var18 = (var28 - var29) * var26 + var29;
                float var31 = (arg2[arg7 + 1][arg6] - var25) * var27 + var25;
                float var32 = (arg9[arg7 + 1][arg6] - var20) * var27 + var20;
                float var33 = (arg2[arg7 + 1][arg6 + 1] - var23) * var27 + var23;
                var19 = (var30 - var32) * var26 + var32;
                var17 = (var33 - var31) * var26 + var31;
            }
            int var34 = (arg6 << 7) + var14;
            int var35 = class72.method537(arg7, false, var14, arg6, arg3, var13);
            int var36 = (arg7 << 7) + var13;
            var11[var12] = arg5.method139(arg10, var36, var35, var34, var17, var18, var19);
        }
        if (arg8 < 43) {
            method1247((class213) null, -52, (byte) -14, -47);
        }
        arg5.method138(var11);
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)[B", line = 175)
    public final byte[] method1061(byte arg0) {
        if (arg0 >= -58) {
            return (byte[]) null;
        }
        field3276++;
        if (this.field4208 || this.field3282.field4051 < this.field3282.field4066.length - this.field3286) {
            throw new RuntimeException();
        }
        return this.field3282.field4066;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZIZZIII)V", line = 196)
    public static final void method1249(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3278++;
        if (arg2) {
            class257.method1749();
        }
        if (class71.field1253 != null && (arg1 != 3 || class259.field4501 != arg6 || class239.field4171 != arg4)) {
            class191.method1289(class297.field5086, class71.field1253, (byte) 93);
            class71.field1253 = null;
        }
        if (arg3) {
            field3274 = (class258) null;
        }
        if (arg1 == 3 && class71.field1253 == null) {
            class71.field1253 = class130.method942(arg6, class297.field5086, arg4, 0, 0, 38);
            if (class71.field1253 != null) {
                class239.field4171 = arg4;
                class259.field4501 = arg6;
                class219.method1484((byte) -117, class297.field5086);
            }
        }
        if (arg1 == 3 && class71.field1253 == null) {
            method1249(true, class61.field1022, true, false, -1, arg5, -1);
            return;
        }
        Container var7;
        if (class71.field1253 != null) {
            var7 = class71.field1253;
        } else if (class284.field4882 == null) {
            var7 = class297.field5086.field5061;
        } else {
            var7 = class284.field4882;
        }
        class276.field4762 = var7.getSize().width;
        class314.field5326 = var7.getSize().height;
        if (class284.field4882 == var7) {
            Insets var8 = class284.field4882.getInsets();
            class276.field4762 -= var8.right + var8.left;
            class314.field5326 -= var8.top + var8.bottom;
        }
        if (arg1 >= 2) {
            class218.field3773 = class276.field4762;
            class42.field577 = class314.field5326;
            class115.field2052 = 0;
            class63.field1098 = 0;
        } else {
            class42.field577 = 503;
            class115.field2052 = (class276.field4762 - 765) / 2;
            class63.field1098 = 0;
            class218.field3773 = 765;
        }
        if (arg0) {
            class102.method774(class5.field67, false);
            class49.method394(class5.field67, 26390);
            if (class206.field3563 != null) {
                class206.field3563.method481(class5.field67, (byte) -64);
            }
            class303.field5178.method296(-1);
            class137.method954(class5.field67, 26406);
            class165.method1101(93, class5.field67);
            if (class206.field3563 != null) {
                class206.field3563.method483(class5.field67, false);
            }
        } else {
            if (class257.field4390) {
                class257.method1748(class218.field3773, class42.field577);
            }
            class5.field67.setSize(class218.field3773, class42.field577);
            if (class284.field4882 == var7) {
                Insets var9 = class284.field4882.getInsets();
                class5.field67.setLocation(class115.field2052 + var9.left, class63.field1098 + var9.top);
            } else {
                class5.field67.setLocation(class115.field2052, class63.field1098);
            }
        }
        if (arg1 == 0 && arg5 > 0) {
            class257.method1741(class5.field67);
        }
        if (arg2 && arg1 > 0) {
            class5.field67.setIgnoreRepaint(true);
            if (!class148.field2502) {
                class171.method1144();
                class83.field1407 = null;
                class83.field1407 = class108.method799(15, class42.field577, class5.field67, class218.field3773);
                class211.method1392();
                if (class280.field4818 == 5) {
                    class27.method207(true, 0, class123.field2180);
                } else {
                    class251.method1704(class282.field4853, false, false);
                }
                try {
                    Graphics var10 = class5.field67.getGraphics();
                    class83.field1407.method785(0, 128, 0, var10);
                } catch (Exception var14) {
                }
                class27.method212(102);
                if (arg5 == 0) {
                    class83.field1407 = class108.method799(15, 503, class5.field67, 765);
                } else {
                    class83.field1407 = null;
                }
                class116 var12 = class297.field5086.method2079(class303.field5178.getClass(), (byte) -3);
                while (var12.field2067 == 0) {
                    class237.method1628((byte) -88, 100L);
                }
                if (var12.field2067 == 1) {
                    class148.field2502 = true;
                }
            }
            if (class148.field2502) {
                class257.method1761(class5.field67, class58.field917 * 2);
            }
        }
        if (!class257.field4390 && arg1 > 0) {
            method1249(true, 0, true, false, -1, arg5, -1);
            return;
        }
        if (arg1 > 0 && arg5 == 0) {
            class121.field2126.setPriority(5);
            class83.field1407 = null;
            class89.method641();
            ((class272) class266.field4643).method1922(7400, 200);
            if (class4.field62) {
                class266.method1871(0.7F);
            }
        } else if (arg1 == 0 && arg5 > 0) {
            class121.field2126.setPriority(1);
            class83.field1407 = class108.method799(15, 503, class5.field67, 765);
            class89.method646();
            ((class272) class266.field4643).method1922(7400, 20);
            if (class4.field62) {
                if (class151.field2557 == 1) {
                    class266.method1871(0.9F);
                }
                if (class151.field2557 == 2) {
                    class266.method1871(0.8F);
                }
                if (class151.field2557 == 3) {
                    class266.method1871(0.7F);
                }
                if (class151.field2557 == 4) {
                    class266.method1871(0.6F);
                }
            }
            class157.method1069();
        }
        class37.field483 = !class110.method807(720049666);
        if (arg2) {
            class15.method104(-77);
        }
        if (arg1 >= 2) {
            class180.field3217 = true;
        } else {
            class180.field3217 = false;
        }
        if (class170.field2901 != -1) {
            class173.method1169(-120, true);
        }
        if (class73.field1289 != null && (class280.field4818 == 30 || class280.field4818 == 25)) {
            class218.method1480(96);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class238.field4151[var13] = true;
        }
        class243.field4227 = true;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I", line = 420)
    public final int method1063(int arg0) {
        if (arg0 != -23559) {
            this.method1063(61);
        }
        field3284++;
        return this.field3282 == null ? 0 : this.field3282.field4051 * 100 / (this.field3282.field4066.length - this.field3286);
    }
}
