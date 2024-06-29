import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class242 {

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[I")
    private int[] field4218;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[I")
    private int[] field4212;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lj;")
    private class232 field4206;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lj;")
    private class232 field4200;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[Lj;")
    private class232[] field4199;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "Lhi;")
    private static class82 field4208 = class95.method664((byte) -80, "Examine");

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Z")
    public static boolean field4203 = true;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field4204 = 2;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Lhi;")
    public static class82 field4215 = class95.method664((byte) -86, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lhi;")
    public static class82 field4216 = field4208;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    public static int[] field4197 = new int[5];

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lsc;")
    public static class145 field4205;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lum;")
    public static class222 field4207;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Lum;")
    public static class222 field4209;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lum;")
    public static class222 field4211;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method1734(int arg0, int arg1) {
        if (arg1 != 0) {
            field4216 = (class82) null;
        }
        field4214++;
        return ((arg0 & 0x3CE310) >> 21) != 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILhi;Z)V", line = 24)
    public static final void method1735(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            method1735(-82, (class82) null, false);
        }
        field4217++;
        class227 var3 = class215.method1531(-1, 2, arg0);
        var3.method1616(64);
        var3.field3931 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLum;Lol;IDZII)[I", line = 40)
    public final int[] method1736(boolean arg0, class222 arg1, class121 arg2, int arg3, double arg4, boolean arg5, int arg6, int arg7) {
        field4202++;
        class200.method1403(-84, arg4);
        class36.field594 = arg2;
        class136.field2344 = arg1;
        class219.method1553(arg7, arg6, (byte) 102);
        for (int var10 = 0; var10 < this.field4199.length; var10++) {
            this.field4199[var10].method1644(-256, arg6, arg7);
        }
        int[] var11 = new int[arg6 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg5) {
            var12 = arg6 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = 1;
            var14 = arg6;
            var12 = 0;
        }
        int var15 = 55 % ((arg3 + 60) / 49);
        int var16 = 0;
        for (int var17 = 0; var17 < arg7; var17++) {
            if (arg0) {
                var16 = var17;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4206.field3990) {
                int[] var18 = this.field4206.method80(var17, (byte) -121);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4206.method146(var17, (byte) -82);
                var19 = var22[0];
                var21 = var22[1];
                var20 = var22[2];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var19[var23] >> 4;
                int var25 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var21[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class133.field2312[var25];
                int var28 = class133.field2312[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class133.field2312[var26];
                var11[var16++] = (var28 << 16) - (-(var29 << 8) - var27);
                if (arg0) {
                    var16 += arg6 - 1;
                }
            }
        }
        for (int var30 = 0; var30 < this.field4199.length; var30++) {
            this.field4199[var30].method1328(1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 170)
    public static void method1737(int arg0) {
        field4207 = null;
        field4197 = null;
        field4208 = null;
        field4211 = null;
        field4209 = null;
        field4216 = null;
        field4205 = null;
        field4215 = null;
        if (arg0 != -1565092700) {
            field4209 = (class222) null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 192)
    public static final void method1738() {
        GL var0 = class147.field2479;
        var0.glDisableClientState(32886);
        class147.method997(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class147.method1001();
        for (int var1 = 0; var1 < class112.field2029[0].length; var1++) {
            class108 var2 = class112.field2029[0][var1];
            if (var2.field1906 >= 0 && class102.field1821.method628(127, var2.field1906) == 4) {
                var0.glColor4fv(class244.method1752((byte) 53, var2.field1921), 0);
                float var3 = 201.5F - (var2.field1915 ? 1.0F : 0.5F);
                var2.method736(class15.field120, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class147.method1019();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class147.method1006();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lol;ILum;)Z", line = 225)
    public final boolean method1739(class121 arg0, int arg1, class222 arg2) {
        field4213++;
        if (class234.field4090 <= 0) {
            for (int var4 = 0; var4 < this.field4212.length; var4++) {
                if (!arg2.method1598(this.field4212[var4], ~arg1)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4212.length; var5++) {
                if (!arg2.method1587(class234.field4090, this.field4212[var5], (byte) 55)) {
                    return false;
                }
            }
        }
        for (int var6 = arg1; var6 < this.field4218.length; var6++) {
            if (!arg0.method637((byte) 15, this.field4218[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZIIIJ)Lhi;", line = 277)
    public static final class82 method1740(boolean arg0, int arg1, int arg2, int arg3, long arg4) {
        class82 var6 = class253.method1820(0, 0);
        field4198++;
        if (arg4 < 0L) {
            var6.method525((byte) -79, class163.field2845);
            arg4 = -arg4;
        }
        class82 var7 = class106.field1874;
        if (arg1 < 95) {
            return (class82) null;
        }
        class82 var8 = class192.field3225;
        if (arg3 == 1) {
            var8 = class106.field1874;
            var7 = class192.field3225;
        }
        if (arg3 == 2) {
            var7 = class192.field3225;
            var8 = class271.field4577;
        }
        if (arg3 == 3) {
            var7 = class192.field3225;
            var8 = class106.field1874;
        }
        class82 var9 = class253.method1820(0, 0);
        class82 var10 = class253.method1820(0, 0);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method525((byte) -65, class327.method2240((byte) -74, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = client.field2194;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg0 && var12 != 0 && (var12 % 3) == 0) {
                var9.method525((byte) -94, var8);
            }
            var12++;
            var9.method525((byte) -26, class327.method2240((byte) -74, (int) (arg4 % 10L)));
            arg4 /= 10L;
        }
        if (var10.method535(true) > 0) {
            var10.method525((byte) -37, var7);
        }
        return class29.method182(-6039, new class82[] { var6, var9.method529((byte) -90), var10.method529((byte) -108) });
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lum;BDIIZLol;)[B", line = 393)
    public final byte[] method1741(class222 arg0, byte arg1, double arg2, int arg3, int arg4, boolean arg5, class121 arg6) {
        field4210++;
        class200.method1403(-91, arg2);
        byte[] var9 = new byte[arg3 * arg4 * 4];
        int var10 = 59 / ((-arg1 - 2) / 57);
        class136.field2344 = arg0;
        class36.field594 = arg6;
        class219.method1553(arg3, arg4, (byte) 79);
        for (int var11 = 0; var11 < this.field4199.length; var11++) {
            this.field4199[var11].method1644(-256, arg4, arg3);
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg3; var13++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4206.field3990) {
                int[] var18 = this.field4206.method80(var13, (byte) 63);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field4206.method146(var13, (byte) -82);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            if (arg5) {
                var12 = var13 << 2;
            }
            int[] var19;
            if (this.field4200.field3990) {
                var19 = this.field4200.method80(var13, (byte) -91);
            } else {
                var19 = this.field4200.method146(var13, (byte) -82)[0];
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                int var22 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class133.field2312[var21];
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = var15[var20] >> 4;
                int var25 = class133.field2312[var22];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class133.field2312[var24];
                int var27;
                if (var26 == 0 && var23 == 0 && var25 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9[var12++] = (byte) var26;
                var9[var12++] = (byte) var23;
                var9[var12++] = (byte) var25;
                var9[var12++] = (byte) var27;
                if (arg5) {
                    var12 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var28 = 0; var28 < this.field4199.length; var28++) {
            this.field4199[var28].method1328(124);
        }
        return var9;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 531)
    public static final void method1742(int arg0) {
        field4201++;
        if (arg0 != 255) {
            field4197 = (int[]) null;
        }
        class91.field1635.method2168(arg0 - 255);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 547)
    public class242() {
        this.field4218 = new int[0];
        this.field4212 = new int[0];
        this.field4206 = new class62();
        this.field4206.field4003 = 1;
        this.field4200 = new class62();
        this.field4199 = new class232[] { this.field4206, this.field4200 };
        this.field4200.field4003 = 1;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lbc;)V", line = 560)
    public class242(class153 arg0) {
        int var2 = arg0.method1082(-114);
        int var3 = 0;
        int var4 = 0;
        this.field4199 = new class232[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class232 var7 = class22.method150(arg0, 0);
            if (var7.method1633(5829) >= 0) {
                var4++;
            }
            if (var7.method1331(-1) >= 0) {
                var3++;
            }
            int var8 = var7.field3995.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method1082(-98);
            }
            this.field4199[var6] = var7;
        }
        this.field4212 = new int[var4];
        this.field4218 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class232 var13 = this.field4199[var12];
            int var14 = var13.field3995.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3995[var15] = this.field4199[var5[var12][var15]];
            }
            int var16 = var13.method1633(5829);
            int var17 = var13.method1331(-1);
            if (var16 > 0) {
                this.field4212[var11++] = var16;
            }
            if (var17 > 0) {
                this.field4218[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field4206 = this.field4199[arg0.method1082(-113)];
        this.field4200 = this.field4199[arg0.method1082(-98)];
    }
}
