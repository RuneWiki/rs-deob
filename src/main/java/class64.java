import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class class64 {

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "Llc;")
    public static class435 field1010 = new class435(83, 6);

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "[B")
    public static byte[] field1011 = new byte[2048];

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Ljia;")
    public static class336 field1008;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(CB)Z", line = 3)
    public static final boolean method580(char arg0, byte arg1) {
        field1012++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class272.method1773(-66, arg0)) {
            return true;
        } else {
            char[] var2 = class41.field695;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var8 = var2[var3];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var4 = class266.field3803;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var7 = var4[var5];
                if (arg0 == var7) {
                    return true;
                }
            }
            int var6 = -85 / ((-arg1 - 71) / 49);
            return false;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 48)
    public static void method581(int arg0) {
        field1011 = null;
        field1008 = null;
        field1010 = null;
        if (arg0 != 6) {
            field1010 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)Lva;", line = 63)
    public static final class500 method582(int arg0, int arg1) {
        field1009++;
        class500 var2 = (class500) class509.field7378.method2216(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class561.field8133.method2600(0, 0, arg0);
        class500 var4 = new class500();
        if (var3 != null) {
            var4.method3038((byte) 47, new class479(var3));
        }
        var4.method3040((byte) 60);
        class509.field7378.method2213((byte) -16, (long) arg0, var4);
        if (arg1 != 20915) {
            method580('+', (byte) 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)J")
    public abstract long method583(int arg0);
}
