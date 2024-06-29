import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class355 {

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Llga;")
    private class663 field4714 = new class663(64);

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lsea;")
    private class648 field4715;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "[Z")
    public static boolean[] field4707 = new boolean[100];

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lem;")
    public static class206 field4710 = new class206(117, 3);

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Llh;")
    public static class487 field4718 = new class487(78, 0);

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "J")
    public static long field4713;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Z")
    public static final boolean method2034(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field4719++;
            return (arg0 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IC)Z")
    public static final boolean method2035(int arg0, char arg1) {
        field4711++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (~arg1 != arg0) {
            char[] var2 = class664.field9319;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)V")
    public final void method2036(boolean arg0, int arg1) {
        field4716++;
        class663 var3 = this.field4714;
        synchronized (this.field4714) {
            this.field4714.method3754(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method2037(byte arg0) {
        field4718 = null;
        field4707 = null;
        if (arg0 != -89) {
            field4718 = null;
        }
        field4710 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public final void method2038(int arg0) {
        field4712++;
        if (arg0 < 1) {
            this.method2040((byte) -85);
        }
        class663 var2 = this.field4714;
        synchronized (this.field4714) {
            this.field4714.method3755(19713);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
    public final void method2039(int arg0, int arg1) {
        class663 var3 = this.field4714;
        synchronized (this.field4714) {
            this.field4714.method3749(7648);
            if (arg0 > -67) {
                this.method2040((byte) 6);
            }
            this.field4714 = new class663(arg1);
        }
        field4709++;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
    public final void method2040(byte arg0) {
        field4708++;
        class663 var2 = this.field4714;
        synchronized (this.field4714) {
            this.field4714.method3749(7648);
        }
        if (arg0 != -76) {
            this.field4715 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)Lgga;")
    public final class264 method2041(int arg0, int arg1) {
        field4717++;
        class663 var3 = this.field4714;
        class264 var4;
        synchronized (this.field4714) {
            var4 = (class264) this.field4714.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field4715;
        byte[] var6;
        synchronized (this.field4715) {
            var6 = this.field4715.method3654(-15615, class436.method2497(arg1, -32), class643.method3583(arg1, 1));
        }
        class264 var7 = new class264();
        if (var6 != null) {
            var7.method1610(-1, new class501(var6));
        }
        class663 var8 = this.field4714;
        synchronized (this.field4714) {
            int var9 = 101 % ((18 - arg0) / 57);
            this.field4714.method3748((long) arg1, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class355(class414 arg0, int arg1, class648 arg2) {
        this.field4715 = arg2;
        if (this.field4715 != null) {
            int var4 = this.field4715.method3649((byte) 112) - 1;
            this.field4715.method3653(var4, true);
        }
    }
}
