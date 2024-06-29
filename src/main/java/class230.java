import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class230 extends class298 {

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "Lkfa;")
    private class382 field3407;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lgfa;")
    private class656 field3405;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3411 = -1;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lka;")
    public static class206 field3404;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Lei;")
    public static class508 field3406;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lmca;")
    public static class34[] field3409;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
    public final int method1504(int arg0) {
        int var2 = 22 / (arg0 / 54);
        field3403++;
        return this.field3405.field9267;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lgfa;")
    public final class656 method1505(byte arg0) {
        int var2 = 14 / ((-arg0 - 74) / 37);
        field3412++;
        return this.field3405;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method1506(int arg0) {
        field3409 = null;
        field3404 = null;
        if (arg0 < 103) {
            field3410 = -55;
        }
        field3406 = null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lkfa;I)V")
    public class230(class382 arg0, int arg1) {
        this.field3407 = arg0;
        this.field3405 = new class656(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lgfa;FLgfa;Z)Z")
    public final boolean method1507(class656 arg0, float arg1, class656 arg2, boolean arg3) {
        field3408++;
        boolean var5 = true;
        class92 var6 = this.field3407.field5525;
        this.field3407.method764(class165.field2719);
        this.field3407.method805();
        this.field3407.method2284((byte) -64);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3405.field9267, this.field3405.field9267);
        this.field3407.method2303(arg3, -32);
        this.field3407.method2272(false, (byte) -9);
        this.field3407.method2282(false, true);
        this.field3407.method2275(false, 91);
        this.field3407.method2321(-1111, -2);
        this.field3407.method2308(1, -15115);
        this.field3407.method2329(0, 0.0F, 0.0F, 0.0F, arg1);
        this.field3407.method2328(34165, 69, 34165);
        this.field3407.method2295((byte) -115, arg0);
        this.field3407.method2308(0, -15115);
        this.field3407.method2270(1, (byte) 110);
        this.field3407.method2295((byte) -120, arg2);
        this.field3407.method2263(true, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method679(0, var8, this.field3405, 0);
            var6.method690(21589, 0);
            if (!var6.method691(-64)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
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
            } else if (var8 == 34070) {
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
            } else if (var8 == 34071) {
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
            } else if (var8 == 34072) {
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
            } else if (var8 == 34073) {
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
            } else if (var8 == 34074) {
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
        var6.method688(-117, 0);
        this.field3407.method2340((byte) 64, var6);
        this.field3407.method2308(1, -15115);
        this.field3407.method2295((byte) 57, null);
        this.field3407.method2328(8448, -123, 8448);
        this.field3407.method2308(0, -15115);
        this.field3407.method2295((byte) 44, null);
        OpenGL.glPopAttrib();
        this.field3407.method771(class165.field2719[0], class165.field2719[1], class165.field2719[2], class165.field2719[3]);
        if (var5 && !this.field3407.field5586) {
            this.field3405.method2009(9729);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
    public static final int method1508(int arg0) {
        field3402++;
        if (arg0 <= 109) {
            method1506(-33);
        }
        return class148.field2504;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method1509(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class386.field5651 = 0;
        class634.field8979 = 0;
        class387.field5674++;
        for (int var5 = 0; var5 < class310.field4305[var4]; var5++) {
            if (!class683.method3862(class431.field6138[var4][var5], arg0, arg1, arg2, arg3)) {
                class419.method2480(class431.field6138[var4][var5]);
                if (class431.field6138[var4][var5].field3164 != -1) {
                    class186.field2923[class386.field5651++] = class431.field6138[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class352.field4945[var4]; var6++) {
            if (!class683.method3862(class430.field6131[var4][var6], arg0, arg1, arg2, arg3)) {
                class419.method2480(class430.field6131[var4][var6]);
                if (class430.field6131[var4][var6].field3164 != -1) {
                    class229.field3400[class634.field8979++] = class430.field6131[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class108.field1764[var4]; var7++) {
            if (!class683.method3862(class128.field2093[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class128.field2093[var4][var7].method630(-125)) {
                    class419.method2480(class128.field2093[var4][var7]);
                    if (class128.field2093[var4][var7].field3164 != -1) {
                        class229.field3400[class634.field8979++] = class128.field2093[var4][var7];
                    }
                } else {
                    class419.method2480(class128.field2093[var4][var7]);
                    if (class128.field2093[var4][var7].field3164 != -1) {
                        class186.field2923[class386.field5651++] = class128.field2093[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class136.field2197; var8++) {
                if (!class683.method3862(class88.field1308[var8], arg0, arg1, arg2, arg3)) {
                    class419.method2480(class88.field1308[var8]);
                    if (class88.field1308[var8].field3164 != -1) {
                        if (class88.field1308[var8].method630(110)) {
                            class229.field3400[class634.field8979++] = class88.field1308[var8];
                        } else {
                            class186.field2923[class386.field5651++] = class88.field1308[var8];
                        }
                    }
                }
            }
        }
        if (class386.field5651 > 0) {
            class666.method3753(class186.field2923, 0, class386.field5651 - 1);
            for (int var9 = 0; var9 < class386.field5651; var9++) {
                class439.method2567(class186.field2923[var9], true);
            }
        }
        if (class112.field1802) {
            class490.field7029.method823(0, null);
        }
        for (int var10 = class415.field5896; var10 < class596.field8626; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class678.field9661.length;
                if (class678.field9661.length + class608.field8742 > class33.field474) {
                    var21 -= class678.field9661.length + class608.field8742 - class33.field474;
                }
                int var22 = class678.field9661[0].length;
                if (class678.field9661[0].length + class31.field458 > class687.field9758) {
                    var22 -= class678.field9661[0].length + class31.field458 - class687.field9758;
                }
                boolean[][] var23 = class513.field7625;
                if (class109.field1768) {
                    if (class215.field3244) {
                        var23 = class128.field2095[var10];
                    }
                    for (int var24 = class215.field3243; var24 < var21; var24++) {
                        int var25 = class608.field8742 + var24 - class215.field3243;
                        for (int var26 = class366.field5079; var26 < var22; var26++) {
                            if (class678.field9661[var24][var26] && !class118.method952(var10, var25, true, class31.field458 + var26 - class366.field5079)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class215.field3244) {
                    class687.field9745[var10].method1377(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class34.field487; var27++) {
                        class254.field3674[var27].method1892(new class367(var10 + 1), false);
                    }
                } else if (class432.field6142) {
                    class687.field9745[var10].method1362(class371.field5135, class22.field303, class668.field9389, class513.field7625, true, class334.field4668);
                } else {
                    class687.field9745[var10].method1377(class371.field5135, class22.field303, class668.field9389, class513.field7625, true);
                }
            } else {
                int var12 = class678.field9661.length;
                if (class678.field9661.length + class608.field8742 > class33.field474) {
                    var12 -= class678.field9661.length + class608.field8742 - class33.field474;
                }
                int var13 = class678.field9661[0].length;
                if (class678.field9661[0].length + class31.field458 > class687.field9758) {
                    var13 -= class678.field9661[0].length + class31.field458 - class687.field9758;
                }
                boolean[][] var14 = class513.field7625;
                if (class109.field1768) {
                    if (class215.field3244) {
                        var14 = class128.field2095[var10];
                    }
                    for (int var15 = class215.field3243; var15 < var12; var15++) {
                        int var16 = class608.field8742 + var15 - class215.field3243;
                        for (int var17 = class366.field5079; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class678.field9661[var15][var17]) {
                                int var18 = class31.field458 + var17 - class366.field5079;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class541.field7946[var19][var16][var18] != null && class541.field7946[var19][var16][var18].field4101 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class118.method952(var10, var16, true, var18)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class215.field3244) {
                    class687.field9745[var10].method1377(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class34.field487; var20++) {
                        class254.field3674[var20].method1892(new class367(var10 + 1), false);
                    }
                } else if (class432.field6142) {
                    class687.field9745[var10].method1362(class371.field5135, class22.field303, class668.field9389, class513.field7625, false, class334.field4668);
                } else {
                    class687.field9745[var10].method1377(class371.field5135, class22.field303, class668.field9389, class513.field7625, false);
                }
            }
        }
        if (class634.field8979 > 0) {
            class379.method2251(class229.field3400, 0, class634.field8979 - 1);
            for (int var11 = 0; var11 < class634.field8979; var11++) {
                class439.method2567(class229.field3400[var11], true);
            }
        }
    }
}
