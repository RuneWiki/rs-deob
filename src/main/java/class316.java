import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class316 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "B")
    public byte field4754 = 0;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    private int field4759 = -1;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private int field4760 = 0;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    private int field4766 = 0;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Z")
    public boolean field4771 = false;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    private int field4774 = 0;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public int field4775 = -1;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    private int field4777 = 128;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    private int field4767 = 128;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lks;")
    public static class305 field4776 = new class305();

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    private int field4757;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lvv;")
    public class215 field4762;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[S")
    private short[] field4758;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[S")
    private short[] field4764;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[S")
    private short[] field4765;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "[S")
    private short[] field4769;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Z")
    public static final boolean method2018(byte arg0) {
        field4763++;
        if (arg0 < 52) {
            method2019(-18);
        }
        return class310.field4662 != class125.field1855 || class417.field6224 >= 2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method2019(int arg0) {
        field4776 = null;
        int var1 = 83 / ((arg0 - 55) / 40);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILjq;ILya;II)Lt;")
    public final class475 method2020(int arg0, int arg1, class357 arg2, int arg3, class38 arg4, int arg5, int arg6) {
        if (arg6 != 8192) {
            this.field4764 = null;
        }
        field4773++;
        return this.method2026(null, false, arg3, arg2, arg0, arg4, 0, null, arg1, arg5, 0, false, 0, (byte) 5);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljq;IIILta;IZIIILta;Lya;I)Lt;")
    public final class475 method2021(class357 arg0, int arg1, int arg2, int arg3, class145 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class145 arg10, class38 arg11, int arg12) {
        int var14 = -122 % ((arg3 + 25) / 57);
        field4753++;
        return this.method2026(arg10, false, arg7, arg0, arg8, arg11, arg9, arg4, arg1, arg12, arg5, arg6, arg2, (byte) 2);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLhp;I)V")
    private final void method2022(byte arg0, class217 arg1, int arg2) {
        int var4 = 85 / ((26 - arg0) / 40);
        field4755++;
        if (arg2 == 1) {
            this.field4757 = arg1.method1511(-85);
        } else if (arg2 == 2) {
            this.field4775 = arg1.method1511(-34);
        } else if (arg2 == 4) {
            this.field4777 = arg1.method1511(-21);
        } else if (arg2 == 5) {
            this.field4767 = arg1.method1511(-107);
        } else if (arg2 == 6) {
            this.field4766 = arg1.method1511(86);
        } else if (arg2 == 7) {
            this.field4760 = arg1.method1515((byte) 124);
        } else if (arg2 == 8) {
            this.field4774 = arg1.method1515((byte) 127);
        } else if (arg2 == 9) {
            this.field4754 = 3;
            this.field4759 = 8224;
        } else if (arg2 == 10) {
            this.field4771 = true;
        } else if (arg2 == 11) {
            this.field4754 = 1;
        } else if (arg2 == 12) {
            this.field4754 = 4;
        } else if (arg2 == 13) {
            this.field4754 = 5;
        } else if (arg2 == 14) {
            this.field4754 = 2;
            this.field4759 = arg1.method1515((byte) 127) * 256;
        } else if (arg2 == 15) {
            this.field4754 = 3;
            this.field4759 = arg1.method1511(77);
        } else if (arg2 == 16) {
            this.field4754 = 3;
            this.field4759 = arg1.method1556(107);
        } else if (arg2 == 40) {
            int var7 = arg1.method1515((byte) 122);
            this.field4764 = new short[var7];
            this.field4765 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4764[var8] = (short) arg1.method1511(-24);
                this.field4765[var8] = (short) arg1.method1511(-85);
            }
        } else if (arg2 == 41) {
            int var5 = arg1.method1515((byte) 127);
            this.field4758 = new short[var5];
            this.field4769 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field4769[var6] = (short) arg1.method1511(99);
                this.field4758[var6] = (short) arg1.method1511(-56);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
    public static final void method2023(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class368.field5403 != null) {
            class368.field5403[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class76.field1100 != null) {
            class76.field1100[arg0][arg1] = (short) arg3;
        }
        if (class182.field2722 != null) {
            class182.field2722[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lhp;I)V")
    public final void method2024(class217 arg0, int arg1) {
        field4761++;
        while (true) {
            int var3 = arg0.method1515((byte) 122);
            if (var3 == 0) {
                if (arg1 == 25568) {
                    return;
                } else {
                    field4776 = null;
                    return;
                }
            }
            this.method2022((byte) -128, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZIILya;Ljq;)Lt;")
    public final class475 method2025(int arg0, int arg1, boolean arg2, int arg3, int arg4, class38 arg5, class357 arg6) {
        if (arg2) {
            field4772++;
            return this.method2026(null, false, arg0, arg6, arg1, arg5, 0, null, arg4, arg3, 0, false, 0, (byte) 2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lta;ZILjq;ILya;ILta;IIIZIB)Lt;")
    private final class475 method2026(class145 arg0, boolean arg1, int arg2, class357 arg3, int arg4, class38 arg5, int arg6, class145 arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12, byte arg13) {
        field4770++;
        int var15 = arg8;
        class189 var16 = this.field4775 == -1 || arg2 == -1 ? null : arg3.method2238(this.field4775, (byte) 78);
        boolean var17 = arg11 & this.field4754 != 0;
        if (var16 != null) {
            var15 = arg8 | var16.method1326(arg2, false, arg9, 123);
        }
        if (var17) {
            var15 |= this.field4754 == 3 ? 7 : 2;
        }
        if (this.field4767 != 128) {
            var15 |= 0x2;
        }
        if (this.field4777 != 128 || this.field4766 != 0) {
            var15 |= 0x5;
        }
        class13 var18 = this.field4762.field3504;
        class475 var19;
        synchronized (this.field4762.field3504) {
            var19 = (class475) this.field4762.field3504.method87((long) (this.field4768 |= arg5.field510 << 29), -2062335807);
        }
        if (var19 == null || arg5.method314(var19.method433(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method317(var15, var19.method433());
            }
            int var20 = var15;
            if (this.field4764 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4769 != null) {
                var20 |= 0x8000;
            }
            class374 var21 = class356.method2233(this.field4757, (byte) -71, 0, this.field4762.field3490);
            if (var21 == null) {
                return null;
            }
            if (var21.field5596 < 13) {
                var21.method2350((byte) -10, 0);
            }
            var19 = arg5.method330(var21, var20, this.field4762.field3505, this.field4760 + 64, this.field4774 + 850);
            if (this.field4764 != null) {
                for (int var22 = 0; var22 < this.field4764.length; var22++) {
                    var19.method436(this.field4764[var22], this.field4765[var22]);
                }
            }
            if (this.field4769 != null) {
                for (int var23 = 0; var23 < this.field4769.length; var23++) {
                    var19.method457(this.field4769[var23], this.field4758[var23]);
                }
            }
            var19.method435(var15);
            class13 var24 = this.field4762.field3504;
            synchronized (this.field4762.field3504) {
                this.field4762.field3504.method84((long) (this.field4768 |= arg5.field510 << 29), var19, (byte) 27);
            }
        }
        if (arg1) {
            return null;
        }
        class475 var25 = var16 == null ? var19.method449(arg13, var15, true) : var16.method1332(var19, 0, 79, arg9, arg13, arg4, var15, arg2);
        if (this.field4777 != 128 || this.field4767 != 128) {
            var25.method424(this.field4777, this.field4767, this.field4777);
        }
        if (this.field4766 != 0) {
            if (this.field4766 == 90) {
                var25.method438(4096);
            }
            if (this.field4766 == 180) {
                var25.method438(8192);
            }
            if (this.field4766 == 270) {
                var25.method438(12288);
            }
        }
        if (var17) {
            var25.method425(this.field4754, this.field4759, arg0, arg7, arg6, arg10, arg12);
        }
        var25.method435(arg8);
        return var25;
    }
}
