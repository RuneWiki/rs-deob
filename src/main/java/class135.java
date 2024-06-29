import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class135 extends class450 {

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
    public static int[] field2157 = new int[32];

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lwu;")
    public static class376 field2156;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V", line = 3)
    public static void method1053(byte arg0) {
        field2157 = null;
        field2156 = null;
        if (arg0 < 103) {
            method1056((String) null, (Throwable) null, -24);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)I", line = 15)
    public final int method68(boolean arg0) {
        ++field2159;
        return arg0 ? 59 : 2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V", line = 27)
    public final void method67(boolean arg0, int arg1) {
        ++field2166;
        if (!arg0) {
            field2156 = null;
        }
        super.field6170 = arg1;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)I", line = 38)
    public static final int method1054(int arg0, int arg1) {
        ++field2163;
        int var2 = -67 % ((34 - arg0) / 37);
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILup;)V", line = 53)
    public class135(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)V", line = 58)
    public static final void method1055(int arg0, int arg1, boolean arg2) {
        ++field2161;
        class127 var3 = class760.method4231(arg1, -874792672, 17);
        if (!arg2) {
            field2156 = null;
        }
        var3.method1010(614);
        var3.field2099 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 73)
    public static final void method1056(String arg0, Throwable arg1, int arg2) {
        if (arg2 != 1) {
            field2156 = null;
        }
        ++field2158;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class708.method3977(-28017, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class240.method1506(var3, true);
            String var4 = class574.method3159(var3, "%3a", ":", 44);
            String var5 = class574.method3159(var4, "%40", "@", arg2 + 99);
            String var6 = class574.method3159(var5, "%26", "&", 53);
            String var7 = class574.method3159(var6, "%23", "#", 61);
            if (class333.field4731 != null) {
                class198 var8 = class42.field553.method1314(new URL(class333.field4731.getCodeBase(), "clienterror.ws?c=" + class304.field4319 + "&u=" + (class44.field576 == null ? String.valueOf(class712.field9853) : class44.field576) + "&v1=" + class192.field2899 + "&v2=" + class192.field2879 + "&e=" + var7), (byte) 67);
                while (~var8.field2987 == -1) {
                    class226.method1447((byte) -124, 1L);
                }
                if (~var8.field2987 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field2986;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lup;)V", line = 124)
    public class135(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I", line = 131)
    public final int method75(int arg0, int arg1) {
        ++field2167;
        if (super.field6171.method1672(arg0)) {
            return 3;
        } else {
            return ~super.field6171.field3868.method1851(true) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)I", line = 148)
    public final int method1057(boolean arg0) {
        ++field2165;
        if (!arg0) {
            method1054(-106, -38);
        }
        return super.field6170;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)[Lwm;", line = 159)
    public static final class565[] method1058(boolean arg0) {
        if (arg0) {
            field2155 = 1;
        }
        if (class676.field9384 == null) {
            class565[] var1 = class291.method1802(-342433470, class66.field828);
            class565[] var2 = new class565[var1.length];
            int var3 = 0;
            int var4 = class411.field5711.field3874.method1838(true);
            label73: for (int var5 = 0; var1.length > var5; ++var5) {
                class565 var9 = var1[var5];
                if ((var9.field7438 <= 0 || ~var9.field7438 <= -25) && ~var9.field7432 <= -801 && var9.field7431 >= 600 && (~var4 != -3 || var9.field7432 <= 800 && ~var9.field7431 >= -601) && (~var4 != -2 || ~var9.field7432 >= -1025 && var9.field7431 <= 768)) {
                    for (int var10 = 0; var3 > var10; ++var10) {
                        class565 var11 = var2[var10];
                        if (var9.field7432 == var11.field7432 && var9.field7431 == var11.field7431) {
                            if (~var11.field7438 > ~var9.field7438) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class676.field9384 = new class565[var3];
            class335.method2017(var2, 0, class676.field9384, 0, var3);
            int[] var6 = new int[class676.field9384.length];
            for (int var7 = 0; ~class676.field9384.length < ~var7; ++var7) {
                class565 var8 = class676.field9384[var7];
                var6[var7] = var8.field7432 * var8.field7431;
            }
            class613.method3334(var6, class676.field9384, 125);
        }
        ++field2162;
        return class676.field9384;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z", line = 246)
    public final boolean method1059(int arg0) {
        ++field2160;
        if (arg0 != 260) {
            field2156 = null;
        }
        if (super.field6171.method1672(arg0 + -260)) {
            return false;
        } else {
            return super.field6171.field3868.method1851(true) != 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 265)
    public final void method73(byte arg0) {
        ++field2164;
        if (arg0 == 98) {
            if (super.field6171.method1672(0)) {
                super.field6170 = 0;
            }
            if (super.field6171.field3868.method1851(true) == 0) {
                super.field6170 = 0;
            }
            if (super.field6170 < 0 || super.field6170 > 2) {
                super.field6170 = this.method68(false);
            }
        }
    }
}
