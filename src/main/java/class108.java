import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class108 extends class136 {

    @OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
    private int field1532 = 2048;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    private int field1528 = 4096;

    @OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
    private int field1531 = 0;

    @OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
    private int field1533 = 2048;

    @OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
    private int field1536 = 12288;

    @OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
    private int field1534 = 0;

    @OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
    private int field1537 = 8192;

    @OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
    public static int field1535 = 2;

    @OriginalMember(owner = "client!kt", name = "S", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "Lsl;")
    public static class318 field1527 = new class318(45, 3);

    @OriginalMember(owner = "client!kt", name = "U", descriptor = "F")
    public static float field1543;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!kt", name = "O", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!kt", name = "T", descriptor = "Lqt;")
    public static class449 field1542;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kt", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1544;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method895(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIII)Z", line = 6)
    public static final boolean method891(byte arg0, int arg1, int arg2, int arg3) {
        ++field1538;
        if (arg0 >= -51) {
            method891((byte) -46, -8, -110, -80);
        }
        class529 var4 = (class529) class344.method2079(arg2, arg3, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class367.method2268(27298, var4);
        }
        class529 var6 = (class529) class262.method1683(arg2, arg3, arg1, field1544 != null ? field1544 : (field1544 = method895("f")));
        if (var6 != null) {
            var5 &= class367.method2268(27298, var6);
        }
        class529 var7 = (class529) class282.method1802(arg2, arg3, arg1);
        if (var7 != null) {
            var5 &= class367.method2268(27298, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 105)
    public class108() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)V", line = 42)
    public static void method892(byte arg0) {
        if (arg0 == 18) {
            field1527 = null;
            field1542 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[I", line = 56)
    public final int[] method82(int arg0, int arg1) {
        ++field1529;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = -59 % ((67 - arg0) / 50);
        if (super.field1957.field7031) {
            int var5 = class290.field4168[arg1] - 2048;
            for (int var6 = 0; class467.field6889 > var6; ++var6) {
                int var7 = class453.field6672[var6] + -2048;
                int var8 = this.field1532 + var7;
                int var9 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var11 = this.field1531 + var5;
                int var12 = ~var11 > 2047 ? var11 - -4096 : var11;
                int var13 = var12 <= 2048 ? var12 : var12 + -4096;
                int var14 = var7 - -this.field1534;
                int var15 = var14 < -2048 ? var14 - -4096 : var14;
                int var16 = ~var15 >= -2049 ? var15 : var15 + -4096;
                int var17 = this.field1533 + var5;
                int var18 = ~var17 > 2047 ? var17 + 4096 : var17;
                int var19 = var18 <= 2048 ? var18 : var18 + -4096;
                var3[var6] = !this.method893(var10, var13, -1364948212) && !this.method894(var19, var16, (byte) -8) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILiv;)V", line = 109)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 == 4) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (arg1 == 6) {
                                        this.field1537 = arg2.method623((byte) 118);
                                    }
                                } else {
                                    this.field1528 = arg2.method623((byte) -36);
                                }
                            } else {
                                this.field1536 = arg2.method623((byte) -63);
                            }
                        } else {
                            this.field1533 = arg2.method623((byte) 90);
                        }
                    } else {
                        this.field1534 = arg2.method623((byte) 89);
                    }
                } else {
                    this.field1531 = arg2.method623((byte) 116);
                }
            } else {
                this.field1532 = arg2.method623((byte) -114);
            }
            ++field1530;
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(III)Z", line = 188)
    private final boolean method893(int arg0, int arg1, int arg2) {
        ++field1539;
        int var4 = (-arg0 + arg1) * this.field1536 >> 12;
        int var5 = class25.field297[(var4 * 255 & 1048362) >> 12];
        int var6 = (var5 << 12) / this.field1536;
        int var7 = (var6 << 12) / this.field1537;
        int var8 = this.field1528 * var7 >> 12;
        if (arg2 != -1364948212) {
            field1542 = null;
        }
        return arg0 + arg1 < var8 && ~(-var8) > ~(arg0 + arg1);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)Z", line = 206)
    private final boolean method894(int arg0, int arg1, byte arg2) {
        ++field1526;
        int var4 = (arg0 + arg1) * this.field1536 >> 12;
        int var5 = class25.field297[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1536;
        int var7 = (var6 << 12) / this.field1537;
        int var8 = this.field1528 * var7 >> 12;
        if (arg2 != -8) {
            this.field1531 = 96;
        }
        return var8 > -arg1 + arg0 && -arg1 + arg0 > -var8;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V", line = 231)
    public final void method269(boolean arg0) {
        if (arg0) {
            field1542 = null;
        }
        class156.method1112(!arg0);
        ++field1540;
    }
}
