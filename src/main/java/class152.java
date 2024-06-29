import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class152 extends class128 {

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "Z")
    public static boolean field2090 = false;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2094 = " is already on your friend list.";

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "[Lsf;")
    public static class115[] field2092 = new class115[14];

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "[I")
    public static int[] field2101;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lp;II)V", line = 5)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field2091++;
        if (arg2 > -85) {
            method1014(-6, -36);
        }
        if (arg1 == 0) {
            this.method1017((byte) -121, arg0.method622((byte) -110));
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)Lpi;", line = 40)
    public static final class325 method1014(int arg0, int arg1) {
        field2099++;
        class325 var2 = (class325) class325.field4978.method1562(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class85.field1095.method1199(28815, arg0, 5);
        class325 var4 = new class325();
        if (var3 != null) {
            var4.method2251(new class107(var3), (byte) 125);
        }
        class325.field4978.method1565((long) arg0, var4, (byte) -110);
        return arg1 < 54 ? (class325) null : var4;
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V", line = 64)
    public static void method1015(int arg0) {
        field2092 = null;
        if (arg0 != 1) {
            field2101 = (int[]) null;
        }
        field2101 = null;
        field2094 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)Z", line = 87)
    public static final boolean method1016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class109.field1491[arg0][var8][var9] == -class208.field2947) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class167.field2324[arg0][arg1][arg3] + arg5;
            if (!class184.method1282(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class184.method1282(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class184.method1282(var10, var12, var14)) {
                return false;
            } else if (class184.method1282(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class99.method600(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class184.method1282(var6 + 1, class167.field2324[arg0][arg1][arg3] + arg5, var7 + 1) && class184.method1282(var6 + 128 - 1, class167.field2324[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class184.method1282(var6 + 128 - 1, class167.field2324[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class184.method1282(var6 + 1, class167.field2324[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 146)
    public class152() {
        this(0);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(BI)V", line = 150)
    private final void method1017(byte arg0, int arg1) {
        this.field2098 = arg1 >> 4 & 0xFF0;
        this.field2096 = (arg1 & 0xFF0000) >> 12;
        if (arg0 == -121) {
            field2102++;
            this.field2097 = (arg1 & 0xFF) << 4;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I", line = 168)
    public final int[][] method102(int arg0, int arg1) {
        field2100++;
        int[][] var3 = this.field1755.method875(75, arg0);
        if (this.field1755.field1815) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class10.field141; var7++) {
                var4[var7] = this.field2096;
                var5[var7] = this.field2098;
                var6[var7] = this.field2097;
            }
        }
        return arg1 == 5110 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I)V", line = 205)
    private class152(int arg0) {
        super(0, false);
        this.method1017((byte) -121, arg0);
    }
}
