import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class421 extends class112 {

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public int field5349 = (int) (class446.method2525(500) / 1000L);

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "S")
    public short field5350;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Ljava/lang/String;")
    public String field5353;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
    public static final void method2346(boolean arg0) {
        field5351++;
        int var1 = 0;
        if (class748.field10451.field10427.method4196((byte) -89) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class748.field10451.field10420.method1877((byte) 54) == 0) {
            var1 |= 0x40;
        }
        class650.method3646(var1, false);
        client.field3995.method3380(var1, (byte) 127);
        class21.field381.method1580(var1, 3159);
        class300.field3941.method3865(arg0, var1);
        class234.field3057.method2088(!arg0, var1);
        class102.method817(10, var1);
        class235.method1475(0, var1);
        class746.method4151(!arg0, var1);
        class720.method4026(var1, false);
        class540.method3099(3);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static final void method2347(byte arg0) {
        class344.field4356 = true;
        if (arg0 == -47) {
            field5352++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class421(String arg0, int arg1) {
        this.field5350 = (short) arg1;
        this.field5353 = arg0;
    }
}
