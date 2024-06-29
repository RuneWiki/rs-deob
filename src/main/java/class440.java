import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class440 extends class512 {

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    private int field6566 = 4096;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "Llo;")
    public static class306 field6569 = new class306("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    public static int field6571 = 2;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
    public static final boolean method2655(int arg0, int arg1, int arg2) {
        ++field6570;
        if (arg0 != 5712) {
            return false;
        } else {
            return ~(16 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class440() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    public static void method2656(byte arg0) {
        if (arg0 == 18) {
            field6569 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg0) {
            ++field6567;
            if (~arg1 == -1) {
                this.field6566 = arg2.method132(34);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field6568;
        int[] var3 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var4 = this.method3013(false, 0, arg0 + -1 & class270.field4492);
            int[] var5 = this.method3013(false, 0, arg0);
            int[] var6 = this.method3013(false, 0, class270.field4492 & arg0 + 1);
            for (int var7 = 0; class402.field6113 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field6566;
                int var9 = (var5[class269.field4478 & var7 + 1] + -var5[var7 + -1 & class269.field4478]) * this.field6566;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        int var16 = -64 / ((arg1 - 43) / 48);
        return var3;
    }
}
