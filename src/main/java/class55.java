import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class55 extends class180 {

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!ih", name = "t", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "[I")
    public int[] field900;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "[[I")
    public int[][] field891;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "[I")
    public int[] field890;

    @OriginalMember(owner = "client!ih", name = "v", descriptor = "[Z")
    public boolean[] field896;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!ih", name = "u", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "Lsm;")
    public static class249 field892 = new class249();

    @OriginalMember(owner = "client!ih", name = "x", descriptor = "Lcs;")
    public static class351 field898 = new class351(44, 15);

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "[Lks;")
    public static class136[] field901 = new class136[29];

    @OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ih", name = "y", descriptor = "Z")
    public static boolean field899;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBIIIIII)V", line = 5)
    public static final void method427(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class299.field4121 <= arg5 && arg6 <= class248.field3487 && arg3 >= class53.field874 && class8.field174 >= arg7) {
            class293.method1809(arg0, -122, arg6, arg4, arg5, arg3, arg2, arg7);
        } else {
            class168.method1040(arg3, arg2, arg6, arg5, arg4, -20002, arg7, arg0);
        }
        field897++;
        int var8 = 32 % ((45 - arg1) / 50);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V", line = 26)
    public static void method428(byte arg0) {
        field898 = null;
        if (arg0 != 97) {
            method428((byte) 80);
        }
        field892 = null;
        field901 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I[B)V", line = 55)
    public class55(int arg0, byte[] arg1) {
        this.field893 = arg0;
        class425 var3 = new class425(arg1);
        this.field894 = var3.method2503(true);
        this.field900 = new int[this.field894];
        this.field891 = new int[this.field894][];
        this.field890 = new int[this.field894];
        this.field896 = new boolean[this.field894];
        for (int var4 = 0; var4 < this.field894; var4++) {
            this.field890[var4] = var3.method2503(true);
        }
        for (int var5 = 0; var5 < this.field894; var5++) {
            this.field896[var5] = var3.method2503(true) == 1;
        }
        for (int var6 = 0; var6 < this.field894; var6++) {
            this.field900[var6] = var3.method2508(true);
        }
        for (int var7 = 0; var7 < this.field894; var7++) {
            this.field891[var7] = new int[var3.method2503(true)];
        }
        for (int var8 = 0; var8 < this.field894; var8++) {
            for (int var9 = 0; var9 < this.field891[var8].length; var9++) {
                this.field891[var8][var9] = var3.method2503(true);
            }
        }
    }
}
