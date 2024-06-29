import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class253 {

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Z")
    public boolean field3660 = false;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "Leda;")
    public static class116 field3662 = new class116(95, -1);

    @OriginalMember(owner = "client!av", name = "l", descriptor = "Leda;")
    public static class116 field3665 = new class116(54, -2);

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Z")
    public static boolean field3666 = false;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "[I")
    public static int[] field3667 = new int[1024];

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "Lok;")
    public class229 field3659;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILek;I)V")
    private final void method1613(int arg0, class465 arg1, int arg2) {
        if (~arg2 == arg0) {
            this.field3656 = arg1.method2755((byte) -89);
        } else if (arg2 == 2) {
            this.field3657 = arg1.method2714(true);
        } else if (arg2 == 3) {
            this.field3660 = true;
        } else if (arg2 == 4) {
            this.field3656 = -1;
        }
        field3655++;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)Z")
    public final boolean method1614(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field3661++;
            return this.field3659.field3388.method2077(0, this.field3656);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public static void method1615(byte arg0) {
        if (arg0 != 39) {
            method1618(null, (byte) -45);
        }
        field3665 = null;
        field3662 = null;
        field3667 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZILr;)Lf;")
    public final class257 method1616(int arg0, boolean arg1, int arg2, class98 arg3) {
        if (arg0 != 2) {
            this.method1616(-44, true, 117, null);
        }
        field3663++;
        long var5 = (long) ((arg1 ? 262144 : 0) | arg2 << 16 | this.field3656 | arg3.field1463 << 19);
        class257 var7 = (class257) this.field3659.field3399.method941(var5, 0);
        if (var7 != null) {
            return var7;
        } else if (this.field3659.field3388.method2077(arg0 - 2, this.field3656)) {
            class628 var8 = class628.method3550(this.field3659.field3388, this.field3656, 0);
            if (var8 != null) {
                var8.field8937 = var8.field8933 = var8.field8932 = var8.field8935 = 0;
                if (arg1) {
                    var8.method3545();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method3541();
                }
            }
            class257 var10 = arg3.method772(var8, true);
            if (var10 != null) {
                this.field3659.field3399.method949(var5, true, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lek;B)V")
    public final void method1617(class465 arg0, byte arg1) {
        field3658++;
        if (arg1 > -84) {
            field3665 = null;
        }
        while (true) {
            int var3 = arg0.method2705(-70);
            if (var3 == 0) {
                return;
            }
            this.method1613(-2, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lr;B)V")
    public static final void method1618(class98 arg0, byte arg1) {
        if (arg1 != -44) {
            return;
        }
        for (class635 var2 = (class635) class18.field268.method3313((byte) -41); var2 != null; var2 = (class635) class18.field268.method3308(-115)) {
            if (var2.field8992) {
                var2.method3577(arg0);
            }
        }
        field3654++;
    }
}
