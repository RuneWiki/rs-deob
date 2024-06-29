import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class125 {

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "Z")
    public boolean field1638 = true;

    @OriginalMember(owner = "client!lfa", name = "n", descriptor = "I")
    private int field1644 = -1;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    private int field1633;

    @OriginalMember(owner = "client!lfa", name = "p", descriptor = "Lwk;")
    private class151 field1646;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "Lht;")
    private class605 field1641;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "I")
    private int field1639;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lmq;")
    private class532 field1632;

    @OriginalMember(owner = "client!lfa", name = "q", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "Lkt;")
    private class166 field1640;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "Lke;")
    public static class622 field1634 = new class622(108, -1);

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!lfa", name = "m", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!lfa", name = "o", descriptor = "Lrb;")
    public static class370 field1645;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IBLmq;)V")
    public final void method917(int arg0, byte arg1, class532 arg2) {
        if (arg0 > 0) {
            this.method921(86);
            this.field1646.method1104(true, this.field1640);
            this.field1646.method1133(class415.field5856, this.field1639, arg2, 0, this.field1636 + 1 - this.field1639, arg0, 6);
        }
        field1635++;
        if (arg1 != -102) {
            this.field1640 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljava/lang/String;CILjava/lang/String;)Ljava/lang/String;")
    public static final String method918(String arg0, char arg1, int arg2, String arg3) {
        field1643++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = var4;
        int var7 = var5 - 1;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg0.indexOf(arg1, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg0.indexOf(arg1, var10);
            if (var11 < 0) {
                var9.append(arg0.substring(var10));
                int var12 = -10 / ((-arg2 - 40) / 32);
                return var9.toString();
            }
            var9.append(arg0.substring(var10, var11));
            var9.append(arg3);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method919(int arg0) {
        if (arg0 == -1) {
            field1634 = null;
            field1645 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
    public final void method920(int arg0) {
        field1642++;
        this.method917(this.field1647, (byte) -102, this.field1632);
        int var2 = 105 / ((arg0 - 76) / 40);
    }

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)V")
    private final void method921(int arg0) {
        field1631++;
        if (!this.field1638) {
            return;
        }
        this.field1638 = false;
        byte[] var2 = this.field1641.field8515;
        int var3 = 0;
        int var4 = this.field1641.field8514;
        int var5 = this.field1641.field8514 * this.field1633 + this.field1637;
        if (arg0 < 66) {
            return;
        }
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field1640 != null && this.field1644 == var3) {
            this.field1638 = false;
            return;
        }
        this.field1644 = var3;
        int var7 = 0;
        int var8 = this.field1633 * var4 + this.field1637;
        if (!this.field1646.method1070(-128, class539.field7574, class770.field10614)) {
            if (class463.field6608 == null) {
                class463.field6608 = new int[16384];
            }
            int[] var9 = class463.field6608;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var8] == 0) {
                        int var12 = 0;
                        if (var2[var8 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var12++;
                        }
                        var9[var7++] = var12 * 17 << 24;
                    } else {
                        var9[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field1641.field8514 - 128;
            }
            if (this.field1640 == null) {
                this.field1640 = this.field1646.method1058(false, class463.field6608, 128, (byte) -24, 128);
                this.field1640.method42(false, (byte) -122, false);
            } else {
                this.field1640.method41(0, 128, 128, 0, 128, false, 0, class463.field6608);
            }
            return;
        }
        if (class88.field1149 == null) {
            class88.field1149 = new byte[16384];
        }
        byte[] var13 = class88.field1149;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var8] == 0) {
                    int var16 = 0;
                    if (var2[var8 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var8 + var4] != 0) {
                        var16++;
                    }
                    var13[var7++] = (byte) (var16 * 17);
                } else {
                    var13[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field1641.field8514 - 128;
        }
        if (this.field1640 == null) {
            this.field1640 = this.field1646.method1105(true, class88.field1149, 128, 128, class539.field7574, false);
            this.field1640.method42(false, (byte) -122, false);
        } else {
            this.field1640.method43(0, 0, 128, 128, class539.field7574, class88.field1149, 128, false, 0);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lwk;Lht;Lmg;IIIII)V")
    public class125(class151 arg0, class605 arg1, class157 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1633 = arg7;
        this.field1646 = arg0;
        this.field1641 = arg1;
        this.field1637 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4420 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field2334[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field1640 = null;
            this.field1647 = 0;
        } else {
            this.field1636 = Integer.MIN_VALUE;
            this.field1639 = Integer.MAX_VALUE;
            this.field1632 = this.field1646.method1045(false, (byte) 115);
            this.field1632.method50(false, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field1632.method48((byte) -31, true);
                if (var15 != null) {
                    Stream var16 = this.field1646.method1127(-76, var15);
                    if (Stream.method3956()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4420 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field2334[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 > this.field1636) {
                                            this.field1636 = var22;
                                        }
                                        if (this.field1639 > var22) {
                                            this.field1639 = var22;
                                        }
                                        var16.method3950(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4420 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field2334[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field1639 > var28) {
                                            this.field1639 = var28;
                                        }
                                        if (this.field1636 < var28) {
                                            this.field1636 = var28;
                                        }
                                        var16.method3962(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3959();
                    if (this.field1632.method49(-11488)) {
                        break;
                    }
                }
            }
            this.field1647 = var10 / 3;
        }
    }
}
