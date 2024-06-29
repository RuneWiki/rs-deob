import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class387 {

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "Lau;")
    private class692 field5791 = new class692(64);

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "Lau;")
    public class692 field5798 = new class692(50);

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "Lsi;")
    public class684 field5799 = new class684(250);

    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Lee;")
    private class456 field5800 = new class456();

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lmv;")
    private class295 field5784;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lmv;")
    public class295 field5787;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Z")
    private boolean field5780;

    @OriginalMember(owner = "client!gs", name = "y", descriptor = "Lke;")
    private class247 field5804;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    public int field5793;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public int field5795;

    @OriginalMember(owner = "client!gs", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field5802;

    @OriginalMember(owner = "client!gs", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field5801;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field5782 = -60;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
    public int field5803;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)Lim;", line = 3)
    public final class390 method2382(int arg0, byte arg1) {
        field5789++;
        class692 var3 = this.field5791;
        class390 var4;
        synchronized (this.field5791) {
            var4 = (class390) this.field5791.method3901((long) arg0, -45);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field5784;
        byte[] var6;
        synchronized (this.field5784) {
            if (arg1 != 28) {
                this.field5791 = null;
            }
            var6 = this.field5784.method1844(class403.method2489((byte) -25, arg0), arg1 + 31302, class474.method2726(arg0, arg1 ^ 0xFFFFFF89));
        }
        class390 var7 = new class390();
        var7.field5837 = arg0;
        var7.field5861 = this;
        var7.field5848 = new String[] { null, null, class279.field3632.method1654(106, this.field5793), null, null };
        var7.field5857 = new String[] { null, null, null, null, class279.field3633.method1654(arg1 ^ 0x46, this.field5793) };
        if (var6 != null) {
            var7.method2420(-14, new class540(var6));
        }
        var7.method2416(false);
        if (var7.field5886 != -1) {
            var7.method2415(this.method2382(var7.field5855, (byte) 28), this.method2382(var7.field5886, (byte) 28), (byte) 124);
        }
        if (var7.field5906 != -1) {
            var7.method2408((byte) -116, this.method2382(var7.field5849, (byte) 28), this.method2382(var7.field5906, (byte) 28));
        }
        if (!this.field5780 && var7.field5882) {
            var7.field5869 = class279.field3630.method1654(arg1 + 62, this.field5793);
            var7.field5857 = this.field5801;
            var7.field5871 = false;
            var7.field5848 = this.field5802;
            var7.field5831 = 0;
            var7.field5842 = null;
            if (var7.field5880 != null) {
                boolean var8 = false;
                for (class381 var9 = var7.field5880.method1993(arg1 - 98); var9 != null; var9 = var7.field5880.method1997(arg1 + 9803)) {
                    class278 var10 = this.field5804.method1503(true, (int) var9.field5740);
                    if (var10.field3616) {
                        var9.method2360((byte) 66);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field5880 = null;
                }
            }
        }
        class692 var11 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 88)
    public final void method2383(int arg0) {
        class692 var2 = this.field5798;
        synchronized (this.field5798) {
            this.field5798.method3890(arg0);
            if (arg0 != -1) {
                this.method2384(104);
            }
        }
        field5785++;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 104)
    public final void method2384(int arg0) {
        class684 var2 = this.field5799;
        synchronized (this.field5799) {
            this.field5799.method3837(0);
        }
        if (arg0 <= -63) {
            field5783++;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILrm;Lr;IIIIB)Lf;", line = 117)
    public final class256 method2385(int arg0, class242 arg1, class98 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        this.field5800.field6583 = arg3;
        this.field5800.field6574 = arg2.field1500;
        this.field5800.field6582 = arg1 != null;
        this.field5800.field6584 = arg4;
        field5786++;
        this.field5800.field6581 = arg5;
        this.field5800.field6577 = arg0;
        this.field5800.field6576 = arg6;
        return arg7 < 70 ? null : (class256) this.field5799.method3834(88, this.field5800);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)V", line = 135)
    public final void method2386(int arg0, int arg1) {
        field5794++;
        this.field5803 = arg0;
        if (arg1 == 36) {
            class692 var3 = this.field5798;
            synchronized (this.field5798) {
                this.field5798.method3890(arg1 - 37);
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V", line = 149)
    public final void method2387(int arg0, int arg1) {
        field5781++;
        class692 var3 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method3900(arg1, arg0 + 11);
        }
        class692 var4 = this.field5798;
        synchronized (this.field5798) {
            this.field5798.method3900(arg1, arg0 ^ arg0);
        }
        class684 var5 = this.field5799;
        synchronized (this.field5799) {
            this.field5799.method3836(arg0 - 107, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILjava/io/File;I)[B", line = 165)
    public static final byte[] method2388(int arg0, File arg1, int arg2) {
        field5792++;
        try {
            byte[] var3 = new byte[arg2];
            if (arg0 != -29772) {
                field5782 = 91;
            }
            class183.method1226(arg2, -116, var3, arg1);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILla;BZIILrm;ZLr;ILr;I)Lf;", line = 187)
    public final class256 method2389(int arg0, class393 arg1, byte arg2, boolean arg3, int arg4, int arg5, class242 arg6, boolean arg7, class98 arg8, int arg9, class98 arg10, int arg11) {
        if (arg2 <= 114) {
            this.method2389(54, null, (byte) 50, true, -75, -26, null, true, null, -44, null, -42);
        }
        field5790++;
        class256 var13 = this.method2385(arg11, arg6, arg8, arg5, arg0, arg9, arg4, (byte) 126);
        if (var13 != null) {
            return var13;
        }
        class390 var14 = this.method2382(arg11, (byte) 28);
        if (arg9 > 1 && var14.field5904 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg9 >= var14.field5887[var16] && var14.field5887[var16] != 0) {
                    var15 = var14.field5904[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2382(var15, (byte) 28);
            }
        }
        int[] var17 = var14.method2406((byte) -127, arg8, arg5, arg10, arg0, arg9, arg4, arg1, arg7, arg6);
        if (var17 == null) {
            return null;
        }
        class256 var18;
        if (arg3) {
            var18 = arg10.method704(var17, 0, 36, 36, 32);
        } else {
            var18 = arg8.method704(var17, 0, 36, 36, 32);
        }
        if (!arg3) {
            class456 var19 = new class456();
            var19.field6584 = arg0;
            var19.field6582 = arg6 != null;
            var19.field6574 = arg8.field1500;
            var19.field6583 = arg5;
            var19.field6577 = arg11;
            var19.field6576 = arg4;
            var19.field6581 = arg9;
            this.field5799.method3828((byte) -36, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 256)
    public final void method2390(byte arg0) {
        if (arg0 <= 58) {
            return;
        }
        class692 var2 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method3891(13747);
        }
        field5797++;
        class692 var3 = this.field5798;
        synchronized (this.field5798) {
            this.field5798.method3891(13747);
        }
        class684 var4 = this.field5799;
        synchronized (this.field5799) {
            this.field5799.method3833(-2626);
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)V", line = 275)
    public final void method2391(int arg0) {
        class692 var2 = this.field5791;
        synchronized (this.field5791) {
            this.field5791.method3890(-1);
        }
        field5796++;
        class692 var3 = this.field5798;
        synchronized (this.field5798) {
            this.field5798.method3890(-1);
        }
        class684 var4 = this.field5799;
        synchronized (this.field5799) {
            if (arg0 < 103) {
                this.field5791 = null;
            }
            this.field5799.method3837(0);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZB)V", line = 299)
    public final void method2392(boolean arg0, byte arg1) {
        field5788++;
        if (this.field5780 != arg0) {
            this.field5780 = arg0;
            this.method2391(121);
            int var3 = -79 / ((28 - arg1) / 51);
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lsea;IZLke;Lmv;Lmv;)V", line = 335)
    public class387(class373 arg0, int arg1, boolean arg2, class247 arg3, class295 arg4, class295 arg5) {
        this.field5784 = arg4;
        this.field5787 = arg5;
        this.field5780 = arg2;
        this.field5804 = arg3;
        this.field5793 = arg1;
        if (this.field5784 == null) {
            this.field5795 = 0;
        } else {
            int var7 = this.field5784.method1816(-111) - 1;
            this.field5795 = this.field5784.method1845(var7, true) + var7 * 256;
        }
        this.field5802 = new String[] { null, null, class279.field3632.method1654(-111, this.field5793), null, null };
        this.field5801 = new String[] { null, null, null, null, class279.field3633.method1654(110, this.field5793) };
    }
}
