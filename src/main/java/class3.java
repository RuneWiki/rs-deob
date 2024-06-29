import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "Loo;")
    private class652 field24 = new class652(64);

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lwia;")
    private class791 field23;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "[I")
    public static int[] field25 = new int[5];

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "D")
    public static double field21;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
    public final void method18(byte arg0) {
        field22++;
        class652 var2 = this.field24;
        synchronized (this.field24) {
            if (arg0 != 61) {
                method24(101);
            }
            this.field24.method3743(8);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)Lvfa;")
    public final class699 method19(byte arg0, int arg1) {
        field18++;
        class652 var3 = this.field24;
        class699 var4;
        synchronized (this.field24) {
            var4 = (class699) this.field24.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field23;
        byte[] var6;
        synchronized (this.field23) {
            var6 = this.field23.method4339(arg1, 0, 16);
        }
        int var7 = 110 / ((-arg0 - 13) / 53);
        class699 var8 = new class699();
        if (var6 != null) {
            var8.method3935((byte) 71, new class494(var6));
        }
        class652 var9 = this.field24;
        synchronized (this.field24) {
            this.field24.method3739((long) arg1, (byte) 109, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method20(int arg0, byte[] arg1) {
        field16++;
        if (arg0 != 0) {
            field25 = null;
        }
        return class74.method589(arg1, 0, 0, arg1.length);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
    public final void method21(int arg0, int arg1) {
        class652 var3 = this.field24;
        synchronized (this.field24) {
            this.field24.method3741(arg0, arg1 ^ arg1);
        }
        field19++;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method22(boolean arg0, char arg1, String arg2) {
        field17++;
        int var3 = class736.method4101(arg0, arg2, arg1);
        if (!arg0) {
            field25 = null;
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public final void method23(int arg0) {
        class652 var2 = this.field24;
        synchronized (this.field24) {
            this.field24.method3735(2);
        }
        field20++;
        if (arg0 != 64) {
            this.field15 = 40;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public static void method24(int arg0) {
        field25 = null;
        if (arg0 != 0) {
            method24(87);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class3(class252 arg0, int arg1, class791 arg2) {
        this.field23 = arg2;
        if (this.field23 == null) {
            this.field15 = 0;
        } else {
            this.field15 = this.field23.method4353(16, true);
        }
    }
}
