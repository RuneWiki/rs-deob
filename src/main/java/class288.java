import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class288 extends class646 {

    @OriginalMember(owner = "client!uca", name = "J", descriptor = "Lvh;")
    public static class125 field4047 = new class125(38, -1);

    @OriginalMember(owner = "client!uca", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field4050 = new String[8];

    @OriginalMember(owner = "client!uca", name = "I", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!uca", name = "K", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!uca", name = "L", descriptor = "Lf;")
    public static class257 field4049;

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V", line = 3)
    public class288() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(IB)[I", line = 6)
    public final int[] method424(int arg0, byte arg1) {
        ++field4048;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            field4050 = null;
        }
        if (super.field9156.field5075) {
            int[][] var4 = this.method3626(arg1 ^ -18, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class89.field1330 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lr;I)V", line = 46)
    public static final void method1767(class98 arg0, int arg1) {
        ++field4046;
        if (arg1 == 8) {
            if (!class324.field4519) {
                class76.method604(2, arg0);
            } else {
                class203.method1409(arg0, (byte) -64);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V", line = 66)
    public static void method1768(byte arg0) {
        field4050 = null;
        field4049 = null;
        if (arg0 > -99) {
            field4049 = null;
        }
        field4047 = null;
    }
}
