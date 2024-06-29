import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class656 extends class252 {

    @OriginalMember(owner = "client!pw", name = "A", descriptor = "Lhp;")
    private class296 field9206;

    @OriginalMember(owner = "client!pw", name = "r", descriptor = "Luk;")
    private class234 field9197;

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "Lwq;")
    private class151 field9205;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
    public static int field9198;

    @OriginalMember(owner = "client!pw", name = "t", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!pw", name = "u", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!pw", name = "x", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!pw", name = "q", descriptor = "Lpu;")
    public static class522 field9196;

    @OriginalMember(owner = "client!pw", name = "v", descriptor = "Lpu;")
    public static class522 field9201;

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "[Lvb;")
    public static class178[] field9195;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V", line = 4)
    public final void method788(boolean arg0) {
        super.field3884.method2324(0, class61.field1155, 1);
        ++field9204;
        if (arg0) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lbb;II)V", line = 18)
    public final void method790(class301 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method792(-71);
        }
        ++field9203;
    }

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)Z", line = 35)
    public final boolean method792(int arg0) {
        if (arg0 != 6439) {
            this.method792(65);
        }
        ++field9198;
        return this.field9205 != null;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(ZI)V", line = 47)
    public final void method791(boolean arg0, int arg1) {
        ++field9202;
        super.field3884.method2339(class190.field2740, -32540, class413.field6010);
        if (arg1 != 1) {
            this.method794(true, 5);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZI)V", line = 58)
    public final void method794(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field9196 = null;
        }
        ++field9199;
        OpenGL.glBindProgramARB(34336, this.field9205.field2179);
        OpenGL.glEnable(34336);
        super.field3884.method2324(0, class319.field4696, 1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IB)Z", line = 71)
    public static final boolean method3612(int arg0, byte arg1) {
        ++field9194;
        if (arg0 != 15 && ~arg0 != -14 && ~arg0 != -50 && arg0 != 30 && ~arg0 != -46) {
            if (arg1 >= -79) {
                field9195 = null;
            }
            return ~arg0 == -26 || ~arg0 == -1008;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)V", line = 90)
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 >= -105) {
            method3612(104, (byte) -47);
        }
        if (!this.field9197.field3626) {
            int var4 = super.field3884.field5688 % 4000 * 16 / 4000;
            super.field3884.method2337(false, this.field9197.field3627[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field3884.field5688 % 4000) / 4000.0F;
            super.field3884.method2337(false, this.field9197.field3634);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        ++field9200;
    }

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "(I)V", line = 115)
    public static void method3613(int arg0) {
        field9201 = null;
        field9196 = null;
        if (arg0 != 30422) {
            field9201 = null;
        }
        field9195 = null;
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lhp;Lpu;Luk;)V", line = 130)
    public class656(class296 arg0, class522 arg1, class234 arg2) {
        super(arg0);
        this.field9206 = arg0;
        this.field9197 = arg2;
        if (arg1 != null && this.field9197.method1605(-27703) && this.field9206.field4435) {
            this.field9205 = class302.method1935((byte) 116, 34336, arg1.method3009("transparent_water", "gl", 0), this.field9206);
        } else {
            this.field9205 = null;
        }
    }
}
