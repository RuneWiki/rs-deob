import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class727 {

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    private static int field10163 = 0;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Z")
    private static boolean field10165 = false;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lnt;")
    private static class220 field10164 = new class220();

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 12)
    public static final synchronized void method4042(int arg0) {
        if (arg0 != 0) {
            field10164 = null;
        }
        field10163++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V", line = 22)
    public static final synchronized void method4043(boolean arg0, int arg1) {
        if (arg1 > 109) {
            field10165 = arg0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 35)
    public static final synchronized void method4044(int arg0) {
        while (true) {
            class597 var1 = (class597) field10164.method1521(124);
            if (var1 == null) {
                int var2 = -93 / ((arg0 + 6) / 60);
                return;
            }
            var1.field8714.method107(true);
            var1.method3617(1);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Le;I)V", line = 55)
    public static final synchronized void method4045(class529 arg0, int arg1) {
        if (field10165) {
            return;
        }
        if (arg1 != 13483) {
            method4042(-28);
        }
        if (field10163 <= 0) {
            arg0.method107(false);
        } else {
            class597 var2 = new class597();
            var2.field8714 = arg0;
            field10164.method1526(var2, -87);
        }
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 82)
    public static final synchronized void method4046(int arg0) {
        field10163--;
        int var1 = -15 / ((49 - arg0) / 41);
        if (field10163 == 0) {
            method4044(-99);
        }
    }
}
