import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class447 extends class226 {

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "[I")
    public int[] field6382;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "[I")
    public int[] field6386;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field6384 = 0;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "[I")
    public static int[] field6390 = new int[16384];

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field6389 = 0;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[I")
    public static int[] field6381 = new int[16384];

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Lbr;")
    public static class223 field6383;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6381[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field6390[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field6391 = 0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBIII)V", line = 3)
    public static final void method2787(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= class408.field5789 && arg3 <= class231.field3415) {
            int var5 = class209.method1485(class240.field3547, 1667, class245.field3659, arg0);
            int var6 = class209.method1485(class240.field3547, 1667, class245.field3659, arg2);
            class352.method2299(arg3, var5, arg4, 2, var6);
        }
        field6388++;
        if (arg1 >= -45) {
            field6381 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILtj;)V", line = 22)
    public static final void method2788(int arg0, class108 arg1) {
        field6387++;
        class96.field1225 = arg1;
        if (arg0 < 54) {
            field6389 = -76;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V", line = 37)
    public static void method2789(int arg0) {
        if (arg0 != -16385) {
            method2787(-53, (byte) 62, 53, 29, -84);
        }
        field6383 = null;
        field6381 = null;
        field6390 = null;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lsp;B)I", line = 51)
    public static final int method2790(class382 arg0, byte arg1) {
        field6385++;
        if (arg1 < 111) {
            field6392 = -3;
        }
        String var2 = class239.method1631((byte) 28, arg0);
        int[] var3 = null;
        if (class411.method2601(-3, arg0.field5420)) {
            var3 = class167.method1202(true, (int) arg0.field5421).field5807;
        } else if (class126.method762(arg0.field5420, false)) {
            class446 var4 = class442.field6317[(int) arg0.field5421];
            if (var4 != null) {
                var3 = var4.field6375.field4985;
            }
        } else if (class204.method1426(arg0.field5420, false)) {
            if (arg0.field5420 == 1004) {
                var3 = class398.method2496(-126, (int) arg0.field5421).field4073;
            } else {
                var3 = class398.method2496(-116, (int) (arg0.field5421 >>> 32 & 0x7FFFFFFFL)).field4073;
            }
        }
        if (var3 != null) {
            var2 = var2 + class291.method1971(76, var3);
        }
        return class70.field934.method1306(var2, class110.field1426, (byte) -84);
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II[I[I)V", line = 110)
    public class447(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6382 = arg2;
        this.field6386 = arg3;
    }
}
