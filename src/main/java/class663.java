import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class663 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lir;")
    private class25 field9343 = new class25();

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "Lfc;")
    public static class235 field9355 = new class235(13, 0);

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Lfc;")
    public static class235 field9357 = new class235(103, 2);

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field9350;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field9352;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "Lkea;")
    public static class216 field9360;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lir;")
    private class25 field9351;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static final void method3672(int arg0) {
        class95.field1241.method1269((byte) 98);
        if (arg0 != -15925) {
            field9360 = null;
        }
        field9347++;
        class371.field5291.method1269((byte) 109);
        for (class345 var1 = (class345) class487.field6761.method1270((byte) -25); var1 != null; var1 = (class345) class487.field6761.method1282(arg0 ^ 0xFFFFC1CB)) {
            int var18 = var1.field4983;
            if (var18 < 1000) {
                var1.method2971(1);
                if (var18 == 58 || var18 == 18 || var18 == 44 || var18 == 3 || var18 == 10 || var18 == 51 || var18 == 5) {
                    class371.field5291.method1273(var1, (byte) 122);
                } else {
                    class95.field1241.method1273(var1, (byte) 122);
                }
            }
        }
        class95.field1241.method1278((byte) 90, class487.field6761);
        class371.field5291.method1278((byte) 90, class487.field6761);
        if (class315.field4697 <= 1) {
            class643.field9138 = null;
        } else if (class46.field689 && class531.field7246.method666(50, 81) && class315.field4697 > 2) {
            class643.field9138 = (class345) class487.field6761.field2826.field7306.field7306;
        } else {
            class643.field9138 = (class345) class487.field6761.field2826.field7306;
        }
        int var2 = -1;
        class113 var3 = (class113) class441.field6211.method1270((byte) -25);
        if (var3 != null) {
            var2 = var3.method844(arg0 + 15863);
        }
        if (!class229.field3278) {
            if (var2 == 0 && (class662.field9339 == 1 && class315.field4697 > 2 || class474.method2696((byte) 118))) {
                var2 = 2;
            }
            if (var2 == 2 && class315.field4697 > 0 && var3 != null) {
                if (class612.field8489 == null && class556.field7519 == 0) {
                    class340.method2036(var3.method847(-1), var3.method840(115), 22);
                } else {
                    class569.field7653 = 2;
                }
            }
            if (var2 == 0 && class315.field4697 > 0) {
                class252.method1555(arg0 ^ 0xFFFFC1CA);
            }
            if (class612.field8489 == null && class556.field7519 == 0) {
                class569.field7653 = 0;
                class466.field6559 = null;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class46.field686.method70((byte) -113);
            int var5 = class46.field686.method66(74);
            if ((class113.field1532 - 10) > var4 || (class113.field1532 + class364.field5200 + 10) < var4 || var5 < class174.field2605 - 10 || var5 > class371.field5287 + class174.field2605 + 10) {
                class592.method3296((byte) 82);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class113.field1532;
        int var7 = class174.field2605;
        int var8 = class364.field5200;
        int var9 = var3.method847(-1);
        int var10 = var3.method840(109);
        int var11 = -1;
        for (int var12 = 0; var12 < class315.field4697; var12++) {
            if (class36.field450) {
                int var17 = (class315.field4697 - (var12 + 1)) * 16 + var7 + 33;
                if (var6 < var9 && (var6 + var8) > var9 && (var17 - 13) < var10 && var10 < (var17 + 4)) {
                    var11 = var12;
                }
            } else {
                int var16 = (class315.field4697 - var12 - 1) * 16 + var7 + 31;
                if (var9 > var6 && var6 + var8 > var9 && (var16 - 13) < var10 && (var16 + 3) > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class440 var14 = new class440(class487.field6761);
            for (class345 var15 = (class345) var14.method2522(0); var15 != null; var15 = (class345) var14.method2524(20017)) {
                if (var11 == var13) {
                    class21.method107(var10, false, var9, var15);
                }
                var13++;
            }
        }
        class592.method3296((byte) 82);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIZIII)V")
    public static final void method3673(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field9352++;
        if (arg3 != -20189) {
            return;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class219.field3174 - class247.field3510) * var6 / 100 + class247.field3510;
        if (var7 < class396.field5505) {
            var7 = class396.field5505;
        } else if (var7 > class53.field755) {
            var7 = class53.field755;
        }
        int var8 = arg5 * var7 * 512 / (arg0 * 334);
        if (class3.field17 > var8) {
            short var12 = class3.field17;
            var7 = arg0 * var12 * 334 / (arg5 * 512);
            if (var7 > class53.field755) {
                var7 = class53.field755;
                int var13 = var7 * 512 * arg5 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg2) {
                    class630.field8790.method449();
                    class630.field8790.method3558((byte) 109, arg1, -16777216, var14, arg5, arg4);
                    class630.field8790.method3558((byte) 72, arg1, -16777216, var14, arg5, arg0 + arg4 - var14);
                }
                arg4 += var14;
                arg0 -= var14 * 2;
            }
        } else if (var8 > class228.field3273) {
            short var9 = class228.field3273;
            var7 = arg0 * 334 * var9 / (arg5 * 512);
            if (class396.field5505 > var7) {
                var7 = class396.field5505;
                int var10 = var9 * 334 * arg0 / (var7 * 512);
                int var11 = (arg5 - var10) / 2;
                if (arg2) {
                    class630.field8790.method449();
                    class630.field8790.method3558((byte) 38, arg1, -16777216, arg0, var11, arg4);
                    class630.field8790.method3558((byte) 54, arg1 + arg5 - var11, -16777216, arg0, var11, arg4);
                }
                arg1 += var11;
                arg5 -= var11 * 2;
            }
        }
        class486.field6752 = arg1;
        class689.field9696 = (short) arg0;
        class474.field6610 = arg5 * var7 / 334;
        class633.field8864 = arg4;
        class440.field6200 = (short) arg5;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(CI)C")
    public static final char method3674(char arg0, int arg1) {
        if (arg1 != 5409) {
            return '(';
        }
        field9344++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)Z")
    public final boolean method3675(int arg0) {
        if (arg0 == -28821) {
            field9350++;
            return this.field9343.field334 == this.field9343;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)Lir;")
    public final class25 method3676(byte arg0) {
        field9348++;
        class25 var2 = this.field9343.field334;
        int var3 = 18 / ((arg0 - 41) / 48);
        if (this.field9343 == var2) {
            this.field9351 = null;
            return null;
        } else {
            this.field9351 = var2.field334;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
    public static void method3677(int arg0) {
        field9355 = null;
        if (arg0 != 0) {
            method3674('(', -104);
        }
        field9357 = null;
        field9360 = null;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)Lir;")
    public final class25 method3678(int arg0) {
        field9346++;
        class25 var2 = this.field9343.field334;
        if (this.field9343 == var2) {
            return null;
        }
        var2.method118(-30545);
        if (arg0 != -194) {
            method3673(3, 89, true, 105, -64, 96);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lir;I)V")
    public final void method3679(class25 arg0, int arg1) {
        if (arg0.field329 != null) {
            arg0.method118(-30545);
        }
        field9358++;
        arg0.field334 = this.field9343;
        if (arg1 == 0) {
            arg0.field329 = this.field9343.field329;
            arg0.field329.field334 = arg0;
            arg0.field334.field329 = arg0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)Lir;")
    public final class25 method3680(int arg0) {
        field9353++;
        class25 var2 = this.field9343.field329;
        if (this.field9343 == var2) {
            this.field9351 = null;
            return null;
        }
        this.field9351 = var2.field329;
        if (arg0 > -101) {
            this.method3681(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)I")
    public final int method3681(boolean arg0) {
        if (!arg0) {
            return -84;
        }
        field9345++;
        int var2 = 0;
        for (class25 var3 = this.field9343.field334; var3 != this.field9343; var3 = var3.field334) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)Lir;")
    public final class25 method3682(int arg0) {
        field9354++;
        class25 var2 = this.field9351;
        if (this.field9343 == var2) {
            this.field9351 = null;
            return null;
        }
        this.field9351 = var2.field334;
        if (arg0 != -18176) {
            field9357 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
    public final void method3683(int arg0) {
        field9349++;
        while (true) {
            class25 var2 = this.field9343.field334;
            if (this.field9343 == var2) {
                if (arg0 != 14962) {
                    field9356 = 82;
                }
                this.field9351 = null;
                return;
            }
            var2.method118(-30545);
        }
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
    public class663() {
        this.field9343.field334 = this.field9343;
        this.field9343.field329 = this.field9343;
    }
}
