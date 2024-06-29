import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class540 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "Lmq;")
    private class472 field7851 = new class472(256);

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lfa;")
    private class212 field7849;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lkga;")
    private class506 field7847;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field7845 = new Hashtable();

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Ljk;")
    public static class585 field7848 = new class585(54, 7);

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Ljava/lang/String;")
    public static String field7854;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public final void method3167(byte arg0) {
        field7853++;
        this.field7851.method2777(5, 52);
        if (arg0 != -60) {
            this.field7849 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method3168(int arg0) {
        field7845 = null;
        field7848 = null;
        if (arg0 < 111) {
            field7848 = null;
        }
        field7854 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lsaa;")
    public final class298 method3169(int arg0, int arg1) {
        field7852++;
        Object var3 = this.field7851.method2766(-128, (long) arg1);
        if (var3 != null) {
            return (class298) var3;
        } else if (this.field7849.method395(arg1, 28576)) {
            class352 var4 = this.field7849.method397(arg1, (byte) 9);
            int var5 = var4.field4708 ? 64 : this.field7847.field7254;
            if (arg0 != 3553) {
                this.method3169(10, -74);
            }
            class298 var7;
            if (var4.field4702 && this.field7847.method237()) {
                float[] var6 = this.field7849.method393(arg1, false, var5, 0.7F, -23825, var5);
                var7 = new class298(this.field7847, 3553, 34842, var5, var5, var4.field4710 != 0, var6, 6408);
            } else {
                int[] var8;
                if (!var4.field4712 && class642.method3650(-3898, var4.field4707)) {
                    var8 = this.field7849.method400(var5, true, var5, (byte) -73, arg1, 0.7F);
                } else {
                    var8 = this.field7849.method392(false, var5, arg1, var5, arg0 - 3458, 0.7F);
                }
                var7 = new class298(this.field7847, 3553, 6408, var5, var5, var4.field4710 != 0, var8, false);
            }
            var7.method1767(var4.field4701, var4.field4698, 10242);
            this.field7851.method2772(var7, true, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method3170(int arg0) {
        field7850++;
        this.field7851.method2776(false);
        if (arg0 != 6408) {
            field7854 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lkga;Lfa;)V")
    public class540(class506 arg0, class212 arg1) {
        this.field7849 = arg1;
        this.field7847 = arg0;
    }
}
