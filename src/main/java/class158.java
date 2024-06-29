import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class158 extends InputStream {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Llc;")
    public static class143 field2853 = null;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field2858 = new int[2];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field2853 = null;
        field2858 = null;
        if (arg0 != 64) {
            field2853 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZII)V")
    public static final void method1036(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class289.method1927(class15.field268[arg4], arg1, arg3 - arg0, -62, arg3 - -arg0);
        int var5 = 0;
        field2855++;
        if (arg2) {
            return;
        }
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class15.field268[arg4 - var6];
                int var10 = arg3 - var5;
                int[] var11 = class15.field268[arg4 + var6];
                int var12 = arg3 + var5;
                class289.method1927(var11, arg1, var10, -104, var12);
                class289.method1927(var9, arg1, var10, -119, var12);
            }
            int var13 = arg3 - var6;
            int var14 = arg3 + var6;
            int[] var15 = class15.field268[arg4 - var5];
            int[] var16 = class15.field268[arg4 + var5];
            class289.method1927(var16, arg1, var13, -94, var14);
            class289.method1927(var15, arg1, var13, -60, var14);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method1037(byte arg0) {
        if (!class139.field2415) {
            class257.field4625 = 1;
            if (class112.field1974 != 0) {
                class251.field4522 = class87.field1590;
                class12.field233 = class159.field2874;
            } else if (class92.field1653 == 0) {
                class12.field233 = field2859;
                class251.field4522 = class235.field4292;
            } else {
                class12.field233 = class67.field1279;
                class251.field4522 = class31.field499;
            }
            class132.field2319[0] = class234.field4264;
            class122.field2147[0] = 1004;
            class136.field2382[0] = class21.field342;
        }
        field2856++;
        class125.method760((long) class146.field2635);
        if (class7.field138 != -1) {
            class147.method946(class7.field138, 54);
        }
        for (int var1 = 0; var1 < class128.field2260; var1++) {
            if (class69.field1323[var1]) {
                class136.field2384[var1] = true;
            }
            class136.field2391[var1] = class69.field1323[var1];
            class69.field1323[var1] = false;
        }
        if (arg0 != 58) {
            field2854 = -72;
        }
        class190.field3471 = null;
        class272.field4856 = null;
        class195.field3614 = -1;
        class18.field320 = -1;
        class248.field4448 = class146.field2635;
        if (class7.field138 != -1) {
            class128.field2260 = 0;
            class101.method601(0, class269.field4820, 0, -1, 0, 105, class7.field138, 0, class10.field222);
        }
        class260.method1720();
        class259.method1710((byte) 74);
        if (class139.field2415) {
            class173.method1145(3);
        } else if (class272.field4856 != null) {
            class206.method1425(class75.field1398, (byte) -127, class165.field2964, class272.field4856);
        } else if (class18.field320 != -1) {
            class206.method1425(class195.field3614, (byte) -127, class18.field320, (class43) null);
        }
        if (class57.field1109 == 3) {
            for (int var2 = 0; var2 < class128.field2260; var2++) {
                if (class136.field2391[var2]) {
                    class260.method1728(class255.field4572[var2], class176.field3151[var2], class133.field2330[var2], class237.field4306[var2], 16711935, 128);
                } else if (class136.field2384[var2]) {
                    class260.method1728(class255.field4572[var2], class176.field3151[var2], class133.field2330[var2], class237.field4306[var2], 16711680, 128);
                }
            }
        }
        class119.method734(class229.field4195.field4178, class229.field4195.field4108, class128.field2252, class170.field3044, (byte) -52);
        class128.field2252 = 0;
    }

    @OriginalMember(owner = "client!mc", name = "read", descriptor = "()I")
    public final int read() {
        field2861++;
        class61.method347(30000L, 1);
        return -1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIBIII)V")
    public static final void method1038(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var6 = 35 % ((arg2 - 37) / 36);
        class52.field1022 = arg5;
        class206.field3751 = arg1;
        field2862++;
        class53.field1034 = arg0;
        class240.field4335 = arg4;
        class218.field3985 = arg3;
        if (class240.field4335 >= 100) {
            int var7 = class206.field3751 * 128 + 64;
            int var8 = class218.field3985 * 128 + 64;
            int var9 = class20.method140(var7, 125, var8, class170.field3044) - class53.field1034;
            int var10 = var7 - class167.field2992;
            int var11 = var8 - class154.field2776;
            int var12 = var9 - class92.field1658;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class163.field2925 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
            class148.field2729 = (int) (-325.949D * Math.atan2((double) var10, (double) var11)) & 0x7FF;
            if (class163.field2925 < 128) {
                class163.field2925 = 128;
            }
            if (class163.field2925 > 383) {
                class163.field2925 = 383;
            }
        }
        class21.field349 = 2;
    }
}
