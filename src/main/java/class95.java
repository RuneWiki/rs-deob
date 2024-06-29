import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class95 extends class396 {

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public int field1045 = 12800;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public int field1044 = 0;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    public int field1052 = -1;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public int field1046 = 12800;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public int field1049 = 0;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public int field1053 = -1;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "Z")
    public boolean field1061 = true;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "Ljava/lang/String;")
    public String field1065;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "Ljava/lang/String;")
    public String field1060;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "Lvn;")
    public class169 field1056;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "[I")
    public static int[] field1062 = new int[99];

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "[I")
    public static int[] field1066;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "Ltj;")
    public static class108 field1067;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[IIIZ)Z")
    public final boolean method507(int arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field1062 = null;
        }
        field1047++;
        for (class281 var6 = (class281) this.field1056.method1124(-1); var6 != null; var6 = (class281) this.field1056.method1119(false)) {
            if (var6.method1801(arg2, arg3, arg0, (byte) -13)) {
                var6.method1804(arg1, arg2, 32, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method508(int arg0, int arg1) {
        field1048++;
        class348 var2 = class385.method2464(arg1, arg1 + 1298, arg0);
        var2.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
    public static final void method509(int arg0) {
        class201.field2774.method1206(115);
        if (arg0 == 4) {
            field1058++;
        }
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
    public static void method510(byte arg0) {
        field1062 = null;
        if (arg0 > 74) {
            field1066 = null;
            field1067 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[IB)Z")
    public final boolean method511(int arg0, int arg1, int[] arg2, byte arg3) {
        if (arg3 != 125) {
            return true;
        }
        field1054++;
        for (class281 var5 = (class281) this.field1056.method1124(-1); var5 != null; var5 = (class281) this.field1056.method1119(false)) {
            if (var5.method1798(arg1, -28675, arg0)) {
                var5.method1802(arg1, arg2, (byte) 88, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([IIII)Z")
    public final boolean method512(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field1056 = null;
        }
        field1063++;
        for (class281 var5 = (class281) this.field1056.method1124(arg2 - 1); var5 != null; var5 = (class281) this.field1056.method1119(false)) {
            if (var5.method1800(arg3, (byte) -101, arg1)) {
                var5.method1804(arg0, arg3, arg2 ^ 0x20, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Z")
    public final boolean method513(int arg0, int arg1, int arg2) {
        field1059++;
        for (class281 var4 = (class281) this.field1056.method1124(-1); var4 != null; var4 = (class281) this.field1056.method1119(false)) {
            if (var4.method1800(arg2, (byte) -116, arg1)) {
                return true;
            }
        }
        if (arg0 != 0) {
            this.field1055 = -44;
        }
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)I")
    public static final int method514(int arg0, int arg1, int arg2) {
        field1050++;
        if (arg0 != 12800) {
            method509(50);
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public final void method515(int arg0) {
        this.field1045 = 12800;
        field1064++;
        this.field1049 = 0;
        this.field1044 = 0;
        this.field1046 = 12800;
        for (class281 var2 = (class281) this.field1056.method1124(-1); var2 != null; var2 = (class281) this.field1056.method1119(false)) {
            if (var2.field3955 < this.field1046) {
                this.field1046 = var2.field3955;
            }
            if (var2.field3960 > this.field1049) {
                this.field1049 = var2.field3960;
            }
            if (this.field1044 < var2.field3951) {
                this.field1044 = var2.field3951;
            }
            if (this.field1045 > var2.field3949) {
                this.field1045 = var2.field3949;
            }
        }
        int var3 = 103 % ((arg0 - 73) / 44);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Len;I)V")
    public static final void method516(class174 arg0, int arg1) {
        if (class81.field903) {
            class33.method193(14, arg0);
        } else {
            class267.method1702(arg0, -1003);
        }
        if (arg1 >= -123) {
            method509(122);
        }
        field1057++;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class95(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1065 = arg1;
        this.field1051 = arg0;
        this.field1061 = arg5;
        this.field1060 = arg2;
        this.field1052 = arg6;
        this.field1055 = arg3;
        this.field1053 = arg4;
        if (this.field1052 == 255) {
            this.field1052 = 0;
        }
        this.field1056 = new class169();
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1062[var1] = var0 / 4;
        }
        field1066 = new int[32];
    }
}
