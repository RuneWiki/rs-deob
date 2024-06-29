import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[Lcw;")
    public class164[] field410 = null;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lfba;")
    public class24 field408 = null;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lfba;")
    public class24 field411 = null;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[Lcw;")
    public class164[] field414 = null;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lfba;")
    public class24 field415 = null;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Z")
    public boolean field412;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field413 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lem;")
    public static class206 field409 = new class206(13, 8);

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method307(int arg0) {
        if (arg0 <= 106) {
            method307(37);
        }
        field409 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Llj;)V")
    public class33(class565 arg0) {
        this.field412 = arg0.field7957;
        class533.method3023(arg0, -14363);
        if (this.field412) {
            byte[] var6 = class602.method3387(false, -127, class296.field4062);
            this.field411 = new class24(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class602.method3387(false, -121, class148.field2200);
            this.field415 = new class24(arg0, 6410, 128, 128, 16, var7, 6410);
            class576 var8 = arg0.field7829;
            if (var8.method3292(-26176)) {
                byte[] var9 = class602.method3387(false, -125, class220.field3081);
                this.field408 = new class24(arg0, 6408, 128, 128, 16);
                class24 var10 = new class24(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3288(this.field408, var10, (byte) -113, 2.0F)) {
                    this.field408.method948((byte) 121);
                } else {
                    this.field408.method949((byte) -67);
                    this.field408 = null;
                }
                var10.method949((byte) -67);
            }
        } else {
            this.field410 = new class164[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class63.method527(var2 * 128 * 2 * 128, true, class296.field4062, 32768);
                this.field410[var2] = new class164(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field414 = new class164[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class63.method527(var3 * 256 * 128, true, class148.field2200, 32768);
                this.field414[var3] = new class164(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }
}
