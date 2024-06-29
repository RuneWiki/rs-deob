import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class505 extends class497 {

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Z")
    private boolean field7164 = false;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "[F")
    private float[] field7178 = new float[4];

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Lhka;")
    private class57 field7171;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lhka;")
    private class57 field7172;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Lhka;")
    private class57 field7177;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "Lhka;")
    private class57 field7185;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Z")
    private boolean field7165;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "Loga;")
    private class498 field7182;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "Lfba;")
    public static class27 field7180 = new class27(51, -1);

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field7183;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
    private boolean field7166;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Z")
    private boolean field7179;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "[Z")
    public static boolean[] field7173;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZB)V")
    public final void method928(boolean arg0, byte arg1) {
        int var3 = -36 / ((24 - arg1) / 46);
        ++field7169;
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(Z)V")
    public static final void method3047(boolean arg0) {
        ++field7181;
        if (!arg0) {
            field7180 = null;
        }
        while (~class110.field1640.method2211(class15.field293, -14568) <= -16) {
            int var1 = class110.field1640.method2216(-125, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class205 var3 = (class205) class645.field9014.method2242((long) var1, -1);
            if (var3 == null) {
                class665 var4 = new class665();
                var4.field4640 = var1;
                var3 = new class205(var4);
                class645.field9014.method2241(97, (long) var1, var3);
                var2 = true;
                class164.field2601[class36.field483++] = var3;
            }
            class665 var5 = var3.field3181;
            class216.field3356[class235.field3545++] = var1;
            var5.field4633 = class704.field9812;
            if (var5.field9240 != null && var5.field9240.method838(20710)) {
                class674.method3835(var5, (byte) -88);
            }
            var5.method3783(class575.field8103.method2439((byte) 73, class110.field1640.method2216(-101, 14)), 127);
            int var6 = class110.field1640.method2216(-114, 2);
            int var7 = class110.field1640.method2216(-115, 1);
            if (~var7 == -2) {
                class304.field4388[class45.field566++] = var1;
            }
            int var8 = class110.field1640.method2216(-99, 5);
            if (~var8 < -16) {
                var8 -= 32;
            }
            int var9 = 14756 & 4 + class110.field1640.method2216(-124, 3) << 11;
            int var10 = class110.field1640.method2216(-109, 5);
            if (~var10 < -16) {
                var10 -= 32;
            }
            int var11 = class110.field1640.method2216(-118, 1);
            var5.method2095(var5.field9240.field1635, 0);
            var5.field4619 = var5.field9240.field1634 << 3;
            if (var2) {
                var5.method2103(false, true, var9);
            }
            var5.method3788(var5.method2102(arg0), var6, var11 == 1, class210.field3250.field4670[0] + var10, class210.field3250.field4672[0] - -var8, true);
            if (var5.field9240.method838(20710)) {
                class303.method1961((class282) null, var5, (class702) null, var5.field4672[0], var5.field4670[0], 119, 0, var5.field5755);
            }
        }
        class110.field1640.method2217(-7);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
    public final void method929(int arg0, boolean arg1) {
        ++field7168;
        this.field7166 = arg1;
        super.field7086.method1192(-22137, 1);
        super.field7086.method1118(0, this.field7182);
        super.field7086.method1080(class116.field1782, class776.field10666, -30);
        super.field7086.method1180(0, (byte) 91, class683.field9465);
        super.field7086.method1158(false, true, (byte) -119, class605.field8453, 2);
        super.field7086.method1082(0, class639.field8962, (byte) -112);
        super.field7086.method1192(-22137, 0);
        if (arg0 >= -83) {
            this.method1299(true);
        }
        this.method3022(false);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
    public final void method1299(boolean arg0) {
        if (arg0) {
            this.method928(true, (byte) 85);
        }
        if (this.field7179) {
            int var2 = super.field7086.method513();
            int var3 = super.field7086.method457();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field7086.method1146(true), (float) super.field7086.method1106((byte) -56) / 255.0F);
            super.field7086.method1192(-22137, 1);
            super.field7086.method1159((byte) -104, super.field7086.method1099(118));
            super.field7086.method1192(-22137, 0);
        }
        ++field7167;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lko;Lwia;)V")
    public class505(class529 arg0, class791 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field7670) {
            this.field7171 = class40.method308(arg0, 34336, true, arg1.method4362("uw_ground_unlit", "gl", (byte) 85));
            this.field7172 = class40.method308(arg0, 34336, true, arg1.method4362("uw_ground_lit", "gl", (byte) 77));
            this.field7177 = class40.method308(arg0, 34336, true, arg1.method4362("uw_model_unlit", "gl", (byte) -101));
            this.field7185 = class40.method308(arg0, 34336, true, arg1.method4362("uw_model_lit", "gl", (byte) -94));
            if (!(this.field7185 != null & this.field7177 != null & this.field7172 != null & this.field7171 != null)) {
                this.field7165 = false;
            } else {
                this.field7182 = super.field7086.method1093((byte) 112, false, 1, new int[] { 0, -1 }, 2);
                this.field7182.method2021(false, false, (byte) 23);
                this.field7165 = true;
            }
        } else {
            this.field7165 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public final void method926(int arg0) {
        ++field7175;
        if (arg0 == -339) {
            super.field7086.method1192(-22137, 1);
            super.field7086.method1118(arg0 + 339, (class684) null);
            super.field7086.method1080(class463.field6532, class463.field6532, -30);
            super.field7086.method1180(0, (byte) 91, class605.field8453);
            super.field7086.method1180(2, (byte) 91, class683.field9465);
            super.field7086.method1082(0, class605.field8453, (byte) -112);
            super.field7086.method1192(arg0 ^ 22314, 0);
            if (this.field7164) {
                super.field7086.method1180(0, (byte) 91, class605.field8453);
                super.field7086.method1082(0, class605.field8453, (byte) -112);
                this.field7164 = false;
            }
            if (this.field7179) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field7179 = false;
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
    public final boolean method921(int arg0) {
        ++field7176;
        int var2 = -2 % ((19 - arg0) / 52);
        return this.field7165;
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "(Z)V")
    public static void method3048(boolean arg0) {
        if (!arg0) {
            method3048(true);
        }
        field7180 = null;
        field7173 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILkja;)V")
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (arg0 <= 83) {
            this.field7177 = null;
        }
        ++field7170;
        if (arg2 == null) {
            if (!this.field7164) {
                super.field7086.method1118(0, super.field7086.field2465);
                super.field7086.method1189(75, 1);
                super.field7086.method1180(0, (byte) 91, class639.field8962);
                super.field7086.method1082(0, class639.field8962, (byte) -112);
                this.field7164 = true;
                return;
            }
        } else {
            if (this.field7164) {
                super.field7086.method1180(0, (byte) 91, class605.field8453);
                super.field7086.method1082(0, class605.field8453, (byte) -112);
                this.field7164 = false;
            }
            super.field7086.method1118(0, arg2);
            super.field7086.method1189(26, arg1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(Z)V")
    public final void method3022(boolean arg0) {
        ++field7184;
        int var2 = super.field7086.method1096(127);
        class385 var3 = super.field7086.method1187(!arg0);
        if (this.field7166) {
            OpenGL.glBindProgramARB(34336, ~var2 == Integer.MIN_VALUE ? this.field7172.field720 : this.field7185.field720);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field7171.field720 : this.field7177.field720);
        }
        OpenGL.glEnable(34336);
        this.field7179 = true;
        var3.method2406(0.0F, -1.0F, (byte) 70, (float) var2, 0.0F, this.field7178);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7178[0], this.field7178[1], this.field7178[2], this.field7178[3]);
        this.method1299(arg0);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
    public final void method923(int arg0, byte arg1, int arg2) {
        ++field7183;
        if (arg1 < 5) {
            this.field7177 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I")
    public static final int method3049(int arg0, int arg1) {
        if (arg1 < 1) {
            field7180 = null;
        }
        ++field7186;
        return arg0 & 255;
    }
}
