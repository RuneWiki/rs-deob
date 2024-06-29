import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class163 extends class107 {

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    private int field2904 = 16;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    private int field2900 = 0;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    private int field2902 = 4096;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    private int field2908 = 2000;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    private int field2909 = 0;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "[Lpj;")
    public static class237[] field2901 = new class237[8];

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "Lpj;")
    public static class237 field2896 = class33.method353(" loggt sich aus)3", 54);

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "Lpj;")
    public static class237 field2897 = class33.method353("Gegenstand f-Ur Mitglieder", 90);

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "[I")
    public static int[] field2905 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "Ljd;")
    public static class86 field2907;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "[[B")
    public static byte[][] field2903;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V")
    public static final void method1146(int arg0) {
        class155.field2752 = arg0;
        ++field2894;
        class124.field2179 = 0;
        class99.method758(0);
        class102.method776(110);
        class45.method425(0);
        for (int var1 = 0; ~class124.field2179 < ~var1; ++var1) {
            int var3 = class15.field252[var1];
            if (class241.field4246 != class232.field4022[var3].field3692) {
                if (class232.field4022[var3].field3586.method1539((byte) 21)) {
                    class167.method1166(class232.field4022[var3], arg0 ^ -121);
                }
                class232.field4022[var3].field3586 = null;
                class232.field4022[var3] = null;
            }
        }
        if (~class120.field2130 != ~class65.field1288.field647) {
            throw new RuntimeException("gnp1 pos:" + class65.field1288.field647 + " psize:" + class120.field2130);
        } else {
            for (int var2 = 0; ~var2 > ~class89.field1636; ++var2) {
                if (class232.field4022[class263.field4498[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class89.field1636);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            this.field2908 = 62;
        }
        ++field2898;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = this.field2902 >> 1;
            int[][] var5 = super.field1921.method1389(21082);
            Random var6 = new Random((long) this.field2909);
            for (int var7 = 0; var7 < this.field2908; ++var7) {
                int var8 = ~this.field2902 < -1 ? this.field2900 - (-class211.method1413(this.field2902, arg0 ^ 16, var6) + var4) : this.field2900;
                int var9 = 255 & var8 >> 4;
                int var10 = class211.method1413(class106.field1862, -1, var6);
                int var11 = class211.method1413(class193.field3342, -1, var6);
                int var12 = (class34.field730[var9] * this.field2904 >> 12) + var10;
                int var13 = (class105.field1845[var9] * this.field2904 >> 12) + var11;
                int var14 = var12 - var10;
                int var15 = -var11 + var13;
                if (~var14 != -1 || ~var15 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var11;
                        var11 = var13;
                        var13 = var19;
                        int var20 = var10;
                        var10 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var11 + var13;
                    if (~var22 > -1) {
                        var22 = -var22;
                    }
                    int var23 = var12 - var10;
                    int var24 = -var23 / 2;
                    int var25 = 2048 / var23;
                    int var26 = -(class211.method1413(4096, -1, var6) >> 2) + 1024;
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        var24 += var22;
                        int var29 = (-var10 + var28) * var25 + var26 - -1024;
                        int var30 = var28 & class110.field1937;
                        int var31 = class254.field4363 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var24 -= var23;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)Z")
    public static final boolean method1147(int arg0) {
        ++field2893;
        try {
            if (arg0 != -1300) {
                field2906 = -104;
            }
            if (~class41.field930 == -3) {
                if (class177.field3111 == null) {
                    class177.field3111 = class246.method1691(class55.field1144, class230.field3942, class193.field3340);
                    if (class177.field3111 == null) {
                        return false;
                    }
                }
                if (class95.field1688 == null) {
                    class95.field1688 = new class48(class170.field2981, class104.field1843);
                }
                if (class115.field2020.method1858(class177.field3111, class95.field1688, class51.field1084, 22050, (byte) 107)) {
                    class115.field2020.method1854(false);
                    class115.field2020.method1869(class199.field3452, 25835);
                    class115.field2020.method1839(class177.field3111, arg0 + 3725, class62.field1248);
                    class95.field1688 = null;
                    class177.field3111 = null;
                    class41.field930 = 0;
                    class55.field1144 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class115.field2020.method1834(-26608);
            class41.field930 = 0;
            class55.field1144 = null;
            class177.field3111 = null;
            class95.field1688 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field2902 = arg0.method339(-16777216);
                        }
                    } else {
                        this.field2900 = arg0.method339(-16777216);
                    }
                } else {
                    this.field2904 = arg0.method316((byte) 96);
                }
            } else {
                this.field2908 = arg0.method339(arg2 ^ 16744703);
            }
        } else {
            this.field2909 = arg0.method316((byte) -64);
        }
        ++field2895;
        if (arg2 != -32513) {
            this.field2908 = 72;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        field2896 = null;
        field2907 = null;
        field2897 = null;
        field2905 = null;
        if (arg0 < -48) {
            field2901 = null;
            field2903 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        class212.method1423(-19836);
        ++field2910;
        if (arg0 != 31) {
            method1148((byte) -89);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }
}
