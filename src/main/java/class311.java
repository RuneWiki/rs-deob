import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class311 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ldl;")
    public class39 field5379 = new class39();

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field5374 = 0;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lsf;")
    public static class108 field5376 = class140.method973(255, "Sprites charg-Bs");

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field5375 = 0;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field5380 = 0;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field5370 = 0;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Z")
    public static boolean field5385 = false;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lsf;")
    public static class108 field5371 = class140.method973(255, "Regarder dans cette direction");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lsf;")
    public static class108 field5386 = class140.method973(255, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Ldl;")
    private class39 field5384;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[[[B")
    public static byte[][][] field5382;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Ldl;", line = 57)
    public final class39 method2166(int arg0) {
        if (arg0 != 9448) {
            this.field5379 = (class39) null;
        }
        field5378++;
        class39 var2 = this.field5379.field549;
        if (this.field5379 == var2) {
            this.field5384 = null;
            return null;
        } else {
            this.field5384 = var2.field549;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 92)
    public class311() {
        this.field5379.field538 = this.field5379;
        this.field5379.field549 = this.field5379;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Ldl;", line = 109)
    public final class39 method2167(int arg0) {
        field5387++;
        class39 var2 = this.field5384;
        if (this.field5379 == var2) {
            this.field5384 = null;
            return null;
        } else if (arg0 == 0) {
            this.field5384 = var2.field549;
            return var2;
        } else {
            return (class39) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 134)
    public static void method2168(byte arg0) {
        field5371 = null;
        field5376 = null;
        if (arg0 != -60) {
            field5380 = -110;
        }
        field5386 = null;
        field5382 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I", line = 147)
    public final int method2169(byte arg0) {
        if (arg0 != 18) {
            field5385 = true;
        }
        field5377++;
        int var2 = 0;
        class39 var3 = this.field5379.field549;
        while (this.field5379 != var3) {
            var3 = var3.field549;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 173)
    public static final byte[] method2170(Object arg0, boolean arg1, int arg2) {
        field5372++;
        if (arg2 > -23) {
            method2170((Object) null, true, -109);
        }
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg1 ? class247.method1697((byte) 46, var4) : var4;
        } else if ((arg0 instanceof class207)) {
            class207 var3 = (class207) arg0;
            return var3.method215(-112);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ldl;I)V", line = 209)
    public final void method2171(class39 arg0, int arg1) {
        if (arg1 < 28) {
            return;
        }
        if (arg0.field538 != null) {
            arg0.method268(17450);
        }
        arg0.field549 = this.field5379;
        arg0.field538 = this.field5379.field538;
        field5373++;
        arg0.field538.field549 = arg0;
        arg0.field549.field538 = arg0;
    }
}
