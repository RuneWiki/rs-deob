import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class243 extends class23 {

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field4453 = 0;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "[Lih;")
    public static class94[] field4455 = new class94[5000];

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "Ldc;")
    private static class37 field4452 = class185.method1233((byte) 86, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field4454 = 0;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "Ldc;")
    public static class37 field4462 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "Ldc;")
    public static class37 field4459 = field4452;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field4463 = 0;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "[Lsa;")
    private class197[] field4460;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field4464;
        int[] var3 = super.field405.method1461(arg1, (byte) -125);
        if (super.field405.field4114) {
            this.method1586(super.field405.method1460((byte) -78), (byte) 54);
        }
        if (arg0 != 0) {
            method1585(-2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (arg1 != 9) {
            return null;
        } else {
            if (super.field398.field4303) {
                int var4 = class199.field3705;
                int var5 = class235.field4276;
                int[][][] var6 = super.field398.method1524(-47);
                int[][] var7 = new int[var5][var4];
                this.method1586(var7, (byte) 76);
                for (int var8 = 0; ~class235.field4276 < ~var8; ++var8) {
                    int[][] var9 = var6[var8];
                    int[] var10 = var9[0];
                    int[] var11 = var7[var8];
                    int[] var12 = var9[2];
                    int[] var13 = var9[1];
                    for (int var14 = 0; var14 < class199.field3705; ++var14) {
                        int var15 = var11[var14];
                        var12[var14] = class58.method449(var15, 255) << 4;
                        var13[var14] = class58.method449(var15, 65280) >> 4;
                        var10[var14] = class58.method449(var15, 16711680) >> 12;
                    }
                }
            }
            ++field4457;
            return var3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field4461;
        if (arg2 != 1000) {
            this.method40((class28) null, -98, -99);
        }
        if (arg1 == 0) {
            this.field4460 = new class197[arg0.method215(arg2 ^ -1797813792)];
            for (int var4 = 0; this.field4460.length > var4; ++var4) {
                int var5 = arg0.method215(-1797813752);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field4460[var4] = class241.method1578(arg0, true);
                            }
                        } else {
                            this.field4460[var4] = class164.method1110(arg0, 23090);
                        }
                    } else {
                        this.field4460[var4] = class125.method862((byte) -65, arg0);
                    }
                } else {
                    this.field4460[var4] = class197.method1313(arg0, 0);
                }
            }
        } else if (~arg1 == -2) {
            super.field407 = arg0.method215(-1797813752) == 1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    public static void method1585(int arg0) {
        if (arg0 != 0) {
            method1587(false, 34, (byte) -49, 97);
        }
        field4452 = null;
        field4462 = null;
        field4459 = null;
        field4455 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([[IB)V")
    private final void method1586(int[][] arg0, byte arg1) {
        ++field4458;
        int var3 = class199.field3705;
        int var4 = class235.field4276;
        class119.method819(4, arg0);
        class180.method1197(class215.field4008, 0, class5.field44, 0, -10);
        if (arg1 < 27) {
            this.method1586((int[][]) null, (byte) -128);
        }
        if (this.field4460 != null) {
            for (int var5 = 0; ~this.field4460.length < ~var5; ++var5) {
                class197 var6 = this.field4460[var5];
                int var7 = var6.field3675;
                int var8 = var6.field3681;
                if (var7 < 0) {
                    if (~var8 <= -1) {
                        var6.method713(var3, 127, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method714(var3, var4, -124);
                } else {
                    var6.method715(1, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIBI)V")
    public static final void method1587(boolean arg0, int arg1, byte arg2, int arg3) {
        int var4 = 88 % ((arg2 - -24) / 59);
        ++field4456;
        if (arg1 >= 8000 && arg1 <= 48000) {
            class32.field650 = arg0;
            class72.field1278 = arg1;
            class136.field2540 = arg3;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
