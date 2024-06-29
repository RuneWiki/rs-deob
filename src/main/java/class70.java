import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class70 extends class37 {

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field1682 = -1;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "[I")
    public static int[] field1686 = new int[4000];

    @OriginalMember(owner = "client!h", name = "U", descriptor = "[I")
    public static int[] field1683 = new int[32];

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lfd;")
    public static class55 field1681;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "[Lba;")
    public static class12[] field1687;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "[Lnh;")
    private class133[] field1684;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "[[S")
    public static short[][] field1678;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field1679;
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int var4 = class35.field782;
            int var5 = class72.field1719;
            int[][] var6 = new int[var4][var5];
            int[][][] var7 = super.field832.method652(106);
            this.method567(-118, var6);
            for (int var8 = 0; ~var8 > ~class35.field782; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[0];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class72.field1719 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class208.method1372(4080, var15 << 4);
                    var11[var14] = class208.method1372(4080, var15 >> 4);
                    var12[var14] = class208.method1372(var15, 16711680) >> 12;
                }
            }
        }
        if (arg1 <= 5) {
            field1682 = -85;
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field1688;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (arg0 != 75) {
            this.method7((byte) 71, -120);
        }
        if (super.field816.field3661) {
            this.method567(-92, super.field816.method1187(-38));
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -17803) {
            field1687 = null;
        }
        ++field1685;
        for (int var5 = 0; class137.field2935 > var5; ++var5) {
            if (~arg2 > ~(class204.field4057[var5] + class146.field3083[var5]) && ~(arg2 + arg3) < ~class204.field4057[var5] && ~arg4 > ~(client.field627[var5] + class135.field2893[var5]) && class135.field2893[var5] < arg1 + arg4) {
                class32.field680[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public static void method566(int arg0) {
        field1681 = null;
        field1686 = null;
        if (arg0 < 24) {
            field1682 = 83;
        }
        field1683 = null;
        field1687 = null;
        field1678 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I[[I)V")
    private final void method567(int arg0, int[][] arg1) {
        ++field1680;
        if (arg0 > -87) {
            field1687 = null;
        }
        int var3 = class35.field782;
        int var4 = class72.field1719;
        class193.method1260(1345804752, arg1);
        class28.method270(class71.field1691, class105.field2348, -11442, 0, 0);
        if (this.field1684 != null) {
            for (int var5 = 0; ~var5 > ~this.field1684.length; ++var5) {
                class133 var6 = this.field1684[var5];
                int var7 = var6.field2843;
                int var8 = var6.field2841;
                if (var8 >= 0) {
                    if (~var7 <= -1) {
                        var6.method910(var3, var4, 0);
                    } else {
                        var6.method912(-1, var3, var4);
                    }
                } else if (~var7 <= -1) {
                    var6.method911(var3, -110, var4);
                }
            }
        }
    }
}
