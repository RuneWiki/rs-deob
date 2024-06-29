import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class518 {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field7521 = 0;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "Z")
    public static boolean field7522 = false;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field7523;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfh;BI)V")
    private final void method3058(class194 arg0, byte arg1, int arg2) {
        if (arg1 != -94) {
            method3059(15, 15, 17);
        }
        if (arg2 == 5) {
            this.field7521 = arg0.method1396(arg1 ^ 0xFFFFFFA1);
        }
        field7519++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
    public static final void method3059(int arg0, int arg1, int arg2) {
        field7523++;
        class52 var3 = class166.field2508[arg1][arg0];
        if (var3 != null) {
            class201.field3107 = var3.field797;
            class58.field886 = var3.field787;
            class35.field418 = var3.field788;
        }
        class222.method1540((byte) 87);
        if (arg2 != 5) {
            field7522 = false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lfh;B)V")
    public final void method3060(class194 arg0, byte arg1) {
        field7520++;
        int var3 = -63 % ((arg1 + 32) / 58);
        while (true) {
            int var4 = arg0.method1337((byte) -9);
            if (var4 == 0) {
                return;
            }
            this.method3058(arg0, (byte) -94, var4);
        }
    }
}
