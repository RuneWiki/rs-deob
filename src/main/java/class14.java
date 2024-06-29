import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class14 extends class328 {

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
    public static int[] field147 = new int[1];

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    private int field151;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)[[I")
    public final int[][] method7(int arg0, int arg1) {
        ++field153;
        int[][] var3 = super.field4725.method1886((byte) -66, arg0);
        if (super.field4725.field4371) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class449.field6539; ++var7) {
                var4[var7] = this.field150;
                var5[var7] = this.field151;
                var6[var7] = this.field149;
            }
        }
        int var8 = -70 / ((46 - arg1) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
    private final void method77(boolean arg0, int arg1) {
        this.field151 = 4080 & arg1 >> 4;
        this.field150 = (16711680 & arg1) >> 12;
        if (arg0) {
            method78(51, 85, 35);
        }
        this.field149 = (arg1 & 255) << 4;
        ++field148;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field152;
        if (arg0 >= 75) {
            if (arg1 == 0) {
                this.method77(false, arg2.method1700((byte) 44));
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)Z")
    public static final boolean method78(int arg0, int arg1, int arg2) {
        ++field154;
        if (arg2 != 417020716) {
            field147 = null;
        }
        return class272.method1765((byte) -17, arg1, arg0) | (arg1 & 458752) != 0 || class511.method2866(arg0, arg1, arg2 + -417020670);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class14() {
        this(0);
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
    private class14(int arg0) {
        super(0, false);
        this.method77(false, arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method79(boolean arg0) {
        if (arg0) {
            field147 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)I")
    public static final int method80(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field155;
        int var5 = -class285.field4152[arg2 * 8192 / arg3] + 65536 >> 1;
        if (arg0 != 1) {
            method78(-25, -98, -95);
        }
        return ((-var5 + 65536) * arg1 >> 16) + (arg4 * var5 >> 16);
    }
}
