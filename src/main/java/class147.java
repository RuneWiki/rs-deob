import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class147 extends class544 {

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public int field1758;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "[[I")
    public int[][] field1757;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "[I")
    public int[] field1762;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "[I")
    public int[] field1760;

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "[Z")
    public boolean[] field1763;

    @OriginalMember(owner = "client!cda", name = "u", descriptor = "Lg;")
    public static class135 field1765 = new class135(3);

    @OriginalMember(owner = "client!cda", name = "v", descriptor = "Lrg;")
    public static class548 field1766 = new class548(35, 8);

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
    public static void method811(byte arg0) {
        if (arg0 > -16) {
            method812(-117);
        }
        field1766 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static final void method812(int arg0) {
        class370.field4878 = 0;
        field1759++;
        int var1 = 0;
        if (arg0 != 2048) {
            method812(-97);
        }
        while (var1 < 2048) {
            class639.field9194[var1] = null;
            class518.field7298[var1] = 1;
            class57.field529[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(I[B)V")
    public class147(int arg0, byte[] arg1) {
        this.field1758 = arg0;
        class374 var3 = new class374(arg1);
        this.field1764 = var3.method2129(-99);
        this.field1757 = new int[this.field1764][];
        this.field1762 = new int[this.field1764];
        this.field1760 = new int[this.field1764];
        this.field1763 = new boolean[this.field1764];
        for (int var4 = 0; var4 < this.field1764; var4++) {
            this.field1762[var4] = var3.method2129(-119);
        }
        for (int var5 = 0; var5 < this.field1764; var5++) {
            this.field1763[var5] = var3.method2129(-78) == 1;
        }
        for (int var6 = 0; var6 < this.field1764; var6++) {
            this.field1760[var6] = var3.method2136(false);
        }
        for (int var7 = 0; var7 < this.field1764; var7++) {
            this.field1757[var7] = new int[var3.method2129(-109)];
        }
        for (int var8 = 0; var8 < this.field1764; var8++) {
            for (int var9 = 0; var9 < this.field1757[var8].length; var9++) {
                this.field1757[var8][var9] = var3.method2129(-99);
            }
        }
    }
}
