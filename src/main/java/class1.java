import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 {

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    private int field7 = 0;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "Lvg;")
    private class56 field5;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "F")
    public static float field3;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Ldd;")
    private class130 field2;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Lum;")
    public static class83 field11;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "Lum;")
    public static class83 field8;

    static {
        new class179(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field4 = -1;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 3)
    public static void method1(byte arg0) {
        field11 = null;
        field8 = null;
        int var1 = -32 / ((arg0 + 36) / 56);
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)Ldd;", line = 23)
    public final class130 method2(byte arg0) {
        field6++;
        if (this.field7 > 0 && this.field5.field841[this.field7 - 1] != this.field2) {
            class130 var2 = this.field2;
            this.field2 = var2.field1934;
            return var2;
        }
        while (this.field7 < this.field5.field857) {
            class130 var3 = this.field5.field841[this.field7++].field1934;
            if (this.field5.field841[this.field7 - 1] != var3) {
                this.field2 = var3.field1934;
                return var3;
            }
        }
        return arg0 > -18 ? null : null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Ldd;", line = 54)
    public final class130 method3(int arg0) {
        field9++;
        this.field7 = arg0;
        return this.method2((byte) -52);
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lvg;)V", line = 74)
    public class1(class56 arg0) {
        this.field5 = arg0;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIII)V", line = 82)
    public static final void method4(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field10++;
        int var5 = 0;
        int var6 = arg4;
        if (arg1) {
            field11 = null;
        }
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class306.method2023(5, class232.field3492, arg3 + arg4, class36.field453);
        int var10 = class306.method2023(5, class232.field3492, arg3 - arg4, class36.field453);
        class262.method1831(var9, class402.field5946[arg0], (byte) 43, arg2, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class487.field7124 && var11 <= class232.field3493) {
                    int var13 = class306.method2023(5, class232.field3492, arg3 + var5, class36.field453);
                    int var14 = class306.method2023(5, class232.field3492, arg3 - var5, class36.field453);
                    if (var12 <= class232.field3493) {
                        class262.method1831(var13, class402.field5946[var12], (byte) 43, arg2, var14);
                    }
                    if (class487.field7124 <= var11) {
                        class262.method1831(var13, class402.field5946[var11], (byte) 43, arg2, var14);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class487.field7124 && class232.field3493 >= var15) {
                int var17 = class306.method2023(5, class232.field3492, arg3 + var6, class36.field453);
                int var18 = class306.method2023(5, class232.field3492, arg3 - var6, class36.field453);
                if (class232.field3493 >= var16) {
                    class262.method1831(var17, class402.field5946[var16], (byte) 43, arg2, var18);
                }
                if (class487.field7124 <= var15) {
                    class262.method1831(var17, class402.field5946[var15], (byte) 43, arg2, var18);
                }
            }
        }
    }
}
