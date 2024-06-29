import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class288 extends class633 {

    @OriginalMember(owner = "client!en", name = "n", descriptor = "Lap;")
    private class435 field3701;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    private int field3705;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    private int field3702;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "[Liaa;")
    public static class452[] field3709 = new class452[2048];

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Lqv;")
    public static class406 field3700 = new class406(0, 1);

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Lng;")
    private class310 field3710;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I", line = 3)
    public static final int method1628(int arg0, int arg1) {
        if (arg1 != 1) {
            field3700 = null;
        }
        field3708++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)Lfj;", line = 15)
    public static final class599 method1629(int arg0, int arg1, int arg2) {
        class287 var3 = class97.field1074[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3677;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method1630(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3707++;
        class530 var5 = class242.method1402(-100, arg2, arg3);
        var5.method3025((byte) -69);
        var5.field7595 = arg4;
        var5.field7589 = arg0;
        var5.field7593 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Lng;", line = 35)
    public final class310 method1631(int arg0) {
        field3703++;
        if (this.field3710 == null) {
            class608.field8592[0] = this.field3702;
            class608.field8592[5] = this.field3706;
            class608.field8592[1] = this.field3699;
            class608.field8592[2] = this.field3704;
            class608.field8592[3] = this.field3698;
            class486 var2 = this.field3701.field8990;
            class608.field8592[4] = this.field3705;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method843(class608.field8592[var5], 31340)) {
                    return null;
                }
                class414 var7 = var2.method846((byte) -117, class608.field8592[var5]);
                int var8 = var7.field5499 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field5497 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class170.field2045[var6] = var2.method854(1.0F, -4476, false, var4, class608.field8592[var6], var4);
            }
            this.field3710 = new class310(this.field3701, 6407, var4, var3, class170.field2045);
        }
        if (arg0 >= -12) {
            this.field3704 = -2;
        }
        return this.field3710;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V", line = 105)
    public static void method1632(byte arg0) {
        field3700 = null;
        if (arg0 == -104) {
            field3709 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lap;IIIIII)V", line = 118)
    public class288(class435 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3701 = arg0;
        this.field3699 = arg2;
        this.field3698 = arg4;
        this.field3706 = arg6;
        this.field3705 = arg5;
        this.field3702 = arg1;
        this.field3704 = arg3;
    }
}
