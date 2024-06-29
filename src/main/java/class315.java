import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class315 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lfd;")
    private class365 field4478;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lgk;")
    public static class331 field4481 = new class331("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lbg;")
    public static class324 field4483 = new class324(53, -1);

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lpk;")
    public static class133 field4484 = new class133();

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[[Z")
    public static boolean[][] field4485 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
    public static int[] field4486 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 4)
    public static void method1965(byte arg0) {
        field4484 = null;
        field4481 = null;
        field4483 = null;
        field4485 = null;
        if (arg0 != -10) {
            method1965((byte) -104);
        }
        field4486 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILhr;)V", line = 19)
    public static final void method1966(int arg0, int arg1, int arg2, class363 arg3) {
        class148 var4 = class453.method2729(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field2082 = arg3;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I", line = 29)
    public static final int method1967(int arg0, byte arg1) {
        field4479++;
        return arg1 < 59 ? 50 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lfd;II)V", line = 39)
    public class315(class365 arg0, int arg1, int arg2) {
        this.field4480 = arg2;
        this.field4478 = arg0;
    }

    @OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        field4482++;
        this.field4478.method2191(this.field4480, (byte) 51);
        super.finalize();
    }
}
