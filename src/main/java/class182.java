import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class182 extends class123 {

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    private int field3164 = 4096;

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "[[I")
    public static int[][] field3171 = new int[5][5000];

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "[I")
    public static int[] field3172 = new int[32];

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "I")
    public static int field3176 = -1;

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "[I")
    public static int[] field3177 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!dj", name = "ob", descriptor = "Z")
    public static boolean field3181 = false;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!dj", name = "mb", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!dj", name = "nb", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lmf;")
    public static class10 field3165;

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "[Lkg;")
    public static class133[] field3175;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg2 != 1876195788) {
            method1307(-27);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3164 = arg1.method161(4);
            }
        } else {
            this.field3178 = arg1.method161(4);
        }
        ++field3179;
    }

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V")
    public static void method1307(int arg0) {
        field3171 = null;
        field3175 = null;
        field3172 = null;
        field3177 = null;
        field3165 = null;
        int var1 = -18 % ((-45 - arg0) / 41);
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class182() {
        super(1, true);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lth;I)V")
    public static final void method1308(class109 arg0, int arg1) {
        ++field3166;
        for (class66 var2 = (class66) class201.field3563.method839(128); var2 != null; var2 = (class66) class201.field3563.method834((byte) 82)) {
            if (var2.field1252 == arg0) {
                if (var2.field1235 != null) {
                    class117.field2096.method1682(var2.field1235);
                    var2.field1235 = null;
                }
                var2.method518(122);
                return;
            }
        }
        if (arg1 != -4448) {
            field3172 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(II)Luf;")
    public static final class168 method1309(int arg0, int arg1) {
        ++field3180;
        class168 var2 = (class168) class213.field3694.method273((long) arg1, 255);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -63) {
            return null;
        } else {
            byte[] var3 = class31.field586.method1546(arg1, (byte) -100, 5);
            class168 var4 = new class168();
            if (var3 != null) {
                var4.method1240(new class14(var3), (byte) -37);
            }
            class213.field3694.method276(var4, (long) arg1, -105);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)I")
    public static final int method1310(byte arg0, int arg1) {
        ++field3170;
        if (arg0 != 126) {
            method1313(true);
        }
        return 127 & arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIZ[II)V")
    public static final void method1311(int arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        int var6 = arg1 - 1;
        int var5 = -7 + var6;
        if (!arg2) {
            field3172 = null;
        }
        --arg4;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg4 = var13 + 1;
            arg3[arg4] = arg0;
        }
        while (~arg4 > ~var6) {
            ++arg4;
            arg3[arg4] = arg0;
        }
        ++field3174;
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(II)V")
    public static final void method1312(int arg0, int arg1) {
        class124.field2182.method1121(0, arg0);
        ++field3173;
        if (arg1 <= 12) {
            field3181 = true;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V")
    public static final void method1313(boolean arg0) {
        if (arg0) {
            class53.field916 = class228.field3938;
            class106.field1912 = class168.field2976;
        } else {
            class53.field916 = class176.field3090;
            class106.field1912 = class237.field4098;
        }
        class225.field3892 = class53.field916.length;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field3169;
        int var3 = 1 / ((-24 - arg1) / 57);
        int[] var4 = super.field2160.method1323((byte) 42, arg0);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 66);
            for (int var6 = 0; class140.field2505 > var6; ++var6) {
                int var7 = var5[var6];
                var4[var6] = ~var7 <= ~this.field3178 && ~var7 >= ~this.field3164 ? 4096 : 0;
            }
        }
        return var4;
    }
}
