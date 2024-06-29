import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class187 extends class139 {

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Lrf;")
    private static class163 field3722 = class53.method392(-112, "Login limit exceeded)3");

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "[Lha;")
    public static class70[] field3723 = new class70[32768];

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "Lrf;")
    public static class163 field3728 = field3722;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "[J")
    public static long[] field3724 = new long[256];

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "[I")
    public static int[] field3731;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    private int field3721;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    private int field3725;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    private int field3726;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        if (arg0 <= 53) {
            method1265(104);
        }
        ++field3718;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (super.field2866.field885) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class23.field402; ++var7) {
                var5[var7] = this.field3721;
                var4[var7] = this.field3725;
                var6[var7] = this.field3726;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class187() {
        this(0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field3727;
        if (arg0 == 0) {
            this.method1263(true, arg2.method340(false));
        }
        if (arg1 != 21) {
            field3722 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    private class187(int arg0) {
        super(0, false);
        this.method1263(true, arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)V")
    private final void method1263(boolean arg0, int arg1) {
        ++field3719;
        this.field3726 = (255 & arg1) << 4;
        this.field3721 = (16711680 & arg1) >> 12;
        this.field3725 = 4080 & arg1 >> 4;
        if (!arg0) {
            method1264(46);
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    public static final void method1264(int arg0) {
        class71.field1493.method399(false);
        ++field3720;
        class58.field1167.method399(false);
        class27.field496.method399(false);
        int var1 = -42 % ((arg0 - 62) / 42);
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public static void method1265(int arg0) {
        field3723 = null;
        field3722 = null;
        field3731 = null;
        if (arg0 != 0) {
            field3729 = 70;
        }
        field3728 = null;
        field3724 = null;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) != -2L) {
                    var1 >>>= 1;
                } else {
                    var1 = var1 >>> 1 ^ -3932672073523589310L;
                }
            }
            field3724[var0] = var1;
        }
        field3730 = 0;
        field3731 = new int[] { -1, -1, 1, 1 };
    }
}
