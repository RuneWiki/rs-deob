import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class14 {

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "Ld;")
    public static class7 field135 = class37.method242("Chainmail Shop", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "[[B")
    public static byte[][] field134 = new byte[250][];

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Ld;")
    public static class7 field137 = class37.method242("Archery Shop", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "i", descriptor = "I")
    public static int field142 = 20;

    @OriginalMember(owner = "mapview!ga", name = "j", descriptor = "Ld;")
    public static class7 field143 = class37.method242("Overview", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "Ld;")
    public static class7 field138 = class37.method242("Enter place name to find", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "k", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "mapview!ga", name = "l", descriptor = "Ld;")
    public static class7 field145 = class37.method242("map", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "Ld;")
    public static class7 field140 = class37.method242("100(U", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "Ld;")
    public static class7 field141 = class37.method242(" ", 1333943984);

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field136;

    @OriginalMember(owner = "mapview!ga", name = "m", descriptor = "[B")
    public static byte[] field146;

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "[I")
    public static int[] field139;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(ZI[B)I", line = 4)
    public static final int method104(boolean arg0, int arg1, byte[] arg2) {
        return arg0 ? -86 : class21.method145(arg1, arg2, 0, 119);
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)B", line = 20)
    public static final byte method105(byte arg0) {
        if (arg0 <= 29) {
            field140 = null;
        }
        return mapview.field287 == null ? 0 : mapview.field287[class16.field166];
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(JZ)V", line = 61)
    public static final void method106(long arg0, boolean arg1) {
        if (arg1) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var4) {
            }
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([Ld;IIB)V", line = 84)
    public static final void method107(class7[] arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 1) {
            arg0[0].method59((byte) -15);
        } else {
            class35.method233(0, arg1, arg0, arg2).method59((byte) -15);
        }
        if (arg3 != 28) {
            method107(null, -116, 65, (byte) -63);
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(I)V", line = 121)
    public static void method108(int arg0) {
        field134 = null;
        if (arg0 <= 23) {
            return;
        }
        field137 = null;
        field140 = null;
        field143 = null;
        field138 = null;
        field135 = null;
        field146 = null;
        field139 = null;
        field145 = null;
        field136 = null;
        field141 = null;
    }
}
