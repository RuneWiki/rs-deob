import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class543 extends class172 {

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lrh;")
    public static class718 field7565 = new class718();

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Ljn;")
    public static class134 field7566 = new class134(68, 7);

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lqk;")
    public static class1 field7570 = new class1(36, -1);

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lqk;")
    public static class1 field7571 = new class1(82, 6);

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    private int field7561;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    private int field7567;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    private int field7568;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    private int field7569;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V", line = 7)
    public static void method3218(int arg0) {
        field7565 = null;
        field7570 = null;
        field7571 = null;
        field7566 = null;
        if (arg0 != 0) {
            method3219(null);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLhia;)V", line = 22)
    public final void method100(byte arg0, class48 arg1) {
        field7562++;
        arg1.method403(this.field7568, this.field7567, this.field7569, (byte) -65, this.field7561);
        if (arg0 != 71) {
            method3218(-16);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Loq;)V", line = 35)
    public static final void method3219(class230 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class230 var2 = null;
            for (class230 var3 = class226.field3436[var1]; var3 != null; var3 = var3.field3455) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class226.field3436[var1] = var3.field3455;
                    } else {
                        var2.field3455 = var3.field3455;
                    }
                    class282.field4043 = true;
                    return;
                }
                var2 = var3;
            }
            class230 var4 = null;
            for (class230 var5 = class689.field9618[var1]; var5 != null; var5 = var5.field3455) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class689.field9618[var1] = var5.field3455;
                    } else {
                        var4.field3455 = var5.field3455;
                    }
                    class282.field4043 = true;
                    return;
                }
                var4 = var5;
            }
            class230 var6 = null;
            for (class230 var7 = class289.field4265[var1]; var7 != null; var7 = var7.field3455) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class289.field4265[var1] = var7.field3455;
                    } else {
                        var6.field3455 = var7.field3455;
                    }
                    class282.field4043 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILgga;)V", line = 117)
    public final void method102(int arg0, class511 arg1) {
        field7564++;
        this.field7569 = arg1.method3008(64);
        this.field7567 = arg1.method3008(64);
        if (arg0 != 2048) {
            method3218(-17);
        }
        this.field7561 = arg1.method3013(arg0 - 1922);
        this.field7568 = arg1.method3013(20);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 139)
    public static final Class method3220(String arg0, int arg1) throws ClassNotFoundException {
        field7563++;
        if (arg1 != -31190) {
            field7566 = null;
        }
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
}
