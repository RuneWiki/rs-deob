import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class217 extends class138 {

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "Lwf;")
    public static class16 field3837 = new class16(20);

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "Lha;")
    public static class46 field3839 = class271.method1828("Konfig geladen)3", -46);

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "Z")
    public static boolean field3840 = true;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "Lha;")
    public static class46 field3841 = class271.method1828("loginscreen", -46);

    @OriginalMember(owner = "client!jd", name = "mb", descriptor = "Lha;")
    public static class46 field3842 = class271.method1828(" )2> <col=ff9040>", -46);

    @OriginalMember(owner = "client!jd", name = "nb", descriptor = "Lha;")
    public static class46 field3843 = class271.method1828("Fps:", -46);

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method1516(int arg0) {
        field3839 = null;
        field3837 = null;
        field3843 = null;
        field3842 = null;
        field3841 = null;
        if (arg0 >= -117) {
            field3842 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field3834;
        if (arg1 != 25) {
            this.method30(-67, (byte) 26);
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028 && this.method1057(27767)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % super.field2485 * super.field2485;
            for (int var8 = 0; ~var8 > ~class241.field4284; ++var8) {
                int var9 = super.field2486[var7 - -(var8 % super.field2487)];
                var5[var8] = class50.method369(4080, var9 << 4);
                var6[var8] = class50.method369(var9 >> 4, 4080);
                var4[var8] = class50.method369(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIILme;II)Lme;")
    public static final class36 method1517(int arg0, byte arg1, int arg2, int arg3, class36 arg4, int arg5, int arg6) {
        ++field3835;
        long var7 = (long) arg5;
        class36 var9 = (class36) class29.field575.method86(7961, var7);
        if (var9 == null) {
            class67 var10 = class67.method464(class242.field4308, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method490(64, 768, -50, -10, -50);
            class29.field575.method80(var9, var7, (byte) 67);
        }
        int var11 = arg4.method230();
        int var12 = arg4.method228();
        int var13 = arg4.method225();
        int var14 = arg4.method232();
        class36 var15 = var9.method238(true, true);
        if (arg6 != 0) {
            var15.method223(arg6);
        }
        if (arg1 > -87) {
            return null;
        } else {
            class192 var16 = (class192) var15;
            if (class206.method1461(arg0 + var13, class135.field2450, arg3 + var11, 4) != arg2 || arg2 != class206.method1461(arg0 - -var14, class135.field2450, arg3 + var12, 4)) {
                for (int var17 = 0; ~var17 > ~var16.field3395; ++var17) {
                    var16.field3420[var17] += -arg2 + class206.method1461(var16.field3411[var17] + arg0, class135.field2450, var16.field3423[var17] + arg3, 4);
                }
                var16.field3422 = false;
            }
            return var15;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lpi;Lpi;I)V")
    public static final void method1518(class181 arg0, class181 arg1, int arg2) {
        class29.field561 = arg0;
        if (arg2 == 2319) {
            ++field3836;
            class259.field4519 = arg1;
        }
    }
}
