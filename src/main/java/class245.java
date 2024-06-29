import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class245 extends class224 {

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "I")
    private int field4167 = 4096;

    @OriginalMember(owner = "client!tl", name = "db", descriptor = "I")
    private int field4175 = 0;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "Z")
    public static boolean field4165 = false;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "I")
    public static int field4169 = 0;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "F")
    public static float field4166;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!tl", name = "Z", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!tl", name = "ab", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!tl", name = "bb", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!tl", name = "cb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!tl", name = "Y", descriptor = "Lw;")
    public static class37 field4170;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)[[I", line = 15)
    public final int[][] method17(int arg0, byte arg1) {
        field4168++;
        if (arg1 != -77) {
            this.method18((byte) 120, 73);
        }
        int[][] var3 = this.field3631.method1587(arg0, arg1 ^ 0xFFFFD9FF);
        if (this.field3631.field3756) {
            int[][] var4 = this.method1535(0, 3, arg0);
            int[] var5 = var3[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var4[1];
            for (int var11 = 0; var11 < class187.field2961; var11++) {
                int var12 = var10[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (this.field4175 > var13) {
                    var9[var11] = this.field4175;
                } else if (var13 <= this.field4167) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field4167;
                }
                if (var12 < this.field4175) {
                    var5[var11] = this.field4175;
                } else if (this.field4167 >= var12) {
                    var5[var11] = var12;
                } else {
                    var5[var11] = this.field4167;
                }
                if (var14 < this.field4175) {
                    var8[var11] = this.field4175;
                } else if (this.field4167 < var14) {
                    var8[var11] = this.field4167;
                } else {
                    var8[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 91)
    public class245() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(Z)V", line = 109)
    public static void method1685(boolean arg0) {
        if (arg0) {
            field4165 = false;
        }
        field4170 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)[I", line = 124)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = 18 % ((arg0 - 20) / 51);
        field4174++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 0, 0);
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                int var7 = var5[var6];
                if (var7 < this.field4175) {
                    var4[var6] = this.field4175;
                } else if (this.field4167 < var7) {
                    var4[var6] = this.field4167;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZLj;)V", line = 172)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field4164++;
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field4175 = arg2.method1069(106);
        } else if (arg0 == 1) {
            this.field4167 = arg2.method1069(76);
        } else if (arg0 == 2) {
            this.field3610 = arg2.method1042((byte) -30) == 1;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(III)Lmf;", line = 215)
    public static final class28 method1686(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1981;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 228)
    public static final void method1687(int arg0, int arg1) {
        if (arg0 <= 13) {
            method1686(29, 99, 85);
        }
        if (class271.field4562 == null || arg1 > class271.field4562.length) {
            class271.field4562 = new int[arg1];
        }
        field4172++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLdk;)V", line = 246)
    public static final void method1688(byte arg0, class241 arg1) {
        class157.field2494 = class6.method20((byte) -122, class106.field1635, arg1, 0);
        field4173++;
        class178.field2880 = new class265[class157.field2494.length];
        class225.field3635 = new class265[class157.field2494.length];
        class26.field314 = new class265[class157.field2494.length];
        for (int var2 = 0; var2 < class157.field2494.length; var2++) {
            class157.field2494[var2].method1845();
            class178.field2880[var2] = class157.field2494[var2].method1846();
            class157.field2494[var2].method1845();
            class225.field3635[var2] = class157.field2494[var2].method1846();
            class157.field2494[var2].method1845();
            class26.field314[var2] = class157.field2494[var2].method1846();
            class157.field2494[var2].method1845();
        }
        class276.field4645 = class141.method970((byte) 86, class194.field3154, 0, arg1);
        class50.field611 = class274.method1896(119, arg1, class156.field2463, 0);
        class296.field5007 = class274.method1896(79, arg1, class6.field74, 0);
        class298.field5045 = class274.method1896(60, arg1, class78.field1072, 0);
        class40.field512 = class274.method1896(123, arg1, class224.field3616, 0);
        class148.field2285 = class213.method1483(arg1, (byte) -101, 0, class44.field542);
        class150.field2318 = class213.method1483(arg1, (byte) -101, 0, class153.field2377);
        class22.field279 = class168.method1186(class110.field1725, (byte) 0, 0, arg1);
        class135.field2113 = class213.method1483(arg1, (byte) -101, 0, class287.field4845);
        class175.field2839 = class213.method1483(arg1, (byte) -101, 0, class71.field958);
        class25.field300 = class103.method777(arg1, class143.field2210, 0, false);
        client.field4945 = class103.method777(arg1, class133.field2078, 0, false);
        field4170.method208(client.field4945, (int[]) null);
        class283.field4781.method208(client.field4945, (int[]) null);
        class102.field1588.method208(client.field4945, (int[]) null);
        class100.field1568 = class6.method20((byte) -126, class272.field4580, arg1, 0);
        for (int var3 = 0; var3 < class100.field1568.length; var3++) {
            class100.field1568[var3].method1842();
        }
        class49 var4 = class20.method101(0, class110.field1708, 0, arg1);
        var4.method274();
        class275.field4637 = new class258(var4);
        class49[] var5 = class141.method970((byte) 86, class189.field3034, 0, arg1);
        if (arg0 > -14) {
            field4165 = false;
        }
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method274();
        }
        class57.field745 = new class284[var5.length];
        for (int var7 = 0; var7 < var5.length; var7++) {
            class57.field745[var7] = new class258(var5[var7]);
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class276.field4645.length; var12++) {
            class276.field4645[var12].method271(var8 + var11, var9 + var11, var10 + var11);
        }
        class157.field2494[0].method1840(var8 + var11, var9 + var11, var10 + var11);
        class284.field4819 = new class284[class276.field4645.length];
        for (int var13 = 0; var13 < class276.field4645.length; var13++) {
            class284.field4819[var13] = new class258(class276.field4645[var13]);
        }
    }
}
