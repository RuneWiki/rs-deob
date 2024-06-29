import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class151 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lbn;")
    public static class160 field2046 = new class160(79, 15);

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Ljn;")
    public static class409 field2048 = new class409(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Lbt;")
    public static class363 field2049 = new class363(16);

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "[I")
    public static int[] field2053 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lct;")
    public static class104 field2051;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "Lfp;")
    public static class9 field2050;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([[[Log;I)V", line = 4)
    public static final void method1037(class369[][][] arg0, int arg1) {
        if (arg1 != 1336672256) {
            method1037((class369[][][]) null, -128);
        }
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class369[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class369 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5346 instanceof class438) {
                            ((class438) var6.field5346).method4(-27030);
                        }
                        if (var6.field5327 instanceof class438) {
                            ((class438) var6.field5327).method4(-27030);
                        }
                        if (var6.field5334 instanceof class438) {
                            ((class438) var6.field5334).method4(arg1 - 1336699286);
                        }
                        if (var6.field5335 instanceof class438) {
                            ((class438) var6.field5335).method4(-27030);
                        }
                        if (var6.field5332 instanceof class438) {
                            ((class438) var6.field5332).method4(-27030);
                        }
                        for (class206 var7 = var6.field5345; var7 != null; var7 = var7.field2882) {
                            class336 var8 = var7.field2880;
                            if (var8 instanceof class438) {
                                ((class438) var8).method4(-27030);
                            }
                        }
                    }
                }
            }
        }
        field2047++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z", line = 80)
    public static final boolean method1038(int arg0, int arg1, int arg2) {
        int var3 = class392.field5706[arg0][arg1][arg2];
        if (-class159.field2128 == var3) {
            return false;
        } else if (class159.field2128 == var3) {
            return true;
        } else {
            int var4 = arg1 << class167.field2206;
            int var5 = arg2 << class167.field2206;
            if (class154.method1054(var4 + 1, class215.field3069[arg0].method1429(arg1, arg2), var5 + 1) && class154.method1054(class100.field1271 + var4 - 1, class215.field3069[arg0].method1429(arg1 + 1, arg2), var5 + 1) && class154.method1054(class100.field1271 + var4 - 1, class215.field3069[arg0].method1429(arg1 + 1, arg2 + 1), class100.field1271 + var5 - 1) && class154.method1054(var4 + 1, class215.field3069[arg0].method1429(arg1, arg2 + 1), class100.field1271 + var5 - 1)) {
                class392.field5706[arg0][arg1][arg2] = class159.field2128;
                return true;
            } else {
                class392.field5706[arg0][arg1][arg2] = -class159.field2128;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 108)
    public static void method1039(byte arg0) {
        field2048 = null;
        field2050 = null;
        if (arg0 != 69) {
            field2053 = null;
        }
        field2049 = null;
        field2046 = null;
        field2051 = null;
        field2053 = null;
    }
}
