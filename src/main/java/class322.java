import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class322 extends class328 {

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Z")
    private boolean field4658 = true;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
    private boolean field4660 = true;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "[[I")
    public static int[][] field4662 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "[S")
    public static short[] field4655 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method2004(boolean arg0) {
        field4655 = null;
        field4662 = null;
        if (arg0) {
            method2005(80, -60, -2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)Z")
    public static final boolean method2005(int arg0, int arg1, int arg2) {
        int var3 = -32 % ((arg1 - 30) / 33);
        ++field4656;
        return (16 & arg2) != 0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field4661;
        int[][] var3 = super.field4725.method1886((byte) -121, arg0);
        if (super.field4725.field4371) {
            int[][] var4 = this.method2040(0, !this.field4660 ? arg0 : -arg0 + class589.field8379, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field4658) {
                for (int var11 = 0; class449.field6539 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class449.field6539 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class108.field1799];
                    var9[var12] = var6[-var12 + class108.field1799];
                    var10[var12] = var7[-var12 + class108.field1799];
                }
            }
        }
        int var13 = 97 % ((46 - arg1) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class322() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lke;Lke;B)V")
    public static final void method2006(class443 arg0, class443 arg1, byte arg2) {
        if (arg2 != 32) {
            field4655 = null;
        }
        ++field4659;
        if (arg1.field6470 != null) {
            arg1.method2619(true);
        }
        arg1.field6478 = arg0.field6478;
        arg1.field6470 = arg0;
        arg1.field6470.field6478 = arg1;
        arg1.field6478.field6470 = arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4728 = ~arg2.method1738(255) == -2;
                }
            } else {
                this.field4660 = ~arg2.method1738(255) == -2;
            }
        } else {
            this.field4658 = arg2.method1738(255) == 1;
        }
        if (arg0 <= 75) {
            field4655 = null;
        }
        ++field4664;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int var3 = 28 % ((arg1 - 48) / 56);
        ++field4663;
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, this.field4660 ? -arg0 + class589.field8379 : arg0, (byte) 119);
            if (this.field4658) {
                for (int var6 = 0; class449.field6539 > var6; ++var6) {
                    var4[var6] = var5[-var6 + class108.field1799];
                }
            } else {
                class164.method1146(var5, 0, var4, 0, class449.field6539);
            }
        }
        return var4;
    }
}
