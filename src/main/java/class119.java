import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class119 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "[B")
    public byte[] field1645;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "[S")
    public short[] field1644;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "[S")
    public short[] field1646;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "[S")
    public short[] field1647;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lvj;I)Lqba;")
    public static final class104 method779(class26 arg0, int arg1) {
        field1643++;
        int var2 = arg0.method193(2);
        class92 var3 = class327.method1910((byte) -17)[arg0.method194((byte) 119)];
        class482 var4 = class488.method2860((byte) 107)[arg0.method194((byte) 119)];
        int var5 = arg0.method173(-3);
        if (arg1 == 0) {
            int var6 = arg0.method173(arg1 - 3);
            return new class104(var2, var3, var4, var5, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static final void method780(int arg0) {
        field1648++;
        for (int var1 = arg0; var1 < class676.field9533; var1++) {
            int var2 = class731.field10231[var1];
            class15 var3 = (class15) class403.field5587.method1381(true, (long) var2);
            if (var3 != null) {
                class55 var4 = var3.field204;
                class5.method19(arg0 - 1430, var4, var4.field771.field134);
            }
        }
    }
}
