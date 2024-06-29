import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class379 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "J")
    public static long field5239 = 0L;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[I")
    public static int[] field5240 = new int[8];

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lvo;")
    public static class345 field5241;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([Lvj;II)V", line = 4)
    public static final void method2251(class204[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class204 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3164;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3164 > (var7 & 0x1) + var6) {
                class204 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2251(arg0, arg1, var4 - 1);
        method2251(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 46)
    public static void method2252(int arg0) {
        field5240 = null;
        field5241 = null;
        if (arg0 != 1) {
            method2252(-100);
        }
    }
}
