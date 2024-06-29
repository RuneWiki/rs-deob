import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class503 {

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lug;")
    public class61 field7000 = new class61();

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lug;")
    private class61 field7005;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)I", line = 3)
    public final int method3028(boolean arg0) {
        if (arg0) {
            this.field7005 = null;
        }
        field6999++;
        int var2 = 0;
        class61 var3 = this.field7000.field880;
        while (this.field7000 != var3) {
            var3 = var3.field880;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Lug;", line = 29)
    public final class61 method3029(boolean arg0) {
        field7002++;
        class61 var2 = this.field7005;
        if (this.field7000 == var2) {
            this.field7005 = null;
            return null;
        }
        if (!arg0) {
            this.field7000 = null;
        }
        this.field7005 = var2.field880;
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)Lug;", line = 50)
    public final class61 method3030(byte arg0) {
        field6998++;
        class61 var2 = this.field7000.field880;
        if (this.field7000 == var2) {
            this.field7005 = null;
            return null;
        }
        if (arg0 < 123) {
            method3032(null, 40);
        }
        this.field7005 = var2.field880;
        return var2;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lug;I)V", line = 71)
    public final void method3031(class61 arg0, int arg1) {
        field7001++;
        if (arg0.field878 != null) {
            arg0.method434((byte) -6);
        }
        arg0.field878 = this.field7000.field878;
        if (arg1 != 0) {
            this.method3028(false);
        }
        arg0.field880 = this.field7000;
        arg0.field878.field880 = arg0;
        arg0.field880.field878 = arg0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 91)
    public static final void method3032(Canvas arg0, int arg1) {
        field7004++;
        Dimension var2 = arg0.getSize();
        class139.method920(var2.height, var2.width, arg1);
        if (class521.field7260 == 1) {
            class496.field6948.method1535(arg0, class559.field7774, class239.field3574);
        } else {
            class496.field6948.method1535(arg0, class462.field6420, class196.field2637);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 106)
    public final void method3033(byte arg0) {
        field7003++;
        while (true) {
            class61 var2 = this.field7000.field880;
            if (this.field7000 == var2) {
                if (arg0 <= 39) {
                    return;
                } else {
                    this.field7005 = null;
                    return;
                }
            }
            var2.method434((byte) -6);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 140)
    public class503() {
        this.field7000.field880 = this.field7000;
        this.field7000.field878 = this.field7000;
    }
}
