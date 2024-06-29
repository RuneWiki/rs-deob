import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class182 {

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lda;")
    public static class275 field3130 = class255.method1672(110, "underlay");

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lda;")
    private static class275 field3129 = class255.method1672(104, "red:");

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lda;")
    public static class275 field3128 = field3129;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Lda;")
    public static class275 field3127 = field3129;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lak;IIIII)V")
    public static final void method1217(class234 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class221.field3751 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class247.field4359) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class172.field2997 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class3 var14 = class235.field4101[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class92.field1575[var11][var12 + 1][var13] + class92.field1575[var11][var12][var13] + class92.field1575[var11][var12][var13 + 1] + class92.field1575[var11][var12 + 1][var13 + 1]) / 4 - (class92.field1575[arg1][arg2 + 1][arg3] + class92.field1575[arg1][arg2][arg3] + class92.field1575[arg1][arg2][arg3 + 1] + class92.field1575[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class139 var16 = var14.field50;
                                    if (var16 != null) {
                                        if (var16.field2444.method1523()) {
                                            arg0.method1527(var16.field2444, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2446 != null && var16.field2446.method1523()) {
                                            arg0.method1527(var16.field2446, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field29; var17++) {
                                        class37 var18 = var14.field48[var17];
                                        if (var18 != null && var18.field612.method1523() && (var18.field616 == var12 || var7 == var12) && (var18.field617 == var13 || var9 == var13)) {
                                            int var19 = var18.field610 + 1 - var18.field616;
                                            int var20 = var18.field604 + 1 - var18.field617;
                                            arg0.method1527(var18.field612, (var18.field616 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field617 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method1218(boolean arg0) {
        field3129 = null;
        field3130 = null;
        field3127 = null;
        field3128 = null;
        if (arg0) {
            field3130 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BII)Lfd;")
    public static final class229 method1219(byte arg0, int arg1, int arg2) {
        if (arg0 != 114) {
            method1219((byte) -96, -98, -60);
        }
        field3131++;
        class229 var3 = class261.method1709(arg1, -123);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3942 == null || arg2 >= var3.field3942.length) {
            return null;
        } else {
            return var3.field3942[arg2];
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
    public static final void method1220(byte arg0) {
        int var1 = 106 / ((arg0 - 91) / 32);
        class252.field4474.method993(106);
        field3125++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
    public static final boolean method1221(int arg0, int arg1, int arg2) {
        if (arg0 != 128) {
            field3128 = null;
        }
        field3126++;
        return (arg1 >> arg2 + 1 & 0x1) != 0;
    }
}
