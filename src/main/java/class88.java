import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class88 extends class285 {

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    private int field1212 = 1024;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    private int field1215 = 3072;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    private int field1217 = 2048;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field1218 = -1;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBILak;)Lek;", line = 8)
    public static final class220 method599(int arg0, byte arg1, int arg2, class172 arg3) {
        field1216++;
        if (class55.method353(arg3, arg2, (byte) -5, arg0)) {
            return arg1 > -68 ? (class220) null : class229.method1624(-83);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 90)
    public class88() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLjj;I)V", line = 38)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field1213++;
        if (!arg0) {
            field1222 = 80;
        }
        if (arg2 == 0) {
            this.field1212 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field1215 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field4572 = arg1.method286((byte) -116) == 1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V", line = 80)
    public final void method361(int arg0) {
        field1220++;
        int var2 = 78 / ((arg0 - 42) / 36);
        this.field1217 = this.field1215 - this.field1212;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I", line = 101)
    public final int[][] method62(byte arg0, int arg1) {
        if (arg0 <= 121) {
            method600(-87, 122, 25, (byte[][][]) ((byte[][][]) null), 31, (byte) 9, -125, -79);
        }
        field1219++;
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[][] var4 = this.method2053((byte) -54, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class287.field4599; var11++) {
                var8[var11] = this.field1212 + (var5[var11] * this.field1217 >> 12);
                var9[var11] = (var6[var11] * this.field1217 >> 12) + this.field1212;
                var10[var11] = (var7[var11] * this.field1217 >> 12) + this.field1212;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[I", line = 147)
    public final int[] method60(boolean arg0, int arg1) {
        int[] var3 = this.field4573.method1116(115, arg1);
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 124, arg1);
            for (int var5 = 0; var5 < class287.field4599; var5++) {
                var3[var5] = (var4[var5] * this.field1217 >> 12) + this.field1212;
            }
        }
        field1214++;
        if (!arg0) {
            this.field1215 = -67;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[[BIBII)V", line = 181)
    public static final void method600(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class146.field2275++;
        class261.field4164 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class236.field3784; var12 < class205.field3373; var12++) {
            class204[][] var13 = class324.field5032[var12];
            for (int var14 = class85.field1186; var14 < class197.field3207; var14++) {
                for (int var15 = class180.field2983; var15 < class113.field1720; var15++) {
                    class204 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class213.field3485[var14 + class116.field1765 - class224.field3578][var15 + class116.field1765 - class177.field2951] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3352 = true;
                            var16.field3365 = true;
                            if (var16.field3360 > 0) {
                                var16.field3339 = true;
                            } else {
                                var16.field3339 = false;
                            }
                            class261.field4164++;
                        } else {
                            var16.field3352 = false;
                            var16.field3365 = false;
                            var16.field3345 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3364 != null) {
                                    class225 var17 = var16.field3364;
                                    var17.field3599.method39(0, var12, var17.field3605, var17.field3593, var17.field3596);
                                    if (var17.field3594 != null) {
                                        var17.field3594.method39(0, var12, var17.field3605, var17.field3593, var17.field3596);
                                    }
                                }
                                if (var16.field3342 != null) {
                                    class38 var18 = var16.field3342;
                                    var18.field485.method39(var18.field490, var12, var18.field486, var18.field491, var18.field483);
                                    if (var18.field494 != null) {
                                        var18.field494.method39(var18.field490, var12, var18.field486, var18.field491, var18.field483);
                                    }
                                }
                                if (var16.field3347 != null) {
                                    class113 var19 = var16.field3347;
                                    var19.field1728.method39(0, var12, var19.field1724, var19.field1730, var19.field1733);
                                }
                                if (var16.field3343 != null) {
                                    for (int var20 = 0; var20 < var16.field3360; var20++) {
                                        class153 var21 = var16.field3343[var20];
                                        var21.field2373.method39(var21.field2369, var12, var21.field2372, var21.field2368, var21.field2359);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class189.field3099 == class110.field1642;
        if (class232.field3690) {
            GL var23 = class232.field3716;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class333.method2329();
                class179.method1343(3, -1, -3);
                class219.field3542 = true;
                class12.method67();
                class115.field1745 = -1;
                class131.field2077 = -1;
                for (int var24 = 0; var24 < class281.field4530[0].length; var24++) {
                    class206 var25 = class281.field4530[0][var24];
                    float var26 = 251.5F - (var25.field3405 ? 1.0F : 0.5F);
                    if (class115.field1745 != var25.field3392) {
                        class115.field1745 = var25.field3392;
                        class212.method1532(var25.field3392, 2);
                        class87.method596(class208.method1508((byte) -116));
                    }
                    var25.method1499(class324.field5032, var26, false);
                }
                class12.method70();
            } else {
                int var27 = class236.field3784;
                while (true) {
                    if (var27 >= class205.field3373) {
                        class118.method826(class224.field3578, class177.field2951, class324.field5032);
                        break;
                    }
                    for (int var28 = 0; var28 < class281.field4530[var27].length; var28++) {
                        class206 var29 = class281.field4530[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3405 ? 1.0F : 0.5F);
                        if (var29.field3379 != -1 && class189.method1402(class170.field2814.method944(var29.field3379, true), 4) && class245.field3872) {
                            class212.method1532(var29.field3392, 2);
                        }
                        var29.method1499(class324.field5032, var30, false);
                    }
                    if (var27 == 0 && class18.field250 > 0) {
                        class232.method1682(101.5F);
                        class241.method1741(class224.field3578, class177.field2951, class116.field1765, arg1, class213.field3485, class110.field1642[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class236.field3784; var31 < class205.field3373; var31++) {
            class204[][] var32 = class324.field5032[var31];
            for (int var33 = -class116.field1765; var33 <= 0; var33++) {
                int var34 = class224.field3578 + var33;
                int var35 = class224.field3578 - var33;
                if (var34 >= class85.field1186 || var35 < class197.field3207) {
                    for (int var36 = -class116.field1765; var36 <= 0; var36++) {
                        int var37 = class177.field2951 + var36;
                        int var38 = class177.field2951 - var36;
                        if (var34 >= class85.field1186) {
                            if (var37 >= class180.field2983) {
                                class204 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3352) {
                                    class50.method331(var39, true);
                                }
                            }
                            if (var38 < class113.field1720) {
                                class204 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3352) {
                                    class50.method331(var40, true);
                                }
                            }
                        }
                        if (var35 < class197.field3207) {
                            if (var37 >= class180.field2983) {
                                class204 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3352) {
                                    class50.method331(var41, true);
                                }
                            }
                            if (var38 < class113.field1720) {
                                class204 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3352) {
                                    class50.method331(var42, true);
                                }
                            }
                        }
                        if (class261.field4164 == 0) {
                            if (!var22) {
                                class116.field1768 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class236.field3784; var43 < class205.field3373; var43++) {
            class204[][] var44 = class324.field5032[var43];
            for (int var45 = -class116.field1765; var45 <= 0; var45++) {
                int var46 = class224.field3578 + var45;
                int var47 = class224.field3578 - var45;
                if (var46 >= class85.field1186 || var47 < class197.field3207) {
                    for (int var48 = -class116.field1765; var48 <= 0; var48++) {
                        int var49 = class177.field2951 + var48;
                        int var50 = class177.field2951 - var48;
                        if (var46 >= class85.field1186) {
                            if (var49 >= class180.field2983) {
                                class204 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3352) {
                                    class50.method331(var51, false);
                                }
                            }
                            if (var50 < class113.field1720) {
                                class204 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3352) {
                                    class50.method331(var52, false);
                                }
                            }
                        }
                        if (var47 < class197.field3207) {
                            if (var49 >= class180.field2983) {
                                class204 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3352) {
                                    class50.method331(var53, false);
                                }
                            }
                            if (var50 < class113.field1720) {
                                class204 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3352) {
                                    class50.method331(var54, false);
                                }
                            }
                        }
                        if (class261.field4164 == 0) {
                            if (!var22) {
                                class116.field1768 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class116.field1768 = false;
    }
}
