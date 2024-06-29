import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class291 {

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
    public int field3757 = 128;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public int field3774 = 128;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field3758 = 0;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "D")
    public static double field3773 = -1.0D;

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "I")
    public static int field3766 = -2;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLlt;)V", line = 13)
    public final void method1727(boolean arg0, class291 arg1) {
        this.field3764 = arg1.field3764;
        field3772++;
        this.field3759 = arg1.field3759;
        this.field3768 = arg1.field3768;
        this.field3774 = arg1.field3774;
        if (arg0) {
            this.field3757 = arg1.field3757;
            this.field3762 = arg1.field3762;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lfd;Z)Lrw;", line = 31)
    public static final class485 method1728(class418 arg0, boolean arg1) {
        field3763++;
        class41 var2 = class432.method2472(arg0, (byte) 116);
        if (!arg1) {
            field3773 = 0.5883680815418268D;
        }
        int var3 = arg0.method2393(-30727);
        int var4 = arg0.method2393(-30727);
        int var5 = arg0.method2393(-30727);
        int var6 = arg0.method2393(-30727);
        int var7 = arg0.method2393(-30727);
        int var8 = arg0.method2393(-30727);
        return new class485(var2.field579, var2.field574, var2.field581, var2.field582, var2.field584, var2.field585, var2.field575, var2.field587, var2.field586, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Llt;", line = 56)
    public final class291 method1729(byte arg0) {
        field3770++;
        if (arg0 > -80) {
            this.method1727(false, null);
        }
        return new class291(this.field3762, this.field3757, this.field3774, this.field3764, this.field3768, this.field3759);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V", line = 90)
    public class291(int arg0) {
        this.field3762 = arg0;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIII)V", line = 97)
    private class291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3759 = arg5;
        this.field3762 = arg0;
        this.field3768 = arg4;
        this.field3774 = arg2;
        this.field3757 = arg1;
        this.field3764 = arg3;
    }
}
