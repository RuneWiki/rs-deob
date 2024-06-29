import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class517 extends class513 {

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public int field7561;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field7565;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "[Z")
    public boolean[] field7563;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "[I")
    public int[] field7564;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "[I")
    public int[] field7567;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "[[I")
    public int[][] field7562;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "J")
    public static long field7568;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "Lwd;")
    public static class248 field7570;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field7569;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 12)
    public static void method3061(int arg0) {
        if (arg0 == -10115) {
            field7569 = null;
            field7570 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(I[B)V", line = 22)
    public class517(int arg0, byte[] arg1) {
        this.field7561 = arg0;
        class389 var3 = new class389(arg1);
        this.field7565 = var3.method2229(255);
        this.field7563 = new boolean[this.field7565];
        this.field7564 = new int[this.field7565];
        this.field7567 = new int[this.field7565];
        this.field7562 = new int[this.field7565][];
        for (int var4 = 0; var4 < this.field7565; var4++) {
            this.field7564[var4] = var3.method2229(255);
            if (this.field7564[var4] == 6) {
                this.field7564[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field7565; var5++) {
            this.field7563[var5] = var3.method2229(255) == 1;
        }
        for (int var6 = 0; var6 < this.field7565; var6++) {
            this.field7567[var6] = var3.method2260(-76);
        }
        for (int var7 = 0; var7 < this.field7565; var7++) {
            this.field7562[var7] = new int[var3.method2229(255)];
        }
        for (int var8 = 0; var8 < this.field7565; var8++) {
            for (int var9 = 0; var9 < this.field7562[var8].length; var9++) {
                this.field7562[var8][var9] = var3.method2229(255);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 87)
    public static final int method3062(Random arg0, int arg1, int arg2) {
        field7566++;
        if (arg1 != 26100) {
            return -115;
        } else if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class326.method1894(arg2, 32)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class399.method2413(112, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IBI)Lga;", line = 118)
    public static final class370 method3063(int arg0, byte arg1, int arg2) {
        field7560++;
        class370 var3 = new class370();
        var3.field4985 = arg2 + 1 + 5;
        var3.field4978 = -1;
        var3.field4966 = arg0 + 5 + 1;
        var3.field4975 = -1;
        var3.field4979 = new int[var3.field4985][var3.field4966];
        var3.method2138((byte) -128);
        if (arg1 != -53) {
            method3061(-39);
        }
        return var3;
    }
}
