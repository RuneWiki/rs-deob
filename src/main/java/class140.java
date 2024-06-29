import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class140 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Loh;")
    public static class258 field2380 = class153.method1046("<col=ffffff>", 104);

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field2383 = 2;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lmi;")
    public static class12 field2387 = new class12();

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[I")
    public static int[] field2390 = new int[2048];

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2389 = 0;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Loh;")
    public static class258 field2391 = class153.method1046("welle:", 100);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field2384;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 30)
    public static void method964(int arg0) {
        field2387 = null;
        field2391 = null;
        field2380 = null;
        field2390 = null;
        if (arg0 != 2) {
            method965(true, 104, (class258) null, (class258) null);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZILoh;Loh;)V", line = 45)
    public static final void method965(boolean arg0, int arg1, class258 arg2, class258 arg3) {
        class122.method893(arg3, (class258) null, arg1, arg2, -1559, -1);
        if (arg0) {
            field2386 = -25;
        }
        field2385++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILva;B)V", line = 68)
    private final void method966(int arg0, class235 arg1, byte arg2) {
        field2379++;
        if (arg2 >= -10) {
            field2387 = (class12) null;
        }
        if (arg0 == 1) {
            this.field2388 = arg1.method1615(-30);
            this.field2381 = arg1.method1589(110);
            this.field2384 = arg1.method1589(98);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lva;I)V", line = 113)
    public final void method967(class235 arg0, int arg1) {
        if (arg1 <= 30) {
            return;
        }
        field2382++;
        while (true) {
            int var3 = arg0.method1589(115);
            if (var3 == 0) {
                return;
            }
            this.method966(var3, arg0, (byte) -32);
        }
    }
}
