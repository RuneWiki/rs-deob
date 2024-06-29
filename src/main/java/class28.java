import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class28 extends class124 {

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Le;")
    public static class191 field403 = class54.method368("::gc", 2047);

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "Lng;")
    public static class121 field409;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "Lna;")
    public static class19 field404;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "(I)Lve;")
    public static final class180 method201(int arg0) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field400;
            try {
                return (class180) Class.forName("ph").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V")
    private class28(int arg0) {
        super(0, true);
        this.field408 = 4096;
        this.field408 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class28() {
        this(4096);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field407;
        class213 var10 = null;
        for (class213 var11 = (class213) class129.field2154.method1173(123); var11 != null; var11 = (class213) class129.field2154.method1175(arg3 + -256)) {
            if (var11.field3758 == arg4 && ~var11.field3770 == ~arg1 && ~var11.field3767 == ~arg5 && ~var11.field3765 == ~arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class213();
            var10.field3765 = arg9;
            var10.field3758 = arg4;
            var10.field3767 = arg5;
            var10.field3770 = arg1;
            class126.method853(var10, (byte) 127);
            class129.field2154.method1176(var10, (byte) 38);
        }
        var10.field3775 = arg6;
        var10.field3771 = arg2;
        var10.field3766 = arg7;
        if (arg3 != 255) {
            method204(false, 27);
        }
        var10.field3756 = arg0;
        var10.field3763 = arg8;
    }

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "(I)V")
    public static void method203(int arg0) {
        field409 = null;
        if (arg0 != 0) {
            field402 = 10;
        }
        field403 = null;
        field404 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field401;
        if (arg0 <= 68) {
            this.method131((byte) -48, 45);
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            class58.method389(var3, 0, class64.field1132, this.field408);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
    public static final void method204(boolean arg0, int arg1) {
        if (!arg0) {
            method203(89);
        }
        class5.field42 = arg1;
        class170.field2878 = null;
        class141.field2344 = -1;
        class207.field3690 = -1;
        class114.field1888 = 0;
        class49.field884 = false;
        ++field405;
        class273.field4825 = 1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            field409 = null;
        }
        ++field406;
        if (arg0 == 0) {
            this.field408 = (arg1.method1580(-34) << 12) / 255;
        }
    }
}
