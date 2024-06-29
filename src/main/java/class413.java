import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class413 {

    @OriginalMember(owner = "client!aka", name = "d", descriptor = "[S")
    public short[] field5784;

    @OriginalMember(owner = "client!aka", name = "e", descriptor = "J")
    public long field5785;

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "[I")
    public int[] field5786;

    @OriginalMember(owner = "client!aka", name = "c", descriptor = "[S")
    public short[] field5783;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "Liga;")
    public static class91 field5781 = new class91(0, 3);

    @OriginalMember(owner = "client!aka", name = "g", descriptor = "[Lib;")
    public static class723[] field5787 = new class723[2048];

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "Lfc;")
    public static class641 field5782;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V", line = 9)
    public static void method2517(int arg0) {
        field5781 = null;
        field5787 = null;
        int var1 = -86 / ((arg0 + 1) / 39);
        field5782 = null;
    }

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)V", line = 23)
    public static final void method2518(int arg0) {
        class157.field2036 = arg0;
        for (int var1 = 0; var1 < class414.field5796; var1++) {
            for (int var2 = 0; var2 < class704.field9799; var2++) {
                if (class59.field688[arg0][var1][var2] == null) {
                    class59.field688[arg0][var1][var2] = new class472(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(J[I[S[S)V", line = 48)
    public class413(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field5784 = arg2;
        this.field5785 = arg0;
        this.field5786 = arg1;
        this.field5783 = arg3;
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "()V", line = 59)
    protected class413() {
    }
}
