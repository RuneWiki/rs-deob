import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class238 extends class681 {

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "[F")
    private float[] field3263 = new float[4];

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lwda;")
    private class592 field3271;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lwda;")
    private class592 field3264;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lwda;")
    private class592 field3259;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lwda;")
    private class592 field3262;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Lcm;")
    private class679 field3270;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
    private boolean field3267;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3258 = new String[100];

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "Lgo;")
    public static class581 field3277 = new class581(12, 0, 1, 0);

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "Llh;")
    public static class487 field3279 = new class487(7, -1);

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Z")
    private boolean field3269;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "Z")
    private boolean field3278;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public final void method740(int arg0) {
        super.field9721.method2201((byte) 124, 1);
        ++field3260;
        super.field9721.method2241((class218) null, (byte) 44);
        if (arg0 == -3) {
            super.field9721.method2199(class334.field4505, 9797, class334.field4505);
            super.field9721.method2264(9, class262.field3553, 0);
            super.field9721.method2264(9, class452.field6221, 2);
            super.field9721.method2223(0, class262.field3553, (byte) -111);
            super.field9721.method2201((byte) 119, 0);
            if (this.field3278) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field3278 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        ++field3268;
        return !arg0 ? true : this.field3267;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
    public final void method742(int arg0, int arg1, byte arg2) {
        ++field3272;
        int var4 = -41 / ((arg2 - -38) / 35);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method748(int arg0) {
        ++field3261;
        if (this.field3278) {
            int var2 = super.field9721.method142();
            int var3 = super.field9721.method133();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9721.method2225(false), (float) super.field9721.method2237(42) / 255.0F);
            super.field9721.method2201((byte) -60, 1);
            super.field9721.method2233(false, super.field9721.method2239(arg0 + -18619));
            super.field9721.method2201((byte) 117, 0);
        }
        if (arg0 != 20060) {
            this.method740(111);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        ++field3273;
        if (arg1 != 7) {
            this.method741(true, -84);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1487(int arg0, byte arg1, int arg2) {
        if (arg1 < 90) {
            return false;
        } else {
            ++field3274;
            return ~(1024 & arg0) != -1;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(ZI)V")
    public final void method741(boolean arg0, int arg1) {
        this.field3269 = arg0;
        ++field3275;
        super.field9721.method2201((byte) -12, 1);
        super.field9721.method2241(this.field3270, (byte) 44);
        super.field9721.method2199(class127.field1821, 9797, class276.field3814);
        super.field9721.method2264(9, class452.field6221, 0);
        super.field9721.method1052(false, 2, true, class262.field3553, 114);
        super.field9721.method2223(0, class78.field1179, (byte) -115);
        super.field9721.method2201((byte) 122, 0);
        this.method743(556);
        if (arg1 != 3) {
            this.field3269 = true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
    public static void method1488(byte arg0) {
        field3279 = null;
        if (arg0 == 99) {
            field3258 = null;
            field3277 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ltba;Lsea;)V")
    public class238(class147 arg0, class648 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field2172) {
            this.field3271 = class43.method372(34336, arg0, arg1.method3642(80, "uw_ground_unlit", "gl"), (byte) 81);
            this.field3264 = class43.method372(34336, arg0, arg1.method3642(118, "uw_ground_lit", "gl"), (byte) -99);
            this.field3259 = class43.method372(34336, arg0, arg1.method3642(111, "uw_model_unlit", "gl"), (byte) -92);
            this.field3262 = class43.method372(34336, arg0, arg1.method3642(87, "uw_model_lit", "gl"), (byte) -105);
            if (this.field3262 != null & this.field3264 != null & this.field3271 != null & this.field3259 != null) {
                this.field3270 = super.field9721.method2206(false, new int[] { 0, -1 }, 1, 2, -12482);
                this.field3270.method2137(false, 105, false);
                this.field3267 = true;
            } else {
                this.field3267 = false;
            }
        } else {
            this.field3267 = false;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILrga;I)V")
    public final void method744(int arg0, class218 arg1, int arg2) {
        super.field9721.method2241(arg1, (byte) 44);
        if (arg2 != -3) {
            this.field3263 = null;
        }
        ++field3265;
        super.field9721.method2246(arg0, 26770);
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public final void method743(int arg0) {
        ++field3276;
        int var2 = super.field9721.method2218((byte) 104);
        class274 var3 = super.field9721.method2214(-96);
        if (!this.field3269) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field3259.field8290 : this.field3271.field8290);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field3264.field8290 : this.field3262.field8290);
        }
        OpenGL.glEnable(34336);
        if (arg0 != 556) {
            method1487(-90, (byte) 38, -51);
        }
        this.field3278 = true;
        var3.method1699((byte) -29, this.field3263, -1.0F, 0.0F, (float) var2, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3263[0], this.field3263[1], this.field3263[2], this.field3263[3]);
        this.method748(20060);
    }
}
