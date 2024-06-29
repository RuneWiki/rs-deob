import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class237 {

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "Lla;")
    private class422 field3802;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "[[I")
    private int[][] field3805;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    private int field3810;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "[Z")
    private boolean[] field3807;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "[F")
    public static float[] field3814 = new float[4];

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "Leda;")
    public static class14 field3808 = new class14(128, 4);

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "Z")
    public static boolean field3816 = false;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "Loj;")
    public static class208 field3813;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "Z")
    public static boolean field3809;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IB)Lqa;")
    public final class146 method1629(int arg0, byte arg1) {
        field3815++;
        byte[] var3 = this.field3802.method2624(0, 1, arg0);
        class146 var4 = new class146();
        var4.method1120((byte) 15, new class301(var3));
        int var5 = 75 / ((42 - arg1) / 46);
        return var4;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(BII)Z")
    public static final boolean method1630(byte arg0, int arg1, int arg2) {
        field3806++;
        if (arg0 >= -21) {
            method1634((byte) 120);
        }
        return (arg2 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)[I")
    public final int[] method1631(int arg0, int arg1) {
        field3803++;
        if (arg0 < 0 || arg0 >= this.field3805.length) {
            return this.field3810 == -1 ? new int[0] : new int[] { this.field3810 };
        } else if (this.field3807[arg0] && this.field3805[arg0].length > 1) {
            int var3 = this.field3810 == -1 ? 0 : 1;
            Random var4 = new Random();
            int[] var5 = new int[this.field3805[arg0].length];
            class571.method3314(this.field3805[arg0], 0, var5, arg1, var5.length);
            for (int var6 = var3; var6 < var5.length; var6++) {
                int var7 = class721.method3975(var5.length - var3, var4, false) + var3;
                int var8 = var5[var6];
                var5[var6] = var5[var7];
                var5[var7] = var8;
            }
            return var5;
        } else {
            return this.field3805[arg0];
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        field3811++;
        if (arg0 != 0) {
            field3808 = null;
        }
        if (class706.field9962.field10270 && class87.field1280.field7542 != -1) {
            class217.method1558(true, class87.field1280.field7535, class87.field1280.field7542);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)Z")
    public final boolean method1633(byte arg0) {
        if (arg0 != -126) {
            field3816 = false;
        }
        field3812++;
        return this.field3810 != -1;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)V")
    public static void method1634(byte arg0) {
        field3814 = null;
        field3808 = null;
        field3813 = null;
        if (arg0 != 117) {
            method1634((byte) -61);
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)V")
    public static final void method1635(byte arg0) {
        class157.field2437 = 0;
        field3804++;
        boolean var1 = class624.field8742.method1924(5970) == 1;
        int var2 = class624.field8742.method1987(-91);
        int var3 = class624.field8742.method1972(-128);
        int var4 = class624.field8742.method1972(-128);
        class125.method969(0);
        class357.method2281(arg0 ^ 0xFFFFEF75, var2);
        int var5 = (class495.field7166 - class624.field8742.field4534) / 16;
        class184.field3099 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class184.field3099[var6][var10] = class624.field8742.method1934(arg0 + 16);
            }
        }
        class666.field9464 = new int[var5];
        class298.field4520 = null;
        class404.field5987 = new byte[var5][];
        class693.field9833 = new byte[var5][];
        class387.field5799 = new int[var5];
        class63.field991 = null;
        class339.field4964 = new byte[var5][];
        class339.field4966 = new int[var5];
        class304.field4635 = new int[var5];
        class205.field3445 = new int[var5];
        if (arg0 != -18) {
            field3809 = true;
        }
        class730.field10245 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var3 - (class191.field3229 >> 4)) / 8; var8 <= (((class191.field3229 >> 4) + var3) / 8); var8++) {
            for (int var9 = (var4 - (class314.field4720 >> 4)) / 8; var9 <= (((class314.field4720 >> 4) + var4) / 8); var9++) {
                class205.field3445[var7] = (var8 << 8) + var9;
                class387.field5799[var7] = class193.field3342.method2629("m" + var8 + "_" + var9, 10912);
                class339.field4966[var7] = class193.field3342.method2629("l" + var8 + "_" + var9, 10912);
                class304.field4635[var7] = class193.field3342.method2629("um" + var8 + "_" + var9, 10912);
                class666.field9464[var7] = class193.field3342.method2629("ul" + var8 + "_" + var9, 10912);
                var7++;
            }
        }
        class635.method3599(var1, 11, var4, var3, arg0 + 17);
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class237(class292 arg0, int arg1, class422 arg2) {
        this.field3802 = arg2;
        this.field3802.method2615(0, 1);
        class301 var4 = new class301(this.field3802.method2624(0, 0, 0));
        int var5 = var4.method1987(-102);
        if (var5 > 3) {
            this.field3805 = new int[0][];
            this.field3810 = -1;
            this.field3807 = new boolean[0];
        } else {
            int var6 = var4.method1987(-51);
            class26[] var7 = class257.method1731((byte) -85);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method1987(-28);
                    if (var7[var9].field262 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method1987(-78);
                int var12 = var4.method1987(-100);
                if (var5 <= 2) {
                    this.field3810 = -1;
                } else {
                    this.field3810 = var4.method1977((byte) -126);
                }
                this.field3805 = new int[var12 + 1][];
                this.field3807 = new boolean[var12 + 1];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var15 = var4.method1987(-104);
                    this.field3807[var15] = var4.method1987(-85) == 1;
                    int var16 = var4.method1989((byte) -77);
                    if (this.field3810 == -1) {
                        this.field3805[var15] = new int[var16];
                        for (int var18 = 0; var18 < var16; var18++) {
                            this.field3805[var15][var18] = var4.method1989((byte) -104);
                        }
                    } else {
                        this.field3805[var15] = new int[var16 + 1];
                        this.field3805[var15][0] = this.field3810;
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field3805[var15][var17 + 1] = var4.method1989((byte) -56);
                        }
                    }
                }
                for (int var14 = 0; var14 < var12 + 1; var14++) {
                    if (this.field3805[var14] == null) {
                        if (this.field3810 == -1) {
                            this.field3805[var14] = new int[0];
                        } else {
                            this.field3805[var14] = new int[] { this.field3810 };
                        }
                    }
                }
            } else {
                this.field3807 = new boolean[0];
                this.field3810 = -1;
                this.field3805 = new int[0][];
            }
        }
    }
}
