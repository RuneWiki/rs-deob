import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class185 extends class107 implements class99 {

    @OriginalMember(owner = "client!je", name = "J", descriptor = "Z")
    private boolean field2964 = false;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    private int field2967 = 50;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Laj;")
    private class151 field2966;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Laj;")
    private class151 field2956;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Ljg;")
    private class42 field2953;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Ljg;")
    private class42 field2948;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "Lpf;")
    public static class17 field2958 = new class17(64);

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[I")
    public static int[] field2968 = new int[1000];

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "[I")
    public static int[] field2952;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Z")
    public final boolean method704(byte arg0, int arg1) {
        if (arg0 != -114) {
            this.method1341(-37, 15);
        }
        field2949++;
        return this.method799(arg1, (byte) -117).field2842;
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(II)V")
    public final void method1338(int arg0, int arg1) {
        field2965++;
        if (arg1 != -29018) {
            this.method707(-16, 122);
        }
        for (class8 var3 = (class8) this.field2953.method251(121); var3 != null; var3 = (class8) this.field2953.method249((byte) -115)) {
            if (var3.field163) {
                var3.method56(arg0);
                var3.field163 = false;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public final void method1339(int arg0) {
        field2961++;
        if (arg0 != 64) {
            this.method702(-64, -4);
        }
        this.field2953.method253(0);
        if (this.field2948 != null) {
            this.field2948.method253(0);
        }
        class8.field166 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BZ)V")
    public final void method1340(byte arg0, boolean arg1) {
        field2963++;
        if (arg0 < -29) {
            this.field2964 = arg1;
            this.method1339(64);
        }
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(II)Lmi;")
    private final class8 method1341(int arg0, int arg1) {
        field2962++;
        class8 var3 = (class8) this.field2953.method252((long) arg0, false);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2956.method1149(arg0, (byte) 81, 0);
        if (arg1 != -8728) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            class8 var5 = new class8(new class249(var4));
            this.field2953.method247(var5, (long) arg0, -96);
            return var5;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)J")
    public static final long method1342(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        return var3 == null || var3.field2800 == null ? 0L : var3.field2800.field2945;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)Z")
    public final boolean method702(int arg0, int arg1) {
        field2950++;
        if (arg1 != 64) {
            this.field2953 = null;
        }
        return !this.method799(arg0, (byte) -68).field2843;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field2958 = null;
        if (arg0 != 255) {
            field2968 = null;
        }
        field2952 = null;
        field2968 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    public final int method703(int arg0, int arg1) {
        field2955++;
        if (arg0 != 2213) {
            this.field2953 = null;
        }
        return this.method799(arg1, (byte) -96).field2838 & 0xFFFF;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BIIFZ)Lbj;")
    public final class92 method706(byte arg0, int arg1, int arg2, float arg3, boolean arg4) {
        field2957++;
        if (arg0 != 7) {
            return null;
        }
        class8 var6 = this.method1341(arg2, -8728);
        if (var6 != null && var6.method55(this, this.field2966)) {
            return arg4 ? var6.field165.method713(arg1, arg1, -1, this.field2966, (double) arg3, false, this) : var6.field165.method716(this.field2966, (double) arg3, false, arg1, this, arg1, (byte) 40);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Laj;Laj;Laj;IZ)V")
    public class185(class151 arg0, class151 arg1, class151 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2966 = arg2;
        this.field2967 = arg3;
        this.field2956 = arg0;
        this.field2964 = arg4;
        this.field2953 = new class42(this.field2967);
        this.field2948 = null;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)Lej;")
    public final class101 method803(int arg0, int arg1) {
        field2959++;
        if (arg0 != 255) {
            this.method705(false, -68, 0.27288574F);
        }
        class8 var3 = this.method1341(arg1, -8728);
        return var3 == null ? null : var3.field165;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)Z")
    public final boolean method707(int arg0, int arg1) {
        if (arg0 != 64) {
            this.field2956 = null;
        }
        field2954++;
        return this.field2964 || this.method799(arg1, (byte) -66).field2840;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIF)[I")
    public final int[] method705(boolean arg0, int arg1, float arg2) {
        field2951++;
        class8 var4 = this.method1341(arg1, -8728);
        if (var4 == null) {
            return null;
        } else {
            var4.field163 = arg0;
            return var4.method54(this, this.field2966, arg2, this.field2964 || this.method799(arg1, (byte) -112).field2840);
        }
    }
}
