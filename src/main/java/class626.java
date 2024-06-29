import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class626 {

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "Lfp;")
    private class323 field8700;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lfp;")
    private class323 field8699;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "Lg;")
    public static class153 field8698 = new class153(5, 1);

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "Lgda;")
    public static class53 field8703 = new class53(34, 11);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lfp;")
    public static class323 field8695;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Liu;")
    private class578 field8696;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public static final void method3511(boolean arg0) {
        if (arg0) {
            method3511(false);
        }
        field8701++;
        if (!class110.field1344) {
            class518.field7368 += (12.0F - class518.field7368) / 2.0F;
            class110.field1344 = true;
            class69.field847 = true;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 <= -115) {
            field8697++;
            class491.field6930[class556.field7801++] = new class104(arg7, arg3, arg0, arg8, arg8, arg0, arg2, arg1, arg1, arg2, arg6, arg6, arg5, arg5);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Liu;")
    private final class578 method3513(byte arg0) {
        field8694++;
        int var2 = -40 % ((arg0 + 77) / 49);
        if (this.field8696 == null) {
            this.field8696 = new class578();
        }
        return this.field8696;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILsda;)Luq;")
    public final class159 method3514(int arg0, class257 arg1) {
        field8693++;
        if (arg1 == null) {
            return null;
        }
        class153 var3 = arg1.method769(false);
        if (class509.field7293 == var3) {
            return new class467((class690) arg1);
        } else if (class456.field6439 == var3) {
            return new class719(this.method3513((byte) -126), (class145) arg1);
        } else if (field8698 == var3) {
            return new class167(this.field8699, (class196) arg1);
        } else if (class516.field7358 == var3) {
            return new class656(this.field8699, (class704) arg1);
        } else if (class59.field723 == var3) {
            return new class571(this.field8699, this.field8700, (class273) arg1);
        } else if (class481.field6798 == var3) {
            return new class737(this.field8699, this.field8700, (class242) arg1);
        } else if (class522.field7399 == var3) {
            return new class8(this.field8699, this.field8700, (class358) arg1);
        } else if (class252.field3689 == var3) {
            return new class254(this.field8699, this.field8700, (class342) arg1);
        } else if (class219.field2852 == var3) {
            return new class327(this.field8699, (class124) arg1);
        } else {
            if (arg0 != 5) {
                field8695 = null;
            }
            return class513.field7320 == var3 ? new class608(this.field8699, this.field8700, (class108) arg1) : null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V")
    public static void method3515(byte arg0) {
        field8695 = null;
        if (arg0 >= -52) {
            field8702 = 21;
        }
        field8703 = null;
        field8698 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lfp;Lfp;)V")
    public class626(class323 arg0, class323 arg1) {
        this.field8700 = arg1;
        this.field8699 = arg0;
    }
}
