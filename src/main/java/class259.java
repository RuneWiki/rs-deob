import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class259 extends class511 {

    @OriginalMember(owner = "client!cca", name = "s", descriptor = "Loga;")
    public class498 field3823;

    @OriginalMember(owner = "client!cca", name = "l", descriptor = "I")
    public static int field3816 = 50;

    @OriginalMember(owner = "client!cca", name = "m", descriptor = "[I")
    public static int[] field3817 = new int[field3816];

    @OriginalMember(owner = "client!cca", name = "n", descriptor = "[I")
    public static int[] field3818 = new int[field3816];

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "[I")
    public static int[] field3812 = new int[field3816];

    @OriginalMember(owner = "client!cca", name = "k", descriptor = "[I")
    public static int[] field3815 = new int[field3816];

    @OriginalMember(owner = "client!cca", name = "o", descriptor = "[I")
    public static int[] field3819 = new int[field3816];

    @OriginalMember(owner = "client!cca", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3821 = new String[field3816];

    @OriginalMember(owner = "client!cca", name = "j", descriptor = "[I")
    public static int[] field3814 = new int[field3816];

    @OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!cca", name = "p", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!cca", name = "g", descriptor = "Lhs;")
    public static class344 field3811;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
    public static void method1687(byte arg0) {
        field3817 = null;
        field3811 = null;
        field3812 = null;
        field3818 = null;
        field3814 = null;
        field3821 = null;
        field3815 = null;
        if (arg0 >= 25) {
            field3819 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)V")
    public static final void method1688(byte arg0) {
        int var1 = 43 % ((arg0 - 30) / 58);
        for (int var2 = 0; var2 < class235.field3545; var2++) {
            int var3 = class216.field3356[var2];
            class205 var4 = (class205) class645.field9014.method2242((long) var3, -1);
            if (var4 != null) {
                class665 var5 = var4.field3181;
                class724.method4062(76, var5.field9240.field1635, var5);
            }
        }
        field3813++;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLso;)Lgi;")
    public static final class706 method1689(byte arg0, class494 arg1) {
        field3822++;
        class97 var2 = class391.method2424((byte) -40)[arg1.method2964((byte) 82)];
        class463 var3 = class670.method3807((byte) 80)[arg1.method2964((byte) 50)];
        int var4 = arg1.method2988(arg0 - 7);
        int var5 = arg1.method2988(-3);
        int var6 = arg1.method2998(true);
        if (arg0 != 4) {
            method1688((byte) 63);
        }
        int var7 = arg1.method2998(true);
        int var8 = arg1.method2988(-3);
        int var9 = arg1.method2976(-128);
        int var10 = arg1.method2976(arg0 ^ 0xFFFFFF87);
        return new class706(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
    public static final void method1690(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class393.method2434(var3.field592);
        class393.method2434(var3.field581);
        if (var3.field592 != null) {
            var3.field592 = null;
        }
        if (var3.field581 != null) {
            var3.field581 = null;
        }
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lpj;II[B)V")
    public class259(class156 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3823 = arg0.method1141(arg1, arg2, arg3, false, false, class88.field993);
        this.field3823.method2021(false, false, (byte) 23);
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lpj;II[I)V")
    public class259(class156 arg0, int arg1, int arg2, int[] arg3) {
        this.field3823 = arg0.method1093((byte) 112, false, arg2, arg3, arg1);
        this.field3823.method2021(false, false, (byte) 23);
    }
}
