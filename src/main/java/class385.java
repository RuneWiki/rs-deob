import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class385 extends class406 {

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    private int field5671;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    private int field5670;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    private int field5663;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    private int field5664;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    private int field5668;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Ltt;")
    private class249 field5667;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field5665;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Lrh;")
    private class32 field5662;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5672;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static void method2451(int arg0) {
        int var1 = 32 / ((55 - arg0) / 44);
        field5672 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lza;ILjt;)I")
    public static final int method2452(class299 arg0, int arg1, class410 arg2) {
        field5669++;
        if (arg2.field6062 != -1) {
            return arg2.field6062;
        }
        if (arg2.field6055 != -1) {
            class420 var3 = arg0.field4588.method938(28923, arg0.method522() ? arg2.field6055 : arg2.field6048);
            if (!var3.field6161) {
                return var3.field6160;
            }
        }
        int var4 = 21 % ((-arg1 - 45) / 41);
        return arg2.field6060;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Lrh;")
    public final class32 method44(int arg0) {
        if (arg0 != 6) {
            this.method44(-104);
        }
        field5666++;
        if (this.field5662 == null) {
            class488.field7132[5] = this.field5671;
            class488.field7132[4] = this.field5668;
            class488.field7132[1] = this.field5663;
            class488.field7132[2] = this.field5670;
            class488.field7132[0] = this.field5665;
            class127 var2 = this.field5667.field4588;
            class488.field7132[3] = this.field5664;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method936(class488.field7132[var5], (byte) -119)) {
                    return null;
                }
                class420 var7 = var2.method938(28923, class488.field7132[var5]);
                int var8 = var7.field6170 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field6156 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class540.field7901[var6] = var2.method939(var4, -8507, class488.field7132[var6], var4, false, 1.0F);
            }
            this.field5662 = new class32(this.field5667, 6407, var4, var3, class540.field7901);
        }
        return this.field5662;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)I")
    public static final int method2453(int arg0, byte arg1) {
        if (arg1 == -30) {
            field5673++;
            return arg0 & 0xFF;
        } else {
            return 26;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Ltt;IIIIII)V")
    public class385(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5671 = arg6;
        this.field5670 = arg3;
        this.field5663 = arg2;
        this.field5664 = arg4;
        this.field5668 = arg5;
        this.field5667 = arg0;
        this.field5665 = arg1;
    }
}
