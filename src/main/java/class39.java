import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class39 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[I")
    private int[] field854;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "[I")
    private int[] field869;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "Ldf;")
    private class37 field866;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Ldf;")
    private class37 field868;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[Ldf;")
    private class37[] field867;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "[Lhi;")
    public static class79[] field855 = new class79[500];

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Ldd;")
    public static class35 field864 = class180.method1196((byte) 126, "<)4col>");

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Ldd;")
    private static class35 field870 = class180.method1196((byte) 127, "Prepared sound engine");

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "[Lv;")
    public static class197[] field858 = new class197[16];

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "[Ldd;")
    public static class35[] field871 = new class35[200];

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Ldd;")
    public static class35 field865 = field870;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "J")
    public static long field859;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method376(int arg0, KeyEvent arg1) {
        field862++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (arg0 != -4865) {
            method377(-102);
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method377(int arg0) {
        if (arg0 != 0) {
            method377(14);
        }
        field870 = null;
        field855 = null;
        field864 = null;
        field871 = null;
        field865 = null;
        field858 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Ldd;")
    public static final class35 method378(int arg0, int arg1, int arg2) {
        field860++;
        int var3 = arg1 - arg2;
        if (arg0 < ~var3) {
            return class36.field789;
        } else if (var3 < -6) {
            return class80.field1866;
        } else if (var3 < -3) {
            return class95.field2097;
        } else if (var3 < 0) {
            return class172.field3446;
        } else if (var3 > 9) {
            return class84.field1925;
        } else if (var3 > 6) {
            return class133.field2848;
        } else if (var3 > 3) {
            return class208.field4126;
        } else if (var3 > 0) {
            return class111.field2457;
        } else {
            return class103.field2298;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lag;IIDZLph;I)[I")
    public final int[] method379(class8 arg0, int arg1, int arg2, double arg3, boolean arg4, class151 arg5, int arg6) {
        class123.method873(arg2 ^ 0xFFFFFEFE, arg3);
        class65.field1549 = arg5;
        field872++;
        class135.field2909 = arg0;
        class3.method17(arg1, arg6, 20295);
        int[] var9 = new int[arg1 * arg6];
        for (int var10 = 0; var10 < this.field867.length; var10++) {
            this.field867[var10].method372(arg1, -16, arg6);
        }
        int var11;
        int var12;
        byte var13;
        if (arg4) {
            var11 = -1;
            var12 = arg1 - 1;
            var13 = -1;
        } else {
            var13 = 1;
            var12 = 0;
            var11 = arg1;
        }
        int var14 = 0;
        if (arg2 != 1) {
            method376(43, null);
        }
        for (int var15 = 0; var15 < arg6; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field866.field825) {
                int[] var21 = this.field866.method7((byte) 75, var15);
                var20 = var21;
                var19 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field866.method14(var15, arg2 ^ 0x66);
                var18 = var17[2];
                var19 = var17[0];
                var20 = var17[1];
            }
            for (int var22 = var12; var22 != var11; var22 += var13) {
                int var23 = var19[var22] >> 4;
                int var24 = var20[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                int var25 = var18[var22] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class15.field267[var23];
                int var27 = class15.field267[var24];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class15.field267[var25];
                var9[var14++] = (var26 << 16) + (var27 << 8) + var28;
            }
        }
        for (int var16 = 0; var16 < this.field867.length; var16++) {
            this.field867[var16].method368(3);
        }
        return var9;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lag;ILph;)Z")
    public final boolean method380(class8 arg0, int arg1, class151 arg2) {
        field856++;
        if (arg1 >= -70) {
            method376(-9, null);
        }
        for (int var4 = 0; var4 < this.field854.length; var4++) {
            if (!arg0.method40(-12065, this.field854[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field869.length; var5++) {
            if (!arg2.method838(this.field869[var5], -122)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class39() {
        this.field854 = new int[0];
        this.field869 = new int[0];
        this.field866 = new class38();
        this.field868 = new class38();
        this.field867 = new class37[] { this.field866, this.field868 };
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lce;)V")
    public class39(class26 arg0) {
        int var2 = arg0.method221(-99);
        int[][] var3 = new int[var2][];
        class107 var4 = new class107(64);
        class107 var5 = new class107(64);
        class107 var6 = new class107(64);
        this.field867 = new class37[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class37 var21 = class182.method1208(arg0, -17);
            int var22 = var21.method367((byte) 96);
            int var23 = var21.method366((byte) 76);
            if (var22 >= 0 && var22 >= 0 && var5.method796(true, (long) var22) == null) {
                var5.method789(new class15(var22), true, (long) var22);
            }
            if (var23 >= 0 && var23 >= 0 && var6.method796(true, (long) var23) == null) {
                var6.method789(new class15(var23), true, (long) var23);
            }
            int var26 = var21.field819.length;
            var3[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var3[var7][var27] = arg0.method221(-85);
            }
            var4.method789(var21, true, (long) var21.field820);
            this.field867[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class37 var17 = this.field867[var8];
            int var18 = var17.field819.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class37 var20 = (class37) var4.method796(true, (long) var3[var8][var19]);
                var17.field819[var19] = var20;
            }
            var3[var8] = null;
        }
        Object var9 = null;
        this.field866 = (class37) var4.method796(true, (long) arg0.method221(-100));
        this.field868 = (class37) var4.method796(true, (long) arg0.method221(-82));
        this.field854 = new int[var5.method792((byte) 87)];
        this.field869 = new int[var6.method792((byte) -102)];
        Object var10 = null;
        class109[] var11 = new class109[var5.method792((byte) 110)];
        class109[] var12 = new class109[var6.method792((byte) 67)];
        var5.method793(var11, -109);
        Object var13 = null;
        var6.method793(var12, -128);
        Object var14 = null;
        for (int var15 = 0; var15 < var11.length; var15++) {
            this.field854[var15] = ((class15) var11[var15]).field276;
        }
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field869[var16] = ((class15) var12[var16]).field276;
        }
    }
}
