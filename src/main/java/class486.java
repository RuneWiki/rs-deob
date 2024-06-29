import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class486 {

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Ltja;")
    private class288 field6779 = new class288(64);

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "Ltja;")
    public class288 field6798 = new class288(50);

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "Liw;")
    public class335 field6799 = new class335(250);

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Lnha;")
    private class342 field6800 = new class342();

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "Lbt;")
    public class48 field6793;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "Z")
    private boolean field6787;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "Leca;")
    private class790 field6803;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "Lbt;")
    private class48 field6794;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public int field6796;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public int field6786;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field6804;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field6801;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
    public static boolean field6780 = false;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "[I")
    public static int[] field6775 = new int[2048];

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "Llja;")
    public static class744 field6783 = new class744(43, 7);

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public int field6802;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method2877(int arg0) {
        field6776++;
        if (arg0 != 50) {
            method2889(false, 40L);
        }
        if (class672.field9218 || class748.field10391 == null) {
            return "";
        } else if ((class748.field10391.field1028 == null || class748.field10391.field1028.length() == 0) && class748.field10391.field1035 != null && class748.field10391.field1035.length() > 0) {
            return class748.field10391.field1035;
        } else {
            return class748.field10391.field1028;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZ)V")
    public final void method2878(boolean arg0, boolean arg1) {
        field6777++;
        if (arg1 != this.field6787 && !arg0) {
            this.field6787 = arg1;
            this.method2881(-1);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lha;IIIILnba;IB)Ltf;")
    public final class312 method2879(class66 arg0, int arg1, int arg2, int arg3, int arg4, class316 arg5, int arg6, byte arg7) {
        if (arg7 <= 118) {
            return null;
        }
        this.field6800.field4289 = arg2;
        this.field6800.field4284 = arg5 != null;
        this.field6800.field4290 = arg6;
        field6795++;
        this.field6800.field4288 = arg0.field904;
        this.field6800.field4285 = arg4;
        this.field6800.field4294 = arg1;
        this.field6800.field4292 = arg3;
        return (class312) this.field6799.method1978(false, this.field6800);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
    public static void method2880(int arg0) {
        field6775 = null;
        if (arg0 != 50) {
            field6780 = false;
        }
        field6783 = null;
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
    public final void method2881(int arg0) {
        field6785++;
        class288 var2 = this.field6779;
        synchronized (this.field6779) {
            this.field6779.method1690(0);
        }
        class288 var3 = this.field6798;
        synchronized (this.field6798) {
            this.field6798.method1690(0);
        }
        if (arg0 == -1) {
            class335 var4 = this.field6799;
            synchronized (this.field6799) {
                this.field6799.method1984((byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lfda;")
    public final class340 method2882(int arg0, int arg1) {
        field6781++;
        class288 var3 = this.field6779;
        class340 var4;
        synchronized (this.field6779) {
            var4 = (class340) this.field6779.method1684((long) arg0, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field6794;
        byte[] var6;
        synchronized (this.field6794) {
            var6 = this.field6794.method437(class667.method3745(arg0, 6), (byte) -81, class778.method4317(arg0, -121));
        }
        class340 var7 = new class340();
        var7.field4253 = arg0;
        var7.field4272 = this;
        var7.field4194 = new String[] { null, null, class637.field8683.method3584(this.field6796, true), null, null };
        var7.field4239 = new String[] { null, null, null, null, class637.field8684.method3584(this.field6796, true) };
        if (var6 != null) {
            var7.method2025(-1, new class403(var6));
        }
        var7.method2018(-129);
        if (var7.field4232 != -1) {
            var7.method2021(31114, this.method2882(var7.field4261, -22087), this.method2882(var7.field4232, -22087));
        }
        if (var7.field4199 != -1) {
            var7.method2013(this.method2882(var7.field4199, -22087), (byte) -121, this.method2882(var7.field4221, -22087));
        }
        if (var7.field4269 != -1) {
            var7.method2019((byte) 93, this.method2882(var7.field4212, -22087), this.method2882(var7.field4269, arg1));
        }
        if (arg1 != -22087) {
            this.method2884(-103);
        }
        if (!this.field6787 && var7.field4227) {
            var7.field4222 = class637.field8680.method3584(this.field6796, true);
            var7.field4210 = false;
            var7.field4194 = this.field6804;
            var7.field4266 = 0;
            var7.field4245 = null;
            var7.field4239 = this.field6801;
            if (var7.field4229 != null) {
                boolean var8 = false;
                for (class379 var9 = var7.field4229.method2119(arg1 ^ 0x560A); var9 != null; var9 = var7.field4229.method2111((byte) -117)) {
                    class613 var10 = this.field6803.method4366(true, (int) var9.field4809);
                    if (var10.field8238) {
                        var9.method2219(13630);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field4229 = null;
                }
            }
        }
        class288 var11 = this.field6779;
        synchronized (this.field6779) {
            this.field6779.method1686(-25638, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V")
    public final void method2883(int arg0, int arg1) {
        class288 var3 = this.field6779;
        synchronized (this.field6779) {
            this.field6779.method1694(arg1, -87);
        }
        field6788++;
        class288 var4 = this.field6798;
        synchronized (this.field6798) {
            this.field6798.method1694(arg1, -96);
        }
        class335 var5 = this.field6799;
        synchronized (this.field6799) {
            this.field6799.method1985((byte) 127, arg1);
        }
        if (arg0 < 12) {
            method2880(-7);
        }
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
    public final void method2884(int arg0) {
        class335 var2 = this.field6799;
        synchronized (this.field6799) {
            if (arg0 != 0) {
                field6791 = -77;
            }
            this.field6799.method1984((byte) -87);
        }
        field6782++;
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
    public final void method2885(int arg0) {
        field6784++;
        class288 var2 = this.field6779;
        synchronized (this.field6779) {
            this.field6779.method1687((byte) 61);
        }
        class288 var3 = this.field6798;
        synchronized (this.field6798) {
            this.field6798.method1687((byte) 61);
            if (arg0 != 9829) {
                field6774 = 25;
            }
        }
        class335 var4 = this.field6799;
        synchronized (this.field6799) {
            this.field6799.method1983(-95);
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(II)V")
    public final void method2886(int arg0, int arg1) {
        field6789++;
        this.field6802 = arg0;
        class288 var3 = this.field6798;
        synchronized (this.field6798) {
            if (arg1 != 36) {
                this.method2886(-66, -15);
            }
            this.field6798.method1690(arg1 - 36);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lda;IZIZIILha;Lnba;Lha;II)Ltf;")
    public final class312 method2887(class67 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, class66 arg7, class316 arg8, class66 arg9, int arg10, int arg11) {
        field6792++;
        class312 var13 = this.method2879(arg7, arg6, arg5, arg10, arg11, arg8, arg1, (byte) 125);
        if (var13 != null) {
            return var13;
        } else if (arg3 == 24248) {
            class340 var14 = this.method2882(arg1, -22087);
            if (arg6 > 1 && var14.field4218 != null) {
                int var15 = -1;
                for (int var16 = 0; var16 < 10; var16++) {
                    if (var14.field4264[var16] <= arg6 && var14.field4264[var16] != 0) {
                        var15 = var14.field4218[var16];
                    }
                }
                if (var15 != -1) {
                    var14 = this.method2882(var15, -22087);
                }
            }
            int[] var17 = var14.method2007(arg0, arg5, arg10, arg7, arg2, arg8, arg11, -2, arg9, arg6);
            if (var17 == null) {
                return null;
            }
            class312 var18;
            if (arg4) {
                var18 = arg9.method623(var17, 32, 1, 36, 36, 0);
            } else {
                var18 = arg7.method623(var17, 32, 1, 36, 36, 0);
            }
            if (!arg4) {
                class342 var19 = new class342();
                var19.field4284 = arg8 != null;
                var19.field4288 = arg7.field904;
                var19.field4294 = arg6;
                var19.field4292 = arg10;
                var19.field4285 = arg11;
                var19.field4289 = arg5;
                var19.field4290 = arg1;
                this.field6799.method1980(1, var19, var18);
            }
            return var18;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public final void method2888(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field6790++;
        class288 var2 = this.field6798;
        synchronized (this.field6798) {
            this.field6798.method1690(0);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method2889(boolean arg0, long arg1) {
        field6778++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class133.field1655[(int) (var7 - arg1 * 37L)]);
            }
            return arg0 ? var6.reverse().toString() : null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lmja;IZLeca;Lbt;Lbt;)V")
    public class486(class441 arg0, int arg1, boolean arg2, class790 arg3, class48 arg4, class48 arg5) {
        this.field6793 = arg5;
        this.field6787 = arg2;
        this.field6803 = arg3;
        this.field6794 = arg4;
        this.field6796 = arg1;
        if (this.field6794 == null) {
            this.field6786 = 0;
        } else {
            int var7 = this.field6794.method445(99) - 1;
            this.field6786 = var7 * 256 + this.field6794.method431(4, var7);
        }
        this.field6804 = new String[] { null, null, class637.field8683.method3584(this.field6796, true), null, null };
        this.field6801 = new String[] { null, null, null, null, class637.field8684.method3584(this.field6796, true) };
    }
}
