import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class175 extends class270 {

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "[Z")
    public static boolean[] field2610 = new boolean[8];

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method81(byte arg0, int arg1) {
        if (arg0 <= 26) {
            field2609 = -23;
        }
        ++field2611;
        int[] var3 = super.field4053.method396(arg1, 91);
        if (super.field4053.field815) {
            int[] var4 = this.method1927(0, 0, arg1);
            for (int var5 = 0; ~class161.field2445 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 37)
    public class175() {
        super(1, false);
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V", line = 42)
    public static void method1360(byte arg0) {
        field2610 = null;
        if (arg0 != -48) {
            field2609 = 61;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BLec;I)V", line = 52)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg0 != 108) {
            this.method81((byte) -80, -12);
        }
        ++field2612;
        if (arg2 == 0) {
            super.field4055 = arg1.method271((byte) 118) == 1;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)[[I", line = 76)
    public final int[][] method123(boolean arg0, int arg1) {
        ++field2607;
        int[][] var3 = super.field4046.method244(arg1, 125);
        if (super.field4046.field488) {
            int[][] var4 = this.method1930(arg1, 0, (byte) -75);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class161.field2445; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var7[var11];
            }
        }
        if (!arg0) {
            this.method123(true, -106);
        }
        return var3;
    }
}
