import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class441 extends class694 {

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    private int field6209 = 0;

    @OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
    private int field6213 = 0;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    private int field6214 = 1;

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Leu;")
    public static class440 field6208 = new class440();

    @OriginalMember(owner = "client!bi", name = "L", descriptor = "Z")
    public static boolean field6212 = true;

    @OriginalMember(owner = "client!bi", name = "K", descriptor = "Lsu;")
    public static class192 field6211 = new class192();

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V", line = 5)
    public final void method40(int arg0) {
        if (arg0 < 5) {
            field6211 = null;
        }
        ++field6207;
        class280.method1698(127);
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 17)
    public class441() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 23)
    public static void method2525(byte arg0) {
        int var1 = 113 / ((62 - arg0) / 62);
        field6211 = null;
        field6208 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjr;B)V", line = 42)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field6214 = arg1.method718(78);
                }
            } else {
                this.field6209 = arg1.method718(76);
            }
        } else {
            this.field6213 = arg1.method718(-106);
        }
        int var5 = -55 / ((arg2 - 58) / 63);
        ++field6206;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method39(int arg0, int arg1) {
        ++field6210;
        if (arg0 <= 112) {
            this.method39(-80, -64);
        }
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = class105.field1409[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class465.field6544; ++var6) {
                int var7 = class346.field4994[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field6213 != 0) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field6214 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field6214;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field6209 == 0) {
                    var12 = class391.field5476[var12 >> 4 & 255] - -4096 >> 1;
                } else if (~this.field6209 == -3) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
