import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class322 extends class429 {

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Lnc;")
    private class227 field4577;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Lfc;")
    private class642 field4579;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "Loga;")
    private class180 field4588;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field4583 = new String[200];

    @OriginalMember(owner = "client!am", name = "u", descriptor = "F")
    public static float field4582 = 0.0F;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V", line = 5)
    public static final void method1947(int arg0) {
        ++field4574;
        class263.field3717 = -1;
        class198.field2985 = arg0;
        class104.field1516 = -1;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method1948(boolean arg0) {
        ++field4575;
        if (class223.field3276 != null) {
            class204[] var1 = class223.field3276;
            for (int var2 = 0; var2 < var1.length; ++var2) {
                class204 var3 = var1[var2];
                var3.method738(23978);
            }
        }
        if (arg0) {
            field4582 = 1.4749554F;
        }
    }

    @OriginalMember(owner = "client!am", name = "i", descriptor = "(I)V", line = 46)
    public static void method1949(int arg0) {
        if (arg0 >= -113) {
            method1947(-16);
        }
        field4583 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZZ)V", line = 57)
    public final void method44(boolean arg0, boolean arg1) {
        ++field4587;
        OpenGL.glBindProgramARB(34336, this.field4588.field2750);
        OpenGL.glEnable(34336);
        super.field5939.method1014(0, 43, class317.field4535);
        if (arg1) {
            method1950(-47, 34, -34, (byte[]) null, -62, -84, 2, -68, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Z", line = 70)
    public final boolean method48(byte arg0) {
        if (arg0 != -128) {
            field4582 = -1.6623572F;
        }
        ++field4578;
        return this.field4588 != null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)V", line = 82)
    public final void method43(int arg0, boolean arg1) {
        super.field5939.method974(class552.field7657, class228.field3319, (byte) -59);
        ++field4580;
        if (arg0 != 0) {
            method1949(116);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 93)
    public final void method47(byte arg0) {
        ++field4584;
        super.field5939.method1014(0, 113, class264.field3730);
        int var2 = -47 % ((-56 - arg0) / 48);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Len;ZI)V", line = 106)
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        ++field4576;
        if (arg1) {
            this.field4577 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III[BIIII[B)V", line = 120)
    public static final void method1950(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg7 != -24962) {
            field4586 = 114;
        }
        ++field4585;
        int var9 = -(arg6 >> 2);
        int var10 = -(3 & arg6);
        for (int var11 = -arg5; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg4++;
                arg3[var10001] = (byte) (arg3[var10001] + -arg8[arg1++]);
                int var14 = arg4++;
                arg3[var14] = (byte) (arg3[var14] + -arg8[arg1++]);
                int var15 = arg4++;
                arg3[var15] = (byte) (arg3[var15] + -arg8[arg1++]);
                int var16 = arg4++;
                arg3[var16] = (byte) (arg3[var16] + -arg8[arg1++]);
            }
            for (int var13 = var10; ~var13 > -1; ++var13) {
                var10001 = arg4++;
                arg3[var10001] = (byte) (arg3[var10001] + -arg8[arg1++]);
            }
            arg4 += arg0;
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V", line = 165)
    public final void method46(int arg0, int arg1, int arg2) {
        ++field4581;
        if (!this.field4577.field3302) {
            int var4 = super.field5939.field1928 % 4000 * 16 / 4000;
            super.field5939.method988(1, this.field4577.field3298[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field5939.field1928 % 4000) / 4000.0F;
            super.field5939.method988(1, this.field4577.field3301);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        if (arg0 != 37) {
            this.method48((byte) -125);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lfc;Lgga;Lnc;)V", line = 195)
    public class322(class642 arg0, class513 arg1, class227 arg2) {
        super(arg0);
        this.field4577 = arg2;
        this.field4579 = arg0;
        if (arg1 != null && this.field4577.method1541(true) && this.field4579.field9132) {
            this.field4588 = class236.method1595(34336, arg1.method3017(0, "transparent_water", "gl"), 32635, this.field4579);
        } else {
            this.field4588 = null;
        }
    }
}
