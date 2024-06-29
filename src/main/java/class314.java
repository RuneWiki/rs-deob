import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class314 extends class220 {

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    private int field4495 = 0;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    private int field4501 = 20;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    private int field4497 = 1365;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    private int field4498 = 0;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "[Ljd;")
    public static class130[] field4503 = new class130[8];

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field4506 = "skill: ";

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "[[I")
    public static int[][] field4502 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "[I")
    public static int[] field4499 = new int[500];

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "Lqj;")
    public static class238 field4507;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method1960(int arg0, String arg1, byte arg2) {
        ++field4504;
        boolean var3 = false;
        for (int var4 = 0; var4 < class153.field2004; ++var4) {
            class194 var5 = class125.field1664[class66.field943[var4]];
            if (var5 != null && var5.field2756 != null && var5.field2756.equalsIgnoreCase(arg1)) {
                if (~arg0 == -2) {
                    ++class451.field6580;
                    class232.field3279.method756(0, 152);
                    class232.field3279.method1719(0, 1549190008);
                    class232.field3279.method1693(class66.field943[var4], (byte) 100);
                } else if (~arg0 == -5) {
                    ++class95.field1314;
                    class232.field3279.method756(0, 114);
                    class232.field3279.method1693(class66.field943[var4], (byte) 39);
                    class232.field3279.method1687(-29012, 0);
                } else if (arg0 == 5) {
                    ++client.field3678;
                    class232.field3279.method756(0, 94);
                    class232.field3279.method1707(-121, 0);
                    class232.field3279.method1670(class66.field943[var4], (byte) -115);
                } else if (arg0 == 6) {
                    class232.field3279.method756(0, 35);
                    ++class157.field2060;
                    class232.field3279.method1693(class66.field943[var4], (byte) 34);
                    class232.field3279.method1687(-29012, 0);
                } else if (~arg0 == -8) {
                    ++class115.field1561;
                    class232.field3279.method756(0, 128);
                    class232.field3279.method1718(class66.field943[var4], (byte) -125);
                    class232.field3279.method1696(true, 0);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class135.method908(class119.field1595 + arg1, (byte) 53);
        }
        int var6 = -111 % ((arg2 - 58) / 53);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class314() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lud;Ljava/awt/Frame;Z)V")
    public static final void method1961(class2 arg0, Frame arg1, boolean arg2) {
        ++field4494;
        while (true) {
            class296 var3 = arg0.method16(arg1, 127);
            while (~var3.field4259 == -1) {
                class404.method2628(-56, 10L);
            }
            if (var3.field4259 == 1) {
                arg1.setVisible(false);
                if (!arg2) {
                    method1961((class2) null, (Frame) null, true);
                }
                arg1.dispose();
                return;
            }
            class404.method2628(-35, 100L);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLro;I)Ljava/lang/String;")
    public static final String method1962(byte arg0, class249 arg1, int arg2) {
        if (arg0 != 19) {
            method1961((class2) null, (Frame) null, true);
        }
        ++field4505;
        if (!client.method1572(arg1).method1141(arg2, (byte) -102) && arg1.field3632 == null) {
            return null;
        } else if (arg1.field3552 != null && arg1.field3552.length > arg2 && arg1.field3552[arg2] != null && arg1.field3552[arg2].trim().length() != 0) {
            return arg1.field3552[arg2];
        } else {
            return class381.field5720 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field4500;
        if (arg1 == -49) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            this.field4498 = arg2.method1685(arg1 ^ -8089);
                        }
                    } else {
                        this.field4495 = arg2.method1685(8104);
                    }
                } else {
                    this.field4501 = arg2.method1685(8104);
                }
            } else {
                this.field4497 = arg2.method1685(8104);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(B)V")
    public static void method1963(byte arg0) {
        if (arg0 == -9) {
            field4507 = null;
            field4499 = null;
            field4506 = null;
            field4502 = null;
            field4503 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field4493;
        int[] var3 = super.field3125.method2005(arg1, (byte) 77);
        if (arg0 != -11543) {
            method1963((byte) -61);
        }
        if (super.field3125.field4676) {
            for (int var4 = 0; var4 < class344.field5043; ++var4) {
                int var5 = (class160.field2096[var4] << 12) / this.field4497 + this.field4495;
                int var6 = (class58.field831[arg1] << 12) / this.field4497 + this.field4498;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 + var12 < 16384 && var13 < this.field4501; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 - -var7 + var11;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field4501 + -1) ? (var13 << 12) / this.field4501 : 0;
            }
        }
        return var3;
    }
}
