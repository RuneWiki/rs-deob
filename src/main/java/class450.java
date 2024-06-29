import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class450 implements class758 {

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "Lkk;")
    private class190 field6495;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "Loh;")
    private class404 field6496;

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "Lpfa;")
    public static class295 field6490 = new class295(64);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Lhu;")
    private class131 field6494;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)Z", line = 9)
    public final boolean method9(byte arg0) {
        if (arg0 != 119) {
            this.field6495 = null;
        }
        field6491++;
        return this.field6496.method2463((byte) 122, this.field6495.field2245);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V", line = 24)
    public static void method2775(boolean arg0) {
        if (arg0) {
            field6490 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V", line = 34)
    public final void method11(int arg0) {
        field6489++;
        this.field6494 = class563.method3280(this.field6496, arg0 ^ arg0, this.field6495.field2245);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)V", line = 43)
    public final void method12(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = class705.field9926 > class12.field92 ? class705.field9926 : class12.field92;
            int var4 = class476.field6777 > class181.field2143 ? class476.field6777 : class181.field2143;
            int var5 = this.field6494.method501();
            int var6 = this.field6494.method510();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var9 = var4;
                var10 = 0;
                var7 = (var3 - var8) / 2;
            }
            this.field6494.method814(var7, var10, var8, var9);
        }
        int var11 = -55 / ((arg1 + 56) / 42);
        field6497++;
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Loh;Lkk;)V", line = 83)
    public class450(class404 arg0, class190 arg1) {
        this.field6495 = arg1;
        this.field6496 = arg0;
    }
}
