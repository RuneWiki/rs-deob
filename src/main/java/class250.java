import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class250 {

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Ler;")
    private class157 field3473 = new class157(64);

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lns;")
    private class438 field3471;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
    public static int[] field3468 = new int[16];

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lns;")
    public static class438 field3470;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILmj;Lmj;)V", line = 9)
    public static final void method1638(int arg0, int arg1, int arg2, class70 arg3, class70 arg4) {
        class420 var5 = class422.method2542(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6261 = arg3;
            var5.field6271 = arg4;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 20)
    public static void method1639(boolean arg0) {
        if (!arg0) {
            field3470 = null;
        }
        field3468 = null;
        field3470 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lnb;", line = 33)
    public final class243 method1640(int arg0, int arg1) {
        field3472++;
        class157 var3 = this.field3473;
        class243 var4;
        synchronized (this.field3473) {
            var4 = (class243) this.field3473.method1013((long) arg0, (byte) -106);
        }
        if (arg1 != 28560) {
            method1638(117, 40, -19, null, null);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3471.method2650(arg0, arg1 ^ 0xFFFF9079, 5);
        class243 var6 = new class243();
        if (var5 != null) {
            var6.method1619(458752, new class91(var5));
        }
        class157 var7 = this.field3473;
        synchronized (this.field3473) {
            this.field3473.method1012(-74, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lgo;ILns;)V", line = 73)
    public class250(class331 arg0, int arg1, class438 arg2) {
        this.field3471 = arg2;
        this.field3471.method2645(1, 5);
    }
}
