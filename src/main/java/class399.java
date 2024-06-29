import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class399 extends class281 {

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    private int field6160;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    private int field6170;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    private int field6165;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "Lui;")
    public static class210 field6164 = new class210(13, 0, 1, 0);

    @OriginalMember(owner = "client!st", name = "F", descriptor = "[I")
    public static int[] field6176 = new int[50];

    @OriginalMember(owner = "client!st", name = "D", descriptor = "Lui;")
    public static class210 field6174 = new class210(0, 2, 2, 1);

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field6159;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    private int field6162;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    private int field6163;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    private int field6168;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!st", name = "B", descriptor = "I")
    private int field6172;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!st", name = "E", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "[B")
    private byte[] field6166;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class399(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6160 = (int) (arg7 * 4096.0F);
        this.field6171 = (int) (arg6 * 4096.0F);
        this.field6165 = this.field6170 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZII)V")
    public static final void method2569(int arg0, boolean arg1, int arg2, int arg3) {
        field6175++;
        int var4 = class612.field8702 + arg2;
        int var5 = class626.field8855 + arg3;
        if (class454.field6818 == null || arg2 < 0 || arg3 < 0 || class275.field4426 <= arg2 || class417.field6374 <= arg3 || !class17.field282.method2089(class497.field7259, -1) && class567.field8141.field9695 != arg0) {
            return;
        }
        long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
        class138 var8 = (class138) class290.field4590.method1558(var6, (byte) -93);
        if (var8 == null) {
            class645.method3736(arg0, arg2, arg3);
            return;
        }
        class559 var9 = (class559) var8.field2332.method3465((byte) 119);
        if (var9 == null) {
            class645.method3736(arg0, arg2, arg3);
            return;
        }
        class211 var10 = (class211) class645.method3736(arg0, arg2, arg3);
        if (var10 == null) {
            var10 = new class211(arg2 << 9, class587.field8346[arg0].method479(arg3, arg2, -111), arg3 << 9, arg0, arg0);
        } else {
            var10.field3531 = var10.field3518 = -1;
        }
        var10.field3510 = var9.field8071;
        var10.field3524 = var9.field8072;
        label61: while (true) {
            class559 var11 = (class559) var8.field2332.method3469(0);
            if (var11 == null) {
                break;
            }
            if (var10.field3524 != var11.field8072) {
                var10.field3531 = var11.field8072;
                var10.field3529 = var11.field8071;
                while (true) {
                    class559 var12 = (class559) var8.field2332.method3469(0);
                    if (var12 == null) {
                        break label61;
                    }
                    if (var10.field3524 != var12.field8072 && var10.field3531 != var12.field8072) {
                        var10.field3522 = var12.field8071;
                        var10.field3518 = var12.field8072;
                    }
                }
            }
        }
        int var13 = class202.method1568((arg2 << 9) + 256, arg0, (arg3 << 9) + 256, 2);
        if (arg1) {
            method2571(false);
        }
        var10.field9703 = (byte) arg0;
        var10.field9701 = var13;
        var10.field9696 = arg2 << 9;
        var10.field9695 = (byte) arg0;
        var10.field3533 = 0;
        var10.field9705 = arg3 << 9;
        if (class437.method2774(true, arg2, arg3)) {
            var10.field9703++;
        }
        class78.method764(arg0, arg2, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZBI)V")
    public void method1273(boolean arg0, byte arg1, int arg2) {
        if (!arg0) {
            this.field6170 = 72;
        }
        this.field6166[arg2] = arg1;
        field6169++;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(III)V")
    public final void method1996(int arg0, int arg1, int arg2) {
        if (arg2 != 255) {
            this.field6160 = -30;
        }
        if (arg1 == 0) {
            this.field6168 = this.field6171 - (arg0 < 0 ? -arg0 : arg0);
            this.field6168 = this.field6168 * this.field6168 >> 12;
            this.field6163 = 4096;
            this.field6172 = this.field6168;
        } else {
            this.field6163 = this.field6168 * this.field6160 >> 12;
            if (this.field6163 < 0) {
                this.field6163 = 0;
            } else if (this.field6163 > 4096) {
                this.field6163 = 4096;
            }
            this.field6168 = this.field6171 - (arg0 < 0 ? -arg0 : arg0);
            this.field6168 = this.field6168 * this.field6168 >> 12;
            this.field6168 = this.field6168 * this.field6163 >> 12;
            this.field6172 += this.field6168 * this.field6165 >> 12;
            this.field6165 = this.field6170 * this.field6165 >> 12;
        }
        field6159++;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
    public static final void method2570(int arg0) {
        field6161++;
        class250.method1783((byte) 36);
        class326.method2199(2, 22050, 2520, class17.field282.field4862);
        class78.field996 = class638.method3703(-1024, class271.field4377, 22050, class402.field6207, 0);
        class258.method1828(true, -97, class333.method2306((byte) -105, null));
        int var1 = 23 % ((arg0 - 19) / 60);
        class253.field4040 = class638.method3703(-1024, class271.field4377, 2048, class402.field6207, 1);
        class253.field4040.method1754(class505.field7381, (byte) 28);
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
    public final void method1999(boolean arg0) {
        this.field6162 = 0;
        field6173++;
        if (arg0) {
            this.field6172 = 0;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public final void method1993(int arg0) {
        this.field6172 >>= 0x4;
        field6167++;
        this.field6165 = this.field6170;
        if (this.field6172 < 0) {
            this.field6172 = 0;
        } else if (this.field6172 > 255) {
            this.field6172 = 255;
        }
        this.method1273(true, (byte) this.field6172, this.field6162++);
        int var2 = 7 / ((arg0 - 12) / 60);
        this.field6172 = 0;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(Z)V")
    public static void method2571(boolean arg0) {
        field6164 = null;
        field6174 = null;
        field6176 = null;
        if (arg0) {
            field6174 = null;
        }
    }
}
