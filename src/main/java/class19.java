import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class19 extends class77 {

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljl;")
    public class332 field309;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field302 = -1;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "[I")
    public static int[] field305 = new int[128];

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lp;")
    public static class25 field303;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lph;")
    public static class361 field307;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "[I")
    public static int[] field304;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V", line = 16)
    public static void method116(int arg0) {
        field307 = null;
        field305 = null;
        if (arg0 == -9909) {
            field304 = null;
            field303 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 36)
    public static final String method117(int arg0, String arg1) {
        field310++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class50.method421(arg1.charAt(var2), (byte) -119)) {
            var2++;
        }
        if (arg0 != 20563) {
            field304 = (int[]) null;
        }
        while (var3 > var2 && class50.method421(arg1.charAt(var3 - 1), (byte) -119)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 20) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class41.method304(var7, false)) {
                char var8 = class71.method571(95, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V", line = 98)
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg1 - 334;
        field308++;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = 2048 - arg3 & 0x7FF;
        int var10 = 0;
        int var11 = (class89.field1254 - class136.field1977) * var8 / 100 + class136.field1977;
        int var12 = arg7 * var11 >> 8;
        int var13 = 2048 - arg4 & 0x7FF;
        int var14 = 0;
        int var15 = var12;
        if (arg5 != var13) {
            int var16 = class345.field5339[var13];
            int var17 = class345.field5343[var13];
            var10 = -var12 * var16 >> 16;
            var15 = var12 * var17 >> 16;
        }
        if (var9 != 0) {
            int var18 = class345.field5339[var9];
            int var19 = class345.field5343[var9];
            var14 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class137.field1991 = arg2 - var14;
        class166.field2385 = arg0 - var15;
        class362.field5746 = arg4;
        class335.field5216 = arg3;
        class129.field1871 = arg6 - var10;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljl;)V", line = 153)
    public class19(class332 arg0) {
        this.field309 = arg0;
    }
}
