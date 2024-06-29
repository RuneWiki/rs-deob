import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class749 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "Ltja;")
    private class288 field10392 = new class288(64);

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lbt;")
    private class48 field10396;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Ldj;")
    public static class362 field10399 = new class362(8);

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Llja;")
    public static class744 field10400 = new class744(71, 2);

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 3)
    public final void method4181(int arg0, int arg1) {
        if (arg0 >= -75) {
            field10400 = null;
        }
        class288 var3 = this.field10392;
        synchronized (this.field10392) {
            this.field10392.method1694(arg1, -28);
        }
        field10398++;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Lfga;", line = 19)
    public final class270 method4182(int arg0, int arg1) {
        field10393++;
        class288 var3 = this.field10392;
        class270 var4;
        synchronized (this.field10392) {
            var4 = (class270) this.field10392.method1684((long) arg0, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field10396;
        byte[] var6;
        synchronized (this.field10396) {
            var6 = this.field10396.method437(class291.method1701(arg0, 126), (byte) -23, class66.method575((byte) 48, arg0));
        }
        class270 var7 = new class270();
        if (var6 != null) {
            var7.method1596(-1, new class403(var6));
        }
        class288 var8 = this.field10392;
        synchronized (this.field10392) {
            if (arg1 < 58) {
                this.field10396 = null;
            }
            this.field10392.method1686(-25638, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V", line = 55)
    public final void method4183(int arg0, int arg1) {
        class288 var3 = this.field10392;
        synchronized (this.field10392) {
            this.field10392.method1690(0);
            this.field10392 = new class288(arg1);
        }
        field10395++;
        if (arg0 != 64) {
            this.method4185(false);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 69)
    public final void method4184(int arg0) {
        if (arg0 >= -57) {
            return;
        }
        field10397++;
        class288 var2 = this.field10392;
        synchronized (this.field10392) {
            this.field10392.method1690(0);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 83)
    public final void method4185(boolean arg0) {
        class288 var2 = this.field10392;
        synchronized (this.field10392) {
            if (arg0) {
                this.method4181(26, 11);
            }
            this.field10392.method1687((byte) 61);
        }
        field10394++;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 120)
    public class749(class441 arg0, int arg1, class48 arg2) {
        this.field10396 = arg2;
        if (this.field10396 != null) {
            int var4 = this.field10396.method445(75) - 1;
            this.field10396.method431(4, var4);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 107)
    public static void method4186(int arg0) {
        field10400 = null;
        if (arg0 != -1) {
            method4186(49);
        }
        field10399 = null;
    }
}
