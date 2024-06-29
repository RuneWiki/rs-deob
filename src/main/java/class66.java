import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 extends class25 {

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "J")
    public long field1312;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1308 = -2;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lcd;")
    public static class64 field1309 = class44.method335((byte) 71, "welle:");

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "F")
    public static float field1311;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Ljava/lang/Thread;")
    public static Thread field1313;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 8)
    public static void method550(int arg0) {
        if (arg0 <= -109) {
            field1309 = null;
            field1313 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIII)Z", line = 24)
    public static final boolean method551(int arg0, int arg1, int arg2, int arg3) {
        if (class281.method1946(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class164.method1178(var4 + 1, class96.field1764[arg0][arg1][arg2] + arg3, var5 + 1) && class164.method1178(var4 + 128 - 1, class96.field1764[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class164.method1178(var4 + 128 - 1, class96.field1764[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class164.method1178(var4 + 1, class96.field1764[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lja;B)V", line = 44)
    public static final void method552(class60 arg0, byte arg1) {
        field1310++;
        class60 var2 = class74.method593(4, arg0);
        if (arg1 >= -45) {
            return;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class13.field290;
            var4 = class58.field960;
        } else {
            var3 = var2.field1163;
            var4 = var2.field1016;
        }
        class206.method1435(var3, (byte) 85, false, var4, arg0);
        class198.method1388(arg0, var4, var3, -1);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 84)
    public class66() {
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(J)V", line = 94)
    public class66(long arg0) {
        this.field1312 = arg0;
    }
}
