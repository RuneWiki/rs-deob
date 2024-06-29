import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class90 {

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "Z")
    public boolean field1188 = true;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "I")
    private int field1190 = -1;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "Ltfa;")
    private class614 field1191;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "Lji;")
    private class622 field1189;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "Lul;")
    private class439 field1192;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Lur;")
    private class333 field1179;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Lvga;")
    private class239 field1187;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "Lpe;")
    public static class615 field1186;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II[BI)V", line = 13)
    public final void method679(int arg0, int arg1, byte[] arg2, int arg3) {
        this.field1179.method574(arg0, -18622, arg2, this.field1189.method3409(4, arg0) * arg3);
        field1183++;
        this.method683(this.field1179, 98, arg3);
        int var5 = -44 / ((59 - arg1) / 37);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V", line = 24)
    private final void method680(int arg0) {
        field1182++;
        if (!this.field1188) {
            return;
        }
        this.field1188 = false;
        byte[] var2 = this.field1191.field8287;
        if (arg0 != -1) {
            return;
        }
        byte[] var3 = this.field1189.field8720;
        int var4 = 0;
        int var5 = this.field1191.field8295;
        int var6 = this.field1191.field8295 * this.field1184 + this.field1178;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1187 != null && this.field1190 == var4) {
            this.field1188 = false;
            return;
        }
        this.field1190 = var4;
        int var8 = this.field1184 * var5 + this.field1178;
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
            var8 += this.field1191.field8295 - 128;
        }
        if (this.field1187 == null) {
            this.field1187 = new class239(this.field1189, 3553, 6406, 128, 128, false, this.field1189.field8720, 6406, false);
            this.field1187.method1504(false, (byte) 63, false);
            this.field1187.method3905(true, true);
        } else {
            this.field1187.method1512(0, 5065, 0, this.field1189.field8720, false, 128, 0, 6406, 0, 128);
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V", line = 130)
    public final void method681(int arg0) {
        this.method683(this.field1192, -117, this.field1181);
        field1193++;
        if (arg0 != 0) {
            this.method683(null, -108, 58);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIIIIII)V", line = 141)
    public static final void method682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1180++;
        int var8 = arg4 + arg5;
        int var9 = arg3 - arg4;
        for (int var10 = arg5; var10 < var8; var10++) {
            class349.method2008(arg0, (byte) 71, class213.field2746[var10], arg6, arg1);
        }
        int var11 = arg4 + arg6;
        if (arg2 > -34) {
            method684(-110);
        }
        for (int var12 = arg3; var12 > var9; var12--) {
            class349.method2008(arg0, (byte) 94, class213.field2746[var12], arg6, arg1);
        }
        int var13 = arg0 - arg4;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class213.field2746[var14];
            class349.method2008(var11, (byte) 58, var15, arg6, arg1);
            class349.method2008(var13, (byte) 104, var15, var11, arg7);
            class349.method2008(arg0, (byte) 90, var15, var13, arg1);
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lji;Ltfa;Lwo;IIIII)V", line = 194)
    public class90(class622 arg0, class614 arg1, class295 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1184 = arg7;
        this.field1191 = arg1;
        this.field1189 = arg0;
        this.field1178 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1166 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field3853[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1181 = var10;
        if (var10 <= 0) {
            this.field1187 = null;
        } else {
            class418 var14 = new class418(var10 * 2);
            if (this.field1189.field8631) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1166 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field3853[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2386(var18[var19] & 0xFFFF, 1103587288);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1166 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field3853[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2356(var23[var24] & 0xFFFF, -18174);
                            }
                        }
                    }
                }
            }
            this.field1192 = this.field1189.method3470(5123, (byte) -116, false, var14.field5393, var14.field5367);
            this.field1179 = new class333(this.field1189, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lul;II)V", line = 319)
    private final void method683(class439 arg0, int arg1, int arg2) {
        field1185++;
        if (arg2 != 0) {
            this.method680(-1);
            this.field1189.method3388(this.field1187, false);
            int var4 = -100 / ((arg1 + 6) / 45);
            this.field1189.method3464(arg2, 4, arg0, -104, 0);
        }
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V", line = 334)
    public static void method684(int arg0) {
        if (arg0 != 18937) {
            method684(-88);
        }
        field1186 = null;
    }
}
