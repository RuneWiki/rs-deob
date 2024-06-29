import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class401 extends class542 {

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "I")
    private int field6106;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    private int field6104;

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    private int field6114;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    private int field6103;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    private int field6110;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    private int field6111;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    private int field6101;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    private int field6105;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "Lof;")
    public static class446 field6109 = new class446("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "Ljf;")
    public static class146 field6112;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "[I")
    public static int[] field6108;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public static void method2478(int arg0) {
        field6112 = null;
        field6109 = null;
        field6108 = null;
        int var1 = -5 / ((-7 - arg0) / 48);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BII)V")
    public final void method930(byte arg0, int arg1, int arg2) {
        ++field6100;
        if (arg0 >= -107) {
            method2480(47);
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6106 = arg7;
        this.field6104 = arg3;
        this.field6114 = arg5;
        this.field6103 = arg6;
        this.field6110 = arg0;
        this.field6111 = arg1;
        this.field6101 = arg2;
        this.field6105 = arg4;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIB)V")
    public final void method931(int arg0, int arg1, byte arg2) {
        ++field6099;
        int var4 = this.field6110 * arg0 >> 12;
        int var5 = this.field6111 * arg1 >> 12;
        int var6 = this.field6101 * arg0 >> 12;
        if (arg2 != 0) {
            this.method931(60, -76, (byte) 104);
        }
        int var7 = this.field6104 * arg1 >> 12;
        int var8 = this.field6105 * arg0 >> 12;
        int var9 = this.field6114 * arg1 >> 12;
        int var10 = this.field6103 * arg0 >> 12;
        int var11 = this.field6106 * arg1 >> 12;
        class283.method1822(var11, var5, var6, super.field7926, var7, var10, var8, var9, (byte) -108, var4);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)V")
    public static final void method2479(int arg0, int arg1) {
        ++field6107;
        if (arg0 == -23383) {
            int var2 = -class402.field6123 + class393.field6017;
            if (~var2 <= -101) {
                class340.field5269 = 1;
            } else {
                int var3 = (int) class536.field7870;
                if (var3 < class426.field6481 >> 8) {
                    var3 = class426.field6481 >> 8;
                }
                if (class17.field286[4] && var3 < class475.field7056[4] - -128) {
                    var3 = class475.field7056[4] + 128;
                }
                int var4 = 16383 & (int) class53.field744 + class147.field1957;
                class107.method682(var3, (var3 >> 3) * 3 + 600 << 0, class312.field4571, (byte) -110, var4, -50 + class352.method2264(arg0 + 23283, class367.field5618, class56.field800.field1862, class56.field800.field1867), class366.field5609, arg1);
                float var5 = 1.0F - (float) ((100 - var2) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F;
                class296.field4378 = (int) ((float) (class296.field4378 - class96.field1433) * var5 + (float) class96.field1433);
                class199.field2646 = (int) ((float) (-class205.field2739 + class199.field2646) * var5 + (float) class205.field2739);
                class26.field384 = (int) ((float) (-class536.field7872 + class26.field384) * var5 + (float) class536.field7872);
                class140.field1869 = (int) ((float) (-class67.field958 + class140.field1869) * var5 + (float) class67.field958);
                int var6 = -class282.field4150 + class49.field702;
                if (~var6 < -8193) {
                    var6 -= 16384;
                } else if (var6 < -8192) {
                    var6 += 16384;
                }
                class49.field702 = (int) ((float) var6 * var5 + (float) class282.field4150);
                class49.field702 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
    public static final void method2480(int arg0) {
        if (arg0 >= -32) {
            field6108 = null;
        }
        for (int var1 = 0; var1 < class178.field2382.length; ++var1) {
            for (int var2 = 0; var2 < class178.field2382[0].length; ++var2) {
                for (int var3 = 0; ~class178.field2382[0][0].length < ~var3; ++var3) {
                    class178.field2382[var1][var2][var3] = 0;
                }
            }
        }
        ++field6113;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        if (arg0 == 21074) {
            ++field6102;
        }
    }
}
