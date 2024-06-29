import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class491 {

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "F")
    public static float field6712;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static final void method2780(int arg0) {
        class361.field4765 = true;
        field6713++;
        int var1 = 91 % ((39 - arg0) / 36);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([Lvv;II)V")
    public static final void method2781(class295[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class295 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field4038;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field4038 > (var7 & 0x1) + var6) {
                class295 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2781(arg0, arg1, var4 - 1);
        method2781(arg0, var4 + 1, arg2);
    }
}
