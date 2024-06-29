import java.awt.Canvas;
import java.awt.event.FocusListener;
import java.math.BigInteger;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class261 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4364 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lwa;")
    private static class75 field4367 = class66.method560("flash1:", false);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[I")
    public static int[] field4366 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field4372 = -1;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lwa;")
    public static class75 field4375 = field4367;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lwa;")
    public static class75 field4368 = class66.method560("rot:", false);

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Lwa;")
    public static class75 field4370 = class66.method560("scrollen:", false);

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
    public static boolean field4376 = true;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lwa;")
    public static class75 field4373 = field4367;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[[[B")
    public static byte[][][] field4365;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 22)
    public static void method1860(int arg0) {
        field4373 = null;
        field4364 = null;
        field4375 = null;
        field4365 = (byte[][][]) null;
        if (arg0 >= -48) {
            field4370 = (class75) null;
        }
        field4370 = null;
        field4368 = null;
        field4366 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[[BIBII)V", line = 38)
    public static final void method1861(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class158.field2713++;
        class162.field2763 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class112.field1909; var12 < class28.field366; var12++) {
            class242[][] var13 = class271.field4681[var12];
            for (int var14 = class217.field3710; var14 < class182.field3039; var14++) {
                for (int var15 = class255.field4270; var15 < class260.field4360; var15++) {
                    class242 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class7.field84[var14 + class260.field4359 - class53.field875][var15 + class260.field4359 - class188.field3131] && arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5) {
                            var16.field4085 = true;
                            var16.field4090 = true;
                            if (var16.field4086 > 0) {
                                var16.field4103 = true;
                            } else {
                                var16.field4103 = false;
                            }
                            class162.field2763++;
                        } else {
                            var16.field4085 = false;
                            var16.field4090 = false;
                            var16.field4084 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field4098 != null) {
                                    class167 var17 = var16.field4098;
                                    var17.field2815.method1267(var17.field2823, var17.field2822, var17.field2823, (byte) -113, var17.field2822);
                                    if (var17.field2809 != null) {
                                        var17.field2809.method1267(var17.field2823, var17.field2822, var17.field2823, (byte) 8, var17.field2822);
                                    }
                                }
                                if (var16.field4096 != null) {
                                    class235 var18 = var16.field4096;
                                    var18.field3977.method1267(var18.field3964, var18.field3965, var18.field3964, (byte) 56, var18.field3965);
                                    if (var18.field3963 != null) {
                                        var18.field3963.method1267(var18.field3964, var18.field3965, var18.field3964, (byte) 91, var18.field3965);
                                    }
                                }
                                if (var16.field4092 != null) {
                                    class217 var19 = var16.field4092;
                                    var19.field3707.method1267(var19.field3709, var19.field3711, var19.field3709, (byte) -87, var19.field3711);
                                }
                                if (var16.field4083 != null) {
                                    for (int var20 = 0; var20 < var16.field4086; var20++) {
                                        class285 var21 = var16.field4083[var20];
                                        var21.field4898.method1267(var21.field4907, var21.field4895, var21.field4911, (byte) -113, var21.field4896);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class53.field879 == class156.field2669;
        GL var23 = class47.field739;
        var23.glPushMatrix();
        var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        if (var22) {
            class286.method2016();
            class140.method1079(3, (byte) -54, -1);
            class156.field2682 = true;
            class160.method1205();
            class285.field4913 = -1;
            class89.field1479 = -1;
            for (int var24 = 0; var24 < class215.field3672[0].length; var24++) {
                class38 var25 = class215.field3672[0][var24];
                float var26 = 251.5F - (var25.field567 ? 1.0F : 0.5F);
                if (class285.field4913 != var25.field576) {
                    class285.field4913 = var25.field576;
                    class180.method1322(var25.field576, (byte) -89);
                    class239.method1740(class123.method931(1));
                }
                var25.method254(class271.field4681, var26, false);
            }
            class160.method1203();
        } else {
            for (int var27 = class112.field1909; var27 < class28.field366; var27++) {
                for (int var28 = 0; var28 < class215.field3672[var27].length; var28++) {
                    class38 var29 = class215.field3672[var27][var28];
                    float var30 = 201.5F - (float) var27 * 50.0F - (var29.field567 ? 1.0F : 0.5F);
                    if (var29.field557 != -1 && class21.field279.method1057(var29.field557, (byte) -59) == 4 && class167.field2816) {
                        class180.method1322(var29.field576, (byte) -97);
                    }
                    var29.method254(class271.field4681, var30, false);
                }
                if (var27 == 0 && class157.field2692 > 0) {
                    class47.method315(101.5F);
                    class18.method119(class53.field875, class188.field3131, class260.field4359, arg1, class7.field84, class53.field879[0]);
                }
            }
            class209.method1550(class53.field875, class188.field3131, class271.field4681);
        }
        var23.glPopMatrix();
        for (int var31 = class112.field1909; var31 < class28.field366; var31++) {
            class242[][] var32 = class271.field4681[var31];
            for (int var33 = -class260.field4359; var33 <= 0; var33++) {
                int var34 = class53.field875 + var33;
                int var35 = class53.field875 - var33;
                if (var34 >= class217.field3710 || var35 < class182.field3039) {
                    for (int var36 = -class260.field4359; var36 <= 0; var36++) {
                        int var37 = class188.field3131 + var36;
                        int var38 = class188.field3131 - var36;
                        if (var34 >= class217.field3710) {
                            if (var37 >= class255.field4270) {
                                class242 var39 = var32[var34][var37];
                                if (var39 != null && var39.field4085) {
                                    class178.method1312(var39, true);
                                }
                            }
                            if (var38 < class260.field4360) {
                                class242 var40 = var32[var34][var38];
                                if (var40 != null && var40.field4085) {
                                    class178.method1312(var40, true);
                                }
                            }
                        }
                        if (var35 < class182.field3039) {
                            if (var37 >= class255.field4270) {
                                class242 var41 = var32[var35][var37];
                                if (var41 != null && var41.field4085) {
                                    class178.method1312(var41, true);
                                }
                            }
                            if (var38 < class260.field4360) {
                                class242 var42 = var32[var35][var38];
                                if (var42 != null && var42.field4085) {
                                    class178.method1312(var42, true);
                                }
                            }
                        }
                        if (class162.field2763 == 0) {
                            if (!var22) {
                                class259.field4337 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class112.field1909; var43 < class28.field366; var43++) {
            class242[][] var44 = class271.field4681[var43];
            for (int var45 = -class260.field4359; var45 <= 0; var45++) {
                int var46 = class53.field875 + var45;
                int var47 = class53.field875 - var45;
                if (var46 >= class217.field3710 || var47 < class182.field3039) {
                    for (int var48 = -class260.field4359; var48 <= 0; var48++) {
                        int var49 = class188.field3131 + var48;
                        int var50 = class188.field3131 - var48;
                        if (var46 >= class217.field3710) {
                            if (var49 >= class255.field4270) {
                                class242 var51 = var44[var46][var49];
                                if (var51 != null && var51.field4085) {
                                    class178.method1312(var51, false);
                                }
                            }
                            if (var50 < class260.field4360) {
                                class242 var52 = var44[var46][var50];
                                if (var52 != null && var52.field4085) {
                                    class178.method1312(var52, false);
                                }
                            }
                        }
                        if (var47 < class182.field3039) {
                            if (var49 >= class255.field4270) {
                                class242 var53 = var44[var47][var49];
                                if (var53 != null && var53.field4085) {
                                    class178.method1312(var53, false);
                                }
                            }
                            if (var50 < class260.field4360) {
                                class242 var54 = var44[var47][var50];
                                if (var54 != null && var54.field4085) {
                                    class178.method1312(var54, false);
                                }
                            }
                        }
                        if (class162.field2763 == 0) {
                            if (!var22) {
                                class259.field4337 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class259.field4337 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V", line = 443)
    public static final void method1862(int arg0, byte arg1) {
        if (arg1 != -52) {
            method1863(119, 62);
        }
        field4374++;
        class118 var2 = (class118) class310.field5269.method1007((long) arg0, -17004);
        if (var2 != null) {
            var2.method1527(-123);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I", line = 504)
    public static final int method1863(int arg0, int arg1) {
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        field4363++;
        int var3 = arg1 * 6 - 61440;
        if (arg0 != -1) {
            method1863(40, 59);
        }
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }
}
