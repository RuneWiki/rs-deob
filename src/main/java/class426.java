import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class426 extends class13 {

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "I")
    private int field6004 = -1;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "[Lhh;")
    public static class67[] field5999 = new class67[4];

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "Lkn;")
    public static class442 field6002 = new class442("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    private int field5996;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!nk", name = "I", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    private int field6007;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "[I")
    public static int[] field5997;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "[I")
    private int[] field6000;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 5)
    public static void method2689(int arg0) {
        field5999 = null;
        field6002 = null;
        if (arg0 != 64) {
            field5999 = null;
        }
        field5997 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZII)V", line = 20)
    public final void method224(boolean arg0, int arg1, int arg2) {
        super.method224(arg0, arg1, arg2);
        ++field6005;
        if (this.field6004 >= 0 && class30.field498 != null) {
            int var4 = !class30.field498.method469(this.field6004, (byte) -78).field6488 ? 128 : 64;
            this.field6000 = class30.field498.method472(var4, (byte) -72, 1.0F, false, this.field6004, var4);
            this.field5996 = var4;
            this.field6007 = var4;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[[I", line = 40)
    public final int[][] method222(int arg0, int arg1) {
        if (arg0 != -27832) {
            return null;
        } else {
            ++field6006;
            int[][] var3 = super.field256.method1930(arg1, (byte) 99);
            if (super.field256.field4154) {
                int var4 = this.field5996 * (~class413.field5862 == ~this.field6007 ? arg1 : this.field6007 * arg1 / class413.field5862);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (class269.field3751 == this.field5996) {
                    for (int var8 = 0; ~var8 > ~class269.field3751; ++var8) {
                        int var9 = this.field6000[var4++];
                        var7[var8] = class387.method2454(var9 << 4, 4080);
                        var6[var8] = class387.method2454(var9 >> 4, 4080);
                        var5[var8] = class387.method2454(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~var10 > ~class269.field3751; ++var10) {
                        int var11 = this.field5996 * var10 / class269.field3751;
                        int var12 = this.field6000[var4 - -var11];
                        var7[var10] = class387.method2454(var12 << 4, 4080);
                        var6[var10] = class387.method2454(var12 >> 4, 4080);
                        var5[var10] = class387.method2454(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 105)
    public class426() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)I", line = 113)
    public final int method226(byte arg0) {
        int var2 = -127 % ((-43 - arg0) / 41);
        ++field6003;
        return this.field6004;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lkh;BI)V", line = 130)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field6004 = arg0.method174(255);
        }
        ++field6008;
        if (arg1 <= 50) {
            this.method226((byte) 108);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 150)
    public final void method221(byte arg0) {
        ++field5998;
        if (arg0 >= -7) {
            field5997 = null;
        }
        super.method221((byte) -89);
        this.field6000 = null;
    }
}
