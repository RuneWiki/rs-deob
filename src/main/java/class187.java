import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class187 extends class286 implements class68 {

    @OriginalMember(owner = "client!je", name = "E", descriptor = "Z")
    private boolean field2893 = false;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    private int field2886 = 50;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Lhc;")
    private class235 field2897;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "Lhc;")
    private class235 field2896;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Luk;")
    private class100 field2887;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Luk;")
    private class100 field2895;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Lam;")
    public static class180 field2892 = new class180();

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2902 = "M";

    @OriginalMember(owner = "client!je", name = "R", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "[[[I")
    public static int[][][] field2899;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
    public final boolean method496(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method498(40, true, 100, 106, -0.3845663F);
        }
        field2885++;
        return !this.method1879(arg0 ^ 0x1FF, arg1).field2464;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZIIF)Ljb;")
    public final class276 method498(int arg0, boolean arg1, int arg2, int arg3, float arg4) {
        class226 var6 = this.method1266(255, arg0);
        field2891++;
        if (arg2 > -93) {
            this.field2895 = null;
        }
        if (var6 != null && var6.method1504(this, this.field2897)) {
            return arg1 ? var6.field3449.method881(this, -54, (double) arg4, arg3, false, this.field2897, arg3) : var6.field3449.method878(arg3, this, (double) arg4, false, (byte) -125, arg3, this.field2897);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
    public final void method1261(byte arg0) {
        this.field2887.method738((byte) -123);
        if (arg0 != 75) {
            this.field2893 = true;
        }
        field2905++;
        if (this.field2895 != null) {
            this.field2895.method738((byte) -126);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field2899 = null;
        if (arg0 < 97) {
            field2907 = 36;
        }
        field2892 = null;
        field2902 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lhc;Lhc;Lhc;IZ)V")
    public class187(class235 arg0, class235 arg1, class235 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2893 = arg4;
        this.field2897 = arg2;
        this.field2896 = arg0;
        this.field2886 = arg3;
        this.field2887 = new class100(this.field2886);
        this.field2895 = null;
    }

    @OriginalMember(owner = "client!je", name = "g", descriptor = "(II)Lgf;")
    public final class126 method1263(int arg0, int arg1) {
        field2894++;
        class226 var3 = this.method1266(255, arg0);
        if (arg1 <= 7) {
            this.method1267((byte) 47, true);
        }
        return var3 == null ? null : var3.field3449;
    }

    @OriginalMember(owner = "client!je", name = "h", descriptor = "(II)Lm;")
    public static final class118 method1264(int arg0, int arg1) {
        field2904++;
        class118 var2 = (class118) class271.field4344.method1887(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class264.field4190.method1590(arg0, (byte) -25, 30);
        class118 var4 = new class118();
        if (var3 != null) {
            var4.method828(arg0, arg1 ^ 0x43, new class88(var3));
        }
        class271.field4344.method1886(-81, (long) arg0, var4);
        if (arg1 != 64) {
            method1264(-42, 85);
        }
        return var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(FII)[I")
    public final int[] method495(float arg0, int arg1, int arg2) {
        field2889++;
        class226 var4 = this.method1266(255, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field3452 = true;
            return arg2 == 50 ? var4.method1505(this, this.field2897, arg0, this.field2893 || this.method1879(256, arg1).field2472) : null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Z")
    public final boolean method499(byte arg0, int arg1) {
        if (arg0 == -114) {
            field2890++;
            return this.method1879(256, arg1).field2474;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ZI)V")
    public final void method1265(boolean arg0, int arg1) {
        for (class226 var3 = (class226) this.field2887.method731((byte) -122); var3 != null; var3 = (class226) this.field2887.method736(true)) {
            if (var3.field3452) {
                var3.method1506(arg1);
                var3.field3452 = false;
            }
        }
        field2903++;
        if (!arg0) {
            field2902 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "i", descriptor = "(II)Log;")
    private final class226 method1266(int arg0, int arg1) {
        field2900++;
        class226 var3 = (class226) this.field2887.method728((long) arg1, (byte) -52);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2896.method1590(0, (byte) -25, arg1);
        if (var4 == null) {
            return null;
        }
        class226 var5 = new class226(new class88(var4));
        this.field2887.method737((long) arg1, 0, var5);
        if (arg0 != 255) {
            this.method499((byte) 122, 126);
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)V")
    public final void method1267(byte arg0, boolean arg1) {
        if (arg0 >= -75) {
            this.method500(-65, -43);
        }
        field2888++;
        this.field2893 = arg1;
        this.method1261((byte) 75);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)I")
    public final int method497(int arg0, byte arg1) {
        if (arg1 != -74) {
            this.method1266(78, -21);
        }
        field2901++;
        return this.method1879(256, arg0).field2465 & 0xFFFF;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)Z")
    public final boolean method500(int arg0, int arg1) {
        field2884++;
        if (this.field2893 || this.method1879(256, arg0).field2472) {
            return true;
        } else {
            return arg1 != -17014;
        }
    }
}
