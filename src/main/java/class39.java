import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class39 extends class194 {

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    private int field460 = 204;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    private int field462 = 1;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    private int field465 = 1;

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "Z")
    public static boolean field466 = false;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field463 = null;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class39() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field467;
        int var3 = 91 / ((arg1 - 57) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            for (int var5 = 0; ~class138.field1579 < ~var5; ++var5) {
                int var6 = class277.field3585[var5];
                int var7 = class249.field3283[arg0];
                int var8 = this.field465 * var6 >> 12;
                int var9 = this.field462 * var7 >> 12;
                int var10 = var6 % (4096 / this.field465) * this.field465;
                int var11 = var7 % (4096 / this.field462) * this.field462;
                if (this.field460 > var11) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (~this.field460 < ~var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field460) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (~var12 < -1) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "(I)V")
    public static void method248(int arg0) {
        if (arg0 != 4) {
            field459 = 65;
        }
        field463 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)I")
    public static final int method249(int arg0, boolean arg1) {
        ++field461;
        if (!arg1) {
            return 61;
        } else {
            int var7 = arg0 - 1;
            int var2 = var7 | var7 >>> 1;
            int var3 = var2 | var2 >>> 2;
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIZZ)V")
    public static final void method250(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (!arg4) {
            field466 = false;
        }
        if (~class20.field220 != -1) {
            class237.field3109 = class20.field220;
            class373.method2338(-50, 0);
        } else {
            class102.method615(-107, false);
        }
        ++field455;
        class157.field1829 = arg2;
        class229.field2911 = arg3;
        class395.field5384 = arg1;
        class224.method1383(arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)V")
    public static final void method251(byte arg0, int arg1) {
        ++field464;
        class175.field2025 = arg1;
        class365 var2 = class106.field1272;
        synchronized (class106.field1272) {
            if (arg0 != 63) {
                field466 = false;
            }
            class106.field1272.method2298(0);
        }
        class365 var3 = class363.field4932;
        synchronized (class363.field4932) {
            class363.field4932.method2298(0);
        }
        class365 var4 = class395.field5376;
        synchronized (class395.field5376) {
            class395.field5376.method2298(0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field460 = arg2.method1587((byte) -102);
                }
            } else {
                this.field462 = arg2.method1563(-128);
            }
        } else {
            this.field465 = arg2.method1563(-128);
        }
        ++field458;
        int var5 = 43 % ((52 - arg1) / 61);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method252(String arg0, int arg1) {
        ++field454;
        if (class345.field4693 != null) {
            if (arg1 != 19724) {
                method251((byte) -30, -82);
            }
            ++class394.field5369;
            class427.field5837.method2162(false, 166);
            class427.field5837.method1593(class350.method2229(2, arg0), arg1 + -19841);
            class427.field5837.method1562(-125, arg0);
        }
    }
}
