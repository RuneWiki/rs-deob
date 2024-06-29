import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class32 extends class86 {

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "[J")
    private long[] field516 = new long[10];

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    private int field510 = 0;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    private int field512 = 1;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    private int field521 = 256;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "J")
    private long field513 = class206.method1420(false);

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field515 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Li;")
    public static class88 field520 = class208.method1425(105, "welle:");

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Li;")
    public static class88 field522 = class208.method1425(105, "Angreifen");

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Li;")
    public static class88 field523 = class208.method1425(105, "<)4col> x");

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field526 = 0;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Llj;")
    public static class130 field518;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLnb;II)Lpf;")
    public static final class169 method203(boolean arg0, class144 arg1, int arg2, int arg3) {
        if (arg0) {
            field514++;
            return class47.method358(854010832, arg1, arg3, arg2) ? class237.method1573(-1) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
    public final int method204(int arg0, int arg1, int arg2) {
        field517++;
        int var4 = this.field521;
        int var5 = -75 / ((arg1 - 27) / 52);
        this.field521 = 300;
        int var6 = this.field512;
        this.field512 = 1;
        this.field513 = class206.method1420(false);
        if (this.field516[this.field511] == 0L) {
            this.field512 = var6;
            this.field521 = var4;
        } else if (this.field516[this.field511] < this.field513) {
            this.field521 = (int) ((long) (arg2 * 2560) / (this.field513 - this.field516[this.field511]));
        }
        if (this.field521 < 25) {
            this.field521 = 25;
        }
        if (this.field521 > 256) {
            this.field521 = 256;
            this.field512 = (int) ((long) arg2 - (this.field513 - this.field516[this.field511]) / 10L);
        }
        if (this.field512 > arg2) {
            this.field512 = arg2;
        }
        this.field516[this.field511] = this.field513;
        this.field511 = (this.field511 + 1) % 10;
        if (this.field512 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field516[var7] != 0L) {
                    this.field516[var7] += this.field512;
                }
            }
        }
        if (this.field512 < arg0) {
            this.field512 = arg0;
        }
        int var8 = 0;
        class21.method98((long) this.field512, (byte) 38);
        while (this.field510 < 256) {
            var8++;
            this.field510 += this.field521;
        }
        this.field510 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public final void method205(byte arg0) {
        field525++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field516[var2] = 0L;
        }
        int var3 = 35 % ((arg0 - 70) / 54);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method206(int arg0) {
        field522 = null;
        field515 = null;
        if (arg0 != -1) {
            field515 = null;
        }
        field518 = null;
        field523 = null;
        field520 = null;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class32() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field516[var1] = this.field513;
        }
    }
}
