import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class237 {

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field3558 = 16777215;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public int field3562 = 8;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lpu;")
    public static class179 field3567 = new class179("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[I")
    public static int[] field3568 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field3569 = -1;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field3557;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public int field3560;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field3564;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
    public boolean field3556;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "[[Lfi;")
    public static class38[][] field3555;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lfh;I)V")
    public final void method1605(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1337((byte) 49);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.method1605(null, 95);
                }
                field3554++;
                return;
            }
            this.method1607(var3, arg0, -21467);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method1606(byte arg0) {
        field3555 = null;
        if (arg0 < 80) {
            field3567 = null;
        }
        field3567 = null;
        field3564 = null;
        field3568 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILfh;I)V")
    private final void method1607(int arg0, class194 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3562 = arg1.method1396(arg2 ^ 0x538D);
        } else if (arg0 == 2) {
            this.field3556 = true;
        } else if (arg0 == 3) {
            this.field3557 = arg1.method1384(true);
            this.field3560 = arg1.method1384(true);
            this.field3565 = arg1.method1384(true);
        } else if (arg0 == 4) {
            this.field3561 = arg1.method1337((byte) 79);
        } else if (arg0 == 5) {
            this.field3566 = arg1.method1396(-93);
        } else if (arg0 == 6) {
            this.field3558 = arg1.method1339(-32768);
        }
        field3559++;
        if (arg2 != -21467) {
            method1606((byte) -6);
        }
    }
}
