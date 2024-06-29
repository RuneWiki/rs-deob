import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class757 extends class513 {

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public int field10513;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field10515;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    private int field10525;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public int field10528;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field10511;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "F")
    public float field10523;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "[Lkda;")
    public static class64[] field10512 = new class64[4];

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "[[I")
    public static int[][] field10514 = new int[128][128];

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field10507 = 328;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "[[I")
    public static int[][] field10517 = new int[128][128];

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field10510;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field10516;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field10518;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field10521;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field10522;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field10524;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "Ltba;")
    public static class320 field10527;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    public static int[] field10508;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
    public final int method4203(int arg0) {
        field10522++;
        return arg0 == 20918 ? this.field10513 : -73;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lhg;ZIILhg;IIIII)V")
    public static final void method4204(class584 arg0, boolean arg1, int arg2, int arg3, class584 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field10520++;
        int var10 = arg0.method371(-7508);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class21 var12 = (class21) class542.field7584.method3200((long) var10, -19983);
        if (var12 == null) {
            class320[] var13 = class320.method1860(class323.field4156, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class96.field1401.method2126(var13[0], true);
            class542.field7584.method3199((byte) 78, var12, (long) var10);
        }
        class390.method2370(arg4.method3470(-1) * 256, 0, arg4.field9501, arg4.field9489, arg8, arg3 >> 1, arg9, (byte) -50, arg4.field9490, arg6 >> 1);
        int var14 = class161.field2235[0] + arg5 - 18;
        int var15 = arg2 / 4 * 18 + var14;
        int var16 = class161.field2235[1] + arg7 - 16 - 54;
        int var17 = arg2 % 4 * 18 + var16;
        var12.method101(var15, var17);
        if (arg0 == arg4) {
            class96.field1401.method3263(var15 - 1, -256, (byte) -98, 18, var17 - 1, 18);
        }
        class217.method1422(var15 + 18, var17 + 18, -106, var15 - 1, var17 + -1);
        class656 var18 = class515.method3068(253);
        var18.field9288 = arg0;
        var18.field9287 = var17;
        var18.field9286 = var15 + 16;
        var18.field9285 = var17 + 16;
        if (arg1) {
            field10527 = null;
        }
        var18.field9284 = var15;
        class734.field10265.method1946(-120, var18);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
    public final int method4205(byte arg0) {
        if (arg0 != 8) {
            this.method4212(43);
        }
        field10524++;
        return this.field10515;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
    public final int method4206(byte arg0) {
        int var2 = 115 % ((arg0 - 68) / 40);
        field10519++;
        return this.field10525;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method4207(int arg0) {
        field10517 = null;
        field10512 = null;
        field10527 = null;
        field10508 = null;
        if (arg0 == -1) {
            field10514 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method4208(int arg0, String arg1) {
        field10516++;
        if (arg0 != 30259) {
            method4207(-31);
        }
        for (int var2 = 0; var2 < class280.field3725.length; var2++) {
            if (class280.field3725[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I")
    public final int method4209(byte arg0) {
        field10521++;
        return arg0 == -66 ? this.field10511 : 47;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBZZ)V")
    public static final void method4210(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4) {
        field10518++;
        class56.method382(true, arg3, 0, arg4, class571.field8083.length - 1, arg1, arg0);
        class245.field3417 = null;
        int var5 = 122 / ((-arg2 - 57) / 35);
        class426.field5897 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)F")
    public final float method4211(byte arg0) {
        field10510++;
        int var2 = 41 / ((arg0 - 16) / 42);
        return this.field10523;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)I")
    public final int method4212(int arg0) {
        field10526++;
        return arg0 == -54 ? this.field10528 : -114;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBII)V")
    public abstract void method2618(int arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IF)V")
    public abstract void method2616(int arg0, float arg1);

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IIIIIF)V")
    public class757(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field10513 = arg0;
        this.field10515 = arg2;
        this.field10525 = arg3;
        this.field10528 = arg1;
        this.field10511 = arg4;
        this.field10523 = arg5;
    }
}
