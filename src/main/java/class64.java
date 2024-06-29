import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class64 {

    @OriginalMember(owner = "client!t", name = "h", descriptor = "B")
    private byte field803;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static volatile int field799 = -1;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[I")
    public static int[] field802 = new int[100];

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field801 = 1;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field810 = new String[100];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
    public static int[] field809;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)I", line = 9)
    public final int method465(int arg0) {
        field808++;
        int var2 = 115 % ((arg0 - 28) / 60);
        return (this.field803 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 26)
    public static void method466(int arg0) {
        field810 = null;
        field802 = null;
        if (arg0 != 1) {
            method467((class140) null, true, -14, (class140) null);
        }
        field809 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lfh;ZILfh;)V", line = 38)
    public static final void method467(class140 arg0, boolean arg1, int arg2, class140 arg3) {
        class58.field739 = arg1;
        class124.field1650 = arg3;
        field797++;
        if (arg2 == -9746) {
            class294.field4284 = arg0;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I", line = 51)
    public final int method468(int arg0) {
        field796++;
        return arg0 == -1 ? this.field803 & 0x7 : -125;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 80)
    public class64() {
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lfd;)V", line = 82)
    public class64(class299 arg0) {
        this.field803 = arg0.method2104(116);
        this.field807 = arg0.method2083((byte) -120);
        this.field806 = arg0.method2062(-25795);
        this.field798 = arg0.method2062(-25795);
        this.field804 = arg0.method2062(-25795);
        this.field805 = arg0.method2062(-25795);
    }
}
