import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class595 extends class118 {

    @OriginalMember(owner = "client!sba", name = "k", descriptor = "Z")
    private boolean field8770 = false;

    @OriginalMember(owner = "client!sba", name = "n", descriptor = "Lni;")
    private class630 field8773;

    @OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
    public static int field8779 = -1;

    @OriginalMember(owner = "client!sba", name = "l", descriptor = "Lqu;")
    public static class364 field8771 = new class364(70, -1);

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
    public static int field8775;

    @OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!sba", name = "s", descriptor = "I")
    public static int field8778;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sba", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field8780;

    @OriginalMember(owner = "client!sba", name = "r", descriptor = "[Ltaa;")
    public static class272[] field8777;

    @OriginalMember(owner = "client!sba", name = "j", descriptor = "[Z")
    public static boolean[] field8769;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IBI)V")
    public final void method445(int arg0, byte arg1, int arg2) {
        ++field8776;
        if (arg1 != 23) {
            this.field8773 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Los;)V")
    public class595(class468 arg0) {
        super(arg0);
        if (arg0.field7076) {
            this.field8773 = new class630(arg0, 2);
            this.field8773.method3673(0, -1);
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2852(34165, (byte) 6, 7681);
            super.field1544.method2801(false, 34168, 2, 770);
            super.field1544.method2772(34167, 770, (byte) 93, 0);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field1544.method2842(0, (byte) 42);
            this.field8773.method3674(true);
            this.field8773.method3673(1, -1);
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2852(8448, (byte) 21, 8448);
            super.field1544.method2801(false, 34166, 2, 770);
            super.field1544.method2772(5890, 770, (byte) 109, 0);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field1544.method2842(0, (byte) 42);
            this.field8773.method3674(true);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZB)V")
    public final void method442(boolean arg0, byte arg1) {
        ++field8778;
        if (arg1 > -101) {
            field8769 = null;
        }
        class227 var3 = super.field1544.method2819((byte) -12);
        if (this.field8773 != null && var3 != null && arg0) {
            this.field8773.method3670('\u0000', false);
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811(var3, -2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field1544.field7081.method1597(84), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field1544.method2842(0, (byte) 42);
            this.field8770 = true;
        } else {
            super.field1544.method2772(34168, 770, (byte) 75, 0);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIZIIII)V")
    public static final void method3455(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8774;
        if (~class130.field1712 >= ~(-arg5 + arg6) && arg5 + arg6 <= class401.field5755 && ~class483.field7334 >= ~(arg3 - arg5) && class202.field3021 >= arg3 + arg5) {
            class70.method422(arg5, arg0, (byte) 87, arg1, arg3, arg6, arg4);
        } else {
            class14.method62(arg1, arg3, arg6, arg0, arg5, arg4, 2);
        }
        if (arg2) {
            method3456();
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "()V")
    public static final void method3456() {
        for (int var0 = 0; var0 < class318.field4753; ++var0) {
            if (!class490.field7416[var0]) {
                class323 var1 = class29.field260[var0];
                class535 var2 = var1.field4799;
                int var3 = var1.field4791;
                int var4 = var2.method3146(0) - class605.field8913;
                int var5 = (var4 * 2 >> class179.field2726) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3151(-78) - var4 >> class179.field2726;
                int var9 = var2.method3143(-102) - var4 >> class179.field2726;
                int var10 = var2.method3143(-83) + var4 >> class179.field2726;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class366.field5271) {
                    var10 = class366.field5271 - 1;
                }
                for (int var11 = var9; var11 <= var10; ++var11) {
                    short var12 = var1.field4800[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 255) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class331.field4909) {
                        var16 = class331.field4909 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; ++var17) {
                        byte var18 = 1;
                        class237 var19 = class488.method2956(var3, var17, var11, field8780 != null ? field8780 : (field8780 = method3458("lba")));
                        if (var19 != null && var19.field3467 != 0) {
                            if (var19.field3467 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4800[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 255) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4800[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 255) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field4800[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 255) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4800[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 255) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    ++var6;
                }
                class490.field7416[var0] = true;
                class235.field3455[var3].method1328(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lbaa;IB)V")
    public final void method440(class541 arg0, int arg1, byte arg2) {
        super.field1544.method2811(arg0, -2);
        if (arg2 < -17) {
            ++field8775;
            super.field1544.method2791(arg1, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)Z")
    public final boolean method446(byte arg0) {
        if (arg0 != 29) {
            this.field8770 = false;
        }
        ++field8767;
        return true;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(BZ)V")
    public final void method439(byte arg0, boolean arg1) {
        super.field1544.method2852(8448, (byte) 119, 7681);
        if (arg0 != 56) {
            field8769 = null;
        }
        ++field8768;
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
    public static void method3457(int arg0) {
        if (arg0 == -180) {
            field8769 = null;
            field8771 = null;
            field8777 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public final void method441(int arg0) {
        int var2 = 11 % ((arg0 - -58) / 41);
        ++field8772;
        if (!this.field8770) {
            super.field1544.method2772(5890, 770, (byte) -122, 0);
        } else {
            this.field8773.method3670('\u0001', false);
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            super.field1544.method2842(0, (byte) 42);
        }
        super.field1544.method2852(8448, (byte) 14, 8448);
        this.field8770 = false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3458(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
