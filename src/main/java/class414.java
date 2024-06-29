import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class414 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)I", line = 5)
    public static final int method2402(int arg0, boolean arg1) {
        if (arg1) {
            method2405(true);
        }
        field5729++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lm;ILjs;ILjava/awt/Canvas;)Lqa;", line = 25)
    public static final class162 method2403(class126 arg0, int arg1, class216 arg2, int arg3, Canvas arg4) {
        field5731++;
        if (arg1 > -82) {
            method2405(true);
        }
        return new class469(arg3, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 50)
    public static final void method2404(String arg0, int arg1) {
        class223.method1400("", 0, "", arg0, false, 0);
        field5730++;
        if (arg1 >= -40) {
            field5728 = 11;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)[Lvf;", line = 61)
    public static final class103[] method2405(boolean arg0) {
        if (arg0) {
            field5728 = -69;
        }
        field5727++;
        return new class103[] { class514.field7572, class514.field7575, class514.field7576, class514.field7577, class514.field7578, class514.field7579, class514.field7580, class514.field7581, class514.field7582, class514.field7583 };
    }

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method964();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method968(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method961(int arg0);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method959(int arg0);

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method971(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method972(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method970(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method967(int arg0);

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method969(int arg0);

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method973(int[] arg0);

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method966(int arg0);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method960(class414 arg0);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lia;")
    public abstract class414 method962();
}
