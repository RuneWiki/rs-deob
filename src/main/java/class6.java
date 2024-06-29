import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class6 extends RuntimeException {

    @OriginalMember(owner = "mapview!ca", name = "g", descriptor = "Ljava/lang/String;")
    public String field60;

    @OriginalMember(owner = "mapview!ca", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field59;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lf;")
    public static class10 field54 = class23.method139("details)3dat", (byte) -89);

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lf;")
    public static class10 field57 = class23.method139("underlay)3dat", (byte) -127);

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "Lf;")
    public static class10 field55 = class23.method139("Please wait)3)3)3 Rendering Map", (byte) -111);

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "Z")
    public static boolean field58 = false;

    @OriginalMember(owner = "mapview!ca", name = "h", descriptor = "Lf;")
    public static class10 field61 = class23.method139("Hair Dressers", (byte) -84);

    @OriginalMember(owner = "mapview!ca", name = "i", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "mapview!ca", name = "j", descriptor = "I")
    public static volatile int field63 = 0;

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "Lf;")
    public static class10 field64 = class23.method139("Loading )3)3)3", (byte) -121);

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "Lea;")
    public static class9 field56;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lca;", line = 16)
    public static final class6 method35(Throwable arg0, String arg1) {
        class6 var2;
        if (arg0 instanceof class6) {
            var2 = (class6) arg0;
            var2.field60 = var2.field60 + ' ' + arg1;
        } else {
            var2 = new class6(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(III)V", line = 35)
    public static final void method36(int arg0, int arg1, int arg2) {
        class36.field506 = arg1 & arg2;
        class25.field276 = arg0 >> 6;
        class36.field508 = arg0 & 0x3F;
        class41.field538 = (class36.field508 << 6) + class36.field506;
        class1.field8 = arg2 >> 6;
        class36.method237(4);
    }

    @OriginalMember(owner = "mapview!ca", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 66)
    private class6(Throwable arg0, String arg1) {
        this.field60 = arg1;
        this.field59 = arg0;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(I)V", line = 86)
    public static void method37(int arg0) {
        field64 = null;
        field54 = null;
        if (arg0 == -25453) {
            field55 = null;
            field56 = null;
            field57 = null;
            field61 = null;
        }
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)B", line = 111)
    public static final byte method38(int arg0) {
        if (arg0 <= 75) {
            method38(100);
        }
        return class24.field258 == null ? 0 : class24.field258[class41.field538];
    }
}
