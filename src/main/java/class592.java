import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class592 extends class87 {

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "Lbw;")
    public class28 field8340;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8339 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "[[Z")
    public static boolean[][] field8338;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)I")
    public static final int method3459(byte arg0, int arg1) {
        int var2 = -122 % ((67 - arg0) / 56);
        field8341++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
    public static void method3460(byte arg0) {
        if (arg0 != -126) {
            method3460((byte) -38);
        }
        field8339 = null;
        field8338 = null;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Llba;II[B)V")
    public class592(class223 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8340 = arg0.method1407(arg1, arg2, arg3, (byte) 92, false, class29.field238);
        this.field8340.method129(false, true, false);
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Llba;II[I)V")
    public class592(class223 arg0, int arg1, int arg2, int[] arg3) {
        this.field8340 = arg0.method1447((byte) -60, arg2, arg1, false, arg3);
        this.field8340.method129(false, true, false);
    }
}
