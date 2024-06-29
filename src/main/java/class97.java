import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class97 extends class276 {

    @OriginalMember(owner = "client!he", name = "V", descriptor = "I")
    private int field1665 = 0;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    private int field1669 = 4096;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field1661 = -1;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "[I")
    public static int[] field1658 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "[S")
    public static short[] field1668 = new short[] { 7, 31, 21, 1, 12, 5, 8, 11 };

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!he", name = "T", descriptor = "J")
    public static long field1663;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Lgb;")
    public static final class64 method611(int arg0, byte arg1) {
        ++field1660;
        class64 var2 = (class64) class51.field882.method57((long) arg0, -75);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class103.field1820.method746(0, (byte) -128, arg0);
            class64 var4 = new class64(var3);
            var4.method1628(class189.field3076, (int[]) null);
            if (arg1 != 102) {
                return null;
            } else {
                class51.field882.method62(0, var4, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method612(String arg0, int arg1, int arg2, String arg3) {
        ++field1670;
        class286.method1909((byte) 47, arg0, arg1, (String) null, arg3, arg2);
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static void method613(byte arg0) {
        field1658 = null;
        field1668 = null;
        if (arg0 != -119) {
            method614(-87);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        int[][] var3 = super.field4418.method835((byte) 112, arg0);
        ++field1664;
        if (super.field4418.field2164) {
            int[][] var4 = this.method1810((byte) 125, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class53.field929; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var8[var11];
                if (var12 >= this.field1665) {
                    if (~var12 >= ~this.field1669) {
                        var7[var11] = var12;
                    } else {
                        var7[var11] = this.field1669;
                    }
                } else {
                    var7[var11] = this.field1665;
                }
                if (var13 >= this.field1665) {
                    if (~this.field1669 > ~var13) {
                        var10[var11] = this.field1669;
                    } else {
                        var10[var11] = var13;
                    }
                } else {
                    var10[var11] = this.field1665;
                }
                if (~var14 <= ~this.field1665) {
                    if (var14 > this.field1669) {
                        var9[var11] = this.field1669;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field1665;
                }
            }
        }
        if (arg1 != -1) {
            this.method300(96, -97);
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
    public static final void method614(int arg0) {
        ++field1659;
        if (class259.field4243 != null) {
            class259.field4243.method1715(arg0 + -32067);
        }
        if (arg0 != 32067) {
            method616(-71, (byte) -91, 53, 56, -42);
        }
        if (class154.field2576 != null) {
            class154.field2576.method1715(0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field1667;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int[] var4 = this.method1805(false, 0, arg1);
            for (int var5 = 0; var5 < class53.field929; ++var5) {
                int var6 = var4[var5];
                if (~this.field1665 < ~var6) {
                    var3[var5] = this.field1665;
                } else if (this.field1669 < var6) {
                    var3[var5] = this.field1669;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return arg0 < 39 ? null : var3;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg2 != -1) {
            this.method21(5, (class101) null, (byte) -51);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4408 = arg1.method669((byte) 36) == 1;
                }
            } else {
                this.field1669 = arg1.method677(false);
            }
        } else {
            this.field1665 = arg1.method677(false);
        }
        ++field1662;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static final void method615(boolean arg0) {
        ++field1656;
        class204.field3333.method53(true);
        if (arg0) {
            method616(80, (byte) -88, 46, 56, 115);
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IBIII)V")
    public static final void method616(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class144 var5 = (class144) class53.field923.method779(66, (long) arg3);
        int var6 = 34 / ((43 - arg1) / 45);
        ++field1657;
        if (var5 == null) {
            var5 = new class144();
            class53.field923.method780((byte) -78, (long) arg3, var5);
        }
        if (var5.field2461.length <= arg0) {
            int[] var7 = new int[arg0 + 1];
            int[] var8 = new int[arg0 + 1];
            for (int var9 = 0; var9 < var5.field2461.length; ++var9) {
                var8[var9] = var5.field2461[var9];
                var7[var9] = var5.field2464[var9];
            }
            for (int var10 = var5.field2461.length; var10 < arg0; ++var10) {
                var8[var10] = -1;
                var7[var10] = 0;
            }
            var5.field2464 = var7;
            var5.field2461 = var8;
        }
        var5.field2461[arg0] = arg4;
        var5.field2464[arg0] = arg2;
    }
}
