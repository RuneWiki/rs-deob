import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class444 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public int field6153;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public int field6145;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Z")
    public static boolean field6146 = true;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lrh;")
    public static class718 field6143 = new class718();

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Ljn;")
    public static class134 field6152 = new class134(96, 6);

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Liia;")
    public static class536 field6154;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2668(int arg0) {
        field6154 = null;
        field6152 = null;
        field6143 = null;
        int var1 = 53 % ((arg0 - 17) / 50);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I", line = 15)
    public static final int method2669(int arg0, int arg1) {
        field6148++;
        return ~arg1 == arg0 ? -1 : class703.method3973(arg1, 113);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Z", line = 29)
    public static final boolean method2670(byte arg0) {
        field6144++;
        if (arg0 == -100) {
            return class20.field171 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)Lsf;", line = 41)
    public final class444 method2671(int arg0, int arg1) {
        if (arg1 != -2509) {
            this.field6145 = -8;
        }
        field6149++;
        return new class444(this.field6153, arg0, this.field6147, this.field6142);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIII)V", line = 68)
    public class444(int arg0, int arg1, int arg2, int arg3) {
        this.field6142 = arg3;
        this.field6153 = arg0;
        this.field6145 = arg1;
        this.field6147 = arg2;
    }
}
