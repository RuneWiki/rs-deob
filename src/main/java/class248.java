import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class248 extends class69 {

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    private int field4469;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    private int field4464;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private int field4471;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    private int field4472;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
    private int field4467;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    private int field4460;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    private int field4468;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    private int field4459;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field4458 = 0;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field4465 = 0;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "Lcf;")
    public static class93 field4466 = class147.method1066(" ", -48);

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[I")
    public static int[] field4463;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[I")
    public static int[] field4475;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
    public final void method465(int arg0, int arg1, int arg2) {
        if (arg1 > -64) {
            method1687(-20, -21);
        }
        ++field4479;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4469 = arg1;
        this.field4464 = arg4;
        this.field4471 = arg2;
        this.field4472 = arg3;
        this.field4467 = arg7;
        this.field4460 = arg0;
        this.field4468 = arg5;
        this.field4459 = arg6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lhg;IZI)Ldh;")
    public static final class120 method1683(class177 arg0, int arg1, boolean arg2, int arg3) {
        ++field4470;
        if (!class149.method1074(arg3, arg0, 16597, arg1)) {
            return null;
        } else {
            if (arg2) {
                field4475 = null;
            }
            return class188.method1361(-121);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Lnf;")
    public static final class158 method1684(boolean arg0) {
        int var1 = class42.field663[0] * class246.field4435[0];
        ++field4480;
        byte[] var2 = class255.field4614[0];
        if (arg0) {
            method1683((class177) null, 122, true, -6);
        }
        class158 var5;
        if (!class72.field1291[0]) {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; ++var4) {
                var3[var4] = field4475[class58.method333(255, var2[var4])];
            }
            var5 = new class158(class153.field2693, class226.field4044, class169.field2974[0], class67.field1230[0], class246.field4435[0], class42.field663[0], var3);
        } else {
            byte[] var6 = class246.field4439[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; ++var8) {
                var7[var8] = class270.method1797(class58.method333(var6[var8] << 24, -16777216), field4475[class58.method333(var2[var8], 255)]);
            }
            var5 = new class81(class153.field2693, class226.field4044, class169.field2974[0], class67.field1230[0], class246.field4435[0], class42.field663[0], var7);
        }
        class50.method276((byte) 120);
        return var5;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BII)V")
    public final void method467(byte arg0, int arg1, int arg2) {
        int var4 = 63 / ((arg0 - 15) / 49);
        ++field4473;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static void method1685(byte arg0) {
        field4475 = null;
        field4466 = null;
        field4463 = null;
        if (arg0 > -72) {
            method1686(true, 35, 77, -116, -55, true, -54);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZIIIIZI)V")
    public static final void method1686(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        ++field4457;
        if (arg3 != 1) {
            field4458 = -108;
        }
        if (arg2 > arg4) {
            int var7 = (arg4 - -arg2) / 2;
            class288 var8 = class86.field1559[var7];
            int var9 = arg4;
            class86.field1559[var7] = class86.field1559[arg2];
            class86.field1559[arg2] = var8;
            for (int var10 = arg4; ~var10 > ~arg2; ++var10) {
                if (~class213.method1504(class86.field1559[var10], arg1, var8, arg6, 0, arg0, arg5) >= -1) {
                    class288 var11 = class86.field1559[var10];
                    class86.field1559[var10] = class86.field1559[var9];
                    class86.field1559[var9++] = var11;
                }
            }
            class86.field1559[arg2] = class86.field1559[var9];
            class86.field1559[var9] = var8;
            method1686(arg0, arg1, var9 + -1, arg3, arg4, arg5, arg6);
            method1686(arg0, arg1, arg2, arg3, var9 + 1, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1687(int arg0, int arg1) {
        class249 var2 = (class249) class282.field5069.method135((long) arg1, true);
        if (arg0 <= 69) {
            method1685((byte) 50);
        }
        ++field4477;
        if (var2 != null) {
            for (int var3 = 0; ~var2.field4487.length < ~var3; ++var3) {
                var2.field4487[var3] = -1;
                var2.field4494[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method1688(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg2 & 1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg6 & 3;
        ++field4476;
        if (~var8 == -1) {
            return arg0;
        } else if (arg5 != 105) {
            return 71;
        } else if (var8 == 1) {
            return 1 - arg1 + -arg3 + 7;
        } else {
            return ~var8 == -3 ? -arg0 + 7 + -arg4 + 1 : arg3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
    public final void method470(int arg0, int arg1, int arg2) {
        ++field4462;
        int var4 = this.field4460 * arg0 >> 12;
        int var5 = this.field4469 * arg1 >> 12;
        int var6 = this.field4471 * arg0 >> 12;
        if (arg2 != 8) {
            this.field4460 = -17;
        }
        int var7 = this.field4472 * arg1 >> 12;
        int var8 = this.field4467 * arg1 >> 12;
        int var9 = this.field4468 * arg1 >> 12;
        int var10 = this.field4459 * arg0 >> 12;
        int var11 = this.field4464 * arg0 >> 12;
        class101.method730(var7, super.field1253, var11, var8, var6, var4, var10, var5, (byte) 125, var9);
    }
}
