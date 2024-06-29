import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class282 implements Runnable {

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Z")
    public boolean field4844 = true;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field4841 = new Object();

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public int field4854 = 0;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "[I")
    public int[] field4855 = new int[500];

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "[I")
    public int[] field4856 = new int[500];

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Z")
    public static boolean field4843 = false;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Loh;")
    private static class258 field4847 = class153.method1046("Loading )2 please wait)3", 114);

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field4850 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "Loh;")
    public static class258 field4853 = field4847;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lsk;")
    public static class202 field4849;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lgb;")
    public static class213 field4840;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[Lkl;")
    public static class65[] field4848;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1977(int arg0, int arg1) {
        if (arg1 != -501) {
            method1981((byte) 14);
        }
        field4845++;
        for (class119 var2 = (class119) class103.field1871.method985(117); var2 != null; var2 = (class119) class103.field1871.method983(-1)) {
            if ((long) arg0 == (var2.field2642 >> 48 & 0xFFFFL)) {
                var2.method1054((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILgb;II)[Lkl;", line = 37)
    public static final class65[] method1978(int arg0, class213 arg1, int arg2, int arg3) {
        field4852++;
        return class162.method1086(arg3 ^ arg3, arg1, arg2, arg0) ? class47.method385(arg3 ^ 0xFFFFB9DC) : null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 54)
    public static void method1979(int arg0) {
        field4840 = null;
        if (arg0 != 12716) {
            field4849 = (class202) null;
        }
        field4849 = null;
        field4853 = null;
        field4848 = null;
        field4847 = null;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Z", line = 68)
    public static final boolean method1980(int arg0, int arg1) {
        if (arg1 == 0) {
            field4846++;
            return (arg0 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V", line = 99)
    public static final void method1981(byte arg0) {
        class179.field3200.method1161(-63);
        class51.field803.method1161(-57);
        class265.field4609.method1161(78);
        if (arg0 <= -25) {
            field4842++;
        }
    }

    @OriginalMember(owner = "client!bm", name = "run", descriptor = "()V", line = 113)
    public final void run() {
        while (this.field4844) {
            Object var1 = this.field4841;
            synchronized (this.field4841) {
                if (this.field4854 < 500) {
                    this.field4855[this.field4854] = class194.field3423;
                    this.field4856[this.field4854] = class226.field3882;
                    this.field4854++;
                }
            }
            class237.method1628((byte) -88, 50L);
        }
        field4851++;
    }
}
