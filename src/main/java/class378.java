import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class378 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[[Lrr;")
    public static class379[][][] field5427;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([I)V")
    public abstract void method1962(int[] arg0);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method2335(int arg0) {
        if (arg0 == -8045) {
            field5427 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public abstract void method1942(int arg0);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
    public abstract void method1937(int arg0);

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public abstract void method1957(int arg0);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[I)V")
    public abstract void method1968(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
    public abstract void method1952(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
    public abstract void method1939(int arg0);

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
    public abstract void method1966(int arg0);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Leh;)V")
    public abstract void method1950(class378 arg0);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()Leh;")
    public abstract class378 method1951();

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)V")
    public abstract void method1959(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
    public static final void method2336(byte arg0, int arg1) {
        field5429++;
        if (arg0 > 23) {
            class678 var2 = class630.method3597(29636, 8, (long) arg1);
            var2.method3836((byte) -64);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III[I)V")
    public abstract void method1961(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III[I)V")
    public abstract void method1965(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZZ)I")
    public static final int method2337(int arg0, int arg1, boolean arg2, boolean arg3) {
        field5428++;
        class685 var4 = class26.method198(arg2, (byte) -19, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (!arg3) {
                method2337(-47, -76, true, false);
            }
            for (int var6 = 0; var6 < var4.field9721.length; var6++) {
                if (var4.field9723[var6] == arg0) {
                    var5 += var4.field9721[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
    public abstract void method1956();

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public abstract void method1940(int arg0);
}
