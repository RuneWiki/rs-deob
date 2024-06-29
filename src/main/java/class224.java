import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class224 {

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "Lgg;")
    private class114 field2955 = new class114(64);

    @OriginalMember(owner = "client!iba", name = "w", descriptor = "Lgg;")
    public class114 field2970 = new class114(50);

    @OriginalMember(owner = "client!iba", name = "x", descriptor = "Lgg;")
    public class114 field2971 = new class114(5);

    @OriginalMember(owner = "client!iba", name = "s", descriptor = "Z")
    public boolean field2966;

    @OriginalMember(owner = "client!iba", name = "t", descriptor = "Ldh;")
    public class286 field2967;

    @OriginalMember(owner = "client!iba", name = "v", descriptor = "Lkha;")
    public class687 field2969;

    @OriginalMember(owner = "client!iba", name = "o", descriptor = "Lkha;")
    private class687 field2962;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2948 = null;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "Z")
    public static boolean field2950 = false;

    @OriginalMember(owner = "client!iba", name = "u", descriptor = "Z")
    public static boolean field2968 = false;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!iba", name = "k", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!iba", name = "l", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!iba", name = "m", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!iba", name = "p", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!iba", name = "q", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!iba", name = "y", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "Lkha;")
    public static class687 field2954;

    @OriginalMember(owner = "client!iba", name = "r", descriptor = "Lkha;")
    public static class687 field2965;

    @OriginalMember(owner = "client!iba", name = "n", descriptor = "Ld;")
    public static class96 field2961;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "[[I")
    public static int[][] field2949;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
    public final void method1445(int arg0, int arg1) {
        class114 var3 = this.field2955;
        synchronized (this.field2955) {
            this.field2955.method775(1, arg0);
        }
        field2963++;
        class114 var4 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method775(1, arg0);
        }
        class114 var5 = this.field2971;
        synchronized (this.field2971) {
            if (arg1 == 64) {
                this.field2971.method775(1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
    public final void method1446(byte arg0) {
        int var2 = -94 / ((arg0 - 24) / 40);
        class114 var3 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method776((byte) 65);
        }
        field2959++;
        class114 var4 = this.field2971;
        synchronized (this.field2971) {
            this.field2971.method776((byte) -128);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public final void method1447(int arg0) {
        class114 var2 = this.field2955;
        synchronized (this.field2955) {
            this.field2955.method781((byte) 47);
        }
        field2952++;
        if (arg0 >= -100) {
            return;
        }
        class114 var3 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method781((byte) 47);
        }
        class114 var4 = this.field2971;
        synchronized (this.field2971) {
            this.field2971.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BI)V")
    public final void method1448(byte arg0, int arg1) {
        this.field2972 = arg1;
        field2964++;
        class114 var3 = this.field2970;
        synchronized (this.field2970) {
            if (arg0 != 25) {
                this.method1452(-25, -83);
            }
            this.field2970.method776((byte) -85);
        }
        class114 var4 = this.field2971;
        synchronized (this.field2971) {
            this.field2971.method776((byte) 88);
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(II)V")
    public static final void method1449(int arg0, int arg1) {
        class479.field6847 = arg0;
        if (arg1 != -1) {
            method1450((byte) 69);
        }
        field2960++;
        class30.field487.method776((byte) 116);
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)V")
    public static void method1450(byte arg0) {
        field2948 = null;
        field2961 = null;
        if (arg0 != -48) {
            field2961 = null;
        }
        field2949 = null;
        field2965 = null;
        field2954 = null;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIIZI[B[B)V")
    public static final void method1451(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte[] arg7, byte[] arg8) {
        field2956++;
        if (arg5) {
            method1451(23, -14, 3, 62, 60, true, 105, null, null);
        }
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg7[var10001] += arg8[arg3++];
                int var14 = arg2++;
                arg7[var14] += arg8[arg3++];
                int var15 = arg2++;
                arg7[var15] += arg8[arg3++];
                int var16 = arg2++;
                arg7[var16] += arg8[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg7[var10001] += arg8[arg3++];
            }
            arg2 += arg0;
            arg3 += arg6;
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(II)Lat;")
    public final class155 method1452(int arg0, int arg1) {
        field2953++;
        class114 var3 = this.field2955;
        class155 var4;
        synchronized (this.field2955) {
            var4 = (class155) this.field2955.method778((long) arg0, 98);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field2962;
        byte[] var6;
        synchronized (this.field2962) {
            var6 = this.field2962.method3810(class405.method2402(arg1 ^ arg1, arg0), -23360, class611.method3341(arg0, 127));
        }
        class155 var7 = new class155();
        var7.field1898 = this;
        var7.field1920 = arg0;
        if (var6 != null) {
            var7.method963(new class179(var6), -129);
        }
        var7.method964(false);
        class114 var8 = this.field2955;
        synchronized (this.field2955) {
            this.field2955.method774((long) arg0, -45, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public final void method1453(int arg0) {
        field2957++;
        class114 var2 = this.field2955;
        synchronized (this.field2955) {
            this.field2955.method776((byte) -127);
        }
        class114 var3 = this.field2970;
        synchronized (this.field2970) {
            this.field2970.method776((byte) 113);
        }
        class114 var4 = this.field2971;
        synchronized (this.field2971) {
            this.field2971.method776((byte) -118);
        }
        if (arg0 > -12) {
            this.method1452(59, 111);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZI)V")
    public final void method1454(boolean arg0, int arg1) {
        field2951++;
        if (this.field2966 == arg0) {
            return;
        }
        this.field2966 = arg0;
        if (arg1 != 1695) {
            this.field2969 = null;
        }
        this.method1453(arg1 - 1786);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Ldh;IZLkha;Lkha;)V")
    public class224(class286 arg0, int arg1, boolean arg2, class687 arg3, class687 arg4) {
        this.field2966 = arg2;
        this.field2967 = arg0;
        this.field2969 = arg4;
        this.field2962 = arg3;
        if (this.field2962 != null) {
            int var6 = this.field2962.method3816(-128) - 1;
            this.field2962.method3812(0, var6);
        }
    }
}
