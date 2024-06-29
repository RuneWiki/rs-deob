import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class247 extends class504 {

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public int field3437;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "[[I")
    public int[][] field3442;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
    public int[] field3435;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[Z")
    public boolean[] field3434;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "[I")
    public int[] field3439;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "Ljfa;")
    public static class267 field3441 = new class267(8);

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field3443 = 0;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "F")
    public static float field3444;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method1514(byte arg0, int arg1) {
        field3436++;
        class292.field4127.method3740((byte) 60, arg1);
        class239.field3366.method3740((byte) 60, arg1);
        class466.field6276.method3740((byte) 60, arg1);
        if (arg0 != -22) {
            method1515(-65);
        }
        class520.field6953.method3740((byte) 60, arg1);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V", line = 23)
    public static void method1515(int arg0) {
        if (arg0 == 63) {
            field3441 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIII)V", line = 39)
    public static final void method1516(byte arg0, int arg1, int arg2, int arg3) {
        field3440++;
        String var4 = "tele " + arg2 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        class375.method2209(124, var4, false, true);
        if (arg0 != -44) {
            field3444 = -2.5096943F;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I[B)V", line = 52)
    public class247(int arg0, byte[] arg1) {
        this.field3437 = arg0;
        class335 var3 = new class335(arg1);
        this.field3438 = var3.method2034(255);
        this.field3442 = new int[this.field3438][];
        this.field3435 = new int[this.field3438];
        this.field3434 = new boolean[this.field3438];
        this.field3439 = new int[this.field3438];
        for (int var4 = 0; var4 < this.field3438; var4++) {
            this.field3439[var4] = var3.method2034(255);
            if (this.field3439[var4] == 6) {
                this.field3439[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field3438; var5++) {
            this.field3434[var5] = var3.method2034(255) == 1;
        }
        for (int var6 = 0; var6 < this.field3438; var6++) {
            this.field3435[var6] = var3.method2001((byte) -83);
        }
        for (int var7 = 0; var7 < this.field3438; var7++) {
            this.field3442[var7] = new int[var3.method2034(255)];
        }
        for (int var8 = 0; var8 < this.field3438; var8++) {
            for (int var9 = 0; var9 < this.field3442[var8].length; var9++) {
                this.field3442[var8][var9] = var3.method2034(255);
            }
        }
    }
}
