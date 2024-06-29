import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class41 {

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
    private int[] field852;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "[I")
    private int[] field848;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "La;")
    private class1 field854;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "La;")
    private class1 field850;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "[La;")
    private class1[] field859;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static volatile int field853 = -1;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Loc;")
    public static class151 field856 = class137.method873(2, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field857 = 0;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Loc;")
    public static class151 field862 = class137.method873(2, ")4l");

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Luc;")
    public static class211 field847 = new class211(128);

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Ljh;")
    public static class105 field860;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Lni;")
    public static final class147 method293(int arg0, int arg1, int arg2, int arg3) {
        field861++;
        class147 var4 = new class147();
        var4.field2630 = arg3;
        var4.field2631 = arg0;
        class227.field3961.method1536((byte) 102, var4, (long) arg1);
        class106.method640(arg2, arg0);
        class232 var5 = class175.method1115(-22192, arg1);
        if (var5 != null) {
            class27.method208(true, var5);
        }
        if (class7.field113 != null) {
            class27.method208(true, class7.field113);
            class7.field113 = null;
        }
        class225.field3917 = false;
        class117.field2108 = 0;
        class5.method31(class224.field3908, class222.field3856, arg2 - 9529, class55.field1109, class79.field1522);
        if (var5 != null) {
            class110.method665(var5, (byte) -111);
        }
        class51.method356(32, arg0);
        if (class31.field652 != -1) {
            class142.method917(class31.field652, 1, arg2 + 255);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method294(int arg0) {
        if (arg0 != 9366) {
            method294(-13);
        }
        field862 = null;
        field856 = null;
        field847 = null;
        field860 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lsd;Lsd;Lsd;I)V")
    public static final void method295(class192 arg0, class192 arg1, class192 arg2, int arg3) {
        if (arg3 != 255) {
            method293(102, 67, -114, -59);
        }
        class89.field1633 = arg0;
        field858++;
        class217.field3781 = arg1;
        class153.field2784 = arg2;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class41() {
        this.field852 = new int[0];
        this.field848 = new int[0];
        this.field854 = new class130();
        this.field854.field25 = 1;
        this.field850 = new class130();
        this.field850.field25 = 1;
        this.field859 = new class1[] { this.field854, this.field850 };
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BLj;Lsd;)Z")
    public final boolean method296(byte arg0, class97 arg1, class192 arg2) {
        field851++;
        for (int var4 = 0; var4 < this.field852.length; var4++) {
            if (!arg2.method1211(24122, this.field852[var4])) {
                return false;
            }
        }
        int var5 = -92 / ((arg0 + 46) / 51);
        for (int var6 = 0; var6 < this.field848.length; var6++) {
            if (!arg1.method464(6, this.field848[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLsd;Lj;ZIDI)[I")
    public final int[] method297(int arg0, boolean arg1, class192 arg2, class97 arg3, boolean arg4, int arg5, double arg6, int arg7) {
        int[] var10 = new int[arg0 * arg5];
        class111.method667(106, arg6);
        class159.field2868 = arg3;
        class200.field3543 = arg2;
        class235.method1531(arg0, (byte) 120, arg5);
        field849++;
        if (arg7 != 255) {
            this.method296((byte) -14, null, null);
        }
        for (int var11 = 0; var11 < this.field859.length; var11++) {
            this.field859[var11].method9(3, arg5, arg0);
        }
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var13 = arg0 - 1;
            var12 = -1;
            var14 = -1;
        } else {
            var12 = arg0;
            var13 = 0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field854.field27) {
                int[] var18 = this.field854.method11((byte) 107, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field854.method14(var16, -81);
                var21 = var22[1];
                var19 = var22[0];
                var20 = var22[2];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                int var25 = var21[var23] >> 4;
                int var26 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var24 > 255) {
                    var24 = 255;
                }
                int var27 = class11.field200[var26];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class11.field200[var25];
                int var29 = class11.field200[var24];
                var10[var15++] = (var28 << 8) + (var29 << 16) + var27;
                if (arg1) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field859.length; var17++) {
            this.field859[var17].method7((byte) -34);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lwa;)V")
    public class41(class229 arg0) {
        int var2 = arg0.method1475(255);
        int var3 = 0;
        this.field859 = new class1[var2];
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class1 var16 = class90.method574(arg0, 0);
            if (var16.method10((byte) 99) >= 0) {
                var4++;
            }
            if (var16.method12(5624) >= 0) {
                var3++;
            }
            int var17 = var16.field2.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1475(255);
            }
            this.field859[var6] = var16;
        }
        this.field852 = new int[var4];
        int var7 = 0;
        this.field848 = new int[var3];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class1 var11 = this.field859[var9];
            int var12 = var11.field2.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2[var13] = this.field859[var5[var9][var13]];
            }
            int var14 = var11.method10((byte) 85);
            int var15 = var11.method12(5624);
            if (var14 > 0) {
                this.field852[var7++] = var14;
            }
            if (var15 > 0) {
                this.field848[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field854 = this.field859[arg0.method1475(255)];
        this.field850 = this.field859[arg0.method1475(255)];
        Object var10 = null;
    }
}
