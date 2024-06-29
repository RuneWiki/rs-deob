import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class126 extends class139 {

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "I")
    private int field1655 = 4096;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "Z")
    private boolean field1658 = true;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "[I")
    public static int[] field1650 = new int[50];

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class126() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
    public static void method791(int arg0) {
        field1650 = null;
        if (arg0 != 4096) {
            method796((class145) null, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field1654;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field1658 = arg0.method1701(-23121) == 1;
            }
        } else {
            this.field1655 = arg0.method1729(arg1 + 65325);
        }
        if (arg1 != -45) {
            this.field1658 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
    public static final void method792(boolean arg0) {
        if (arg0) {
            if (~class363.field5227 == -11) {
                class211.method1368((byte) -106, 28);
            }
            ++field1651;
            if (~class363.field5227 == -31) {
                class211.method1368((byte) -54, 25);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(III)V")
    public static final void method793(int arg0, int arg1, int arg2) {
        ++class92.field1172;
        if (arg1 > 12) {
            class15.method110(class305.field4342, -125);
            ++field1652;
            class225.field3415.method1689(arg2, (byte) 124);
            class225.field3415.method1720(arg0, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(B)[Lo;")
    public static final class24[] method794(byte arg0) {
        ++field1656;
        if (arg0 < 118) {
            method791(-85);
        }
        return new class24[] { class356.field5143, class144.field1912, class365.field5251, class193.field2853, class211.field3203 };
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(BII)B")
    public static final byte method795(byte arg0, int arg1, int arg2) {
        ++field1649;
        if (arg2 != 9) {
            return 0;
        } else {
            if (arg0 != 51) {
                method792(false);
            }
            return (byte) (~(1 & arg1) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ldt;B)Ldt;")
    public static final class145 method796(class145 arg0, byte arg1) {
        if (arg1 < 108) {
            field1650 = null;
        }
        ++field1648;
        class145 var2 = client.method1132(arg0);
        if (var2 == null) {
            var2 = arg0.field2058;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field1653;
        if (arg0 >= -67) {
            method792(true);
        }
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int[] var4 = this.method879((byte) -29, class388.field5511 & arg1 - 1, 0);
            int[] var5 = this.method879((byte) -29, arg1, 0);
            int[] var6 = this.method879((byte) -29, arg1 + 1 & class388.field5511, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class356.field5147 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1655;
                int var12 = (var5[class414.field5822 & var10 + 1] + -var5[var10 + -1 & class414.field5822]) * this.field1655;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                    var20 = var12 / var17;
                } else {
                    var18 = 0;
                    var20 = 0;
                    var19 = 0;
                }
                if (this.field1658) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)V")
    public static final void method797(int arg0, int arg1) {
        class92.field1165 = arg0;
        ++field1657;
        class232 var2 = class368.field5316;
        synchronized (class368.field5316) {
            class368.field5316.method1478((byte) -128);
        }
        class232 var3 = class143.field1895;
        synchronized (class143.field1895) {
            if (arg1 == 23743) {
                class143.field1895.method1478((byte) -97);
            }
        }
    }
}
