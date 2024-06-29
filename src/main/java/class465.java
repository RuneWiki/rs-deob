import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class465 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field6911 = 2048;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field6910 = 2048;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field6914 = 0;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field6913 = 0;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lrt;I)V")
    public final void method2847(class194 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field6915++;
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                return;
            }
            this.method2849((byte) 32, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBI)V")
    public static final void method2848(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6916++;
        if (arg3 >= -30) {
            return;
        }
        for (int var5 = 0; var5 < class384.field5785; var5++) {
            Rectangle var6 = class288.field3985[var5];
            if (var6.x + var6.width > arg0 && (arg0 + arg4) > var6.x && arg1 < var6.y + var6.height && (arg1 + arg2) > var6.y) {
                class136.field1692[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLrt;I)V")
    private final void method2849(byte arg0, class194 arg1, int arg2) {
        field6909++;
        if (arg2 == 1) {
            this.field6914 = arg1.method1177(255);
        } else if (arg2 == 2) {
            this.field6910 = arg1.method1220(-120);
        } else if (arg2 == 3) {
            this.field6911 = arg1.method1220(118);
        } else if (arg2 == 4) {
            this.field6913 = arg1.method1233(arg0 + 65248);
        }
        if (arg0 != 32) {
            this.method2847(null, -123);
        }
    }

    static {
        new class474("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
    }
}
