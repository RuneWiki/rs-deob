import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class51 extends class12 {

    @OriginalMember(owner = "client!i", name = "zb", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!i", name = "Mb", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!i", name = "xb", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
    private int field1285;

    @OriginalMember(owner = "client!i", name = "Ab", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client!i", name = "Db", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!i", name = "Pb", descriptor = "Lj;")
    private class57 field1283;

    @OriginalMember(owner = "client!i", name = "Nb", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "client!i", name = "Sb", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!i", name = "Fb", descriptor = "I")
    public static int field1273 = 0;

    @OriginalMember(owner = "client!i", name = "wb", descriptor = "Z")
    public static boolean field1264 = false;

    @OriginalMember(owner = "client!i", name = "yb", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!i", name = "Ob", descriptor = "Lpd;")
    public static class94 field1282 = class28.method249(49, "Hierhin gehen");

    @OriginalMember(owner = "client!i", name = "Hb", descriptor = "Lpd;")
    public static class94 field1275 = class28.method249(-110, "@lre@");

    @OriginalMember(owner = "client!i", name = "Lb", descriptor = "Z")
    public static boolean field1279 = false;

    @OriginalMember(owner = "client!i", name = "Tb", descriptor = "Lpd;")
    private static class94 field1287 = class28.method249(71, "shake:");

    @OriginalMember(owner = "client!i", name = "Bb", descriptor = "Lpd;")
    public static class94 field1269 = field1287;

    @OriginalMember(owner = "client!i", name = "Vb", descriptor = "I")
    public static int field1289 = 5063219;

    @OriginalMember(owner = "client!i", name = "Cb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!i", name = "Eb", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!i", name = "Gb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!i", name = "Jb", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!i", name = "Ub", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!i", name = "Wb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!i", name = "Kb", descriptor = "Lad;")
    public static class5 field1278;

    @OriginalMember(owner = "client!i", name = "Ib", descriptor = "[Z")
    public static boolean[] field1276;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)Lia;", line = 9)
    public final class48 method77(int arg0) {
        field1270++;
        if (arg0 != 1536) {
            method404(58, null);
        }
        if (this.field1283 != null) {
            int var2 = class26.field699 - this.field1286;
            if (var2 > 100 && this.field1283.field1435 > 0) {
                var2 = 100;
            }
            label41: {
                do {
                    do {
                        if (var2 <= this.field1283.field1420[this.field1281]) {
                            break label41;
                        }
                        var2 -= this.field1283.field1420[this.field1281];
                        this.field1281++;
                    } while (this.field1283.field1425.length > this.field1281);
                    this.field1281 -= this.field1283.field1435;
                } while (this.field1281 >= 0 && this.field1281 < this.field1283.field1425.length);
                this.field1283 = null;
            }
            this.field1286 = class26.field699 - var2;
        }
        class27 var3 = class55.method440(this.field1285, (byte) 76);
        if (var3.field764 != null) {
            var3 = var3.method247(false);
        }
        return var3 == null ? null : var3.method236(this.field1280, this.field1265, this.field1267, (byte) -61, this.field1271, this.field1283, this.field1284, this.field1268, this.field1281);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)Lpd;", line = 101)
    public static final class94 method403(int arg0, boolean arg1) {
        if (!arg1) {
            field1275 = null;
        }
        field1290++;
        return class63.method472(arg0, 10, false, 0);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(ILbb;)V", line = 119)
    public static final void method404(int arg0, class8 arg1) {
        field1277++;
        if (class26.field699 == arg1.field204 || arg1.field210 == -1 || arg1.field192 != 0 || arg1.field214 + 1 > class70.method519(arg0 + 5, arg1.field210).field1420[arg1.field180]) {
            int var2 = arg1.field204 - arg1.field208;
            int var3 = class26.field699 - arg1.field208;
            int var4 = arg1.field207 * 64 + arg1.field178 * 128;
            int var5 = arg1.field207 * 64 + arg1.field195 * 128;
            int var6 = arg1.field217 * 128 + arg1.field207 * 64;
            int var7 = arg1.field207 * 64 + arg1.field168 * 128;
            arg1.field222 = ((var2 - var3) * var6 + var3 * var7) / var2;
            arg1.field177 = ((var2 - var3) * var5 + var3 * var4) / var2;
        }
        arg1.field172 = arg0;
        if (arg1.field196 == 0) {
            arg1.field167 = 1024;
        }
        if (arg1.field196 == 1) {
            arg1.field167 = 1536;
        }
        if (arg1.field196 == 2) {
            arg1.field167 = 0;
        }
        if (arg1.field196 == 3) {
            arg1.field167 = 512;
        }
        arg1.field187 = arg1.field167;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIIIZLbe;)V", line = 159)
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class12 arg9) {
        this.field1267 = arg6;
        this.field1280 = arg1;
        this.field1265 = arg4;
        this.field1284 = arg2;
        this.field1285 = arg0;
        this.field1268 = arg3;
        this.field1271 = arg5;
        if (arg7 != -1) {
            this.field1283 = class70.method519(5, arg7);
            this.field1281 = 0;
            this.field1286 = class26.field699 - 1;
            if (this.field1283.field1419 == 0 && arg9 != null && arg9 instanceof class51) {
                class51 var11 = (class51) arg9;
                if (this.field1283 == var11.field1283) {
                    this.field1281 = var11.field1281;
                    this.field1286 = var11.field1286;
                    return;
                }
            }
            if (arg8 && this.field1283.field1435 != -1) {
                this.field1281 = (int) ((double) this.field1283.field1425.length * Math.random());
                this.field1286 -= (int) (Math.random() * (double) this.field1283.field1420[this.field1281]);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(B)V", line = 209)
    public static void method405(byte arg0) {
        if (arg0 > -23) {
            return;
        }
        field1275 = null;
        field1278 = null;
        field1282 = null;
        field1276 = null;
        field1287 = null;
        field1269 = null;
    }
}
