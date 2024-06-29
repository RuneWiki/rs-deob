import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public abstract class class30 {

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Ls;")
    public static class34 field400 = class9.method35("Candle Shop", 220);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Ls;")
    public static class34 field402 = class9.method35("Silk Trader", 220);

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Ls;")
    public static class34 field401 = class9.method35("Axe Shop", 220);

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "I")
    public static int field404 = 0;

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "Ls;")
    public static class34 field403 = class9.method35("Please wait)3)3)3 Rendering Map", 220);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(B)V", line = 20)
    public static final void method202(byte arg0) {
        class28.field383 = null;
        class14.field128 = null;
        class9.field91 = null;
        class34.field468 = null;
        mapview.field293 = null;
        class27.field377 = null;
        if (arg0 != -82) {
            method205((byte) -11);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(B)V", line = 50)
    public static void method205(byte arg0) {
        field400 = null;
        field403 = null;
        field401 = null;
        if (arg0 != -51) {
            field402 = null;
        }
        field402 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(B)[B")
    public abstract byte[] method203(byte arg0);

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([BI)V")
    public abstract void method204(byte[] arg0, int arg1);
}
