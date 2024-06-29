import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class225 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3577 = 2;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ltl;")
    public static class222 field3576 = new class222(100);

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lol;")
    public static class246 field3581 = new class246(16);

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field3584 = 0;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lug;")
    public static class321 field3583;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Lkb;")
    public static class39 field3582;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1643(int arg0, int arg1) {
        field3580++;
        class5.field54.method1625(arg1, (byte) 17);
        class308.field4813.method1625(arg1, (byte) 110);
        if (arg0 != -1) {
            method1647((byte) 17);
        }
        class189.field3075.method1625(arg1, (byte) 121);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method1644(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class138.field2069 = arg4;
        class231.field3698 = class331.field5158 * arg3 / arg1;
        class206.field3363 = -1;
        field3578++;
        class242.field3841 = class240.field3815 * arg0 / arg2;
        class319.method2235((byte) -107);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[[[BIBII)V", line = 35)
    public static final void method1645(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class247.field3937++;
        class81.field1230 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class250.field3968; var12 < class55.field731; var12++) {
            class230[][] var13 = class251.field3996[var12];
            for (int var14 = class95.field1461; var14 < class160.field2486; var14++) {
                for (int var15 = class239.field3782; var15 < class127.field1901; var15++) {
                    class230 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class197.field3221[var14 + class214.field3473 - class185.field2979][var15 + class214.field3473 - class313.field4870] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3679 = true;
                            var16.field3690 = true;
                            if (var16.field3680 > 0) {
                                var16.field3674 = true;
                            } else {
                                var16.field3674 = false;
                            }
                            class81.field1230++;
                        } else {
                            var16.field3679 = false;
                            var16.field3690 = false;
                            var16.field3684 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3676 != null) {
                                    class19 var17 = var16.field3676;
                                    var17.field259.method150(0, var12, var17.field265, var17.field260, var17.field275);
                                    if (var17.field272 != null) {
                                        var17.field272.method150(0, var12, var17.field265, var17.field260, var17.field275);
                                    }
                                }
                                if (var16.field3678 != null) {
                                    class145 var18 = var16.field3678;
                                    var18.field2174.method150(var18.field2173, var12, var18.field2179, var18.field2177, var18.field2167);
                                    if (var18.field2166 != null) {
                                        var18.field2166.method150(var18.field2173, var12, var18.field2179, var18.field2177, var18.field2167);
                                    }
                                }
                                if (var16.field3675 != null) {
                                    class49 var19 = var16.field3675;
                                    var19.field667.method150(0, var12, var19.field670, var19.field682, var19.field680);
                                }
                                if (var16.field3687 != null) {
                                    for (int var20 = 0; var20 < var16.field3680; var20++) {
                                        class271 var21 = var16.field3687[var20];
                                        var21.field4286.method150(var21.field4288, var12, var21.field4293, var21.field4305, var21.field4300);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class84.field1282 == class163.field2656;
        if (class186.field2991) {
            GL var23 = class186.field2990;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class101.method713();
                class188.method1328(-1, 3, (byte) 121);
                class2.field6 = true;
                class85.method625();
                class283.field4474 = -1;
                class280.field4414 = -1;
                for (int var24 = 0; var24 < class326.field5088[0].length; var24++) {
                    class83 var25 = class326.field5088[0][var24];
                    float var26 = 251.5F - (var25.field1272 ? 1.0F : 0.5F);
                    if (class283.field4474 != var25.field1260) {
                        class283.field4474 = var25.field1260;
                        class30.method191(var25.field1260, false);
                        class109.method749(class315.method2188(5247));
                    }
                    var25.method617(class251.field3996, var26, false);
                }
                class85.method623();
            } else {
                int var27 = class250.field3968;
                while (true) {
                    if (var27 >= class55.field731) {
                        class47.method328(class185.field2979, class313.field4870, class251.field3996);
                        break;
                    }
                    for (int var28 = 0; var28 < class326.field5088[var27].length; var28++) {
                        class83 var29 = class326.field5088[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1272 ? 1.0F : 0.5F);
                        if (var29.field1267 != -1 && class16.method107(false, class25.field365.method382(var29.field1267, (byte) 68)) && class63.field831) {
                            class30.method191(var29.field1260, false);
                        }
                        var29.method617(class251.field3996, var30, false);
                    }
                    if (var27 == 0 && class17.field227 > 0) {
                        class186.method1282(101.5F);
                        class32.method217(class185.field2979, class313.field4870, class214.field3473, arg1, class197.field3221, class84.field1282[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class250.field3968; var31 < class55.field731; var31++) {
            class230[][] var32 = class251.field3996[var31];
            for (int var33 = -class214.field3473; var33 <= 0; var33++) {
                int var34 = class185.field2979 + var33;
                int var35 = class185.field2979 - var33;
                if (var34 >= class95.field1461 || var35 < class160.field2486) {
                    for (int var36 = -class214.field3473; var36 <= 0; var36++) {
                        int var37 = class313.field4870 + var36;
                        int var38 = class313.field4870 - var36;
                        if (var34 >= class95.field1461) {
                            if (var37 >= class239.field3782) {
                                class230 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3679) {
                                    class128.method879(var39, true);
                                }
                            }
                            if (var38 < class127.field1901) {
                                class230 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3679) {
                                    class128.method879(var40, true);
                                }
                            }
                        }
                        if (var35 < class160.field2486) {
                            if (var37 >= class239.field3782) {
                                class230 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3679) {
                                    class128.method879(var41, true);
                                }
                            }
                            if (var38 < class127.field1901) {
                                class230 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3679) {
                                    class128.method879(var42, true);
                                }
                            }
                        }
                        if (class81.field1230 == 0) {
                            if (!var22) {
                                class88.field1323 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class250.field3968; var43 < class55.field731; var43++) {
            class230[][] var44 = class251.field3996[var43];
            for (int var45 = -class214.field3473; var45 <= 0; var45++) {
                int var46 = class185.field2979 + var45;
                int var47 = class185.field2979 - var45;
                if (var46 >= class95.field1461 || var47 < class160.field2486) {
                    for (int var48 = -class214.field3473; var48 <= 0; var48++) {
                        int var49 = class313.field4870 + var48;
                        int var50 = class313.field4870 - var48;
                        if (var46 >= class95.field1461) {
                            if (var49 >= class239.field3782) {
                                class230 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3679) {
                                    class128.method879(var51, false);
                                }
                            }
                            if (var50 < class127.field1901) {
                                class230 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3679) {
                                    class128.method879(var52, false);
                                }
                            }
                        }
                        if (var47 < class160.field2486) {
                            if (var49 >= class239.field3782) {
                                class230 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3679) {
                                    class128.method879(var53, false);
                                }
                            }
                            if (var50 < class127.field1901) {
                                class230 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3679) {
                                    class128.method879(var54, false);
                                }
                            }
                        }
                        if (class81.field1230 == 0) {
                            if (!var22) {
                                class88.field1323 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class88.field1323 = false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 404)
    public static final void method1646(boolean arg0) {
        if (arg0) {
            class251.field3996 = class339.field5270;
            class84.field1282 = class163.field2656;
            class326.field5088 = class157.field2421;
        } else {
            class251.field3996 = class176.field2879;
            class84.field1282 = class94.field1450;
            class326.field5088 = class60.field788;
        }
        class55.field731 = class251.field3996.length;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 432)
    public static void method1647(byte arg0) {
        field3576 = null;
        field3582 = null;
        field3583 = null;
        field3581 = null;
        if (arg0 != 16) {
            method1644(76, 95, 116, 90, -77);
        }
    }
}
