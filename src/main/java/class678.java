import jaclib.memory.heap.NativeHeap;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class678 extends class493 {

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field9727;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9724 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Lpf;")
    public static class538 field9726;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "[[I")
    public static int[][] field9722;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(CI)I", line = 5)
    public static final int method3849(char arg0, int arg1) {
        if (arg1 != -1) {
            method3851(126);
        }
        field9725++;
        return arg0 >= '\u0000' && class114.field1482.length > arg0 ? class114.field1482[arg0] : -1;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 20)
    public final void method3850(int arg0) {
        field9723++;
        this.field9727.method3571();
        if (arg0 != 16777215) {
            method3849((char) 65417, -79);
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 40)
    public static void method3851(int arg0) {
        field9724 = null;
        if (arg0 != 16777215) {
            method3851(25);
        }
        field9726 = null;
        field9722 = null;
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(I)V", line = 51)
    public class678(int arg0) {
        this.field9727 = new NativeHeap(arg0);
    }
}
