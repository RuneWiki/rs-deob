import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class68 extends class110 {

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    private int field895 = 4;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    private int field903 = 4;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "Llm;")
    public static class210 field898;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "[Lbm;")
    public static class44[] field893;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILre;I)V", line = 5)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field902++;
        if (arg2 > -37) {
            method453(-31);
        }
        if (arg0 == 0) {
            this.field903 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field895 = arg1.method1787(false);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 41)
    public class68() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lre;B)Ljava/lang/String;", line = 48)
    public static final String method451(class263 arg0, byte arg1) {
        if (arg1 >= -80) {
            field893 = (class44[]) null;
        }
        field899++;
        return class74.method472(0, 32767, arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)[[I", line = 62)
    public final int[][] method445(int arg0, boolean arg1) {
        int[][] var3 = this.field1701.method1477((byte) 56, arg0);
        if (this.field1701.field3255) {
            int var4 = class124.field1936 / this.field903;
            int var5 = class295.field4523 / this.field895;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method770(class295.field4523 * var6 / var5, (byte) 124, 0);
            } else {
                var7 = this.method770(0, (byte) 37, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var3[0];
            for (int var14 = 0; var14 < class124.field1936; var14++) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class124.field1936 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var13[var14] = var8[var16];
                var11[var14] = var10[var16];
                var12[var14] = var9[var16];
            }
        }
        field894++;
        if (arg1) {
            method453(65);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "(I)I", line = 127)
    public static final int method452(int arg0) {
        if (arg0 <= 101) {
            field898 = (class210) null;
        }
        field897++;
        return class230.field3475;
    }

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)V", line = 138)
    public static final void method453(int arg0) {
        if (arg0 == 0) {
            class11.field113.method2182(false);
            field896++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I", line = 149)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            method452(68);
        }
        field900++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int var4 = class124.field1936 / this.field903;
            int var5 = class295.field4523 / this.field895;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method764(0, true, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method764(0, true, class295.field4523 * var7 / var5);
            }
            for (int var8 = 0; var8 < class124.field1936; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class124.field1936 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)V", line = 207)
    public static void method454(int arg0) {
        if (arg0 > 117) {
            field893 = null;
            field898 = null;
        }
    }
}
