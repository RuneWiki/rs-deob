import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class590 extends class326 {

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "Lag;")
    private class469 field8141;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "Ld;")
    private class327 field8139;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "[I")
    public static int[] field8140 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    public static int field8142 = 2;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public static int field8136;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public static int field8138;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)Ld;")
    public final class327 method1702(int arg0) {
        if (arg0 != 4) {
            this.field8139 = null;
        }
        field8136++;
        return this.field8139;
    }

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V")
    public static void method3260(int arg0) {
        field8140 = null;
        if (arg0 != 65534) {
            field8140 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(FLd;Ld;Z)Z")
    public final boolean method3261(float arg0, class327 arg1, class327 arg2, boolean arg3) {
        field8135++;
        boolean var5 = arg3;
        class560 var6 = this.field8141.field6534;
        this.field8141.method1057(class191.field2651);
        this.field8141.method1044();
        this.field8141.method2678((byte) 3);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field8139.field4395, this.field8139.field4395);
        this.field8141.method2630(false, (byte) 103);
        this.field8141.method2703(false, 112);
        this.field8141.method2639(-87, false);
        this.field8141.method2653(-117, false);
        this.field8141.method2693(-2, 15210);
        this.field8141.method2625(20296, 1);
        this.field8141.method2680(arg0, 0.0F, 0.0F, 8960, 0.0F);
        this.field8141.method2669(34165, -97, 34165);
        this.field8141.method2627(55, arg2);
        this.field8141.method2625(20296, 0);
        this.field8141.method2650((byte) -94, 1);
        this.field8141.method2627(53, arg1);
        this.field8141.method2673(var6, 128);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3106(0, var8, -20138, this.field8139);
            var6.method3107(18457, 0);
            if (!var6.method3113((byte) 127)) {
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
        var6.method3105((byte) 107, 0);
        this.field8141.method2621((byte) -95, var6);
        this.field8141.method2625(20296, 1);
        this.field8141.method2627(21, null);
        this.field8141.method2669(8448, -105, 8448);
        this.field8141.method2625(20296, 0);
        this.field8141.method2627(44, null);
        OpenGL.glPopAttrib();
        this.field8141.method1042(class191.field2651[0], class191.field2651[1], class191.field2651[2], class191.field2651[3]);
        if (var5 && !this.field8141.field6435) {
            this.field8139.method1577(9729);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "(I)V")
    public static final void method3262(int arg0) {
        int var1 = -74 % ((-arg0 - 58) / 42);
        field8132++;
        if (!class132.field1835) {
            return;
        }
        while (true) {
            while (class159.field2279.length > class646.field8931) {
                class277 var2 = class159.field2279[class646.field8931];
                if (var2 != null && var2.field3671 == -1) {
                    if (class384.field5110 == null) {
                        class384.field5110 = class371.field4943.method2833(var2.field3678, (byte) 85);
                    }
                    int var3 = class384.field5110.field3853;
                    if (var3 == -1) {
                        return;
                    }
                    class384.field5110 = null;
                    var2.field3671 = var3;
                    class646.field8931++;
                } else {
                    class646.field8931++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BLr;)V")
    public static final void method3263(byte arg0, class562 arg1) {
        class399.field5300 = class248.method1504(arg1, class392.field5247, true, 76);
        field8138++;
        class671.field9544 = class561.method3115(class392.field5247, arg1, 7713);
        class401.field5319 = class248.method1504(arg1, class360.field4778, true, 87);
        if (arg0 < 94) {
            field8140 = null;
        }
        class325.field4382 = class561.method3115(class360.field4778, arg1, 7713);
        class622.field8625 = class248.method1504(arg1, class90.field1087, true, -127);
        class254.field3332 = class561.method3115(class90.field1087, arg1, 7713);
    }

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)V")
    public static final void method3264(byte arg0) {
        if (arg0 != 52) {
            field8142 = 81;
        }
        class380 var1 = class162.field2320;
        synchronized (class162.field2320) {
            class162.field2320.method2168((byte) -78);
        }
        field8137++;
        class380 var2 = class83.field970;
        synchronized (class83.field970) {
            class83.field970.method2168((byte) -70);
        }
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(B)I")
    public final int method3265(byte arg0) {
        field8134++;
        int var2 = -53 / ((-arg0 - 39) / 40);
        return this.field8139.field4395;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lr;Lga;I)V")
    public static final void method3266(class562 arg0, class332 arg1, int arg2) {
        field8133++;
        class92[] var3 = class92.method512(arg1, class570.field7766, 0);
        class55.field720 = new class532[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class55.field720[var4] = arg0.method1139(var3[var4], true);
        }
        class92[] var5 = class92.method512(arg1, class324.field4371, 0);
        class99.field1196 = new class532[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class99.field1196[var6] = arg0.method1139(var5[var6], true);
        }
        class92[] var7 = class92.method512(arg1, class598.field8231, 0);
        class452.field5968 = new class532[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class452.field5968[var8] = arg0.method1139(var7[var8], true);
        }
        class92[] var9 = class92.method512(arg1, class10.field105, 0);
        class237.field3134 = new class532[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class237.field3134[var10] = arg0.method1139(var9[var10], true);
        }
        class92[] var11 = class92.method512(arg1, class259.field3390, 0);
        class116.field1489 = new class532[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class116.field1489[var12] = arg0.method1139(var11[var12], true);
        }
        class92[] var13 = class92.method512(arg1, class119.field1513, 0);
        class623.field8633 = new class532[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class623.field8633[var14] = arg0.method1139(var13[var14], true);
        }
        class92[] var15 = class92.method512(arg1, class608.field8457, 0);
        class436.field5813 = new class532[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class436.field5813[var16] = arg0.method1139(var15[var16], true);
        }
        class92[] var17 = class92.method512(arg1, class15.field208, 0);
        class138.field1880 = new class532[var17.length];
        if (arg2 != -65534) {
            return;
        }
        for (int var18 = 0; var18 < var17.length; var18++) {
            class138.field1880[var18] = arg0.method1139(var17[var18], true);
        }
        class92[] var19 = class92.method512(arg1, class335.field4523, 0);
        class410.field5399 = new class532[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class410.field5399[var20] = arg0.method1139(var19[var20], true);
        }
        class92[] var21 = class92.method512(arg1, class601.field8395, 0);
        class596.field8217 = new class532[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class596.field8217[var22] = arg0.method1139(var21[var22], true);
        }
        class92[] var23 = class92.method512(arg1, class324.field4376, 0);
        class158.field2268 = new class532[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class158.field2268[var24] = arg0.method1139(var23[var24], true);
        }
        class92[] var25 = class92.method512(arg1, class87.field1059, 0);
        class369.field4849 = new class532[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class369.field4849[var26] = arg0.method1139(var25[var26], true);
        }
        class274.field3655 = arg0.method1139(class92.method506(arg1, class312.field4203, 0), true);
        class121.field1581 = arg0.method1139(class92.method506(arg1, class527.field7292, 0), true);
        class92[] var27 = class92.method512(arg1, class600.field8348, 0);
        class364.field4808 = new class532[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class364.field4808[var28] = arg0.method1139(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lag;I)V")
    public class590(class469 arg0, int arg1) {
        this.field8141 = arg0;
        this.field8139 = new class327(arg0, 6408, arg1);
    }
}
