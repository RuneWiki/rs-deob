import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class309 extends class404 {

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    private int field4666 = 4096;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
    public static int[] field4664 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "Lsk;")
    public static class423 field4665 = new class423("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIZI)V", line = 4)
    public static final void method1853(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class230.field3508.field585 = 0;
        ++field4669;
        class230.field3508.method221(-1, class247.field3792.field3849);
        class230.field3508.method221(-1, arg0);
        class230.field3508.method221(-1, arg1);
        class230.field3508.method246((byte) -52, arg4);
        class230.field3508.method246((byte) -126, arg2);
        if (!arg3) {
            class407.field5909 = -3;
            class284.field4292 = 0;
            class390.field5712 = 0;
            class74.field1320 = 1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 116)
    public class309() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V", line = 31)
    public static void method1854(boolean arg0) {
        field4664 = null;
        field4665 = null;
        if (arg0) {
            field4665 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I", line = 49)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 > -47) {
            this.method90(83, 93);
        }
        ++field4668;
        int[] var3 = super.field5870.method372(arg1, (byte) -27);
        if (super.field5870.field810) {
            int[] var4 = this.method2394(0, (byte) 64, class435.field6374 & arg1 - 1);
            int[] var5 = this.method2394(0, (byte) 64, arg1);
            int[] var6 = this.method2394(0, (byte) 64, class435.field6374 & arg1 + 1);
            for (int var7 = 0; ~var7 > ~class431.field6348; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4666;
                int var9 = (var5[var7 + 1 & class98.field1757] + -var5[class98.field1757 & var7 + -1]) * this.field4666;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILha;I)V", line = 102)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg0 == 0) {
            if (~arg2 == -1) {
                this.field4666 = arg1.method254((byte) -62);
            }
            ++field4667;
        }
    }
}
