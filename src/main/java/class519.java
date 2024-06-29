import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class519 {

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "Lfc;")
    public class262 field6984 = new class262(20);

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "Lfc;")
    private class262 field6992 = new class262(64);

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Lni;")
    private class522 field6981;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lni;")
    public class522 field6988;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Llga;")
    public static class712 field6980 = new class712(64, 3);

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "Lmv;")
    public static class377 field6987;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "[I")
    public static int[] field6991;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IB)V")
    public final void method2856(int arg0, byte arg1) {
        class262 var3 = this.field6992;
        synchronized (this.field6992) {
            this.field6992.method1569((byte) 62, arg0);
        }
        field6990++;
        if (arg1 != 126) {
            field6991 = null;
        }
        class262 var4 = this.field6984;
        synchronized (this.field6984) {
            this.field6984.method1569((byte) 62, arg0);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)[I")
    public static final int[] method2857(int arg0) {
        field6986++;
        if (arg0 > -88) {
            method2860(49);
        }
        return new int[] { class535.field7255, class476.field6584, class305.field4129 };
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V")
    public final void method2858(int arg0) {
        class262 var2 = this.field6992;
        synchronized (this.field6992) {
            this.field6992.method1575((byte) -104);
        }
        field6985++;
        class262 var3 = this.field6984;
        synchronized (this.field6984) {
            this.field6984.method1575((byte) 49);
        }
        if (arg0 != 0) {
            this.method2856(66, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lfj;")
    public final class656 method2859(int arg0, int arg1) {
        field6982++;
        class262 var3 = this.field6992;
        class656 var5;
        synchronized (this.field6992) {
            int var4 = -98 % ((arg0 - 32) / 44);
            var5 = (class656) this.field6992.method1571(-120, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class522 var6 = this.field6981;
        byte[] var7;
        synchronized (this.field6981) {
            var7 = this.field6981.method2885(arg1, 46, false);
        }
        class656 var8 = new class656();
        var8.field9157 = this;
        if (var7 != null) {
            var8.method3720(new class611(var7), -1);
        }
        class262 var9 = this.field6992;
        synchronized (this.field6992) {
            this.field6992.method1574((long) arg1, var8, (byte) -80);
            return var8;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
    public static final void method2860(int arg0) {
        if (arg0 != 30574) {
            field6991 = null;
        }
        field6983++;
        class427.field6032 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class420.field5891[var1] = null;
            class422.field5906[var1] = 1;
            class635.field8830[var1] = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public static void method2861(byte arg0) {
        field6980 = null;
        if (arg0 != -10) {
            method2861((byte) -3);
        }
        field6987 = null;
        field6991 = null;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
    public final void method2862(byte arg0) {
        field6989++;
        class262 var2 = this.field6992;
        synchronized (this.field6992) {
            if (arg0 > -34) {
                this.method2858(-47);
            }
            this.field6992.method1563(95);
        }
        class262 var3 = this.field6984;
        synchronized (this.field6984) {
            this.field6984.method1563(94);
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method2863(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        field6979++;
        int var7 = arg2 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg6 - (1 - arg4)) / arg4);
        int var10 = -((arg2 + arg4 - 1) / arg4);
        if (arg5 != 14849) {
            field6980 = null;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg3[arg0] == 0) {
                    return true;
                }
                arg0 += arg4;
            }
            int var13 = arg0 - var8;
            if (arg3[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg1 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lrga;ILni;Lni;)V")
    public class519(class242 arg0, int arg1, class522 arg2, class522 arg3) {
        this.field6981 = arg2;
        this.field6988 = arg3;
        this.field6981.method2901(0, 46);
    }
}
