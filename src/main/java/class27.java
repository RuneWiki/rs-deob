import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public abstract class class27 {

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "Lna;")
    public static class26 field410 = class33.method219("download", 110);

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "Lna;")
    public static class26 field409 = class33.method219("Estate Agent", 117);

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "Lna;")
    public static class26 field414 = class33.method219("37(U", 85);

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "Lna;")
    public static class26 field412 = class33.method219("Achievement Start", 86);

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "Z")
    public static volatile boolean field411 = true;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Z")
    public static boolean field413 = false;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I[B)[B", line = 46)
    public static final byte[] method194(int arg0, byte[] arg1) {
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class36.method239(arg1, 0, var3, 0, var2);
        return arg0 <= 22 ? (byte[]) null : var3;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(B)V", line = 88)
    public static void method195(byte arg0) {
        field414 = null;
        field412 = null;
        field410 = null;
        field409 = null;
        if (arg0 < 88) {
            method194(-87, null);
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(III)I")
    public abstract int method193(int arg0, int arg1, int arg2);
}
