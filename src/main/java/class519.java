import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class519 {

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lgw;")
    private class690 field7242 = new class690(64);

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Luu;")
    private class237 field7241;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field7239;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lst;")
    public static class335 field7240 = new class335(47, 3);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method3095(byte arg0) {
        field7240 = null;
        if (arg0 != 48) {
            method3095((byte) -52);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ldc;Z)Lria;")
    public static final class504 method3096(class63 arg0, boolean arg1) {
        field7244++;
        class545 var2 = class272.method1831(-123, arg0);
        int var3 = arg0.method482(-772591672);
        int var4 = arg0.method482(-772591672);
        int var5 = arg0.method482(-772591672);
        if (arg1) {
            field7240 = null;
        }
        int var6 = arg0.method482(-772591672);
        int var7 = arg0.method482(-772591672);
        int var8 = arg0.method482(-772591672);
        return new class504(var2.field7560, var2.field7553, var2.field7557, var2.field7562, var2.field7561, var2.field7550, var2.field7555, var2.field7549, var2.field7563, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Liea;")
    public final class11 method3097(int arg0, byte arg1) {
        field7243++;
        if (arg1 <= 65) {
            method3095((byte) -91);
        }
        class690 var3 = this.field7242;
        class11 var4;
        synchronized (this.field7242) {
            var4 = (class11) this.field7242.method3898((byte) -42, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field7241;
        byte[] var6;
        synchronized (this.field7241) {
            var6 = this.field7241.method1572(19, 0, arg0);
        }
        class11 var7 = new class11();
        if (var6 != null) {
            var7.method56((byte) 107, new class63(var6));
        }
        class690 var8 = this.field7242;
        synchronized (this.field7242) {
            this.field7242.method3899(-50, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class519(class553 arg0, int arg1, class237 arg2) {
        this.field7241 = arg2;
        this.field7239 = this.field7241.method1597(19, 0);
    }
}
