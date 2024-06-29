import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class class414 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field6221 = 328;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lia;")
    public abstract class414 method910();

    @OriginalMember(owner = "client!ia", name = "ma", descriptor = "(I)V")
    public abstract void method911(int arg0);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "(I)V")
    public abstract void method914(int arg0);

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public abstract void method906(int arg0);

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "([I)V")
    public abstract void method909(int[] arg0);

    @OriginalMember(owner = "client!ia", name = "ba", descriptor = "(Lia;)V")
    public abstract void method903(class414 arg0);

    @OriginalMember(owner = "client!ia", name = "ZA", descriptor = "(III)V")
    public abstract void method901(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "(III)V")
    public abstract void method913(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method2489(int arg0) {
        if (arg0 != 3139) {
            field6221 = -124;
        }
        field6222++;
        class269.field3927 = 0;
        int var1 = (class500.field7365.field1763 >> 7) + class68.field1038;
        int var2 = (class500.field7365.field1769 >> 7) + class24.field259;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class269.field3927 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class269.field3927 = 1;
        }
        if (class269.field3927 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class269.field3927 = 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public static final int method2490(int arg0, int arg1) {
        field6220++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            if (arg0 != -31968) {
                method2490(-80, 107);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "(III[I)V")
    public abstract void method912(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "(IIIIII)V")
    public abstract void method900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ia", name = "HA", descriptor = "()V")
    public abstract void method902();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III[I)V")
    public abstract void method908(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ia", name = "na", descriptor = "(I)V")
    public abstract void method905(int arg0);

    @OriginalMember(owner = "client!ia", name = "YA", descriptor = "(I)V")
    public abstract void method907(int arg0);
}
