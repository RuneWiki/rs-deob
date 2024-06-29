import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class192 {

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Z")
    public boolean field2884;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[I")
    public static int[] field2888 = new int[14];

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public static int field2891 = 104;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lcea;")
    public static class111 field2890;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "Lvv;")
    public class463 field2883;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lvv;")
    public class463 field2885;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Z")
    public boolean field2880;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)I")
    public static final int method1370(boolean arg0, int arg1) {
        field2881++;
        if (!arg0) {
            method1370(true, 121);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
    public final boolean method1371(int arg0) {
        int var2 = -114 / ((-arg0 - 4) / 51);
        field2882++;
        return this.field2880 && !this.field2884;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public final void method1372(int arg0) {
        field2889++;
        if (this.field2885 != null) {
            this.field2885.method32(16479);
        }
        this.field2880 = false;
        int var2 = 4 / ((arg0 + 44) / 41);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
    public static final boolean method1373(int arg0, int arg1, int arg2) {
        field2887++;
        boolean var3 = (arg1 & 0x37) == arg2 ? class484.method2854(arg1, arg2 ^ 0xFFFFFFC8, arg0) : class374.method2233(arg1, arg0, 0);
        return class381.method2294(arg0, arg2, arg1) | (arg0 & 0x10000) != 0 | var3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Z)V")
    public class192(boolean arg0) {
        this.field2884 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
    public static void method1374(int arg0) {
        field2890 = null;
        field2888 = null;
        if (arg0 > -116) {
            field2890 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)Z")
    public static final boolean method1375(int arg0, int arg1, int arg2) {
        int var3 = 86 % ((73 - arg0) / 48);
        field2886++;
        return (arg2 & 0x60000) != 0 | class598.method3487(0, arg2, arg1) || class513.method2996((byte) -33, arg2, arg1);
    }
}
