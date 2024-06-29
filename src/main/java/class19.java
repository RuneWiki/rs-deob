import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class19 extends class424 {

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    private int field251 = 3216;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "[I")
    private int[] field248 = new int[3];

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
    private int field253 = 4096;

    @OriginalMember(owner = "client!ko", name = "cb", descriptor = "I")
    private int field263 = 3216;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field255 = null;

    @OriginalMember(owner = "client!ko", name = "ab", descriptor = "I")
    public static int field261 = -1;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ko", name = "Y", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ko", name = "Z", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ko", name = "X", descriptor = "Lpn;")
    public static class66 field258;

    @OriginalMember(owner = "client!ko", name = "db", descriptor = "Lwn;")
    public static class77 field264;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V")
    private final void method111(byte arg0) {
        ++field250;
        if (arg0 < 7) {
            this.method113(-108);
        }
        double var2 = Math.cos((double) ((float) this.field263 / 4096.0F));
        this.field248[0] = (int) (4096.0D * Math.sin((double) ((float) this.field251 / 4096.0F)) * var2);
        this.field248[1] = (int) (Math.cos((double) ((float) this.field251 / 4096.0F)) * var2 * 4096.0D);
        this.field248[2] = (int) (4096.0D * Math.sin((double) ((float) this.field263 / 4096.0F)));
        int var4 = this.field248[0] * this.field248[0] >> 12;
        int var5 = this.field248[1] * this.field248[1] >> 12;
        int var6 = this.field248[2] * this.field248[2] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
        if (~var7 != -1) {
            this.field248[2] = (this.field248[2] << 12) / var7;
            this.field248[0] = (this.field248[0] << 12) / var7;
            this.field248[1] = (this.field248[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field247;
        int[] var3 = super.field5892.method783(arg0, (byte) -108);
        if (arg1 != -10) {
            this.method43(-84, (byte) -2);
        }
        if (super.field5892.field1427) {
            int var4 = class362.field4991 * this.field253 >> 12;
            int[] var5 = this.method2621(0, arg1 ^ 127, class174.field2484 & arg0 + -1);
            int[] var6 = this.method2621(0, arg1 + -108, arg0);
            int[] var7 = this.method2621(0, arg1 + -110, arg0 - -1 & class174.field2484);
            for (int var8 = 0; class303.field4135 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class65.field898] - var6[class65.field898 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class92.field1289[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field248[2] * var15 >> 12;
                int var18 = this.field248[0] * var14 >> 12;
                int var19 = this.field248[1] * var16 >> 12;
                var3[var8] = var18 - (-var19 - var17);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
    public static final void method112(int arg0) {
        class408 var1 = class55.field711;
        synchronized (class55.field711) {
            class55.field711.method2522((byte) 123);
        }
        ++field254;
        class408 var2 = class422.field5838;
        synchronized (class422.field5838) {
            class422.field5838.method2522((byte) 20);
        }
        int var3 = -99 % ((arg0 - -75) / 51);
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class19() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.method111((byte) 84);
        if (arg0 != 3) {
            method114(-109);
        }
        ++field260;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field263 = arg0.method2297(arg1 + 13400);
                }
            } else {
                this.field251 = arg0.method2297(arg1 ^ -13320);
            }
        } else {
            this.field253 = arg0.method2297(13352);
        }
        if (arg1 != -48) {
            this.method111((byte) 84);
        }
        ++field257;
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V")
    public static final void method114(int arg0) {
        class310.field4205 = -3;
        class446.field6258 = 1;
        class301.field4114 = 0;
        class93.field1294 = -1;
        class251.field3502 = false;
        ++field262;
        class302.field4119 = 0;
        class140.field2040 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V")
    public static void method115(byte arg0) {
        int var1 = -70 % (-arg0 / 55);
        field255 = null;
        field258 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 == 61) {
            ++field256;
            if (arg1 >= 1 && ~arg4 <= -2 && ~arg1 >= ~(class11.field107 + -2) && ~(class264.field3620 + -2) <= ~arg4) {
                if (!class397.method2461(-113) && !class227.method1483(-21801, arg6, arg1, class367.field5096, arg4)) {
                    return;
                }
                if (class341.field4617 == null) {
                    return;
                }
                int var9 = arg6;
                if (~arg6 > -4 && class21.method120((byte) 59, arg1, arg4)) {
                    var9 = arg6 + 1;
                }
                class32.method298(class403.field5567[arg6], var9, class354.field4765, arg6, arg3, -10581, arg4, arg1);
                if (~arg0 <= -1) {
                    boolean var10 = class441.field6201;
                    class441.field6201 = true;
                    class405.method2499(class403.field5567[arg6], arg4, arg2, 5000, arg0, var9, false, arg7, arg6, arg8, arg1, class354.field4765, false);
                    class441.field6201 = var10;
                    return;
                }
            }
        }
    }
}
