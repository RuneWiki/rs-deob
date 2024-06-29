import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class700 {

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public int field9919 = 0;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public int field9922 = 0;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Llga;")
    private class663 field9923 = new class663(64);

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Lmm;")
    private class252 field9931 = null;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Lsea;")
    private class648 field9927;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Lsea;")
    private class648 field9917;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "J")
    public static long field9925 = 0L;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "Lgo;")
    public static class581 field9926 = new class581(2, 4, 4, 0);

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Lrg;")
    public static class596 field9932 = new class596(14, 7);

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Z")
    public static boolean field9933 = false;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field9934 = 0;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Lqga;")
    public static class168 field9921;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "Lsea;")
    public static class648 field9930;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field9920;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
    public static final void method3919(int arg0, int arg1) {
        class124.field1793 = arg1;
        class76.field997 = 2;
        field9929++;
        if (arg0 <= 126) {
            return;
        }
        long var2 = 0L;
        if (class650.field9030 == null) {
            class31.method295(2, 35);
        } else {
            class501 var4 = new class501(class340.method1991((byte) 122, class465.method2627(class650.field9030, 127)));
            long var5 = var4.method2849(-2);
            class130.field1860 = var4.method2849(-2);
            class72.method577(class155.method1107(var5, 0), -79, true, "");
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZII)I")
    public static final int method3920(boolean arg0, boolean arg1, int arg2, int arg3) {
        field9918++;
        if (!arg0) {
            field9933 = true;
        }
        class373 var4 = class687.method3877(arg2, arg1, 120);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field5021.length > arg3) {
            return var4.field5021[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(JZLgo;[I)Ljava/lang/String;")
    public final String method3921(long arg0, boolean arg1, class581 arg2, int[] arg3) {
        field9928++;
        if (arg1) {
            return null;
        }
        if (this.field9931 != null) {
            String var6 = this.field9931.method408(arg2, arg3, 0, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)Ltl;")
    public final class575 method3922(int arg0, boolean arg1) {
        field9924++;
        class575 var3 = (class575) this.field9923.method3747((byte) -66, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field9927.method3654(-15615, 1, arg0 & 0x7FFF);
        } else {
            var4 = this.field9917.method3654(-15615, 1, arg0);
        }
        class575 var5 = new class575();
        var5.field8132 = this;
        if (var4 != null) {
            var5.method3282(new class501(var4), -114);
        }
        if (arg1) {
            method3923((byte) -99);
        }
        if (arg0 >= 32768) {
            var5.method3281(-75);
        }
        this.field9923.method3748((long) arg0, var5, 12537);
        return var5;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static void method3923(byte arg0) {
        field9932 = null;
        field9930 = null;
        field9920 = null;
        field9921 = null;
        int var1 = 116 / ((arg0 + 44) / 41);
        field9926 = null;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILsea;Lsea;Lmm;)V")
    public class700(int arg0, class648 arg1, class648 arg2, class252 arg3) {
        this.field9931 = arg3;
        this.field9927 = arg2;
        this.field9917 = arg1;
        if (this.field9917 != null) {
            this.field9919 = this.field9917.method3653(1, true);
        }
        if (this.field9927 != null) {
            this.field9922 = this.field9927.method3653(1, true);
        }
    }
}
