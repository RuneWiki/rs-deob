import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class57 {

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "B")
    public byte field793;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field786;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!hr", name = "q", descriptor = "Z")
    public static boolean field802 = true;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "Lhr;")
    public class57 field806;

    @OriginalMember(owner = "client!hr", name = "p", descriptor = "[[I")
    public static int[][] field801;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 18)
    public static void method384(byte arg0) {
        int var1 = 1 / ((arg0 - 70) / 49);
        field801 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)Lou;", line = 28)
    public final class160 method385(boolean arg0) {
        if (!arg0) {
            this.method385(false);
        }
        field789++;
        return class447.method2662(this.field804, (byte) -79);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IBII)Lhr;", line = 47)
    public final class57 method386(int arg0, byte arg1, int arg2, int arg3) {
        field791++;
        if (arg1 != -128) {
            this.field806 = null;
        }
        return new class57(this.field804, arg0, arg2, arg3, this.field793);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(IIIIB)V", line = 57)
    public class57(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field793 = arg4;
        this.field786 = arg2;
        this.field804 = arg0;
        this.field790 = arg3;
        this.field800 = arg1;
    }
}
