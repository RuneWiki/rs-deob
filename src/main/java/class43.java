import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class43 extends class665 {

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "[[I")
    public int[][] field692;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "[Z")
    public boolean[] field691;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
    public int[] field689;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
    public int[] field695;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "[I")
    public static int[] field693 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!na", name = "t", descriptor = "I")
    public static int field698 = 1405;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "Lnea;")
    public static class664 field697 = new class664(13, -1);

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Z")
    public static boolean field701 = false;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[I")
    public static int[] field702 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!na", name = "u", descriptor = "F")
    public static float field699;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZI)I")
    public static final int method466(int arg0, int arg1, boolean arg2, int arg3) {
        field696++;
        class138 var4 = class642.method3576(arg0, (byte) -85, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field2008.length; var6++) {
                if (var4.field2009[var6] == arg1) {
                    var5 += var4.field2008[var6];
                }
            }
            if (arg3 == 23173) {
                return var5;
            } else {
                return 41;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(JJ)J")
    public static long method467(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[B)V")
    public class43(int arg0, byte[] arg1) {
        this.field690 = arg0;
        class695 var3 = new class695(arg1);
        this.field694 = var3.method3826(false);
        this.field692 = new int[this.field694][];
        this.field691 = new boolean[this.field694];
        this.field689 = new int[this.field694];
        this.field695 = new int[this.field694];
        for (int var4 = 0; var4 < this.field694; var4++) {
            this.field695[var4] = var3.method3826(false);
            if (this.field695[var4] == 6) {
                this.field695[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field694; var5++) {
            this.field691[var5] = var3.method3826(false) == 1;
        }
        for (int var6 = 0; var6 < this.field694; var6++) {
            this.field689[var6] = var3.method3847((byte) 118);
        }
        for (int var7 = 0; var7 < this.field694; var7++) {
            this.field692[var7] = new int[var3.method3826(false)];
        }
        for (int var8 = 0; var8 < this.field694; var8++) {
            for (int var9 = 0; var9 < this.field692[var8].length; var9++) {
                this.field692[var8][var9] = var3.method3826(false);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static void method468(byte arg0) {
        field693 = null;
        if (arg0 == 27) {
            field702 = null;
            field697 = null;
        }
    }
}
