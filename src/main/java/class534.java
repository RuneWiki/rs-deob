import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class534 {

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
    public boolean field7487 = false;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "Lbh;")
    private class538 field7491 = new class538(64);

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Lbh;")
    public class538 field7493 = new class538(500);

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Lbh;")
    public class538 field7494 = new class538(30);

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "Lbh;")
    public class538 field7495 = new class538(50);

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lwu;")
    private class557 field7485;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lwu;")
    public class557 field7477;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
    public boolean field7484;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
    public static int[] field7482 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field7496;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "[[[Z")
    public static boolean[][][] field7490;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class49.field728 = arg1;
        field7483++;
        class754.field10480 = arg4;
        class33.field494 = arg3;
        class355.field4563 = arg0;
        class165.field2265 = arg6;
        class492.field6804 = arg2;
        int var7 = -36 / (-arg5 / 53);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V")
    public static final void method3184(boolean arg0, boolean arg1) {
        if (class562.field7995 == null) {
            class24.method135(-86);
        }
        field7480++;
        if (!arg1) {
            field7490 = null;
        }
        if (arg0) {
            class562.field7995.method1573((byte) 69);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final void method3185(int arg0) {
        field7488++;
        class538 var2 = this.field7491;
        synchronized (this.field7491) {
            this.field7491.method3202((byte) 127);
        }
        class538 var3 = this.field7493;
        synchronized (this.field7493) {
            this.field7493.method3202((byte) 127);
        }
        class538 var4 = this.field7494;
        synchronized (this.field7494) {
            this.field7494.method3202((byte) 127);
        }
        if (arg0 == 7183) {
            class538 var5 = this.field7495;
            synchronized (this.field7495) {
                this.field7495.method3202((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
    public final void method3186(byte arg0, int arg1) {
        class538 var3 = this.field7491;
        synchronized (this.field7491) {
            this.field7491.method3204((byte) -117, arg1);
        }
        field7492++;
        class538 var4 = this.field7493;
        synchronized (this.field7493) {
            this.field7493.method3204((byte) 58, arg1);
        }
        class538 var5 = this.field7494;
        synchronized (this.field7494) {
            this.field7494.method3204((byte) -86, arg1);
            if (arg0 >= -29) {
                this.field7495 = null;
            }
        }
        class538 var6 = this.field7495;
        synchronized (this.field7495) {
            this.field7495.method3204((byte) -91, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public final void method3187(int arg0, int arg1) {
        field7479++;
        this.field7491 = new class538(arg1);
        if (arg0 != 50) {
            this.field7493 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lkha;")
    public final class30 method3188(int arg0, byte arg1) {
        field7481++;
        class538 var3 = this.field7491;
        class30 var4;
        synchronized (this.field7491) {
            var4 = (class30) this.field7491.method3200((long) arg0, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field7485;
        byte[] var6;
        synchronized (this.field7485) {
            if (arg1 != -57) {
                this.method3194(false);
            }
            var6 = this.field7485.method3322(class679.method3892(arg0, -7309), class542.method3224(-1, arg0), (byte) 83);
        }
        class30 var7 = new class30();
        var7.field389 = this;
        var7.field442 = arg0;
        if (var6 != null) {
            var7.method223((byte) 46, new class26(var6));
        }
        var7.method227(-16094);
        if (var7.field441) {
            var7.field469 = 0;
            var7.field409 = false;
        }
        if (!this.field7484 && var7.field423) {
            var7.field410 = null;
            var7.field453 = null;
        }
        class538 var8 = this.field7491;
        synchronized (this.field7491) {
            this.field7491.method3199((byte) 78, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
    public final void method3189(int arg0, boolean arg1) {
        this.field7496 = arg0;
        field7489++;
        class538 var3 = this.field7493;
        synchronized (this.field7493) {
            this.field7493.method3210(false);
        }
        class538 var4 = this.field7494;
        synchronized (this.field7494) {
            this.field7494.method3210(false);
            if (!arg1) {
                this.method3186((byte) -63, -24);
            }
        }
        class538 var5 = this.field7495;
        synchronized (this.field7495) {
            this.field7495.method3210(false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IZ)V")
    public final void method3190(int arg0, boolean arg1) {
        if (arg0 != 15) {
            return;
        }
        field7475++;
        if (this.field7487 != arg1) {
            this.field7487 = arg1;
            this.method3194(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static final void method3191(int arg0) {
        class252.field3488.method1385((byte) -97);
        field7486++;
        class122.field1670.method1385((byte) -97);
        if (arg0 != 7) {
            method3191(111);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BZ)V")
    public final void method3192(byte arg0, boolean arg1) {
        if (arg0 <= 94) {
            return;
        }
        field7476++;
        if (arg1 != this.field7484) {
            this.field7484 = arg1;
            this.method3194(true);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public static void method3193(int arg0) {
        field7482 = null;
        field7490 = null;
        if (arg0 != 7) {
            method3183(62, 42, 35, -93, -66, 33, 83);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public final void method3194(boolean arg0) {
        class538 var2 = this.field7491;
        synchronized (this.field7491) {
            this.field7491.method3210(false);
        }
        field7478++;
        class538 var3 = this.field7493;
        synchronized (this.field7493) {
            this.field7493.method3210(false);
            if (!arg0) {
                this.method3189(-80, true);
            }
        }
        class538 var4 = this.field7494;
        synchronized (this.field7494) {
            this.field7494.method3210(false);
        }
        class538 var5 = this.field7495;
        synchronized (this.field7495) {
            this.field7495.method3210(!arg0);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lwj;IZLwu;Lwu;)V")
    public class534(class121 arg0, int arg1, boolean arg2, class557 arg3, class557 arg4) {
        this.field7485 = arg3;
        this.field7477 = arg4;
        this.field7484 = arg2;
        if (this.field7485 != null) {
            int var6 = this.field7485.method3341((byte) 67) - 1;
            this.field7485.method3333(var6, 3443);
        }
    }
}
