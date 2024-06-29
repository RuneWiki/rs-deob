import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class418 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6092 = new Rectangle[100];

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "J")
    public long field6091;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lob;")
    public class418 field6090;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lob;")
    public class418 field6094;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field6092[var0] = new Rectangle();
        }
        field6095 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 11)
    public static final void method2631(int arg0, int arg1) {
        class280.field4118 = 3;
        class169.field2281 = arg1;
        if (arg0 <= 6) {
            field6092 = null;
        }
        field6089++;
        class184.field2463 = 100;
        class396.field5784 = -1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 25)
    public final void method2632(boolean arg0) {
        field6088++;
        if (this.field6090 == null) {
            return;
        }
        if (!arg0) {
            this.method2632(true);
        }
        this.field6090.field6094 = this.field6094;
        this.field6094.field6090 = this.field6090;
        this.field6094 = null;
        this.field6090 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Z", line = 42)
    public final boolean method2633(boolean arg0) {
        field6093++;
        if (!arg0) {
            method2631(80, 117);
        }
        return this.field6090 != null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V", line = 59)
    public static final void method2634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6097++;
        if (arg3 != 3) {
            method2634(20, 69, -116, 101, 77, 27);
        }
        if (arg2 == arg5) {
            class432.method2703(arg0, arg4, arg5, arg1, (byte) 43);
        } else if (class240.field3368 <= arg1 - arg5 && class136.field1769 >= (arg1 + arg5) && class157.field1981 <= (arg4 - arg2) && class312.field4602 >= (arg2 + arg4)) {
            class227.method1478((byte) 87, arg4, arg5, arg0, arg1, arg2);
        } else {
            class444.method2770(arg1, arg5, arg2, arg0, 1, arg4);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 102)
    public static void method2635(int arg0) {
        if (arg0 > 54) {
            field6092 = null;
        }
    }
}
