import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class466 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public int field6801;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lpm;")
    public class412 field6798;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[I")
    public int[] field6797;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Llh;B)Loh;", line = 9)
    public static final class278 method2739(class365 arg0, byte arg1) {
        if (arg1 != 32) {
            return null;
        }
        arg0.method2099(arg1 + 223);
        field6802++;
        int var2 = arg0.method2099(255);
        class278 var3 = class158.method976(var2, (byte) 41);
        var3.field3751 = arg0.method2099(arg1 + 223);
        int var4 = arg0.method2099(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2099(255);
            var3.method210(arg0, arg1 - 30478, var6);
        }
        var3.method207(2);
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Los;", line = 51)
    public static final class305 method2740(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class305 var4 = var3.field837;
            var3.field837 = null;
            return var4;
        }
    }
}
