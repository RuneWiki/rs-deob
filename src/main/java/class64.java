import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class64 {

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[Lme;")
    public class192[] field1158 = null;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Lefa;")
    public class182 field1161 = null;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Lefa;")
    public class182 field1156 = null;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lefa;")
    public class182 field1162 = null;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "[Lme;")
    public class192[] field1164 = null;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
    public boolean field1157;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[Lbia;")
    public static class496[] field1155 = new class496[6];

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "Lqaa;")
    public static class27 field1163 = new class27(81, 6);

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field1165 = 0;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public static void method683(byte arg0) {
        field1155 = null;
        field1163 = null;
        if (arg0 <= 19) {
            method685(-67, null, -19);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B[II[Ljava/lang/Object;I)V")
    public static final void method684(byte arg0, int[] arg1, int arg2, Object[] arg3, int arg4) {
        if (arg0 <= 94) {
            return;
        }
        field1153++;
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg4;
        int var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        Object var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg4; var10 < arg2; var10++) {
            if (var7 + (var9 & var10) > arg1[var10]) {
                int var11 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6] = var11;
                Object var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method684((byte) 95, arg1, var6 - 1, arg3, arg4);
        method684((byte) 95, arg1, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILha;I)Lkr;")
    public static final class743 method685(int arg0, class58 arg1, int arg2) {
        field1159++;
        class236 var3 = (class236) class160.field2387.method4203(true, (long) arg2);
        int var4 = 28 % ((-arg0 - 64) / 32);
        if (var3 != null) {
            class319 var5 = var3.field3348.method3309(-31453);
            var3.field3346 = true;
            if (var5 != null) {
                return var5.method2056(1, arg1);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Loea;)V")
    public class64(class594 arg0) {
        this.field1157 = arg0.field8601;
        class491.method2953((byte) -43, arg0);
        if (this.field1157) {
            byte[] var6 = class47.method425(class23.field300, (byte) 33, false);
            this.field1162 = new class182(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class47.method425(class429.field6002, (byte) -128, false);
            this.field1156 = new class182(arg0, 6410, 128, 128, 16, var7, 6410);
            class292 var8 = arg0.field8549;
            if (var8.method1880(35632)) {
                byte[] var9 = class47.method425(class428.field5986, (byte) -124, false);
                this.field1161 = new class182(arg0, 6408, 128, 128, 16);
                class182 var10 = new class182(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method1878(this.field1161, var10, -65, 2.0F)) {
                    this.field1161.method820(-12650);
                } else {
                    this.field1161.method821((byte) 113);
                    this.field1161 = null;
                }
                var10.method821((byte) -83);
            }
        } else {
            this.field1158 = new class192[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class138.method1098(var2 * 128 * 128 * 2, class23.field300, (byte) 28, 32768);
                this.field1158[var2] = new class192(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field1164 = new class192[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class138.method1098(var3 * 128 * 128 * 2, class429.field6002, (byte) 105, 32768);
                this.field1164[var3] = new class192(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
