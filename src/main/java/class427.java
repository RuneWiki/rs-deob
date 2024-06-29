import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class427 extends class346 {

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "[S")
    public static short[] field6215 = new short[256];

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "Lsj;")
    public static class248 field6213 = null;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field6216 = "";

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Lkn;")
    public static class435 field6212;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZZ)V", line = 3)
    public static final void method2673(int arg0, boolean arg1, boolean arg2) {
        ++field6211;
        if (arg2) {
            ++class192.field2676;
            class197.method1303(27919);
        }
        if (arg1) {
            ++class268.field3975;
            class246.method1605(true);
        }
        if (arg0 >= -59) {
            field6212 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 31)
    public class427() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)[[I", line = 37)
    public final int[][] method287(int arg0, int arg1) {
        ++field6214;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 >= -3) {
            this.method287(104, 22);
        }
        if (super.field5170.field6288) {
            int[][] var4 = this.method2293(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class134.field1753 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V", line = 86)
    public static void method2674(byte arg0) {
        field6216 = null;
        field6213 = null;
        field6215 = null;
        if (arg0 <= -21) {
            field6212 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[I", line = 100)
    public final int[] method45(int arg0, int arg1) {
        ++field6218;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0, 0);
            for (int var5 = 0; ~var5 > ~class134.field1753; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg1 != 3) {
            field6215 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lfb;ZI)V", line = 140)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 == -1) {
                super.field5151 = ~arg0.method2233((byte) 104) == -2;
            }
            ++field6210;
        }
    }
}
