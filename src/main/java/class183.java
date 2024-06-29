import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class183 extends class467 {

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[Z")
    public boolean[] field2586;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[I")
    public int[] field2591;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[[I")
    public int[][] field2592;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "[I")
    public int[] field2590;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1302(int arg0, int arg1) {
        field2588++;
        int var2 = class405.field6116 - class261.field3636;
        if (var2 >= 100) {
            class432.field6409 = 1;
            return;
        }
        int var3 = (int) class99.field1428;
        if (var3 < (class389.field5905 >> 8)) {
            var3 = class389.field5905 >> 8;
        }
        if (class185.field2614[4] && var3 < (class435.field6470[4] + 128)) {
            var3 = class435.field6470[4] + 128;
        }
        int var4 = (int) class482.field7022 + class498.field7281 & 0x3FFF;
        class313.method2036(var3, class205.field2896, 16383, var4, arg0, (var3 >> 3) * 3 + 600 << 0, class165.field2409, class500.method2985(class339.field5365.field2217, 5293, class195.field2770, class339.field5365.field2215) - 50);
        float var5 = 1.0F - ((float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F);
        class154.field2246 = (int) ((float) (class154.field2246 - class241.field3397) * var5 + (float) class241.field3397);
        class34.field539 = (int) ((float) (class34.field539 - class257.field3570) * var5 + (float) class257.field3570);
        class353.field5478 = (int) ((float) (class353.field5478 - class138.field2004) * var5 + (float) class138.field2004);
        class301.field4447 = (int) ((float) (class301.field4447 - class207.field2930) * var5 + (float) class207.field2930);
        int var6 = class30.field461 - class470.field6868;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class30.field461 = (int) ((float) var6 * var5 + (float) class470.field6868);
        if (arg1 == -19205) {
            class30.field461 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[B)V")
    public class183(int arg0, byte[] arg1) {
        this.field2587 = arg0;
        class91 var3 = new class91(arg1);
        this.field2589 = var3.method618((byte) 100);
        this.field2586 = new boolean[this.field2589];
        this.field2591 = new int[this.field2589];
        this.field2592 = new int[this.field2589][];
        this.field2590 = new int[this.field2589];
        for (int var4 = 0; var4 < this.field2589; var4++) {
            this.field2591[var4] = var3.method618((byte) 100);
        }
        for (int var5 = 0; var5 < this.field2589; var5++) {
            this.field2586[var5] = var3.method618((byte) 100) == 1;
        }
        for (int var6 = 0; var6 < this.field2589; var6++) {
            this.field2590[var6] = var3.method631(10494);
        }
        for (int var7 = 0; var7 < this.field2589; var7++) {
            this.field2592[var7] = new int[var3.method618((byte) 100)];
        }
        for (int var8 = 0; var8 < this.field2589; var8++) {
            for (int var9 = 0; var9 < this.field2592[var8].length; var9++) {
                this.field2592[var8][var9] = var3.method618((byte) 100);
            }
        }
    }
}
