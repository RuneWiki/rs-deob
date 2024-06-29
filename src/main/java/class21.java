import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field298 = 0;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lmb;")
    public static class156 field299 = new class156();

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ljd;")
    public static class85 field304 = class221.method1499("null", (byte) 97);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lnj;")
    public static class138 field301;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILik;I)V")
    private final void method144(int arg0, class247 arg1, int arg2) {
        if (arg2 == 5) {
            this.field298 = arg1.method1694((byte) -100);
        }
        field302++;
        if (arg0 != 14279) {
            field299 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method145(int arg0) {
        if (class24.field346 != null) {
            class24.field346.method263(26595);
        }
        if (class247.field4223 != null) {
            class247.field4223.method263(26595);
        }
        if (arg0 != 30868) {
            method146((byte) -64);
        }
        field297++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method146(byte arg0) {
        field299 = null;
        field301 = null;
        field304 = null;
        if (arg0 < 106) {
            method145(5);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILik;)V")
    public final void method147(int arg0, class247 arg1) {
        if (arg0 != -6) {
            return;
        }
        field300++;
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                return;
            }
            this.method144(14279, arg1, var3);
        }
    }
}
