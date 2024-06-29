import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class269 extends class154 {

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    private int field4699 = 3072;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    private int field4708 = 1024;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    private int field4704 = 2048;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field4701 = 0;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "Leg;")
    public static class37 field4696 = class174.method1167("(Y", -61);

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "Ljl;")
    public static class101 field4697;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "[Leg;")
    public static class37[] field4705;

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class269() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field4700;
        if (arg0 != 115) {
            field4696 = null;
        }
        int[][] var3 = super.field2585.method1532(arg1, -103);
        if (super.field2585.field3761) {
            int[][] var4 = this.method1054(0, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class227.field3898 < ~var11; ++var11) {
                var8[var11] = (var5[var11] * this.field4704 >> 12) + this.field4708;
                var9[var11] = (var6[var11] * this.field4704 >> 12) + this.field4708;
                var10[var11] = (var7[var11] * this.field4704 >> 12) + this.field4708;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        ++field4698;
        this.field4704 = -this.field4708 + this.field4699;
        if (arg0 != -9) {
            method1800((byte) -17);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 != -14015) {
            this.method143(-103, -57);
        }
        ++field4710;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field2579 = ~arg0.method1268(255) == -2;
                }
            } else {
                this.field4699 = arg0.method1244(false);
            }
        } else {
            this.field4708 = arg0.method1244(false);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V")
    public static void method1800(byte arg0) {
        field4705 = null;
        field4697 = null;
        field4696 = null;
        if (arg0 <= 125) {
            field4707 = -71;
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)Lqk;")
    public static final class7 method1801(byte arg0) {
        if (arg0 <= 26) {
            method1800((byte) 84);
        }
        ++field4702;
        return class73.field1155;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field4706;
        if (arg1 != 1075962732) {
            this.method144(9);
        }
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, arg0, (byte) -81);
            for (int var5 = 0; var5 < class227.field3898; ++var5) {
                var3[var5] = (var4[var5] * this.field4704 >> 12) + this.field4708;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([[II)V")
    public static final void method1802(int[][] arg0, int arg1) {
        class210.field3617 = arg0;
        if (arg1 == 2) {
            ++field4703;
        }
    }
}
