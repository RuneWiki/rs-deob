import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class206 extends class125 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "Lgr;")
    public static class530 field3099 = new class530(25, -1);

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Llc;")
    public static class435 field3105 = new class435(13, 10);

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "F")
    public static float field3108;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILgp;)V", line = 4)
    public class206(int arg0, class549 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsb;", line = 7)
    public static final class91 method1472(Throwable arg0, String arg1) {
        ++field3104;
        class91 var2;
        if (arg0 instanceof class91) {
            var2 = (class91) arg0;
            var2.field1296 = var2.field1296 + ' ' + arg1;
        } else {
            var2 = new class91(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 24)
    public static void method1473(byte arg0) {
        if (arg0 == 70) {
            field3099 = null;
            field3105 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Z)V", line = 36)
    public static final void method1474(String arg0, byte arg1, int arg2, String arg3, boolean arg4) {
        ++field3109;
        class88 var5 = class144.method1008((byte) 94);
        var5.field1260.method2881(class105.field1496.field9838, (byte) 111);
        var5.field1260.method2862(0, -1166933656);
        int var6 = var5.field1260.field6864;
        var5.field1260.method2862(630, -1166933656);
        int[] var7 = class617.method3584(99999999, var5);
        int var8 = var5.field1260.field6864;
        var5.field1260.method2902(arg0, false);
        var5.field1260.method2862(class50.field813, -1166933656);
        var5.field1260.method2902(arg3, false);
        var5.field1260.method2912((byte) 80, class461.field6558);
        var5.field1260.method2881(class45.field748, (byte) 119);
        var5.field1260.method2881(class528.field7683.field4258, (byte) 111);
        class55.method526(var5.field1260, (byte) -49);
        String var9 = class100.field1445;
        int var10 = -35 / (arg1 / 34);
        var5.field1260.method2881(var9 == null ? 0 : 1, (byte) 112);
        if (var9 != null) {
            var5.field1260.method2902(var9, false);
        }
        var5.field1260.method2881(arg2, (byte) 112);
        var5.field1260.method2881(arg4 ? 1 : 0, (byte) 110);
        var5.field1260.field6864 += 7;
        var5.field1260.method2861(-48, var7, var5.field1260.field6864, var8);
        var5.field1260.method2869(-var6 + var5.field1260.field6864, 3);
        class523.method3183(var5, (byte) 31);
        class523.field7602 = 0;
        class306.field4163 = -3;
        class316.field4264 = 0;
        class328.field4452 = 1;
        if (~arg2 > -14) {
            class683.field9702 = true;
            class337.method2078(108);
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(Z)I", line = 87)
    public final int method1475(boolean arg0) {
        ++field3101;
        return arg0 ? -100 : super.field1732;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I", line = 98)
    public final int method158(byte arg0) {
        int var2 = -9 / ((arg0 - -63) / 49);
        ++field3103;
        return !super.field1733.method3308(-99) ? 0 : 1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V", line = 119)
    public final void method157(byte arg0, int arg1) {
        if (arg0 >= -32) {
            method1473((byte) 99);
        }
        super.field1732 = arg1;
        ++field3107;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)I", line = 131)
    public final int method155(boolean arg0, int arg1) {
        ++field3106;
        if (!arg0) {
            field3108 = -1.1791196F;
        }
        return 3;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V", line = 143)
    public final void method156(boolean arg0) {
        if (!arg0) {
            method1472((Throwable) null, (String) null);
        }
        super.field1732 = this.method158((byte) -126);
        ++field3100;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lgp;)V", line = 155)
    public class206(class549 arg0) {
        super(arg0);
    }
}
