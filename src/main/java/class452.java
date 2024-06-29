import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class452 {

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field6668 = -1;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lbt;")
    public static class363 field6665 = new class363(50);

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lbn;")
    public static class160 field6672 = new class160(32, 8);

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lil;")
    public static class274 field6674 = new class274(13, 5);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Ln;")
    public static class27 field6671;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lae;")
    public static class285 field6676;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "[Lhm;")
    public static class290[] field6675;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6673;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
    public static final int method2805(int arg0, int arg1) {
        field6667++;
        return arg0 <= 108 ? -34 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBIII)V")
    public static final void method2806(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field6670++;
        int var6 = arg4 - arg0;
        int var7 = arg5 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class196.method1365(true, arg3, arg4, arg1, arg0);
            }
        } else if (var6 == 0) {
            class388.method2454(arg3, arg0, arg5, false, arg1);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                arg1 = arg0;
                int var10 = arg5;
                arg0 = var9;
                arg5 = arg4;
                arg4 = var10;
            }
            if (arg5 < arg1) {
                int var11 = arg1;
                arg1 = arg5;
                int var12 = arg0;
                arg0 = arg4;
                arg5 = var11;
                arg4 = var12;
            }
            int var13 = arg0;
            int var14 = arg5 - arg1;
            int var15 = arg4 - arg0;
            int var16 = -(var14 >> 1);
            int var17 = arg0 >= arg4 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (arg2 != 76) {
                field6672 = null;
            }
            if (var8) {
                for (int var18 = arg1; var18 <= arg5; var18++) {
                    class323.field4774[var18][var13] = arg3;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg5; var19++) {
                    var16 += var15;
                    class323.field4774[var13][var19] = arg3;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public static final void method2807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class159.field2132.field3762 = 0;
        field6669++;
        class159.field2132.method1727(-128, class33.field465.field892);
        if (arg2 != -24814) {
            field6671 = null;
        }
        class159.field2132.method1727(-128, arg3);
        class159.field2132.method1727(-128, arg4);
        class159.field2132.method1750((byte) 0, arg0);
        class159.field2132.method1750((byte) 0, arg1);
        class257.field3807 = 0;
        class244.field3616 = -3;
        class22.field310 = 1;
        class263.field3899 = 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method2808(int arg0) {
        field6675 = null;
        if (arg0 != 5) {
            return;
        }
        field6676 = null;
        field6665 = null;
        field6674 = null;
        field6671 = null;
        field6673 = null;
        field6672 = null;
    }
}
