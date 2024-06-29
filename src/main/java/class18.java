import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class18 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field343 = "Unable to find ";

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field342 = "Examine";

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Lgd;")
    public static class325 field347 = new class325(50);

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
    public static int[] field348 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field349 = 0;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Laj;B)V", line = 5)
    public final void method198(class1 arg0, byte arg1) {
        field340++;
        if (arg1 > -8) {
            this.field345 = -127;
        }
        while (true) {
            int var3 = arg0.method15((byte) -48);
            if (var3 == 0) {
                return;
            }
            this.method199(var3, -45, arg0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILaj;)V", line = 32)
    private final void method199(int arg0, int arg1, class1 arg2) {
        if (arg0 == 1) {
            this.field341 = arg2.method56(19612);
            this.field346 = arg2.method15((byte) 115);
            this.field345 = arg2.method15((byte) 62);
        }
        if (arg1 < -10) {
            field344++;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 58)
    public static void method200(int arg0) {
        int var1 = 80 % ((arg0 + 24) / 45);
        field348 = null;
        field342 = null;
        field347 = null;
        field343 = null;
    }
}
