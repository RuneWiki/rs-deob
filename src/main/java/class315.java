import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class315 {

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public int field4128 = 128;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public int field4135 = 128;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public int field4127;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Lff;")
    public static class9 field4121 = new class9(74, 6);

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLgt;)V", line = 7)
    public final void method1821(byte arg0, class315 arg1) {
        this.field4136 = arg1.field4136;
        field4122++;
        this.field4128 = arg1.field4128;
        this.field4135 = arg1.field4135;
        this.field4132 = arg1.field4132;
        if (arg0 != -41) {
            this.method1821((byte) 10, null);
        }
        this.field4120 = arg1.field4120;
        this.field4127 = arg1.field4127;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method1822(boolean arg0) {
        field4129++;
        if (arg0) {
            method1823(true);
        }
        if (class248.field3293 != -1) {
            class457.method2606(9834, false, -1, -1, class248.field3293);
            class248.field3293 = -1;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(Z)V", line = 46)
    public static void method1823(boolean arg0) {
        if (!arg0) {
            field4121 = null;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIB[B)Ljava/lang/String;", line = 61)
    public static final String method1824(int arg0, int arg1, byte arg2, byte[] arg3) {
        field4125++;
        char[] var4 = new char[arg0];
        if (arg2 != -37) {
            field4134 = -83;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class106.field1560[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Lgt;", line = 109)
    public final class315 method1825(int arg0) {
        if (arg0 != -4220) {
            this.method1821((byte) 25, null);
        }
        field4131++;
        return new class315(this.field4127, this.field4128, this.field4135, this.field4132, this.field4120, this.field4136);
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(I)V", line = 167)
    public class315(int arg0) {
        this.field4127 = arg0;
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIII)V", line = 174)
    private class315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4128 = arg1;
        this.field4127 = arg0;
        this.field4135 = arg2;
        this.field4132 = arg3;
        this.field4136 = arg5;
        this.field4120 = arg4;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZIIZI)I", line = 124)
    public static final int method1826(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4130++;
        int var5 = -6 % ((-arg2 - 78) / 34);
        class32 var6 = class222.method1397(arg0, arg4, false);
        if (var6 == null) {
            return 0;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < var6.field527.length; var8++) {
            if (var6.field527[var8] >= 0 && class127.field1852.field5697 > var6.field527[var8]) {
                class482 var9 = class127.field1852.method2390(48, var6.field527[var8]);
                int var10 = var9.method2772(arg1, (byte) -127, class270.field3546.method693(arg1, -33).field6873);
                if (arg3) {
                    var7 += var6.field524[var8] * var10;
                } else {
                    var7 += var10;
                }
            }
        }
        return var7;
    }
}
