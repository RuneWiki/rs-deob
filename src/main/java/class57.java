import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class57 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
    public boolean field688 = true;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[Lv;")
    public static class80[] field690;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[[[I")
    public static int[][][] field687;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 9)
    public static void method335(int arg0) {
        field690 = null;
        if (arg0 <= 21) {
            method335(115);
        }
        field687 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 20)
    public static final void method336(int arg0) {
        field686++;
        class270.field4255.method1241(117);
        if (arg0 != -13641) {
            method335(-48);
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIZ)V", line = 42)
    public class57(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field693 = arg3;
        this.field691 = arg5;
        this.field696 = arg2;
        this.field695 = arg0;
        this.field692 = arg4;
        this.field688 = arg6;
        this.field689 = arg1;
    }
}
