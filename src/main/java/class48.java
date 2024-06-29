import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class48 extends class224 {

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    private int field585 = 3216;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    private int field584 = 3216;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    private int field592 = 4096;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "[I")
    private int[] field597 = new int[3];

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "Lkb;")
    public static class80 field590 = new class80(512);

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    public static int field593 = 255;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
    public static int field595 = 0;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    public static int field596 = 0;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Luf;I)V", line = 12)
    public static final void method257(class168 arg0, int arg1) {
        field588++;
        class45.field553 = arg0;
        if (class51.field622.field1000 == null) {
            return;
        }
        try {
            class168 var2 = class24.field288.method1220(class51.field622.field1000, false);
            class168 var3 = class131.field2032.method1220(class51.field622.field1000, false);
            class168 var4 = class134.method938((byte) -124, new class168[] { var2, class106.field1633, arg0, class254.field4346, var3 });
            class168 var5;
            if (arg1 == arg0.method1167(false)) {
                var5 = class134.method938((byte) -123, new class168[] { var4, class244.field4143 });
            } else {
                var5 = class134.method938((byte) -126, new class168[] { var4, class231.field3721, class148.method1018(10, class194.method1368((byte) 38) + 94608000000L), class201.field3304, class73.method410(10, 94608000L) });
            }
            class134.method938((byte) -125, new class168[] { class141.field2186, var5, class61.field791 }).method1178(-47, class51.field622.field1000);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 43)
    public static final void method258(byte arg0, Component arg1) {
        field587++;
        Method var2 = class75.field1008;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 >= -7) {
            method261(10);
        }
        arg1.addKeyListener(class55.field704);
        arg1.addFocusListener(class55.field704);
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 66)
    private final void method259(int arg0) {
        field591++;
        double var2 = Math.cos((double) ((float) this.field584 / 4096.0F));
        this.field597[arg0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field585 / 4096.0F)));
        this.field597[1] = (int) (var2 * Math.cos((double) ((float) this.field585 / 4096.0F)) * 4096.0D);
        this.field597[2] = (int) (Math.sin((double) ((float) this.field584 / 4096.0F)) * 4096.0D);
        int var4 = this.field597[1] * this.field597[1] >> 12;
        int var5 = this.field597[0] * this.field597[0] >> 12;
        int var6 = this.field597[2] * this.field597[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var4 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field597[1] = (this.field597[1] << 12) / var7;
            this.field597[0] = (this.field597[0] << 12) / var7;
            this.field597[2] = (this.field597[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(BI)I", line = 93)
    public static final int method260(byte arg0, int arg1) {
        if (arg0 != 28) {
            field596 = 21;
        }
        field583++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[I", line = 112)
    public final int[] method18(byte arg0, int arg1) {
        int[] var3 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            int var4 = class259.field4395 * this.field592 >> 12;
            int[] var5 = this.method1537(arg1 - 1 & class169.field2777, 0, 0);
            int[] var6 = this.method1537(arg1, 0, 0);
            int[] var7 = this.method1537(class169.field2777 & arg1 + 1, 0, 0);
            for (int var8 = 0; var8 < class187.field2961; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class205.field3363 & var8 - 1] - var6[class205.field3363 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class231.field3716[var11 + ((var12 + 1) * var12 >> 1)] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field597[0] * var15 >> 12;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field597[2] * var14 >> 12;
                int var19 = this.field597[1] * var17 >> 12;
                var3[var8] = var16 + var18 + var19;
            }
        }
        field586++;
        int var20 = 89 / ((arg0 - 20) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLj;)V", line = 186)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field592 = arg2.method1069(98);
        } else if (arg0 == 1) {
            this.field585 = arg2.method1069(34);
        } else if (arg0 == 2) {
            this.field584 = arg2.method1069(118);
        }
        if (arg1) {
            field595 = 0;
        }
        field589++;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V", line = 220)
    public static void method261(int arg0) {
        field590 = null;
        if (arg0 != 11312) {
            field596 = 100;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 229)
    public class48() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 244)
    public final void method80(boolean arg0) {
        if (arg0) {
            this.method259(82);
        }
        field582++;
        this.method259(0);
    }
}
