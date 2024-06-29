import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class343 extends class189 implements class243 {

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    private int field5237;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lao;")
    public static class188 field5229 = new class188(5, 6);

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field5238 = 0;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Lao;")
    public static class188 field5236 = new class188(93, -1);

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field5239 = 0;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)J", line = 3)
    public final long method1565(byte arg0) {
        if (arg0 != -88) {
            return -107L;
        } else {
            ++field5232;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V", line = 15)
    public final void method761(byte arg0) {
        ++field5230;
        if (arg0 < 29) {
            field5239 = -12;
        }
        super.field2795.method2044((byte) -62, this);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I", line = 28)
    public static final int method2235(int arg0, int arg1, int arg2) {
        ++field5228;
        return arg1 != arg2 && ~arg2 != -6 ? 256 : class34.field527[3 & arg0];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BIII)V", line = 39)
    public final void method1567(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 9813) {
            field5239 = 3;
        }
        ++field5234;
        this.method1302(true, arg0, arg1);
        this.field5237 = arg2;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lqg;I[BIZ)V", line = 54)
    public class343(class321 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5237 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)V", line = 62)
    public static void method2236(byte arg0) {
        field5229 = null;
        field5236 = null;
        if (arg0 <= 99) {
            field5239 = -31;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 74)
    public static final String method2237(String arg0, byte arg1) {
        ++field5231;
        if (arg1 != -57) {
            field5238 = -95;
        }
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (~var2 > ~var3 && class422.method2583((byte) 52, arg0.charAt(var2))) {
                ++var2;
            }
            while (var2 < var3 && class422.method2583((byte) 118, arg0.charAt(var3 + -1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var6 > ~var3; ++var6) {
                    char var7 = arg0.charAt(var6);
                    if (class320.method2003((byte) -128, var7)) {
                        char var8 = class435.method2634(-18473, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (var5.length() == 0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I", line = 131)
    public final int method1568(int arg0) {
        ++field5233;
        int var2 = 73 / ((arg0 - -42) / 59);
        return super.field2798;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lqg;ILjaggl/memory/NativeBuffer;IZ)V", line = 150)
    public class343(class321 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field5237 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I", line = 158)
    public final int method1566(int arg0) {
        ++field5235;
        return arg0 != 16999 ? 72 : this.field5237;
    }
}
