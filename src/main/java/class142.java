import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class142 {

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field2195 = 0;

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "Lada;")
    public class142 field2197;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "Lada;")
    public class142 field2200;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "Lan;")
    public static class21 field2194;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "Ljava/awt/Image;")
    public static Image field2202;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "([BI)[B")
    public static final byte[] method936(byte[] arg0, int arg1) {
        field2198++;
        class11 var2 = new class11(arg0);
        int var3 = var2.method110((byte) 120);
        if (arg1 >= -116) {
            field2195 = -2;
        }
        int var4 = var2.method119(-112);
        if (var4 < 0 || !(class239.field3335 == 0 || class239.field3335 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var4];
            var2.method75(0, var4, (byte) 121, var8);
            return var8;
        } else {
            int var5 = var2.method119(-114);
            if (var5 < 0 || !(class239.field3335 == 0 || class239.field3335 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class539.method3093(var6, var5, arg0, var4, 9);
            } else {
                class580 var7 = class566.field7825;
                synchronized (class566.field7825) {
                    class566.field7825.method3318(var2, var6, -42);
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZ)Z")
    public static final boolean method937(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field2196++;
            return arg0 == 0 || arg0 == 1;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V")
    public static void method938(int arg0) {
        field2194 = null;
        field2202 = null;
        if (arg0 < 85) {
            field2195 = 6;
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)V")
    public final void method939(int arg0) {
        field2199++;
        if (this.field2200 == null) {
            return;
        }
        this.field2200.field2197 = this.field2197;
        if (arg0 >= 55) {
            this.field2197.field2200 = this.field2200;
            this.field2197 = null;
            this.field2200 = null;
        }
    }
}
