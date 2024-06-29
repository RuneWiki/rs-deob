import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class245 {

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Leda;")
    private class14 field3942 = new class14(128);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Lla;")
    private class422 field3935;

    @OriginalMember(owner = "client!au", name = "f", descriptor = "[I")
    public static int[] field3940 = new int[1];

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Lcb;")
    public static class631 field3944 = new class631(48, -1);

    @OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
    public static boolean field3947 = true;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)Lrc;")
    public final class52 method1697(byte arg0, int arg1) {
        field3941++;
        class14 var3 = this.field3942;
        class52 var4;
        synchronized (this.field3942) {
            var4 = (class52) this.field3942.method80((byte) -50, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field3935;
        byte[] var6;
        synchronized (this.field3935) {
            var6 = this.field3935.method2624(0, 1, arg1);
        }
        if (arg0 >= -77) {
            return null;
        }
        class52 var7 = new class52();
        if (var6 != null) {
            var7.method497(-26879, new class301(var6));
        }
        class14 var8 = this.field3942;
        synchronized (this.field3942) {
            this.field3942.method67((long) arg1, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public final void method1698(byte arg0) {
        field3939++;
        class14 var2 = this.field3942;
        synchronized (this.field3942) {
            if (arg0 > -37) {
                field3948 = -54;
            }
            this.field3942.method71((byte) 44);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ZII)I")
    public static final int method1699(boolean arg0, int arg1, int arg2) {
        field3945++;
        if (arg0) {
            field3937 = -69;
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class245(class292 arg0, int arg1, class422 arg2) {
        this.field3935 = arg2;
        this.field3935.method2615(0, 1);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public static void method1700(boolean arg0) {
        if (arg0) {
            field3940 = null;
            field3944 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
    public final void method1701(int arg0, int arg1) {
        class14 var3 = this.field3942;
        synchronized (this.field3942) {
            if (arg0 != -15728) {
                this.method1701(-42, -107);
            }
            this.field3942.method68(-16878, arg1);
        }
        field3943++;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
    public final void method1702(byte arg0) {
        if (arg0 <= 26) {
            this.method1702((byte) -128);
        }
        class14 var2 = this.field3942;
        synchronized (this.field3942) {
            this.field3942.method76(10);
        }
        field3936++;
    }
}
