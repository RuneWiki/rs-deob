import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class310 {

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([Lnfa;II)V", line = 49)
    public static final void method1903(class745[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class745 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field10348;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field10348 < (var7 & 0x1) + var6) {
                class745 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1903(arg0, arg1, var4 - 1);
        method1903(arg0, var4 + 1, arg2);
    }
}
