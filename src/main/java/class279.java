import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class279 extends class114 {

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Z")
    private boolean field4428 = true;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "Z")
    private boolean field4438 = true;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 == 12953) {
            ++field4431;
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        super.field1648 = arg0.method1374((byte) -60) == 1;
                    }
                } else {
                    this.field4438 = arg0.method1374((byte) -60) == 1;
                }
            } else {
                this.field4428 = arg0.method1374((byte) -60) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V")
    public static final void method1807(int arg0) {
        int var1 = -89 / ((arg0 - 50) / 32);
        ++field4434;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class279() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static final void method1808(byte arg0) {
        class260.field4192.method944(-88);
        if (arg0 <= -69) {
            ++field4426;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        int[] var3 = super.field1630.method302(arg0, -117);
        if (arg1) {
            method1807(-19);
        }
        if (super.field1630.field710) {
            int[] var4 = this.method729(this.field4438 ? -arg0 + class134.field1840 : arg0, 0, 0);
            if (!this.field4428) {
                class285.method1878(var4, 0, var3, 0, class145.field2009);
            } else {
                for (int var5 = 0; var5 < class145.field2009; ++var5) {
                    var3[var5] = var4[-var5 + class309.field4977];
                }
            }
        }
        ++field4427;
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
    public static final void method1809(int arg0, byte arg1) {
        class78.field1084.method943(arg0, true);
        if (arg1 == -119) {
            ++field4432;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field4429;
        int[][] var3 = super.field1627.method104(arg1, (byte) 112);
        if (super.field1627.field280) {
            int[][] var4 = this.method727(0, !this.field4438 ? arg1 : -arg1 + class134.field1840, arg0 ^ -806);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            if (!this.field4428) {
                for (int var11 = 0; var11 < class145.field2009; ++var11) {
                    var8[var11] = var5[var11];
                    var7[var11] = var9[var11];
                    var10[var11] = var6[var11];
                }
            } else {
                for (int var12 = 0; class145.field2009 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class309.field4977];
                    var7[var12] = var9[-var12 + class309.field4977];
                    var10[var12] = var6[-var12 + class309.field4977];
                }
            }
        }
        if (arg0 != -112) {
            this.field4438 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(BI)I")
    public static final int method1810(byte arg0, int arg1) {
        if (arg0 > -78) {
            method1810((byte) 51, -100);
        }
        ++field4430;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1811(Component arg0, int arg1) {
        ++field4436;
        int var2 = 78 / ((78 - arg1) / 38);
        arg0.removeMouseListener(class96.field1379);
        arg0.removeMouseMotionListener(class96.field1379);
        arg0.removeFocusListener(class96.field1379);
        class168.field2400 = 0;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(III)I")
    public static final int method1812(int arg0, int arg1, int arg2) {
        ++field4437;
        if (~arg2 < ~arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != 0) {
            method1809(112, (byte) -97);
        }
        return arg1;
    }
}
