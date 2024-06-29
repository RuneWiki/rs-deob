import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class83 extends class719 {

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "[F")
    private float[] field1164 = new float[4];

    @OriginalMember(owner = "client!aw", name = "H", descriptor = "Z")
    private boolean field1180 = false;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "Lkfa;")
    private class627 field1165;

    @OriginalMember(owner = "client!aw", name = "I", descriptor = "Lkfa;")
    private class627 field1181;

    @OriginalMember(owner = "client!aw", name = "G", descriptor = "Lkfa;")
    private class627 field1179;

    @OriginalMember(owner = "client!aw", name = "C", descriptor = "Lkfa;")
    private class627 field1176;

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "Z")
    private boolean field1167;

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "Lfk;")
    private class678 field1163;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "[J")
    public static long[] field1166 = new long[32];

    @OriginalMember(owner = "client!aw", name = "K", descriptor = "Ljb;")
    public static class519 field1183 = new class519(26, 6);

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!aw", name = "w", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!aw", name = "E", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!aw", name = "F", descriptor = "Lij;")
    public static class443 field1178;

    @OriginalMember(owner = "client!aw", name = "N", descriptor = "Lcq;")
    public static class492 field1185;

    @OriginalMember(owner = "client!aw", name = "v", descriptor = "Z")
    private boolean field1169;

    @OriginalMember(owner = "client!aw", name = "O", descriptor = "Z")
    private boolean field1186;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLb;I)V")
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        ++field1171;
        if (!arg0) {
            this.method219(98, -96, 100);
        }
        if (arg1 == null) {
            if (!this.field1180) {
                super.field9776.method3882(0, super.field9776.field9539);
                super.field9776.method3871(0, 1);
                super.field9776.method3859(123, 0, class417.field6010);
                super.field9776.method3867((byte) 18, class417.field6010, 0);
                this.field1180 = true;
                return;
            }
        } else {
            if (this.field1180) {
                super.field9776.method3859(126, 0, class790.field10851);
                super.field9776.method3867((byte) 18, class790.field10851, 0);
                this.field1180 = false;
            }
            super.field9776.method3882(0, arg1);
            super.field9776.method3871(0, arg2);
        }
    }

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "(I)V")
    public static final void method671(int arg0) {
        ++field1177;
        if (arg0 != -13239) {
            method671(27);
        }
        class512.method2991((byte) -58);
        class199.method1302(22050, class125.field1721.field5181.method3364(43) == 1, -48001, 2);
        class318.field4526 = class52.method329(22050, (byte) 65, 0, class669.field8962, class786.field10800);
        class651.method3620(true, true, class557.method3191(arg0 + 13145, (class64) null));
        class790.field10850 = class52.method329(2048, (byte) 65, 1, class669.field8962, class786.field10800);
        class790.field10850.method2500(arg0 + -13938, class701.field9285);
    }

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)V")
    public final void method220(int arg0) {
        super.field9776.method3886(55, 1);
        ++field1182;
        super.field9776.method3882(0, (class352) null);
        super.field9776.method3911(arg0 + -1135, class291.field4152, class291.field4152);
        super.field9776.method3859(125, 0, class790.field10851);
        super.field9776.method3859(126, 2, class64.field840);
        if (arg0 != 23363) {
            this.field1179 = null;
        }
        super.field9776.method3867((byte) 18, class790.field10851, 0);
        super.field9776.method3886(arg0 ^ 23414, 0);
        if (this.field1180) {
            super.field9776.method3859(arg0 + -23238, 0, class790.field10851);
            super.field9776.method3867((byte) 18, class790.field10851, 0);
            this.field1180 = false;
        }
        if (this.field1169) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field1169 = false;
        }
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V")
    public final void method672(int arg0) {
        ++field1173;
        int var2 = super.field9776.method3908(109);
        if (arg0 >= -35) {
            method675((byte) -48);
        }
        class532 var3 = super.field9776.method3868(1);
        if (this.field1186) {
            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field1176.field8490 : this.field1181.field8490);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field1165.field8490 : this.field1179.field8490);
        }
        OpenGL.glEnable(34336);
        this.field1169 = true;
        var3.method3095(this.field1164, -1.0F, (float) var2, 0.0F, 0.0F, (byte) -117);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field1164[0], this.field1164[1], this.field1164[2], this.field1164[3]);
        this.method673(-23970);
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)V")
    public final void method673(int arg0) {
        if (this.field1169) {
            int var2 = super.field9776.method469();
            int var3 = super.field9776.method507();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9776.method3839(108), (float) super.field9776.method3890(arg0 + 23983) / 255.0F);
            super.field9776.method3886(arg0 ^ -24023, 1);
            super.field9776.method3838(super.field9776.method3850(arg0 + 23910), Integer.MAX_VALUE);
            super.field9776.method3886(arg0 + 24026, 0);
        }
        if (arg0 == -23970) {
            ++field1184;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Z")
    public final boolean method218(byte arg0) {
        ++field1170;
        if (arg0 <= 16) {
            this.field1181 = null;
        }
        return this.field1167;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BILwc;)V")
    public static final void method674(byte arg0, int arg1, class74 arg2) {
        if (arg0 > -33) {
            method674((byte) 9, -126, (class74) null);
        }
        ++field1174;
        if (class385.field5605) {
            class385.field5605 = false;
            arg1 = 0;
        }
        if (class740.field10027 == null || !class740.field10027.method602(arg2, (byte) 9)) {
            class740.field10027 = arg2;
            class744.field10059 = class401.method2440(false);
            class540.field7482 = arg1;
            class211.field2714 = arg1;
            if (class211.field2714 == 0) {
                class774.method4252(-620657048);
                return;
            }
            class532.field7394 = class224.field2897;
            class599.field8170 = class734.field9958;
            class227.field2936 = class692.field9217;
            class477.field6699 = class455.field6515;
            class236.field3152 = class512.field7129;
            class638.field8599 = class789.field10841;
            class285.field4090 = class74.field1013;
            class785.field10791 = class388.field5622;
            class24.field238 = class52.field630;
            class670.field8989 = class454.field6506;
        }
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(B)V")
    public static void method675(byte arg0) {
        if (arg0 <= -26) {
            field1166 = null;
            field1178 = null;
            field1183 = null;
            field1185 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        ++field1175;
        if (arg1 != 0) {
            this.method222(-31, true);
        }
    }

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "(I)V")
    public static final void method676(int arg0) {
        ++field1168;
        int var1 = -18 / ((arg0 - -29) / 55);
        class737.field10007.method3113(-127);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lsha;Luq;)V")
    public class83(class757 arg0, class172 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field10340) {
            this.field1165 = class521.method3033((byte) 23, arg1.method1189("uw_ground_unlit", 0, "gl"), arg0, 34336);
            this.field1181 = class521.method3033((byte) 23, arg1.method1189("uw_ground_lit", 0, "gl"), arg0, 34336);
            this.field1179 = class521.method3033((byte) 23, arg1.method1189("uw_model_unlit", 0, "gl"), arg0, 34336);
            this.field1176 = class521.method3033((byte) 23, arg1.method1189("uw_model_lit", 0, "gl"), arg0, 34336);
            if (!(this.field1179 != null & this.field1181 != null & this.field1165 != null & this.field1176 != null)) {
                this.field1167 = false;
            } else {
                this.field1163 = super.field9776.method3856(false, 1, 2, new int[] { 0, -1 }, false);
                this.field1163.method622(true, false, false);
                this.field1167 = true;
            }
        } else {
            this.field1167 = false;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZZ)V")
    public final void method225(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field1179 = null;
        }
        ++field1172;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZ)V")
    public final void method222(int arg0, boolean arg1) {
        ++field1162;
        this.field1186 = arg1;
        super.field9776.method3886(24, 1);
        super.field9776.method3882(0, this.field1163);
        super.field9776.method3911(22228, class117.field1574, class328.field4644);
        super.field9776.method3859(126, 0, class64.field840);
        super.field9776.method2812(2, false, class790.field10851, true, 0);
        super.field9776.method3867((byte) 18, class417.field6010, 0);
        super.field9776.method3886(73, 0);
        this.method672(-69);
        if (arg0 > -126) {
            method671(-92);
        }
    }
}
