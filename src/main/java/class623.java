import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class623 implements Runnable {

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "[Lcv;")
    public volatile class22[] field9012 = new class22[2];

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
    public volatile boolean field9008 = false;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Z")
    public volatile boolean field9009 = false;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field9011 = 0;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field9013 = 0;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "[I")
    public static int[] field9014 = new int[4];

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Lpb;")
    public static class2 field9010 = new class2(12, 5);

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Lvg;")
    public static class622 field9016 = new class622(109, -1);

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "F")
    public static float field9015;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Lew;")
    public class226 field9005;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method3588(int arg0) {
        field9016 = null;
        field9010 = null;
        if (arg0 > 20) {
            field9014 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "run", descriptor = "()V")
    public final void run() {
        this.field9009 = true;
        field9006++;
        try {
            while (!this.field9008) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class22 var2 = this.field9012[var1];
                    if (var2 != null) {
                        var2.method143((byte) 105);
                    }
                }
                class687.method3846(10L, 101);
                class415.method2530(97, null, this.field9005);
            }
        } catch (Exception var9) {
            class118.method869(var9, (byte) -128, null);
        } finally {
            Object var6 = null;
            this.field9009 = false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3589(int arg0, int arg1, byte arg2) {
        field9007++;
        if (arg2 == 80) {
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return true;
        }
    }
}
