import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class40 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    public static boolean field668 = true;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field669;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V", line = 13)
    public static final void method300(int arg0, int arg1, int arg2) {
        boolean var3 = class66.field977[0][arg1][arg2] != null && class66.field977[0][arg1][arg2].field6912 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class66.field977[var4][arg1][arg2] == null) {
                class465 var5 = class66.field977[var4][arg1][arg2] = new class465(var4, arg1, arg2);
                if (var3) {
                    var5.field6916++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V", line = 35)
    public static void method301(byte arg0) {
        field669 = null;
        int var1 = 52 % ((22 - arg0) / 54);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method51(Component arg0, byte arg1);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method49(byte arg0, Component arg1);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public abstract int method50(byte arg0);
}
