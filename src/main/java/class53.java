import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class class53 {

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "[I")
    public static int[] field711 = new int[1000];

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "[[I")
    public static int[][] field709 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Z", line = 7)
    public static final boolean method590(int arg0, int arg1, int arg2) {
        int var3 = 23 / ((86 - arg1) / 35);
        field712++;
        return (arg0 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V", line = 17)
    public static final void method591(byte arg0, int arg1) {
        field708++;
        class49 var2 = class567.field8140;
        synchronized (class567.field8140) {
            class567.field8140.method573((byte) 123, arg1);
        }
        if (arg0 != -119) {
            field710 = -19;
        }
        class49 var3 = class393.field6137;
        synchronized (class393.field6137) {
            class393.field6137.method573((byte) 125, arg1);
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V", line = 42)
    public static void method595(int arg0) {
        field709 = null;
        field711 = null;
        if (arg0 != 5) {
            field709 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public abstract void method588(int arg0);

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[BII)I")
    public abstract int method589(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BIII)V")
    public abstract void method592(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Z")
    public abstract boolean method593(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
    public abstract void method594(byte arg0);
}
