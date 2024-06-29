import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class81 extends class248 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    private int field1096 = -32768;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Lfg;")
    public static class52 field1099 = new class52();

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field1110 = 0;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "S")
    public static short field1112 = 320;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "[I")
    public static int[] field1113 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field1108 = -1;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Lma;")
    public static class5 field1109 = new class5();

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1114 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "[I")
    public static int[] field1116 = new int[2048];

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "Lrm;")
    public static class184 field1115 = new class184(64);

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field1117 = 0;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1107;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "[I")
    public static int[] field1101;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "[I")
    public static int[] field1103;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "[[I")
    public static int[][] field1111;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method592(int arg0) {
        class332.field5174.method1355(false);
        field1093++;
        int var1 = 99 / ((arg0 - 23) / 62);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 18)
    public static final void method593(int arg0) {
        field1098++;
        class179.field2911.method1359(arg0 - 31900);
        class79.field1078.method1359(84);
        class27.field395.method1359(arg0 - 31914);
        if (arg0 != 32010) {
            field1115 = (class184) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)V", line = 37)
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1104++;
        int var8 = arg1 + arg4;
        int var9 = arg5 - arg4;
        for (int var10 = arg1; var10 < var8; var10++) {
            class256.method1853(class284.field4402[var10], arg6, arg7, arg0, 0);
        }
        int var11 = arg0 - arg4;
        int var12 = arg4 + arg6;
        for (int var13 = arg5; var13 > var9; var13--) {
            class256.method1853(class284.field4402[var13], arg6, arg7, arg0, 0);
        }
        if (arg2 > -32) {
            field1110 = 123;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class284.field4402[var14];
            class256.method1853(var15, arg6, arg7, var12, 0);
            class256.method1853(var15, var12, arg3, var11, 0);
            class256.method1853(var15, var11, arg7, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V", line = 81)
    public final void method595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1106++;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 89)
    public static void method596(int arg0) {
        if (arg0 != -13048) {
            field1110 = 20;
        }
        field1111 = (int[][]) null;
        field1099 = null;
        field1107 = null;
        field1114 = null;
        field1101 = null;
        field1109 = null;
        field1115 = null;
        field1103 = null;
        field1116 = null;
        field1113 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBIIIII)I", line = 117)
    public static final int method597(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        field1095++;
        if (arg1 != 94) {
            return 22;
        }
        if ((arg2 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 1 + 7 - arg6 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg4;
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "()I", line = 150)
    public final int method397() {
        field1102++;
        return this.field1096;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIJILtk;)V", line = 159)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10) {
        field1094++;
        class89 var13 = class149.method1092((byte) -104, this.field1097).method2213(0, -1, (class55) null, (class281) null, 249, 0, this.field1100);
        if (var13 != null) {
            var13.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1096 = var13.method397();
        }
    }
}
