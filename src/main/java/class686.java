import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class686 {

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9382 = new Rectangle[100];

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "F")
    public static float field9383;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "[Ljt;")
    public static class104[] field9381;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9382[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method3836(int arg0, int arg1) {
        field9379++;
        if (arg0 >= -96) {
            method3838(false);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)Z", line = 15)
    public static final boolean method3837(int arg0, int arg1, int arg2) {
        field9380++;
        if (arg2 != 30743) {
            field9382 = null;
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V", line = 43)
    public static void method3838(boolean arg0) {
        field9382 = null;
        field9381 = null;
        if (!arg0) {
            field9381 = null;
        }
    }
}
