import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class265 {

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public int field3888 = 128;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    public int field3887 = 128;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public int field3880;

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "I")
    public int field3874;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "[I")
    public static int[] field3875 = new int[2];

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "Lri;")
    public static class73 field3882 = new class73(108, -1);

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "Z")
    public static boolean field3885 = false;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public int field3871;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public int field3873;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
    public static void method1760(byte arg0) {
        if (arg0 >= 6) {
            field3882 = null;
            field3875 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IC)Z")
    public static final boolean method1761(int arg0, char arg1) {
        field3876++;
        if (arg0 >= -127) {
            return true;
        } else {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lfu;B)V")
    public final void method1762(class265 arg0, byte arg1) {
        this.field3880 = arg0.field3880;
        if (arg1 != 75) {
            method1764(48, 23);
        }
        this.field3887 = arg0.field3887;
        this.field3888 = arg0.field3888;
        this.field3879 = arg0.field3879;
        this.field3878 = arg0.field3878;
        field3884++;
        this.field3874 = arg0.field3874;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)Lfu;")
    public final class265 method1763(int arg0) {
        field3877++;
        if (arg0 > -122) {
            method1764(-125, -86);
        }
        return new class265(this.field3878, this.field3887, this.field3888, this.field3879, this.field3880, this.field3874);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
    public static final void method1764(int arg0, int arg1) {
        field3872++;
        class65.field974 = arg0 / arg1;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(I)V")
    public class265(int arg0) {
        this.field3878 = arg0;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIII)V")
    private class265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3887 = arg1;
        this.field3888 = arg2;
        this.field3878 = arg0;
        this.field3879 = arg3;
        this.field3880 = arg4;
        this.field3874 = arg5;
    }
}
