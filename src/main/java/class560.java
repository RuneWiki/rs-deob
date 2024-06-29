import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class560 {

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Lgw;")
    private class690 field7791 = new class690(64);

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Luu;")
    private class237 field7790;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "Z")
    public static boolean field7795 = false;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "[I")
    public static int[] field7794 = new int[500];

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "Lbaa;")
    public static class130 field7789 = new class130(16);

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "F")
    public static float field7792;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "Lsn;")
    public static class162 field7796;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BI)Lsu;")
    public final class592 method3295(byte arg0, int arg1) {
        field7788++;
        class690 var3 = this.field7791;
        class592 var4;
        synchronized (this.field7791) {
            var4 = (class592) this.field7791.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field7790;
        byte[] var6;
        synchronized (this.field7790) {
            var6 = this.field7790.method1572(5, arg0 ^ 0x51, arg1);
        }
        class592 var7 = new class592();
        if (var6 != null) {
            var7.method3405(new class63(var6), arg0 ^ 0x5F);
        }
        class690 var8 = this.field7791;
        synchronized (this.field7791) {
            if (arg0 == 81) {
                this.field7791.method3899(-114, var7, (long) arg1);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public static void method3296(byte arg0) {
        field7796 = null;
        field7794 = null;
        if (arg0 <= 32) {
            field7795 = false;
        }
        field7789 = null;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class560(class553 arg0, int arg1, class237 arg2) {
        this.field7790 = arg2;
        this.field7790.method1597(5, 0);
    }
}
