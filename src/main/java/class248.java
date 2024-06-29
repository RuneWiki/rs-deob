import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class248 extends class83 {

    @OriginalMember(owner = "client!ro", name = "O", descriptor = "I")
    private int field3341 = 32768;

    @OriginalMember(owner = "client!ro", name = "L", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!ro", name = "X", descriptor = "[[Z")
    public static boolean[][] field3350 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

    @OriginalMember(owner = "client!ro", name = "Y", descriptor = "[Lom;")
    public static class127[] field3351 = new class127[14];

    @OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ro", name = "P", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ro", name = "Q", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ro", name = "R", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ro", name = "S", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ro", name = "T", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ro", name = "W", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ro", name = "V", descriptor = "Llh;")
    public static class450 field3348;

    @OriginalMember(owner = "client!ro", name = "N", descriptor = "[I")
    public static int[] field3340;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V", line = 4)
    public static void method1319(int arg0) {
        if (arg0 != 0) {
            method1319(51);
        }
        field3350 = null;
        field3340 = null;
        field3351 = null;
        field3348 = null;
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 20)
    public class248() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)[[I", line = 24)
    public final int[][] method21(boolean arg0, int arg1) {
        ++field3349;
        int[][] var3 = super.field927.method1774((byte) -44, arg1);
        if (!arg0) {
            this.method21(true, 49);
        }
        if (super.field927.field4104) {
            int[] var4 = this.method451(1, 74, arg1);
            int[] var5 = this.method451(2, 100, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class420.field6139; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field3341 >> 12;
                int var12 = class204.field2764[var10] * var11 >> 12;
                int var13 = class327.field4353[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class213.field2881;
                int var15 = arg1 - -(var13 >> 12) & class109.field1348;
                int[][] var16 = this.method449(0, true, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BZ)V", line = 80)
    public static final void method1320(byte arg0, boolean arg1) {
        ++class357.field5055;
        ++field3342;
        class281.field3857.method295(20579, 52);
        for (class141 var2 = (class141) class337.field4495.method315((byte) -88); var2 != null; var2 = (class141) class337.field4495.method310(-100)) {
            if (!var2.method1970(-2)) {
                var2 = (class141) class337.field4495.method315((byte) -98);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field1803 == 0) {
                class89.method494(arg1, var2, true, false);
            }
        }
        if (arg0 >= -12) {
            field3348 = null;
        }
        if (class203.field2717 != null) {
            class204.method1107(class203.field2717, (byte) -127);
            class203.field2717 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)[I", line = 120)
    public final int[] method37(int arg0, int arg1) {
        ++field3343;
        int[] var3 = super.field916.method1813(arg1, (byte) -50);
        if (arg0 != 2) {
            this.method21(false, 53);
        }
        if (super.field916.field4174) {
            int[] var4 = this.method451(1, 122, arg1);
            int[] var5 = this.method451(2, 100, arg1);
            for (int var6 = 0; ~class420.field6139 < ~var6; ++var6) {
                int var7 = (var4[var6] & 4090) >> 4;
                int var8 = var5[var6] * this.field3341 >> 12;
                int var9 = class204.field2764[var7] * var8 >> 12;
                int var10 = class327.field4353[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class213.field2881;
                int var12 = class109.field1348 & (var10 >> 12) + arg1;
                int[] var13 = this.method451(0, 115, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)Lhq;", line = 173)
    public static final class173 method1321(int arg0) {
        ++field3344;
        int var1 = -39 % ((-2 - arg0) / 59);
        class173 var2 = (class173) class145.field1866.method983((byte) 106);
        if (var2 != null) {
            --class330.field4412;
            return var2;
        } else {
            return new class173();
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBLtq;)V", line = 192)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -24 % ((arg1 - -27) / 50);
        ++field3346;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field924 = ~arg2.method1350(31351) == -2;
            }
        } else {
            this.field3341 = arg2.method1374(-2) << 4;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)V", line = 230)
    public final void method120(boolean arg0) {
        if (!arg0) {
            class58.method316((byte) -16);
            ++field3347;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 244)
    public static final String method1322(int arg0, String arg1) {
        ++field3345;
        String var2 = class232.method1256(class317.method1829(121, arg1), (byte) 94);
        if (arg0 != -4349) {
            return null;
        } else {
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }
}
