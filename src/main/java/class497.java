import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class497 extends class369 {

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "Ltt;")
    private class341 field7196;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Lmr;")
    private class221 field7191;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Liea;")
    private class131 field7188;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "Lwp;")
    public static class452 field7199 = null;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "[Lme;")
    public static class99[] field7195 = new class99[8];

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field7192;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field7194;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field7198;
        super.field5047.method2012((byte) -95, 0, class304.field3769);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        int var2 = -13 / ((arg0 - 54) / 47);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIB)I")
    public static final int method2871(int arg0, int arg1, int arg2, byte arg3) {
        ++field7193;
        if (~class96.field1028 > -101) {
            return -2;
        } else {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = -class482.field6943 + arg2;
            int var7 = arg0 - class482.field6951;
            class679 var8 = (class679) class482.field6939.method3434((byte) 2);
            int var9 = 115 % ((-26 - arg3) / 61);
            while (var8 != null) {
                if (~var8.field9562 == ~arg1) {
                    int var10 = var8.field9572;
                    int var11 = var8.field9563;
                    int var12 = class482.field6951 + var11 | class482.field6943 + var10 << 14;
                    int var13 = (-var10 + var6) * (-var10 + var6) - -((var7 - var11) * (-var11 + var7));
                    if (~var4 > -1 || var5 > var13) {
                        var5 = var13;
                        var4 = var12;
                    }
                }
                var8 = (class679) class482.field6939.method3430(true);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        ++field7190;
        int var2 = 5 % ((arg0 - 37) / 36);
        return this.field7188 != null;
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(B)V")
    public static void method2872(byte arg0) {
        if (arg0 != -125) {
            field7195 = null;
        }
        field7195 = null;
        field7199 = null;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lmr;Ltf;Ltt;)V")
    public class497(class221 arg0, class701 arg1, class341 arg2) {
        super(arg0);
        this.field7196 = arg2;
        this.field7191 = arg0;
        if (arg1 != null && this.field7196.method1974(-15210) && this.field7191.field2740) {
            this.field7188 = class489.method2839(155, arg1.method3862("transparent_water", "gl", (byte) 127), 34336, this.field7191);
        } else {
            this.field7188 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILlc;)V")
    public final void method9(byte arg0, int arg1, class686 arg2) {
        ++field7194;
        if (arg0 != -94) {
            field7195 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)V")
    public final void method5(int arg0, boolean arg1) {
        ++field7192;
        if (arg0 != 382) {
            field7200 = -77;
        }
        super.field5047.method1994(-30, class644.field9099, class428.field6081);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
    public final void method10(boolean arg0, int arg1) {
        ++field7189;
        OpenGL.glBindProgramARB(34336, this.field7188.field1477);
        OpenGL.glEnable(34336);
        super.field5047.method2012((byte) -117, 0, class692.field9717);
        if (arg1 != -14330) {
            method2872((byte) 23);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 != 8250) {
            field7195 = null;
        }
        ++field7201;
        if (this.field7196.field4308) {
            float var4 = (float) (super.field5047.field4585 % 4000) / 4000.0F;
            super.field5047.method1997(127, this.field7196.field4314);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field5047.field4585 % 4000 * 16 / 4000;
            super.field5047.method1997(126, this.field7196.field4311[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
    }
}
