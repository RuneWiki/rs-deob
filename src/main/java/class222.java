import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class222 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lpj;")
    public static class237 field3813 = class33.method353("Lade Schrifts-=tze )2 ", 25);

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lpj;")
    public static class237 field3818 = class33.method353("www)2wtrc", 23);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field3819 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "[Lcj;")
    public static class115[] field3815;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method1473(boolean arg0) {
        if (arg0) {
            method1476(-8, 0, 17, 57, -51, 124);
        }
        field3818 = null;
        field3815 = null;
        field3813 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I")
    public static final int method1474(int arg0, int arg1) {
        if (arg1 != -11960) {
            field3814 = -34;
        }
        field3817++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)I")
    public static final int method1475(int arg0, int arg1) {
        if (arg0 <= 119) {
            method1476(43, 6, -6, 88, 29, 40);
        }
        field3812++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V")
    public static final void method1476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3821++;
        int var8 = arg0 + 1;
        class199.method1361(arg2, arg1, class62.field1241[arg0], arg5, 116);
        int var9 = arg4 - 1;
        class199.method1361(arg2, arg1, class62.field1241[arg4], arg5, 112);
        if (arg3 <= -61) {
            for (int var6 = var8; var6 <= var9; var6++) {
                int[] var7 = class62.field1241[var6];
                var7[arg5] = var7[arg1] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILfa;)Lnf;")
    public static final class155 method1477(int arg0, int arg1, class239 arg2) {
        if (arg0 < 84) {
            return null;
        } else {
            field3820++;
            return class122.method872(arg2, arg1, (byte) -20) ? class39.method406(255) : null;
        }
    }
}
