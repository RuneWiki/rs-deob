import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class104 extends class232 {

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "Z")
    public static boolean field1844 = false;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Lhi;")
    public static class82 field1843 = class95.method664((byte) -67, "Regarder dans cette direction");

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Lam;")
    public static class277 field1840 = new class277();

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "Lhi;")
    public static class82 field1848 = class95.method664((byte) -66, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "[I")
    public static int[] field1838;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method146(int arg0, byte arg1) {
        field1847++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[] var4 = this.method1649(2, (byte) 53, arg0);
            int[][] var5 = this.method1641(0, arg0, (byte) -98);
            int[][] var6 = this.method1641(1, arg0, (byte) -98);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var5[0];
            int[] var10 = var3[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class54.field858; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var10[var16] = var9[var16];
                    var7[var16] = var11[var16];
                    var8[var16] = var12[var16];
                } else if (var17 == 0) {
                    var10[var16] = var13[var16];
                    var7[var16] = var14[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var10[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                    var7[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var12[var16] * var17 + (var15[var16] * var18) >> 12;
                }
            }
        }
        if (arg1 != -82) {
            method715(37, -5, 109, -96);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V", line = 90)
    public static final void method715(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = class15.field120[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class182 var5 = var4.field172;
        if (var5 != null) {
            var5.field3116 = var5.field3116 * arg3 / 16;
            var5.field3118 = var5.field3118 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Lq;", line = 105)
    public static final class182 method716(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class182 var4 = var3.field172;
            var3.field172 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V", line = 122)
    public static final void method717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class200.field3443 <= arg0 && class207.field3623 >= arg4 && class60.field931 <= arg5 && class29.field399 >= arg6) {
            if (arg1 == 1) {
                class44.method327(arg3, arg5, -101, arg6, arg4, arg0);
            } else {
                class243.method1748(arg6, arg0, arg1, arg4, arg3, arg5, arg2 ^ 0xFFFFFF9A);
            }
        } else if (arg1 == 1) {
            class91.method645(arg6, arg3, -116, arg5, arg4, arg0);
        } else {
            class217.method1545(arg1, arg5, arg0, (byte) 99, arg3, arg6, arg4);
        }
        field1841++;
        if (arg2 != -2) {
            field1849 = 91;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 158)
    public class104() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBLbc;)V", line = 163)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            this.method80(-121, (byte) 18);
        }
        if (arg0 == 0) {
            this.field3990 = arg2.method1082(-48) == 1;
        }
        field1839++;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 176)
    public static void method718(byte arg0) {
        field1840 = null;
        field1843 = null;
        field1838 = null;
        if (arg0 <= 60) {
            field1840 = (class277) null;
        }
        field1848 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(IB)[I", line = 198)
    public final int[] method80(int arg0, byte arg1) {
        int[] var3 = this.field4008.method131((byte) -104, arg0);
        field1845++;
        if (this.field4008.field256) {
            int[] var4 = this.method1649(0, (byte) 87, arg0);
            int[] var5 = this.method1649(1, (byte) 86, arg0);
            int[] var6 = this.method1649(2, (byte) 120, arg0);
            for (int var7 = 0; var7 < class54.field858; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        int var9 = -71 % ((-arg1 - 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 254)
    public static final void method719(boolean arg0) {
        field1846++;
        class61.field957.method1504(121, -1);
        class87.field1555++;
        if (!arg0) {
            field1848 = (class82) null;
        }
        for (class146 var1 = (class146) class191.field3195.method502((byte) -104); var1 != null; var1 = (class146) class191.field3195.method494(arg0)) {
            if (var1.field2469 == 0) {
                class117.method797(true, var1, true);
            }
        }
        if (class99.field1789 != null) {
            class138.method937(class99.field1789, 16);
            class99.field1789 = null;
        }
    }
}
