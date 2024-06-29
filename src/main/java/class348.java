import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class348 extends class607 {

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "Lki;")
    private class616 field4979;

    @OriginalMember(owner = "client!taa", name = "x", descriptor = "Lgf;")
    private class234 field4984;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "Lle;")
    private class260 field4975;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!taa", name = "u", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!taa", name = "v", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "[I")
    public static int[] field4972;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "[[B")
    public static byte[][] field4971;

    static {
        new class474("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method2220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4969;
        int var7 = -arg4 + arg1;
        if (arg0 >= -49) {
            field4971 = null;
        }
        int var8 = arg5 - -arg4;
        for (int var9 = arg5; var9 < var8; ++var9) {
            class645.method3675(100, class402.field6087[var9], arg3, arg6, arg2);
        }
        for (int var10 = arg1; var10 > var7; --var10) {
            class645.method3675(95, class402.field6087[var10], arg3, arg6, arg2);
        }
        int var11 = arg6 - -arg4;
        int var12 = arg2 - arg4;
        for (int var13 = var8; var13 <= var7; ++var13) {
            int[] var14 = class402.field6087[var13];
            class645.method3675(116, var14, arg3, arg6, var11);
            class645.method3675(112, var14, arg3, var12, arg2);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IZ)V", line = 47)
    public final void method808(int arg0, boolean arg1) {
        if (arg0 != 993) {
            field4972 = null;
        }
        ++field4977;
        super.field8870.method1912(class107.field1276, class274.field3839, -39);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 60)
    public static final void method2221(int arg0, String arg1) {
        if (class236.field3378 == null) {
            class160.method924(2);
        }
        ++field4981;
        String[] var2 = class293.method1890('\n', (byte) -1, arg1);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            for (int var4 = class429.field6362; var4 > 0; --var4) {
                class236.field3378[var4] = class236.field3378[var4 - 1];
            }
            class236.field3378[0] = var2[var3];
            if (class429.field6362 < class236.field3378.length - 1) {
                ++class429.field6362;
                if (~class392.field6007 < -1) {
                    ++class392.field6007;
                }
            }
        }
        if (arg0 != 30742) {
            method2221(-10, (String) null);
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lgf;Lkea;Lki;)V", line = 107)
    public class348(class234 arg0, class203 arg1, class616 arg2) {
        super(arg0);
        this.field4979 = arg2;
        this.field4984 = arg0;
        if (this.field4979.method3555((byte) 62) && this.field4984.field3370) {
            this.field4975 = class139.method837(arg1.method1281((byte) -37, "transparent_water", "gl"), 45, 34336, this.field4984);
        } else {
            this.field4975 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)Z", line = 130)
    public final boolean method814(byte arg0) {
        ++field4973;
        if (arg0 != -97) {
            this.method808(-4, false);
        }
        return this.field4975 != null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZB)V", line = 141)
    public final void method811(boolean arg0, byte arg1) {
        ++field4978;
        OpenGL.glBindProgramARB(34336, this.field4975.field3697);
        OpenGL.glEnable(34336);
        super.field8870.method1970(32, class577.field8332, 0);
        if (arg1 != 91) {
            method2220(-26, 68, 116, -110, -23, 96, -93);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IBLiu;)V", line = 154)
    public final void method810(int arg0, byte arg1, class502 arg2) {
        ++field4974;
        if (arg1 > -73) {
            this.field4975 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(B)V", line = 164)
    public final void method805(byte arg0) {
        super.field8870.method1970(112, class83.field935, 0);
        ++field4976;
        OpenGL.glBindProgramARB(34336, 0);
        if (arg0 != -58) {
            this.field4984 = null;
        }
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)V", line = 178)
    public final void method815(int arg0, int arg1, int arg2) {
        ++field4983;
        if (arg0 != 12868) {
            this.method815(122, -11, -30);
        }
        if (this.field4979.field8956) {
            float var4 = (float) (super.field8870.field4317 % 4000) / 4000.0F;
            super.field8870.method1971((byte) -85, this.field4979.field8960);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field8870.field4317 % 4000 * 16 / 4000;
            super.field8870.method1971((byte) -101, this.field4979.field8964[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z", line = 204)
    public static final boolean method2222(int arg0, int arg1) {
        if (arg0 != 0) {
            method2220(5, 15, -79, -73, 60, -79, 100);
        }
        ++field4980;
        return ~arg1 == -4 || arg1 == 7 || ~arg1 == -11;
    }

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "(I)V", line = 217)
    public static void method2223(int arg0) {
        field4971 = null;
        if (arg0 != 0) {
            field4972 = null;
        }
        field4972 = null;
    }
}
