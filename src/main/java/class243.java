import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class243 extends class285 {

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    private int field3834 = 2000;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    private int field3833 = 4096;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    private int field3835 = 0;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
    private int field3844 = 16;

    @OriginalMember(owner = "client!el", name = "db", descriptor = "I")
    private int field3847 = 0;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "[I")
    public static int[] field3845 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!el", name = "eb", descriptor = "I")
    public static int field3848 = 0;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "Lcd;")
    public static class69 field3842 = new class69(8);

    @OriginalMember(owner = "client!el", name = "fb", descriptor = "[I")
    public static int[] field3849 = new int[32];

    @OriginalMember(owner = "client!el", name = "O", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "Lak;")
    public static class172 field3846;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "[Loa;")
    public static class153[] field3843;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)[I", line = 13)
    public final int[] method60(boolean arg0, int arg1) {
        field3840++;
        int[] var3 = this.field4573.method1116(121, arg1);
        if (this.field4573.field2420) {
            int var4 = this.field3833 >> 1;
            int[][] var5 = this.field4573.method1117((byte) 18);
            Random var6 = new Random((long) this.field3835);
            for (int var7 = 0; var7 < this.field3834; var7++) {
                int var8 = this.field3833 <= 0 ? this.field3847 : this.field3847 + class158.method1138(this.field3833, true, var6) - var4;
                int var9 = class158.method1138(class287.field4599, arg0, var6);
                int var10 = (var8 & 0xFFE) >> 4;
                int var11 = class158.method1138(class27.field372, true, var6);
                int var12 = (class175.field2898[var10] * this.field3844 >> 12) + var11;
                int var13 = (class51.field731[var10] * this.field3844 >> 12) + var9;
                int var14 = var12 - var11;
                int var15 = var13 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                        var9 = var11;
                        var11 = var17;
                    }
                    if (var9 > var13) {
                        int var19 = var9;
                        var9 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var13 - var9;
                    int var22 = var12 - var11;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = var11;
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = 1024 - (class158.method1138(4096, arg0, var6) >> 2);
                    int var27 = var11 >= var12 ? -1 : 1;
                    for (int var28 = var9; var28 < var13; var28++) {
                        var24 += var22;
                        int var29 = (var28 - var9) * var25 + var26 + 1024;
                        int var30 = var28 & class112.field1717;
                        int var31 = class32.field432 & var23;
                        if (var24 > 0) {
                            var24 += -var21;
                            var23 += var27;
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
        return arg0 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 145)
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V", line = 177)
    public static final void method1748(byte arg0) {
        field3837++;
        if (!class240.field3809) {
            return;
        }
        class302.field4749 = null;
        if (arg0 < -30) {
            class129.field2022 = null;
            class240.field3809 = false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLjj;I)V", line = 197)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            field3842 = (class69) null;
        }
        if (arg2 == 0) {
            this.field3835 = arg1.method286((byte) -104);
        } else if (arg2 == 1) {
            this.field3834 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field3844 = arg1.method286((byte) -103);
        } else if (arg2 == 3) {
            this.field3847 = arg1.method271(21081);
        } else if (arg2 == 4) {
            this.field3833 = arg1.method271(21081);
        }
        field3838++;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V", line = 259)
    public final void method361(int arg0) {
        field3836++;
        int var2 = 25 / ((arg0 - 42) / 36);
        class208.method1511((byte) -63);
    }

    @OriginalMember(owner = "client!el", name = "j", descriptor = "(I)V", line = 270)
    public static void method1749(int arg0) {
        field3846 = null;
        if (arg0 != 0) {
            method1749(90);
        }
        field3842 = null;
        field3849 = null;
        field3843 = null;
        field3845 = null;
    }
}
