import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class212 extends class321 {

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "Z")
    public boolean field2863 = true;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "Lmo;")
    public class480 field2858;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "Loaa;")
    public static class498 field2856;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "[I")
    public int[] field2866;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "[I")
    private int[] field2867;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field2870;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "[[I")
    private int[][] field2865;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILgk;)V", line = 3)
    private final void method1340(int arg0, int arg1, class540 arg2) {
        if (arg1 == 1) {
            this.field2870 = class509.method2891(arg2.method3145((byte) -121), '<', -115);
        } else if (arg1 == 2) {
            int var9 = arg2.method3115(arg0 + 29811);
            this.field2866 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2866[var10] = arg2.method3169(26488);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method3115(arg0 + 29811);
            this.field2867 = new int[var4];
            this.field2865 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3169(arg0 + 26428);
                class273 var7 = class117.method867(var6, (byte) 103);
                if (var7 != null) {
                    this.field2867[var5] = var6;
                    this.field2865[var5] = new int[var7.field3560];
                    for (int var8 = 0; var8 < var7.field3560; var8++) {
                        this.field2865[var5][var8] = arg2.method3169(26488);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field2863 = false;
        }
        if (arg0 != 60) {
            this.field2867 = null;
        }
        field2871++;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)Lcq;", line = 78)
    public final class273 method1341(int arg0, byte arg1) {
        field2861++;
        if (arg1 <= 117) {
            this.method1345((byte) -104, null);
        }
        return this.field2867 == null || arg0 < 0 || this.field2867.length < arg0 ? null : class117.method867(this.field2867[arg0], (byte) 125);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 93)
    public static final void method1342(int arg0, int arg1) {
        class425.method2561(-1);
        field2859++;
        if (arg0 > -1) {
            return;
        }
        int var2 = class683.field9635.method1380(arg1, 18).field6285;
        if (var2 == 0) {
            return;
        }
        int var3 = class308.field4545.field8636[arg1];
        if (var2 == 6) {
            class380.field5728 = var3;
        }
        if (var2 == 5) {
            class342.field5060 = var3;
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)I", line = 120)
    public final int method1343(int arg0) {
        field2872++;
        if (this.field2867 == null) {
            return 0;
        } else {
            if (arg0 > -23) {
                this.method1344((byte) -94);
            }
            return this.field2867.length;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 135)
    public final void method1344(byte arg0) {
        if (arg0 >= -3) {
            this.field2867 = null;
        }
        field2869++;
        if (this.field2866 != null) {
            for (int var2 = 0; var2 < this.field2866.length; var2++) {
                this.field2866[var2] = class151.method1076(this.field2866[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLgk;)Ljava/lang/String;", line = 158)
    public final String method1345(byte arg0, class540 arg1) {
        field2868++;
        if (arg0 >= -60) {
            this.method1347((byte) -17);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2867 != null) {
            for (int var4 = 0; var4 < this.field2867.length; var4++) {
                var3.append(this.field2870[var4]);
                var3.append(this.field2858.method2748(this.method1341(var4, (byte) 120), this.field2865[var4], arg1.method3108(-118, class117.method867(this.field2867[var4], (byte) 88).field3557), (byte) 88));
            }
        }
        var3.append(this.field2870[this.field2870.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 188)
    public static void method1346(boolean arg0) {
        field2856 = null;
        if (!arg0) {
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)Ljava/lang/String;", line = 202)
    public final String method1347(byte arg0) {
        if (arg0 >= -12) {
            this.field2870 = null;
        }
        field2864++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2870 == null) {
            return "";
        }
        var2.append(this.field2870[0]);
        for (int var3 = 1; var3 < this.field2870.length; var3++) {
            var2.append("...");
            var2.append(this.field2870[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lgk;[IB)V", line = 229)
    public final void method1348(class540 arg0, int[] arg1, byte arg2) {
        field2862++;
        if (this.field2867 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2867.length && arg1.length > var4; var4++) {
            int var5 = this.method1341(var4, (byte) 118).field3558;
            if (var5 > 0) {
                arg0.method3148(var5, (long) arg1[var4], true);
            }
        }
        if (arg2 >= -13) {
            method1342(-108, -127);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)I", line = 260)
    public final int method1349(int arg0, int arg1, int arg2) {
        field2860++;
        if (this.field2867 == null || arg2 < 0 || arg2 > this.field2867.length) {
            return -1;
        } else if (this.field2865[arg2] == null || arg1 < 0 || arg1 > this.field2865[arg2].length) {
            return -1;
        } else {
            if (arg0 != 6803) {
                this.field2870 = null;
            }
            return this.field2865[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(BLgk;)V", line = 278)
    public final void method1350(byte arg0, class540 arg1) {
        while (true) {
            int var3 = arg1.method3115(29871);
            if (var3 == 0) {
                if (arg0 != 41) {
                    return;
                }
                field2857++;
                return;
            }
            this.method1340(60, var3, arg1);
        }
    }
}
