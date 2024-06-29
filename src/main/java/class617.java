import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class617 extends class751 {

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "Z")
    public static boolean field8744 = false;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "[I")
    public static int[] field8748;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(CI)Z", line = 8)
    public static final boolean method3545(char arg0, int arg1) {
        field8745++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != arg1) {
            char[] var2 = class183.field2787;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I", line = 42)
    public static final int method3546(int arg0, int arg1) {
        if (arg0 == 255) {
            field8747++;
            return arg1 & 0xFF;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 53)
    public static final void method3547(Canvas arg0, int arg1) {
        field8746++;
        if (arg1 <= 96) {
            return;
        }
        Dimension var2 = arg0.getSize();
        class747.method4115(var2.height, var2.width, -5321);
        if (class388.field5420 == 1) {
            class390.field5440.method432(arg0, class81.field1198, class278.field4016);
        } else {
            class390.field5440.method432(arg0, class183.field2780, class483.field6679);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 75)
    public static void method3548(byte arg0) {
        if (arg0 == 10) {
            field8748 = null;
        }
    }
}
