import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class540 {

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "Ljn;")
    private class117 field7928 = new class117(256);

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "Lvo;")
    private class345 field7938;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "Z")
    public static boolean field7937 = false;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public static int field7926 = 0;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "[I")
    public static int[] field7936 = new int[6];

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public static int field7930 = 52;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "[I")
    public static int[] field7939 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V", line = 9)
    public final void method3176(byte arg0) {
        field7927++;
        class117 var2 = this.field7928;
        synchronized (this.field7928) {
            if (arg0 <= -125) {
                this.field7928.method950((byte) 84);
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZII)I", line = 22)
    public static final int method3177(boolean arg0, int arg1, int arg2) {
        field7935++;
        if (arg1 == 1 || arg1 == 3) {
            return class98.field1455[arg2 & 0x3];
        } else {
            if (arg0) {
                method3178(116, 56, 87, -103);
            }
            return class472.field6787[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)I", line = 38)
    public static final int method3178(int arg0, int arg1, int arg2, int arg3) {
        field7934++;
        if (class238.field3515 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class161.field2628;
        int var7 = arg2 - class161.field2636;
        for (class66 var8 = (class66) class161.field2621.method3905(-124); var8 != null; var8 = (class66) class161.field2621.method3899(0)) {
            if (var8.field954 == arg0) {
                int var9 = var8.field951;
                int var10 = var8.field952;
                int var11 = var9 + class161.field2628 << 14 | class161.field2636 + var10;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        if (arg1 >= -89) {
            return -113;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V", line = 89)
    public static void method3179(boolean arg0) {
        field7936 = null;
        if (!arg0) {
            field7931 = 46;
        }
        field7939 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BI)V", line = 104)
    public final void method3180(byte arg0, int arg1) {
        field7929++;
        if (arg0 <= 8) {
            method3179(false);
        }
        class117 var3 = this.field7928;
        synchronized (this.field7928) {
            this.field7928.method939(28093, arg1);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IB)Loaa;", line = 127)
    public final class500 method3181(int arg0, byte arg1) {
        field7933++;
        class117 var3 = this.field7928;
        class500 var4;
        synchronized (this.field7928) {
            var4 = (class500) this.field7928.method941((long) arg0, arg1 + 3);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field7938;
        byte[] var6;
        synchronized (this.field7938) {
            var6 = this.field7938.method2081(arg1 + 36, arg0, 26);
        }
        class500 var7 = new class500();
        if (arg1 != -3) {
            return null;
        }
        if (var6 != null) {
            var7.method2991((byte) 54, new class465(var6));
        }
        class117 var8 = this.field7928;
        synchronized (this.field7928) {
            this.field7928.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 178)
    public class540(class529 arg0, int arg1, class345 arg2) {
        this.field7938 = arg2;
        this.field7938.method2098(0, 26);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 166)
    public final void method3182(int arg0) {
        class117 var2 = this.field7928;
        synchronized (this.field7928) {
            if (arg0 != -1980356210) {
                field7931 = -90;
            }
            this.field7928.method936(arg0 ^ 0x7609D654);
        }
        field7932++;
    }
}
