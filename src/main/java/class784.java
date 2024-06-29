import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class784 extends class659 {

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "D")
    public double field10784;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "[[S")
    public short[][] field10786;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field10781 = new BigInteger("a399cfc2263d0378f7c40db20a3e00a081247f39b24e3c57f8c392465337d6f1650d2024774986824928b8d50ff6c8ed83aa0673d6b95948a1a3ccd612912dbb", 16);

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "Lmw;")
    public static class517 field10787 = new class517(43, 7);

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public static int field10782;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
    public static int field10783;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "I")
    public static int field10785;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(B)V", line = 3)
    public static final void method4302(byte arg0) {
        class645.method3578((byte) 80);
        if (arg0 != 115) {
            field10781 = null;
        }
        field10785++;
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(B)J", line = 14)
    public final long method4303(byte arg0) {
        if (arg0 == -62) {
            field10783++;
            return (long) (this.field10786[0].length | this.field10786.length << 0);
        } else {
            return -103L;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 35)
    public static void method4304(int arg0) {
        field10781 = null;
        if (arg0 == 16) {
            field10787 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([II[ILee;II)Lqb;", line = 46)
    public static final class237 method4305(int[] arg0, int arg1, int[] arg2, class703 arg3, int arg4, int arg5) {
        field10782++;
        int var6 = -29 / ((38 - arg4) / 41);
        if (!arg3.method2784(true, class415.field5986, class325.field4613)) {
            int[] var11 = new int[arg1 * arg5];
            for (int var12 = 0; var12 < arg5; var12++) {
                int var13 = arg1 * var12 + arg0[var12];
                for (int var14 = 0; var14 < arg2[var12]; var14++) {
                    var11[var13++] = -16777216;
                }
            }
            return new class237(arg3, arg1, arg5, var11);
        }
        byte[] var7 = new byte[arg1 * arg5];
        for (int var8 = 0; var8 < arg5; var8++) {
            int var9 = arg1 * var8 + arg0[var8];
            for (int var10 = 0; var10 < arg2[var8]; var10++) {
                var7[var9++] = -1;
            }
        }
        return new class237(arg3, arg1, arg5, var7);
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "([[SD)V", line = 105)
    public class784(short[][] arg0, double arg1) {
        this.field10784 = arg1;
        this.field10786 = arg0;
    }
}
