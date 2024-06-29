import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class373 {

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "Z")
    public static boolean field5604 = false;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5603;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lfq;III[Z)Z")
    public static final boolean method2309(class87 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class55.field765 != class479.field6745) {
            int var6 = class483.field6781[arg1].method204(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class48 var8 = class483.field6781[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method204(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method202(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method207(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static final void method2310(int arg0) {
        field5602++;
        if (arg0 < 99) {
            return;
        }
        if (class337.field5038.method2209(class170.field2424, 8) || class486.field6836 == class314.field4722) {
            class390.method2353(class138.field1976, false);
            if (class68.field923 != class486.field6836) {
                class48.method349(-4);
            }
        } else {
            class298.method1864(class356.field5413, class314.field4728, (byte) 45, false, false);
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
    public static void method2311(int arg0) {
        field5603 = null;
        if (arg0 >= -77) {
            field5603 = null;
        }
    }
}
