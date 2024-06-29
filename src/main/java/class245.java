import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class245 extends class357 {

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3429 = "";

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public int field3427;

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lia;")
    public static class23 field3425;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "Lht;")
    public class80 field3432;

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3430;

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "[B")
    public byte[] field3428;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(Z)V", line = 4)
    public static void method1628(boolean arg0) {
        field3425 = null;
        if (arg0) {
            method1628(false);
        }
        field3430 = null;
        field3429 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)[B", line = 22)
    public final byte[] method696(int arg0) {
        if (arg0 > -102) {
            this.field3432 = null;
        }
        ++field3426;
        if (super.field5535) {
            throw new RuntimeException();
        } else {
            return this.field3428;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)I", line = 45)
    public final int method693(int arg0) {
        if (arg0 > -49) {
            this.field3428 = null;
        }
        ++field3431;
        return super.field5535 ? 0 : 100;
    }
}
