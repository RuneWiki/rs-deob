import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class174 extends Canvas {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Ljava/awt/Component;")
    private Component field2625;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2628 = "Loading - please wait.";

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Z")
    public static boolean field2630 = false;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "J")
    public static volatile long field2634 = 0L;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    public static int[] field2629;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILhi;)Z", line = 8)
    public static final boolean method1211(int arg0, class323 arg1) {
        field2626++;
        if (arg1.field5039 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field5039.length; var2++) {
            int var3 = class333.method2302((byte) -75, arg1, var2);
            int var4 = arg1.field5058[var2];
            if (arg1.field5039[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field5039[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field5039[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -5) {
            method1213(103, 0, (byte) 71);
        }
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 64)
    public static void method1212(int arg0) {
        field2628 = null;
        field2629 = null;
        if (arg0 != 126) {
            field2627 = 116;
        }
    }

    @OriginalMember(owner = "client!mo", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 79)
    public final void update(Graphics arg0) {
        this.field2625.update(arg0);
        field2631++;
    }

    @OriginalMember(owner = "client!mo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 91)
    public final void paint(Graphics arg0) {
        field2632++;
        this.field2625.paint(arg0);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 110)
    public class174(Component arg0) {
        this.field2625 = arg0;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIB)I", line = 119)
    public static final int method1213(int arg0, int arg1, byte arg2) {
        field2635++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        int var4 = 121 / ((arg2 - 62) / 55);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V", line = 141)
    public static final void method1214(int arg0, int arg1) {
        class296 var2 = class101.field1354;
        synchronized (class101.field1354) {
            if (arg0 != 23754) {
                return;
            }
            class304.field4737 = arg1;
        }
        field2624++;
    }
}
