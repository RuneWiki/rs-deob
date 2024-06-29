import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class332 extends class424 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "Lwba;")
    private class46 field4913 = new class46();

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Lwba;")
    private class46 field4928 = new class46();

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Z")
    private boolean field4930;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4921 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    private int field4905;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    private int field4908;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    private int field4925;

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    private int field4926;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    private int field4929;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Ljava/awt/Component;")
    private Component field4931;

    @OriginalMember(owner = "client!bc", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4901++;
        this.method2083(arg0.getY(), 0, arg0.getX());
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method2079(int arg0, boolean arg1) {
        field4919++;
        class426.field6275 = 0;
        class159.field2303 = 0;
        class663.method3669(arg0 ^ 0xFFFF8F69);
        class639.method3556(arg1, -10);
        if (arg0 != -28824) {
            method2087(null, true);
        }
        class55.method604((byte) -12);
        boolean var2 = false;
        for (int var3 = 0; var3 < class159.field2303; var3++) {
            int var5 = class84.field1392[var3];
            class16 var6 = (class16) class189.field2723.method1405((long) var5, (byte) -87);
            class577 var7 = var6.field174;
            if (class623.field8731 && class322.method2015(var5, false)) {
                class569.method3243(23509);
            }
            if (class564.field7962 != var7.field6170) {
                if (var7.field8121.method3349(-1337255088)) {
                    class84.method742((byte) 121, var7);
                }
                var7.method3275(null, (byte) 89);
                var2 = true;
                var6.method3678(-1);
            }
        }
        if (var2) {
            class428.field6288 = class189.field2723.method1404((byte) -68);
            class189.field2723.method1410(class261.field3968, (byte) 46);
        }
        if (class418.field6098 != class523.field7392.field9761) {
            throw new RuntimeException("gnp1 pos:" + class523.field7392.field9761 + " psize:" + class418.field6098);
        }
        for (int var4 = 0; var4 < class217.field3042; var4++) {
            if (class189.field2723.method1405((long) class85.field1396[var4], (byte) -47) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class217.field3042);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final synchronized void method2080(int arg0) {
        this.field4905 = this.field4926;
        this.field4908 = this.field4929;
        this.field4899 = this.field4925;
        field4927++;
        class46 var2 = this.field4913;
        this.field4913 = this.field4928;
        this.field4928 = var2;
        this.field4928.method475(6);
        if (arg0 >= -97) {
            this.field4913 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    private final void method2081(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4904++;
        if (arg1 != -29739) {
            this.field4899 = 78;
        }
        class544 var6 = new class544();
        var6.field7653 = arg0;
        var6.field7657 = arg2;
        var6.field7654 = arg3;
        var6.field7652 = arg4;
        var6.field7648 = class490.method2840(true);
        this.field4928.method474(var6, 6);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)Z")
    public final boolean method2082(boolean arg0) {
        if (arg0) {
            this.method2080(-103);
        }
        field4918++;
        return (this.field4905 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
    private final void method2083(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field4925 = 59;
        }
        this.field4929 = arg2;
        field4903++;
        this.field4925 = arg0;
        if (this.field4930) {
            this.method2081(arg2, -29739, 0, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z")
    public final boolean method2084(byte arg0) {
        int var2 = -65 % ((arg0 - 54) / 50);
        field4915++;
        return (this.field4905 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public final void method2085(boolean arg0) {
        field4914++;
        this.method2091((byte) -126);
        if (!arg0) {
            this.field4929 = -93;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIII)I")
    public static final int method2086(boolean arg0, int arg1, int arg2, int arg3) {
        field4909++;
        if (class658.field9235 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class25.field365;
        int var7 = arg1 - class25.field366;
        if (!arg0) {
            return 114;
        }
        for (class627 var8 = (class627) class25.field346.method472((byte) -80); var8 != null; var8 = (class627) class25.field346.method482(119)) {
            if (var8.field8781 == arg2) {
                int var9 = var8.field8782;
                int var10 = var8.field8777;
                int var11 = class25.field366 + var10 | class25.field365 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ltf;Z)V")
    public static final void method2087(class264 arg0, boolean arg1) {
        field4912++;
        if (class466.field6707 == arg0) {
            int var2 = class523.field7392.method3851((byte) 30);
            int var3 = ((var2 & 0x78) >> 4) + class568.field7982;
            int var4 = (var2 & 0x7) + class421.field6132;
            int var5 = class523.field7392.method3851((byte) 30);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class700.field9893[var6];
            if (class686.method3786((byte) -112, class48.field817) || var3 >= 0 && var4 >= 0 && class199.field2812 > var3 && class232.field3611 > var4) {
                class192.method1291(var8, var3, 84, -1, class191.field2761, 0, -1, var4, var7, var6);
            }
        } else if (class360.field5174 == arg0) {
            class523.field7392.method3826(false);
            int var9 = class523.field7392.method3826(false);
            int var10 = (var9 >> 4 & 0x7) + class568.field7982;
            int var11 = class421.field6132 + (var9 & 0x7);
            int var12 = class523.field7392.method3847((byte) 118);
            int var13 = class523.field7392.method3826(false);
            int var14 = class523.field7392.method3873(255);
            String var15 = class523.field7392.method3836(false);
            class114.method889(var15, var10, var12, class191.field2761, var14, var13, -5725, var11);
        } else if (class294.field4325 == arg0) {
            int var16 = class523.field7392.method3869(-128);
            int var17 = (var16 & 0x7) + class421.field6132;
            int var18 = class203.field2874 + var17;
            int var19 = class568.field7982 + ((var16 & 0x7A) >> 4);
            int var20 = class109.field1672 + var19;
            int var21 = class523.field7392.method3855(-2);
            int var22 = class523.field7392.method3848(-1333735960);
            boolean var23 = var19 >= 0 && var17 >= 0 && var19 < class199.field2812 && var17 < class232.field3611;
            if (var23 || class686.method3786((byte) -112, class48.field817)) {
                class692.method3805(new class370(var22, var21), var20, class191.field2761, true, var18);
                if (var23) {
                    class443.method2627(var17, class191.field2761, var19, -28422);
                }
            }
        } else if (class8.field77 == arg0) {
            int var24 = class523.field7392.method3826(false);
            boolean var25 = (var24 & 0x80) != 0;
            int var26 = ((var24 & 0x3B) >> 3) + class568.field7982;
            int var27 = (var24 & 0x7) + class421.field6132;
            int var28 = class523.field7392.method3827((byte) -116) + var26;
            int var29 = class523.field7392.method3827((byte) 89) + var27;
            int var30 = class523.field7392.method3814(false);
            int var31 = class523.field7392.method3847((byte) 118);
            int var32 = class523.field7392.method3826(false) * 4;
            int var33 = class523.field7392.method3826(false) * 4;
            int var34 = class523.field7392.method3847((byte) 118);
            int var35 = class523.field7392.method3847((byte) 118);
            int var36 = class523.field7392.method3826(false);
            int var37 = class523.field7392.method3847((byte) 118);
            if (var36 == 255) {
                var36 = -1;
            }
            if (var26 >= 0 && var27 >= 0 && var26 < class199.field2812 && class232.field3611 > var27 && var28 >= 0 && var29 >= 0 && var28 < class199.field2812 && class232.field3611 > var29 && var31 != 65535) {
                int var38 = var37 << 2;
                int var39 = var26 * 512 + 256;
                int var40 = var32 << 2;
                int var41 = var28 * 512 + 256;
                int var42 = var33 << 2;
                int var43 = var27 * 512 + 256;
                int var44 = var29 * 512 + 256;
                class513 var45 = new class513(var31, class191.field2761, class191.field2761, var39, var43, var40, class564.field7962 + var34, var35 - -class564.field7962, var36, var38, var30, var42, var25);
                var45.method2938(class674.method3748(var41, class191.field2761, 105, var44) - var42, class564.field7962 + var34, var44, 1, var41);
                class311.field4614.method474(new class434(var45), 6);
            }
        } else if (class462.field6647 == arg0) {
            int var46 = class523.field7392.method3826(false);
            int var47 = (var46 >> 4 & 0x7) + class568.field7982;
            int var48 = class421.field6132 + (var46 & 0x7);
            int var49 = class523.field7392.method3855(-2);
            int var50 = class523.field7392.method3818((byte) 104);
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = class700.field9893[var51];
            if (class686.method3786((byte) -112, class48.field817) || var47 >= 0 && var48 >= 0 && class199.field2812 > var47 && var48 < class232.field3611) {
                class192.method1291(var53, var47, 52, var49, class191.field2761, 0, -1, var48, var52, var51);
            }
        } else if (class577.field8128 == arg0) {
            int var54 = class523.field7392.method3826(arg1);
            int var55 = class568.field7982 * 2 + (var54 >> 4 & 0xF);
            int var56 = class421.field6132 * 2 + (var54 & 0xF);
            boolean var57 = class523.field7392.method3826(false) != 0;
            int var58 = class523.field7392.method3827((byte) -92) + var55;
            int var59 = class523.field7392.method3827((byte) -88) + var56;
            int var60 = class523.field7392.method3814(false);
            int var61 = class523.field7392.method3847((byte) 118);
            int var62 = class523.field7392.method3826(false) * 4;
            int var63 = class523.field7392.method3826(arg1) * 4;
            int var64 = class523.field7392.method3847((byte) 118);
            int var65 = class523.field7392.method3847((byte) 118);
            int var66 = class523.field7392.method3826(arg1);
            int var67 = class523.field7392.method3847((byte) 118);
            if (var66 == 255) {
                var66 = -1;
            }
            if (var55 >= 0 && var56 >= 0 && var55 < (class199.field2812 * 2) && class199.field2812 * 2 > var56 && var58 >= 0 && var59 >= 0 && (class232.field3611 * 2) > var58 && var59 < (class232.field3611 * 2) && var61 != 65535) {
                int var68 = var67 << 2;
                int var69 = var63 << 2;
                int var70 = var55 * 256;
                int var71 = var56 * 256;
                int var72 = var59 * 256;
                int var73 = var62 << 2;
                int var74 = var58 * 256;
                class513 var75 = new class513(var61, class191.field2761, class191.field2761, var70, var71, var73, class564.field7962 + var64, class564.field7962 + var65, var66, var68, var60, var69, var57);
                var75.method2938(class674.method3748(var74, class191.field2761, 71, var72) - var69, class564.field7962 + var64, var72, 1, var74);
                class311.field4614.method474(new class434(var75), 6);
            }
        } else if (class360.field5168 == arg0) {
            int var76 = class523.field7392.method3826(false);
            int var77 = (var76 & 0x7) + class421.field6132;
            int var78 = class203.field2874 + var77;
            int var79 = (var76 >> 4 & 0x7) + class568.field7982;
            int var80 = class109.field1672 + var79;
            int var81 = class523.field7392.method3847((byte) 118);
            int var82 = class523.field7392.method3847((byte) 118);
            int var83 = class523.field7392.method3847((byte) 118);
            if (class22.field296 != null) {
                class44 var84 = (class44) class22.field296.method1405((long) (var78 << 14 | class191.field2761 << 28 | var80), (byte) -74);
                if (var84 != null) {
                    for (class370 var85 = (class370) var84.field705.method472((byte) -27); var85 != null; var85 = (class370) var84.field705.method482(-62)) {
                        if ((var81 & 0x7FFF) == var85.field5279 && var85.field5280 == var82) {
                            var85.method3678(-1);
                            var85.field5280 = var83;
                            class692.method3805(var85, var80, class191.field2761, true, var78);
                            break;
                        }
                    }
                    if (var79 >= 0 && var77 >= 0 && class199.field2812 > var79 && var77 < class232.field3611) {
                        class443.method2627(var77, class191.field2761, var79, -28422);
                    }
                }
            }
        } else if (class488.field6934 == arg0) {
            int var86 = class523.field7392.method3859((byte) 76);
            if (var86 == 65535) {
                var86 = -1;
            }
            int var87 = class523.field7392.method3826(arg1);
            int var88 = var87 >> 2;
            int var89 = var87 & 0x3;
            int var90 = class700.field9893[var88];
            int var91 = class523.field7392.method3851((byte) 30);
            int var92 = (var91 >> 4 & 0x7) + class568.field7982;
            int var93 = (var91 & 0x7) + class421.field6132;
            class181.method1222(-18892, var88, var92, var90, class191.field2761, var93, var86, var89);
        } else if (class153.field2208 == arg0) {
            int var94 = class523.field7392.method3826(false);
            int var95 = (var94 >> 4 & 0xF) + class568.field7982 * 2;
            int var96 = (var94 & 0xF) + class421.field6132 * 2;
            int var97 = class523.field7392.method3826(false);
            boolean var98 = (var97 & 0x1) != 0;
            int var99 = var97 >> 1;
            int var100 = class523.field7392.method3827((byte) -102) + var95;
            int var101 = var96 + class523.field7392.method3827((byte) -70);
            int var102 = class523.field7392.method3814(false);
            int var103 = class523.field7392.method3814(false);
            int var104 = class523.field7392.method3847((byte) 118);
            byte var105 = class523.field7392.method3827((byte) -68);
            int var106 = class523.field7392.method3826(false) * 4;
            int var107 = class523.field7392.method3847((byte) 118);
            int var108 = class523.field7392.method3847((byte) 118);
            int var109 = class523.field7392.method3826(false);
            if (var109 == 255) {
                var109 = -1;
            }
            int var110 = class523.field7392.method3847((byte) 118);
            if (var95 >= 0 && var96 >= 0 && (class199.field2812 * 2) > var95 && class199.field2812 * 2 > var96 && var100 >= 0 && var101 >= 0 && (class232.field3611 * 2) > var100 && var101 < class232.field3611 * 2 && var104 != 65535) {
                int var111 = var96 * 256;
                int var112 = var100 * 256;
                int var113 = var95 * 256;
                int var114 = var101 * 256;
                int var115 = var106 << 2;
                int var116 = var105 << 2;
                int var117 = var110 << 2;
                if (var102 != 0) {
                    class425 var118 = null;
                    if (var102 >= 0) {
                        int var119 = var102 - 1;
                        class16 var120 = (class16) class189.field2723.method1405((long) var119, (byte) -128);
                        if (var120 != null) {
                            var118 = var120.field174;
                        }
                    } else {
                        int var121 = -var102 - 1;
                        if (class99.field1551 == var121) {
                            var118 = class648.field9106;
                        } else {
                            var118 = class141.field2087[var121];
                        }
                    }
                    if (var118 != null) {
                        class87 var122 = var118.method2544(2);
                        if (var122.field1450 != null && var122.field1450[var99] != null) {
                            int var123 = var122.field1450[var99][0];
                            int var124 = var122.field1450[var99][2];
                            int var125 = var118.field6209.method2948((byte) -90);
                            int var126 = class189.field2719[var125];
                            int var127 = class189.field2721[var125];
                            int var128 = var123 * var127 + var124 * var126 >> 14;
                            int var129 = var124 * var127 - var123 * var126 >> 14;
                            var116 -= var122.field1450[var99][1];
                            var111 += var129;
                            var113 += var128;
                        }
                    }
                }
                class513 var131 = new class513(var104, class191.field2761, class191.field2761, var113, var111, var116, class564.field7962 + var107, class564.field7962 + var108, var109, var117, var103, var115, var98);
                var131.method2938(class674.method3748(var112, class191.field2761, 122, var114) - var115, class564.field7962 + var107, var114, 1, var112);
                class311.field4614.method474(new class434(var131), 6);
            }
        } else if (class486.field6915 == arg0) {
            int var132 = class523.field7392.method3847((byte) 118);
            int var133 = class523.field7392.method3826(false);
            class101.field1572.method2617((byte) -91, var132).method3110(!arg1, var133);
        } else if (class595.field8419 == arg0) {
            int var134 = class523.field7392.method3869(-128);
            int var135 = (var134 & 0x7) + class421.field6132;
            int var136 = class203.field2874 + var135;
            int var137 = (var134 >> 4 & 0x7) + class568.field7982;
            int var138 = class109.field1672 + var137;
            int var139 = class523.field7392.method3855(-2);
            class44 var140 = (class44) class22.field296.method1405((long) (var138 | class191.field2761 << 28 | var136 << 14), (byte) -94);
            if (var140 != null) {
                for (class370 var141 = (class370) var140.field705.method472((byte) -110); var141 != null; var141 = (class370) var140.field705.method482(119)) {
                    if ((var139 & 0x7FFF) == var141.field5279) {
                        var141.method3678(-1);
                        break;
                    }
                }
                if (var140.field705.method481((byte) -57)) {
                    var140.method3678(-1);
                }
                if (var137 >= 0 && var135 >= 0 && var137 < class199.field2812 && class232.field3611 > var135) {
                    class443.method2627(var135, class191.field2761, var137, -28422);
                }
            }
        } else if (class382.field5391 == arg0) {
            int var142 = class523.field7392.method3847((byte) 118);
            int var143 = class523.field7392.method3855(-2);
            int var144 = class523.field7392.method3818((byte) 99);
            int var145 = (var144 & 0x7) + class421.field6132;
            int var146 = class203.field2874 + var145;
            int var147 = (var144 >> 4 & 0x7) + class568.field7982;
            int var148 = class109.field1672 + var147;
            int var149 = class523.field7392.method3848(-1333735960);
            if (class99.field1551 != var149) {
                boolean var150 = var147 >= 0 && var145 >= 0 && class199.field2812 > var147 && class232.field3611 > var145;
                if (var150 || class686.method3786((byte) -112, class48.field817)) {
                    class692.method3805(new class370(var143, var142), var148, class191.field2761, !arg1, var146);
                    if (var150) {
                        class443.method2627(var145, class191.field2761, var147, -28422);
                    }
                }
            }
        } else if (class203.field2872 == arg0) {
            int var151 = class523.field7392.method3826(arg1);
            int var152 = ((var151 & 0x76) >> 4) + class568.field7982;
            int var153 = (var151 & 0x7) + class421.field6132;
            int var154 = class523.field7392.method3847((byte) 118);
            int var155 = class523.field7392.method3826(false);
            int var156 = class523.field7392.method3847((byte) 118);
            int var157 = class523.field7392.method3826(false);
            if (var152 >= 0 && var153 >= 0 && class199.field2812 > var152 && class232.field3611 > var153) {
                int var158 = var152 * 512 + 256;
                int var159 = var153 * 512 + 256;
                int var160 = class191.field2761;
                if (var160 < 3 && class261.method1718(var153, 1, var152)) {
                    var160++;
                }
                class236 var161 = new class236(var154, var156, class564.field7962, class191.field2761, var160, var158, class674.method3748(var158, class191.field2761, 105, var159) - var155, var159, var152, var152, var153, var153, var157);
                class436.field6378.method474(new class420(var161), 6);
            }
        } else if (class263.field3994 == arg0) {
            int var162 = class523.field7392.method3826(false);
            int var163 = (var162 >> 4 & 0x7) + class568.field7982;
            int var164 = class421.field6132 + (var162 & 0x7);
            int var165 = class523.field7392.method3847((byte) 118);
            if (var165 == 65535) {
                var165 = -1;
            }
            int var166 = class523.field7392.method3826(arg1);
            int var167 = (var166 & 0xF1) >> 4;
            int var168 = var166 & 0x7;
            int var169 = class523.field7392.method3826(false);
            int var170 = class523.field7392.method3826(false);
            if (var163 >= 0 && var164 >= 0 && var163 < class199.field2812 && class232.field3611 > var164) {
                int var171 = var167 + 1;
                if (var163 - var171 <= class648.field9106.field6271[0] && var163 + var171 >= class648.field9106.field6271[0] && var164 - var171 <= class648.field9106.field6262[0] && class648.field9106.field6262[0] <= (var164 + var171)) {
                    class420.method2523(var165, var169, (var164 << 8) + (class191.field2761 << 24) + (var163 << 16) + var167, 98, var168, var170);
                }
            }
        } else if (class150.field2173 == arg0) {
            int var172 = class523.field7392.method3826(arg1);
            int var173 = (var172 >> 4 & 0x7) + class568.field7982;
            int var174 = (var172 & 0x7) + class421.field6132;
            int var175 = class523.field7392.method3847((byte) 118);
            if (var175 == 65535) {
                var175 = -1;
            }
            int var176 = class523.field7392.method3826(arg1);
            int var177 = (var176 & 0xFD) >> 4;
            int var178 = var176 & 0x7;
            int var179 = class523.field7392.method3826(arg1);
            int var180 = class523.field7392.method3826(false);
            if (var173 >= 0 && var174 >= 0 && class199.field2812 > var173 && class232.field3611 > var174) {
                int var181 = var177 + 1;
                if (class648.field9106.field6271[0] >= (var173 - var181) && class648.field9106.field6271[0] <= (var173 + var181) && class648.field9106.field6262[0] >= (var174 - var181) && class648.field9106.field6262[0] <= (var174 + var181)) {
                    class57.method621(false, (class191.field2761 << 24) + (var173 << 16) + (var174 << 8) + var177, var179, (byte) 62, var178, var180, var175);
                }
            }
        } else {
            class699.method3896(75, null, "T3 - " + arg0);
            class88.method764(0, arg1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    private final void method2088(Component arg0, byte arg1) {
        field4897++;
        this.method2091((byte) 3);
        this.field4931 = arg0;
        this.field4931.addMouseListener(this);
        this.field4931.addMouseMotionListener(this);
        int var3 = 34 % ((arg1 + 1) / 49);
    }

    @OriginalMember(owner = "client!bc", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        this.method2083(arg0.getY(), 0, arg0.getX());
        field4916++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/event/MouseEvent;I)I")
    private final int method2089(MouseEvent arg0, int arg1) {
        field4924++;
        int var3 = arg0.getModifiers();
        if (arg1 <= 61) {
            this.field4926 = -26;
        }
        boolean var4 = (var3 & 0x10) != 0;
        boolean var5 = (var3 & 0x8) != 0;
        boolean var6 = (var3 & 0x4) != 0;
        if (var5 && (var4 || var6)) {
            var5 = false;
        }
        if (var4 && var6) {
            return 4;
        } else if (var4) {
            return 1;
        } else if (var5) {
            return 2;
        } else if (var6) {
            return 4;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)I")
    public final int method2090(int arg0) {
        if (arg0 == -7249) {
            field4917++;
            return this.field4908;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!bc", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4902++;
        int var2 = this.method2089(arg0, 78);
        if ((var2 & this.field4926) == 0) {
            var2 = this.field4926;
        }
        if ((var2 & 0x1) != 0) {
            this.method2081(arg0.getX(), -29739, arg0.getClickCount(), arg0.getY(), 3);
        }
        if ((var2 & 0x4) != 0) {
            this.method2081(arg0.getX(), -29739, arg0.getClickCount(), arg0.getY(), 5);
        }
        if ((var2 & 0x2) != 0) {
            this.method2081(arg0.getX(), -29739, arg0.getClickCount(), arg0.getY(), 4);
        }
        this.field4926 &= ~var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    private final void method2091(byte arg0) {
        field4898++;
        int var2 = -44 % ((-arg0 - 76) / 50);
        if (this.field4931 == null) {
            return;
        }
        this.field4931.removeMouseMotionListener(this);
        this.field4931.removeMouseListener(this);
        this.field4928 = null;
        this.field4913 = null;
        this.field4929 = this.field4925 = this.field4926 = 0;
        this.field4931 = null;
        this.field4908 = this.field4899 = this.field4905 = 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
    public final boolean method2092(int arg0) {
        if (arg0 >= -123) {
            this.method2082(true);
        }
        field4922++;
        return (this.field4905 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)I")
    public final int method2093(int arg0) {
        field4910++;
        return arg0 == 22302 ? this.field4899 : 28;
    }

    @OriginalMember(owner = "client!bc", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        this.method2083(arg0.getY(), 0, arg0.getX());
        field4907++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2094(int arg0, byte arg1, int arg2) {
        field4923++;
        if (arg1 > -109) {
            method2079(-71, false);
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4900++;
    }

    @OriginalMember(owner = "client!bc", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        field4906++;
        int var2 = this.method2089(arg0, 73);
        if (var2 == 1) {
            this.method2081(arg0.getX(), -29739, arg0.getClickCount(), arg0.getY(), 0);
        } else if (var2 == 4) {
            this.method2081(arg0.getX(), -29739, arg0.getClickCount(), arg0.getY(), 2);
        } else if (var2 == 2) {
            this.method2081(arg0.getX(), -29739, arg0.getClickCount(), arg0.getY(), 1);
        }
        this.field4926 |= var2;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!bc", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        this.method2083(arg0.getY(), 0, arg0.getX());
        field4911++;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Llp;")
    public final class356 method2095(int arg0) {
        field4920++;
        if (arg0 <= 54) {
            this.method2081(-44, 53, 3, 46, 111);
        }
        return (class356) this.field4913.method483((byte) -127);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/awt/Component;Z)V")
    public class332(Component arg0, boolean arg1) {
        this.method2088(arg0, (byte) 85);
        this.field4930 = arg1;
    }
}
