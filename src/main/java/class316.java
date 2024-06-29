import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class316 extends class712 {

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "[F")
    private float[] field4369 = new float[4];

    @OriginalMember(owner = "client!qca", name = "L", descriptor = "Z")
    private boolean field4383 = false;

    @OriginalMember(owner = "client!qca", name = "M", descriptor = "Ljfa;")
    private class707 field4384;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "Ljfa;")
    private class707 field4368;

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "Ljfa;")
    private class707 field4372;

    @OriginalMember(owner = "client!qca", name = "G", descriptor = "Ljfa;")
    private class707 field4378;

    @OriginalMember(owner = "client!qca", name = "O", descriptor = "Z")
    private boolean field4386;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "Ldg;")
    private class19 field4370;

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "Z")
    public static boolean field4382 = false;

    @OriginalMember(owner = "client!qca", name = "I", descriptor = "Ldc;")
    public static class63 field4380 = new class63(1350);

    @OriginalMember(owner = "client!qca", name = "R", descriptor = "I")
    public static int field4389 = 0;

    @OriginalMember(owner = "client!qca", name = "H", descriptor = "F")
    public static float field4379;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!qca", name = "D", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!qca", name = "E", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!qca", name = "N", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!qca", name = "Q", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "Z")
    private boolean field4365;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "Z")
    private boolean field4366;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "[I")
    public static int[] field4364;

    @OriginalMember(owner = "client!qca", name = "P", descriptor = "[[[I")
    public static int[][][] field4387;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        super.field9945.method1431(0, 1);
        ++field4377;
        super.field9945.method1458(399403340, (class190) null);
        super.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
        super.field9945.method1408(0, 0, class15.field140);
        super.field9945.method1408(2, 0, class520.field7247);
        super.field9945.method1528(class15.field140, arg0, 0);
        super.field9945.method1431(0, 0);
        if (this.field4383) {
            super.field9945.method1408(0, 0, class15.field140);
            super.field9945.method1528(class15.field140, false, 0);
            this.field4383 = false;
        }
        if (this.field4365) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field4365 = false;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 != 0) {
            field4387 = null;
        }
        ++field4373;
        if (arg2 != null) {
            if (this.field4383) {
                super.field9945.method1408(0, 0, class15.field140);
                super.field9945.method1528(class15.field140, false, 0);
                this.field4383 = false;
            }
            super.field9945.method1458(399403340, arg2);
            super.field9945.method1503(arg0, (byte) 125);
        } else if (!this.field4383) {
            super.field9945.method1458(399403340, super.field9945.field3427);
            super.field9945.method1503(1, (byte) 101);
            super.field9945.method1408(0, 0, class231.field3142);
            super.field9945.method1528(class231.field3142, false, 0);
            this.field4383 = true;
        }
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 > 96) {
            ++field4367;
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lhj;Luu;)V")
    public class316(class47 arg0, class237 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field712) {
            this.field4384 = class152.method959(arg0, -73, 34336, arg1.method1582("uw_ground_unlit", false, "gl"));
            this.field4368 = class152.method959(arg0, -60, 34336, arg1.method1582("uw_ground_lit", false, "gl"));
            this.field4372 = class152.method959(arg0, -96, 34336, arg1.method1582("uw_model_unlit", false, "gl"));
            this.field4378 = class152.method959(arg0, -74, 34336, arg1.method1582("uw_model_lit", false, "gl"));
            if (!(this.field4368 != null & this.field4384 != null & this.field4372 != null & this.field4378 != null)) {
                this.field4386 = false;
            } else {
                this.field4370 = super.field9945.method1520(new int[] { 0, -1 }, 1, false, 2, (byte) -109);
                this.field4370.method100(false, false, 70);
                this.field4386 = true;
            }
        } else {
            this.field4386 = false;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        if (arg1 < 44) {
            this.field4365 = true;
        }
        this.field4366 = arg0;
        ++field4381;
        super.field9945.method1431(0, 1);
        super.field9945.method1458(399403340, this.field4370);
        super.field9945.method1388(class87.field1239, (byte) 52, class370.field5228);
        super.field9945.method1408(0, 0, class520.field7247);
        super.field9945.method324(2, true, -9608, class15.field140, false);
        super.field9945.method1528(class231.field3142, false, 0);
        super.field9945.method1431(0, 0);
        this.method604(true);
    }

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(B)V")
    public static void method2055(byte arg0) {
        field4387 = null;
        field4364 = null;
        if (arg0 < 42) {
            method2055((byte) 5);
        }
        field4380 = null;
    }

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field4376;
            return this.field4386;
        }
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(Z)V")
    public final void method395(boolean arg0) {
        if (this.field4365) {
            int var2 = super.field9945.method1504();
            int var3 = super.field9945.method1426();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (var2 - var3) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field9945.method1519(127), (float) super.field9945.method1401(-45) / 255.0F);
            super.field9945.method1431(0, 1);
            super.field9945.method1414(super.field9945.method1525(0), (byte) -100);
            super.field9945.method1431(0, 0);
        }
        ++field4374;
        if (arg0) {
            field4387 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        ++field4371;
        if (arg0 < 39) {
            this.field4386 = true;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V")
    public final void method604(boolean arg0) {
        ++field4375;
        int var2 = super.field9945.method1468((byte) -31);
        class474 var3 = super.field9945.method1456(15903);
        if (!this.field4366) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field4384.field9846 : this.field4372.field9846);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field4368.field9846 : this.field4378.field9846);
        }
        OpenGL.glEnable(34336);
        this.field4365 = arg0;
        var3.method2879(117, -1.0F, 0.0F, (float) var2, this.field4369, 0.0F);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field4369[0], this.field4369[1], this.field4369[2], this.field4369[3]);
        this.method395(false);
    }
}
