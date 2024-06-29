import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class57 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lff;")
    private class9 field780 = new class9(64);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lvh;")
    private class240 field777;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lvh;")
    private class240 field782;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lhj;", line = 6)
    public final class400 method373(int arg0, int arg1) {
        if (arg1 != 0) {
            method374(56, 12, 12, null);
        }
        field781++;
        class400 var3 = (class400) this.field780.method56((long) arg0, arg1 + 51);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field777.method1411(true, arg0 & 0x7FFF, 0);
        } else {
            var4 = this.field782.method1411(true, arg0, 0);
        }
        class400 var5 = new class400();
        if (var4 != null) {
            var5.method2313(new class365(var4), false);
        }
        if (arg0 >= 32768) {
            var5.method2320(0);
        }
        this.field780.method73((long) arg0, var5, 26425);
        return var5;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III[B)I", line = 47)
    public static final int method374(int arg0, int arg1, int arg2, byte[] arg3) {
        field779++;
        int var4 = -1;
        if (arg0 != -1109078392) {
            field778 = -60;
        }
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = class241.field3339[(var4 ^ arg3[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILvh;Lvh;)V", line = 84)
    public class57(int arg0, class240 arg1, class240 arg2) {
        this.field777 = arg2;
        this.field782 = arg1;
        if (this.field782 != null) {
            this.field782.method1397((byte) 29, 0);
        }
        if (this.field777 != null) {
            this.field777.method1397((byte) -123, 0);
        }
    }
}
