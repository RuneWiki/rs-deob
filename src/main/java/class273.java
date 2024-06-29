import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class273 {

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Lhm;")
    private class208 field3451 = new class208(64);

    @OriginalMember(owner = "client!tr", name = "s", descriptor = "Lhm;")
    public class208 field3459 = new class208(50);

    @OriginalMember(owner = "client!tr", name = "t", descriptor = "Ljc;")
    public class408 field3460 = new class408(250);

    @OriginalMember(owner = "client!tr", name = "u", descriptor = "Lct;")
    private class135 field3461 = new class135();

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Lkw;")
    private class233 field3463;

    @OriginalMember(owner = "client!tr", name = "r", descriptor = "Lpfa;")
    private class275 field3458;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Lpfa;")
    public class275 field3448;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Z")
    private boolean field3455;

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field3445;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field3462;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field3464;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[I")
    public static int[] field3443 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V")
    public final void method1621(boolean arg0, int arg1) {
        field3454++;
        if (arg1 != 27700) {
            this.method1627(101);
        }
        if (this.field3455 != arg0) {
            this.field3455 = arg0;
            this.method1630(true);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public final void method1622(byte arg0) {
        if (arg0 < 58) {
            return;
        }
        field3450++;
        class408 var2 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2290(-121);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static void method1623(byte arg0) {
        int var1 = -32 % ((arg0 - 33) / 49);
        field3443 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)V")
    public final void method1624(int arg0, int arg1) {
        field3446++;
        class208 var3 = this.field3451;
        synchronized (this.field3451) {
            this.field3451.method1222(14564, arg0);
            if (arg1 != 1) {
                this.method1630(true);
            }
        }
        class208 var4 = this.field3459;
        synchronized (this.field3459) {
            this.field3459.method1222(14564, arg0);
        }
        class408 var5 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2292(23682, arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(II)V")
    public final void method1625(int arg0, int arg1) {
        field3457++;
        this.field3465 = arg1;
        class208 var3 = this.field3459;
        synchronized (this.field3459) {
            this.field3459.method1218(arg0 - 3199);
            if (arg0 != 3305) {
                this.field3459 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)Z")
    public static final boolean method1626(byte arg0, int arg1, int arg2) {
        field3447++;
        if (arg0 >= -32) {
            return false;
        } else if (class569.method3017(arg1, arg2, 0)) {
            return (arg1 & 0xB000) != 0 | class430.method2365(true, arg1, arg2) | class448.method2446(arg1, arg2, 97) ? true : (arg2 & 0x37) == 0 & (class73.method587(arg1, arg2, (byte) 121) | class1.method3(arg2, arg1, (byte) -128));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public final void method1627(int arg0) {
        field3442++;
        if (arg0 == 6) {
            class208 var2 = this.field3459;
            synchronized (this.field3459) {
                this.field3459.method1218(116);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)Loi;")
    public final class68 method1628(int arg0, byte arg1) {
        field3452++;
        class208 var3 = this.field3451;
        class68 var4;
        synchronized (this.field3451) {
            var4 = (class68) this.field3451.method1221((long) arg0, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field3458;
        byte[] var6;
        synchronized (this.field3458) {
            var6 = this.field3458.method1659(97, class92.method682(arg0, 109), class178.method1057(124, arg0));
        }
        class68 var7 = new class68();
        var7.field847 = arg0;
        var7.field832 = this;
        var7.field885 = new String[] { null, null, class671.field9121.method3726((byte) 33, this.field3456), null, null };
        var7.field825 = new String[] { null, null, null, null, class671.field9122.method3726((byte) 120, this.field3456) };
        if (var6 != null) {
            var7.method542(-91, new class572(var6));
        }
        var7.method532(31307);
        if (var7.field861 != -1) {
            var7.method543(1, this.method1628(var7.field838, (byte) -82), this.method1628(var7.field861, (byte) -111));
        }
        if (arg1 > -79) {
            this.field3462 = null;
        }
        if (var7.field890 != -1) {
            var7.method545(this.method1628(var7.field890, (byte) -121), this.method1628(var7.field822, (byte) -80), (byte) 39);
        }
        if (!this.field3455 && var7.field833) {
            var7.field879 = class671.field9119.method3726((byte) 125, this.field3456);
            var7.field875 = 0;
            var7.field885 = this.field3462;
            var7.field862 = false;
            var7.field825 = this.field3464;
            var7.field828 = null;
            if (var7.field857 != null) {
                boolean var8 = false;
                for (class263 var9 = var7.field857.method3830((byte) 75); var9 != null; var9 = var7.field857.method3838((byte) -92)) {
                    class362 var10 = this.field3463.method1403((int) var9.field3321, 64);
                    if (var10.field4643) {
                        var9.method1566(-72);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field857 = null;
                }
            }
        }
        class208 var11 = this.field3451;
        synchronized (this.field3451) {
            this.field3451.method1230((byte) -112, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V")
    public final void method1629(byte arg0) {
        if (arg0 != 83) {
            this.method1624(-76, -69);
        }
        class208 var2 = this.field3451;
        synchronized (this.field3451) {
            this.field3451.method1224(false);
        }
        field3453++;
        class208 var3 = this.field3459;
        synchronized (this.field3459) {
            this.field3459.method1224(false);
        }
        class408 var4 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2295((byte) -80);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public final void method1630(boolean arg0) {
        class208 var2 = this.field3451;
        synchronized (this.field3451) {
            this.field3451.method1218(123);
        }
        field3444++;
        class208 var3 = this.field3459;
        synchronized (this.field3459) {
            this.field3459.method1218(126);
            if (!arg0) {
                this.field3460 = null;
            }
        }
        class408 var4 = this.field3460;
        synchronized (this.field3460) {
            this.field3460.method2290(-91);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZILoa;Loa;ILta;ZIIIILh;)Lxa;")
    public final class468 method1631(boolean arg0, int arg1, class650 arg2, class650 arg3, int arg4, class201 arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, class621 arg11) {
        field3449++;
        class468 var13 = this.method1632(arg9, (byte) -46, arg4, arg7, arg1, arg11, arg10, arg2);
        if (var13 != null) {
            return var13;
        }
        class68 var14 = this.method1628(arg4, (byte) -112);
        if (arg1 > 1 && var14.field842 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg1 >= var14.field836[var16] && var14.field836[var16] != 0) {
                    var15 = var14.field842[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1628(var15, (byte) -86);
            }
        }
        int[] var17 = var14.method540(arg9, arg0, arg2, arg7, arg11, arg1, arg3, arg5, arg10, 0);
        if (var17 == null) {
            return null;
        }
        class468 var18;
        if (arg6) {
            var18 = arg3.method428(var17, 0, 36, 36, 32);
        } else {
            var18 = arg2.method428(var17, 0, 36, 36, 32);
        }
        if (!arg6) {
            class135 var19 = new class135();
            var19.field1642 = arg9;
            var19.field1646 = arg2.field8780;
            var19.field1643 = arg7;
            var19.field1645 = arg10;
            var19.field1648 = arg1;
            var19.field1644 = arg4;
            var19.field1638 = arg11 != null;
            this.field3460.method2291(var19, -16644, var18);
        }
        if (arg8 >= -108) {
            this.method1624(-42, -58);
        }
        return var18;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBIIILh;ILoa;)Lxa;")
    public final class468 method1632(int arg0, byte arg1, int arg2, int arg3, int arg4, class621 arg5, int arg6, class650 arg7) {
        if (arg1 != -46) {
            this.field3445 = -125;
        }
        this.field3461.field1648 = arg4;
        this.field3461.field1645 = arg6;
        this.field3461.field1643 = arg3;
        this.field3461.field1646 = arg7.field8780;
        field3441++;
        this.field3461.field1642 = arg0;
        this.field3461.field1638 = arg5 != null;
        this.field3461.field1644 = arg2;
        return (class468) this.field3460.method2287((byte) -100, this.field3461);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lbs;IZLkw;Lpfa;Lpfa;)V")
    public class273(class643 arg0, int arg1, boolean arg2, class233 arg3, class275 arg4, class275 arg5) {
        this.field3463 = arg3;
        this.field3458 = arg4;
        this.field3448 = arg5;
        this.field3455 = arg2;
        this.field3456 = arg1;
        if (this.field3458 == null) {
            this.field3445 = 0;
        } else {
            int var7 = this.field3458.method1642(113) - 1;
            this.field3445 = this.field3458.method1655(var7, (byte) -82) + var7 * 256;
        }
        this.field3462 = new String[] { null, null, class671.field9121.method3726((byte) 77, this.field3456), null, null };
        this.field3464 = new String[] { null, null, null, null, class671.field9122.method3726((byte) 120, this.field3456) };
    }
}
