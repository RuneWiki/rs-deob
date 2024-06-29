import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class113 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Li;")
    private class58 field1725 = new class58(256);

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "Li;")
    private class58 field1737 = new class58(256);

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Lgi;")
    private class164 field1733;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Lgi;")
    private class164 field1726;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Z")
    public static boolean field1732 = false;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method784(String arg0, byte arg1) {
        field1734++;
        if (arg1 != -80) {
            method784((String) null, (byte) -27);
        }
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI[II)Lhh;")
    private final class126 method785(byte arg0, int arg1, int[] arg2, int arg3) {
        field1730++;
        int var5 = arg3 ^ (arg1 >>> 12 | (arg1 & 0xF0000FFF) << 4);
        int var6 = var5 | arg1 << 16;
        if (arg0 != -92) {
            this.field1733 = null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class126 var9 = (class126) this.field1737.method371(arg0 ^ 0xFFFFFFF2, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class20 var10 = (class20) this.field1725.method371(-110, var7);
            if (var10 == null) {
                var10 = class20.method157(this.field1733, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1725.method368(var7, var10, -106);
            }
            class126 var11 = var10.method155(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method952((byte) 21);
                this.field1737.method368(var7, var11, -128);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method786(byte arg0, Component arg1) {
        if (arg0 == -109) {
            field1735++;
            arg1.removeKeyListener(class171.field2801);
            arg1.removeFocusListener(class171.field2801);
            class242.field3842 = -1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IIIB)Lhh;")
    private final class126 method787(int[] arg0, int arg1, int arg2, byte arg3) {
        field1731++;
        int var5 = arg1 ^ (arg2 >>> 12 | arg2 & 0xFFF << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class126 var9 = (class126) this.field1737.method371(114, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg3 <= 76) {
                this.method785((byte) 74, 63, (int[]) null, -67);
            }
            class279 var10 = class279.method1900(this.field1726, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class126 var11 = var10.method1901();
            this.field1737.method368(var7, var11, -120);
            if (arg0 != null) {
                arg0[0] -= var11.field2018.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[II)Lhh;")
    public final class126 method788(int arg0, int[] arg1, int arg2) {
        field1729++;
        if (this.field1733.method1146((byte) -71) == 1) {
            return this.method785((byte) -92, 0, arg1, arg2);
        } else if (arg0 == this.field1733.method1145((byte) 105, arg2)) {
            return this.method785((byte) -92, arg2, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([IBI)Lhh;")
    public final class126 method789(int[] arg0, byte arg1, int arg2) {
        field1736++;
        if (this.field1726.method1146((byte) -107) == 1) {
            return this.method787(arg0, arg2, 0, (byte) 103);
        } else if (arg1 != 87) {
            return null;
        } else if (this.field1726.method1145((byte) 103, arg2) == 1) {
            return this.method787(arg0, 0, arg2, (byte) 80);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lgi;Lgi;)V")
    public class113(class164 arg0, class164 arg1) {
        this.field1733 = arg1;
        this.field1726 = arg0;
    }
}
