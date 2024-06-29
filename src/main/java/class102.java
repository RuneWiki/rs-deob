import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class102 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2204 = 127;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Llc;")
    public static class69 field2215 = class69.method470((byte) -96, " from your ignore list first");

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2218 = 0;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Llc;")
    public static class69 field2212 = class69.method470((byte) -118, "Side panel redrawn");

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Llc;")
    public static class69 field2217 = class69.method470((byte) -106, "::fpson");

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Llc;")
    public static class69 field2219 = class69.method470((byte) -101, " million @whi@(X");

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Lna;")
    public static class79 field2211;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILcc;[B)V")
    public static final void method773(int arg0, int arg1, class16 arg2, byte[] arg3) {
        class23 var4 = new class23();
        var4.field490 = 0;
        var4.field472 = arg0;
        var4.field486 = arg3;
        var4.field485 = arg2;
        if (arg1 < 80) {
            field2217 = null;
        }
        field2205++;
        class80 var5 = class91.field1986;
        synchronized (class91.field1986) {
            class91.field1986.method577(var4, -49);
        }
        class63.method404((byte) -34);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
    public static final int method774(int arg0) {
        field2213++;
        return arg0 <= 110 ? -100 : class122.field2640++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Graphics;I)V")
    public static final void method775(Graphics arg0, int arg1) {
        class36.field720.method69(arg0, 4, true, 4);
        field2207++;
        if (arg1 != 14990) {
            method773(-6, 106, null, null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method776(int arg0) {
        field2219 = null;
        field2215 = null;
        field2211 = null;
        field2217 = null;
        if (arg0 < 23) {
            method775(null, 28);
        }
        field2212 = null;
    }
}
