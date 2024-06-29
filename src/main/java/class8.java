import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class8 extends class120 {

    @OriginalMember(owner = "client!mm", name = "eb", descriptor = "I")
    private int field109 = 0;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    private int field102 = 16;

    @OriginalMember(owner = "client!mm", name = "bb", descriptor = "I")
    private int field106 = 4096;

    @OriginalMember(owner = "client!mm", name = "gb", descriptor = "I")
    private int field111 = 0;

    @OriginalMember(owner = "client!mm", name = "hb", descriptor = "I")
    private int field112 = 2000;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "[I")
    public static int[] field99 = new int[1000];

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "Lok;")
    public static class41 field100 = class137.method956("<)4col> x", 45);

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    public static int field101 = 0;

    @OriginalMember(owner = "client!mm", name = "cb", descriptor = "Lok;")
    public static class41 field107 = class137.method956("Fps:", 45);

    @OriginalMember(owner = "client!mm", name = "db", descriptor = "[I")
    public static int[] field108 = new int[5];

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!mm", name = "fb", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "[Ltb;")
    public static class199[] field98;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Llb;II)V", line = 16)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field104++;
        if (arg2 == 0) {
            this.field109 = arg0.method792(2);
        } else if (arg2 == 1) {
            this.field112 = arg0.method759((byte) -85);
        } else if (arg2 == 2) {
            this.field102 = arg0.method792(2);
        } else if (arg2 == 3) {
            this.field111 = arg0.method759((byte) -123);
        } else if (arg2 == 4) {
            this.field106 = arg0.method759((byte) -110);
        }
        if (arg1 != -1) {
            method32(-24);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V", line = 83)
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 94)
    public final void method31(int arg0) {
        class148.method1029(-16452);
        if (arg0 != -31851) {
            this.method14(2, 50);
        }
        field103++;
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)V", line = 106)
    public static void method32(int arg0) {
        field100 = null;
        field98 = null;
        field107 = null;
        field99 = null;
        if (arg0 == 0) {
            field108 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[I", line = 133)
    public final int[] method14(int arg0, int arg1) {
        field105++;
        if (arg1 != -14959) {
            this.field112 = -36;
        }
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = this.field106 >> 1;
            int[][] var5 = this.field1775.method860(arg1 + 14959);
            Random var6 = new Random((long) this.field109);
            for (int var7 = 0; var7 < this.field112; var7++) {
                int var8 = this.field106 > 0 ? this.field111 - (var4 - class91.method640(arg1 + 15043, this.field106, var6)) : this.field111;
                int var9 = class91.method640(87, class307.field5160, var6);
                int var10 = (var8 & 0xFFD) >> 4;
                int var11 = class91.method640(arg1 ^ 0xFFFFC59C, class226.field3609, var6);
                int var12 = var9 + (class136.field2040[var10] * this.field102 >> 12);
                int var13 = (class313.field5283[var10] * this.field102 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var9 > var12) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var11;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = var12 - var9;
                    int var24 = 2048 / var23;
                    int var25 = -var23 / 2;
                    int var26 = 1024 - (class91.method640(9, 4096, var6) >> 2);
                    int var27 = var11 >= var13 ? -1 : 1;
                    for (int var28 = var9; var28 < var12; var28++) {
                        var25 += var22;
                        int var29 = (var28 - var9) * var24 + var26 + 1024;
                        int var30 = class51.field776 & var28;
                        int var31 = class27.field410 & var21;
                        if (var25 > 0) {
                            var21 += var27;
                            var25 += -var23;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
