import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class300 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public int field4670 = -1;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public int field4673 = -1;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public int field4677 = 8;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "Z")
    public boolean field4684 = true;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Z")
    public boolean field4680 = false;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Z")
    public boolean field4681 = true;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field4676 = 0;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public int field4679 = 1190717;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field4685 = 16;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public int field4672 = 128;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field4675 = 0;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Z")
    public static boolean field4674 = false;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILp;I)V", line = 8)
    public final void method2115(int arg0, class107 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method661(arg0 + 16901);
            if (var4 == 0) {
                field4687++;
                if (arg0 != -16902) {
                    field4675 = 124;
                }
                return;
            }
            this.method2119(var4, arg1, arg2, -95);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILqb;Lhc;IILfc;I)V", line = 48)
    public static final void method2116(int arg0, int arg1, class109 arg2, class184 arg3, int arg4, int arg5, class238 arg6, int arg7) {
        if (arg1 <= 2) {
            field4675 = 50;
        }
        field4682++;
        class298 var8 = new class298();
        var8.field4639 = arg5 * 128;
        var8.field4641 = arg7;
        var8.field4635 = arg0 * 128;
        if (arg6 != null) {
            var8.field4633 = arg6;
            var8.field4652 = arg6.field3561 * 128;
            var8.field4643 = arg6.field3538;
            var8.field4659 = arg6.field3549;
            var8.field4653 = arg6.field3562;
            var8.field4642 = arg6.field3529;
            var8.field4644 = arg6.field3520;
            int var10 = arg6.field3489;
            int var11 = arg6.field3532;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg6.field3532;
                var11 = arg6.field3489;
            }
            var8.field4640 = (arg5 + var10) * 128;
            var8.field4651 = (arg0 + var11) * 128;
            if (arg6.field3525 != null) {
                var8.field4634 = true;
                var8.method2107(12295);
            }
            if (var8.field4659 != null) {
                var8.field4649 = (int) ((double) (var8.field4644 - var8.field4642) * Math.random()) + var8.field4642;
            }
            class68.field895.method2325(var8, (byte) 34);
        } else if (arg3 != null) {
            var8.field4656 = arg3;
            class282 var9 = arg3.field2657;
            if (var9.field4401 != null) {
                var8.field4634 = true;
                var9 = var9.method2021((byte) 22);
            }
            if (var9 != null) {
                var8.field4640 = (arg5 + var9.field4420) * 128;
                var8.field4651 = (arg0 + var9.field4420) * 128;
                var8.field4643 = class142.method945(arg3, false);
                var8.field4652 = var9.field4417 * 128;
                var8.field4653 = var9.field4403;
            }
            class299.field4667.method2325(var8, (byte) 34);
        } else if (arg2 != null) {
            var8.field4636 = arg2;
            var8.field4640 = (arg2.method748(false) + arg5) * 128;
            var8.field4651 = (arg0 + arg2.method748(false)) * 128;
            var8.field4643 = class224.method1547((byte) 117, arg2);
            var8.field4652 = arg2.field1522 * 128;
            var8.field4653 = arg2.field1503;
            class120.field1695.method1541(false, var8, class48.method285((byte) -90, arg2.field1496));
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 150)
    public static final void method2117(byte arg0) {
        field4671++;
        for (int var1 = 0; var1 < 5; var1++) {
            class74.field958[var1] = false;
        }
        class96.field1245 = -1;
        class68.field897 = 0;
        if (arg0 < 101) {
            field4674 = true;
        }
        class113.field1607 = -1;
        class118.field1671 = 5;
        class149.field2066 = 0;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V", line = 178)
    public static final void method2118(boolean arg0) {
        if (arg0) {
            field4686++;
            class7.field96.method1533(9);
            class257.field3906.method491(-118);
            class63.field803.method491(-107);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILp;II)V", line = 204)
    private final void method2119(int arg0, class107 arg1, int arg2, int arg3) {
        if (arg3 > -89) {
            method2118(true);
        }
        field4678++;
        if (arg0 == 1) {
            this.field4676 = class74.method448(arg1.method622((byte) 46), (byte) 121);
        } else if (arg0 == 2) {
            this.field4673 = arg1.method661(-1);
        } else if (arg0 == 3) {
            this.field4673 = arg1.method624(14612);
            if (this.field4673 == 65535) {
                this.field4673 = -1;
            }
        } else if (arg0 == 5) {
            this.field4681 = false;
        } else if (arg0 == 7) {
            this.field4670 = class74.method448(arg1.method622((byte) -123), (byte) 107);
        } else if (arg0 == 8) {
            class243.field3660 = arg2;
        } else if (arg0 == 9) {
            this.field4672 = arg1.method624(14612);
        } else if (arg0 == 10) {
            this.field4684 = false;
        } else if (arg0 == 11) {
            this.field4677 = arg1.method661(-1);
        } else if (arg0 == 12) {
            this.field4680 = true;
        } else if (arg0 == 13) {
            this.field4679 = arg1.method622((byte) -17);
        } else if (arg0 == 14) {
            this.field4685 = arg1.method661(-1);
        }
    }
}
