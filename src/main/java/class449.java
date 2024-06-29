import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class449 extends class529 {

    @OriginalMember(owner = "client!rt", name = "H", descriptor = "Lmq;")
    public static class78 field6305 = new class78(35, -1);

    @OriginalMember(owner = "client!rt", name = "K", descriptor = "Lmq;")
    public static class78 field6308 = new class78(1, -1);

    @OriginalMember(owner = "client!rt", name = "O", descriptor = "[Lin;")
    public static class365[] field6312 = null;

    @OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
    private int field6301;

    @OriginalMember(owner = "client!rt", name = "E", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!rt", name = "F", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!rt", name = "I", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!rt", name = "J", descriptor = "I")
    private int field6307;

    @OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
    private int field6309;

    @OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!rt", name = "N", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method592(int arg0, int arg1) {
        ++field6303;
        if (arg1 != 2) {
            method2646(65);
        }
        int[][] var3 = super.field7450.method2241(arg1 ^ -3, arg0);
        if (super.field7450.field5165) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class304.field3909; ++var7) {
                var4[var7] = this.field6301;
                var5[var7] = this.field6309;
                var6[var7] = this.field6307;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBLtn;)V", line = 42)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field6304;
        if (~arg0 == -1) {
            this.method2645(arg2.method1114(112), -75);
        }
        if (arg1 <= 45) {
            this.method190(114, (byte) -85, (class179) null);
        }
    }

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "(B)V", line = 70)
    public static final void method2644(byte arg0) {
        ++field6302;
        class283 var1 = (class283) class679.field9210.method3111(75);
        if (arg0 != 68) {
            field6308 = null;
        }
        boolean var2 = class85.field1090 != null || ~class598.field8294 < -1;
        int var3 = var1.method1702((byte) -95);
        int var4 = var1.method1706(true);
        if (var2) {
            class128.field1555 = 1;
        }
        if (!var2) {
            class268.method1607((byte) -16, var3, class750.field10502, var4);
        } else {
            class115.field1415 = class750.field10502;
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(II)V", line = 97)
    private final void method2645(int arg0, int arg1) {
        this.field6309 = (65280 & arg0) >> 4;
        ++field6306;
        if (arg1 > -69) {
            field6312 = null;
        }
        this.field6307 = (255 & arg0) << 4;
        this.field6301 = (arg0 & 16711680) >> 12;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V", line = 115)
    public class449() {
        this(0);
    }

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "(I)V", line = 119)
    public static void method2646(int arg0) {
        field6308 = null;
        field6312 = null;
        field6305 = null;
        int var1 = 77 % ((arg0 - -16) / 46);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V", line = 131)
    private class449(int arg0) {
        super(0, false);
        this.method2645(arg0, -107);
    }
}
