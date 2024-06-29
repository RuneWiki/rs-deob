import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class652 extends class66 {

    @OriginalMember(owner = "client!no", name = "r", descriptor = "I")
    public int field9127;

    @OriginalMember(owner = "client!no", name = "s", descriptor = "I")
    public int field9128;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "[Z")
    public boolean[] field9131;

    @OriginalMember(owner = "client!no", name = "t", descriptor = "[I")
    public int[] field9129;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "[[I")
    public int[][] field9133;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "[I")
    public int[] field9130;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "I")
    public static int field9126;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "[Lfl;")
    public static class687[] field9132;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ZIZZJII)V", line = 4)
    public static final void method3758(int arg0, int arg1, String arg2, String arg3, boolean arg4, int arg5, boolean arg6, boolean arg7, long arg8, int arg9, int arg10) {
        field9126++;
        if (class453.field6808 || class52.field693 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class250.field4003 : arg10;
        class295 var13 = new class295(arg2, arg3, var12, arg5, arg1, arg8, arg9, arg0, arg4, arg7);
        if (!arg6) {
            class307.field4831.method3463((byte) -87, var13);
            class52.field693++;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V", line = 31)
    public static void method3759(boolean arg0) {
        field9132 = null;
        if (arg0) {
            method3758(-120, 106, null, null, true, 74, false, true, 98L, -111, -66);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I[B)V", line = 41)
    public class652(int arg0, byte[] arg1) {
        this.field9127 = arg0;
        class6 var3 = new class6(arg1);
        this.field9128 = var3.method70(-9059);
        this.field9131 = new boolean[this.field9128];
        this.field9129 = new int[this.field9128];
        this.field9133 = new int[this.field9128][];
        this.field9130 = new int[this.field9128];
        for (int var4 = 0; var4 < this.field9128; var4++) {
            this.field9129[var4] = var3.method70(-9059);
            if (this.field9129[var4] == 6) {
                this.field9129[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field9128; var5++) {
            this.field9131[var5] = var3.method70(-9059) == 1;
        }
        for (int var6 = 0; var6 < this.field9128; var6++) {
            this.field9130[var6] = var3.method67(12021);
        }
        for (int var7 = 0; var7 < this.field9128; var7++) {
            this.field9133[var7] = new int[var3.method70(-9059)];
        }
        for (int var8 = 0; var8 < this.field9128; var8++) {
            for (int var9 = 0; var9 < this.field9133[var8].length; var9++) {
                this.field9133[var8][var9] = var3.method70(-9059);
            }
        }
    }
}
