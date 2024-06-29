import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class213 {

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field3616;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lgb;")
    public static class158 field3618 = new class158(4);

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lwa;")
    public static class75 field3620 = class66.method560("Spielwelt erstellt)3", false);

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Lwa;")
    public static class75 field3621 = class66.method560("<img=1>", false);

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field3625 = 0;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lgb;")
    public static class158 field3623 = new class158(64);

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lgb;")
    public static class158 field3626 = new class158(50);

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field3627 = 0;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Lwa;")
    public static class75 field3628 = class66.method560("Fallen lassen", false);

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[[Lfd;")
    public static class230[][] field3629 = new class230[13][13];

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 12)
    public static void method1569(byte arg0) {
        field3628 = null;
        if (arg0 != -59) {
            method1569((byte) 86);
        }
        field3626 = null;
        field3629 = (class230[][]) null;
        field3618 = null;
        field3621 = null;
        field3620 = null;
        field3623 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lbl;B)I", line = 30)
    public static final int method1570(class295 arg0, byte arg1) {
        field3615++;
        class229 var2 = arg0.field5070;
        if (arg1 >= -104) {
            return -86;
        }
        if (var2.field3868 != null) {
            var2 = var2.method1673(false);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3863;
        if (arg0.field3228 == arg0.field3215) {
            var3 = var2.field3881;
        } else if (arg0.field3244 == arg0.field3215) {
            var3 = var2.field3856;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIILpj;IJZ)Z", line = 68)
    public static final boolean method1571(int arg0, int arg1, int arg2, int arg3, int arg4, class171 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class246.method1776(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 124)
    public class213() {
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lfl;)V", line = 126)
    public class213(class213 arg0) {
        this.field3622 = arg0.field3622;
        this.field3619 = arg0.field3619;
        this.field3617 = arg0.field3617;
        this.field3616 = arg0.field3616;
    }
}
