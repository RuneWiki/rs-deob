import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class398 {

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "Lin;")
    private class91 field5837;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "[[I")
    private int[][] field5843;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "[Z")
    private boolean[] field5844;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    private int field5834;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public static int field5839 = -1;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "Lmu;")
    public static class303 field5841 = new class303(8, -2);

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)Lvp;")
    public final class190 method2489(int arg0, byte arg1) {
        field5840++;
        byte[] var3 = this.field5837.method863(-1860, 1, arg0);
        if (arg1 < 12) {
            return null;
        } else {
            class190 var4 = new class190();
            var4.method1371(new class215(var3), 21890);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Z")
    public final boolean method2490(int arg0) {
        if (arg0 < 15) {
            this.field5843 = null;
        }
        field5836++;
        return this.field5834 != -1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method2491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg5 & 0x3;
        field5835++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (arg6 != 16) {
            return -78;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg3;
        } else if (var7 == 2) {
            return 7 + 1 - arg4 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)[I")
    public final int[] method2492(int arg0, int arg1) {
        field5838++;
        if (arg0 < 0 || arg0 >= this.field5843.length) {
            return this.field5834 == -1 ? new int[0] : new int[] { this.field5834 };
        } else if (this.field5844[arg0] && this.field5843[arg0].length > 1) {
            int var3 = ~this.field5834 == arg1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field5843[arg0].length];
            class363.method2320(this.field5843[arg0], 0, var5, 0, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = var3 + class37.method463((byte) 80, var5.length - var3, var4);
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field5843[arg0];
        }
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(I)V")
    public static void method2493(int arg0) {
        if (arg0 != 1) {
            field5839 = 93;
        }
        field5841 = null;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lat;I)V")
    public static final void method2494(class378 arg0, int arg1) {
        field5842++;
        int var2 = 113 % ((-arg1 - 25) / 59);
        class378 var3 = class254.method1732(arg0, 3);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class582.field7968;
            var5 = class467.field6559;
        } else {
            var4 = var3.field5465;
            var5 = var3.field5385;
        }
        class555.method3193(var5, -326, arg0, false, var4);
        class114.method1003((byte) -114, var5, var4, arg0);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lsj;ILin;)V")
    public class398(class460 arg0, int arg1, class91 arg2) {
        this.field5837 = arg2;
        this.field5837.method860(0, 1);
        class215 var4 = new class215(this.field5837.method863(-1860, 0, 0));
        int var5 = var4.method1535(255);
        if (var5 > 3) {
            this.field5843 = new int[0][];
            this.field5844 = new boolean[0];
            this.field5834 = -1;
        } else {
            int var6 = var4.method1535(255);
            class426[] var7 = class207.method1430(-122);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method1535(255);
                    if (var7[var9].field6129 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method1535(255);
                int var12 = var4.method1535(255);
                if (var5 > 2) {
                    this.field5834 = var4.method1520(13638);
                } else {
                    this.field5834 = -1;
                }
                this.field5843 = new int[var12 + 1][];
                this.field5844 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method1535(255);
                    this.field5844[var15] = var4.method1535(255) == 1;
                    int var16 = var4.method1478(842397944);
                    if (this.field5834 == -1) {
                        this.field5843[var15] = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field5843[var15][var17] = var4.method1478(842397944);
                        }
                    } else {
                        this.field5843[var15] = new int[var16 + 1];
                        this.field5843[var15][0] = this.field5834;
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field5843[var15][var18 + 1] = var4.method1478(842397944);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field5843[var14] == null) {
                        if (this.field5834 == -1) {
                            this.field5843[var14] = new int[0];
                        } else {
                            this.field5843[var14] = new int[] { this.field5834 };
                        }
                    }
                }
            } else {
                this.field5844 = new boolean[0];
                this.field5843 = new int[0][];
                this.field5834 = -1;
            }
        }
    }
}
