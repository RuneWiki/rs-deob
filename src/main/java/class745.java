import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class745 {

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "Ljn;")
    public static class134 field10278 = new class134(20, 4);

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "F")
    public static float field10281;

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
    public static final void method4122(int arg0, int arg1) {
        if (arg1 != -32597) {
            field10281 = 0.10680799F;
        }
        field10280++;
        class18.field124 = arg0;
        class39 var2 = class4.field26;
        synchronized (class4.field26) {
            class4.field26.method314(-2);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
    public static void method4123(boolean arg0) {
        if (arg0) {
            field10278 = null;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I[ILkf;Z)V")
    public static final void method4124(int arg0, int[] arg1, class359 arg2, boolean arg3) {
        field10279++;
        if (arg2.field9173 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field9173.length; var5++) {
                if (arg2.field9173[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field9150 != -1) {
                class73 var6 = class571.field8029.method3695(arg2.field9150, (byte) -128);
                int var7 = var6.field818;
                if (var7 == 1) {
                    arg2.field9168 = 0;
                    arg2.field9117 = 1;
                    arg2.field9203 = 0;
                    arg2.field9135 = arg0;
                    arg2.field9123 = 0;
                    if (!arg2.field9136) {
                        class538.method3196(arg2, arg2.field9203, true, var6);
                    }
                }
                if (var7 == 2) {
                    arg2.field9168 = 0;
                }
            }
        }
        boolean var8 = arg3;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field9173 == null || arg2.field9173[var9] == -1 || class571.field8029.method3695(arg1[var9], (byte) -120).field802 >= class571.field8029.method3695(arg2.field9173[var9], (byte) -120).field802) {
                arg2.field9173 = arg1;
                arg2.field9216 = arg2.field9215;
                arg2.field9135 = arg0;
            }
        }
        if (var8) {
            arg2.field9135 = arg0;
            arg2.field9173 = arg1;
            arg2.field9216 = arg2.field9215;
        }
    }
}
