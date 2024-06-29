import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class235 implements class715 {

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!dia", name = "d", descriptor = "Law;")
    public static class76 field3312 = new class76();

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!dia", name = "e", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V", line = 8)
    public static void method1480(byte arg0) {
        if (arg0 != 64) {
            method1482((byte) 20);
        }
        field3312 = null;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1481(int arg0, int arg1) {
        field3313++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else if (arg1 <= 100) {
            return -108;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!dia", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
    public final String toString() {
        field3311++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)V", line = 55)
    public static final void method1482(byte arg0) {
        field3309++;
        class461.method2622(arg0 - 1409991394);
        class640.method3500(22050, class411.field5711.field3875.method3931(true) == 1, 2, false);
        class453.field6187 = class578.method3168(0, 22050, class295.field4217, (byte) 27, class66.field828);
        class75.method606(true, class729.method4091((byte) -121, null), true);
        class507.field6770 = class578.method3168(1, 2048, class295.field4217, (byte) 27, class66.field828);
        if (arg0 != -117) {
            method1480((byte) 91);
        }
        class507.field6770.method1796(class603.field7927, 99);
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 71)
    public class235(String arg0, int arg1) {
        this.field3310 = arg1;
    }
}
