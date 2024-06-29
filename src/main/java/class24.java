import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class24 extends class425 {

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lpm;")
    public static class349 field301;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Lub;")
    public static class15 field305;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Lna;")
    public static class30 field297;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Z")
    public static boolean field304;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "[[[Lls;")
    public static class74[][][] field306;

    static {
        new class349("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field303 = 13156520;
        field301 = new class349("purple:", "lila:", "violet:", "roxo:");
        field305 = new class15(64);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Llf;I)Lfe;", line = 3)
    public static final class341 method128(class130 arg0, int arg1) {
        field296++;
        class341 var2 = new class341();
        var2.field4935 = arg0.method798(false);
        if (arg1 != 0) {
            method130((Object[]) null, -89, (long[]) null);
        }
        var2.field4936 = class23.method126(32767, var2.field4935);
        return var2;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V", line = 18)
    public static void method129(byte arg0) {
        field301 = null;
        field306 = null;
        field297 = null;
        field305 = null;
        int var1 = -55 / ((arg0 - 65) / 52);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([Ljava/lang/Object;I[J)V", line = 30)
    public static final void method130(Object[] arg0, int arg1, long[] arg2) {
        class441.method2746(0, -106, arg0, arg2.length - 1, arg2);
        field300++;
        if (arg1 != -4210) {
            method129((byte) 11);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V", line = 50)
    public static final void method131(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class131.field1914 * arg0 >> 8;
        field302++;
        if (arg2 != -11494) {
            field303 = 46;
        }
        if (var4 != 0 && arg1 != -1) {
            class100.method582(arg2 ^ 0xFFFFD318, arg1, 0, false, class173.field2448, var4);
            class96.field1223 = true;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V", line = 72)
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field298++;
        if (class266.field3910 != 0 && arg2 != 0 && class221.field3176 < 50 && arg3 != -1) {
            class23.field293[class221.field3176] = arg3;
            class265.field3892[class221.field3176] = arg2;
            class32.field411[class221.field3176] = arg0;
            class259.field3830[class221.field3176] = null;
            class430.field6122[class221.field3176] = 0;
            class168.field2384[class221.field3176] = arg1;
            class221.field3176++;
        }
        if (arg4 != -1) {
            field301 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 102)
    public class24() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V", line = 113)
    public class24(int arg0) {
        this.field299 = arg0;
    }
}
