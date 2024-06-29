import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class16 {

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lpja;")
    private class43 field236 = new class43(64);

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Lgj;")
    private class662 field238;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Ll;")
    public class20 field241;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "[[F")
    public static float[][] field234 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lfja;")
    public static class783 field227 = new class783(103, -1);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Lkc;")
    public static class145 field239;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
    public static final int method88(int arg0) {
        field233++;
        if (arg0 != 6148) {
            method91(-33, (byte) -24, 127);
        }
        return class488.field6587;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)V")
    public final void method89(byte arg0, int arg1) {
        class43 var3 = this.field236;
        synchronized (this.field236) {
            if (arg0 != 1) {
                this.method96(35);
            }
            this.field236.method265(arg1, arg0 - 60);
        }
        field235++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public final void method90(byte arg0) {
        class43 var2 = this.field236;
        synchronized (this.field236) {
            if (arg0 != 16) {
                field239 = null;
            }
            this.field236.method273(127);
        }
        field237++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBI)I")
    public static final int method91(int arg0, byte arg1, int arg2) {
        field229++;
        int var3 = arg0 >>> 31;
        if (arg1 != -119) {
            field227 = null;
        }
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Luca;")
    public final class540 method92(int arg0, byte arg1) {
        field228++;
        class43 var3 = this.field236;
        class540 var4;
        synchronized (this.field236) {
            var4 = (class540) this.field236.method266((byte) -98, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class662 var5 = this.field238;
        byte[] var6;
        synchronized (this.field238) {
            var6 = this.field238.method3732(arg0, arg1 ^ 0x22CC, 32);
        }
        class540 var7 = new class540();
        var7.field7364 = this;
        if (var6 != null) {
            var7.method3051(new class93(var6), -122);
        }
        if (arg1 != 6) {
            this.method96(-75);
        }
        class43 var8 = this.field236;
        synchronized (this.field236) {
            this.field236.method270(var7, (long) arg0, -126);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method93(byte arg0, String arg1) {
        field240++;
        if (arg0 < 114) {
            return null;
        }
        String var2 = class774.method4257(37, class146.method1176(arg1, (byte) -41));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZ)V")
    public static final void method94(int arg0, boolean arg1) {
        field226++;
        if (!class659.method3706(126, arg0)) {
            return;
        }
        class17[] var2 = class431.field5870[arg0];
        if (!arg1) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class17 var4 = var2[var3];
            if (var4 != null) {
                var4.field247 = 1;
                var4.field375 = 0;
                var4.field374 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZIIIII)V")
    public static final void method95(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field232++;
        if (class111.field1911.field6762.method925((byte) 121) != 0 && arg1 != 0 && class57.field806 < 50 && arg2 != -1) {
            class531.field7189[class57.field806++] = new class481((byte) 1, arg2, arg1, arg3, arg4, 0, arg5, null);
        }
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public final void method96(int arg0) {
        field230++;
        class43 var2 = this.field236;
        synchronized (this.field236) {
            if (arg0 != 64) {
                this.field238 = null;
            }
            this.field236.method272(20);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB[BIII)V")
    public static final void method97(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -97) {
            return;
        }
        field231++;
        if (arg5 <= arg4) {
            return;
        }
        int var6 = arg5 - arg4 >> 2;
        int var7 = arg3 + arg4;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg4 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg2[var7++] = 1;
                }
            }
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
            arg2[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
    public static void method98(byte arg0) {
        field234 = null;
        field239 = null;
        if (arg0 > 76) {
            field227 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lim;ILgj;Ll;)V")
    public class16(class598 arg0, int arg1, class662 arg2, class20 arg3) {
        this.field238 = arg2;
        this.field238.method3730((byte) 77, 32);
        this.field241 = arg3;
    }
}
