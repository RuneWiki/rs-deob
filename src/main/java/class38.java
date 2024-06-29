import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class38 extends class154 {

    @OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!uja", name = "r", descriptor = "[Z")
    public boolean[] field646;

    @OriginalMember(owner = "client!uja", name = "m", descriptor = "[[I")
    public int[][] field641;

    @OriginalMember(owner = "client!uja", name = "p", descriptor = "[I")
    public int[] field644;

    @OriginalMember(owner = "client!uja", name = "o", descriptor = "[I")
    public int[] field643;

    @OriginalMember(owner = "client!uja", name = "k", descriptor = "Loaa;")
    public static class305 field639 = new class305();

    @OriginalMember(owner = "client!uja", name = "j", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!uja", name = "l", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!uja", name = "n", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Ljf;", line = 6)
    public static final class229 method233(int arg0) {
        if (arg0 != 0) {
            field639 = null;
        }
        field638++;
        return class64.field875;
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(I)V", line = 21)
    public static void method234(int arg0) {
        if (arg0 != 0) {
            method233(-117);
        }
        field639 = null;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IILjava/util/Random;)I", line = 31)
    public static final int method235(int arg0, int arg1, Random arg2) {
        field642++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class461.method2656(0, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4 = 124 / ((-arg1 - 41) / 54);
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var3 <= var5);
            return class361.method2217(38348543, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(I[B)V", line = 70)
    public class38(int arg0, byte[] arg1) {
        this.field637 = arg0;
        class93 var3 = new class93(arg1);
        this.field645 = var3.method793((byte) 24);
        this.field646 = new boolean[this.field645];
        this.field641 = new int[this.field645][];
        this.field644 = new int[this.field645];
        this.field643 = new int[this.field645];
        for (int var4 = 0; var4 < this.field645; var4++) {
            this.field643[var4] = var3.method793((byte) 28);
            if (this.field643[var4] == 6) {
                this.field643[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field645; var5++) {
            this.field646[var5] = var3.method793((byte) 72) == 1;
        }
        for (int var6 = 0; var6 < this.field645; var6++) {
            this.field644[var6] = var3.method763(82);
        }
        for (int var7 = 0; var7 < this.field645; var7++) {
            this.field641[var7] = new int[var3.method793((byte) 78)];
        }
        for (int var8 = 0; var8 < this.field645; var8++) {
            for (int var9 = 0; var9 < this.field641[var8].length; var9++) {
                this.field641[var8][var9] = var3.method793((byte) 44);
            }
        }
    }
}
