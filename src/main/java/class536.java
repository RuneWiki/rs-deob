import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class536 extends class322 implements class614 {

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "Luba;")
    public static class392 field7661 = null;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "[I")
    public static int[] field7659 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "Lni;")
    public static class476 field7655;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(B)V", line = 6)
    public static void method3045(byte arg0) {
        field7659 = null;
        field7661 = null;
        if (arg0 == 15) {
            field7655 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILoa;)V", line = 26)
    public static final void method3046(int arg0, class635 arg1) {
        ++field7658;
        if ((class145.field1625 >= 2 || class477.field6938) && class464.field6446 == null) {
            String var2;
            if (class477.field6938 && ~class145.field1625 > -3) {
                var2 = class419.field5567 + class221.field2751.method1296(class226.field2899, (byte) 50) + class182.field2231 + " ->";
            } else if (class602.field8543 && class653.field9339.method1805((byte) -114, 81) && class145.field1625 > 2) {
                var2 = class5.method24((class208) class530.field7597.field7992.field3404.field3404, (byte) -106);
            } else {
                class208 var3 = (class208) class530.field7597.field7992.field3404;
                var2 = class5.method24(var3, (byte) -118);
                int[] var4 = null;
                if (class455.method2586(var3.field2527, (byte) 120)) {
                    var4 = class472.field6588.method1903((int) var3.field2524, (byte) 110).field7702;
                } else if (var3.field2534 == -1) {
                    if (!class662.method3721((byte) -54, var3.field2527)) {
                        if (class429.method2304(15311, var3.field2527)) {
                            Object var5 = null;
                            class335 var6;
                            if (~var3.field2527 != -1010) {
                                var6 = class195.field2339.method3729((int) (var3.field2524 >>> 32 & 2147483647L), (byte) 109);
                            } else {
                                var6 = class195.field2339.method3729((int) var3.field2524, (byte) 109);
                            }
                            if (var6.field4342 != null) {
                                var6 = var6.method1889(1, class491.field7127);
                            }
                            if (var6 != null) {
                                var4 = var6.field4375;
                            }
                        }
                    } else {
                        class443 var7 = (class443) class392.field5223.method3234((byte) -70, (long) ((int) var3.field2524));
                        if (var7 != null) {
                            class625 var8 = var7.field6107;
                            class23 var9 = var8.field8855;
                            if (var9.field229 != null) {
                                var9 = var9.method108(0, class491.field7127);
                            }
                            if (var9 != null) {
                                var4 = var9.field215;
                            }
                        }
                    }
                } else {
                    var4 = class472.field6588.method1903(var3.field2534, (byte) -126).field7702;
                }
                if (var4 != null) {
                    var2 = var2 + class392.method2140(var4, -102);
                }
            }
            if (class145.field1625 > 2) {
                var2 = var2 + "<col=ffffff> / " + (class145.field1625 + -2) + class221.field2744.method1296(class226.field2899, (byte) -77);
            }
            if (class672.field9556 == null) {
                if (class68.field743 != null && class393.field5239 == class220.field2668) {
                    int var10 = class211.field2561.method1117(class595.field8449, (byte) -62, class85.field906, var2, class626.field8884, class80.field855 + 16, 16777215, class70.field748 + 4, 0, class671.field9539);
                    class281.method1608(-12040, var10 + class612.field8650.method3622(62, var2), class80.field855, 16, class70.field748 - -4);
                }
            } else {
                class195 var11 = class672.field9556.method2094(-1, arg1);
                if (var11 == null) {
                    var11 = class211.field2561;
                }
                var11.method1120(106, var2, class647.field9164, class595.field8449, class672.field9556.field5049, class672.field9556.field4958, class672.field9556.field5035, class672.field9556.field5109, class85.field906, class389.field5197, class671.field9539, class626.field8884, class672.field9556.field5017, class292.field3791, class672.field9556.field5046);
                class281.method1608(-12040, class292.field3791[2], class292.field3791[1], class292.field3791[3], class292.field3791[0]);
            }
            if (arg0 <= 9) {
                method3045((byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V", line = 131)
    public static final void method3047(int arg0) {
        ++field7656;
        class653 var1 = class84.field896;
        synchronized (class84.field896) {
            class84.field896.method3684(-17200);
            if (arg0 != -1) {
                field7662 = 57;
            }
        }
        class653 var2 = class416.field5522;
        synchronized (class416.field5522) {
            class416.field5522.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V", line = 147)
    public static final void method3048(int arg0) {
        ++field7657;
        class345.method1919((byte) -92, class601.field8530.field2854);
        int var1 = (class345.field4493 >> 12) - -(class682.field9685 >> 3);
        int var2 = (class662.field9411 >> 12) + (class146.field1642 >> 3);
        class353.field4625 = class377.field4914.field4638 = 0;
        class377.field4914.method2591(8, 0, 8);
        byte var3 = 18;
        class233.field2974 = new int[var3][4];
        class498.field7189 = new int[var3];
        class136.field1556 = new int[var3];
        class351.field4603 = new byte[var3][];
        class196.field2362 = new byte[var3][];
        class292.field3763 = new int[var3];
        client.field3410 = new byte[var3][];
        class287.field3696 = new int[var3];
        class21.field185 = new int[var3];
        class309.field4014 = new byte[var3][];
        class383.field5136 = new int[var3];
        class583.field8295 = new byte[var3][];
        int var4 = 0;
        if (arg0 != 958375780) {
            method3045((byte) -117);
        }
        for (int var5 = (-(class399.field5338 >> 4) + var1) / 8; var5 <= ((class399.field5338 >> 4) + var1) / 8; ++var5) {
            for (int var8 = (-(class349.field4567 >> 4) + var2) / 8; var8 <= (var2 - -(class349.field4567 >> 4)) / 8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class287.field3696[var4] = var9;
                class498.field7189[var4] = class299.field3914.method1716(true, "m" + var5 + "_" + var8);
                class136.field1556[var4] = class299.field3914.method1716(true, "l" + var5 + "_" + var8);
                class292.field3763[var4] = class299.field3914.method1716(true, "n" + var5 + "_" + var8);
                class383.field5136[var4] = class299.field3914.method1716(true, "um" + var5 + "_" + var8);
                class21.field185[var4] = class299.field3914.method1716(true, "ul" + var5 + "_" + var8);
                if (class292.field3763[var4] == -1) {
                    class498.field7189[var4] = -1;
                    class136.field1556[var4] = -1;
                    class383.field5136[var4] = -1;
                    class21.field185[var4] = -1;
                }
                ++var4;
            }
        }
        for (int var6 = var4; var6 < class292.field3763.length; ++var6) {
            class292.field3763[var6] = -1;
            class498.field7189[var6] = -1;
            class136.field1556[var6] = -1;
            class383.field5136[var6] = -1;
            class21.field185[var6] = -1;
        }
        byte var7;
        if (~class351.field4601 != -4) {
            var7 = 8;
        } else {
            var7 = 4;
        }
        class162.method975(var1, false, var2, var7, (byte) 18);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(II)I", line = 242)
    public static final int method3049(int arg0, int arg1) {
        if (arg1 < 47) {
            method3046(74, (class635) null);
        }
        ++field7660;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lnfa;IZ[[I)V", line = 253)
    public class536(class621 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class581.field8260, class271.field3429, arg1 * 6 * arg1, arg2);
        super.field4183.method2696(-2, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method1818(arg1, -2061612424, var5 + 34069, arg1, arg3[var5]);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, this.method1819((byte) -107), arg1, arg1, 0, class590.method3313((byte) 71, super.field4176), super.field4183.field8814, arg3[var6], 0);
            }
        }
    }
}
