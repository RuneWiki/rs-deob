import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class388 {

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    private int field4874 = -1;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    private int field4873 = 0;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    private int field4875 = 128;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    public int field4895 = -1;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "B")
    public byte field4890 = 0;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    private int field4894 = 128;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    private int field4889 = 0;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "Z")
    public boolean field4876 = false;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    private int field4898 = 0;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field4892 = 0;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "Lrga;")
    public static class280 field4886 = new class280(4, 3);

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "Z")
    public static boolean field4897 = false;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    private int field4878;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "Lbea;")
    public class702 field4883;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[S")
    private short[] field4881;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "[S")
    private short[] field4885;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "[S")
    private short[] field4887;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "[S")
    private short[] field4891;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILes;)V")
    public final void method2082(int arg0, class630 arg1) {
        while (true) {
            int var3 = arg1.method3501(arg0 - 9271);
            if (var3 == 0) {
                field4884++;
                if (arg0 != 3) {
                    this.field4889 = -114;
                    return;
                }
                return;
            }
            this.method2083(var3, (byte) 3, arg1);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IBLes;)V")
    private final void method2083(int arg0, byte arg1, class630 arg2) {
        if (arg0 == 1) {
            this.field4878 = arg2.method3470(arg1 + 13108);
        } else if (arg0 == 2) {
            this.field4895 = arg2.method3470(13111);
        } else if (arg0 == 4) {
            this.field4894 = arg2.method3470(13111);
        } else if (arg0 == 5) {
            this.field4875 = arg2.method3470(13111);
        } else if (arg0 == 6) {
            this.field4889 = arg2.method3470(13111);
        } else if (arg0 == 7) {
            this.field4898 = arg2.method3501(-9268);
        } else if (arg0 == 8) {
            this.field4873 = arg2.method3501(-9268);
        } else if (arg0 == 9) {
            this.field4874 = 8224;
            this.field4890 = 3;
        } else if (arg0 == 10) {
            this.field4876 = true;
        } else if (arg0 == 11) {
            this.field4890 = 1;
        } else if (arg0 == 12) {
            this.field4890 = 4;
        } else if (arg0 == 13) {
            this.field4890 = 5;
        } else if (arg0 == 14) {
            this.field4890 = 2;
            this.field4874 = arg2.method3501(-9268) * 256;
        } else if (arg0 == 15) {
            this.field4890 = 3;
            this.field4874 = arg2.method3470(arg1 + 13108);
        } else if (arg0 == 16) {
            this.field4890 = 3;
            this.field4874 = arg2.method3483(77);
        } else if (arg0 == 40) {
            int var4 = arg2.method3501(arg1 - 9271);
            this.field4885 = new short[var4];
            this.field4887 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4887[var5] = (short) arg2.method3470(13111);
                this.field4885[var5] = (short) arg2.method3470(13111);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method3501(-9268);
            this.field4891 = new short[var6];
            this.field4881 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4881[var7] = (short) arg2.method3470(13111);
                this.field4891[var7] = (short) arg2.method3470(13111);
            }
        }
        if (arg1 != 3) {
            this.field4881 = null;
        }
        field4880++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILr;ILhl;III)Lda;")
    public final class474 method2084(int arg0, class566 arg1, int arg2, class322 arg3, int arg4, int arg5, int arg6) {
        field4888++;
        int var8 = -8 % ((arg2 - 31) / 35);
        return this.method2089(0, 0, false, 0, arg0, arg5, arg6, null, (byte) 2, arg4, null, false, arg1, arg3);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lhl;ILr;IIII)Lda;")
    public final class474 method2085(class322 arg0, int arg1, class566 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4896++;
        if (arg1 < 70) {
            this.field4881 = null;
        }
        return this.method2089(0, 0, false, 0, arg3, arg4, arg6, null, (byte) 5, arg5, null, false, arg2, arg0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method2086(int arg0) {
        if (arg0 >= -114) {
            method2088(-117, (byte) 123);
        }
        field4886 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIBLi;IZLi;ILr;Lhl;I)Lda;")
    public final class474 method2087(int arg0, int arg1, int arg2, int arg3, byte arg4, class272 arg5, int arg6, boolean arg7, class272 arg8, int arg9, class566 arg10, class322 arg11, int arg12) {
        if (arg4 != 0) {
            this.method2082(-122, null);
        }
        field4879++;
        return this.method2089(arg12, arg3, arg7, arg0, arg2, arg1, arg9, arg8, (byte) 2, arg6, arg5, false, arg10, arg11);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Z")
    public static final boolean method2088(int arg0, byte arg1) {
        if (arg1 == -59) {
            field4893++;
            return arg0 == 0 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIZIIIILi;BILi;ZLr;Lhl;)Lda;")
    private final class474 method2089(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class272 arg7, byte arg8, int arg9, class272 arg10, boolean arg11, class566 arg12, class322 arg13) {
        field4882++;
        int var15 = arg5;
        class395 var16 = this.field4895 == -1 || arg9 == -1 ? null : arg13.method1844(64, this.field4895);
        boolean var17 = arg2 & this.field4890 != 0;
        if (var16 != null) {
            var15 = arg5 | var16.method2120(1024, arg4, false, arg9);
        }
        if (var17) {
            var15 |= this.field4890 == 3 ? 7 : 2;
        }
        if (arg11) {
            return null;
        }
        if (this.field4875 != 128) {
            var15 |= 0x2;
        }
        if (this.field4894 != 128 || this.field4889 != 0) {
            var15 |= 0x5;
        }
        class450 var18 = this.field4883.field9925;
        class474 var19;
        synchronized (this.field4883.field9925) {
            var19 = (class474) this.field4883.field9925.method2418((long) (this.field4877 |= arg12.field7890 << 29), (byte) 100);
        }
        if (var19 == null || arg12.method998(var19.method764(), var15) != 0) {
            if (var19 != null) {
                var15 = arg12.method1018(var15, var19.method764());
            }
            int var20 = var15;
            if (this.field4887 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4881 != null) {
                var20 |= 0x8000;
            }
            class47 var21 = class156.method893(this.field4878, this.field4883.field9915, 0, arg11);
            if (var21 == null) {
                return null;
            }
            if (var21.field667 < 13) {
                var21.method296((byte) -107, 2);
            }
            var19 = arg12.method1019(var21, var20, this.field4883.field9926, this.field4898 + 64, this.field4873 - -850);
            if (this.field4887 != null) {
                for (int var22 = 0; var22 < this.field4887.length; var22++) {
                    var19.method694(this.field4887[var22], this.field4885[var22]);
                }
            }
            if (this.field4881 != null) {
                for (int var23 = 0; var23 < this.field4881.length; var23++) {
                    var19.method705(this.field4881[var23], this.field4891[var23]);
                }
            }
            var19.method761(var15);
            class450 var24 = this.field4883.field9925;
            synchronized (this.field4883.field9925) {
                this.field4883.field9925.method2409((long) (this.field4877 |= arg12.field7890 << 29), var19, 1);
            }
        }
        class474 var25 = var16 == null ? var19.method711(arg8, var15, true) : var16.method2124(arg8, var19, var15, 7, 0, arg6, arg9, arg4);
        if (this.field4894 != 128 || this.field4875 != 128) {
            var25.method746(this.field4894, this.field4875, this.field4894);
        }
        if (this.field4889 != 0) {
            if (this.field4889 == 90) {
                var25.method722(4096);
            }
            if (this.field4889 == 180) {
                var25.method722(8192);
            }
            if (this.field4889 == 270) {
                var25.method722(12288);
            }
        }
        if (var17) {
            var25.method747(this.field4890, this.field4874, arg10, arg7, arg3, arg1, arg0);
        }
        var25.method761(arg5);
        return var25;
    }
}
