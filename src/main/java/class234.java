import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class234 extends class47 {

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    private final int field4227;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    private final int field4226;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    private final int field4229;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    private final int field4214;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private final int field4222;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    private final int field4219;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "I")
    private final int field4216;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    private final int field4212;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[I")
    public static int[] field4211 = new int[5];

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Lmb;")
    public static class132 field4225 = class166.method1092("Standort", 116);

    @OriginalMember(owner = "client!w", name = "G", descriptor = "Lbg;")
    public static class19 field4220 = new class19();

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field4231 = 0;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLkd;)Lmb;")
    public static final class132 method1480(boolean arg0, class112 arg1) {
        ++field4223;
        if (!arg0) {
            field4211 = null;
        }
        return class220.method1370(32767, 78, arg1);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
    public static void method1481(byte arg0) {
        field4220 = null;
        if (arg0 >= 55) {
            field4225 = null;
            field4211 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Lqh;")
    public static final class182 method1482(byte arg0, int arg1) {
        ++field4213;
        if (arg0 <= 34) {
            field4231 = -110;
        }
        class182 var2 = (class182) class235.field4241.method777(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class104.field1957.method1079(class225.method1440(arg1, (byte) -72), 124, class154.method1006(-122, arg1));
            class182 var4 = new class182();
            if (var3 != null) {
                var4.method1167(new class112(var3), 22426);
            }
            class235.field4241.method774((long) arg1, var4, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(JI)V")
    public static final void method1483(long arg0, int arg1) {
        ++field4228;
        if (~arg0 != -1L) {
            class64.field1054.method660(arg1, 3);
            ++class91.field1605;
            class64.field1054.method709(-27341, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLpb;)V")
    public static final void method1484(byte arg0, class165 arg1) {
        if (arg0 > 56) {
            class78.field1348 = arg1;
            ++field4230;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZI)V")
    public final void method310(int arg0, boolean arg1, int arg2) {
        ++field4221;
        int var4 = this.field4226 * arg0 >> 12;
        int var5 = this.field4216 * arg0 >> 12;
        int var6 = this.field4229 * arg2 >> 12;
        int var7 = this.field4212 * arg2 >> 12;
        int var8 = this.field4214 * arg0 >> 12;
        if (!arg1) {
            field4220 = null;
        }
        int var9 = this.field4219 * arg0 >> 12;
        int var10 = this.field4222 * arg2 >> 12;
        int var11 = this.field4227 * arg2 >> 12;
        class153.method1002(super.field817, var9, var10, (byte) -74, var4, var11, var5, var8, var7, var6);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V")
    public final void method318(int arg0, byte arg1, int arg2) {
        if (arg1 <= 29) {
            field4220 = null;
        }
        ++field4218;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4227 = arg7;
        this.field4226 = arg0;
        this.field4229 = arg3;
        this.field4214 = arg4;
        this.field4222 = arg5;
        this.field4219 = arg6;
        this.field4216 = arg2;
        this.field4212 = arg1;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
    public static final void method1485(int arg0, int arg1, int arg2) {
        if (~class104.field1951 != -1 && arg1 != -1) {
            class86.method538(0, class104.field1951, -91, class171.field3196, false, arg1);
            class182.field3345 = true;
        }
        if (arg2 != 0) {
            field4215 = -87;
        }
        ++field4217;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public final void method313(int arg0, int arg1, int arg2) {
        if (arg2 != 1832079585) {
            field4225 = null;
        }
        ++field4224;
    }
}
