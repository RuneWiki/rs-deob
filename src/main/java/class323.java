import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class323 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lpg;")
    public static class492 field4981 = new class492(1, 3);

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "[I")
    public static int[] field4985 = new int[200];

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lui;")
    public static class375 field4982 = new class375(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 9)
    public static final void method2099(int arg0, int arg1) {
        class420 var2 = class380.field5802[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class420 var4 = class380.field5802[var3][arg0][arg1] = class380.field5802[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6272--;
                for (class115 var5 = var4.field6273; var5 != null; var5 = var5.field1600) {
                    class153 var6 = var5.field1594;
                    if (var6.field2208 == arg0 && var6.field2216 == arg1) {
                        var6.field2210--;
                    }
                }
            }
        }
        if (class380.field5802[0][arg0][arg1] == null) {
            class380.field5802[0][arg0][arg1] = new class420(0, arg0, arg1);
            class380.field5802[0][arg0][arg1].field6274 = 1;
        }
        class380.field5802[0][arg0][arg1].field6275 = var2;
        class380.field5802[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 57)
    public static void method2100(int arg0) {
        field4982 = null;
        field4985 = null;
        field4981 = null;
        if (arg0 != 27523) {
            method2099(-117, 59);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1634(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1635(byte arg0);

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B[B)V")
    public abstract void method1633(byte arg0, byte[] arg1);
}
