import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class245 {

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lme;")
    private class668 field3280 = new class668(64);

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field3284 = 0;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lpe;")
    private class615 field3282;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lvd;")
    public static class635 field3273 = new class635("runescape", 0);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "[Z")
    public static boolean[] field3279;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)V")
    public final void method1528(int arg0, byte arg1) {
        class668 var3 = this.field3280;
        synchronized (this.field3280) {
            if (arg1 != 34) {
                this.method1534((byte) 17);
            }
            this.field3280.method3659(-111, arg0);
        }
        field3274++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public final void method1529(byte arg0) {
        if (arg0 != -114) {
            return;
        }
        class668 var2 = this.field3280;
        synchronized (this.field3280) {
            this.field3280.method3658(0);
        }
        field3278++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1530(int arg0, int arg1) {
        class215.field2773 = -1;
        class414.field5328 = 3;
        class513.field6721 = arg0;
        class273.field3599 = 100;
        field3275++;
        if (arg1 != 4) {
            field3273 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIZ)I")
    public static final int method1531(int arg0, int arg1, boolean arg2) {
        field3281++;
        if (arg2) {
            return 0;
        }
        class263 var3 = class265.method1643(false, arg2, arg1);
        if (var3 == null) {
            return class361.field4669.method631(arg1, -110).field2933;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field3523.length; var5++) {
            if (var3.field3523[var5] == -1) {
                var4++;
            }
        }
        if (arg0 > -77) {
            field3279 = null;
        }
        return var4 + class361.field4669.method631(arg1, -113).field2933 - var3.field3523.length;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method1532(byte arg0) {
        if (arg0 != 15) {
            field3279 = null;
        }
        field3273 = null;
        field3279 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)Lgr;")
    public final class612 method1533(boolean arg0, int arg1) {
        field3276++;
        class668 var3 = this.field3280;
        class612 var4;
        synchronized (this.field3280) {
            var4 = (class612) this.field3280.method3655(-119, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field3282;
        byte[] var6;
        synchronized (this.field3282) {
            var6 = this.field3282.method3346(-1, 4, arg1);
        }
        class612 var7 = new class612();
        var7.field8272 = this;
        var7.field8263 = arg1;
        if (var6 != null) {
            var7.method3324(new class418(var6), 0);
        }
        var7.method3319((byte) -11);
        class668 var8 = this.field3280;
        synchronized (this.field3280) {
            this.field3280.method3650((long) arg1, -116, var7);
            if (arg0) {
                this.method1529((byte) -7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public final void method1534(byte arg0) {
        field3283++;
        class668 var2 = this.field3280;
        synchronized (this.field3280) {
            this.field3280.method3656((byte) 0);
        }
        if (arg0 != 37) {
            this.field3282 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lvd;ILpe;)V")
    public class245(class635 arg0, int arg1, class615 arg2) {
        this.field3282 = arg2;
        this.field3277 = this.field3282.method3341(4, -19046);
    }
}
