import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class191 extends class232 {

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "I")
    private int field3198 = -1;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "[Lhi;")
    public static class82[] field3191 = new class82[8];

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "[I")
    public static int[] field3203 = new int[100];

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "Loe;")
    public static class79 field3195 = new class79(8);

    @OriginalMember(owner = "client!ci", name = "mb", descriptor = "I")
    public static int field3211 = 50;

    @OriginalMember(owner = "client!ci", name = "kb", descriptor = "[I")
    public static int[] field3209 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "nb", descriptor = "[I")
    public static int[] field3212 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "ib", descriptor = "Lhi;")
    public static class82 field3207 = class95.method664((byte) -64, "<img=0>");

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "[Lhi;")
    public static class82[] field3206 = new class82[field3211];

    @OriginalMember(owner = "client!ci", name = "sb", descriptor = "[I")
    public static int[] field3217 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "pb", descriptor = "[I")
    public static int[] field3214 = new int[100];

    @OriginalMember(owner = "client!ci", name = "qb", descriptor = "[I")
    public static int[] field3215 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "rb", descriptor = "[I")
    public static int[] field3216 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "ob", descriptor = "[I")
    public static int[] field3213 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "jb", descriptor = "[I")
    public static int[] field3208 = new int[field3211];

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!ci", name = "lb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "Lum;")
    public static class222 field3190;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "[I")
    private int[] field3189;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lum;Lum;ILgk;Lum;)Z", line = 7)
    public static final boolean method1327(class222 arg0, class222 arg1, int arg2, class203 arg3, class222 arg4) {
        class53.field847 = arg4;
        field3193++;
        if (arg2 <= 76) {
            field3215 = (int[]) null;
        }
        class86.field1537 = arg3;
        class135.field2334 = arg1;
        class165.field2881 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V", line = 23)
    public final void method1328(int arg0) {
        int var2 = -1 % ((arg0 - 70) / 45);
        super.method1328(117);
        this.field3189 = null;
        field3196++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lme;B)Lme;", line = 33)
    public static final class75 method1329(class75 arg0, byte arg1) {
        if (arg1 != -1) {
            method1333(104);
        }
        field3192++;
        class75 var2 = client.method868(arg0);
        if (var2 == null) {
            var2 = arg0.field1157;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)Z", line = 51)
    private final boolean method1330(int arg0) {
        field3201++;
        if (this.field3189 != null) {
            return true;
        } else if (this.field3198 < 0) {
            if (arg0 < 0) {
                field3207 = (class82) null;
            }
            return false;
        } else {
            int var2 = class54.field858;
            int var3 = class133.field2294;
            int var4 = class36.field594.method638(0, this.field3198) ? 64 : 128;
            this.field3189 = class36.field594.method620(this.field3198, 113);
            this.field3197 = var4;
            this.field3199 = var4;
            class219.method1553(var3, var2, (byte) 62);
            return this.field3189 != null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)[[I", line = 97)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            field3205 = 75;
        }
        field3194++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278 && this.method1330(96)) {
            int var4 = this.field3199 * (class133.field2294 == this.field3197 ? arg0 : this.field3197 * arg0 / class133.field2294);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class54.field858 == this.field3199) {
                for (int var11 = 0; var11 < class54.field858; var11++) {
                    int var12 = this.field3189[var4++];
                    var7[var11] = class277.method1935(var12, 255) << 4;
                    var5[var11] = class277.method1935(var12, 65280) >> 4;
                    var6[var11] = class277.method1935(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class54.field858; var8++) {
                    int var9 = this.field3199 * var8 / class54.field858;
                    int var10 = this.field3189[var4 + var9];
                    var7[var8] = class277.method1935(var10, 255) << 4;
                    var5[var8] = class277.method1935(var10, 65280) >> 4;
                    var6[var8] = class277.method1935(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBLbc;)V", line = 166)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 == -19) {
            field3202++;
            if (arg0 == 0) {
                this.field3198 = arg2.method1090(false);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)I", line = 188)
    public final int method1331(int arg0) {
        if (arg0 == -1) {
            field3204++;
            return this.field3198;
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 327)
    public class191() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILhi;)V", line = 206)
    public static final void method1332(boolean arg0, int arg1, class82 arg2) {
        class82 var3 = arg2.method538((byte) -80);
        field3200++;
        int var4 = 0;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class183.field3125; var6++) {
            class312 var7 = class273.method1912(var6, -66);
            if ((!arg0 || var7.field5321) && var7.field5370 == -1 && var7.field5387 == -1 && var7.field5329 == 0 && var7.field5364.method538((byte) -80).method563(119, var3) != -1) {
                if (var4 >= 250) {
                    class184.field3131 = -1;
                    class105.field1872 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class105.field1872 = var5;
        class184.field3131 = var4;
        class254.field4380 = 0;
        class82[] var10 = new class82[class184.field3131];
        int var11 = 76 % ((48 - arg1) / 38);
        for (int var12 = 0; var12 < class184.field3131; var12++) {
            var10[var12] = class273.method1912(var5[var12], -78).field5364;
        }
        class35.method274(class105.field1872, var10, 119);
    }

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V", line = 294)
    public static void method1333(int arg0) {
        field3203 = null;
        field3212 = null;
        field3191 = null;
        field3217 = null;
        field3209 = null;
        field3213 = null;
        if (arg0 != 21115) {
            method1332(true, 124, (class82) null);
        }
        field3215 = null;
        field3216 = null;
        field3207 = null;
        field3206 = null;
        field3208 = null;
        field3214 = null;
        field3195 = null;
        field3190 = null;
    }
}
