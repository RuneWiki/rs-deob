import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class630 {

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
    private int[] field8799;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Lmia;")
    public static class63 field8798 = new class63(25, 16);

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method3631(int arg0) {
        if (arg0 != 11902) {
            field8798 = null;
        }
        field8798 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static final void method3632(byte arg0) {
        field8793++;
        class729.field10214.method484(((float) class63.field916.field10190.method1967(17503) * 0.1F + 0.7F) * 1.1523438F);
        class729.field10214.method460(class283.field4021, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
        class729.field10214.method526(class162.field2576, -1, 0);
        class729.field10214.method440(class396.field5947);
        if (arg0 <= 55) {
            field8794 = -92;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)I")
    public final int method3633(int arg0, byte arg1) {
        field8795++;
        if (arg1 <= 103) {
            this.method3633(-66, (byte) -69);
        }
        int var3 = (this.field8799.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field8799[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field8799[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)I")
    public static final int method3634(boolean arg0) {
        if (arg0) {
            field8794 = 103;
        }
        field8797++;
        if ((double) class84.field1179 == 3.0D) {
            return 37;
        } else if ((double) class84.field1179 == 4.0D) {
            return 50;
        } else if ((double) class84.field1179 == 6.0D) {
            return 75;
        } else if ((double) class84.field1179 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "([I)V")
    public class630(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field8799 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field8799[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field8799[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field8799[var5 + var5] = arg0[var4];
            this.field8799[var5 + var5 + 1] = var4++;
        }
    }
}
