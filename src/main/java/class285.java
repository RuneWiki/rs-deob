import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class285 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lmga;")
    private class666 field4028 = new class666(64);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lbi;")
    private class449 field4025;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lbi;")
    private class449 field4027;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lgu;")
    public static class543 field4029 = new class543();

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lbda;")
    public final class472 method1763(int arg0, int arg1) {
        field4026++;
        class472 var3 = (class472) this.field4028.method3750((long) arg1, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field4025.method2537(false, 0, arg1);
        } else {
            var4 = this.field4027.method2537(false, 0, arg1 & 0x7FFF);
        }
        class472 var5 = new class472();
        if (var4 != null) {
            var5.method2656(new class335(var4), false);
        }
        if (arg1 >= 32768) {
            var5.method2657((byte) -118);
        }
        if (arg0 != 32767) {
            method1764(2);
        }
        this.field4028.method3745(arg0 ^ 0x7FFE, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1764(int arg0) {
        field4029 = null;
        if (arg0 != 0) {
            field4029 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILbi;Lbi;)V")
    public class285(int arg0, class449 arg1, class449 arg2) {
        this.field4025 = arg1;
        this.field4027 = arg2;
        if (this.field4025 != null) {
            this.field4025.method2527(0, 0);
        }
        if (this.field4027 != null) {
            this.field4027.method2527(0, 0);
        }
    }
}
