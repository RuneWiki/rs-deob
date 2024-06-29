import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class621 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lau;")
    private class692 field8994 = new class692(64);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Lmv;")
    public class295 field8988;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lmv;")
    private class295 field8984;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lvg;")
    public static class622 field8987 = new class622(92, 12);

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
    public static boolean field8991 = false;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Z")
    public static boolean field8993 = false;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)Lnm;")
    public final class389 method3574(int arg0, byte arg1) {
        field8985++;
        int var3 = 93 / ((arg1 - 12) / 57);
        class692 var4 = this.field8994;
        class389 var5;
        synchronized (this.field8994) {
            var5 = (class389) this.field8994.method3901((long) arg0, -115);
        }
        if (var5 != null) {
            return var5;
        }
        class295 var6 = this.field8984;
        byte[] var7;
        synchronized (this.field8984) {
            var7 = this.field8984.method1844(3, 31330, arg0);
        }
        class389 var8 = new class389();
        var8.field5814 = this;
        if (var7 != null) {
            var8.method2399(new class540(var7), true);
        }
        class692 var9 = this.field8994;
        synchronized (this.field8994) {
            this.field8994.method3894(var8, (byte) 60, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(IB)V")
    public final void method3575(int arg0, byte arg1) {
        field8995++;
        if (arg1 != -71) {
            this.method3576((byte) 36);
        }
        class692 var3 = this.field8994;
        synchronized (this.field8994) {
            this.field8994.method3900(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public final void method3576(byte arg0) {
        field8992++;
        class692 var2 = this.field8994;
        synchronized (this.field8994) {
            this.field8994.method3890(-1);
            if (arg0 > -76) {
                this.method3575(119, (byte) 125);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method3577(boolean arg0) {
        field8987 = null;
        if (!arg0) {
            method3577(true);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZBI)I")
    public static final int method3578(boolean arg0, byte arg1, int arg2) {
        if (arg1 != 106) {
            field8993 = false;
        }
        field8986++;
        if (arg0) {
            return 0;
        }
        class15 var3 = class262.method1577((byte) -17, arg2, arg0);
        if (var3 == null) {
            return class613.field8826.method3087(25, arg2).field5470;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field330.length; var5++) {
            if (var3.field330[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class613.field8826.method3087(25, arg2).field5470 - var3.field330.length);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public final void method3579(int arg0) {
        int var2 = -6 / ((62 - arg0) / 34);
        field8983++;
        class692 var3 = this.field8994;
        synchronized (this.field8994) {
            this.field8994.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILkn;)V")
    public static final void method3580(int arg0, int arg1, int arg2, int arg3, class306 arg4) {
        class44 var5 = class471.method2715(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field7895 = (arg1 << class125.field1831) + class41.field615;
        arg4.field7894 = arg3;
        arg4.field7896 = (arg2 << class125.field1831) + class41.field615;
        if (var5.field672 != null) {
            arg4.field7894 -= var5.field672.field7270;
        }
        var5.field673 = arg4;
        int var6 = class383.field5753 == class178.field2480 ? 1 : 0;
        if (arg4.method270(-44)) {
            if (arg4.method274(-1510217528)) {
                class403.field6051[var6][class48.field760[var6]++] = arg4;
                return;
            }
            class313.field4591[var6][class311.field4576[var6]++] = arg4;
            return;
        }
        class153.field2152[var6][class464.field6700[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;IIJIBLjava/lang/String;ZIIZ)V")
    public static final void method3581(String arg0, int arg1, int arg2, long arg3, int arg4, byte arg5, String arg6, boolean arg7, int arg8, int arg9, boolean arg10) {
        field8989++;
        if (class683.field9638 || class373.field5520 >= 500) {
            return;
        }
        if (arg5 < 126) {
            method3578(true, (byte) -72, -1);
        }
        int var12 = arg9 == -1 ? class222.field2943 : arg9;
        class426 var13 = new class426(arg0, arg6, var12, arg2, arg8, arg3, arg4, arg1, arg10, arg7);
        class152.field2150.method1909(var13, (byte) -81);
        class373.field5520++;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lsea;ILmv;Lmv;)V")
    public class621(class373 arg0, int arg1, class295 arg2, class295 arg3) {
        this.field8988 = arg3;
        this.field8984 = arg2;
        this.field8984.method1845(3, true);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)[I")
    public static final int[] method3582(int arg0) {
        if (arg0 != 0) {
            method3580(-52, -50, -62, -88, null);
        }
        field8990++;
        return new int[] { class627.field9101, class410.field6111, class63.field1003 };
    }
}
