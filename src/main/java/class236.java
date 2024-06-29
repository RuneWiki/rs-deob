import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class236 extends class179 {

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    private int field4025 = 585;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Lke;")
    public static class256 field4029 = class316.method2202("<)4col>", 27626);

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "[S")
    public static short[] field4028 = new short[256];

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "I")
    public static int field4031 = 1;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    public static int field4024 = 0;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "Z")
    public static boolean field4032 = true;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "[Lrd;")
    public static class135[] field4030;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "[Lel;")
    public static class232[] field4027;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILra;I)V", line = 6)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field4022++;
        if (arg0 <= 108) {
            field4028 = (short[]) null;
        }
        if (arg2 == 0) {
            this.field4025 = arg1.method346(-16);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 49)
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I", line = 63)
    public final int[] method41(int arg0, int arg1) {
        field4023++;
        int[] var3 = this.field3157.method1258(-121, arg0);
        if (arg1 != -31598) {
            method1587((byte) -78, 120, 8);
        }
        if (this.field3157.field3081) {
            int var4 = class292.field5049[arg0];
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                int var6 = class290.field5017[var5];
                if (this.field4025 < var6 && var6 < (4096 - this.field4025) && var4 > (2048 - this.field4025) && var4 < (this.field4025 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4025);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field4025 && (this.field4025 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4025;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4025);
                } else if (this.field4025 > var4 || (4096 - this.field4025) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field4025;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4025);
                } else if (this.field4025 <= var6 && (4096 - this.field4025) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4025);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)Lke;", line = 149)
    public static final class256 method1586(int arg0, long arg1) {
        if (arg0 != 32343) {
            return (class256) null;
        }
        field4026++;
        class102.field1837.setTime(new Date(arg1));
        int var3 = class102.field1837.get(7);
        int var4 = class102.field1837.get(5);
        int var5 = class102.field1837.get(2);
        int var6 = class102.field1837.get(1);
        int var7 = class102.field1837.get(11);
        int var8 = class102.field1837.get(12);
        int var9 = class102.field1837.get(13);
        return class30.method214(new class256[] { class29.field397[var3 - 1], class193.field3529, class305.method2125((byte) 95, var4 / 10), class305.method2125((byte) 127, var4 % 10), class300.field5173, class96.field1718[var5], class300.field5173, class305.method2125((byte) 68, var6), class112.field1965, class305.method2125((byte) 125, var7 / 10), class305.method2125((byte) 83, var7 % 10), class260.field4498, class305.method2125((byte) 73, var8 / 10), class305.method2125((byte) 80, var8 % 10), class260.field4498, class305.method2125((byte) 77, var9 / 10), class305.method2125((byte) 50, var9 % 10), class164.field2913 }, arg0 ^ 0xA0F);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BII)V", line = 189)
    public static final void method1587(byte arg0, int arg1, int arg2) {
        class175 var3 = class230.field3934[class255.field4377][arg1][arg2];
        field4033++;
        if (var3 == null) {
            class242.method1624(class255.field4377, arg1, arg2);
            return;
        }
        int var4 = -99999999;
        if (arg0 < 93) {
            method1586(72, 54L);
        }
        class248 var5 = null;
        for (class248 var6 = (class248) var3.method1270((byte) -121); var6 != null; var6 = (class248) var3.method1277(1)) {
            class36 var7 = class254.method1753(var6.field4218.field2508, true);
            int var8 = var7.field576;
            if (var7.field595 == 1) {
                var8 = (var6.field4218.field2503 + 1) * var8;
            }
            if (var4 < var8) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class242.method1624(class255.field4377, arg1, arg2);
            return;
        }
        var3.method1273(19402, var5);
        class248 var9 = (class248) var3.method1270((byte) -121);
        class143 var10 = null;
        class143 var11 = null;
        while (var9 != null) {
            class143 var12 = var9.field4218;
            if (var5.field4218.field2508 != var12.field2508) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field2508 != var12.field2508 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class248) var3.method1277(1);
        }
        long var13 = (long) ((arg2 << 7) + arg1 + 1610612736);
        class9.method59(class255.field4377, arg1, arg2, class297.method2080(arg1 * 128 + 64, 114, class255.field4377, arg2 * 128 + 64), var5.field4218, var13, var11, var10);
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V", line = 264)
    public static void method1588(int arg0) {
        field4028 = null;
        field4027 = null;
        field4029 = null;
        field4030 = null;
        if (arg0 != 64) {
            field4024 = 2;
        }
    }
}
