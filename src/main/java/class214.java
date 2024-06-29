import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class214 extends class182 {

    @OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
    public static int field2736 = 0;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
    public static int field2738;

    static {
        new class296("", 73);
        new class169("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method1205(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != Integer.MAX_VALUE) {
            field2736 = 32;
        }
        super.field2382 = arg1;
        super.field2383 = arg2;
        ++field2737;
        super.field2388 = arg0;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BF)V", line = 20)
    public final void method1196(byte arg0, float arg1) {
        super.field2381 = arg1;
        if (arg0 < 16) {
            field2736 = -122;
        }
        ++field2733;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V", line = 32)
    public static final void method1362(int arg0) {
        ++field2735;
        if (class126.field1733) {
            class517.field7621 = null;
            if (arg0 != -1) {
                field2736 = 30;
            }
            class473.field6921 = null;
            class126.field1733 = false;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILwt;Lmv;)V", line = 48)
    public static final void method1363(int arg0, int arg1, int arg2, class16 arg3, class518 arg4) {
        ++field2732;
        byte var5 = -1;
        if (~(arg2 & 131072) != -1) {
            arg4.field5182 = arg3.method613(128);
            arg4.field5235 = arg3.method614(128);
            arg4.field5215 = arg3.method613(128);
            arg4.field5226 = (byte) arg3.method561(1110991096);
            arg4.field5219 = class264.field3353 + arg3.method605(31981);
            arg4.field5203 = class264.field3353 - -arg3.method568((byte) 110);
        }
        if ((arg2 & 512) != 0) {
            arg4.field7649 = arg3.method608((byte) 108) == 1;
        }
        if ((65536 & arg2) != 0) {
            int var6 = arg3.method567((byte) 112);
            if (~var6 == -65536) {
                var6 = -1;
            }
            int var7 = arg3.method615((byte) -30);
            int var8 = arg3.method577(255);
            arg4.method2345(true, (byte) -98, var7, var6, var8);
        }
        if ((arg2 & 8192) != 0) {
            int var9 = arg3.method605(31981);
            int var10 = arg3.method589(true);
            if (~var9 == -65536) {
                var9 = -1;
            }
            int var11 = arg3.method608((byte) 73);
            arg4.method2345(false, (byte) -107, var10, var9, var11);
        }
        if ((arg2 & 262144) != 0) {
            int var12 = arg3.method577(255);
            int[] var13 = new int[var12];
            int[] var14 = new int[var12];
            int[] var15 = new int[var12];
            for (int var16 = 0; ~var16 > ~var12; ++var16) {
                int var17 = arg3.method567((byte) 112);
                if (~var17 == -65536) {
                    var17 = -1;
                }
                var13[var16] = var17;
                var14[var16] = arg3.method561(1110991096);
                var15[var16] = arg3.method605(31981);
            }
            class346.method2036(arg4, var14, var15, var13, (byte) 105);
        }
        if ((32 & arg2) != 0) {
            int var18 = arg3.method605(31981);
            if (~var18 == -65536) {
                var18 = -1;
            }
            int var19 = arg3.method617(2);
            class161.method1074(var19, (byte) 86, var18, arg4);
        }
        if (arg0 < -12) {
            if ((arg2 & 16) != 0) {
                int var20 = arg3.method567((byte) 112);
                int var21 = arg3.method617(2);
                int var22 = arg3.method608((byte) -102);
                int var23 = arg3.field1176;
                boolean var24 = (32768 & var20) != 0;
                if (arg4.field7630 != null && arg4.field7655 != null) {
                    boolean var25 = false;
                    if (~var21 >= -2) {
                        if (var24 || (!class437.field5998 || class306.field3943) && !class428.field5874) {
                            if (class52.method313(arg4.field7630, 106)) {
                                var25 = true;
                            }
                        } else {
                            var25 = true;
                        }
                    }
                    if (!var25 && class31.field518 == 0) {
                        class113.field1550.field1176 = 0;
                        arg3.method573(class113.field1550.field1223, -128, var22, 0);
                        class113.field1550.field1176 = 0;
                        int var26 = -1;
                        String var28;
                        if (var24) {
                            var20 &= 32767;
                            class216 var27 = class488.method2916(class113.field1550, -100);
                            var26 = var27.field2772;
                            var28 = var27.field2775.method1597(false, class113.field1550);
                        } else {
                            var28 = class291.method1758(7638, class248.method1556(-14, class113.field1550));
                        }
                        arg4.field5229 = var28.trim();
                        arg4.field5231 = var20 & 255;
                        arg4.field5223 = 150;
                        arg4.field5211 = var20 >> 8;
                        int var29;
                        if (var21 != 1 && ~var21 != -3) {
                            var29 = !var24 ? 2 : 17;
                        } else {
                            var29 = !var24 ? 1 : 17;
                        }
                        if (var21 == 2) {
                            class376.method2194(var28, 0, "<img=1>" + arg4.method3080(255, true), (String) null, var29, 0, var26, "<img=1>" + arg4.method3085(255, false));
                        } else if (var21 == 1) {
                            class376.method2194(var28, 0, "<img=0>" + arg4.method3080(255, true), (String) null, var29, 0, var26, "<img=0>" + arg4.method3085(255, false));
                        } else {
                            class376.method2194(var28, 0, arg4.method3080(255, true), (String) null, var29, 0, var26, arg4.method3085(255, false));
                        }
                    }
                }
                arg3.field1176 = var22 + var23;
            }
            if (~(1 & arg2) != -1) {
                class332.field4257[arg1] = arg3.method575(-82);
            }
            if (~(4096 & arg2) != -1) {
                var5 = arg3.method614(128);
            }
            if ((arg2 & 4) != 0) {
                int var30 = arg3.method604(-9338);
                int var31 = arg3.method577(255);
                arg4.method2352(var30, class264.field3353, 0, var31);
                arg4.field5151 = class264.field3353 + 300;
                arg4.field5199 = arg3.method608((byte) -77);
            }
            if (~(arg2 & 2) != -1) {
                int var32 = arg3.method608((byte) -104);
                byte[] var33 = new byte[var32];
                class88 var34 = new class88(var33);
                arg3.method596(30576, 0, var33, var32);
                class514.field7559[arg1] = var34;
                arg4.method3084(var34, 0);
            }
            if ((arg2 & 16384) != 0) {
                arg4.field5229 = arg3.method591(20557);
                if (~arg4.field5229.charAt(0) != -127) {
                    if (class37.field573 == arg4) {
                        class482.method2888(arg4.method3080(255, true), 0, arg4.method3085(255, false), 0, 2, arg4.field5229);
                    }
                } else {
                    arg4.field5229 = arg4.field5229.substring(1);
                    class482.method2888(arg4.method3080(255, true), 0, arg4.method3085(255, false), 0, 2, arg4.field5229);
                }
                arg4.field5231 = 0;
                arg4.field5223 = 150;
                arg4.field5211 = 0;
            }
            if ((arg2 & 128) != 0) {
                int var35 = arg3.method570(true);
                if (var35 == 65535) {
                    var35 = -1;
                }
                arg4.field5202 = var35;
            }
            if (~(arg2 & 1024) != -1) {
                int var36 = class264.field3353;
                int var37 = arg3.method604(-9338);
                int var38 = arg3.method577(255);
                arg4.method2352(var37, var36, 0, var38);
            }
            if (~(arg2 & 32768) != -1) {
                arg4.field5158 = arg3.method614(128);
                arg4.field5154 = arg3.method612((byte) 21);
                arg4.field5164 = arg3.method614(128);
                arg4.field5179 = arg3.method613(128);
                arg4.field5228 = arg3.method567((byte) 112) + class264.field3353;
                arg4.field5208 = arg3.method605(31981) - -class264.field3353;
                arg4.field5187 = arg3.method617(2);
                if (arg4.field7651) {
                    arg4.field5179 += arg4.field7637;
                    arg4.field5244 = 0;
                    arg4.field5158 += arg4.field7656;
                    arg4.field5154 += arg4.field7637;
                    arg4.field5164 += arg4.field7656;
                } else {
                    arg4.field5179 += arg4.field5251[0];
                    arg4.field5164 += arg4.field5246[0];
                    arg4.field5244 = 1;
                    arg4.field5154 += arg4.field5251[0];
                    arg4.field5158 += arg4.field5246[0];
                }
                arg4.field5252 = 0;
            }
            if (~(64 & arg2) != -1) {
                arg4.field7668 = arg3.method568((byte) 110);
                if (~arg4.field5244 == -1) {
                    arg4.method2341(true, arg4.field7668);
                    arg4.field7668 = -1;
                }
            }
            if (~(arg2 & 2048) != -1) {
                int var39 = arg3.method568((byte) 110);
                arg4.field5197 = arg3.method608((byte) -79);
                arg4.field5207 = arg3.method617(2);
                arg4.field5210 = var39 & 32767;
                arg4.field5189 = (32768 & var39) != 0;
                arg4.field5214 = class264.field3353 + arg4.field5210 - -arg4.field5197;
            }
            if (arg4.field7651) {
                if (var5 == 127) {
                    arg4.method3083(arg4.field7656, arg4.field7637, -13603);
                } else {
                    byte var40;
                    if (~var5 != 0) {
                        var40 = var5;
                    } else {
                        var40 = class332.field4257[arg1];
                    }
                    arg4.method3077(var40, arg4.field7637, arg4.field7656, -119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "(B)V", line = 388)
    public static final void method1364(byte arg0) {
        int var1 = -92 / ((arg0 - -21) / 53);
        ++field2734;
        for (class394 var2 = (class394) class385.field5063.method49(-128); var2 != null; var2 = (class394) class385.field5063.method46((byte) 117)) {
            class26 var3 = var2.field5144;
            if (var3.field443) {
                var2.method3021(123);
                var3.method176(-1);
            } else if (class264.field3353 >= var3.field448) {
                var3.method178(class314.field4050, 123);
                if (!var3.field443) {
                    class363.method2134(var3, true);
                } else {
                    var2.method3021(93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIF)V", line = 425)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
