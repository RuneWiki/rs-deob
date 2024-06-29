import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class524 extends class265 {

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    private int field7697;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    private int field7699;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    private int field7694;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    private int field7698;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    private int field7695;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "Lfd;")
    private class365 field7702;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    private int field7692;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "Lsl;")
    public static class318 field7701 = new class318(52, -1);

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "[[F")
    public static float[][] field7703 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public static int field7704 = 0;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "Lim;")
    private class401 field7700;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public static final void method3110(int arg0) {
        field7696++;
        int var1 = class478.field7044.method2069(class65.field802, 28);
        if (arg0 == var1) {
            class232.field3411 = null;
            class224.method1528(0, true);
        } else if (var1 == 1) {
            class340.method2071(-93, (byte) 0);
            class224.method1528(512, true);
            if (class238.field3497 != null) {
                class436.method2643(-29238);
            }
        } else {
            class340.method2071(arg0 ^ 0xFFFFFF8B, (byte) (class50.field551 - 4 & 0xFF));
            class224.method1528(2, true);
        }
        class47.field513 = class525.field7714;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Lim;")
    public final class401 method1708(int arg0) {
        if (arg0 != 2) {
            return null;
        }
        field7693++;
        if (this.field7700 == null) {
            class277 var2 = this.field7702.field425;
            class380.field5617[2] = this.field7695;
            class380.field5617[5] = this.field7694;
            class380.field5617[0] = this.field7698;
            class380.field5617[4] = this.field7699;
            class380.field5617[1] = this.field7692;
            class380.field5617[3] = this.field7697;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1776(class380.field5617[var5], 19378)) {
                    return null;
                }
                class104 var7 = var2.method1780(arg0 - 31307, class380.field5617[var5]);
                int var8 = var7.field1435 ? 64 : 128;
                if (var7.field1449 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class318.field4515[var6] = var2.method1777(false, 5754, class380.field5617[var6], 1.0F, var4, var4);
            }
            this.field7700 = new class401(this.field7702, 6407, var4, var3, class318.field4515);
        }
        return this.field7700;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V")
    public static void method3111(int arg0) {
        field7703 = null;
        if (arg0 != -4) {
            field7704 = -57;
        }
        field7701 = null;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lfd;IIIIII)V")
    public class524(class365 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7697 = arg4;
        this.field7699 = arg5;
        this.field7694 = arg6;
        this.field7698 = arg1;
        this.field7695 = arg3;
        this.field7702 = arg0;
        this.field7692 = arg2;
    }
}
