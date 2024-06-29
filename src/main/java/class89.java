import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class89 extends class96 {

    @OriginalMember(owner = "client!ed", name = "K", descriptor = "Lum;")
    public static class82 field1237 = new class82("WTI", 5);

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "I")
    public static int field1241 = -1;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "[Lcr;")
    public static class362[] field1243 = new class362[5];

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ed", name = "L", descriptor = "Lmm;")
    public static class18 field1238;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "Lvn;")
    public static class261 field1245;

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "[Ljk;")
    private class132[] field1239;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z[[I)V")
    private final void method619(boolean arg0, int[][] arg1) {
        if (!arg0) {
            this.field1239 = null;
        }
        ++field1242;
        int var3 = class269.field3403;
        int var4 = class477.field6965;
        class316.method1884(200, arg1);
        class345.method2029((byte) 4, class380.field4948, 0, class292.field3781, 0);
        if (this.field1239 != null) {
            for (int var5 = 0; ~var5 > ~this.field1239.length; ++var5) {
                class132 var6 = this.field1239[var5];
                int var7 = var6.field1787;
                int var8 = var6.field1792;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method927(var4, var3, (byte) -127);
                    }
                } else if (~var8 <= -1) {
                    var6.method928(var4, var3, 0);
                } else {
                    var6.method929(var4, true, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        if (arg1 != 255) {
            field1241 = -85;
        }
        ++field1244;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            this.method619(true, super.field1331.method398(12054));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        ++field1246;
        if (arg0 != 3) {
            field1238 = null;
        }
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int var4 = class269.field3403;
            int var5 = class477.field6965;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field1333.method688(-26835);
            this.method619(true, var6);
            for (int var8 = 0; class477.field6965 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class269.field3403; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class60.method339(var15 << 4, 4080);
                    var12[var14] = class60.method339(var15, 65280) >> 4;
                    var11[var14] = class60.method339(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1245 = null;
        if (arg0 != 0) {
            method620(-73);
        }
        field1237 = null;
        field1238 = null;
        field1243 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 == arg1) {
            this.field1239 = new class132[arg2.method617(2)];
            for (int var4 = 0; ~this.field1239.length < ~var4; ++var4) {
                int var5 = arg2.method617(2);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field1239[var4] = class188.method1238(arg2, 0);
                            }
                        } else {
                            this.field1239[var4] = class430.method2551(arg2, 31208);
                        }
                    } else {
                        this.field1239[var4] = class179.method1163(false, arg2);
                    }
                } else {
                    this.field1239[var4] = class430.method2550(arg2, 0);
                }
            }
        } else if (~arg0 == -2) {
            super.field1329 = ~arg2.method617(2) == -2;
        }
        ++field1240;
    }

    static {
        for (int var0 = 0; var0 < field1243.length; ++var0) {
            field1243[var0] = new class362();
        }
    }
}
