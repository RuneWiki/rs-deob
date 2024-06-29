import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class133 extends class666 {

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    private int field1498 = 0;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    private int field1501 = 0;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    private int field1503 = 2000;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    private int field1506 = 4096;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    private int field1502 = 16;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "Lkfa;")
    public static class549 field1496 = new class549(45, 3);

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method118(int arg0) {
        if (arg0 != -9) {
            this.method118(95);
        }
        class636.method3561(true);
        ++field1505;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field1504;
        if (arg0 >= -21) {
            this.field1502 = 76;
        }
        int[] var3 = super.field9466.method1811(arg1, 29);
        if (super.field9466.field4172) {
            int var4 = this.field1506 >> 1;
            int[][] var5 = super.field9466.method1806(true);
            Random var6 = new Random((long) this.field1498);
            for (int var7 = 0; var7 < this.field1503; ++var7) {
                int var8 = this.field1506 > 0 ? this.field1501 - -class252.method1448(var6, this.field1506, (byte) 50) - var4 : this.field1501;
                int var9 = (4090 & var8) >> 4;
                int var10 = class252.method1448(var6, class501.field7222, (byte) 50);
                int var11 = class252.method1448(var6, class567.field8041, (byte) 50);
                int var12 = (class277.field3512[var9] * this.field1502 >> 12) + var10;
                int var13 = (class425.field5646[var9] * this.field1502 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class252.method1448(var6, 4096, (byte) 50) >> 2) + 1024;
                    int var27 = var13 > var11 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class507.field7299 & var28;
                        int var31 = var21 & class515.field7357;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 -= var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method745(int arg0, String arg1) {
        ++field1497;
        if (class477.field6938) {
            if (arg0 != 18023) {
                field1496 = null;
            }
            boolean var2 = false;
            int var3 = class11.field111;
            int[] var4 = class79.field827;
            for (int var5 = 0; var3 > var5; ++var5) {
                class455 var6 = class362.field4726[var4[var5]];
                if (var6 != null && class377.field4914 != var6 && var6.field6324 != null && var6.field6324.equalsIgnoreCase(arg1)) {
                    ++class344.field4475;
                    class480.method2802(class379.field4918, 16751);
                    class334.field4314.method2546(true, 0);
                    class334.field4314.method2537(arg0 + 221, class420.field5591);
                    class334.field4314.method2566(class292.field3767, true);
                    class334.field4314.method2566(var4[var5], true);
                    class334.field4314.method2523(class411.field5451, (byte) 47);
                    class671.method3764(var6.method1656(true), var6.method1656(true), var6.field3839[0], 0, 0, -2, var6.field3841[0], true, (byte) -108);
                    var2 = true;
                    break;
                }
            }
            if (!var2) {
                class638.method3593(true, 4, class221.field2740.method1296(class226.field2899, (byte) -92) + arg1);
            }
            if (class477.field6938) {
                class420.method2278(arg0 ^ 21419);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        ++field1499;
        if (!arg2) {
            method745(54, (String) null);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field1506 = arg1.method2574(-1758460248);
                        }
                    } else {
                        this.field1501 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field1502 = arg1.method2541(77);
                }
            } else {
                this.field1503 = arg1.method2574(-1758460248);
            }
        } else {
            this.field1498 = arg1.method2541(72);
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class133() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method746(long arg0, byte arg1) {
        ++field1500;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (~(arg0 % 37L) == -1L) {
                return null;
            } else if (arg1 != 18) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg0;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg0 != 0L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class255.field3268[(int) (-(arg0 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = -1 + var6.length();
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        var9 = 160;
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
    public static void method747(int arg0) {
        if (arg0 <= 101) {
            method746(7L, (byte) -88);
        }
        field1496 = null;
    }
}
