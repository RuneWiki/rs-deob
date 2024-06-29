import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class72 {

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1015 = null;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "Z")
    public static boolean field1010 = true;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "Z")
    public static volatile boolean field1017 = true;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "[[I")
    public static int[][] field1018 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V", line = 5)
    public static void method616(int arg0) {
        int var1 = -68 / ((arg0 + 39) / 45);
        field1018 = null;
        field1015 = null;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V", line = 18)
    public static final void method617(byte arg0) {
        if (class736.field10316.method459()) {
            class736.field10316.method510(class106.field1476);
            class500.method2974((byte) 126);
            if (class419.field6265) {
                class408.method2599(-2, class106.field1476);
            } else {
                Dimension var1 = class106.field1476.getSize();
                class736.field10316.method455(class106.field1476, var1.width, var1.height);
            }
            class736.field10316.method446(class106.field1476);
        } else {
            class134.method950(0, class63.field916.field10200.method3848(17503), false);
        }
        if (arg0 <= -26) {
            field1011++;
            class459.method2805(79);
            class226.field3323 = true;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)Z", line = 48)
    public static final boolean method618(int arg0, int arg1, int arg2) {
        int var3 = -114 % ((-arg2 - 8) / 54);
        field1012++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lrg;I)V", line = 59)
    public final void method619(class645 arg0, int arg1) {
        field1014++;
        if (arg1 != 6) {
            this.method619(null, -60);
        }
        while (true) {
            int var3 = arg0.method3745(-6314);
            if (var3 == 0) {
                return;
            }
            this.method620(var3, arg0, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILrg;B)V", line = 81)
    private final void method620(int arg0, class645 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1009 = arg1.method3712((byte) 102);
            this.field1013 = arg1.method3745(-6314);
            this.field1019 = arg1.method3745(-6314);
        }
        if (arg2 < -119) {
            field1016++;
        }
    }
}
