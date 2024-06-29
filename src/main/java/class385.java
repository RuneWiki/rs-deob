import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class385 {

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    private int field5239 = -1;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Z")
    public boolean field5241 = true;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "Lts;")
    private class371 field5234;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    private int field5245;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lbo;")
    private class511 field5230;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    private int field5238;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    private int field5244;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lwr;")
    private class316 field5240;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Lgb;")
    private class142 field5233;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Lhl;")
    private class366 field5228;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field5243 = -1;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "[I")
    public static int[] field5247;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "Lql;")
    public static class515 field5232;

    static {
        new class304("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field5247 = new int[2048];
        field5246 = 1339;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([BIII)V", line = 3)
    public final void method2275(byte[] arg0, int arg1, int arg2, int arg3) {
        this.field5228.method996(arg0, -30832, arg2 * this.field5230.method2964((byte) 108, arg1), arg1);
        field5235++;
        if (arg3 < -73) {
            this.method2278(arg2, this.field5228, true);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 19)
    public final void method2276(byte arg0) {
        if (arg0 != 0) {
            method2282((byte) -19);
        }
        this.method2278(this.field5244, this.field5233, true);
        field5237++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)[Lok;", line = 30)
    public static final class166[] method2277(int arg0) {
        if (arg0 == 128) {
            field5229++;
            return new class166[] { class389.field5276, class526.field7783, class339.field4422, class29.field489, class191.field2684, class209.field2864, class165.field2407, class280.field3685, class392.field5310, class201.field2787, class199.field2757, class250.field3317, class91.field1378, class92.field1398, class466.field6428 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILgb;Z)V", line = 48)
    private final void method2278(int arg0, class142 arg1, boolean arg2) {
        field5236++;
        if (arg0 == 0) {
            return;
        }
        this.method2279((byte) -68);
        if (!arg2) {
            this.field5234 = null;
        }
        this.field5230.method2980(this.field5240, 119);
        this.field5230.method2971(0, arg0, arg1, 7629, 4);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V", line = 72)
    private final void method2279(byte arg0) {
        field5227++;
        if (!this.field5241) {
            return;
        }
        this.field5241 = false;
        byte[] var2 = this.field5234.field4993;
        byte[] var3 = class156.field2281;
        int var4 = 0;
        int var5 = this.field5234.field5007;
        int var6 = this.field5234.field5007 * this.field5245 + this.field5238;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field5240 != null && this.field5239 == var4) {
            this.field5241 = false;
            return;
        }
        if (arg0 != -68) {
            this.field5244 = -4;
        }
        this.field5239 = var4;
        int var8 = this.field5238 + (this.field5245 * var5);
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field5234.field5007 - 128;
        }
        if (this.field5240 == null) {
            this.field5240 = new class316(this.field5230, 3553, 6406, 128, 128, false, class156.field2281, 6406, false);
            this.field5240.method1831(true, false, false);
            this.field5240.method2866(10241, true);
        } else {
            this.field5240.method1832(0, false, (byte) -72, class156.field2281, 0, 128, 128, 6406, 0, 0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 180)
    public static void method2280(int arg0) {
        field5247 = null;
        int var1 = 91 % ((arg0 + 60) / 49);
        field5232 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lbo;Lts;Lui;IIIII)V", line = 350)
    public class385(class511 arg0, class371 arg1, class151 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5234 = arg1;
        this.field5245 = arg7;
        this.field5230 = arg0;
        this.field5238 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field557 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field2152[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field5244 = var10;
        if (var10 <= 0) {
            this.field5240 = null;
        } else {
            class379 var14 = new class379(var10 * 2);
            if (this.field5230.field7493) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field557 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field2152[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2246(var23[var24] & 0xFFFF, (byte) -81);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field557 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field2152[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2215(var18[var19] & 0xFFFF, (byte) 112);
                            }
                        }
                    }
                }
            }
            this.field5233 = this.field5230.method2957(true, var14.field5152, var14.field5173, 5123, false);
            this.field5228 = new class366(this.field5230, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([ILql;[IZ[I)V", line = 199)
    public static final void method2281(int[] arg0, class515 arg1, int[] arg2, boolean arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg1.field6237.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field6237[var9] = null;
                    } else {
                        class5 var10 = class423.field5791.method1601(var6, (byte) -120);
                        int var11 = var10.field126;
                        class250 var12 = arg1.field6237[var9];
                        if (var12 != null) {
                            if (var12.field3326 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field6237[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3318 = var8;
                                    var12.field3315 = 0;
                                    var12.field3320 = 0;
                                    var12.field3319 = 1;
                                    var12.field3316 = 0;
                                    class291.method1711(var10, 0, arg1.field574, -101, arg1.field573, arg1.field584, field5232 == arg1);
                                } else if (var11 == 2) {
                                    var12.field3316 = 0;
                                }
                            } else if (var10.field135 >= class423.field5791.method1601(var12.field3326, (byte) -126).field135) {
                                var12 = arg1.field6237[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class250 var13 = arg1.field6237[var9] = new class250();
                            var13.field3316 = 0;
                            var13.field3315 = 0;
                            var13.field3319 = 1;
                            var13.field3326 = var6;
                            var13.field3318 = var8;
                            var13.field3320 = 0;
                            class291.method1711(var10, 0, arg1.field574, -7, arg1.field573, arg1.field584, field5232 == arg1);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        if (arg3) {
            field5232 = null;
        }
        field5242++;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V", line = 294)
    public static final void method2282(byte arg0) {
        field5231++;
        for (class39 var1 = (class39) class415.field5733.method1672((byte) -108); var1 != null; var1 = (class39) class415.field5733.method1668(-1)) {
            if (class355.method2080(-47, var1.field590)) {
                class152.method1037(var1, 91);
            }
        }
        if (arg0 != 55) {
            field5232 = null;
        }
        if (class412.field5693 == 1) {
            class379.field5189 = false;
            class366.method2134(arg0 - 55, class232.field3126, class381.field5207, class462.field6398, class522.field7714);
            return;
        }
        class366.method2134(0, class232.field3126, class381.field5207, class462.field6398, class522.field7714);
        int var2 = class173.field2525.method2455((byte) 115, class388.field5275.method1764(class489.field6789, false));
        for (class39 var3 = (class39) class415.field5733.method1672((byte) -125); var3 != null; var3 = (class39) class415.field5733.method1668(-1)) {
            int var4 = class48.method354(var3, arg0 ^ 0x47);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class522.field7714 = class412.field5693 * 16 + (class206.field2843 ? 26 : 22);
        class381.field5207 = var2 + 8;
    }
}
