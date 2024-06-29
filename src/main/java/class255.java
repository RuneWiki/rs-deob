import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class255 extends class146 {

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public int field4066;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field4064 = 0;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "[I")
    public static int[] field4068;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V")
    public static void method1704(byte arg0) {
        field4068 = null;
        if (arg0 != -19) {
            field4071 = 89;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
    public static final void method1705(int arg0, int arg1) {
        if (arg0 >= -12) {
            field4071 = 9;
        }
        class152.field2484 = (class119) class81.field1337.method1063((byte) -81, (long) arg1);
        field4069++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Lvf;")
    public static final class30 method1706(int arg0, boolean arg1) {
        class30 var2 = (class30) class3.field37.method1155((long) arg0, true);
        field4063++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class209.field3358.method900(arg0, 0, arg1);
        class30 var4 = new class30(var3);
        var4.method570(class101.field1550, (int[]) null);
        class3.field37.method1161(var4, (byte) -125, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Loh;Lti;Lmk;BIIII)V")
    public static final void method1707(class248 arg0, class139 arg1, class213 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 79) {
            method1707((class248) null, (class139) null, (class213) null, (byte) 48, -88, 7, 112, 37);
        }
        class132 var8 = new class132();
        field4070++;
        var8.field2204 = arg6 * 128;
        var8.field2197 = arg5 * 128;
        var8.field2211 = arg4;
        if (arg0 != null) {
            var8.field2203 = arg0.field3917 * 128;
            var8.field2210 = arg0.field3913;
            var8.field2206 = arg0.field3928;
            int var9 = arg0.field3947;
            var8.field2196 = arg0.field3900;
            var8.field2193 = arg0;
            var8.field2198 = arg0.field3941;
            var8.field2201 = arg0.field3952;
            int var10 = arg0.field3960;
            if (arg7 == 1 || arg7 == 3) {
                var10 = arg0.field3947;
                var9 = arg0.field3960;
            }
            var8.field2212 = (arg5 + var9) * 128;
            var8.field2213 = (arg6 + var10) * 128;
            if (arg0.field3897 != null) {
                var8.field2192 = true;
                var8.method950(true);
            }
            if (var8.field2206 != null) {
                var8.field2189 = (int) (Math.random() * (double) (var8.field2198 - var8.field2201)) + var8.field2201;
            }
            class139.field2329.method1809(5, var8);
        } else if (arg1 != null) {
            class165 var11 = arg1.field2321;
            var8.field2208 = arg1;
            if (var11.field2741 != null) {
                var8.field2192 = true;
                var11 = var11.method1188((byte) -59);
            }
            if (var11 != null) {
                var8.field2212 = (var11.field2682 + arg5) * 128;
                var8.field2213 = (var11.field2682 + arg6) * 128;
                var8.field2210 = class71.method551(arg1, (byte) -64);
                var8.field2203 = var11.field2679 * 128;
                var8.field2196 = var11.field2680;
            }
            class238.field3755.method1809(5, var8);
        } else if (arg2 != null) {
            var8.field2194 = arg2;
            var8.field2212 = (arg2.method1226((byte) -98) + arg5) * 128;
            var8.field2213 = (arg6 + arg2.method1226((byte) -118)) * 128;
            var8.field2210 = class254.method1702(7, arg2);
            var8.field2203 = arg2.field3431 * 128;
            var8.field2196 = arg2.field3407;
            class269.field4315.method1064(var8, class260.method1739(false, arg2.field3445), (byte) -126);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)I")
    public static final int method1708(int arg0, int arg1, byte arg2) {
        field4067++;
        if (arg2 == 60) {
            int var3 = arg1 * 57 + arg0;
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return (var5 & 0x7F8463A) >> 19;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(B)I")
    public static final int method1709(byte arg0) {
        field4065++;
        int var1 = 74 / ((arg0 - 40) / 59);
        return class165.field2689;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(II)V")
    public class255(int arg0, int arg1) {
        this.field4062 = arg0;
        this.field4066 = arg1;
    }
}
