import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class263 {

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "Ljava/lang/String;")
    public String field3876;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public int field3879;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "[I")
    public static int[] field3875 = new int[3];

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "Lqj;")
    public static class535 field3874 = new class535(260);

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "[[[I")
    public static int[][][] field3880 = new int[2][][];

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!kw", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field3877++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1773(int arg0, int arg1) {
        field3878++;
        if (arg0 != 32051) {
            method1774((byte) 88);
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 54)
    public class263(String arg0, int arg1) {
        this.field3876 = arg0;
        this.field3879 = arg1;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V", line = 63)
    public static void method1774(byte arg0) {
        if (arg0 == -94) {
            field3875 = null;
            field3874 = null;
            field3880 = null;
        }
    }
}
