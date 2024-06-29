import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class104 extends class179 {

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "[I")
    private int[] field1848 = new int[3];

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    private int field1851 = 3216;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    private int field1855 = 3216;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    private int field1860 = 4096;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public static int field1852 = -1;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "Lke;")
    public static class256 field1858 = class316.method2202("Okay", 27626);

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field1857 = 5063219;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "Lke;")
    public static class256 field1853 = class316.method2202("Titelbild geladen)3", 27626);

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lke;")
    public static class256 field1863 = class316.method2202(": ", 27626);

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "Lng;")
    public static class138 field1854;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "[I")
    public static int[] field1856;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method742(boolean arg0, int arg1) {
        if (arg1 != -15214) {
            return;
        }
        field1847++;
        if (arg0) {
            if (class211.field3803 != -1) {
                class91.method677(arg1 ^ 0xFFFFC7C4, class211.field3803);
            }
            for (class316 var2 = (class316) class62.field1098.method1743(true); var2 != null; var2 = (class316) class62.field1098.method1742((byte) 21)) {
                class287.method2006(var2, true, 30656);
            }
            class211.field3803 = -1;
            class62.field1098 = new class254(8);
            class153.method1148((byte) 45);
            class211.field3803 = class66.field1175;
            class159.method1177(false, -1);
            class301.method2105(arg1 + 15285);
            class269.method1859(class211.field3803, (byte) 111);
        }
        class159.field2841 = -1;
        class74.method558(15, class30.field461);
        class121.field2124 = new class144();
        class121.field2124.field1197 = 3000;
        class121.field2124.field1192 = 3000;
        if (!class253.field4323) {
            class301.method2104(class153.field2743, false);
            class11.method67((byte) 74, 10);
            return;
        }
        if (class192.field3510 == 2) {
            class50.field926 = class48.field872 << 7;
            class72.field1319 = class288.field4984 << 7;
        } else {
            class96.method693((byte) -119);
        }
        class34.method240((byte) -104);
        class107.method761((byte) -105);
        class11.method67((byte) 74, 28);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILra;I)V", line = 82)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1860 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field1855 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field1851 = arg1.method346(-16);
        }
        if (arg0 <= 108) {
            this.method54(-74, (class41) null, -123);
        }
        field1861++;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 117)
    public class104() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 127)
    private final void method743(boolean arg0) {
        field1865++;
        double var2 = Math.cos((double) ((float) this.field1851 / 4096.0F));
        this.field1848[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field1855 / 4096.0F)));
        this.field1848[1] = (int) (var2 * Math.cos((double) ((float) this.field1855 / 4096.0F)) * 4096.0D);
        this.field1848[2] = (int) (Math.sin((double) ((float) this.field1851 / 4096.0F)) * 4096.0D);
        int var4 = this.field1848[0] * this.field1848[0] >> 12;
        int var5 = this.field1848[1] * this.field1848[1] >> 12;
        int var6 = this.field1848[2] * this.field1848[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1848[2] = (this.field1848[2] << 12) / var7;
            this.field1848[1] = (this.field1848[1] << 12) / var7;
            this.field1848[0] = (this.field1848[0] << 12) / var7;
        }
        if (!arg0) {
            this.method418((byte) -75);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 173)
    public final void method418(byte arg0) {
        if (arg0 != -110) {
            this.field1851 = -32;
        }
        field1849++;
        this.method743(true);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 188)
    public static void method744(byte arg0) {
        field1854 = null;
        int var1 = 45 / ((arg0 + 37) / 61);
        field1853 = null;
        field1863 = null;
        field1856 = null;
        field1858 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I", line = 206)
    public final int[] method41(int arg0, int arg1) {
        if (arg1 != -31598) {
            field1856 = (int[]) null;
        }
        field1859++;
        int[] var3 = this.field3157.method1258(-67, arg0);
        if (this.field3157.field3081) {
            int var4 = class159.field2836 * this.field1860 >> 12;
            int[] var5 = this.method1312(0, arg0 - 1 & class19.field255, (byte) 122);
            int[] var6 = this.method1312(0, arg0, (byte) 127);
            int[] var7 = this.method1312(0, class19.field255 & arg0 + 1, (byte) 117);
            for (int var8 = 0; var8 < class161.field2858; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class285.field4945] - var6[var8 + 1 & class285.field4945]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class216.field3849[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field1848[0] * var16 >> 12;
                int var18 = this.field1848[2] * var15 >> 12;
                int var19 = this.field1848[1] * var14 >> 12;
                var3[var8] = var17 + var19 + var18;
            }
        }
        return var3;
    }
}
