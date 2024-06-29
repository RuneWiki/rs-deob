import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class565 extends class168 {

    @OriginalMember(owner = "client!via", name = "l", descriptor = "I")
    public int field7937;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "I")
    public int field7945;

    @OriginalMember(owner = "client!via", name = "p", descriptor = "[I")
    public int[] field7941;

    @OriginalMember(owner = "client!via", name = "n", descriptor = "[Z")
    public boolean[] field7939;

    @OriginalMember(owner = "client!via", name = "k", descriptor = "[[I")
    public int[][] field7936;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "[I")
    public int[] field7942;

    @OriginalMember(owner = "client!via", name = "j", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!via", name = "o", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "Lha;")
    public static class60 field7943;

    @OriginalMember(owner = "client!via", name = "m", descriptor = "[[[B")
    public static byte[][][] field7938;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(I)V", line = 7)
    public static void method3252(int arg0) {
        field7938 = null;
        field7943 = null;
        if (arg0 != -1851313424) {
            method3253(13, -81);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(II)I", line = 20)
    public static final int method3253(int arg0, int arg1) {
        field7944++;
        int var8 = arg1 - 1;
        int var2 = var8 | var8 >>> 1;
        int var3 = -27 / ((-arg0 - 27) / 54);
        int var4 = var2 | var2 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V", line = 36)
    public static final void method3254(byte arg0) {
        field7940++;
        if (arg0 != 23) {
            field7943 = null;
        }
        for (class375 var1 = (class375) class297.field3910.method1156(0); var1 != null; var1 = (class375) class297.field3910.method1158(22706)) {
            if (var1.field4807.method2917((byte) 102)) {
                class386.method2194(var1.field4808, 118);
            } else {
                var1.field4807.method726(true);
                try {
                    var1.field4807.method2925(true);
                } catch (Exception var5) {
                    class684.method3842(1, var5, "TV: " + var1.field4808);
                    class386.method2194(var1.field4808, 113);
                }
                if (!var1.field4805 && !var1.field4804) {
                    class754 var3 = var1.field4807.method2923(-98);
                    if (var3 != null) {
                        class629 var4 = var3.method4187(3);
                        if (var4 != null) {
                            var4.method3536(var1.field4803, arg0 ^ 0x371F);
                            class307.field4055.method1321(var4);
                            var1.field4805 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(I[B)V", line = 100)
    public class565(int arg0, byte[] arg1) {
        this.field7937 = arg0;
        class461 var3 = new class461(arg1);
        this.field7945 = var3.method2600((byte) -125);
        this.field7941 = new int[this.field7945];
        this.field7939 = new boolean[this.field7945];
        this.field7936 = new int[this.field7945][];
        this.field7942 = new int[this.field7945];
        for (int var4 = 0; var4 < this.field7945; var4++) {
            this.field7942[var4] = var3.method2600((byte) -124);
            if (this.field7942[var4] == 6) {
                this.field7942[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field7945; var5++) {
            this.field7939[var5] = var3.method2600((byte) -123) == 1;
        }
        for (int var6 = 0; var6 < this.field7945; var6++) {
            this.field7941[var6] = var3.method2566(-2);
        }
        for (int var7 = 0; var7 < this.field7945; var7++) {
            this.field7936[var7] = new int[var3.method2600((byte) -128)];
        }
        for (int var8 = 0; var8 < this.field7945; var8++) {
            for (int var9 = 0; var9 < this.field7936[var8].length; var9++) {
                this.field7936[var8][var9] = var3.method2600((byte) -124);
            }
        }
    }
}
