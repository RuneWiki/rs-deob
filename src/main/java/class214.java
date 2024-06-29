import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class214 extends class155 {

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[F")
    private float[] field3168 = new float[4];

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Z")
    private boolean field3170 = false;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lll;")
    private class386 field3166;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lll;")
    private class386 field3171;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lll;")
    private class386 field3172;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Lll;")
    private class386 field3178;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lgl;")
    private class627 field3182;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "Z")
    private boolean field3176;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Lcja;")
    public static class46 field3181 = new class46(64);

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "[F")
    public static float[] field3185 = new float[2];

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "[I")
    public static int[] field3184 = new int[5];

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Z")
    private boolean field3167;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "Z")
    private boolean field3180;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)V")
    public static void method1496(int arg0) {
        if (arg0 != 1) {
            method1498((String) null, (String) null, false, true, 1);
        }
        field3181 = null;
        field3185 = null;
        field3184 = null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Loia;Lgj;)V")
    public class214(class97 arg0, class662 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field1597) {
            this.field3166 = class9.method59(34336, arg0, 0, arg1.method3726(-92, "gl", "uw_ground_unlit"));
            this.field3171 = class9.method59(34336, arg0, 0, arg1.method3726(-73, "gl", "uw_ground_lit"));
            this.field3172 = class9.method59(34336, arg0, 0, arg1.method3726(-104, "gl", "uw_model_unlit"));
            this.field3178 = class9.method59(34336, arg0, 0, arg1.method3726(-68, "gl", "uw_model_lit"));
            if (this.field3171 != null & this.field3166 != null & this.field3172 != null & this.field3178 != null) {
                this.field3182 = super.field2533.method3139(false, 1, false, 2, new int[] { 0, -1 });
                this.field3182.method2679(false, false, -17383);
                this.field3176 = true;
            } else {
                this.field3176 = false;
            }
        } else {
            this.field3176 = false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (this.field3180) {
            int var2 = super.field2533.method563();
            int var3 = super.field2533.method552();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field2533.method3106(0), (float) super.field2533.method3124((byte) -91) / 255.0F);
            super.field2533.method3114(1, false);
            super.field2533.method3130((byte) -99, super.field2533.method3137(-29));
            super.field2533.method3114(0, false);
        }
        if (arg0 > 87) {
            ++field3169;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lbr;II)V")
    public final void method259(class416 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            if (this.field3170) {
                super.field2533.method3143(class327.field4459, true, 0);
                super.field2533.method3168((byte) 101, 0, class327.field4459);
                this.field3170 = false;
            }
            super.field2533.method3090(arg0, (byte) -64);
            super.field2533.method3113(-3334, arg2);
        } else if (!this.field3170) {
            super.field2533.method3090(super.field2533.field7686, (byte) -88);
            super.field2533.method3113(-3334, 1);
            super.field2533.method3143(class606.field8459, true, 0);
            super.field2533.method3168((byte) 53, 0, class606.field8459);
            this.field3170 = true;
        }
        if (arg1 <= -71) {
            ++field3188;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public static final void method1497(byte arg0) {
        ++field3174;
        for (class570 var1 = (class570) class503.field6872.method3589((byte) -128); var1 != null; var1 = (class570) class503.field6872.method3591(0)) {
            if (var1.field8120) {
                var1.method3310((byte) -89);
            }
        }
        if (arg0 != 48) {
            field3184 = null;
        }
        for (class570 var2 = (class570) class536.field7294.method3589((byte) -128); var2 != null; var2 = (class570) class536.field7294.method3591(arg0 ^ 48)) {
            if (var2.field8120) {
                var2.method3310((byte) -89);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
    public final void method257(boolean arg0, boolean arg1) {
        if (!arg0) {
            ++field3186;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIB)V")
    public final void method254(int arg0, int arg1, byte arg2) {
        ++field3187;
        if (arg2 != -92) {
            this.method1210((byte) 97);
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        ++field3179;
        int var2 = -8 / ((arg0 - -8) / 41);
        return this.field3176;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
    public final void method1210(byte arg0) {
        ++field3175;
        int var2 = super.field2533.method3165(1);
        class421 var3 = super.field2533.method3094((byte) 26);
        if (!this.field3167) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field3172.field5312 : this.field3166.field5312);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field3171.field5312 : this.field3178.field5312);
        }
        OpenGL.glEnable(34336);
        if (arg0 != 2) {
            method1496(-17);
        }
        this.field3180 = true;
        var3.method2484(0.0F, arg0 + -1, this.field3168, -1.0F, (float) var2, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3168[0], this.field3168[1], this.field3168[2], this.field3168[3]);
        this.method251((byte) 114);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZZI)V")
    public static final void method1498(String arg0, String arg1, boolean arg2, boolean arg3, int arg4) {
        ++field3177;
        class537 var5 = class333.method2094(3);
        var5.field7295.method754(class733.field10124.field6570, 86);
        var5.field7295.method781(114, 0);
        int var6 = var5.field7295.field1442;
        var5.field7295.method781(11, 642);
        int[] var7 = class534.method3032(var5, 2);
        int var8 = var5.field7295.field1442;
        var5.field7295.method783((byte) 30, arg0);
        var5.field7295.method781(85, class361.field4919);
        var5.field7295.method783((byte) -104, arg1);
        var5.field7295.method794(-2, class746.field10302);
        var5.field7295.method754(class464.field6309, 64);
        var5.field7295.method754(class177.field2797.field8378, 44);
        class428.method2520(var5.field7295, 0);
        String var9 = class714.field9829;
        var5.field7295.method754(var9 == null ? 0 : 1, 94);
        if (var9 != null) {
            var5.field7295.method783((byte) -109, var9);
        }
        var5.field7295.method754(arg4, 35);
        var5.field7295.method754(!arg3 ? 0 : 1, 42);
        var5.field7295.field1442 += 7;
        var5.field7295.method768(var8, var5.field7295.field1442, var7, false);
        var5.field7295.method760(var5.field7295.field1442 - var6, 107);
        class173.method1314(arg2, var5);
        class559.field7946 = 0;
        class70.field1043 = 1;
        class769.field10608 = 0;
        class204.field3082 = -3;
        if (arg4 < 13) {
            class235.field3381 = true;
            class37.method232((byte) -116);
        }
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V")
    public final void method255(int arg0) {
        super.field2533.method3114(1, false);
        ++field3173;
        super.field2533.method3090((class416) null, (byte) 61);
        super.field2533.method3118(class671.field9318, class671.field9318, 0);
        super.field2533.method3143(class327.field4459, true, 0);
        super.field2533.method3143(class633.field8767, true, 2);
        if (arg0 > -119) {
            this.field3170 = false;
        }
        super.field2533.method3168((byte) 46, 0, class327.field4459);
        super.field2533.method3114(0, false);
        if (this.field3170) {
            super.field2533.method3143(class327.field4459, true, 0);
            super.field2533.method3168((byte) 36, 0, class327.field4459);
            this.field3170 = false;
        }
        if (this.field3180) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3180 = false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)V")
    public final void method258(int arg0, boolean arg1) {
        ++field3183;
        this.field3167 = arg1;
        super.field2533.method3114(1, false);
        super.field2533.method3090(this.field3182, (byte) -101);
        super.field2533.method3118(class371.field5051, class34.field565, 0);
        if (arg0 != 205) {
            field3181 = null;
        }
        super.field2533.method3143(class633.field8767, true, 0);
        super.field2533.method841(class327.field4459, true, 2, false, 18680);
        super.field2533.method3168((byte) 37, 0, class606.field8459);
        super.field2533.method3114(0, false);
        this.method1210((byte) 2);
    }
}
