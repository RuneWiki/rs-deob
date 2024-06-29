import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class130 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lhj;")
    private static class69 field2420 = class181.method1318("wave:", (byte) -114);

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lhj;")
    public static class69 field2418 = field2420;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lhj;")
    public static class69 field2415 = field2420;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "Lhj;")
    public static class69 field2419 = class181.method1318("VOLL", (byte) -109);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Lhj;")
    private static class69 field2417 = class181.method1318(" has logged out)3", (byte) -110);

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "Lhj;")
    public static class69 field2426 = field2417;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "Lhj;")
    public static class69 field2425 = class181.method1318("mapflag", (byte) -123);

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "Lhj;")
    private static class69 field2427 = class181.method1318("skill)2", (byte) -110);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lhj;")
    public static class69 field2416 = field2427;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lnc;")
    public static class83 field2422;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method967(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2423++;
        if (arg0 < 109) {
            method967((byte) -65, -44, 21, 30, 62, 90, 80, -80);
        }
        if (arg4 < 0 || arg1 < 0 || arg4 >= 103 || arg1 >= 103) {
            return;
        }
        if (arg3 == 0) {
            class118 var8 = class19.method114(arg2, arg4, arg1);
            if (var8 != null) {
                int var9 = (int) (var8.field2238 >>> 32) & Integer.MAX_VALUE;
                if (arg5 == 2) {
                    var8.field2235 = new class95(var9, 2, arg7 + 4, arg2, arg4, arg1, arg6, false, var8.field2235);
                    var8.field2227 = new class95(var9, 2, arg7 + 1 & 0x3, arg2, arg4, arg1, arg6, false, var8.field2227);
                } else {
                    var8.field2235 = new class95(var9, arg5, arg7, arg2, arg4, arg1, arg6, false, var8.field2235);
                }
            }
        }
        if (arg3 == 1) {
            class212 var10 = class81.method574(arg2, arg4, arg1);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field3849 >>> 32);
                if (arg5 == 4 || arg5 == 5) {
                    var10.field3857 = new class95(var11, 4, arg7, arg2, arg4, arg1, arg6, false, var10.field3857);
                } else if (arg5 == 6) {
                    var10.field3857 = new class95(var11, 4, arg7 + 4, arg2, arg4, arg1, arg6, false, var10.field3857);
                } else if (arg5 == 7) {
                    var10.field3857 = new class95(var11, 4, (arg7 + 2 & 0x3) + 4, arg2, arg4, arg1, arg6, false, var10.field3857);
                } else if (arg5 == 8) {
                    var10.field3857 = new class95(var11, 4, arg7 + 4, arg2, arg4, arg1, arg6, false, var10.field3857);
                    var10.field3866 = new class95(var11, 4, (arg7 + 2 & 0x3) + 4, arg2, arg4, arg1, arg6, false, var10.field3866);
                }
            }
        }
        if (arg3 == 2) {
            if (arg5 == 11) {
                arg5 = 10;
            }
            class85 var12 = class273.method1866(arg2, arg4, arg1);
            if (var12 != null) {
                var12.field1660 = new class95((int) (var12.field1656 >>> 32) & Integer.MAX_VALUE, arg5, arg7, arg2, arg4, arg1, arg6, false, var12.field1660);
            }
        }
        if (arg3 != 3) {
            return;
        }
        class68 var13 = class139.method1073(arg2, arg4, arg1);
        if (var13 != null) {
            var13.field1288 = new class95((int) (var13.field1293 >>> 32) & Integer.MAX_VALUE, 22, arg7, arg2, arg4, arg1, arg6, false, var13.field1288);
            return;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method968(int arg0) {
        field2427 = null;
        field2418 = null;
        field2422 = null;
        field2415 = null;
        field2426 = null;
        field2416 = null;
        field2419 = null;
        field2420 = null;
        int var1 = -69 / ((-arg0 - 20) / 44);
        field2425 = null;
        field2417 = null;
    }
}
