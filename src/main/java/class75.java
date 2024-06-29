import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class75 extends class242 {

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    private int field1238 = 4096;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    private int field1239 = 4096;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    private int field1242 = 4096;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "Z")
    public static boolean field1240 = false;

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "[Lde;")
    public static class108[] field1244;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method71(boolean arg0, int arg1) {
        ++field1245;
        int[][] var3 = super.field4257.method917(arg1, 1);
        if (super.field4257.field2357) {
            int[][] var4 = this.method1648(26484, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class264.field4654; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var9[var11] = this.field1239 * var12 >> 12;
                    var10[var11] = this.field1238 * var13 >> 12;
                    var8[var11] = this.field1242 * var14 >> 12;
                } else {
                    var9[var11] = this.field1239;
                    var10[var11] = this.field1238;
                    var8[var11] = this.field1242;
                }
            }
        }
        if (!arg0) {
            this.field1238 = -67;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
    public static void method561(int arg0) {
        if (arg0 == 2) {
            field1244 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "(I)I")
    public static final int method562(int arg0) {
        ++field1241;
        int var1 = -26 / ((-52 - arg0) / 41);
        if (class197.field3442) {
            return 0;
        } else if (!class215.method1436(104)) {
            return 1;
        } else {
            return class140.field2430 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "(I)V")
    public static final void method563(int arg0) {
        ++field1243;
        class20.field367.method558(25830);
        int var1 = class20.field367.method547(8, (byte) 80);
        if (~var1 > ~class112.field1845) {
            for (int var2 = var1; class112.field1845 > var2; ++var2) {
                class113.field1991[class24.field443++] = class46.field767[var2];
            }
        }
        if (~class112.field1845 > ~var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class112.field1845 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class46.field767[var3];
                class61 var5 = class46.field756[var4];
                int var6 = class20.field367.method547(1, (byte) 117);
                if (~var6 == -1) {
                    class46.field767[class112.field1845++] = var4;
                    var5.field4848 = class117.field2104;
                } else {
                    int var7 = class20.field367.method547(2, (byte) 92);
                    if (var7 == 0) {
                        class46.field767[class112.field1845++] = var4;
                        var5.field4848 = class117.field2104;
                        class192.field3359[class204.field3543++] = var4;
                    } else if (var7 == 1) {
                        class46.field767[class112.field1845++] = var4;
                        var5.field4848 = class117.field2104;
                        int var8 = class20.field367.method547(3, (byte) 65);
                        var5.method1842(var8, 105, false);
                        int var9 = class20.field367.method547(1, (byte) 69);
                        if (~var9 == -2) {
                            class192.field3359[class204.field3543++] = var4;
                        }
                    } else if (var7 == 2) {
                        class46.field767[class112.field1845++] = var4;
                        var5.field4848 = class117.field2104;
                        int var10 = class20.field367.method547(3, (byte) 62);
                        var5.method1842(var10, 71, true);
                        int var11 = class20.field367.method547(3, (byte) 113);
                        var5.method1842(var11, 104, true);
                        int var12 = class20.field367.method547(1, (byte) 35);
                        if (var12 == 1) {
                            class192.field3359[class204.field3543++] = var4;
                        }
                    } else if (var7 == 3) {
                        class113.field1991[class24.field443++] = var4;
                    }
                }
            }
            if (arg0 != 2) {
                field1244 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field1242 = arg2.method193((byte) 77);
                }
            } else {
                this.field1238 = arg2.method193((byte) 77);
            }
        } else {
            this.field1239 = arg2.method193((byte) 77);
        }
        if (arg0 > -119) {
            this.field1239 = -16;
        }
        ++field1237;
    }
}
