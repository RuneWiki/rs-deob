import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class230 extends class105 {

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    private final int field3931;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    private final int field3938;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    private final int field3920;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    private final int field3933;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    private final int field3926;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    private final int field3929;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private final int field3930;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    private final int field3919;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lpj;")
    public static class237 field3927 = class33.method353("Hidden)2use", 42);

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lpj;")
    public static class237 field3925 = class33.method353("Lade Sprites )2 ", 32);

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lpj;")
    public static class237 field3922 = class33.method353("<col=ff0000>", 81);

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[I")
    public static int[] field3935 = new int[50];

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field3936 = 0;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "[I")
    public static int[] field3924;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        ++field3934;
        if (arg1 != 51) {
            method1522(124, true, -39);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)V")
    public static final void method1521(int arg0, int arg1) {
        class270 var2 = class202.method1368(-15, arg0, arg1);
        ++field3939;
        var2.method1795(-2113);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZI)V")
    public static final void method1522(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1526(-77);
        }
        class270 var3 = class202.method1368(-15, 12, arg0);
        var3.method1793(13);
        ++field3921;
        var3.field4619 = arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLw;I)V")
    public static final void method1523(boolean arg0, class141 arg1, int arg2) {
        ++field3928;
        int var3 = ~arg1.field2500 != -1 ? arg1.field2500 : arg1.field2490;
        int var4 = arg1.field2461 != 0 ? arg1.field2461 : arg1.field2575;
        class214.method1436(arg0, arg1.field2530, var4, class22.field406[arg1.field2530 >> 16], var3, (byte) -109);
        if (arg1.field2457 != null) {
            class214.method1436(arg0, arg1.field2530, var4, arg1.field2457, var3, (byte) -108);
        }
        class58 var5 = (class58) class164.field2915.method568((long) arg1.field2530, arg2 ^ -7319);
        if (arg2 != 7318) {
            method1526(-21);
        }
        if (var5 != null) {
            class177.method1220(var4, var3, -1, var5.field1191, arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public final void method501(int arg0, int arg1, int arg2) {
        ++field3932;
        if (arg1 < 110) {
            method1525((byte) 49, 110);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIILqk;I)Lqk;")
    public static final class201 method1524(int arg0, int arg1, int arg2, int arg3, int arg4, class201 arg5, int arg6) {
        ++field3923;
        long var7 = (long) arg6;
        class201 var9 = (class201) class108.field1923.method940(var7, 15);
        if (var9 == null) {
            class157 var10 = class157.method1116(class8.field118, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1110(64, 768, -50, -10, -50);
            class108.field1923.method937(-92, var9, var7);
        }
        int var11 = arg5.method160();
        int var12 = arg5.method159();
        int var13 = arg5.method191();
        int var14 = arg5.method167();
        class201 var15 = var9.method182(true, true);
        if (arg0 != 0) {
            var15.method158(arg0);
        }
        class18 var16 = (class18) var15;
        if (arg1 != class23.method216(-28, arg3 + var13, arg2 + var11, class274.field4798) || class23.method216(-70, arg3 - -var14, arg2 + var12, class274.field4798) != arg1) {
            for (int var17 = 0; var17 < var16.field304; ++var17) {
                var16.field325[var17] += -arg1 + class23.method216(-27, var16.field321[var17] + arg3, var16.field336[var17] - -arg2, class274.field4798);
            }
            var16.field326 = false;
        }
        int var18 = -59 % ((-58 - arg4) / 55);
        return var15;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)V")
    public static final void method1525(byte arg0, int arg1) {
        ++field3941;
        class64.field1276.method939(arg1, 1);
        int var2 = -18 % ((arg0 - 53) / 61);
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3931 = arg1;
        this.field3938 = arg4;
        this.field3920 = arg6;
        this.field3933 = arg0;
        this.field3926 = arg2;
        this.field3929 = arg3;
        this.field3930 = arg5;
        this.field3919 = arg7;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method1526(int arg0) {
        field3925 = null;
        field3927 = null;
        field3922 = null;
        if (arg0 != 0) {
            method1521(-10, -77);
        }
        field3924 = null;
        field3935 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        ++field3940;
        int var4 = this.field3933 * arg2 >> 12;
        int var5 = this.field3931 * arg0 >> 12;
        int var6 = this.field3926 * arg2 >> 12;
        int var7 = this.field3929 * arg0 >> 12;
        int var8 = this.field3938 * arg2 >> 12;
        int var9 = this.field3930 * arg0 >> 12;
        int var10 = this.field3920 * arg2 >> 12;
        int var11 = this.field3919 * arg0 >> 12;
        if (arg1 < -72) {
            class177.method1219(super.field1851, var11, var9, 0, var4, var10, var5, var7, var8, var6);
        }
    }
}
