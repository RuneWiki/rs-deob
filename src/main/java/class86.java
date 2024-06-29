import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class86 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lmq;")
    private class472 field1207 = new class472(64);

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljn;")
    private class668 field1212;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
    public static int[] field1220 = new int[1000];

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lhu;")
    public static class115 field1217 = new class115("", 15);

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[Llv;")
    public static class411[] field1222;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public final void method684(byte arg0) {
        class472 var2 = this.field1207;
        synchronized (this.field1207) {
            this.field1207.method2776(false);
        }
        field1216++;
        if (arg0 != -2) {
            this.field1207 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lf;ILn;IILua;BI)V")
    public static final void method685(class701 arg0, int arg1, class17 arg2, int arg3, int arg4, class616 arg5, byte arg6, int arg7) {
        field1219++;
        if (arg0 == null) {
            return;
        }
        int var8;
        if (class586.field8507 == 4) {
            var8 = (int) class115.field1495 & 0x3FFF;
        } else {
            var8 = (int) class115.field1495 + class186.field2277 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field414 / 2, arg2.field402 / 2) + 10;
        int var10 = arg4 * arg4 + (arg3 * arg3);
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class395.field5579[var8];
        int var12 = class395.field5582[var8];
        if (class586.field8507 != 4) {
            var11 = var11 * 256 / (class680.field9743 + 256);
            var12 = var12 * 256 / (class680.field9743 + 256);
        }
        int var13 = arg3 * var11 + arg4 * var12 >> 14;
        int var14 = arg3 * var12 - arg4 * var11 >> 14;
        arg0.method6(var13 + (arg2.field414 / 2 + arg1 - arg0.method896() / 2), arg7 - -(arg2.field402 / 2) + -var14 + -(arg0.method901() / 2), arg5, arg1, arg7);
        if (arg6 != -92) {
            method690(false, (byte) -112, 92, -14, -103, 111, null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
    public final void method686(byte arg0, int arg1) {
        field1211++;
        class472 var3 = this.field1207;
        synchronized (this.field1207) {
            this.field1207.method2777(arg1, 95);
        }
        if (arg0 != 67) {
            field1221 = 86;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method687(String arg0, String arg1, int arg2) {
        class168.field2054 = -1;
        if (arg2 == 0) {
            class611.field8763 = 1;
            field1208++;
            class256.method1559(arg0, false, (byte) 23, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        if (arg0 >= -21) {
            method687(null, null, -31);
        }
        field1222 = null;
        field1220 = null;
        field1217 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public final void method689(int arg0) {
        field1209++;
        class472 var2 = this.field1207;
        synchronized (this.field1207) {
            this.field1207.method2778((byte) 111);
        }
        if (arg0 != 1) {
            method685(null, -5, null, -95, 17, null, (byte) -20, -79);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZBIIIILjn;)V")
    public static final void method690(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class668 arg6) {
        if (arg1 != 96) {
            field1213 = -49;
        }
        field1218++;
        if (arg5 <= 0) {
            class521.method3088(arg4, -53, arg0, arg6, arg3, arg2);
            return;
        }
        class190.field2312 = arg0;
        class511.field7473 = arg4;
        class505.field7053 = 1;
        class74.field1112 = arg6;
        class108.field1399 = arg2;
        class548.field7959 = null;
        class426.field6123 = arg3;
        class42.field762 = class601.field8666.method2107((byte) 113) / arg5;
        if (class42.field762 < 1) {
            class42.field762 = 1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ler;ILjn;)V")
    public class86(class90 arg0, int arg1, class668 arg2) {
        this.field1212 = arg2;
        if (this.field1212 == null) {
            this.field1210 = 0;
        } else {
            this.field1210 = this.field1212.method3805(16, false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Liba;")
    public final class490 method691(int arg0, int arg1) {
        field1214++;
        class472 var3 = this.field1207;
        class490 var4;
        synchronized (this.field1207) {
            var4 = (class490) this.field1207.method2766(-128, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field1212;
        byte[] var6;
        synchronized (this.field1212) {
            var6 = this.field1212.method3800(arg1, arg0, (byte) -92);
        }
        class490 var7 = new class490();
        if (var6 != null) {
            var7.method2856(1, new class389(var6));
        }
        class472 var8 = this.field1207;
        synchronized (this.field1207) {
            this.field1207.method2772(var7, true, (long) arg1);
            return var7;
        }
    }
}
