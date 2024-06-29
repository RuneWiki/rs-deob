import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class659 {

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[I")
    public static int[] field9504 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Llk;")
    public static class545 field9503;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[[[Ldf;)V")
    public static final void method3750(int arg0, class370[][][] arg1) {
        field9501++;
        for (int var2 = arg0; var2 < arg1.length; var2++) {
            class370[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class370 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5494 instanceof class83) {
                            ((class83) var6.field5494).method843(true);
                        }
                        if (var6.field5501 instanceof class83) {
                            ((class83) var6.field5501).method843(true);
                        }
                        if (var6.field5503 instanceof class83) {
                            ((class83) var6.field5503).method843(true);
                        }
                        if (var6.field5491 instanceof class83) {
                            ((class83) var6.field5491).method843(true);
                        }
                        if (var6.field5493 instanceof class83) {
                            ((class83) var6.field5493).method843(true);
                        }
                        for (class636 var7 = var6.field5497; var7 != null; var7 = var7.field9171) {
                            class122 var8 = var7.field9172;
                            if (var8 instanceof class83) {
                                ((class83) var8).method843(true);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method3751(byte arg0) {
        field9503 = null;
        int var1 = -23 / ((arg0 + 12) / 36);
        field9504 = null;
    }
}
