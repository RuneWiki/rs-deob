import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class231 extends class78 {

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "Lbt;")
    private class33 field3465;

    @OriginalMember(owner = "client!cs", name = "q", descriptor = "Lhp;")
    private class221 field3460;

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "[I")
    public static int[] field3467 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
    public static int field3470 = -1;

    @OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!cs", name = "r", descriptor = "Lci;")
    public static class320 field3461;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cs", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field3471;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3469;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1547(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1541(byte arg0) {
        field3464++;
        class213 var1 = (class213) class317.field4718.method863(-1);
        int var2 = 5 % ((-arg0 - 2) / 60);
        while (var1 != null) {
            if (class461.field6675 == null) {
                var1.method421(22071);
            } else if (var1.field3213 <= class24.field349) {
                int var15 = class71.field1155[var1.field3203];
                if (var15 == 0) {
                    class468 var22 = class500.method2921(var1.field3216, var1.field3204, var1.field3210);
                    if (var22 instanceof class72) {
                        class468.method2775(var1.field3216, var1.field3204, var1.field3210);
                        class72 var23 = (class72) var22;
                        if (var23.field1179 != null) {
                            class121.method898(var1.field3216, var1.field3204, var1.field3210, var23.field1179, null);
                        }
                    }
                } else if (var15 == 1) {
                    class469 var16 = class415.method2475(var1.field3216, var1.field3204, var1.field3210);
                    if (var16 instanceof class533) {
                        class544.method3197(var1.field3216, var1.field3204, var1.field3210);
                        class533 var17 = (class533) var16;
                        if (var17.field7863 != null) {
                            class502.method2931(var1.field3216, var1.field3204, var1.field3210, var17.field7863, null);
                        }
                    }
                } else if (var15 == 2) {
                    class478 var20 = class413.method2470(var1.field3216, var1.field3204, var1.field3210, field3471 == null ? (field3471 = method1547("wo")) : field3471);
                    if (var20 instanceof class446) {
                        class244.method1604(var1.field3216, var1.field3204, var1.field3210, field3471 == null ? (field3471 = method1547("wo")) : field3471);
                        class446 var21 = (class446) var20;
                        if (var21.field6367 != null) {
                            class501.method2930(var21.field6367, false);
                        }
                    }
                } else if (var15 == 3) {
                    class108 var18 = class388.method2347(var1.field3216, var1.field3204, var1.field3210);
                    if (var18 instanceof class397) {
                        class55.method475(var1.field3216, var1.field3204, var1.field3210);
                        class397 var19 = (class397) var18;
                        if (var19.field5635 != null) {
                            class409.method2432(var1.field3216, var1.field3204, var1.field3210, var19.field5635);
                        }
                    }
                }
                var1.method421(22071);
            } else if (class24.field349 == var1.field3206) {
                int var3 = class71.field1155[var1.field3203];
                if (var3 == 0) {
                    class468 var13 = class500.method2921(var1.field3216, var1.field3204, var1.field3210);
                    if (var13 instanceof class72) {
                        var1.method421(22071);
                    } else if (class304.method1943(var1.field3216, var1.field3204, var1.field3210) == null) {
                        class72 var14 = new class72(var1.field3203, var1.field3223, var1.field3215, var1.field3221, var1.field3207, var13);
                        class121.method898(var1.field3216, var1.field3204, var1.field3210, var14, null);
                    } else {
                        var1.method421(22071);
                    }
                } else if (var3 == 1) {
                    class469 var11 = class415.method2475(var1.field3216, var1.field3204, var1.field3210);
                    if (var11 instanceof class533) {
                        var1.method421(22071);
                    } else if (class494.method2896(var1.field3216, var1.field3204, var1.field3210) == null) {
                        class533 var12 = new class533(var1.field3203, var1.field3223, var1.field3215, var1.field3221, var1.field3207, var11);
                        class502.method2931(var1.field3216, var1.field3204, var1.field3210, var12, null);
                    } else {
                        var1.method421(22071);
                    }
                } else if (var3 == 2) {
                    class478 var6 = class413.method2470(var1.field3216, var1.field3204, var1.field3210, field3471 == null ? (field3471 = method1547("wo")) : field3471);
                    if (var6 instanceof class446) {
                        var1.method421(22071);
                    } else {
                        class244.method1604(var1.field3216, var1.field3204, var1.field3210, field3471 == null ? (field3471 = method1547("wo")) : field3471);
                        class261 var7 = class277.field4139.method569((byte) 54, var1.field3214);
                        int var8;
                        int var9;
                        if (var1.field3223 == 1 || var1.field3223 == 3) {
                            var8 = var7.field3859;
                            var9 = var7.field3864;
                        } else {
                            var8 = var7.field3864;
                            var9 = var7.field3859;
                        }
                        class446 var10 = new class446(var1.field3203, var1.field3223, var1.field3216, var1.field3215, var1.field3221, var1.field3207, var1.field3204, var1.field3204 + var8 - 1, var1.field3210, var1.field3210 + var9 - 1, var6);
                        class501.method2930(var10, false);
                    }
                } else if (var3 == 3) {
                    class108 var4 = class388.method2347(var1.field3216, var1.field3204, var1.field3210);
                    if (var4 instanceof class397) {
                        var1.method421(22071);
                    } else {
                        class397 var5 = new class397(var1.field3215, var1.field3221, var1.field3207, var4);
                        class409.method2432(var1.field3216, var1.field3204, var1.field3210, var5);
                    }
                }
            }
            var1 = (class213) class317.field4718.method865(-1);
        }
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Lhp;", line = 205)
    public final class221 method599(int arg0) {
        field3462++;
        if (arg0 != 79) {
            field3461 = null;
        }
        return this.field3460;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZIIIIIII)V", line = 219)
    public static final void method1542(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg6 && arg0 == arg3 && arg4 == arg7 && arg1 == arg8) {
            class374.method2282(arg3, arg4, arg8, arg9, arg5, 0);
        } else {
            int var10 = arg5;
            int var11 = arg3;
            int var12 = arg5 * 3;
            int var13 = arg3 * 3;
            int var14 = arg6 * 3;
            int var15 = arg0 * 3;
            int var16 = arg7 * 3;
            int var17 = arg1 * 3;
            int var18 = var14 + arg4 - var16 - arg5;
            int var19 = arg8 - (arg3 - var15) - var17;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg5;
                int var34 = (var28 + var32 + var30 >> 12) + arg3;
                class374.method2282(var11, var33, var34, arg9, var10, 0);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg2) {
            field3470 = 119;
        }
        field3468++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(FLhp;Lhp;B)Z", line = 296)
    public final boolean method1543(float arg0, class221 arg1, class221 arg2, byte arg3) {
        field3466++;
        boolean var5 = true;
        class292 var6 = this.field3465.field658;
        this.field3465.method246(class112.field1650);
        this.field3465.method179();
        this.field3465.method349(20397);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3460.field3383, this.field3460.field3383);
        this.field3465.method348(3, false);
        this.field3465.method230((byte) -99, false);
        this.field3465.method296((byte) -67, false);
        this.field3465.method286(-1, false);
        this.field3465.method204(-2, 1);
        this.field3465.method277(1, (byte) 114);
        this.field3465.method310(0.0F, -128, arg0, 0.0F, 0.0F);
        this.field3465.method275(34165, 34165, 125);
        this.field3465.method285(false, arg2);
        this.field3465.method277(0, (byte) 60);
        this.field3465.method249(1, -2);
        this.field3465.method285(false, arg1);
        int var7 = -70 / ((arg3 + 52) / 35);
        this.field3465.method289(8704, var6);
        for (int var8 = 0; var8 < 6; var8++) {
            int var9 = var8 + 34069;
            var6.method1869(var9, false, 0, this.field3460);
            var6.method1868(0, true);
            if (!var6.method1866(-36054)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var9 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var9 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method1878((byte) 112, 0);
        this.field3465.method281(var6, -21590);
        this.field3465.method277(1, (byte) 77);
        this.field3465.method285(false, null);
        this.field3465.method275(8448, 8448, 126);
        this.field3465.method277(0, (byte) 127);
        this.field3465.method285(false, null);
        OpenGL.glPopAttrib();
        this.field3465.method345(class112.field1650[0], class112.field1650[1], class112.field1650[2], class112.field1650[3]);
        if (var5 && !this.field3465.field656) {
            this.field3460.method882(9728);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lbt;I)V", line = 495)
    public class231(class33 arg0, int arg1) {
        this.field3465 = arg0;
        this.field3460 = new class221(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lnt;IIIII)V", line = 508)
    public static final void method1544(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2311 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class297.field4444[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class130 var13 = client.field3117[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field2311; var14++) {
                            if (arg0.field2314[var14] == var13.field2038) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field2314[arg0.field2311++] = var13.field2038;
                        if (arg0.field2311 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field2311; var15 < 4; var15++) {
            arg0.field2314[var15] = null;
        }
    }

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V", line = 573)
    public static void method1545(int arg0) {
        field3469 = null;
        field3467 = null;
        field3461 = null;
        int var1 = -93 / ((-arg0 - 34) / 51);
    }

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)I", line = 586)
    public final int method1546(int arg0) {
        if (arg0 != -65534) {
            method1541((byte) -12);
        }
        field3463++;
        return this.field3460.field3383;
    }
}
