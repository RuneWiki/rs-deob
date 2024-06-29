import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Z")
    public boolean field863 = true;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field867 = new Object();

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
    public int[] field875 = new int[500];

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field874 = 0;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "[I")
    public int[] field876 = new int[500];

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
    public static int[] field862 = new int[2048];

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lfc;")
    private static class39 field868 = class90.method774("System update in: ", -121);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[Lub;")
    public static class138[] field865 = new class138[4];

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "[[S")
    public static short[][] field866 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field872 = -1;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lfc;")
    public static class39 field864 = field868;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[I")
    public static int[] field871 = new int[1000];

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lue;")
    public static class141 field873;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "[[[B")
    public static byte[][][] field870;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 5)
    public static void method371(int arg0) {
        if (arg0 < 14) {
            return;
        }
        field862 = null;
        field865 = null;
        field871 = null;
        field864 = null;
        field873 = null;
        field868 = null;
        field870 = null;
        field866 = null;
    }

    @OriginalMember(owner = "client!eb", name = "run", descriptor = "()V", line = 43)
    public final void run() {
        field869++;
        while (this.field863) {
            Object var1 = this.field867;
            synchronized (this.field867) {
                if (this.field874 < 500) {
                    this.field876[this.field874] = class12.field314;
                    this.field875[this.field874] = class131.field3322;
                    this.field874++;
                }
            }
            class61.method609(-67, 50L);
        }
    }
}
