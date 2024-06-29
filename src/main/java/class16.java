import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class32 {

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public int field258 = 0;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Ldd;")
    public static class132 field251 = new class132();

    @OriginalMember(owner = "client!n", name = "J", descriptor = "Z")
    public static boolean field253 = false;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "Lqk;")
    public static class207 field257 = class24.method212(255, "m");

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field255 = 1;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Lpk;")
    public static class99 field254;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "[[[B")
    public static byte[][][] field256;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field256 = null;
        field254 = null;
        field257 = null;
        field251 = null;
        if (arg0 >= -107) {
            method102(122, -30, -71, -67, (class235) null, (class235) null, 16, -67, 12L);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lli;)V")
    public static final void method99(class288 arg0) {
        for (int var1 = arg0.field5150; var1 <= arg0.field5146; var1++) {
            for (int var2 = arg0.field5140; var2 <= arg0.field5142; var2++) {
                class174 var3 = class82.field1498[arg0.field5143][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3138; var4++) {
                        if (var3.field3140[var4] == arg0) {
                            var3.field3138--;
                            for (int var5 = var4; var5 < var3.field3138; var5++) {
                                var3.field3140[var5] = var3.field3140[var5 + 1];
                                var3.field3155[var5] = var3.field3155[var5 + 1];
                            }
                            var3.field3140[var3.field3138] = null;
                            break;
                        }
                    }
                    var3.field3150 = 0;
                    for (int var6 = 0; var6 < var3.field3138; var6++) {
                        var3.field3150 |= var3.field3155[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILv;)V")
    public final void method100(int arg0, class149 arg1) {
        field259++;
        while (true) {
            int var3 = arg1.method1045((byte) -18);
            if (var3 == 0) {
                int var4 = -58 % ((arg0 + 16) / 61);
                return;
            }
            this.method103(var3, arg1, -13185);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(BI)Lri;")
    public static final class65 method101(byte arg0, int arg1) {
        field260++;
        class65 var2 = (class65) class102.field1843.method1387((long) arg1, 123);
        if (var2 != null) {
            return var2;
        }
        int var3 = -80 / ((-arg0 - 18) / 59);
        byte[] var4 = class59.field1088.method705(class225.method1589(-84, arg1), class74.method534(arg1, (byte) -80), -1);
        class65 var5 = new class65();
        var5.field1181 = arg1;
        if (var4 != null) {
            var5.method471(new class149(var4), -2);
        }
        var5.method466(0);
        class102.field1843.method1385((long) arg1, var5, (byte) -128);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILdc;Ldc;IIJ)V")
    public static final void method102(int arg0, int arg1, int arg2, int arg3, class235 arg4, class235 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class209 var10 = new class209();
        var10.field3710 = arg8;
        var10.field3709 = arg1 * 128 + 64;
        var10.field3698 = arg2 * 128 + 64;
        var10.field3703 = arg3;
        var10.field3704 = arg4;
        var10.field3712 = arg5;
        var10.field3699 = arg6;
        var10.field3706 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class82.field1498[var11][arg1][arg2] == null) {
                class82.field1498[var11][arg1][arg2] = new class174(var11, arg1, arg2);
            }
        }
        class82.field1498[arg0][arg1][arg2].field3136 = var10;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILv;I)V")
    private final void method103(int arg0, class149 arg1, int arg2) {
        if (arg2 != -13185) {
            field251 = null;
        }
        if (arg0 == 2) {
            this.field258 = arg1.method1050(1272006568);
        }
        field250++;
    }
}
