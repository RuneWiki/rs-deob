import java.awt.FontMetrics;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class171 {

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lo;")
    private class204 field3093 = new class204();

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    private int field3090;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    private int field3095;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lcd;")
    private class69 field3081;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lud;")
    public static class279 field3083 = class130.method1024("Forced tweening disabled)3", 255);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Lud;")
    public static class279[] field3089 = new class279[500];

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3086 = 2;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lud;")
    public static class279 field3079 = class130.method1024("null", 255);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3092;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lud;I)Z", line = 10)
    public static final boolean method1329(class279 arg0, int arg1) {
        field3098++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 < 126) {
            method1329((class279) null, -37);
        }
        for (int var2 = 0; var2 < class167.field3011; var2++) {
            if (arg0.method2010(class100.field1861[var2], (byte) 100)) {
                return true;
            }
        }
        if (arg0.method2010(class72.field1420.field4197, (byte) 119)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III[[[BIBII)V", line = 39)
    public static final void method1330(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class182.field3328++;
        class182.field3334 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class204.field3632; var12 < class69.field1363; var12++) {
            class191[][] var13 = class24.field619[var12];
            for (int var14 = class195.field3529; var14 < class183.field3363; var14++) {
                for (int var15 = class272.field4848; var15 < class302.field5369; var15++) {
                    class191 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class213.field3734[var14 + class115.field2091 - class223.field3956][var15 + class115.field2091 - class45.field951] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3461 = true;
                            var16.field3448 = true;
                            if (var16.field3451 > 0) {
                                var16.field3446 = true;
                            } else {
                                var16.field3446 = false;
                            }
                            class182.field3334++;
                        } else {
                            var16.field3461 = false;
                            var16.field3448 = false;
                            var16.field3450 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3439 != null) {
                                    class17 var17 = var16.field3439;
                                    var17.field522.method179(0, var12, var17.field527, var17.field528, var17.field531);
                                    if (var17.field525 != null) {
                                        var17.field525.method179(0, var12, var17.field527, var17.field528, var17.field531);
                                    }
                                }
                                if (var16.field3454 != null) {
                                    class235 var18 = var16.field3454;
                                    var18.field4091.method179(var18.field4093, var12, var18.field4092, var18.field4100, var18.field4104);
                                    if (var18.field4099 != null) {
                                        var18.field4099.method179(var18.field4093, var12, var18.field4092, var18.field4100, var18.field4104);
                                    }
                                }
                                if (var16.field3440 != null) {
                                    class243 var19 = var16.field3440;
                                    var19.field4316.method179(0, var12, var19.field4313, var19.field4326, var19.field4318);
                                }
                                if (var16.field3455 != null) {
                                    for (int var20 = 0; var20 < var16.field3451; var20++) {
                                        class18 var21 = var16.field3455[var20];
                                        var21.field563.method179(var21.field559, var12, var21.field561, var21.field550, var21.field544);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class165.field2970 == class14.field432;
        if (class97.field1824) {
            GL var23 = class97.field1801;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class50.method422();
                class162.method1279(0, -1, 3);
                class289.field5155 = true;
                class114.method925();
                class8.field337 = -1;
                class191.field3435 = -1;
                for (int var24 = 0; var24 < class174.field3136[0].length; var24++) {
                    class168 var25 = class174.field3136[0][var24];
                    float var26 = 251.5F - (var25.field3048 ? 1.0F : 0.5F);
                    if (class8.field337 != var25.field3042) {
                        class8.field337 = var25.field3042;
                        class223.method1637(var25.field3042, true);
                        class219.method1606(class294.method2090((byte) -90));
                    }
                    var25.method1313(class24.field619, var26, false);
                }
                class114.method924();
            } else {
                int var27 = class204.field3632;
                while (true) {
                    if (var27 >= class69.field1363) {
                        class30.method283(class223.field3956, class45.field951, class24.field619);
                        break;
                    }
                    for (int var28 = 0; var28 < class174.field3136[var27].length; var28++) {
                        class168 var29 = class174.field3136[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3048 ? 1.0F : 0.5F);
                        if (var29.field3031 != -1 && class27.field656.method322(255, var29.field3031) == 4 && class162.field2929) {
                            class223.method1637(var29.field3042, true);
                        }
                        var29.method1313(class24.field619, var30, false);
                    }
                    if (var27 == 0 && field3086 > 0) {
                        class97.method838(101.5F);
                        class160.method1268(class223.field3956, class45.field951, class115.field2091, arg1, class213.field3734, class165.field2970[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class204.field3632; var31 < class69.field1363; var31++) {
            class191[][] var32 = class24.field619[var31];
            for (int var33 = -class115.field2091; var33 <= 0; var33++) {
                int var34 = class223.field3956 + var33;
                int var35 = class223.field3956 - var33;
                if (var34 >= class195.field3529 || var35 < class183.field3363) {
                    for (int var36 = -class115.field2091; var36 <= 0; var36++) {
                        int var37 = class45.field951 + var36;
                        int var38 = class45.field951 - var36;
                        if (var34 >= class195.field3529) {
                            if (var37 >= class272.field4848) {
                                class191 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3461) {
                                    class62.method548(var39, true);
                                }
                            }
                            if (var38 < class302.field5369) {
                                class191 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3461) {
                                    class62.method548(var40, true);
                                }
                            }
                        }
                        if (var35 < class183.field3363) {
                            if (var37 >= class272.field4848) {
                                class191 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3461) {
                                    class62.method548(var41, true);
                                }
                            }
                            if (var38 < class302.field5369) {
                                class191 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3461) {
                                    class62.method548(var42, true);
                                }
                            }
                        }
                        if (class182.field3334 == 0) {
                            if (!var22) {
                                class322.field5625 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class204.field3632; var43 < class69.field1363; var43++) {
            class191[][] var44 = class24.field619[var43];
            for (int var45 = -class115.field2091; var45 <= 0; var45++) {
                int var46 = class223.field3956 + var45;
                int var47 = class223.field3956 - var45;
                if (var46 >= class195.field3529 || var47 < class183.field3363) {
                    for (int var48 = -class115.field2091; var48 <= 0; var48++) {
                        int var49 = class45.field951 + var48;
                        int var50 = class45.field951 - var48;
                        if (var46 >= class195.field3529) {
                            if (var49 >= class272.field4848) {
                                class191 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3461) {
                                    class62.method548(var51, false);
                                }
                            }
                            if (var50 < class302.field5369) {
                                class191 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3461) {
                                    class62.method548(var52, false);
                                }
                            }
                        }
                        if (var47 < class183.field3363) {
                            if (var49 >= class272.field4848) {
                                class191 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3461) {
                                    class62.method548(var53, false);
                                }
                            }
                            if (var50 < class302.field5369) {
                                class191 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3461) {
                                    class62.method548(var54, false);
                                }
                            }
                        }
                        if (class182.field3334 == 0) {
                            if (!var22) {
                                class322.field5625 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class322.field5625 = false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 409)
    public final void method1331(Object arg0, int arg1, long arg2) {
        this.method1335((byte) -17, arg2);
        if (arg1 != 30237) {
            return;
        }
        if (this.field3095 == 0) {
            class3 var5 = (class3) this.field3093.method1517(false);
            var5.method2221(true);
            var5.method926((byte) -8);
        } else {
            this.field3095--;
        }
        field3097++;
        class41 var6 = new class41(arg0);
        this.field3081.method612(false, var6, arg2);
        this.field3093.method1513(var6, arg1 - 29981);
        var6.field2103 = 0L;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 439)
    public static final void method1332(int arg0) {
        if (arg0 == 30499) {
            class73.field1437.method1338((byte) -118);
            field3087++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 451)
    public static void method1333(boolean arg0) {
        field3079 = null;
        field3089 = null;
        if (arg0) {
            field3083 = null;
            field3092 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 468)
    public final void method1334(byte arg0) {
        for (class3 var2 = (class3) this.field3093.method1511((byte) 87); var2 != null; var2 = (class3) this.field3093.method1515(-124)) {
            if (var2.method22(0)) {
                var2.method2221(true);
                var2.method926((byte) -8);
                this.field3095++;
            }
        }
        if (arg0 != -25) {
            field3083 = (class279) null;
        }
        field3082++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BJ)V", line = 492)
    public final void method1335(byte arg0, long arg1) {
        class3 var4 = (class3) this.field3081.method610(arg1, -1);
        if (var4 != null) {
            var4.method2221(true);
            var4.method926((byte) -8);
            this.field3095++;
        }
        int var5 = 81 / ((arg0 - 47) / 52);
        field3099++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(JI)Ljava/lang/Object;", line = 514)
    public final Object method1336(long arg0, int arg1) {
        class3 var4 = (class3) this.field3081.method610(arg0, -1);
        field3088++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method21((byte) 37);
        if (var5 == null) {
            var4.method2221(true);
            var4.method926((byte) -8);
            this.field3095++;
            return null;
        }
        if (var4.method22(arg1)) {
            class41 var6 = new class41(var5);
            this.field3081.method612(false, var6, var4.field5539);
            this.field3093.method1513(var6, 256);
            var6.field2103 = 0L;
            var4.method2221(true);
            var4.method926((byte) -8);
        } else {
            this.field3093.method1513(var4, 256);
            var4.field2103 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Z", line = 553)
    public static final boolean method1337(boolean arg0, int arg1) {
        field3096++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class271.field4828[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (var2 == 1005) {
            return true;
        } else {
            if (!arg0) {
                method1332(35);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 577)
    public final void method1338(byte arg0) {
        if (arg0 > -93) {
            this.method1336(-50L, -19);
        }
        this.field3093.method1516(124);
        field3084++;
        this.field3081.method603((byte) 123);
        this.field3095 = this.field3090;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V", line = 597)
    public final void method1339(int arg0, int arg1) {
        field3080++;
        if (class124.field2239 != null) {
            for (class3 var3 = (class3) this.field3093.method1511((byte) 78); var3 != null; var3 = (class3) this.field3093.method1515(-114)) {
                if (var3.method22(0)) {
                    if (var3.method21((byte) 37) == null) {
                        var3.method2221(true);
                        var3.method926((byte) -8);
                        this.field3095++;
                    }
                } else if (((long) arg0) < (++var3.field2103)) {
                    class3 var4 = class124.field2239.method734(arg1 ^ 0x4B7C, var3);
                    this.field3081.method612(false, var4, var3.field5539);
                    class50.method429(var3, true, var4);
                    var3.method2221(true);
                    var3.method926((byte) -8);
                }
            }
        }
        if (arg1 != 19326) {
            this.field3095 = 16;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V", line = 688)
    public class171(int arg0) {
        this.field3090 = arg0;
        this.field3095 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3081 = new class69(var2);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I", line = 666)
    public final int method1340(int arg0) {
        field3091++;
        int var2 = 0;
        class3 var3 = (class3) this.field3093.method1511((byte) 69);
        if (arg0 != -20605) {
            this.field3095 = -33;
        }
        while (var3 != null) {
            if (!var3.method22(arg0 ^ 0xFFFFAF83)) {
                var2++;
            }
            var3 = (class3) this.field3093.method1515(-128);
        }
        return var2;
    }
}
