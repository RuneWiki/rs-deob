import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class205 extends class86 {

    @OriginalMember(owner = "client!og", name = "y", descriptor = "Lug;")
    public class307 field3253;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
    public static boolean field3248 = false;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field3250 = 0;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Llb;")
    public static class211 field3249;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 7)
    public static void method1470(int arg0) {
        field3249 = null;
        if (arg0 != 13295) {
            field3250 = 86;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V", line = 24)
    public static final void method1471(byte arg0) {
        if (class297.field4661 != null) {
            class297.field4661.method916(-25224);
            class297.field4661 = null;
        }
        class321.method2192(0);
        class198.method1442();
        int var1 = -36 / ((arg0 + 3) / 33);
        for (int var2 = 0; var2 < 4; var2++) {
            class90.field1309[var2].method2203(true);
        }
        class208.method1485(128, false);
        field3251++;
        System.gc();
        class211.method1526(2, -1);
        class213.field3386 = false;
        class287.field4422 = -1;
        class93.method736(true, -32730);
        class302.field4735 = 0;
        class235.field3596 = false;
        class263.field3940 = 0;
        class290.field4569 = 0;
        class110.field1744 = 0;
        for (int var3 = 0; var3 < class141.field2185.length; var3++) {
            class141.field2185[var3] = null;
        }
        class262.field3900 = 0;
        class122.field1923 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class319.field4964[var4] = null;
            class149.field2251[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class161.field2394[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class281.field4336[var6][var7][var8] = null;
                }
            }
        }
        class323.method2211((byte) -37);
        class291.field4570 = 0;
        class267.method1860((byte) 110);
        class146.method1088(3000, true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)I", line = 119)
    public static final int method1472(int arg0, byte arg1) {
        if (arg1 > -112) {
            field3248 = false;
        }
        field3254++;
        return (arg0 & 0x3F865) >> 11;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lug;)V", line = 130)
    public class205(class307 arg0) {
        this.field3253 = arg0;
    }
}
