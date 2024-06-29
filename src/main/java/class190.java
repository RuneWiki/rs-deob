import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class190 implements class201 {

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    private int field3850 = 128;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    private int field3861 = 50;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Ljc;")
    private class85 field3856;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Ljc;")
    private class85 field3853;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lch;")
    private class29 field3847;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lgg;")
    public static class63 field3855 = class116.method911(43, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[I")
    public static int[] field3862 = new int[1000];

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Lch;")
    public static class29 field3857 = new class29(64);

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
    public static boolean field3866 = false;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "Lgg;")
    public static class63 field3870 = class116.method911(43, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Lgg;")
    private static class63 field3865 = class116.method911(43, "glow3:");

    @OriginalMember(owner = "client!va", name = "A", descriptor = "Lgg;")
    public static class63 field3869 = field3865;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Z")
    public static boolean field3871 = false;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "Lgg;")
    public static class63 field3873 = class116.method911(43, "VOLL");

    @OriginalMember(owner = "client!va", name = "u", descriptor = "[[B")
    public static byte[][] field3863 = new byte[1000][];

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lgg;")
    public static class63 field3867 = field3865;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lgg;")
    private static class63 field3874 = class116.method911(43, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lgg;")
    public static class63 field3864 = field3874;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Ljc;")
    public static class85 field3872;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "[I")
    public static int[] field3868;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "[I")
    public static int[] field3875;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
    public final void method1247(int arg0, boolean arg1) {
        field3858++;
        class55 var3 = (class55) this.field3847.method287((byte) -107);
        if (arg1) {
            field3863 = null;
        }
        while (var3 != null) {
            if (var3.field1465) {
                var3.method540((byte) -70, arg0);
                var3.field1465 = false;
            }
            var3 = (class55) this.field3847.method284(-20164);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public final void method1248(int arg0) {
        this.field3847 = new class29(this.field3861);
        field3851++;
        int var2 = -109 % ((arg0 - 5) / 60);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)Lfg;")
    private final class55 method1249(byte arg0, int arg1) {
        field3852++;
        class55 var3 = (class55) this.field3847.method289((long) arg1, -130079263);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3853.method745(0, arg1, 0);
        if (arg0 <= 29) {
            field3855 = null;
        }
        if (var4 == null) {
            return class184.method1212((byte) 112);
        } else {
            class3 var5 = new class3(var4);
            class55 var6 = new class55(var5);
            this.field3847.method293(false, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Z")
    public final boolean method1250(int arg0, int arg1) {
        if (arg0 != -15187) {
            this.method1248(-109);
        }
        field3843++;
        return this.method1249((byte) 116, arg1).field1463;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)Z")
    public final boolean method1251(int arg0, int arg1) {
        field3845++;
        if (arg0 < 67) {
            this.method1247(-64, false);
        }
        return this.method1249((byte) 76, arg1).field1447;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)Z")
    public final boolean method1252(int arg0, byte arg1) {
        int var3 = -17 / ((arg1 - 31) / 58);
        field3846++;
        return this.method1249((byte) 97, arg0).method541(this.field3856, this, 0);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IB)Z")
    public final boolean method1253(int arg0, byte arg1) {
        if (arg1 >= -80) {
            return true;
        } else {
            field3849++;
            return this.field3850 == 64 || this.method1249((byte) 107, arg0).field1453 == 64;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
    public final int method1254(int arg0, int arg1) {
        field3844++;
        return arg0 == 12411 ? this.method1249((byte) 32, arg1).field1459 : 96;
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(IB)[I")
    public final int[] method1255(int arg0, byte arg1) {
        if (arg1 >= -11) {
            field3864 = null;
        }
        field3859++;
        class3 var3 = new class3(this.field3853.method745(0, arg0, 0));
        class55 var4 = new class55(var3);
        return var4.method545(this.field3850, this, this.field3856, -6);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(FII)[I")
    public final int[] method1256(float arg0, int arg1, int arg2) {
        if (arg1 > -39) {
            this.method1249((byte) -25, -42);
        }
        class55 var4 = this.method1249((byte) 77, arg2);
        field3860++;
        var4.field1465 = true;
        return var4.method544(-1, this.field3850, arg0, this, this.field3856);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method1257(boolean arg0) {
        field3855 = null;
        field3875 = null;
        field3872 = null;
        field3863 = null;
        field3864 = null;
        field3857 = null;
        field3874 = null;
        field3867 = null;
        field3870 = null;
        field3865 = null;
        field3862 = null;
        if (arg0) {
            method1257(true);
        }
        field3868 = null;
        field3869 = null;
        field3873 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljc;Ljc;II)V")
    public class190(class85 arg0, class85 arg1, int arg2, int arg3) {
        this.field3850 = arg3;
        this.field3856 = arg1;
        this.field3861 = arg2;
        this.field3853 = arg0;
        this.field3847 = new class29(this.field3861);
    }
}
