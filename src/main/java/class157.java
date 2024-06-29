import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class157 extends class53 {

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    private int field2690 = 585;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field2692 = 2;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
    public static int[] field2696 = new int[256];

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lwa;")
    public static class75 field2695 = class66.method560("logo", false);

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field2699 = 0;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "[I")
    public static int[] field2698 = new int[100];

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2693 = 0;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2688 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 7)
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILja;Z)V", line = 17)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            field2697 = 41;
        }
        if (arg0 == 0) {
            this.field2690 = arg1.method485((byte) -2);
        }
        field2687++;
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)V", line = 44)
    public static void method1189(int arg0) {
        field2698 = null;
        field2695 = null;
        field2696 = null;
        int var1 = -29 / ((-arg0 - 35) / 62);
        field2688 = null;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[I", line = 67)
    public final int[] method59(int arg0, int arg1) {
        field2694++;
        int[] var3 = this.field878.method1603(arg1, (byte) 116);
        if (arg0 != -15196) {
            method1190((class194) null, (byte) -123);
        }
        if (this.field878.field3749) {
            int var4 = class50.field814[arg1];
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                int var6 = class67.field1178[var5];
                if (this.field2690 < var6 && var6 < 4096 - this.field2690 && var4 > (2048 - this.field2690) && var4 < (this.field2690 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2690);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field2690) && var6 < this.field2690 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2690;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2690);
                } else if (var4 < this.field2690 || 4096 - this.field2690 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2690;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2690);
                } else if (this.field2690 <= var6 && var6 <= 4096 - this.field2690) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field2690);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lah;B)V", line = 154)
    public static final void method1190(class194 arg0, byte arg1) {
        if (arg1 != -14) {
            method1189(44);
        }
        field2691++;
        int var2 = arg0.field3249 - class143.field2463;
        int var3 = arg0.field3239 * 128 + (arg0.method739(0) * 64);
        int var4 = arg0.field3207 * 128 + (arg0.method739(0) * 64);
        arg0.field3231 = 0;
        arg0.field3218 += (var4 - arg0.field3218) / var2;
        arg0.field3259 += (var3 - arg0.field3259) / var2;
        if (arg0.field3258 == 0) {
            arg0.field3206 = 1024;
        }
        if (arg0.field3258 == 1) {
            arg0.field3206 = 1536;
        }
        if (arg0.field3258 == 2) {
            arg0.field3206 = 0;
        }
        if (arg0.field3258 == 3) {
            arg0.field3206 = 512;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 192)
    public static final void method1191(Component arg0, byte arg1) {
        arg0.removeMouseListener(class263.field4546);
        field2686++;
        int var2 = -75 / ((arg1 - 57) / 57);
        arg0.removeMouseMotionListener(class263.field4546);
        arg0.removeFocusListener(class263.field4546);
        class34.field494 = 0;
    }
}
