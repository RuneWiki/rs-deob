import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class266 extends class175 {

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
    private int field4640 = 4096;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    private int field4645 = 4096;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    private int field4647 = 4096;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "Lmb;")
    public static class96 field4648 = class243.method1708("scape main", (byte) 104);

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "[I")
    public static int[] field4643 = new int[100];

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "Lff;")
    public static class3 field4642;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "Z")
    public static boolean field4644;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)V")
    public static void method1829(byte arg0) {
        int var1 = -127 / ((-24 - arg0) / 49);
        field4642 = null;
        field4648 = null;
        field4643 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field4641;
        if (arg1 != 64) {
            field4644 = false;
        }
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(arg0, arg1 ^ -2944, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class1.field11 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field4645 * var12 >> 12;
                    var9[var11] = this.field4647 * var13 >> 12;
                    var10[var11] = this.field4640 * var14 >> 12;
                } else {
                    var8[var11] = this.field4645;
                    var9[var11] = this.field4647;
                    var10[var11] = this.field4640;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class266() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lrg;Lgd;II)V")
    public static final void method1830(class239 arg0, class123 arg1, int arg2, int arg3) {
        ++field4646;
        class233 var4 = new class233();
        var4.field3993 = arg0.method1651(4139);
        var4.field3991 = arg0.method1617((byte) -43);
        var4.field3994 = new int[var4.field3993];
        var4.field3987 = new byte[var4.field3993][][];
        var4.field3997 = new class263[var4.field3993];
        var4.field4001 = new int[var4.field3993];
        var4.field3996 = new class263[var4.field3993];
        var4.field3988 = new int[var4.field3993];
        int var5 = 0;
        if (arg3 <= 17) {
            method1830((class239) null, (class123) null, 83, 78);
        }
        while (~var5 > ~var4.field3993) {
            try {
                int var6 = arg0.method1651(4139);
                if (~var6 != -1 && ~var6 != -2 && ~var6 != -3) {
                    if (var6 == 3 || var6 == 4) {
                        String var7 = new String(arg0.method1634(-76).method709(-60));
                        String var8 = new String(arg0.method1634(-56).method709(-48));
                        int var9 = arg0.method1651(4139);
                        String[] var10 = new String[var9];
                        for (int var11 = 0; var9 > var11; ++var11) {
                            var10[var11] = new String(arg0.method1634(-65).method709(-36));
                        }
                        byte[][] var12 = new byte[var9][];
                        if (var6 == 3) {
                            for (int var13 = 0; var13 < var9; ++var13) {
                                int var14 = arg0.method1617((byte) -43);
                                var12[var13] = new byte[var14];
                                arg0.method1630(var14, (byte) 0, var12[var13], 0);
                            }
                        }
                        var4.field4001[var5] = var6;
                        Class[] var15 = new Class[var9];
                        for (int var16 = 0; var16 < var9; ++var16) {
                            var15[var16] = class233.method1583(var10[var16], 0);
                        }
                        var4.field3996[var5] = arg1.method952((byte) -111, var8, class233.method1583(var7, 0), var15);
                        var4.field3987[var5] = var12;
                    }
                } else {
                    String var17 = new String(arg0.method1634(-96).method709(-117));
                    String var18 = new String(arg0.method1634(-106).method709(-79));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1617((byte) -43);
                    }
                    var4.field4001[var5] = var6;
                    var4.field3994[var5] = var19;
                    var4.field3997[var5] = arg1.method947(class233.method1583(var17, 0), (byte) 73, var18);
                }
            } catch (ClassNotFoundException var20) {
                var4.field3988[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3988[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3988[var5] = -3;
            } catch (Exception var23) {
                var4.field3988[var5] = -4;
            } catch (Throwable var24) {
                var4.field3988[var5] = -5;
            }
            ++var5;
        }
        class17.field252.method1814(1, var4);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field4649;
        int var4 = 96 % ((arg0 - -22) / 58);
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4640 = arg2.method1663((byte) -98);
                }
            } else {
                this.field4647 = arg2.method1663((byte) -67);
            }
        } else {
            this.field4645 = arg2.method1663((byte) 93);
        }
    }
}
