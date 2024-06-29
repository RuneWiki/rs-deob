import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class383 extends class429 {

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Z")
    private boolean field5364 = false;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "[F")
    private float[] field5363 = new float[4];

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Loga;")
    private class180 field5372;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Loga;")
    private class180 field5368;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Loga;")
    private class180 field5381;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Loga;")
    private class180 field5378;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Z")
    private boolean field5374;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Llba;")
    private class225 field5369;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lcp;")
    public static class271 field5370 = new class271();

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lsv;")
    public static class570 field5379 = new class570(11, 16);

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Z")
    public static boolean field5382 = false;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Z")
    private boolean field5367;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Z")
    private boolean field5373;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method48(byte arg0) {
        ++field5362;
        if (arg0 != -128) {
            this.field5363 = null;
        }
        return this.field5374;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Len;ZI)V", line = 15)
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        ++field5365;
        if (arg0 == null) {
            if (!this.field5364) {
                super.field5939.method988(1, super.field5939.field1900);
                super.field5939.method949(1, (byte) 57);
                super.field5939.method1014(0, 106, class317.field4535);
                super.field5939.method973(0, class317.field4535, (byte) 123);
                this.field5364 = true;
            }
        } else {
            if (this.field5364) {
                super.field5939.method1014(0, 98, class264.field3730);
                super.field5939.method973(0, class264.field3730, (byte) 109);
                this.field5364 = false;
            }
            super.field5939.method988(1, arg0);
            super.field5939.method949(arg2, (byte) 57);
        }
        if (arg1) {
            this.method43(-89, false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V", line = 52)
    public final void method44(boolean arg0, boolean arg1) {
        this.field5367 = arg0;
        ++field5377;
        super.field5939.method959(1, 109);
        super.field5939.method988(1, this.field5369);
        super.field5939.method974(class407.field5606, class552.field7657, (byte) -59);
        super.field5939.method1014(0, 74, class504.field6917);
        super.field5939.method139(2, arg1, true, class264.field3730, 0);
        super.field5939.method973(0, class317.field4535, (byte) 113);
        super.field5939.method959(0, 120);
        this.method1096(37);
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V", line = 69)
    public final void method1101(int arg0) {
        if (this.field5373) {
            int var2 = super.field5939.method445();
            int var3 = super.field5939.method462();
            float var4 = (float) var2 + -((float) (var2 - var3) * 0.125F);
            float var5 = (float) var2 - (float) (var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5939.method998(5), (float) super.field5939.method1016(true) / 255.0F);
            super.field5939.method959(1, 124);
            super.field5939.method1001(super.field5939.method1010((byte) -111), (byte) -104);
            super.field5939.method959(0, 119);
        }
        ++field5366;
        if (arg0 != 1) {
            this.field5368 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lfc;Lgga;)V", line = 167)
    public class383(class642 arg0, class513 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field9132) {
            this.field5372 = class236.method1595(34336, arg1.method3017(0, "uw_ground_unlit", "gl"), 32635, arg0);
            this.field5368 = class236.method1595(34336, arg1.method3017(0, "uw_ground_lit", "gl"), 32635, arg0);
            this.field5381 = class236.method1595(34336, arg1.method3017(0, "uw_model_unlit", "gl"), 32635, arg0);
            this.field5378 = class236.method1595(34336, arg1.method3017(0, "uw_model_lit", "gl"), 32635, arg0);
            if (!(this.field5378 != null & this.field5372 != null & this.field5368 != null & this.field5381 != null)) {
                this.field5374 = false;
            } else {
                this.field5369 = super.field5939.method944(1, 2, 21028, new int[] { 0, -1 }, false);
                this.field5369.method333(false, false, 7536);
                this.field5374 = true;
            }
        } else {
            this.field5374 = false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V", line = 101)
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 == 37) {
            ++field5375;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 111)
    public static void method2315(boolean arg0) {
        field5379 = null;
        if (arg0) {
            field5370 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V", line = 126)
    public final void method47(byte arg0) {
        super.field5939.method959(1, 119);
        ++field5380;
        super.field5939.method988(1, (class408) null);
        super.field5939.method974(class317.field4523, class317.field4523, (byte) -59);
        super.field5939.method1014(0, 90, class264.field3730);
        super.field5939.method1014(2, 55, class504.field6917);
        int var2 = -127 % ((-56 - arg0) / 48);
        super.field5939.method973(0, class264.field3730, (byte) 120);
        super.field5939.method959(0, -47);
        if (this.field5364) {
            super.field5939.method1014(0, 114, class264.field3730);
            super.field5939.method973(0, class264.field3730, (byte) 92);
            this.field5364 = false;
        }
        if (this.field5373) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field5373 = false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lit;ILit;)V", line = 193)
    public static final void method2316(class766 arg0, int arg1, class766 arg2) {
        ++field5361;
        if (arg2.field10584 != null) {
            arg2.method4237(-1);
        }
        arg2.field10584 = arg0.field10584;
        arg2.field10591 = arg0;
        arg2.field10584.field10591 = arg2;
        if (arg1 >= 119) {
            arg2.field10591.field10584 = arg2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V", line = 214)
    public final void method43(int arg0, boolean arg1) {
        ++field5371;
        if (arg0 != 0) {
            this.method1096(-124);
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V", line = 225)
    public final void method1096(int arg0) {
        ++field5376;
        int var2 = super.field5939.method982(arg0 ^ 80);
        class742 var3 = super.field5939.method945(1);
        if (this.field5367) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field5368.field2750 : this.field5378.field2750);
        } else {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field5381.field2750 : this.field5372.field2750);
        }
        OpenGL.glEnable(34336);
        this.field5373 = true;
        var3.method4100((float) var2, (byte) 105, 0.0F, -1.0F, 0.0F, this.field5363);
        if (arg0 != 37) {
            method2315(false);
        }
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field5363[0], this.field5363[1], this.field5363[2], this.field5363[3]);
        this.method1101(1);
    }
}
