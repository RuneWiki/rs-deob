import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class49 {

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public int field647;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Loha;")
    public class465 field646;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lld;")
    public class49 field641;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)Lai;")
    public final class217 method316(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field649++;
            return class548.method2965(this.field647, 27923);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)Lld;")
    public final class49 method317(int arg0, byte arg1) {
        field644++;
        return arg1 > -8 ? null : new class49(this.field647, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(IB)V")
    public static final void method318(int arg0, byte arg1) {
        field642++;
        class530.field6723 = arg0;
        class1.field6 = 2;
        long var2 = 0L;
        if (class528.field6708 == null) {
            class620.method3316(false, 35);
            return;
        }
        class234 var4 = new class234(class777.method4259((byte) -21, class210.method1407(class528.field6708, (byte) 125)));
        long var5 = var4.method1516(-11290);
        class196.field2730 = var4.method1516(-11290);
        class181.method1210("", class624.method3337(var5, 1), true, (byte) 37);
        if (arg1 == 108) {
            ;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public static final boolean method319(int arg0, int arg1) {
        field648++;
        if (arg1 != -60) {
            return false;
        } else if (arg0 == 6 || arg0 == 60 || arg0 == 59 || arg0 == 25 || arg0 == 19) {
            return true;
        } else {
            return arg0 == 44 || arg0 == 1001;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V")
    public class49(int arg0, int arg1) {
        this.field647 = arg0;
        this.field645 = arg1;
    }
}
