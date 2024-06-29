import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class255 extends class104 {

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    private int field4117 = -32768;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Z")
    public static boolean field4109 = false;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
    public static boolean field4105 = false;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "[I")
    public static int[] field4112 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field4104 = 0;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field4111 = new String[1000];

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field4115 = -1;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public int field4107;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public int field4108;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "[[[I")
    public static int[][][] field4110;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIJILil;)V", line = 10)
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field4103++;
        class10 var13 = class5.method31(-1731690365, this.field4107).method1106((class285) null, 0, (byte) 127, -1, (class293) null, this.field4108, 0);
        if (var13 != null) {
            var13.method74(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4117 = var13.method95();
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 26)
    public static void method1776(int arg0) {
        field4110 = (int[][][]) null;
        field4112 = null;
        if (arg0 == 1000) {
            field4111 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lcg;ILti;Lcg;Z)V", line = 39)
    public static final void method1777(class49 arg0, int arg1, class244 arg2, class49 arg3, boolean arg4) {
        class97.field1551 = arg3;
        class158.field2795 = arg0;
        field4106++;
        class258.field4175 = arg4;
        if (arg1 <= 96) {
            method1776(-16);
        }
        int var5 = class158.field2795.method453(24190) - 1;
        class8.field111 = var5 * 256 + class158.field2795.method455(var5, true);
        class342.field5460 = new String[] { null, null, class190.field3188, null, null };
        class139.field2557 = arg2;
        class238.field3904 = new String[] { null, null, null, null, class329.field5228 };
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIII)V", line = 63)
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4116++;
        if (arg4 <= 6) {
            method1778(-41, -70, -20, -45, 12, 44, 44, 86);
        }
        int var8 = class105.method899(false, class135.field2358, class90.field1428, arg1);
        int var9 = class105.method899(false, class135.field2358, class90.field1428, arg7);
        int var10 = class105.method899(false, class310.field4916, class170.field2944, arg5);
        int var11 = class105.method899(false, class310.field4916, class170.field2944, arg2);
        int var12 = class105.method899(false, class135.field2358, class90.field1428, arg1 + arg3);
        int var13 = class105.method899(false, class135.field2358, class90.field1428, arg7 - arg3);
        for (int var14 = var8; var14 < var12; var14++) {
            class317.method2184(var11, (byte) -58, class64.field1007[var14], arg6, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class317.method2184(var11, (byte) -93, class64.field1007[var15], arg6, var10);
        }
        int var16 = class105.method899(false, class310.field4916, class170.field2944, arg3 + arg5);
        int var17 = class105.method899(false, class310.field4916, class170.field2944, arg2 - arg3);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class64.field1007[var18];
            class317.method2184(var16, (byte) -42, var19, arg6, var10);
            class317.method2184(var17, (byte) -21, var19, arg0, var16);
            class317.method2184(var11, (byte) -23, var19, arg6, var17);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V", line = 116)
    public final void method97(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4102++;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()I", line = 127)
    public final int method95() {
        field4113++;
        return this.field4117;
    }
}
