import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class class665 extends class593 {

    @OriginalMember(owner = "client!ica", name = "G", descriptor = "S")
    public short field9345;

    @OriginalMember(owner = "client!ica", name = "J", descriptor = "S")
    public short field9348;

    @OriginalMember(owner = "client!ica", name = "C", descriptor = "Lada;")
    public static class164 field9341 = new class164();

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!ica", name = "A", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!ica", name = "B", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!ica", name = "D", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!ica", name = "F", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!ica", name = "I", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!ica", name = "K", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!ica", name = "H", descriptor = "Lod;")
    public static class508 field9346;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "(B)V", line = 4)
    public static void method3822(byte arg0) {
        field9341 = null;
        if (arg0 > -51) {
            method3823(-58);
        }
        field9346 = null;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I[Lraa;)I", line = 15)
    public final int method84(int arg0, class609[] arg1) {
        ++field9340;
        if (arg0 <= 24) {
            field9341 = null;
        }
        return this.method3463(super.field8428 >> class459.field6769, arg1, false, super.field8423 >> class459.field6769);
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(Lha;I)Z", line = 27)
    public final boolean method79(class60 arg0, int arg1) {
        ++field9344;
        if (arg1 != 9721) {
            method3823(31);
        }
        return class573.method3317(this.method315((byte) 106), (byte) 66, super.field8417, super.field8428 >> class459.field6769, super.field8423 >> class459.field6769);
    }

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)Z", line = 48)
    public final boolean method85(int arg0) {
        int var2 = 67 % ((16 - arg0) / 58);
        ++field9342;
        return class464.field6819[(super.field8423 >> class459.field6769) + -class736.field10315 - -class60.field843][(super.field8428 >> class459.field6769) + -class116.field1600 + class60.field843];
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILvs;ZILha;II)V", line = 60)
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        ++field9339;
        if (arg0 != 8616) {
            this.method738((byte) -126);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(B)Z", line = 72)
    public final boolean method738(byte arg0) {
        if (arg0 != 88) {
            return false;
        } else {
            ++field9347;
            return false;
        }
    }

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)V", line = 83)
    public static final void method3823(int arg0) {
        ++field9343;
        class724.field10111 = 0;
        int var1 = (class130.field1749.field8423 >> 9) + class361.field5224;
        int var2 = (class130.field1749.field8428 >> 9) + class582.field8288;
        if (arg0 == 2705) {
            if (~var1 <= -3054 && var1 <= 3156 && ~var2 <= -3057 && var2 <= 3136) {
                class724.field10111 = 1;
            }
            if (var1 >= 3072 && var1 <= 3118 && ~var2 <= -9493 && var2 <= 9535) {
                class724.field10111 = 1;
            }
            if (class724.field10111 == 1 && var1 >= 3139 && ~var1 >= -3200 && var2 >= 3008 && var2 <= 3062) {
                class724.field10111 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)V", line = 109)
    public final void method741(int arg0) {
        ++field9349;
        if (arg0 < -93) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(IIIIIII)V", line = 120)
    public class665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field8423 = arg0;
        super.field8421 = arg1;
        super.field8417 = (byte) arg4;
        super.field8429 = (byte) arg3;
        super.field8428 = arg2;
        this.field9345 = (short) arg6;
        this.field9348 = (short) arg5;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIZIIIZ)V", line = 134)
    public static final void method3824(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (~arg1 > ~arg0) {
            int var7 = (arg0 + arg1) / 2;
            int var8 = arg1;
            class218 var9 = class124.field1669[var7];
            class124.field1669[var7] = class124.field1669[arg0];
            class124.field1669[arg0] = var9;
            for (int var10 = arg1; ~var10 > ~arg0; ++var10) {
                if (class243.method1626((byte) 69, class124.field1669[var10], arg4, var9, arg5, arg2, arg6) <= 0) {
                    class218 var11 = class124.field1669[var10];
                    class124.field1669[var10] = class124.field1669[var8];
                    class124.field1669[var8++] = var11;
                }
            }
            class124.field1669[arg0] = class124.field1669[var8];
            class124.field1669[var8] = var9;
            method3824(var8 + -1, arg1, arg2, 0, arg4, arg5, arg6);
            method3824(arg0, var8 - -1, arg2, arg3, arg4, arg5, arg6);
        }
        if (arg3 == 0) {
            ++field9338;
        }
    }
}
