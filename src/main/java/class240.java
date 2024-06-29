import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class240 extends class79 {

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    private final int field4096;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    private final int field4099;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    private final int field4098;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    private final int field4095;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    private final int field4108;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    private final int field4106;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    private final int field4111;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    private final int field4103;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field4097 = 0;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    public static int field4107 = 0;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Z")
    public static boolean field4101 = true;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Lmh;")
    public static class128 field4109 = class22.method156(123, ":");

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 6)
    public static void method1631(int arg0) {
        if (arg0 != 9936) {
            field4107 = 32;
        }
        field4109 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V", line = 30)
    public final void method151(int arg0, int arg1, int arg2) {
        int var4 = this.field4103 * arg2 >> 12;
        field4100++;
        int var5 = this.field4099 * arg2 >> 12;
        int var6 = this.field4096 * arg0 >> 12;
        int var7 = this.field4095 * arg0 >> 12;
        if (arg1 != 0) {
            this.method151(31, -6, 100);
        }
        int var8 = this.field4106 * arg2 >> 12;
        int var9 = this.field4111 * arg0 >> 12;
        int var10 = this.field4098 * arg2 >> 12;
        int var11 = this.field4108 * arg0 >> 12;
        class72.method472(var8, var10, var5, var4, var7, var11, var9, -2, var6, this.field1437);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBILdj;)[Lfb;", line = 61)
    public static final class55[] method1632(int arg0, byte arg1, int arg2, class314 arg3) {
        field4104++;
        if (arg1 != 102) {
            method1633(92, 22, 54);
        }
        return class118.method708(arg1 ^ 0xFFFFFF98, arg0, arg3, arg2) ? class194.method1339((byte) 124) : null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V", line = 77)
    public final void method155(int arg0, int arg1, int arg2) {
        if (arg2 != -231) {
            field4101 = true;
        }
        field4105++;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(III)J", line = 88)
    public static final long method1633(int arg0, int arg1, int arg2) {
        class150 var3 = class182.field3184[arg0][arg1][arg2];
        return var3 == null || var3.field2586 == null ? 0L : var3.field2586.field1568;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZI)V", line = 99)
    public final void method154(int arg0, boolean arg1, int arg2) {
        field4102++;
        if (arg1) {
            field4093 = 101;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V", line = 121)
    public static final void method1634(byte arg0) {
        int var1 = class54.field1051.method564((byte) -109, 8);
        field4110++;
        if (class75.field1404 > var1) {
            for (int var2 = var1; var2 < class75.field1404; var2++) {
                class207.field3637[class8.field188++] = class203.field3593[var2];
            }
        }
        if (class75.field1404 < var1) {
            throw new RuntimeException("gppov1");
        }
        class75.field1404 = 0;
        if (arg0 != 88) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class203.field3593[var3];
            class123 var5 = class140.field2405[var4];
            int var6 = class54.field1051.method564((byte) -107, 1);
            if (var6 == 0) {
                class203.field3593[class75.field1404++] = var4;
                var5.field477 = class293.field5011;
            } else {
                int var7 = class54.field1051.method564((byte) -83, 2);
                if (var7 == 0) {
                    class203.field3593[class75.field1404++] = var4;
                    var5.field477 = class293.field5011;
                    class158.field2715[class314.field5335++] = var4;
                } else if (var7 == 1) {
                    class203.field3593[class75.field1404++] = var4;
                    var5.field477 = class293.field5011;
                    int var11 = class54.field1051.method564((byte) -124, 3);
                    var5.method121(false, var11, true);
                    int var12 = class54.field1051.method564((byte) -103, 1);
                    if (var12 == 1) {
                        class158.field2715[class314.field5335++] = var4;
                    }
                } else if (var7 == 2) {
                    class203.field3593[class75.field1404++] = var4;
                    var5.field477 = class293.field5011;
                    int var8 = class54.field1051.method564((byte) -112, 3);
                    var5.method121(true, var8, true);
                    int var9 = class54.field1051.method564((byte) -100, 3);
                    var5.method121(true, var9, true);
                    int var10 = class54.field1051.method564((byte) -115, 1);
                    if (var10 == 1) {
                        class158.field2715[class314.field5335++] = var4;
                    }
                } else if (var7 == 3) {
                    class207.field3637[class8.field188++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 243)
    public class240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4096 = arg1;
        this.field4099 = arg2;
        this.field4098 = arg6;
        this.field4095 = arg3;
        this.field4108 = arg7;
        this.field4106 = arg4;
        this.field4111 = arg5;
        this.field4103 = arg0;
    }
}
