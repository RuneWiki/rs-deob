import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class89 extends class305 {

    @OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
    private int field1438 = 4096;

    @OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
    private int field1437 = 4096;

    @OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
    private int field1435 = 4096;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "Z")
    public static boolean field1441 = false;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "[I")
    public static int[] field1444 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bt", name = "E", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "([Lfi;IB)V")
    public static final void method774(class38[] arg0, int arg1, byte arg2) {
        ++field1443;
        if (arg2 < 49) {
            field1444 = null;
        }
        for (int var3 = 0; ~var3 > ~arg0.length; ++var3) {
            class38 var4 = arg0[var3];
            if (var4 != null && var4.field600 == arg1 && !client.method3083(var4)) {
                if (var4.field503 == 0) {
                    method774(arg0, var4.field580, (byte) 57);
                    if (var4.field610 != null) {
                        method774(var4.field610, var4.field580, (byte) 89);
                    }
                    class295 var5 = (class295) class215.field3248.method358((byte) -128, (long) var4.field580);
                    if (var5 != null) {
                        class175.method1244(var5.field4546, (byte) -109);
                    }
                }
                if (var4.field503 == 6 && var4.field553 != -1) {
                    class61 var6 = class393.field5735.method1538(-4031, var4.field553);
                    if (var6 != null) {
                        var4.field509 += class124.field1851;
                        while (var6.field962[var4.field486] < var4.field509) {
                            var4.field509 -= var6.field962[var4.field486];
                            ++var4.field486;
                            if (var6.field976.length <= var4.field486) {
                                var4.field486 -= var6.field973;
                                if (var4.field486 < 0 || var6.field976.length <= var4.field486) {
                                    var4.field486 = 0;
                                }
                            }
                            var4.field487 = var4.field486 + 1;
                            if (~var4.field487 <= ~var6.field976.length) {
                                var4.field487 -= var6.field973;
                                if (~var4.field487 > -1 || var4.field487 >= var6.field976.length) {
                                    var4.field487 = -1;
                                }
                            }
                            class5.method27(var4, -208246073);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
    public class89() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)Lop;")
    public static final class300 method775(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field1440;
            try {
                return (class300) Class.forName("ge").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field1442;
        if (arg2 <= 76) {
            this.method14(6, (class194) null, (byte) 64);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field1437 = arg1.method1396(-118);
                }
            } else {
                this.field1435 = arg1.method1396(90);
            }
        } else {
            this.field1438 = arg1.method1396(74);
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V")
    public static final void method776(int arg0, int arg1, int arg2) {
        boolean var3 = class348.field5192[0][arg1][arg2] != null && class348.field5192[0][arg1][arg2].field4372 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class348.field5192[var4][arg1][arg2] == null) {
                class281 var5 = class348.field5192[var4][arg1][arg2] = new class281(var4, arg1, arg2);
                if (var3) {
                    ++var5.field4373;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field1436;
        int[][] var3 = super.field4674.method2206(-67, arg0);
        if (arg1 > -59) {
            return null;
        } else {
            if (super.field4674.field5110) {
                int[][] var4 = this.method2015(true, 0, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class91.field1471; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (var12 == var13 && ~var13 == ~var14) {
                        var8[var11] = this.field1438 * var12 >> 12;
                        var9[var11] = this.field1435 * var13 >> 12;
                        var10[var11] = this.field1437 * var14 >> 12;
                    } else {
                        var8[var11] = this.field1438;
                        var9[var11] = this.field1435;
                        var10[var11] = this.field1437;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "(B)V")
    public static void method777(byte arg0) {
        field1444 = null;
        if (arg0 < 104) {
            field1444 = null;
        }
    }
}
