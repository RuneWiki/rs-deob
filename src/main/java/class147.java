import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class147 extends class59 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "Lmd;")
    public static class136 field2377 = new class136();

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "Lph;")
    public static class229 field2378 = class266.method1858("Memory after cleanup=", 0);

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "I")
    public static int field2379 = 0;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field2382 = -1;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "Lsi;")
    public static class66 field2383;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2376;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 6)
    public static void method1078(byte arg0) {
        field2378 = null;
        field2377 = null;
        field2376 = null;
        field2383 = null;
        if (arg0 != -22) {
            field2378 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V", line = 25)
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= arg3) {
            class193.method1354((byte) -37, arg4, arg3, arg0, class202.field3337[arg2]);
        } else {
            class193.method1354((byte) -37, arg3, arg4, arg0, class202.field3337[arg2]);
        }
        field2380++;
        if (arg1 < 32) {
            method1079(-53, -106, -29, -50, 55);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZI)[I", line = 44)
    public final int[] method63(boolean arg0, int arg1) {
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[][] var4 = this.method397(1, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class293.field4789; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        field2381++;
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 83)
    public class147() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)V", line = 97)
    public static final void method1080(int arg0) {
        field2384++;
        int var1 = 38 / ((arg0 + 55) / 42);
        class304.method2055(5, (byte) -5);
        class223.method1558(false, 5);
        class205.method1438(5, true);
        class222.method1554(5, (byte) -92);
        class146.method1073(5, false);
        class171.method1244(5, 255);
        class76.method578(5, -40);
        class178.method1279(5, (byte) -10);
        class139.method1002(5, -16076);
        class142.method1017((byte) 56, 5);
        class321.method2176(5, (byte) 6);
        class205.method1434(50, 1);
        class275.method1906(5, (byte) 57);
        class233.method1659(5, (byte) 88);
        client.field5418.method1418((byte) -17, 5);
    }
}
