import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class348 {

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Z")
    public boolean field4536 = true;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field4543 = -1;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    private int field4532;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Lmw;")
    private class449 field4540;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    private int field4530;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Lap;")
    private class435 field4544;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lfm;")
    private class669 field4538;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lus;")
    private class1 field4545;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "Lkp;")
    private class446 field4533;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lpr;")
    public static class407 field4542 = new class407(60, -1);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 5)
    public static void method1929(byte arg0) {
        if (arg0 != 73) {
            field4542 = null;
        }
        field4542 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLfm;)V", line = 15)
    private final void method1930(int arg0, byte arg1, class669 arg2) {
        field4537++;
        if (arg0 != 0) {
            this.method1934(30436);
            this.field4544.method2388((byte) -100, this.field4533);
            this.field4544.method2364(arg0, 0, 4, (byte) 104, arg2);
            int var4 = 27 % ((39 - arg1) / 54);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[B)V", line = 32)
    public final void method1931(int arg0, int arg1, int arg2, byte[] arg3) {
        this.field4545.method4(arg0 * this.field4544.method2323(arg2 ^ 0xFFFFFF02, arg1), (byte) 5, arg3, arg1);
        field4529++;
        this.method1930(arg0, (byte) -27, this.field4545);
        if (arg2 != 128) {
            this.field4536 = true;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lap;Lmw;Lmh;IIIII)V", line = 208)
    public class348(class435 arg0, class449 arg1, class575 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4532 = arg6;
        this.field4540 = arg1;
        this.field4530 = arg7;
        this.field4544 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field1558 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field8193[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field4541 = var10;
        if (var10 <= 0) {
            this.field4533 = null;
        } else {
            class452 var14 = new class452(var10 * 2);
            if (this.field4544.field6030) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field1558 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field8193[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2537(18244, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field1558 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field8193[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2568((byte) -31, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field4538 = this.field4544.method2381(false, (byte) -76, var14.field6209, var14.field6215, 5123);
            this.field4545 = new class1(this.field4544, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLiaa;)V", line = 67)
    public static final void method1932(int arg0, byte arg1, class452 arg2) {
        field4534++;
        int var3 = 125 % ((11 - arg1) / 34);
        if (class566.field8020 == null) {
            return;
        }
        try {
            class566.field8020.method2985(0L, -124);
            class566.field8020.method2987(24, arg2.field6209, -1, arg0);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 86)
    public final void method1933(byte arg0) {
        field4535++;
        this.method1930(this.field4541, (byte) -45, this.field4538);
        if (arg0 <= 1) {
            this.field4533 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 98)
    private final void method1934(int arg0) {
        field4531++;
        if (!this.field4536) {
            return;
        }
        this.field4536 = false;
        byte[] var2 = this.field4540.field6182;
        byte[] var3 = this.field4544.field6073;
        int var4 = 0;
        int var5 = this.field4540.field6183;
        if (arg0 != 30436) {
            this.field4538 = null;
        }
        int var6 = this.field4532 + (this.field4540.field6183 * this.field4530);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4533 != null && this.field4543 == var4) {
            this.field4536 = false;
            return;
        }
        this.field4543 = var4;
        int var8 = this.field4530 * var5 + this.field4532;
        int var9 = 0;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field4540.field6183 - 128;
        }
        if (this.field4533 == null) {
            this.field4533 = new class446(this.field4544, 3553, 6406, 128, 128, false, this.field4544.field6073, 6406, false);
            this.field4533.method2467(false, false, 44);
            this.field4533.method2233((byte) -99, true);
        } else {
            this.field4533.method2471(this.field4544.field6073, 69, 0, 0, 0, 0, 128, false, 128, 6406);
        }
    }
}
