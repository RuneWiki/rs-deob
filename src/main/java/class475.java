import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class475 {

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public int field6588;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Z")
    public static boolean field6583 = false;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field6590 = -1;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "J")
    public static long field6593 = 0L;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lvo;")
    public static class381 field6591;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field6595;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[Lho;")
    public static class318[] field6585;

    // $FF: synthetic method
    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2836(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lqd;Z)V", line = 7)
    public static final void method2829(class574 arg0, boolean arg1) {
        field6586++;
        if (class59.field688 == null) {
            return;
        }
        class466 var2 = null;
        if (arg0.field8072 == 0) {
            var2 = (class466) class174.method1110(arg0.field8084, arg0.field8080, arg0.field8081);
        }
        if (arg0.field8072 == 1) {
            var2 = (class466) class371.method2310(arg0.field8084, arg0.field8080, arg0.field8081);
        }
        if (arg0.field8072 == 2) {
            var2 = (class466) class485.method2882(arg0.field8084, arg0.field8080, arg0.field8081, field6595 == null ? (field6595 = method2836("oc")) : field6595);
        }
        if (arg0.field8072 == 3) {
            var2 = (class466) class349.method2197(arg0.field8084, arg0.field8080, arg0.field8081);
        }
        if (var2 == null) {
            arg0.field8078 = 0;
            arg0.field8070 = -1;
            arg0.field8069 = 0;
        } else {
            arg0.field8070 = var2.method760(-27640);
            arg0.field8069 = var2.method756((byte) 107);
            arg0.field8078 = var2.method762(!arg1);
        }
        if (arg1) {
            field6590 = 0;
        }
    }

    @OriginalMember(owner = "client!of", name = "toString", descriptor = "()Ljava/lang/String;", line = 56)
    public final String toString() {
        field6587++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILpja;)V", line = 65)
    public static final void method2830(int arg0, class171 arg1) {
        field6594++;
        if (class263.field3850) {
            return;
        }
        arg1.method527(-11229);
        class640.field8992--;
        if (arg1.field2177) {
            for (class498 var2 = (class498) class362.field5218.method1140(arg0 + 27748); var2 != null; var2 = (class498) class362.field5218.method1138(123)) {
                if (var2.field6827.equals(arg1.field2169)) {
                    boolean var3 = false;
                    for (class171 var4 = (class171) var2.field6826.method1140(-83); var4 != null; var4 = (class171) var2.field6826.method1138(arg0 + 27986)) {
                        if (arg1 == var4) {
                            var3 = true;
                            if (var2.method2926((byte) -95, arg1)) {
                                class563.method3332(var2, true);
                            }
                            break;
                        }
                    }
                    if (var3) {
                        break;
                    }
                }
            }
        } else {
            long var5 = arg1.field2183;
            class498 var7;
            for (var7 = (class498) class775.field10667.method3669(false, var5); var7 != null && !var7.field6827.equals(arg1.field2169); var7 = (class498) class775.field10667.method3673(-120)) {
            }
            if (var7 != null && var7.method2926((byte) -110, arg1)) {
                class563.method3332(var7, true);
            }
        }
        if (arg0 != -27864) {
            field6583 = false;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(CB)Z", line = 144)
    public static final boolean method2831(char arg0, byte arg1) {
        field6589++;
        int var2 = -112 / ((arg1 - 77) / 36);
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(JBI)Ljava/lang/String;", line = 154)
    public static final String method2832(long arg0, byte arg1, int arg2) {
        if (arg1 != 54) {
            method2834(87);
        }
        class324.method2052(arg1 ^ 0x4F, arg0);
        field6584++;
        int var4 = class448.field6277.get(5);
        int var5 = class448.field6277.get(2);
        int var6 = class448.field6277.get(1);
        return arg2 == 3 ? class329.method2074(10, arg0, arg2) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class428.field5975[arg2][var5] + "-" + var6;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZIIZI)Ltca;", line = 177)
    public static final class610 method2833(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6592++;
        class610 var5 = new class610();
        var5.field8600 = arg1;
        var5.field8598 = arg4;
        class278.field3993.method3666((byte) 65, (long) arg2, var5);
        class103.method724(arg1, -1);
        class115 var6 = class384.method2387(arg3, arg2);
        if (arg3) {
            method2831((char) 65502, (byte) 10);
        }
        if (var6 != null) {
            class43.method336(-1, var6);
        }
        if (class330.field4635 != null) {
            class43.method336(-1, class330.field4635);
            class330.field4635 = null;
        }
        class675.method3843(106);
        if (var6 != null) {
            class324.method2053((byte) -78, var6, !arg0);
        }
        if (!arg0) {
            class700.method3952(arg1);
        }
        if (!arg0 && class610.field8597 != -1) {
            class748.method4145(1, class610.field8597, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 216)
    public static void method2834(int arg0) {
        field6585 = null;
        field6591 = null;
        int var1 = 81 % ((32 - arg0) / 45);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I", line = 231)
    public static int method2835(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(II)V", line = 243)
    public class475(int arg0, int arg1) {
        this.field6588 = arg1;
    }
}
