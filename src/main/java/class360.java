import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class360 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lsw;")
    private class641 field4732 = new class641(64);

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Lsw;")
    public class641 field4747 = new class641(50);

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Leb;")
    public class531 field4750 = new class531(250);

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lvda;")
    private class156 field4751 = new class156();

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Lsi;")
    private class478 field4752;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Ldn;")
    private class438 field4731;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Z")
    private boolean field4741;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Ldn;")
    public class438 field4737;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public int field4745;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field4753;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field4754;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4730 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
    public static boolean field4735 = false;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "S")
    public static short field4736 = 1;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public int field4755;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public final void method2018(int arg0) {
        class641 var2 = this.field4732;
        synchronized (this.field4732) {
            this.field4732.method3694(arg0 - 256);
        }
        if (arg0 != 256) {
            method2020(-78);
        }
        field4739++;
        class641 var3 = this.field4747;
        synchronized (this.field4747) {
            this.field4747.method3694(arg0 - 256);
        }
        class531 var4 = this.field4750;
        synchronized (this.field4750) {
            this.field4750.method3039(-120);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public final void method2019(int arg0, int arg1) {
        field4749++;
        this.field4755 = arg1;
        if (arg0 != -19571) {
            this.method2022(-97, -104, null, true, 33, -79, 112, null);
        }
        class641 var3 = this.field4747;
        synchronized (this.field4747) {
            this.field4747.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static void method2020(int arg0) {
        field4730 = null;
        if (arg0 != -27591) {
            method2021(-9, -124, -1, -1, 0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)I")
    public static final int method2021(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            method2020(-43);
        }
        field4729++;
        int var5 = 65536 - class442.field6101[arg4 * 8192 / arg3] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILqa;ZIIILpf;)Lha;")
    public final class52 method2022(int arg0, int arg1, class206 arg2, boolean arg3, int arg4, int arg5, int arg6, class498 arg7) {
        field4734++;
        this.field4751.field1900 = arg2.field2475;
        this.field4751.field1902 = arg4;
        this.field4751.field1896 = arg5;
        this.field4751.field1899 = arg0;
        this.field4751.field1894 = arg6;
        this.field4751.field1901 = arg1;
        this.field4751.field1903 = arg7 != null;
        if (arg3) {
            this.method2027(-100, false);
        }
        return (class52) this.field4750.method3040((byte) 127, this.field4751);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(II)V")
    public final void method2023(int arg0, int arg1) {
        field4744++;
        class641 var3 = this.field4732;
        synchronized (this.field4732) {
            this.field4732.method3686((byte) 53, arg0);
        }
        class641 var4 = this.field4747;
        synchronized (this.field4747) {
            if (arg1 != 64) {
                this.field4752 = null;
            }
            this.field4747.method3686((byte) 53, arg0);
        }
        class531 var5 = this.field4750;
        synchronized (this.field4750) {
            this.field4750.method3035((byte) 79, arg0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public final void method2024(byte arg0) {
        field4746++;
        class531 var2 = this.field4750;
        synchronized (this.field4750) {
            if (arg0 > -89) {
                this.field4737 = null;
            }
            this.field4750.method3034((byte) 41);
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
    public final void method2025(int arg0) {
        field4728++;
        class641 var2 = this.field4732;
        synchronized (this.field4732) {
            this.field4732.method3687(1402);
        }
        class641 var3 = this.field4747;
        synchronized (this.field4747) {
            this.field4747.method3687(1402);
        }
        class531 var4 = this.field4750;
        synchronized (this.field4750) {
            this.field4750.method3034((byte) 41);
            if (arg0 > -83) {
                this.method2019(25, -87);
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Llu;")
    public final class607 method2026(byte arg0, int arg1) {
        field4743++;
        class641 var3 = this.field4732;
        class607 var4;
        synchronized (this.field4732) {
            var4 = (class607) this.field4732.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field4731;
        byte[] var6;
        synchronized (this.field4731) {
            var6 = this.field4731.method2558(100, class253.method1435(arg1, -1), class63.method367(true, arg1));
        }
        class607 var7 = new class607();
        var7.field8747 = this;
        var7.field8807 = arg1;
        var7.field8758 = new String[] { null, null, class36.field284.method987(this.field4745, 22), null, null };
        var7.field8804 = new String[] { null, null, null, null, class115.field1434.method987(this.field4745, 22) };
        if (var6 != null) {
            var7.method3499(new class374(var6), 0);
        }
        var7.method3494(true);
        if (var7.field8820 != -1) {
            var7.method3489(this.method2026((byte) -74, var7.field8757), -66, this.method2026((byte) -76, var7.field8820));
        }
        if (arg0 > -56) {
            this.method2018(91);
        }
        if (var7.field8752 != -1) {
            var7.method3483(5633, this.method2026((byte) -82, var7.field8752), this.method2026((byte) -128, var7.field8765));
        }
        if (!this.field4741 && var7.field8816) {
            var7.field8805 = class493.field6876.method987(this.field4745, 22);
            var7.field8790 = false;
            var7.field8766 = null;
            var7.field8772 = 0;
            var7.field8758 = this.field4753;
            var7.field8804 = this.field4754;
            if (var7.field8756 != null) {
                boolean var8 = false;
                for (class544 var9 = var7.field8756.method2638(false); var9 != null; var9 = var7.field8756.method2641(12089)) {
                    class395 var10 = this.field4752.method2793(11, (int) var9.field7967);
                    if (var10.field5218) {
                        var9.method3187(true);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field8756 = null;
                }
            }
        }
        class641 var11 = this.field4732;
        synchronized (this.field4732) {
            this.field4732.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public final void method2027(int arg0, boolean arg1) {
        field4740++;
        int var3 = 34 / ((arg0 + 32) / 39);
        if (arg1 != this.field4741) {
            this.field4741 = arg1;
            this.method2025(-119);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZBLqa;Lqa;ILra;ZIIILpf;I)Lha;")
    public final class52 method2028(boolean arg0, byte arg1, class206 arg2, class206 arg3, int arg4, class90 arg5, boolean arg6, int arg7, int arg8, int arg9, class498 arg10, int arg11) {
        field4738++;
        class52 var13 = this.method2022(arg7, arg9, arg2, false, arg4, arg8, arg11, arg10);
        if (var13 != null) {
            return var13;
        }
        class607 var14 = this.method2026((byte) -85, arg9);
        if (arg7 > 1 && var14.field8751 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field8779[var16] <= arg7 && var14.field8779[var16] != 0) {
                    var15 = var14.field8751[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2026((byte) -90, var15);
            }
        }
        if (arg1 != 0) {
            return null;
        }
        int[] var17 = var14.method3492(arg3, arg7, arg2, arg6, arg10, arg5, arg8, arg4, arg11, 8921);
        if (var17 == null) {
            return null;
        }
        class52 var18;
        if (arg0) {
            var18 = arg3.method1114(var17, 0, 36, 36, 32);
        } else {
            var18 = arg2.method1114(var17, 0, 36, 36, 32);
        }
        if (!arg0) {
            class156 var19 = new class156();
            var19.field1900 = arg2.field2475;
            var19.field1899 = arg7;
            var19.field1894 = arg11;
            var19.field1901 = arg9;
            var19.field1896 = arg8;
            var19.field1902 = arg4;
            var19.field1903 = arg10 != null;
            this.field4750.method3036(var18, var19, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public final void method2029(int arg0) {
        class641 var2 = this.field4747;
        synchronized (this.field4747) {
            this.field4747.method3687(1402);
        }
        if (arg0 != -29444) {
            this.method2029(110);
        }
        field4748++;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lre;IZLsi;Ldn;Ldn;)V")
    public class360(class515 arg0, int arg1, boolean arg2, class478 arg3, class438 arg4, class438 arg5) {
        this.field4752 = arg3;
        this.field4731 = arg4;
        this.field4741 = arg2;
        this.field4737 = arg5;
        this.field4745 = arg1;
        if (this.field4731 == null) {
            this.field4733 = 0;
        } else {
            int var7 = this.field4731.method2565((byte) 109) - 1;
            this.field4733 = var7 * 256 + this.field4731.method2554(var7, 125);
        }
        this.field4753 = new String[] { null, null, class36.field284.method987(this.field4745, 22), null, null };
        this.field4754 = new String[] { null, null, null, null, class115.field1434.method987(this.field4745, 22) };
    }
}
