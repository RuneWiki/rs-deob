import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class338 {

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lku;")
    private class232 field4927 = new class232(64);

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lku;")
    public class232 field4935 = new class232(50);

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Loo;")
    public class408 field4936 = new class408(250);

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Let;")
    private class387 field4937 = new class387();

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lb;")
    public class201 field4924;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "Lpp;")
    private class245 field4941;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
    private boolean field4913;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lb;")
    private class201 field4911;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "[Ljava/lang/String;")
    private String[] field4940;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field4938;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "J")
    public static long field4917 = -1L;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "[I")
    public static int[] field4929 = new int[64];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Lii;")
    public static class358 field4931;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "[I")
    public static int[] field4934;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)Lda;")
    public final class41 method2129(int arg0, boolean arg1) {
        field4923++;
        class232 var3 = this.field4927;
        class41 var4;
        synchronized (this.field4927) {
            var4 = (class41) this.field4927.method1479(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4911.method1257(class413.method2439(arg0, (byte) -122), class396.method2380(arg0, (byte) -114), 24558);
        class41 var6 = new class41();
        var6.field557 = this;
        var6.field587 = arg0;
        var6.field608 = new String[] { null, null, class418.field5840.method2065(94, this.field4920), null, null };
        var6.field553 = new String[] { null, null, null, null, class69.field863.method2065(-124, this.field4920) };
        if (var5 != null) {
            var6.method263(new class276(var5), 39);
        }
        var6.method271(25416);
        if (var6.field605 != -1) {
            var6.method269(this.method2129(var6.field611, false), this.method2129(var6.field605, false), (byte) 98);
        }
        if (var6.field564 != -1) {
            var6.method279(this.method2129(var6.field564, arg1), this.method2129(var6.field596, false), true);
        }
        if (!this.field4913 && var6.field572) {
            var6.field538 = class298.field4288.method2065(119, this.field4920);
            var6.field608 = this.field4940;
            var6.field553 = this.field4938;
            var6.field598 = 0;
            var6.field549 = false;
            var6.field537 = null;
            if (var6.field561 != null) {
                boolean var7 = false;
                for (class238 var8 = var6.field561.method2769((byte) -69); var8 != null; var8 = var6.field561.method2768((byte) -88)) {
                    class467 var9 = this.field4941.method1541(-43, (int) var8.field3568);
                    if (var9.field6594) {
                        var8.method1510((byte) -13);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field561 = null;
                }
            }
        }
        class232 var10 = this.field4927;
        synchronized (this.field4927) {
            this.field4927.method1473(var6, (long) arg0, 117);
            if (arg1) {
                this.method2133(false);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
    public final void method2130(int arg0, int arg1) {
        field4922++;
        this.field4939 = arg0;
        class232 var3 = this.field4935;
        synchronized (this.field4935) {
            int var4 = 123 % ((arg1 - 16) / 59);
            this.field4935.method1478((byte) -107);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZ)V")
    public final void method2131(byte arg0, boolean arg1) {
        if (arg0 != -104) {
            method2132(66, 76);
        }
        field4916++;
        if (this.field4913 != arg1) {
            this.field4913 = arg1;
            this.method2137(arg0 ^ 0x760D);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
    public static final void method2132(int arg0, int arg1) {
        if (arg0 != 23333) {
            field4928 = -87;
        }
        class305.field4344 = arg1;
        field4921++;
        class204.field3031.method1478((byte) -127);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method2133(boolean arg0) {
        field4926++;
        class408 var2 = this.field4936;
        synchronized (this.field4936) {
            this.field4936.method2410(-1);
            if (!arg0) {
                method2140(-24);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lnp;IIBLcu;III)Ltr;")
    public final class176 method2134(class313 arg0, int arg1, int arg2, byte arg3, class132 arg4, int arg5, int arg6, int arg7) {
        this.field4937.field5489 = arg5;
        this.field4937.field5494 = arg4 != null;
        this.field4937.field5491 = arg6;
        this.field4937.field5496 = arg0.field4429;
        this.field4937.field5495 = arg7;
        this.field4937.field5503 = arg1;
        int var9 = -13 % ((81 - arg3) / 33);
        field4933++;
        this.field4937.field5490 = arg2;
        return (class176) this.field4936.method2418(124, this.field4937);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
    public final void method2135(int arg0, int arg1) {
        class232 var3 = this.field4927;
        synchronized (this.field4927) {
            this.field4927.method1486(438127120, arg1);
        }
        field4930++;
        class232 var4 = this.field4935;
        synchronized (this.field4935) {
            if (arg0 != 6644) {
                field4914 = 67;
            }
            this.field4935.method1486(arg0 ^ 0x1A1D53E4, arg1);
        }
        class408 var5 = this.field4936;
        synchronized (this.field4936) {
            this.field4936.method2415(-76, arg1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
    public final void method2136(boolean arg0) {
        class232 var2 = this.field4927;
        synchronized (this.field4927) {
            this.field4927.method1475(0);
        }
        field4912++;
        class232 var3 = this.field4935;
        synchronized (this.field4935) {
            this.field4935.method1475(0);
        }
        class408 var4 = this.field4936;
        synchronized (this.field4936) {
            if (!arg0) {
                this.method2138(103, -126, (class313) null, true, (class132) null, -102, 112, 61, (class256) null, -103, false, (class313) null);
            }
            this.field4936.method2416(arg0);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method2137(int arg0) {
        class232 var2 = this.field4927;
        synchronized (this.field4927) {
            this.field4927.method1478((byte) -84);
        }
        field4915++;
        class232 var3 = this.field4935;
        synchronized (this.field4935) {
            this.field4935.method1478((byte) -98);
        }
        class408 var4 = this.field4936;
        synchronized (this.field4936) {
            if (arg0 == -30315) {
                this.field4936.method2410(-1);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILnp;ZLcu;IIILoh;IZLnp;)Ltr;")
    public final class176 method2138(int arg0, int arg1, class313 arg2, boolean arg3, class132 arg4, int arg5, int arg6, int arg7, class256 arg8, int arg9, boolean arg10, class313 arg11) {
        field4919++;
        class176 var13 = this.method2134(arg11, arg5, arg0, (byte) -106, arg4, arg6, arg9, arg7);
        if (var13 != null) {
            return var13;
        }
        class41 var14 = this.method2129(arg7, false);
        if (arg5 > 1 && var14.field575 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field544[var16] <= arg5 && var14.field544[var16] != 0) {
                    var15 = var14.field575[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method2129(var15, false);
            }
        }
        int[] var17 = var14.method273(arg11, arg0, arg9, arg8, arg4, arg2, arg5, 1, arg6, arg3);
        if (var17 == null) {
            return null;
        }
        if (arg1 != 32) {
            method2140(75);
        }
        class176 var18;
        if (arg10) {
            var18 = arg2.method651(var17, 0, 36, 36, 32);
        } else {
            var18 = arg11.method651(var17, 0, 36, 36, 32);
        }
        if (!arg10) {
            class387 var19 = new class387();
            var19.field5503 = arg5;
            var19.field5491 = arg9;
            var19.field5490 = arg0;
            var19.field5489 = arg6;
            var19.field5496 = arg11.field4429;
            var19.field5494 = arg4 != null;
            var19.field5495 = arg7;
            this.field4936.method2420(-12698, var18, var19);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V")
    public final void method2139(boolean arg0) {
        field4932++;
        class232 var2 = this.field4935;
        synchronized (this.field4935) {
            this.field4935.method1478((byte) -83);
        }
        if (arg0) {
            this.field4924 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method2140(int arg0) {
        if (arg0 != 36) {
            method2140(64);
        }
        field4929 = null;
        field4934 = null;
        field4931 = null;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lea;IZLpp;Lb;Lb;)V")
    public class338(class353 arg0, int arg1, boolean arg2, class245 arg3, class201 arg4, class201 arg5) {
        this.field4920 = arg1;
        this.field4924 = arg5;
        this.field4941 = arg3;
        this.field4913 = arg2;
        this.field4911 = arg4;
        if (this.field4911 == null) {
            this.field4918 = 0;
        } else {
            int var7 = this.field4911.method1233(-1) - 1;
            this.field4918 = this.field4911.method1235(0, var7) + var7 * 256;
        }
        this.field4940 = new String[] { null, null, class418.field5840.method2065(-115, this.field4920), null, null };
        this.field4938 = new String[] { null, null, null, null, class69.field863.method2065(-96, this.field4920) };
    }
}
