import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public int field138 = 128;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public int field140 = 128;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field132;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "[[[I")
    public static int[][][] field142 = new int[2][][];

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lds;", line = 5)
    public final class12 method64(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field135++;
            return new class12(this.field143, this.field138, this.field140, this.field132, this.field139, this.field137);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 17)
    public static void method65(int arg0) {
        field142 = null;
        if (arg0 != 2) {
            method65(6);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lds;I)V", line = 27)
    public final void method66(class12 arg0, int arg1) {
        if (arg1 <= 86) {
            method65(108);
        }
        this.field143 = arg0.field143;
        this.field138 = arg0.field138;
        this.field140 = arg0.field140;
        this.field132 = arg0.field132;
        field133++;
        this.field139 = arg0.field139;
        this.field137 = arg0.field137;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(I)V", line = 68)
    public class12(int arg0) {
        this.field143 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIII)V", line = 75)
    private class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field138 = arg1;
        this.field132 = arg3;
        this.field143 = arg0;
        this.field140 = arg2;
        this.field137 = arg5;
        this.field139 = arg4;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I", line = 53)
    public static final int method67(int arg0, int arg1) {
        field134++;
        int var2 = -120 % ((arg0 - 34) / 63);
        return arg1 & 0x3FF;
    }
}
