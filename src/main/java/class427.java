import jaclib.memory.Stream;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class427 extends class35 {

    @OriginalMember(owner = "client!mea", name = "Cb", descriptor = "[I")
    public static int[] field5964 = new int[500];

    @OriginalMember(owner = "client!mea", name = "Eb", descriptor = "F")
    public static float field5966;

    @OriginalMember(owner = "client!mea", name = "Db", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!mea", name = "Fb", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!mea", name = "Gb", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!mea", name = "Hb", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!mea", name = "Ab", descriptor = "Leq;")
    public static class209 field5962;

    @OriginalMember(owner = "client!mea", name = "Bb", descriptor = "Lkr;")
    public static class743 field5963;

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(I)V", line = 11)
    public class427(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "(I)V", line = 14)
    public static void method2595(int arg0) {
        field5962 = null;
        field5964 = null;
        field5963 = null;
        if (arg0 != 1) {
            field5962 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IF)V", line = 27)
    public final void method2596(int arg0, float arg1) {
        ++field5969;
        if (arg0 <= 59) {
            this.method2596(21, 1.0912617F);
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field483[super.field469++] = (byte) var3;
        super.field483[super.field469++] = (byte) (var3 >> 8);
        super.field483[super.field469++] = (byte) (var3 >> 16);
        super.field483[super.field469++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BF)V", line = 46)
    public final void method2597(byte arg0, float arg1) {
        if (arg0 != 46) {
            field5962 = null;
        }
        ++field5967;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field483[super.field469++] = (byte) (var3 >> 24);
        super.field483[super.field469++] = (byte) (var3 >> 16);
        super.field483[super.field469++] = (byte) (var3 >> 8);
        super.field483[super.field469++] = (byte) var3;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ZILjava/lang/String;Ljava/awt/Color;)V", line = 62)
    public static final void method2598(Color arg0, Color arg1, boolean arg2, int arg3, String arg4, Color arg5) {
        try {
            Graphics var6 = class567.field8085.getGraphics();
            if (class705.field9872 == null) {
                class705.field9872 = new Font("Helvetica", 1, 13);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class158.field2369 == null) {
                    class158.field2369 = class567.field8085.createImage(class206.field2956, class363.field5105);
                }
                Graphics var7 = class158.field2369.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class206.field2956, class363.field5105);
                int var8 = class206.field2956 / 2 + -152;
                int var9 = class363.field5105 / 2 + -18;
                var7.setColor(arg5);
                if (arg2) {
                    return;
                }
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var8 + 2, var9 - -2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(var8 + 2 - -(arg3 * 3), var9 - -2, -(arg3 * 3) + 300, 30);
                var7.setFont(class705.field9872);
                var7.setColor(arg1);
                var7.drawString(arg4, var8 + (304 + -(6 * arg4.length())) / 2, var9 + 22);
                if (class586.field8251 != null) {
                    var7.setFont(class705.field9872);
                    var7.setColor(arg1);
                    var7.drawString(class586.field8251, class206.field2956 / 2 + -(class586.field8251.length() * 6 / 2), class363.field5105 / 2 + -26);
                }
                var6.drawImage(class158.field2369, 0, 0, (ImageObserver) null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class206.field2956, class363.field5105);
                int var10 = class206.field2956 / 2 - 152;
                int var11 = class363.field5105 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg0);
                var6.fillRect(var10 - -2, var11 + 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg3 * 3 + (var10 - -2), var11 - -2, -(arg3 * 3) + 300, 30);
                var6.setFont(class705.field9872);
                var6.setColor(arg1);
                if (class586.field8251 != null) {
                    var6.setFont(class705.field9872);
                    var6.setColor(arg1);
                    var6.drawString(class586.field8251, class206.field2956 / 2 + -(6 * class586.field8251.length() / 2), class363.field5105 / 2 - 26);
                }
                var6.drawString(arg4, (304 + -(arg4.length() * 6)) / 2 + var10, var11 - -22);
            }
        } catch (Exception var13) {
            class567.field8085.repaint();
        }
        ++field5965;
    }

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "(I)V", line = 152)
    public static final void method2599(int arg0) {
        ++field5968;
        for (int var1 = 0; class570.field8115 > var1; ++var1) {
            class710 var3 = class719.field10073[var1];
            boolean var4 = false;
            if (var3.field9922 != null) {
                if (!var3.field9922.method3618(-126)) {
                    var4 = true;
                }
            } else {
                --var3.field9914;
                if (var3.field9914 >= (var3.method3967((byte) -128) ? -1500 : -10)) {
                    if (~var3.field9915 == -2 && var3.field9923 == null) {
                        var3.field9923 = class88.method829(class662.field9317, var3.field9924, 0);
                        if (var3.field9923 == null) {
                            continue;
                        }
                        var3.field9914 += var3.field9923.method828();
                    } else if (var3.method3967((byte) -128) && (var3.field9917 == null || var3.field9916 == null)) {
                        if (var3.field9917 == null) {
                            var3.field9917 = class5.method32(class710.field9930, var3.field9924);
                        }
                        if (var3.field9917 == null) {
                            continue;
                        }
                        if (var3.field9916 == null) {
                            var3.field9916 = var3.field9917.method27(new int[] { 22050 });
                            if (var3.field9916 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field9914 < 0) {
                        int var5 = 8192;
                        int var6;
                        if (~var3.field9926 == -1) {
                            var6 = var3.field9927 * (var3.field9915 == 3 ? class471.field6781.field6666.method3134(27669) : class471.field6781.field6690.method3134(27669)) >> 2;
                        } else {
                            int var7 = (51960847 & var3.field9926) >> 24;
                            if (class468.field6748.field649 != var7) {
                                var6 = 0;
                            } else {
                                int var8 = var3.field9926 << 9 & 130560;
                                int var9 = class468.field6748.method482(false) << 8;
                                int var10 = (var3.field9926 & 16753020) >> 16;
                                int var11 = (var10 << 9) + 256 + -class468.field6748.field644 + var9;
                                int var12 = 255 & var3.field9926 >> 8;
                                int var13 = (var12 << 9) + -class468.field6748.field648 + var9 + 256;
                                int var14 = Math.abs(var11) + Math.abs(var13) + -512;
                                if (~var8 > ~var14) {
                                    var3.field9914 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = class471.field6781.field6685.method3134(27669) * (-var14 + var8) * var3.field9927 / var8 >> 2;
                                if (var3.field9925 != null && var3.field9925 instanceof class113) {
                                    class113 var15 = (class113) var3.field9925;
                                    short var16 = var15.field1814;
                                    short var17 = var15.field1820;
                                }
                                if (~var11 != -1 || var13 != 0) {
                                    int var18 = 16383 & -4096 + -class239.field3371 + -((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D));
                                    if (~var18 < -8193) {
                                        var18 = -var18 + 16384;
                                    }
                                    int var19;
                                    if (~var14 < -1) {
                                        if (~var14 <= -4097) {
                                            var19 = 16384;
                                        } else {
                                            var19 = (-var14 + 8192) / 4096 + 8192;
                                        }
                                    } else {
                                        var19 = 8192;
                                    }
                                    var5 = (-var19 + 16384 >> 1) + var18 * var19 / 8192;
                                }
                            }
                        }
                        if (var6 > 0) {
                            class690 var20 = null;
                            if (~var3.field9915 != -2) {
                                if (var3.method3967((byte) -128)) {
                                    var20 = var3.field9916;
                                }
                            } else {
                                var20 = var3.field9923.method831().method3873(class67.field1219);
                            }
                            class294 var21 = var3.field9922 = class294.method1896(var20, var3.field9921, var6, var5);
                            var21.method1888(var3.field9920 + -1);
                            class484.field6848.method4053(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            }
            if (var4) {
                --class570.field8115;
                for (int var22 = var1; ~var22 > ~class570.field8115; ++var22) {
                    class719.field10073[var22] = class719.field10073[var22 + 1];
                }
                --var1;
            }
        }
        if (arg0 < 66) {
            method2599(6);
        }
        if (class90.field1607 && !class225.method1556(-68)) {
            if (~class471.field6781.field6669.method3134(27669) != -1 && ~class122.field1893 != 0) {
                if (class523.field7409 != null) {
                    class278.method1822(false, 0, class122.field1893, (byte) 28, class471.field6781.field6669.method3134(27669), class523.field7409, class351.field4955);
                } else {
                    class348.method2182(0, class122.field1893, false, class351.field4955, class471.field6781.field6669.method3134(27669), false);
                }
            }
            class523.field7409 = null;
            class90.field1607 = false;
        } else if (~class471.field6781.field6669.method3134(27669) != -1 && ~class122.field1893 != 0 && !class225.method1556(-111)) {
            ++class528.field7504;
            class135 var2 = class273.method1801(class459.field6629, class98.field1672, 2);
            var2.field2109.method233(class122.field1893, -23162);
            class539.method3178(var2, -18925);
            class122.field1893 = -1;
        }
    }
}
