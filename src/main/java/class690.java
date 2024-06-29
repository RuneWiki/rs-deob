import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class690 extends class168 {

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field9597;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public int field9594;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "Z")
    public static boolean field9598 = true;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 9)
    public static final void method3870(String arg0, int arg1) {
        if (arg1 != 0) {
            method3870(null, -7);
        }
        field9596++;
        if (arg0.equals("")) {
            return;
        }
        class532.field7388++;
        class589 var2 = class514.method2994(-29488, class760.field10605, class88.field1221);
        var2.field8251.method2578(class747.method4155(-1, arg0), arg1 ^ 0xB73181F0);
        var2.field8251.method2597(arg0, (byte) 70);
        class737.method4107(var2, 7);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BIZLha;)Ltia;", line = 28)
    public static final class270 method3871(byte arg0, int arg1, boolean arg2, class60 arg3) {
        if (arg0 != -38) {
            field9598 = true;
        }
        field9595++;
        if (arg1 == -1) {
            return null;
        }
        if (class628.field8647 != null) {
            for (int var4 = 0; var4 < class628.field8647.length; var4++) {
                if (class628.field8647[var4] == arg1) {
                    return class517.field7241[var4];
                }
            }
        }
        class270 var5 = (class270) class372.field4784.method3079((long) arg1, arg0 ^ 0xFFFFFFDA);
        if (var5 != null) {
            if (arg2 && var5.field3402 == null) {
                class274 var6 = class335.method1930(arg1, (byte) -72, class596.field8307);
                if (var6 == null) {
                    return null;
                }
                var5.field3402 = var6;
            }
            return var5;
        }
        class728[] var7 = class728.method4058(class640.field8890, arg1);
        if (var7 == null) {
            return null;
        }
        class274 var8 = class335.method1930(arg1, (byte) -72, class596.field8307);
        if (var8 == null) {
            return null;
        }
        class270 var9;
        if (arg2) {
            var9 = new class270(arg3.method500(var8, var7, true), var8);
        } else {
            var9 = new class270(arg3.method500(var8, var7, true));
        }
        class372.field4784.method3077((byte) 104, (long) arg1, var9);
        return var9;
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(II)V", line = 94)
    public class690(int arg0, int arg1) {
        this.field9597 = arg1;
        this.field9594 = arg0;
    }
}
