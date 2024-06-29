import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class169 {

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2648 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/awt/Image;")
    public Image field2642;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "[I")
    public int[] field2643;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIBI)V", line = 9)
    public static final void method1168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field2641++;
        int var8 = class34.method288(3, arg1, class33.field505, class278.field4586);
        int var9 = class34.method288(3, arg7, class33.field505, class278.field4586);
        int var10 = class34.method288(3, arg0, class341.field5494, class196.field3001);
        int var11 = class34.method288(3, arg5, class341.field5494, class196.field3001);
        int var12 = class34.method288(arg6 ^ 0x21, arg1 + arg2, class33.field505, class278.field4586);
        int var13 = class34.method288(3, arg7 - arg2, class33.field505, class278.field4586);
        for (int var14 = var8; var14 < var12; var14++) {
            class270.method1906(arg3, var11, var10, class306.field4998[var14], 127);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class270.method1906(arg3, var11, var10, class306.field4998[var15], 123);
        }
        if (arg6 != 34) {
            field2648 = -83;
        }
        int var16 = class34.method288(3, arg0 + arg2, class341.field5494, class196.field3001);
        int var17 = class34.method288(arg6 - 31, -arg2 + arg5, class341.field5494, class196.field3001);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class306.field4998[var18];
            class270.method1906(arg3, var16, var10, var19, 119);
            class270.method1906(arg4, var17, var16, var19, arg6 + 85);
            class270.method1906(arg3, var11, var17, var19, 116);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 61)
    public final void method1169(int arg0) {
        if (arg0 != 0) {
            method1172((class264) null, 79);
        }
        class317.method2280(this.field2643, this.field2644, this.field2646);
        field2647++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V", line = 77)
    public static final void method1170(int arg0, int arg1, int arg2) {
        class195.field2992.method250(21066, 94);
        if (arg1 != 31874) {
            method1171(false);
        }
        class195.field2992.method2206(arg0, (byte) -127);
        class195.field2992.method2207(false, arg2);
        field2639++;
        class34.field528++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 94)
    public static final void method1171(boolean arg0) {
        field2645++;
        if (!class245.field3886 || client.field2070) {
            return;
        }
        class50[][][] var1 = class264.field4230;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class50[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class50 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field733 != null && var6.field733.field1235 instanceof class22) {
                            class22 var7 = (class22) var6.field733.field1235;
                            if ((var6.field733.field1237 & Long.MIN_VALUE) == 0L) {
                                var7.method139(false, true, true, true, false, true, true);
                            } else {
                                var7.method139(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field747 != null) {
                            if (var6.field747.field3136 instanceof class22) {
                                class22 var8 = (class22) var6.field747.field3136;
                                if ((Long.MIN_VALUE & var6.field747.field3128) == 0L) {
                                    var8.method139(false, true, true, true, false, true, true);
                                } else {
                                    var8.method139(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field747.field3141 instanceof class22) {
                                class22 var9 = (class22) var6.field747.field3141;
                                if ((var6.field747.field3128 & Long.MIN_VALUE) == 0L) {
                                    var9.method139(false, true, true, true, false, true, true);
                                } else {
                                    var9.method139(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field732 != null) {
                            if (var6.field732.field4070 instanceof class22) {
                                class22 var10 = (class22) var6.field732.field4070;
                                if ((var6.field732.field4069 & Long.MIN_VALUE) == 0L) {
                                    var10.method139(false, true, true, true, false, true, true);
                                } else {
                                    var10.method139(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field732.field4059 instanceof class22) {
                                class22 var11 = (class22) var6.field732.field4059;
                                if ((var6.field732.field4069 & Long.MIN_VALUE) == 0L) {
                                    var11.method139(false, true, true, true, false, true, true);
                                } else {
                                    var11.method139(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field735; var12++) {
                            if (var6.field752[var12].field4071 instanceof class22) {
                                class22 var13 = (class22) var6.field752[var12].field4071;
                                if ((Long.MIN_VALUE & var6.field752[var12].field4076) == 0L) {
                                    var13.method139(false, true, true, true, false, true, true);
                                } else {
                                    var13.method139(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            field2648 = 63;
        }
        client.field2070 = true;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 241)
    protected class169() {
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lsi;I)Z", line = 249)
    public static final boolean method1172(class264 arg0, int arg1) {
        field2640++;
        if (arg0.field4185 == null) {
            return false;
        }
        if (arg1 != -1633) {
            method1170(-115, 67, -122);
        }
        for (int var2 = 0; var2 < arg0.field4185.length; var2++) {
            int var3 = class129.method841((byte) -58, arg0, var2);
            int var4 = arg0.field4246[var2];
            if (arg0.field4185[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field4185[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field4185[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
    public abstract void method1166(boolean arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1167(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method1165(int arg0, int arg1, int arg2, Component arg3);
}
