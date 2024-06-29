import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class87 extends class403 {

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "[I")
    private int[] field1211;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "[I")
    private int[] field1214;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "Ljq;")
    private class326 field1206;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Ljq;")
    private class326 field1213;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "Ljq;")
    private class326 field1205;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "[Ljq;")
    private class326[] field1208;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Lhu;")
    public static class76 field1212 = new class76(4);

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field1216 = -1;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "Lgd;")
    public static class206 field1217 = new class206("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "Lr;")
    public static class110 field1219;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "[Ljd;")
    public static class139[] field1218;

    static {
        new class206("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZLr;Lci;ZII)[F", line = 10)
    public final float[] method552(boolean arg0, class110 arg1, class287 arg2, boolean arg3, int arg4, int arg5) {
        field1204++;
        class462.field6255 = arg1;
        class220.field2939 = arg2;
        for (int var7 = 0; var7 < this.field1208.length; var7++) {
            this.field1208[var7].method115(arg4, arg5, (byte) -118);
        }
        class422.method2501(arg5, arg4, (byte) 87);
        float[] var8 = new float[arg4 * 4 * arg5];
        if (arg0) {
            this.method556((class287) null, (class110) null, 1.2356981547570638D, -49, true, -41, -77);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1213.field4358) {
                int[] var16 = this.field1213.method30((byte) -68, var10);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field1213.method48(var10, (byte) -120);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field1205.field4358) {
                var17 = this.field1205.method30((byte) -118, var10);
            } else {
                var17 = this.field1205.method48(var10, (byte) -113)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field1206.field4358) {
                var18 = this.field1206.method30((byte) -20, var10);
            } else {
                var18 = this.field1206.method48(var10, (byte) -90)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1208.length; var11++) {
            this.field1208[var11].method117(3);
        }
        return var8;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILci;Lr;)Z", line = 127)
    public final boolean method553(int arg0, class287 arg1, class110 arg2) {
        field1209++;
        if (class40.field578 >= 0) {
            for (int var4 = 0; var4 < this.field1214.length; var4++) {
                if (!arg2.method701(this.field1214[var4], 13047, class40.field578)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1214.length; var5++) {
                if (!arg2.method700((byte) 125, this.field1214[var5])) {
                    return false;
                }
            }
        }
        if (arg0 != 8012) {
            return true;
        }
        for (int var6 = 0; var6 < this.field1211.length; var6++) {
            if (!arg1.method1620(-3810, this.field1211[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZDIILr;ZILci;)[I", line = 186)
    public final int[] method554(boolean arg0, double arg1, int arg2, int arg3, class110 arg4, boolean arg5, int arg6, class287 arg7) {
        class462.field6255 = arg4;
        field1210++;
        class220.field2939 = arg7;
        int var10 = -22 / ((20 - arg6) / 49);
        for (int var11 = 0; var11 < this.field1208.length; var11++) {
            this.field1208[var11].method115(arg3, arg2, (byte) -107);
        }
        class268.method1524(arg1, -66);
        class422.method2501(arg2, arg3, (byte) 8);
        int[] var12 = new int[arg2 * arg3];
        int var13;
        int var14;
        byte var15;
        if (arg5) {
            var13 = arg2 - 1;
            var14 = -1;
            var15 = -1;
        } else {
            var13 = 0;
            var14 = arg2;
            var15 = 1;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg3; var17++) {
            if (arg0) {
                var16 = var17;
            }
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field1213.field4358) {
                int[] var19 = this.field1213.method30((byte) -32, var17);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field1213.method48(var17, (byte) -80);
                var20 = var23[0];
                var21 = var23[1];
                var22 = var23[2];
            }
            for (int var24 = var13; var24 != var14; var24 += var15) {
                int var25 = var20[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var22[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class106.field1581[var26];
                int var29 = class106.field1581[var25];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var30 = class106.field1581[var27];
                int var31 = (var28 << 8) + (var29 << 16) + var30;
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var12[var16++] = var31;
                if (arg0) {
                    var16 += arg2 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field1208.length; var18++) {
            this.field1208[var18].method117(3);
        }
        return var12;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 330)
    public class87() {
        this.field1211 = new int[0];
        this.field1214 = new int[0];
        this.field1206 = new class150(0);
        this.field1206.field4352 = 1;
        this.field1213 = new class150();
        this.field1213.field4352 = 1;
        this.field1205 = new class150();
        this.field1208 = new class326[] { this.field1213, this.field1205, this.field1206 };
        this.field1205.field4352 = 1;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 346)
    public static void method555(int arg0) {
        field1217 = null;
        field1219 = null;
        field1212 = null;
        field1218 = null;
        if (arg0 != 26380) {
            method555(126);
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lbt;)V", line = 358)
    public class87(class32 arg0) {
        int var2 = arg0.method201((byte) -112);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1208 = new class326[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class326 var16 = class14.method95(arg0, 0);
            if (var16.method1788(-1) >= 0) {
                var3++;
            }
            if (var16.method116(true) >= 0) {
                var4++;
            }
            int var17 = var16.field4340.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method201((byte) -125);
            }
            this.field1208[var6] = var16;
        }
        this.field1214 = new int[var3];
        this.field1211 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class326 var11 = this.field1208[var9];
            int var12 = var11.field4340.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4340[var13] = this.field1208[var5[var9][var13]];
            }
            int var14 = var11.method1788(-1);
            int var15 = var11.method116(true);
            if (var14 > 0) {
                this.field1214[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1211[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1213 = this.field1208[arg0.method201((byte) -120)];
        this.field1205 = this.field1208[arg0.method201((byte) -125)];
        Object var10 = null;
        this.field1206 = this.field1208[arg0.method201((byte) -105)];
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lci;Lr;DIZII)[I", line = 448)
    public final int[] method556(class287 arg0, class110 arg1, double arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1207++;
        class462.field6255 = arg1;
        class220.field2939 = arg0;
        for (int var9 = 0; var9 < this.field1208.length; var9++) {
            this.field1208[var9].method115(arg6, arg5, (byte) -107);
        }
        class268.method1524(arg2, -68);
        class422.method2501(arg5, arg6, (byte) -104);
        int[] var10 = new int[arg6 * 4 * arg5];
        int var11 = 0;
        if (arg3 != 1034273904) {
            field1212 = null;
        }
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1213.field4358) {
                int[] var14 = this.field1213.method30((byte) -78, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1213.method48(var12, (byte) -127);
                var15 = var18[0];
                var16 = var18[1];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field1205.field4358) {
                var19 = this.field1205.method30((byte) -55, var12);
            } else {
                var19 = this.field1205.method48(var12, (byte) -105)[0];
            }
            if (arg4) {
                var11 = var12;
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class106.field1581[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class106.field1581[var22];
                int var26 = class106.field1581[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
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
                var10[var11++] = (var24 << 16) + (var27 << 24) + (var25 << 8) + var26;
                if (arg4) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1208.length; var13++) {
            this.field1208[var13].method117(3);
        }
        return var10;
    }
}
