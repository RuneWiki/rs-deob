import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gh")
public class class68 extends class85 {

    @OriginalMember(owner = "gh", name = "U", descriptor = "Llf;")
    public static class109 field1315 = class35.method275("::rect_debug", 2);

    @OriginalMember(owner = "gh", name = "Q", descriptor = "[I")
    public static int[] field1311 = new int[5];

    @OriginalMember(owner = "gh", name = "cb", descriptor = "Llf;")
    private static class109 field1323 = class35.method275("wave:", 2);

    @OriginalMember(owner = "gh", name = "gb", descriptor = "Llf;")
    private static class109 field1327 = class35.method275("New User", 2);

    @OriginalMember(owner = "gh", name = "fb", descriptor = "Z")
    public static boolean field1326 = false;

    @OriginalMember(owner = "gh", name = "Y", descriptor = "Llf;")
    public static class109 field1319 = field1327;

    @OriginalMember(owner = "gh", name = "jb", descriptor = "Llf;")
    public static class109 field1330 = field1323;

    @OriginalMember(owner = "gh", name = "T", descriptor = "Llf;")
    private static class109 field1314 = class35.method275("Select a world", 2);

    @OriginalMember(owner = "gh", name = "kb", descriptor = "I")
    public static int field1331 = -1;

    @OriginalMember(owner = "gh", name = "eb", descriptor = "Llf;")
    public static class109 field1325 = field1314;

    @OriginalMember(owner = "gh", name = "W", descriptor = "[I")
    public static int[] field1317 = new int[100];

    @OriginalMember(owner = "gh", name = "X", descriptor = "Llf;")
    public static class109 field1318 = field1323;

    @OriginalMember(owner = "gh", name = "R", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "gh", name = "S", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "gh", name = "V", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "gh", name = "db", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "gh", name = "ib", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "gh", name = "bb", descriptor = "Loh;")
    public static class138 field1322;

    @OriginalMember(owner = "gh", name = "ab", descriptor = "Lbg;")
    public static class18 field1321;

    @OriginalMember(owner = "gh", name = "hb", descriptor = "Lbg;")
    public static class18 field1328;

    @OriginalMember(owner = "gh", name = "Z", descriptor = "Leg;")
    public static class48 field1320;

    @OriginalMember(owner = "gh", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field1312;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 > -49) {
            this.method29(21, -70);
        }
        if (super.field1736.field2253) {
            int[] var4 = this.method540(arg1, -9, 0);
            for (int var5 = 0; var5 < class57.field1152; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "gh", name = "a", descriptor = "(ILad;)V")
    public static final void method441(int arg0, class5 arg1) {
        if (arg0 == 32184) {
            class19.field417 = arg1;
            ++field1316;
        }
    }

    @OriginalMember(owner = "gh", name = "e", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1317 = null;
        field1321 = null;
        field1318 = null;
        field1325 = null;
        field1330 = null;
        field1327 = null;
        field1315 = null;
        field1314 = null;
        field1328 = null;
        field1322 = null;
        field1323 = null;
        if (arg0 == 11760) {
            field1319 = null;
            field1311 = null;
            field1320 = null;
        }
    }

    @OriginalMember(owner = "gh", name = "b", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        if (arg1 != 2177) {
            this.method87(61, -49);
        }
        ++field1329;
        int[][] var3 = super.field1719.method673((byte) -128, arg0);
        if (super.field1719.field1926) {
            int[][] var4 = this.method544(false, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class57.field1152; ++var11) {
                var6[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var7[var11];
                var10[var11] = -var8[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "gh", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "gh", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        ++field1313;
        if (arg0 <= -120) {
            if (~arg1 == -1) {
                super.field1726 = arg2.method598((byte) 102) == 1;
            }
        }
    }
}
