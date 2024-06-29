import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class221 extends class190 {

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    private int field3794;

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "[I")
    public int[] field3801;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "[Z")
    public boolean[] field3803;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "[[I")
    public int[][] field3796;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "Lqe;")
    public static class168 field3797 = class66.method448("Fps:", 118);

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "[I")
    public static int[] field3799 = new int[50];

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field3795 = 0;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "Loe;")
    public static class256 field3802;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[[[B")
    public static byte[][][] field3792;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmj;I)Lqe;")
    public static final class168 method1453(class129 arg0, int arg1) {
        field3793++;
        if (class1.method4(client.method266(arg0), -701) == 0) {
            return null;
        } else if (arg0.field2169 == null || arg0.field2169.method1086((byte) -127).method1109((byte) 105) == 0) {
            return class125.field2051 ? class31.field370 : null;
        } else {
            if (arg1 > -105) {
                method1453(null, -96);
            }
            return arg0.field2169;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method1454(int arg0) {
        field3799 = null;
        field3792 = null;
        if (arg0 != 0) {
            method1454(19);
        }
        field3797 = null;
        field3802 = null;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I[B)V")
    public class221(int arg0, byte[] arg1) {
        this.field3800 = arg0;
        class112 var3 = new class112(arg1);
        this.field3794 = var3.method758(true);
        this.field3801 = new int[this.field3794];
        this.field3803 = new boolean[this.field3794];
        this.field3796 = new int[this.field3794][];
        for (int var4 = 0; var4 < this.field3794; var4++) {
            this.field3801[var4] = var3.method758(true);
        }
        for (int var5 = 0; var5 < this.field3794; var5++) {
            this.field3803[var5] = var3.method758(true) == 1;
        }
        for (int var6 = 0; var6 < this.field3794; var6++) {
            this.field3796[var6] = new int[var3.method758(true)];
        }
        for (int var7 = 0; var7 < this.field3794; var7++) {
            for (int var8 = 0; var8 < this.field3796[var7].length; var8++) {
                this.field3796[var7][var8] = var3.method758(true);
            }
        }
    }
}
