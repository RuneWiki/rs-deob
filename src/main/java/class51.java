import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class51 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Z")
    public boolean field431;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public static int field433 = -1;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Ljs;")
    public static class275 field432 = new class275(8, 0, 4, 1);

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "Lrq;")
    public class293 field437;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Lrq;")
    public class293 field439;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "Z")
    public boolean field436;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 5)
    public static void method279(int arg0) {
        if (arg0 < 29) {
            field434 = 110;
        }
        field432 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V", line = 18)
    public static final void method280(int arg0) {
        field440++;
        if (class177.field2149) {
            return;
        }
        if (class565.field8299.field2184) {
            class588.field8527 = ((int) class588.field8527 + 47 & 0xFFFFFFF0);
        } else {
            class237.field2969 += (12.0F - class237.field2969) / 2.0F;
        }
        class177.field2149 = true;
        class35.field278 = true;
        if (arg0 != 47) {
            method283(113, -68, -83, -113, 76, -114, -88);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V", line = 46)
    public final void method281(int arg0) {
        if (arg0 != 4) {
            this.field439 = null;
        }
        if (this.field437 != null) {
            this.field437.method443(23678);
        }
        field441++;
        this.field436 = false;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z", line = 70)
    public final boolean method282(int arg0) {
        int var2 = -61 % ((arg0 + 7) / 55);
        field438++;
        return this.field436 && !this.field431;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIIIII)I", line = 83)
    public static final int method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field435++;
        int var7 = arg3 & 0x3;
        if (arg0 != 14656) {
            field434 = 112;
        }
        if ((arg1 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg5 - arg4;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg6;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Z)V", line = 114)
    public class51(boolean arg0) {
        this.field431 = arg0;
    }
}
