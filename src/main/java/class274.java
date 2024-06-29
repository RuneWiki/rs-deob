import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class274 {

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
    public int field3813 = 0;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public int field3807 = 0;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "Z")
    private boolean field3812 = false;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "Lkn;")
    public static class442 field3814 = new class442("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Lkn;")
    public static class442 field3821 = new class442("M", "M", "M", "M");

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "Lwj;")
    public static class224 field3824 = class34.method334((byte) -80);

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public int field3804;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public int field3815;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public int field3816;

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
    private int field3818;

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "J")
    public long field3811;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "Lnq;")
    public static class268 field3825;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image field3823;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cq", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field3826;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
    public static final void method1786(int arg0) {
        field3802++;
        try {
            if (arg0 != 18865) {
                method1789(-118);
            }
            Method var1 = (field3826 == null ? (field3826 = method1791("java.lang.Runtime")) : field3826).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class71.field1038 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BLkh;I)V")
    private final void method1787(byte arg0, class11 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3818 = arg1.method174(255);
        } else if (arg2 == 2) {
            arg1.method172((byte) 52);
        } else if (arg2 == 3) {
            this.field3809 = arg1.method185(25239);
            this.field3819 = arg1.method185(25239);
            this.field3805 = arg1.method185(25239);
        } else if (arg2 == 4) {
            this.field3808 = arg1.method172((byte) 52);
            this.field3816 = arg1.method185(25239);
        } else if (arg2 == 6) {
            this.field3804 = arg1.method172((byte) 52);
        } else if (arg2 == 8) {
            this.field3807 = 1;
        } else if (arg2 == 9) {
            this.field3813 = 1;
        } else if (arg2 == 10) {
            this.field3812 = true;
        }
        if (arg0 == 36) {
            field3817++;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILkh;)V")
    public final void method1788(int arg0, class11 arg1) {
        if (arg0 >= -68) {
            field3820 = -96;
        }
        while (true) {
            int var3 = arg1.method172((byte) 52);
            if (var3 == 0) {
                field3800++;
                return;
            }
            this.method1787((byte) 36, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
    public static void method1789(int arg0) {
        field3825 = null;
        int var1 = 57 / ((arg0 + 79) / 40);
        field3823 = null;
        field3821 = null;
        field3814 = null;
        field3824 = null;
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)V")
    public final void method1790(int arg0) {
        this.field3815 = class133.field1908[this.field3818 << 3];
        int var2 = 65 / ((arg0 - 30) / 61);
        field3806++;
        this.field3801 = (int) Math.sqrt((double) (this.field3819 * this.field3819 + (this.field3809 * this.field3809 + (this.field3805 * this.field3805))));
        if (this.field3816 == 0) {
            this.field3816 = 1;
        }
        if (this.field3808 == 0) {
            this.field3811 = 2147483647L;
        } else if (this.field3808 == 1) {
            this.field3811 = (long) (this.field3801 * 8 / this.field3816);
            this.field3811 *= this.field3811;
        } else if (this.field3808 == 2) {
            this.field3811 = (long) (this.field3801 * 8 / this.field3816);
        }
        if (this.field3812) {
            this.field3801 *= -1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1791(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
