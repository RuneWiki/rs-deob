import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class197 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lcc;")
    public static class209 field3530 = class95.method669(124, ")1");

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lcc;")
    public static class209 field3529 = class95.method669(122, "sch-Utteln:");

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[I")
    public static int[] field3535 = new int[32];

    @OriginalMember(owner = "client!si", name = "l", descriptor = "S")
    public static short field3536;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Z")
    public static boolean field3539;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "Ldg;")
    public static class139 field3538;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[Lhd;")
    public static class11[] field3537;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)I")
    public static final int method1348(int arg0, boolean arg1) {
        if (!arg1) {
            field3539 = true;
        }
        field3525++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIJLcc;I)V")
    public static final void method1349(int arg0, int arg1, int arg2, int arg3, long arg4, class209 arg5, int arg6) {
        field3528++;
        class106 var8 = new class106(arg0);
        var8.method773(arg0 - 6513, 10);
        var8.method740(255, (int) (Math.random() * 99999.0D));
        var8.method740(255, 523);
        var8.method756(arg4, (byte) 119);
        var8.method758((int) (Math.random() * 9.9999999E7D), arg0 ^ 0x57944238);
        var8.method745(arg5, (byte) 81);
        var8.method758((int) (Math.random() * 9.9999999E7D), arg0 ^ 0x57944238);
        var8.method740(255, class60.field1210);
        var8.method773(-6385, arg2);
        var8.method773(-6385, arg1);
        var8.method758((int) (Math.random() * 9.9999999E7D), 1469334200);
        var8.method740(255, arg6);
        var8.method740(255, arg3);
        var8.method758((int) (Math.random() * 9.9999999E7D), 1469334200);
        var8.method727(-110, class234.field4211, class129.field2477);
        class84.field1677.field2085 = 0;
        class84.field1677.method773(-6385, 55);
        class84.field1677.method773(-6385, var8.field2085);
        class84.field1677.method743(var8.field2108, 0, var8.field2085, arg0 - 30394);
        class141.field2608 = 0;
        class72.field1360 = -3;
        class64.field1247 = 0;
        class78.field1444 = 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILtf;B)V")
    private final void method1350(int arg0, class106 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3532 = arg1.method736(126);
            this.field3526 = arg1.method774((byte) 94);
            this.field3527 = arg1.method774((byte) 91);
        }
        field3533++;
        int var4 = 69 % ((1 - arg2) / 61);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILtf;)V")
    public final void method1351(int arg0, class106 arg1) {
        while (true) {
            int var3 = arg1.method774((byte) 109);
            if (var3 == 0) {
                field3534++;
                if (arg0 != -25736) {
                    this.method1351(-127, (class106) null);
                    return;
                }
                return;
            }
            this.method1350(var3, arg1, (byte) 64);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1352(int arg0) {
        field3530 = null;
        if (arg0 <= 87) {
            method1352(-17);
        }
        field3535 = null;
        field3529 = null;
        field3537 = null;
        field3538 = null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3535[var1] = var0 - 1;
            var0 += var0;
        }
        field3536 = 1;
        field3539 = false;
    }
}
