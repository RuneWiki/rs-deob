import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class450 extends class681 {

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Ltba;")
    private class147 field6168;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lst;")
    private class398 field6171;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lwda;")
    private class592 field6179;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Lem;")
    public static class206 field6170 = new class206(62, 6);

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6182 = new Rectangle[100];

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field6183 = 0;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field6175 = -1;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Lem;")
    public static class206 field6184 = new class206(35, 3);

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
    public static final void method2560(int arg0) {
        ++field6181;
        class383.field5418 = null;
        class453.method2574(0, 0, class340.field4553, 0, false, -1, class222.field3096, 0, class631.field8758);
        if (arg0 <= 87) {
            field6170 = null;
        }
        if (class383.field5418 != null) {
            class230.method1453(class508.field6962, false, class383.field5418, 0, -1412584499, class501.field6894.field1071, class295.field4045, class222.field3096, class340.field4553, 0);
            class383.field5418 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILrga;I)V")
    public final void method744(int arg0, class218 arg1, int arg2) {
        ++field6176;
        if (arg2 != -3) {
            this.method744(100, (class218) null, -62);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        if (!arg0) {
            this.method742(-89, 97, (byte) 78);
        }
        ++field6174;
        return this.field6179 != null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)V")
    public final void method742(int arg0, int arg1, byte arg2) {
        ++field6173;
        int var4 = -26 % ((-38 - arg2) / 35);
        if (this.field6171.field5595) {
            float var5 = (float) (super.field9721.field5307 % 4000) / 4000.0F;
            super.field9721.method2241(this.field6171.field5596, (byte) 44);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        } else {
            int var6 = super.field9721.field5307 % 4000 * 16 / 4000;
            super.field9721.method2241(this.field6171.field5600[var6], (byte) 44);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        super.field9721.method2199(class276.field3814, 9797, class335.field4510);
        if (arg1 == 7) {
            ++field6172;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFFF)F")
    public static final float method2561(int arg0, float arg1, float arg2, float arg3) {
        ++field6177;
        return arg0 != 19416 ? -1.4635913F : (-arg2 + arg1) * arg3 + arg2;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(ZI)V")
    public final void method741(boolean arg0, int arg1) {
        OpenGL.glBindProgramARB(34336, this.field6179.field8290);
        ++field6178;
        OpenGL.glEnable(34336);
        if (arg1 == 3) {
            super.field9721.method2264(arg1 ^ 10, class78.field1179, 0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public final void method740(int arg0) {
        super.field9721.method2264(9, class262.field3553, 0);
        ++field6169;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0 == -3) {
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
    public static void method2562(int arg0) {
        field6170 = null;
        field6182 = null;
        int var1 = 29 / ((arg0 - -74) / 33);
        field6184 = null;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ltba;Lsea;Lst;)V")
    public class450(class147 arg0, class648 arg1, class398 arg2) {
        super(arg0);
        this.field6168 = arg0;
        this.field6171 = arg2;
        if (arg1 != null && this.field6171.method2329((byte) 79) && this.field6168.field2172) {
            this.field6179 = class43.method372(34336, this.field6168, arg1.method3642(81, "transparent_water", "gl"), (byte) 101);
        } else {
            this.field6179 = null;
        }
    }
}
