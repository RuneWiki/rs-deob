import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class59 extends class203 {

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "Lh;")
    public class69 field1106 = new class69();

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "Lcb;")
    public class22 field1110 = new class22();

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Lie;")
    private class84 field1101;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "J")
    public static volatile long field1095 = 0L;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
    public static int[] field1098 = new int[1000];

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "Lrh;")
    public static class167 field1102;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "[Z")
    public static boolean[] field1104;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public static void method325(int arg0) {
        if (arg0 != 0) {
            field1095 = -119L;
        }
        field1104 = null;
        field1098 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILa;I)V")
    private final void method326(int arg0, class1 arg1, int arg2) {
        field1103++;
        if (arg2 <= 89) {
            method329(-11);
        }
        if ((this.field1101.field1528[arg1.field8] & 0x4) != 0 && arg1.field18 < 0) {
            int var4 = this.field1101.field1529[arg1.field8] / class210.field4018;
            int var5 = (var4 + 1048575 - arg1.field9) / var4;
            arg1.field9 = arg1.field9 + arg0 * var4 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field1101.field1513[arg1.field8] == 0) {
                    arg1.field14 = class165.method998(arg1.field25, arg1.field14.method1017(), arg1.field14.method1013(), arg1.field14.method1010());
                } else {
                    arg1.field14 = class165.method998(arg1.field25, arg1.field14.method1017(), 0, arg1.field14.method1010());
                    this.field1101.method470(-77, arg1, arg1.field10.field3667[arg1.field20] < 0);
                }
                if (arg1.field10.field3667[arg1.field20] < 0) {
                    arg1.field14.method1004(-1);
                }
                arg0 = arg1.field9 / var4;
            }
        }
        arg1.field14.method134(arg0);
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "()Lvh;")
    public final class203 method137() {
        field1097++;
        class1 var1 = (class1) this.field1106.method404(false);
        if (var1 == null) {
            return null;
        } else if (var1.field14 == null) {
            return this.method145();
        } else {
            return var1.field14;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "()I")
    public final int method136() {
        field1107++;
        return 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIIILa;[I)V")
    private final void method327(byte arg0, int arg1, int arg2, int arg3, class1 arg4, int[] arg5) {
        field1099++;
        if ((this.field1101.field1528[arg4.field8] & 0x4) != 0 && arg4.field18 < 0) {
            int var7 = this.field1101.field1529[arg4.field8] / class210.field4018;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field9) / var7;
                if (arg3 < var8) {
                    arg4.field9 += arg3 * var7;
                    break;
                }
                arg4.field14.method138(arg5, arg1, var8);
                arg3 -= var8;
                arg4.field9 += var7 * var8 - 1048576;
                arg1 += var8;
                int var9 = class210.field4018 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class165 var11 = arg4.field14;
                if (this.field1101.field1513[arg4.field8] == 0) {
                    arg4.field14 = class165.method998(arg4.field25, var11.method1017(), var11.method1013(), var11.method1010());
                } else {
                    arg4.field14 = class165.method998(arg4.field25, var11.method1017(), 0, var11.method1010());
                    this.field1101.method470(-48, arg4, arg4.field10.field3667[arg4.field20] < 0);
                    arg4.field14.method1000(var9, var11.method1013());
                }
                if (arg4.field10.field3667[arg4.field20] < 0) {
                    arg4.field14.method1004(-1);
                }
                var11.method1025(var9);
                var11.method138(arg5, arg1, arg2 - arg1);
                if (var11.method1014()) {
                    this.field1110.method142(var11);
                }
            }
        }
        if (arg0 != 40) {
            method329(107);
        }
        arg4.field14.method138(arg5, arg1, arg3);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method328(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != 1048575) {
            return null;
        }
        field1094++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
    public static final boolean method329(int arg0) {
        field1105++;
        if (class101.field1875 == 0) {
            if (arg0 <= 15) {
                field1095 = -10L;
            }
            return class130.field2362.method493((byte) 79);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public final void method134(int arg0) {
        field1108++;
        this.field1110.method134(arg0);
        for (class1 var2 = (class1) this.field1106.method404(false); var2 != null; var2 = (class1) this.field1106.method414(-127)) {
            if (!this.field1101.method490(91, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field27 >= var3) {
                        this.method326(var3, var2, 98);
                        var2.field27 -= var3;
                        break;
                    }
                    this.method326(var2.field27, var2, 96);
                    var3 -= var2.field27;
                } while (!this.field1101.method485(-5, null, 0, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lvh;")
    public final class203 method145() {
        field1093++;
        class1 var1;
        do {
            var1 = (class1) this.field1106.method414(-120);
            if (var1 == null) {
                return null;
            }
        } while (var1.field14 == null);
        return var1.field14;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V")
    public final void method138(int[] arg0, int arg1, int arg2) {
        this.field1110.method138(arg0, arg1, arg2);
        field1109++;
        for (class1 var4 = (class1) this.field1106.method404(false); var4 != null; var4 = (class1) this.field1106.method414(-123)) {
            if (!this.field1101.method490(91, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field27) {
                        this.method327((byte) 40, var6, var5 + var6, var5, var4, arg0);
                        var4.field27 -= var5;
                        break;
                    }
                    this.method327((byte) 40, var6, var6 + var5, var4.field27, var4, arg0);
                    var6 += var4.field27;
                    var5 -= var4.field27;
                } while (!this.field1101.method485(-80, arg0, var6, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lie;)V")
    public class59(class84 arg0) {
        this.field1101 = arg0;
    }
}
