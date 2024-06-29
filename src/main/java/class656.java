import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class656 extends class167 {

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    private int field8993 = 0;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "Lik;")
    public static class207 field8994 = new class207();

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public static int field8997 = -1;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Lgda;")
    public static class53 field8995 = new class53(58, 15);

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "[J")
    public static long[] field8998 = new long[10];

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "[[[Lwq;")
    public static class165[][][] field8999;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V")
    public final void method1056(boolean arg0, int arg1) {
        ++field8996;
        int var3 = super.field2293.field2610.method12(class192.field2561, super.field2287.method656(), -65) - -super.field2293.field2611;
        int var4 = super.field2293.field2605.method826(super.field2287.method670(), arg1 + 3340, class191.field2553) - -super.field2293.field2607;
        super.field2287.method664((float) (super.field2287.method656() / 2 + var3), (float) (super.field2287.method670() / 2 + var4), 4096, this.field8993);
        this.field8993 += ((class704) super.field2293).field9801;
        if (arg1 != -3340) {
            field8994 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
    public static void method3604(int arg0) {
        field8994 = null;
        field8998 = null;
        if (arg0 != 58) {
            field8995 = null;
        }
        field8995 = null;
        field8999 = null;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lfp;Led;)V")
    public class656(class323 arg0, class704 arg1) {
        super(arg0, arg1);
    }
}
