import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class499 {

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "Lgd;")
    public class696 field6405;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field6396 = -1;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "Luw;")
    public static class208 field6394 = new class208(121, 7);

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "[I")
    public static int[] field6402 = new int[2];

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Z")
    public static boolean field6406 = false;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "[C")
    public static char[] field6408 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "F")
    public static float field6407;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public void method197(byte arg0) {
        int var2 = 66 / ((arg0 + 69) / 46);
        field6393++;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
    public void method203(byte arg0) {
        field6397++;
        if (arg0 != 13) {
            field6408 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public void method199(int arg0) {
        field6401++;
        if (arg0 >= -28) {
            field6402 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)Z")
    public abstract boolean method200(boolean arg0);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V")
    public void method1766(byte arg0) {
        int var2 = 12 / ((-arg0 - 41) / 33);
        field6400++;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V")
    public void method198(byte arg0) {
        int var2 = 84 % ((-arg0 - 66) / 36);
        field6399++;
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public abstract void method205(int arg0);

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
    public static final void method2768(int arg0) {
        int var1 = -72 / ((22 - arg0) / 50);
        for (int var2 = 0; var2 < 100; var2++) {
            class438.field5762[var2] = null;
        }
        field6395++;
        class138.field1827 = 0;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V")
    public static void method2769(int arg0) {
        if (arg0 == 7) {
            field6394 = null;
            field6402 = null;
            field6408 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILsfa;I)V")
    public abstract void method206(int arg0, class132 arg1, int arg2);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2770(int arg0, byte[] arg1) {
        field6404++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class642.method3480(arg1, 0, var3, 0, var2);
        int var4 = -83 / ((arg0 - 88) / 32);
        return var3;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/net/Socket;I)Lrga;")
    public static final class308 method2771(int arg0, Socket arg1, int arg2) throws IOException {
        field6403++;
        if (arg0 != 121) {
            field6406 = true;
        }
        return new class656(arg1, arg2);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
    public abstract void method202(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lgd;)V")
    public class499(class696 arg0) {
        this.field6405 = arg0;
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V")
    public void method196(int arg0) {
        field6398++;
        if (arg0 != 7) {
            field6402 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V")
    public abstract void method201(int arg0, boolean arg1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BII)V")
    public abstract void method204(byte arg0, int arg1, int arg2);
}
