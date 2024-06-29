import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class571 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lst;")
    private class366 field7863 = new class366();

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    private int field7868;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    private int field7860;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Ldea;")
    private class205 field7878;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "J")
    public static long field7873 = 0L;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Ldk;")
    public static class435 field7865 = new class435(1);

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Z")
    public static boolean field7879 = true;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Ljava/lang/Object;")
    public static Object field7880;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JI)V")
    private final void method3238(long arg0, int arg1) {
        if (arg1 <= 45) {
            this.method3238(62L, 69);
        }
        field7870++;
        class371 var4 = (class371) this.field7878.method1242(0, arg0);
        this.method3240(-85, var4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
    public final int method3239(int arg0) {
        field7867++;
        int var2 = 0;
        for (class371 var3 = (class371) this.field7863.method2197(arg0 ^ arg0); var3 != null; var3 = (class371) this.field7863.method2200(-1)) {
            if (!var3.method1023((byte) -85)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILks;)V")
    private final void method3240(int arg0, class371 arg1) {
        if (arg1 != null) {
            arg1.method1117(0);
            arg1.method896(0);
            this.field7868 += arg1.field5020;
        }
        int var3 = 35 / ((14 - arg0) / 54);
        field7869++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
    public final int method3241(int arg0) {
        if (arg0 >= -29) {
            method3244(37, -70, 91, null);
        }
        field7874++;
        return this.field7860;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)I")
    public final int method3242(int arg0) {
        field7857++;
        if (arg0 != -15516) {
            this.method3245((byte) -3, 55L, -42, null);
        }
        return this.field7868;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method3243(Object arg0, long arg1, int arg2) {
        field7861++;
        int var5 = -82 / ((arg2 + 1) / 41);
        this.method3245((byte) 127, arg1, 1, arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIILan;)Lpu;")
    public static final class483 method3244(int arg0, int arg1, int arg2, class21 arg3) {
        field7862++;
        byte[] var4 = arg3.method240(arg1, arg2, (byte) -124);
        if (arg0 != -32635) {
            method3251(-90, 105, 6);
        }
        return var4 == null ? null : new class483(var4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BJILjava/lang/Object;)V")
    private final void method3245(byte arg0, long arg1, int arg2, Object arg3) {
        field7859++;
        if (this.field7860 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method3238(arg1, 65);
        this.field7868 -= arg2;
        while (this.field7868 < 0) {
            class371 var7 = (class371) this.field7863.method2193(-11636);
            this.method3240(-104, var7);
        }
        if (arg0 <= 125) {
            this.field7860 = -119;
        }
        class327 var6 = new class327(arg3, arg2);
        this.field7878.method1241(var6, arg1, -123);
        this.field7863.method2199(-23751, var6);
        var6.field2110 = 0L;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public final void method3246(boolean arg0) {
        if (arg0) {
            this.field7878 = null;
        }
        this.field7863.method2201(46);
        field7858++;
        this.field7878.method1247(0);
        this.field7868 = this.field7860;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3247(byte arg0) {
        field7864++;
        class371 var2 = (class371) this.field7878.method1245((byte) 95);
        if (arg0 > -50) {
            field7873 = -121L;
        }
        while (var2 != null) {
            Object var3 = var2.method1024(85);
            if (var3 != null) {
                return var3;
            }
            class371 var4 = var2;
            var2 = (class371) this.field7878.method1245((byte) 95);
            var4.method1117(0);
            var4.method896(0);
            this.field7868 += var2.field5020;
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public final void method3248(int arg0) {
        for (class371 var2 = (class371) this.field7863.method2197(arg0); var2 != null; var2 = (class371) this.field7863.method2200(-1)) {
            if (var2.method1023((byte) -74)) {
                var2.method1117(0);
                var2.method896(0);
                this.field7868 += var2.field5020;
            }
        }
        field7871++;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method3249(byte arg0) {
        if (arg0 < 126) {
            this.method3238(127L, 67);
        }
        field7872++;
        class371 var2 = (class371) this.field7878.method1248(-1);
        while (var2 != null) {
            Object var3 = var2.method1024(37);
            if (var3 != null) {
                return var3;
            }
            class371 var4 = var2;
            var2 = (class371) this.field7878.method1245((byte) 95);
            var4.method1117(0);
            var4.method896(0);
            this.field7868 += var2.field5020;
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public static void method3250(int arg0) {
        field7865 = null;
        if (arg0 != 0) {
            method3250(-24);
        }
        field7880 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Z")
    public static final boolean method3251(int arg0, int arg1, int arg2) {
        if (arg1 >= -12) {
            return true;
        } else {
            field7875++;
            return class113.method793(arg2, arg0, (byte) 57) & (class63.method540(arg2, arg0, -24587) | (arg2 & 0x2000) != 0 | class566.method3223(arg0, -107, arg2));
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method3252(long arg0, byte arg1) {
        field7876++;
        class371 var4 = (class371) this.field7878.method1242(0, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1024(80);
        if (var5 == null) {
            var4.method1117(0);
            var4.method896(0);
            this.field7868 += var4.field5020;
            return null;
        }
        int var6 = -41 / ((arg1 + 14) / 46);
        if (var4.method1023((byte) -109)) {
            class327 var7 = new class327(var5, var4.field5020);
            this.field7878.method1241(var7, var4.field2524, -124);
            this.field7863.method2199(-23751, var7);
            var7.field2110 = 0L;
            var4.method1117(0);
            var4.method896(0);
        } else {
            this.field7863.method2199(-23751, var4);
            var4.field2110 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public final void method3253(int arg0, int arg1) {
        field7866++;
        if (arg1 > -118 || class372.field5027 == null) {
            return;
        }
        for (class371 var3 = (class371) this.field7863.method2197(0); var3 != null; var3 = (class371) this.field7863.method2200(-1)) {
            if (var3.method1023((byte) -82)) {
                if (var3.method1024(47) == null) {
                    var3.method1117(0);
                    var3.method896(0);
                    this.field7868++;
                }
            } else if (++var3.field2110 > (long) arg0) {
                class371 var4 = class372.field5027.method2793(var3, (byte) 69);
                this.field7878.method1241(var4, var3.field2524, -123);
                class47.method471(999999, var4, var3);
                var3.method1117(0);
                var3.method896(0);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
    public class571(int arg0) {
        this.field7868 = arg0;
        this.field7860 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field7878 = new class205(var2);
    }
}
