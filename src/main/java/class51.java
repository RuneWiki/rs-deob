import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class51 extends class3 {

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    private int field755 = 2000;

    @OriginalMember(owner = "client!co", name = "S", descriptor = "I")
    private int field768 = 16;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    private int field765 = 0;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    private int field756 = 0;

    @OriginalMember(owner = "client!co", name = "U", descriptor = "I")
    private int field770 = 4096;

    @OriginalMember(owner = "client!co", name = "T", descriptor = "Z")
    public static boolean field769 = false;

    @OriginalMember(owner = "client!co", name = "X", descriptor = "I")
    public static int field773 = 0;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!co", name = "V", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!co", name = "W", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "Lsc;")
    public static class158 field766;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "Lsi;")
    public static class264 field757;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "[I")
    public static int[] field764;

    @OriginalMember(owner = "client!co", name = "R", descriptor = "[I")
    public static int[] field767;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(B)V", line = 5)
    public static void method375(byte arg0) {
        field766 = null;
        if (arg0 != 124) {
            field766 = (class158) null;
        }
        field767 = null;
        field764 = null;
        field757 = null;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V", line = 235)
    public class51() {
        super(0, true);
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V", line = 24)
    public final void method20(byte arg0) {
        class291.method2061(0);
        int var2 = -77 / ((-arg0 - 20) / 58);
        field771++;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lfh;IZ)V", line = 56)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field765 = arg0.method2224(-124);
        } else if (arg1 == 1) {
            this.field755 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field768 = arg0.method2224(-119);
        } else if (arg1 == 3) {
            this.field756 = arg0.method2250(-1613178296);
        } else if (arg1 == 4) {
            this.field770 = arg0.method2250(-1613178296);
        }
        field761++;
        if (arg2) {
            this.field770 = -74;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)[I", line = 103)
    public final int[] method25(byte arg0, int arg1) {
        field772++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (arg0 < 57) {
            return (int[]) null;
        }
        if (this.field21.field2808) {
            int var4 = this.field770 >> 1;
            int[][] var5 = this.field21.method1259(86);
            Random var6 = new Random((long) this.field765);
            for (int var7 = 0; var7 < this.field755; var7++) {
                int var8 = this.field770 <= 0 ? this.field756 : this.field756 + class4.method33(false, var6, this.field770) - var4;
                int var9 = class4.method33(false, var6, class326.field5342);
                int var10 = class4.method33(false, var6, class308.field5010);
                int var11 = (var8 & 0xFFB) >> 4;
                int var12 = (class18.field225[var11] * this.field768 >> 12) + var9;
                int var13 = var10 + (class248.field3943[var11] * this.field768 >> 12);
                int var14 = var12 - var9;
                int var15 = var13 - var10;
                if (var14 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var12;
                        int var18 = var9;
                        var12 = var13;
                        var9 = var10;
                        var13 = var17;
                        var10 = var18;
                    }
                    if (var12 < var9) {
                        int var19 = var9;
                        var9 = var12;
                        int var20 = var10;
                        var10 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var10;
                    int var22 = var12 - var9;
                    int var23 = var13 - var10;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var26 = var10 >= var13 ? -1 : 1;
                    int var27 = 1024 - (class4.method33(false, var6, 4096) >> 2);
                    for (int var28 = var9; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = ((var28 - var9) * var25) + var27 + 1024;
                        int var30 = var21 & class129.field1970;
                        int var31 = var28 & class5.field70;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var26;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V", line = 241)
    public static final void method376(int arg0, int arg1, int arg2, int arg3) {
        field763++;
        String var4 = "::tele " + arg1 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (arg3 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        if (arg2 != 1791677414) {
            method376(85, 98, -66, 25);
        }
        class5.method40(var4, (byte) -7);
    }
}
