import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class784 {

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "[[Z")
    public static boolean[][] field10801 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "D")
    public static double field10799;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field10802;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Lnfa;")
    public static class709 field10798;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field10800;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public static void method4339(int arg0) {
        field10801 = null;
        field10798 = null;
        if (arg0 < 42) {
            field10799 = 1.2872361595758204D;
        }
        field10800 = null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static final void method4340(int arg0) {
        class665.field9191 = 0;
        class226.field3097 = false;
        class675.field9472 = 0;
        class64.field906 = new class723[2000];
        class782.field10789 = class48.field722;
        class135.field1988 = 0;
        class517.field7061 = new class723[500];
        class268.field3958 = new class723[500];
        class678.field9486 = class48.field722;
        class743.field10262 = 0;
        class719.field10030 = new int[class315.field4541][class405.field5875 + 1][class710.field9947 + 1];
        int var1 = -119 % ((arg0 + 15) / 48);
        field10802++;
        class537.field7312 = new class723[1000];
        if ((class192.field2582 instanceof class724)) {
            class522.field7164 = false;
        } else {
            class522.field7164 = true;
        }
    }
}
