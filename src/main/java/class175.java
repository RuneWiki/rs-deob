import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class175 extends class276 {

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    private int field2873 = 2000;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    private int field2875 = 16;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    private int field2882 = 0;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    private int field2880 = 0;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    private int field2879 = 4096;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "[I")
    public static int[] field2872 = new int[200];

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field2876 = 0;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "Z")
    public static boolean field2874 = false;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "[I")
    public static int[] field2878 = new int[32];

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "[I")
    public static int[] field2883;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "[[I")
    public static int[][] field2877;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)V")
    public static final void method1161(int arg0, int arg1) {
        if (arg0 < -71) {
            ++field2870;
            class204.field3333.method63(0, arg1);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
    public static final void method1162(boolean arg0, int arg1) {
        class2.field16.method63(0, arg1);
        if (!arg0) {
            ++field2866;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            field2883 = null;
        }
        ++field2871;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = this.field2879 >> 1;
            int[][] var5 = super.field4425.method990(true);
            Random var6 = new Random((long) this.field2880);
            for (int var7 = 0; var7 < this.field2873; ++var7) {
                int var8 = this.field2879 <= 0 ? this.field2882 : this.field2882 + -var4 + class37.method246(this.field2879, (byte) -59, var6);
                int var9 = 255 & var8 >> 4;
                int var10 = class37.method246(class53.field929, (byte) -59, var6);
                int var11 = class37.method246(class209.field3540, (byte) -59, var6);
                int var12 = var11 - -(class156.field2613[var9] * this.field2875 >> 12);
                int var13 = var10 - -(class42.field620[var9] * this.field2875 >> 12);
                int var14 = var13 - var10;
                int var15 = var12 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var14 > ~var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (var13 < var10) {
                        int var19 = var10;
                        var10 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var10;
                    int var23 = -var11 + var12;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class37.method246(4096, (byte) -59, var6) >> 2);
                    int var27 = var11 < var12 ? 1 : -1;
                    for (int var28 = var10; ~var13 < ~var28; ++var28) {
                        var24 += var23;
                        int var29 = class35.field504 & var28;
                        int var30 = var21 & class125.field2189;
                        int var31 = (-var10 + var28) * var25 + 1024 + var26;
                        if (var16) {
                            var5[var30][var29] = var31;
                        } else {
                            var5[var29][var30] = var31;
                        }
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)I")
    public static final int method1163(int arg0) {
        ++field2865;
        if (class252.field4135 == null) {
            return -1;
        } else {
            int var1 = -43 / ((arg0 - 50) / 61);
            while (~class127.field2227 > ~class252.field4135.field3158) {
                if (class252.field4135.method1277(class127.field2227, -32159)) {
                    return class127.field2227++;
                }
                ++class127.field2227;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBI)V")
    public static final void method1164(int arg0, int arg1, byte arg2, int arg3) {
        ++field2869;
        class55 var4 = class62.method395(9, arg3, (byte) -66);
        var4.method340((byte) -110);
        if (arg2 != -99) {
            method1166((byte) -24);
        }
        var4.field953 = arg1;
        var4.field947 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field2868;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field2879 = arg1.method677(false);
                        }
                    } else {
                        this.field2882 = arg1.method677(false);
                    }
                } else {
                    this.field2875 = arg1.method669((byte) 36);
                }
            } else {
                this.field2873 = arg1.method677(false);
            }
        } else {
            this.field2880 = arg1.method669((byte) 36);
        }
        if (arg2 != -1) {
            this.field2879 = -75;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        class76.method465(109);
        if (arg0 > 66) {
            ++field2864;
        }
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        int var1 = 73 % ((arg0 - 31) / 44);
        field2872 = null;
        field2883 = null;
        field2877 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I")
    public static final int method1166(byte arg0) {
        int var1 = -49 / ((57 - arg0) / 58);
        ++field2863;
        return ((~class50.field872 == -1 ? 0 : 1) << 21) + ((~class10.field121 == -1 ? 0 : 1) << 20) + ((!class61.field1069 ? 0 : 1) << 19) + (class103.field1818 << 17) + ((class103.field1816 ? 1 : 0) << 16) + ((class11.field164 ? 1 : 0) << 15) + (6144 & class24.field379 << 11) + ((!class22.field338 ? 0 : 1) << 8) + ((!class11.field156 ? 0 : 1) << 7) + ((!class239.field3932 ? 0 : 1) << 6) + ((class172.field2828 ? 1 : 0) << 5) + (7 & class286.field4518) + ((!class277.field4434 ? 0 : 1) << 3) - (-((class280.field4459 ? 1 : 0) << 4) + -((!class255.field4168 ? 0 : 1) << 9)) - (-((!class188.field3051 ? 0 : 1) << 10) + -((class49.field848 ? 1 : 0) << 13) + -((~class196.field3167 != -1 ? 1 : 0) << 22) + -(class32.method216() << 23));
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(II)V")
    public static final void method1167(int arg0, int arg1) {
        class109 var2 = class79.field1367[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class109 var4 = class79.field1367[var3][arg0][arg1] = class79.field1367[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field1973;
                for (int var5 = 0; var5 < var4.field1968; ++var5) {
                    class173 var6 = var4.field1961[var5];
                    if ((var6.field2850 >> 29 & 3L) == 2L && var6.field2840 == arg0 && var6.field2839 == arg1) {
                        --var6.field2838;
                    }
                }
            }
        }
        if (class79.field1367[0][arg0][arg1] == null) {
            class79.field1367[0][arg0][arg1] = new class109(0, arg0, arg1);
        }
        class79.field1367[0][arg0][arg1].field1980 = var2;
        class79.field1367[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Llj;")
    public static final class24 method1168(int arg0, byte arg1) {
        ++field2881;
        class24 var2 = (class24) class79.field1362.method57((long) arg0, -82);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class239.field3919.method746(arg0, (byte) -128, 34);
            class24 var4 = new class24();
            if (var3 != null) {
                var4.method167(arg0, new class101(var3), (byte) -74);
            }
            class79.field1362.method62(0, var4, (long) arg0);
            if (arg1 != -45) {
                field2878 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, true);
    }
}
