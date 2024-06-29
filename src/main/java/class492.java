import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class492 extends class328 {

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    private int field6913;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field6912 = 0;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field6914 = 2;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "Lbv;")
    public static class567 field6915 = new class567("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!f", name = "L", descriptor = "Lbv;")
    public static class567 field6916 = new class567("M", "M", "M", "M");

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V", line = 3)
    public class492() {
        this(4096);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIIZI)V", line = 6)
    public static final void method2812(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field6907;
        if (arg1 != -105) {
            field6912 = 114;
        }
        if (class443.field6474 != null && (~arg3 != -4 || class202.field2854.field7920 != arg5 || class202.field2854.field7924 != arg2)) {
            class499.method2843(class270.field3976, (byte) 10, class443.field6474);
            class443.field6474 = null;
        }
        if (arg3 == 3 && class443.field6474 == null) {
            class443.field6474 = class255.method1605(arg5, class270.field3976, 0, arg2, 0, true);
            if (class443.field6474 != null) {
                class202.field2854.field7924 = arg2;
                class202.field2854.field7920 = arg5;
                class202.field2854.method2642((byte) -120, class270.field3976);
            }
        }
        if (~arg3 == -4 && class443.field6474 == null) {
            method2812(arg0, (byte) -105, -1, class202.field2854.field7925, true, -1);
        } else {
            Container var7;
            if (class443.field6474 == null) {
                if (class327.field4718 != null) {
                    Insets var6 = class327.field4718.getInsets();
                    class416.field6134 = class327.field4718.getSize().width + -var6.right + -var6.left;
                    int var10001 = var6.top + var6.bottom;
                    class638.field9262 = class327.field4718.getSize().height - var10001;
                    var7 = class327.field4718;
                } else {
                    var7 = class270.field3976.field549;
                    class416.field6134 = var7.getSize().width;
                    class638.field9262 = var7.getSize().height;
                }
            } else {
                class416.field6134 = arg5;
                var7 = class443.field6474;
                class638.field9262 = arg2;
            }
            if (arg3 != 1) {
                if (~class555.field7861 > -97 && class646.field9388 == 0) {
                    int var8 = ~class416.field6134 >= -1025 ? class416.field6134 : 1024;
                    class335.field4800 = (-var8 + class416.field6134) / 2;
                    class68.field1285 = var8;
                    int var9 = ~class638.field9262 >= -769 ? class638.field9262 : 768;
                    class39.field516 = 0;
                    class442.field6464 = var9;
                } else {
                    class68.field1285 = class416.field6134;
                    class335.field4800 = 0;
                    class39.field516 = 0;
                    class442.field6464 = class638.field9262;
                }
            } else {
                class335.field4800 = (-class356.field5086 + class416.field6134) / 2;
                class68.field1285 = class356.field5086;
                class39.field516 = 0;
                class442.field6464 = class434.field6380;
            }
            if (class563.field8065 != class47.field657) {
                boolean var10000;
                if (class68.field1285 < 1024 && ~class442.field6464 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg4) {
                class562.method3206(23874);
            } else {
                class474.field6795.setSize(class68.field1285, class442.field6464);
                class159.field2378.method402(class474.field6795);
                if (class327.field4718 != var7) {
                    class474.field6795.setLocation(class335.field4800, class39.field516);
                } else {
                    Insets var10 = class327.field4718.getInsets();
                    class474.field6795.setLocation(class335.field4800 + var10.left, class39.field516 + var10.top);
                }
            }
            if (~arg3 <= -3) {
                class74.field1378 = true;
            } else {
                class74.field1378 = false;
            }
            if (class609.field8659 != -1) {
                class185.method1240(32768, true);
            }
            if (client.field8770 != null && class541.method3037(arg1 ^ -4, class64.field893)) {
                class542.method3039(26111);
            }
            for (int var11 = 0; var11 < 100; ++var11) {
                class509.field7067[var11] = true;
            }
            class17.field258 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 157)
    public static final byte[] method2813(byte arg0, String arg1) {
        ++field6910;
        if (arg0 != -122) {
            return null;
        } else {
            int var2 = arg1.length();
            byte[] var3 = new byte[var2];
            for (int var4 = 0; var4 < var2; ++var4) {
                char var5 = arg1.charAt(var4);
                if (var5 > 0 && var5 < 128 || var5 >= 160 && var5 <= 255) {
                    var3[var4] = (byte) var5;
                } else if (~var5 != -8365) {
                    if (var5 != 8218) {
                        if (var5 == 402) {
                            var3[var4] = -125;
                        } else if (var5 == 8222) {
                            var3[var4] = -124;
                        } else if (var5 != 8230) {
                            if (~var5 == -8225) {
                                var3[var4] = -122;
                            } else if (var5 != 8225) {
                                if (var5 != 710) {
                                    if (~var5 != -8241) {
                                        if (~var5 == -353) {
                                            var3[var4] = -118;
                                        } else if (~var5 == -8250) {
                                            var3[var4] = -117;
                                        } else if (~var5 != -339) {
                                            if (~var5 != -382) {
                                                if (var5 == 8216) {
                                                    var3[var4] = -111;
                                                } else if (var5 == 8217) {
                                                    var3[var4] = -110;
                                                } else if (var5 == 8220) {
                                                    var3[var4] = -109;
                                                } else if (var5 == 8221) {
                                                    var3[var4] = -108;
                                                } else if (var5 == 8226) {
                                                    var3[var4] = -107;
                                                } else if (var5 == 8211) {
                                                    var3[var4] = -106;
                                                } else if (var5 == 8212) {
                                                    var3[var4] = -105;
                                                } else if (var5 == 732) {
                                                    var3[var4] = -104;
                                                } else if (~var5 != -8483) {
                                                    if (var5 != 353) {
                                                        if (var5 == 8250) {
                                                            var3[var4] = -101;
                                                        } else if (var5 == 339) {
                                                            var3[var4] = -100;
                                                        } else if (~var5 != -383) {
                                                            if (var5 != 376) {
                                                                var3[var4] = 63;
                                                            } else {
                                                                var3[var4] = -97;
                                                            }
                                                        } else {
                                                            var3[var4] = -98;
                                                        }
                                                    } else {
                                                        var3[var4] = -102;
                                                    }
                                                } else {
                                                    var3[var4] = -103;
                                                }
                                            } else {
                                                var3[var4] = -114;
                                            }
                                        } else {
                                            var3[var4] = -116;
                                        }
                                    } else {
                                        var3[var4] = -119;
                                    }
                                } else {
                                    var3[var4] = -120;
                                }
                            } else {
                                var3[var4] = -121;
                            }
                        } else {
                            var3[var4] = -123;
                        }
                    } else {
                        var3[var4] = -126;
                    }
                } else {
                    var3[var4] = -128;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 295)
    public static final void method2814(boolean arg0) {
        ++field6911;
        if (class181.field2622 < 1024.0F) {
            class181.field2622 = 1024.0F;
        }
        if (class181.field2622 > 3072.0F) {
            class181.field2622 = 3072.0F;
        }
        while (class523.field7256 >= 16384.0F) {
            class523.field7256 -= 16384.0F;
        }
        while (class523.field7256 < 0.0F) {
            class523.field7256 += 16384.0F;
        }
        int var1 = class8.field81 >> 7;
        if (arg0) {
            method2813((byte) 91, (String) null);
        }
        int var2 = class372.field5377 >> 7;
        int var3 = class355.method2160(class8.field81, class372.field5377, class545.field7583, (byte) 103);
        int var4 = 0;
        if (~var1 < -4 && ~var2 < -4 && ~var1 > ~(class146.field2247 + -4) && ~var2 > ~(class66.field990 - 4)) {
            for (int var5 = var1 - 4; var1 - -4 >= var5; ++var5) {
                for (int var6 = var2 + -4; var2 - -4 >= var6; ++var6) {
                    int var7 = class545.field7583;
                    if (~var7 > -4 && class402.method2455(var6, var5, 31705)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class406.field6026.field886 != null && class406.field6026.field886[var7] != null) {
                        var8 = (class406.field6026.field886[var7][var5][var6] & 255) * 8;
                    }
                    int var9 = var3 - class88.field1594[var7].method694(var5, var6) - -var8;
                    if (~var9 < ~var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (~var10 < -786433) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class32.field436 >= var10) {
            if (~class32.field436 < ~var10) {
                class32.field436 += (-class32.field436 + var10) / 80;
                return;
            }
        } else {
            class32.field436 += (var10 - class32.field436) / 24;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V", line = 381)
    public class492(int arg0) {
        super(0, true);
        this.field6913 = 4096;
        this.field6913 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BILco;)V", line = 391)
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg1 == 0) {
            this.field6913 = (arg2.method1738(255) << 12) / 255;
        }
        if (arg0 >= 75) {
            ++field6906;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V", line = 420)
    public static void method2815(byte arg0) {
        field6916 = null;
        field6915 = null;
        if (arg0 != -15) {
            method2812(-110, (byte) -66, -110, -75, true, 0);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I", line = 435)
    public final int[] method4(int arg0, int arg1) {
        ++field6909;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -109 % ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            class164.method1149(var3, 0, class449.field6539, this.field6913);
        }
        return var3;
    }
}
