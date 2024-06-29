import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class185 extends class330 {

    @OriginalMember(owner = "client!eea", name = "F", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2308 = new Rectangle[100];

    @OriginalMember(owner = "client!eea", name = "G", descriptor = "Z")
    public static boolean field2309;

    @OriginalMember(owner = "client!eea", name = "C", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!eea", name = "D", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!eea", name = "E", descriptor = "I")
    public static int field2307;

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field2308[var0] = new Rectangle();
        }
        field2309 = false;
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "()V", line = 3)
    public class185() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V", line = 8)
    public static void method1158(int arg0) {
        if (arg0 != 1) {
            method1158(5);
        }
        field2308 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(IZ)[I", line = 19)
    public final int[] method464(int arg0, boolean arg1) {
        ++field2306;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            field2309 = true;
        }
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(0, arg0, (byte) -120);
            for (int var5 = 0; ~class80.field901 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lgga;IB)V", line = 54)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field2305;
        int var4 = 127 / ((-41 - arg2) / 42);
        if (arg1 == 0) {
            super.field4636 = ~arg0.method3013(-125) == -2;
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)[[I", line = 69)
    public final int[][] method537(int arg0, int arg1) {
        ++field2307;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            field2308 = null;
        }
        if (super.field4621.field3510) {
            int[][] var4 = this.method2082(arg1, 0, 124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class80.field901; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
