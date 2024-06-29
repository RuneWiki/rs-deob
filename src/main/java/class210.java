import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class210 extends class669 {

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ldc;")
    private class5 field2998;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "Lmca;")
    private class29 field3006;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lmi;")
    private class463 field2996;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field3000 = -1;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "J")
    public static long field2997 = 0L;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)V")
    public final void method2(byte arg0, int arg1, int arg2) {
        if (arg0 >= 77) {
            ++field3002;
            if (this.field3006.field472) {
                float var4 = (float) (super.field9490.field1838 % 4000) / 4000.0F;
                super.field9490.method897(this.field3006.field471, true);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
            } else {
                int var5 = super.field9490.field1838 % 4000 * 16 / 4000;
                super.field9490.method897(this.field3006.field474[var5], true);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILnq;)V")
    public final void method7(int arg0, int arg1, class430 arg2) {
        ++field3005;
        if (arg1 != -21254) {
            this.method1(126);
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) {
        super.field9490.method859((byte) 29, class350.field4792, 0);
        ++field3004;
        if (arg0 != -21106) {
            this.field3006 = null;
        }
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V")
    public final void method5(boolean arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field2996.field6258);
        ++field3003;
        OpenGL.glEnable(34336);
        if (arg1) {
            field3000 = -38;
        }
        super.field9490.method859((byte) 29, class291.field4117, 0);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)V")
    public final void method4(boolean arg0, int arg1) {
        ++field3001;
        super.field9490.method909(class586.field7773, arg1 + -9414, class32.field520);
        if (arg1 != 9512) {
            field3000 = 38;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ldc;Lbi;Lmca;)V")
    public class210(class5 arg0, class449 arg1, class29 arg2) {
        super(arg0);
        this.field2998 = arg0;
        this.field3006 = arg2;
        if (this.field3006.method246(16) && this.field2998.field143) {
            this.field2996 = class290.method1787(arg1.method2532("gl", "transparent_water", -24518), this.field2998, 34336, (byte) 21);
        } else {
            this.field2996 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIII)Ldn;")
    public static final class483 method1345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2995;
        long var7 = (long) arg1 * 32147369L ^ (long) arg3 * 986053L ^ (long) arg5 * 67481L ^ (long) arg2 * 97549L ^ (long) arg4 * 475427L ^ (long) arg0 * 76724863L;
        class483 var9 = (class483) class152.field2404.method3750(var7, false);
        if (var9 != null) {
            return var9;
        } else {
            if (arg6 != 0) {
                field3000 = 29;
            }
            class483 var10 = class251.field3460.method391(arg5, arg2, arg4, arg3, arg1, arg0);
            class152.field2404.method3745(arg6 ^ 1, var7, var10);
            return var10;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        if (arg0 != 9567) {
            this.method5(true, false);
        }
        ++field2999;
        return this.field2996 != null;
    }
}
