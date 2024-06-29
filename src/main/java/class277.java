import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class277 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Lfw;")
    private class215 field3889 = new class215();

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Ljava/lang/String;")
    public String field3887;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Llc;")
    public static class435 field3893 = new class435(77, 2);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    private volatile int field3894;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lbi;")
    private class117 field3896;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(CII)C")
    public static final char method1782(char arg0, int arg1, int arg2) {
        if (arg1 < 108) {
            method1791(13, null, null, -94);
        }
        field3888++;
        if (arg0 >= 'À' && arg0 <= 'ÿ') {
            if (arg0 >= 'À' && arg0 <= 'Æ') {
                return 'A';
            }
            if (arg0 == 'Ç') {
                return 'C';
            }
            if (arg0 >= 'È' && arg0 <= 'Ë') {
                return 'E';
            }
            if (arg0 >= 'Ì' && arg0 <= 'Ï') {
                return 'I';
            }
            if (arg0 >= 'Ò' && arg0 <= 'Ö') {
                return 'O';
            }
            if (arg0 >= 'Ù' && arg0 <= 'Ü') {
                return 'U';
            }
            if (arg0 == 'Ý') {
                return 'Y';
            }
            if (arg0 == 'ß') {
                return 's';
            }
            if (arg0 >= 'à' && arg0 <= 'æ') {
                return 'a';
            }
            if (arg0 == 'ç') {
                return 'c';
            }
            if (arg0 >= 'è' && arg0 <= 'ë') {
                return 'e';
            }
            if (arg0 >= 'ì' && arg0 <= 'ï') {
                return 'i';
            }
            if (arg0 >= 'ò' && arg0 <= 'ö') {
                return 'o';
            }
            if (arg0 >= 'ù' && arg0 <= 'ü') {
                return 'u';
            }
            if (arg0 == 'ý' || arg0 == 'ÿ') {
                return 'y';
            }
        }
        if (arg0 == 'Œ') {
            return 'O';
        } else if (arg0 == 'œ') {
            return 'o';
        } else if (arg0 == 'Ÿ') {
            return 'Y';
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILdp;)V")
    public final void method1783(int arg0, class372 arg1) {
        class215 var3 = this.field3889;
        synchronized (this.field3889) {
            this.field3889.method1521(arg1, -24256);
            int var4 = -41 / ((-arg0 - 28) / 48);
            this.field3894++;
        }
        field3891++;
        if (this.field3896 != null) {
            class117 var5 = this.field3896;
            synchronized (this.field3896) {
                this.field3896.notify();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lbi;I)V")
    public final void method1784(class117 arg0, int arg1) {
        field3892++;
        if (arg1 == -200) {
            this.field3896 = arg0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
    public static final boolean method1785(int arg0, int arg1, int arg2) {
        if (arg0 == -1) {
            field3886++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Z")
    public final boolean method1786(int arg0) {
        if (arg0 != 1) {
            this.field3894 = -63;
        }
        field3895++;
        return this.field3894 == 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLjw;)V")
    public final void method1787(boolean arg0, class280 arg1) {
        arg1.field3921 = false;
        field3885++;
        class215 var3 = this.field3889;
        synchronized (this.field3889) {
            this.field3889.method1521(arg1, -24256);
            this.field3894++;
        }
        if (arg0 && this.field3896 != null) {
            class117 var4 = this.field3896;
            synchronized (this.field3896) {
                this.field3896.notify();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1788(int arg0) {
        field3893 = null;
        if (arg0 != 69) {
            method1785(-41, 67, 122);
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)Lcda;")
    public final class113 method1789(int arg0) {
        field3897++;
        Object var2 = null;
        class215 var3 = this.field3889;
        class113 var4;
        synchronized (this.field3889) {
            var4 = this.field3889.method1527(arg0 - 4146);
            var4.method814(arg0 - 4104);
            this.field3894--;
        }
        if (arg0 != 4196) {
            this.field3894 = -109;
        }
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjw;)V")
    public final void method1790(int arg0, class280 arg1) {
        arg1.field3921 = true;
        field3890++;
        class215 var3 = this.field3889;
        synchronized (this.field3889) {
            this.field3889.method1521(arg1, arg0 - 41098);
            this.field3894++;
            if (arg0 != 16842) {
                this.field3887 = null;
            }
        }
        if (this.field3896 != null) {
            class117 var4 = this.field3896;
            synchronized (this.field3896) {
                this.field3896.notify();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
    public static final int method1791(int arg0, byte[] arg1, String arg2, int arg3) {
        field3884++;
        int var4 = arg3;
        if (arg0 != 23158) {
            method1791(-9, null, null, -54);
        }
        int var5 = arg2.length();
        for (int var6 = 0; var6 < var5; var6 += 4) {
            int var7 = class391.method2392((byte) 40, arg2.charAt(var6));
            int var8 = var6 + 1 < var5 ? class391.method2392((byte) 40, arg2.charAt(var6 + 1)) : -1;
            int var9 = var6 + 2 < var5 ? class391.method2392((byte) 40, arg2.charAt(var6 + 2)) : -1;
            int var10 = (var6 + 3) >= var5 ? -1 : class391.method2392((byte) 40, arg2.charAt(var6 + 3));
            arg1[arg3++] = (byte) class430.method2658(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class430.method2658(var9 >>> 2, class368.method2314(15, var8) << 4);
            if (var10 == -1) {
                break;
            }
            arg1[arg3++] = (byte) class430.method2658(var10, class368.method2314(var9 << 6, 192));
        }
        return arg3 - var4;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class277(String arg0) {
        this.field3887 = arg0;
    }
}
