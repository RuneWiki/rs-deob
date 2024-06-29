import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class342 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "Lco;")
    private class210 field4889 = new class210(64);

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Lg;")
    private class470 field4894;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lpn;")
    public static class72 field4895 = new class72(62, 4);

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "[I")
    public static int[] field4898 = new int[50];

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Z")
    public static boolean field4899 = true;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
    public final void method2073(byte arg0) {
        if (arg0 >= -109) {
            return;
        }
        class210 var2 = this.field4889;
        synchronized (this.field4889) {
            this.field4889.method1169(1076);
        }
        field4893++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZILjava/awt/Component;)Lgt;")
    public static final class356 method2074(boolean arg0, int arg1, Component arg2) {
        if (arg1 > -7) {
            method2079(79, 103);
        }
        field4890++;
        return new class171(arg2, arg0);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
    public final void method2075(byte arg0) {
        field4888++;
        class210 var2 = this.field4889;
        synchronized (this.field4889) {
            if (arg0 <= 31) {
                this.field4894 = null;
            }
            this.field4889.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Lbc;")
    public final class307 method2076(byte arg0, int arg1) {
        field4891++;
        class210 var3 = this.field4889;
        class307 var5;
        synchronized (this.field4889) {
            if (arg0 != -122) {
                return null;
            }
            var5 = (class307) this.field4889.method1163((byte) 118, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field4894.method2768(-20472, arg1, 11);
        class307 var7 = new class307();
        if (var6 != null) {
            var7.method1909(-1, new class179(var6));
        }
        class210 var8 = this.field4889;
        synchronized (this.field4889) {
            this.field4889.method1172((long) arg1, 1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
    public final void method2077(int arg0, int arg1) {
        class210 var3 = this.field4889;
        synchronized (this.field4889) {
            this.field4889.method1166(arg1, (byte) -52);
        }
        if (arg0 == 0) {
            field4892++;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILwc;III)V")
    public static final void method2078(int arg0, int arg1, class399 arg2, int arg3, int arg4, int arg5) {
        field4896++;
        if (arg2.field5677 == -1 && arg2.field5675 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class376.field5363 * arg2.field5670 >> 8;
        if (arg4 > arg2.field5681) {
            var6 += arg4 - arg2.field5681;
        } else if (arg4 < arg2.field5680) {
            var6 += arg2.field5680 - arg4;
        }
        if (arg1 > arg2.field5686) {
            var6 += arg1 - arg2.field5686;
        } else if (arg1 < arg2.field5672) {
            var6 += arg2.field5672 - arg1;
        }
        if (arg2.field5687 == 0 || arg2.field5687 < (var6 - 64) || class376.field5363 == 0 || arg2.field5668 != arg0) {
            if (arg2.field5688 != null) {
                class226.field3136.method509(arg2.field5688);
                arg2.field5688 = null;
            }
            if (arg2.field5682 != null) {
                class226.field3136.method509(arg2.field5682);
                arg2.field5682 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg3 != 100) {
            method2080(-44);
        }
        int var8 = (arg2.field5687 - var6) * var7 / arg2.field5687;
        if (arg2.field5688 != null) {
            arg2.field5688.method1546(var8);
        } else if (arg2.field5677 >= 0) {
            class245 var9 = class245.method1333(class90.field1129, arg2.field5677, 0);
            if (var9 != null) {
                class436 var10 = var9.method1334().method2593(class185.field2435);
                class250 var11 = class250.method1530(var10, 100, var8);
                var11.method1524(-1);
                class226.field3136.method508(var11);
                arg2.field5688 = var11;
            }
        }
        if (arg2.field5682 != null) {
            arg2.field5682.method1546(var8);
            if (arg2.field5682.method698(true)) {
                return;
            }
            arg2.field5682 = null;
        } else if (arg2.field5675 != null && (arg2.field5689 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg2.field5675.length);
            class245 var13 = class245.method1333(class90.field1129, arg2.field5675[var12], 0);
            if (var13 != null) {
                class436 var14 = var13.method1334().method2593(class185.field2435);
                class250 var15 = class250.method1530(var14, 100, var8);
                var15.method1524(0);
                class226.field3136.method508(var15);
                arg2.field5682 = var15;
                arg2.field5689 = (int) (Math.random() * (double) (arg2.field5691 - arg2.field5674)) + arg2.field5674;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)I")
    public static final int method2079(int arg0, int arg1) {
        field4897++;
        return arg0 == 19552 ? arg1 & 0xFF : -98;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method2080(int arg0) {
        if (arg0 != 50) {
            method2074(true, -64, (Component) null);
        }
        field4895 = null;
        field4898 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class342(class421 arg0, int arg1, class470 arg2) {
        this.field4894 = arg2;
        if (this.field4894 != null) {
            this.field4894.method2755(-123, 11);
        }
    }
}
