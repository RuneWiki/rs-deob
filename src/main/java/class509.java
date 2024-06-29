import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class509 extends class132 {

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "Lfw;")
    public class50 field7102;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "Lio;")
    public static class370 field7106 = new class370();

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
    public static int field7110 = 0;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "F")
    public static float field7109;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "I")
    public static int field7108;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(BI)V")
    public static final void method2940(byte arg0, int arg1) {
        field7103++;
        if (arg0 == -26) {
            class314 var2 = class483.method2819(5, arg1, arg0 + 21329);
            var2.method1962((byte) 0);
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
    public static void method2941(int arg0) {
        if (arg0 == -4) {
            field7106 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z")
    public abstract boolean method997(int arg0);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[[I)V")
    public static final void method2942(int arg0, int[][] arg1) {
        class182.field2580 = arg1;
        field7108++;
        if (arg0 != 0) {
            field7106 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
    public static final void method2943(byte arg0) {
        field7105++;
        if (class10.field109 == 0) {
            return;
        }
        try {
            if (++class208.field2931 > 2000) {
                if (class143.field2203 != null) {
                    class143.field2203.method1004(arg0 + 34170);
                    class143.field2203 = null;
                }
                if (class440.field6262 >= 1) {
                    class111.field1721 = -5;
                    class10.field109 = 0;
                    return;
                }
                class208.field2931 = 0;
                class10.field109 = 1;
                class440.field6262++;
                class332.field4446.field2678 = !class332.field4446.field2678;
            }
            if (class10.field109 == 1) {
                class28.field471 = class500.field6968.method1851(class332.field4446.method1178(12623), class332.field4446.field2686, 3298);
                class10.field109 = 2;
            }
            if (class10.field109 == 2) {
                if (class28.field471.field5134 == 2) {
                    throw new IOException();
                }
                if (class28.field471.field5134 != 1) {
                    return;
                }
                class143.field2203 = class11.method114((Socket) class28.field471.field5132, 5000, Integer.MAX_VALUE);
                class28.field471 = null;
                class143.field2203.method998(arg0 ^ 0xFFFF7A85, class479.field6754.field138, 0, class479.field6754.field165);
                class10.field109 = 4;
            }
            if (class10.field109 == 4) {
                if (!class143.field2203.method1000((byte) 126, 1)) {
                    return;
                }
                class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                int var1 = class343.field4627.field138[0] & 0xFF;
                if (var1 != 21) {
                    class10.field109 = 0;
                    class111.field1721 = var1;
                    class143.field2203.method1004(34065);
                    class143.field2203 = null;
                    return;
                }
                class10.field109 = 5;
            }
            if (class10.field109 == 5) {
                if (!class143.field2203.method1000((byte) -87, 1)) {
                    return;
                }
                class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                class10.field109 = 6;
                class447.field6349 = new String[class343.field4627.field138[0] & 0xFF];
            }
            if (class10.field109 == 6) {
                if (!class143.field2203.method1000((byte) -95, class447.field6349.length * 8)) {
                    return;
                }
                class343.field4627.field165 = 0;
                class143.field2203.method1002(class343.field4627.field138, arg0 - 26090, class447.field6349.length * 8, 0);
                for (int var2 = 0; var2 < class447.field6349.length; var2++) {
                    class447.field6349[var2] = class612.method3585(116, class343.field4627.method85(class133.method898(arg0, 22)));
                }
                class111.field1721 = 21;
                class10.field109 = 0;
                class143.field2203.method1004(arg0 + 34170);
                class143.field2203 = null;
                return;
            }
        } catch (IOException var3) {
            if (class143.field2203 != null) {
                class143.field2203.method1004(34065);
                class143.field2203 = null;
            }
            if (class440.field6262 < 1) {
                class208.field2931 = 0;
                class10.field109 = 1;
                class440.field6262++;
                class332.field4446.field2678 = !class332.field4446.field2678;
            } else {
                class10.field109 = 0;
                class111.field1721 = -4;
            }
        }
        if (arg0 != -105) {
            method2944(null, (byte) 11, null, true);
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method991(int arg0);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ln;BLjava/awt/Canvas;Z)Lqa;")
    public static final class207 method2944(class17 arg0, byte arg1, Canvas arg2, boolean arg3) {
        field7104++;
        if (arg1 != 56) {
            method2943((byte) 98);
        }
        return arg3 ? new class208(arg2, arg0) : new class606(arg2, arg0);
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lfw;I)V")
    public class509(class50 arg0, int arg1) {
        this.field7102 = arg0;
        this.field7107 = arg1;
    }
}
