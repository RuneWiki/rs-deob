import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class85 extends class320 {

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    private int field1268 = -1;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Z")
    public boolean field1275 = false;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    private int field1276 = -32768;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    private int field1281 = 0;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    private int field1277 = 0;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field1263;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    private int field1286;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public int field1270;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Ljh;")
    private class269 field1266;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lbk;")
    public static class63 field1285 = new class63();

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1287 = "green:";

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field1288 = 0;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "F")
    public static float field1267;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lmf;")
    private class47 field1264;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[I")
    public static int[] field1289;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lpe;B)Lmj;", line = 5)
    public static final class230 method608(class101 arg0, byte arg1) {
        field1282++;
        int var2 = 7 / ((arg1 + 47) / 62);
        class230 var3 = new class230();
        var3.field3659 = arg0.method731(false);
        var3.field3662 = class326.method2238(1, var3.field3659);
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 19)
    public static final void method609(int arg0) {
        field1280++;
        class267.field4132.method249(0);
        int var1 = class267.field4132.method240(8, -128);
        if (class77.field1173 > var1) {
            for (int var2 = var1; var2 < class77.field1173; var2++) {
                class197.field3126[class9.field137++] = class145.field2279[var2];
            }
        }
        if (class77.field1173 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class77.field1173 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class145.field2279[var3];
            class305 var5 = class138.field2196[var4];
            int var6 = class267.field4132.method240(1, -51);
            if (var6 == 0) {
                class145.field2279[class77.field1173++] = var4;
                var5.field1462 = class205.field3252;
            } else {
                int var7 = class267.field4132.method240(2, -125);
                if (var7 == 0) {
                    class145.field2279[class77.field1173++] = var4;
                    var5.field1462 = class205.field3252;
                    class231.field3673[class75.field1160++] = var4;
                } else if (var7 == 1) {
                    class145.field2279[class77.field1173++] = var4;
                    var5.field1462 = class205.field3252;
                    int var8 = class267.field4132.method240(3, -107);
                    var5.method636(true, 1, var8);
                    int var9 = class267.field4132.method240(1, arg0 ^ 0xFFFFFFC1);
                    if (var9 == 1) {
                        class231.field3673[class75.field1160++] = var4;
                    }
                } else if (var7 == 2) {
                    class145.field2279[class77.field1173++] = var4;
                    var5.field1462 = class205.field3252;
                    if (class267.field4132.method240(1, -68) == 1) {
                        int var11 = class267.field4132.method240(3, -99);
                        var5.method636(true, 2, var11);
                        int var12 = class267.field4132.method240(3, -55);
                        var5.method636(true, 2, var12);
                    } else {
                        int var10 = class267.field4132.method240(3, arg0 - 39);
                        var5.method636(true, 0, var10);
                    }
                    int var13 = class267.field4132.method240(1, -98);
                    if (var13 == 1) {
                        class231.field3673[class75.field1160++] = var4;
                    }
                } else if (var7 == 3) {
                    class197.field3126[class9.field137++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Lfa;", line = 139)
    private final class199 method610(int arg0) {
        class90 var2 = class136.method1042((byte) -30, this.field1286);
        if (arg0 != 0) {
            return (class199) null;
        }
        field1278++;
        class199 var3;
        if (this.field1275) {
            var3 = var2.method652(arg0 ^ 0x7EA, -1, 0, -1);
        } else {
            var3 = var2.method652(2026, this.field1277, this.field1281, this.field1268);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()I", line = 162)
    public final int method207() {
        field1265++;
        return this.field1276;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V", line = 180)
    public final void method611(byte arg0, int arg1) {
        field1272++;
        if (arg0 > -104) {
            method608((class101) null, (byte) 91);
        }
        if (this.field1275) {
            return;
        }
        this.field1281 += arg1;
        while (this.field1281 > this.field1266.field4165[this.field1277]) {
            this.field1281 -= this.field1266.field4165[this.field1277];
            this.field1277++;
            if (this.field1266.field4183.length <= this.field1277) {
                this.field1275 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 209)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field1283++;
        class199 var13 = this.method610(0);
        if (var13 != null) {
            var13.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1264);
            this.field1276 = var13.method207();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V", line = 229)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1284++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lja;I)V", line = 237)
    public static final void method612(class64 arg0, int arg1) {
        if (arg1 != 2) {
            method609(-50);
        }
        field1279++;
        class284.field4364 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 248)
    public static void method613(byte arg0) {
        if (arg0 == 86) {
            field1287 = null;
            field1289 = null;
            field1285 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIII)V", line = 294)
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1262 = arg3;
        this.field1263 = arg4;
        this.field1286 = arg0;
        this.field1270 = arg2;
        this.field1271 = arg6 + arg5;
        this.field1273 = arg1;
        int var8 = class136.method1042((byte) -32, this.field1286).field1477;
        if (var8 == -1) {
            this.field1275 = true;
        } else {
            this.field1275 = false;
            this.field1266 = class6.method28(var8, 2);
        }
    }
}
