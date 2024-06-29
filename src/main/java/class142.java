import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class142 {

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Lnq;")
    private class325 field1897;

    @OriginalMember(owner = "client!su", name = "f", descriptor = "J")
    public long field1898;

    @OriginalMember(owner = "client!su", name = "b", descriptor = "Z")
    public static boolean field1894 = false;

    @OriginalMember(owner = "client!su", name = "g", descriptor = "[[I")
    public static int[][] field1899 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!su", name = "a", descriptor = "Z")
    public static boolean field1893 = false;

    @OriginalMember(owner = "client!su", name = "c", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        this.field1897.method2054(0, this.field1898);
        field1895++;
        super.finalize();
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lnq;J[Lpb;)V", line = 19)
    public class142(class325 arg0, long arg1, class473[] arg2) {
        this.field1897 = arg0;
        this.field1898 = arg1;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 30)
    public static void method953(int arg0) {
        field1899 = null;
        if (arg0 != 12) {
            method953(-111);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lqa;I)V", line = 47)
    public static final void method954(class165 arg0, int arg1) {
        field1896++;
        if (arg1 != 24307) {
            field1893 = true;
        }
        if (class139.field1850) {
            class425.method2596(-13194, arg0);
        } else {
            class89.method600(arg0, (byte) -31);
        }
    }
}
