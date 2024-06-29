import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class233 {

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3287 = -2;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[Llr;")
    public static class640[] field3289 = new class640[50];

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Ljn;")
    public static class613 field3288;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3284;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[Lha;")
    public static class52[] field3285;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
    public static final void method1468(Object[] arg0, long[] arg1, int arg2) {
        class405.method2414(0, arg1.length + arg2, arg1, 2, arg0);
        field3286++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIBII)V")
    public static final void method1469(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3290++;
        int var6 = arg0 - arg1;
        int var7 = arg2 - arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class105.method742(arg5, (byte) 117, arg1, arg0, arg4);
            }
        } else if (var6 == 0) {
            class483.method2808(arg4, 215, arg2, arg5, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            int var8 = -55 % ((37 - arg3) / 40);
            boolean var9 = var6 > var7;
            if (var9) {
                int var10 = arg4;
                arg4 = arg1;
                int var11 = arg2;
                arg1 = var10;
                arg2 = arg0;
                arg0 = var11;
            }
            if (arg2 < arg4) {
                int var12 = arg4;
                int var13 = arg1;
                arg4 = arg2;
                arg1 = arg0;
                arg2 = var12;
                arg0 = var13;
            }
            int var14 = arg1;
            int var15 = arg2 - arg4;
            int var16 = arg0 - arg1;
            int var17 = -(var15 >> 1);
            if (var16 < 0) {
                var16 = -var16;
            }
            int var18 = arg0 > arg1 ? 1 : -1;
            if (var9) {
                for (int var20 = arg4; var20 <= arg2; var20++) {
                    var17 += var16;
                    class182.field2580[var20][var14] = arg5;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var15;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg2; var19++) {
                    class182.field2580[var14][var19] = arg5;
                    var17 += var16;
                    if (var17 > 0) {
                        var17 -= var15;
                        var14 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1470(int arg0) {
        field3284 = null;
        field3289 = null;
        field3285 = null;
        if (arg0 != -5240) {
            field3284 = null;
        }
        field3288 = null;
    }
}
