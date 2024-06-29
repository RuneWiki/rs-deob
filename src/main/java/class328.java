import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class328 {

    @OriginalMember(owner = "client!p", name = "d", descriptor = "B")
    public byte field4795 = 0;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private int field4794 = 128;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private int field4792 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public int field4797 = -1;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    private int field4804 = -1;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Z")
    public boolean field4811 = false;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    private int field4803 = 0;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    private int field4813 = 128;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    private int field4816 = 0;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    private int field4801;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lgda;")
    public class157 field4806;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Lpq;")
    public static class159 field4812;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[S")
    private short[] field4793;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[S")
    private short[] field4798;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "[S")
    private short[] field4807;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "[S")
    private short[] field4815;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "[[Lfca;")
    public static class188[][] field4799;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ld;IILwm;IZLd;Loa;IIBZII)Lba;")
    private final class629 method2100(class176 arg0, int arg1, int arg2, class129 arg3, int arg4, boolean arg5, class176 arg6, class689 arg7, int arg8, int arg9, byte arg10, boolean arg11, int arg12, int arg13) {
        field4805++;
        int var15 = arg13;
        class463 var16 = this.field4797 == -1 || arg2 == -1 ? null : arg3.method776(this.field4797, (byte) -98);
        boolean var17 = arg5 & this.field4795 != 0;
        if (var16 != null) {
            var15 = arg13 | var16.method2625(-87, arg9, false, arg2);
        }
        if (var17) {
            var15 |= this.field4795 == 3 ? 7 : 2;
        }
        if (this.field4813 != 128) {
            var15 |= 0x2;
        }
        if (this.field4794 != 128 || this.field4803 != 0) {
            var15 |= 0x5;
        }
        class560 var18 = this.field4806.field1977;
        class629 var19;
        synchronized (this.field4806.field1977) {
            var19 = (class629) this.field4806.field1977.method3134((long) (this.field4796 |= arg7.field9733 << 29), -32);
        }
        if (var19 == null || arg7.method2007(var19.method688(), var15) != 0) {
            if (var19 != null) {
                var15 = arg7.method1987(var15, var19.method688());
            }
            int var20 = var15;
            if (this.field4798 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4793 != null) {
                var20 |= 0x8000;
            }
            class238 var21 = class646.method3591(this.field4806.field1966, this.field4801, 0, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field3136 < 13) {
                var21.method1474(2, (byte) 88);
            }
            var19 = arg7.method1784(var21, var20, this.field4806.field1978, this.field4816 + 64, this.field4792 + 850);
            if (this.field4798 != null) {
                for (int var22 = 0; var22 < this.field4798.length; var22++) {
                    var19.method668(this.field4798[var22], this.field4807[var22]);
                }
            }
            if (this.field4793 != null) {
                for (int var23 = 0; var23 < this.field4793.length; var23++) {
                    var19.method657(this.field4793[var23], this.field4815[var23]);
                }
            }
            var19.method655(var15);
            class560 var24 = this.field4806.field1977;
            synchronized (this.field4806.field1977) {
                this.field4806.field1977.method3130((long) (this.field4796 |= arg7.field9733 << 29), true, var19);
            }
        }
        class629 var25 = var16 == null ? var19.method659(arg10, var15, true) : var16.method2621(var15, false, arg10, var19, arg2, 0, arg9, arg12);
        if (this.field4794 != 128 || this.field4813 != 128) {
            var25.method670(this.field4794, this.field4813, this.field4794);
        }
        if (this.field4803 != 0) {
            if (this.field4803 == 90) {
                var25.method691(4096);
            }
            if (this.field4803 == 180) {
                var25.method691(8192);
            }
            if (this.field4803 == 270) {
                var25.method691(12288);
            }
        }
        if (!arg11) {
            this.field4793 = null;
        }
        if (var17) {
            var25.method674(this.field4795, this.field4804, arg6, arg0, arg1, arg4, arg8);
        }
        var25.method655(arg13);
        return var25;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLdga;)V")
    public final void method2101(byte arg0, class138 arg1) {
        field4808++;
        while (true) {
            int var3 = arg1.method957((byte) -99);
            if (var3 == 0) {
                if (arg0 > -118) {
                    method2102((byte) 54);
                    return;
                } else {
                    return;
                }
            }
            this.method2107(var3, arg1, 40);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method2102(byte arg0) {
        if (arg0 != 74) {
            field4812 = null;
        }
        field4799 = null;
        field4812 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIILoa;Lwm;I)Lba;")
    public final class629 method2103(int arg0, int arg1, int arg2, int arg3, class689 arg4, class129 arg5, int arg6) {
        if (arg6 != 0) {
            this.method2101((byte) 47, null);
        }
        field4800++;
        return this.method2100(null, 0, arg2, arg5, 0, false, null, arg4, 0, arg1, (byte) 2, true, arg0, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLdga;)Ljava/lang/String;")
    public static final String method2104(boolean arg0, class138 arg1) {
        if (arg0) {
            field4812 = null;
        }
        field4809++;
        return class258.method1622(32767, arg1, 0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIBLwm;ILoa;I)Lba;")
    public final class629 method2105(int arg0, int arg1, byte arg2, class129 arg3, int arg4, class689 arg5, int arg6) {
        field4810++;
        if (arg2 != 90) {
            this.field4796 = 33;
        }
        return this.method2100(null, 0, arg4, arg3, 0, false, null, arg5, 0, arg6, (byte) 5, true, arg0, arg1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILwm;ZIIILd;IILd;Loa;II)Lba;")
    public final class629 method2106(int arg0, class129 arg1, boolean arg2, int arg3, int arg4, int arg5, class176 arg6, int arg7, int arg8, class176 arg9, class689 arg10, int arg11, int arg12) {
        field4802++;
        return arg11 > -32 ? null : this.method2100(arg9, arg5, arg12, arg1, arg0, arg2, arg6, arg10, arg7, arg8, (byte) 2, true, arg4, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILdga;I)V")
    private final void method2107(int arg0, class138 arg1, int arg2) {
        if (arg0 == 1) {
            this.field4801 = arg1.method922((byte) -119);
        } else if (arg0 == 2) {
            this.field4797 = arg1.method922((byte) -115);
        } else if (arg0 == 4) {
            this.field4794 = arg1.method922((byte) -116);
        } else if (arg0 == 5) {
            this.field4813 = arg1.method922((byte) -123);
        } else if (arg0 == 6) {
            this.field4803 = arg1.method922((byte) -124);
        } else if (arg0 == 7) {
            this.field4816 = arg1.method957((byte) -71);
        } else if (arg0 == 8) {
            this.field4792 = arg1.method957((byte) -104);
        } else if (arg0 == 9) {
            this.field4804 = 8224;
            this.field4795 = 3;
        } else if (arg0 == 10) {
            this.field4811 = true;
        } else if (arg0 == 11) {
            this.field4795 = 1;
        } else if (arg0 == 12) {
            this.field4795 = 4;
        } else if (arg0 == 13) {
            this.field4795 = 5;
        } else if (arg0 == 14) {
            this.field4795 = 2;
            this.field4804 = arg1.method957((byte) -123) * 256;
        } else if (arg0 == 15) {
            this.field4795 = 3;
            this.field4804 = arg1.method922((byte) -118);
        } else if (arg0 == 16) {
            this.field4795 = 3;
            this.field4804 = arg1.method943(-110);
        } else if (arg0 == 40) {
            int var6 = arg1.method957((byte) -76);
            this.field4798 = new short[var6];
            this.field4807 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4798[var7] = (short) arg1.method922((byte) -118);
                this.field4807[var7] = (short) arg1.method922((byte) -117);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method957((byte) -91);
            this.field4793 = new short[var4];
            this.field4815 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4793[var5] = (short) arg1.method922((byte) -114);
                this.field4815[var5] = (short) arg1.method922((byte) -121);
            }
        }
        if (arg2 == 40) {
            field4814++;
        }
    }
}
