import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class320 extends class45 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Leba;")
    public static class550 field4271 = new class550(95, -1);

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field4273;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 9)
    public static void method1851(byte arg0) {
        if (arg0 < 125) {
            method1852(-38, 73, 122);
        }
        field4271 = null;
        field4273 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)I", line = 22)
    public static final int method1852(int arg0, int arg1, int arg2) {
        int var3 = 37 % ((arg1 - 62) / 48);
        field4274++;
        int var4 = arg2 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg2 + var4;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V", line = 33)
    public class320(int arg0, int arg1) {
        this.field4272 = arg0;
        this.field4275 = arg1;
    }
}
