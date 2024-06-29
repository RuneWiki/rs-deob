import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public abstract class class14 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lni;")
    public static class367 field262 = new class367(30, 3);

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
    public static boolean field265 = false;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Luu;")
    public static class191 field264;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)I", line = 10)
    public static final int method143(int arg0, int arg1, int arg2) {
        field263++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + arg1;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 23)
    public static void method144(int arg0) {
        field262 = null;
        field264 = null;
        if (arg0 != 789221) {
            method143(-23, 6, -67);
        }
    }

    @OriginalMember(owner = "client!n", name = "IA", descriptor = "(IIIIII)V")
    public abstract void method140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "C", descriptor = "(III)V")
    public abstract void method141(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I)V")
    public abstract void method142(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!n", name = "SA", descriptor = "(I)V")
    public abstract void method145(int arg0);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "(III)V")
    public abstract void method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!n", name = "N", descriptor = "(III[I)V")
    public abstract void method147(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!n", name = "K", descriptor = "()V")
    public abstract void method148();

    @OriginalMember(owner = "client!n", name = "M", descriptor = "([I)V")
    public abstract void method149(int[] arg0);

    @OriginalMember(owner = "client!n", name = "s", descriptor = "(I)V")
    public abstract void method150(int arg0);

    @OriginalMember(owner = "client!n", name = "ya", descriptor = "(Ln;)V")
    public abstract void method151(class14 arg0);

    @OriginalMember(owner = "client!n", name = "ba", descriptor = "(I)V")
    public abstract void method152(int arg0);

    @OriginalMember(owner = "client!n", name = "CA", descriptor = "(I)V")
    public abstract void method153(int arg0);

    @OriginalMember(owner = "client!n", name = "WA", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()Ln;")
    public abstract class14 method155();
}
