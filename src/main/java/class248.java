import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class248 extends class95 {

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lqf;")
    public class149 field4302;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lsf;")
    public static class108 field4299 = class140.method973(255, "http:)4)4");

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Lvd;")
    public static class135 field4296;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Lik;")
    public static class262 field4303;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 4)
    public static void method1702(int arg0) {
        field4303 = null;
        field4299 = null;
        if (arg0 != 29197) {
            method1704(-18, 114, -65);
        }
        field4296 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 32)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4298++;
        int var5 = arg4;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        int var9 = class174.method1236(class260.field4593, arg1 + arg3, class79.field1202, arg4 ^ 0xFFFFE7B5);
        int var10 = class174.method1236(class260.field4593, arg1 - arg3, class79.field1202, arg4 - 6219);
        class209.method1452(var9, class106.field1839[arg0], 7, var10, arg2);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                int var11 = arg0 + var6;
                int var12 = arg0 - var6;
                if (var11 >= class266.field4677 && class166.field2984 >= var12) {
                    int var13 = class174.method1236(class260.field4593, arg1 + var5, class79.field1202, -6219);
                    int var14 = class174.method1236(class260.field4593, arg1 - var5, class79.field1202, arg4 ^ 0xFFFFE7B5);
                    if (var11 <= class166.field2984) {
                        class209.method1452(var13, class106.field1839[var11], 7, var14, arg2);
                    }
                    if (var12 >= class266.field4677) {
                        class209.method1452(var13, class106.field1839[var12], 7, var14, arg2);
                    }
                }
                var7 -= var6 << 1;
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class266.field4677 && var15 <= class166.field2984) {
                int var17 = class174.method1236(class260.field4593, arg1 + var6, class79.field1202, -6219);
                int var18 = class174.method1236(class260.field4593, arg1 - var6, class79.field1202, -6219);
                if (var16 <= class166.field2984) {
                    class209.method1452(var17, class106.field1839[var16], arg4 ^ 0x7, var18, arg2);
                }
                if (var15 >= class266.field4677) {
                    class209.method1452(var17, class106.field1839[var15], arg4 + 7, var18, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lqf;)V", line = 108)
    public class248(class149 arg0) {
        this.field4302 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)Lda;", line = 118)
    public static final class120 method1704(int arg0, int arg1, int arg2) {
        field4297++;
        class120 var3 = (class120) class285.field4986.method1676((long) arg0 << 32 | (long) arg2, (byte) -107);
        if (arg1 <= 39) {
            field4296 = (class135) null;
        }
        if (var3 == null) {
            var3 = new class120(arg0, arg2);
            class285.field4986.method1681(1, var3, var3.field3375);
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 143)
    public static final void method1705(int arg0) {
        field4301++;
        int var1 = 121 % ((48 - arg0) / 58);
        class331.field5651.method639(-59);
        class229.field3992.method639(-66);
        class72.field1094.method639(-45);
    }
}
