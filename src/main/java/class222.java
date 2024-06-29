import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class222 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[Lcl;")
    public static class132[] field3515 = new class132[14];

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "J")
    public static long field3514 = 0L;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
    public static int[] field3519 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 4)
    public static void method1482(byte arg0) {
        field3519 = null;
        field3515 = null;
        if (arg0 != -115) {
            field3519 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Lec;", line = 33)
    public static final class39 method1483(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field879; var4++) {
            class39 var5 = var3.field877[var4];
            if ((var5.field656 >> 29 & 0x3L) == 2L && var5.field637 == arg1 && var5.field630 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(III)V", line = 55)
    public class222(int arg0, int arg1, int arg2) {
        this.field3516 = arg1;
        this.field3518 = arg2;
        this.field3513 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I", line = 67)
    public static final int method1484(int arg0, int arg1) {
        field3512++;
        if (arg1 <= 13) {
            field3519 = (int[]) null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lna;I)V", line = 78)
    public static final void method1485(class26 arg0, int arg1) {
        field3520++;
        if (arg1 != 0) {
            return;
        }
        for (class66 var2 = (class66) class287.field4796.method264(arg1 ^ 0xFFFFFFD9); var2 != null; var2 = (class66) class287.field4796.method263(arg1 ^ 0x4)) {
            if (var2.field1047.method159((byte) -42, arg0)) {
                class82.field1328 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBII)V", line = 103)
    public static final void method1486(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field3522++;
        if (arg2 != -40) {
            field3517 = 43;
        }
        for (int var5 = 0; var5 < class66.field1041; var5++) {
            if ((class53.field827[var5] + class27.field457[var5]) > arg0 && (arg0 + arg1) > class53.field827[var5] && arg3 < (class241.field3931[var5] + class159.field2475[var5]) && class159.field2475[var5] < arg3 + arg4) {
                class2.field21[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
    public abstract void method307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZI)V")
    public abstract void method305(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)V")
    public abstract void method303(int arg0, int arg1, int arg2);
}
