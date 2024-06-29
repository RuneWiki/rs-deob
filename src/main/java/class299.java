import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class299 extends class101 {

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "I")
    public int field4331;

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "[[I")
    public int[][] field4332;

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "[I")
    public int[] field4327;

    @OriginalMember(owner = "client!wha", name = "u", descriptor = "[I")
    public int[] field4333;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "[Z")
    public boolean[] field4328;

    @OriginalMember(owner = "client!wha", name = "v", descriptor = "I")
    public static int field4334 = 0;

    @OriginalMember(owner = "client!wha", name = "w", descriptor = "Z")
    public static boolean field4335 = false;

    @OriginalMember(owner = "client!wha", name = "x", descriptor = "Ljw;")
    public static class581 field4336 = new class581(109, 0);

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1894(byte arg0) {
        field4330++;
        if (arg0 != -54) {
            return;
        }
        if (class458.field6355 == 7) {
            class631.method3541(103, false);
        } else {
            class754.field10484 = class457.field6340;
            class457.field6340 = null;
            class300.method1901(13, 2);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V", line = 31)
    public static void method1895(int arg0) {
        field4336 = null;
        int var1 = -88 % ((arg0 + 1) / 55);
    }

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(I[B)V", line = 41)
    public class299(int arg0, byte[] arg1) {
        this.field4326 = arg0;
        class376 var3 = new class376(arg1);
        this.field4331 = var3.method2398(-1372747256);
        this.field4332 = new int[this.field4331][];
        this.field4327 = new int[this.field4331];
        this.field4333 = new int[this.field4331];
        this.field4328 = new boolean[this.field4331];
        for (int var4 = 0; var4 < this.field4331; var4++) {
            this.field4333[var4] = var3.method2398(-1372747256);
            if (this.field4333[var4] == 6) {
                this.field4333[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field4331; var5++) {
            this.field4328[var5] = var3.method2398(-1372747256) == 1;
        }
        for (int var6 = 0; var6 < this.field4331; var6++) {
            this.field4327[var6] = var3.method2359(-1);
        }
        for (int var7 = 0; var7 < this.field4331; var7++) {
            this.field4332[var7] = new int[var3.method2398(-1372747256)];
        }
        for (int var8 = 0; var8 < this.field4331; var8++) {
            for (int var9 = 0; var9 < this.field4332[var8].length; var9++) {
                this.field4332[var8][var9] = var3.method2398(-1372747256);
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)V", line = 109)
    public static final void method1896(boolean arg0) {
        field4329++;
        class66.field937.method452(((float) class712.field9959.field1278.method2685(49) * 0.1F + 0.7F) * class270.field3979);
        class66.field937.method533(class490.field6804, class379.field5543, class3.field15, (float) (class405.field5874 << 2), (float) (class599.field8155 << 2), (float) (class758.field10511 << 2));
        class66.field937.method473(class162.field2200);
        if (!arg0) {
            method1895(112);
        }
    }
}
