import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class480 {

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public int field6996;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field6985;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public int field6997;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public int field6998;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lwh;")
    public static class415 field6986;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lkt;")
    public class60 field6991;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    public int[] field6987;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
    public int[] field6988;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
    public int[] field6990;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
    public int[] field6993;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
    public int[] field6999;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[I")
    public int[] field7000;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[Lkt;")
    public class60[] field7001;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[[I")
    public int[][] field6989;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[[I")
    public int[][] field6995;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 8)
    public static void method2876(byte arg0) {
        field6986 = null;
        int var1 = -90 / ((arg0 + 79) / 42);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V", line = 29)
    private final void method2877(byte[] arg0, int arg1) {
        field6992++;
        class88 var3 = new class88(class295.method1773((byte) -1, arg0));
        int var4 = var3.method617(2);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field6998 = var3.method578(93);
        } else {
            this.field6998 = 0;
        }
        int var5 = var3.method617(2);
        this.field6985 = var3.method568((byte) 110);
        int var6 = 0;
        this.field6999 = new int[this.field6985];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field6985; var8++) {
            this.field6999[var8] = var6 += var3.method568((byte) 110);
            if (this.field6999[var8] > var7) {
                var7 = this.field6999[var8];
            }
        }
        this.field6997 = var7 + 1;
        this.field6988 = new int[this.field6997];
        this.field6989 = new int[this.field6997][];
        this.field6987 = new int[this.field6997];
        this.field7000 = new int[this.field6997];
        this.field6990 = new int[this.field6997];
        if (var5 != 0) {
            this.field6993 = new int[this.field6997];
            for (int var9 = 0; var9 < this.field6997; var9++) {
                this.field6993[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field6985; var10++) {
                this.field6993[this.field6999[var10]] = var3.method578(101);
            }
            this.field6991 = new class60(this.field6993);
        }
        if (arg1 != 6) {
            return;
        }
        for (int var11 = 0; var11 < this.field6985; var11++) {
            this.field6987[this.field6999[var11]] = var3.method578(120);
        }
        for (int var12 = 0; var12 < this.field6985; var12++) {
            this.field7000[this.field6999[var12]] = var3.method578(arg1 + 83);
        }
        for (int var13 = 0; var13 < this.field6985; var13++) {
            this.field6988[this.field6999[var13]] = var3.method568((byte) 110);
        }
        for (int var14 = 0; var14 < this.field6985; var14++) {
            int var21 = this.field6999[var14];
            int var22 = 0;
            int var23 = this.field6988[var21];
            this.field6989[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field6989[var21][var25] = var22 += var3.method568((byte) 110);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field6990[var21] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field6989[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field7001 = new class60[var7 + 1];
        this.field6995 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field6985; var15++) {
            int var16 = this.field6999[var15];
            int var17 = this.field6988[var16];
            this.field6995[var16] = new int[this.field6990[var16]];
            for (int var18 = 0; var18 < this.field6990[var16]; var18++) {
                this.field6995[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field6989[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field6989[var16][var19];
                }
                this.field6995[var16][var20] = var3.method578(110);
            }
            this.field7001[var16] = new class60(this.field6995[var16]);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZIIIF)[I", line = 201)
    public static final int[] method2878(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float arg7) {
        field6994++;
        int[] var8 = new int[arg1];
        class121 var9 = new class121();
        var9.field1678 = arg0;
        var9.field1694 = arg3;
        var9.field1679 = arg2;
        var9.field1684 = arg6;
        var9.field1693 = arg5;
        var9.field1695 = (int) (arg7 * 4096.0F);
        var9.method390(38);
        class169.method1126(1, arg4 - 1, arg1);
        var9.method769(arg4, var8, (byte) -105);
        return var8;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BI)V", line = 222)
    public class480(byte[] arg0, int arg1) {
        this.field6996 = class200.method1286(arg0.length, arg0, (byte) -81);
        if (this.field6996 != arg1) {
            throw new RuntimeException();
        }
        this.method2877(arg0, 6);
    }
}
