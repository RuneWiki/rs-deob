import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class645 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "Laf;")
    private class39 field9027 = new class39(64);

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Laf;")
    private class39 field9034 = new class39(100);

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lae;")
    private class283 field9033;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lfea;")
    public static class678 field9029 = new class678("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public final void method3693(int arg0, int arg1) {
        field9026++;
        class39 var3 = this.field9027;
        synchronized (this.field9027) {
            this.field9027.method308(-1, arg0);
        }
        class39 var4 = this.field9034;
        synchronized (this.field9034) {
            this.field9034.method308(arg1 ^ 0x7ACA, arg0);
            if (arg1 != -31435) {
                method3698(-31);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)Lg;")
    public final class146 method3694(int arg0, int arg1) {
        field9030++;
        class39 var3 = this.field9034;
        synchronized (this.field9034) {
            class146 var4 = (class146) this.field9034.method312(arg1 ^ arg1, (long) arg0);
            if (var4 == null) {
                var4 = new class146(arg0);
                this.field9034.method305(var4, (long) arg0, arg1 ^ 0x49E6);
            }
            return var4.method970(0) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lgf;")
    public final class73 method3695(int arg0, byte arg1) {
        field9028++;
        if (arg1 >= -105) {
            return null;
        }
        class39 var3 = this.field9027;
        class73 var4;
        synchronized (this.field9027) {
            var4 = (class73) this.field9027.method312(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field9033;
        byte[] var6;
        synchronized (this.field9033) {
            var6 = this.field9033.method1849(class349.method2202(8, arg0), (byte) -103, class383.method2386((byte) 117, arg0));
        }
        class73 var7 = new class73();
        var7.field824 = arg0;
        var7.field795 = this;
        if (var6 != null) {
            var7.method544(new class511(var6), (byte) 26);
        }
        var7.method545(108);
        class39 var8 = this.field9027;
        synchronized (this.field9027) {
            this.field9027.method305(var7, (long) arg0, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public final void method3696(byte arg0) {
        if (arg0 < 75) {
            return;
        }
        field9032++;
        class39 var2 = this.field9027;
        synchronized (this.field9027) {
            this.field9027.method314(-2);
        }
        class39 var3 = this.field9034;
        synchronized (this.field9034) {
            this.field9034.method314(-2);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method3697(int arg0) {
        class39 var2 = this.field9027;
        synchronized (this.field9027) {
            this.field9027.method319(-64);
        }
        field9031++;
        if (arg0 != 11408) {
            this.method3693(-37, -13);
        }
        class39 var3 = this.field9034;
        synchronized (this.field9034) {
            this.field9034.method319(-52);
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public static void method3698(int arg0) {
        int var1 = -31 / ((arg0 + 49) / 61);
        field9029 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljk;ILae;Lae;Lae;)V")
    public class645(class788 arg0, int arg1, class283 arg2, class283 arg3, class283 arg4) {
        this.field9033 = arg2;
        if (this.field9033 != null) {
            int var6 = this.field9033.method1866((byte) 83) - 1;
            this.field9033.method1867(var6, (byte) 49);
        }
        class447.method2713(2, arg3, arg4, true);
    }
}
