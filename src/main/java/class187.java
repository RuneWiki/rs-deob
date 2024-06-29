import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class187 extends class55 {

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lvd;")
    public static class39 field2853;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lvs;")
    public class593 field2848;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Z")
    public boolean field2849;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[Leda;")
    public class102[] field2851;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[Loda;")
    public static class119[] field2850;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILvd;IZII)V")
    public static final void method1308(int arg0, class39 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2854++;
        class312.method1971(0L, arg1, arg0, arg2, arg4, arg3, arg5);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BIIIIZII[B)V")
    public static final void method1309(byte[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte[] arg8) {
        field2852++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg4++]);
                int var14 = arg3++;
                arg0[var14] = (byte) (arg0[var14] - arg8[arg4++]);
                int var15 = arg3++;
                arg0[var15] = (byte) (arg0[var15] - arg8[arg4++]);
                int var16 = arg3++;
                arg0[var16] = (byte) (arg0[var16] - arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg3++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg4++]);
            }
            arg3 += arg1;
            arg4 += arg7;
        }
        if (!arg5) {
            method1308(-34, null, -121, true, 97, 124);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method1310(byte arg0) {
        field2853 = null;
        if (arg0 >= -72) {
            method1308(91, null, 1, false, 115, 93);
        }
        field2850 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILha;II)Z")
    public final boolean method1311(int arg0, class60 arg1, int arg2, int arg3) {
        if (arg0 <= 114) {
            return true;
        }
        field2847++;
        int var5 = this.field2848.method1798((byte) 123);
        if (this.field2851 != null) {
            for (int var6 = 0; var6 < this.field2851.length; var6++) {
                this.field2851[var6].field1429 <<= var5;
                if (this.field2851[var6].method779(arg2, arg3) && this.field2848.method312(arg2, (byte) -49, arg1, arg3)) {
                    this.field2851[var6].field1429 >>= var5;
                    return true;
                }
                this.field2851[var6].field1429 >>= var5;
            }
        }
        return false;
    }
}
