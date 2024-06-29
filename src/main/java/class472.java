import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class472 extends class377 {

    @OriginalMember(owner = "client!via", name = "u", descriptor = "Luia;")
    public static class272 field6695 = new class272();

    @OriginalMember(owner = "client!via", name = "w", descriptor = "I")
    public static int field6697 = 0;

    @OriginalMember(owner = "client!via", name = "x", descriptor = "[F")
    public static float[] field6698 = new float[16384];

    @OriginalMember(owner = "client!via", name = "y", descriptor = "[F")
    public static float[] field6699 = new float[16384];

    @OriginalMember(owner = "client!via", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field6700 = new String[8];

    @OriginalMember(owner = "client!via", name = "A", descriptor = "D")
    public static double field6701;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!via", name = "v", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "[Lpg;")
    public static class287[] field6692;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lsm;III)Ljj;")
    public static final class657 method2840(class387 arg0, int arg1, int arg2, int arg3) {
        ++field6696;
        int var4 = arg3 << 10 | arg0.field5592;
        class657 var5 = (class657) class137.field1880.method2311((long) var4 << 16, (byte) -112);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class151.field2210.method2611((byte) -104, class151.field2210.method2622(var4, false));
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class657 var7;
                    try {
                        var7 = class3.method10(-40, var6);
                    } catch (Exception var19) {
                        throw new RuntimeException(var19.getMessage() + " S: " + var4);
                    }
                    var7.field9407 = arg0;
                    class137.field1880.method2313((long) var4 << 16, var7, (byte) -38);
                    return var7;
                }
            } else {
                int var9 = arg0.field5592 | arg1 + 65536 << 10;
                class657 var10 = (class657) class137.field1880.method2311((long) var9 << 16, (byte) -118);
                if (var10 != null) {
                    return var10;
                } else {
                    byte[] var11 = class151.field2210.method2611((byte) -97, class151.field2210.method2622(var9, false));
                    if (var11 != null) {
                        if (~var11.length >= -2) {
                            return null;
                        } else {
                            class657 var12;
                            try {
                                var12 = class3.method10(-40, var11);
                            } catch (Exception var20) {
                                throw new RuntimeException(var20.getMessage() + " S: " + var9);
                            }
                            var12.field9407 = arg0;
                            class137.field1880.method2313((long) var9 << 16, var12, (byte) -38);
                            return var12;
                        }
                    } else {
                        int var14 = arg0.field5592 | arg2;
                        class657 var15 = (class657) class137.field1880.method2311((long) var14 << 16, (byte) -112);
                        if (var15 != null) {
                            return var15;
                        } else {
                            byte[] var16 = class151.field2210.method2611((byte) -110, class151.field2210.method2622(var14, false));
                            if (var16 != null) {
                                if (~var16.length >= -2) {
                                    return null;
                                } else {
                                    class657 var17;
                                    try {
                                        var17 = class3.method10(-40, var16);
                                    } catch (Exception var21) {
                                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                                    }
                                    var17.field9407 = arg0;
                                    class137.field1880.method2313((long) var14 << 16, var17, (byte) -38);
                                    return var17;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lla;Lla;Ldw;)V")
    public class472(class423 arg0, class423 arg1, class659 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V")
    public static void method2841(int arg0) {
        field6692 = null;
        field6698 = null;
        field6699 = null;
        field6695 = null;
        field6700 = null;
        if (arg0 != 22101) {
            method2841(-30);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(III)I")
    public static final int method2842(int arg0, int arg1, int arg2) {
        if (arg2 != 500) {
            return 106;
        } else {
            ++field6693;
            if (~class177.field2470 == 0) {
                return 1;
            } else {
                if (~arg1 != ~class243.field3580.field7975.method3775(false)) {
                    class235.method1641(class608.field8633.method3543(-24350, class45.field748), true, arg1, arg2 ^ 408);
                    if (arg1 != class243.field3580.field7975.method3775(false)) {
                        return -1;
                    }
                }
                try {
                    Dimension var3 = class95.field1383.getSize();
                    class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, true, class608.field8633.method3543(-24350, class45.field748));
                    class637 var4 = class565.method3379(76, class386.field5586, class177.field2470, 0);
                    long var5 = class465.method2818(255);
                    class211.field3164.method328();
                    class182.field2510.method845(0, class231.field3477, 0);
                    class211.field3164.method364(class182.field2510);
                    class211.field3164.method398(var3.width / 2, var3.height / 2, 512, 512);
                    class211.field3164.method271(1.0F);
                    class211.field3164.method363(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                    class282 var7 = class211.field3164.method404(var4, 2048, 64, 64, 768);
                    int var8 = 0;
                    label43: for (int var9 = 0; var9 < 500; ++var9) {
                        class211.field3164.method1240(0);
                        class211.field3164.method1235();
                        for (int var10 = 15; var10 >= 0; --var10) {
                            for (int var11 = 0; var11 <= var10; ++var11) {
                                class569.field8215.method845((int) (((float) var11 + -((float) var10 / 2.0F)) * (float) class150.field2190), 0, (var10 + 1) * class150.field2190);
                                ++var8;
                                var7.method533(class569.field8215, (class373) null, 0);
                                if (-var5 + class465.method2818(arg2 + -245) >= (long) arg0) {
                                    break label43;
                                }
                            }
                        }
                    }
                    class211.field3164.method1227();
                    long var12 = (long) (var8 * 1000) / (-var5 + class465.method2818(255));
                    class211.field3164.method1240(0);
                    class211.field3164.method1235();
                    return (int) var12;
                } catch (Throwable var15) {
                    var15.printStackTrace();
                    return -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ZIII)V")
    public final void method413(boolean arg0, int arg1, int arg2, int arg3) {
        ++field6691;
        class211.field3164.method305(arg1 + arg3, arg2, super.field5449.field5617 + 4, super.field5449.field5613 + 2, ((class659) super.field5449).field9431, 0);
        class211.field3164.method305(arg1 + -1, arg2 + 1, super.field5449.field5617 + 2, super.field5449.field5613, 0, 0);
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IBIZ)V")
    public final void method417(int arg0, byte arg1, int arg2, boolean arg3) {
        if (arg1 > -69) {
            method2841(-65);
        }
        ++field6694;
        int var5 = this.method2339((byte) 6) * super.field5449.field5617 / 10000;
        class211.field3164.method397(arg2, arg0 + 2, var5, super.field5449.field5613 + -2, ((class659) super.field5449).field9433, 0);
        class211.field3164.method397(arg2 - -var5, arg0 - -2, -var5 + super.field5449.field5617, super.field5449.field5613 + -2, 0, 0);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6699[var2] = (float) Math.sin((double) var2 * var0);
            field6698[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
