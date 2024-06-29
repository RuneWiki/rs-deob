import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class193 extends class152 {

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    private int field3296 = 4096;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "Lce;")
    private static class126 field3290 = class206.method1445(-7923, "flash3:");

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Lce;")
    public static class126 field3286 = field3290;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "Lce;")
    public static class126 field3297 = field3290;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lfg;")
    public static class48 field3294 = new class48(64);

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 3)
    public class193() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZLbb;)Lpa;", line = 10)
    public static final class152 method1368(boolean arg0, class134 arg1) {
        arg1.method948(-128);
        field3287++;
        int var2 = arg1.method948(-123);
        class152 var3 = class69.method503((byte) -13, var2);
        var3.field2771 = arg1.method948(-123);
        int var4 = arg1.method948(-128);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method948(-121);
            var3.method5(8, var6, arg1);
        }
        if (arg0) {
            return (class152) null;
        } else {
            var3.method2((byte) -96);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)[I", line = 50)
    public final int[] method6(boolean arg0, int arg1) {
        field3291++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1 - 1 & class314.field5378, 77, 0);
            int[] var5 = this.method1132(arg1, 118, 0);
            int[] var6 = this.method1132(class314.field5378 & arg1 + 1, 43, 0);
            for (int var7 = 0; var7 < class244.field4133; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3296;
                int var9 = (var5[var7 + 1 & class321.field5490] - var5[var7 - 1 & class321.field5490]) * this.field3296;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var12 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return arg0 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(II)V", line = 104)
    public static final void method1369(int arg0, int arg1) {
        field3299++;
        class245 var2 = class139.method1022(arg1, (byte) -103, arg0);
        var2.method1682(98);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V", line = 120)
    public static void method1370(int arg0) {
        field3294 = null;
        field3286 = null;
        field3297 = null;
        field3290 = null;
        if (arg0 != -1577522388) {
            method1371(-57, 19, 30, -44, -50, 100, 122, -63, -66, 8);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIII)V", line = 139)
    public static final void method1371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 < 64) {
            method1368(true, (class134) null);
        }
        class252 var10 = null;
        for (class252 var11 = (class252) class264.field4399.method898((byte) -83); var11 != null; var11 = (class252) class264.field4399.method893((byte) -125)) {
            if (var11.field4228 == arg4 && var11.field4209 == arg5 && var11.field4230 == arg6 && var11.field4221 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class252();
            var10.field4209 = arg5;
            var10.field4228 = arg4;
            var10.field4221 = arg7;
            var10.field4230 = arg6;
            class30.method145(-120, var10);
            class264.field4399.method899(var10, -28);
        }
        var10.field4225 = arg2;
        var10.field4211 = arg0;
        var10.field4218 = arg3;
        var10.field4235 = arg9;
        var10.field4219 = arg8;
        field3288++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILbb;)V", line = 183)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 == 8) {
            if (arg1 == 0) {
                this.field3296 = arg2.method942(true);
            }
            field3293++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lce;I)V", line = 215)
    public static final void method1372(class126 arg0, int arg1) {
        field3289++;
        int var2 = class148.method1109(arg0, -100);
        if (arg1 != 16777216) {
            method1369(-11, 53);
        }
        if (var2 != -1) {
            class307.method2089(-21706, class228.field3852.field881[var2], class228.field3852.field877[var2]);
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lce;I)Lce;", line = 237)
    public static final class126 method1373(class126 arg0, int arg1) {
        field3292++;
        int var2 = class144.method1051(arg0, arg1 + 27154);
        return ~var2 == arg1 ? class40.field634 : class228.field3852.field885[var2].method863(class23.field322, class301.field4979, -127);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Z)V", line = 258)
    public static final void method1374(boolean arg0) {
        class167.field2967.method1178(-79);
        if (!arg0) {
            method1368(true, (class134) null);
        }
        field3295++;
    }
}
