import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class704 extends class329 {

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "I")
    public static int field9936 = 0;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "I")
    public int field9931;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
    public int field9937;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "Lrga;")
    public class280 field9930;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "Lks;")
    public class30 field9929;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "[[[J")
    public static long[][][] field9932;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public final void method3946(byte arg0) {
        field9935++;
        if (class219.field2683 < class461.field5879.length) {
            if (arg0 >= -42) {
                this.field9929 = null;
            }
            class461.field5879[class219.field2683++] = this;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method3947(int arg0) {
        int var1 = -99 / ((arg0 + 50) / 61);
        field9932 = null;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public static final void method3948(int arg0) {
        class450 var1 = class190.field2377;
        synchronized (class190.field2377) {
            class190.field2377.method2412((byte) -121);
        }
        field9934++;
        if (arg0 == -1) {
            class450 var2 = class19.field290;
            synchronized (class19.field290) {
                class19.field290.method2412((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
    public static final void method3949(byte arg0) {
        if (arg0 >= -80) {
            field9932 = null;
        }
        field9933++;
        class304.field3746 = -1;
        class126.field1583 = 1;
        long var1 = 0L;
        if (class180.field2319 == null) {
            class544.method2939((byte) 52, 35);
        } else {
            class630 var3 = new class630(class384.method2072(class493.method2659((byte) 100, class180.field2319), 16));
            long var4 = var3.method3527(false);
            class418.field5253 = var3.method3527(false);
            class174.method1097(true, "", -106, class577.method3181((byte) -127, var4));
        }
    }
}
