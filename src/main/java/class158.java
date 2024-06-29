import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class158 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2784 = 128;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    private int field2785 = 0;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    private int field2794 = 0;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2793 = -1;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field2796 = 0;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    private int field2797 = 128;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
    public boolean field2802 = false;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
    public boolean field2803 = false;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lcg;")
    public static class49 field2795;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Lcg;")
    public static class49 field2801;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient;")
    public static client field2789;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[S")
    private short[] field2790;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[S")
    private short[] field2798;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "[S")
    private short[] field2804;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "[S")
    private short[] field2806;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III[[[BIBII)V", line = 7)
    public static final void method1262(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class322.field5115++;
        class348.field5539 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class242.field3947; var12 < class42.field622; var12++) {
            class257[][] var13 = class279.field4430[var12];
            for (int var14 = class215.field3617; var14 < class202.field3444; var14++) {
                for (int var15 = class332.field5292; var15 < class304.field4813; var15++) {
                    class257 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class112.field1878[var14 + class259.field4197 - class51.field788][var15 + class259.field4197 - class238.field3905] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field4143 = true;
                            var16.field4161 = true;
                            if (var16.field4150 > 0) {
                                var16.field4154 = true;
                            } else {
                                var16.field4154 = false;
                            }
                            class348.field5539++;
                        } else {
                            var16.field4143 = false;
                            var16.field4161 = false;
                            var16.field4157 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field4146 != null) {
                                    class297 var17 = var16.field4146;
                                    var17.field4741.method97(0, var12, var17.field4742, var17.field4735, var17.field4743);
                                    if (var17.field4744 != null) {
                                        var17.field4744.method97(0, var12, var17.field4742, var17.field4735, var17.field4743);
                                    }
                                }
                                if (var16.field4152 != null) {
                                    class44 var18 = var16.field4152;
                                    var18.field700.method97(var18.field697, var12, var18.field695, var18.field692, var18.field702);
                                    if (var18.field694 != null) {
                                        var18.field694.method97(var18.field697, var12, var18.field695, var18.field692, var18.field702);
                                    }
                                }
                                if (var16.field4140 != null) {
                                    class330 var19 = var16.field4140;
                                    var19.field5257.method97(0, var12, var19.field5254, var19.field5259, var19.field5262);
                                }
                                if (var16.field4147 != null) {
                                    for (int var20 = 0; var20 < var16.field4150; var20++) {
                                        class241 var21 = var16.field4147[var20];
                                        var21.field3940.method97(var21.field3937, var12, var21.field3934, var21.field3931, var21.field3925);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class249.field4042 == class137.field2487;
        if (class43.field680) {
            GL var23 = class43.field651;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class286.method1953();
                class83.method749(-1, 3, 119);
                class292.field4679 = true;
                class275.method1882();
                class272.field4344 = -1;
                class188.field3157 = -1;
                for (int var24 = 0; var24 < class304.field4826[0].length; var24++) {
                    class337 var25 = class304.field4826[0][var24];
                    float var26 = 251.5F - (var25.field5399 ? 1.0F : 0.5F);
                    if (class272.field4344 != var25.field5377) {
                        class272.field4344 = var25.field5377;
                        class104.method897(103, var25.field5377);
                        class9.method69(class344.method2409(3));
                    }
                    var25.method2383(class279.field4430, var26, false);
                }
                class275.method1881();
            } else {
                int var27 = class242.field3947;
                while (true) {
                    if (var27 >= class42.field622) {
                        class245.method1718(class51.field788, class238.field3905, class279.field4430);
                        break;
                    }
                    for (int var28 = 0; var28 < class304.field4826[var27].length; var28++) {
                        class337 var29 = class304.field4826[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field5399 ? 1.0F : 0.5F);
                        if (var29.field5389 != -1 && class68.method653(119, class62.field953.method1206((byte) 32, var29.field5389)) && class285.field4521) {
                            class104.method897(104, var29.field5377);
                        }
                        var29.method2383(class279.field4430, var30, false);
                    }
                    if (var27 == 0 && class137.field2549 > 0) {
                        class43.method359(101.5F);
                        class14.method145(class51.field788, class238.field3905, class259.field4197, arg1, class112.field1878, class137.field2487[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class242.field3947; var31 < class42.field622; var31++) {
            class257[][] var32 = class279.field4430[var31];
            for (int var33 = -class259.field4197; var33 <= 0; var33++) {
                int var34 = class51.field788 + var33;
                int var35 = class51.field788 - var33;
                if (var34 >= class215.field3617 || var35 < class202.field3444) {
                    for (int var36 = -class259.field4197; var36 <= 0; var36++) {
                        int var37 = class238.field3905 + var36;
                        int var38 = class238.field3905 - var36;
                        if (var34 >= class215.field3617) {
                            if (var37 >= class332.field5292) {
                                class257 var39 = var32[var34][var37];
                                if (var39 != null && var39.field4143) {
                                    class353.method2458(var39, true);
                                }
                            }
                            if (var38 < class304.field4813) {
                                class257 var40 = var32[var34][var38];
                                if (var40 != null && var40.field4143) {
                                    class353.method2458(var40, true);
                                }
                            }
                        }
                        if (var35 < class202.field3444) {
                            if (var37 >= class332.field5292) {
                                class257 var41 = var32[var35][var37];
                                if (var41 != null && var41.field4143) {
                                    class353.method2458(var41, true);
                                }
                            }
                            if (var38 < class304.field4813) {
                                class257 var42 = var32[var35][var38];
                                if (var42 != null && var42.field4143) {
                                    class353.method2458(var42, true);
                                }
                            }
                        }
                        if (class348.field5539 == 0) {
                            if (!var22) {
                                class50.field785 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class242.field3947; var43 < class42.field622; var43++) {
            class257[][] var44 = class279.field4430[var43];
            for (int var45 = -class259.field4197; var45 <= 0; var45++) {
                int var46 = class51.field788 + var45;
                int var47 = class51.field788 - var45;
                if (var46 >= class215.field3617 || var47 < class202.field3444) {
                    for (int var48 = -class259.field4197; var48 <= 0; var48++) {
                        int var49 = class238.field3905 + var48;
                        int var50 = class238.field3905 - var48;
                        if (var46 >= class215.field3617) {
                            if (var49 >= class332.field5292) {
                                class257 var51 = var44[var46][var49];
                                if (var51 != null && var51.field4143) {
                                    class353.method2458(var51, false);
                                }
                            }
                            if (var50 < class304.field4813) {
                                class257 var52 = var44[var46][var50];
                                if (var52 != null && var52.field4143) {
                                    class353.method2458(var52, false);
                                }
                            }
                        }
                        if (var47 < class202.field3444) {
                            if (var49 >= class332.field5292) {
                                class257 var53 = var44[var47][var49];
                                if (var53 != null && var53.field4143) {
                                    class353.method2458(var53, false);
                                }
                            }
                            if (var50 < class304.field4813) {
                                class257 var54 = var44[var47][var50];
                                if (var54 != null && var54.field4143) {
                                    class353.method2458(var54, false);
                                }
                            }
                        }
                        if (class348.field5539 == 0) {
                            if (!var22) {
                                class50.field785 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class50.field785 = false;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z", line = 383)
    public static final boolean method1263(byte arg0) {
        field2791++;
        if (class44.field705 == 0) {
            if (arg0 != -20) {
                field2795 = (class49) null;
            }
            return class69.field1128.method933(-26314);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lpi;I)V", line = 398)
    public final void method1264(class336 arg0, int arg1) {
        if (arg1 <= 8) {
            this.field2794 = -113;
        }
        field2807++;
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method1265((byte) -105, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLpi;I)V", line = 431)
    private final void method1265(byte arg0, class336 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2799 = arg1.method2339((byte) -46);
        } else if (arg2 == 2) {
            this.field2793 = arg1.method2339((byte) -46);
        } else if (arg2 == 4) {
            this.field2784 = arg1.method2339((byte) -46);
        } else if (arg2 == 5) {
            this.field2797 = arg1.method2339((byte) -46);
        } else if (arg2 == 6) {
            this.field2785 = arg1.method2339((byte) -46);
        } else if (arg2 == 7) {
            this.field2794 = arg1.method2364(-9069);
        } else if (arg2 == 8) {
            this.field2796 = arg1.method2364(-9069);
        } else if (arg2 == 9) {
            this.field2802 = true;
        } else if (arg2 == 10) {
            this.field2803 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method2364(-9069);
            this.field2790 = new short[var4];
            this.field2806 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2790[var5] = (short) arg1.method2339((byte) -46);
                this.field2806[var5] = (short) arg1.method2339((byte) -46);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method2364(-9069);
            this.field2798 = new short[var6];
            this.field2804 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2804[var7] = (short) arg1.method2339((byte) -46);
                this.field2798[var7] = (short) arg1.method2339((byte) -46);
            }
        }
        field2788++;
        int var8 = 73 / ((arg0 - 4) / 33);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 523)
    public static void method1266(byte arg0) {
        field2789 = null;
        field2801 = null;
        field2795 = null;
        int var1 = 73 / ((-arg0 - 80) / 32);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Lgk;", line = 537)
    public final class10 method1267(int arg0, int arg1, int arg2, int arg3) {
        class10 var5 = (class10) class213.field3582.method467(true, (long) this.field2792);
        field2786++;
        if (var5 == null) {
            class307 var6 = class307.method2127(class188.field3154, this.field2799, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2790 != null) {
                for (int var7 = 0; var7 < this.field2790.length; var7++) {
                    var6.method2108(this.field2790[var7], this.field2806[var7]);
                }
            }
            if (this.field2804 != null) {
                for (int var8 = 0; var8 < this.field2804.length; var8++) {
                    var6.method2125(this.field2804[var8], this.field2798[var8]);
                }
            }
            var5 = var6.method2104(this.field2794 + 64, this.field2796 + 850, -30, -50, -30);
            class213.field3582.method465(var5, (long) this.field2792, (byte) 90);
        }
        class10 var9;
        if (this.field2793 == -1 || arg3 == -1) {
            var9 = var5.method73(true, true, true);
        } else {
            var9 = class346.method2428(this.field2793, (byte) -24).method1944((byte) -117, arg3, arg2, arg1, var5);
        }
        if (this.field2784 != 128 || this.field2797 != 128) {
            var9.method89(this.field2784, this.field2797, this.field2784);
        }
        if (arg0 <= 18) {
            this.method1264((class336) null, 127);
        }
        if (this.field2785 != 0) {
            if (this.field2785 == 90) {
                var9.method90();
            }
            if (this.field2785 == 180) {
                var9.method75();
            }
            if (this.field2785 == 270) {
                var9.method92();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Lag;", line = 626)
    public static final class127 method1268(int arg0, int arg1) {
        field2800++;
        class127 var2 = (class127) class304.field4811.method467(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class276.field4397.method441(false, 30, arg1);
        int var4 = -64 % ((arg0 - 5) / 39);
        class127 var5 = new class127();
        if (var3 != null) {
            var5.method1061(new class336(var3), 0, arg1);
        }
        class304.field4811.method465(var5, (long) arg1, (byte) 50);
        return var5;
    }
}
