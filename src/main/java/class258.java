import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class258 extends class617 {

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    public static int field3249 = 0;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "Llj;")
    public static class60 field3245;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "Lgk;")
    public static class616 field3240;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "Ljava/lang/String;")
    public String field3248;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "[C")
    public char[] field3243;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "[C")
    public char[] field3250;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "[I")
    public int[] field3242;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "[I")
    public int[] field3246;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(CI)I")
    public final int method1527(char arg0, int arg1) {
        if (arg1 != -1) {
            method1532(-124, true);
        }
        field3244++;
        if (this.field3246 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3246.length; var3++) {
            if (this.field3250[var3] == arg0) {
                return this.field3246[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLnp;)V")
    public final void method1528(boolean arg0, class115 arg1) {
        if (arg0) {
            return;
        }
        field3252++;
        while (true) {
            int var3 = arg1.method620((byte) 74);
            if (var3 == 0) {
                return;
            }
            this.method1529(124, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILnp;)V")
    private final void method1529(int arg0, int arg1, class115 arg2) {
        if (arg0 <= 58) {
            this.field3250 = null;
        }
        if (arg1 == 1) {
            this.field3248 = arg2.method626(109);
        } else if (arg1 == 2) {
            int var7 = arg2.method620((byte) 51);
            this.field3250 = new char[var7];
            this.field3246 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3246[var8] = arg2.method643((byte) -77);
                byte var9 = arg2.method657(false);
                this.field3250[var8] = var9 == 0 ? 0 : class161.method876((byte) 7, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method620((byte) -28);
            this.field3243 = new char[var4];
            this.field3242 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3242[var5] = arg2.method643((byte) -77);
                byte var6 = arg2.method657(false);
                this.field3243[var5] = var6 == 0 ? 0 : class161.method876((byte) 120, var6);
            }
        }
        field3253++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3240 = null;
        if (arg0 <= -33) {
            field3245 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(CB)I")
    public final int method1531(char arg0, byte arg1) {
        field3239++;
        if (this.field3242 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = -18 % ((34 - arg1) / 60);
        while (this.field3242.length > var3) {
            if (this.field3243[var3] == arg0) {
                return this.field3242[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)I")
    public static final int method1532(int arg0, boolean arg1) {
        field3247++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg1 ? -97 : var2 + arg0;
    }

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)V")
    public final void method1533(int arg0) {
        if (this.field3242 != null) {
            for (int var2 = 0; var2 < this.field3242.length; var2++) {
                this.field3242[var2] = class422.method2436(this.field3242[var2], 32768);
            }
        }
        field3251++;
        if (this.field3246 != null) {
            for (int var3 = 0; var3 < this.field3246.length; var3++) {
                this.field3246[var3] = class422.method2436(this.field3246[var3], 32768);
            }
        }
        if (arg0 != 32768) {
            this.method1529(-55, -60, null);
        }
    }
}
