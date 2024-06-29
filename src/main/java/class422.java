import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class422 {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    private int field6205 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Lcv;")
    private class398 field6203;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Loo;")
    private class439 field6204;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lqs;I[[B)V", line = 5)
    public static final void method2582(class425 arg0, int arg1, byte[][] arg2) {
        if (arg1 >= -28) {
            return;
        }
        field6208++;
        for (int var3 = 0; var3 < arg0.field2250; var3++) {
            class292.method1811(true);
            for (int var4 = 0; var4 < class237.field3436 >> 3; var4++) {
                for (int var5 = 0; var5 < (class83.field1366 >> 3); var5++) {
                    int var6 = class332.field5101[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3119CB9) >> 24;
                        if (!arg0.field2251 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class274.field3954.length; var12++) {
                                if (class274.field3954[var12] == var11 && arg2[var12] != null) {
                                    arg0.method2595(var7, var3, var4 * 8, (byte) 67, (var9 & 0x7) * 8, class255.field3679, class394.field5821, arg2[var12], var5 * 8, var8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BC)Z", line = 81)
    public static final boolean method2583(byte arg0, char arg1) {
        field6207++;
        int var2 = 86 / ((-arg0 - 61) / 54);
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Loo;", line = 91)
    public final class439 method2584(int arg0) {
        if (arg0 != 1384084872) {
            method2583((byte) 118, (char) 65528);
        }
        this.field6205 = 0;
        field6201++;
        return this.method2585(-1);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Loo;", line = 104)
    public final class439 method2585(int arg0) {
        field6206++;
        if (~this.field6205 < arg0 && this.field6203.field5837[this.field6205 - 1] != this.field6204) {
            class439 var2 = this.field6204;
            this.field6204 = var2.field6403;
            return var2;
        }
        while (this.field6203.field5838 > this.field6205) {
            class439 var3 = this.field6203.field5837[this.field6205++].field6403;
            if (this.field6203.field5837[this.field6205 - 1] != var3) {
                this.field6204 = var3.field6403;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lcv;)V", line = 136)
    public class422(class398 arg0) {
        this.field6203 = arg0;
    }
}
