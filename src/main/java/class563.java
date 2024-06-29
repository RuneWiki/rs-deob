import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class563 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lqc;")
    private class325 field8347 = new class325(64);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Ldda;")
    private class597 field8343;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lqc;")
    public static class325 field8344 = new class325(64);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lel;", line = 7)
    public final class173 method3290(int arg0, int arg1) {
        field8345++;
        class325 var3 = this.field8347;
        class173 var4;
        synchronized (this.field8347) {
            var4 = (class173) this.field8347.method2025((long) arg0, 2);
        }
        if (arg1 != 30883) {
            this.field8343 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field8343;
        byte[] var6;
        synchronized (this.field8343) {
            var6 = this.field8343.method3486((byte) -44, arg0, 11);
        }
        class173 var7 = new class173();
        if (var6 != null) {
            var7.method1096(89, new class428(var6));
        }
        class325 var8 = this.field8347;
        synchronized (this.field8347) {
            this.field8347.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 37)
    public final void method3291(int arg0) {
        if (arg0 != 64) {
            return;
        }
        class325 var2 = this.field8347;
        synchronized (this.field8347) {
            this.field8347.method2024((byte) -78);
        }
        field8341++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 51)
    public static void method3292(byte arg0) {
        if (arg0 != 50) {
            method3292((byte) 0);
        }
        field8344 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V", line = 66)
    public final void method3293(int arg0, byte arg1) {
        class325 var3 = this.field8347;
        synchronized (this.field8347) {
            this.field8347.method2028(arg0, true);
            if (arg1 >= -20) {
                field8344 = null;
            }
        }
        field8346++;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 83)
    public final void method3294(byte arg0) {
        class325 var2 = this.field8347;
        synchronized (this.field8347) {
            if (arg0 > -4) {
                this.method3293(89, (byte) -59);
            }
            this.field8347.method2037(true);
        }
        field8342++;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Loda;ILdda;)V", line = 98)
    public class563(class559 arg0, int arg1, class597 arg2) {
        this.field8343 = arg2;
        if (this.field8343 != null) {
            this.field8343.method3462(11, -110);
        }
    }
}
