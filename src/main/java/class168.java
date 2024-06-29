import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class168 extends class166 {

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
    private int field3087 = 32768;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field3089 = -1;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "Lhj;")
    public static class69 field3093 = class181.method1318("<img=0>", (byte) -106);

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "[I")
    public static int[] field3094 = new int[32];

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "Z")
    public static boolean field3095 = true;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "Lc;")
    public static class103 field3092 = new class103(16);

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "Lhj;")
    public static class69 field3099 = class181.method1318("(Udns", (byte) -112);

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "Lhj;")
    public static class69 field3100 = class181.method1318("(U3", (byte) -116);

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Lnc;")
    public static class83 field3086;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "[[[B")
    public static byte[][][] field3098;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        if (arg0 != 0) {
            field3095 = true;
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -121);
        ++field3090;
        if (super.field3064.field979) {
            int[] var4 = this.method1231(34, arg1, 1);
            int[] var5 = this.method1231(27, arg1, 2);
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class253.field4565 < ~var9; ++var9) {
                int var10 = (1046817 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field3087 >> 12;
                int var12 = class244.field4476[var10] * var11 >> 12;
                int var13 = (var12 >> 12) + var9 & class12.field183;
                int var14 = class206.field3767[var10] * var11 >> 12;
                int var15 = (var14 >> 12) + arg1 & class138.field2583;
                int[][] var16 = this.method1229(var15, 23580, 0);
                var7[var9] = var16[0][var13];
                var6[var9] = var16[1][var13];
                var8[var9] = var16[2][var13];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class168() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        class243.method1728(-124);
        ++field3088;
        int var2 = -75 % ((58 - arg0) / 50);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIILed;IJIIII)Z")
    public static final boolean method1238(int arg0, int arg1, int arg2, int arg3, class177 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class193.method1398(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
    public static final void method1239() {
        for (int var0 = 0; var0 < class66.field1275; ++var0) {
            for (int var4 = 0; var4 < class109.field2091; ++var4) {
                for (int var5 = 0; var5 < class146.field2694; ++var5) {
                    class158.field2935[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class51.field893; ++var1) {
            class231.field4228[var1] = null;
        }
        class51.field893 = 0;
        for (int var2 = 0; var2 < class261.field4653; ++var2) {
            class99.field1872[var2] = null;
        }
        class261.field4653 = 0;
        for (int var3 = 0; var3 < class163.field3018.length; ++var3) {
            class163.field3018[var3] = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            field3095 = false;
        }
        ++field3091;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(-83, arg0, 1);
            int[] var5 = this.method1231(126, arg0, 2);
            for (int var6 = 0; ~class253.field4565 < ~var6; ++var6) {
                int var7 = (4083 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field3087 >> 12;
                int var9 = class244.field4476[var7] * var8 >> 12;
                int var10 = class206.field3767[var7] * var8 >> 12;
                int var11 = var6 - -(var9 >> 12) & class12.field183;
                int var12 = class138.field2583 & (var10 >> 12) + arg0;
                int[] var13 = this.method1231(31, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Z)V")
    public static void method1240(boolean arg0) {
        field3094 = null;
        field3099 = null;
        field3098 = null;
        field3093 = null;
        field3092 = null;
        field3100 = null;
        field3086 = null;
        if (!arg0) {
            field3099 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3074 = ~arg1.method937(false) == -2;
            }
        } else {
            this.field3087 = arg1.method912(48) << 4;
        }
        if (arg0 != 96) {
            this.field3087 = 72;
        }
        ++field3096;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZLok;)V")
    public static final void method1241(boolean arg0, class38 arg1) {
        ++field3097;
        if (!arg0) {
            field3086 = null;
        }
        for (class175 var2 = (class175) class94.field1751.method1724(255); var2 != null; var2 = (class175) class94.field1751.method1726(101)) {
            if (var2.field3191 == arg1) {
                if (var2.field3197 != null) {
                    class54.field959.method1788(var2.field3197);
                    var2.field3197 = null;
                }
                var2.method632(-8296);
                return;
            }
        }
    }
}
