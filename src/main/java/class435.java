import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class435 {

    @OriginalMember(owner = "client!io", name = "d", descriptor = "Lda;")
    public class59 field6081 = null;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "Lfp;")
    public class323 field6085 = null;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "[F")
    public static float[] field6086 = new float[4];

    @OriginalMember(owner = "client!io", name = "g", descriptor = "Lqe;")
    public static class465 field6084 = new class465(60, 7);

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!io", name = "f", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!io", name = "e", descriptor = "[Lgs;")
    public static class43[] field6082;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[[[B")
    public static byte[][][] field6078;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2627(boolean arg0) {
        field6086 = null;
        field6082 = null;
        field6084 = null;
        if (arg0) {
            method2627(false);
        }
        field6078 = null;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lda;)V", line = 36)
    public class435(class59 arg0) {
        this.field6081 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lda;Lfp;)V", line = 43)
    public class435(class59 arg0, class323 arg1) {
        this.field6081 = arg0;
        this.field6085 = arg1;
    }
}
