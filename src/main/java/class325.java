import java.awt.Frame;
import java.util.Random;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class325 extends class59 {

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "[B")
    private byte[] field5547 = new byte[512];

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    private int field5548 = 2;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    private int field5553 = 2048;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    private int field5559 = 5;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    private int field5557 = 0;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
    private int field5568 = 5;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    private int field5556 = 1;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "[S")
    private short[] field5567 = new short[512];

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "Lph;")
    private static class229 field5564 = class266.method1858("Created gameworld", 0);

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "Lph;")
    public static class229 field5566 = class266.method1858(" )2> <col=ff9040>", 0);

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "Lph;")
    public static class229 field5555 = field5564;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "Lmf;")
    public static class31 field5552;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "Ljava/awt/Frame;")
    public static Frame field5569;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BILhb;)V", line = 7)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 != 115) {
            return;
        }
        if (arg1 == 0) {
            this.field5559 = this.field5568 = arg2.method1178(arg0 - 107);
        } else if (arg1 == 1) {
            this.field5557 = arg2.method1178(8);
        } else if (arg1 == 2) {
            this.field5553 = arg2.method1161(true);
        } else if (arg1 == 3) {
            this.field5548 = arg2.method1178(8);
        } else if (arg1 == 4) {
            this.field5556 = arg2.method1178(8);
        } else if (arg1 == 5) {
            this.field5559 = arg2.method1178(8);
        } else if (arg1 == 6) {
            this.field5568 = arg2.method1178(arg0 ^ 0x7B);
        }
        field5551++;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V", line = 83)
    public final void method65(int arg0) {
        field5550++;
        this.field5547 = class273.method1889((byte) 96, this.field5557);
        if (arg0 <= 110) {
            this.field5547 = (byte[]) null;
        }
        this.method2229((byte) -82);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 98)
    public static final void method2225(byte arg0) {
        field5562++;
        class12.field169.method1414(85);
        class234.field3856.method1414(108);
        if (arg0 < -51) {
            class312.field5238.method1414(120);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 594)
    public class325() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "(I)V", line = 115)
    public static void method2226(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field5555 = null;
        field5564 = null;
        field5566 = null;
        field5552 = null;
        field5569 = null;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V", line = 131)
    public static final void method2227(byte arg0) {
        int var1 = 0;
        if (arg0 != -99) {
            return;
        }
        while (var1 < class253.field4233) {
            int var2 = class162.field2620[var1];
            class217 var3 = class187.field3035[var2];
            if (var3 != null) {
                class88.method657(-109, var3, var3.field3559.field5304);
            }
            var1++;
        }
        field5560++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[IIIIII)I", line = 159)
    public static final int method2228(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5565++;
        int var6 = (128 - arg3) * arg0[arg2][arg4] + (arg0[arg2 + 1][arg4] * arg3) >> 7;
        int var7 = (128 - arg3) * arg0[arg2][arg4 - arg5] + arg0[arg2 + 1][arg4 + 1] * arg3 >> 7;
        return (128 - arg1) * var6 + arg1 * var7 >> 7;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V", line = 173)
    private final void method2229(byte arg0) {
        field5561++;
        Random var2 = new Random((long) this.field5557);
        this.field5567 = new short[512];
        if (arg0 != -82) {
            this.field5567 = (short[]) null;
        }
        if (this.field5553 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field5567[var3] = (short) class113.method861(this.field5553, (byte) -24, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[[[BIBII)V", line = 212)
    public static final void method2230(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class271.field4536++;
        class193.field3190 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class80.field1326; var12 < class206.field3397; var12++) {
            class72[][] var13 = class225.field3705[var12];
            for (int var14 = class70.field1182; var14 < class141.field2274; var14++) {
                for (int var15 = class328.field5589; var15 < class324.field5543; var15++) {
                    class72 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class119.field2000[var14 + class202.field3339 - class254.field4249][var15 + class202.field3339 - class102.field1745] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field1217 = true;
                            var16.field1222 = true;
                            if (var16.field1211 > 0) {
                                var16.field1219 = true;
                            } else {
                                var16.field1219 = false;
                            }
                            class193.field3190++;
                        } else {
                            var16.field1217 = false;
                            var16.field1222 = false;
                            var16.field1236 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1224 != null) {
                                    class207 var17 = var16.field1224;
                                    var17.field3416.method183(0, var12, var17.field3413, var17.field3415, var17.field3411);
                                    if (var17.field3403 != null) {
                                        var17.field3403.method183(0, var12, var17.field3413, var17.field3415, var17.field3411);
                                    }
                                }
                                if (var16.field1214 != null) {
                                    class88 var18 = var16.field1214;
                                    var18.field1494.method183(var18.field1496, var12, var18.field1488, var18.field1501, var18.field1482);
                                    if (var18.field1489 != null) {
                                        var18.field1489.method183(var18.field1496, var12, var18.field1488, var18.field1501, var18.field1482);
                                    }
                                }
                                if (var16.field1225 != null) {
                                    class162 var19 = var16.field1225;
                                    var19.field2607.method183(0, var12, var19.field2608, var19.field2611, var19.field2613);
                                }
                                if (var16.field1216 != null) {
                                    for (int var20 = 0; var20 < var16.field1211; var20++) {
                                        class152 var21 = var16.field1216[var20];
                                        var21.field2461.method183(var21.field2470, var12, var21.field2471, var21.field2462, var21.field2475);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class203.field3346 == class192.field3174;
        if (class99.field1675) {
            GL var23 = class99.field1682;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class95.method704();
                class285.method1964(118, 3, -1);
                class33.field547 = true;
                class64.method482();
                class39.field624 = -1;
                class303.field5065 = -1;
                for (int var24 = 0; var24 < class215.field3544[0].length; var24++) {
                    class264 var25 = class215.field3544[0][var24];
                    float var26 = 251.5F - (var25.field4406 ? 1.0F : 0.5F);
                    if (class39.field624 != var25.field4427) {
                        class39.field624 = var25.field4427;
                        class332.method2270(var25.field4427, -53);
                        class117.method885(class63.method454(941338512));
                    }
                    var25.method1835(class225.field3705, var26, false);
                }
                class64.method484();
            } else {
                int var27 = class80.field1326;
                while (true) {
                    if (var27 >= class206.field3397) {
                        class62.method422(class254.field4249, class102.field1745, class225.field3705);
                        break;
                    }
                    for (int var28 = 0; var28 < class215.field3544[var27].length; var28++) {
                        class264 var29 = class215.field3544[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field4406 ? 1.0F : 0.5F);
                        if (var29.field4421 != -1 && class310.field5207.method90(-80, var29.field4421) == 4 && class281.field4661) {
                            class332.method2270(var29.field4427, 108);
                        }
                        var29.method1835(class225.field3705, var30, false);
                    }
                    if (var27 == 0 && class157.field2559 > 0) {
                        class99.method741(101.5F);
                        class137.method986(class254.field4249, class102.field1745, class202.field3339, arg1, class119.field2000, class192.field3174[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class80.field1326; var31 < class206.field3397; var31++) {
            class72[][] var32 = class225.field3705[var31];
            for (int var33 = -class202.field3339; var33 <= 0; var33++) {
                int var34 = class254.field4249 + var33;
                int var35 = class254.field4249 - var33;
                if (var34 >= class70.field1182 || var35 < class141.field2274) {
                    for (int var36 = -class202.field3339; var36 <= 0; var36++) {
                        int var37 = class102.field1745 + var36;
                        int var38 = class102.field1745 - var36;
                        if (var34 >= class70.field1182) {
                            if (var37 >= class328.field5589) {
                                class72 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1217) {
                                    class314.method2132(var39, true);
                                }
                            }
                            if (var38 < class324.field5543) {
                                class72 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1217) {
                                    class314.method2132(var40, true);
                                }
                            }
                        }
                        if (var35 < class141.field2274) {
                            if (var37 >= class328.field5589) {
                                class72 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1217) {
                                    class314.method2132(var41, true);
                                }
                            }
                            if (var38 < class324.field5543) {
                                class72 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1217) {
                                    class314.method2132(var42, true);
                                }
                            }
                        }
                        if (class193.field3190 == 0) {
                            if (!var22) {
                                class198.field3304 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class80.field1326; var43 < class206.field3397; var43++) {
            class72[][] var44 = class225.field3705[var43];
            for (int var45 = -class202.field3339; var45 <= 0; var45++) {
                int var46 = class254.field4249 + var45;
                int var47 = class254.field4249 - var45;
                if (var46 >= class70.field1182 || var47 < class141.field2274) {
                    for (int var48 = -class202.field3339; var48 <= 0; var48++) {
                        int var49 = class102.field1745 + var48;
                        int var50 = class102.field1745 - var48;
                        if (var46 >= class70.field1182) {
                            if (var49 >= class328.field5589) {
                                class72 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1217) {
                                    class314.method2132(var51, false);
                                }
                            }
                            if (var50 < class324.field5543) {
                                class72 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1217) {
                                    class314.method2132(var52, false);
                                }
                            }
                        }
                        if (var47 < class141.field2274) {
                            if (var49 >= class328.field5589) {
                                class72 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1217) {
                                    class314.method2132(var53, false);
                                }
                            }
                            if (var50 < class324.field5543) {
                                class72 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1217) {
                                    class314.method2132(var54, false);
                                }
                            }
                        }
                        if (class193.field3190 == 0) {
                            if (!var22) {
                                class198.field3304 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class198.field3304 = false;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 584)
    public static final void method2231(boolean arg0) {
        class265.field4460.method1414(84);
        field5558++;
        if (!arg0) {
            method2225((byte) -52);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)[I", line = 611)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            this.method63(false, -104);
        }
        field5554++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int var4 = class269.field4504[arg1] * this.field5568 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class293.field4789; var7++) {
                class84.field1450 = Integer.MAX_VALUE;
                class162.field2616 = Integer.MAX_VALUE;
                class259.field4332 = Integer.MAX_VALUE;
                class138.field2228 = Integer.MAX_VALUE;
                int var8 = class219.field3608[var7] * this.field5559 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field5547[(var11 >= this.field5568 ? var11 - this.field5568 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field5547[var12 + (var13 < this.field5559 ? var13 : var13 - this.field5559) & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field5567[var14];
                        int var16 = var4 - ((var11 << 12) + this.field5567[var27]);
                        int var17 = this.field5556;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var19 = var15 < 0 ? -var15 : var15;
                            int var20 = var16 >= 0 ? var16 : -var16;
                            var18 = var19 <= var20 ? var20 : var19;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var15 * var15;
                            int var25 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 >= 0 ? var16 : -var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class138.field2228) {
                            class84.field1450 = class162.field2616;
                            class162.field2616 = class259.field4332;
                            class259.field4332 = class138.field2228;
                            class138.field2228 = var18;
                        } else if (class259.field4332 > var18) {
                            class84.field1450 = class162.field2616;
                            class162.field2616 = class259.field4332;
                            class259.field4332 = var18;
                        } else if (class162.field2616 > var18) {
                            class84.field1450 = class162.field2616;
                            class162.field2616 = var18;
                        } else if (var18 < class84.field1450) {
                            class84.field1450 = var18;
                        }
                    }
                }
                int var26 = this.field5548;
                if (var26 == 0) {
                    var3[var7] = class138.field2228;
                } else if (var26 == 1) {
                    var3[var7] = class259.field4332;
                } else if (var26 == 3) {
                    var3[var7] = class162.field2616;
                } else if (var26 == 4) {
                    var3[var7] = class84.field1450;
                } else if (var26 == 2) {
                    var3[var7] = class259.field4332 - class138.field2228;
                }
            }
        }
        return var3;
    }
}
