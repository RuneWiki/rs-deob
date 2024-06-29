import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class class123 extends class307 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lvt;")
    public static class344 field1536 = new class344("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "B")
    public static byte field1538;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient;")
    public static client field1540;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZBLkr;Ljava/lang/String;)Lcq;")
    public static final class106 method664(boolean arg0, byte arg1, class329 arg2, String arg3) {
        field1539++;
        int var4 = arg2.method2053((byte) 40, arg3);
        if (var4 == -1) {
            return new class106(0);
        }
        int[] var5 = arg2.method2068(0, var4);
        if (arg1 != 63) {
            field1538 = -41;
        }
        class106 var6 = new class106(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1371) {
                class551 var9 = new class551(arg2.method2054(true, var4, var5[var8++]));
                int var10 = var9.method3048(-4);
                int var11 = var9.method3090(-103);
                int var12 = var9.method3045(-126);
                if (!arg0 && var12 == 1) {
                    var6.field1371--;
                } else {
                    var6.field1374[var7] = var10;
                    var6.field1373[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
    public static final void method665(int arg0, int arg1) {
        field1541++;
        class367.method2251(127);
        int var2 = class642.field9326.method3404(false, arg1).field8718;
        if (var2 == 0) {
            return;
        }
        int var3 = class257.field3191.field5423[arg1];
        if (arg0 != 10391) {
            return;
        }
        if (var2 == 5) {
            class598.field8641 = var3;
        }
        if (var2 == 6) {
            class425.field5751 = var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lqa;IIIII[[[BIIIBII)V")
    public static final void method666(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[][][] arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        field1537++;
        if (arg9 == 0 || arg5 == 0) {
            return;
        }
        if (arg10 != 72) {
            method667(-31);
        }
        if (arg9 == 9) {
            arg8 = arg8 + 1 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 10) {
            arg8 = arg8 + 3 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        arg0.method910(arg2, arg7, arg4, arg12, arg3, arg11, arg6[arg9 - 1][arg8], arg5, arg1);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    public static void method667(int arg0) {
        int var1 = 79 % ((arg0 + 75) / 45);
        field1540 = null;
        field1536 = null;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)Lmca;")
    public abstract class5 method668(int arg0);

    static {
        new class344(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }
}
