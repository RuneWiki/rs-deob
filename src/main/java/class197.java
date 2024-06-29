import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class197 extends class532 {

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "Lrfa;")
    private class213 field2355;

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "Lnv;")
    private class439 field2350;

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "Laja;")
    private class100 field2351;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "Z")
    public static boolean field2345 = true;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lnv;Lbt;Lrfa;)V")
    public class197(class439 arg0, class48 arg1, class213 arg2) {
        super(arg0);
        this.field2355 = arg2;
        this.field2350 = arg0;
        if (arg1 != null && this.field2355.method1339(-10521) && this.field2350.field5893) {
            this.field2351 = class124.method962(arg1.method436("gl", -3637, "transparent_water"), -102, this.field2350, 34336);
        } else {
            this.field2351 = null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        OpenGL.glBindProgramARB(34336, this.field2351.field1302);
        ++field2349;
        if (arg1 == -10) {
            OpenGL.glEnable(34336);
            super.field7494.method2694((byte) -49, 0, class616.field8291);
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        ++field2348;
        if (!arg0) {
            this.field2355 = null;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)V")
    public static final void method1287(int arg0, int arg1, int arg2) {
        ++field2353;
        class140 var3 = class448.field6026[arg0][arg2];
        int var4 = -73 % ((-31 - arg1) / 43);
        if (var3 != null) {
            class476.field6613 = var3.field1742;
            class615.field8272 = var3.field1745;
            class677.field9288 = var3.field1753;
        }
        class385.method2258(7);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        super.field7494.method2694((byte) -49, 0, class507.field7214);
        ++field2346;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        if (arg0) {
            field2345 = true;
        }
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        ++field2354;
        if (arg0 <= 126) {
            field2345 = false;
        }
        return this.field2351 != null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        if (arg1 == 30902) {
            super.field7494.method2716(class555.field7726, 63, class75.field1039);
            ++field2347;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        if (arg1 == 94) {
            ++field2352;
            if (this.field2355.field2520) {
                float var4 = (float) (super.field7494.field6229 % 4000) / 4000.0F;
                super.field7494.method2643(-2, this.field2355.field2517);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
            } else {
                int var5 = super.field7494.field6229 % 4000 * 16 / 4000;
                super.field7494.method2643(arg1 ^ -96, this.field2355.field2519[var5]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            }
        }
    }
}
