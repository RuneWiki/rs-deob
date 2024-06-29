import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class474 {

    @OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
    public boolean field6402;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "Z")
    public static boolean field6404 = false;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "F")
    public static float field6398;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "Lvp;")
    public class467 field6399;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lvp;")
    public class467 field6406;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Z")
    public boolean field6403;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I", line = 3)
    public static final int method2661(int arg0) {
        field6405++;
        class689 var1 = class9.field103;
        boolean var2 = false;
        if (class161.field2038 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class689.method3816((byte) -116, 0, null, 0, var3, null);
            var2 = true;
        }
        long var4 = class669.method3713(0);
        if (arg0 != -65536) {
            method2661(-49);
        }
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method1792(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class669.method3713(0) - var4);
        var1.method3811(0, 100, 100, 0, -16777216, 43);
        if (var2) {
            var1.method3813(false);
        }
        return var7;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z", line = 51)
    public final boolean method2662(int arg0) {
        field6400++;
        if (arg0 >= -66) {
            this.method2663(100);
        }
        return this.field6403 && !this.field6402;
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V", line = 69)
    public final void method2663(int arg0) {
        if (arg0 != 75) {
            return;
        }
        if (this.field6399 != null) {
            this.field6399.method1022((byte) 33);
        }
        field6401++;
        this.field6403 = false;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Z)V", line = 85)
    public class474(boolean arg0) {
        this.field6402 = arg0;
    }
}
