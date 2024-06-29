import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class7 {

    @OriginalMember(owner = "client!wja", name = "f", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!wja", name = "c", descriptor = "Ljaa;")
    public static class779 field68 = new class779();

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!wja", name = "b", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!wja", name = "e", descriptor = "Ldm;")
    public class104 field70;

    @OriginalMember(owner = "client!wja", name = "g", descriptor = "Lvba;")
    public static class765 field72;

    @OriginalMember(owner = "client!wja", name = "d", descriptor = "[I")
    public int[] field69;

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIBIII)V", line = 7)
    public static final void method19(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field66++;
        int var6 = arg4 - arg5;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class179.method1148(arg3, arg1, arg4, arg5, (byte) -72);
            }
        } else if (var6 == 0) {
            class321.method1865(arg5, arg1, arg3, -19, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                int var10 = arg0;
                arg1 = arg5;
                arg0 = arg4;
                arg5 = var9;
                arg4 = var10;
            }
            if (arg0 < arg1) {
                int var11 = arg1;
                int var12 = arg5;
                arg1 = arg0;
                arg5 = arg4;
                arg0 = var11;
                arg4 = var12;
            }
            int var13 = arg5;
            int var14 = arg0 - arg1;
            int var15 = -59 % ((arg2 - 37) / 40);
            int var16 = arg4 - arg5;
            int var17 = -(var14 >> 1);
            if (var16 < 0) {
                var16 = -var16;
            }
            int var18 = arg4 <= arg5 ? -1 : 1;
            if (var8) {
                for (int var20 = arg1; var20 <= arg0; var20++) {
                    var17 += var16;
                    class207.field2840[var20][var13] = arg3;
                    if (var17 > 0) {
                        var13 += var18;
                        var17 -= var14;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg0; var19++) {
                    var17 += var16;
                    class207.field2840[var13][var19] = arg3;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wja", name = "a", descriptor = "(I)V", line = 123)
    public static void method20(int arg0) {
        field68 = null;
        if (arg0 != -18928) {
            field68 = null;
        }
        field72 = null;
    }
}
