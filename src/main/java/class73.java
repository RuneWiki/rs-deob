import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class73 extends class297 {

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1333 = -1;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "Luh;")
    public static class168 field1331 = new class168();

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "F")
    public static float field1334 = 0.25F;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 4)
    public static void method696(byte arg0) {
        field1331 = null;
        if (arg0 < 39) {
            method696((byte) 100);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V", line = 14)
    public class73() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)[I", line = 23)
    public final int[] method15(int arg0, int arg1) {
        ++field1332;
        int[] var3 = super.field4165.method127(arg1 + -255, arg0);
        if (arg1 != 255) {
            this.method15(19, -84);
        }
        if (super.field4165.field266) {
            int[][] var4 = this.method1948((byte) -119, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class525.field7275 > var8; ++var8) {
                var3[var8] = (var5[var8] - (-var6[var8] - var7[var8])) / 3;
            }
        }
        return var3;
    }
}
