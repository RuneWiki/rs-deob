import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class455 extends class107 {

    @OriginalMember(owner = "client!rba", name = "A", descriptor = "[B")
    public byte[] field6378;

    @OriginalMember(owner = "client!rba", name = "y", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lha;I)V")
    public static final void method2711(class65 arg0, int arg1) {
        class65.field792 = new class717[class63.field756.length];
        field6377++;
        for (int var2 = 0; var2 < class63.field756.length; var2++) {
            int var3 = class63.field756[var2];
            class6 var4 = class119.method899(-30298, class452.field6351, var3);
            class66 var5 = arg0.method437(var4, class1.method2(class268.field3900, var3), true);
            class65.field792[var2] = new class717(var5, var4);
        }
        if (arg1 < -60) {
            ;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIII)I")
    public static final int method2712(int arg0, int arg1, int arg2, int arg3) {
        field6376++;
        if (class197.field3016 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class117.field1804;
        if (arg1 < 17) {
            method2711(null, -116);
        }
        int var7 = arg2 - class117.field1806;
        for (class492 var8 = (class492) class117.field1801.method1731((byte) -120); var8 != null; var8 = (class492) class117.field1801.method1724(0)) {
            if (var8.field6971 == arg0) {
                int var9 = var8.field6970;
                int var10 = var8.field6969;
                int var11 = class117.field1806 + var10 | class117.field1804 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "([B)V")
    public class455(byte[] arg0) {
        this.field6378 = arg0;
    }
}
