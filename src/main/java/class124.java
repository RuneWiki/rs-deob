import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class124 {

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "I")
    public static int field1632 = -1;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!oja", name = "d", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)V", line = 3)
    public static final void method870(int arg0, int arg1) {
        if (class20.field171 == arg1) {
            class493.field6796.method584((byte) 121, arg0);
        } else {
            class354.field5120 = arg0;
        }
        field1634++;
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(II)V", line = 28)
    public static final void method871(int arg0, int arg1) {
        class472 var2 = class59.field688[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class472 var4 = class59.field688[var3][arg0][arg1] = class59.field688[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class44 var5 = var4.field6551; var5 != null; var5 = var5.field466) {
                    class253 var6 = var5.field465;
                    if (var6.field3745 == arg0 && var6.field3758 == arg1) {
                        var6.field3467--;
                    }
                }
                if (var4.field6540 != null) {
                    var4.field6540.field3467--;
                }
                if (var4.field6548 != null) {
                    var4.field6548.field3467--;
                }
                if (var4.field6544 != null) {
                    var4.field6544.field3467--;
                }
                if (var4.field6542 != null) {
                    var4.field6542.field3467--;
                }
                if (var4.field6541 != null) {
                    var4.field6541.field3467--;
                }
            }
        }
        if (class59.field688[0][arg0][arg1] == null) {
            class59.field688[0][arg0][arg1] = new class472(0);
            class59.field688[0][arg0][arg1].field6546 = 1;
        }
        class59.field688[0][arg0][arg1].field6549 = var2;
        class59.field688[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!oja", name = "toString", descriptor = "()Ljava/lang/String;", line = 81)
    public final String toString() {
        field1633++;
        throw new IllegalStateException();
    }
}
