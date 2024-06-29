import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class91 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Lp;")
    private class445 field1282;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lro;")
    private class248 field1287;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lsf;")
    private class142 field1288;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Z")
    public static boolean field1284 = true;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Lnj;")
    private class228 field1290;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[Lsi;")
    private class320[] field1286;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)Z")
    public final boolean method635(byte arg0) {
        field1289++;
        if (this.field1290 != null) {
            return true;
        }
        if (this.field1288 == null) {
            if (this.field1282.method2800(-21)) {
                return false;
            }
            this.field1288 = this.field1282.method2799(-41, 255, (byte) 0, true, 255);
        }
        if (this.field1288.field50) {
            return false;
        } else {
            this.field1290 = new class228(this.field1288.method25(25539));
            int var2 = -118 / ((59 - arg0) / 45);
            this.field1286 = new class320[(this.field1290.field3040.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lv;IILv;)Lsi;")
    public final class320 method636(class241 arg0, int arg1, int arg2, class241 arg3) {
        field1283++;
        return arg2 == -32478 ? this.method638(true, arg0, arg3, arg1, (byte) 84) : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method637(int arg0) {
        field1280++;
        if (class191.field2558 != null) {
            class191.field2558.method1398((byte) -120);
            class191.field2558 = null;
        }
        class376.method2444(18880);
        class87.method618();
        for (int var1 = 0; var1 < 4; var1++) {
            class365.field5294[var1].method1852(-5);
        }
        class245.method1471(false, false);
        System.gc();
        class449.method2819(2, -28);
        class7.field123 = false;
        class196.field2626 = -1;
        class438.method2757(-1, true);
        class220.field2905 = 0;
        class200.field2660 = 0;
        class179.field2373 = 0;
        class394.field5702 = false;
        class7.field138 = 0;
        for (int var2 = 0; var2 < class219.field2903.length; var2++) {
            class219.field2903[var2] = null;
        }
        class65.field861 = 0;
        class198.field2637 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class206.field2777[var3] = null;
            class403.field5995[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class306.field4496[var4] = null;
        }
        class200.field2656.method391(95);
        if (arg0 >= -109) {
            field1281 = -34;
        }
        class272.method1873(true);
        class196.field2624 = 0;
        class10.method76((byte) -118);
        class286.method1963((byte) 51);
        class420.method2685(-6740);
        class62.method428(-8844, true);
        try {
            class421.method2690(class76.field1085.field519, "loggedout", -27444);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLv;Lv;IB)Lsi;")
    private final class320 method638(boolean arg0, class241 arg1, class241 arg2, int arg3, byte arg4) {
        field1285++;
        if (this.field1290 == null) {
            throw new RuntimeException();
        }
        this.field1290.field3029 = arg3 * 8 + 5;
        if (this.field1290.field3040.length <= this.field1290.field3029) {
            throw new RuntimeException();
        } else if (this.field1286[arg3] == null) {
            int var6 = this.field1290.method1344((byte) 79);
            if (arg4 != 84) {
                this.method638(true, (class241) null, (class241) null, 56, (byte) 109);
            }
            int var7 = this.field1290.method1344((byte) 44);
            class320 var8 = new class320(arg3, arg1, arg2, this.field1282, this.field1287, var6, var7, arg0);
            this.field1286[arg3] = var8;
            return var8;
        } else {
            return this.field1286[arg3];
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public final void method639(int arg0) {
        field1279++;
        if (this.field1286 == null || arg0 > 0) {
            return;
        }
        for (int var2 = 0; var2 < this.field1286.length; var2++) {
            if (this.field1286[var2] != null) {
                this.field1286[var2].method2158(47);
            }
        }
        for (int var3 = 0; var3 < this.field1286.length; var3++) {
            if (this.field1286[var3] != null) {
                this.field1286[var3].method2157(false);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lmp;IIIII)V")
    public static final void method640(class21 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field279 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                int var8 = class23.field304[arg1][var6][var7];
                int var9 = 0;
                while (true) {
                    label51: while (true) {
                        if (var9 > 24) {
                            continue label56;
                        }
                        int var10 = var8 >>> var9 & 0xFF;
                        if (var10 <= 0) {
                            continue label56;
                        }
                        class227 var11 = class75.field1078[var10 - 1];
                        for (int var12 = 0; var12 < arg0.field279; var12++) {
                            if (arg0.field277[var12] == var11) {
                                var9 += 8;
                                continue label51;
                            }
                        }
                        arg0.field277[arg0.field279++] = var11;
                        if (arg0.field279 == 4) {
                            break label58;
                        }
                        var9 += 8;
                    }
                }
            }
        }
        for (int var13 = arg0.field279; var13 < 4; var13++) {
            arg0.field277[var13] = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lp;Lro;)V")
    public class91(class445 arg0, class248 arg1) {
        this.field1282 = arg0;
        this.field1287 = arg1;
        if (!this.field1282.method2800(-21)) {
            this.field1288 = this.field1282.method2799(-66, 255, (byte) 0, true, 255);
        }
    }
}
