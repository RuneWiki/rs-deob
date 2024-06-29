import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class217 extends class253 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    private int field3807;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "[I")
    public int[] field3818;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "[Z")
    public boolean[] field3813;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[[I")
    public int[][] field3817;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3804 = 1;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Ljd;")
    public static class85 field3805 = class221.method1499(":allyreq:", (byte) -126);

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Ljd;")
    public static class85 field3808 = class221.method1499("mapdots", (byte) 100);

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "[Z")
    public static boolean[] field3803 = new boolean[100];

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Ljd;")
    public static class85 field3811 = class221.method1499("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) 95);

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Ljd;")
    private static class85 field3812 = class221.method1499("Loaded wordpack", (byte) -86);

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3806 = 0;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Z")
    public static boolean field3814 = false;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Ljd;")
    public static class85 field3810 = class221.method1499("leuchten1:", (byte) -56);

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Ljd;")
    public static class85 field3815 = field3812;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
    public static final void method1483(int arg0, byte arg1) {
        class23.field330.method1267(arg0, (byte) -44);
        int var2 = -51 / ((arg1 - 14) / 40);
        field3809++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1484(byte arg0) {
        field3810 = null;
        field3812 = null;
        field3811 = null;
        field3808 = null;
        field3805 = null;
        field3815 = null;
        if (arg0 == 98) {
            field3803 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I[B)V")
    public class217(int arg0, byte[] arg1) {
        this.field3801 = arg0;
        class247 var3 = new class247(arg1);
        this.field3807 = var3.method1711((byte) -67);
        this.field3818 = new int[this.field3807];
        this.field3813 = new boolean[this.field3807];
        this.field3817 = new int[this.field3807][];
        for (int var4 = 0; var4 < this.field3807; var4++) {
            this.field3818[var4] = var3.method1711((byte) -67);
        }
        for (int var5 = 0; var5 < this.field3807; var5++) {
            this.field3813[var5] = var3.method1711((byte) -67) == 1;
        }
        for (int var6 = 0; var6 < this.field3807; var6++) {
            this.field3817[var6] = new int[var3.method1711((byte) -67)];
        }
        for (int var7 = 0; var7 < this.field3807; var7++) {
            for (int var8 = 0; var8 < this.field3817[var7].length; var8++) {
                this.field3817[var7][var8] = var3.method1711((byte) -67);
            }
        }
    }
}
