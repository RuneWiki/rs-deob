import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class297 extends class499 {

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "[[I")
    public int[][] field4100;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "[Z")
    public boolean[] field4098;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "[I")
    public int[] field4102;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "[I")
    public int[] field4099;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "Z")
    public static boolean field4101 = false;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "Lqi;")
    public static class398 field4104;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B[BI)[B")
    public static final byte[] method1704(byte arg0, byte[] arg1, int arg2) {
        field4105++;
        byte[] var3 = new byte[arg2];
        class416.method2491(arg1, 0, var3, 0, arg2);
        if (arg0 != 102) {
            method1704((byte) -3, null, -120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)V")
    public static void method1705(byte arg0) {
        field4104 = null;
        int var1 = 101 % ((32 - arg0) / 62);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I[B)V")
    public class297(int arg0, byte[] arg1) {
        this.field4097 = arg0;
        class365 var3 = new class365(arg1);
        this.field4106 = var3.method2099(255);
        this.field4100 = new int[this.field4106][];
        this.field4098 = new boolean[this.field4106];
        this.field4102 = new int[this.field4106];
        this.field4099 = new int[this.field4106];
        for (int var4 = 0; var4 < this.field4106; var4++) {
            this.field4099[var4] = var3.method2099(255);
        }
        for (int var5 = 0; var5 < this.field4106; var5++) {
            this.field4098[var5] = var3.method2099(255) == 1;
        }
        for (int var6 = 0; var6 < this.field4106; var6++) {
            this.field4102[var6] = var3.method2062((byte) 14);
        }
        for (int var7 = 0; var7 < this.field4106; var7++) {
            this.field4100[var7] = new int[var3.method2099(255)];
        }
        for (int var8 = 0; var8 < this.field4106; var8++) {
            for (int var9 = 0; var9 < this.field4100[var8].length; var9++) {
                this.field4100[var8][var9] = var3.method2099(255);
            }
        }
    }
}
