import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class class126 extends class508 {

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Lgk;")
    public class463 field1725;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "[F")
    public static float[] field1728 = new float[4];

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "Z")
    public static boolean field1730 = false;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "Lhs;")
    public static class441 field1727;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
    public boolean field1724;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "Z")
    public static boolean field1733;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIJIIBZLjava/lang/String;ZLjava/lang/String;I)V", line = 6)
    public static final void method793(int arg0, int arg1, long arg2, int arg3, int arg4, byte arg5, boolean arg6, String arg7, boolean arg8, String arg9, int arg10) {
        field1729++;
        if (class450.field6267 || class271.field3433 >= 500) {
            return;
        }
        if (arg5 != -5) {
            method797(70);
        }
        int var12 = arg10 == -1 ? class501.field7364 : arg10;
        class502 var13 = new class502(arg9, arg7, var12, arg1, arg3, arg2, arg4, arg0, arg8, arg6);
        class103.field1421.method42(var13, 0);
        class271.field3433++;
    }

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V", line = 31)
    public static void method797(int arg0) {
        if (arg0 == -501) {
            field1727 = null;
            field1728 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(B)I", line = 50)
    public int method799(byte arg0) {
        field1726++;
        if (arg0 < 121) {
            this.method794(40, -42, (byte) 64);
        }
        return 0;
    }

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)I", line = 62)
    public final int method800(int arg0) {
        field1732++;
        return arg0 == 13659 ? 1 : 11;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)Z", line = 73)
    public final boolean method801(boolean arg0) {
        field1723++;
        if (arg0) {
            this.field1725 = null;
        }
        return this.field1724;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILna;)V", line = 87)
    public static final void method803(int arg0, class251 arg1) {
        class92.field1285[arg0] = arg1;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lgk;)V", line = 93)
    public class126(class463 arg0) {
        this.field1725 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)Z", line = 101)
    public final boolean method804(byte arg0) {
        if (arg0 <= 95) {
            field1728 = null;
        }
        field1731++;
        return false;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lsr;Lsr;II)V")
    public abstract void method792(class346 arg0, class346 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIB)V")
    public abstract void method794(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)Z")
    public abstract boolean method795(int arg0);

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public abstract void method796(int arg0);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
    public abstract void method798(int arg0, int arg1);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)Z")
    public abstract boolean method802(int arg0);
}
