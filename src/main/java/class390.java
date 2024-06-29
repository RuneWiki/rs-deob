import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class390 extends class577 {

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field5376;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "[I")
    public int[] field5380;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[Z")
    public boolean[] field5378;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[I")
    public int[] field5374;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[[I")
    public int[][] field5379;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method2420(int arg0, int arg1, int arg2) {
        if (arg0 >= -8) {
            method2420(-79, -95, -33);
        }
        field5377++;
        return class325.method2087(arg2, -81, arg1) & (class462.method2768((byte) -125, arg2, arg1) | (arg1 & 0x2000) != 0 | class705.method3989(arg1, arg2, -29120));
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I[B)V", line = 21)
    public class390(int arg0, byte[] arg1) {
        this.field5375 = arg0;
        class494 var3 = new class494(arg1);
        this.field5376 = var3.method2964((byte) 69);
        this.field5380 = new int[this.field5376];
        this.field5378 = new boolean[this.field5376];
        this.field5374 = new int[this.field5376];
        this.field5379 = new int[this.field5376][];
        for (int var4 = 0; var4 < this.field5376; var4++) {
            this.field5380[var4] = var3.method2964((byte) 90);
            if (this.field5380[var4] == 6) {
                this.field5380[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5376; var5++) {
            this.field5378[var5] = var3.method2964((byte) 59) == 1;
        }
        for (int var6 = 0; var6 < this.field5376; var6++) {
            this.field5374[var6] = var3.method2998(true);
        }
        for (int var7 = 0; var7 < this.field5376; var7++) {
            this.field5379[var7] = new int[var3.method2964((byte) 50)];
        }
        for (int var8 = 0; var8 < this.field5376; var8++) {
            for (int var9 = 0; var9 < this.field5379[var8].length; var9++) {
                this.field5379[var8][var9] = var3.method2964((byte) 36);
            }
        }
    }
}
