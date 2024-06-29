import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class329 extends class150 {

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    private int field5091;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    private int field5097;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5082 = new String[200];

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "Ljava/lang/String;")
    public static String field5086 = "K";

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field5084 = "Loading title screen - ";

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field5093 = 3;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lai;")
    public static class126 field5088;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
    public static int[] field5094;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method2246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg0 - arg3;
        field5089++;
        int var7 = arg4 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class242.method1720(arg1, arg5, arg4, arg3, 0);
            }
        } else if (var7 == 0) {
            class137.method1052(arg5, arg3, arg0, (byte) -115, arg1);
        } else {
            if (~var7 > arg2) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg3;
                arg3 = arg5;
                arg5 = var9;
                int var10 = arg0;
                arg0 = arg4;
                arg4 = var10;
            }
            if (arg0 < arg3) {
                int var11 = arg5;
                int var12 = arg3;
                arg5 = arg4;
                arg4 = var11;
                arg3 = arg0;
                arg0 = var12;
            }
            int var13 = arg5;
            int var14 = arg0 - arg3;
            int var15 = -(var14 >> 1);
            int var16 = arg4 - arg5;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg4 > arg5 ? 1 : -1;
            if (var8) {
                for (int var19 = arg3; var19 <= arg0; var19++) {
                    var15 += var16;
                    class102.field1729[var19][var13] = arg1;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg0; var18++) {
                    class102.field1729[var13][var18] = arg1;
                    var15 += var16;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)V", line = 132)
    public final void method1060(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        int var4 = this.field5087 * arg0 >> 12;
        int var5 = this.field5097 * arg1 >> 12;
        int var6 = this.field5098 * arg0 >> 12;
        field5085++;
        int var7 = this.field5091 * arg1 >> 12;
        class314.method2158(this.field2407, var6, var4, var5, this.field2413, this.field2408, var7, (byte) 37);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V", line = 155)
    public static final void method2247(int arg0, int arg1) {
        field5096++;
        if (arg0 >= 3) {
            class4 var2 = class67.method510(1, 9, arg1);
            var2.method6(255);
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 176)
    public static void method2248(int arg0) {
        field5086 = null;
        field5088 = null;
        field5094 = null;
        field5084 = null;
        field5082 = null;
        if (arg0 < 109) {
            method2247(51, 71);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V", line = 191)
    public class329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5091 = arg3;
        this.field5087 = arg2;
        this.field5097 = arg1;
        this.field5098 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V", line = 211)
    public static final void method2249(int arg0) {
        class285.field4371.method1837(-122);
        field5092++;
        if (arg0 != 16475) {
            field5086 = (String) null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V", line = 223)
    public final void method1063(int arg0, int arg1, int arg2) {
        int var4 = -69 % ((arg1 + 72) / 53);
        field5099++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 236)
    public final void method1061(int arg0, int arg1, int arg2) {
        field5095++;
        int var4 = this.field5087 * arg1 >> 12;
        int var5 = this.field5098 * arg1 >> 12;
        int var6 = this.field5097 * arg2 >> 12;
        if (arg0 != 50) {
            method2248(54);
        }
        int var7 = this.field5091 * arg2 >> 12;
        class312.method2153(this.field2408, var6, var5, -28395, var4, var7);
    }
}
