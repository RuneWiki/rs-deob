import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public abstract class class673 extends class477 {

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "Lrl;")
    public class153 field9538;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
    public int field9535;

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "[F")
    public static float[] field9534 = new float[16384];

    @OriginalMember(owner = "client!lfa", name = "y", descriptor = "[F")
    public static float[] field9537 = new float[16384];

    @OriginalMember(owner = "client!lfa", name = "x", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!lfa", name = "A", descriptor = "Lcd;")
    public static class498 field9539;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIII)V")
    public static final void method3721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9536++;
        int var6 = arg0 - arg3;
        int var7 = arg1 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class324.method2084(arg0, arg3, arg2, (byte) 121, arg5);
            }
        } else if (var6 == 0) {
            class457.method2585(arg2, (byte) 88, arg1, arg3, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg5;
                arg5 = arg3;
                int var10 = arg1;
                arg3 = var9;
                arg1 = arg0;
                arg0 = var10;
            }
            if (arg5 > arg1) {
                int var11 = arg5;
                arg5 = arg1;
                int var12 = arg3;
                arg1 = var11;
                arg3 = arg0;
                arg0 = var12;
            }
            if (arg4 != -9797) {
                field9537 = null;
            }
            int var13 = arg3;
            int var14 = arg1 - arg5;
            int var15 = arg0 - arg3;
            int var16 = -(var14 >> 1);
            if (var15 < 0) {
                var15 = -var15;
            }
            int var17 = arg0 <= arg3 ? -1 : 1;
            if (var8) {
                for (int var18 = arg5; var18 <= arg1; var18++) {
                    class319.field4673[var18][var13] = arg2;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg5; var19 <= arg1; var19++) {
                    var16 += var15;
                    class319.field4673[var13][var19] = arg2;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method3722(int arg0) {
        if (arg0 != -18269) {
            field9534 = null;
        }
        field9537 = null;
        field9539 = null;
        field9534 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2207(byte arg0);

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lrl;I)V")
    public class673(class153 arg0, int arg1) {
        this.field9538 = arg0;
        this.field9535 = arg1;
    }

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "(I)Z")
    public abstract boolean method2206(int arg0);

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9537[var2] = (float) Math.sin((double) var2 * var0);
            field9534[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
