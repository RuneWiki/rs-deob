import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class534 extends class540 {

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public int field7538;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public int field7541;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Lks;")
    public static class460 field7539 = new class460("", 19);

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field7535;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILrv;)Lfba;", line = 3)
    public static final class27 method3090(int arg0, class120 arg1) {
        if (arg0 == Integer.MAX_VALUE) {
            field7536++;
            return new class27(arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method833(-3), arg1.method833(-3), arg1.method842(arg0 ^ 0x7FFFF6AF));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)V", line = 17)
    public static final void method3091(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class145.field1852.field9012.method978((byte) -118) * arg0 >> 8;
        if (arg2 != 100) {
            field7539 = null;
        }
        field7540++;
        if (arg3 == -1 && !class709.field9995) {
            class281.method1903((byte) 73);
        } else if (arg3 != -1 && (class433.field6161 != arg3 || !class628.method3595(0)) && var4 != 0 && !class709.field9995) {
            class536.method3102((byte) -56, var4, 0, arg3, arg1, false, class606.field8526);
            class368.method2288(arg2 + 25);
        }
        if (class433.field6161 != arg3) {
            class31.field420 = null;
        }
        class433.field6161 = arg3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 48)
    public static void method3092(int arg0) {
        if (arg0 != 256) {
            method3095(-54, 51, -89, -91);
        }
        field7539 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIILkv;)Lbo;", line = 58)
    public static final class759 method3093(int arg0, int arg1, int arg2, int arg3, class280 arg4) {
        field7537++;
        if (arg2 != -13957) {
            field7539 = null;
        }
        if (!arg4.field4218 && (!class315.method2071(arg2 ^ 0x36FA, arg1) || !class315.method2071(-126, arg3))) {
            return arg4.field4291 ? new class759(arg4, 34037, arg0, arg1, arg3) : new class759(arg4, arg0, arg1, arg3, class89.method631((byte) 51, arg1), class89.method631((byte) -61, arg3));
        } else {
            return new class759(arg4, 3553, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lli;B)V", line = 84)
    public static final void method3094(class449 arg0, byte arg1) {
        field7535++;
        boolean var2 = false;
        if (class673.field9441 == arg0.field6346 || arg0.field6404 == -1 || arg0.field6354 != 0) {
            var2 = true;
        } else {
            class129 var3 = class203.field2975.method1931((byte) -81, arg0.field6404);
            if (var3.field1686 || arg0.field6350 + 1 > var3.field1668[arg0.field6409]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field6346 - arg0.field6391;
            int var5 = class673.field9441 - arg0.field6391;
            int var6 = arg0.field6360 * 512 + (arg0.method2692((byte) 66) * 256);
            int var7 = arg0.field6406 * 512 + (arg0.method2692((byte) 109) * 256);
            int var8 = arg0.field6390 * 512 + arg0.method2692((byte) 20) * 256;
            int var9 = arg0.field6389 * 512 + arg0.method2692((byte) 93) * 256;
            arg0.field7719 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg0.field7718 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        if (arg1 < 111) {
            field7539 = null;
        }
        arg0.field6440 = 0;
        if (arg0.field6422 == 0) {
            arg0.method2700(-99, false, 8192);
        }
        if (arg0.field6422 == 1) {
            arg0.method2700(85, false, 12288);
        }
        if (arg0.field6422 == 2) {
            arg0.method2700(86, false, 0);
        }
        if (arg0.field6422 == 3) {
            arg0.method2700(-102, false, 4096);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I", line = 141)
    public static final int method3095(int arg0, int arg1, int arg2, int arg3) {
        field7534++;
        if (class261.field3682 < 100) {
            return -2;
        }
        int var4 = -2;
        if (arg2 >= -58) {
            method3094(null, (byte) 30);
        }
        int var5 = Integer.MAX_VALUE;
        int var6 = arg1 - class436.field6239;
        int var7 = arg0 - class436.field6233;
        for (class497 var8 = (class497) class436.field6223.method2508((byte) 119); var8 != null; var8 = (class497) class436.field6223.method2505((byte) -55)) {
            if (var8.field7063 == arg3) {
                int var9 = var8.field7070;
                int var10 = var8.field7064;
                int var11 = class436.field6233 + var10 | class436.field6239 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(II)V", line = 188)
    public class534(int arg0, int arg1) {
        this.field7538 = arg0;
        this.field7541 = arg1;
    }
}
