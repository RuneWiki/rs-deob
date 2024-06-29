import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class166 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    private int field2739 = 0;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    private int field2744 = -1;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lhi;")
    private class282 field2740 = new class282();

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Z")
    public boolean field2751 = false;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    private int field2741;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[Lrj;")
    private class17[] field2743;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    private int field2737;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[[[I")
    private int[][][] field2738;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
    public static int[] field2749 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1 };

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lhi;")
    public static class282 field2745 = new class282();

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field2754 = 0;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Lcm;")
    public static class185[] field2747;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 17)
    public static void method1247(int arg0) {
        field2745 = null;
        field2749 = null;
        if (arg0 != 4) {
            method1247(-80);
        }
        field2747 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 31)
    public final void method1248(int arg0) {
        int var2 = 0;
        int var3 = -91 % ((-arg0 - 7) / 45);
        while (this.field2737 > var2) {
            this.field2738[var2][0] = null;
            this.field2738[var2][1] = null;
            this.field2738[var2][2] = null;
            this.field2738[var2] = (int[][]) null;
            var2++;
        }
        this.field2743 = null;
        field2742++;
        this.field2738 = (int[][][]) null;
        this.field2740.method1966((byte) 46);
        this.field2740 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)[[[I", line = 55)
    public final int[][][] method1249(int arg0) {
        field2746++;
        if (this.field2741 != this.field2737) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == 1) {
            for (int var2 = 0; var2 < this.field2737; var2++) {
                this.field2743[var2] = class63.field1194;
            }
            return this.field2738;
        } else {
            return (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 81)
    public static final void method1250(int arg0) {
        field2748++;
        int var1 = (class238.field3922 >> 10) + (class196.field3152 >> 3);
        int var2 = (class289.field4841 >> 10) + (class263.field4407 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class265.field4436 = new byte[var6][];
        class5.field70 = new int[var6];
        class109.field1903 = new byte[var6][];
        class118.field2001 = new int[var6];
        class29.field628 = new int[var6];
        class278.field4693 = new int[var6][4];
        class304.field5094 = new int[var6];
        class265.field4438 = new byte[var6][];
        class229.field3783 = new int[var6];
        class139.field2355 = new byte[var6][];
        class272.field4513 = new int[var6];
        class88.field1595 = new byte[var6][];
        int var7 = 0;
        for (int var8 = (var1 - arg0) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class5.field70[var7] = var10;
                class229.field3783[var7] = class172.field2807.method1665(class153.method1192(new class40[] { class178.field2937, class276.method1927((byte) -75, var8), class103.field1805, class276.method1927((byte) -118, var9) }, (byte) -17), (byte) -20);
                class118.field2001[var7] = class172.field2807.method1665(class153.method1192(new class40[] { class253.field4196, class276.method1927((byte) -72, var8), class103.field1805, class276.method1927((byte) -86, var9) }, (byte) 23), (byte) -47);
                class272.field4513[var7] = class172.field2807.method1665(class153.method1192(new class40[] { class174.field2829, class276.method1927((byte) -111, var8), class103.field1805, class276.method1927((byte) -116, var9) }, (byte) -93), (byte) -128);
                class304.field5094[var7] = class172.field2807.method1665(class153.method1192(new class40[] { class71.field1268, class276.method1927((byte) -94, var8), class103.field1805, class276.method1927((byte) -70, var9) }, (byte) 121), (byte) -123);
                class29.field628[var7] = class172.field2807.method1665(class153.method1192(new class40[] { class171.field2799, class276.method1927((byte) -118, var8), class103.field1805, class276.method1927((byte) -119, var9) }, (byte) 23), (byte) -50);
                if (class272.field4513[var7] == -1) {
                    class229.field3783[var7] = -1;
                    class118.field2001[var7] = -1;
                    class304.field5094[var7] = -1;
                    class29.field628[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class272.field4513.length; var11++) {
            class272.field4513[var11] = -1;
            class229.field3783[var11] = -1;
            class118.field2001[var11] = -1;
            class304.field5094[var11] = -1;
            class29.field628[var11] = -1;
        }
        class173.method1273(var2, var1, true, var3, var5, (byte) 126, var4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I", line = 179)
    public final int[][] method1251(int arg0, int arg1) {
        if (arg1 < 118) {
            field2747 = (class185[]) null;
        }
        field2750++;
        if (this.field2741 == this.field2737) {
            this.field2751 = this.field2743[arg0] == null;
            this.field2743[arg0] = class63.field1194;
            return this.field2738[arg0];
        } else if (this.field2737 == 1) {
            this.field2751 = this.field2744 != arg0;
            this.field2744 = arg0;
            return this.field2738[0];
        } else {
            class17 var3 = this.field2743[arg0];
            if (var3 == null) {
                this.field2751 = true;
                if (this.field2739 >= this.field2737) {
                    class17 var4 = (class17) this.field2740.method1970((byte) 76);
                    var3 = new class17(arg0, var4.field260);
                    this.field2743[var4.field261] = null;
                    var4.method2095(0);
                } else {
                    var3 = new class17(arg0, this.field2739);
                    this.field2739++;
                }
                this.field2743[arg0] = var3;
            } else {
                this.field2751 = false;
            }
            this.field2740.method1973(var3, (byte) -48);
            return this.field2738[var3.field260];
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V", line = 270)
    public class166(int arg0, int arg1, int arg2) {
        this.field2741 = arg1;
        this.field2743 = new class17[this.field2741];
        this.field2737 = arg0;
        this.field2738 = new int[this.field2737][3][arg2];
    }
}
