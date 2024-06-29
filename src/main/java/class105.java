import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class105 extends class223 {

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    private int field1645 = -1;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    public static int field1640 = 0;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1642 = "K";

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Z")
    public static boolean field1646 = false;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "[S")
    public static short[] field1647 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "J")
    public static long field1634 = 0L;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1651;

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "[I")
    public int[] field1650;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)J")
    public static final long method796(int arg0) {
        ++field1637;
        if (arg0 != 59) {
            field1640 = 57;
        }
        return class110.field1705.method62((byte) 110);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)I")
    public final int method797(int arg0) {
        ++field1638;
        if (arg0 != -9338) {
            field1647 = null;
        }
        return this.field1645;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static final void method798(boolean arg0) {
        ++field1648;
        class272.field4346.method1172((byte) 126);
        class141.field2102.method1172((byte) 119);
        if (!arg0) {
            field1651 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)[[I")
    public int[][] method135(int arg0, int arg1) {
        ++field1639;
        if (arg0 < 0) {
            this.field1635 = -21;
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257 && this.method802((byte) 114)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = this.field1643 * (~class172.field2654 != ~this.field1635 ? this.field1635 * arg1 / class172.field2654 : arg1);
            int[] var7 = var3[2];
            if (class250.field4008 != this.field1643) {
                for (int var8 = 0; ~var8 > ~class250.field4008; ++var8) {
                    int var9 = this.field1643 * var8 / class250.field4008;
                    int var10 = this.field1650[var6 + var9];
                    var7[var8] = class118.method863(255, var10) << 4;
                    var5[var8] = class118.method863(4080, var10 >> 4);
                    var4[var8] = class118.method863(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class250.field4008 < ~var11; ++var11) {
                    int var12 = this.field1650[var6++];
                    var7[var11] = class118.method863(var12, 255) << 4;
                    var5[var11] = class118.method863(var12, 65280) >> 4;
                    var4[var11] = class118.method863(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIBI)V")
    public static final void method799(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1636;
        if (arg3 < -57) {
            class69 var5 = class255.method1723((byte) 32, arg4, 8);
            var5.method556((byte) -118);
            var5.field1088 = arg2;
            var5.field1091 = arg0;
            var5.field1086 = arg1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
    public static final void method800(boolean arg0) {
        if (!arg0) {
            if (~class4.field67.toLowerCase().indexOf("microsoft") != 0) {
                class136.field2056[221] = 43;
                class136.field2056[188] = 71;
                class136.field2056[220] = 74;
                class136.field2056[190] = 72;
                class136.field2056[189] = 26;
                class136.field2056[191] = 73;
                class136.field2056[222] = 59;
                class136.field2056[192] = 58;
                class136.field2056[219] = 42;
                class136.field2056[223] = 28;
                class136.field2056[187] = 27;
                class136.field2056[186] = 57;
            } else {
                class136.field2056[59] = 57;
                class136.field2056[91] = 42;
                class136.field2056[44] = 71;
                class136.field2056[46] = 72;
                class136.field2056[45] = 26;
                class136.field2056[47] = 73;
                class136.field2056[93] = 43;
                class136.field2056[61] = 27;
                if (class4.field74 == null) {
                    class136.field2056[192] = 58;
                    class136.field2056[222] = 59;
                } else {
                    class136.field2056[222] = 58;
                    class136.field2056[192] = 28;
                    class136.field2056[520] = 59;
                }
                class136.field2056[92] = 74;
            }
            ++field1649;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        ++field1633;
        if (arg1 == 0) {
            this.field1645 = arg0.method260((byte) -67);
        }
        if (arg2 != 102) {
            this.field1650 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V")
    public static void method801(boolean arg0) {
        field1647 = null;
        field1642 = null;
        if (arg0) {
            field1651 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
    public final boolean method802(byte arg0) {
        ++field1632;
        if (this.field1650 != null) {
            return true;
        } else if (~this.field1645 <= -1) {
            class51 var2 = class85.field1268 >= 0 ? class179.method1272(54, class2.field23, class85.field1268, this.field1645) : class85.method648(this.field1645, (byte) -79, class2.field23);
            var2.method436();
            this.field1643 = var2.field3273;
            this.field1635 = var2.field3265;
            this.field1650 = var2.field822;
            return true;
        } else {
            if (arg0 < 4) {
                field1634 = 0L;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public final void method409(int arg0) {
        super.method409(73);
        this.field1650 = null;
        ++field1641;
        if (arg0 < 64) {
            this.field1645 = 59;
        }
    }
}
