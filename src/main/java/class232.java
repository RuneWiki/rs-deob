import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class232 {

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public int field4235 = -1;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4234 = 0;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Lhj;")
    public static class69 field4238 = class181.method1318("<br>", (byte) -116);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lhj;")
    public static class69 field4233 = class181.method1318("Mitglieder)2Welt", (byte) -118);

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "Lhj;")
    private static class69 field4243 = class181.method1318("Loading interfaces )2 ", (byte) -114);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lhj;")
    public static class69 field4247 = field4243;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field4231;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public int field4248;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lnc;")
    public static class83 field4246;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        field4247 = null;
        field4246 = null;
        field4238 = null;
        field4233 = null;
        field4243 = null;
        if (arg0 != 0) {
            field4247 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
    public static final void method1651(int arg0, int arg1, int arg2, int arg3) {
        class135 var4 = class8.method38((byte) 106, 4, arg1);
        var4.method1011((byte) 122);
        field4240++;
        if (arg3 >= -124) {
            method1653(-67, 67, (byte) -99, (class38) null, -123, (class12) null, (class108) null, -16);
        }
        var4.field2535 = arg0;
        var4.field2539 = arg2;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIILed;Led;IIIIJ)V")
    public static final void method1652(int arg0, int arg1, int arg2, int arg3, class177 arg4, class177 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class212 var12 = new class212();
        var12.field3849 = arg10;
        var12.field3856 = arg1 * 128 + 64;
        var12.field3864 = arg2 * 128 + 64;
        var12.field3846 = arg3;
        var12.field3857 = arg4;
        var12.field3866 = arg5;
        var12.field3852 = arg6;
        var12.field3847 = arg7;
        var12.field3848 = arg8;
        var12.field3851 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class158.field2935[var13][arg1][arg2] == null) {
                class158.field2935[var13][arg1][arg2] = new class217(var13, arg1, arg2);
            }
        }
        class158.field2935[arg0][arg1][arg2].field3946 = var12;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBLok;ILfg;Lth;I)V")
    public static final void method1653(int arg0, int arg1, byte arg2, class38 arg3, int arg4, class12 arg5, class108 arg6, int arg7) {
        field4244++;
        class175 var8 = new class175();
        if (arg2 != 85) {
            field4247 = null;
        }
        var8.field3186 = arg4;
        var8.field3206 = arg1 * 128;
        var8.field3182 = arg7 * 128;
        if (arg5 != null) {
            var8.field3189 = arg5.field169;
            var8.field3200 = arg5.field158 * 128;
            var8.field3207 = arg5.field132;
            var8.field3193 = arg5;
            var8.field3196 = arg5.field128;
            var8.field3185 = arg5.field137;
            int var9 = arg5.field127;
            int var10 = arg5.field153;
            if (arg0 == 1 || arg0 == 3) {
                var9 = arg5.field153;
                var10 = arg5.field127;
            }
            var8.field3195 = (arg1 + var10) * 128;
            var8.field3205 = (arg7 + var9) * 128;
            if (arg5.field120 != null) {
                var8.field3187 = true;
                var8.method1274(-5226);
            }
            if (var8.field3196 != null) {
                var8.field3209 = var8.field3185 + (int) (Math.random() * (double) (var8.field3189 - var8.field3185));
            }
            class59.field1067.method1727(-118, var8);
        } else if (arg3 != null) {
            var8.field3191 = arg3;
            class186 var11 = arg3.field517;
            if (var11.field3375 != null) {
                var8.field3187 = true;
                var11 = var11.method1358((byte) -36);
            }
            if (var11 != null) {
                var8.field3195 = (var11.field3359 + arg1) * 128;
                var8.field3205 = (var11.field3359 + arg7) * 128;
                var8.field3207 = class227.method1623(-126, arg3);
                var8.field3200 = var11.field3397 * 128;
            }
            class94.field1751.method1727(-127, var8);
        } else if (arg6 != null) {
            var8.field3181 = arg6;
            var8.field3195 = (arg6.method813(15963) + arg1) * 128;
            var8.field3205 = (arg7 + arg6.method813(15963)) * 128;
            var8.field3207 = class189.method1375(false, arg6);
            var8.field3200 = arg6.field2041 * 128;
            class208.field3780.method761(arg6.field2045.method473((byte) 78), 0, var8);
            return;
        }
    }
}
