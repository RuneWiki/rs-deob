import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class706 extends class474 {

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lwh;")
    private class148 field9948;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lnc;")
    private class24 field9947;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field9939;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field9942;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field9944;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field9946;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
    public static boolean field9945;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(FLnc;Lnc;I)Z")
    public final boolean method4013(float arg0, class24 arg1, class24 arg2, int arg3) {
        field9942++;
        boolean var5 = true;
        class30 var6 = this.field9948.field2207;
        this.field9948.method530(class378.field5723);
        this.field9948.method469();
        this.field9948.method1070(arg3 - 30560);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, (double) arg3, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field9947.field245, this.field9947.field245);
        this.field9948.method1026(false, true);
        this.field9948.method1089(false, 113);
        this.field9948.method1021(1, false);
        this.field9948.method1027(false, true);
        this.field9948.method1058(-2, 28);
        this.field9948.method1024(1, (byte) -11);
        this.field9948.method1085(-2, 0.0F, 0.0F, 0.0F, arg0);
        this.field9948.method1043((byte) -45, 34165, 34165);
        this.field9948.method1088(arg2, -27749);
        this.field9948.method1024(0, (byte) -11);
        this.field9948.method1066(1, 260);
        this.field9948.method1088(arg1, -27749);
        this.field9948.method1098(var6, arg3 ^ 0x1D83EF69);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method147((byte) 67, var8, 0, this.field9947);
            var6.method150(0, true);
            if (!var6.method154(239)) {
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
        var6.method157(0, -210);
        this.field9948.method1059(var6, 515);
        this.field9948.method1024(1, (byte) -11);
        this.field9948.method1088(null, -27749);
        this.field9948.method1043((byte) -49, 8448, 8448);
        this.field9948.method1024(0, (byte) -11);
        this.field9948.method1088(null, -27749);
        OpenGL.glPopAttrib();
        this.field9948.method476(class378.field5723[0], class378.field5723[1], class378.field5723[2], class378.field5723[3]);
        if (var5 && !this.field9948.field2244) {
            this.field9947.method1358((byte) -96);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lnc;")
    public final class24 method2860(byte arg0) {
        field9946++;
        if (arg0 != 84) {
            method4014('\u0002', -9);
        }
        return this.field9947;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(CI)Z")
    public static final boolean method4014(char arg0, int arg1) {
        field9938++;
        if (arg1 <= 92) {
            method4014('4', 23);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BIZLjava/lang/String;)V")
    public static final void method4015(byte arg0, int arg1, boolean arg2, String arg3) {
        class515.method3043((byte) 90);
        field9943++;
        if (arg1 == 0) {
            class736.field10316 = class282.method1804(class492.field7019, class106.field1476, class409.field6166, class63.field916.field10183.method1426(17503) * 2, 0, -86);
            if (arg3 != null) {
                class736.field10316.method502(0);
                class66 var4 = class649.method3771(0, class338.field4915, class357.field5182, 6);
                class61 var5 = class736.field10316.method474(var4, class129.method920(class640.field8990, class357.field5182, 0), true);
                class378.method2447((byte) 84);
                class310.method1960(true, arg3, var4, var5, (byte) -124, class736.field10316);
            }
        } else {
            class60 var6 = null;
            if (arg3 != null) {
                var6 = class282.method1804(class492.field7019, class106.field1476, class409.field6166, 0, 0, -100);
                var6.method502(0);
                class66 var7 = class649.method3771(0, class338.field4915, class357.field5182, 6);
                class61 var8 = var6.method474(var7, class129.method920(class640.field8990, class357.field5182, 0), true);
                class378.method2447((byte) 84);
                class310.method1960(true, arg3, var7, var8, (byte) -124, var6);
            }
            boolean var25 = false;
            label216: {
                try {
                    var25 = true;
                    class736.field10316 = class282.method1804(class492.field7019, class106.field1476, class409.field6166, class63.field916.field10183.method1426(17503) * 2, arg1, -120);
                    if (arg3 != null) {
                        var6.method502(0);
                        class66 var9 = class649.method3771(0, class338.field4915, class357.field5182, 6);
                        class61 var10 = var6.method474(var9, class129.method920(class640.field8990, class357.field5182, 0), true);
                        class378.method2447((byte) 84);
                        class310.method1960(true, arg3, var9, var10, (byte) -124, var6);
                    }
                    if (class736.field10316.method453()) {
                        boolean var11 = true;
                        try {
                            var11 = class259.field3702.field7533 > 256;
                        } catch (Throwable var29) {
                        }
                        class415 var12;
                        if (var11) {
                            var12 = class736.field10316.method520(146800640);
                        } else {
                            var12 = class736.field10316.method520(104857600);
                        }
                        class736.field10316.method445(var12);
                        var25 = false;
                    } else {
                        var25 = false;
                    }
                    break label216;
                } catch (Throwable var30) {
                    int var13 = class63.field916.field10200.method3848(17503);
                    if (var13 == 2) {
                        class394.field5926 = true;
                    }
                    class63.field916.method4111(90, 0, class63.field916.field10200);
                    method4015((byte) 115, var13, arg2, arg3);
                    Object var10000 = null;
                    var25 = false;
                } finally {
                    if (var25) {
                        Object var18 = null;
                        if (var6 != null) {
                            try {
                                var6.method447((byte) -9);
                            } catch (Throwable var26) {
                            }
                        }
                    }
                }
                if (var6 != null) {
                    try {
                        var6.method447((byte) -9);
                    } catch (Throwable var27) {
                    }
                }
                return;
            }
            Object var17 = null;
            if (var6 != null) {
                try {
                    var6.method447((byte) -9);
                } catch (Throwable var28) {
                }
            }
        }
        class63.field916.field10200.method3842(63, !arg2);
        class63.field916.method4111(73, arg1, class63.field916.field10200);
        class114.method843(-84);
        class736.field10316.method468(10000);
        class736.field10316.method438(32);
        class124.field1673 = class736.field10316.method515();
        class562.field8014 = class736.field10316.method515();
        class149.method1106(-3);
        class736.field10316.method467(class63.field916.field10192.method4081(17503) == 1);
        if (class736.field10316.method512()) {
            class429.method2674(class63.field916.field10201.method2846(17503) == 1, -23542);
        }
        class143.method989(-4658, class736.field10316, class194.field2946 >> 3, class255.field3656 >> 3);
        class608.method3528(1);
        class424.field6300 = true;
        class367.field5284 = null;
        class349.field5105 = false;
        int var15 = -77 % ((arg0 - 53) / 59);
        class56.method392(-1);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method4016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9939++;
        if (class63.field916.field10189.method2268(17503) != 0 && arg6 != 0 && class107.field1497 < 50 && arg3 != -1) {
            class282.field4007[class107.field1497++] = new class247((byte) 1, arg3, arg6, arg5, arg1, arg2, arg4, null);
        }
        int var7 = -44 % ((arg0 + 63) / 46);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public final int method4017(int arg0) {
        field9941++;
        return arg0 == 1 ? this.field9947.field245 : -12;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lwh;I)V")
    public class706(class148 arg0, int arg1) {
        this.field9948 = arg0;
        this.field9947 = new class24(arg0, 6408, arg1);
    }
}
