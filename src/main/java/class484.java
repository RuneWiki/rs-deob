import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class484 {

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "Luaa;")
    private class395 field6851 = new class395(64);

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "Lgp;")
    private class561 field6856;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Z")
    public static boolean field6854 = true;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "[S")
    public static short[] field6852 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "F")
    public static float field6850;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Lsr;")
    public static class429 field6855;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public static void method2783(byte arg0) {
        if (arg0 != -103) {
            field6852 = null;
        }
        field6852 = null;
        field6855 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lll;")
    public final class271 method2784(int arg0, int arg1) {
        field6853++;
        class395 var3 = this.field6851;
        class271 var4;
        synchronized (this.field6851) {
            var4 = (class271) this.field6851.method2407(false, (long) arg0);
            if (arg1 < 99) {
                method2783((byte) 52);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field6856;
        byte[] var6;
        synchronized (this.field6856) {
            var6 = this.field6856.method3175(arg0, (byte) -53, 5);
        }
        class271 var7 = new class271();
        if (var6 != null) {
            var7.method1758(new class268(var6), -2049);
        }
        class395 var8 = this.field6851;
        synchronized (this.field6851) {
            this.field6851.method2408(var7, (long) arg0, -122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljc;ILgp;)V")
    public class484(class584 arg0, int arg1, class561 arg2) {
        this.field6856 = arg2;
        this.field6856.method3164(5, true);
    }
}
