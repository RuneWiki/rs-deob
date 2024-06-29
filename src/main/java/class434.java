import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class434 extends class159 {

    @OriginalMember(owner = "client!za", name = "k", descriptor = "Lmw;")
    public static class517 field6260 = new class517(89, 15);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!za", name = "n", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2602(boolean arg0) {
        field6260 = null;
        if (!arg0) {
            field6260 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I", line = 21)
    public static final int method2603(int arg0, int arg1) {
        int var2 = -77 / ((26 - arg0) / 47);
        field6262++;
        int var3 = ((arg1 & 0xAAAAAAAB) >>> 1) + (arg1 & 0x55555555);
        int var4 = ((var3 & 0xCCCCCCCC) >>> 2) + (var3 & 0x33333333);
        int var5 = var4 + (var4 >>> 4) & 0xF0F0F0F;
        int var6 = (var5 >>> 8) + var5;
        int var7 = (var6 >>> 16) + var6;
        return var7 & 0xFF;
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ZIILuq;III)V", line = 36)
    public static final void method2604(boolean arg0, int arg1, int arg2, class172 arg3, int arg4, int arg5, int arg6) {
        class122.field1694 = arg4;
        class765.field10514 = arg3;
        class289.field4115 = arg6;
        class100.field1451 = arg0;
        class460.field6563 = arg5;
        field6263++;
        class709.field9701 = arg2;
        class786.field10798 = arg1;
        class348.field5049 = null;
    }
}
