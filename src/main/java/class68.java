import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class68 extends class41 {

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Ldc;")
    public class36 field1365 = new class36();

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "Lr;")
    public class184 field1376 = new class184();

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Ljd;")
    private class101 field1358;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field1369 = 0;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Lqe;")
    public static class179 field1366 = class206.method1380("nicht hergestellt werden)3", (byte) 95);

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1361 = 0;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "Lqe;")
    public static class179 field1368 = class206.method1380("Angreifen", (byte) -29);

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Lqe;")
    public static class179 field1370 = class206.method1380("mapdots", (byte) 121);

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method437(int arg0) {
        field1366 = null;
        if (arg0 != 4) {
            field1364 = 117;
        }
        field1370 = null;
        field1368 = null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public final void method277(int arg0) {
        field1367++;
        this.field1376.method277(arg0);
        for (class159 var2 = (class159) this.field1365.method242(16711680); var2 != null; var2 = (class159) this.field1365.method237(10)) {
            if (!this.field1358.method670((byte) 111, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field2878) {
                        this.method440(var2, (byte) 44, var3);
                        var2.field2878 -= var3;
                        break;
                    }
                    this.method440(var2, (byte) 25, var2.field2878);
                    var3 -= var2.field2878;
                } while (!this.field1358.method666(var3, 0, null, -19347, var2));
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([III)V")
    public final void method275(int[] arg0, int arg1, int arg2) {
        field1362++;
        this.field1376.method275(arg0, arg1, arg2);
        for (class159 var4 = (class159) this.field1365.method242(16711680); var4 != null; var4 = (class159) this.field1365.method237(10)) {
            if (!this.field1358.method670((byte) 111, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field2878 >= var5) {
                        this.method442(var6, arg0, var6 + var5, var5, var4, (byte) -87);
                        var4.field2878 -= var5;
                        break;
                    }
                    this.method442(var6, arg0, var5 + var6, var4.field2878, var4, (byte) -87);
                    var5 -= var4.field2878;
                    var6 += var4.field2878;
                } while (!this.field1358.method666(var5, var6, arg0, -19347, var4));
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI[Ldg;IIBI)V")
    public static final void method438(byte[] arg0, int arg1, class40[] arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1374++;
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg3 + var12 > 0 && arg3 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg2[var7].field855[arg3 + var12][arg1 + var13] = class107.method696(arg2[var7].field855[arg3 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class185 var8 = new class185(arg0);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class179.method1163(arg6, 0, arg3 + var10, arg1 + var11, (byte) -68, var8, arg4, var9);
                }
            }
        }
        if (arg5 > -18) {
            method437(114);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()I")
    public final int method276() {
        field1360++;
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()Ldh;")
    public final class41 method274() {
        field1359++;
        class159 var1;
        do {
            var1 = (class159) this.field1365.method237(10);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2862 == null);
        return var1.field2862;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()Ldh;")
    public final class41 method272() {
        field1373++;
        class159 var1 = (class159) this.field1365.method242(16711680);
        if (var1 == null) {
            return null;
        } else if (var1.field2862 == null) {
            return this.method274();
        } else {
            return var1.field2862;
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public static final void method439(int arg0) {
        class237.field4378.method652(arg0 ^ 0xFFFFFFFE);
        class159.field2894 = null;
        class107.field2000 = arg0;
        field1377++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Log;BI)V")
    private final void method440(class159 arg0, byte arg1, int arg2) {
        field1371++;
        if ((this.field1358.field1889[arg0.field2870] & 0x4) != 0 && arg0.field2886 < 0) {
            int var4 = this.field1358.field1903[arg0.field2870] / class80.field1542;
            int var5 = (var4 + 1048575 - arg0.field2892) / var4;
            arg0.field2892 = arg2 * var4 + arg0.field2892 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1358.field1930[arg0.field2870] == 0) {
                    arg0.field2862 = class83.method541(arg0.field2872, arg0.field2862.method550(), arg0.field2862.method554(), arg0.field2862.method538());
                } else {
                    arg0.field2862 = class83.method541(arg0.field2872, arg0.field2862.method550(), 0, arg0.field2862.method538());
                    this.field1358.method655(arg0.field2873.field2353[arg0.field2860] < 0, arg0, -2);
                }
                if (arg0.field2873.field2353[arg0.field2860] < 0) {
                    arg0.field2862.method552(-1);
                }
                arg2 = arg0.field2892 / var4;
            }
        }
        arg0.field2862.method277(arg2);
        if (arg1 <= 24) {
            field1368 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Z")
    public static final boolean method441(int arg0, int arg1) {
        if (arg0 != 262144) {
            field1361 = 5;
        }
        field1363++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljd;)V")
    public class68(class101 arg0) {
        this.field1358 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[IIILog;B)V")
    private final void method442(int arg0, int[] arg1, int arg2, int arg3, class159 arg4, byte arg5) {
        if ((this.field1358.field1889[arg4.field2870] & 0x4) != 0 && arg4.field2886 < 0) {
            int var7 = this.field1358.field1903[arg4.field2870] / class80.field1542;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field2892) / var7;
                if (arg3 < var8) {
                    arg4.field2892 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg4.field2862.method275(arg1, arg0, var8);
                int var9 = class80.field1542 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                arg0 += var8;
                arg4.field2892 += var7 * var8 - 1048576;
                class83 var11 = arg4.field2862;
                if (this.field1358.field1930[arg4.field2870] == 0) {
                    arg4.field2862 = class83.method541(arg4.field2872, var11.method550(), var11.method554(), var11.method538());
                } else {
                    arg4.field2862 = class83.method541(arg4.field2872, var11.method550(), 0, var11.method538());
                    this.field1358.method655(arg4.field2873.field2353[arg4.field2860] < 0, arg4, arg5 ^ 0x57);
                    arg4.field2862.method533(var9, var11.method554());
                }
                if (arg4.field2873.field2353[arg4.field2860] < 0) {
                    arg4.field2862.method552(-1);
                }
                var11.method536(var9);
                var11.method275(arg1, arg0, arg2 - arg0);
                if (var11.method544()) {
                    this.field1376.method1195(var11);
                }
            }
        }
        arg4.field2862.method275(arg1, arg0, arg3);
        field1372++;
        if (arg5 != -87) {
            field1364 = -70;
        }
    }
}
