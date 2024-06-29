import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class216 {

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    private int field3289 = -1;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
    private int field3294 = 0;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "Lhga;")
    private class158 field3285 = new class158();

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "Z")
    public boolean field3295 = false;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    private int field3280;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "[Lld;")
    private class154[] field3287;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "[[[I")
    private int[][][] field3283;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "Lfu;")
    public static class360 field3281;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLog;BII)V")
    public static final void method1501(byte arg0, class602 arg1, byte arg2, int arg3, int arg4) {
        field3291++;
        int var5 = 114 / ((arg2 + 60) / 58);
        int var6 = arg1.field8787[0];
        int var7 = arg1.field8785[0];
        if (var6 < 0 || class675.field9604 <= var6 || var7 < 0 || class218.field3316 <= var7 || arg4 < 0 || class675.field9604 <= arg4 || arg3 < 0 || class218.field3316 <= arg3) {
            return;
        }
        int var8 = class96.method911(class394.field5761, 0, -4, true, 0, 0, arg3, 0, class223.field3352[arg1.field9814], var7, (byte) -55, arg1.method3446(0), var6, arg4, class47.field1139);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < (var8 - 1); var9++) {
                arg1.method3440(class394.field5761[var9], true, arg0, class47.field1139[var9]);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1502(int arg0) {
        field3292++;
        if (this.field3282 != this.field3280) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 > -27) {
            return null;
        }
        while (var2 < this.field3280) {
            this.field3287[var2] = class325.field4763;
            var2++;
        }
        return this.field3283;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lcm;BLcm;)V")
    public static final void method1503(class678 arg0, byte arg1, class678 arg2) {
        if (arg0.field9625 != null) {
            arg0.method3813(115);
        }
        field3293++;
        arg0.field9625 = arg2;
        arg0.field9624 = arg2.field9624;
        arg0.field9625.field9624 = arg0;
        int var3 = -37 % ((-arg1 - 7) / 57);
        arg0.field9624.field9625 = arg0;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)[[I")
    public final int[][] method1504(int arg0, int arg1) {
        field3288++;
        if (arg1 != -2) {
            this.method1502(46);
        }
        if (this.field3282 == this.field3280) {
            this.field3295 = this.field3287[arg0] == null;
            this.field3287[arg0] = class325.field4763;
            return this.field3283[arg0];
        } else if (this.field3280 == 1) {
            this.field3295 = this.field3289 != arg0;
            this.field3289 = arg0;
            return this.field3283[0];
        } else {
            class154 var3 = this.field3287[arg0];
            if (var3 == null) {
                this.field3295 = true;
                if (this.field3294 < this.field3280) {
                    var3 = new class154(arg0, this.field3294);
                    this.field3294++;
                } else {
                    class154 var4 = (class154) this.field3285.method1221((byte) -121);
                    var3 = new class154(arg0, var4.field2610);
                    this.field3287[var4.field2609] = null;
                    var4.method2588(300);
                }
                this.field3287[arg0] = var3;
            } else {
                this.field3295 = false;
            }
            this.field3285.method1228(var3, (byte) 59);
            return this.field3283[var3.field2610];
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3281 = null;
        if (arg0 != 6940) {
            method1501((byte) -15, null, (byte) 110, 17, 100);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V")
    public final void method1506(byte arg0) {
        if (arg0 != 65) {
            return;
        }
        for (int var2 = 0; var2 < this.field3280; var2++) {
            this.field3283[var2][0] = null;
            this.field3283[var2][1] = null;
            this.field3283[var2][2] = null;
            this.field3283[var2] = null;
        }
        field3290++;
        this.field3283 = null;
        this.field3287 = null;
        this.field3285.method1222((byte) -91);
        this.field3285 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBLpl;)V")
    public static final void method1507(int arg0, byte arg1, class604 arg2) {
        field3284++;
        if (arg2.field8760 != null) {
            int var3 = arg2.field8760[arg0 + 1];
            if (arg2.field8755 != var3) {
                arg2.field8677 = 0;
                arg2.field8780 = arg2.field8779;
                arg2.field8722 = 0;
                arg2.field8755 = var3;
                arg2.field8741 = 0;
                arg2.field8740 = 1;
                if (arg2.field8755 != -1) {
                    class536.method3101(arg2.field8677, (byte) 125, class357.field5338.method2099(arg2.field8755, true), arg2.field9815, arg2.field9806, arg2.field9814, class532.field7456 == arg2);
                }
            }
        }
        if (arg1 != 33) {
            field3281 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lgfa;Z)V")
    public static final void method1508(class697 arg0, boolean arg1) {
        if (!class701.field9863) {
            class242.method1609(arg0, class498.field7099);
        } else if (arg1) {
            class386.field5664[class386.field5664.length - 1].method3715(arg0, -128);
        } else {
            int var2 = class441.method2660(arg0.field9811);
            int var3 = class211.field3239[2] * arg0.method523(true) / arg0.field9808;
            int var4 = class441.method2660(arg0.field9811 - var3);
            int var5 = class441.method2660(arg0.field9811 + var3);
            if (var4 == var5) {
                class386.field5664[var2].method3715(arg0, -122);
            } else if (var5 - var4 == 1) {
                class386.field5664[class202.field3122 + var4].method3715(arg0, -125);
            } else {
                class386.field5664[class386.field5664.length - 1].method3715(arg0, -126);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(III)V")
    public class216(int arg0, int arg1, int arg2) {
        this.field3280 = arg0;
        this.field3282 = arg1;
        this.field3287 = new class154[this.field3282];
        this.field3283 = new int[this.field3280][3][arg2];
    }
}
