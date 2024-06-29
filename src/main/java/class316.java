import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class316 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ld;")
    private class242 field4818 = new class242(64);

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lum;")
    private class83 field4822;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
    public static int[] field4820 = new int[2];

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[I")
    public static int[] field4824 = new int[5];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 4)
    public static void method2097(int arg0) {
        field4824 = null;
        field4820 = null;
        if (arg0 != 64) {
            field4820 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 16)
    public final void method2098(int arg0) {
        field4817++;
        class242 var2 = this.field4818;
        synchronized (this.field4818) {
            this.field4818.method1637((byte) 13);
            int var3 = 54 % ((-arg0 - 24) / 57);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)Ldf;", line = 35)
    public final class454 method2099(boolean arg0, int arg1) {
        field4821++;
        class242 var3 = this.field4818;
        class454 var4;
        synchronized (this.field4818) {
            var4 = (class454) this.field4818.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field4822;
        byte[] var6;
        synchronized (this.field4822) {
            var6 = this.field4822.method731(0, class424.method2640(arg1, 1023), class225.method1548(-122, arg1));
        }
        if (!arg0) {
            this.method2101(60);
        }
        class454 var7 = new class454();
        if (var6 != null) {
            var7.method2782(new class194(var6), -1);
        }
        class242 var8 = this.field4818;
        synchronized (this.field4818) {
            this.field4818.method1623((long) arg1, 17621, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 66)
    public static final String method2100(String arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field4815++;
        String var2 = class34.method206(class279.method1891(120, arg0), -124);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V", line = 82)
    public final void method2101(int arg0) {
        if (arg0 != 10) {
            this.method2104((byte) 17, -127);
        }
        field4819++;
        class242 var2 = this.field4818;
        synchronized (this.field4818) {
            this.field4818.method1630(-99);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZIII)Ljava/lang/String;", line = 103)
    public static final String method2102(boolean arg0, int arg1, int arg2, int arg3) {
        field4816++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg0 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg3 != 48) {
                field4820 = null;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - (arg1 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 170)
    public class316(class308 arg0, int arg1, class83 arg2) {
        this.field4822 = arg2;
        if (this.field4822 != null) {
            int var4 = this.field4822.method754(false) - 1;
            this.field4822.method748(var4, 12408);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V", line = 158)
    public final void method2103(int arg0, int arg1) {
        class242 var3 = this.field4818;
        synchronized (this.field4818) {
            this.field4818.method1631(arg1, (byte) -19);
        }
        if (arg0 != 87) {
            this.method2099(true, -73);
        }
        field4823++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)V", line = 194)
    public final void method2104(byte arg0, int arg1) {
        field4825++;
        if (arg0 != -18) {
            field4820 = null;
        }
        class242 var3 = this.field4818;
        synchronized (this.field4818) {
            this.field4818.method1637((byte) 13);
            this.field4818 = new class242(arg1);
        }
    }
}
