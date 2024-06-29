import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class34 extends class310 {

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[I")
    public static int[] field505 = new int[5];

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Lqm;")
    public static class227 field502 = new class227(new byte[5000]);

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "[Lem;")
    public static class285[] field504;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V", line = 5)
    public static void method236(int arg0) {
        field502 = null;
        if (arg0 >= -37) {
            method236(-99);
        }
        field504 = null;
        field505 = null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 17)
    public class34() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I", line = 25)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, 0);
        if (arg1 != -13093) {
            return (int[]) null;
        }
        field501++;
        if (this.field4950.field2001) {
            int[][] var4 = this.method2199(21101, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class261.field4405; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
