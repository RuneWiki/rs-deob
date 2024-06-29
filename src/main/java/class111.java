import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class111 extends class195 {

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    private int field1687 = 5;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    private int field1694 = 0;

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
    private int field1697 = 1;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "[B")
    private byte[] field1700 = new byte[512];

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    private int field1693 = 2;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    private int field1691 = 2048;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "[S")
    private short[] field1692 = new short[512];

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
    private int field1702 = 5;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "[[I")
    public static int[][] field1695 = new int[104][104];

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Luj;")
    public static class156 field1686 = new class156();

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    public static int field1703 = 0;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "Lpi;")
    public static class73 field1701 = new class73(64);

    @OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!h", name = "pb", descriptor = "[[[B")
    public static byte[][][] field1707 = new byte[4][104][104];

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!h", name = "nb", descriptor = "Lpg;")
    public static class100 field1705;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "Lml;")
    public static class134 field1699;

    @OriginalMember(owner = "client!h", name = "mb", descriptor = "[Lmd;")
    public static class88[] field1704;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 7)
    public final void method14(int arg0) {
        if (arg0 != 2048879374) {
            method711((byte) 118);
        }
        this.field1700 = class272.method1799(20291, this.field1694);
        field1690++;
        this.method710((byte) -19);
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 18)
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)[I", line = 25)
    public final int[] method11(int arg0, boolean arg1) {
        field1689++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int var4 = (class215.field3424[arg0] * this.field1702) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class157.field2504; var7++) {
                class54.field868 = Integer.MAX_VALUE;
                class280.field4630 = Integer.MAX_VALUE;
                class173.field2755 = Integer.MAX_VALUE;
                class265.field4333 = Integer.MAX_VALUE;
                int var8 = class157.field2505[var7] * this.field1687 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field1700[(this.field1702 > var11 ? var11 : var11 - this.field1702) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field1700[var12 + (this.field1687 > var13 ? var13 : var13 - this.field1687) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - (this.field1692[var14] + (var13 << 12));
                        int var16 = var4 - (var11 << 12) - this.field1692[var27];
                        int var17 = this.field1697;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 < 0 ? -var15 : var15;
                            int var25 = var16 < 0 ? -var16 : var16;
                            var18 = var25 < var24 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var19 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var20 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var21 = var19 + var20;
                            var18 = var21 * var21 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 < 0 ? -var15 : var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class265.field4333) {
                            class54.field868 = class280.field4630;
                            class280.field4630 = class173.field2755;
                            class173.field2755 = class265.field4333;
                            class265.field4333 = var18;
                        } else if (var18 < class173.field2755) {
                            class54.field868 = class280.field4630;
                            class280.field4630 = class173.field2755;
                            class173.field2755 = var18;
                        } else if (class280.field4630 > var18) {
                            class54.field868 = class280.field4630;
                            class280.field4630 = var18;
                        } else if (var18 < class54.field868) {
                            class54.field868 = var18;
                        }
                    }
                }
                int var26 = this.field1693;
                if (var26 == 0) {
                    var3[var7] = class265.field4333;
                } else if (var26 == 1) {
                    var3[var7] = class173.field2755;
                } else if (var26 == 3) {
                    var3[var7] = class280.field4630;
                } else if (var26 == 4) {
                    var3[var7] = class54.field868;
                } else if (var26 == 2) {
                    var3[var7] = class173.field2755 - class265.field4333;
                }
            }
        }
        if (arg1) {
            this.field1687 = 99;
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lfj;II)V", line = 251)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field1688++;
        if (arg1 >= -117) {
            return;
        }
        if (arg2 == 0) {
            this.field1687 = this.field1702 = arg0.method64((byte) 106);
        } else if (arg2 == 1) {
            this.field1694 = arg0.method64((byte) -110);
        } else if (arg2 == 2) {
            this.field1691 = arg0.method63((byte) 1);
        } else if (arg2 == 3) {
            this.field1693 = arg0.method64((byte) -100);
        } else if (arg2 == 4) {
            this.field1697 = arg0.method64((byte) -125);
        } else if (arg2 == 5) {
            this.field1687 = arg0.method64((byte) 17);
        } else if (arg2 == 6) {
            this.field1702 = arg0.method64((byte) -99);
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V", line = 328)
    private final void method710(byte arg0) {
        field1698++;
        if (arg0 != -19) {
            method712(-121);
        }
        Random var2 = new Random((long) this.field1694);
        this.field1692 = new short[512];
        if (this.field1691 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field1692[var3] = (short) class44.method342(this.field1691, var2, arg0 + 19);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)Lmd;", line = 355)
    public static final class88 method711(byte arg0) {
        field1696++;
        int var1 = class64.field1006[0] * class232.field3741[0];
        if (arg0 > -67) {
            return (class88) null;
        }
        byte[] var2 = class247.field3989[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class161.field2553[class19.method151(255, var2[var4])];
        }
        class160 var5 = new class160(class227.field3641, class207.field3304, class155.field2475[0], class7.field152[0], class232.field3741[0], class64.field1006[0], var3);
        class162.method1035(-20432);
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 390)
    public static void method712(int arg0) {
        field1704 = null;
        field1699 = null;
        field1705 = null;
        field1686 = null;
        field1707 = (byte[][][]) null;
        field1695 = (int[][]) null;
        field1701 = null;
        if (arg0 != 2048) {
            method711((byte) -69);
        }
    }
}
