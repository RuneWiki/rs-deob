import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class276 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "[I")
    private int[] field4736;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    private int[] field4734;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljh;")
    private class262 field4733;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljh;")
    private class262 field4749;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "[Ljh;")
    private class262[] field4741;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lok;")
    public static class146 field4738 = class235.method1724(-12908, "Liste der Welten geladen");

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4744 = 0;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lok;")
    public static class146 field4746 = class235.method1724(-12908, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field4743 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lje;")
    public static class70 field4737;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[Z")
    public static boolean[] field4745;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IDIZLi;IZLoh;)[I", line = 7)
    public final int[] method2007(int arg0, double arg1, int arg2, boolean arg3, class209 arg4, int arg5, boolean arg6, class15 arg7) {
        class293.method2093(arg1, -77);
        class35.field653 = arg7;
        int[] var10 = new int[arg0 * arg2];
        class202.field3370 = arg4;
        class206.method1560(arg2, (byte) -111, arg0);
        for (int var11 = 0; var11 < this.field4741.length; var11++) {
            this.field4741[var11].method1897(arg0, arg2, true);
        }
        field4747++;
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var12 = -1;
            var13 = arg0 - 1;
            var14 = -1;
        } else {
            var12 = arg0;
            var14 = 1;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field4733.field4365) {
                int[] var21 = this.field4733.method38(var16, (byte) -98);
                var18 = var21;
                var20 = var21;
                var19 = var21;
            } else {
                int[][] var17 = this.field4733.method87(7, var16);
                var18 = var17[2];
                var19 = var17[0];
                var20 = var17[1];
            }
            for (int var22 = var13; var22 != var12; var22 += var14) {
                int var23 = var20[var22] >> 4;
                int var24 = var19[var22] >> 4;
                int var25 = var18[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class262.field4366[var23];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class262.field4366[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class262.field4366[var24];
                var10[var15++] = (var26 << 8) + (var28 << 16) + var27;
                if (arg6) {
                    var15 += arg0 - 1;
                }
            }
        }
        if (arg5 != 29466952) {
            this.field4749 = (class262) null;
        }
        for (int var29 = 0; var29 < this.field4741.length; var29++) {
            this.field4741[var29].method630((byte) -114);
        }
        return var10;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILi;DZLoh;II)[B", line = 148)
    public final byte[] method2008(int arg0, class209 arg1, double arg2, boolean arg3, class15 arg4, int arg5, int arg6) {
        class293.method2093(arg2, -112);
        class35.field653 = arg4;
        byte[] var9 = new byte[arg0 * arg6 * 4];
        class202.field3370 = arg1;
        field4735++;
        class206.method1560(arg0, (byte) 40, arg6);
        for (int var10 = 0; var10 < this.field4741.length; var10++) {
            this.field4741[var10].method1897(arg6, arg0, true);
        }
        int var11 = 0;
        for (int var12 = arg5; var12 < arg0; var12++) {
            if (arg3) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field4733.field4365) {
                int[] var17 = this.field4733.method38(var12, (byte) -87);
                var14 = var17;
                var15 = var17;
                var16 = var17;
            } else {
                int[][] var13 = this.field4733.method87(arg5 ^ 0x7, var12);
                var14 = var13[2];
                var15 = var13[0];
                var16 = var13[1];
            }
            int[] var18;
            if (this.field4749.field4365) {
                var18 = this.field4749.method38(var12, (byte) -88);
            } else {
                var18 = this.field4749.method87(7, var12)[0];
            }
            for (int var19 = arg6 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = var16[var19] >> 4;
                int var23 = class262.field4366[var20];
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var24 = class262.field4366[var22];
                int var25 = class262.field4366[var21];
                int var26;
                if (var23 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg3) {
                    var11 += (arg6 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field4741.length; var27++) {
            this.field4741[var27].method630((byte) -118);
        }
        return var9;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 297)
    public static void method2009(int arg0) {
        field4746 = null;
        field4738 = null;
        field4737 = null;
        if (arg0 < 110) {
            method2012(127, (byte[]) null);
        }
        field4745 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V", line = 317)
    public static final void method2010(int arg0, int arg1, int arg2) {
        field4739++;
        class79 var3 = class150.method1186(arg1, 94);
        int var4 = var3.field1260;
        int var5 = var3.field1262;
        int var6 = var3.field1261;
        int var7 = client.field4069[var5 - var6];
        if (arg0 != -18084) {
            return;
        }
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var6;
        class168.method1301((byte) -32, var4, ~var8 & class75.field1221[var4] | var8 & arg2 << var6);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Loh;Li;I)Z", line = 345)
    public final boolean method2011(class15 arg0, class209 arg1, int arg2) {
        field4748++;
        if (class239.field3983 > 0) {
            for (int var4 = 0; var4 < this.field4736.length; var4++) {
                if (!arg0.method93(this.field4736[var4], class239.field3983, false)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4736.length; var5++) {
                if (!arg0.method117(-32236, this.field4736[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4734.length; var6++) {
            if (!arg1.method823(255, this.field4734[var6])) {
                return false;
            }
        }
        if (arg2 != -7857) {
            field4745 = (boolean[]) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[B)[B", line = 428)
    public static final byte[] method2012(int arg0, byte[] arg1) {
        field4740++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 1884298340) {
            field4745 = (boolean[]) null;
        }
        byte[] var2 = new byte[arg1.length];
        class244.method1768(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 444)
    public class276() {
        this.field4736 = new int[0];
        this.field4734 = new int[0];
        this.field4733 = new class168();
        this.field4733.field4356 = 1;
        this.field4749 = new class168();
        this.field4741 = new class262[] { this.field4733, this.field4749 };
        this.field4749.field4356 = 1;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lwe;)V", line = 457)
    public class276(class47 arg0) {
        int var2 = arg0.method368(38);
        int var3 = 0;
        this.field4741 = new class262[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class262 var7 = class158.method1241(arg0, 122);
            if (var7.method626(1) >= 0) {
                var3++;
            }
            if (var7.method1891(101) >= 0) {
                var5++;
            }
            int var8 = var7.field4351.length;
            var4[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var4[var6][var9] = arg0.method368(-109);
            }
            this.field4741[var6] = var7;
        }
        this.field4736 = new int[var3];
        this.field4734 = new int[var5];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class262 var13 = this.field4741[var12];
            int var14 = var13.field4351.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4351[var15] = this.field4741[var4[var12][var15]];
            }
            int var16 = var13.method626(1);
            int var17 = var13.method1891(102);
            if (var16 > 0) {
                this.field4736[var11++] = var16;
            }
            if (var17 > 0) {
                this.field4734[var10++] = var17;
            }
            var4[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field4733 = this.field4741[arg0.method368(92)];
        this.field4749 = this.field4741[arg0.method368(-126)];
    }
}
