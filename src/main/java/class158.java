import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class158 extends class169 {

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    public int field2309 = -1;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "Ljava/lang/String;")
    public String field2303;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "Ljava/lang/String;")
    public String field2304;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)Lnn;", line = 5)
    public final class239 method1150(int arg0) {
        if (arg0 != 28109) {
            return null;
        } else {
            ++field2312;
            return class231.field3420[super.field2393];
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 16)
    public static final void method1151(int arg0) {
        ++field2306;
        int var1 = -119 % ((arg0 - 36) / 55);
        if (class213.field3016 == null) {
            int var2 = class238.field3520;
            int var3 = class19.field251;
            int var4 = -class24.field307 + class261.field3865 + -var2;
            int var5 = -class316.field4643 + class338.field4901 + -var3;
            if (~var2 < -1 || var4 > 0 || var3 > 0 || var5 > 0) {
                try {
                    Container var6;
                    if (class369.field5255 != null) {
                        var6 = class369.field5255;
                    } else {
                        var6 = class401.field5628.field3154;
                    }
                    int var7 = 0;
                    int var8 = 0;
                    if (class369.field5255 == var6) {
                        Insets var9 = class369.field5255.getInsets();
                        var8 = var9.top;
                        var7 = var9.left;
                    }
                    Graphics var10 = var6.getGraphics();
                    var10.setColor(Color.black);
                    if (var2 > 0) {
                        var10.fillRect(var7, var8, var2, class338.field4901);
                    }
                    if (~var3 < -1) {
                        var10.fillRect(var7, var8, class261.field3865, var3);
                    }
                    if (var4 > 0) {
                        var10.fillRect(class261.field3865 + var7 - var4, var8, var4, class338.field4901);
                    }
                    if (var5 > 0) {
                        var10.fillRect(var7, -var5 + var8 + class338.field4901, class261.field3865, var5);
                        return;
                    }
                } catch (Exception var11) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V", line = 82)
    public static final void method1152(int arg0) {
        for (int var1 = 0; ~var1 > -101; ++var1) {
            class353.field5126[var1] = true;
        }
        if (arg0 > -102) {
            method1151(-29);
        }
        ++field2307;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLml;ILlf;)V", line = 104)
    public static final void method1153(byte arg0, class219 arg1, int arg2, class130 arg3) {
        ++field2305;
        class396 var4 = new class396();
        var4.field5575 = arg3.method837(true);
        var4.field5579 = arg3.method815(true);
        var4.field5570 = new int[var4.field5575];
        var4.field5578 = new class156[var4.field5575];
        var4.field5569 = new int[var4.field5575];
        var4.field5572 = new class156[var4.field5575];
        var4.field5580 = new int[var4.field5575];
        if (arg0 != 54) {
            method1151(36);
        }
        var4.field5574 = new byte[var4.field5575][][];
        for (int var5 = 0; ~var5 > ~var4.field5575; ++var5) {
            try {
                int var6 = arg3.method837(true);
                if (var6 != 0 && var6 != 1 && var6 != 2) {
                    if (~var6 == -4 || ~var6 == -5) {
                        String var10 = arg3.method843(arg0 ^ -77);
                        String var11 = arg3.method843(arg0 + -139);
                        int var12 = arg3.method837(true);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; ~var12 < ~var14; ++var14) {
                            var13[var14] = arg3.method843(-102);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; var16 < var12; ++var16) {
                                int var17 = arg3.method815(true);
                                var15[var16] = new byte[var17];
                                arg3.method853(0, var17, var15[var16], true);
                            }
                        }
                        var4.field5570[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class259.method1793((byte) 27, var13[var19]);
                        }
                        var4.field5572[var5] = arg1.method1540(var11, 27783, class259.method1793((byte) 27, var10), var18);
                        var4.field5574[var5] = var15;
                    }
                } else {
                    String var7 = arg3.method843(-110);
                    String var8 = arg3.method843(arg0 ^ -76);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg3.method815(true);
                    }
                    var4.field5570[var5] = var6;
                    var4.field5569[var5] = var9;
                    var4.field5578[var5] = arg1.method1528(true, var8, class259.method1793((byte) 27, var7));
                }
            } catch (ClassNotFoundException var20) {
                var4.field5580[var5] = -1;
            } catch (SecurityException var21) {
                var4.field5580[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field5580[var5] = -3;
            } catch (Exception var23) {
                var4.field5580[var5] = -4;
            } catch (Throwable var24) {
                var4.field5580[var5] = -5;
            }
        }
        class34.field427.method2756(arg0 ^ 14, var4);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V", line = 217)
    public static final void method1154(int arg0, int arg1) {
        class139.field2125 = -1;
        class209.field2986 = -1;
        ++field2310;
        class170.field2407 = arg1;
        class177.method1267((byte) 90);
        if (arg0 != 1) {
            field2302 = -88;
        }
    }
}
