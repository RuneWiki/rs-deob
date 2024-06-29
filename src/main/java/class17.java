import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class17 {

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "B")
    public byte field184;

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "[I")
    public static int[] field185 = new int[120];

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "Lmr;")
    public static class163 field178;

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "Lko;")
    public class230 field175;

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "Llf;")
    public class391 field177;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "Lsv;")
    public class394 field171;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "Lu;")
    public class40 field183;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "[I")
    public static int[] field182;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static void method90(int arg0) {
        if (arg0 != -10961) {
            method93(-80, -36, 60, 55, -51, -100);
        }
        field182 = null;
        field185 = null;
        field178 = null;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public static final void method91(int arg0) {
        field181++;
        class422 var1 = (class422) class497.field7476.method2123(arg0 ^ 0xFFFFFFC3);
        if (arg0 != -1) {
            return;
        }
        while (var1 != null) {
            if (var1.field6405 == -1) {
                var1.field6408 = 0;
                if (var1.field6402 >= 0 && var1.field6404 >= 0 && var1.field6402 < class135.field1839 && class197.field3038 > var1.field6404) {
                    class346.method2286(var1, (byte) -108);
                }
            } else {
                var1.method3149(103);
            }
            var1 = (class422) class497.field7476.method2126((byte) 61);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILza;IIII)Le;")
    public static final class536 method92(int arg0, int arg1, class497 arg2, int arg3, int arg4, int arg5, int arg6) {
        field180++;
        long var7 = (long) arg4;
        if (arg1 < 32) {
            method92(-36, -96, null, 111, -111, 99, 6);
        }
        class536 var9 = (class536) class491.field7427.method2191((byte) -73, var7);
        short var10 = 2055;
        if (var9 == null) {
            class438 var11 = class73.method534(false, class236.field3876, arg4, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field6766 < 13) {
                var11.method2770(0, 0);
            }
            var9 = arg2.method1337(var11, var10, class473.field7255, 64, 768);
            class491.field7427.method2188(-123, var7, var9);
        }
        class536 var12 = var9.method329((byte) 2, var10, true);
        if (arg3 != 0) {
            var12.method280(arg3);
        }
        if (arg5 != 0) {
            var12.method278(arg5);
        }
        if (arg0 != 0) {
            var12.method319(arg0);
        }
        if (arg6 != 0) {
            var12.method325(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method93(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class122.field1662[arg0][var8][var14] == -class397.field5998) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class56.field908) + 1;
            int var10 = (arg3 << class56.field908) + 2;
            int var11 = class53.field732[arg0].method688(arg1, arg3) + arg5;
            if (!class31.method200(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class56.field908) - 1;
            if (!class31.method200(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class56.field908) - 1;
            if (!class31.method200(var9, var11, var13)) {
                return false;
            } else if (class31.method200(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class216.method1591(arg0, arg1, arg3)) {
            int var6 = arg1 << class56.field908;
            int var7 = arg3 << class56.field908;
            return class31.method200(var6 + 1, class53.field732[arg0].method688(arg1, arg3) + arg5, var7 + 1) && class31.method200(class42.field454 + var6 - 1, class53.field732[arg0].method688(arg1 + 1, arg3) + arg5, var7 + 1) && class31.method200(class42.field454 + var6 - 1, class53.field732[arg0].method688(arg1 + 1, arg3 + 1) + arg5, class42.field454 + var7 - 1) && class31.method200(var6 + 1, class53.field732[arg0].method688(arg1, arg3 + 1) + arg5, class42.field454 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(BIIIII)V")
    public class17(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field179 = arg3;
        this.field184 = arg0;
        this.field173 = arg5;
        this.field172 = arg1;
        this.field174 = arg2;
        this.field176 = arg4;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field185[var1] = var0 / 4;
        }
    }
}
