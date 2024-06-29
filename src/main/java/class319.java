import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class319 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    private int field4626;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lvp;")
    public static class126 field4623;

    @OriginalMember(owner = "client!la", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4625++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class487.field7211 = arg1;
        class520.field7653 = arg3;
        class328.field5104 = arg0;
        class245.field3442 = arg5;
        class246.field3445 = arg4;
        int var7 = -42 / ((62 - arg6) / 32);
        field4627++;
        class28.field404 = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1993(String arg0, int arg1) {
        field4622++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        if (arg1 != 13499) {
            method1996(81, 5);
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1994(byte arg0) {
        field4623 = null;
        if (arg0 != -23) {
            field4623 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I")
    public static final int method1995(byte arg0, int arg1) {
        if (arg0 != -48) {
            method1994((byte) -110);
        }
        field4624++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
    public static final int method1996(int arg0, int arg1) {
        field4618++;
        return arg1 == -12981 ? arg0 & 0x7F : 46;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)I")
    public final int method1997(byte arg0) {
        int var2 = -36 % ((-arg0 - 28) / 32);
        field4619++;
        return this.field4626;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
    public class319(int arg0, int arg1) {
        this.field4620 = arg1;
        this.field4626 = arg0;
    }
}
