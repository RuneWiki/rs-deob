import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class183 implements Runnable {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Z")
    public boolean field3069 = true;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Ljava/lang/Object;")
    public Object field3073 = new Object();

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "[I")
    public int[] field3074 = new int[500];

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[I")
    public int[] field3076 = new int[500];

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field3075 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Ltl;")
    private static class59 field3072 = class85.method639("shake:", 9588);

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "Ltl;")
    public static class59 field3070 = field3072;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Ltl;")
    public static class59 field3071 = field3072;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lme;")
    public static class295 field3068;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[[[B")
    public static byte[][][] field3062;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V", line = 4)
    public static void method1357(int arg0) {
        field3068 = null;
        field3071 = null;
        field3070 = null;
        field3062 = (byte[][][]) null;
        int var1 = -125 % ((arg0 - 55) / 57);
        field3072 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 18)
    public static final void method1358(int arg0, int arg1) {
        field3067++;
        class186 var2 = class67.method561(32, arg1, arg0);
        var2.method1381(true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)I", line = 42)
    public static final int method1359(int arg0, int arg1, int arg2) {
        if (arg2 != -31247) {
            field3062 = (byte[][][]) ((byte[][][]) null);
        }
        field3066++;
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "run", descriptor = "()V", line = 78)
    public final void run() {
        while (this.field3069) {
            Object var1 = this.field3073;
            synchronized (this.field3073) {
                if (this.field3075 < 500) {
                    this.field3076[this.field3075] = class254.field4213;
                    this.field3074[this.field3075] = class184.field3079;
                    this.field3075++;
                }
            }
            method1360(false, 50L);
        }
        field3065++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZJ)V", line = 106)
    public static final void method1360(boolean arg0, long arg1) {
        field3064++;
        if (arg0) {
            field3068 = (class295) null;
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class100.method756(1, arg1 - 1L);
            class100.method756(1, 1L);
        } else {
            class100.method756(1, arg1);
        }
    }
}
