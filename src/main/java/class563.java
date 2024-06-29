import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class563 {

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    private int field7953;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "[Ltm;")
    private class392[] field7955;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "Llga;")
    public static class712 field7960 = new class712(35, 5);

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field7964 = 0;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "J")
    private long field7962;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Ltm;")
    private class392 field7961;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "[Lufa;")
    public static class680[] field7963;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLtm;J)V")
    public final void method3169(byte arg0, class392 arg1, long arg2) {
        field7958++;
        if (arg1.field5560 != null) {
            arg1.method2287((byte) -90);
        }
        class392 var5 = this.field7955[(int) ((long) (this.field7953 - 1) & arg2)];
        arg1.field5555 = var5;
        arg1.field5560 = var5.field5560;
        arg1.field5560.field5555 = arg1;
        if (arg0 > -6) {
            this.field7962 = -42L;
        }
        arg1.field5555.field5560 = arg1;
        arg1.field5550 = arg2;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public static final void method3170(int arg0) {
        field7956++;
        int var1 = 0;
        if (arg0 < 6) {
            method3172(6);
        }
        for (int var2 = 0; var2 < class272.field3589; var2++) {
            for (int var3 = 0; var3 < class3.field26; var3++) {
                if (class531.method2934(var2, var1, class77.field947, var3, (byte) -76, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIBIIIIII)Z")
    public static final boolean method3171(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7957++;
        if (!class299.method1791(arg2, arg9, arg4, arg3 ^ 0x52)) {
            return false;
        }
        int var10 = class175.field2162[1];
        int var11 = class175.field2162[2];
        int var12 = class175.field2162[0];
        if (arg3 != 82) {
            method3170(-21);
        }
        if (!class299.method1791(arg7, arg8, arg0, 0)) {
            return false;
        }
        int var13 = class175.field2162[1];
        int var14 = class175.field2162[2];
        int var15 = class175.field2162[0];
        if (class299.method1791(arg5, arg1, arg6, 0)) {
            int var16 = class175.field2162[1];
            int var17 = class175.field2162[0];
            int var18 = class175.field2162[2];
            return class146.method902(var15, var12, (byte) 82, var14, var16, var10, var17, var13, var11, var18);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public static void method3172(int arg0) {
        field7960 = null;
        if (arg0 != -386) {
            method3171(80, 18, 123, (byte) 83, -110, -108, -70, -39, -108, -12);
        }
        field7963 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(JB)Ltm;")
    public final class392 method3173(long arg0, byte arg1) {
        this.field7962 = arg0;
        field7954++;
        class392 var4 = this.field7955[(int) (arg0 & (long) (this.field7953 - 1))];
        this.field7961 = var4.field5555;
        int var5 = 71 % ((-arg1 - 26) / 52);
        while (this.field7961 != var4) {
            if (this.field7961.field5550 == arg0) {
                class392 var6 = this.field7961;
                this.field7961 = this.field7961.field5555;
                return var6;
            }
            this.field7961 = this.field7961.field5555;
        }
        this.field7961 = null;
        return null;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(I)V")
    public class563(int arg0) {
        this.field7953 = arg0;
        this.field7955 = new class392[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class392 var3 = this.field7955[var2] = new class392();
            var3.field5555 = var3;
            var3.field5560 = var3;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Ltm;")
    public final class392 method3174(boolean arg0) {
        field7959++;
        if (this.field7961 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            class392 var2 = this.field7955[(int) ((long) (this.field7953 - 1) & this.field7962)];
            while (this.field7961 != var2) {
                if (this.field7961.field5550 == this.field7962) {
                    class392 var3 = this.field7961;
                    this.field7961 = this.field7961.field5555;
                    return var3;
                }
                this.field7961 = this.field7961.field5555;
            }
            this.field7961 = null;
            return null;
        }
    }
}
