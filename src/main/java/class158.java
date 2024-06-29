import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class158 extends class61 {

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    private int field2816;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "[I")
    public int[] field2826;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "[[I")
    public int[][] field2827;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[Z")
    public boolean[] field2815;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[Lbh;")
    public static class7[] field2822 = new class7[27];

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Leb;")
    public static class230 field2825 = class68.method589(0, ":tradereq:");

    @OriginalMember(owner = "client!l", name = "E", descriptor = "S")
    public static short field2824 = 1;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Z")
    public static boolean field2817;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[[[B")
    public static byte[][][] field2818;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[B)V")
    public static final void method1199(int arg0, byte[] arg1) {
        field2819++;
        class14 var2 = new class14(arg1);
        if (arg0 != -24749) {
            method1202((byte) -28);
        }
        var2.field318 += 2;
        int var3 = var2.method200(arg0 + 25004);
        if (var3 != 1) {
            return;
        }
        boolean var4 = var2.method200(arg0 + 25004) == 1;
        if (var4) {
            class91.method771(var2, 0);
        }
        class104.method873(var2, false);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static final void method1200(int arg0) {
        if (class176.field3083 == 2) {
            if (class246.field4375 == class194.field3495 && class61.field1178 == class270.field4777) {
                class176.field3083 = 0;
                class234.method1648(class186.field3266 - 1, true);
            }
        } else if (class246.field4375 == class225.field3886 && class92.field1657 == class61.field1178) {
            class176.field3083 = 0;
            class234.method1648(class186.field3266 - 1, true);
        } else {
            class194.field3495 = class225.field3886;
            class176.field3083 = 2;
            class270.field4777 = class92.field1657;
        }
        if (arg0 <= -74) {
            field2828++;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)Leb;")
    public static final class230 method1201(boolean arg0, int arg1) {
        field2820++;
        if (arg0) {
            field2822 = null;
        }
        return class192.field3388[arg1].method1635(-21) <= 0 ? class149.field2667[arg1] : class173.method1267((byte) 59, new class230[] { class149.field2667[arg1], client.field2721, class192.field3388[arg1] });
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field2818 = null;
        field2822 = null;
        if (arg0 < 93) {
            field2825 = null;
        }
        field2825 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I[B)V")
    public class158(int arg0, byte[] arg1) {
        this.field2823 = arg0;
        class14 var3 = new class14(arg1);
        this.field2816 = var3.method200(255);
        this.field2826 = new int[this.field2816];
        this.field2827 = new int[this.field2816][];
        this.field2815 = new boolean[this.field2816];
        for (int var4 = 0; var4 < this.field2816; var4++) {
            this.field2826[var4] = var3.method200(255);
        }
        for (int var5 = 0; var5 < this.field2816; var5++) {
            this.field2815[var5] = var3.method200(255) == 1;
        }
        for (int var6 = 0; var6 < this.field2816; var6++) {
            this.field2827[var6] = new int[var3.method200(255)];
        }
        for (int var7 = 0; var7 < this.field2816; var7++) {
            for (int var8 = 0; var8 < this.field2827[var7].length; var8++) {
                this.field2827[var7][var8] = var3.method200(255);
            }
        }
    }
}
