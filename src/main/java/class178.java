import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class178 extends class220 {

    @OriginalMember(owner = "client!me", name = "I", descriptor = "[Lvl;")
    public class73[] field3132;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "Lmh;")
    public static class128 field3131 = class22.method156(122, "scrollbar");

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[[Lgl;")
    public static class182[][] field3136 = new class182[13][13];

    @OriginalMember(owner = "client!me", name = "G", descriptor = "Lmh;")
    private static class128 field3130 = class22.method156(123, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!me", name = "K", descriptor = "Lmh;")
    public static class128 field3134 = field3130;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "Lmh;")
    public static class128 field3138 = class22.method156(125, "0");

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Ldj;")
    public static class314 field3137;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "[I")
    public static int[] field3128;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V", line = 36)
    public static void method1218(int arg0) {
        field3134 = null;
        if (arg0 != 0) {
            method1218(-126);
        }
        field3136 = (class182[][]) null;
        field3137 = null;
        field3130 = null;
        field3131 = null;
        field3138 = null;
        field3128 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ldj;Ldj;IZ)V", line = 55)
    public class178(class314 arg0, class314 arg1, int arg2, boolean arg3) {
        class296 var5 = new class296();
        int var6 = arg0.method2146((byte) 120, arg2);
        this.field3132 = new class73[var6];
        int[] var7 = arg0.method2145(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method2155(var7[var8], arg2, (byte) 70);
            class58 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class58 var12 = (class58) var5.method2024(0); var12 != null; var12 = (class58) var5.method2027(1211754408)) {
                if (var12.field1103 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method2163(0, var11, 12689);
                } else {
                    var13 = arg1.method2163(var11, 0, 12689);
                }
                var10 = new class58(var11, var13);
                var5.method2029((byte) -34, var10);
            }
            this.field3132[var7[var8]] = new class73(var9, var10);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z", line = 114)
    public final boolean method1219(int arg0, int arg1) {
        if (arg1 != 255) {
            method1218(118);
        }
        field3133++;
        return this.field3132[arg0].field1348;
    }
}
