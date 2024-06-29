import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class11 {

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lnl;")
    private class279 field139;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Lsk;")
    private class202 field145;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lbh;")
    private class184 field132;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[I")
    public static int[] field133 = new int[5];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Loh;")
    public static class258 field127 = class153.method1046(" )2> <col=ffff00>", 110);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "Loh;")
    public static class258 field136 = class153.method1046("<col=ff7000>", 126);

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Loh;")
    public static class258 field140 = class153.method1046("Loaded titlescreen)3", 94);

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Loh;")
    private static class258 field147 = class153.method1046("Loading config )2 ", 121);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Z")
    public static boolean field142 = false;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Loh;")
    public static class258 field144 = class153.method1046(":allyreq:", 113);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Loh;")
    public static class258 field131 = field147;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Lva;")
    private class235 field143;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
    public static int[] field148;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "[Lpg;")
    public static class292[] field149;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lba;")
    private class51[] field135;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 5)
    public static void method68(int arg0) {
        field133 = null;
        field144 = null;
        field131 = null;
        field127 = null;
        field147 = null;
        field140 = null;
        int var1 = 80 % ((-arg0 - 30) / 63);
        field149 = null;
        field148 = null;
        field136 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(III[[[BIBII)V", line = 38)
    public static final void method69(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class238.field4158++;
        class50.field784 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class283.field4863; var12 < class300.field5129; var12++) {
            class228[][] var13 = class178.field3180[var12];
            for (int var14 = class121.field2144; var14 < class171.field3009; var14++) {
                for (int var15 = class30.field360; var15 < class45.field688; var15++) {
                    class228 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class232.field4032[var14 + class297.field5101 - class64.field1134][var15 + class297.field5101 - class145.field2447] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3927 = true;
                            var16.field3943 = true;
                            if (var16.field3950 > 0) {
                                var16.field3938 = true;
                            } else {
                                var16.field3938 = false;
                            }
                            class50.field784++;
                        } else {
                            var16.field3927 = false;
                            var16.field3943 = false;
                            var16.field3934 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3923 != null) {
                                    class23 var17 = var16.field3923;
                                    var17.field291.method368(63, var17.field296, var17.field283, var17.field283, var17.field296);
                                    if (var17.field289 != null) {
                                        var17.field289.method368(63, var17.field296, var17.field283, var17.field283, var17.field296);
                                    }
                                }
                                if (var16.field3939 != null) {
                                    class263 var18 = var16.field3939;
                                    var18.field4566.method368(63, var18.field4581, var18.field4570, var18.field4570, var18.field4581);
                                    if (var18.field4573 != null) {
                                        var18.field4573.method368(63, var18.field4581, var18.field4570, var18.field4570, var18.field4581);
                                    }
                                }
                                if (var16.field3931 != null) {
                                    class250 var19 = var16.field3931;
                                    var19.field4310.method368(63, var19.field4307, var19.field4317, var19.field4317, var19.field4307);
                                }
                                if (var16.field3932 != null) {
                                    for (int var20 = 0; var20 < var16.field3950; var20++) {
                                        class219 var21 = var16.field3932[var20];
                                        var21.field3801.method368(63, var21.field3797, var21.field3793, var21.field3785, var21.field3789);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class201.field3482 == class144.field2424;
        if (class257.field4390) {
            GL var23 = class257.field4409;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class238.method1637();
                class107.method795(3, 58, -1);
                class120.field2123 = true;
                class53.method420();
                class208.field3582 = -1;
                class159.field2711 = -1;
                for (int var24 = 0; var24 < class13.field168[0].length; var24++) {
                    class157 var25 = class13.field168[0][var24];
                    float var26 = 251.5F - (var25.field2673 ? 1.0F : 0.5F);
                    if (class208.field3582 != var25.field2698) {
                        class208.field3582 = var25.field2698;
                        class3.method20(-415, var25.field2698);
                        class304.method2124(class243.method1657((byte) 70));
                    }
                    var25.method1071(class178.field3180, var26, false);
                }
                class53.method421();
            } else {
                int var27 = class283.field4863;
                while (true) {
                    if (var27 >= class300.field5129) {
                        class267.method1888(class64.field1134, class145.field2447, class178.field3180);
                        break;
                    }
                    for (int var28 = 0; var28 < class13.field168[var27].length; var28++) {
                        class157 var29 = class13.field168[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2673 ? 1.0F : 0.5F);
                        if (var29.field2684 != -1 && class266.field4643.method186((byte) 112, var29.field2684) == 4 && class20.field239) {
                            class3.method20(-415, var29.field2698);
                        }
                        var29.method1071(class178.field3180, var30, false);
                    }
                    if (var27 == 0 && class250.field4312 > 0) {
                        class257.method1735(101.5F);
                        class9.method59(class64.field1134, class145.field2447, class297.field5101, arg1, class232.field4032, class201.field3482[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class283.field4863; var31 < class300.field5129; var31++) {
            class228[][] var32 = class178.field3180[var31];
            for (int var33 = -class297.field5101; var33 <= 0; var33++) {
                int var34 = class64.field1134 + var33;
                int var35 = class64.field1134 - var33;
                if (var34 >= class121.field2144 || var35 < class171.field3009) {
                    for (int var36 = -class297.field5101; var36 <= 0; var36++) {
                        int var37 = class145.field2447 + var36;
                        int var38 = class145.field2447 - var36;
                        if (var34 >= class121.field2144) {
                            if (var37 >= class30.field360) {
                                class228 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3927) {
                                    class212.method1420(var39, true);
                                }
                            }
                            if (var38 < class45.field688) {
                                class228 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3927) {
                                    class212.method1420(var40, true);
                                }
                            }
                        }
                        if (var35 < class171.field3009) {
                            if (var37 >= class30.field360) {
                                class228 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3927) {
                                    class212.method1420(var41, true);
                                }
                            }
                            if (var38 < class45.field688) {
                                class228 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3927) {
                                    class212.method1420(var42, true);
                                }
                            }
                        }
                        if (class50.field784 == 0) {
                            if (!var22) {
                                class145.field2457 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class283.field4863; var43 < class300.field5129; var43++) {
            class228[][] var44 = class178.field3180[var43];
            for (int var45 = -class297.field5101; var45 <= 0; var45++) {
                int var46 = class64.field1134 + var45;
                int var47 = class64.field1134 - var45;
                if (var46 >= class121.field2144 || var47 < class171.field3009) {
                    for (int var48 = -class297.field5101; var48 <= 0; var48++) {
                        int var49 = class145.field2447 + var48;
                        int var50 = class145.field2447 - var48;
                        if (var46 >= class121.field2144) {
                            if (var49 >= class30.field360) {
                                class228 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3927) {
                                    class212.method1420(var51, false);
                                }
                            }
                            if (var50 < class45.field688) {
                                class228 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3927) {
                                    class212.method1420(var52, false);
                                }
                            }
                        }
                        if (var47 < class171.field3009) {
                            if (var49 >= class30.field360) {
                                class228 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3927) {
                                    class212.method1420(var53, false);
                                }
                            }
                            if (var50 < class45.field688) {
                                class228 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3927) {
                                    class212.method1420(var54, false);
                                }
                            }
                        }
                        if (class50.field784 == 0) {
                            if (!var22) {
                                class145.field2457 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class145.field2457 = false;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB[JI[I)V", line = 406)
    public static final void method70(int arg0, byte arg1, long[] arg2, int arg3, int[] arg4) {
        field146++;
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            long var6 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var6;
            int var8 = arg3;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var9;
            for (int var10 = arg3; var10 < arg0; var10++) {
                if (var6 + ((long) (var10 & 0x1)) > arg2[var10]) {
                    long var11 = arg2[var10];
                    arg2[var10] = arg2[var8];
                    arg2[var8] = var11;
                    int var13 = arg4[var10];
                    arg4[var10] = arg4[var8];
                    arg4[var8++] = var13;
                }
            }
            arg2[arg0] = arg2[var8];
            arg2[var8] = var6;
            arg4[arg0] = arg4[var8];
            arg4[var8] = var9;
            method70(var8 - 1, (byte) -109, arg2, arg3, arg4);
            method70(arg0, (byte) -91, arg2, var8 + 1, arg4);
        }
        if (arg1 > -57) {
            field127 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lhh;IILhh;)Lba;", line = 462)
    public final class51 method71(class80 arg0, int arg1, int arg2, class80 arg3) {
        if (arg1 != 1) {
            field127 = (class258) null;
        }
        field137++;
        return this.method76(84, arg0, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 474)
    public final void method72(int arg0) {
        field134++;
        if (this.field135 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field135.length; var2++) {
            if (this.field135[var2] != null) {
                this.field135[var2].method409((byte) 98);
            }
        }
        if (arg0 != 22) {
            method75(-16, 58, (class213) null, 86);
        }
        for (int var3 = 0; var3 < this.field135.length; var3++) {
            if (this.field135[var3] != null) {
                this.field135[var3].method410(arg0 - 125);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Z", line = 515)
    public final boolean method73(int arg0) {
        field138++;
        if (this.field143 != null) {
            return true;
        }
        if (this.field132 == null) {
            if (this.field139.method1963(arg0 ^ 0xFFFFE4FB)) {
                return false;
            }
            this.field132 = this.field139.method1961((byte) 0, 25933, true, 255, 255);
        }
        if (this.field132.field4208) {
            return false;
        } else {
            this.field143 = new class235(this.field132.method1061((byte) -121));
            this.field135 = new class51[(this.field143.field4066.length - 5) / 8];
            return arg0 == 255 ? true : true;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 545)
    public static final void method74(int arg0) {
        field128++;
        int var1 = class123.field2180.method252(class16.field204);
        for (int var2 = 0; var2 < class69.field1195; var2++) {
            int var3 = class123.field2180.method252(class63.method488(true, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class69.field1195 * 15 + 21;
        int var5 = class84.field1415 - (var1 / 2);
        int var6 = class113.field1947;
        if ((var4 + var6) > class42.field577) {
            var6 = class42.field577 - var4;
        }
        if (class218.field3773 < var1 + var5) {
            var5 = class218.field3773 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < arg0) {
            var5 = 0;
        }
        if (class147.field2501 == 1) {
            if (class84.field1415 == class249.field4298 && class49.field729 == class113.field1947) {
                class218.field3766 = var5;
                class252.field4342 = true;
                class84.field1414 = var1;
                class201.field3490 = var6;
                class224.field3845 = class69.field1195 * 15 + 22;
                class147.field2501 = 0;
            }
        } else if (class84.field1415 == class219.field3791 && class173.field3103 == class113.field1947) {
            class84.field1414 = var1;
            class201.field3490 = var6;
            class147.field2501 = 0;
            class252.field4342 = true;
            class224.field3845 = class69.field1195 * 15 + 22;
            class218.field3766 = var5;
        } else {
            class249.field4298 = class219.field3791;
            class147.field2501 = 1;
            class49.field729 = class173.field3103;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILgb;I)Ldb;", line = 644)
    public static final class41 method75(int arg0, int arg1, class213 arg2, int arg3) {
        if (arg1 != -6471) {
            method77(-18);
        }
        field129++;
        return class162.method1086(0, arg2, arg3, arg0) ? class26.method204(false) : null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILhh;ILhh;Z)Lba;", line = 664)
    private final class51 method76(int arg0, class80 arg1, int arg2, class80 arg3, boolean arg4) {
        field130++;
        if (this.field143 == null) {
            throw new RuntimeException();
        }
        this.field143.field4051 = arg2 * 8 + 5;
        if (this.field143.field4051 >= this.field143.field4066.length) {
            throw new RuntimeException();
        } else if (this.field135[arg2] == null) {
            int var6 = this.field143.method1611(82);
            int var7 = 65 / ((arg0 + 23) / 61);
            int var8 = this.field143.method1611(18);
            class51 var9 = new class51(arg2, arg1, arg3, this.field139, this.field145, var6, var8, arg4);
            this.field135[arg2] = var9;
            return var9;
        } else {
            return this.field135[arg2];
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lnl;Lsk;)V", line = 706)
    public class11(class279 arg0, class202 arg1) {
        this.field139 = arg0;
        this.field145 = arg1;
        if (!this.field139.method1963(-7164)) {
            this.field132 = this.field139.method1961((byte) 0, 25933, true, 255, 255);
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)Z", line = 735)
    public static final boolean method77(int arg0) {
        field141++;
        return ~class292.field5027 == arg0 ? class224.field3844.method829(-6) : true;
    }
}
